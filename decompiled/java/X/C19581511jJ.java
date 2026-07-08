package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;

/* JADX INFO: renamed from: X.11jJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19581511jJ extends AbstractC19580211j6 {
    public final Aweme LJ;

    public final void LJIILIIL(View view) {
        List<NormalTrackTimeStamp> listLIZIZ;
        NormalTrackTimeStamp normalTrackTimeStamp;
        if (view.getWidth() != 0 && view.getHeight() != 0 && (listLIZIZ = C19580611jA.LIZIZ(this.LIZJ)) != null && (normalTrackTimeStamp = (NormalTrackTimeStamp) C13LP.LJJJLL(listLIZIZ)) != null) {
            RectF rectFLIZ = LIZ(normalTrackTimeStamp);
            float fHeight = rectFLIZ.height() / view.getHeight();
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            C786410Ut5.Jc(view, rectFLIZ.left + ((rectFLIZ.width() - view.getWidth()) / 2.0f));
            C786410Ut5.ed(view, rectFLIZ.top + ((rectFLIZ.height() - view.getHeight()) / 2.0f));
            C786410Ut5.Ob(view, fHeight);
            C786410Ut5.pc(view, fHeight);
            C786410Ut5.Ab(view, normalTrackTimeStamp.getRotation());
            C786410Ut5.LJLLLLLL(0, view);
            view.invalidate();
        }
    }

    @Override // X.AbstractC19580211j6
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct) {
        return C19580611jA.LIZJ(j, interactStickerStruct);
    }

    @Override // X.AbstractC19580211j6
    public final void LJIIJJI(float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        String str;
        String groupId;
        String authorUid;
        C0R60 c0r60;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C705930RmZ c705930RmZ = this.LIZLLL;
        String str2 = null;
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r60.LIZ;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        Aweme aweme = this.LJ;
        if (aweme != null) {
            groupId = aweme.getGroupId();
        } else {
            groupId = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        Aweme aweme2 = this.LJ;
        if (aweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        MusicStickerStruct musicStickerStruct = this.LIZJ.getMusicStickerStruct();
        if (musicStickerStruct != null) {
            str2 = musicStickerStruct.musicId;
        }
        c2344009Gk.LJIIIIZZ("music_id", str2);
        C20684815ws.LJIILLIIL("music_sticker_click", c2344009Gk.LIZ);
        interfaceC19579211iw.LIZ(this.LIZIZ.LJJ(f, f2));
    }

    @Override // X.AbstractC19580211j6, X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        C1398440mUk.LIZ.getClass();
        if (C1398440mUk.LIZ() && super.LJI(f, f2, i, j)) {
            return true;
        }
        return false;
    }

    public C19581511jJ(Context context, C19581611jK c19581611jK, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, Aweme aweme) {
        super(context, c19581611jK, interactStickerStruct, c705930RmZ);
        this.LJ = aweme;
    }

    @Override // X.AbstractC19580211j6, X.InterfaceC19594911lT
    public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        C1398440mUk.LIZ.getClass();
        if (C1398440mUk.LIZ() && super.LJIIIZ(j, i, f, f2, interfaceC19579211iw)) {
            return true;
        }
        return false;
    }
}
