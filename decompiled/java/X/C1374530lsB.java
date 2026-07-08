package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.channel.QrCodeChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS117S0400000_21;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0lsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374530lsB {
    public static final C1374530lsB LIZ = new C1374530lsB();

    public static String LIZIZ(Aweme aweme) {
        StoryHighlightInfo storyHighlightInfo = aweme.storyHighlightInfo;
        if (storyHighlightInfo != null && (storyHighlightInfo.sharedFromProfile || storyHighlightInfo.sharedFromHighlightImmersiveFeed)) {
            return "story_highlight";
        }
        if (aweme.getAwemeType() != 150 && !C710930Rud.LJII(aweme)) {
            return "aweme";
        }
        return "aweme_photo";
    }

    public static C1377070lwH LIZLLL(final Activity activity) {
        return new C1377070lwH(new InterfaceC1378050lxr() { // from class: X.0lsJ
            @Override // X.InterfaceC1378050lxr
            public final Activity get() {
                return activity;
            }
        }, AFwS259S0000000_21.get$arr$(219));
    }

    public static boolean LJI(Aweme aweme) {
        StoryHighlightInfo storyHighlightInfo;
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare == null || awemeACLShare.getShareListStatus() != 0 || C10EU.LJIIIIZZ() || AwemeExtKt.isScheduleVideo(aweme) || ((storyHighlightInfo = aweme.storyHighlightInfo) != null && storyHighlightInfo.sharedFromHighlightImmersiveFeed)) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(Aweme aweme, InterfaceC1369790lkX interfaceC1369790lkX) {
        if (!interfaceC1369790lkX.LJJIII() || !C1373450lqR.LJFF(aweme, interfaceC1369790lkX, false) || (interfaceC1369790lkX instanceof QrCodeChannel)) {
            return false;
        }
        return true;
    }

    public static void LJ(Aweme aweme, C19EG c19eg, Function1 function1) throws Throwable {
        String strLIZJ;
        if (aweme == null) {
            return;
        }
        if (!C349180DmW.LIZIZ.isEmpty()) {
            strLIZJ = (String) ListProtector.get(C349180DmW.LIZIZ, 0);
        } else {
            strLIZJ = C733420Spo.LIZJ();
        }
        if (u.LJIJI("more", strLIZJ, true)) {
            strLIZJ = "";
        }
        if (u.LJIJI("copy", strLIZJ, true)) {
            function1.invoke(new CopyLinkChannel(false));
            return;
        }
        C1377070lwH c1377070lwHLIZLLL = LIZLLL(c19eg);
        C1373610lqh c1373610lqhLJFF = LJFF(aweme, strLIZJ, c1377070lwHLIZLLL, null);
        if (c1373610lqhLJFF != null && c1373610lqhLJFF.LJIIZILJ(c19eg) && !c1373610lqhLJFF.LIZJ()) {
            function1.invoke(c1373610lqhLJFF);
        } else {
            C1374860lsi.LIZJ().LIZLLL(new AwS117S0400000_21(function1, aweme, c1377070lwHLIZLLL, c19eg, 14));
        }
    }

    public static List LIZJ(Aweme aweme, C1377070lwH c1377070lwH, ArrayList arrayList, Function1 function1) {
        ArrayList arrayListLJ = C1697810uHb.LJ("copy", "snapchat", "instagram", "instagram_story", "facebook", "facebook_lite", "facebook_group", "messenger", "messenger_lite", "sms", "google_messages", "twitter", "viber", "vk", "whatsapp", "whatsapp_status", "line", "band", "email", "kakao_story", "kakaotalk", "zalo", "telegram", "discord", "pinterest", "more");
        if (((Boolean) C262390AQb.LIZ.getValue()).booleanValue() && aweme.getAwemeType() != 150) {
            arrayListLJ.add("youtube");
        }
        arrayListLJ.add("whatsapp_business");
        List list = (List) C1374750lsX.LIZJ.getValue();
        if (list != null && !list.isEmpty()) {
            arrayListLJ.addAll(list);
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayListLJ) {
            if (!arrayList.contains(obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList2) {
            LIZ.getClass();
            C1373610lqh c1373610lqhLJFF = LJFF(aweme, str, c1377070lwH, function1);
            if (c1373610lqhLJFF != null) {
                arrayList3.add(c1373610lqhLJFF);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1373610lqh LJFF(com.ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5, X.C1377070lwH r6, final kotlin.jvm.functions.Function1 r7) {
        /*
            X.0lqa r0 = X.C1373850lr5.LIZ
            r0.getClass()
            boolean r0 = X.C1373540lqa.LJIIJJI(r5)
            r1 = 0
            if (r0 == 0) goto L12
            boolean r0 = X.C1373540lqa.LJIIIIZZ(r5)
            if (r0 == 0) goto L59
        L12:
            r0 = 6
            X.0lkX r3 = X.C1374810lsd.LIZ(r5, r1, r1, r0)
            boolean r0 = r3 instanceof X.C1376080lug
            if (r0 == 0) goto L48
            X.0lug r3 = (X.C1376080lug) r3
            r3.getClass()
            X.0ll3 r0 = X.C1370370llT.LIZ
            if (r0 == 0) goto L57
            android.app.Activity r2 = r0.getCurrentActivity()
            if (r2 == 0) goto L57
            java.lang.String r0 = "video/*"
            android.content.Intent r0 = r3.LJJJJJL(r2, r0)
        L30:
            r3.LLILLL = r0
            if (r0 == 0) goto L48
            X.0ll3 r0 = X.C1370370llT.LIZ
            if (r0 == 0) goto L55
            android.app.Activity r2 = r0.getCurrentActivity()
            if (r2 == 0) goto L55
            java.lang.String r0 = "text/plain"
            android.content.Intent r0 = r3.LJJJJJL(r2, r0)
        L44:
            r3.LLILLJJLI = r0
            if (r0 == 0) goto L59
        L48:
            com.ss.android.ugc.aweme.feed.model.ACLCommonShare r3 = X.C1373540lqa.LJI(r4)
        L4c:
            if (r3 == 0) goto L5e
            int r0 = r3.getShowType()
            if (r0 != 0) goto L5e
            return r1
        L55:
            r0 = r1
            goto L44
        L57:
            r0 = r1
            goto L30
        L59:
            com.ss.android.ugc.aweme.feed.model.ACLCommonShare r3 = X.C1373540lqa.LJII(r4, r5)
            goto L4c
        L5e:
            java.lang.String r2 = "copy"
            boolean r0 = android.text.TextUtils.equals(r5, r2)
            if (r0 == 0) goto L84
            X.06VD r0 = X.C06VD.LIZ
            r0.getClass()
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel> r0 = X.C06VD.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r2 = r0.get(r2)
            com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel r2 = (com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel) r2
        L75:
            if (r2 == 0) goto L83
            if (r7 == 0) goto L8e
            X.0lsB r0 = X.C1374530lsB.LIZ
            r0.getClass()
            X.0lqo r1 = new X.0lqo
            r1.<init>(r2, r3, r7)
        L83:
            return r1
        L84:
            X.0lsc r0 = X.C1374800lsc.LIZ
            r0.getClass()
            X.0lkX r2 = X.C1374800lsc.LIZIZ(r5, r6)
            goto L75
        L8e:
            X.0lsB r0 = X.C1374530lsB.LIZ
            r0.getClass()
            X.0lqh r1 = new X.0lqh
            r1.<init>(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1374530lsB.LJFF(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.0lwH, kotlin.jvm.functions.Function1):X.0lqh");
    }
}
