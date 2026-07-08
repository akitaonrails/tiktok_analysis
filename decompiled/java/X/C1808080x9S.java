package X;

import com.bytedance.bddatefmt.BDDateFormat;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0x9S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808080x9S {
    public static final C1808080x9S LIZ = new C1808080x9S();
    public static final C01GW<BDDateFormat> LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(223));

    public static void LIZ(EnumC500800JkU enumC500800JkU, EnumC500820JkW enumC500820JkW, String str) {
        String str2;
        String str3;
        String str4;
        int iOrdinal = enumC500820JkW.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                str2 = "linked_doc";
            } else {
                throw new C1954807lC();
            }
        } else {
            str2 = "primary";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_popup_mandatory_notification_click");
        c474500IjALIZ.LJJII("vip_2025q3", "popup_id");
        int[] iArr = C500810JkV.LIZ;
        int i = iArr[enumC500800JkU.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str3 = "creator";
            } else {
                throw new C1954807lC();
            }
        } else {
            str3 = "viewer";
        }
        c474500IjALIZ.LJJII(str3, "popup_type");
        int i2 = iArr[enumC500800JkU.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str4 = "go_live_page";
            } else {
                throw new C1954807lC();
            }
        } else {
            str4 = "live_room";
        }
        c474500IjALIZ.LJJII(str4, "popup_location");
        c474500IjALIZ.LJJII(str2, "click_option");
        if (str != null) {
            c474500IjALIZ.LJJII(str, "link_name");
        }
        c474500IjALIZ.LIZ();
    }
}
