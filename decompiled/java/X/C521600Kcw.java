package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectPagingScene;

/* JADX INFO: renamed from: X.0Kcw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521600Kcw extends AbstractC214823195h {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(C521600Kcw c521600Kcw, int i) {
        int itemCount;
        int itemCount2;
        Integer numValueOf;
        int i2 = ((GridLayoutManager) c521600Kcw.l0).LLILLJJLI;
        C0J1D c0j1d = ((MaterialSelectPagingScene) c521600Kcw.l1).LLLFF;
        int itemCount3 = 0;
        if (c0j1d != null) {
            itemCount = c0j1d.getItemCount();
        } else {
            itemCount = 0;
        }
        C0J19 c0j19 = ((MaterialSelectPagingScene) c521600Kcw.l1).LLLF;
        if (c0j19 != null) {
            itemCount2 = c0j19.getItemCount();
        } else {
            itemCount2 = 0;
        }
        MaterialSelectPagingScene materialSelectPagingScene = (MaterialSelectPagingScene) c521600Kcw.l1;
        C0J19 c0j192 = materialSelectPagingScene.LLLF;
        C21679919sz c21679919sz = materialSelectPagingScene.LLLFFI;
        if (c21679919sz != null) {
            itemCount3 = c21679919sz.getItemCount();
        }
        if (i >= 0 && itemCount3 != 0 && i < itemCount3) {
            if (i >= itemCount) {
                int i3 = i - itemCount;
                if (i3 >= itemCount2) {
                    numValueOf = 2000;
                } else {
                    if (c0j192 == null) {
                        return i2;
                    }
                    numValueOf = Integer.valueOf(c0j192.getItemViewType(i3));
                }
            } else {
                C0J1D c0j1d2 = ((MaterialSelectPagingScene) c521600Kcw.l1).LLLFF;
                if (c0j1d2 == null) {
                    return i2;
                }
                numValueOf = Integer.valueOf(c0j1d2.getItemViewType(i));
            }
            if (numValueOf != null && numValueOf.intValue() == 1000) {
                return 1;
            }
            return i2;
        }
        return i2;
    }

    public static final int LJFF$1(C521600Kcw c521600Kcw, int i) {
        if (((C0IO6) c521600Kcw.l0).getItemViewType(i) != 1) {
            return 1;
        }
        return ((GridLayoutManager) ((RecyclerView.LayoutManager) c521600Kcw.l1)).LLILLJJLI;
    }

    public C521600Kcw(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
