package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0gqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181440gqk implements InterfaceC1181450gql {
    public static final C1181440gqk LIZ = new C1181440gqk();
    public static final Set<Integer> LIZIZ = new LinkedHashSet();

    @Override // X.InterfaceC1181450gql
    public final View LIZ(Context context, int i, ViewGroup viewGroup, boolean z) {
        return C21146717pB.LIZIZ(context, i, viewGroup, z);
    }

    @Override // X.InterfaceC1181450gql
    public final void LIZIZ(Context context, Integer num, String str, int i, int i2, LifecycleOwner lifecycleOwner) {
        int i3 = 0;
        if (!C123100dR.LIZ(str)) {
            if (num == null) {
                C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                C1EMR c1emr = C1EMR.LS_ULTIMATE_INFLATER_LAYOUT_ID_INVALID;
                c1205490hTX.LJ(c1emr, new Exception(c1emr.message()));
                return;
            } else {
                while (i3 < i) {
                    C21146717pB.LIZJ(null, num.intValue());
                    i3++;
                }
                return;
            }
        }
        while (i3 < i) {
            C21146717pB.LIZLLL(null, str);
            i3++;
        }
    }
}
