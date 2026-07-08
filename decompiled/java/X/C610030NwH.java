package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem$onPageSelected$1", f = "VideoMusicTitleAssem.kt", l = {}, m = "invokeSuspend")
public final class C610030NwH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoMusicTitleAssem LL;
    public final /* synthetic */ VideoItemParams LLILLJJLI;
    public final /* synthetic */ EnumC631120OpC LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610030NwH(VideoMusicTitleAssem videoMusicTitleAssem, VideoItemParams videoItemParams, EnumC631120OpC enumC631120OpC, InterfaceC1364105Vn<? super C610030NwH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoMusicTitleAssem;
        this.LLILLJJLI = videoItemParams;
        this.LLILLL = enumC631120OpC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610030NwH(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String id;
        MatchedSoundInfo matchedSongInfo;
        C1C7U.LIZ("VideoMusicTitleAssem@8443.onPageSelected$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.xq(this.LLILLJJLI, true);
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        String str = "";
        if (c633020OsG.LJIILJJIL(this.LLILLJJLI.getAweme().getMusic()) == DspPlatform.UNKNOWN) {
            String aid = this.LLILLJJLI.getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            c633020OsG.LJIIJ(this.LLILLL, aid, AwemeBizExtKt.getDisableMusicDspFreqCtrl(this.LLILLJJLI.getAweme()));
        }
        Music music = this.LLILLJJLI.getAweme().getMusic();
        if (music != null && (matchedSongInfo = music.getMatchedSongInfo()) != null) {
            id = matchedSongInfo.getId();
        } else {
            id = null;
        }
        String aid2 = this.LLILLJJLI.getAweme().getAid();
        if (aid2 != null) {
            str = aid2;
        }
        c633020OsG.LJIJI(id, str, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMusicTitleAssem@8443.onPageSelected$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
