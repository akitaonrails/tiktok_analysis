package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.108l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191973108l {
    public static final C191852103u LIZ = C191853103v.LIZIZ(new C104A[]{new C191974108m(AFwS271S0000000_28.get$arr$(50))});
    public static final C191852103u LIZIZ = C191853103v.LIZIZ(new C104A[]{new C104S(R.raw.icon_playlist_2_fill, new C103N(2131845111), new C103N(AFwS271S0000000_28.get$arr$(48)), false, Collections.singletonList(C191975108n.LIZJ("content_reuse_permission", "content_reuse_permission", AFwS271S0000000_28.get$arr$(49))), null, 40)});

    public static boolean LIZ() {
        int i;
        List list;
        C191956107u.LIZ.getClass();
        C191880104w.LIZ.getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "content_reuse_batch");
        if (privacySettingsRestrictionItemLJIIJJI == null || !((i = privacySettingsRestrictionItemLJIIJJI.resType) == 15 || i == 14 || i == 16)) {
            return false;
        }
        C191821102p.LIZIZ().getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI2 = C191880104w.LJIIJJI(0, "content_reuse_permission");
        if (privacySettingsRestrictionItemLJIIJJI2 == null || (list = privacySettingsRestrictionItemLJIIJJI2.values) == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            int i2 = ((PrivacySettingsRestrictionOption) it2.next()).showType;
            if (i2 != 2 && i2 != 1) {
                z = false;
            }
        }
        return z;
    }
}
