package Y;

import X.C1459960o5y;
import X.C1459970o5z;
import X.C1657940tFI;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AwS116S0101000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public class AObserverS104S0101000_22 implements Observer {
    public final int $t;
    public int i1;
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
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS104S0101000_22 aObserverS104S0101000_22, Object obj) {
        ((C1459960o5y) aObserverS104S0101000_22.l0).LLLLJ().LJI(aObserverS104S0101000_22.i1, new AwS587S0100000_8((Boolean) obj, 441));
    }

    public static final void onChanged$1(AObserverS104S0101000_22 aObserverS104S0101000_22, Object obj) {
        ((C1459960o5y) aObserverS104S0101000_22.l0).LLLLJ().LJI(aObserverS104S0101000_22.i1, new AwS601S0100000_22((ImageUrlModel) obj, 550));
    }

    public static final void onChanged$2(AObserverS104S0101000_22 aObserverS104S0101000_22, Object obj) {
        ((C1459960o5y) aObserverS104S0101000_22.l0).LLLLJ().LJI(aObserverS104S0101000_22.i1, new AwS587S0100000_8((Boolean) obj, 442));
    }

    public static final void onChanged$3(AObserverS104S0101000_22 aObserverS104S0101000_22, Object obj) {
        ((C1459970o5z) aObserverS104S0101000_22.l0).LLLLJI().LJI(aObserverS104S0101000_22.i1, new AwS587S0100000_8((Boolean) obj, 443));
    }

    public static final void onChanged$4(AObserverS104S0101000_22 aObserverS104S0101000_22, Object obj) {
        C1657940tFI c1657940tFILLLLJ = ((C1459960o5y) aObserverS104S0101000_22.l0).LLLLJ();
        int i = aObserverS104S0101000_22.i1;
        c1657940tFILLLLJ.LJI(i, new AwS116S0101000_8(i, (Boolean) obj, 7));
    }

    public static final void onChanged$5(AObserverS104S0101000_22 aObserverS104S0101000_22, Object obj) {
        ((C1459970o5z) aObserverS104S0101000_22.l0).LLLLJI().LJI(aObserverS104S0101000_22.i1, new AwS601S0100000_22((ImageUrlModel) obj, 566));
    }

    public static final void onChanged$6(AObserverS104S0101000_22 aObserverS104S0101000_22, Object obj) {
        ((C1459960o5y) aObserverS104S0101000_22.l0).LLLLJ().LJI(aObserverS104S0101000_22.i1, new AwS587S0100000_8((Boolean) obj, 444));
    }

    public static final void onChanged$7(AObserverS104S0101000_22 aObserverS104S0101000_22, Object obj) {
        ((C1459970o5z) aObserverS104S0101000_22.l0).LLLLJI().LJI(aObserverS104S0101000_22.i1, new AwS587S0100000_8((Boolean) obj, 445));
    }

    public static final void onChanged$8(AObserverS104S0101000_22 aObserverS104S0101000_22, Object obj) {
        ((C1459970o5z) aObserverS104S0101000_22.l0).LLLLJI().LJI(aObserverS104S0101000_22.i1, new AwS587S0100000_8((Boolean) obj, 446));
    }

    public static final void onChanged$9(AObserverS104S0101000_22 aObserverS104S0101000_22, Object obj) {
        ((C1459970o5z) aObserverS104S0101000_22.l0).LLLLJI().LJI(aObserverS104S0101000_22.i1, new AwS587S0100000_8((Boolean) obj, 447));
    }

    public AObserverS104S0101000_22(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
