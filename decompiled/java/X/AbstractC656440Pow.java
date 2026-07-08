package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Pow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC656440Pow extends AbstractC21673619ry<RecyclerView.ViewHolder> implements InterfaceC652940PjI {
    public final RecyclerView LL;
    public final List<? extends Aweme> LLILLJJLI = new ArrayList();
    public String LLILLL;

    @Override // X.InterfaceC652950PjJ
    public final void LJLJJI() {
    }

    @Override // X.InterfaceC653050PjT
    public final boolean LLD() {
        return true;
    }

    public abstract List<Aweme> LLLFZ();

    @Override // X.InterfaceC652940PjI
    public final void LLLLLILLIL() {
        int childCount;
        if (this.LL.getLayoutManager() != null && (childCount = this.LL.getChildCount()) > 0) {
            int i = 0;
            do {
                RecyclerView recyclerView = this.LL;
                Object childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
                if (childViewHolder instanceof InterfaceC655620Pnc) {
                    ((InterfaceC655620Pnc) childViewHolder).LLLLLILLIL();
                }
                i++;
            } while (i < childCount);
        }
    }

    @Override // X.InterfaceC652940PjI
    public final boolean isPlaying() {
        int childCount;
        if (this.LL.getLayoutManager() == null || (childCount = this.LL.getChildCount()) <= 0) {
            return false;
        }
        int i = 0;
        do {
            RecyclerView recyclerView = this.LL;
            Object childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            if ((childViewHolder instanceof InterfaceC655620Pnc) && ((InterfaceC648350Pbt) childViewHolder).isPlaying()) {
                return true;
            }
            i++;
        } while (i < childCount);
        return false;
    }

    @Override // X.InterfaceC652940PjI
    public final void pauseAll() {
        int childCount;
        if (this.LL.getLayoutManager() != null && (childCount = this.LL.getChildCount()) > 0) {
            int i = 0;
            do {
                RecyclerView recyclerView = this.LL;
                Object childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
                if (childViewHolder instanceof InterfaceC655620Pnc) {
                    ((InterfaceC655620Pnc) childViewHolder).LLJJJ();
                }
                i++;
            } while (i < childCount);
        }
    }

    public AbstractC656440Pow(RecyclerView recyclerView) {
        this.LL = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    @Override // X.InterfaceC652950PjJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLFF(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.LL
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            if (r0 != 0) goto L9
            return
        L9:
            androidx.recyclerview.widget.RecyclerView r0 = r6.LL
            X.0WIY r2 = X.C665740Q9k.LIZJ(r0)
            F r1 = r2.LIZ
            if (r1 == 0) goto L85
            S r0 = r2.LIZIZ
            if (r0 == 0) goto L85
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
            S r0 = r2.LIZIZ
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            if (r4 > r3) goto L85
        L27:
            if (r4 < 0) goto L7e
            java.util.List r0 = r6.LLLFZ()
            int r0 = r0.size()
            if (r4 >= r0) goto L7e
            java.util.List r0 = r6.LLLFZ()
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            java.lang.String r0 = r5.getAid()
            r2 = 0
            if (r0 == 0) goto L54
            java.lang.String r1 = r5.getAid()
            if (r7 == 0) goto L83
            java.lang.String r0 = r7.getAid()
        L4e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7e
        L54:
            java.lang.String r0 = r5.getAid()
            if (r7 == 0) goto L5e
            java.lang.String r2 = r7.getAid()
        L5e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L7e
            androidx.recyclerview.widget.RecyclerView r0 = r6.LL
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r0.findViewHolderForAdapterPosition(r4)
            boolean r0 = r1 instanceof X.ViewOnAttachStateChangeListenerC656430Pov
            if (r0 == 0) goto L7e
            X.0Pov r1 = (X.ViewOnAttachStateChangeListenerC656430Pov) r1
            X.0GZM r2 = r1.LLJJIJIIJIL
            int r1 = r2.getVisibility()
            r0 = 8
            r2.setVisibility(r0)
            X.C1602160rnK.LIZIZ(r1, r0, r2)
        L7e:
            if (r4 == r3) goto L85
            int r4 = r4 + 1
            goto L27
        L83:
            r0 = r2
            goto L4e
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC656440Pow.LLLFF(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
