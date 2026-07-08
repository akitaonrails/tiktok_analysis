package X;

import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13wK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.BaseCreateSocialStickerHandler$preload$1$3$2", f = "BaseCreateSocialStickerHandler.kt", l = {}, m = "invokeSuspend")
public final class C20171813wK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20171713wJ LL;
    public final /* synthetic */ C20170413w6 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20171813wK(C20171713wJ c20171713wJ, C20170413w6 c20170413w6, boolean z, Function0<Unit> function0, InterfaceC1364105Vn<? super C20171813wK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20171713wJ;
        this.LLILLJJLI = c20170413w6;
        this.LLILLL = z;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20171813wK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC20169713vz enumC20169713vz;
        C1C7U.LIZ("BaseCreateSocialStickerHandler@12bc.preload$1$3$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20171713wJ c20171713wJ = this.LL;
        int i = C20170713w9.LIZ[this.LLILLJJLI.LIZIZ.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            enumC20169713vz = EnumC20169713vz.PENDING;
        } else {
            enumC20169713vz = this.LLILLJJLI.LIZIZ;
        }
        c20171713wJ.LJI = enumC20169713vz;
        DialogC1389620mGW dialogC1389620mGW = this.LL.LIZLLL;
        if (dialogC1389620mGW != null && dialogC1389620mGW.isShowing()) {
            this.LL.LJ(this.LLILLL);
            if (this.LLILLL) {
                this.LL.LJFF(this.LLILZ);
            } else {
                C20171713wJ c20171713wJ2 = this.LL;
                Activity activityLIZ = C1388190mED.LIZ(c20171713wJ2.LIZ);
                if (activityLIZ != null) {
                    if (c20171713wJ2.LJII.getNeedWindowToast() && ((Boolean) C263490AUh.LIZ.getValue()).booleanValue()) {
                        final Context context = c20171713wJ2.LIZ;
                        DialogC19728412Gs dialogC19728412Gs = new DialogC19728412Gs(context) { // from class: X.0mHI
                            public final int LL;
                            public final View LLILLJJLI;
                            public C21415018rM LLILLL;

                            @Override // X.DialogC19728412Gs, android.app.Dialog
                            public final void show() {
                                Object obj2;
                                C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxrPah5xMPTV+Jl0/LX1n0xnKSTu61y1uXXncFZ3jz7Nk6qOQ==", null);
                                C0WST c0wst = new C0WST();
                                Object[] objArr = new Object[0];
                                C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
                                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
                                if (c0wsuLIZIZ.LIZ) {
                                    c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
                                } else {
                                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                                    DialogC19728412Gs dialogC19728412Gs2 = (objArr2 == null || (obj2 = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj2;
                                    super.show();
                                    c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs2, c0wzw, true);
                                }
                                C21415018rM c21415018rM = this.LLILLL;
                                if (c21415018rM != null) {
                                    C786410Ut5.LJLLLLLL(0, c21415018rM);
                                }
                                C786410Ut5.LJLIIL(3000L, C0CAU.LIZ, new ARunnableS113S0100000_13(this, 151));
                            }

                            /* JADX WARN: Illegal instructions before constructor call */
                            {
                                int iIntValue;
                                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0b, context);
                                if (numLIZ != null) {
                                    iIntValue = numLIZ.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                super(C1388190mED.LJ(iIntValue, context));
                                this.LL = 2131848597;
                                this.LLILLJJLI = C786410Ut5.Sd(R.layout._tux_toast_layout, C786410Ut5.ne(getContext()), null);
                            }

                            @Override // android.app.Dialog
                            public final void onCreate(Bundle bundle) {
                                int iLIZIZ;
                                super.onCreate(bundle);
                                Window window = getWindow();
                                if (window != null) {
                                    window.setBackgroundDrawable(new ColorDrawable(0));
                                }
                                setContentView(this.LLILLJJLI);
                                Window window2 = getWindow();
                                if (window2 != null) {
                                    window2.setDimAmount(0.0f);
                                }
                                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.TuxToast, R.attr.z5, 0);
                                int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxToast__tux_toastBackgroundColor, 0);
                                float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxToast__tux_toastBackgroundCorner, 0.0f);
                                int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxToast__tux_messageFont, 0);
                                int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxToast__tux_messageFontColor, 0);
                                typedArrayObtainStyledAttributes.recycle();
                                View viewFindViewById = findViewById(R.id.y55);
                                C384050F3z c384050F3z = new C384050F3z();
                                c384050F3z.LIZ = Integer.valueOf(color);
                                c384050F3z.LIZJ = Float.valueOf(dimension);
                                viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
                                this.LLILLL = (C21415018rM) findViewById(R.id.o8v);
                                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                                C444830HcP c444830HcP = new C444830HcP();
                                if (Math.min(r7.widthPixels, r7.heightPixels) > getContext().getResources().getDisplayMetrics().density * 650) {
                                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
                                } else {
                                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)) - iLIZIZ2;
                                }
                                c444830HcP.LIZIZ.LJFF = iLIZIZ;
                                c444830HcP.LIZIZ.LJ = Math.min(C497820Jfg.LIZIZ(getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(560))) - iLIZIZ2;
                                c444830HcP.LJII(i2);
                                c444830HcP.LJIILJJIL(color2);
                                c444830HcP.LJIILIIL(getContext().getString(this.LL));
                                C21415018rM c21415018rM = this.LLILLL;
                                if (c21415018rM != null) {
                                    c21415018rM.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.6f, true, C431830GwX.LIZ(c444830HcP, null, null), 24));
                                }
                            }
                        };
                        dialogC19728412Gs.show();
                        C785410UrT.LIZIZ(dialogC19728412Gs);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(dialogC19728412Gs);
                        C816490W1f.LIZ(dialogC19728412Gs);
                    } else {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131848597);
                        c1389890mGx.LJIIJJI();
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCreateSocialStickerHandler@12bc.preload$1$3$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
