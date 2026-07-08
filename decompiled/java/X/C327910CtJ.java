package X;

import com.bytedance.android.livesdk.model.message.CaptionContent;
import com.bytedance.android.livesdk.model.message.CaptionMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.split.CaptionSplitViewModel$captionMessageScheduleDirect$1", f = "CaptionSplitViewModel.kt", l = {131, 121}, m = "invokeSuspend")
public final class C327910CtJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public CaptionMessage LLILLJJLI;
    public C327920CtK LLILLL;
    public CaptionContent LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C327920CtK LLIZ;
    public final /* synthetic */ CaptionMessage LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ CaptionContent LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327910CtJ(C327920CtK c327920CtK, CaptionMessage captionMessage, long j, CaptionContent captionContent, InterfaceC1364105Vn<? super C327910CtJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c327920CtK;
        this.LLIZLLLIL = captionMessage;
        this.LLJ = j;
        this.LLJI = captionContent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327910CtJ(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C327920CtK c327920CtK;
        InterfaceC383701eN interfaceC383701eN;
        CaptionMessage captionMessage;
        long j;
        CaptionContent captionContent;
        long j2;
        C1C7U.LIZ("CaptionSplitViewModel@6bc6.captionMessageScheduleDirect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            interfaceC383701eN = this.LL;
                            try {
                                C155000ia.LIZIZ(obj);
                                interfaceC383701eN.LIZIZ(null);
                                Unit unit = Unit.LIZ;
                                C1C7U.LIZIZ("CaptionSplitViewModel@6bc6.captionMessageScheduleDirect$1");
                                return unit;
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        interfaceC383701eN.LIZIZ(null);
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        j = this.LLILZIL;
                        captionContent = this.LLILZ;
                        c327920CtK = this.LLILLL;
                        captionMessage = this.LLILLJJLI;
                        interfaceC383701eN = this.LL;
                        C155000ia.LIZIZ(obj);
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    c327920CtK = this.LLIZ;
                    interfaceC383701eN = c327920CtK.LLJIJIL;
                    captionMessage = this.LLIZLLLIL;
                    j = this.LLJ;
                    captionContent = this.LLJI;
                    this.LL = interfaceC383701eN;
                    this.LLILLJJLI = captionMessage;
                    this.LLILLL = c327920CtK;
                    this.LLILZ = captionContent;
                    this.LLILZIL = j;
                    this.LLILZLL = 1;
                    if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                        C1C7U.LIZIZ("CaptionSplitViewModel@6bc6.captionMessageScheduleDirect$1");
                        return objLJFF;
                    }
                }
                C327630Csr c327630Csr = new C327630Csr(j2, captionMessage.durationMs, captionMessage.sentenceId, captionMessage.definite, captionMessage.baseMessage.messageId, j, j2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(captionContent.content);
                sbLIZ.append(' ');
                c327630Csr.LLJIJIL = C2188811AlT.LIZIZ(sbLIZ);
                long j3 = captionMessage.durationMs;
                c327630Csr.LLJI = j3;
                long j4 = captionMessage.timestampMs + j3;
                if (j4 < c327920CtK.LLJJIII && !captionMessage.definite) {
                    Function1<? super C327630Csr, Unit> function1 = c327920CtK.LLJJ;
                    if (function1 != null) {
                        function1.invoke(c327630Csr);
                    }
                    Unit unit2 = Unit.LIZ;
                    interfaceC383701eN.LIZIZ(null);
                    C1C7U.LIZIZ("CaptionSplitViewModel@6bc6.captionMessageScheduleDirect$1");
                    return unit2;
                }
                C327630Csr c327630Csr2 = c327920CtK.LLJJIJI;
                if (c327630Csr2 == null || c327630Csr2.LLILLL != captionMessage.sentenceId) {
                    c327920CtK.LLJJIJI = c327630Csr;
                }
                c327630Csr.LLJJ = c327920CtK.LLJJIJI;
                c327920CtK.LLJJIII = j4;
                C327620Csq c327620Csq = c327920CtK.LLJILLL;
                this.LL = interfaceC383701eN;
                this.LLILLJJLI = null;
                this.LLILLL = null;
                this.LLILZ = null;
                this.LLILZLL = 2;
                if (c327620Csq.LIZ(c327630Csr, this) == objLJFF) {
                    C1C7U.LIZIZ("CaptionSplitViewModel@6bc6.captionMessageScheduleDirect$1");
                    return objLJFF;
                }
                interfaceC383701eN.LIZIZ(null);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("CaptionSplitViewModel@6bc6.captionMessageScheduleDirect$1");
                return unit3;
            } catch (Throwable th3) {
                th = th3;
                while (true) {
                    TryCatchGuardChecker.doCheck(th);
                    interfaceC383701eN.LIZIZ(null);
                    throw th;
                }
            }
            j2 = captionMessage.timestampMs;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
