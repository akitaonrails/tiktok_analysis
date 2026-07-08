package X;

import Y.ARunnableS14S0400000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362620EJo extends AbstractC2255721DQs<InterfaceC360570EBr> implements InterfaceC360570EBr, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final Activity LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final C1DRG LLILZ;
    public float LLIZ;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362230EIb.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 807));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C362620EJo.class, "editorProAdjustCanvasApi", "getEditorProAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C362620EJo.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJI = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    @Override // X.InterfaceC360570EBr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Lz() {
        /*
            r14 = this;
            r8 = r14
            android.app.Activity r1 = r8.LL
            r0 = 2131395471(0x7f0a838f, float:1.8411655E38)
            android.view.View r9 = r1.findViewById(r0)
            if (r9 != 0) goto Ld
            return
        Ld:
            android.app.Activity r1 = r8.LL
            r0 = 2131373676(0x7f0a2e6c, float:1.836745E38)
            android.view.View r7 = r1.findViewById(r0)
            if (r7 != 0) goto L19
            return
        L19:
            android.app.Activity r1 = r8.LL
            r0 = 2131394661(0x7f0a8065, float:1.8410013E38)
            android.view.View r6 = r1.findViewById(r0)
            if (r6 != 0) goto L25
            return
        L25:
            android.app.Activity r1 = r8.LL
            r0 = 2131392614(0x7f0a7866, float:1.840586E38)
            android.view.View r5 = r1.findViewById(r0)
            if (r5 != 0) goto L31
            return
        L31:
            X.0E48 r0 = r8.X1()
            r1 = 0
            if (r0 == 0) goto L3c
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = r0.LLLLLLIL()
        L3c:
            int r0 = X.C368130Ebz.LJIIIZ
            float r0 = (float) r0
            int r4 = X.C0FU0.LIZ(r0)
            X.0E48 r0 = r8.X1()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto Laa
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r0)
            if (r1 == 0) goto Laa
            boolean r0 = X.C351220Dpo.LLIIJLIL(r0, r1)
            if (r0 != 0) goto Laa
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto La8
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto La8
            int r10 = r1.topMargin
        L65:
            int r0 = r6.getHeight()
            int r10 = r10 + r0
            int r10 = r10 + r4
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L79
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L79
            int r3 = r1.topMargin
        L79:
            int r10 = r10 + r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r10 = r10 + r0
        L87:
            r11 = 300(0x12c, double:1.48E-321)
            android.view.animation.AccelerateDecelerateInterpolator r13 = new android.view.animation.AccelerateDecelerateInterpolator
            r13.<init>()
            r8.H2(r9, r10, r11, r13)
            X.0EIb r0 = r8.Z1()
            if (r0 == 0) goto L9a
            r0.RH1(r2)
        L9a:
            android.app.Activity r1 = r8.LL
            r0 = 2131377046(0x7f0a3b96, float:1.8374285E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0Ec9 r0 = (X.C368230Ec9) r0
            if (r0 != 0) goto Lbf
            return
        La8:
            r10 = 0
            goto L65
        Laa:
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb8
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto Lb8
            int r3 = r1.topMargin
        Lb8:
            int r0 = r6.getHeight()
            int r3 = r3 + r0
            r10 = r3
            goto L87
        Lbf:
            r0.setEnablePreInitVisibleRect(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362620EJo.Lz():void");
    }

    public InterfaceC360570EBr W1() {
        return this;
    }

    @Override // X.InterfaceC360570EBr
    public void Xo0() {
        View viewFindViewById;
        View viewFindViewById2 = this.LL.findViewById(R.id.ygy);
        if (viewFindViewById2 == null || (viewFindViewById = this.LL.findViewById(R.id.gcv)) == null) {
            return;
        }
        C118300cf c118300cf = new C118300cf();
        if (viewFindViewById2.getMeasuredHeight() != 0 && viewFindViewById.getMeasuredHeight() != 0) {
            c118300cf.element = viewFindViewById.getMeasuredHeight();
            BA0(viewFindViewById2.getMeasuredHeight() + viewFindViewById.getMeasuredHeight());
        }
        HandlerHook.viewPost(viewFindViewById, new ARunnableS14S0400000_5(viewFindViewById, viewFindViewById2, c118300cf, this, 0));
    }

    private final C0E48 X1() {
        return (C0E48) this.LLIZLLLIL.getValue();
    }

    private final InterfaceC362230EIb Z1() {
        return (InterfaceC362230EIb) this.LLILZIL.getValue(this, LLJ[0]);
    }

    private final C0E5S w2() {
        return (C0E5S) this.LLILZLL.getValue(this, LLJ[1]);
    }

    @Override // X.InterfaceC360570EBr
    public int NP() {
        View viewFindViewById;
        View viewFindViewById2;
        Activity activity = this.LL;
        View viewFindViewById3 = activity.findViewById(R.id.gcu);
        if (viewFindViewById3 == null || (viewFindViewById = activity.findViewById(R.id.ygy)) == null || (viewFindViewById2 = activity.findViewById(R.id.gcv)) == null) {
            return 0;
        }
        return viewFindViewById3.getMeasuredHeight() + viewFindViewById.getMeasuredHeight() + viewFindViewById2.getMeasuredHeight();
    }

    @Override // X.InterfaceC360570EBr
    public void ec1() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E5S c0e5sW2;
        View viewFindViewById = this.LL.findViewById(R.id.ygy);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setScrollY(0);
        C0E5S c0e5sW22 = w2();
        if (c0e5sW22 != null) {
            c0e5sW22.ZP0(false);
        }
        InterfaceC362230EIb interfaceC362230EIbZ1 = Z1();
        if (interfaceC362230EIbZ1 != null) {
            interfaceC362230EIbZ1.RH1(false);
        }
        C0E48 c0e48X1 = X1();
        if (c0e48X1 != null) {
            c0e48X1.S7().LIZIZ(new C358810E4x(null), "switch_track_style", false);
        }
        C0E5S c0e5sW23 = w2();
        if (c0e5sW23 != null) {
            c0e5sW23.yV(AFwS234S0000000_5.get$arr$(346));
        }
        C0E48 c0e48X12 = X1();
        if (c0e48X12 == null || (nLETrackSlotLLLLLLIL = c0e48X12.LLLLLLIL()) == null || (c0e5sW2 = w2()) == null) {
            return;
        }
        c0e5sW2.G22(nLETrackSlotLLLLLLIL, C0E6E.CLIP, EnumC358760E4s.NORMAL, false, false, true);
    }

    @Override // X.InterfaceC360570EBr
    public boolean isFullScreen() {
        Activity activity = this.LL;
        if (activity != null) {
            return C0FU0.LIZIZ(activity).y * 9 > C0FU0.LIZJ(activity) * 16;
        }
        return false;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    public final float o2() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC360570EBr
    public void BA0(int i) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View view = this.LLILLJJLI;
        if (view != null && (layoutParams3 = view.getLayoutParams()) != null) {
            this.LLIZ = i;
            layoutParams3.height = i;
            View view2 = this.LLILLJJLI;
            if (view2 != null) {
                C786410Ut5.W5(view2, layoutParams3);
            }
        }
        View view3 = this.LLILLL;
        ViewGroup.LayoutParams layoutParams4 = null;
        if (view3 != null) {
            layoutParams = view3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            View view4 = this.LLILLL;
            if (view4 != null) {
                layoutParams4 = view4.getLayoutParams();
            }
            if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams4) != null) {
                layoutParams2.height = 0;
                layoutParams2.weight = 1.0f;
                View view5 = this.LLILLL;
                if (view5 != null) {
                    C786410Ut5.W5(view5, layoutParams2);
                }
            }
        }
    }

    public final void G2(float f) {
        this.LLIZ = f;
    }

    @Override // X.InterfaceC360570EBr
    public void IB1(C0ESS c0ess) {
        int i = C0ESR.LIZ[c0ess.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new C1954807lC();
                        }
                        return;
                    } else {
                        BA0(NP());
                        return;
                    }
                }
                Xo0();
                return;
            }
            rO2(true, true);
            return;
        }
        JK2(166);
    }

    @Override // X.InterfaceC360570EBr
    public void JK2(int i) {
        if (C0E2B.LIZ() && isFullScreen()) {
            BA0(C0FU0.LIZ(i));
        }
    }

    @Override // X.InterfaceC360570EBr
    public void dB2(C0ESS c0ess) {
        if (C0ESR.LIZ[c0ess.ordinal()] == 2) {
            ec1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC360570EBr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void rO2(boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362620EJo.rO2(boolean, boolean):void");
    }

    public C362620EJo(Activity activity, View view, View view2, C1DRG c1drg) {
        this.LL = activity;
        this.LLILLJJLI = view;
        this.LLILLL = view2;
        this.LLILZ = c1drg;
    }

    private final void H2(View view, int i, long j, Interpolator interpolator) {
        if (i == 0) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(interpolator);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS255S0100000_5(view, 10));
        valueAnimatorOfInt.start();
    }
}
