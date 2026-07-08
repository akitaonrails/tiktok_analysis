package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.09l2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2463409l2 {
    public static void LIZ(Bundle bundle, String str, Class cls) {
        Bundle bundle2;
        Parcelable parcelable;
        ArrayList<FragmentState> arrayList = new ArrayList();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null && (parcelable = bundle2.getParcelable("state")) != null) {
                arrayList.add(parcelable);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            for (FragmentState fragmentState : arrayList) {
                if (fragmentState != null && !cls.isAssignableFrom(Class.forName(fragmentState.LL))) {
                    C786410Ut5.LJJIJL(bundle, str, new Bundle());
                    return;
                }
            }
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.LJJIJL(bundle, str, new Bundle());
        }
    }
}
