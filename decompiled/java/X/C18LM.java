package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.ExpansionVoucher;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.18LM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18LM extends FrameLayout {
    public static final /* synthetic */ int LLIZ = 0;
    public SmartImageView LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C197039127h LLILZIL;
    public Map<String, String> LLILZLL;

    public final SmartImageView getIvVoucherBgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lzl);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final SmartImageView getIvVoucherIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lzm);
            this.LLILLJJLI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getTvVoucherContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_voucher_content);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvVoucherTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_voucher_title);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C197039127h getVoucherActionBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.voucher_action_btn);
            this.LLILZIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public C18LM(Context context) {
        super(context, null, 0);
        C1701430uNR.LIZ(context, R.layout.aq4, this, true);
        SmartImageView ivVoucherBgFromXml = getIvVoucherBgFromXml();
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C418440Gaw.LIZIZ(8);
        ivVoucherBgFromXml.setCircleOptions(new C1331730kl9(c1331750klB));
        this.LLILZLL = C2097608Jq.LJ();
    }

    public final void LIZ(ExpansionVoucher expansionVoucher) {
        String str;
        PanelVoucherInfo panelVoucherInfo = expansionVoucher.expandedVoucherInfo;
        if (panelVoucherInfo != null && (str = panelVoucherInfo.voucherTypeId) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mystery_coupon_infos_");
            sbLIZ.append(str);
            try {
                C1323720kYE.LIZ(getContext()).LJIIIIZZ(C1741890vQh.LJIIIIZZ(expansionVoucher), C2188811AlT.LIZIZ(sbLIZ));
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZJ(ExpansionVoucher expansionVoucher) {
        String str;
        Uri.Builder builderAppendQueryParameter = UriProtector.parse((String) C2507709sB.LIZ.getValue()).buildUpon().appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(this.LLILZLL));
        PanelVoucherInfo panelVoucherInfo = expansionVoucher.expandedVoucherInfo;
        if (panelVoucherInfo != null) {
            str = panelVoucherInfo.voucherTypeId;
        } else {
            str = null;
        }
        SmartRouter.buildRoute(getContext(), builderAppendQueryParameter.appendQueryParameter("voucher_type_id", str).build().toString()).open();
    }

    public final void setIvVoucherBgFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setIvVoucherIconFromXml(SmartImageView smartImageView) {
        this.LLILLJJLI = smartImageView;
    }

    public final void setTvVoucherContentFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTvVoucherTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setVoucherActionBtnFromXml(C197039127h c197039127h) {
        this.LLILZIL = c197039127h;
    }

    public final void LIZIZ(ExpansionVoucher expansionVoucher, int i) {
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        String str = this.LLILZLL.get("source_content_id");
        PanelVoucherInfo panelVoucherInfo = expansionVoucher.expandedVoucherInfo;
        String str2 = this.LLILZLL.get("enter_from");
        String str3 = this.LLILZLL.get("entrance_form");
        String strValueOf = String.valueOf(i);
        Map<String, String> map = this.LLILZLL;
        c21271918Mj.getClass();
        C21271918Mj.LJIILLIIL(str, panelVoucherInfo, str2, str3, "video_panel_half", "get_directly", strValueOf, map);
        C1260120ite.LIZIZ(new ARunnableS129S0100000_29(this, 155));
    }
}
