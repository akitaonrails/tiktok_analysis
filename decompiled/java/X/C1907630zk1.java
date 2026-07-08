package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BusinessAccountNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.0zk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907630zk1 extends C1906860zim {
    public final NotificationDetailVM LL;
    public BaseNotice LLILLJJLI;
    public final View LLILLL;
    public final C422820Gi0 LLILZ;
    public final TextView LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;

    @Override // X.AbstractC1906850zil, X.ViewOnClickListenerC1906680ziU
    public final void onAttached() {
        super.onAttached();
        BaseNotice baseNotice = this.LLILLJJLI;
        this.LL.UJ(baseNotice, new AwS429S0200000_28(baseNotice, this, 78));
    }

    public final void N5(BaseNotice baseNotice) {
        String str;
        BusinessAccountNotice businessAccountNotice;
        String str2;
        this.LLILLJJLI = baseNotice;
        this.LLILZ.setImageURI(C1325880kbi.LIZIZ(R.drawable.ai2));
        this.LLILZIL.setText("");
        C786410Ut5.LJLLLLLL(8, this.LLILZLL);
        C786410Ut5.LJLLLLLL(8, this.LLIZ);
        BusinessAccountNotice businessAccountNotice2 = baseNotice.businessAccountNotice;
        String str3 = null;
        if (businessAccountNotice2 != null) {
            str = businessAccountNotice2.title;
            str3 = businessAccountNotice2.content;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str3)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.mIsRTL) {
            spannableStringBuilder.append((char) 8296);
        }
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
            if (!TextUtils.isEmpty(str3)) {
                spannableStringBuilder.append(": ");
            }
            C786410Ut5.q2(spannableStringBuilder, new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
        }
        if (!TextUtils.isEmpty(str3)) {
            spannableStringBuilder.append((CharSequence) str3);
        }
        if (this.mIsRTL) {
            spannableStringBuilder.append((char) 8297);
        }
        BaseNotice baseNotice2 = this.LLILLJJLI;
        if (baseNotice2 != null && (businessAccountNotice = baseNotice2.businessAccountNotice) != null && (str2 = businessAccountNotice.schemaUrl) != null && C703302op.LIZ(str2)) {
            C1907170zjH.LIZ(this.LLILZIL, spannableStringBuilder, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(132.0f, this.mContext)), null, null);
            C786410Ut5.LJLLLLLL(0, this.LLIZ);
        } else {
            addCreateTimeSpan(spannableStringBuilder, baseNotice);
            this.LLILZIL.setText(spannableStringBuilder);
            C786410Ut5.LJLLLLLL(8, this.LLIZ);
        }
    }

    @Override // X.ViewOnClickListenerC1906680ziU, android.view.View.OnClickListener
    public final void onClick(View view) {
        BusinessAccountNotice businessAccountNotice;
        String str;
        String str2;
        String templateId;
        Long lValueOf;
        String accountType;
        Long lValueOf2;
        BaseNotice baseNotice;
        BusinessAccountNotice businessAccountNotice2;
        BaseNotice baseNotice2 = this.LLILLJJLI;
        int i = 1;
        if (baseNotice2 != null && (businessAccountNotice = baseNotice2.businessAccountNotice) != null && (str = businessAccountNotice.schemaUrl) != null && C703302op.LIZ(str)) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    if (C0OBG.LIZIZ(view)) {
                        return;
                    }
                    Context context = this.mContext;
                    BaseNotice baseNotice3 = this.LLILLJJLI;
                    if (baseNotice3 == null || (businessAccountNotice2 = baseNotice3.businessAccountNotice) == null || (str2 = businessAccountNotice2.schemaUrl) == null) {
                        str2 = "";
                    }
                    SmartRouter.buildRoute(context, str2).open();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
                    c2344009Gk.LJIIIIZZ("tab_name", "all");
                    BaseNotice baseNotice4 = this.LLILLJJLI;
                    String str3 = null;
                    if (baseNotice4 != null) {
                        templateId = baseNotice4.getTemplateId();
                    } else {
                        templateId = null;
                    }
                    c2344009Gk.LJIIIIZZ("template_id", templateId);
                    if (C1902710zc5.LIZJ() || (baseNotice = this.LLILLJJLI) == null || !baseNotice.hasRead) {
                        i = 0;
                    }
                    c2344009Gk.LIZJ(i, "is_read");
                    c2344009Gk.LIZJ(0, "is_together");
                    BaseNotice baseNotice5 = this.LLILLJJLI;
                    if (baseNotice5 != null) {
                        lValueOf = Long.valueOf(baseNotice5.createTime);
                    } else {
                        lValueOf = null;
                    }
                    c2344009Gk.LJ(lValueOf, "message_time");
                    c2344009Gk.LIZJ(getLayoutPosition(), "client_order");
                    c2344009Gk.LJIIIIZZ("action_type", "click");
                    BaseNotice baseNotice6 = this.LLILLJJLI;
                    if (baseNotice6 != null) {
                        accountType = baseNotice6.getAccountType();
                    } else {
                        accountType = null;
                    }
                    c2344009Gk.LJIIIIZZ("account_type", accountType);
                    BaseNotice baseNotice7 = this.LLILLJJLI;
                    if (baseNotice7 != null) {
                        lValueOf2 = Long.valueOf(baseNotice7.taskId);
                    } else {
                        lValueOf2 = null;
                    }
                    c2344009Gk.LJ(lValueOf2, "task_id");
                    BaseNotice baseNotice8 = this.LLILLJJLI;
                    if (baseNotice8 != null) {
                        str3 = baseNotice8.nid;
                    }
                    c2344009Gk.LJIIIIZZ("content_id", str3);
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

    public C1907630zk1(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        this.LL = notificationDetailVM;
        View viewFindViewById = view.findViewById(R.id.pf1);
        this.LLILLL = viewFindViewById;
        C422820Gi0 c422820Gi0 = (C422820Gi0) view.findViewById(R.id.pe1);
        this.LLILZ = c422820Gi0;
        this.LLILZIL = (TextView) view.findViewById(R.id.pdu);
        this.LLILZLL = view.findViewById(R.id.lq3);
        this.LLIZ = view.findViewById(R.id.pdk);
        C786410Ut5.I7(this, viewFindViewById);
        C786410Ut5.B9(c422820Gi0, this);
        C1905460zgW.LIZ(viewFindViewById);
        C10VP.LIZIZ(c422820Gi0);
    }
}
