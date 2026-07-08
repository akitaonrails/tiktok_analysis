package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.PromoteNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.0zk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907620zk0 extends C1906860zim {
    public final NotificationDetailVM LL;
    public final View LLILLJJLI;
    public final C422820Gi0 LLILLL;
    public final TextView LLILZ;
    public final RemoteImageView LLILZIL;
    public final C197039127h LLILZLL;
    public final TuxIconView LLIZ;
    public final TextView LLIZLLLIL;
    public final ImageView LLJ;
    public PromoteNotice LLJI;
    public BaseNotice LLJIJIL;

    @Override // X.AbstractC1906850zil, X.ViewOnClickListenerC1906680ziU
    public final void onAttached() {
        super.onAttached();
        BaseNotice baseNotice = this.LLJIJIL;
        if (baseNotice == null) {
            return;
        }
        this.LL.UJ(baseNotice, new AwS429S0200000_28(baseNotice, this, 80));
    }

    public final void N5(BaseNotice baseNotice) {
        boolean z;
        this.LLJIJIL = baseNotice;
        if (baseNotice.promoteNotice == null) {
            return;
        }
        this.LLILLL.setImageURI(C1325880kbi.LIZIZ(R.drawable.ahz));
        PromoteNotice promoteNotice = baseNotice.promoteNotice;
        this.LLJI = promoteNotice;
        if (promoteNotice != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8296);
            }
            if (!TextUtils.isEmpty(promoteNotice.title)) {
                spannableStringBuilder.append((CharSequence) promoteNotice.title);
                if (!TextUtils.isEmpty(promoteNotice.content)) {
                    spannableStringBuilder.append(": ");
                }
                C786410Ut5.q2(spannableStringBuilder, new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            if (!TextUtils.isEmpty(promoteNotice.content)) {
                spannableStringBuilder.append((CharSequence) promoteNotice.content);
            }
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8297);
            }
            if (promoteNotice.schemaUrl.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                addCreateTimeSpan(spannableStringBuilder, baseNotice);
                this.LLILZ.setText(spannableStringBuilder);
                C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
                C786410Ut5.l(this.LLILZIL, 8);
                C786410Ut5.LLIL(this.LLIZLLLIL, 8);
                C786410Ut5.LJZI(8, this.LLJ);
                C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
                return;
            }
            try {
                UriProtector.parse(promoteNotice.schemaUrl);
                C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(132.0f, this.mContext)), null, null);
                C786410Ut5.LLLLLLZZ(this.LLIZ, 0);
                C786410Ut5.l(this.LLILZIL, 8);
                C786410Ut5.LLIL(this.LLIZLLLIL, 8);
                C786410Ut5.LJZI(8, this.LLJ);
                C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
                UrlModel urlModel = promoteNotice.imageUrl;
                if (urlModel == null) {
                    return;
                }
                C1324840ka2.LJFF(this.LLILZIL, urlModel);
                C786410Ut5.l(this.LLILZIL, 0);
                C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.ViewOnClickListenerC1906680ziU, android.view.View.OnClickListener
    public final void onClick(View view) {
        PromoteNotice promoteNotice;
        String str;
        String templateId;
        Long lValueOf;
        String accountType;
        String str2;
        BaseNotice baseNotice;
        BaseNotice baseNotice2 = this.LLJIJIL;
        int i = 1;
        if (baseNotice2 != null && (promoteNotice = baseNotice2.promoteNotice) != null && (str = promoteNotice.schemaUrl) != null && C703302op.LIZ(str)) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    if (C0OBG.LIZIZ(view)) {
                        return;
                    }
                    PromoteNotice promoteNotice2 = this.LLJI;
                    if (promoteNotice2 != null) {
                        SmartRouter.buildRoute(this.mContext, promoteNotice2.schemaUrl).open();
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
                    c2344009Gk.LJIIIIZZ("tab_name", "all");
                    BaseNotice baseNotice3 = this.LLJIJIL;
                    Long lValueOf2 = null;
                    if (baseNotice3 != null) {
                        templateId = baseNotice3.getTemplateId();
                    } else {
                        templateId = null;
                    }
                    c2344009Gk.LJIIIIZZ("template_id", templateId);
                    if (C1902710zc5.LIZJ() || (baseNotice = this.LLJIJIL) == null || !baseNotice.hasRead) {
                        i = 0;
                    }
                    c2344009Gk.LIZJ(i, "is_read");
                    c2344009Gk.LIZJ(0, "is_together");
                    BaseNotice baseNotice4 = this.LLJIJIL;
                    if (baseNotice4 != null) {
                        lValueOf = Long.valueOf(baseNotice4.createTime);
                    } else {
                        lValueOf = null;
                    }
                    c2344009Gk.LJ(lValueOf, "message_time");
                    c2344009Gk.LIZJ(getLayoutPosition(), "client_order");
                    c2344009Gk.LJIIIIZZ("action_type", "click");
                    BaseNotice baseNotice5 = this.LLJIJIL;
                    if (baseNotice5 != null) {
                        accountType = baseNotice5.getAccountType();
                    } else {
                        accountType = null;
                    }
                    c2344009Gk.LJIIIIZZ("account_type", accountType);
                    BaseNotice baseNotice6 = this.LLJIJIL;
                    if (baseNotice6 != null) {
                        str2 = baseNotice6.nid;
                    } else {
                        str2 = null;
                    }
                    c2344009Gk.LJIIIIZZ("content_id", str2);
                    BaseNotice baseNotice7 = this.LLJIJIL;
                    if (baseNotice7 != null) {
                        lValueOf2 = Long.valueOf(baseNotice7.taskId);
                    }
                    c2344009Gk.LJ(lValueOf2, "task_id");
                    c2344009Gk.LJIIIIZZ("position", C1900870zZ7.LIZ);
                    C20684815ws.LJIILLIIL("official_message_inner_message", c2344009Gk.LIZ);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        }
    }

    public C1907620zk0(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        this.LL = notificationDetailVM;
        View viewFindViewById = view.findViewById(R.id.pf1);
        this.LLILLJJLI = viewFindViewById;
        C422820Gi0 c422820Gi0 = (C422820Gi0) view.findViewById(R.id.pe1);
        this.LLILLL = c422820Gi0;
        this.LLILZ = (TextView) view.findViewById(R.id.pdu);
        this.LLILZIL = (RemoteImageView) view.findViewById(R.id.pdw);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.pds);
        this.LLILZLL = c197039127h;
        this.LLIZ = (TuxIconView) view.findViewById(R.id.pdk);
        TextView textView = (TextView) view.findViewById(R.id.vyh);
        this.LLIZLLLIL = textView;
        ImageView imageView = (ImageView) view.findViewById(R.id.vyg);
        this.LLJ = imageView;
        C1905460zgW.LIZ(viewFindViewById);
        C1905460zgW.LIZ(textView);
        C1905460zgW.LIZ(imageView);
        C10VP.LIZIZ(c422820Gi0);
        c197039127h.getLayoutParams().width = C1905460zgW.LIZIZ(this.mContext);
        C786410Ut5.U8(c197039127h, this);
        C786410Ut5.Q7(imageView, this);
        C786410Ut5.T7(textView, this);
        C786410Ut5.I7(this, viewFindViewById);
        C786410Ut5.B9(c422820Gi0, this);
        this.mIsRTL = C444960Hcc.LIZJ(this.mContext);
    }
}
