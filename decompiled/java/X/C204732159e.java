package X;

import Y.AAListenerS88S0400000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.159e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204732159e extends ConstraintLayout implements C15AJ {
    public ViewGroup LL;
    public String LLILLJJLI;
    public final boolean LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public InterfaceC420801kM LLIZLLLIL;
    public C204733159f LLJ;
    public C20475715Ad LLJI;
    public final long LLJIJIL;

    @Override // X.C15AJ
    public final boolean LLZZLLIL() {
        return false;
    }

    @Override // X.C15AJ
    public final void g() {
    }

    @Override // android.view.View, X.C15AJ
    public String getTag() {
        return "LabelGeniusView";
    }

    @Override // X.C15AJ
    public final boolean LLIIII() {
        return getParent() != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC420801kM interfaceC420801kM;
        super.onDetachedFromWindow();
        InterfaceC420801kM interfaceC420801kM2 = this.LLIZLLLIL;
        if (interfaceC420801kM2 != null && !interfaceC420801kM2.isDisposed() && (interfaceC420801kM = this.LLIZLLLIL) != null) {
            interfaceC420801kM.dispose();
        }
        this.LLIZLLLIL = null;
    }

    @Override // X.C15AJ
    public final void LJIIJ() {
        C15AI.LJII(this);
    }

    @Override // X.C15AJ
    public final void LLLIILIL() {
        C15AI.LIZ(this);
    }

    @Override // X.C15AJ
    public String getGeniusId() {
        return this.LLILLJJLI;
    }

    @Override // X.C15AJ
    public ViewGroup getRoot() {
        return this.LL;
    }

    @Override // X.C15AJ
    public C20475715Ad getGeniusModel() {
        return this.LLJI;
    }

    public static String e0(long j) {
        if (j <= 10) {
            if (j < 0) {
                j = 0;
            }
            return String.valueOf(j);
        }
        long j2 = 60;
        long j3 = j / j2;
        long j4 = j % j2;
        if (j4 < 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j3);
            sbLIZ.append(":0");
            sbLIZ.append(j4);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(j3);
        sbLIZ2.append(':');
        sbLIZ2.append(j4);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static String h0(long j) {
        if (j < 60) {
            return C497740JfY.LJIJI(2131852941);
        }
        return C341701Uh.LIZ(C497740JfY.LJIJI(2131852942), Long.valueOf(j / ((long) 60)));
    }

    @Override // X.C15AJ
    public final ViewGroup.LayoutParams LLIIIZ(Rect rect) {
        return C15AI.LIZIZ(this, rect);
    }

    @Override // X.C15AJ
    public final void LLIIL(View view) {
        C15AI.LJIIIIZZ(this, view);
    }

    @Override // X.C15AJ
    public final void W(InterfaceC20476615Am interfaceC20476615Am) {
        InterfaceC420801kM interfaceC420801kM;
        C15AI.LJ(this, interfaceC20476615Am);
        C500260Jjc.LJLJLJ(this, false);
        InterfaceC420801kM interfaceC420801kM2 = this.LLIZLLLIL;
        if (interfaceC420801kM2 != null && !interfaceC420801kM2.isDisposed() && (interfaceC420801kM = this.LLIZLLLIL) != null) {
            interfaceC420801kM.dispose();
        }
        this.LLIZLLLIL = null;
    }

    public final void l0(boolean z) {
        EnumC204738159k enumC204738159k;
        int i;
        C500260Jjc.LJLJLJ(this.LLILZIL, true);
        C204733159f c204733159f = this.LLJ;
        if (c204733159f != null) {
            this.LLILZIL.setTextColor(c204733159f.LIZJ);
        }
        Long lI0 = i0(this.LLJ, 0L);
        if (lI0 == null) {
            C500260Jjc.LJLJLJ(this.LLILZIL, false);
            return;
        }
        C500260Jjc.LJLJLJ(this.LLILZIL, true);
        if (lI0.longValue() < 0) {
            this.LLILZIL.setText(n0(z, this, 0L));
            return;
        }
        C204733159f c204733159f2 = this.LLJ;
        if (c204733159f2 != null) {
            enumC204738159k = c204733159f2.LIZ;
        } else {
            enumC204738159k = null;
        }
        if (enumC204738159k == EnumC204738159k.RUNNING_STATE_WITH_COUNT_DOWN_ANIAMTION && lI0.longValue() <= 10) {
            this.LLILZIL.setText(n0(z, this, lI0.longValue()));
            C16F5 c16f5 = this.LLILZIL;
            C204733159f c204733159f3 = this.LLJ;
            if (c204733159f3 != null) {
                i = c204733159f3.LIZLLL;
            } else {
                i = -16776961;
            }
            c16f5.setTextColor(i);
            if (!this.LLILLL) {
                return;
            }
            C16F5 c16f52 = this.LLILZIL;
            AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(372);
            if (c16f52 == null) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c16f52, (Property<C16F5, Float>) View.SCALE_X, 1.0f, 1.3f);
            objectAnimatorOfFloat.setDuration(250L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c16f52, (Property<C16F5, Float>) View.SCALE_X, 1.3f, 1.0f);
            objectAnimatorOfFloat2.setDuration(250L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c16f52, (Property<C16F5, Float>) View.SCALE_Y, 1.0f, 1.3f);
            objectAnimatorOfFloat3.setDuration(250L);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c16f52, (Property<C16F5, Float>) View.SCALE_Y, 1.3f, 1.0f);
            objectAnimatorOfFloat4.setDuration(250L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat3);
            animatorSet.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat4).after(objectAnimatorOfFloat);
            animatorSet.addListener(new AAListenerS88S0400000_31(animatorSet, aFwS221S0000000_31, animatorSet, aFwS221S0000000_31, 1));
            animatorSet.start();
            return;
        }
        this.LLILZIL.setText(n0(z, this, lI0.longValue()));
    }

    @Override // X.C15AJ
    public final void log(String str) {
        C15AI.LJFF(this, str);
    }

    public void setGeniusId(String str) {
        this.LLILLJJLI = str;
    }

    @Override // X.C15AJ
    public void setRoot(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }

    @Override // X.C15AJ
    public void setGeniusModel(C20475715Ad c20475715Ad) {
        this.LLJI = c20475715Ad;
    }

    public final Long i0(C204733159f c204733159f, long j) {
        Function0<Long> function0;
        Long lInvoke;
        long j2;
        if (c204733159f != null && (function0 = c204733159f.LJIILIIL) != null && (lInvoke = function0.invoke()) != null) {
            long jLongValue = lInvoke.longValue();
            if (c204733159f.LIZ == EnumC204738159k.RUNNING_STATE_SHOW_TIME) {
                j2 = jLongValue / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            } else {
                long j3 = ((long) c204733159f.LIZIZ) + j;
                long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
                j2 = ((j3 * j4) - jLongValue) / j4;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getOngoingRemainTimeInSeconds config.boardType:");
            sbLIZ.append(c204733159f.LIZ);
            sbLIZ.append(" remainTime = ");
            sbLIZ.append(j2);
            C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ));
            return Long.valueOf(j2);
        }
        return null;
    }

    public C204732159e(ViewGroup viewGroup, String str, boolean z) {
        super(viewGroup.getContext());
        this.LL = viewGroup;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        View viewInflate = ViewGroup.inflate(getRoot().getContext(), R.layout.hd1, this);
        this.LLILZ = (C16F5) viewInflate.findViewById(R.id.bp0);
        this.LLILZIL = (C16F5) viewInflate.findViewById(R.id.bow);
        this.LLILZLL = (C16F5) viewInflate.findViewById(R.id.boy);
        this.LLIZ = (C16F5) viewInflate.findViewById(R.id.box);
        ViewGroup.LayoutParams layoutParamsLIZIZ = C15AI.LIZIZ(this, new Rect(C439101nJ.LIZ(6), C439101nJ.LIZ(5), 0, 0));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParamsLIZIZ);
        getRoot().setClipChildren(false);
        this.LLJIJIL = 1400L;
    }

    public static final String n0(boolean z, C204732159e c204732159e, long j) {
        StringBuilder sbLIZ;
        if (z) {
            c204732159e.getClass();
            return e0(j);
        }
        c204732159e.getClass();
        long j2 = 60;
        long j3 = j / j2;
        long j4 = j % j2;
        if (j4 < 10) {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j3);
            sbLIZ.append(":0");
        } else {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j3);
            sbLIZ.append(':');
        }
        sbLIZ.append(j4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C15AJ
    public final void LJLL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        C15AI.LJIIIZ(this, list, interfaceC20476615Am, function2);
    }

    @Override // X.C15AJ
    public final void LLJJIJIL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        throw new UnsupportedOperationException("BoardGeniusModel can not updateByAnimation");
    }

    @Override // X.C15AJ
    public final void LLJLILLLLZIIL(InterfaceC20476615Am interfaceC20476615Am, String str, Function2 function2) {
        C15AI.LJI(this, interfaceC20476615Am, str, function2);
    }

    public static ObjectAnimator j0(C204732159e c204732159e, C16F5 c16f5, Property property, float[] fArr) {
        c204732159e.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) property, Arrays.copyOf(fArr, fArr.length));
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return objectAnimatorOfFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // X.C15AJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZZIL(X.InterfaceC20476615Am r16, java.lang.String r17, boolean r18, kotlin.jvm.functions.Function2 r19) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204732159e.LLLZZIL(X.15Am, java.lang.String, boolean, kotlin.jvm.functions.Function2):void");
    }
}
