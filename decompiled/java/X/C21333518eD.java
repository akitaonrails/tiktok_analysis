package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import com.facebook.yoga.m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18eD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21333518eD {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(m mVar) {
        int childCount = mVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AbstractC21333318eB abstractC21333318eB = (AbstractC21333318eB) mVar.getChildAt(i).getData();
            int iRound = Math.round(abstractC21333318eB.LLILZLL.getLayoutX());
            int iRound2 = Math.round(abstractC21333318eB.LLILZLL.getLayoutY());
            abstractC21333318eB.LJIIL(iRound, iRound2, Math.round(abstractC21333318eB.LLILZLL.getLayoutWidth()) + iRound, Math.round(abstractC21333318eB.LLILZLL.getLayoutHeight()) + iRound2);
        }
    }

    public static final Object LIZIZ(List<?> list) {
        if (list.isEmpty()) {
            return Float.valueOf(0.0f);
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    return ListProtector.get(list, 3);
                }
                return ListProtector.get(list, 1);
            }
            return ListProtector.get(list, 1);
        }
        return ListProtector.get(list, 0);
    }

    public static final Object LIZJ(List<?> list) {
        if (list.isEmpty()) {
            return Float.valueOf(0.0f);
        }
        if (list.size() == 1) {
            return ListProtector.get(list, 0);
        }
        return ListProtector.get(list, 1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.18fC, com.facebook.yoga.m] */
    public static final C21339618fC LJ(Object obj, boolean z) {
        ?? r1 = new YogaNodeJNIBase() { // from class: X.18fC
            public final void finalize() throws Throwable {
                try {
                    long j = this.mNativePointer;
                    if (j != 0) {
                        this.mNativePointer = 0L;
                        YogaNative.jni_YGNodeFreeJNI(j);
                    }
                    super.finalize();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    super.finalize();
                    throw th;
                }
            }
        };
        r1.setFlexDirection(C14QL.ROW);
        r1.setAlignContent(C14QJ.FLEX_START);
        r1.setFlexShrink(1.0f);
        r1.setPositionType(C14QE.RELATIVE);
        r1.setData(obj);
        if (z) {
            r1.setMeasureFunction(new InterfaceC21331218dq() { // from class: X.18eS
                @Override // X.InterfaceC21331218dq
                public final long LIZ(m mVar, float f, EnumC1321460kUa enumC1321460kUa, float f2, EnumC1321460kUa enumC1321460kUa2) {
                    return ((AbstractC21333318eB) mVar.getData()).LJJJJZ(f, enumC1321460kUa, f2, enumC1321460kUa2);
                }
            });
        }
        return r1;
    }

    public static float LJFF(Number number, C1168340gVc c1168340gVc) {
        if (C279370AxD.LIZ()) {
            return C1337970kvD.LIZIZ(number, c1168340gVc);
        }
        return Math.round(C1337970kvD.LIZIZ(number, c1168340gVc));
    }

    public static final C14QJ LJI(String str, C14QJ c14qj) {
        if (str != null && str.length() != 0) {
            char cCharAt = str.charAt(0);
            if (cCharAt != 'b') {
                if (cCharAt != 'c') {
                    if (cCharAt != 's') {
                        if ("flex-start".equals(str)) {
                            return C14QJ.FLEX_START;
                        }
                        if ("flex-end".equals(str)) {
                            return C14QJ.FLEX_END;
                        }
                    } else if ("stretch".equals(str)) {
                        return C14QJ.STRETCH;
                    }
                } else if ("center".equals(str)) {
                    return C14QJ.CENTER;
                }
            } else if ("baseline".equals(str)) {
                return C14QJ.BASELINE;
            }
            return c14qj;
        }
        return c14qj;
    }

    public static final C21334418eM LJII(C1168340gVc c1168340gVc, Object obj) {
        EnumC21334518eN enumC21334518eN;
        float fLJFF = 0.0f;
        try {
            if (obj == null) {
                enumC21334518eN = EnumC21334518eN.POINT;
            } else if (obj instanceof Number) {
                float fLJFF2 = LJFF((Number) obj, c1168340gVc);
                enumC21334518eN = EnumC21334518eN.POINT;
                fLJFF = fLJFF2;
            } else if (obj instanceof String) {
                if ("auto".equals(obj)) {
                    enumC21334518eN = EnumC21334518eN.AUTO;
                } else {
                    String str = (String) obj;
                    int length = str.length();
                    if (length > 0 && str.charAt(length - 1) == '%') {
                        enumC21334518eN = EnumC21334518eN.PERCENT;
                        String str2 = (String) obj;
                        fLJFF = CastFloatProtector.parseFloat(str2.substring(0, str2.length() - 1));
                    } else {
                        enumC21334518eN = EnumC21334518eN.POINT;
                        fLJFF = LJFF(Float.valueOf(CastFloatProtector.parseFloat((String) obj)), c1168340gVc);
                    }
                }
            } else if (obj instanceof C1337880kv4) {
                int i = ((C1337880kv4) obj).LIZIZ;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            enumC21334518eN = EnumC21334518eN.POINT;
                        } else {
                            enumC21334518eN = EnumC21334518eN.PERCENT;
                            fLJFF = ((C1337880kv4) obj).LIZ;
                        }
                    } else {
                        enumC21334518eN = EnumC21334518eN.POINT;
                        fLJFF = ((C1337880kv4) obj).LIZ;
                    }
                } else {
                    enumC21334518eN = EnumC21334518eN.AUTO;
                }
            } else {
                enumC21334518eN = EnumC21334518eN.POINT;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            enumC21334518eN = EnumC21334518eN.POINT;
        }
        return new C21334418eM(fLJFF, enumC21334518eN);
    }

    public static final void LJIIIZ(m mVar, boolean z) {
        AbstractC21333318eB abstractC21333318eB;
        boolean zIsLayoutRequested;
        int childCount = mVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m childAt = mVar.getChildAt(i);
            if (childAt != null) {
                if (childAt.isMeasureDefined() && childAt.getChildCount() == 0) {
                    if (z) {
                        Object data = childAt.getData();
                        if ((data instanceof AbstractC21333318eB) && (abstractC21333318eB = (AbstractC21333318eB) data) != null) {
                            if (abstractC21333318eB.LJIILL()) {
                                zIsLayoutRequested = abstractC21333318eB.LLLZIL;
                            } else {
                                zIsLayoutRequested = abstractC21333318eB.getView().isLayoutRequested();
                            }
                            if (zIsLayoutRequested) {
                                childAt.dirty();
                            }
                        } else {
                            childAt.dirty();
                        }
                    } else {
                        childAt.dirty();
                    }
                }
                LJIIIZ(childAt, z);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJ(com.facebook.yoga.m r1, java.lang.String r2) {
        /*
            if (r2 == 0) goto L9
            int r0 = r2.hashCode()
            switch(r0) {
                case -1881872635: goto L46;
                case -1364013995: goto L3b;
                case -46581362: goto L30;
                case 441309761: goto L25;
                case 1742952711: goto L1a;
                case 1937124468: goto Lf;
                default: goto L9;
            }
        L9:
            X.14QJ r0 = X.C14QJ.FLEX_START
        Lb:
            r1.setAlignContent(r0)
            return
        Lf:
            java.lang.String r0 = "space-around"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.14QJ r0 = X.C14QJ.SPACE_AROUND
            goto Lb
        L1a:
            java.lang.String r0 = "flex-end"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.14QJ r0 = X.C14QJ.FLEX_END
            goto Lb
        L25:
            java.lang.String r0 = "space-between"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.14QJ r0 = X.C14QJ.SPACE_BETWEEN
            goto Lb
        L30:
            java.lang.String r0 = "flex-start"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.14QJ r0 = X.C14QJ.FLEX_START
            goto Lb
        L3b:
            java.lang.String r0 = "center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.14QJ r0 = X.C14QJ.CENTER
            goto Lb
        L46:
            java.lang.String r0 = "stretch"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.14QJ r0 = X.C14QJ.STRETCH
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21333518eD.LJIIJ(com.facebook.yoga.m, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIL(com.facebook.yoga.m r1, java.lang.String r2) {
        /*
            if (r2 == 0) goto L9
            int r0 = r2.hashCode()
            switch(r0) {
                case -1448970769: goto L30;
                case -1354837162: goto L25;
                case 113114: goto L1a;
                case 1272730475: goto Lf;
                default: goto L9;
            }
        L9:
            X.14QL r0 = X.C14QL.ROW
        Lb:
            r1.setFlexDirection(r0)
            return
        Lf:
            java.lang.String r0 = "column-reverse"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.14QL r0 = X.C14QL.COLUMN_REVERSE
            goto Lb
        L1a:
            java.lang.String r0 = "row"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.14QL r0 = X.C14QL.ROW
            goto Lb
        L25:
            java.lang.String r0 = "column"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.14QL r0 = X.C14QL.COLUMN
            goto Lb
        L30:
            java.lang.String r0 = "row-reverse"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.14QL r0 = X.C14QL.ROW_REVERSE
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21333518eD.LJIIL(com.facebook.yoga.m, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILIIL(com.facebook.yoga.m r2, java.lang.String r3) {
        /*
            if (r3 == 0) goto L39
            int r1 = r3.hashCode()
            r0 = -1039592053(0xffffffffc209158b, float:-34.271038)
            if (r1 == r0) goto L2e
            r0 = -749527969(0xffffffffd3531c5f, float:-9.067141E11)
            if (r1 == r0) goto L23
            r0 = 3657802(0x37d04a, float:5.125672E-39)
            if (r1 != r0) goto L39
            java.lang.String r0 = "wrap"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L39
            X.14Q9 r0 = X.C14Q9.WRAP
        L1f:
            r2.setWrap(r0)
            return
        L23:
            java.lang.String r0 = "wrap-reverse"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L39
            X.14Q9 r0 = X.C14Q9.WRAP_REVERSE
            goto L1f
        L2e:
            java.lang.String r0 = "nowrap"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L39
            X.14Q9 r0 = X.C14Q9.NO_WRAP
            goto L1f
        L39:
            X.14Q9 r0 = X.C14Q9.NO_WRAP
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21333518eD.LJIILIIL(com.facebook.yoga.m, java.lang.String):void");
    }

    public static final void LJIJI(m mVar, String str) {
        C14QE c14qe;
        if (!Intrinsics.LJFF(str, "relative") && Intrinsics.LJFF(str, "absolute")) {
            c14qe = C14QE.ABSOLUTE;
        } else {
            c14qe = C14QE.RELATIVE;
        }
        mVar.setPositionType(c14qe);
    }

    public static final void LJIIIIZZ(m mVar, boolean z, boolean z2) {
        LIZLLL(mVar, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), z);
        int iRound = Math.round(mVar.getLayoutX());
        int iRound2 = Math.round(mVar.getLayoutY());
        int iRound3 = Math.round(mVar.getLayoutWidth());
        int iRound4 = Math.round(mVar.getLayoutHeight());
        if (!z2) {
            LIZLLL(mVar, View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), z);
        }
        LIZ(mVar);
    }

    public static final void LJIIJJI(m mVar, C1168340gVc c1168340gVc, Object obj) {
        try {
            if (obj == null) {
                mVar.setFlexBasisAuto();
                return;
            }
            if (obj instanceof Number) {
                mVar.setFlexBasis(LJFF((Number) obj, c1168340gVc));
                return;
            }
            if (obj instanceof String) {
                if (Intrinsics.LJFF(obj, "auto")) {
                    mVar.setFlexBasisAuto();
                    return;
                }
                String str = (String) obj;
                int length = str.length();
                if (length > 0 && str.charAt(length - 1) == '%') {
                    String str2 = (String) obj;
                    mVar.setFlexBasisPercent(CastFloatProtector.parseFloat(str2.substring(0, str2.length() - 1)));
                    return;
                } else {
                    mVar.setFlexBasis(LJFF(Float.valueOf(CastFloatProtector.parseFloat((String) obj)), c1168340gVc));
                    return;
                }
            }
            mVar.setFlexBasisAuto();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            mVar.setFlexBasisAuto();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIILJJIL(m mVar, C1168340gVc c1168340gVc, C1337880kv4 c1337880kv4) {
        try {
            if (c1337880kv4 == 0) {
                mVar.setMaxHeight(Float.NaN);
                return;
            }
            if (c1337880kv4 instanceof Number) {
                mVar.setMaxHeight(LJFF((Number) c1337880kv4, c1168340gVc));
                return;
            }
            int i = c1337880kv4.LIZIZ;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        mVar.setMaxHeight(Float.NaN);
                        return;
                    } else {
                        mVar.setMaxHeightPercent(c1337880kv4.LIZ);
                        return;
                    }
                }
                mVar.setMaxHeight(c1337880kv4.LIZ);
                return;
            }
            mVar.setMaxHeight(Float.NaN);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mVar.setMaxHeight(Float.NaN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIILL(m mVar, C1168340gVc c1168340gVc, C1337880kv4 c1337880kv4) {
        try {
            if (c1337880kv4 == 0) {
                mVar.setMaxWidth(Float.NaN);
                return;
            }
            if (c1337880kv4 instanceof Number) {
                mVar.setMaxWidth(LJFF((Number) c1337880kv4, c1168340gVc));
                return;
            }
            int i = c1337880kv4.LIZIZ;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        mVar.setMaxWidth(Float.NaN);
                        return;
                    } else {
                        mVar.setMaxWidthPercent(c1337880kv4.LIZ);
                        return;
                    }
                }
                mVar.setMaxWidth(c1337880kv4.LIZ);
                return;
            }
            mVar.setMaxWidth(Float.NaN);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mVar.setMaxWidth(Float.NaN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIILLIIL(m mVar, C1168340gVc c1168340gVc, C1337880kv4 c1337880kv4) {
        try {
            if (c1337880kv4 == 0) {
                mVar.setMinHeight(Float.NaN);
                return;
            }
            if (c1337880kv4 instanceof Number) {
                mVar.setMinHeight(LJFF((Number) c1337880kv4, c1168340gVc));
                return;
            }
            int i = c1337880kv4.LIZIZ;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        mVar.setMinHeight(Float.NaN);
                        return;
                    } else {
                        mVar.setMinHeightPercent(c1337880kv4.LIZ);
                        return;
                    }
                }
                mVar.setMinHeight(c1337880kv4.LIZ);
                return;
            }
            mVar.setMinHeight(Float.NaN);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mVar.setMinHeight(Float.NaN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIZILJ(m mVar, C1168340gVc c1168340gVc, C1337880kv4 c1337880kv4) {
        try {
            if (c1337880kv4 == 0) {
                mVar.setMinWidth(Float.NaN);
                return;
            }
            if (c1337880kv4 instanceof Number) {
                mVar.setMinWidth(LJFF((Number) c1337880kv4, c1168340gVc));
                return;
            }
            int i = c1337880kv4.LIZIZ;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        mVar.setMinWidth(Float.NaN);
                        return;
                    } else {
                        mVar.setMinWidthPercent(c1337880kv4.LIZ);
                        return;
                    }
                }
                mVar.setMinWidth(c1337880kv4.LIZ);
                return;
            }
            mVar.setMinWidth(Float.NaN);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mVar.setMinWidth(Float.NaN);
        }
    }

    public static final void LJIJJ(m mVar, EnumC1321440kUY enumC1321440kUY, C21334418eM c21334418eM) {
        EnumC21334518eN enumC21334518eN = c21334418eM.LIZIZ;
        if (enumC21334518eN != null) {
            int i = C21334218eK.LIZ[enumC21334518eN.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        mVar.setMarginPercent(enumC1321440kUY, c21334418eM.LIZ);
                        return;
                    }
                } else {
                    mVar.setMargin(enumC1321440kUY, c21334418eM.LIZ);
                    return;
                }
            } else {
                mVar.setMarginAuto(enumC1321440kUY);
                return;
            }
        }
        mVar.setMargin(enumC1321440kUY, 0.0f);
    }

    public static final void LIZLLL(m mVar, int i, int i2, boolean z) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        LJIIIZ(mVar, z);
        mVar.setHeightAuto();
        mVar.setWidthAuto();
        mVar.setMaxWidth(Float.NaN);
        mVar.setMaxHeight(Float.NaN);
        if (mode2 == 1073741824) {
            mVar.setHeight(size2);
        }
        if (mode == 1073741824) {
            mVar.setWidth(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            mVar.setMaxHeight(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            mVar.setMaxWidth(size);
        }
        mVar.calculateLayout(Float.NaN, Float.NaN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIJ(m mVar, C1168340gVc c1168340gVc, EnumC1321440kUY enumC1321440kUY, C1337880kv4 c1337880kv4) {
        try {
            if (c1337880kv4 == 0) {
                mVar.setPosition(enumC1321440kUY, Float.NaN);
                return;
            }
            if (c1337880kv4 instanceof Number) {
                mVar.setPosition(enumC1321440kUY, C1337970kvD.LIZIZ(Float.valueOf(((Number) c1337880kv4).floatValue()), c1168340gVc));
                return;
            }
            if (c1337880kv4 instanceof String) {
                String str = (String) c1337880kv4;
                int length = str.length();
                if (length > 0 && str.charAt(length - 1) == '%') {
                    String str2 = (String) c1337880kv4;
                    mVar.setPositionPercent(enumC1321440kUY, CastFloatProtector.parseFloat(str2.substring(0, str2.length() - 1)));
                    return;
                } else {
                    mVar.setPosition(enumC1321440kUY, C1337970kvD.LIZIZ(Float.valueOf(CastFloatProtector.parseFloat((String) c1337880kv4)), c1168340gVc));
                    return;
                }
            }
            int i = c1337880kv4.LIZIZ;
            if (i != 1) {
                if (i != 2) {
                    mVar.setPosition(enumC1321440kUY, Float.NaN);
                    return;
                } else {
                    mVar.setPositionPercent(enumC1321440kUY, c1337880kv4.LIZ);
                    return;
                }
            }
            mVar.setPosition(enumC1321440kUY, c1337880kv4.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            mVar.setPosition(enumC1321440kUY, Float.NaN);
        }
    }
}
