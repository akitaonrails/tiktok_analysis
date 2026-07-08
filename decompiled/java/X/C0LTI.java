package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.tasks.ClientRequestJson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LTI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.RefreshFrameTask$timeoutRefreshFrame$2", f = "RefreshFrameTask.kt", l = {209}, m = "invokeSuspend")
public final class C0LTI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ClientRequestJson>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ INLEMediaSession LLILLL;
    public final /* synthetic */ NLETrackSlot LLILZ;
    public final /* synthetic */ NLESegmentEffect LLILZIL;
    public final /* synthetic */ C0LTJ LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LTI(INLEMediaSession iNLEMediaSession, NLETrackSlot nLETrackSlot, NLESegmentEffect nLESegmentEffect, C0LTJ c0ltj, int i, InterfaceC1364105Vn<? super C0LTI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iNLEMediaSession;
        this.LLILZ = nLETrackSlot;
        this.LLILZIL = nLESegmentEffect;
        this.LLILZLL = c0ltj;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LTI(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZJ;
        C1C7U.LIZ("RefreshFrameTask@9a30.timeoutRefreshFrame$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                objLIZJ = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long currentPosition = this.LLILLL.getPlayerApi().getCurrentPosition();
            if (currentPosition < this.LLILZ.getStartTime() || currentPosition > this.LLILZ.getEndTime()) {
                currentPosition = this.LLILZ.getStartTime() + (this.LLILZ.getDuration() / ((long) 2));
            }
            String uuid = this.LLILZIL.getUUID();
            C0LTJ c0ltj = this.LLILZLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("timeoutRefreshFrame begin: ");
            sbLIZ.append(uuid);
            sbLIZ.append(' ');
            sbLIZ.append(this.LLILZ.getUUID());
            sbLIZ.append(' ');
            sbLIZ.append(currentPosition);
            sbLIZ.append(' ');
            sbLIZ.append(this.LLIZ);
            c0ltj.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
            INLEMediaSession iNLEMediaSession = this.LLILLL;
            synchronized (iNLEMediaSession) {
                try {
                    if (!iNLEMediaSession.getPlayerApi().isDestroyed()) {
                        String strPreprocessI2V = this.LLILLL.getMediaRuntimeApi().preprocessI2V(uuid, "effect_param_algo_server", currentPosition, this.LLIZ);
                        C0LTJ c0ltj2 = this.LLILZLL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("timeoutRefreshFrame result: ");
                        sbLIZ2.append(strPreprocessI2V);
                        c0ltj2.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ2));
                        this.LLILZLL.getClass();
                        objLIZJ = C0LKZ.LIZJ(strPreprocessI2V, ClientRequestJson.class);
                        C0LTJ c0ltj3 = this.LLILZLL;
                        C0LSZ c0lszLIZ = C0LSZ.LIZ(c0ltj3.LIZLLL, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strPreprocessI2V, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427263);
                        this.LL = objLIZJ;
                        this.LLILLJJLI = 1;
                        if (C0LTN.LJJJ(c0ltj3, c0lszLIZ, this) == objLJFF) {
                            C1C7U.LIZIZ("RefreshFrameTask@9a30.timeoutRefreshFrame$2");
                            return objLJFF;
                        }
                    } else {
                        C1C7U.LIZIZ("RefreshFrameTask@9a30.timeoutRefreshFrame$2");
                        return null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1C7U.LIZIZ("RefreshFrameTask@9a30.timeoutRefreshFrame$2");
        return objLIZJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ClientRequestJson> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
