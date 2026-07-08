package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196320hEk {
    public static final InterfaceC665370Q7z LIZ(PowerCell<?> powerCell) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        RecyclerView attachView$powerlist_release = powerCell.getAttachView$powerlist_release();
        if (attachView$powerlist_release != null) {
            Object tag = attachView$powerlist_release.getTag(R.id.rnd);
            if ((tag instanceof InterfaceC665370Q7z) && (interfaceC665370Q7z = (InterfaceC665370Q7z) tag) != null) {
                return interfaceC665370Q7z;
            }
        }
        Fragment currentFragment = powerCell.getCurrentFragment();
        if (currentFragment != null) {
            return C1558360qeg.LJFF(currentFragment, null);
        }
        C19EG currentActivity = powerCell.getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return C1558360qeg.LJI(currentActivity, null);
    }

    public static final void LIZIZ(RecyclerView recyclerView, InterfaceC665370Q7z interfaceC665370Q7z) {
        recyclerView.setTag(R.id.rnd, interfaceC665370Q7z);
    }
}
