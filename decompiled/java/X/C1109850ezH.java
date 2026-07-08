package X;

import Y.ACListenerS152S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS86S0200000_17;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenPinOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorTextFontWeightSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceTextFontWeightSetting;
import com.bytedance.android.livesdk.livesetting.gift.LivePSMGiftIconSpaceFixSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS135S0110000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ezH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109850ezH extends AbstractC1109840ezG<AbstractC1110800f0o<? extends AbstractC1136060ffY>, C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> implements InterfaceC176300m1 {
    public final boolean LLJJIJIIJIL;
    public final C1110060ezc LLJJIJIL;
    public final C1324720kZq LLJJJ;
    public final C1110060ezc LLJJJIL;
    public CharSequence LLJJJJ;
    public final C01GW LLJJJJJIL;

    @Override // X.AbstractC1109840ezG
    public final String d6() {
        return "report_user";
    }

    @Override // X.AbstractC1109720ez4
    public final C1110060ezc N5() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1109840ezG
    public final View b6() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1109720ez4
    public final void I5(boolean z) {
        if (LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() && !this.LLJJIJIIJIL) {
            C786410Ut5.LJZI(8, this.LLJJIJI);
            ((C1109810ezD) this.LLJJJJJIL.getValue()).LJIIIZ = this.LLJJIJIL.getSuffix();
            C1109810ezD c1109810ezD = (C1109810ezD) this.LLJJJJJIL.getValue();
            C500260Jjc.LJIILIIL(c1109810ezD.LIZJ);
            c1109810ezD.LIZIZ.setMeasureListener(new AwS135S0110000_17(c1109810ezD, z, 0));
            return;
        }
        super.I5(z);
    }

    @Override // X.AbstractC1109840ezG
    public final void e6(String str) {
        if (LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() && !this.LLJJIJIIJIL) {
            C434330H1j c434330H1j = C434330H1j.LIZ;
            View view = this.itemView;
            c434330H1j.getClass();
            TextView textView = (TextView) view.findViewById(R.id.qgb);
            if (textView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('s');
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        super.e6(str);
    }

    public final void h6(CharSequence charSequence) {
        this.LLJJIJIL.setOriginText(charSequence);
        C1110060ezc c1110060ezc = this.LLJJIJIL;
        ViewGroup.LayoutParams layoutParams = c1110060ezc.getLayoutParams();
        layoutParams.height = -2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1110060ezc);
        c1110060ezc.setLayoutParams(layoutParams);
        this.LLJJIJIL.setText(new SpannableStringBuilder(charSequence).append(this.LLJJIJIL.getSuffix()));
        if (this.LLJJIJIL.getSuffix().length() > 0) {
            this.LLJJIJIL.setMaxLines(Integer.MAX_VALUE);
        }
        this.LLJJIJIL.LJJLIIIJLLLLLLLZ();
        this.LLJJJIL.requestLayout();
        this.itemView.requestLayout();
    }

    public final void i6(final C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt) {
        boolean z;
        f6(c1109610eyt);
        X5().LIZJ().LJIIZILJ();
        if (c1109610eyt.LIZLLL == 1) {
            if (!c1109610eyt.LJIIIZ.LIZJ) {
                c1109610eyt.LJ = true;
                c6().LJII();
                C1110060ezc c1110060ezc = this.LLJJIJIL;
                SpannableString spannableString = new SpannableString(" ￼");
                C786410Ut5.p2(spannableString, new C1110590f0T(c6().LIZJ()), 1, 2, 33);
                c1110060ezc.setSuffix(spannableString);
                C1109020exw c1109020exw = c1109610eyt.LJIIIZ;
                if (c1109020exw.LJ && c1109020exw.LIZ() > 0) {
                    C1110060ezc c1110060ezc2 = this.LLJJIJIL;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LLJJIJIL.getSuffix());
                    spannableStringBuilder.append(' ');
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((char) 65532);
                    C786410Ut5.q2(spannableStringBuilder, new C1110590f0T(V5().LIZJ()), length, spannableStringBuilder.length(), 33);
                    c1110060ezc2.setSuffix(spannableStringBuilder);
                    V5().LJII();
                }
            } else {
                C1110060ezc c1110060ezc3 = this.LLJJIJIL;
                SpannableString spannableString2 = new SpannableString(" ￼");
                C786410Ut5.p2(spannableString2, new C1110590f0T(W5().LIZJ()), 1, 2, 33);
                c1110060ezc3.setSuffix(spannableString2);
                W5().LJII();
                X5().LJIIIZ();
            }
        } else {
            C1109020exw c1109020exw2 = c1109610eyt.LJIIIZ;
            if (!c1109020exw2.LIZJ) {
                if (!c1109610eyt.LJ) {
                    c1109610eyt.LJ = true;
                    if (c1109020exw2.LJ) {
                        V5().LIZJ().LJJL = 0;
                        V5().LIZJ().LIZIZ = 0;
                        C1110060ezc c1110060ezc4 = this.LLJJIJIL;
                        SpannableString spannableString3 = new SpannableString(" ￼");
                        C786410Ut5.p2(spannableString3, new C1110590f0T(W5().LIZJ()), 1, 2, 33);
                        c1110060ezc4.setSuffix(spannableString3);
                        W5().LJIIJ(new InterfaceC1110610f0V() { // from class: X.0ezI
                            @Override // X.InterfaceC1110610f0V
                            public final void invalidate() {
                                C1109020exw c1109020exw3 = c1109610eyt.LJIIIZ;
                                if (!c1109020exw3.LJ || c1109020exw3.LJII <= 0) {
                                    return;
                                }
                                this.V5().LIZJ().LIZIZ = -1;
                                this.LLJJJIL.requestLayout();
                                C1110620f0W c1110620f0WLIZJ = this.V5().LIZJ();
                                c1110620f0WLIZJ.LJJL = 0;
                                ((ValueAnimator) c1110620f0WLIZJ.LJJLIIIJJI.getValue()).start();
                            }
                        });
                    } else {
                        V5().LJII();
                        c6().LJII();
                        C1110060ezc c1110060ezc5 = this.LLJJIJIL;
                        SpannableString spannableString4 = new SpannableString(" ￼");
                        C786410Ut5.p2(spannableString4, new C1110590f0T(c6().LIZJ()), 1, 2, 33);
                        c1110060ezc5.setSuffix(spannableString4);
                    }
                } else {
                    V5().LJII();
                    c6().LJII();
                    C1110060ezc c1110060ezc6 = this.LLJJIJIL;
                    SpannableString spannableString5 = new SpannableString(" ￼");
                    C786410Ut5.p2(spannableString5, new C1110590f0T(c6().LIZJ()), 1, 2, 33);
                    c1110060ezc6.setSuffix(spannableString5);
                }
                C1109020exw c1109020exw3 = c1109610eyt.LJIIIZ;
                if (c1109020exw3.LJ && c1109020exw3.LIZ() > 0) {
                    C1110060ezc c1110060ezc7 = this.LLJJIJIL;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.LLJJIJIL.getSuffix());
                    spannableStringBuilder2.append(' ');
                    int length2 = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((char) 65532);
                    C786410Ut5.q2(spannableStringBuilder2, new C1110590f0T(V5().LIZJ()), length2, spannableStringBuilder2.length(), 33);
                    c1110060ezc7.setSuffix(spannableStringBuilder2);
                }
            } else {
                C1110060ezc c1110060ezc8 = this.LLJJIJIL;
                SpannableString spannableString6 = new SpannableString(" ￼");
                C786410Ut5.p2(spannableString6, new C1110590f0T(W5().LIZJ()), 1, 2, 33);
                c1110060ezc8.setSuffix(spannableString6);
                X5().LJIIIZ();
            }
        }
        CharSequence originText = this.LLJJJJ;
        if (originText == null) {
            originText = this.LLJJIJIL.getOriginText();
        }
        if (originText.length() == 0 && this.LLJJIJIL.getSuffix().length() == 0) {
            return;
        }
        if (LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() && !this.LLJJIJIIJIL) {
            if (c1109610eyt.LJIIIZ.LIZJ) {
                View viewFindViewById = this.itemView.findViewById(R.id.qgu);
                if (viewFindViewById != null) {
                    C500260Jjc.LJIILIIL(viewFindViewById);
                }
            } else {
                C434330H1j c434330H1j = C434330H1j.LIZ;
                View view = this.itemView;
                c434330H1j.getClass();
                View viewFindViewById2 = view.findViewById(R.id.qgu);
                ImageView imageView = (ImageView) view.findViewById(R.id.qgv);
                TextView textView = (TextView) view.findViewById(R.id.qgb);
                C1109020exw c1109020exw4 = c1109610eyt.LJIIIZ;
                if (c1109020exw4.LIZJ || (!c1109610eyt.LJ && c1109610eyt.LIZLLL > 1)) {
                    C500260Jjc.LJIILIIL(viewFindViewById2);
                } else {
                    C500260Jjc.LLFFF(viewFindViewById2);
                    C434330H1j.LIZIZ(view, imageView);
                    if (c1109020exw4.LJ && c1109020exw4.LIZ() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C434330H1j.LIZ(c1109020exw4.LIZ(), textView, z);
                }
                this.LLJJIJIL.setSuffix("");
            }
            if (!c1109610eyt.LJIIIZ.LIZJ) {
                this.LLJJIJIL.setOriginText(C1110090ezf.LIZ(this.LLJJIJIL, originText));
            } else {
                this.LLJJIJIL.setOriginText(originText);
            }
            ((C1109810ezD) this.LLJJJJJIL.getValue()).LJIIIZ = this.LLJJIJIL.getSuffix();
        } else if (originText.length() > 0) {
            this.LLJJIJIL.setOriginText(originText);
        }
        C1110060ezc c1110060ezc9 = this.LLJJIJIL;
        ViewGroup.LayoutParams layoutParams = c1110060ezc9.getLayoutParams();
        layoutParams.height = -2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1110060ezc9);
        c1110060ezc9.setLayoutParams(layoutParams);
        this.LLJJIJIL.setText(new SpannableStringBuilder(this.LLJJIJIL.getOriginText()).append(this.LLJJIJIL.getSuffix()));
        if (this.LLJJIJIL.getSuffix().length() > 0) {
            this.LLJJIJIL.setMaxLines(Integer.MAX_VALUE);
        }
        HandlerHook.viewPost(this.itemView, new ARunnableS117S0100000_17(this, 10));
    }

    @Override // X.InterfaceC176300m1
    public final void LLLL(Bitmap bitmap, AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o) {
        Spannable spannable;
        CharSequence charSequence;
        Spannable spannable2;
        if (bitmap != null && abstractC1110800f0o != null) {
            if (LivePSMGiftIconSpaceFixSetting.INSTANCE.enabled()) {
                CharSequence charSequence2 = this.LLJJJJ;
                if ((charSequence2 instanceof Spannable) && (spannable2 = (Spannable) charSequence2) != null) {
                    C1133830fbx.LIZLLL(spannable2, bitmap, abstractC1110800f0o, true);
                }
            } else {
                int iLJJJJI = a0.LJJJJI(String.valueOf(this.LLJJJJ), " . ", 0, 6);
                if (iLJJJJI != -1) {
                    CharSequence charSequence3 = this.LLJJJJ;
                    if ((charSequence3 instanceof Spannable) && (spannable = (Spannable) charSequence3) != null) {
                        C1133830fbx.LIZIZ(spannable, bitmap, iLJJJJI + 1, iLJJJJI + 2, abstractC1110800f0o);
                    }
                }
            }
            C1110060ezc c1110060ezc = this.LLJJIJIL;
            CharSequence charSequence4 = this.LLJJJJ;
            if (charSequence4 == null) {
                charSequence4 = "";
            }
            c1110060ezc.setOriginText(charSequence4);
            this.LLJJIJIL.setText(this.LLJJJJ);
            if (LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() && !this.LLJJIJIIJIL && (charSequence = this.LLJJJJ) != null) {
                HandlerHook.viewPost(this.itemView, new ARunnableS86S0200000_17(this, charSequence, 3));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0ezN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1109840ezG, X.AbstractC1109720ez4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T5(X.C1109600eys r11, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1109850ezH.T5(X.0eys, java.util.List):void");
    }

    public C1109850ezH(View view, C1109770ez9 c1109770ez9, boolean z) {
        int value;
        super(view, c1109770ez9);
        this.LLJJIJIIJIL = z;
        C1110060ezc c1110060ezc = (C1110060ezc) view.findViewById(R.id.text);
        this.LLJJIJIL = c1110060ezc;
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.k55);
        this.LLJJJ = c1324720kZq;
        this.LLJJJIL = c1110060ezc;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS418S0200000_17(view, this, 3));
        this.LLJJJJJIL = c01gwLIZIZ;
        C1098990ehl.LIZ(new ACListenerS152S0100000_17(this, 2), c1324720kZq);
        if (c1324720kZq != null) {
            c1324720kZq.setOnLongClickListener(new ViewOnLongClickListenerC1151640g4g(this, 0));
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "comment";
        C1109960ezS c1109960ezS = new C1109960ezS();
        c1109960ezS.LJIIIIZZ = new InterfaceC1109980ezU() { // from class: X.0ezR
            @Override // X.InterfaceC1109980ezU
            public final void onEventDown(ClickableSpan clickableSpan) {
                if (clickableSpan instanceof C1110020ezY) {
                    c259800zU.element = "user_name";
                } else {
                    if (!(clickableSpan instanceof C1110050ezb)) {
                        return;
                    }
                    c259800zU.element = "comment";
                }
            }
        };
        c1110060ezc.setMovementMethod(c1109960ezS);
        c1110060ezc.setStateChangedListener(this.LLILZIL);
        c1110060ezc.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0ezM
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C1109850ezH c1109850ezH = this.LL;
                C1109770ez9 c1109770ez92 = c1109850ezH.LL;
                if (c1109770ez92 != null) {
                    AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = c1109850ezH.LLJ;
                    C1111350f1h c1111350f1h = new C1111350f1h();
                    C259800zU<String> c259800zU2 = c259800zU;
                    C1109850ezH c1109850ezH2 = this.LL;
                    c1111350f1h.LJFF = c259800zU2.element;
                    c1109850ezH2.getClass();
                    c1111350f1h.LIZ = "report_user";
                    c1111350f1h.LIZIZ = "long_press";
                    c1109770ez92.LJII(abstractC1110800f0o, c1111350f1h);
                    return true;
                }
                return true;
            }
        });
        W5().LJIIIIZZ(new InterfaceC1110610f0V() { // from class: X.0ezQ
            @Override // X.InterfaceC1110610f0V
            public final void invalidate() {
                this.LIZ.LLJJIJIL.invalidate();
            }
        });
        V5().LJIIIIZZ(new InterfaceC1110610f0V() { // from class: X.0ezT
            @Override // X.InterfaceC1110610f0V
            public final void invalidate() {
                this.LIZ.LLJJIJIL.invalidate();
            }
        });
        if (!z) {
            LivePublicScreenPinOptimizeSetting livePublicScreenPinOptimizeSetting = LivePublicScreenPinOptimizeSetting.INSTANCE;
            boolean zIsEnabled = livePublicScreenPinOptimizeSetting.isEnabled();
            int i = R.drawable.e2g;
            if (zIsEnabled) {
                Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.itemView.getContext(), livePublicScreenPinOptimizeSetting.isEnabled() ? i : R.drawable.e2f);
                View viewFindViewById = view.findViewById(R.id.qg1);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackground(drawableLIZIZ);
                    view.setBackground(null);
                }
                ((C1109810ezD) c01gwLIZIZ.getValue()).LIZIZ();
            } else {
                view.setBackground(C800330VaR.LIZIZ(this.itemView.getContext(), livePublicScreenPinOptimizeSetting.isEnabled() ? i : R.drawable.e2f));
            }
            C1109770ez9 c1109770ez92 = this.LL;
            if (c1109770ez92 != null && c1109770ez92.LIZLLL) {
                if (c1109770ez92.LJI) {
                    value = LivePublicScreenUiConfigAnchorTextFontWeightSetting.INSTANCE.getValue();
                } else {
                    value = LivePublicScreenUiConfigAudienceTextFontWeightSetting.INSTANCE.getValue();
                }
                if (value > 0) {
                    c1110060ezc.setFontWeight(value);
                }
            }
        }
        c1110060ezc.setTextDirection(5);
    }
}
