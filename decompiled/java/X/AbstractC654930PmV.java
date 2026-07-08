package X;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0PmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC654930PmV extends AbstractC683560Qra<Aweme> {
    public final int LLLII(String str) {
        List<T> list = this.mmItems;
        if (list != 0 && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            int size = this.mmItems.size();
            for (int i = 0; i < size; i++) {
                Aweme aweme = (Aweme) ListProtector.get(this.mmItems, i);
                if (aweme != null && C2093608Ic.LIZJ(str, aweme.getAid())) {
                    if (this.LL != null) {
                        return i + 1;
                    }
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean LLLIIIIL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0) {
            return true;
        }
        return false;
    }

    public void LLLIILIL(FollowStatus followStatus) {
        User author;
        List<T> list = this.mmItems;
        if (list != 0 && !list.isEmpty() && followStatus != null && !TextUtils.isEmpty(followStatus.getUserId())) {
            for (T t : this.mmItems) {
                if (t != null && (author = t.getAuthor()) != null && followStatus.getUserId().equals(author.getUid())) {
                    author.setFollowStatus(followStatus.getFollowStatus());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (LLLIIIIL(viewHolder)) {
            ((InterfaceC1259900itI) viewHolder).LJLJJLL(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (LLLIIIIL(viewHolder)) {
            InterfaceC1259900itI interfaceC1259900itI = (InterfaceC1259900itI) viewHolder;
            interfaceC1259900itI.LJLJJLL(false);
            interfaceC1259900itI.c1();
        }
    }
}
