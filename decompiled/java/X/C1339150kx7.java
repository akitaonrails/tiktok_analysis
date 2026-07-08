package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.sdui.components.list.a;
import com.lynx.tasm.behavior.ui.list.UIList;

/* JADX INFO: renamed from: X.0kx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339150kx7 extends AbstractC214823195h {
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

    public static final int LJFF$0(C1339150kx7 c1339150kx7, int i) {
        if (!((a) c1339150kx7.l1).LLLLZI.LLLI(i) || ((a) c1339150kx7.l1).LLLZIL <= 1) {
            return 1;
        }
        return ((GridLayoutManager) c1339150kx7.l0).LLILLJJLI;
    }

    public static final int LJFF$1(C1339150kx7 c1339150kx7, int i) {
        if (!((UIList) c1339150kx7.l1).LLILLL.LLLILZLLLI(i) || ((UIList) c1339150kx7.l1).LLILZ <= 1) {
            return 1;
        }
        return ((GridLayoutManager) c1339150kx7.l0).LLILLJJLI;
    }

    public C1339150kx7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
