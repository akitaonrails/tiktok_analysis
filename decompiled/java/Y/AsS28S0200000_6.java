package Y;

import X.AbstractC1585810rMx;
import X.C118300cf;
import X.C23250099c;
import X.C452220HoK;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.TypingStickerRecommendAssem;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListViewModel;

/* JADX INFO: loaded from: classes7.dex */
public class AsS28S0200000_6 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (this.$t != 0) {
            super.LJJIIJ(recyclerView, i);
        } else {
            LJJIIJ$0(this, recyclerView, i);
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS28S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJJIIJ$0(AsS28S0200000_6 asS28S0200000_6, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                ((TypingStickerRecommendAssem) asS28S0200000_6.l0).hp();
                ((C118300cf) asS28S0200000_6.l1).element = 0;
                return;
            }
            return;
        }
        TypingStickerRecommendAssem typingStickerRecommendAssem = (TypingStickerRecommendAssem) asS28S0200000_6.l0;
        typingStickerRecommendAssem.hp();
        typingStickerRecommendAssem.LLJJIJIIJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(typingStickerRecommendAssem), null, null, new C452220HoK(typingStickerRecommendAssem, null), 3);
        int i2 = ((C118300cf) asS28S0200000_6.l1).element;
        if (i2 > 10) {
            ((TypingStickerRecommendAssem) asS28S0200000_6.l0).lp("right");
        } else {
            if (i2 >= -10) {
                return;
            }
            ((TypingStickerRecommendAssem) asS28S0200000_6.l0).lp("left");
        }
    }

    public static final void LJJIIZI$0(AsS28S0200000_6 asS28S0200000_6, RecyclerView recyclerView, int i, int i2) {
        ((C118300cf) asS28S0200000_6.l1).element += i;
    }

    public static final void LJJIIZI$1(AsS28S0200000_6 asS28S0200000_6, RecyclerView recyclerView, int i, int i2) {
        int iFindLastVisibleItemPosition = ((GridLayoutManager) asS28S0200000_6.l0).findLastVisibleItemPosition();
        int itemCount = ((GridLayoutManager) asS28S0200000_6.l0).getItemCount();
        if (itemCount > 0 && iFindLastVisibleItemPosition >= itemCount - 6) {
            ProfileBgVideoListViewModel profileBgVideoListViewModelLLLLZI = ((ProfileBgVideoListActivity) asS28S0200000_6.l1).LLLLZI();
            if (profileBgVideoListViewModelLLLLZI.LLIZLLLIL && !profileBgVideoListViewModelLLLLZI.LLJ) {
                ((ProfileBgVideoListActivity) asS28S0200000_6.l1).LLLLZI().vQ2((String) ((ProfileBgVideoListActivity) asS28S0200000_6.l1).LLJI.getValue(), (String) ((ProfileBgVideoListActivity) asS28S0200000_6.l1).LLJIJIL.getValue(), false);
            }
        }
    }
}
