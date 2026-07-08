package Y;

import X.C09JN;
import X.C1211540hdI;
import X.C1233440iCc;
import X.C1440005kM;
import X.C1558520qew;
import X.C1951907kj;
import X.C1C7U;
import X.C2188811AlT;
import X.C2276471E8n;
import X.C479910Irt;
import X.C786410Ut5;
import X.EnumC1251790igD;
import X.InterfaceC1209520ha2;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.feed.model.ShareUrlExtra;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.profile.business.avatar.OtherProfileAvatarAssem;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AfS45S1200000_19 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS45S1200000_19 afS45S1200000_19, Object obj) {
        String uid;
        C1C7U.LIZ("RecFeedShareComponentController@885d.requestShareInfo$1");
        ExposeSharerData exposeSharerData = (ExposeSharerData) obj;
        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get sharer: ");
        sbLIZ.append(exposeSharerData);
        c2276471E8n.d("@LinkRelation_OldLogic", C2188811AlT.LIZIZ(sbLIZ));
        if (exposeSharerData.status_code == 0) {
            ShareUrlExtra shareUrlExtra = exposeSharerData.shareExtra;
            if (shareUrlExtra == null) {
                String str = afS45S1200000_19.s0;
                C1233440iCc c1233440iCc = (C1233440iCc) afS45S1200000_19.l1;
                shareUrlExtra = new ShareUrlExtra(str, c1233440iCc.LIZLLL, c1233440iCc.LJ);
            }
            RecFeedShareComponentController recFeedShareComponentController = (RecFeedShareComponentController) afS45S1200000_19.l2;
            String str2 = shareUrlExtra.itemId;
            recFeedShareComponentController.LLILZLL = str2;
            recFeedShareComponentController.LLILLL = exposeSharerData;
            User user = exposeSharerData.sharer;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            C1951907kj.LIZ(str2, uid);
            RecFeedShareComponentController recFeedShareComponentController2 = (RecFeedShareComponentController) afS45S1200000_19.l2;
            InterfaceC1209520ha2 interfaceC1209520ha2 = recFeedShareComponentController2.LLIZ;
            if (interfaceC1209520ha2 != null && !recFeedShareComponentController2.LLILZIL && exposeSharerData.sharer != null) {
                interfaceC1209520ha2.LIZ();
            }
        }
        C1C7U.LIZIZ("RecFeedShareComponentController@885d.requestShareInfo$1");
    }

    public static final void accept$1(AfS45S1200000_19 afS45S1200000_19, Object obj) {
        C1C7U.LIZ("AwemeSnapchatShareHandler$Companion@b175.checkVideoSizeThenSnapchatShare$1");
        String str = (String) obj;
        try {
            ((Function2) afS45S1200000_19.l1).invoke(afS45S1200000_19.s0, str);
            C786410Ut5.LJJJI("share_url", str, ((SharePackage) afS45S1200000_19.l2).extras);
        } catch (C1211540hdI e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("AwemeSnapchatShareHandler$Companion@b175.checkVideoSizeThenSnapchatShare$1");
    }

    public static final void accept$2(AfS45S1200000_19 afS45S1200000_19, Object obj) {
        User user;
        long jLongValue;
        UserProfileAbility userProfileAbility;
        long j;
        Long l;
        C1C7U.LIZ("OtherProfileAvatarAssem@a27e.refreshLiveState$1");
        Map map = (Map) obj;
        if (map != null && (user = (User) afS45S1200000_19.l1) != null) {
            long j2 = user.roomId;
            long j3 = 0;
            try {
                String str = afS45S1200000_19.s0;
                if (str != null) {
                    j = CastLongProtector.parseLong(str);
                } else {
                    j = -1;
                }
                l = (Long) map.get(Long.valueOf(j));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            ((User) afS45S1200000_19.l1).roomId = jLongValue;
            if (j2 != jLongValue && (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL((OtherProfileAvatarAssem) afS45S1200000_19.l2), UserProfileAbility.class, null)) != null) {
                userProfileAbility.sA2((User) afS45S1200000_19.l1, EnumC1251790igD.NORMAL);
            }
            C479910Irt c479910Irt = new C479910Irt();
            try {
                j3 = CastLongProtector.parseLong(((User) afS45S1200000_19.l1).getUid());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            c479910Irt.LIZIZ = j3;
            c479910Irt.LIZ = ((User) afS45S1200000_19.l1).roomId;
            c479910Irt.LIZJ = !r2.isLive();
            C1440005kM.LIZ(c479910Irt);
        }
        C1C7U.LIZIZ("OtherProfileAvatarAssem@a27e.refreshLiveState$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$3(Y.AfS45S1200000_19 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS45S1200000_19.accept$3(Y.AfS45S1200000_19, java.lang.Object):void");
    }

    public AfS45S1200000_19(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
