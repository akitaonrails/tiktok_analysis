package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPreloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RivalSectionConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0b75, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960930b75 {
    public static final Map<InterfaceC961690b8J, C11NZ<?>> LIZ = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        if (r5 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZ(X.C960970b79 r16) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C960930b75.LIZ(X.0b79):kotlin.Pair");
    }

    public static EnumC952640ati LIZIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -903442313) {
            if (iHashCode != -210464431) {
                if (iHashCode == -80405309 && str.equals("section_invite_list_friend")) {
                    return EnumC952640ati.FRIENDS;
                }
                return null;
            }
            if (str.equals("section_invite_list_banner")) {
                return EnumC952640ati.BANNERS;
            }
            return null;
        }
        if (str.equals("section_invite_list_recommend")) {
            return EnumC952640ati.RECOMMEND;
        }
        return null;
    }

    public static boolean LIZJ(EnumC952640ati enumC952640ati) {
        RivalSectionConfig rivalSectionConfig;
        if (enumC952640ati != EnumC952640ati.RECOMMEND || (rivalSectionConfig = CoHostInviteListPreloadSetting.INSTANCE.getRivalSectionConfig(enumC952640ati.getValue())) == null) {
            return false;
        }
        return !rivalSectionConfig.reloadWhenNewlyFetched;
    }

    public static boolean LIZLLL(EnumC952640ati enumC952640ati, boolean z) {
        RivalSectionConfig rivalSectionConfig;
        if (enumC952640ati != EnumC952640ati.RECOMMEND || (rivalSectionConfig = CoHostInviteListPreloadSetting.INSTANCE.getRivalSectionConfig(enumC952640ati.getValue())) == null || rivalSectionConfig.reloadWhenNewlyFetched) {
            return false;
        }
        return z;
    }
}
