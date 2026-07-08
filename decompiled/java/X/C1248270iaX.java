package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248270iaX {
    public static final void LIZ(TuxIconView tuxIconView, BizBaseData bizBaseData, String str, Integer num, Integer num2, Function0<Unit> function0) {
        String localIcon;
        Icon icon;
        String iconColor = null;
        if (bizBaseData != null && (icon = bizBaseData.getIcon()) != null) {
            localIcon = icon.getLocalIcon();
        } else {
            localIcon = null;
            if (bizBaseData != null) {
            }
            LJ(tuxIconView, localIcon, iconColor, str, num, num2, "", function0);
        }
        Icon icon2 = bizBaseData.getIcon();
        if (icon2 != null) {
            iconColor = icon2.getIconColor();
        }
        LJ(tuxIconView, localIcon, iconColor, str, num, num2, "", function0);
    }

    public static final void LIZLLL(C197039127h c197039127h, String str, String str2, String str3, Integer num, Integer num2) {
        if (str3 == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0H5V(c197039127h.getContext(), str, str2, str3, num2, num, c197039127h, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.bytedance.tux.input.TuxTextView r3, com.ss.android.ugc.profile.platform.base.data.BizBaseData r4, java.lang.String r5, java.lang.Integer r6, java.lang.Integer r7, boolean r8, int r9) {
        /*
            r0 = r9 & 4
            r2 = 0
            if (r0 == 0) goto L6
            r6 = r2
        L6:
            r0 = r9 & 8
            if (r0 == 0) goto Lb
            r7 = r2
        Lb:
            r0 = r9 & 16
            if (r0 == 0) goto L10
            r8 = 0
        L10:
            if (r5 == 0) goto L68
            if (r8 == 0) goto L6f
            if (r4 == 0) goto L86
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r4.getDescribe()
            if (r0 == 0) goto L86
            java.lang.String r1 = r0.getSubTextColor()
        L20:
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r4.getDescribe()
            if (r0 == 0) goto L2a
            java.lang.String r2 = r0.getSubTextFont()
        L2a:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = X.C1721460utk.LIZ
            android.content.Context r0 = r3.getContext()
            java.lang.Integer r1 = X.C1721460utk.LIZIZ(r0, r1, r5)
            if (r1 == 0) goto L6c
            int r0 = r1.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C0H5S.LIZ(r0)
            if (r0 == 0) goto L6c
            r6 = r1
        L45:
            int r0 = r6.intValue()
            r3.setTextColor(r0)
        L4c:
            java.lang.Integer r1 = X.C1721460utk.LIZ(r2, r5)
            if (r1 == 0) goto L69
            int r0 = r1.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C0H5S.LIZ(r0)
            if (r0 == 0) goto L69
            r7 = r1
        L61:
            int r0 = r7.intValue()
            r3.setTuxFont(r0)
        L68:
            return
        L69:
            if (r7 == 0) goto L68
            goto L61
        L6c:
            if (r6 == 0) goto L4c
            goto L45
        L6f:
            if (r4 == 0) goto L86
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r4.getDescribe()
            if (r0 == 0) goto L86
            java.lang.String r1 = r0.getTextColor()
        L7b:
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r4.getDescribe()
            if (r0 == 0) goto L2a
            java.lang.String r2 = r0.getTextFont()
            goto L2a
        L86:
            r1 = r2
            if (r8 == 0) goto L8c
            if (r4 == 0) goto L2a
            goto L20
        L8c:
            if (r4 == 0) goto L2a
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1248270iaX.LIZJ(com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.profile.platform.base.data.BizBaseData, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, int):void");
    }

    public static final void LJ(TuxIconView tuxIconView, String str, String str2, String str3, Integer num, Integer num2, String str4, Function0<Unit> function0) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0H5T(tuxIconView.getContext(), str, str2, str3, str4, num2, num, tuxIconView, function0, null), 3);
    }
}
