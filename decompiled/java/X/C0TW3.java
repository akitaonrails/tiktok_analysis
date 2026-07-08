package X;

import Y.ARunnableS18S0201000_12;
import android.os.Handler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TW3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TW3 extends C0TW0 {
    public int LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(255));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        this.LLILLL = 0;
        int iIntValue = ((C0TW1) xBaseParamModel).getOrientationType().intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    C2382909Vj.LIZ(completionBlock, 0, "orientationType's value is not support", null, 4);
                    return;
                } else {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS556S0100000_12(new C0IF2(5), 709));
                    C786410Ut5.LJLIIL(500L, (Handler) this.LLILZ.getValue(), new ARunnableS18S0201000_12(3, completionBlock, this, 6));
                    return;
                }
            }
            C500260Jjc.LJJLIIIJILLIZJL(new AwS556S0100000_12(new C0IF2(2), 708));
            C786410Ut5.LJLIIL(500L, (Handler) this.LLILZ.getValue(), new ARunnableS18S0201000_12(2, completionBlock, this, 6));
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS556S0100000_12(new C0IF2(1), 707));
        C786410Ut5.LJLIIL(500L, (Handler) this.LLILZ.getValue(), new ARunnableS18S0201000_12(1, completionBlock, this, 6));
    }
}
