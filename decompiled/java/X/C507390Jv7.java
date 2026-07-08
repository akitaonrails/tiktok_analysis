package X;

import android.graphics.drawable.GradientDrawable;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LivePcsTurnOffSubSetting;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.ExclusiveContent;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507390Jv7 {
    public static final String LIZJ(GetSubPrivilegeDetailResponse.Data data) {
        SubInfo subInfo = data.subInfo;
        if (subInfo != null && Intrinsics.LJFF(subInfo.isSubscribing, Boolean.TRUE)) {
            return "subscribed_not_expired";
        }
        if (data.subScenario == 2) {
            return "subscribed_expired_grace_period";
        }
        return "not_subscribed";
    }

    public static final boolean LJFF(GetSubPrivilegeDetailResponse.Data data) {
        GetSubPrivilegeDetailResponse.Data.SubscribePermission subscribePermission;
        if (!CanRechargeSetting.INSTANCE.getValue() || (subscribePermission = data.subscribePermission) == null || !subscribePermission.canSubscribe || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin() || (LivePcsTurnOffSubSetting.turnOffSub() && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isM2())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence LIZLLL(webcast.api.sub.TemplateInfo r6, android.content.Context r7) {
        /*
            com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting r0 = com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting.INSTANCE
            boolean r0 = r0.enable()
            java.lang.String r5 = ""
            if (r0 == 0) goto L90
            webcast.api.sub.TagInfo r0 = r6.tagInfo
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.newPromotionDesc
            if (r0 == 0) goto L23
            int r0 = r0.length()
            if (r0 != 0) goto L21
            r0 = 1
        L1b:
            if (r0 != r1) goto L23
            r0 = 1
        L1e:
            if (r0 != 0) goto L90
            goto L25
        L21:
            r0 = 0
            goto L1b
        L23:
            r0 = 0
            goto L1e
        L25:
            webcast.api.sub.TagInfo r0 = r6.tagInfo     // Catch: java.lang.Exception -> L87
            if (r0 == 0) goto L2d
            java.lang.String r4 = r0.newPromotionDesc     // Catch: java.lang.Exception -> L87
            if (r4 != 0) goto L2e
        L2d:
            r4 = r5
        L2e:
            int r0 = r4.length()     // Catch: java.lang.Exception -> L87
            if (r0 != 0) goto L35
            goto L37
        L35:
            r0 = 0
            goto L38
        L37:
            r0 = 1
        L38:
            if (r0 == 0) goto L3b
            return r5
        L3b:
            r0 = 91
            r2 = 6
            int r0 = kotlin.text.a0.LJJIZ(r4, r0, r3, r3, r2)     // Catch: java.lang.Exception -> L87
            int r1 = r0 + 1
            r0 = 93
            int r0 = kotlin.text.a0.LJJIZ(r4, r0, r3, r3, r2)     // Catch: java.lang.Exception -> L87
            java.lang.String r6 = r4.substring(r1, r0)     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = "["
            java.lang.String r1 = kotlin.text.u.LJJIFFI(r4, r0, r5, r3)     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = "]"
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r1, r0, r5, r3)     // Catch: java.lang.Exception -> L87
            int r4 = kotlin.text.a0.LJJJ(r0, r6, r3, r3, r2)     // Catch: java.lang.Exception -> L87
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder     // Catch: java.lang.Exception -> L87
            r3.<init>()     // Catch: java.lang.Exception -> L87
            r3.append(r0)     // Catch: java.lang.Exception -> L87
            int r1 = r6.length()     // Catch: java.lang.Exception -> L87
            int r1 = r1 + r4
            r0 = 500(0x1f4, float:7.0E-43)
            r2 = 33
            X.C1119920fFW.LJIIIIZZ(r3, r4, r1, r2, r0)     // Catch: java.lang.Exception -> L87
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan     // Catch: java.lang.Exception -> L87
            r0 = 2131107410(0x7f061e52, float:1.7827398E38)
            int r0 = X.C20736316Cj.LIZIZ(r0, r7)     // Catch: java.lang.Exception -> L87
            r1.<init>(r0)     // Catch: java.lang.Exception -> L87
            int r0 = r6.length()     // Catch: java.lang.Exception -> L87
            int r0 = r0 + r4
            X.C786410Ut5.q2(r3, r1, r4, r0, r2)     // Catch: java.lang.Exception -> L87
            return r3
        L87:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "PrivilegeExt"
            X.C1CC2.LIZ(r0, r1)
        L90:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C507390Jv7.LIZLLL(webcast.api.sub.TemplateInfo, android.content.Context):java.lang.CharSequence");
    }

    public static final int LJ(GetSubPrivilegeDetailResponse.Data data, SubPackagePrivilege subPackagePrivilege) {
        boolean z;
        boolean z2;
        int size = subPackagePrivilege.customizedBenefits.size();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C507290Jux.LIZ("", data)));
        GetSubPrivilegeDetailResponse.Data.SubNoteInfo subNoteInfo = data.subNoteInfo;
        boolean z3 = true;
        if (subNoteInfo != null && subNoteInfo.showNoteDetail) {
            z = true;
        } else {
            z = false;
        }
        int i = (zLJJJI ? 1 : 0) + (C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        ExclusiveContent exclusiveContent = data.exclusiveContent;
        if (exclusiveContent != null && exclusiveContent.shouldShowSubOnlyLiveChat) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = i + (C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0);
        ExclusiveContent exclusiveContent2 = data.exclusiveContent;
        if (exclusiveContent2 == null || !exclusiveContent2.shouldShowCreatorChatRoom) {
            z3 = false;
        }
        int i3 = i2 + (C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0) + (C500260Jjc.LJJJI(Boolean.valueOf(C507310Juz.LIZ(data))) ? 1 : 0);
        if (LiveSubOnlySpacePreviewSetting.INSTANCE.displaySubOnlyPreviewPage()) {
            i3 += C500260Jjc.LJJJI(Boolean.valueOf(C507300Juy.LIZ(data))) ? 1 : 0;
        }
        return size + i3;
    }

    public static final GradientDrawable LIZ(float f, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(i3, i2);
        return gradientDrawable;
    }
}
