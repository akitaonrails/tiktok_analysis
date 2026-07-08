package X;

import com.bytedance.android.live.poll.ILiveNormalPollViewModel;

/* JADX INFO: renamed from: X.0e9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1077930e9n {
    public static String LIZ(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(ILiveNormalPollViewModel.class.getCanonicalName());
        sbLIZ.append(iIntValue);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
