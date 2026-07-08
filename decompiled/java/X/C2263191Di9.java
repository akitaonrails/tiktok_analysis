package X;

import com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui.PcsCourseVideoEditMainAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Di9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263191Di9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ PcsCourseVideoEditMainAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2263191Di9(long j, PcsCourseVideoEditMainAssem pcsCourseVideoEditMainAssem) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = pcsCourseVideoEditMainAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL < 30000) {
            C491160JNy c491160JNy = this.LLILLJJLI.LLJJIJIL;
            if (c491160JNy != null) {
                c491160JNy.setSeekbarShowType(4);
            }
        } else {
            C491160JNy c491160JNy2 = this.LLILLJJLI.LLJJIJIL;
            if (c491160JNy2 != null) {
                c491160JNy2.setSeekbarShowType(0);
            }
        }
        return Unit.LIZ;
    }
}
