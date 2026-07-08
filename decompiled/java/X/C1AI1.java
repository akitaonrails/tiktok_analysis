package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AI1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AI1 {
    public static final String LIZIZ(C1AI6 c1ai6) {
        switch (C785660Urs.LIZ[c1ai6.LIZIZ.ordinal()]) {
        }
        return c1ai6.LIZLLL;
    }

    public static final String LIZJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 3) {
                return "game";
            }
            if (num.intValue() != 5 && num.intValue() != 6) {
                if (num.intValue() == 2) {
                    return "group_live";
                }
                return "single_live";
            }
            return "control_chaos";
        }
        return "single_live";
    }

    public static final String LIZLLL(C1AI6 c1ai6) {
        if (c1ai6.LIZJ) {
            return "new_guide";
        }
        if (Intrinsics.LJFF(c1ai6.LIZLLL, "feed_card")) {
            return "platform_recommend";
        }
        String str = c1ai6.LJFF;
        if (str.length() != 0) {
            return str;
        }
        return "anchor_saved";
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C1AI2 r8, com.bytedance.ies.sdk.datachannel.DataChannel r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AI1.LIZ(X.1AI2, com.bytedance.ies.sdk.datachannel.DataChannel, boolean):void");
    }
}
