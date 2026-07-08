package X;

import Y.AUListenerS224S0200000_17;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.gift.base.platform.business.effect.LiveGiftEffectWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidgetKotlin;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0fXX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131090fXX implements InterfaceC1132060fZ6 {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public GiftWidgetKotlin LIZIZ;
    public C1133250fb1 LIZJ;
    public AbsNormalGiftAnimWidget LIZLLL;
    public LiveGiftEffectWidget LJ;
    public C1131720fYY LJFF;
    public C1131770fYd LJI;
    public C0NKM LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public ValueAnimator LJIIJ;

    public final boolean LJFF() {
        GiftWidgetKotlin giftWidgetKotlin;
        GiftWidgetKotlin giftWidgetKotlin2 = this.LIZIZ;
        return (giftWidgetKotlin2 == null || !giftWidgetKotlin2.isViewValid() || (giftWidgetKotlin = this.LIZIZ) == null || giftWidgetKotlin.context == null || giftWidgetKotlin == null || giftWidgetKotlin.contentView == null) ? false : true;
    }

    public final void LJI() {
        C1135920ffK c1135920ffK;
        if (LiveGiftReceivingRefactorSetting.INSTANCE.isEnableWidget() && this.LIZ.getAndSet(false)) {
            C1131770fYd c1131770fYd = this.LJI;
            if (c1131770fYd != null) {
                c1131770fYd.LIZ();
            }
            this.LJI = null;
            C1133250fb1 c1133250fb1 = this.LIZJ;
            if (c1133250fb1 != null && (c1135920ffK = c1133250fb1.LIZJ) != null) {
                c1135920ffK.LJJII();
            }
            C0NKM c0nkm = this.LJII;
            if (c0nkm != null) {
                c0nkm.LJII();
            }
            this.LJII = null;
            this.LIZJ = null;
            ValueAnimator valueAnimator = this.LJIIJ;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = this.LJIIJ;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.LJIIJ = null;
            this.LIZIZ = null;
            this.LJFF = null;
            C1137480fhq.LIZ.getClass();
            C1137480fhq.LIZJ = null;
            C1137480fhq.LIZIZ = null;
        }
    }

    @Override // X.InterfaceC1132060fZ6
    public final void LJJIJ() {
        C1134950fdl c1134950fdl;
        InterfaceC1136220ffo interfaceC1136220ffo;
        Iterator<InterfaceC1133090fal> it2 = C1132970faZ.LIZ.values().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIZILJ();
        }
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget = this.LIZLLL;
        if (absNormalGiftAnimWidget != null) {
            absNormalGiftAnimWidget.y1();
        }
        C1133250fb1 c1133250fb1 = this.LIZJ;
        if (c1133250fb1 == null || (c1134950fdl = c1133250fb1.LIZIZ) == null || (interfaceC1136220ffo = c1134950fdl.LIZ) == null) {
            return;
        }
        interfaceC1136220ffo.LJIIJ();
    }

    @Override // X.InterfaceC1132060fZ6
    public final LiveGiftEffectWidget LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1132060fZ6
    public final InterfaceC1132530fZr LIZIZ() {
        return this.LJFF;
    }

    public final void LJ(int i) {
        GiftWidgetKotlin giftWidgetKotlin;
        View view;
        View viewFindViewById;
        if (!LJFF()) {
            return;
        }
        Boolean bool = null;
        if (this.LIZIZ != null) {
            bool = Boolean.FALSE;
        }
        if ((!C500260Jjc.LJJJI(bool)) && (giftWidgetKotlin = this.LIZIZ) != null && (view = giftWidgetKotlin.contentView) != null && (viewFindViewById = view.findViewById(R.id.pbd)) != null) {
            if (C497740JfY.LJJ()) {
                i = -i;
            }
            C786410Ut5.Jc(viewFindViewById, i);
        }
    }

    @Override // X.InterfaceC1132060fZ6
    public final void LJIILL(boolean z) {
        C1134950fdl c1134950fdl;
        InterfaceC1136220ffo interfaceC1136220ffo;
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget = this.LIZLLL;
        if (absNormalGiftAnimWidget == null && this.LJ == null) {
            return;
        }
        if (z) {
            if (absNormalGiftAnimWidget != null) {
                absNormalGiftAnimWidget.y1();
            }
            C1133250fb1 c1133250fb1 = this.LIZJ;
            if (c1133250fb1 != null && (c1134950fdl = c1133250fb1.LIZIZ) != null && (interfaceC1136220ffo = c1134950fdl.LIZ) != null) {
                interfaceC1136220ffo.LJIIJ();
            }
            AbsNormalGiftAnimWidget absNormalGiftAnimWidget2 = this.LIZLLL;
            if (absNormalGiftAnimWidget2 != null) {
                absNormalGiftAnimWidget2.F1();
            }
            LiveGiftEffectWidget liveGiftEffectWidget = this.LJ;
            if (liveGiftEffectWidget != null) {
                liveGiftEffectWidget.stopVideoPlay();
            }
            AbsNormalGiftAnimWidget absNormalGiftAnimWidget3 = this.LIZLLL;
            if (absNormalGiftAnimWidget3 != null) {
                absNormalGiftAnimWidget3.LL = true;
                return;
            }
            return;
        }
        if (absNormalGiftAnimWidget == null) {
            return;
        }
        absNormalGiftAnimWidget.LL = false;
    }

    @Override // X.InterfaceC1132060fZ6
    public final void LIZJ(boolean z, C1081600eFi c1081600eFi) {
        if (!LJFF()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adjustGiftTrayWhenMultiGuestChange: type = ");
        sbLIZ.append(c1081600eFi.LIZ);
        sbLIZ.append(", guestWindowCount=");
        sbLIZ.append(c1081600eFi.LIZIZ);
        C1133910fc5.LJFF("GiftReceivingWidget", C2188811AlT.LIZIZ(sbLIZ));
        EnumC918970a1P enumC918970a1P = c1081600eFi.LIZ;
        if ((enumC918970a1P == EnumC918970a1P.FLOATING_FIX || (enumC918970a1P == EnumC918970a1P.FLOATING && c1081600eFi.LIZIZ > 0)) && z) {
            LJ(C439101nJ.LIZ(85));
        } else {
            LJ(0);
        }
    }

    @Override // X.InterfaceC1132060fZ6
    public final void LIZLLL(int i, boolean z, boolean z2) {
        View view;
        View viewFindViewById;
        RelativeLayout.LayoutParams layoutParams;
        boolean z3;
        if (LJFF()) {
            GiftWidgetKotlin giftWidgetKotlin = this.LIZIZ;
            Boolean bool = null;
            if (giftWidgetKotlin != null && giftWidgetKotlin.context != null) {
                if (giftWidgetKotlin != null && (view = giftWidgetKotlin.contentView) != null && (viewFindViewById = view.findViewById(R.id.pbd)) != null) {
                    ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                    if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                        if (z2) {
                            boolean z4 = this.LJIIIIZZ;
                            if (i > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.LJIIIIZZ = z3;
                            this.LJIIIZ = i;
                            if (i > 0 || z4) {
                                i += layoutParams.bottomMargin;
                            }
                            if (i < 0) {
                                return;
                            }
                        } else if (this.LJIIIIZZ) {
                            i += this.LJIIIZ;
                        }
                        int i2 = layoutParams.bottomMargin;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(i2);
                        sbLIZ.append(" -> ");
                        sbLIZ.append(i);
                        C1133910fc5.LJFF("adjustGiftTrayBottomMargin", C2188811AlT.LIZIZ(sbLIZ));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("useAnimation = ");
                        sbLIZ2.append(z);
                        C1133910fc5.LJFF("adjustGiftTrayBottomMargin", C2188811AlT.LIZIZ(sbLIZ2));
                        if (this.LIZIZ != null) {
                            bool = Boolean.FALSE;
                        }
                        if (C500260Jjc.LJJJI(bool)) {
                            C1133910fc5.LJFF("adjustGiftTrayBottomMargin", "Gift dialog open");
                            return;
                        }
                        if (z) {
                            if (i2 != i) {
                                ValueAnimator valueAnimator = this.LJIIJ;
                                if (valueAnimator == null) {
                                    ValueAnimator valueAnimator2 = new ValueAnimator();
                                    this.LJIIJ = valueAnimator2;
                                    valueAnimator2.setDuration(200L);
                                    ValueAnimator valueAnimator3 = this.LJIIJ;
                                    if (valueAnimator3 != null) {
                                        valueAnimator3.setInterpolator(new LinearInterpolator());
                                    }
                                } else {
                                    valueAnimator.removeAllUpdateListeners();
                                    ValueAnimator valueAnimator4 = this.LJIIJ;
                                    if (valueAnimator4 != null) {
                                        valueAnimator4.cancel();
                                    }
                                }
                                ValueAnimator valueAnimator5 = this.LJIIJ;
                                if (valueAnimator5 != null) {
                                    valueAnimator5.setIntValues(i2, i);
                                }
                                ValueAnimator valueAnimator6 = this.LJIIJ;
                                if (valueAnimator6 != null) {
                                    valueAnimator6.addUpdateListener(new AUListenerS224S0200000_17(viewFindViewById, layoutParams, 19));
                                }
                                ValueAnimator valueAnimator7 = this.LJIIJ;
                                if (valueAnimator7 != null) {
                                    valueAnimator7.start();
                                    return;
                                }
                                return;
                            }
                            ValueAnimator valueAnimator8 = this.LJIIJ;
                            if (valueAnimator8 != null) {
                                valueAnimator8.cancel();
                            }
                            layoutParams.bottomMargin = i;
                            C786410Ut5.W5(viewFindViewById, layoutParams);
                            return;
                        }
                        ValueAnimator valueAnimator9 = this.LJIIJ;
                        if (valueAnimator9 != null) {
                            valueAnimator9.cancel();
                        }
                        layoutParams.bottomMargin = i;
                        C786410Ut5.W5(viewFindViewById, layoutParams);
                        return;
                    }
                    return;
                }
                C1133910fc5.LJFF("adjustGiftTrayBottomMargin", "container view is null");
                return;
            }
        }
        C1133910fc5.LJFF("adjustGiftTrayBottomMargin", "invalid view or context");
    }
}
