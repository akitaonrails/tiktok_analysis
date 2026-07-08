package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EZK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZK extends C09AY implements InterfaceC1685420txc<int[], Float, Float, Float, Boolean, Unit> {
    public final /* synthetic */ C0EZJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EZK(C0EZJ c0ezj) {
        super(5);
        this.LL = c0ezj;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(int[] iArr, Float f, Float f2, Float f3, Boolean bool) {
        PairIntInt pairIntInt;
        Pair pair;
        int iW02;
        Pair pair2;
        float fW02;
        int iW022;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaRuntime mediaRuntimeApi;
        int[] iArr2 = iArr;
        float fFloatValue = f.floatValue();
        f2.floatValue();
        float fFloatValue2 = f3.floatValue();
        boolean zBooleanValue = bool.booleanValue();
        C0E48 c0e48F4 = this.LL.F4();
        int iW023 = 0;
        if (c0e48F4 == null || (iNLEMediaSessionF1 = c0e48F4.f1()) == null || (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (pairIntInt = mediaRuntimeApi.getInitSize()) == null) {
            pairIntInt = new PairIntInt(0, 0);
        }
        if (pairIntInt.getFirst() != 0 && pairIntInt.getSecond() != 0) {
            float second = ((pairIntInt.getSecond() / 2) - (iArr2[3] / 2)) - iArr2[1];
            if (zBooleanValue) {
                float f4 = -second;
                InterfaceC361710EGb interfaceC361710EGbD5 = this.LL.d5();
                if (interfaceC361710EGbD5 != null) {
                    iW022 = interfaceC361710EGbD5.W02();
                } else {
                    iW022 = 0;
                }
                Float fValueOf = Float.valueOf(f4 - iW022);
                InterfaceC361710EGb interfaceC361710EGbD52 = this.LL.d5();
                if (interfaceC361710EGbD52 != null) {
                    iW023 = interfaceC361710EGbD52.W02();
                }
                pair = new Pair(fValueOf, Float.valueOf(-iW023));
            } else {
                InterfaceC361710EGb interfaceC361710EGbD53 = this.LL.d5();
                if (interfaceC361710EGbD53 != null) {
                    iW02 = interfaceC361710EGbD53.W02();
                } else {
                    iW02 = 0;
                }
                Float fValueOf2 = Float.valueOf(-iW02);
                float f5 = -second;
                InterfaceC361710EGb interfaceC361710EGbD54 = this.LL.d5();
                if (interfaceC361710EGbD54 != null) {
                    iW023 = interfaceC361710EGbD54.W02();
                }
                pair = new Pair(fValueOf2, Float.valueOf(f5 - iW023));
            }
            int iLIZIZ = C814420VxA.LIZIZ(pairIntInt.getSecond() * fFloatValue);
            float fLIZIZ = C372820EjY.LIZIZ(fFloatValue2, pair);
            float second2 = pairIntInt.getSecond() / 2.0f;
            C0EOK c0eokO4 = this.LL.O4();
            if (c0eokO4 != null) {
                c0eokO4.sq(Integer.valueOf(iLIZIZ), Float.valueOf(fLIZIZ), Float.valueOf(second2));
            }
            float fW022 = 0.0f;
            if (zBooleanValue) {
                Float fValueOf3 = Float.valueOf(0.0f);
                InterfaceC361710EGb interfaceC361710EGbD55 = this.LL.d5();
                if (interfaceC361710EGbD55 != null) {
                    fW022 = interfaceC361710EGbD55.W02();
                }
                pair2 = new Pair(fValueOf3, Float.valueOf(-fW022));
            } else {
                InterfaceC361710EGb interfaceC361710EGbD56 = this.LL.d5();
                if (interfaceC361710EGbD56 != null) {
                    fW02 = interfaceC361710EGbD56.W02();
                } else {
                    fW02 = 0.0f;
                }
                pair2 = new Pair(Float.valueOf(-fW02), Float.valueOf(0.0f));
            }
            InterfaceC363160ELq interfaceC363160ELqT4 = this.LL.T4();
            if (interfaceC363160ELqT4 != null) {
                interfaceC363160ELqT4.Dc1(Integer.valueOf(iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Float.valueOf(C372820EjY.LIZIZ(fFloatValue2, pair2)), Float.valueOf(second2));
            }
        }
        return Unit.LIZ;
    }
}
