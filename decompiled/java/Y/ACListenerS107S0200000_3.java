package Y;

import X.C0DOO;
import X.C0PEM;
import X.C1896107bj;
import X.C1944607jY;
import X.C20684815ws;
import X.C2235408pM;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2423509eb;
import X.C2448909ih;
import X.C331430Cyz;
import X.C735010SsN;
import X.C816930W2x;
import X.C888280Yt0;
import X.EnumC2235608pO;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssemV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolPageAssem;

/* JADX INFO: loaded from: classes4.dex */
public class ACListenerS107S0200000_3 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS107S0200000_3 aCListenerS107S0200000_3, View view) {
        ((C1944607jY) aCListenerS107S0200000_3.l0).LIZ("process_id", ((CreatorToolsActivity) aCListenerS107S0200000_3.l1).LLIZLLLIL);
        SmartRouter.buildRoute((CreatorToolsActivity) aCListenerS107S0200000_3.l1, ((C1944607jY) aCListenerS107S0200000_3.l0).LIZIZ().toString()).open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", ((CreatorToolsActivity) aCListenerS107S0200000_3.l1).getEnterFrom());
        c2344009Gk.LJIIIIZZ("process_id", ((CreatorToolsActivity) aCListenerS107S0200000_3.l1).LLIZLLLIL);
        C20684815ws.LJIILLIIL("click_creator_fund", c2344009Gk.LIZ);
    }

    public static final void onClick$1(ACListenerS107S0200000_3 aCListenerS107S0200000_3, View view) {
        IMUserArchiveSettings iMUserArchiveSettings = ((C1896107bj) aCListenerS107S0200000_3.l0).LL;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2423509eb(iMUserArchiveSettings.copy(iMUserArchiveSettings.keepConversationsArchived, Boolean.TRUE), (C888280Yt0) aCListenerS107S0200000_3.l1, null), 3);
        ((C888280Yt0) aCListenerS107S0200000_3.l1).LLILLJJLI.invoke();
    }

    public static final void onClick$2(ACListenerS107S0200000_3 aCListenerS107S0200000_3, View view) {
        C0DOO c0doo = C0DOO.LIZ;
        EnumC2235608pO enumC2235608pO = EnumC2235608pO.CLICK_CONFIRM;
        int iHp = ((CorrectSchoolPageAssem) aCListenerS107S0200000_3.l0).hp();
        c0doo.getClass();
        C0DOO.LJIILIIL(enumC2235608pO, iHp);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((CorrectSchoolPageAssem) aCListenerS107S0200000_3.l0), null, null, new C2235408pM((CorrectSchoolPageAssem) aCListenerS107S0200000_3.l0, (C331430Cyz) aCListenerS107S0200000_3.l1, null), 3);
    }

    public static final void onClick$3(ACListenerS107S0200000_3 aCListenerS107S0200000_3, View view) {
        Aweme aweme;
        VideoRelationBtnAssemV2 videoRelationBtnAssemV2 = (VideoRelationBtnAssemV2) aCListenerS107S0200000_3.l0;
        VideoItemParams videoItemParams = (VideoItemParams) aCListenerS107S0200000_3.l1;
        if (videoRelationBtnAssemV2.LLJLLIL != null && (aweme = videoRelationBtnAssemV2.LLL) != null) {
            String str = videoItemParams.mEventType;
            if (str == null) {
                str = "homepage_hot";
            }
            new C735010SsN(aweme, str).LIZ();
            if (C816930W2x.LIZ()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2448909ih(videoItemParams, null), 3);
            }
        }
    }

    public ACListenerS107S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
