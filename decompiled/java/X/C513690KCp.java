package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageDialog;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513690KCp {
    public static SubPackagePageDialog LIZ(C0KCF c0kcf, Map map, EnumC513410KBn enumC513410KBn, int i) {
        EnumC513410KBn enumC513410KBnLIZ = enumC513410KBn;
        Map linkedHashMap = map;
        C0KCF c0kcf2 = c0kcf;
        if ((i & 1) != 0) {
            c0kcf2 = new C0KCF(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, 0, null, 0L, 0L, false, -1, 15);
        }
        if ((i & 2) != 0) {
            linkedHashMap = new LinkedHashMap();
        }
        if ((i & 4) != 0) {
            enumC513410KBnLIZ = null;
        }
        SubPackagePageDialog subPackagePageDialog = new SubPackagePageDialog();
        subPackagePageDialog.LLIZ = c0kcf2;
        subPackagePageDialog.LLJJI = System.currentTimeMillis();
        subPackagePageDialog.LLJJ = linkedHashMap;
        if (linkedHashMap != null) {
            linkedHashMap.put("show_entrance", c0kcf2.LJII);
            String str = c0kcf2.LJIIIIZZ;
            if (str != null) {
                linkedHashMap.put("group_id", str);
            }
            if (!linkedHashMap.containsKey("room_id")) {
                linkedHashMap.put("room_id", c0kcf2.LJIILJJIL);
            }
        }
        Intrinsics.LJFF(c0kcf2.LJIIJ, "h5");
        subPackagePageDialog.LLIZLLLIL = Intrinsics.LJFF(c0kcf2.LJIIJ, "homepage-entry");
        Intrinsics.LJFF(c0kcf2.LJIIJ, "homepage");
        if (c0kcf2.LJIIIZ == null) {
            boolean z = true;
            if (Intrinsics.LJFF(c0kcf2.LJIILJJIL, "")) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                if (C500260Jjc.LJJLI() == null) {
                    z = false;
                }
                c0kcf2.LJIIIZ = Boolean.valueOf(z);
            } else {
                c0kcf2.LJIIIZ = Boolean.valueOf(!Intrinsics.LJFF(c0kcf2.LJIILJJIL, CardStruct.IStatusCode.DEFAULT));
            }
        }
        subPackagePageDialog.LLILZ = C513380KBk.LIZ(c0kcf2.LJJ);
        C513550KCb c513550KCb = subPackagePageDialog.LLILZIL;
        if (enumC513410KBnLIZ == null) {
            enumC513410KBnLIZ = C513500KBw.LIZ(c0kcf2.LIZ, c0kcf2.LJI, true);
        }
        c513550KCb.LIZJ = enumC513410KBnLIZ;
        subPackagePageDialog.LLJ = null;
        subPackagePageDialog.LLJJIII = c0kcf2.LIZ();
        return subPackagePageDialog;
    }
}
