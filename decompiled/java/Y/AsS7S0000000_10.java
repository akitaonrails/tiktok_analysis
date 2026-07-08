package Y;

import X.AbstractC1585810rMx;
import X.C0P68;
import X.C1558360qeg;
import X.C1558520qew;
import X.C288000BQo;
import X.C639480P6k;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class AsS7S0000000_10 extends AbstractC1585810rMx {
    public final int $t;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                KeyboardUtils.LIZIZ(recyclerView);
                break;
            case 2:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 3:
                LJJIIJ$2(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (2 - this.$t != 0) {
            super.LJJIIZI(recyclerView, i, i2);
        } else {
            LJJIIZI$0(this, recyclerView, i, i2);
        }
    }

    public AsS7S0000000_10(int i) {
        this.$t = i;
    }

    public static final void LJJIIJ$0(AsS7S0000000_10 asS7S0000000_10, RecyclerView recyclerView, int i) {
        FirstScreenHelperAbility firstScreenHelperAbility;
        if (i == 1 && (firstScreenHelperAbility = (FirstScreenHelperAbility) C1558520qew.LIZ(C1558360qeg.LJ(recyclerView, null), FirstScreenHelperAbility.class, null)) != null) {
            firstScreenHelperAbility.Am();
        }
    }

    public static final void LJJIIJ$2(AsS7S0000000_10 asS7S0000000_10, RecyclerView recyclerView, int i) {
        if (i == 0) {
            if (C288000BQo.LIZ() == 1) {
                DoFrameController.LIZIZ = 0;
            }
        } else {
            if (C288000BQo.LIZ() != 1) {
                return;
            }
            DoFrameController.LIZIZ = 3;
        }
    }

    public static final void LJJIIZI$0(AsS7S0000000_10 asS7S0000000_10, RecyclerView recyclerView, int i, int i2) {
        ConcurrentHashMap<Integer, C0P68> concurrentHashMap = C639480P6k.LIZ;
        SystemClock.uptimeMillis();
        Math.abs(i2);
    }
}
