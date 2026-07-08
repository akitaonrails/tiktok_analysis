package X;

import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import kotlin.jvm.internal.AwS104S0400000_6;
import kotlin.jvm.internal.AwS110S1200000_27;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0yS9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858110yS9 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[PHI: r9
      0x0041: PHI (r9v3 java.lang.String) = (r9v1 java.lang.String), (r9v4 java.lang.String) binds: [B:17:0x003f, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r13, android.content.Context r14, X.InterfaceC665370Q7z r15, android.view.View r16) {
        /*
            r5 = r15
            if (r5 != 0) goto L4
            return
        L4:
            java.lang.Class<com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility> r0 = com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility.class
            r2 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r5, r0, r2)
            com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility r0 = (com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility) r0
            if (r0 == 0) goto L1b
            X.13LC r0 = r0.T71()
            if (r0 == 0) goto L1b
            X.0sDA r2 = r0.LIZIZ()
            X.0ybP r2 = (X.C1863850ybP) r2
        L1b:
            com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem r6 = new com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r9 = r0.toString()
            java.lang.String r10 = "click_inbox_push_card"
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = ""
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r3 = r14
            if (r3 == 0) goto L52
            X.0ybB r1 = X.C1863710ybB.LIZ
            java.lang.String r10 = ""
            if (r2 == 0) goto L3e
            java.lang.String r9 = r2.LL
            if (r9 != 0) goto L41
        L3e:
            r9 = r10
            if (r2 == 0) goto L46
        L41:
            java.lang.String r0 = r2.LLILLJJLI
            if (r0 == 0) goto L46
            r10 = r0
        L46:
            r7 = 1
            java.lang.String r11 = "click_inbox_push_card"
            r1.getClass()
            r4 = r16
            r8 = r7
            X.C1863710ybB.LIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1858110yS9.LIZ(com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo, android.content.Context, X.0Q7z, android.view.View):void");
    }

    public static C435280H5a LIZIZ(TakoBotInfo takoBotInfo, Context context, InterfaceC665370Q7z interfaceC665370Q7z, View view, String str, String str2, int i, boolean z, int i2) {
        int color;
        boolean z2 = z;
        int i3 = i;
        if ((i2 & 32) != 0) {
            i3 = 112;
        }
        if ((i2 & 64) != 0) {
            z2 = false;
        }
        String string = takoBotInfo.pushButtonDesc;
        if ((string == null || string.length() <= 0) && (context == null || (string = context.getString(2131849654)) == null)) {
            string = "";
        }
        String str3 = takoBotInfo.botAvatar;
        String str4 = takoBotInfo.botName;
        String str5 = takoBotInfo.botDescripton;
        if (str2 != null) {
            color = ColorProtector.parseColor(str2);
        } else {
            color = 0;
        }
        return new C435280H5a(str3, str4, str5, string, color, i3, z2, new AwS104S0400000_6(takoBotInfo, context, interfaceC665370Q7z, view, 12), new AwS110S1200000_27(interfaceC665370Q7z, str, takoBotInfo, 19), new AwS585S0100000_6(interfaceC665370Q7z, 429));
    }
}
