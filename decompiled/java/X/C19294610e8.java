package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import java.util.Locale;

/* JADX INFO: renamed from: X.10e8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19294610e8 extends AbstractC431340Gvk {
    public final /* synthetic */ IPNSChangeRegionService LL;
    public final /* synthetic */ TextView LLILLJJLI;
    public final /* synthetic */ String[] LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ SpannableStringBuilder LLJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(final View view) {
        Activity activity;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null) {
            return;
        }
        if (abstractC1387200mCcLJ instanceof C1844400y62) {
            activity = abstractC1387200mCcLJ.LIZLLL().getActivity();
        } else if (abstractC1387200mCcLJ instanceof C1397950mTx) {
            activity = ((C1397950mTx) abstractC1387200mCcLJ).LIZLLL;
        } else {
            return;
        }
        if (activity != null) {
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("enter_from", "signup_login_page");
            C20684815ws.LJIJ("account_region_status_click", c2241008qG.LJ());
            IPNSChangeRegionService iPNSChangeRegionService = this.LL;
            if (iPNSChangeRegionService == null) {
                return;
            }
            iPNSChangeRegionService.LJIILLIIL(activity, new InterfaceC1710120ubS() { // from class: X.10eA
                @Override // X.InterfaceC1710120ubS
                public final void onExit() {
                }

                @Override // X.InterfaceC1710120ubS
                public final void onError(String str) {
                    C1389890mGx c1389890mGx = new C1389890mGx(view);
                    c1389890mGx.LJIIJ(str);
                    c1389890mGx.LJIIJJI();
                }

                @Override // X.InterfaceC1710120ubS
                public final void onChanged(String str, String str2) {
                    C19294610e8 c19294610e8 = this.LLILLJJLI;
                    if (c19294610e8.LLILLJJLI != null) {
                        String str3 = c19294610e8.LLILLL[0];
                        if (!c19294610e8.LL.LJIIIZ(1, str, str2, "user_selected")) {
                            return;
                        }
                        C19294610e8 c19294610e82 = this.LLILLJJLI;
                        int iIndexOf = new SpannableStringBuilder(c19294610e82.LLILZ.getString(c19294610e82.LLILZIL, "%1$s", c19294610e82.LLILZLL, c19294610e82.LLIZ, c19294610e82.LLIZLLLIL, c19294610e82.LLJ)).toString().toLowerCase(Locale.getDefault()).indexOf("%1$s".toLowerCase(Locale.getDefault()));
                        if (iIndexOf < 0) {
                            return;
                        }
                        this.LLILLJJLI.LLJI.replace(iIndexOf, str3.length() + iIndexOf, (CharSequence) str2);
                        C19294610e8 c19294610e83 = this.LLILLJJLI;
                        c19294610e83.LLILLJJLI.setText(c19294610e83.LLJI);
                        this.LLILLJJLI.LLILLL[0] = str2;
                    }
                }
            });
        }
    }

    @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19294610e8(int i, int i2, IPNSChangeRegionService iPNSChangeRegionService, TextView textView, String[] strArr, Context context, int i3, String str, String str2, String str3, String str4, SpannableStringBuilder spannableStringBuilder) {
        super(i, i2);
        this.LL = iPNSChangeRegionService;
        this.LLILLJJLI = textView;
        this.LLILLL = strArr;
        this.LLILZ = context;
        this.LLILZIL = i3;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = spannableStringBuilder;
    }
}
