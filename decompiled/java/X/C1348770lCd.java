package X;

import Y.AfS190S0100000_21;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0lCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348770lCd extends RecyclerView.ViewHolder {
    public final View LL;
    public final Fragment LLILLJJLI;
    public final C19EG LLILLL;
    public final String LLILZ;
    public final GiftViewModel LLILZIL;
    public final int LLILZLL;
    public final C1355450lNP LLIZ;
    public CommentContextSource LLIZLLLIL;
    public GiftStruct LLJ;
    public long LLJI;
    public int LLJIJIL;
    public C0P0T LLJILJIL;

    public final CommentContextSource L5() {
        if (this.LLIZLLLIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this.LLILLJJLI, null), "source_default_key", CommentContextSource.class, null);
            this.LLIZLLLIL = interfaceC1555100qZQLIZIZ != null ? (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLIZLLLIL;
    }

    public final String I5() {
        CommentCommonModel commonModel;
        Aweme aweme;
        String aid;
        CommentContextSource commentContextSourceL5 = L5();
        return (commentContextSourceL5 == null || (commonModel = commentContextSourceL5.getCommonModel()) == null || (aweme = commonModel.aweme) == null || (aid = aweme.getAid()) == null) ? "" : aid;
    }

    public C1348770lCd(View view, Fragment fragment, C19EG c19eg, String str, GiftViewModel giftViewModel, int i, C1355450lNP c1355450lNP) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = fragment;
        this.LLILLL = c19eg;
        this.LLILZ = str;
        this.LLILZIL = giftViewModel;
        this.LLILZLL = i;
        this.LLIZ = c1355450lNP;
        this.LLJI = -1L;
        this.LLJIJIL = -1;
        new C626130Oh9(view).LJLIL(1L, TimeUnit.SECONDS).LJJLJLI(new AfS190S0100000_21(this, 16));
    }
}
