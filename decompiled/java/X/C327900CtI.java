package X;

import com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionViewModelV2;
import com.bytedance.android.livesdk.model.message.CaptionContent;
import com.bytedance.android.livesdk.model.message.CaptionMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionViewModelV2$captionMessageSchedule$1$1", f = "CaptionViewModelV2.kt", l = {167, 141}, m = "invokeSuspend")
public final class C327900CtI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public CaptionViewModelV2 LLILLJJLI;
    public CaptionMessage LLILLL;
    public CaptionContent LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ CaptionViewModelV2 LLIZ;
    public final /* synthetic */ CaptionMessage LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ CaptionContent LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327900CtI(CaptionViewModelV2 captionViewModelV2, CaptionMessage captionMessage, long j, CaptionContent captionContent, InterfaceC1364105Vn<? super C327900CtI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = captionViewModelV2;
        this.LLIZLLLIL = captionMessage;
        this.LLJ = j;
        this.LLJI = captionContent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327900CtI(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        CaptionViewModelV2 captionViewModelV2;
        InterfaceC383701eN interfaceC383701eN;
        CaptionMessage captionMessage;
        long j;
        CaptionContent captionContent;
        C327620Csq c327620Csq;
        C327630Csr c327630Csr;
        long j2;
        C1C7U.LIZ("CaptionViewModelV2@24b6.captionMessageSchedule$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        try {
            try {
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
                                        C1C7U.LIZIZ("CaptionViewModelV2@24b6.captionMessageSchedule$1$1");
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
                                captionMessage = this.LLILLL;
                                captionViewModelV2 = this.LLILLJJLI;
                                interfaceC383701eN = this.LL;
                                C155000ia.LIZIZ(obj);
                            }
                        } else {
                            C155000ia.LIZIZ(obj);
                            captionViewModelV2 = this.LLIZ;
                            interfaceC383701eN = captionViewModelV2.LLJIJIL;
                            captionMessage = this.LLIZLLLIL;
                            j = this.LLJ;
                            captionContent = this.LLJI;
                            this.LL = interfaceC383701eN;
                            this.LLILLJJLI = captionViewModelV2;
                            this.LLILLL = captionMessage;
                            this.LLILZ = captionContent;
                            this.LLILZIL = j;
                            this.LLILZLL = 1;
                            if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                                C1C7U.LIZIZ("CaptionViewModelV2@24b6.captionMessageSchedule$1$1");
                                return objLJFF;
                            }
                        }
                        this.LL = interfaceC383701eN;
                        this.LLILLJJLI = null;
                        this.LLILLL = null;
                        this.LLILZ = null;
                        this.LLILZLL = 2;
                        if (c327620Csq.LIZ(c327630Csr, this) == objLJFF) {
                            C1C7U.LIZIZ("CaptionViewModelV2@24b6.captionMessageSchedule$1$1");
                            return objLJFF;
                        }
                        interfaceC383701eN.LIZIZ(null);
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("CaptionViewModelV2@24b6.captionMessageSchedule$1$1");
                        return unit2;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            TryCatchGuardChecker.doCheck(th);
                            interfaceC383701eN.LIZIZ(null);
                            throw th;
                        }
                    }
                    c327630Csr = new C327630Csr(j2, captionMessage.durationMs, captionMessage.sentenceId, captionMessage.definite, captionMessage.baseMessage.messageId, j, j2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(captionContent.content);
                    sbLIZ.append(' ');
                    c327630Csr.LLJIJIL = C2188811AlT.LIZIZ(sbLIZ);
                    c327630Csr.LLJI = captionMessage.durationMs;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            c327620Csq = captionViewModelV2.LLILZ;
            j2 = captionMessage.timestampMs;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
