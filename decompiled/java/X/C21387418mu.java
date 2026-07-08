package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;

/* JADX INFO: renamed from: X.18mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21387418mu extends FrameLayout {
    public int LL;
    public int LLILLJJLI;
    public FrameLayout.LayoutParams LLILLL;
    public Drawable[] LLILZ;
    public final Random LLILZIL;
    public Queue<ImageView> LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final BPEAHandler LLJIJIL;
    public final RunnableC21387318mt LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;
    public PointF LLJJJIL;
    public PointF LLJJJJ;
    public PointF LLJJJJJIL;

    public final void LIZ() {
        this.LLILZLL = new LinkedList();
        this.LLILZ = new Drawable[2];
        Drawable drawable = getResources().getDrawable(R.drawable.cfn);
        Drawable drawable2 = getResources().getDrawable(R.drawable.cfo);
        Drawable[] drawableArr = this.LLILZ;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        if (drawable != null) {
            this.LLIZ = drawable.getIntrinsicHeight();
            this.LLIZLLLIL = drawable.getIntrinsicWidth();
            this.LLILLL = new FrameLayout.LayoutParams(this.LLIZLLLIL, this.LLIZ);
        }
        this.LLJJ = C12ES.LIZJ(51.0f, getContext());
        this.LLJJI = C12ES.LIZJ(48.0f, getContext());
        this.LLJJIII = C12ES.LIZJ(20.0f, getContext());
        this.LLJJIJI = C12ES.LIZJ(8.0f, getContext());
        this.LLJJIJIIJIL = C12ES.LIZJ(2.0f, getContext());
        InterfaceC21367518jh interfaceC21367518jh = new InterfaceC21367518jh() { // from class: X.18mw
            @Override // X.InterfaceC21367518jh
            public final void LIZ() {
            }

            @Override // X.InterfaceC21367518jh
            public final boolean LIZIZ() {
                return C0CCT.LIZIZ();
            }

            @Override // X.InterfaceC21367518jh
            public final boolean enable() {
                return C0CCT.LIZIZ();
            }
        };
        Map<String, InterfaceC21367518jh> map = C21367418jg.LIZ;
        if (map.containsKey("musicBezierDegrade")) {
            return;
        }
        map.put("musicBezierDegrade", interfaceC21367518jh);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJIJIL.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.18mt] */
    public C21387418mu(Context context) {
        super(context);
        this.LLILZIL = new Random();
        this.LLJIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = new Runnable() { // from class: X.18mt
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
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
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 275
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC21387318mt.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PeriscopeLayout@6faa.<field>$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PeriscopeLayout@6faa.<field>$2");
            }
        };
        this.LLJILLL = 0;
        this.LLJJIJIL = -1.0f;
        this.LLJJJ = -1.0f;
        LIZ();
    }

    public final void LIZIZ(View view) {
        C21387518mv c21387518mv;
        if (view.getTag() == null) {
            return;
        }
        ((LinkedList) this.LLILZLL).add(view);
        ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
        if (valueAnimator != null) {
            valueAnimator.setTarget(null);
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        if ((view.getTag(R.id.x11) instanceof C21387518mv) && (c21387518mv = (C21387518mv) view.getTag(R.id.x11)) != null) {
            c21387518mv.LL = null;
        }
        C786410Ut5.T4(view, 0.0f);
        C786410Ut5.Ob(view, 0.3f);
        C786410Ut5.pc(view, 0.3f);
        C786410Ut5.Ab(view, 0.0f);
        view.setTag(null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.18mt] */
    public C21387418mu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = new Random();
        this.LLJIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = new Runnable() { // from class: X.18mt
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
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
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 275
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC21387318mt.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PeriscopeLayout@6faa.<field>$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PeriscopeLayout@6faa.<field>$2");
            }
        };
        this.LLJILLL = 0;
        this.LLJJIJIL = -1.0f;
        this.LLJJJ = -1.0f;
        LIZ();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLJJLI = getMeasuredWidth();
        this.LL = getMeasuredHeight();
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        this.LLJILJILJ = z;
        this.LLJJIJIL = -1.0f;
    }
}
