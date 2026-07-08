package X;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: renamed from: X.19Lk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21524219Lk implements C092O {
    public final int $t;
    public Object l0;

    public static final void accept$4(C21524219Lk c21524219Lk, Object obj) {
        ((C19EG) c21524219Lk.l0).lambda$init$1((Configuration) obj);
    }

    public static final void accept$5(C21524219Lk c21524219Lk, Object obj) {
        ((C19EG) c21524219Lk.l0).lambda$init$2((Intent) obj);
    }

    @Override // X.C092O
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public C21524219Lk(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(C21524219Lk c21524219Lk, Object obj) {
        FragmentManager fragmentManager = (FragmentManager) c21524219Lk.l0;
        Configuration configuration = (Configuration) obj;
        if (fragmentManager.LJLIIL()) {
            fragmentManager.LJIJI(false, configuration);
        }
    }

    public static final void accept$1(C21524219Lk c21524219Lk, Object obj) {
        FragmentManager fragmentManager = (FragmentManager) c21524219Lk.l0;
        Integer num = (Integer) obj;
        if (fragmentManager.LJLIIL() && num.intValue() == 80) {
            fragmentManager.LJJIFFI(false);
        }
    }

    public static final void accept$2(C21524219Lk c21524219Lk, Object obj) {
        FragmentManager fragmentManager = (FragmentManager) c21524219Lk.l0;
        C19FD c19fd = (C19FD) obj;
        if (fragmentManager.LJLIIL()) {
            fragmentManager.LJJII(c19fd.LIZ, false);
        }
    }

    public static final void accept$3(C21524219Lk c21524219Lk, Object obj) {
        FragmentManager fragmentManager = (FragmentManager) c21524219Lk.l0;
        C480030Is5 c480030Is5 = (C480030Is5) obj;
        if (fragmentManager.LJLIIL()) {
            fragmentManager.LJJIJIIJI(c480030Is5.LIZ, false);
        }
    }
}
