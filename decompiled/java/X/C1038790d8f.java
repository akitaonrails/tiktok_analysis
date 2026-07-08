package X;

import Y.ACListenerS151S0100000_16;
import Y.ACListenerS46S0201000_16;
import Y.ARunnableS22S0201000_16;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0d8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038790d8f {
    public static C0P0T LIZIZ;
    public static final C1038790d8f LIZ = new C1038790d8f();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(479));

    public static final void LIZIZ() {
        C0P0T c0p0t = LIZIZ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public static String LIZ(Long l) {
        if (l != null) {
            l.longValue();
            return new SimpleDateFormat("MMM dd · HH:mm", Locale.ENGLISH).format(new Date(l.longValue()));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.0d8h, android.view.View] */
    public static final void LIZJ(final Context context, final SparkContext sparkContext, final int i, final TuxIconView tuxIconView, final int i2) {
        final InterfaceC1036110d4L interfaceC1036110d4L;
        C1035880d3y c1035880d3y;
        String uid;
        InterfaceC1036110d4L interfaceC1036110d4L2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        final InterfaceC1036110d4L interfaceC1036110d4L3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        User currentUser;
        IAdWebUIUtils iAdWebUIUtils = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
        if (iAdWebUIUtils != null && iAdWebUIUtils.LIZ(sparkContext, null)) {
            return;
        }
        if (sparkContext != null) {
            interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class);
            c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
        } else {
            interfaceC1036110d4L = null;
            c1035880d3y = null;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            uid = "default";
        }
        if (!((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LJIJJLI(c1035880d3y) && i == 0) {
            return;
        }
        if (c1035880d3y != null && c1035880d3y.getEfficiencyComponents() != null) {
            return;
        }
        final ?? r3 = new FrameLayout(context) { // from class: X.0d8h
            public TuxTextView LL;
            public TuxTextView LLILLJJLI;
            public TuxTextView LLILLL;
            public ImageView LLILZ;
            public TuxIconView LLILZIL;
            public C197039127h LLILZLL;

            public final TuxIconView getIabHistoryGuideCloseFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILZIL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.ju3);
                    this.LLILZIL = (TuxIconView) callbackFindViewById;
                }
                return (TuxIconView) callbackFindViewById;
            }

            public final TuxTextView getIabHistoryGuideDescFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.ju4);
                    this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            public final ImageView getIabHistoryGuideImageFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILZ;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.ju5);
                    this.LLILZ = (ImageView) callbackFindViewById;
                }
                return (ImageView) callbackFindViewById;
            }

            public final C197039127h getIabHistoryGuideOkFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILZLL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.ju6);
                    this.LLILZLL = (C197039127h) callbackFindViewById;
                }
                return (C197039127h) callbackFindViewById;
            }

            public final TuxTextView getIabHistoryGuideTitleFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.ju7);
                    this.LL = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            public final TuxTextView getIabHistoryLearnMoreGuideDescFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILLL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.ju8);
                    this.LLILLL = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            {
                super(context, null, 0);
                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ce3, this, true);
            }

            public final void setIabHistoryGuideCloseFromXml(TuxIconView tuxIconView2) {
                this.LLILZIL = tuxIconView2;
            }

            public final void setIabHistoryGuideDescFromXml(TuxTextView tuxTextView) {
                this.LLILLJJLI = tuxTextView;
            }

            public final void setIabHistoryGuideImageFromXml(ImageView imageView) {
                this.LLILZ = imageView;
            }

            public final void setIabHistoryGuideOkFromXml(C197039127h c197039127h) {
                this.LLILZLL = c197039127h;
            }

            public final void setIabHistoryGuideTitleFromXml(TuxTextView tuxTextView) {
                this.LL = tuxTextView;
            }

            public final void setIabHistoryLearnMoreGuideDescFromXml(TuxTextView tuxTextView) {
                this.LLILLL = tuxTextView;
            }
        };
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = r3;
        tuxSheet.LLJJIJIL = null;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(0);
        final C1035880d3y c1035880d3y2 = c1035880d3y;
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.0d4C
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                InterfaceC1036110d4L interfaceC1036110d4L4 = interfaceC1036110d4L;
                if (interfaceC1036110d4L4 != null) {
                    interfaceC1036110d4L4.LJIJJ(i);
                }
                if (i == 0) {
                    C1035880d3y c1035880d3y3 = c1035880d3y2;
                    if (c1035880d3y3 != null) {
                        c1035880d3y3.setShouldShowHistoryTips(true);
                    }
                    TuxIconView tuxIconView2 = tuxIconView;
                    int i3 = i2;
                    SparkContext sparkContext2 = sparkContext;
                    C1038790d8f.LIZ.getClass();
                    C786410Ut5.LJLIIL(300L, (Handler) C1038790d8f.LIZJ.getValue(), new ARunnableS22S0201000_16(i3, sparkContext2, tuxIconView2, 5));
                }
            }
        };
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = onDismissListener;
        if (sparkContext != null) {
            interfaceC1036110d4L2 = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class);
        } else {
            interfaceC1036110d4L2 = null;
        }
        r3.getIabHistoryGuideTitleFromXml().setTuxFont(123);
        if (i == 0) {
            r3.getIabHistoryGuideTitleFromXml().setText(r3.getContext().getString(2131821693));
            C786410Ut5.LLLLZLL(r3.getIabHistoryGuideDescFromXml(), 0);
            C786410Ut5.LLLLZLL(r3.getIabHistoryLearnMoreGuideDescFromXml(), 8);
            TuxTextView iabHistoryGuideDescFromXml = r3.getIabHistoryGuideDescFromXml();
            if (sparkContext != null) {
                interfaceC1036110d4L3 = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class);
            } else {
                interfaceC1036110d4L3 = null;
            }
            String string = r3.getContext().getString(2131821696);
            String string2 = r3.getContext().getString(2131821698, string);
            int iLJJJ = a0.LJJJ(string2, string, 0, false, 6) - 1;
            int length = string.length() + iLJJJ + 1;
            C444910HcX c444910HcX = new C444910HcX(string2);
            c444910HcX.LIZ(31);
            C786410Ut5.s2(c444910HcX, new AbstractC426530Gnz() { // from class: X.0d8g
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C1038790d8f.LIZJ(getContext(), sparkContext, 1, null, -1);
                    InterfaceC1036110d4L interfaceC1036110d4L4 = interfaceC1036110d4L3;
                    if (interfaceC1036110d4L4 != null) {
                        interfaceC1036110d4L4.LJJIL();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(31);
                    textPaint.setTypeface(c444890HcV.getTypeface());
                    textPaint.setUnderlineText(false);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, getContext());
                    if (numLIZJ != null) {
                        textPaint.setColor(numLIZJ.intValue());
                    }
                }
            }, iLJJJ + 1, length, 33);
            iabHistoryGuideDescFromXml.setText(c444910HcX);
            r3.getIabHistoryGuideDescFromXml().setMovementMethod(C431260Gvc.LIZ);
            ImageView iabHistoryGuideImageFromXml = r3.getIabHistoryGuideImageFromXml();
            ViewGroup.LayoutParams layoutParams = r3.getIabHistoryGuideImageFromXml().getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            } else {
                layoutParams = null;
            }
            C786410Ut5.c6(iabHistoryGuideImageFromXml, layoutParams);
            ImageView iabHistoryGuideImageFromXml2 = r3.getIabHistoryGuideImageFromXml();
            ViewGroup.LayoutParams layoutParams2 = r3.getIabHistoryGuideImageFromXml().getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                marginLayoutParams2 = null;
            }
            C786410Ut5.c6(iabHistoryGuideImageFromXml2, marginLayoutParams2);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.x4;
            r3.getIabHistoryGuideImageFromXml().setImageDrawable(c0hti.LIZ(r3.getContext()));
        } else {
            r3.getIabHistoryGuideTitleFromXml().setText(r3.getContext().getString(2131821694));
            C786410Ut5.LLLLZLL(r3.getIabHistoryGuideDescFromXml(), 8);
            C786410Ut5.LLLLZLL(r3.getIabHistoryLearnMoreGuideDescFromXml(), 0);
            r3.getIabHistoryLearnMoreGuideDescFromXml().setText(r3.getContext().getString(2131821695));
            ImageView iabHistoryGuideImageFromXml3 = r3.getIabHistoryGuideImageFromXml();
            ViewGroup.LayoutParams layoutParams3 = r3.getIabHistoryGuideImageFromXml().getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280));
                layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(239));
            } else {
                layoutParams3 = null;
            }
            C786410Ut5.c6(iabHistoryGuideImageFromXml3, layoutParams3);
            ImageView iabHistoryGuideImageFromXml4 = r3.getIabHistoryGuideImageFromXml();
            ViewGroup.LayoutParams layoutParams4 = r3.getIabHistoryGuideImageFromXml().getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.c6(iabHistoryGuideImageFromXml4, marginLayoutParams);
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse((String) C2507509s9.LIZ.getValue()));
            c1331670kl3LJI.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJI.LJJIJL(r3.getContext());
            c1331670kl3LJI.LJJI(r3.getIabHistoryGuideImageFromXml());
            C786410Ut5.h3(c1331670kl3LJI);
        }
        C786410Ut5.a9(r3.getIabHistoryGuideCloseFromXml(), new ACListenerS151S0100000_16(tuxSheet2, 132));
        C786410Ut5.U8(r3.getIabHistoryGuideOkFromXml(), new ACListenerS46S0201000_16(tuxSheet2, interfaceC1036110d4L2, i, 0));
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxSheet2.showNow(supportFragmentManager, "iab_history_guide");
            if (interfaceC1036110d4L != null) {
                interfaceC1036110d4L.LJJJJ(i);
            }
            if (i == 0) {
                Keva.getRepo("iab_history_guide").storeBoolean(uid, true);
            }
        }
    }
}
