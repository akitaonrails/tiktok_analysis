package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.01Bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C291901Bd {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C292001Be LIZ(int r7, com.bytedance.android.livesdk.gift.model.GiftPage r8) {
        /*
            X.01Be r3 = new X.01Be
            com.bytedance.android.livesdk.gift.model.GiftPage$GiftGroupInTab r0 = LIZIZ(r7, r8)
            r2 = 0
            if (r0 == 0) goto L88
            com.bytedance.android.livesdk.model.message.common.Text r0 = r0.title
        Lb:
            java.lang.String r1 = ""
            android.text.Spannable r5 = X.C1133830fbx.LJIILIIL(r0, r1)
            r4 = 1
            if (r5 == 0) goto L48
            int r0 = r5.length()
            if (r0 <= 0) goto L48
            java.lang.String r0 = r5.toString()
        L1e:
            if (r7 != r4) goto L60
        L20:
            r6 = 1
        L21:
            com.bytedance.android.livesdk.gift.model.GiftPage$GiftGroupInTab r5 = LIZIZ(r7, r8)
            if (r5 == 0) goto L29
            com.bytedance.android.livesdk.model.message.common.Text r2 = r5.description
        L29:
            android.text.Spannable r5 = X.C1133830fbx.LJIILIIL(r2, r1)
            if (r5 == 0) goto L3d
            int r2 = r5.length()
            if (r2 <= 0) goto L3d
            java.lang.String r1 = r5.toString()
        L39:
            r3.<init>(r0, r6, r1)
            return r3
        L3d:
            if (r7 != r4) goto L39
            X.01GW<java.lang.String> r1 = X.C292001Be.LJII
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            goto L39
        L48:
            if (r7 == 0) goto L86
            if (r7 == r4) goto L7d
            r0 = 2
            if (r7 == r0) goto L74
            r0 = 3
            if (r7 == r0) goto L6b
            r0 = 4
            if (r7 == r0) goto L62
            r0 = 5
            if (r7 != r0) goto L86
            X.01GW<java.lang.String> r0 = X.C292001Be.LJI
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
        L60:
            r6 = 0
            goto L21
        L62:
            X.01GW<java.lang.String> r0 = X.C292001Be.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L60
        L6b:
            X.01GW<java.lang.String> r0 = X.C292001Be.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L60
        L74:
            X.01GW<java.lang.String> r0 = X.C292001Be.LJ
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L60
        L7d:
            X.01GW<java.lang.String> r0 = X.C292001Be.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L20
        L86:
            r0 = r1
            goto L1e
        L88:
            r0 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291901Bd.LIZ(int, com.bytedance.android.livesdk.gift.model.GiftPage):X.01Be");
    }

    public static GiftPage.GiftGroupInTab LIZIZ(int i, GiftPage giftPage) {
        List<GiftPage.GiftGroupInTab> list = giftPage.groupsInTab;
        GiftPage.GiftGroupInTab giftGroupInTab = null;
        if (list == null) {
            return null;
        }
        Iterator<GiftPage.GiftGroupInTab> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            GiftPage.GiftGroupInTab next = it2.next();
            if (next.groupInTab == i) {
                giftGroupInTab = next;
                break;
            }
        }
        return giftGroupInTab;
    }
}
