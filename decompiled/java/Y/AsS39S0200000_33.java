package Y;

import X.AbstractC1585810rMx;
import X.C10523049p;
import X.C118300cf;
import X.C1748720vbi;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuImageSpecPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuImageWithTextCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerManagerComponent;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public class AsS39S0200000_33 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
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
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS39S0200000_33(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJJIIJ$0(AsS39S0200000_33 asS39S0200000_33, RecyclerView recyclerView, int i) {
        boolean z;
        FriendsV3PlayerManagerComponent friendsV3PlayerManagerComponent = (FriendsV3PlayerManagerComponent) asS39S0200000_33.l0;
        friendsV3PlayerManagerComponent.LLJILLL = i;
        if (i == 0) {
            if (((C118300cf) asS39S0200000_33.l1).element > 0) {
                z = true;
            } else {
                z = false;
            }
            friendsV3PlayerManagerComponent.LLJILJILJ = Boolean.valueOf(z);
            ((C118300cf) asS39S0200000_33.l1).element = 0;
            ((FriendsV3PlayerManagerComponent) asS39S0200000_33.l0).LLJJ = 0;
        }
    }

    public static final void LJJIIJ$1(AsS39S0200000_33 asS39S0200000_33, RecyclerView recyclerView, int i) {
        SkuImageSpecPowerCell skuImageSpecPowerCell = (SkuImageSpecPowerCell) asS39S0200000_33.l0;
        if (skuImageSpecPowerCell.LLJJIJIIJIL != 0) {
            if (i == 0) {
                if (skuImageSpecPowerCell.LLJJI > 8) {
                    C1748720vbi.LIZLLL((View) asS39S0200000_33.l1, new C10523049p(), new AwS612S0100000_33((SkuImageSpecPowerCell) asS39S0200000_33.l0, 132));
                }
                ((SkuImageSpecPowerCell) asS39S0200000_33.l0).LLJJI = 0;
            }
        } else if (i == 0) {
            ((SkuImageSpecPowerCell) asS39S0200000_33.l0).LLJJI = 0;
        }
        ((SkuImageSpecPowerCell) asS39S0200000_33.l0).LLJJIJIIJIL = i;
    }

    public static final void LJJIIJ$2(AsS39S0200000_33 asS39S0200000_33, RecyclerView recyclerView, int i) {
        SkuImageWithTextCell skuImageWithTextCell = (SkuImageWithTextCell) asS39S0200000_33.l0;
        if (skuImageWithTextCell.LLJJIJIIJIL != 0) {
            if (i == 0) {
                if (skuImageWithTextCell.LLJJI > 8) {
                    C1748720vbi.LIZLLL((View) asS39S0200000_33.l1, new C10523049p(), new AwS612S0100000_33((SkuImageWithTextCell) asS39S0200000_33.l0, 133));
                }
                ((SkuImageWithTextCell) asS39S0200000_33.l0).LLJJI = 0;
            }
        } else if (i == 0) {
            ((SkuImageWithTextCell) asS39S0200000_33.l0).LLJJI = 0;
        }
        ((SkuImageWithTextCell) asS39S0200000_33.l0).LLJJIJIIJIL = i;
    }

    public static final void LJJIIZI$0(AsS39S0200000_33 asS39S0200000_33, RecyclerView recyclerView, int i, int i2) {
        ((C118300cf) asS39S0200000_33.l1).element += i2;
        ((FriendsV3PlayerManagerComponent) asS39S0200000_33.l0).LLJJ = i2;
    }

    public static final void LJJIIZI$1(AsS39S0200000_33 asS39S0200000_33, RecyclerView recyclerView, int i, int i2) {
        String str;
        SkuImageSpecPowerCell skuImageSpecPowerCell = (SkuImageSpecPowerCell) asS39S0200000_33.l0;
        if (i < 0) {
            str = "show_left";
        } else {
            str = "show_right";
        }
        skuImageSpecPowerCell.LLJJ = str;
        skuImageSpecPowerCell.LLJJI += Math.abs(i);
    }

    public static final void LJJIIZI$2(AsS39S0200000_33 asS39S0200000_33, RecyclerView recyclerView, int i, int i2) {
        String str;
        SkuImageWithTextCell skuImageWithTextCell = (SkuImageWithTextCell) asS39S0200000_33.l0;
        if (i < 0) {
            str = "show_left";
        } else {
            str = "show_right";
        }
        skuImageWithTextCell.LLJJ = str;
        skuImageWithTextCell.LLJJI += Math.abs(i);
    }
}
