package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142050fpD extends C09AY implements Function1<C1142020fpA, C1142020fpA> {
    public final /* synthetic */ C1136870fgr LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ List<C2209908lF> LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ EnumC1142040fpC LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142050fpD(C1136870fgr c1136870fgr, String str, long j, long j2, int i, List<C2209908lF> list, long j3, EnumC1142040fpC enumC1142040fpC) {
        super(1);
        this.LL = c1136870fgr;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = i;
        this.LLILZLL = list;
        this.LLIZ = j3;
        this.LLIZLLLIL = enumC1142040fpC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1142020fpA invoke(C1142020fpA c1142020fpA) {
        C1136870fgr c1136870fgr = this.LL;
        String str = this.LLILLJJLI;
        EnumC1142140fpM enumC1142140fpM = EnumC1142140fpM.LOADING;
        long j = this.LLILLL;
        long j2 = this.LLILZ;
        int i = this.LLILZIL;
        C1142070fpF c1142070fpF = C1142070fpF.LIZ;
        List<C2209908lF> list = this.LLILZLL;
        c1142070fpF.getClass();
        String strLJIIL = C1142070fpF.LJIIL(i, list);
        String strLJIIL2 = C1142070fpF.LJIIL(this.LLILZIL + 1, this.LLILZLL);
        List<C2209908lF> list2 = this.LLILZLL;
        return new C1142020fpA(c1136870fgr, str, enumC1142140fpM, j, j2, i, strLJIIL, strLJIIL2, C1142070fpF.LIZIZ(this.LLILLL, this.LLILZIL, this.LLIZ, list2), C1142070fpF.LIZ(this.LLILZIL, this.LLIZ, this.LLILZLL), this.LLIZLLLIL, null, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
    }
}
