package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import u4.q0;

/* JADX INFO: renamed from: X.0mIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1391040mIo extends C19GU {
    public final CharSequence LLILZLL;
    public final CharSequence LLIZ;
    public final C1391050mIp LLIZLLLIL;

    public static void LJJZ(C19GU c19gu, C0WZX c0wzx) throws Throwable {
        Object obj;
        DialogC19728412Gs dialogC19728412Gs = c19gu;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", dialogC19728412Gs, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            dialogC19728412Gs = (DialogC19728412Gs) obj;
        }
        super.show();
        c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
    }

    @Override // android.app.Dialog
    public final void hide() {
        if (this.LLIZLLLIL.LIZ) {
            return;
        }
        super.hide();
    }

    public final void LJJZZI() {
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, X.19ng] */
    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        View viewFindViewById = findViewById(R.id.spp);
        View viewFindViewById2 = findViewById(R.id.acb);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            return;
        }
        final C1391050mIp c1391050mIp = this.LLIZLLLIL;
        Context context = getContext();
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(this, 405);
        final AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 1608);
        c1391050mIp.getClass();
        if (!C497820Jfg.LJ(context) && !C497820Jfg.LIZLLL(context)) {
            c1391050mIp.LIZIZ(context, viewFindViewById, awS600S0100000_21, awS565S0100000_21);
            return;
        }
        if (c1391050mIp.LIZ) {
            return;
        }
        final C259800zU c259800zU = new C259800zU();
        if (!C07XO.LIZ) {
            ?? c21647019ng = new C21647019ng(context, viewFindViewById, new C19746312Np(EnumC19746112Nn.SPRING, C1391050mIp.LIZJ, Collections.singletonList(new C19746412Nq("Pad_Exit_Y", new C0HV5(0.0f, C497820Jfg.LIZ(context))))), false);
            c259800zU.element = c21647019ng;
            c21647019ng.LJI(true);
        }
        final ValueAnimator valueAnimatorLIZ = C1391050mIp.LIZ(awS600S0100000_21);
        C21647019ng c21647019ng2 = new C21647019ng(context, viewFindViewById2, C07XO.LIZ ? new C19746312Np(EnumC19746112Nn.BEZIER, C1391050mIp.LJI, C1391050mIp.LJFF) : new C19746312Np(EnumC19746112Nn.SPRING, C1391050mIp.LIZJ, C1391050mIp.LJFF), false);
        c21647019ng2.LIZJ("Alpha_Exit", new InterfaceC21641019mi() { // from class: X.0mIq
            @Override // X.InterfaceC21641019mi
            public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
            }

            @Override // X.InterfaceC21641019mi
            public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                c1391050mIp.LIZ = false;
                ValueAnimator valueAnimator = valueAnimatorLIZ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                Function0<Unit> function0 = awS565S0100000_21;
                if (function0 != null) {
                    function0.invoke();
                }
                C21647019ng c21647019ng3 = c259800zU.element;
                if (c21647019ng3 != null) {
                    c21647019ng3.LIZ();
                }
            }
        });
        c21647019ng2.LJI(true);
        valueAnimatorLIZ.start();
        c1391050mIp.LIZ = true;
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        try {
            C1389610mGV.LIZIZ(this);
            LJJZ(this, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW6IFQDz7na4rXu7hQhcW46T/NuONL42o=", null));
            RadiusLayout radiusLayout = (RadiusLayout) findViewById(R.id.spp);
            C338760DPu c338760DPu = (C338760DPu) findViewById(R.id.acb);
            if (radiusLayout != null && c338760DPu != null) {
                this.LLIZLLLIL.LIZLLL(getContext(), radiusLayout, c338760DPu);
            }
            View viewFindViewById = findViewById(R.id.spp);
            if (viewFindViewById != null) {
                viewFindViewById.setContentDescription(this.LLILZLL);
                C426750GoL.LJI(viewFindViewById);
                q0.LJIILL(viewFindViewById, C20092413jW.LJI, this.LLIZ, new InterfaceC20092813ja() { // from class: X.0mIt
                    @Override // X.InterfaceC20092813ja
                    public final boolean LIZ(View view) {
                        DialogC1391040mIo dialogC1391040mIo = this.LIZ;
                        dialogC1391040mIo.dismiss();
                        C785410UrT.LIZ(dialogC1391040mIo);
                        return true;
                    }
                });
            }
        } catch (WindowManager.BadTokenException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public DialogC1391040mIo(Context context, boolean z) {
        int i;
        super(context, R.style.ji);
        this.LLIZLLLIL = new C1391050mIp();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.TuxModal, R.attr.ya, 0);
        if (C497820Jfg.LJ(getContext())) {
            i = R$styleable.TuxModal_tux_modalOverlayRatioPad;
        } else {
            i = R$styleable.TuxModal_tux_modalOverlayRatio;
        }
        float f = typedArrayObtainStyledAttributes.getFloat(i, 0.0f);
        this.LLILZLL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxModal_tux_modalDialogLabel);
        this.LLIZ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxModal_tux_modalCloseLabel);
        typedArrayObtainStyledAttributes.recycle();
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        setContentView(new FrameLayout(getContext()));
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
            if (z) {
                window2.addFlags(2);
                window2.getAttributes().dimAmount = f;
            } else {
                window2.clearFlags(2);
            }
            window2.getAttributes().height = -1;
            window2.getAttributes().gravity = 1;
            window2.getAttributes().width = -1;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ != null) {
            TuxImmersionBar tuxImmersionBarLJFF = C1766560w4U.LJFF(c19egLIZIZ, this);
            tuxImmersionBarLJFF.LJIIJJI();
            tuxImmersionBarLJFF.LIZLLL();
        }
    }
}
