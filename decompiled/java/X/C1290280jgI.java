package X;

import Y.ARunnableS89S0200000_20;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0jgI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290280jgI implements InterfaceC1290680jgw {
    public final String LIZ;
    public final /* synthetic */ LynxBytedLottieView LIZIZ;

    @Override // X.InterfaceC1290680jgw
    public final void LIZ(String str) throws JSONException {
        String str2 = this.LIZ;
        if (str2 != null) {
            LynxBytedLottieView lynxBytedLottieView = this.LIZIZ;
            if (Intrinsics.LJFF(str2, lynxBytedLottieView.LLJI) && (!a0.LJJJIL(str))) {
                String str3 = lynxBytedLottieView.LLJI;
                if (str3 == null) {
                    str3 = "";
                }
                lynxBytedLottieView.LJJIJIIJIL(1, str, str3);
            }
        }
    }

    @Override // X.InterfaceC1290680jgw
    public final void LIZIZ(C1291600jiQ c1291600jiQ) {
        String str = this.LIZ;
        if (str != null) {
            LynxBytedLottieView lynxBytedLottieView = this.LIZIZ;
            if (Intrinsics.LJFF(str, lynxBytedLottieView.LLJI)) {
                C1289620jfE.LIZJ(new ARunnableS89S0200000_20(c1291600jiQ, lynxBytedLottieView, 125));
            }
        }
    }

    public C1290280jgI(LynxBytedLottieView lynxBytedLottieView, String str) {
        this.LIZIZ = lynxBytedLottieView;
        this.LIZ = str;
    }
}
