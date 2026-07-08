package Y;

import X.C1068720duw;
import X.C1391190mJ3;
import X.C20485080t;
import X.C21282518Ql;
import X.C21282618Qm;
import X.C21372018kQ;
import X.C21372118kR;
import X.C21372318kT;
import X.C21372418kU;
import X.C259800zU;
import X.C343970De7;
import X.InterfaceC21282718Qn;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.autofill.AdPaymentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS467S0200000_32;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class ACListenerS96S0300000_32 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS96S0300000_32 aCListenerS96S0300000_32, View view) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCListenerS96S0300000_32.l0;
        videoPublishEditModel.creativeModel.privacySettingModel.isSubscribeOnly = false;
        videoPublishEditModel.isPrivate = 0;
        ((Function0) aCListenerS96S0300000_32.l1).invoke();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((C21372318kT) aCListenerS96S0300000_32.l2, C343970De7.LIZ);
    }

    public static final void onClick$1(ACListenerS96S0300000_32 aCListenerS96S0300000_32, View view) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCListenerS96S0300000_32.l0;
        videoPublishEditModel.creativeModel.privacySettingModel.isSubscribeOnly = false;
        videoPublishEditModel.isPrivate = 2;
        ((Function0) aCListenerS96S0300000_32.l1).invoke();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((C21372318kT) aCListenerS96S0300000_32.l2, C343970De7.LIZ);
    }

    public static final void onClick$2(ACListenerS96S0300000_32 aCListenerS96S0300000_32, View view) {
        ((C21372118kR) aCListenerS96S0300000_32.l0).setPostPrivacyFromDraftPanelChoice((VideoPublishEditModel) aCListenerS96S0300000_32.l1);
        ((Function0) aCListenerS96S0300000_32.l2).invoke();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((C21372118kR) aCListenerS96S0300000_32.l0, C343970De7.LIZ);
    }

    public static final void onClick$3(ACListenerS96S0300000_32 aCListenerS96S0300000_32, View view) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCListenerS96S0300000_32.l0;
        videoPublishEditModel.creativeModel.privacySettingModel.isSubscribeOnly = false;
        videoPublishEditModel.isPrivate = 0;
        ((Function0) aCListenerS96S0300000_32.l1).invoke();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((C21372418kU) aCListenerS96S0300000_32.l2, C343970De7.LIZ);
    }

    public static final void onClick$4(ACListenerS96S0300000_32 aCListenerS96S0300000_32, View view) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCListenerS96S0300000_32.l0;
        videoPublishEditModel.creativeModel.privacySettingModel.isSubscribeOnly = false;
        videoPublishEditModel.isPrivate = 2;
        ((Function0) aCListenerS96S0300000_32.l1).invoke();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((C21372418kU) aCListenerS96S0300000_32.l2, C343970De7.LIZ);
    }

    public static final void onClick$5(ACListenerS96S0300000_32 aCListenerS96S0300000_32, View view) {
        ((C21372018kQ) aCListenerS96S0300000_32.l0).setPostPrivacyFromDraftPanelChoice((VideoPublishEditModel) aCListenerS96S0300000_32.l1);
        ((Function0) aCListenerS96S0300000_32.l2).invoke();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((C21372018kQ) aCListenerS96S0300000_32.l0, C343970De7.LIZ);
    }

    public static final void onClick$6(ACListenerS96S0300000_32 aCListenerS96S0300000_32, View view) {
        String strOptString;
        if (a0.LJJIIZI(((AdPaymentModel) aCListenerS96S0300000_32.l0).getCardNumber(), "***", false)) {
            String strLIZIZ = C20485080t.LIZIZ((AdPaymentModel) aCListenerS96S0300000_32.l0);
            if (strLIZIZ == null || (strOptString = new JSONObject(strLIZIZ).optString("instrumentId")) == null) {
                strOptString = "";
            }
            C21282518Ql c21282518Ql = (C21282518Ql) aCListenerS96S0300000_32.l1;
            C1068720duw.LJ(c21282518Ql.LLILLL, strOptString, 5, c21282518Ql.LLILZLL, new AwS467S0200000_32((C21282618Qm) aCListenerS96S0300000_32.l2, c21282518Ql, 0));
            return;
        }
        ((C21282618Qm) aCListenerS96S0300000_32.l2).I5(((AdPaymentModel) aCListenerS96S0300000_32.l0).getCardNumber());
        InterfaceC21282718Qn interfaceC21282718Qn = ((C21282518Ql) aCListenerS96S0300000_32.l1).LLIZ;
        if (interfaceC21282718Qn == null) {
            return;
        }
        interfaceC21282718Qn.LIZIZ("cardNumber");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$7(ACListenerS96S0300000_32 aCListenerS96S0300000_32, View view) {
        ((C21282618Qm) aCListenerS96S0300000_32.l0).I5((String) ((C259800zU) aCListenerS96S0300000_32.l1).element);
        InterfaceC21282718Qn interfaceC21282718Qn = ((C21282518Ql) aCListenerS96S0300000_32.l2).LLIZ;
        if (interfaceC21282718Qn != null) {
            interfaceC21282718Qn.LIZIZ("monthExpiryTime");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$8(ACListenerS96S0300000_32 aCListenerS96S0300000_32, View view) {
        ((C21282618Qm) aCListenerS96S0300000_32.l0).I5((String) ((C259800zU) aCListenerS96S0300000_32.l1).element);
        InterfaceC21282718Qn interfaceC21282718Qn = ((C21282518Ql) aCListenerS96S0300000_32.l2).LLIZ;
        if (interfaceC21282718Qn != null) {
            interfaceC21282718Qn.LIZIZ("yearExpiryTime");
        }
    }

    public ACListenerS96S0300000_32(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
