package X;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: renamed from: X.0IDD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDD extends AbstractC214823195h {
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

    public C0IDD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(C0IDD c0idd, int i) {
        if (i != ((GridLayoutManager) c0idd.l0).getItemCount() - 1) {
            return 1;
        }
        return 2;
    }

    public static final int LJFF$1(C0IDD c0idd, int i) {
        if (((ViewOnAttachStateChangeListenerC20604515jv) c0idd.l0).getState().LJIIIIZZ() > i && (((ViewOnAttachStateChangeListenerC20604515jv) c0idd.l0).getState().LJI(i) instanceof C1274104yh)) {
            return 6;
        }
        return 1;
    }
}
