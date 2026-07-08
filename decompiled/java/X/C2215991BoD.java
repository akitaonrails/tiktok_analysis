package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEVQScoreTimeRange;
import com.bytedance.ies.nle.editor_jni.NLEVQScoreWrapper;
import com.bytedance.ies.nle.editor_jni.VecDouble;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1BoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.normal.PostPublishClarityScoreScheduler$submit$2", f = "PostPublishClarityScoreScheduler.kt", l = {205}, m = "invokeSuspend")
public final class C2215991BoD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ C2216011BoF LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2215991BoD(VideoPublishEditModel videoPublishEditModel, C2216011BoF c2216011BoF, long j, long j2, int i, int i2, String str, InterfaceC1364105Vn<? super C2215991BoD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = c2216011BoF;
        this.LLILZLL = j;
        this.LLIZ = j2;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
        this.LLJI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2215991BoD(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLJIIIZ;
        boolean z;
        long jCurrentTimeMillis;
        VecDouble vecDouble;
        Object objLIZJ = obj;
        C1C7U.LIZ("PostPublishClarityScoreScheduler@617a.submit$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    jCurrentTimeMillis = this.LLILLJJLI;
                    jLJIIIZ = this.LL;
                    C155000ia.LIZIZ(objLIZJ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZJ);
                NLEModel nLEModelLJJLIIIJILLIZJL = C1416310mxZ.LJJLIIIJILLIZJL(this.LLILZ);
                C2215981BoC c2215981BoC = C2215981BoC.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LLILZ;
                c2215981BoC.getClass();
                jLJIIIZ = C2215981BoC.LJIIIZ(videoPublishEditModel, nLEModelLJJLIIIJILLIZJL);
                if (nLEModelLJJLIIIJILLIZJL == null) {
                    C201955140j.LJIIIIZZ(C830690WiJ.LIZIZ, "PostPublishClarityScoreScheduler", "nleModelWithLoad returns null");
                    C2215981BoC.LJII(this.LLILZIL, C2215981BoC.LIZLLL(this.LLILZLL, this.LLIZ, jLJIIIZ, "nleModelWithLoad returns null", this.LLIZLLLIL, this.LLJ));
                    this.LLILZIL.LJIJI = true;
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.submit$2");
                    return unit;
                }
                C197078128u.LIZ.getClass();
                C197078128u.LIZIZ();
                String strLIZ = C197078128u.LIZ();
                if (strLIZ.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C201955140j.LJIIIIZZ(C830690WiJ.LIZIZ, "PostPublishClarityScoreScheduler", "empty vqscore model path");
                    C2215981BoC.LJII(this.LLILZIL, C2215981BoC.LIZLLL(this.LLILZLL, this.LLIZ, jLJIIIZ, "empty vqscore model path", this.LLIZLLLIL, this.LLJ));
                    this.LLILZIL.LJIJI = true;
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.submit$2");
                    return unit2;
                }
                NLEVQScoreWrapper nLEVQScoreWrapper = new NLEVQScoreWrapper(strLIZ);
                this.LLILZIL.LJIILJJIL = nLEVQScoreWrapper;
                NLEVQScoreTimeRange nLEVQScoreTimeRange = new NLEVQScoreTimeRange();
                nLEVQScoreTimeRange.setStartTimeUs(0L);
                nLEVQScoreTimeRange.setEndTimeUs(-1L);
                nLEVQScoreTimeRange.setIntervalUs(500000L);
                c2215981BoC.LJIIJ(this.LLILZIL, nLEVQScoreWrapper, nLEModelLJJLIIIJILLIZJL, nLEVQScoreTimeRange);
                jCurrentTimeMillis = System.currentTimeMillis();
                C2216011BoF c2216011BoF = this.LLILZIL;
                long j = c2216011BoF.LJIIJ;
                C859260XnI c859260XnI = new C859260XnI(c2216011BoF, null);
                this.LL = jLJIIIZ;
                this.LLILLJJLI = jCurrentTimeMillis;
                this.LLILLL = 1;
                objLIZJ = C099A.LIZJ(j, c859260XnI, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.submit$2");
                    return objLJFF;
                }
            }
            vecDouble = (VecDouble) objLIZJ;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (vecDouble == null) {
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("soft timeout: ");
                sbLIZ.append(this.LLILZIL.LJIIJ);
                sbLIZ.append("ms publishId=");
                sbLIZ.append(this.LLJI);
                C201955140j.LJIIIIZZ(c830690WiJ, "PostPublishClarityScoreScheduler", C2188811AlT.LIZIZ(sbLIZ));
                C2215981BoC c2215981BoC2 = C2215981BoC.LIZ;
                C2216011BoF c2216011BoF2 = this.LLILZIL;
                long j2 = this.LLILZLL;
                int i2 = this.LLIZLLLIL;
                int i3 = this.LLJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("vqscore_timeout_");
                sbLIZ2.append(this.LLILZIL.LJIIJ);
                sbLIZ2.append("ms");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c2215981BoC2.getClass();
                C2215981BoC.LJII(c2216011BoF2, C2215981BoC.LIZLLL(j2, jCurrentTimeMillis, jLJIIIZ, strLIZIZ, i2, i3));
            } else {
                C2215981BoC c2215981BoC3 = C2215981BoC.LIZ;
                C2216011BoF c2216011BoF3 = this.LLILZIL;
                long j3 = this.LLILZLL;
                int i4 = this.LLIZLLLIL;
                int i5 = this.LLJ;
                c2215981BoC3.getClass();
                C2215981BoC.LJII(c2216011BoF3, C2215981BoC.LIZ(vecDouble, j3, jCurrentTimeMillis, jLJIIIZ, i4, i5));
            }
            C2215981BoC.LIZ.LJIIL(this.LLILZIL);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            C201955140j.LJIIIIZZ(C830690WiJ.LIZIZ, "PostPublishClarityScoreScheduler", "scoring exception publishId=" + this.LLJI + ": " + th);
            C2215981BoC c2215981BoC4 = C2215981BoC.LIZ;
            C2216011BoF c2216011BoF4 = this.LLILZIL;
            long j4 = this.LLILZLL;
            long j5 = this.LLIZ;
            VideoPublishEditModel videoPublishEditModel2 = this.LLILZ;
            c2215981BoC4.getClass();
            long jLJIIIZ2 = C2215981BoC.LJIIIZ(videoPublishEditModel2, null);
            int i6 = this.LLIZLLLIL;
            int i7 = this.LLJ;
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            C2215981BoC.LJII(c2216011BoF4, C2215981BoC.LIZLLL(j4, j5, jLJIIIZ2, message, i6, i7));
            this.LLILZIL.LJIJI = true;
            c2215981BoC4.LJIIL(this.LLILZIL);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.submit$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
