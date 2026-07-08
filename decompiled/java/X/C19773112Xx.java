package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.ss.android.ugc.profile.business.effect.EffectProfileListFragment;
import java.util.List;

/* JADX INFO: renamed from: X.12Xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19773112Xx extends AbstractC214823195h {
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
            case 2:
                return LJFF$2(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(C19773112Xx c19773112Xx, int i) {
        if (((AbstractC19412510x9) c19773112Xx.l1).getItemViewType(i) == Integer.MIN_VALUE) {
            return ((GridLayoutManager) c19773112Xx.l0).LLILLJJLI;
        }
        ((AbstractC19412510x9) c19773112Xx.l1).getClass();
        return 1;
    }

    public static final int LJFF$1(C19773112Xx c19773112Xx, int i) {
        int size;
        List<? extends T> list = ((C1750050vdr) c19773112Xx.l0).LLILLJJLI.LJFF;
        if (list != 0) {
            size = list.size();
        } else {
            size = 0;
        }
        if (i < size) {
            return 1;
        }
        return ((Number) ((EffectProfileListFragment) c19773112Xx.l1).LLJJJJLIIL.getValue()).intValue();
    }

    public static final int LJFF$2(C19773112Xx c19773112Xx, int i) {
        if (((C19675611yU) c19773112Xx.l0).getItemViewType(i) != 1) {
            return 1;
        }
        return ((GridLayoutManager) c19773112Xx.l1).LLILLJJLI;
    }

    public C19773112Xx(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
