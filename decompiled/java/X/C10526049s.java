package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import g1c.AjS60S0100000_1;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.049s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10526049s extends LinearLayout {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;
    public RelativeLayout LLILLL;
    public Function1<? super String, Unit> LLILZ;
    public Function1<? super String, Unit> LLILZIL;
    public Function1<? super Long, Unit> LLILZLL;
    public boolean LLIZ;

    public final void setListener(InterfaceC10528049u interfaceC10528049u) {
    }

    public final TuxIconView getOfficialLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pim);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getSoldByTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vok);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final RelativeLayout getTopBrandFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y9y);
            this.LLILLL = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final Function1<String, Unit> getOnClickListener() {
        return this.LLILZ;
    }

    public final Function1<String, Unit> getOnShowListener() {
        return this.LLILZIL;
    }

    public final Function1<Long, Unit> getOnShowSheetListener() {
        return this.LLILZLL;
    }

    public final void LIZIZ(SellerInfo sellerInfo) {
        String strLJJIFFI;
        String str;
        String string = getContext().getString(2131832955);
        if (sellerInfo != null && (str = sellerInfo.name) != null) {
            strLJJIFFI = u.LJJIFFI(string, "{{store_name}}", str, false);
        } else {
            strLJJIFFI = null;
        }
        getSoldByTextFromXml().setTuxFont(71);
        C0H1U.LJIIL(getSoldByTextFromXml(), strLJJIFFI, true);
    }

    public final void setOfficialLabelFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setOnClickListener(Function1<? super String, Unit> function1) {
        this.LLILZ = function1;
    }

    public final void setOnShowListener(Function1<? super String, Unit> function1) {
        this.LLILZIL = function1;
    }

    public final void setOnShowSheetListener(Function1<? super Long, Unit> function1) {
        this.LLILZLL = function1;
    }

    public final void setSoldByTextFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setTopBrandFromXml(RelativeLayout relativeLayout) {
        this.LLILLL = relativeLayout;
    }

    public C10526049s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = AFwS228S0000000_1.get$arr$(588);
        this.LLILZIL = AFwS228S0000000_1.get$arr$(589);
        this.LLILZLL = AFwS228S0000000_1.get$arr$(590);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aum, this, true);
        C786410Ut5.I7(new AjS60S0100000_1(this, 76), getSoldByTextFromXml());
    }

    public final void LIZ(final String str, Map map, ECRichText eCRichText) {
        final TuxTextView soldByTextFromXml = getSoldByTextFromXml();
        C786410Ut5.I7(new AjS10S0000000_1(11), soldByTextFromXml);
        C1748720vbi.LIZLLL(soldByTextFromXml, new AnonymousClass0497(), new AwS115S1100000_1(str, (String) map, (Map<String, ? extends Object>) 35));
        soldByTextFromXml.setTuxFont(71);
        C03B0 c03b0 = new C03B0(soldByTextFromXml, "ProductSellerInfoView");
        C03B0.LIZ(c03b0, eCRichText, new InterfaceC1631620sYq<View, String, ECRichTextExtraInfo, Unit>() { // from class: X.049r
            @Override // X.InterfaceC1631620sYq
            public final Unit invoke(View view, String str2, ECRichTextExtraInfo eCRichTextExtraInfo) {
                C1748720vbi.LIZLLL(soldByTextFromXml, new AnonymousClass0498(), new AwS52S1000000_1(str, 32));
                C1748720vbi.LIZLLL(soldByTextFromXml, new C10516049i(), new AwS52S1000000_1(str, 33));
                SmartRouter.buildRoute(soldByTextFromXml.getContext(), UriProtector.parse(str2).toString()).open();
                return Unit.LIZ;
            }
        }, null, false, null, null, 124);
        C0H1U.LJIIL(soldByTextFromXml, c03b0.LIZJ, true);
        soldByTextFromXml.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
