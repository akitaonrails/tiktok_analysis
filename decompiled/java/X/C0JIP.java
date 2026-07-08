package X;

import Y.AfS176S0100000_7;
import com.ss.android.ugc.aweme.pcs.course.api.network.ConfirmSMBCourseVideoAudioRequest;
import com.ss.android.ugc.aweme.pcs.course.api.network.IPcsCourseApi;
import com.ss.android.ugc.aweme.pcs.course.musicpeelpage.viewmodel.PcsCourseMusicPeelVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JIP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.musicpeelpage.viewmodel.PcsCourseMusicPeelVM$confirmVideoAudio$2", f = "PcsCourseMusicPeelVM.kt", l = {}, m = "invokeSuspend")
public final class C0JIP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PcsCourseMusicPeelVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JIP(PcsCourseMusicPeelVM pcsCourseMusicPeelVM, InterfaceC1364105Vn<? super C0JIP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pcsCourseMusicPeelVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JIP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        String str;
        C1C7U.LIZ("PcsCourseMusicPeelVM@eb1.confirmVideoAudio$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C480460Ism.LIZ().getClass();
        IPcsCourseApi iPcsCourseApi = (IPcsCourseApi) C480460Ism.LIZLLL(IPcsCourseApi.class);
        ConfirmSMBCourseVideoAudioRequest confirmSMBCourseVideoAudioRequest = new ConfirmSMBCourseVideoAudioRequest();
        PcsCourseMusicPeelVM pcsCourseMusicPeelVM = this.LL;
        C0JI7 c0ji7VQ2 = pcsCourseMusicPeelVM.vQ2();
        long j2 = -1;
        if (c0ji7VQ2 != null) {
            j = c0ji7VQ2.LLILLJJLI;
        } else {
            j = -1;
        }
        confirmSMBCourseVideoAudioRequest.courseId = j;
        C0JI7 c0ji7VQ22 = pcsCourseMusicPeelVM.vQ2();
        if (c0ji7VQ22 != null) {
            j2 = c0ji7VQ22.LLILLL;
        }
        confirmSMBCourseVideoAudioRequest.videoId = j2;
        C11NZ<C470590Icr<Object>> c11nzConfirmVideoAudio = iPcsCourseApi.confirmVideoAudio(confirmSMBCourseVideoAudioRequest);
        C0JI7 c0ji7VQ23 = this.LL.vQ2();
        if (c0ji7VQ23 == null || (str = c0ji7VQ23.LL) == null) {
            str = "";
        }
        C11O8 c11o8LJJJLZIJ = C1808280x9m.LJFF(c11nzConfirmVideoAudio, str, "/smb/course/video/confirm_audio/", null, 12).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        PcsCourseMusicPeelVM pcsCourseMusicPeelVM2 = this.LL;
        c11o8LJJJLZIJ.LJJLL(new AfS176S0100000_7(pcsCourseMusicPeelVM2, 120), new AfS176S0100000_7(pcsCourseMusicPeelVM2, 121));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsCourseMusicPeelVM@eb1.confirmVideoAudio$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
