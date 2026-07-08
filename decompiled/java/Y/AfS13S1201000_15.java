package Y;

import X.C01HE;
import X.C09JN;
import X.C1143300frE;
import X.C1C7U;
import X.C2097608Jq;
import X.C919870a2r;
import X.C919990a33;
import X.C920000a34;
import X.C930480aJy;
import X.InterfaceC920110a3F;
import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.Pair;

/* JADX INFO: loaded from: classes16.dex */
public class AfS13S1201000_15 implements C09JN {
    public final int $t;
    public int i3;
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
        }
    }

    public static final void accept$0(AfS13S1201000_15 afS13S1201000_15, Object obj) {
        C1C7U.LIZ("ZoomAnchorPresent@8a17.zoomGuestToMax$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C930480aJy.LIZ.getClass();
        int i = baseResponse.statusCode;
        if (i == 0) {
            C1143300frE.LJIIJJI().LJII(((C919990a33) afS13S1201000_15.l1).LIZJ, C2097608Jq.LJIIJ(new Pair("action", "zoomGuestToMax"), new Pair("linkMicId", afS13S1201000_15.s0), new Pair("httpresult", "success")));
            C919870a2r.LIZJ(afS13S1201000_15.i3, Long.valueOf(C01HE.LJI(afS13S1201000_15.s0)).toString(), "enlarge");
            InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS13S1201000_15.l2;
            if (interfaceC920110a3F != null) {
                interfaceC920110a3F.LIZJ(afS13S1201000_15.s0);
            }
        } else {
            ((C919990a33) afS13S1201000_15.l1).LJJIFFI(i, (InterfaceC920110a3F) afS13S1201000_15.l2, afS13S1201000_15.s0, baseResponse.LJ.message, null);
        }
        C1C7U.LIZIZ("ZoomAnchorPresent@8a17.zoomGuestToMax$2");
    }

    public static final void accept$1(AfS13S1201000_15 afS13S1201000_15, Object obj) {
        C1C7U.LIZ("ZoomModeratorPresenter@26.zoomGuestToMax$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C930480aJy.LIZ.getClass();
        int i = baseResponse.statusCode;
        if (i == 0) {
            C1143300frE.LJIIJJI().LJII(((C920000a34) afS13S1201000_15.l1).LIZJ, C2097608Jq.LJIIJ(new Pair("action", "zoomGuestToMax"), new Pair("linkMicId", afS13S1201000_15.s0), new Pair("httpresult", "success")));
            C919870a2r.LIZJ(afS13S1201000_15.i3, String.valueOf(C01HE.LJI(afS13S1201000_15.s0)), "enlarge");
            InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS13S1201000_15.l2;
            if (interfaceC920110a3F != null) {
                interfaceC920110a3F.LIZJ(afS13S1201000_15.s0);
            }
        } else {
            ((C920000a34) afS13S1201000_15.l1).LJJIFFI(i, (InterfaceC920110a3F) afS13S1201000_15.l2, afS13S1201000_15.s0, baseResponse.LJ.message, null);
        }
        C1C7U.LIZIZ("ZoomModeratorPresenter@26.zoomGuestToMax$2");
    }

    public AfS13S1201000_15(Object obj, String str, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i3 = i;
        this.l2 = obj2;
    }
}
