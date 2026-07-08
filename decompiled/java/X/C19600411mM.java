package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11mM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19600411mM extends AbstractC19580211j6 {
    public final Aweme LJ;
    public final C01GW LJFF;

    public final boolean LJIILIIL() {
        User author;
        Aweme aweme = this.LJ;
        return Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid(), (aweme == null || (author = aweme.getAuthor()) == null) ? null : author.getUid());
    }

    public final void LJIILJJIL(View view) {
        List<NormalTrackTimeStamp> listLIZIZ;
        NormalTrackTimeStamp normalTrackTimeStamp;
        if (view.getWidth() != 0 && view.getHeight() != 0 && (listLIZIZ = C19580611jA.LIZIZ(this.LIZJ)) != null && listLIZIZ.size() != 0 && (normalTrackTimeStamp = (NormalTrackTimeStamp) ListProtector.get(listLIZIZ, 0)) != null) {
            RectF rectFLIZ = LIZ(normalTrackTimeStamp);
            float fMin = Math.min(normalTrackTimeStamp.getScaleForIos().floatValue(), 2.0f);
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            C786410Ut5.Jc(view, rectFLIZ.left + ((rectFLIZ.width() - view.getWidth()) / 2.0f));
            C786410Ut5.ed(view, rectFLIZ.top + ((rectFLIZ.height() - view.getHeight()) / 2.0f));
            C786410Ut5.Ob(view, fMin);
            C786410Ut5.pc(view, fMin);
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
        String uid;
        long playCount;
        if (this.LIZJ.getEmojiSliderStickerStruct() != null && LJIILIIL()) {
            C19601311mV c19601311mV = (C19601311mV) this.LIZIZ;
            Activity activityLIZ = C1388190mED.LIZ(c19601311mV.LIZ);
            boolean z = false;
            if (activityLIZ != null) {
                C450860Hm8 c450860Hm8 = new C450860Hm8(activityLIZ);
                c450860Hm8.LLILLJJLI.LJII = -1001L;
                c450860Hm8.LJIIJ(new AwS608S0100000_29(c19601311mV, 729));
                c450860Hm8.LIZJ(AFwS257S0000000_19.get$arr$(747));
                int[] iArr = new int[2];
                c19601311mV.LIZIZ.getLocationOnScreen(iArr);
                c450860Hm8.LJI(C417170GXj.LIZ(activityLIZ));
                c450860Hm8.LLILLJJLI.LIZLLL = EnumC1235690iGF.TOP;
                z = true;
                c450860Hm8.LIZ(((int) f) + iArr[0], ((int) f2) + iArr[1]);
                C0P0T c0p0tLIZIZ = c450860Hm8.LIZIZ();
                c19601311mV.LJFF = c0p0tLIZIZ;
                c0p0tLIZIZ.show();
            }
            interfaceC19579211iw.LIZ(z);
            Aweme aweme = this.LJ;
            if (aweme != null) {
                if (aweme.getIsTikTokStory() && C281310B0v.LIZ()) {
                    return;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(this.LJ.getIsTikTokStory() ? 1 : 0, "story_type");
                c2344009Gk.LJIIIIZZ("group_id", this.LJ.getAid());
                User author = this.LJ.getAuthor();
                if (author == null || (uid = author.getUid()) == null) {
                    uid = "";
                }
                c2344009Gk.LJIIIIZZ("author_id", uid);
                c2344009Gk.LJIIIIZZ("sticker_type", C1894907bX.LIZ(this.LJ));
                AwemeStatistics statistics = this.LJ.getStatistics();
                if (statistics != null) {
                    playCount = statistics.getPlayCount();
                } else {
                    playCount = 0;
                }
                c2344009Gk.LIZLLL(playCount, "vv_cnt");
                C20684815ws.LJIILLIIL("enter_interactive_sticker_result_list", c2344009Gk.LIZ);
            }
        }
    }

    public C19600411mM(Context context, C19601311mV c19601311mV, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, Aweme aweme) {
        C19600111mJ c19600111mJ;
        super(context, c19601311mV, interactStickerStruct, c705930RmZ);
        this.LJ = aweme;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS273S0300000_29(context, interactStickerStruct, c705930RmZ, 23));
        this.LJFF = c01gwLIZIZ;
        if (LJIILIIL()) {
            ((InterfaceC19599911mH) c01gwLIZIZ.getValue()).LJLJJI(aweme);
            if (c705930RmZ != null && (c19600111mJ = c705930RmZ.LJIJJ) != null && c19600111mJ.LIZ == 2) {
                ((InterfaceC19599911mH) c01gwLIZIZ.getValue()).LJLJJL(C19600011mI.LIZ(c19600111mJ));
            }
        }
    }
}
