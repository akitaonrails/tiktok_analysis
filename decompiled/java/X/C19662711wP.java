package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventStickerAudienceTypeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11wP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19662711wP extends C1AJN<C19663611wY> {
    public final EnumC19663011wS LLL;
    public final int[] LLLF;
    public final Function0<Unit> LLLFF;
    public final Function0<Unit> LLLFFI;
    public ViewGroup LLLFZ;
    public TextView LLLI;
    public TuxTextView LLLII;
    public View LLLIIII;

    public final void B0() {
        LifecycleCoroutineScope lifecycleScope;
        C19663611wY c19663611wY = (C19663611wY) this.LL;
        if (c19663611wY.LJIIJJI) {
            C0(true);
            return;
        }
        Function0<Unit> function0 = this.LLLFF;
        if (function0 != null) {
            function0.invoke();
        }
        boolean z = c19663611wY.LJIIJ;
        ILiveEventService iLiveEventService = (ILiveEventService) C1161920gLG.LIZJ(ILiveEventService.class);
        if (iLiveEventService == null) {
            return;
        }
        String strValueOf = String.valueOf(c19663611wY.LIZLLL);
        LifecycleOwner lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(getContext(), false);
        if (lifecycleOwnerLJJIFFI == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLJJIFFI)) == null) {
            return;
        }
        C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C19616911p1(z, c19663611wY, iLiveEventService, strValueOf, this, null), 2);
    }

    @Override // X.C1AJN
    public final void j0() {
    }

    public final void E0() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        View stickerView = getStickerView();
        if (stickerView != null) {
            ViewGroup.LayoutParams layoutParams2 = stickerView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = -2;
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(102));
            C786410Ut5.W5(stickerView, layoutParams2);
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.11wU
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (this.LL.LLL == EnumC19663011wS.AUDIENCE && LiveEventStickerAudienceTypeSetting.INSTANCE.styleV2()) {
                        this.LL.B0();
                    } else {
                        this.LL.C0(false);
                    }
                }
            }, stickerView);
            ((TextView) stickerView.findViewById(R.id.mxn)).setText(C1838110xvt.LIZ(((C19663611wY) this.LL).LJFF, false));
            ((TextView) stickerView.findViewById(R.id.mxp)).setText(C1838110xvt.LIZJ.format(Long.valueOf(((C19663611wY) this.LL).LJFF)));
            View viewFindViewById = stickerView.findViewById(R.id.lc0);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.11wQ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.LL.h0();
                        int i = C19662911wR.LIZ[this.LL.LLL.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    C19662511wN.LJFF((C19663611wY) this.LL.LL, "close");
                                    return;
                                }
                                throw new C1954807lC();
                            }
                            C19662511wN.LIZJ((C19663611wY) this.LL.LL, "live_take_detail");
                            return;
                        }
                        C19662511wN.LIZJ((C19663611wY) this.LL.LL, "live_take_page");
                    }
                }, viewFindViewById);
            }
            this.LLLIIII = stickerView.findViewById(R.id.fzj);
            this.LLLFZ = (ViewGroup) stickerView.findViewById(R.id.mxo);
        }
        int i = C19663111wT.LIZ[this.LLL.ordinal()];
        if (i == 1) {
            View stickerView2 = getStickerView();
            if (stickerView2 != null) {
                TuxTextView tuxTextView = (TuxTextView) stickerView2.findViewById(R.id.crp);
                this.LLLII = tuxTextView;
                if (tuxTextView != null) {
                    C500260Jjc.LLFFF(tuxTextView);
                }
                TuxTextView tuxTextView2 = this.LLLII;
                if (tuxTextView2 != null) {
                    C786410Ut5.h9(tuxTextView2, new View.OnClickListener() { // from class: X.11wW
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.LL.C0(false);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            View stickerView3 = getStickerView();
            if (stickerView3 != null) {
                TextView textView = (TextView) stickerView3.findViewById(R.id.tv_subscriber_count);
                this.LLLI = textView;
                if (textView != null) {
                    C500260Jjc.LLFFF(textView);
                }
                TextView textView2 = this.LLLI;
                if (textView2 != null) {
                    textView2.setText(C497740JfY.LJIJJ(2131852248, String.valueOf(C19374310qz.LIZ(Long.valueOf(((C19663611wY) this.LL).LJI), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28))));
                    return;
                }
                return;
            }
            return;
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        View stickerView4 = getStickerView();
        if (stickerView4 != null) {
            TuxTextView tuxTextView3 = (TuxTextView) stickerView4.findViewById(R.id.crp);
            this.LLLII = tuxTextView3;
            if (tuxTextView3 != null) {
                C500260Jjc.LLFFF(tuxTextView3);
            }
            TuxTextView tuxTextView4 = this.LLLII;
            if (tuxTextView4 != null) {
                C786410Ut5.h9(tuxTextView4, new View.OnClickListener() { // from class: X.11wV
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.LL.B0();
                    }
                });
            }
            F0(((C19663611wY) this.LL).LJIIJ);
            if (LiveEventStickerAudienceTypeSetting.INSTANCE.styleV2()) {
                View view = this.LLLIIII;
                if (view != null) {
                    C500260Jjc.LJIILIIL(view);
                }
                ViewGroup viewGroup = this.LLLFZ;
                layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                    return;
                }
                marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)), marginLayoutParams2.rightMargin, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)));
                return;
            }
            View view2 = this.LLLIIII;
            if (view2 != null) {
                C500260Jjc.LLFFF(view2);
            }
            ViewGroup viewGroup2 = this.LLLFZ;
            layoutParams = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), marginLayoutParams.rightMargin, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)));
        }
    }

    @Override // X.C1AJN
    public final View n0() {
        return C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.h6m, this, false);
    }

    public final void C0(boolean z) {
        String str;
        Context context = getContext();
        if (context == null) {
            return;
        }
        String liveEventDialogSchema = LiveEventPageLynxUrl.INSTANCE.getLiveEventDialogSchema();
        if (liveEventDialogSchema.length() == 0) {
            return;
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(liveEventDialogSchema).buildUpon().appendQueryParameter("event_id", String.valueOf(((C19663611wY) this.LL).LIZLLL));
        if (this.LLILLJJLI) {
            str = "live_take_detail_module";
        } else {
            str = "live_detail_module";
        }
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, builderAppendQueryParameter.appendQueryParameter("enter_from", str).build().toString(), new C19644411tS(this));
        if (z) {
            return;
        }
        int i = C19663111wT.LIZ[this.LLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C19663611wY c19663611wY = (C19663611wY) this.LL;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_module_click");
                    C19662511wN.LIZIZ(c474500IjALIZ, c19663611wY);
                    c474500IjALIZ.LJJII(Integer.valueOf(c19663611wY.LIZ()), "module_position_x");
                    c474500IjALIZ.LJJII(Integer.valueOf(c19663611wY.LIZIZ), "module_position_y");
                    c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - c19663611wY.LJIILIIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "duration");
                    c474500IjALIZ.LIZ();
                    return;
                }
                throw new C1954807lC();
            }
            C19663611wY c19663611wY2 = (C19663611wY) this.LL;
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_live_event_module_click");
            C19662511wN.LIZIZ(c474500IjALIZ2, c19663611wY2);
            c474500IjALIZ2.LJJII("live_take_detail", "event_page");
            c474500IjALIZ2.LIZ();
            return;
        }
        C19663611wY c19663611wY3 = (C19663611wY) this.LL;
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_anchor_live_event_module_click");
        C19662511wN.LIZIZ(c474500IjALIZ3, c19663611wY3);
        c474500IjALIZ3.LJJII("live_take_page", "event_page");
        c474500IjALIZ3.LIZ();
    }

    public final void F0(boolean z) {
        if (z) {
            TuxTextView tuxTextView = this.LLLII;
            if (tuxTextView != null) {
                tuxTextView.setText(getContext().getString(2131851061));
            }
            TuxTextView tuxTextView2 = this.LLLII;
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(81);
            }
            TuxTextView tuxTextView3 = this.LLLII;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextColorRes(R.attr.a1k);
                return;
            }
            return;
        }
        TuxTextView tuxTextView4 = this.LLLII;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(getContext().getString(2131851060));
        }
        TuxTextView tuxTextView5 = this.LLLII;
        if (tuxTextView5 != null) {
            tuxTextView5.setTuxFont(82);
        }
        TuxTextView tuxTextView6 = this.LLLII;
        if (tuxTextView6 == null) {
            return;
        }
        tuxTextView6.setTextColorRes(R.attr.k8);
    }

    @Override // X.C1AJN
    public final void p0(View view) {
        float fFloatValue;
        E0();
        Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(((C19663611wY) this.LL).LJIIIIZZ);
        float fFloatValue2 = -1.0f;
        if (fLJIIIIZZ != null) {
            fFloatValue = fLJIIIIZZ.floatValue();
        } else {
            fFloatValue = -1.0f;
        }
        float f = 100;
        float f2 = fFloatValue / f;
        Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(((C19663611wY) this.LL).LJIIIZ);
        if (fLJIIIIZZ2 != null) {
            fFloatValue2 = fLJIIIIZZ2.floatValue();
        }
        I0(f2, fFloatValue2 / f);
    }

    public final void I0(float f, float f2) {
        View stickerView = getStickerView();
        if (stickerView == null) {
            return;
        }
        if (f < 0.0f || f > 1.0f) {
            f = 0.5f;
        }
        if (C497740JfY.LJJ()) {
            f = 1 - f;
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            f2 = 0.5f;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = (int) (measuredWidth * f);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.ayt);
        int i2 = ((int) ((this.LLLF[1] - dimensionPixelSize) * f2)) + dimensionPixelSize;
        if (stickerView.getMeasuredWidth() == 0 || stickerView.getMeasuredHeight() == 0) {
            stickerView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(102));
        int measuredHeight2 = stickerView.getMeasuredHeight();
        float f3 = iLIZIZ;
        float f4 = 2;
        float f5 = i - (f3 / f4);
        float f6 = measuredHeight2;
        float f7 = i2 - (f6 / f4);
        int[] iArr = this.LLLF;
        int i3 = iArr[2];
        if (f5 >= i3) {
            float f8 = f3 + f5;
            int i4 = iArr[3];
            if (f8 > i4) {
                i3 = i4 - iLIZIZ;
                f5 = i3;
            }
        } else {
            f5 = i3;
        }
        float f9 = dimensionPixelSize;
        if (f7 < f9) {
            f7 = f9;
        } else {
            float f10 = f6 + f7;
            int i5 = iArr[1];
            if (f10 > i5) {
                f7 = i5 - measuredHeight2;
            }
        }
        C786410Ut5.Fd(stickerView, f5);
        C786410Ut5.Ld(stickerView, f7);
        T t = this.LL;
        t.xPosition = (int) (f5 + (iLIZIZ / 2));
        t.yPosition = (int) (f7 + (measuredHeight2 / 2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19662711wP(Context context, C19663611wY c19663611wY, EnumC19663011wS enumC19663011wS, int[] iArr, InterfaceC2177361AJi interfaceC2177361AJi, Function0 function0, Function0 function02) {
        boolean z;
        if (enumC19663011wS != EnumC19663011wS.AUDIENCE) {
            z = true;
        } else {
            z = false;
        }
        super(context, c19663611wY, z, iArr, interfaceC2177361AJi, false);
        this.LLL = enumC19663011wS;
        this.LLLF = iArr;
        this.LLLFF = function0;
        this.LLLFFI = function02;
    }
}
