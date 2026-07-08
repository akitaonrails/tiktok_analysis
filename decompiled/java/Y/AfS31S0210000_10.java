package Y;

import X.C09JN;
import X.C0Q2G;
import X.C0QCO;
import X.C1389890mGx;
import X.C1C7U;
import android.widget.LinearLayout;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SubscribeLiveStruct;
import webcast.api.room.NextLiveNoticeRegisterData;
import webcast.api.room.NextLiveNoticeRegisterResponse;

/* JADX INFO: loaded from: classes11.dex */
public class AfS31S0210000_10 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS31S0210000_10 afS31S0210000_10, Object obj) {
        C1C7U.LIZ("SingleSparkView@c837.loadDynamicView$2");
        TemplateData templateData = (TemplateData) obj;
        C0QCO c0qco = (C0QCO) afS31S0210000_10.l0;
        DynamicPatch dynamicPatch = (DynamicPatch) afS31S0210000_10.l1;
        c0qco.LJIIJJI = dynamicPatch;
        c0qco.LJIILLIIL.LIZ(dynamicPatch);
        if (afS31S0210000_10.z2) {
            ((C0QCO) afS31S0210000_10.l0).LJIILIIL((DynamicPatch) afS31S0210000_10.l1, templateData);
        } else {
            ((C0QCO) afS31S0210000_10.l0).LJIIL((DynamicPatch) afS31S0210000_10.l1, templateData);
        }
        C1C7U.LIZIZ("SingleSparkView@c837.loadDynamicView$2");
    }

    public static final void accept$1(AfS31S0210000_10 afS31S0210000_10, Object obj) {
        int i;
        C1C7U.LIZ("SearchUserLiveEventView@d6e.notifyNextLive$1");
        NextLiveNoticeRegisterData nextLiveNoticeRegisterData = ((NextLiveNoticeRegisterResponse) obj).data;
        int i2 = 1;
        if (nextLiveNoticeRegisterData != null && nextLiveNoticeRegisterData.result) {
            SubscribeLiveStruct subscribeLiveStruct = (SubscribeLiveStruct) afS31S0210000_10.l0;
            if (afS31S0210000_10.z2) {
                i2 = 2;
            }
            subscribeLiveStruct.setHasSubscribedNextLive(i2);
            ((C0Q2G) afS31S0210000_10.l1).LJII((SubscribeLiveStruct) afS31S0210000_10.l0, false);
            if (afS31S0210000_10.z2) {
                i = 2131854997;
            } else {
                i = 2131854995;
            }
            LinearLayout linearLayout = ((C0Q2G) afS31S0210000_10.l1).LLILLJJLI;
            if (linearLayout != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(linearLayout);
                c1389890mGx.LJIIIZ(i);
                c1389890mGx.LJIIJJI();
            }
        } else {
            LinearLayout linearLayout2 = ((C0Q2G) afS31S0210000_10.l1).LLILLJJLI;
            if (linearLayout2 != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(linearLayout2);
                c1389890mGx2.LJIIIZ(2131854993);
                c1389890mGx2.LJIIJJI();
            }
        }
        ((C0Q2G) afS31S0210000_10.l1).LLILZLL = false;
        C1C7U.LIZIZ("SearchUserLiveEventView@d6e.notifyNextLive$1");
    }

    public AfS31S0210000_10(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
