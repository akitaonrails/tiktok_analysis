package X;

import Y.AfS176S0100000_7;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.ss.android.ugc.aweme.pcs.course.api.network.IPcsCourseApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.ListSMBCourseVideosRequest;

/* JADX INFO: renamed from: X.0JI5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.repo.PcsCourseVideoPlayerRepository$fetchVideos$1", f = "PcsCourseVideoPlayerRepository.kt", l = {}, m = "invokeSuspend")
public final class C0JI5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0JMO LLILLJJLI;
    public final /* synthetic */ ListSMBCourseVideosRequest LLILLL;
    public final /* synthetic */ Function1<List<SMBCourseVideo>, Unit> LLILZ;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0JI5(C0JMO c0jmo, ListSMBCourseVideosRequest listSMBCourseVideosRequest, Function1<? super List<SMBCourseVideo>, Unit> function1, Function1<? super Throwable, Unit> function12, InterfaceC1364105Vn<? super C0JI5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0jmo;
        this.LLILLL = listSMBCourseVideosRequest;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0JI5 c0ji5 = new C0JI5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0ji5.LL = obj;
        return c0ji5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsCourseVideoPlayerRepository@57.fetchVideos$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1808280x9m.LJFF(((IPcsCourseApi) this.LLILLJJLI.LIZIZ.getValue()).loadCourseVideos(this.LLILLL), this.LL.getClass().getSimpleName(), "/smb/course/video/list/", null, 12).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this.LLILZ, 140), new AfS176S0100000_7(this.LLILZIL, 141));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsCourseVideoPlayerRepository@57.fetchVideos$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
