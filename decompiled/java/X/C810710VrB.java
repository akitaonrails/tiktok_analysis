package X;

import android.app.Activity;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.api.DetailApiProxyImpl;
import com.ss.android.ugc.aweme.editpost.EditPostPushBody;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.IProfileService;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810710VrB implements InterfaceC486470J5x, C0XEZ {
    public static boolean LLILLJJLI;
    public static C11JF LLILLL;
    public static final C810710VrB LL = new C810710VrB();
    public static final C01GW LLILZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(398));
    public static final C01GW LLILZIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(545));

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        if (!((IAccountService) LLILZ.getValue()).LJIIJ().isLogin() || wsChannelMsg.LIZ() == null) {
            return;
        }
        final String str = new String(wsChannelMsg.LIZ(), Charsets.UTF_8);
        C11JF c11jf = LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LLILLL = (C11JF) C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0m72
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Aweme> c09aj) {
                C1C7U.LIZ("FrontierReeditPushImpl@e24b.updateAwemeByEditResult$1");
                try {
                    EditPostPushBody editPostPushBody = (EditPostPushBody) C08JS.LIZ(str, EditPostPushBody.class);
                    if (editPostPushBody.pushScene == EnumC0341009z.SUCCESS.getValue()) {
                        try {
                            Aweme awemeLIZ = DetailApiProxyImpl.LIZIZ().LIZ(editPostPushBody.awemeId);
                            ((IAwemeService) C1443290nf5.LIZ.getValue()).LLILLL(awemeLIZ);
                            c09aj.onNext(awemeLIZ);
                            c09aj.onComplete();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            c09aj.onComplete();
                        }
                    } else {
                        C1443290nf5.LIZJ(editPostPushBody.awemeId, editPostPushBody.editPostPermission);
                        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("This video fail to pass moderation: aid : ");
                        sbLIZ.append(editPostPushBody.awemeId);
                        c2276411E8h.LJII("common_feed", "FrontierReeditPushImpl", C2188811AlT.LIZIZ(sbLIZ));
                        c09aj.onComplete();
                    }
                    C1C7U.LIZIZ("FrontierReeditPushImpl@e24b.updateAwemeByEditResult$1");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c09aj.onComplete();
                    C1C7U.LIZIZ("FrontierReeditPushImpl@e24b.updateAwemeByEditResult$1");
                }
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0T4H
            @Override // X.C09JN
            public final void accept(Object obj) {
                C19EG c19eg;
                C1C7U.LIZ("FrontierReeditPushImpl@e24b.updateAwemeByEditResult$2");
                Aweme aweme = (Aweme) obj;
                C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("This video pass moderation:avid: ");
                sbLIZ.append(aweme.getAid());
                c2276411E8h.LJII("common_feed", "FrontierReeditPushImpl", C2188811AlT.LIZIZ(sbLIZ));
                Activity activityLJFF = C2214201BlK.LJFF();
                if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
                    IProfileService iProfileService = (IProfileService) C810710VrB.LLILZIL.getValue();
                    String aid = aweme.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    iProfileService.updateCoverIfMyProfileVisible(c19eg, aid, aweme);
                }
                C1C7U.LIZIZ("FrontierReeditPushImpl@e24b.updateAwemeByEditResult$2");
            }
        });
    }
}
