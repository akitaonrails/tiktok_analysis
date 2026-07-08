package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.ss.android.ugc.profile.business.profile.tab.ProfileLikesAwemeListFragment;

/* JADX INFO: renamed from: X.0j2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1265790j2n extends AbstractC214823195h {
    public final int $t;
    public Object l0;

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

    public C1265790j2n(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(C1265790j2n c1265790j2n, int i) {
        if (i == 0 || i == ((GridLayoutManager) c1265790j2n.l0).getItemCount() - 1) {
            return 2;
        }
        return 1;
    }

    public static final int LJFF$1(C1265790j2n c1265790j2n, int i) {
        Integer numValueOf;
        C1259360isQ c1259360isQ = ((ProfileLikesAwemeListFragment) c1265790j2n.l0).LLJJL;
        if (c1259360isQ != null && (numValueOf = Integer.valueOf(c1259360isQ.getBasicItemViewType(i))) != null && numValueOf.intValue() == 22) {
            return C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(3, 0);
        }
        return 1;
    }
}
