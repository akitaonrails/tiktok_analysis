package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.bulletin.music.LifecycleMusicPlayer;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15KZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.music.LifecycleMusicPlayer$play$1", f = "LifecycleMusicPlayer.kt", l = {}, m = "invokeSuspend")
public final class C15KZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Music LL;
    public final /* synthetic */ LifecycleMusicPlayer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15KZ(Music music, LifecycleMusicPlayer lifecycleMusicPlayer, InterfaceC1364105Vn<? super C15KZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = music;
        this.LLILLJJLI = lifecycleMusicPlayer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15KZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UrlModel playUrl;
        List<String> urlList;
        C1C7U.LIZ("LifecycleMusicPlayer@91de.play$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Music music = this.LL;
        if (music != null && music.getMusicStatus() != 0 && (playUrl = music.getPlayUrl()) != null && (urlList = playUrl.getUrlList()) != null && !urlList.isEmpty()) {
            this.LLILLJJLI.LLILLJJLI.LIZIZ(this.LL);
            MusicModel musicModelConvertToMusicModel = this.LL.convertToMusicModel();
            C1485060okS c1485060okS = new C1485060okS();
            c1485060okS.LJFF = musicModelConvertToMusicModel.getMusicId();
            if (musicModelConvertToMusicModel.getMusicType() == 1 || musicModelConvertToMusicModel.getMusicType() == 2) {
                c1485060okS.LIZJ = 4;
            }
            c1485060okS.LIZLLL = musicModelConvertToMusicModel.getPreciseAuditionDuration();
            c1485060okS.LJIIIZ = 0;
            if (musicModelConvertToMusicModel.isPlayUrlValid()) {
                c1485060okS.LIZIZ = musicModelConvertToMusicModel.getUrl().getUrlList();
            }
            this.LLILLJJLI.LIZ().LIZIZ(c1485060okS);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LifecycleMusicPlayer@91de.play$1");
            return unit;
        }
        LifecycleMusicPlayer lifecycleMusicPlayer = this.LLILLJJLI;
        lifecycleMusicPlayer.LLILZ = false;
        C0OR7 c0or7 = C0OR7.ERROR_CODE_NO_COPYRIGHT;
        lifecycleMusicPlayer.LLILZIL = c0or7;
        lifecycleMusicPlayer.LLILLJJLI.LIZ(this.LL, c0or7);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LifecycleMusicPlayer@91de.play$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
