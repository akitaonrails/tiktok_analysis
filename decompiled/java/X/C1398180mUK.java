package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mUK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398180mUK extends AbstractC2211791BhR {
    public List<? extends MusicAwemeList.MDPDetailInfo> LJFF;
    public final C1398170mUJ LJII;
    public final C1398190mUL LJIIIIZZ;
    public String LJ = "";
    public Function0<String> LJI = new AwS565S0100000_21(this, 715);

    @Override // X.AbstractC2211791BhR
    public final int LIZJ() {
        return 1;
    }

    @Override // X.AbstractC2211791BhR
    public final float LJIIL() {
        return 0.5f;
    }

    @Override // X.AbstractC2211791BhR
    public final Function0<String> LIZLLL() {
        return this.LJI;
    }

    @Override // X.AbstractC2211791BhR
    public final InterfaceC2211921Bhe LJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC2211791BhR
    public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
        return this.LJII;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0mUJ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0mUL] */
    public C1398180mUK(final MusicSquareViewHolder musicSquareViewHolder) {
        this.LJII = new InterfaceC2211931Bhf() { // from class: X.0mUJ
            @Override // X.InterfaceC2211931Bhf
            public final void LIZ(View view, String str) {
                MusicModel musicModelConvertToMusicModel;
                Music music;
                String str2;
                String str3;
                String str4;
                Aweme aweme;
                Music music2;
                Music music3;
                MusicSquareViewHolder musicSquareViewHolder2 = musicSquareViewHolder;
                if (!musicSquareViewHolder2.LLLIL && !musicSquareViewHolder2.LLLIILIL) {
                    boolean z = true;
                    if (view != null && view.getGlobalVisibleRect(new Rect())) {
                        Map<Integer, Integer> map = MusicSquareViewHolder.LLLIZZ;
                        Context context = view.getContext();
                        Aweme aweme2 = musicSquareViewHolder.LL;
                        MusicAwemeList.MDPDetailInfo mDPDetailInfo = null;
                        if (aweme2 != null && (music3 = aweme2.getMusic()) != null) {
                            musicModelConvertToMusicModel = music3.convertToMusicModel();
                        } else {
                            musicModelConvertToMusicModel = null;
                        }
                        String strLIZ = C1419640n2w.LIZ(context, musicModelConvertToMusicModel);
                        if (strLIZ != null && strLIZ.length() != 0) {
                            z = false;
                        }
                        String str5 = "";
                        if (z && ((aweme = musicSquareViewHolder.LL) == null || (music2 = aweme.getMusic()) == null || (strLIZ = music2.getMusicName()) == null)) {
                            strLIZ = "";
                        }
                        Context context2 = view.getContext();
                        MusicSquareViewHolder musicSquareViewHolder3 = musicSquareViewHolder;
                        Aweme aweme3 = musicSquareViewHolder3.LL;
                        int itemViewType = musicSquareViewHolder3.getItemViewType();
                        List<? extends MusicAwemeList.MDPDetailInfo> list = this.LJFF;
                        if (context2 != null && (music = aweme3.getMusic()) != null) {
                            music.getMusicName();
                            switch (itemViewType) {
                                case 110006:
                                    str2 = "music";
                                    break;
                                case 110007:
                                    if (list != null) {
                                        Iterator<? extends MusicAwemeList.MDPDetailInfo> it2 = list.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MusicAwemeList.MDPDetailInfo next = it2.next();
                                                if (Intrinsics.LJFF(next.id, music.carryEffectId())) {
                                                    mDPDetailInfo = next;
                                                }
                                            }
                                        }
                                        MusicAwemeList.MDPDetailInfo mDPDetailInfo2 = mDPDetailInfo;
                                        if (mDPDetailInfo2 != null && (str3 = mDPDetailInfo2.name) != null) {
                                            str5 = str3;
                                        }
                                    }
                                    str2 = "effect";
                                    strLIZ = str5;
                                    break;
                                default:
                                    if (list != null) {
                                        Iterator<? extends MusicAwemeList.MDPDetailInfo> it3 = list.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                MusicAwemeList.MDPDetailInfo next2 = it3.next();
                                                if (Intrinsics.LJFF(next2.id, music.carryTemplateId())) {
                                                    mDPDetailInfo = next2;
                                                }
                                            }
                                        }
                                        MusicAwemeList.MDPDetailInfo mDPDetailInfo3 = mDPDetailInfo;
                                        if (mDPDetailInfo3 != null && (str4 = mDPDetailInfo3.name) != null) {
                                            str5 = str4;
                                        }
                                    }
                                    str2 = "template";
                                    strLIZ = str5;
                                    break;
                            }
                            Pair pairLJFF = C1398280mUU.LJFF(context2, aweme3.getMusic());
                            String strCarryMetaSongId = music.carryMetaSongId();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("followup_square_recommend_type", str2);
                            c2344009Gk.LJIIIIZZ("followup_square_recommend_reason", (String) pairLJFF.getFirst());
                            c2344009Gk.LJIIIIZZ("followup_square_video_title_name", strLIZ);
                            c2344009Gk.LJIIIIZZ("followup_square_recommend_copywriting", (String) pairLJFF.getSecond());
                            c2344009Gk.LJIIIIZZ("meta_song_id", strCarryMetaSongId);
                            c2344009Gk.LJIIIIZZ("music_id", music.getIdStr());
                            c2344009Gk.LJIIIIZZ("prop_id", music.carryEffectId());
                            c2344009Gk.LJIIIIZZ("tt_template_type", music.carryTemplateType());
                            c2344009Gk.LJIIIIZZ("tt_template_id", music.carryTemplateId());
                            C20684815ws.LJIILLIIL("followup_square_video_title_show", c2344009Gk.LIZ);
                        }
                    }
                }
            }
        };
        this.LJIIIIZZ = new InterfaceC2211921Bhe() { // from class: X.0mUL
            @Override // X.InterfaceC2211921Bhe
            public final void LIZ(long j) {
                musicSquareViewHolder.LLLIILIL = false;
            }
        };
    }

    @Override // X.AbstractC2211791BhR
    public final void LJIILL(Function0<String> function0) {
        this.LJI = function0;
    }
}
