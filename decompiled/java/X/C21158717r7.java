package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17r7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem$onHostDestroy$1", f = "VideoMusicCoverAssem.kt", l = {}, m = "invokeSuspend")
public final class C21158717r7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoMusicCoverAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21158717r7(VideoMusicCoverAssem videoMusicCoverAssem, InterfaceC1364105Vn<? super C21158717r7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoMusicCoverAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21158717r7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoMusicCoverAssem@aa4.onHostDestroy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.Vp();
        this.LL.xq();
        VideoMusicCoverAssem videoMusicCoverAssem = this.LL;
        videoMusicCoverAssem.LLLLZI = null;
        videoMusicCoverAssem.LLLLZIL = null;
        videoMusicCoverAssem.tq();
        this.LL.vq();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMusicCoverAssem@aa4.onHostDestroy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
