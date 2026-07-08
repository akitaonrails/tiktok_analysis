package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08a8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem$reportAddSongIconClick$1", f = "VideoMusicTitleAssem.kt", l = {}, m = "invokeSuspend")
public final class C2141008a8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoMusicTitleAssem LL;
    public final /* synthetic */ VideoItemParams LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2141008a8(VideoMusicTitleAssem videoMusicTitleAssem, VideoItemParams videoItemParams, Integer num, InterfaceC1364105Vn<? super C2141008a8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoMusicTitleAssem;
        this.LLILLJJLI = videoItemParams;
        this.LLILLL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2141008a8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoMusicTitleAssem@8443.reportAddSongIconClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.wq(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMusicTitleAssem@8443.reportAddSongIconClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
