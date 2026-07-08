package Y;

import X.C09JN;
import X.C19719612Di;
import X.C1C7U;
import X.C5178020a;
import X.C953230auf;
import X.C953760avW;
import X.C953770avX;
import X.InterfaceC952800aty;
import X.InterfaceC952920auA;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateUpdateResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import java.util.ArrayList;
import java.util.Iterator;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public class AfS2S1000100_15 implements C09JN {
    public final int $t;
    public long j1;
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS2S1000100_15 afS2S1000100_15, Object obj) {
        Long lValueOf;
        C1C7U.LIZ("TemplateManager@b4e9.uploadToCloudAndUpdateTemplate$2$3");
        BaseResponse baseResponse = (BaseResponse) obj;
        for (C953770avX c953770avX : C953760avW.LIZIZ.LIZ().LJI(afS2S1000100_15.s0)) {
            NoticeboardTemplate noticeboardTemplate = ((NoticeboardTemplateUpdateResponse.ResponseData) baseResponse.data).template;
            if (noticeboardTemplate != null) {
                lValueOf = Long.valueOf(noticeboardTemplate.noticeboardTemplateId);
            } else {
                lValueOf = null;
            }
            c953770avX.LJIIL = lValueOf;
        }
        Iterator it2 = ((ArrayList) C953760avW.LIZIZ.LIZ().LJII(afS2S1000100_15.j1)).iterator();
        while (it2.hasNext()) {
            ((C953770avX) it2.next()).LJIILJJIL = true;
        }
        C953760avW.LIZIZ.LIZ().LJIILJJIL();
        C1C7U.LIZIZ("TemplateManager@b4e9.uploadToCloudAndUpdateTemplate$2$3");
    }

    public static final void accept$1(AfS2S1000100_15 afS2S1000100_15, Object obj) {
        InterfaceC952920auA interfaceC952920auA;
        C1C7U.LIZ("TemplateManager@b4e9.deleteTemplate$4");
        C953230auf.LIZ.getClass();
        C19719612Di.LJJIIJ(C953230auf.LIZIZ, new C5178020a(afS2S1000100_15.j1, 1), true);
        InterfaceC952800aty interfaceC952800aty = C953230auf.LJI.get(afS2S1000100_15.s0);
        if ((interfaceC952800aty instanceof InterfaceC952920auA) && (interfaceC952920auA = (InterfaceC952920auA) interfaceC952800aty) != null) {
            interfaceC952920auA.LIZJ();
        }
        C1C7U.LIZIZ("TemplateManager@b4e9.deleteTemplate$4");
    }

    public AfS2S1000100_15(String str, long j, int i) {
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
