package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.List;
import kotlin.jvm.internal.AwS121S1200000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312190CLp extends C0CX4 {
    public static final C312190CLp LIZ = new C312190CLp();
    public static int LIZIZ;

    @Override // X.C0CX4
    public final boolean LIZLLL() {
        return ((Boolean) C0AW9.LIZ.getValue()).booleanValue();
    }

    @Override // X.C0CX4, X.C0CX9
    public final void LIZIZ(String str) {
        StateOwner.LL.getClass();
        if (!Intrinsics.LJFF(StateOwner.LLJJIJI.getValue(), Boolean.TRUE)) {
            return;
        }
        super.LIZIZ(str);
    }

    @Override // X.C0CX5
    public final List LIZJ(Integer num, List list) {
        Integer numValueOf;
        int iIntValue;
        C19EG c19egLIZIZ;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StateOwner stateOwner = StateOwner.LL;
        C19EG c19egLIZIZ2 = stateOwner.LIZIZ();
        if (c19egLIZIZ2 != null) {
            numValueOf = Integer.valueOf(c19egLIZIZ2.hashCode());
        } else {
            numValueOf = null;
        }
        if (!Intrinsics.LJFF(StateOwner.LLJJIJI.getValue(), Boolean.TRUE)) {
            int i = LIZIZ;
            if ((numValueOf == null || i != numValueOf.intValue()) && (c19egLIZIZ = stateOwner.LIZIZ()) != null) {
                LIZIZ = c19egLIZIZ.hashCode();
                C0CNO.LIZLLL(0L, new AwS121S1200000_4(c19egLIZIZ, (C19EG) curUserId, (String) list, (List<? extends Aweme>) 1));
            }
            return null;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = ((Number) C0AWW.LIZ.getValue()).intValue();
        }
        return C0CX8.LIZ(list, Integer.valueOf(iIntValue));
    }
}
