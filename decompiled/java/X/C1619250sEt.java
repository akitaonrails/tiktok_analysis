package X;

import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeMsg;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeMsgHighlight;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619250sEt extends C214906198m {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final Context LL;
    public final View LLILLJJLI;
    public final LinearLayout LLILLL;
    public final TextView LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public SpannableStringBuilder LLJ;
    public String LLJI;
    public List<SafeInfoNoticeMsgHighlight> LLJIJIL;

    public final void LJJIIJZLJL() {
        try {
            dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJIIZ() {
        if (isShowing()) {
            return;
        }
        int[] iArr = new int[2];
        this.LLILLJJLI.getLocationOnScreen(iArr);
        getContentView().measure(0, 0);
        showAtLocation(this.LLILLJJLI, 0, 0, iArr[1] - getContentView().getMeasuredHeight());
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJI(this);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
        if (this.LLILZIL) {
            this.LLILZIL = false;
            C2344009Gk c2344009Gk = new C2344009Gk();
            C844470XAv.LIZ.getClass();
            c2344009Gk.LJIIIIZZ("aid", String.valueOf(C844470XAv.LJIIJ));
            c2344009Gk.LJIIIIZZ("notice_id", this.LLIZLLLIL);
            c2344009Gk.LJIIIIZZ("notice_type", this.LLILZLL);
            c2344009Gk.LJIIIIZZ("notice_model", this.LLIZ);
            C20684815ws.LJIILLIIL("security_alert_notify", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1619250sEt.LJJIIJ(java.lang.String):void");
    }

    public C1619250sEt(Context context, View view) {
        int iLJJJJI;
        super(context);
        this.LL = context;
        this.LLILLJJLI = view;
        this.LLILZIL = true;
        setContentView(C786410Ut5.Sd(R.layout.e9v, C786410Ut5.ne(context), null));
        this.LLILLL = (LinearLayout) getContentView().findViewById(R.id.mcz);
        TextView textView = (TextView) getContentView().findViewById(R.id.zzm);
        this.LLILZ = textView;
        TuxIconView tuxIconView = (TuxIconView) getContentView().findViewById(R.id.lq1);
        SafeInfoNoticeMsg safeInfoNoticeMsg = (SafeInfoNoticeMsg) GsonProtectorUtils.fromJson(new Gson(), Keva.getRepo("account_security_keva_name").getString(C1618670sDx.LIZ("safe_info_"), ""), SafeInfoNoticeMsg.class);
        if (safeInfoNoticeMsg != null) {
            this.LLIZ = safeInfoNoticeMsg.noticeModel;
            this.LLILZLL = safeInfoNoticeMsg.noticeType;
            this.LLIZLLLIL = safeInfoNoticeMsg.noticeId;
            this.LLJ = new SpannableStringBuilder(safeInfoNoticeMsg.notice);
            this.LLJI = safeInfoNoticeMsg.scheme;
            this.LLJIJIL = safeInfoNoticeMsg.highlight;
        }
        if (this.LLJ != null) {
            if (TextUtils.equals(this.LLIZ, "can_not_cancel")) {
                tuxIconView.setIconRes(R.raw.icon_chevron_right_ltr);
                C786410Ut5.a9(tuxIconView, new ACListenerS158S0100000_24(this, 83));
            } else {
                tuxIconView.setIconRes(R.drawable.c0j);
                C786410Ut5.a9(tuxIconView, new ACListenerS158S0100000_24(this, 84));
            }
            if (this.LLJIJIL != null && (!r0.isEmpty())) {
                for (final SafeInfoNoticeMsgHighlight safeInfoNoticeMsgHighlight : this.LLJIJIL) {
                    String str = safeInfoNoticeMsgHighlight.content;
                    if (str != null && (iLJJJJI = a0.LJJJJI(String.valueOf(this.LLJ), str, 0, 6)) != -1 && iLJJJJI < this.LLJ.length() && str.length() + iLJJJJI <= this.LLJ.length()) {
                        C786410Ut5.q2(this.LLJ, new ClickableSpan() { // from class: X.0sEu
                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view2) {
                                if (this.LL.LLJIJIL.size() != 1) {
                                    this.LL.LJJIIJ(safeInfoNoticeMsgHighlight.scheme);
                                }
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                super.updateDrawState(textPaint);
                                textPaint.setColor(C960203pA.LIZ(R.attr.a04, this.LL.LL));
                                textPaint.setUnderlineText(false);
                                C444890HcV c444890HcV = new C444890HcV();
                                c444890HcV.LIZ(82);
                                textPaint.setTypeface(c444890HcV.getTypeface());
                            }
                        }, iLJJJJI, str.length() + iLJJJJI, 33);
                    }
                }
                this.LLILZ.setText(this.LLJ);
                this.LLILZ.setMovementMethod(LinkMovementMethod.getInstance());
                this.LLILZ.setHighlightColor(0);
                if (this.LLJIJIL.size() == 1) {
                    C786410Ut5.T7(this.LLILZ, new ACListenerS158S0100000_24(this, 85));
                }
            } else {
                textView.setText(this.LLJ);
                C786410Ut5.T7(textView, new ACListenerS158S0100000_24(this, 86));
            }
            C786410Ut5.x3(this.LLILZ.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1620810sHP(this, 1));
        }
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
    }
}
