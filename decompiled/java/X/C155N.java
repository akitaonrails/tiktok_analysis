package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.model.MusicThemeTag;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.155N, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C155N implements AnonymousClass1297 {
    public final C155H LIZ;
    public final EnumC1654750tA9 LIZIZ;
    public final AbstractC204621154x LIZJ;
    public final C155W LIZLLL;
    public final InterfaceC1867560yhO LJ;
    public final MusicThemeTag LJFF;
    public C129L LJI;

    @Override // X.AnonymousClass1297
    public final void LIZLLL(MusicModel musicModel, boolean z) {
    }

    @Override // X.AnonymousClass1297
    public final boolean LJ() {
        return false;
    }

    @Override // X.AnonymousClass1297
    public void LJI(VideoMusicModel videoMusicModel, int i) {
    }

    @Override // X.AnonymousClass1297
    public void LJIIIZ(int i, Aweme aweme) {
    }

    @Override // X.AnonymousClass1297
    public void LJIIJJI(VideoMusicModel videoMusicModel, int i) {
    }

    @Override // X.AnonymousClass1297
    public void LJIILIIL(int i, View view) {
    }

    @Override // X.AnonymousClass1297
    public void LJIILJJIL(VideoMusicModel videoMusicModel) {
    }

    @Override // X.AnonymousClass1297
    public final void LJIILL(int i) {
    }

    @Override // X.AnonymousClass1297
    public final boolean LIZIZ() {
        MusicObject musicObject;
        String musicId;
        List<String> list;
        MusicBuzModel musicBuzModelLIZIZ = this.LIZLLL.zt().LIZIZ();
        if (musicBuzModelLIZIZ == null || (musicObject = musicBuzModelLIZIZ.music) == null || (musicId = MusicBeanUtilKt.getMusicId(musicObject)) == null || (list = this.LIZ.LIZIZ) == null || !list.contains(musicId)) {
            return this.LIZ.LJIIL.LIZIZ();
        }
        return false;
    }

    @Override // X.AnonymousClass1297
    public final boolean LIZJ() {
        return this.LIZ.LJIIL.LIZJ();
    }

    @Override // X.AnonymousClass1297
    public final void LJIIL(int i) {
        List<MusicModel> data;
        MusicModel musicModel;
        List<MusicModel> similarMusicList;
        String str;
        C129L c129l = this.LJI;
        if (c129l != null && (data = c129l.getData()) != null && (musicModel = (MusicModel) C13LP.LJJJLZIJ(i, data)) != null && (similarMusicList = musicModel.getSimilarMusicList()) != null && !similarMusicList.isEmpty()) {
            Iterator<MusicModel> it2 = similarMusicList.iterator();
            while (it2.hasNext()) {
                it2.next().setSimilarMusic(true);
            }
            MusicModel musicModel2 = (MusicModel) C13LP.LJJLIIIJJI(similarMusicList);
            if (musicModel2 != null) {
                musicModel2.setLastSimilarMusic(true);
            }
            if (musicModel.isUnfold()) {
                data.removeAll(similarMusicList);
                C129L c129l2 = this.LJI;
                if (c129l2 != null) {
                    c129l2.notifyItemRangeRemoved(i + 1, similarMusicList.size());
                }
                InterfaceC1867560yhO interfaceC1867560yhO = this.LJ;
                if (interfaceC1867560yhO != null) {
                    interfaceC1867560yhO.LJIIIZ(false, similarMusicList, musicModel);
                }
            } else {
                int i2 = i + 1;
                data.addAll(i2, similarMusicList);
                C129L c129l3 = this.LJI;
                if (c129l3 != null) {
                    c129l3.notifyItemRangeInserted(i2, similarMusicList.size());
                }
                InterfaceC1867560yhO interfaceC1867560yhO2 = this.LJ;
                if (interfaceC1867560yhO2 != null) {
                    interfaceC1867560yhO2.LJIIIZ(true, similarMusicList, musicModel);
                }
            }
            musicModel.setUnfold(!musicModel.isUnfold());
            C155P c155p = this.LIZ.LJIILIIL;
            String stringValue = this.LIZIZ.getStringValue();
            MusicThemeTag musicThemeTag = this.LJFF;
            String str2 = null;
            if (musicThemeTag != null) {
                str = musicThemeTag.key;
            } else {
                str = null;
            }
            c155p.LJFF(musicModel, stringValue, str);
            C155P c155p2 = this.LIZ.LJIILIIL;
            String stringValue2 = this.LIZIZ.getStringValue();
            MusicThemeTag musicThemeTag2 = this.LJFF;
            if (musicThemeTag2 != null) {
                str2 = musicThemeTag2.key;
            }
            c155p2.LJII(musicModel, i, stringValue2, false, false, null, new C1458260o3E(null, this.LIZ.LJIIL.LJIILIIL(), str2, null, 5), null);
        }
    }

    @Override // X.AnonymousClass1297
    public final int LJIILLIIL(MusicModel musicModel) {
        return musicModel.getPresenterDuration();
    }

    @Override // X.AnonymousClass1297
    public final void LIZ(int i, View view) {
        List<MusicModel> data;
        MusicModel musicModel;
        Music music;
        boolean z;
        C129L c129l = this.LJI;
        if (c129l == null || (data = c129l.getData()) == null || (musicModel = (MusicModel) C13LP.LJJJLZIJ(i, data)) == null || (music = musicModel.getMusic()) == null) {
            return;
        }
        if (music.isCanNotReuse()) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131830669);
            C1390380mHk.LIZLLL(view, 3068, creativeToastBuilder);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "change_music_page");
            C20684815ws.LJIILLIIL("add_private_music", c2344009Gk.LIZ);
            return;
        }
        C129L c129l2 = this.LJI;
        if (c129l2 != null && c129l2.LLLI(musicModel)) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            if (!this.LIZ.LJIL.invoke().booleanValue()) {
                return;
            }
            this.LIZ.LJIILIIL.LIZJ(musicModel, this.LIZIZ.getStringValue(), i, null);
            this.LIZJ.LJIIL(this.LJI, false, true, musicModel, true);
            return;
        }
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
        if (iCommerceMediaService != null && iCommerceMediaService.LIZJ(music)) {
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(2131837781);
            creativeToastBuilder2.isTuxToast(true);
            C1390380mHk.LIZLLL(view, 3008, creativeToastBuilder2);
            this.LIZJ.LJIIL(this.LJI, false, true, musicModel, true);
            return;
        }
        C129L c129l3 = this.LJI;
        if (c129l3 != null) {
            c129l3.LLLIILIL(i);
        }
        AbstractC204621154x abstractC204621154x = this.LIZJ;
        EnumC1654750tA9 enumC1654750tA9 = this.LIZIZ;
        MusicThemeTag musicThemeTag = this.LJFF;
        if (musicThemeTag != null) {
            str = musicThemeTag.key;
        }
        abstractC204621154x.LJJIJIIJIL(i, musicModel, enumC1654750tA9, true, null, false, str, null);
    }

    @Override // X.AnonymousClass1297
    public final void LJFF(MusicModel musicModel, int i) {
        String str;
        AbstractC204621154x abstractC204621154x = this.LIZJ;
        EnumC1654750tA9 enumC1654750tA9 = this.LIZIZ;
        MusicThemeTag musicThemeTag = this.LJFF;
        if (musicThemeTag != null) {
            str = musicThemeTag.key;
        } else {
            str = null;
        }
        abstractC204621154x.LJJIIJ(musicModel, enumC1654750tA9, i, null, null, null, str);
    }

    @Override // X.AnonymousClass1297
    public final void LJII(int i, View view) {
        List<MusicModel> data;
        MusicModel musicModel;
        C129L c129l = this.LJI;
        if (c129l != null && (data = c129l.getData()) != null && (musicModel = (MusicModel) C13LP.LJJJLZIJ(i, data)) != null) {
            this.LIZJ.LJJIJIIJI(this.LJI, musicModel, this.LJ);
        }
    }

    @Override // X.AnonymousClass1297
    public final void LJIIIIZZ(int i, View view) {
        if (i < 0) {
            return;
        }
        this.LIZJ.LL.LJIIJ(Unit.LIZ);
        this.LIZ.LJIIL.LIZ(this.LIZIZ.getStringValue());
        this.LIZ.LJIILIIL.LJI(this.LIZJ.LJIL(), this.LIZIZ.getStringValue(), null);
    }

    @Override // X.AnonymousClass1297
    public final void LJIIJ(int i, View view) {
        if (i < 0) {
            return;
        }
        this.LIZ.LJIIL.LJFF();
    }

    public C155N(C155H c155h, EnumC1654750tA9 enumC1654750tA9, AbstractC204621154x abstractC204621154x, C155W c155w, InterfaceC1867560yhO interfaceC1867560yhO, MusicThemeTag musicThemeTag) {
        this.LIZ = c155h;
        this.LIZIZ = enumC1654750tA9;
        this.LIZJ = abstractC204621154x;
        this.LIZLLL = c155w;
        this.LJ = interfaceC1867560yhO;
        this.LJFF = musicThemeTag;
    }
}
