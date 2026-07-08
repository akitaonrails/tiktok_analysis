package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;

/* JADX INFO: renamed from: X.0yZO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862600yZO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, TakoEnterParams takoEnterParams, IMessageAbility iMessageAbility) {
        int i;
        C1860520yW2.LJJI(C1860520yW2.LIZ, z);
        if (z && iMessageAbility != null) {
            if (C1862280yYs.LIZ(takoEnterParams)) {
                i = 2;
            } else {
                i = 1;
            }
            iMessageAbility.U61(2, i, "", "");
        }
    }
}
