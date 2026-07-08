package Y;

import X.AbstractC1585810rMx;
import X.C1032180cy0;
import X.C1076950e8D;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.PoiSlashPostsTriggerLine;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecFriendsFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendsV2Fragment;
import com.ss.android.ugc.aweme.relation.ffp.vm.FFPMainFragmentVM;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS31S0010000_16;

/* JADX INFO: loaded from: classes17.dex */
public class AsS43S0100000_16 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    public static final void LJJIIJ$0(AsS43S0100000_16 asS43S0100000_16, RecyclerView recyclerView, int i) {
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 2:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$3(this, recyclerView, i);
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
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS43S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$1(AsS43S0100000_16 asS43S0100000_16, RecyclerView recyclerView, int i) {
        if (i != 0) {
            AssemViewModel assemViewModel = (AssemViewModel) ((SearchFriendsV2Fragment) asS43S0100000_16.l0).LLJILJILJ.getValue();
            assemViewModel.getClass();
            assemViewModel.setState(AFwS252S0000000_16.get$arr$(6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIJ$2(Y.AsS43S0100000_16 r3, androidx.recyclerview.widget.RecyclerView r4, int r5) {
        /*
            if (r5 == 0) goto L8
            r2 = 1
            if (r5 == r2) goto L9
            r2 = 2
            if (r5 == r2) goto L9
        L8:
            r2 = 0
        L9:
            java.lang.Object r0 = r3.l0
            X.0cy0 r0 = (X.C1032180cy0) r0
            r0.LJIIIIZZ = r2
            java.util.LinkedHashSet<X.0cyR> r0 = r0.LIZLLL
            java.util.Iterator r1 = r0.iterator()
        L15:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.next()
            X.0cyR r0 = (X.InterfaceC1032450cyR) r0
            r0.onPageScrollStateChanged(r2)
            goto L15
        L25:
            if (r2 != 0) goto L2e
            java.lang.Object r0 = r3.l0
            X.0cy0 r0 = (X.C1032180cy0) r0
            r0.LIZIZ()
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AsS43S0100000_16.LJJIIJ$2(Y.AsS43S0100000_16, androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public static final void LJJIIJ$3(AsS43S0100000_16 asS43S0100000_16, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C1076950e8D) asS43S0100000_16.l0).LIZ();
        }
    }

    public static final void LJJIIZI$0(AsS43S0100000_16 asS43S0100000_16, RecyclerView recyclerView, int i, int i2) {
        ((PoiSlashPostsTriggerLine) asS43S0100000_16.l0).LIZJ(i2);
    }

    public static final void LJJIIZI$1(AsS43S0100000_16 asS43S0100000_16, RecyclerView recyclerView, int i, int i2) {
        FFPMainFragmentVM fFPMainFragmentVMXQ2 = ((RecFriendsFragment) asS43S0100000_16.l0).SR().xQ2();
        boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
        fFPMainFragmentVMXQ2.getClass();
        fFPMainFragmentVMXQ2.setState(new AwS31S0010000_16(zCanScrollVertically, 0));
    }

    public static final void LJJIIZI$2(AsS43S0100000_16 asS43S0100000_16, RecyclerView recyclerView, int i, int i2) {
        ((C1032180cy0) asS43S0100000_16.l0).LIZIZ();
    }

    public static final void LJJIIZI$3(AsS43S0100000_16 asS43S0100000_16, RecyclerView recyclerView, int i, int i2) {
        ((C1076950e8D) asS43S0100000_16.l0).LIZ();
    }
}
