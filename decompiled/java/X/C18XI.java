package X;

import Y.ACListenerS166S0100000_32;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import irm.AkS98S0100000_32;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18XI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18XI extends AbstractC1664490tPr<C18XL, C18XQ> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 591));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 589));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 587));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 592));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 590));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 588));

    public final C1295960jpS LLLLLJIL() {
        return (C1295960jpS) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C197039127h LLLLLJLJLL() {
        return (C197039127h) this.LLJJL.getValue();
    }

    public final C197039127h LLLLLL() {
        return (C197039127h) this.LLJJJJLIIL.getValue();
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C18T2.LIZ.getClass();
        C18T2.LIZLLL("ai_chat_preview_boot_duration");
    }

    public static void LLLLLLIL(C197039127h c197039127h) {
        Context context;
        if (c197039127h != null && (context = c197039127h.getContext()) != null) {
            Object tag = c197039127h.getTag(R.id.f7m);
            if ((tag instanceof C1856690yPr) && tag != null) {
                return;
            }
            C1856690yPr c1856690yPr = new C1856690yPr(context, R.raw.icon_spinner_thin);
            c197039127h.setTag(R.id.f7m, c1856690yPr);
            c197039127h.setButtonStartIconDrawable(c1856690yPr);
            c1856690yPr.LJIIIZ();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        super.onActivityCreated(bundle);
        C1295960jpS c1295960jpSLLLLLJIL = LLLLLJIL();
        if (c1295960jpSLLLLLJIL != null) {
            c1295960jpSLLLLLJIL.setAnimation(R.raw.tux_lottie_common_creation_ailoading_oral_large);
        }
        C1295960jpS c1295960jpSLLLLLJIL2 = LLLLLJIL();
        if (c1295960jpSLLLLLJIL2 != null) {
            c1295960jpSLLLLLJIL2.setProgress(0.0f);
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLJJJJJIL.getValue();
        if (tuxIconView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zh);
            Drawable drawableLIZ = c384050F3z.LIZ(tuxIconView.getContext());
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_x_mark;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a00);
            tuxIconView.setImageDrawable(new LayerDrawable(new Drawable[]{drawableLIZ, c419910GdJ.LIZ(tuxIconView.getContext())}));
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LLJJJJJIL.getValue();
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS166S0100000_32(this, 82));
        }
        C197039127h c197039127hLLLLLL = LLLLLL();
        if (c197039127hLLLLLL != null) {
            c197039127hLLLLLL.setText(C21291518Tx.LJ(EnumC21291418Tw.DOWNLOAD_BUTTON_TEXT, new Object[0]));
            c197039127hLLLLLL.LJJJJL(AFwS228S0000000_1.get$arr$(576));
            c197039127hLLLLLL.LJJLI(false);
        }
        C197039127h c197039127hLLLLLL2 = LLLLLL();
        if (c197039127hLLLLLL2 != null) {
            C786410Ut5.U8(c197039127hLLLLLL2, new AkS98S0100000_32(this, 2));
        }
        C197039127h c197039127hLLLLLJLJLL = LLLLLJLJLL();
        if (c197039127hLLLLLJLJLL != null) {
            Integer num = LLLLILI().LIZ.LJII;
            C21291618Ty c21291618Ty = EnumC21291418Tw.Companion;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 2131825514;
            }
            c21291618Ty.getClass();
            c197039127hLLLLLJLJLL.setText(C21291518Tx.LJ(C21291618Ty.LIZ(iIntValue), new Object[0]));
            c197039127hLLLLLJLJLL.setIconTintColorRes(R.attr.z_);
            c197039127hLLLLLJLJLL.setTextColorRes(R.attr.z_);
            int[] iArr = new int[3];
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cq, c197039127hLLLLLJLJLL.getContext());
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            iArr[0] = iIntValue2;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cc, c197039127hLLLLLJLJLL.getContext());
            if (numLIZJ2 != null) {
                iIntValue3 = numLIZJ2.intValue();
            } else {
                iIntValue3 = 0;
            }
            iArr[1] = iIntValue3;
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, c197039127hLLLLLJLJLL.getContext());
            if (numLIZJ3 != null) {
                iIntValue4 = numLIZJ3.intValue();
            } else {
                iIntValue4 = 0;
            }
            iArr[2] = iIntValue4;
            c197039127hLLLLLJLJLL.LJJJJL(new AwS372S0200000_6(c197039127hLLLLLJLJLL, iArr, 112));
            c197039127hLLLLLJLJLL.LJJLI(false);
            Integer num2 = LLLLILI().LIZ.LJI;
            if (num2 != null) {
                iIntValue5 = num2.intValue();
            } else {
                iIntValue5 = R.raw.icon_post;
            }
            c197039127hLLLLLJLJLL.setButtonStartIcon(Integer.valueOf(iIntValue5));
        }
        ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct = new ViewTreeObserverOnGlobalLayoutListenerC1864770yct(this, 9);
        C197039127h c197039127hLLLLLL3 = LLLLLL();
        if (c197039127hLLLLLL3 != null && (viewTreeObserver = c197039127hLLLLLL3.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1864770yct);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1864770yct, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C197039127h c197039127hLLLLLJLJLL2 = LLLLLJLJLL();
        if (c197039127hLLLLLJLJLL2 != null) {
            C786410Ut5.U8(c197039127hLLLLLJLJLL2, new AkS98S0100000_32(this, 3));
        }
        InterfaceC21573019bk interfaceC21573019bk = new InterfaceC21573019bk() { // from class: X.18XJ
            @Override // X.InterfaceC21571419bU
            public final void LIZ() {
            }

            @Override // X.InterfaceC21571419bU
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC21571419bU
            public final void LIZJ(float f) {
            }

            @Override // X.InterfaceC21573019bk
            public final void LLLLJI(float f) {
            }

            @Override // X.InterfaceC21573019bk
            public final void onScaleBegin() {
            }

            @Override // X.InterfaceC21571419bU
            public final void onExit() {
                this.LIZ.LLLLIL().LIZ.invoke();
            }
        };
        InterfaceC568550MRp interfaceC568550MRpLIZ = C568500MRk.LIZ((View) this.LLJJJJ.getValue());
        if (interfaceC568550MRpLIZ != null) {
            interfaceC568550MRpLIZ.setGestureListener(interfaceC21573019bk);
        }
        LLLLJI(LLLLILI(), new C2217371BqR() { // from class: X.18XK
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C18XL) obj).LJ);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C18XL) obj).LJ = ((Boolean) obj2).booleanValue();
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 384));
        LLLLJI(LLLLILI(), new C2217371BqR() { // from class: X.18XM
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C18XL) obj).LJFF);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C18XL) obj).LJFF = ((Boolean) obj2).booleanValue();
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 385));
        LLLLJI(LLLLILI(), new C2217371BqR() { // from class: X.18XO
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18XL) obj).LIZJ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C18XL) obj).LIZJ = (C18XH) obj2;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 291));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18XR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18XL) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 644));
        LLLLJI(LLLLILI(), new C2217371BqR() { // from class: X.18XP
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18XL) obj).LIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C18XL) obj).LIZ = (C18XH) obj2;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 289));
        LLLLJI(LLLLILI(), new C2217371BqR() { // from class: X.18XN
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18XL) obj).LIZIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C18XL) obj).LIZIZ = (C18XH) obj2;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 290));
    }

    public static void LLLLLLJ(C197039127h c197039127h, int i) {
        if (c197039127h != null) {
            c197039127h.setTag(R.id.f7m, 0);
            c197039127h.setButtonStartIcon(Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C18T2.LIZ.getClass();
        C18T2.LIZ("ai_chat_preview_boot_duration");
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bg9, viewGroup, false);
    }
}
