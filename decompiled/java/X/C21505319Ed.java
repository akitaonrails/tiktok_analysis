package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19Ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21505319Ed implements InterfaceC21506619Eq {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final /* synthetic */ FragmentManager LIZLLL;

    @Override // X.InterfaceC21506619Eq
    public final boolean LIZ(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        Fragment fragment = this.LIZLLL.mPrimaryNav;
        if (fragment != null && this.LIZIZ < 0 && this.LIZ == null && fragment.getChildFragmentManager().LJLLL()) {
            return false;
        }
        return this.LIZLLL.LJZ(arrayList, arrayList2, this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public C21505319Ed(FragmentManager fragmentManager, String str, int i, int i2) {
        this.LIZLLL = fragmentManager;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
