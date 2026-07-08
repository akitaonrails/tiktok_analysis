package X;

import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.lynx.base.log.LynxLog;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0jhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290880jhG implements InterfaceC1290730jh1<String> {
    public final /* synthetic */ LynxBytedLottieView LIZ;

    @Override // X.InterfaceC1290730jh1
    public final void onFailed() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch polyfill bitmap ");
        sbLIZ.append(this.LIZ.LLJJI);
        sbLIZ.append(" failed");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LynxBytedLottieView lynxBytedLottieView = this.LIZ;
        lynxBytedLottieView.LJJJIL("error", lynxBytedLottieView.LJJIJIIJI(1, strLIZIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetch polyfill Bitmap mSrcUrl=");
        sbLIZ2.append(this.LIZ.LLJ);
        sbLIZ2.append(", filePath=");
        sbLIZ2.append(this.LIZ.LLJJI);
        sbLIZ2.append(" not exists.");
        LynxLog.e("byted-lottie", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public C1290880jhG(LynxBytedLottieView lynxBytedLottieView) {
        this.LIZ = lynxBytedLottieView;
    }

    @Override // X.InterfaceC1290730jh1
    public final void onSuccess(String str) throws JSONException {
        int frame;
        float f;
        C1291600jiQ composition;
        LynxBytedLottieView lynxBytedLottieView = this.LIZ;
        C1291330jhz c1291330jhz = (C1291330jhz) lynxBytedLottieView.mView;
        if (c1291330jhz != null) {
            frame = c1291330jhz.getFrame();
        } else {
            frame = 0;
        }
        C1291330jhz c1291330jhz2 = (C1291330jhz) this.LIZ.mView;
        if (c1291330jhz2 != null && (composition = c1291330jhz2.getComposition()) != null) {
            f = composition.LJIIJ - composition.LJIIIZ;
        } else {
            f = 0.0f;
        }
        LynxBytedLottieView lynxBytedLottieView2 = this.LIZ;
        lynxBytedLottieView.LJJJIL("ready", lynxBytedLottieView.LJJIJ(frame, (int) f, lynxBytedLottieView2.LLIZ, lynxBytedLottieView2.LLJJ));
        LynxBytedLottieView lynxBytedLottieView3 = this.LIZ;
        lynxBytedLottieView3.LLJJIJIL.LIZ(lynxBytedLottieView3.LLJI);
        LynxBytedLottieView lynxBytedLottieView4 = this.LIZ;
        if (lynxBytedLottieView4.LLILLJJLI && lynxBytedLottieView4.LLJILLL) {
            lynxBytedLottieView4.LJJIJLIJ();
        }
    }
}
