package Y;

import X.C0U3O;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS129S1100000_15;
import kotlin.jvm.internal.AwS193S1100000_15;
import kotlin.jvm.internal.AwS5S2110000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public class AObjectS4S2110000_15 implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS4S2110000_15 aObjectS4S2110000_15, Object obj) {
        C0U3O c0u3o = (C0U3O) obj;
        c0u3o.LIZLLL(AFwS250S0000000_15.get$arr$(143));
        c0u3o.LJFF(new AwS5S2110000_15((MultiGuestSharedBgGuestViewModel) aObjectS4S2110000_15.l2, aObjectS4S2110000_15.s0, aObjectS4S2110000_15.z3, aObjectS4S2110000_15.s1, 0));
        c0u3o.LIZJ(AFwS250S0000000_15.get$arr$(144));
        c0u3o.LIZIZ(new AwS629S0100000_15((MultiGuestSharedBgGuestViewModel) aObjectS4S2110000_15.l2, 65));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS4S2110000_15 aObjectS4S2110000_15, Object obj) {
        C0U3O c0u3o = (C0U3O) obj;
        c0u3o.LIZLLL(new AwS129S1100000_15((MultiGuestSharedBgGuestViewModel) aObjectS4S2110000_15.l2, aObjectS4S2110000_15.s0, 9));
        c0u3o.LJFF(new AwS5S2110000_15((MultiGuestSharedBgGuestViewModel) aObjectS4S2110000_15.l2, aObjectS4S2110000_15.s0, aObjectS4S2110000_15.z3, aObjectS4S2110000_15.s1, 1));
        c0u3o.LIZJ(AFwS250S0000000_15.get$arr$(147));
        c0u3o.LIZIZ(new AwS193S1100000_15((MultiGuestSharedBgGuestViewModel) aObjectS4S2110000_15.l2, aObjectS4S2110000_15.s0, 1));
        return Unit.LIZ;
    }

    public AObjectS4S2110000_15(MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, String str, String str2, int i) {
        this.$t = i;
        this.l2 = multiGuestSharedBgGuestViewModel;
        this.s0 = str;
        this.z3 = true;
        this.s1 = str2;
    }

    public AObjectS4S2110000_15(MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, String str, boolean z, String str2, int i) {
        this.$t = i;
        this.l2 = multiGuestSharedBgGuestViewModel;
        this.s0 = str;
        this.z3 = z;
        this.s1 = str2;
    }
}
