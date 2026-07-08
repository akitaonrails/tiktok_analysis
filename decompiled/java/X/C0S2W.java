package X;

import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS26S0010000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S2W, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S2W {
    public final BaseListFragmentPanel LIZ;
    public final String LIZIZ;
    public final User LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        Aweme aweme;
        VideoBaseCell videoBaseCell;
        C0S2L c0s2l;
        C0SZ8 c0sz8LJLIL = this.LIZ.LJLIL();
        String aid = null;
        if (c0sz8LJLIL != null) {
            aweme = c0sz8LJLIL.getAweme();
            if (aweme != null) {
                aid = aweme.getAid();
            }
        } else {
            aweme = null;
        }
        if (Intrinsics.LJFF(aid, this.LIZIZ)) {
            AwemeBizExtKt.setSharer(aweme, this.LIZJ);
            VideoExposeSharerInformationVM videoExposeSharerInformationVMLIZJ = C0RLJ.LIZJ(this.LIZ.LJLIL());
            if (videoExposeSharerInformationVMLIZJ == null || (c0s2l = (C0S2L) videoExposeSharerInformationVMLIZJ.getState()) == null || !c0s2l.LLJ) {
                C0SZ8 c0sz8LJLIL2 = this.LIZ.LJLIL();
                if (c0sz8LJLIL2 instanceof C0RDR) {
                    ((C0RDR) c0sz8LJLIL2).LJJIIZI().zQ2(Boolean.TRUE, "show_expose_sharer_info_view");
                    boolean z = c0sz8LJLIL2 instanceof VideoBaseCell;
                    if (z) {
                        VideoBaseCell videoBaseCell2 = (VideoBaseCell) c0sz8LJLIL2;
                        if ((videoBaseCell2 == null || videoBaseCell2.LLLIIL() != 2) && !(z && (videoBaseCell = (VideoBaseCell) c0sz8LJLIL2) != null && videoBaseCell.LLLIIL() == 6)) {
                            return;
                        }
                        VideoExposeSharerInformationVM videoExposeSharerInformationVMLIZJ2 = C0RLJ.LIZJ(c0sz8LJLIL2);
                        if (videoExposeSharerInformationVMLIZJ2 != null) {
                            videoExposeSharerInformationVMLIZJ2.setState(new AwS26S0010000_11(19));
                        }
                        C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "refresh the vh!");
                    }
                }
            }
        }
    }

    public C0S2W(BaseListFragmentPanel baseListFragmentPanel, String str, User user) {
        this.LIZ = baseListFragmentPanel;
        this.LIZIZ = str;
        this.LIZJ = user;
    }
}
