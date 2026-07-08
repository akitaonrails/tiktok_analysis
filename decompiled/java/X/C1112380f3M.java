package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0f3M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1112380f3M implements InterfaceC1114100f68 {
    public int LIZ = Integer.MAX_VALUE;
    public final /* synthetic */ C1112330f3H LIZIZ;

    public C1112380f3M(C1112330f3H c1112330f3H) {
        this.LIZIZ = c1112330f3H;
    }

    @Override // X.InterfaceC1114100f68
    public final CharSequence LIZ(User user) {
        Pair pairLIZIZ;
        String string = this.LIZIZ.LJLIL(user).toString();
        if (this.LIZIZ.LJI().displayNameTruncateType == 0) {
            pairLIZIZ = LIZIZ(Integer.MAX_VALUE, string);
        } else if (this.LIZIZ.LJI().displayNameTruncateType == 1) {
            pairLIZIZ = LIZIZ(this.LIZIZ.LJI().displayNameMinCharCount, string);
        } else {
            pairLIZIZ = LIZIZ(this.LIZ, string);
        }
        int iIntValue = ((Number) pairLIZIZ.getSecond()).intValue();
        C1112330f3H c1112330f3H = this.LIZIZ;
        if (iIntValue > c1112330f3H.LJJIJLIJ) {
            c1112330f3H.LJJIJLIJ = ((Number) pairLIZIZ.getSecond()).intValue();
        }
        return (CharSequence) pairLIZIZ.getFirst();
    }

    public static Pair LIZIZ(int i, String str) {
        if (str.length() <= i) {
            return new Pair(str, Integer.valueOf(str.length()));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str.substring(0, i));
        sbLIZ.append((char) 8230);
        return new Pair(C2188811AlT.LIZIZ(sbLIZ), Integer.valueOf(i));
    }
}
