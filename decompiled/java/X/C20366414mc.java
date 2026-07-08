package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20366414mc extends AbstractC960470b6L<C20365414mS> {
    public final DataChannel LL;
    public final PlaybookAnchorViewModel LLILLJJLI;
    public final LiveIconView LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final C16FS LLILZLL;
    public final C1324720kZq LLIZ;
    public final C01GW LLIZLLLIL;

    public final void N5(boolean z) {
        if (z) {
            LiveIconView liveIconView = this.LLILLL;
            if (liveIconView != null) {
                C786410Ut5.i5(liveIconView, 0.35f);
            }
            C1324720kZq c1324720kZq = this.LLIZ;
            if (c1324720kZq != null) {
                C786410Ut5.h5(c1324720kZq, 0.35f);
            }
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                C786410Ut5.k5(c16f5, 0.35f);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LLILLL;
        if (liveIconView2 != null) {
            C786410Ut5.i5(liveIconView2, 1.0f);
        }
        C1324720kZq c1324720kZq2 = this.LLIZ;
        if (c1324720kZq2 != null) {
            C786410Ut5.h5(c1324720kZq2, 1.0f);
        }
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 == null) {
            return;
        }
        C786410Ut5.k5(c16f52, 1.0f);
    }

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
    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        String strLJIJJ;
        C20365414mS c20365414mS = (C20365414mS) obj;
        C20361214lm c20361214lm = c20365414mS.LIZ;
        C16F5 c16f5 = this.LLILZIL;
        Boolean boolValueOf = null;
        GradientDrawable gradientDrawable = null;
        if (c16f5 != null) {
            C20365714mV c20365714mV = c20361214lm.LIZJ.LJFF;
            if (c20365714mV != null) {
                strLJIJJ = PlaybookUtilKt.LJIJJ(c20365714mV.LJFF, c20365714mV.LJI);
                if (strLJIJJ == null) {
                    strLJIJJ = "";
                }
            } else {
                strLJIJJ = null;
            }
            c16f5.setTag(strLJIJJ);
        }
        int i2 = c20361214lm.LIZJ.LJI;
        int iIntValue = 0;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        return;
                    }
                } else {
                    P5(c20361214lm, c20365414mS, 4);
                    N5(true);
                    C16FS c16fs = this.LLILZLL;
                    if (c16fs == null) {
                        return;
                    }
                    C439101nJ.LJI(c16fs);
                    return;
                }
            }
            C16F5 c16f52 = this.LLILZ;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131854101));
            }
            N5(false);
            C16F5 c16f53 = this.LLILZIL;
            if (c16f53 != null) {
                C439101nJ.LJI(c16f53);
            }
            LiveIconView liveIconView = this.LLILLL;
            if (liveIconView != null) {
                liveIconView.setIconAttr(R.attr.da8);
            }
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.e34);
            if ((drawableLIZIZ instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableLIZIZ) != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey8, this.itemView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                gradientDrawable.setColor(iIntValue);
            }
            LiveIconView liveIconView2 = this.LLILLL;
            if (liveIconView2 != null) {
                liveIconView2.setBackground(gradientDrawable);
            }
            C16FS c16fs2 = this.LLILZLL;
            if (c16fs2 == null) {
                return;
            }
            C439101nJ.LJI(c16fs2);
            return;
        }
        P5(c20361214lm, c20365414mS, 0);
        N5(false);
        C20361214lm c20361214lm2 = c20365414mS.LIZ;
        C16FS c16fs3 = this.LLILZLL;
        if (c16fs3 != null) {
            c16fs3.setRadius(C418440Gaw.LIZIZ(16));
        }
        PlayRule playRule = c20361214lm2.LIZLLL;
        if (playRule != null) {
            boolValueOf = Boolean.valueOf(playRule.LJJIJL(c20361214lm2, false));
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C16FS c16fs4 = this.LLILZLL;
            if (c16fs4 != null) {
                c16fs4.setText(C497740JfY.LJIJI(2131855278));
            }
            C16FS c16fs5 = this.LLILZLL;
            if (c16fs5 != null) {
                C500260Jjc.LJLIIIL(500L, c16fs5, new C20363014m4(this, c20361214lm2));
            }
        } else {
            C16FS c16fs6 = this.LLILZLL;
            if (c16fs6 != null) {
                c16fs6.setText(C497740JfY.LJIJI(2131855279));
            }
            C16FS c16fs7 = this.LLILZLL;
            if (c16fs7 != null) {
                C500260Jjc.LJLIIIL(500L, c16fs7, new C20364114mF(this, c20361214lm2));
            }
        }
        C16FS c16fs8 = this.LLILZLL;
        if (c16fs8 == null) {
            return;
        }
        C12ES.LJIILL(0, c16fs8);
    }

    public C20366414mc(View view, DataChannel dataChannel, PlaybookAnchorViewModel playbookAnchorViewModel) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = playbookAnchorViewModel;
        this.LLILLL = (LiveIconView) view.findViewById(R.id.qs3);
        this.LLILZ = (C16F5) view.findViewById(R.id.qs4);
        this.LLILZIL = (C16F5) view.findViewById(R.id.qs2);
        this.LLILZLL = (C16FS) view.findViewById(R.id.qs0);
        this.LLIZ = (C1324720kZq) view.findViewById(R.id.qs1);
        this.LLIZLLLIL = C292401Bi.LIZ(new C20365814mW());
    }

    public final void L5(C0JBN c0jbn, int i, C20365714mV c20365714mV) {
        ImageView.ScaleType scaleType;
        if (i != 0) {
            c0jbn.LJIIL(new ColorDrawable(C20736316Cj.LIZJ(i, this.itemView)));
        }
        if (c20365714mV.LIZLLL > 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadDesc: ratio");
            sbLIZ.append(c20365714mV.LIZLLL);
            sbLIZ.append(" height:");
            int i2 = C20366514md.LLJJI;
            sbLIZ.append(i2);
            C20441214yg.LIZIZ("PlaybookDetailTaskViewHolder", C2188811AlT.LIZIZ(sbLIZ));
            c0jbn.LIZ(C814420VxA.LIZIZ(i2 * c20365714mV.LIZLLL), i2);
            c0jbn.LJIIZILJ(ImageView.ScaleType.CENTER_CROP);
            return;
        }
        if (C426750GoL.LIZLLL(this.itemView.getContext())) {
            scaleType = ImageView.ScaleType.FIT_END;
        } else {
            scaleType = ImageView.ScaleType.FIT_START;
        }
        c0jbn.LJIIZILJ(scaleType);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(X.C20361214lm r16, X.C20365414mS r17, int r18) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20366414mc.P5(X.14lm, X.14mS, int):void");
    }
}
