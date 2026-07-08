package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS132S0201000_5;
import kotlin.jvm.internal.AwS34S1101000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357350Dzh implements InterfaceC20343514iv {
    public final String LIZ;
    public final /* synthetic */ C357320Dze LIZIZ;
    public final /* synthetic */ C354240Dug LIZJ;

    @Override // X.InterfaceC20343514iv
    public final void onStart() {
        InterfaceC357390Dzl interfaceC357390Dzl = C357400Dzm.LIZ;
        if (interfaceC357390Dzl == null) {
            throw new IllegalStateException("Log service not initialized");
        }
        interfaceC357390Dzl.LIZ("onStart");
        C383980F3s.LIZIZ(new AwS549S0100000_5(this.LIZIZ, 1285));
    }

    @Override // X.InterfaceC20343514iv
    public final void LIZ(NLETimeSpaceNode nLETimeSpaceNode) {
        NLETemplateModel nLETemplateModel;
        InterfaceC357390Dzl interfaceC357390Dzl = C357400Dzm.LIZ;
        if (interfaceC357390Dzl != null) {
            interfaceC357390Dzl.LIZ("onSuccess");
            C383980F3s.LIZIZ(new AwS549S0100000_5(this.LIZIZ, 1286));
            if ((nLETimeSpaceNode instanceof NLETemplateModel) && (nLETemplateModel = (NLETemplateModel) nLETimeSpaceNode) != null) {
                C357320Dze c357320Dze = this.LIZIZ;
                synchronized (c357320Dze.LIZLLL) {
                    try {
                        if (!Intrinsics.LJFF(c357320Dze.LIZLLL, this.LIZ)) {
                            return;
                        }
                        C354540DvA c354540DvA = new C354540DvA(EnumC356390Dy9.APPLY, this.LIZJ, nLETemplateModel);
                        final C357320Dze c357320Dze2 = this.LIZIZ;
                        c357320Dze2.LIZIZ.LIZ(c354540DvA, new InterfaceC354020DuK() { // from class: X.0Dzg
                            @Override // X.InterfaceC354020DuK
                            public final void LIZ(C354570DvD c354570DvD) {
                                int code;
                                String msg;
                                boolean z = c354570DvD.LIZ;
                                EnumC355970DxT enumC355970DxT = c354570DvD.LIZIZ;
                                if (enumC355970DxT != null) {
                                    code = enumC355970DxT.getCode();
                                } else {
                                    code = -1;
                                }
                                EnumC355970DxT enumC355970DxT2 = c354570DvD.LIZIZ;
                                if (enumC355970DxT2 == null || (msg = enumC355970DxT2.getMsg()) == null) {
                                    msg = "magic_handler_error";
                                }
                                C383980F3s.LIZIZ(new C357330Dzf(c357320Dze2, this, z, c354570DvD, code, msg));
                            }

                            @Override // X.InterfaceC354020DuK
                            public final void onProgress(int i) {
                                C383980F3s.LIZIZ(new AwS132S0201000_5(c357320Dze2, this, i, 11));
                            }
                        });
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C383980F3s.LIZIZ(new AwS549S0100000_5(this.LIZIZ, 1287));
            return;
        }
        throw new IllegalStateException("Log service not initialized");
    }

    @Override // X.InterfaceC20343514iv
    public final void onProgress(int i) {
        InterfaceC357390Dzl interfaceC357390Dzl = C357400Dzm.LIZ;
        if (interfaceC357390Dzl != null) {
            interfaceC357390Dzl.LIZ("onProgress");
            return;
        }
        throw new IllegalStateException("Log service not initialized");
    }

    public C357350Dzh(C357320Dze c357320Dze, C354240Dug c354240Dug) {
        this.LIZIZ = c357320Dze;
        this.LIZJ = c354240Dug;
        this.LIZ = c357320Dze.LIZLLL;
    }

    @Override // X.InterfaceC20343514iv
    public final void onError(int i, String str) {
        C383980F3s.LIZIZ(new AwS34S1101000_5(this.LIZIZ, i, str, 1));
    }
}
