package X;

import Y.ACListenerS122S0200000_19;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0itT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260010itT extends AbstractC654930PmV {
    public final InterfaceC1260110itd LLILLL;
    public String LLILZ = "";

    public C1260010itT(InterfaceC1260110itd interfaceC1260110itd) {
        this.LLILLL = interfaceC1260110itd;
    }

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Aweme aweme;
        long diggCount;
        UrlModel avatarLarger;
        List<T> list = this.mmItems;
        String nickname = null;
        if (list != 0 && i >= 0 && i < list.size() && (aweme = (Aweme) ListProtector.get(list, i)) != null) {
            C1260020itU c1260020itU = (C1260020itU) viewHolder;
            String str = this.LLILZ;
            c1260020itU.LLIZLLLIL = aweme;
            User author = aweme.getAuthor();
            if (author != null) {
                if (author.getAvatarMedium() != null) {
                    avatarLarger = author.getAvatarMedium();
                } else if (author.getAvatarThumb() != null) {
                    avatarLarger = author.getAvatarThumb();
                } else if (author.getAvatarLarger() != null) {
                    avatarLarger = author.getAvatarLarger();
                }
                if (avatarLarger != null) {
                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(avatarLarger.getUrlList()));
                    c1331670kl3LJIIJ.LJJ(c1260020itU.LLILZ);
                    C786410Ut5.h3(c1331670kl3LJIIJ);
                }
            }
            c1260020itU.LLILLL.setText(aweme.getDesc());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                nickname = author2.getNickname();
            }
            sbLIZ.append(nickname);
            c1260020itU.LLILZIL.setText(C2188811AlT.LIZIZ(sbLIZ));
            TuxTextView tuxTextView = c1260020itU.LLILZLL;
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                diggCount = statistics.getDiggCount();
            } else {
                diggCount = 0;
            }
            tuxTextView.setText(C1843500y4a.LIZIZ(diggCount));
            if (Intrinsics.LJFF(aweme.getAid(), str)) {
                C786410Ut5.LLIIL(c1260020itU.LLIZ, 0);
                C786410Ut5.Q8(c1260020itU.LLILLJJLI, new ACListenerS122S0200000_19(c1260020itU, aweme, 15));
            } else {
                C786410Ut5.LLIIL(c1260020itU.LLIZ, 8);
                C786410Ut5.Q8(c1260020itU.LLILLJJLI, new ACListenerS122S0200000_19(c1260020itU, aweme, 16));
            }
            c1260020itU.M0();
        }
    }

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            return null;
        }
        return new C1260020itU(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eed, viewGroup, false), this.LLILLL);
    }
}
