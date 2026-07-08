package X;

import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsCommonFreqCtrlCheck;
import com.ss.android.ugc.aweme.unifiedauthapi.model.CustomizedFrequencyControl;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10Cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19208310Cr {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(9));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(22));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(21));

    public static void LJ(List list) {
        if (ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled() && !ChannelsCommonFreqCtrlCheck.INSTANCE.disable()) {
            CustomizedFrequencyControl customizedFrequencyControl = new CustomizedFrequencyControl("customized_frequency_control", 0, 0, 0);
            customizedFrequencyControl.setName("channel_common");
            customizedFrequencyControl.setShowUpInterval(2);
            customizedFrequencyControl.setExitingLimit(3);
            customizedFrequencyControl.setShowUpIntervalAfterExiting(2);
            ((ArrayList) list).add(customizedFrequencyControl);
        }
    }

    public static String LJFF(int i) {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getResources().getString(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0272, code lost:
    
        if (r1.equals("friends_tab_edm") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x027b, code lost:
    
        if (r1.equals("repost_finish_edm_subscribe") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0284, code lost:
    
        if (r1.equals("inbox_tab_edm_subscribe") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x028b, code lost:
    
        if (r1.equals("repost_finish_edm") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0292, code lost:
    
        if (r1.equals("follow_finish_edm_subscribe") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0299, code lost:
    
        if (r1.equals("share_im_finish_edm") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02a0, code lost:
    
        if (r1.equals("favorite_edm") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02a9, code lost:
    
        if (r1.equals("comment_finish_edm_subscribe") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02b1, code lost:
    
        if (r1.equals("share_im_finish_edm_subscribe") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02b9, code lost:
    
        if (r1.equals("like_finish_feed_edm") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02c1, code lost:
    
        if (r1.equals("comment_finish_edm") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02cb, code lost:
    
        if (r1.equals("feed_vv_enough_edm") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02d5, code lost:
    
        if (r1.equals("inbox_tab_edm") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02d9, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02e1, code lost:
    
        if (r1.equals("favorite_edm_subscribe") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02eb, code lost:
    
        if (r1.equals("like_finish_feed_edm_subscribe") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x030b, code lost:
    
        if (r1.equals("friends_tab_edm_subscribe") != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x030d, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f7  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r24, com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig r25) {
        /*
            Method dump skipped, instruction units count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19208310Cr.LIZ(java.lang.String, com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig):void");
    }

    public static UnifiedAuthPopupConfig LIZLLL(String str, List list) {
        return new UnifiedAuthPopupConfig("", "", 1, false, "", "", str, 0L, Boolean.FALSE, 0L, "", "", "", null, null, null, 0, list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010b, code lost:
    
        if (r1.equals("repost_finish_edm_subscribe") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0114, code lost:
    
        if (r1.equals("inbox_tab_edm_subscribe") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0126, code lost:
    
        if (r1.equals("follow_finish_edm_subscribe") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0141, code lost:
    
        if (r1.equals("comment_finish_edm_subscribe") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014a, code lost:
    
        if (r1.equals("share_im_finish_edm_subscribe") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017a, code lost:
    
        if (r1.equals("favorite_edm_subscribe") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0184, code lost:
    
        if (r1.equals("like_finish_feed_edm_subscribe") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a9, code lost:
    
        if (r1.equals("friends_tab_edm_subscribe") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ab, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig LIZIZ(java.lang.String r54, java.lang.String r55, java.lang.String r56) {
        /*
            Method dump skipped, instruction units count: 3460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19208310Cr.LIZIZ(java.lang.String, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig");
    }

    public static UnifiedAuthPopupConfig LIZJ(String str, String str2, String str3) {
        return new UnifiedAuthPopupConfig("", "", 1, false, "", "", str, 0L, Boolean.FALSE, 0L, "", "", "", null, null, null, 0, C1697810uHb.LJIILJJIL(LIZIZ(str, str2, str3)));
    }
}
