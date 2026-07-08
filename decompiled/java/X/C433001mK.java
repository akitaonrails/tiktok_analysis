package X;

import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.01mK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C433001mK {
    public static final Map<String, List<Long>> LIZLLL = new LinkedHashMap();
    public final C1126540fQC LIZ;
    public final String LIZIZ;
    public final String LIZJ = "guest_showdown_billboard";

    public C433001mK(C1126540fQC c1126540fQC, String str) {
        this.LIZ = c1126540fQC;
        this.LIZIZ = str;
    }

    public final void LIZ(User user, String str) {
        Boolean boolValueOf;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showFollowButton ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("FollowView", C2188811AlT.LIZIZ(sbLIZ));
        if (user != null) {
            user.getId();
            C1126540fQC c1126540fQC = this.LIZ;
            if (c1126540fQC != null) {
                c1126540fQC.setActualImageResource(R.drawable.ewg);
                C12ES.LJIILL(0, c1126540fQC);
                String str2 = this.LIZJ;
                Map<String, List<Long>> map = LIZLLL;
                if (!map.containsKey(this.LIZIZ)) {
                    map.put(this.LIZIZ, new ArrayList());
                }
                long id = user.getId();
                List list = (List) ((LinkedHashMap) map).get(this.LIZIZ);
                if (list != null) {
                    boolValueOf = Boolean.valueOf(list.contains(Long.valueOf(user.getId())));
                } else {
                    boolValueOf = null;
                }
                if (!C500260Jjc.LJJJI(boolValueOf)) {
                    if (list != null) {
                        list.add(Long.valueOf(id));
                    }
                    if (str2 != null && str2.length() != 0) {
                        C0JGT.LIZ(C433601mQ.LIZJ(user), Long.valueOf(user.getId()), null, str2, null, null, null, null, null, null, null, null, null, null, "show", null, 47120);
                        z = true;
                    } else {
                        C0JGT.LIZ(C433601mQ.LIZJ(user), Long.valueOf(user.getId()), null, null, null, null, null, null, null, null, null, null, null, null, "show", null, 47128);
                        z = true;
                    }
                } else {
                    z = true;
                }
                c1126540fQC.setEnabled(z);
                C500260Jjc.LJLIIIL(500L, this.LIZ, new AwS381S0200000_15(user, this, 133));
            }
        }
    }
}
