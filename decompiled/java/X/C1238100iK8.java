package X;

import android.app.Dialog;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting;
import kotlin.jvm.internal.AwS42S2100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("email_pop_up_dialog")
public final class C1238100iK8 extends AbstractC20660015ss<Dialog> {
    public final C19EG LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 229;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        String string;
        String string2;
        if (TextUtils.isEmpty(EmailPopUpSetting.LIZ().addEmailPopupStrings.popupTitle)) {
            string = this.LL.getString(2131830642);
        } else {
            string = EmailPopUpSetting.LIZ().addEmailPopupStrings.popupTitle;
        }
        if (TextUtils.isEmpty(EmailPopUpSetting.LIZ().addEmailPopupStrings.popupBody)) {
            string2 = this.LL.getString(2131830638);
        } else {
            string2 = EmailPopUpSetting.LIZ().addEmailPopupStrings.popupBody;
        }
        String string3 = this.LL.getString(2131830639);
        String string4 = this.LL.getString(2131830637);
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL);
        c1397580mTM.LJI(string);
        c1397580mTM.LIZIZ(string2);
        c1397580mTM.LIZLLL(new AwS598S0100000_19(this, 567));
        c1397580mTM.LJII = true;
        C985403tE.LIZ(c1397580mTM, new AwS42S2100000_19(string4, string3, this, 3));
        Keva keva = C854360XfO.LIZ;
        C854360XfO.LIZJ(Integer.valueOf(this.LLILLL));
        C1238070iK5 c1238070iK5 = C1238070iK5.LIZ;
        Integer numValueOf = Integer.valueOf(this.LLILLL);
        Boolean bool = Boolean.FALSE;
        c1238070iK5.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", C1238070iK5.LIZIZ(numValueOf));
        c0xgr.LIZLLL("enter_method", C1238070iK5.LIZ(bool));
        c0xgr.LIZ(C854360XfO.LIZIZ(numValueOf), "show_index");
        C20684815ws.LJIILLIIL("add_email_popup_show", c0xgr.LIZ);
        return new C1397510mTF(c1397580mTM).LJ();
    }

    public C1238100iK8(int i, C19EG c19eg, boolean z) {
        this.LL = c19eg;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }
}
