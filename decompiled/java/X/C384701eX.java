package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem$withDestroy$observer$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01eX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem$withDestroy$1", f = "VideoMusicCoverAssem.kt", l = {}, m = "invokeSuspend")
public final class C384701eX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Lifecycle LL;
    public final /* synthetic */ VideoMusicCoverAssem$withDestroy$observer$1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C384701eX(Lifecycle lifecycle, VideoMusicCoverAssem$withDestroy$observer$1 videoMusicCoverAssem$withDestroy$observer$1, InterfaceC1364105Vn<? super C384701eX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lifecycle;
        this.LLILLJJLI = videoMusicCoverAssem$withDestroy$observer$1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C384701eX(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoMusicCoverAssem@aa4.withDestroy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.addObserver(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMusicCoverAssem@aa4.withDestroy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
