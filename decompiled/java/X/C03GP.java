package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03GP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GP extends FrameLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public final C01GW LLILLL;

    public final TuxTextView getDefaultOrderSummarySubInfoDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fje);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getDefaultOrderSummarySubInfoTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fjg);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getSubInfoTitleIcon() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    public C03GP(Context context) {
        super(context, null, 0);
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1657));
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.b4b, this, true);
    }

    public final void setDefaultOrderSummarySubInfoDescFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setDefaultOrderSummarySubInfoTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setDesc(String str) {
        getDefaultOrderSummarySubInfoDescFromXml().setText(str);
    }

    public final void setDescColorRes(int i) {
        getDefaultOrderSummarySubInfoDescFromXml().setTextColorRes(i);
    }

    public final void setDescFont(int i) {
        getDefaultOrderSummarySubInfoDescFromXml().setTuxFont(i);
    }

    public final void setRichTextTitle(ECRichText eCRichText) {
        TuxTextView defaultOrderSummarySubInfoTitleFromXml = getDefaultOrderSummarySubInfoTitleFromXml();
        C03B0 c03b0 = new C03B0(defaultOrderSummarySubInfoTitleFromXml, "osp_bottom_price_sub_text");
        C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
        defaultOrderSummarySubInfoTitleFromXml.setText(c03b0.LIZJ);
    }

    public final void setTitle(String str) {
        getDefaultOrderSummarySubInfoTitleFromXml().setText(str);
    }

    public final void setTitleColorRes(int i) {
        getDefaultOrderSummarySubInfoTitleFromXml().setTextColorRes(i);
    }

    public final void setTitleFont(int i) {
        getDefaultOrderSummarySubInfoTitleFromXml().setTuxFont(i);
    }

    public final void LIZ(int i, Integer num) {
        if (num == null) {
            C786410Ut5.LLLLLLZZ(getSubInfoTitleIcon(), 8);
            return;
        }
        C786410Ut5.LLLLLLZZ(getSubInfoTitleIcon(), 0);
        getSubInfoTitleIcon().setIconRes(num.intValue());
        getSubInfoTitleIcon().setTintColor(i);
    }
}
