package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS120S1100000_6;

/* JADX INFO: renamed from: X.0Hm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450860Hm8 extends AbstractC1391580mJg<C450860Hm8> {
    public List<? extends InterfaceC450850Hm7> LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Hm5, android.view.View, android.widget.LinearLayout] */
    @Override // X.AbstractC1391580mJg
    public final C0P0T LIZIZ() {
        LJIIIZ(true, null);
        final Context context = this.LL;
        ?? r1 = new LinearLayout(context) { // from class: X.0Hm5
            {
                int color;
                super(context, null, R.attr.z6);
                setOrientation(1);
                Integer numLIZLLL = C1308910kAL.LIZLLL(context, R$styleable.TuxTooltip, R$styleable.TuxTooltip__tux_tooltipActionDividerColor);
                if (numLIZLLL != null) {
                    color = numLIZLLL.intValue();
                } else {
                    color = ColorProtector.parseColor("#33FFFFFF");
                }
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
                c384050F3z.LIZ = Integer.valueOf(color);
                setDividerDrawable(c384050F3z.LIZ(context));
                setDividerPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                setShowDividers(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [X.0Hm1, android.view.View] */
            public final void setActions(List<? extends InterfaceC450850Hm7> list) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                removeAllViews();
                for (Object obj : list) {
                    if (obj instanceof View) {
                        addView((View) obj);
                    } else if (obj instanceof C450820Hm4) {
                        ?? r12 = new FrameLayout(getContext()) { // from class: X.0Hm1
                            public final View LL;
                            public C450820Hm4 LLILLJJLI;

                            public final C450820Hm4 getAction() {
                                return this.LLILLJJLI;
                            }

                            {
                                super(context, null, R.attr.z6);
                                View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h_, this, true);
                                this.LL = viewTd;
                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxTooltip, R.attr.z6, 0);
                                try {
                                    TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.text);
                                    int i = R$styleable.TuxTooltip__tux_tooltipActionTextColor;
                                    C450710Hlt.LIZ(typedArrayObtainStyledAttributes, i);
                                    int color = typedArrayObtainStyledAttributes.getColor(i, 0);
                                    int i2 = R$styleable.TuxTooltip__tux_tooltipActionFont;
                                    C450710Hlt.LIZ(typedArrayObtainStyledAttributes, i2);
                                    int i3 = typedArrayObtainStyledAttributes.getInt(i2, 0);
                                    tuxTextView.setTextColor(color);
                                    tuxTextView.setTuxFont(i3);
                                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxTooltip__tux_tooltipArrowIcon, 0);
                                    TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.b91);
                                    C419910GdJ c419910GdJ = new C419910GdJ();
                                    c419910GdJ.LIZ = resourceId;
                                    c419910GdJ.LIZLLL = Integer.valueOf(color);
                                    tuxIconView.setTuxIcon(c419910GdJ);
                                } catch (IllegalArgumentException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                typedArrayObtainStyledAttributes.recycle();
                            }

                            public final void setAction(C450820Hm4 c450820Hm4) {
                                CharSequence charSequence;
                                int i;
                                this.LLILLJJLI = c450820Hm4;
                                if (c450820Hm4 != null) {
                                    EnumC450810Hm3 enumC450810Hm3 = c450820Hm4.LJ;
                                    ViewGroup.LayoutParams layoutParams = this.LL.findViewById(R.id.kb6).getLayoutParams();
                                    int i2 = C450800Hm2.LIZ[enumC450810Hm3.ordinal()];
                                    if (i2 != 1) {
                                        if (i2 != 2) {
                                            if (i2 == 3) {
                                                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                                                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                                                C786410Ut5.c6((ImageView) this.LL.findViewById(R.id.kb6), layoutParams);
                                                charSequence = null;
                                                i = 0;
                                                C426750GoL.LJIIIZ(this.LL.findViewById(R.id.kb6), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 27);
                                                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                                            } else {
                                                throw new C1954807lC();
                                            }
                                        } else {
                                            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                            C786410Ut5.c6((ImageView) this.LL.findViewById(R.id.kb6), layoutParams);
                                            charSequence = null;
                                            i = 0;
                                            C426750GoL.LJIIIZ(this.LL.findViewById(R.id.kb6), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, false, 27);
                                            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                        }
                                    } else {
                                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                        C786410Ut5.c6((ImageView) this.LL.findViewById(R.id.kb6), layoutParams);
                                        charSequence = null;
                                        i = 0;
                                        C426750GoL.LJIIIZ(this.LL.findViewById(R.id.kb6), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, false, 27);
                                        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                    }
                                    AwS120S1100000_6 awS120S1100000_6 = c450820Hm4.LIZ;
                                    if (awS120S1100000_6 != null) {
                                        awS120S1100000_6.invoke(this.LL.findViewById(R.id.kb6));
                                        C786410Ut5.LJZI(i, (ImageView) this.LL.findViewById(R.id.kb6));
                                    } else {
                                        C786410Ut5.LJZI(8, (ImageView) this.LL.findViewById(R.id.kb6));
                                    }
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) this.LL.findViewById(R.id.text);
                                    appCompatTextView.setSingleLine(c450820Hm4.LJFF);
                                    if (c450820Hm4.LIZIZ != 0) {
                                        appCompatTextView.setText(getResources().getString(c450820Hm4.LIZIZ));
                                    } else {
                                        appCompatTextView.setText(c450820Hm4.LIZJ);
                                    }
                                    C427690Gpr.LJ(this.LL, C418440Gaw.LIZIZ(8));
                                    C786410Ut5.I7(c450820Hm4.LIZLLL, this.LL);
                                    int i3 = C20094413jq.LJIIZILJ;
                                    View view = this.LL;
                                    C1397760mTe c1397760mTe = new C1397760mTe();
                                    c1397760mTe.LIZ = appCompatTextView.getText();
                                    c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
                                    c1397760mTe.LIZJ = charSequence;
                                    C20094813ju.LIZ(view, c1397760mTe.LIZ());
                                }
                            }
                        };
                        r12.setAction((C450820Hm4) obj);
                        addView(r12);
                    } else if (obj instanceof C450840Hm6) {
                        C450700Hls c450700Hls = new C450700Hls(getContext());
                        c450700Hls.setAction((C450840Hm6) obj);
                        addView(c450700Hls);
                    }
                }
            }
        };
        r1.setActions(this.LLILZ);
        int i = this.LLILZIL;
        if (i >= 0) {
            r1.setMinimumWidth(i);
        }
        int i2 = this.LLILZLL;
        if (i2 >= 0) {
            r1.setDividerPadding(i2);
        }
        this.LLILLJJLI.LJIIZILJ = r1;
        return super.LIZIZ();
    }

    public C450860Hm8(Context context) {
        super(context);
        this.LLILZ = C13BV.INSTANCE;
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        Integer numLIZLLL = C1308910kAL.LIZLLL(context, R$styleable.TuxTooltip, R$styleable.TuxTooltip__tux_tooltipActionBgColor);
        if (numLIZLLL != null) {
            LJI(numLIZLLL.intValue());
        }
    }

    public final void LJIIJ(Function1 function1) {
        C451220Hmi c451220Hmi = new C451220Hmi(this.LL);
        function1.invoke(c451220Hmi);
        this.LLILZ = c451220Hmi.LIZIZ;
    }
}
