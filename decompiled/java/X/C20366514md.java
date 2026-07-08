package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tux.status.loading.TuxSpinner;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.14md, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20366514md extends AbstractC960470b6L<C20365414mS> {
    public static final int LLJJI = C439101nJ.LIZ(72);
    public static final int LLJJIII = C439101nJ.LIZ(48);
    public final InterfaceC20367214mk LL;
    public ConstraintLayout LLILLJJLI;
    public ConstraintLayout LLILLL;
    public FrameLayout LLILZ;
    public LiveIconView LLILZIL;
    public C1324720kZq LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public TextView LLJ;
    public LiveIconView LLJI;
    public LiveIconView LLJIJIL;
    public TuxSpinner LLJILJIL;
    public FrameLayout LLJILJILJ;
    public ImageView LLJILLL;
    public final C01GW LLJJ;

    public final void N5(boolean z) {
        if (z) {
            LiveIconView liveIconView = this.LLILZIL;
            if (liveIconView != null) {
                C786410Ut5.i5(liveIconView, 0.35f);
            }
            C1324720kZq c1324720kZq = this.LLILZLL;
            if (c1324720kZq != null) {
                C786410Ut5.h5(c1324720kZq, 0.35f);
            }
            TextView textView = this.LLIZ;
            if (textView != null) {
                C786410Ut5.S4(0.35f, textView);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LLILZIL;
        if (liveIconView2 != null) {
            C786410Ut5.i5(liveIconView2, 1.0f);
        }
        C1324720kZq c1324720kZq2 = this.LLILZLL;
        if (c1324720kZq2 != null) {
            C786410Ut5.h5(c1324720kZq2, 1.0f);
        }
        TextView textView2 = this.LLIZ;
        if (textView2 == null) {
            return;
        }
        C786410Ut5.S4(1.0f, textView2);
    }

    public C20366514md(View view, InterfaceC20367214mk interfaceC20367214mk) {
        super(view);
        this.LL = interfaceC20367214mk;
        this.LLJJ = C292401Bi.LIZ(AFwS221S0000000_31.get$arr$(336));
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01cc  */
    @Override // X.AbstractC960470b6L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(int r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20366514md.I5(int, java.lang.Object):void");
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
            int i2 = LLJJI;
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0195  */
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
    public final void P5(X.C20361214lm r23, X.C20365414mS r24, int r25) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20366514md.P5(X.14lm, X.14mS, int):void");
    }
}
