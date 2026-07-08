package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.touchpoint.api.model.Button;
import com.bytedance.touchpoint.api.model.Content;
import com.bytedance.touchpoint.api.model.RetentionPopup;
import com.bytedance.touchpoint.api.model.Title;
import com.bytedance.touchpoint.api.service.IMultiDomainService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zVQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898580zVQ extends C214906198m {
    public final Context LL;
    public RetentionPopup LLILLJJLI;

    public C1898580zVQ(Context context) {
        String str;
        long jLJII;
        int iLJIIIZ;
        Title title;
        String str2;
        Title title2;
        String str3;
        InterfaceC1898200zUo interfaceC1898200zUoLIZJ;
        InterfaceC1898200zUo interfaceC1898200zUoLIZJ2;
        String str4;
        super(context);
        this.LL = context;
        setContentView(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fww, null, false));
        setWidth(-1);
        setHeight(-1);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        this.LLILLJJLI = new RetentionPopup("https://sf16-sg.tiktokcdn.com/obj/eden-sg/nulozuhbfvhj/retention_image.png", "#CC000000", new Title("Wait! You have %d more seconds to earn %d points.", "#FFFFFF", "", ""), new Button("#FE2C55", new Content("Keep watching", "#FFFFFF", 12), null), new Button("#FE2C55", new Content("Close video", "#FFFFFF", 12), null), new Title("Don't show this message again", "#FFFFFF", "", ""));
        View contentView = getContentView();
        C0SVC c0svc = C0SVC.LIZ;
        RetentionPopup retentionPopup = this.LLILLJJLI;
        if (retentionPopup != null) {
            str = retentionPopup.bgColor;
        } else {
            str = null;
        }
        contentView.setBackgroundColor(C0SVC.LIZIZ(c0svc, str));
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            RetentionPopup retentionPopup2 = this.LLILLJJLI;
            if (retentionPopup2 != null) {
                str4 = retentionPopup2.topImage;
            } else {
                str4 = null;
            }
            interfaceC1897260zTILIZIZ.LJII(str4, (ImageView) getContentView().findViewById(R.id.te3), null);
        }
        TextView textView = (TextView) getContentView().findViewById(R.id.te7);
        String string = textView.getContext().getString(2131821739);
        C1898640zVW.LIZ.getClass();
        IMultiDomainService iMultiDomainService = (IMultiDomainService) PluggableExtentionKt.pluggableSpi$default(IMultiDomainService.class, false, false, false, 14, null);
        if (iMultiDomainService != null && (interfaceC1898200zUoLIZJ2 = iMultiDomainService.LIZJ()) != null) {
            String str5 = C1898640zVW.LJ;
            jLJII = interfaceC1898200zUoLIZJ2.LJII(str5 == null ? "" : str5);
        } else {
            jLJII = 0;
        }
        IMultiDomainService iMultiDomainService2 = (IMultiDomainService) PluggableExtentionKt.pluggableSpi$default(IMultiDomainService.class, false, false, false, 14, null);
        if (iMultiDomainService2 != null && (interfaceC1898200zUoLIZJ = iMultiDomainService2.LIZJ()) != null) {
            String str6 = C1898640zVW.LJ;
            iLJIIIZ = interfaceC1898200zUoLIZJ.LJIIIZ(str6 != null ? str6 : "");
        } else {
            iLJIIIZ = 0;
        }
        textView.setText(u.LJJIFFI(u.LJJIFFI(string, "{number1}", String.valueOf(jLJII), false), "{number2}", String.valueOf(iLJIIIZ), false));
        RetentionPopup retentionPopup3 = this.LLILLJJLI;
        textView.setTextColor(C0SVC.LIZIZ(c0svc, (retentionPopup3 == null || (title2 = retentionPopup3.title) == null || (str3 = title2.color) == null) ? "#FFFFFF" : str3));
        ((TextView) getContentView().findViewById(R.id.te5)).setText(context.getString(2131821737));
        ((TextView) getContentView().findViewById(R.id.te2)).setText(context.getString(2131821738));
        TextView textView2 = (TextView) getContentView().findViewById(R.id.te1);
        textView2.setText(textView2.getContext().getString(2131821736));
        RetentionPopup retentionPopup4 = this.LLILLJJLI;
        textView2.setTextColor(C0SVC.LIZIZ(c0svc, (retentionPopup4 == null || (title = retentionPopup4.desc) == null || (str2 = title.color) == null) ? "#FFFFFF" : str2));
        View viewFindViewById = getContentView().findViewById(R.id.dyd);
        int iLIZ = (C497820Jfg.LIZ(context) - ((C497820Jfg.LIZIZ(context) + (viewFindViewById != null ? viewFindViewById.getMeasuredHeight() : 0)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)))) / 3;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getContentView().findViewById(R.id.te3).getLayoutParams();
        marginLayoutParams.height = C497820Jfg.LIZIZ(context);
        marginLayoutParams.topMargin = iLIZ;
        C786410Ut5.c7((C1322110kVd) getContentView().findViewById(R.id.te3), marginLayoutParams);
        C786410Ut5.U8((C197039127h) getContentView().findViewById(R.id.te5), new ACListenerS162S0100000_28(this, 163));
        C786410Ut5.U8((C197039127h) getContentView().findViewById(R.id.te2), new ACListenerS162S0100000_28(this, 164));
    }
}
