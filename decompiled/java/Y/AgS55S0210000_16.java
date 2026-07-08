package Y;

import X.C1070070dx7;
import X.C1070090dx9;
import X.C1070520dxq;
import X.C1070540dxs;
import X.C1071240dz0;
import X.C1075950e6b;
import X.C1076010e6h;
import X.C1389890mGx;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public class AgS55S0210000_16 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object emit$0(AgS55S0210000_16 agS55S0210000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1071240dz0 c1071240dz0 = (C1071240dz0) obj;
        if (C1070070dx7.LIZ[c1071240dz0.LIZIZ.ordinal()] == 1) {
            if (c1071240dz0.LIZ.LIZJ) {
                C1070540dxs c1070540dxs = new C1070540dxs("contact", agS55S0210000_16.z2);
                FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
                if (findCtxViewModel != null) {
                    findCtxViewModel.vQ2(c1070540dxs);
                }
                if (agS55S0210000_16.z2) {
                    C1076010e6h.LIZJ.LJFF().LIZ(1);
                    C1075950e6b.LIZJ();
                } else {
                    C1076010e6h.LIZJ.LJFF().LIZLLL(1, System.currentTimeMillis());
                }
            } else {
                C1070520dxq c1070520dxq = C1070520dxq.LIZ;
                Context context = (Context) agS55S0210000_16.l0;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) agS55S0210000_16.l1;
                c1070520dxq.getClass();
                C1389890mGx c1389890mGxLJFF = C1070520dxq.LJFF(context, lifecycleOwner);
                if (c1389890mGxLJFF != null) {
                    c1389890mGxLJFF.LJIIIZ(2131834214);
                    c1389890mGxLJFF.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS55S0210000_16 agS55S0210000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1071240dz0 c1071240dz0 = (C1071240dz0) obj;
        if (C1070090dx9.LIZ[c1071240dz0.LIZIZ.ordinal()] == 1) {
            if (c1071240dz0.LIZ.LIZJ) {
                C1070540dxs c1070540dxs = new C1070540dxs("facebook", agS55S0210000_16.z2);
                FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
                if (findCtxViewModel != null) {
                    findCtxViewModel.vQ2(c1070540dxs);
                }
                if (agS55S0210000_16.z2) {
                    C1076010e6h.LIZJ.LJFF().LIZ(2);
                } else {
                    C1076010e6h.LIZJ.LJFF().LIZLLL(2, System.currentTimeMillis());
                }
            } else {
                C1070520dxq c1070520dxq = C1070520dxq.LIZ;
                Context context = (Context) agS55S0210000_16.l0;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) agS55S0210000_16.l1;
                c1070520dxq.getClass();
                C1389890mGx c1389890mGxLJFF = C1070520dxq.LJFF(context, lifecycleOwner);
                if (c1389890mGxLJFF != null) {
                    c1389890mGxLJFF.LJIIIZ(2131834214);
                    c1389890mGxLJFF.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    public AgS55S0210000_16(Context context, LifecycleOwner lifecycleOwner, boolean z, int i) {
        this.$t = i;
        this.z2 = z;
        this.l0 = context;
        this.l1 = lifecycleOwner;
    }
}
