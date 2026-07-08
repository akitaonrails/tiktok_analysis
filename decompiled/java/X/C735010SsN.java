package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0SsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735010SsN {
    public final Aweme LIZ;
    public final String LIZIZ;

    public final void LIZ() {
        String str;
        String str2;
        String string;
        AwemeRawAd awemeRawAd;
        C1440005kM.LIZ(new C1210880hcE(this.LIZIZ, "FUNCTION_FROM_NOT_INTERESTED", "not_interested", this.LIZ));
        C1360540lVc c1360540lVc = C1360540lVc.LIZIZ;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJIJI(this.LIZ);
        c1260910iuv.LJJIJLIJ(this.LIZIZ);
        c1260910iuv.LJJIL("small_card");
        c1260910iuv.LJJLIIIJJI = EnumC1260930iux.DISLIKE;
        c1260910iuv.LJJJJZI(this.LIZ.getAuthor());
        User author = this.LIZ.getAuthor();
        c1260910iuv.LJJJJLI(author != null ? author.getRequestId() : null);
        c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.ITEM;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJIL("small_card");
        Object objLJIIIZ = c19651011uW.LJIIIZ(this.LIZ, c1260910iuv);
        Aweme aweme = this.LIZ;
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        ((AbstractC1386130mAt) c1360540lVc.LIZ(this.LIZ, objLJIIIZ)).LJIILJJIL();
        C735390Ssz c735390Ssz = new C735390Ssz();
        c735390Ssz.LJIJI(this.LIZ);
        c735390Ssz.LIZLLL = this.LIZIZ;
        c735390Ssz.LJJLIIIJJIZ = "small_card";
        c735390Ssz.LJJLIIIJJI = C735370Ssx.LIZLLL(this.LIZ);
        c735390Ssz.LJJLIIIJILLIZJL = C735370Ssx.LIZJ(this.LIZ);
        c735390Ssz.LJJLIIJ = C735370Ssx.LJFF(this.LIZ);
        c735390Ssz.LJJZ = C735370Ssx.LJIIJ(this.LIZ);
        c735390Ssz.LJL = ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJI(C2214201BlK.LJFF(), this.LIZ);
        c735390Ssz.LJJLIIIJLJLI = C735370Ssx.LJIJJ(this.LIZ);
        Object objLJIIIZ2 = c19651011uW.LJIIIZ(this.LIZ, c735390Ssz);
        C735840Sti.LIZIZ(this.LIZ, objLJIIIZ2);
        AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) objLJIIIZ2;
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            for (Map.Entry<String, String> entry : TakoAIVideoMobFiller.toParams(C0SUC.LIZ(activityLJFF)).entrySet()) {
                abstractC1386130mAt.LJ(entry.getKey(), entry.getValue());
            }
        }
        abstractC1386130mAt.LJIILJJIL();
        if (C1017070cZd.LLLIILIL(this.LIZ)) {
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZIZ(2131830712);
            c1233040iBy.LIZLLL();
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "not_interested", this.LIZ.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("button", "refer");
            c1022820ciuLIZLLL.LJII();
            return;
        }
        C844470XAv.LIZ.getClass();
        C1233040iBy c1233040iBy2 = new C1233040iBy(C844470XAv.LIZ());
        c1233040iBy2.LIZIZ(2131846525);
        c1233040iBy2.LIZLLL();
        InterfaceC324620Co0 interfaceC324620Co0 = (InterfaceC324620Co0) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC324620Co0.class);
        String aid = this.LIZ.getAid();
        String requestId = this.LIZ.getRequestId();
        HashMap map = new HashMap();
        map.put("author_id", AwemeExtKt.getAuthorUid(this.LIZ));
        map.put("channel_id", String.valueOf(C737370SwB.LIZ(this.LIZIZ)));
        Aweme aweme2 = this.LIZ;
        Aweme aweme3 = AwemeExtKt.isAdTraffic(aweme2) ? aweme2 : null;
        str = "";
        if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null) {
            str2 = "";
            string = "";
        } else {
            String string2 = awemeRawAd.getAdId().toString();
            string = awemeRawAd.getCreativeId().toString();
            String logExtra = awemeRawAd.getLogExtra();
            str2 = logExtra != null ? logExtra : "";
            str = string2;
        }
        if (!TextUtils.isEmpty(str)) {
            map.put("ad_id", str);
        }
        if (!TextUtils.isEmpty(string)) {
            map.put("creative_id", string);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("log_extra", str2);
        }
        interfaceC324620Co0.LIZ(aid, requestId, map).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.07zD
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FYPNotInterestedAction@3550.execute$disposable$1");
                C1C7U.LIZIZ("FYPNotInterestedAction@3550.execute$disposable$1");
            }
        }, new C09JN() { // from class: X.07zC
            @Override // X.C09JN
            public final void accept(Object obj) {
                String message;
                C1C7U.LIZ("FYPNotInterestedAction@3550.execute$disposable$2");
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dislike error: ");
                if (th == null || (message = th.getMessage()) == null) {
                    message = "unknown";
                }
                sbLIZ.append(message);
                C2188811AlT.LIZIZ(sbLIZ);
                C1C7U.LIZIZ("FYPNotInterestedAction@3550.execute$disposable$2");
            }
        });
    }

    public C735010SsN(Aweme aweme, String str) {
        this.LIZ = aweme;
        this.LIZIZ = str;
    }
}
