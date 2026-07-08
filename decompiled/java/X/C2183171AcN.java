package X;

import com.bytedance.android.livesdk.comp.impl.linkcore.impl.rust.injector.IRustHttpApi;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicResponseCallback;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3DomainSetting;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1AcN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183171AcN implements InterfaceC2183241AcU, InterfaceC420801kM {
    public final InterfaceC2181441AZa LL;
    public final String LLILLJJLI;
    public final C11NJ LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C1AZW.LIZIZ(this.LL, this.LLILLJJLI, "call on http requests disposed", null, null);
        this.LLILLL.LJ();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.LLILLJJLI;
    }

    public C2183171AcN(C965350bED c965350bED) {
        String strLIZJ;
        this.LL = c965350bED;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((c965350bED == null || (strLIZJ = C965350bED.LIZJ(c965350bED.LIZ.LIZIZ)) == null) ? "LinkMicSDK" : strLIZJ);
        sbLIZ.append("HttpClient[Biz]");
        this.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLL = new C11NJ();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.11Kd] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, X.01kM] */
    @Override // X.InterfaceC2183241AcU
    public final void LIZ(C2183211AcR c2183211AcR, final LinkMicResponseCallback linkMicResponseCallback) {
        boolean zLJI = MethodIDManager.LJI(137995);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resp: ");
        sbLIZ.append(c2183211AcR.LIZ);
        C2183221AcS c2183221AcS = new C2183221AcS(C2188811AlT.LIZIZ(sbLIZ), c2183211AcR.LIZIZ, C2097608Jq.LJ(), new byte[0]);
        boolean zLJFF = Intrinsics.LJFF("leave_with_detach_view", c2183211AcR.LIZJ);
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLJJLI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("call sendRequest: ");
        sbLIZ2.append(c2183211AcR);
        sbLIZ2.append(" \n body:");
        sbLIZ2.append(new String(c2183211AcR.LIZLLL, Charsets.UTF_8));
        C1AZW.LIZIZ(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        final C2183201AcQ c2183201AcQ = new C2183201AcQ(linkMicResponseCallback, c2183221AcS, this, c2183211AcR);
        final C2183181AcO c2183181AcO = new C2183181AcO(linkMicResponseCallback, c2183221AcS, this, c2183211AcR);
        C480460Ism.LIZ().getClass();
        IRustHttpApi iRustHttpApi = (IRustHttpApi) C480460Ism.LIZLLL(IRustHttpApi.class);
        String strLIZIZ = c2183211AcR.LIZ;
        if (!u.LJJIIJZLJL(strLIZIZ, "/tikcast", false)) {
            if (MultiGuestV3DomainSetting.INSTANCE.isInWebcast(c2183211AcR.LIZ)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("/webcast");
                sbLIZ3.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("/tikcast");
                sbLIZ4.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            }
        }
        final C11HU c11huLJJ = iRustHttpApi.post(strLIZIZ, new TypedByteArray("application/json; charset=utf-8", c2183211AcR.LIZLLL, new String[0])).LJJIJIIJI(C11S5.LIZ()).LJJ(C969310bKb.LJ);
        if (zLJFF) {
            final C259800zU c259800zU = new C259800zU();
            final ?? r0 = new InterfaceC1487280oo2() { // from class: X.11Kd
                @Override // X.InterfaceC1487280oo2
                public final Object apply(final Object obj) {
                    final C2183171AcN c2183171AcN = this.LL;
                    return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.11Kc
                        @Override // X.InterfaceC1254030ijp
                        public final void LIZ(C11KY c11ky) {
                            if (c2183171AcN.LLILLL.LLILLJJLI) {
                                c11ky.onComplete();
                            } else {
                                c11ky.onSuccess(obj);
                            }
                        }
                    });
                }
            };
            c259800zU.element = new AbstractC19483511Kn<R>(c11huLJJ, r0) { // from class: X.11Jh
                public final InterfaceC19473011Gm<? extends T> LL;
                public final InterfaceC1487280oo2<? super T, ? extends C11ID<? extends R>> LLILLJJLI;

                @Override // X.AbstractC19483511Kn
                public final void LJIJI(C11IH<? super R> c11ih) {
                    this.LL.LIZ(new C19480211Jg(c11ih, this.LLILLJJLI));
                }

                {
                    this.LLILLJJLI = r0;
                    this.LL = c11huLJJ;
                }
            }.LJFF(new InterfaceC781210Ukh() { // from class: X.1AbT
                @Override // X.InterfaceC781210Ukh
                public final void run() throws Exception {
                    AutoCloseable autoCloseable = linkMicResponseCallback;
                    C259800zU<InterfaceC420801kM> c259800zU2 = c259800zU;
                    try {
                        InterfaceC420801kM interfaceC420801kM = c259800zU2.element;
                        if (interfaceC420801kM != null) {
                            interfaceC420801kM.dispose();
                        }
                        c259800zU2.element = null;
                        C1306420k6K.LIZ(autoCloseable, null);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                th = null;
                                TryCatchGuardChecker.doCheck(th);
                                C1306420k6K.LIZ(autoCloseable, th);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            }).LJIIIIZZ(new C09JN() { // from class: X.0N1O
                @Override // X.C09JN
                public final /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("RustHttpClientKt@e54b.sam$io_reactivex_functions_Consumer$0");
                    c2183201AcQ.invoke(obj);
                    C1C7U.LIZIZ("RustHttpClientKt@e54b.sam$io_reactivex_functions_Consumer$0");
                }
            }).LJII(new C09JN() { // from class: X.0N1O
                @Override // X.C09JN
                public final /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("RustHttpClientKt@e54b.sam$io_reactivex_functions_Consumer$0");
                    c2183181AcO.invoke(obj);
                    C1C7U.LIZIZ("RustHttpClientKt@e54b.sam$io_reactivex_functions_Consumer$0");
                }
            }).LJIILL();
        } else {
            C19487311Lz.LIZJ(c11huLJJ.LJIILL(new C09JN() { // from class: X.0N1O
                @Override // X.C09JN
                public final /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("RustHttpClientKt@e54b.sam$io_reactivex_functions_Consumer$0");
                    c2183201AcQ.invoke(obj);
                    C1C7U.LIZIZ("RustHttpClientKt@e54b.sam$io_reactivex_functions_Consumer$0");
                }
            }).LJIIL(new C09JN() { // from class: X.0N1O
                @Override // X.C09JN
                public final /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("RustHttpClientKt@e54b.sam$io_reactivex_functions_Consumer$0");
                    c2183181AcO.invoke(obj);
                    C1C7U.LIZIZ("RustHttpClientKt@e54b.sam$io_reactivex_functions_Consumer$0");
                }
            }), this.LLILLL, null, null, 30);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
