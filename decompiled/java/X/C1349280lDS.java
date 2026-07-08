package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lDS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349280lDS {
    public static final C1349280lDS LIZ = new C1349280lDS();

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static final boolean LJIIJJI() {
        /*
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.comment.services.CommentService> r0 = com.ss.android.ugc.aweme.comment.services.CommentService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = (com.ss.android.ugc.aweme.comment.services.CommentService) r0
            boolean r0 = r0.LIZJ()
            r1 = 1
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.setting.services.ISettingService> r0 = com.ss.android.ugc.aweme.setting.services.ISettingService.class
            java.lang.Object r0 = r2.getService(r0)
            com.ss.android.ugc.aweme.setting.services.ISettingService r0 = (com.ss.android.ugc.aweme.setting.services.ISettingService) r0
            java.lang.String r2 = r0.getAppLanguage()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r2.toLowerCase(r0)
            int r2 = r3.hashCode()
            r0 = 3148(0xc4c, float:4.411E-42)
            if (r2 == r0) goto L6e
            r0 = 3184(0xc70, float:4.462E-42)
            if (r2 == r0) goto L65
            r0 = 3241(0xca9, float:4.542E-42)
            if (r2 == r0) goto L5c
            r0 = 3428(0xd64, float:4.804E-42)
            if (r2 == r0) goto L53
            switch(r2) {
                case -371515459: goto L41;
                case -371515458: goto L4a;
                default: goto L40;
            }
        L40:
            return r1
        L41:
            java.lang.String r0 = "zh-hans"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L76
            return r1
        L4a:
            java.lang.String r0 = "zh-hant"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L76
            return r1
        L53:
            java.lang.String r0 = "ko"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L76
            return r1
        L5c:
            java.lang.String r0 = "en"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L76
            return r1
        L65:
            java.lang.String r0 = "cs"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L76
            return r1
        L6e:
            java.lang.String r0 = "bn"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L40
        L76:
            X.01GW r0 = X.C276130Arz.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r1) goto L40
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1349280lDS.LJIIJJI():boolean");
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (aweme == null || aweme.getCommentConfig() == null || AwemeExtKt.isProhibited(aweme) || C1348690lCV.LIZJ(aweme) || !C1348690lCV.LIZ(aweme)) {
            return false;
        }
        return true;
    }

    public static final EnumC733380Spk LJ(Aweme aweme) {
        if (C0OAD.LIZIZ(aweme)) {
            return EnumC733380Spk.FTC;
        }
        if (aweme != null) {
            if (!aweme.isCanPlay()) {
                return EnumC733380Spk.UNAVAILABLE;
            }
            if (AwemeExtKt.isDelete(aweme)) {
                return EnumC733380Spk.DELETED;
            }
        }
        C735280Sso.LIZ.getClass();
        if (C735280Sso.LJFF(aweme) && !C729980SkG.LJIIIIZZ(aweme)) {
            return EnumC733380Spk.PRIVATE;
        }
        if (!C729980SkG.LJIIIIZZ(aweme) && C735280Sso.LIZJ(aweme) && !C735280Sso.LIZLLL(aweme)) {
            return EnumC733380Spk.THIRD_PARTY;
        }
        if (aweme != null) {
            if (aweme.getVideoControl() != null && aweme.getVideoControl().timerStatus == 0) {
                return EnumC733380Spk.UNPUBLISHED;
            }
            if (aweme != null) {
                if (C1017070cZd.LJLJLLL(aweme)) {
                    return EnumC733380Spk.ADVERTISEMENT;
                }
                if (AwemeExtKt.isProhibited(aweme)) {
                    return EnumC733380Spk.FORBIDDEN;
                }
                AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
                if ((statusSafety != null && statusSafety.isAllowComment()) || C1017070cZd.LJJLIL(aweme)) {
                    return EnumC733380Spk.ALLOW_COMMENT;
                }
                if (C1017070cZd.LJJLIL(aweme)) {
                    return EnumC733380Spk.DEFAULT;
                }
            }
        }
        return EnumC733380Spk.NOT_ADX_AD;
    }

    public static final int LJIIIZ(User user) {
        int i;
        if (!PersonalizedEmojiExperiment.LIZ() && !C1868390yij.LIZ(user)) {
            i = 100;
        } else {
            i = 52;
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
    }

    public static final void LIZ(C0R52 c0r52, int i) {
        C1360890lWB c1360890lWB;
        if (c0r52 != null && (c1360890lWB = c0r52.LIZ.LLILLJJLI) != null) {
            c1360890lWB.LJII = Integer.valueOf(i);
        }
    }

    public static final int LIZJ(String str, List<? extends TextExtraStruct> list) {
        int i;
        if (list != null && !list.isEmpty() && C123100dR.LIZ(str)) {
            Iterator<? extends TextExtraStruct> it2 = list.iterator();
            i = 1;
            while (it2.hasNext()) {
                if (str.charAt(it2.next().getStart()) != '@') {
                    i = 0;
                }
            }
        } else {
            i = -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkExtraStructValid content: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        return i;
    }

    public static final SpannableStringBuilder LIZLLL(int i, Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getString(2131829134));
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String string = context.getString(2131858245);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
        C786410Ut5.q2(spannableStringBuilder, new C1265760j2k(context, 0), strLIZIZ.length(), spannableStringBuilder.length(), 18);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(i, context)), strLIZIZ.length(), spannableStringBuilder.length(), 18);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), strLIZIZ.length(), spannableStringBuilder.length(), 18);
        return spannableStringBuilder;
    }

    public static final String LJII(Aweme aweme, String str) {
        AwemeCommentConfig commentConfig;
        String str2;
        LIZ.getClass();
        if (LIZIZ(aweme) && aweme != null && (commentConfig = aweme.getCommentConfig()) != null && (str2 = commentConfig.emptyListText) != null && str2.length() != 0) {
            return str2;
        }
        return str;
    }

    public static final String LJIIIIZZ(Aweme aweme, String str) {
        String str2;
        AwemeStatistics statistics;
        LIZ.getClass();
        if (LIZIZ(aweme) && aweme != null) {
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null && statistics2.getCommentCount() == 0) {
                AwemeCommentConfig commentConfig = aweme.getCommentConfig();
                if (commentConfig != null) {
                    str2 = commentConfig.zeroInputBoxText;
                    if (str2 != null) {
                        if (aweme != null) {
                            C20684815ws.onEventV3("show_comment_guide_inputbox");
                        }
                        return str2;
                    }
                }
            } else {
                AwemeCommentConfig commentConfig2 = aweme.getCommentConfig();
                if (commentConfig2 != null) {
                    str2 = commentConfig2.nonZeroInputBoxText;
                    if (str2 != null && str2.length() != 0) {
                        if (aweme != null && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() == 0) {
                            C20684815ws.onEventV3("show_comment_guide_inputbox");
                        }
                        return str2;
                    }
                }
            }
        }
        return str;
    }

    public static final CharSequence LJFF(Context context, Aweme aweme, C1349800lEI c1349800lEI) {
        String string;
        Story story;
        if (c1349800lEI.isNoPermissionVideo()) {
            return context.getResources().getString(2131829188);
        }
        if (c1349800lEI.isCommentClose()) {
            if (C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
                string = context.getString(2131829191);
            } else if (C729510SjV.LJJIJIL(aweme) && (story = aweme.getStory()) != null && StoryKt.isStoryV2(story)) {
                string = context.getString(2131830722);
            } else {
                string = context.getString(2131829236);
            }
            return LJII(aweme, string);
        }
        CommentService.LIZ.getClass();
        boolean z = !C523420Kfs.LIZ().LJJIJIIJIL(aweme);
        if (!c1349800lEI.isStoryImmersiveFeed() && !c1349800lEI.isFriendsSimpleDetail()) {
            if (z) {
                return context.getResources().getString(2131829188);
            }
        } else if (z || C1344730l67.LIZ(aweme)) {
            if (C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
                return context.getString(2131829191);
            }
            return context.getString(2131829236);
        }
        if (C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
            return context.getResources().getString(2131829188);
        }
        if (AwemeExtKt.isPhotoMode(aweme)) {
            return context.getString(2131829172);
        }
        return context.getResources().getString(2131829185);
    }

    public static final C1722300uv6 LJI(Context context, Aweme aweme, String str) {
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n4;
        Drawable drawableLIZ = c0hti.LIZ(context);
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJIIIIZZ = str;
        c1722300uv6.LJIIIZ = new AwS387S0200000_21(context, aweme, 55);
        return c1722300uv6;
    }

    public static final String LJIIJ(String str, String str2, String str3) {
        boolean z;
        if (!Intrinsics.LJFF(str3, "homepage_friends") && !Intrinsics.LJFF(str3, "repost_feed")) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMainNameInComment isSocial->");
        sbLIZ.append(z);
        sbLIZ.append(" regionDiff->");
        sbLIZ.append(true);
        sbLIZ.append(" eventType->");
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str3 != null) {
            str3.length();
        }
        C1243240iSQ.LIZ.getClass();
        return C1243240iSQ.LIZLLL(str, str2);
    }
}
