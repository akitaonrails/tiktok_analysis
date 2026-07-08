package com.bytedance.adsdk.ugeno.yoga;

import X.C0WLU;
import X.C14Q6;
import X.C14QD;
import X.C14QG;
import X.C14QH;
import X.C14QK;
import X.C19JM;
import X.C19JN;
import X.C19JZ;
import X.EnumC1300280jwQ;
import X.InterfaceC21518319Jd;
import X.InterfaceC21518419Je;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public abstract class YogaNodeJNIBase extends a implements Cloneable {
    public YogaNodeJNIBase LL;
    public List<YogaNodeJNIBase> LLILLJJLI;
    public InterfaceC21518419Je LLILLL;
    public long LLILZ;
    public Object LLILZIL;
    public float[] arr;
    public int mLayoutDirection;

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIIL() {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.LLILZ, true);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LIZ() {
        Object obj = this.LLILZIL;
        if (obj instanceof InterfaceC21518319Jd) {
            ((InterfaceC21518319Jd) obj).freeze();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) ListProtector.get(arrayList, i)).LLILLJJLI;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase : (ArrayList) list) {
                    Object obj2 = yogaNodeJNIBase.LLILZIL;
                    if (obj2 instanceof InterfaceC21518319Jd) {
                        ((InterfaceC21518319Jd) obj2).freeze();
                    }
                    arrayList.add(yogaNodeJNIBase);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].LLILZ;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.LLILZ, Float.NaN, Float.NaN, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final int LIZJ() {
        List<YogaNodeJNIBase> list = this.LLILLJJLI;
        if (list == null) {
            return 0;
        }
        return ((ArrayList) list).size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final float LJ() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final float LJFF() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final float LJI() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final float LJII() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIJ() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.LLILZ);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJI() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.LLILZ);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIFFI() {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.LLILZ, 100.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIJIL() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.LLILZ);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIJL() {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.LLILZ, 100.0f);
    }

    public YogaNodeJNIBase() {
        long jJni_YGNodeNewJNI = YogaNative.jni_YGNodeNewJNI();
        if (jJni_YGNodeNewJNI == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.LLILZ = jJni_YGNodeNewJNI;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final Object LIZLLL() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final /* bridge */ /* synthetic */ YogaNodeJNIBase LJIIIIZZ() {
        return this.LL;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final YogaNodeJNIBase LIZIZ(int i) {
        List<YogaNodeJNIBase> list = this.LLILLJJLI;
        if (list != null) {
            return (YogaNodeJNIBase) ListProtector.get(list, i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIIIZ(C14QG c14qg) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.LLILZ, c14qg.intValue());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIIJ(C14QG c14qg) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.LLILZ, c14qg.intValue());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIIJJI(C14QG c14qg) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.LLILZ, c14qg.intValue());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIILIIL(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.LLILZ, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIILJJIL(Object obj) {
        this.LLILZIL = obj;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIILL(C0WLU c0wlu) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.LLILZ, c0wlu.intValue());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIILLIIL(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.LLILZ, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIJI(C14QK c14qk) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.LLILZ, c14qk.intValue());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIJJ(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.LLILZ, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIJJLI(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.LLILZ, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJIL(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.LLILZ, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJII(C14QH c14qh) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.LLILZ, c14qh.intValue());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIIJ(C19JZ c19jz) {
        boolean z;
        this.LLILLL = c19jz;
        long j = this.LLILZ;
        if (c19jz != null) {
            z = true;
        } else {
            z = false;
        }
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(j, z);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIIJZLJL(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.LLILZ, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIIZ(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.LLILZ, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIJIIJI(C14QD c14qd) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.LLILZ, c14qd.intValue());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIJIIJIL(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.LLILZ, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIJLIJ(C14Q6 c14q6) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.LLILZ, c14q6.intValue());
    }

    public final YogaNodeJNIBase LJJJ(int i) {
        List<YogaNodeJNIBase> list = this.LLILLJJLI;
        if (list != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) ListProtector.remove(list, i);
            yogaNodeJNIBase.LL = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.LLILZ, yogaNodeJNIBase.LLILZ);
            return yogaNodeJNIBase;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.LLILLJJLI;
        if (list != null) {
            ListProtector.remove(list, i);
            ListProtector.add(this.LLILLJJLI, i, yogaNodeJNIBase);
            yogaNodeJNIBase.LL = this;
            return yogaNodeJNIBase.LLILZ;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIII(C19JM c19jm, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.LLILZ, c19jm.intValue(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIIZI(C19JM c19jm, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.LLILZ, c19jm.intValue(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.a
    public final void LJJIJ(C19JM c19jm, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.LLILZ, c19jm.intValue(), f);
    }

    public final void LJJIZ(a aVar, int i) {
        if (!(aVar instanceof YogaNodeJNIBase)) {
            return;
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) aVar;
        if (yogaNodeJNIBase.LL == null) {
            if (this.LLILLJJLI == null) {
                this.LLILLJJLI = new ArrayList(4);
            }
            ListProtector.add(this.LLILLJJLI, i, yogaNodeJNIBase);
            yogaNodeJNIBase.LL = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.LLILZ, yogaNodeJNIBase.LLILZ, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    public final float baseline(float f, float f2) {
        throw null;
    }

    public final long measure(float f, int i, float f2, int i2) {
        int i3;
        InterfaceC21518419Je interfaceC21518419Je = this.LLILLL;
        int i4 = 0;
        if (interfaceC21518419Je != null) {
            EnumC1300280jwQ enumC1300280jwQFromInt = EnumC1300280jwQ.fromInt(i);
            EnumC1300280jwQ enumC1300280jwQFromInt2 = EnumC1300280jwQ.fromInt(i2);
            interfaceC21518419Je.getClass();
            View view = (View) this.LLILZIL;
            if (view != null && !(view instanceof C19JN)) {
                int i5 = (int) f;
                EnumC1300280jwQ enumC1300280jwQ = EnumC1300280jwQ.AT_MOST;
                if (enumC1300280jwQFromInt == enumC1300280jwQ) {
                    i3 = Integer.MIN_VALUE;
                } else if (enumC1300280jwQFromInt == EnumC1300280jwQ.EXACTLY) {
                    i3 = 1073741824;
                } else {
                    i3 = 0;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i3);
                int i6 = (int) f2;
                if (enumC1300280jwQFromInt2 == enumC1300280jwQ) {
                    i4 = Integer.MIN_VALUE;
                } else if (enumC1300280jwQFromInt2 == EnumC1300280jwQ.EXACTLY) {
                    i4 = 1073741824;
                }
                view.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i6, i4));
                int measuredWidth = view.getMeasuredWidth();
                return ((long) Float.floatToRawIntBits(view.getMeasuredHeight())) | (((long) Float.floatToRawIntBits(measuredWidth)) << 32);
            }
            float f3 = 0;
            return ((long) Float.floatToRawIntBits(f3)) | (((long) Float.floatToRawIntBits(f3)) << 32);
        }
        throw new RuntimeException("Measure function isn't defined!");
    }
}
