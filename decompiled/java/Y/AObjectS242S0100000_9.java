package Y;

import X.C1389890mGx;
import X.C318600CeI;
import X.C629480OmY;
import X.InterfaceC1441305kZ;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AObjectS242S0100000_9 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public AObjectS242S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObjectS242S0100000_9 aObjectS242S0100000_9, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((Function0) aObjectS242S0100000_9.l0).invoke();
        }
    }

    public static final void onChanged$1(AObjectS242S0100000_9 aObjectS242S0100000_9, Object obj) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObjectS242S0100000_9.l0;
        String str = StickerPropDetailFragment._pnsPageId;
        stickerPropDetailFragment.getClass();
        if (obj instanceof C318600CeI) {
            C1389890mGx c1389890mGx = new C1389890mGx(stickerPropDetailFragment.requireActivity());
            c1389890mGx.LJIIIZ(2131833767);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
            C629480OmY.LJI(stickerPropDetailFragment);
            return;
        }
        C1389890mGx c1389890mGx2 = new C1389890mGx(stickerPropDetailFragment.requireActivity());
        c1389890mGx2.LJIIIZ(2131833766);
        c1389890mGx2.LJIIJJI();
    }
}
