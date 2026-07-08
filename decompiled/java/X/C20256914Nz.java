package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.starlight.nodes.StarlightNode;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import kotlin.Pair;

/* JADX INFO: renamed from: X.14Nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20256914Nz {
    public static final /* synthetic */ int LIZ = 0;

    public static final C14O8 LIZ(Object obj, boolean z) {
        String str;
        StarlightNode starlightNode = new StarlightNode();
        C14O8 c14o8 = new C14O8(starlightNode);
        if (C444960Hcc.LIZIZ()) {
            str = "rtl";
        } else {
            str = "ltr";
        }
        c14o8.LIZLLL(str);
        starlightNode.LJII = obj;
        if (z) {
            starlightNode.LJI = new C14O1() { // from class: X.14Ny
                @Override // X.C14O0
                public final long LIZ(StarlightNode starlightNode2, float f, C14O3 c14o3, float f2, C14O3 c14o32) {
                    Object obj2;
                    C14NX c14nx;
                    String str2;
                    float fFloatValue;
                    int i;
                    TemplateData element;
                    Pair pairLJIILLIIL = null;
                    if (starlightNode2 != null) {
                        obj2 = starlightNode2.LJII;
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof C14NX) {
                        c14nx = (C14NX) obj2;
                    } else {
                        c14nx = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("vm, ");
                    if (c14nx != null && (element = c14nx.getElement()) != null) {
                        str2 = element.type;
                    } else {
                        str2 = null;
                    }
                    sbLIZ.append(str2);
                    sbLIZ.append(' ');
                    sbLIZ.append(f);
                    sbLIZ.append(' ');
                    sbLIZ.append(f2);
                    sbLIZ.append(' ');
                    sbLIZ.append(c14o3);
                    sbLIZ.append(' ');
                    sbLIZ.append(c14o32);
                    C2188811AlT.LIZIZ(sbLIZ);
                    System.currentTimeMillis();
                    if (c14nx != null) {
                        int[] iArr = C14O2.LIZ;
                        int i2 = iArr[c14o3.ordinal()];
                        int i3 = 0;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                i = 0;
                            } else {
                                i = 1073741824;
                            }
                        } else {
                            i = Integer.MIN_VALUE;
                        }
                        int i4 = iArr[c14o32.ordinal()];
                        if (i4 != 1) {
                            if (i4 == 2) {
                                i3 = 1073741824;
                            }
                        } else {
                            i3 = Integer.MIN_VALUE;
                        }
                        pairLJIILLIIL = c14nx.LJIILLIIL(f, f2, i, i3);
                    }
                    float fFloatValue2 = 0.0f;
                    if (pairLJIILLIIL != null) {
                        fFloatValue = ((Number) pairLJIILLIIL.getFirst()).floatValue();
                        fFloatValue2 = ((Number) pairLJIILLIIL.getSecond()).floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    return (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue)) << 32);
                }
            };
            long j = starlightNode.LIZIZ;
            if (j == 0) {
                starlightNode.LIZIZ = starlightNode.nativeCreateMeasureDelegateAndSetMeasureFunc(starlightNode.LIZ);
            } else {
                starlightNode.nativeSetMeasureFunction(j);
                return c14o8;
            }
        }
        return c14o8;
    }

    public static final void LIZIZ(C14O8 c14o8, boolean z) {
        C14NX c14nx;
        int iLIZ = c14o8.LIZ();
        for (int i = 0; i < iLIZ; i++) {
            C14O8 c14o82 = (C14O8) ListProtector.get(c14o8.LIZIZ, i);
            if (c14o82 != null) {
                if (z) {
                    StarlightNode starlightNode = c14o82.LIZ;
                    Object obj = starlightNode.LJII;
                    if ((obj instanceof C14NX) && (c14nx = (C14NX) obj) != null) {
                        if (c14nx.getView().isLayoutRequested()) {
                            StarlightNode starlightNode2 = c14o82.LIZ;
                            starlightNode2.nativeMarkDirty(starlightNode2.LIZ);
                        }
                    } else {
                        starlightNode.nativeMarkDirty(starlightNode.LIZ);
                    }
                } else {
                    StarlightNode starlightNode3 = c14o82.LIZ;
                    starlightNode3.nativeMarkDirty(starlightNode3.LIZ);
                }
                LIZIZ(c14o82, z);
            }
        }
    }
}
