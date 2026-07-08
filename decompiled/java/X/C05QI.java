package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05QI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.capsule.MusicCapsuleProcessTracker$reportCapsuleTrack$1", f = "MusicCapsuleProcessTracker.kt", l = {}, m = "invokeSuspend")
public final class C05QI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05QI(boolean z, VideoPublishEditModel videoPublishEditModel, long j, InterfaceC1364105Vn<? super C05QI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05QI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicCapsuleProcessTracker@fb91.reportCapsuleTrack$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1458390o3R c1458390o3R = C1458390o3R.LIZ;
        boolean z = this.LL;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        long j = this.LLILLL;
        c1458390o3R.getClass();
        C1458390o3R.LJIJJLI(j, videoPublishEditModel, z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicCapsuleProcessTracker@fb91.reportCapsuleTrack$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
