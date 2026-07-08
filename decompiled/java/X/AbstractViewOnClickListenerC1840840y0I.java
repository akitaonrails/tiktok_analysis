package X;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.notification.aggregate.data.BulletinAggregateNotice;
import com.ss.android.ugc.aweme.notification.aggregate.data.TemplateAggregateUiInfo;
import mf.a;

/* JADX INFO: renamed from: X.0y0I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractViewOnClickListenerC1840840y0I extends ConstraintLayout implements View.OnClickListener {
    public InterfaceC1840850y0J LL;
    public BulletinAggregateNotice LLILLJJLI;
    public TemplateAggregateUiInfo LLILLL;

    public void e0() {
    }

    public abstract String i0(View view);

    public abstract boolean j0(View view);

    public final InterfaceC1840850y0J getDelegate() {
        return this.LL;
    }

    public final BulletinAggregateNotice getInviteNotice() {
        return this.LLILLJJLI;
    }

    public final TemplateAggregateUiInfo getUiInfo() {
        return this.LLILLL;
    }

    public final void l0(String str) {
        Context contextLIZ;
        String str2;
        String str3;
        if (str.length() == 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131832569);
            c1389890mGx.LJIIJJI();
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("SimpleNoticeCommonView", "schema url is null");
            return;
        }
        Uri uri = UriProtector.parse(str);
        Context context = getContext();
        if (context == null || (contextLIZ = C1388190mED.LIZ(context)) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(contextLIZ, str);
        InterfaceC1840850y0J interfaceC1840850y0J = this.LL;
        String str4 = "activity_message_page";
        if (interfaceC1840850y0J != null) {
            interfaceC1840850y0J.getEnterFrom();
            str2 = "activity_message_page";
        } else {
            str2 = null;
        }
        smartRouteBuildRoute.withParam("enter_from", str2);
        InterfaceC1840850y0J interfaceC1840850y0J2 = this.LL;
        if (interfaceC1840850y0J2 != null) {
            interfaceC1840850y0J2.getEnterFrom();
            str3 = "activity_message_page";
        } else {
            str3 = null;
        }
        smartRouteBuildRoute.withParam("refer", str3);
        InterfaceC1840850y0J interfaceC1840850y0J3 = this.LL;
        if (interfaceC1840850y0J3 != null) {
            interfaceC1840850y0J3.getEnterFrom();
        } else {
            str4 = null;
        }
        smartRouteBuildRoute.withParam("previous_page", str4);
        String strLIZIZ = C1907940zkW.LIZIZ(uri, "enter_method");
        if (strLIZIZ == null) {
            InterfaceC1840850y0J interfaceC1840850y0J4 = this.LL;
            strLIZIZ = "click";
            if (interfaceC1840850y0J4 != null) {
                interfaceC1840850y0J4.getEnterMethod();
            }
        }
        smartRouteBuildRoute.withParam("enter_method", strLIZIZ);
        smartRouteBuildRoute.open();
        e0();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        if (j0(view)) {
            InterfaceC1840850y0J interfaceC1840850y0J = this.LL;
            if (interfaceC1840850y0J != null) {
                interfaceC1840850y0J.LJJLIIIJLLLLLLLZ(i0(view));
                return;
            }
            return;
        }
        BulletinAggregateNotice bulletinAggregateNotice = this.LLILLJJLI;
        if (bulletinAggregateNotice != null && (str = bulletinAggregateNotice.schemeUrl) != null) {
            InterfaceC1840850y0J interfaceC1840850y0J2 = this.LL;
            if (interfaceC1840850y0J2 != null) {
                interfaceC1840850y0J2.LJJLIIIJLLLLLLLZ(str);
            }
            l0(str);
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131832569);
        c1389890mGx.LJIIJJI();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("SimpleNoticeCommonView", "schema url is null");
    }

    public final void setDelegate(InterfaceC1840850y0J interfaceC1840850y0J) {
        this.LL = interfaceC1840850y0J;
    }

    public final void setInviteNotice(BulletinAggregateNotice bulletinAggregateNotice) {
        this.LLILLJJLI = bulletinAggregateNotice;
    }

    public final void setUiInfo(TemplateAggregateUiInfo templateAggregateUiInfo) {
        this.LLILLL = templateAggregateUiInfo;
    }

    public AbstractViewOnClickListenerC1840840y0I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public void h0(BulletinAggregateNotice bulletinAggregateNotice, C1840830y0H c1840830y0H) {
        TemplateAggregateUiInfo templateAggregateUiInfo;
        View.OnClickListener fVar;
        this.LLILLJJLI = bulletinAggregateNotice;
        if (bulletinAggregateNotice != null) {
            templateAggregateUiInfo = bulletinAggregateNotice.uiInfo;
        } else {
            templateAggregateUiInfo = null;
        }
        this.LLILLL = templateAggregateUiInfo;
        this.LL = c1840830y0H;
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public AbstractViewOnClickListenerC1840840y0I(Context context, AttributeSet attributeSet, Object obj) {
        super(context, attributeSet, 0);
    }

    public AbstractViewOnClickListenerC1840840y0I(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
