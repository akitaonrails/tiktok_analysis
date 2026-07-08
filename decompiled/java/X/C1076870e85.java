package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CreatorAIComment;
import com.ss.android.ugc.now.interaction.assem.AICommentBannerCell;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS132S1200000_16;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0e85, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076870e85 extends AbstractC1906720ziY {
    public final Keva LLIZLLLIL;

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(AICommentBannerCell.class);
    }

    public final void LJJI() {
        Object next;
        Iterator it2 = ((ArrayList) this.LLILZLL.LJII()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next instanceof C993620bxo) {
                    break;
                }
            }
        }
        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
        if (interfaceC1891350zJl != null) {
            C20600815jK.LJIIL(this.LLILZLL, interfaceC1891350zJl);
        }
    }

    public C1076870e85() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_repo_pgc_homepage");
        sbLIZ.append(C0XQ7.LJFF().getCurUserId());
        this.LLIZLLLIL = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJ(Aweme aweme, String str) {
        String authorUid;
        CreatorAIComment creatorAIComment;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ai_comment_analysis_header", true, false)) {
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            if (C10EU.LJIIZILJ(authorUid) && aweme != null && (creatorAIComment = aweme.getCreatorAIComment()) != null && creatorAIComment.hasAITopic && this.LLIZLLLIL.getInt("ai_comment_banner_counter", 0) <= 9 && this.LLIZLLLIL.getInt("ai_comment_banner_counter_hide", 0) < 2 && !a0.LJJIIZI(this.LLIZLLLIL.getString("ai_comment_banner_interacted_video_ids", ""), aweme.getAid(), false)) {
                C20600815jK.LIZIZ(this.LLILZLL, 0, new C993620bxo(new AwS132S1200000_16(this, aweme, str, 11), new AwS132S1200000_16(this, aweme, str, 12)));
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("video_id", aweme.getAid());
                c2344009Gk.LJIIIIZZ("enter_from", str);
                C20684815ws.LJIILLIIL("comment_banner_show", c2344009Gk.LIZ);
                this.LLIZLLLIL.storeInt("ai_comment_banner_counter", this.LLIZLLLIL.getInt("ai_comment_banner_counter", 0) + 1);
            }
        }
    }

    public static void LJJIFFI(Aweme aweme, String str, String str2) {
        String aid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("video_id", aid);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("category", str);
        C20684815ws.LJIILLIIL("comment_banner_click", c2344009Gk.LIZ);
    }
}
