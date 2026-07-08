package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundCashierBasicInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0ufV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712630ufV extends FrameLayout implements InterfaceC1711260udI {
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;
    public FrameLayout LLILZ;
    public C1749280vcc LLILZIL;
    public final C1712630ufV LLILZLL;
    public EnumC1709240ua2 LLIZ;
    public EnumC1711310udN LLIZLLLIL;
    public String LLJ;
    public RefundCashierBasicInfo LLJI;
    public Function1<? super C1711280udK, Unit> LLJIJIL;
    public Function1<? super AbstractC1711120ud4, Unit> LLJILJIL;
    public Function1<? super String, Unit> LLJILJILJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce A[PHI: r9
      0x01ce: PHI (r9v9 java.lang.String) = (r9v3 java.lang.String), (r9v10 java.lang.String) binds: [B:100:0x01cc, B:98:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d2 A[PHI: r9
      0x01d2: PHI (r9v8 java.lang.String) = (r9v3 java.lang.String), (r9v9 java.lang.String) binds: [B:100:0x01cc, B:102:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d5 A[PHI: r7 r9
      0x01d5: PHI (r7v0 java.lang.String) = (r7v4 java.lang.String), (r7v5 java.lang.String) binds: [B:104:0x01d3, B:102:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r9v4 java.lang.String) = (r9v8 java.lang.String), (r9v9 java.lang.String) binds: [B:104:0x01d3, B:102:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d9 A[PHI: r7 r9
      0x01d9: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:106:0x01d7, B:104:0x01d3] A[DONT_GENERATE, DONT_INLINE]
      0x01d9: PHI (r9v7 java.lang.String) = (r9v4 java.lang.String), (r9v8 java.lang.String) binds: [B:106:0x01d7, B:104:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0253 A[PHI: r5 r7 r9
      0x0253: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v7 java.lang.String) binds: [B:106:0x01d7, B:108:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:106:0x01d7, B:108:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v7 java.lang.String) binds: [B:106:0x01d7, B:108:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cb  */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1712630ufV.LJ():void");
    }

    public final TuxTextView getCashierTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_cashier_title);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getContentRootFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_refund_content_root);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final FrameLayout getEmptyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_refund_empty_container);
            this.LLILZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C1749280vcc getEmptyStatusViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_refund_empty_status);
            this.LLILZIL = (C1749280vcc) callbackFindViewById;
        }
        return (C1749280vcc) callbackFindViewById;
    }

    public final LinearLayout getMethodContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_refund_method_container);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    @Override // X.InterfaceC1711260udI
    public View getContentView() {
        return this.LLILZLL;
    }

    public C1712630ufV(Context context) {
        super(context, null, 0);
        this.LLILZLL = this;
        this.LLIZ = EnumC1709240ua2.DEFAULT;
        this.LLIZLLLIL = EnumC1711310udN.EMBEDDED;
        this.LLJ = "";
        this.LLJIJIL = AFwS268S0000000_26.get$arr$(526);
        this.LLJILJIL = AFwS268S0000000_26.get$arr$(524);
        this.LLJILJILJ = AFwS268S0000000_26.get$arr$(525);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dw5, this, true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC1711260udI
    public final void LIZ(EnumC1709240ua2 enumC1709240ua2) {
        this.LLIZ = enumC1709240ua2;
    }

    @Override // X.InterfaceC1711260udI
    public final void LIZIZ(C1711330udP c1711330udP) {
        this.LLJI = c1711330udP.LIZ;
        this.LLIZLLLIL = c1711330udP.LIZIZ;
        this.LLIZ = c1711330udP.LIZJ;
        this.LLJ = c1711330udP.LIZLLL;
        this.LLJIJIL = c1711330udP.LJ;
        this.LLJILJIL = c1711330udP.LJFF;
        this.LLJILJILJ = c1711330udP.LJI;
        LJ();
    }

    @Override // X.InterfaceC1711260udI
    public final void LIZJ(EnumC1711310udN enumC1711310udN) {
        this.LLIZLLLIL = enumC1711310udN;
        if (this.LLJI != null) {
            LJ();
        }
    }

    public final void LIZLLL(String str) {
        if (this.LLIZLLLIL != EnumC1711310udN.MAIN && str != null && str.length() != 0) {
            C786410Ut5.LLLLZLL(getCashierTitleFromXml(), 0);
            getCashierTitleFromXml().setText(str);
        } else {
            C786410Ut5.LLLLZLL(getCashierTitleFromXml(), 8);
        }
    }

    public final void setCashierTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setContentRootFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setEmptyContainerFromXml(FrameLayout frameLayout) {
        this.LLILZ = frameLayout;
    }

    public final void setEmptyStatusViewFromXml(C1749280vcc c1749280vcc) {
        this.LLILZIL = c1749280vcc;
    }

    public final void setMethodContainerFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public static final void LJFF(C1712630ufV c1712630ufV, String str, String str2, String str3, String str4) {
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(c1712630ufV.LLJ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("parent_option_name", str2);
        linkedHashMap.put("option_name", str4);
        linkedHashMap.put("rank", "1");
        linkedHashMap.put("status_code", str3);
        interfaceC1709310ua9LIZIZ.LIZ("tiktokls_option_show", linkedHashMap);
    }
}
