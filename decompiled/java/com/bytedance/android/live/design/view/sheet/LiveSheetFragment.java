package com.bytedance.android.live.design.view.sheet;

import X.AbstractC1822440xWc;
import X.C011Z;
import X.C098200Yq;
import X.C0GY9;
import X.C0KWG;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1095570ecF;
import X.C1113800f5e;
import X.C1119170fEJ;
import X.C14JV;
import X.C14JX;
import X.C1685300txQ;
import X.C1726140v1I;
import X.C189200o6;
import X.C1911200zpm;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20483915Dh;
import X.C20484615Do;
import X.C2188811AlT;
import X.C464790IKn;
import X.C500060JjI;
import X.C758170Tod;
import X.C786410Ut5;
import X.InterfaceC20484815Dq;
import Y.ACListenerS133S0200000_31;
import Y.ACListenerS165S0100000_31;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public abstract class LiveSheetFragment extends LiveThemeAwareFragment implements InterfaceC20484815Dq {
    public static final int LLJLILLLLZIIL;
    public static final int LLJLL;
    public static final int LLJLLIL;
    public SheetOptions LL;
    public int LLILLJJLI = -1;
    public boolean LLILLL = true;
    public int LLILZ;
    public View LLILZIL;
    public GradientDrawable LLILZLL;
    public C20483915Dh LLIZ;
    public GradientDrawable LLIZLLLIL;
    public FrameLayout LLJ;
    public C1095570ecF LLJI;
    public int LLJIJIL;
    public SheetOptions LLJILJIL;
    public SheetOptions LLJILJILJ;
    public LiveBottomSheetBehavior<View> LLJILLL;
    public View LLJJ;
    public C0KWG LLJJI;
    public GradientDrawable LLJJIII;
    public C500060JjI LLJJIJI;
    public final String LLJJIJIIJIL;
    public C20484615Do LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public RecyclerView LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public AbstractC1822440xWc LLJLIL;

    public void LJJJI(float f) {
    }

    @Override // X.InterfaceC20484815Dq
    public /* synthetic */ int QM(Context context) {
        return C1911200zpm.LIZ(context);
    }

    public int ZR() {
        return -1;
    }

    public int aS() {
        return 0;
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean bN() {
        return true;
    }

    public C500060JjI cS() {
        return null;
    }

    public void close() {
        close(1);
    }

    public abstract View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // X.InterfaceC20484815Dq
    public final boolean eO() {
        return true;
    }

    public C1119170fEJ gS() {
        return null;
    }

    @Override // X.InterfaceC20484815Dq
    public Fragment getFragment() {
        return this;
    }

    public View hS(LayoutInflater layoutInflater, C1095570ecF c1095570ecF) {
        return null;
    }

    public SheetOptions iS(Context context) {
        return null;
    }

    @Override // X.InterfaceC20484815Dq
    public /* synthetic */ String j4() {
        return null;
    }

    public AbstractC1822440xWc kS() {
        return null;
    }

    public void mS(boolean z) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        bS(true);
        C20484615Do c20484615Do = this.LLJJIJIL;
        if (c20484615Do != null) {
            c20484615Do.LJIIL(this);
        }
        super.onDestroyView();
    }

    @Override // X.InterfaceC20484815Dq
    public /* synthetic */ void sl() {
        C1911200zpm.LIZIZ(this);
    }

    @Override // X.InterfaceC20484815Dq
    public /* synthetic */ void x1(int i) {
    }

    static {
        if (C011Z.LIZ.LJIL()) {
            LLJLILLLLZIIL = R.anim.ls;
            LLJLL = R.anim.lt;
            LLJLLIL = R.anim.lq;
        } else {
            LLJLILLLLZIIL = R.anim.ds;
            LLJLL = R.anim.dt;
            LLJLLIL = R.anim.dk;
        }
    }

    private boolean enablePadAdapter() {
        C20484615Do c20484615Do = this.LLJJIJIL;
        return (c20484615Do == null || c20484615Do.LJIILIIL == 0) ? false : true;
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean LLIIIL() {
        LiveBottomSheetBehavior<View> liveBottomSheetBehavior = this.LLJILLL;
        return liveBottomSheetBehavior != null && this.LLJILJIL.fullscreenEnabled && liveBottomSheetBehavior.LJIJJ == 3;
    }

    public final void PR() {
        int i;
        SheetOptions sheetOptions = this.LLJILJIL;
        if (sheetOptions.height > 0 || sheetOptions.heightRatio > 0.0f || (i = sheetOptions.sheetStyle) == 2 || i == 1 || i == 4 || i == 6) {
            C19ME c19me = (C19ME) this.LLJ.getLayoutParams();
            c19me.constrainedHeight = false;
            c19me.matchConstraintDefaultHeight = 0;
            ((ViewGroup.MarginLayoutParams) c19me).height = 0;
            C786410Ut5.a6(this.LLJ, c19me);
            return;
        }
        C19ME c19me2 = (C19ME) this.LLJ.getLayoutParams();
        c19me2.constrainedHeight = true;
        c19me2.matchConstraintDefaultHeight = 1;
        ((ViewGroup.MarginLayoutParams) c19me2).height = -2;
        C786410Ut5.a6(this.LLJ, c19me2);
    }

    public final void SR() {
        if (this.LLJLIL != null) {
            C14JX.LIZJ(this.LLJ, null);
            return;
        }
        if (!isHidden() && aS() != 2) {
            if (this.LLJ != null) {
                C14JX.LIZJ(this.LLJ, new C14JV() { // from class: X.10im
                    public boolean LIZJ;

                    @Override // X.C14JV
                    public final void LIZIZ(C14JT c14jt) {
                        if (this.LIZJ) {
                            this.LIZJ = false;
                            this.LIZLLL.OR(0, 0, true);
                        }
                    }

                    @Override // X.C14JV
                    public final C20244614Jg LIZLLL(C20244614Jg c20244614Jg, List<C14JT> list) {
                        this.LIZLLL.OR(c20244614Jg.LIZ(8).LIZLLL, c20244614Jg.LIZ(7).LIZLLL, true);
                        return c20244614Jg;
                    }

                    @Override // X.C14JV
                    public final C14JR LJ(C14JT c14jt, C14JR c14jr) {
                        boolean z;
                        if (this.LIZLLL.LLJJJIL > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.LIZJ = z;
                        return c14jr;
                    }
                });
            }
        } else {
            if (this.LLJ == null || this.LLJILLL == null) {
                return;
            }
            C14JX.LIZJ(this.LLJ, null);
            LiveBottomSheetBehavior<View> liveBottomSheetBehavior = this.LLJILLL;
            liveBottomSheetBehavior.LJII = 0;
            liveBottomSheetBehavior.LJIIZILJ = sk();
            this.LLJILLL.LJJJJIZL = 0;
            FrameLayout frameLayout = this.LLJ;
            frameLayout.setPadding(frameLayout.getPaddingLeft(), this.LLJ.getPaddingTop(), this.LLJ.getPaddingRight(), 0);
        }
    }

    @Override // X.InterfaceC20484815Dq
    public final void TF() {
        SheetOptions sheetOptions;
        LiveBottomSheetBehavior<View> liveBottomSheetBehavior = this.LLJILLL;
        if (liveBottomSheetBehavior == null || (sheetOptions = this.LLJILJIL) == null || !sheetOptions.fullscreenEnabled) {
            return;
        }
        liveBottomSheetBehavior.setState(4);
    }

    public final C758170Tod UR() {
        if (this.LLJJIJIL == null) {
            return null;
        }
        return new C758170Tod(R.attr.eo4, new ACListenerS165S0100000_31(this, 210));
    }

    public final C758170Tod VR() {
        if (this.LLJJIJIL == null) {
            return null;
        }
        return new C758170Tod(R.attr.d33, new ACListenerS165S0100000_31(this, 211));
    }

    @Override // X.InterfaceC20484815Dq
    public final void hide() {
        C20484615Do c20484615Do = this.LLJJIJIL;
        if (c20484615Do != null) {
            c20484615Do.LJFF(this);
        }
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean isCancelable() {
        if (!this.LLJJL) {
            return false;
        }
        SheetOptions sheetOptions = this.LLJILJIL;
        return sheetOptions == null || sheetOptions.cancelable;
    }

    public void nS() {
        C20484615Do c20484615Do = this.LLJJIJIL;
        if (c20484615Do != null) {
            c20484615Do.LIZ(2);
        }
    }

    public void oS() {
        C20484615Do c20484615Do = this.LLJJIJIL;
        if (c20484615Do != null) {
            c20484615Do.LIZ(3);
        }
    }

    @Override // X.InterfaceC20484815Dq
    public final void show() {
        C20484615Do c20484615Do = this.LLJJIJIL;
        if (c20484615Do != null) {
            c20484615Do.LJIILL(this);
        }
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean sk() {
        if (!this.LLJJLIIIJLLLLLLLZ) {
            return false;
        }
        SheetOptions sheetOptions = this.LLJILJIL;
        return sheetOptions == null || sheetOptions.draggable;
    }

    public LiveSheetFragment() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(String.valueOf(System.nanoTime()));
        sbLIZ.append(UUID.randomUUID());
        this.LLJJIJIIJIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJJJLIIL = true;
        this.LLJJL = true;
        this.LLJJLIIIJLLLLLLLZ = true;
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean fv() {
        return LLIIIL() && this.LLJILJIL.fullscreenEnabled;
    }

    @Override // X.InterfaceC20484815Dq
    public final boolean xB() {
        return !isLight(getContext());
    }

    @Override // X.InterfaceC20484815Dq
    public final String gE() {
        return this.LLJL;
    }

    @Override // X.InterfaceC20484815Dq
    public final C20484615Do ij() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC20484815Dq
    public final SheetOptions iw() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC20484815Dq
    public final String lr() {
        return this.LLJJIJIIJIL;
    }

    public final void MR(float f) {
        GradientDrawable gradientDrawable;
        if (this.LLJJIJIL != null && (gradientDrawable = this.LLILZLL) != null) {
            gradientDrawable.mutate();
            if (enablePadAdapter()) {
                this.LLILZLL.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
                return;
            }
            if (this.LLJJIJIL.LJII()) {
                this.LLILZLL.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            } else if (this.LLJJIJIL.LJIIJJI == 1) {
                this.LLILZLL.setCornerRadii(new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f});
            } else {
                this.LLILZLL.setCornerRadii(new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f});
            }
        }
    }

    public final void NR(float f) {
        GradientDrawable gradientDrawable;
        if (this.LLJJIJIL != null && (gradientDrawable = this.LLIZLLLIL) != null) {
            gradientDrawable.mutate();
            if (enablePadAdapter()) {
                this.LLIZLLLIL.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                return;
            }
            if (this.LLJJIJIL.LJII()) {
                this.LLIZLLLIL.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            } else if (this.LLJJIJIL.LJIIJJI == 1) {
                this.LLIZLLLIL.setCornerRadii(new float[]{0.0f, 0.0f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            } else {
                this.LLIZLLLIL.setCornerRadii(new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0280 A[PHI: r3 r4
      0x0280: PHI (r3v1 boolean) = (r3v0 boolean), (r3v4 boolean) binds: [B:3:0x000d, B:25:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r4v1 X.0fEJ) = (r4v0 X.0fEJ), (r4v4 X.0fEJ) binds: [B:3:0x000d, B:25:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RR(X.C1119170fEJ r18) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.sheet.LiveSheetFragment.RR(X.0fEJ):void");
    }

    public final C758170Tod WR(View.OnClickListener onClickListener) {
        if (this.LLJJIJIL == null) {
            return null;
        }
        return new C758170Tod(R.attr.d33, new ACListenerS133S0200000_31(this, onClickListener, 34));
    }

    public void bS(boolean z) {
        if (this.LLJJJIL > 0 && C1726140v1I.LIZ(getView()) && z) {
            OR(0, 0, true);
        }
    }

    public void close(int i) {
        C20484615Do c20484615Do = this.LLJJIJIL;
        if (c20484615Do != null) {
            c20484615Do.LIZIZ(this, i);
        }
    }

    @Override // X.InterfaceC20484815Dq
    public final void fq(String str) {
        if (!TextUtils.isEmpty(this.LLJL) && !TextUtils.equals(this.LLJL, str)) {
            C011Z.LIZ.getClass();
        }
        this.LLJL = str;
    }

    @Override // X.InterfaceC20484815Dq
    public final void hK(C20484615Do c20484615Do) {
        this.LLJJIJIL = c20484615Do;
    }

    @Override // X.InterfaceC20484815Dq
    public int l5(Context context) {
        return QM(context);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.LL = (SheetOptions) getArguments().getParcelable("com.bytedance.android.live.design.view.sheet.SHEET_OPTIONS");
            this.LLILLL = getArguments().getBoolean("com.bytedance.android.live.design.view.sheet.SHOWS_SHEET", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) throws Throwable {
        C20484615Do c20484615Do;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/design/view/sheet/LiveSheetFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGJ544i2jfYruGhvXTtcm6i/b9clDkWmwM82aas47BEGkPVQ=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (z) {
            bS(true);
            if (C011Z.LIZ.LJJI != null && getView() != null) {
                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                C1113800f5e.LIZLLL(getView().getRootView());
            }
        }
        if (!isHidden() && (c20484615Do = this.LLJJIJIL) != null) {
            AbstractC1822440xWc abstractC1822440xWc = this.LLJLIL;
            if (abstractC1822440xWc != null) {
                int iLIZ = abstractC1822440xWc.LIZ();
                LiveSheetHostFragment liveSheetHostFragment = c20484615Do.LIZLLL;
                if (liveSheetHostFragment != null && liveSheetHostFragment.LLIZ != iLIZ) {
                    liveSheetHostFragment.LLIZ = iLIZ;
                    Dialog dialog = liveSheetHostFragment.getDialog();
                    if (dialog != null && dialog.getWindow() != null) {
                        dialog.getWindow().setSoftInputMode(iLIZ);
                    }
                }
            } else {
                LiveSheetHostFragment liveSheetHostFragment2 = c20484615Do.LIZLLL;
                if (liveSheetHostFragment2 != null && liveSheetHostFragment2.LLIZ != 16) {
                    liveSheetHostFragment2.LLIZ = 16;
                    Dialog dialog2 = liveSheetHostFragment2.getDialog();
                    if (dialog2 != null && dialog2.getWindow() != null) {
                        dialog2.getWindow().setSoftInputMode(16);
                    }
                }
            }
        }
        SR();
    }

    @Override // X.InterfaceC20484815Dq
    public void onWindowFocusChanged(boolean z) {
        if (!z) {
            bS(true);
        }
    }

    public final SheetOptions qS(Context context) {
        SheetOptions sheetOptionsIS = iS(context);
        C20484615Do c20484615Do = this.LLJJIJIL;
        if (c20484615Do != null && !c20484615Do.LJII()) {
            SheetOptions sheetOptions = new SheetOptions();
            sheetOptions.draggable = false;
            sheetOptions.heightRatio = 1.0f;
            if (enablePadAdapter() && sheetOptionsIS != null) {
                if (enablePadAdapter()) {
                    sheetOptions.LIZ(sheetOptionsIS.sheetStyle, context);
                    sheetOptions.dimBehindType = sheetOptionsIS.dimBehindType;
                }
                sheetOptions.marginStart = sheetOptionsIS.marginStart;
                sheetOptions.marginTop = sheetOptionsIS.marginTop;
                sheetOptions.marginEnd = sheetOptionsIS.marginEnd;
                sheetOptions.marginBottom = sheetOptionsIS.marginBottom;
                sheetOptions.gravity = sheetOptionsIS.gravity;
            }
            return sheetOptions;
        }
        SheetOptions sheetOptions2 = this.LL;
        if (sheetOptions2 == null) {
            if (sheetOptionsIS == null) {
                sheetOptionsIS = new SheetOptions();
                TypedValue typedValue = new TypedValue();
                context.getResources().getValue(R.dimen.a4r, typedValue, true);
                sheetOptionsIS.maxHeightRatio = typedValue.getFloat();
            }
        } else {
            sheetOptionsIS = sheetOptions2;
        }
        int i = this.LLILLJJLI;
        if (i != -1) {
            sheetOptionsIS.LIZ(i, null);
        }
        C011Z.LIZ.getClass();
        if (sheetOptionsIS.fullscreenEnabled) {
            SheetOptions sheetOptions3 = new SheetOptions();
            this.LLJILJILJ = sheetOptions3;
            int i2 = sheetOptionsIS.height;
            if (i2 == -1 && sheetOptionsIS.heightRatio == 0.0f) {
                sheetOptions3.height = sheetOptionsIS.maxHeight;
                sheetOptions3.heightRatio = sheetOptionsIS.maxHeightRatio;
            } else {
                sheetOptions3.height = i2;
                sheetOptions3.heightRatio = sheetOptionsIS.heightRatio;
                return sheetOptionsIS;
            }
        }
        return sheetOptionsIS;
    }

    public final void rS(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
        LiveBottomSheetBehavior<View> liveBottomSheetBehavior = this.LLJILLL;
        if (liveBottomSheetBehavior != null) {
            liveBottomSheetBehavior.LJIIZILJ = z & liveBottomSheetBehavior.LJIIZILJ;
        }
    }

    public final void sS(int i) {
        Context context = getContext();
        if (context != null && this.LLILLJJLI != i) {
            this.LLILLJJLI = i;
            SheetOptions sheetOptionsQS = qS(context);
            this.LLJILJIL = sheetOptionsQS;
            LiveBottomSheetBehavior<View> liveBottomSheetBehavior = this.LLJILLL;
            if (liveBottomSheetBehavior != null) {
                SheetOptions sheetOptions = this.LLJILJILJ;
                if (sheetOptions != null && this.LLJJJ && liveBottomSheetBehavior.LJIJJ != 3) {
                    liveBottomSheetBehavior.LIZIZ(sheetOptions, false, enablePadAdapter());
                } else {
                    liveBottomSheetBehavior.LIZIZ(sheetOptionsQS, false, enablePadAdapter());
                }
            }
            PR();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04f8  */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0U4s] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.sheet.LiveSheetFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public void OR(int i, int i2, boolean z) {
        int iMax;
        int i3;
        int height;
        int height2;
        this.LLJJJIL = i;
        if (i <= 0) {
            if (this.LLJJJJ) {
                this.LLJJJJ = false;
                mS(false);
            }
        } else if (!this.LLJJJJ) {
            this.LLJJJJ = true;
            mS(true);
        }
        if (!this.LLILLL) {
            return;
        }
        if (this.LLJ.hasWindowFocus()) {
            C20484615Do c20484615Do = this.LLJJIJIL;
            if (c20484615Do != null && !c20484615Do.LJII()) {
                C464790IKn.LIZ.getClass();
                if (this.LLJJI != null && aS() == 0) {
                    height2 = 0;
                } else {
                    height2 = this.LLJJI.getHeight();
                }
                iMax = Math.max(0, i - height2);
            } else {
                int i4 = i - i2;
                if (this.LLJJI != null && aS() == 0) {
                    height = 0;
                } else {
                    height = this.LLJJI.getHeight();
                }
                iMax = Math.max(0, i4 - height);
            }
        } else {
            iMax = 0;
        }
        if (!z || this.LLJ.getPaddingBottom() != iMax) {
            LiveBottomSheetBehavior<View> liveBottomSheetBehavior = this.LLJILLL;
            liveBottomSheetBehavior.LJII = iMax;
            if (iMax > 0) {
                SheetOptions sheetOptions = this.LLJILJILJ;
                if (sheetOptions != null && !this.LLJJJ && liveBottomSheetBehavior.LJIJJ != 3) {
                    liveBottomSheetBehavior.LIZIZ(sheetOptions, false, enablePadAdapter());
                    this.LLJJJ = true;
                }
                this.LLJILLL.LJIIZILJ = false;
            } else {
                if (this.LLJJJ) {
                    liveBottomSheetBehavior.LIZIZ(this.LLJILJIL, false, enablePadAdapter());
                    this.LLJJJ = false;
                }
                this.LLJILLL.LJIIZILJ = sk();
            }
            LiveBottomSheetBehavior<View> liveBottomSheetBehavior2 = this.LLJILLL;
            if (this.LLJJI != null && aS() == 0) {
                i3 = 0;
            } else {
                i3 = iMax;
            }
            liveBottomSheetBehavior2.LJJJJIZL = i3;
            if (z) {
                FrameLayout frameLayout = this.LLJ;
                frameLayout.setPadding(frameLayout.getPaddingLeft(), this.LLJ.getPaddingTop(), this.LLJ.getPaddingRight(), iMax);
            } else {
                this.LLJ.requestLayout();
            }
        }
        RecyclerView recyclerView = this.LLJJJJJIL;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                this.LLJJJJJIL.getChildAt(i5).requestLayout();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (i2 != 0 && getContext() != null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), i2);
            if (i2 == LLJLILLLLZIIL) {
                animationLoadAnimation.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            } else if (i2 == LLJLL) {
                animationLoadAnimation.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
                animationLoadAnimation.setStartOffset(100L);
                return animationLoadAnimation;
            }
            return animationLoadAnimation;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean zLJII;
        View viewDS;
        int i;
        C20484615Do c20484615Do = this.LLJJIJIL;
        if (c20484615Do != null) {
            zLJII = c20484615Do.LJII();
        } else {
            zLJII = true;
        }
        if (this.LLILLL) {
            if (!zLJII && !enablePadAdapter()) {
                i = R.layout.ddd;
            } else {
                i = R.layout.ddc;
            }
            viewDS = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        } else {
            viewDS = dS(layoutInflater, viewGroup, bundle);
        }
        C19GS c19gs = null;
        if (!(viewDS instanceof View)) {
            viewDS = null;
        }
        if (viewDS != null) {
            try {
                ViewTreeLifecycleOwner.set(viewDS, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewDS, this);
                viewDS.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewDS;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewDS;
    }
}
