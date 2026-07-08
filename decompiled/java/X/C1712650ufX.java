package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ufX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712650ufX extends FrameLayout {
    public LinearLayout LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public LinearLayout LLILZIL;
    public TuxTextView LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;

    private final TuxTextView getDescViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_refund_method_desc);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final SmartImageView getIconViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_refund_method_icon);
            this.LLILLJJLI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    private final TuxTextView getNameViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_refund_method_name);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final LinearLayout getRefundArrivingTimeContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_refund_arriving_time_container);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    private final TuxTextView getRefundArrivingTimeDescViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_refund_arriving_time_desc);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final LinearLayout getRowContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_refund_method_row);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public C1712650ufX(Context context) {
        super(context, null, 0);
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        this.LLJ = "";
        this.LLJI = "";
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dw6, this, true);
    }

    public final void LIZIZ(boolean z) {
        Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("page_name", this.LLIZLLLIL), new Pair("payment_option", this.LLJ));
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(this.LLIZ);
        if (z) {
            interfaceC1709310ua9LIZIZ.LJIIL(this.LLIZLLLIL, this.LLJI, null, mapLJIIIIZZ);
        } else {
            interfaceC1709310ua9LIZIZ.LJ(this.LLIZLLLIL, this.LLJI, null, mapLJIIIIZZ);
        }
    }

    public static void LIZJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LinearLayout.LayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.getMarginStart() == i) {
            return;
        }
        marginLayoutParams.setMarginStart(i);
        C786410Ut5.W5(view, marginLayoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r16, X.EnumC1711310udN r17, com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundOption r18, com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundMethod r19, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1712650ufX.LIZ(java.lang.String, X.0udN, com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundOption, com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundMethod, kotlin.jvm.functions.Function1):void");
    }
}
