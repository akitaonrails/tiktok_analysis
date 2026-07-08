package Y;

import X.C0PIF;
import X.C123100dR;
import X.C1697810uHb;
import X.C1C7U;
import X.C2188811AlT;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS17S2100000_3 implements Callable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS17S2100000_3 aCallableS17S2100000_3) {
        Keva keva = (Keva) aCallableS17S2100000_3.l2;
        String str = aCallableS17S2100000_3.s0;
        String str2 = aCallableS17S2100000_3.s1;
        C1C7U.LIZ("SettingsHelper@b3c7.updatePushSettingDynamicUICache$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current_settings_dynamic_ui__");
        sbLIZ.append(str);
        keva.storeString(C2188811AlT.LIZIZ(sbLIZ), str2);
        C1C7U.LIZIZ("SettingsHelper@b3c7.updatePushSettingDynamicUICache$1L");
        return null;
    }

    public static final Object call$1(ACallableS17S2100000_3 aCallableS17S2100000_3) {
        String str;
        int i;
        C1C7U.LIZ("SearchDualStreamMobHelper@b2f5.appendDualStreamMobToAllAwemes$2");
        List list = (List) aCallableS17S2100000_3.l2;
        String str2 = aCallableS17S2100000_3.s0;
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Aweme aweme = (Aweme) it2.next();
            if (aweme.getAid().equals(str2) & C123100dR.LIZ(aweme.getAid())) {
                if (i2 >= 0) {
                    List list2 = (List) aCallableS17S2100000_3.l2;
                    String str3 = aCallableS17S2100000_3.s1;
                    int i3 = 0;
                    for (Object obj : list2) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            Aweme aweme2 = (Aweme) obj;
                            C0PIF c0pif = C0PIF.LIZ;
                            if (str3 == null) {
                                str = "";
                            } else {
                                str = str3;
                            }
                            if (i3 == i2) {
                                i = 0;
                            } else if (i3 < i2) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                            int iAbs = Math.abs(i3 - i2);
                            c0pif.getClass();
                            C0PIF.LJFF(i, iAbs, aweme2, str);
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            } else {
                i2++;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchDualStreamMobHelper@b2f5.appendDualStreamMobToAllAwemes$2");
        return unit;
    }

    public ACallableS17S2100000_3(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
