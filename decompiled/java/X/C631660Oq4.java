package X;

import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCompose;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Oq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C631660Oq4 extends C2217421BqW implements Function0<Unit> {
    public C631660Oq4(MusicCellCompose musicCellCompose) {
        super(0, musicCellCompose, MusicCellCompose.class, "onSimilarSoundsTextClick", "onSimilarSoundsTextClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C631640Oq2 c631640Oq2;
        MusicCellCompose musicCellCompose = (MusicCellCompose) this.receiver;
        C632090Oql c632090Oql = musicCellCompose.LLJ;
        if (c632090Oql != null && (c631640Oq2 = musicCellCompose.LLJI) != null) {
            musicCellCompose.I5().xQ2(c632090Oql);
            HashMap map = new HashMap();
            map.put("music_id", c632090Oql.getMusicModel().getMusicId());
            map.put("song_number", String.valueOf(c632090Oql.getMusicItemModel().similarMusicSize));
            String str = c631640Oq2.LIZ;
            if (str == null) {
                str = "";
            }
            map.put("to_user_id", str);
            C20684815ws.LJIILLIIL("similar_song_click", map);
        }
        return Unit.LIZ;
    }
}
