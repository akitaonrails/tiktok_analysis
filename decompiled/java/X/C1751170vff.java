package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.DividerViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.TopTabListViewHolder;

/* JADX INFO: renamed from: X.0vff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751170vff extends AbstractC1906720ziY {
    public final MessageCenterViewModel LLIZLLLIL;
    public final boolean LLJ;

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(TopTabListViewHolder.class);
        if (this.LLJ) {
            LJIILIIL(DividerViewHolder.class);
        }
    }

    public C1751170vff(MessageCenterViewModel messageCenterViewModel, boolean z) {
        this.LLIZLLLIL = messageCenterViewModel;
        this.LLJ = z;
    }
}
