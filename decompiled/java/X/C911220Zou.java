package X;

import com.ss.android.ugc.aweme.exp.safety.DMCameraSafetyExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.im.AIGroupShotMediaModel;
import com.ss.android.ugc.aweme.feed.model.im.AIGroupShotMentionInfoModel;
import com.ss.android.ugc.aweme.feed.model.im.AIGroupShotResultModel;
import com.ss.android.ugc.aweme.feed.model.im.IMMediaModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotMentionInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotResultComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotTemplateInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotUserInfoComponent;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Zou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911220Zou {
    public static final ResolutionComponent LIZIZ(VideoCoverComponent videoCoverComponent) {
        ResolutionComponent resolutionComponent = videoCoverComponent.resolutionComponent;
        if (resolutionComponent != null && resolutionComponent.width > 0 && resolutionComponent.height > 0) {
            return resolutionComponent;
        }
        return null;
    }

    public static final Aweme LIZJ(C869590Y9l c869590Y9l) {
        boolean z;
        int i;
        int i2;
        AIGroupShotCardTemplate aIGroupShotCardTemplate = (AIGroupShotCardTemplate) C0Z2Z.LIZ(c869590Y9l, AIGroupShotCardTemplate.class);
        String nickName = null;
        if (aIGroupShotCardTemplate == null || aIGroupShotCardTemplate.status != EnumC2241471CoD.FINISH || aIGroupShotCardTemplate.results.isEmpty()) {
            return null;
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(c869590Y9l.getSender()), c869590Y9l.getSecSender(), "im_local_db");
        User user = new User();
        if (iMUserLJIIL != null) {
            nickName = iMUserLJIIL.getNickName();
        }
        if (nickName == null) {
            nickName = "";
        }
        user.setNickname(nickName);
        user.setUid(String.valueOf(c869590Y9l.getSender()));
        user.setSecUid(c869590Y9l.getSecSender());
        Aweme aweme = new Aweme();
        aweme.setAuthor(user);
        AIGroupShotTemplateInfoComponent aIGroupShotTemplateInfoComponent = aIGroupShotCardTemplate.templateInfo;
        String str = aIGroupShotTemplateInfoComponent.templateId;
        String str2 = aIGroupShotTemplateInfoComponent.templateResId;
        Iterator<AIGroupShotUserInfoComponent> it2 = aIGroupShotCardTemplate.userInfo.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            AIGroupShotUserInfoComponent next = it2.next();
            if (((C1400340mXo) C0I0B.LJFF.LIZ()).LIZJ(String.valueOf(next.userId))) {
                if (next == null) {
                    break;
                }
            }
        }
        z = false;
        List<AIGroupShotResultComponent> list = aIGroupShotCardTemplate.results;
        int i3 = 10;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (AIGroupShotResultComponent aIGroupShotResultComponent : list) {
            ResolutionComponent resolutionComponent = aIGroupShotResultComponent.image.resolution;
            if (resolutionComponent != null) {
                i = resolutionComponent.width;
            } else {
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            ResolutionComponent resolutionComponent2 = aIGroupShotResultComponent.image.resolution;
            if (resolutionComponent2 != null) {
                i2 = resolutionComponent2.height;
            } else {
                i2 = 0;
            }
            Pair pair = new Pair(numValueOf, Integer.valueOf(i2));
            List<String> listLIZ = C2244081CsQ.LIZ(aIGroupShotResultComponent.image);
            ImageComponent imageComponent = aIGroupShotResultComponent.image;
            String str3 = imageComponent.id;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = imageComponent.decryptKey;
            if (str4 == null) {
                str4 = "";
            }
            List<AIGroupShotMentionInfoComponent> list2 = aIGroupShotResultComponent.mentionInfo;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, i3));
            for (AIGroupShotMentionInfoComponent aIGroupShotMentionInfoComponent : list2) {
                arrayList2.add(new AIGroupShotMentionInfoModel(aIGroupShotMentionInfoComponent.userId, aIGroupShotMentionInfoComponent.nickname, new Pair(Double.valueOf(aIGroupShotMentionInfoComponent.coordinate.x), Double.valueOf(aIGroupShotMentionInfoComponent.coordinate.y)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
            }
            arrayList.add(new AIGroupShotResultModel(pair, listLIZ, str3, str4, arrayList2));
            i3 = 10;
        }
        AwemeBizExtKt.setImMediaModel(aweme, new IMMediaModel(new AIGroupShotMediaModel(str, str2, arrayList, z, 0)));
        aweme.setAwemeType(504);
        aweme.setAid(String.valueOf(c869590Y9l.getMsgId()));
        AwemeBizExtKt.setImMsgId(aweme, String.valueOf(c869590Y9l.getMsgId()));
        return aweme;
    }

    public static final C0R6I LIZ(C869590Y9l c869590Y9l, boolean z) {
        boolean z2;
        boolean z3;
        C0R6I c0r6i = null;
        if (!C896400ZEo.LJFF(c869590Y9l)) {
            return null;
        }
        if (c869590Y9l.getCreatedAt() > DMCameraSafetyExperiment.LIZJ && !C0ZDX.LJJJJIZL(c869590Y9l) && (C0ZDX.LJJIJ(c869590Y9l) || z)) {
            z2 = true;
        } else {
            z2 = false;
            if (C896060ZDg.LIZLLL(c869590Y9l)) {
            }
            return c0r6i;
        }
        String uuid = c869590Y9l.getUuid();
        String strValueOf = String.valueOf(c869590Y9l.getMsgId());
        boolean zLIZLLL = C896060ZDg.LIZLLL(c869590Y9l);
        boolean zLIZJ = C0Z5J.LIZJ(c869590Y9l);
        if (C0Z5J.LIZJ(c869590Y9l) && C896060ZDg.LIZJ(c869590Y9l)) {
            z3 = true;
        } else {
            z3 = false;
        }
        c0r6i = new C0R6I(uuid, strValueOf, true, z2, zLIZLLL, zLIZJ, z3, C0ZDX.LJJIJ(c869590Y9l));
        return c0r6i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[PHI: r2
      0x0040: PHI (r2v7 java.lang.Iterable) = (r2v1 java.lang.Iterable), (r2v8 java.lang.Iterable) binds: [B:14:0x003e, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[PHI: r2
      0x004a: PHI (r2v2 java.lang.Iterable) = (r2v1 java.lang.Iterable), (r2v7 java.lang.Iterable), (r2v7 java.lang.Iterable) binds: [B:14:0x003e, B:16:0x0042, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.feed.model.Aweme LIZLLL(X.C869590Y9l r8, java.lang.Boolean r9) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C911220Zou.LIZLLL(X.0Y9l, java.lang.Boolean):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014e A[PHI: r0
      0x014e: PHI (r0v19 int) = (r0v17 int), (r0v32 int) binds: [B:64:0x0149, B:51:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.feed.model.Aweme LJ(X.C869590Y9l r27, java.lang.Boolean r28) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C911220Zou.LJ(X.0Y9l, java.lang.Boolean):com.ss.android.ugc.aweme.feed.model.Aweme");
    }
}
