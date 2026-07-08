package X;

import Y.AAListenerS261S0200000_6;
import Y.AAListenerS332S0100000_21;
import Y.AAListenerS69S0110000_21;
import Y.ACListenerS48S0201000_21;
import Y.AUListenerS254S0100000_4;
import Y.AUListenerS270S0100000_21;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369580lkC extends FrameLayout implements InterfaceC1368050lhj, InterfaceC1370520lli, InterfaceC1369680lkM {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public String LL;
    public TuxIconView LLILLJJLI;
    public LinearLayout LLILLL;
    public RelativeLayout LLILZ;
    public FrameLayout LLILZIL;
    public TuxTextView LLILZLL;
    public TuxIconView LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final String[] LLJI;
    public final List<TuxIconView> LLJIJIL;
    public final List<ViewGroup> LLJILJIL;
    public boolean LLJILJILJ;
    public List<? extends InterfaceC1369790lkX> LLJILLL;
    public InterfaceC1368050lhj LLJJ;
    public AbstractC1366540lfI LLJJI;
    public C1371590lnR LLJJIII;
    public LinearLayoutManager LLJJIJI;
    public boolean LLJJIJIIJIL;
    public Function1<? super InterfaceC1369790lkX, Boolean> LLJJIJIL;
    public InterfaceC1369680lkM LLJJJ;
    public RecyclerView LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public EnumC1369720lkQ LLJJJJLIIL;
    public Animator LLJJL;
    public final List<C21647019ng> LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public final C01GW LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;

    public C1369580lkC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 4);
    }

    @Override // X.InterfaceC1370520lli
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1370520lli
    public final View LJI(C1361400lX0 c1361400lX0, C1371590lnR c1371590lnR, Fragment fragment) {
        return null;
    }

    @Override // X.InterfaceC1370520lli
    public final View LJII(C1361400lX0 c1361400lX0, C1371590lnR c1371590lnR, InterfaceC1362720lZ8 interfaceC1362720lZ8, Fragment fragment) {
        return this;
    }

    @Override // X.InterfaceC1370520lli
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370520lli
    public final void LJIIJJI(Fragment fragment, C1371590lnR c1371590lnR, InterfaceC1362720lZ8 interfaceC1362720lZ8, ViewGroup viewGroup, ViewGroup viewGroup2) {
    }

    @Override // X.InterfaceC1370520lli
    public final void LJIIL(Context context, RecyclerView recyclerView, C1371590lnR c1371590lnR, InterfaceC1362720lZ8 interfaceC1362720lZ8, Fragment fragment) {
    }

    @Override // X.InterfaceC1370520lli
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.InterfaceC1370520lli
    public final void LJLZ() {
    }

    @Override // X.InterfaceC1370520lli
    public View getWidgetView() {
        return this;
    }

    public void setUpAdditionView(Fragment fragment) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C0DXR getGridItemDecoration() {
        /*
            r6 = this;
            X.0ll3 r1 = X.C1370370llT.LIZ
            if (r1 == 0) goto L2f
            X.0lnR r0 = r6.LLJJIII
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r0 = r0.LJIJJ
        La:
            boolean r1 = r1.LJFF(r0)
            r0 = 1
            if (r1 != r0) goto L2f
        L11:
            r1 = 16
            if (r0 == 0) goto L31
            X.06Z1 r2 = new X.06Z1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
            java.util.List<? extends X.0lkX> r0 = r6.LLJILLL
            int r0 = r0.size()
            r2.<init>(r1, r0)
            return r2
        L2d:
            r0 = 0
            goto La
        L2f:
            r0 = 0
            goto L11
        L31:
            X.00cf r5 = new X.00cf
            r5.<init>()
            android.content.Context r0 = r6.getContext()
            int r0 = X.C12ES.LJIIJ(r0)
            r5.element = r0
            X.0lnR r0 = r6.LLJJIII
            if (r0 == 0) goto L66
            X.0hcC r0 = r0.LJJLIIIJJI
            if (r0 == 0) goto L66
            int r4 = r0.LIZIZ
        L4a:
            X.0GhQ r3 = new X.0GhQ
            r6.getContext()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r2 = X.C814420VxA.LIZIZ(r0)
            kotlin.jvm.internal.AwS407S0200000_6 r1 = new kotlin.jvm.internal.AwS407S0200000_6
            r0 = 28
            r1.<init>(r6, r5, r0)
            r3.<init>(r2, r4, r1)
            return r3
        L66:
            r0 = 62
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r4 = X.C814420VxA.LIZIZ(r0)
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369580lkC.getGridItemDecoration():X.0DXR");
    }

    @Override // X.InterfaceC1370520lli
    public final boolean LIZ() {
        return C1367830lhN.LIZ(this.LLJJIII);
    }

    @Override // X.InterfaceC1370520lli
    public final void LIZJ() {
        RecyclerView recyclerView;
        if (!(!this.LLJILLL.isEmpty()) || (recyclerView = this.LLJJJIL) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    public final void LJIJ() {
        C1371590lnR c1371590lnR = this.LLJJIII;
        if (c1371590lnR != null) {
            List<InterfaceC1369790lkX> list = c1371590lnR.LIZ;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1369790lkX interfaceC1369790lkX : list) {
                if (true ^ C13LQ.LJIILLIIL(interfaceC1369790lkX.key(), this.LLJI)) {
                    arrayList.add(interfaceC1369790lkX);
                }
            }
            List listLL = C13LP.LL(arrayList, ((ArrayList) this.LLJIJIL).size());
            int size = listLL.size();
            for (int i = 0; i < size; i++) {
                Drawable drawableLJJII = ((InterfaceC1369790lkX) ListProtector.get(listLL, i)).LJJII(getContext(), false);
                if (drawableLJJII != null) {
                    ((View) ListProtector.get(this.LLJIJIL, i)).setBackground(drawableLJJII);
                } else {
                    InterfaceC1369790lkX interfaceC1369790lkX2 = (InterfaceC1369790lkX) ListProtector.get(listLL, i);
                    getContext();
                    interfaceC1369790lkX2.LJIL();
                    Pair pair = new Pair("", null);
                    String str = (String) pair.getFirst();
                    Drawable drawable = (Drawable) pair.getSecond();
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ.LJJI((ImageView) ListProtector.get(this.LLJIJIL, i));
                    c1331670kl3LJIIIZ.LJJIIZI(drawable);
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                }
                C786410Ut5.LLLLLLZZ((TuxIconView) ListProtector.get(this.LLJIJIL, i), 0);
                View view = (View) ListProtector.get(this.LLJIJIL, i);
                if (view.getParent() != null && (view.getParent() instanceof RadiusLayout)) {
                    float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.b4);
                    ((RadiusLayout) view.getParent()).LIZ(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                }
                ArrayList<JSONObject> arrayList2 = C1369870lkf.LIZ;
                C1369870lkf.LIZIZ((InterfaceC1369790lkX) ListProtector.get(listLL, i));
                C1364460lbw c1364460lbw = C1361760lXa.LIZ.get("click_to_expose_duration");
                if (c1364460lbw != null && c1364460lbw.LIZIZ == 0) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C1364460lbw c1364460lbw2 = C1361760lXa.LIZ.get("click_to_expose_duration");
                    if (c1364460lbw2 != null) {
                        c1364460lbw2.LIZIZ = jElapsedRealtime;
                    }
                    C1364460lbw c1364460lbw3 = C1361760lXa.LIZ.get("ui_load_duration");
                    if (c1364460lbw3 != null) {
                        c1364460lbw3.LIZIZ = jElapsedRealtime;
                    }
                }
                C786410Ut5.a9((TuxIconView) ListProtector.get(this.LLJIJIL, i), new ACListenerS48S0201000_21(i, this, listLL, 2));
                if (((InterfaceC1369790lkX) ListProtector.get(listLL, i)).LIZJ()) {
                    C786410Ut5.x5((TuxIconView) ListProtector.get(this.LLJIJIL, i), ((InterfaceC1369790lkX) ListProtector.get(listLL, i)).LJJL());
                } else {
                    C786410Ut5.x5((TuxIconView) ListProtector.get(this.LLJIJIL, i), 1.0f);
                }
            }
        }
    }

    public final FrameLayout getAfterCollpaseContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ajm);
            this.LLILZIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final RelativeLayout getBeforeCollapseContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bv2);
            this.LLILZ = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final TuxIconView getCollapseChannelIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e5y);
            this.LLIZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final Drawable getCollapseIcon() {
        return (Drawable) this.LLJLIL.getValue();
    }

    public final Drawable getExpandIcon() {
        return (Drawable) this.LLJL.getValue();
    }

    @Override // X.InterfaceC1370520lli
    public EnumC1369700lkO getLayoutPriority() {
        EnumC1369700lkO enumC1369700lkO;
        C1371590lnR c1371590lnR = this.LLJJIII;
        return (c1371590lnR == null || (enumC1369700lkO = c1371590lnR.LIZJ) == null) ? EnumC1369700lkO.MIDDLE : enumC1369700lkO;
    }

    public final LinearLayout getLlCollapseRootFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nbs);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getShareChannelIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uyx);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getShareHintFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uzf);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.InterfaceC1370520lli
    public EnumC1369720lkQ getShowStyle() {
        EnumC1369720lkQ enumC1369720lkQ;
        C1371590lnR c1371590lnR = this.LLJJIII;
        return (c1371590lnR == null || (enumC1369720lkQ = c1371590lnR.LIZIZ) == null) ? EnumC1369720lkQ.EXPAND : enumC1369720lkQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x049a A[PHI: r7
      0x049a: PHI (r7v1 int) = (r7v0 int), (r7v3 int) binds: [B:217:0x0496, B:120:0x0293] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instruction units count: 1525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369580lkC.onAttachedToWindow():void");
    }

    public final List<InterfaceC1369790lkX> getCurrentChannel() {
        return this.LLJILLL;
    }

    public final String getEnterMethod() {
        return this.LL;
    }

    public final Function1<InterfaceC1369790lkX, Boolean> getFilterCondition() {
        return this.LLJJIJIL;
    }

    public final boolean getHasAnimation() {
        return this.LLJLLL;
    }

    public EnumC992950bwj getWidgetType() {
        return EnumC992950bwj.CHANNEL_BAR;
    }

    @Override // X.InterfaceC1369680lkM
    public final void LIZIZ(int i) {
        C1369610lkF c1369610lkF;
        this.LLJJJJLIIL = EnumC1369720lkQ.EXPAND;
        C1371590lnR c1371590lnR = this.LLJJIII;
        if (c1371590lnR != null && (c1369610lkF = c1371590lnR.LJJLIIIJ) != null && c1369610lkF.LIZIZ) {
            C1369610lkF c1369610lkF2 = c1371590lnR.LJJLIIIJ;
            if (c1369610lkF2 != null && c1369610lkF2.LJ) {
                LJIILLIIL(i, true);
                return;
            } else {
                LJIILL(i, true);
                return;
            }
        }
        LinearLayout llCollapseRootFromXml = getLlCollapseRootFromXml();
        RelativeLayout beforeCollapseContainerFromXml = getBeforeCollapseContainerFromXml();
        FrameLayout afterCollpaseContainerFromXml = getAfterCollpaseContainerFromXml();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(llCollapseRootFromXml.getHeight(), i);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS254S0100000_4(llCollapseRootFromXml, 17));
        valueAnimatorOfInt.setDuration(350L);
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(beforeCollapseContainerFromXml, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new AAListenerS261S0200000_6(beforeCollapseContainerFromXml, afterCollpaseContainerFromXml, 25));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(afterCollpaseContainerFromXml, "alpha", 0.1f, 1.0f);
        objectAnimatorOfFloat2.setDuration(150L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat2.addUpdateListener(new AUListenerS270S0100000_21(afterCollpaseContainerFromXml, 41));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat2).after(objectAnimatorOfFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(valueAnimatorOfInt).with(animatorSet);
        animatorSet2.start();
    }

    @Override // X.InterfaceC1370520lli
    public final void LJ(boolean z) {
        this.LLJILJILJ = z;
    }

    @Override // X.InterfaceC1370520lli
    public final void LJFF(C1371590lnR c1371590lnR) {
        this.LLJJIII = c1371590lnR;
    }

    @Override // X.InterfaceC1369680lkM
    public final void LJIIJ(int i) {
        C1369610lkF c1369610lkF;
        this.LLJJJJLIIL = EnumC1369720lkQ.COLLAPSE;
        C1371590lnR c1371590lnR = this.LLJJIII;
        if (c1371590lnR != null && (c1369610lkF = c1371590lnR.LJJLIIIJ) != null && c1369610lkF.LIZIZ) {
            C1369610lkF c1369610lkF2 = c1371590lnR.LJJLIIIJ;
            if (c1369610lkF2 != null && c1369610lkF2.LJ) {
                LJIILLIIL(i, false);
            } else {
                LJIILL(i, false);
            }
        }
    }

    public final void setAfterCollpaseContainerFromXml(FrameLayout frameLayout) {
        this.LLILZIL = frameLayout;
    }

    public final void setBeforeCollapseContainerFromXml(RelativeLayout relativeLayout) {
        this.LLILZ = relativeLayout;
    }

    public final void setCollapseChannelIconFromXml(TuxIconView tuxIconView) {
        this.LLIZ = tuxIconView;
    }

    public final void setEnterMethod(String str) {
        this.LL = str;
    }

    public final void setFilterCondition(Function1<? super InterfaceC1369790lkX, Boolean> function1) {
        this.LLJJIJIL = function1;
    }

    public final void setHasAnimation(boolean z) {
        RecyclerView recyclerView;
        if (z && (recyclerView = this.LLJJJIL) != null) {
            recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), R.anim.fh));
        }
        this.LLJLLL = z;
    }

    public final void setLabelViewTopMargin(int i) {
        this.LLJLL = i;
    }

    public final void setLlCollapseRootFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setShareChannelIconFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setShareHintFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setSquareStyle(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    @Override // X.InterfaceC1368050lhj
    public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX, View view) {
        InterfaceC1368050lhj interfaceC1368050lhj = this.LLJJ;
        if (interfaceC1368050lhj != null) {
            interfaceC1368050lhj.LJIIIIZZ(interfaceC1369790lkX, view);
        }
    }

    public final void LJIILJJIL(C1369610lkF c1369610lkF, int i) {
        int iLIZIZ;
        double dLIZIZ;
        BaseSharePackage baseSharePackage;
        int size;
        C1369610lkF c1369610lkF2;
        RecyclerView recyclerView;
        List<InterfaceC1369790lkX> list;
        List<InterfaceC1369790lkX> list2;
        int i2 = 4;
        if (c1369610lkF != null) {
            iLIZIZ = c1369610lkF.LIZ;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        }
        BaseSharePackage baseSharePackage2 = null;
        if (c1369610lkF == null) {
            dLIZIZ = ((double) i) - ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        } else {
            InterfaceC1366500lfE interfaceC1366500lfE = C1370370llT.LJIIIIZZ;
            if (interfaceC1366500lfE != null) {
                C1371590lnR c1371590lnR = this.LLJJIII;
                if (c1371590lnR != null) {
                    baseSharePackage = c1371590lnR.LJIJJ;
                } else {
                    baseSharePackage = null;
                }
                if (interfaceC1366500lfE.LJIIIZ(baseSharePackage)) {
                    i2 = 8;
                }
            }
            dLIZIZ = ((((double) i) - ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)))) - ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2 * 2))))) - ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        final int iFloor = (int) Math.floor((((double) iLIZIZ) + dLIZIZ) / ((double) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62)) + iLIZIZ)));
        if (iFloor < 1) {
            iFloor = 1;
        }
        double d = iFloor;
        double dLIZIZ2 = (dLIZIZ - ((double) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62)) * iFloor))) / d;
        final double d2 = ((d * dLIZIZ2) / ((double) (iFloor - 1))) - dLIZIZ2;
        C1371590lnR c1371590lnR2 = this.LLJJIII;
        if (c1371590lnR2 != null && (list2 = c1371590lnR2.LIZ) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        float fCeil = (float) Math.ceil(size / (iFloor * 1.0f));
        C1369860lke c1369860lke = new C1369860lke();
        int i3 = (int) fCeil;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = (i5 * iFloor) + i6;
                if (i7 < this.LLJILLL.size() && c1369860lke.LIZ(((InterfaceC1369790lkX) ListProtector.get(this.LLJILLL, i7)).label())) {
                    i4++;
                    break;
                } else {
                    i6++;
                    if (i6 < iFloor) {
                    }
                }
            }
        }
        if (c1369610lkF != null && c1369610lkF.LIZIZ) {
            int i8 = 58 + ((int) ((68 * fCeil) + ((fCeil - 1) * 16))) + (i4 * 14) + 12;
            this.LLJJJJ = i8;
            this.LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i8)));
        } else {
            this.LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf((70 * fCeil) + ((fCeil - 1) * 16) + 24 + (i4 * 14))));
        }
        Context context = getContext();
        int i9 = this.LLIZLLLIL;
        C1371590lnR c1371590lnR3 = this.LLJJIII;
        if (c1371590lnR3 != null) {
            baseSharePackage2 = c1371590lnR3.LJIJJ;
            c1369610lkF2 = c1371590lnR3.LJJLIIIJ;
        } else {
            c1369610lkF2 = null;
        }
        this.LLJJI = new C1369810lkZ(context, this, i9, baseSharePackage2, c1369610lkF2);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), iFloor);
        RecyclerView recyclerView2 = this.LLJJJIL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
        if (!this.LLJZ && (recyclerView = this.LLJJJIL) != null) {
            final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C1371590lnR c1371590lnR4 = this.LLJJIII;
            if (c1371590lnR4 != null && (list = c1371590lnR4.LIZ) != null) {
                list.size();
            }
            recyclerView.addItemDecoration(new C0DXR(d2, iLIZIZ2, iFloor) { // from class: X.0DXv
                public final double LL;
                public final int LLILLJJLI;
                public final int LLILLL;

                {
                    this.LL = d2;
                    this.LLILLJJLI = iLIZIZ2;
                    this.LLILLL = iFloor;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView3, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView3.getChildAdapterPosition(view);
                    rect.top = this.LLILLJJLI;
                    int i10 = this.LLILLL;
                    if (childAdapterPosition < i10) {
                        rect.top = 0;
                    }
                    int i11 = childAdapterPosition % i10;
                    if (i11 == 0) {
                        rect.left = 0;
                    } else {
                        rect.left = (int) (this.LL * ((double) i11));
                    }
                }
            });
        }
    }

    public final void LJIILL(int i, final boolean z) {
        final boolean z2;
        ValueAnimator valueAnimatorOfFloat;
        C1369610lkF c1369610lkF;
        float f;
        int left;
        int left2;
        Number numberValueOf;
        C1369610lkF c1369610lkF2;
        C1371590lnR c1371590lnR = this.LLJJIII;
        if (c1371590lnR != null && (c1369610lkF2 = c1371590lnR.LJJLIIIJ) != null && c1369610lkF2.LIZJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new AAListenerS332S0100000_21(this, 10));
        LinearLayout llCollapseRootFromXml = getLlCollapseRootFromXml();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(llCollapseRootFromXml.getHeight(), i);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS254S0100000_4(llCollapseRootFromXml, 16));
        valueAnimatorOfInt.setDuration(350L);
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
        arrayList.add(valueAnimatorOfInt);
        float[] fArr = {0.0f, 1.0f};
        if (z) {
            // fill-array-data instruction
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        } else {
            valueAnimatorOfFloat = ObjectAnimator.ofFloat(fArr);
        }
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X.0lkD
            public final /* synthetic */ C1369580lkC LLILLJJLI;

            {
                this.LLILLJJLI = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (z2) {
                    C786410Ut5.x5(this.LLILLJJLI.getShareChannelIconFromXml(), fFloatValue);
                }
                Iterator<TuxIconView> it2 = this.LLILLJJLI.LLJIJIL.iterator();
                while (it2.hasNext()) {
                    C786410Ut5.x5(it2.next(), fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0lkE
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void LIZ(int i2) {
                boolean z3;
                if (z2) {
                    C786410Ut5.LLLLLLZZ(this.getShareChannelIconFromXml(), i2);
                }
                for (TuxIconView tuxIconView : this.LLJIJIL) {
                    if (i2 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    tuxIconView.setClickable(z3);
                }
                Iterator<ViewGroup> it2 = this.LLJILJIL.iterator();
                while (it2.hasNext()) {
                    C786410Ut5.LJLZ(i2, it2.next());
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i2;
                if (z) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                LIZ(i2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (!z) {
                    LIZ(0);
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        float[] fArr2 = {1.0f, 0.0f};
        if (z) {
            // fill-array-data instruction
            fArr2[0] = 0.0f;
            fArr2[1] = 1.0f;
        }
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(fArr2);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS270S0100000_21(this, 17));
        valueAnimatorOfFloat2.addListener(new AAListenerS69S0110000_21(this, z, 0));
        arrayList.add(valueAnimatorOfFloat2);
        if (z2) {
            if (C0H4W.LIZ()) {
                left = getShareHintFromXml().getRight();
                left2 = getShareChannelIconFromXml().getRight();
            } else {
                left = getShareHintFromXml().getLeft();
                left2 = getShareChannelIconFromXml().getLeft();
            }
            int i2 = left - left2;
            if (z) {
                numberValueOf = Integer.valueOf(-i2);
            } else {
                numberValueOf = Float.valueOf(0.0f);
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getShareHintFromXml(), (Property<TuxTextView, Float>) View.TRANSLATION_X, getShareHintFromXml().getTranslationX(), numberValueOf.floatValue());
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            arrayList.add(objectAnimatorOfFloat);
        }
        C1371590lnR c1371590lnR2 = this.LLJJIII;
        if (c1371590lnR2 != null && (c1369610lkF = c1371590lnR2.LJJLIIIJ) != null && c1369610lkF.LIZLLL) {
            float[] fArr3 = new float[2];
            fArr3[0] = 0.0f;
            if (z) {
                f = 180.0f;
            } else {
                f = -180.0f;
            }
            fArr3[1] = f;
            ValueAnimator valueAnimatorOfFloat3 = ObjectAnimator.ofFloat(fArr3);
            valueAnimatorOfFloat3.setDuration(300L);
            valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS270S0100000_21(this, 18));
            valueAnimatorOfFloat3.addListener(new AAListenerS69S0110000_21(this, z, 1));
            arrayList.add(valueAnimatorOfFloat3);
        } else if (z) {
            getCollapseChannelIconFromXml().setBackground(getCollapseIcon());
        } else {
            getCollapseChannelIconFromXml().setBackground(getExpandIcon());
        }
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.LLJJL = animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013a A[PHI: r16
      0x013a: PHI (r16v1 boolean) = (r16v0 boolean), (r16v3 boolean), (r16v3 boolean) binds: [B:38:0x0136, B:10:0x0029, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0213 A[LOOP:1: B:61:0x020d->B:63:0x0213, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(int r18, final boolean r19) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369580lkC.LJIILLIIL(int, boolean):void");
    }

    public final void LJIIZILJ(List<? extends InterfaceC1369790lkX> list, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1369790lkX interfaceC1369790lkX : list) {
            if (this.LLJJIJIL.invoke(interfaceC1369790lkX).booleanValue()) {
                arrayList.add(interfaceC1369790lkX);
            }
        }
        this.LLJILLL = arrayList;
        if (z) {
            if (this.LLJJIJIIJIL) {
                this.LLJJIJI = new GridLayoutManager(getContext(), 4);
                RecyclerView recyclerView = this.LLJJJIL;
                if (recyclerView != null) {
                    layoutParams = recyclerView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = -2;
                    }
                } else {
                    layoutParams = null;
                }
                RecyclerView recyclerView2 = this.LLJJJIL;
                if (recyclerView2 != null) {
                    C786410Ut5.p6(recyclerView2, layoutParams);
                }
                RecyclerView recyclerView3 = this.LLJJJIL;
                if (recyclerView3 != null) {
                    recyclerView3.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27)), 0);
                }
                RecyclerView recyclerView4 = this.LLJJJIL;
                if (recyclerView4 != null) {
                    recyclerView4.addItemDecoration(getGridItemDecoration());
                }
            } else {
                this.LLJJIJI = new LinearLayoutManager(getContext(), 0, false);
            }
            RecyclerView recyclerView5 = this.LLJJJIL;
            if (recyclerView5 != null) {
                recyclerView5.setLayoutManager(this.LLJJIJI);
            }
        }
        AbstractC1366540lfI abstractC1366540lfI = this.LLJJI;
        if (abstractC1366540lfI != null) {
            abstractC1366540lfI.setData(this.LLJILLL);
        }
        if (((ArrayList) this.LLJIJIL).size() > 0) {
            LJIJ();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1369580lkC(Context context, AttributeSet attributeSet, String str, int i) {
        String[] strArr;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        str = (i & 4) != 0 ? "share_panel" : str;
        super(context, attributeSet);
        this.LL = str;
        this.LLIZLLLIL = C1369630lkH.LIZ(R.attr.s5, C1369530lk7.LIZ(getContext()));
        this.LLJ = C1369630lkH.LIZ(R.attr.a1f, C1369530lk7.LIZ(getContext()));
        C1369670lkL.LIZ.getClass();
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            strArr = C1369670lkL.LIZIZ;
            String[] strArr2 = (String[]) settingsManagerLIZLLL.LJIIIIZZ("share_preview_icon_forbid_list", String[].class, strArr);
            if (strArr2 != null) {
                if (strArr2.length != 0) {
                    strArr = strArr2;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strArr = C1369670lkL.LIZIZ;
        }
        this.LLJI = strArr;
        this.LLJIJIL = new ArrayList();
        this.LLJILJIL = new ArrayList();
        C1361400lX0 c1361400lX0LIZ = C1369530lk7.LIZ(getContext());
        TypedArray typedArrayObtainStyledAttributes = c1361400lX0LIZ.obtainStyledAttributes(attributeSet, R$styleable.ShareChannelBar);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getColor(R$styleable.ShareChannelBar_labelColor, C1369630lkH.LIZ(R.attr.s3, c1361400lX0LIZ));
        this.LLJ = typedArrayObtainStyledAttributes.getColor(R$styleable.ShareChannelBar_rootBackgroundColor, C1369630lkH.LIZ(R.attr.a1f, c1361400lX0LIZ));
        typedArrayObtainStyledAttributes.recycle();
        this.LLJILLL = C13BV.INSTANCE;
        this.LLJJIJIL = AFwS259S0000000_21.get$arr$(334);
        this.LLJJJJLIIL = EnumC1369720lkQ.COLLAPSE;
        this.LLJJLIIIJLLLLLLLZ = new ArrayList();
        this.LLJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1280));
        this.LLJLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1279));
        this.LLJLL = 8;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1003));
    }
}
