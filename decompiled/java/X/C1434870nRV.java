package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0nRV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434870nRV {
    public static final /* synthetic */ int LIZ = 0;

    public static ArrayList LIZ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = false;
        }
        if ((i & 16) != 0) {
            z5 = false;
        }
        if (z2) {
            return C1697810uHb.LJ(new C1437500nVk(5, EnumC1434770nRL.AUTH_KEY), new C1437500nVk(70, EnumC1434770nRL.CLOUD_MERGE), new C1437500nVk(10, EnumC1434770nRL.COMPILE), new C1437500nVk(10, EnumC1434770nRL.UPLOAD), new C1437500nVk(5, EnumC1434770nRL.CREATE_AWEME));
        }
        if (z) {
            return C1697810uHb.LJ(new C1437500nVk(59, EnumC1434770nRL.COMPILE), new C1437500nVk(1, EnumC1434770nRL.AUTH_KEY), new C1437500nVk(39, EnumC1434770nRL.UPLOAD), new C1437500nVk(1, EnumC1434770nRL.CREATE_AWEME));
        }
        if (z3) {
            return C1697810uHb.LJ(new C1437500nVk(5, EnumC1434770nRL.COMMENT_FORWARD_RES_PREPARE), new C1437500nVk(1, EnumC1434770nRL.AUTH_KEY), new C1437500nVk(54, EnumC1434770nRL.COMPILE), new C1437500nVk(38, EnumC1434770nRL.UPLOAD), new C1437500nVk(1, EnumC1434770nRL.COVER_TEXT_UPLOAD), new C1437500nVk(1, EnumC1434770nRL.CREATE_AWEME));
        }
        if (z4) {
            return C1697810uHb.LJ(new C1437500nVk(1, EnumC1434770nRL.AUTH_KEY), new C1437500nVk(98, EnumC1434770nRL.COVER_TEXT_UPLOAD), new C1437500nVk(1, EnumC1434770nRL.CREATE_AWEME));
        }
        if (z5) {
            return C1697810uHb.LJ(new C1437500nVk(1, EnumC1434770nRL.AUTH_KEY), new C1437500nVk(97, EnumC1434770nRL.UPLOAD), new C1437500nVk(1, EnumC1434770nRL.COVER_TEXT_UPLOAD), new C1437500nVk(1, EnumC1434770nRL.CREATE_AWEME));
        }
        return C1697810uHb.LJ(new C1437500nVk(1, EnumC1434770nRL.AUTH_KEY), new C1437500nVk(59, EnumC1434770nRL.COMPILE), new C1437500nVk(38, EnumC1434770nRL.UPLOAD), new C1437500nVk(1, EnumC1434770nRL.COVER_TEXT_UPLOAD), new C1437500nVk(1, EnumC1434770nRL.CREATE_AWEME));
    }
}
