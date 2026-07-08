package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C808003Dq {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.038f, android.view.View] */
    public static final C7939038f LIZJ(final Context context, C7979039t c7979039t) {
        int i;
        String priceStr;
        Integer priceTextColor;
        Integer priceTextFont;
        String priceStr2;
        Integer priceTextColor2;
        Integer priceTextFont2;
        boolean zBooleanValue;
        C19ME c19me;
        final int i2 = c7979039t.LIZLLL;
        final AttributeSet attributeSet = null;
        final int i3 = 0;
        ?? r3 = new ConstraintLayout(context, attributeSet, i3, i2) { // from class: X.038f
            public final int LL;
            public TuxTextView LLILLJJLI;
            public TuxTextView LLILLL;
            public LinearLayout LLILZ;

            public final TuxTextView getUsOrderSummaryLayerExplainTextFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.us_order_summary_layer_explain_text);
                    this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            public final LinearLayout getUsOrderSummaryLayerItemContainerFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILZ;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.us_order_summary_layer_item_container);
                    this.LLILZ = (LinearLayout) callbackFindViewById;
                }
                return (LinearLayout) callbackFindViewById;
            }

            public final TuxTextView getUsOrderSummaryLayerItemTitleFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILLL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.us_order_summary_layer_item_title);
                    this.LLILLL = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            public final int getScene() {
                return this.LL;
            }

            public final void setUsOrderSummaryLayerExplainTextFromXml(TuxTextView tuxTextView) {
                this.LLILLJJLI = tuxTextView;
            }

            public final void setUsOrderSummaryLayerItemContainerFromXml(LinearLayout linearLayout) {
                this.LLILZ = linearLayout;
            }

            public final void setUsOrderSummaryLayerItemTitleFromXml(TuxTextView tuxTextView) {
                this.LLILLL = tuxTextView;
            }

            {
                int i4;
                super(context, attributeSet, i3);
                this.LL = i2;
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b2x, this, true);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                if (i2 == 1) {
                    i4 = 48;
                } else {
                    i4 = 32;
                }
                viewTd.setPadding(iLIZIZ, iLIZIZ2, iLIZIZ3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4))));
            }
        };
        C21717219z0.LIZJ(r3.getUsOrderSummaryLayerExplainTextFromXml(), c7979039t.LIZ, false);
        C21717219z0.LIZJ(r3.getUsOrderSummaryLayerItemTitleFromXml(), c7979039t.LIZIZ, false);
        if (c7979039t.LIZLLL == 100) {
            ViewGroup.LayoutParams layoutParams = r3.getUsOrderSummaryLayerItemContainerFromXml().getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                C958103op.LIZ.getClass();
                c19me.goneTopMargin = C958103op.LJIILL;
            }
        }
        List<BillItem> list = c7979039t.LIZJ;
        if (list != null) {
            int i4 = 0;
            for (BillItem billItem : list) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    BillItem billItem2 = billItem;
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    if (i4 == 0) {
                        C958103op.LIZ.getClass();
                        i = C958103op.LJIIIIZZ;
                    } else {
                        C958103op.LIZ.getClass();
                        i = C958103op.LJIILIIL;
                    }
                    layoutParams2.topMargin = i;
                    LinearLayout usOrderSummaryLayerItemContainerFromXml = r3.getUsOrderSummaryLayerItemContainerFromXml();
                    C808203Ds c808203Ds = new C808203Ds(r3.getContext());
                    c808203Ds.setTitleWithConfig(new C21717319z1(billItem2.itemName, billItem2.itemTextColor, billItem2.itemTextFont, null, null, 24));
                    Price price = billItem2.itemPrice;
                    if (price != null) {
                        priceStr = price.getPriceStr();
                    } else {
                        priceStr = null;
                    }
                    Price price2 = billItem2.itemPrice;
                    if (price2 != null) {
                        priceTextColor = price2.getPriceTextColor();
                    } else {
                        priceTextColor = null;
                    }
                    Price price3 = billItem2.itemPrice;
                    if (price3 != null) {
                        priceTextFont = price3.getPriceTextFont();
                    } else {
                        priceTextFont = null;
                    }
                    c808203Ds.setPriceWithConfig(new C21717319z1(priceStr, priceTextColor, priceTextFont, null, null, 24));
                    Price price4 = billItem2.originalPrice;
                    if (price4 != null) {
                        priceStr2 = price4.getPriceStr();
                    } else {
                        priceStr2 = null;
                    }
                    Price price5 = billItem2.originalPrice;
                    if (price5 != null) {
                        priceTextColor2 = price5.getPriceTextColor();
                    } else {
                        priceTextColor2 = null;
                    }
                    Price price6 = billItem2.originalPrice;
                    if (price6 != null) {
                        priceTextFont2 = price6.getPriceTextFont();
                    } else {
                        priceTextFont2 = null;
                    }
                    c808203Ds.setOriginPriceWithConfig(new C21717319z1(priceStr2, priceTextColor2, priceTextFont2, null, null, 24));
                    Boolean bool = billItem2.hasDivider;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    c808203Ds.setSeparatorWithConfig(zBooleanValue);
                    usOrderSummaryLayerItemContainerFromXml.addView(c808203Ds, layoutParams2);
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return r3;
    }

    public static final View LIZ(Context context, String str, List list) {
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        C426750GoL.LJIIL(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
        C786410Ut5.LJJJJJL(linearLayout);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ECRichText eCRichText = (ECRichText) it2.next();
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                C03C8.LIZJ(tuxTextView, eCRichText, str, null);
                C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-1, -2));
                C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), tuxTextView);
                linearLayout.addView(tuxTextView);
            }
        }
        return linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7971039l LIZIZ(android.content.Context r15, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription r16, java.lang.Boolean r17) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C808003Dq.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription, java.lang.Boolean):X.039l");
    }

    public static final TuxTextView LJ(Context context, int i, int i2, String str) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(str);
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        tuxTextView.setTextColorRes(i);
        tuxTextView.setTuxFont(i2);
        return tuxTextView;
    }

    public static TuxSheet LIZLLL(View view, String str, boolean z, final InterfaceC1631620sYq interfaceC1631620sYq, int i) {
        boolean z2;
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        final InterfaceC1631620sYq interfaceC1631620sYq2 = null;
        if ((i & 32) != 0) {
            interfaceC1631620sYq = null;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZLLL = z;
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        if (z2) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS545S0100000_1(view, 1558));
            c0om1.LIZIZ(c1251150ifB);
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIII = view;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.03E1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
                String str2;
                String name;
                String str3 = TuxSheet._pnsPageId;
                boolean zLJFF = Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), C343980De8.LIZ);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    boolean z3 = false;
                    anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                        z3 = true;
                    }
                    String name2 = IActivityStackDependencyService.class.getName();
                    if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name2, name, z3);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
                }
                if (((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround()) {
                    str2 = "close";
                } else {
                    str2 = "return";
                }
                InterfaceC1631620sYq<Boolean, Long, String, Unit> interfaceC1631620sYq3 = interfaceC1631620sYq;
                if (interfaceC1631620sYq3 != null) {
                    interfaceC1631620sYq3.invoke(Boolean.valueOf(zLJFF), Long.valueOf(jElapsedRealtime), str2);
                }
                InterfaceC1631620sYq<AbstractC343940De4, Long, String, Unit> interfaceC1631620sYq4 = interfaceC1631620sYq2;
                if (interfaceC1631620sYq4 != null) {
                    interfaceC1631620sYq4.invoke(C1391190mJ3.LJIIJJI(dialogInterface), Long.valueOf(jElapsedRealtime), str2);
                }
            }
        };
        return tuxSheet2;
    }

    public static void LJFF(TuxSheet tuxSheet, FragmentManager fragmentManager, String str, Function0 function0, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) == 0 && function0 != null) {
            function0.invoke();
        }
        tuxSheet.show(fragmentManager, str);
    }
}
