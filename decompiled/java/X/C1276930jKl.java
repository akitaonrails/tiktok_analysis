package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.RtcParams;
import com.google.gson.n;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276930jKl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;
    public final /* synthetic */ AbstractC1273900jFs LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1276930jKl(C1276910jKj c1276910jKj, AbstractC1273900jFs abstractC1273900jFs) {
        super(0);
        this.LL = c1276910jKj;
        this.LLILLJJLI = abstractC1273900jFs;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Pair<Integer, Integer> pair = this.LL.LLJILJIL;
        if (pair == null && (pair = this.LL.LLJILJILJ) == null) {
            pair = new Pair<>(0, 0);
        }
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        Pair<Integer, Integer> pair2 = this.LL.LLJILLL;
        Integer first = pair2 != null ? pair2.getFirst() : null;
        Pair<Integer, Integer> pair3 = this.LL.LLJILLL;
        Integer second = pair3 != null ? pair3.getSecond() : null;
        Pair<Integer, Integer> pair4 = this.LL.LLJIJIL;
        Integer first2 = pair4 != null ? pair4.getFirst() : null;
        Pair<Integer, Integer> pair5 = this.LL.LLJIJIL;
        Integer second2 = pair5 != null ? pair5.getSecond() : null;
        Resolution resolution = new Resolution(0, 0, 0, 0, "linkmic_grid_float_1", iIntValue, iIntValue2, "layout_default", new RtcParams(first2 != null ? first2.intValue() : 0, second2 != null ? second2.intValue() : 0, first != null ? first.intValue() : 0, second != null ? second.intValue() : 0, 0, 0, 0, null));
        n nVar = new n();
        n nVar2 = new n();
        C1276910jKj c1276910jKj = this.LL;
        AbstractC1273900jFs abstractC1273900jFs = this.LLILLJJLI;
        nVar.LJJIII(1, "cap_adapted_quirks");
        if (resolution.getEffectWidth() > 0 && resolution.getEffectHeight() > 0) {
            nVar.LJJIII(Integer.valueOf(resolution.getEffectWidth()), "cap_adapted_width");
            nVar.LJJIII(Integer.valueOf(resolution.getEffectHeight()), "cap_adapted_height");
        }
        if (second != null) {
            nVar.LJJIII(second, "videoCaptureFps");
        }
        if (first != null) {
            nVar.LJJIII(first, "videoCaptureMinFps");
        }
        RtcParams rtcParams = resolution.rtcParams;
        if (rtcParams != null) {
            Context contextLJII = C497740JfY.LJII();
            int i = rtcParams.capWidth;
            int i2 = rtcParams.capHeight;
            if (c1276910jKj.LJJL() && i2 > 0 && i > 0 && contextLJII != null) {
                C1274150jGH c1274150jGHLIZLLL = C1274140jGG.LIZLLL(i2, i, contextLJII, abstractC1273900jFs.LJJJLZIJ() == 1);
                nVar.LJJIII(Integer.valueOf(c1274150jGHLIZLLL.LIZIZ), "videoCaptureWidth");
                nVar.LJJIII(Integer.valueOf(c1274150jGHLIZLLL.LIZ), "videoCaptureHeight");
            }
        }
        int i3 = c1276910jKj.LLJJ;
        if (i3 > 0 && c1276910jKj.LJJLI()) {
            nVar.LJJIII(Integer.valueOf(i3), "fps");
        }
        nVar2.LJJIFFI("PushBase", nVar);
        abstractC1273900jFs.LJIIZILJ(nVar2.toString());
        InterfaceC1279800jPO interfaceC1279800jPO = c1276910jKj.LLJJJ;
        if (interfaceC1279800jPO != null) {
            interfaceC1279800jPO.LJJJJ();
        }
        this.LL.LLJIJIL = null;
        this.LL.LLJILJIL = null;
        this.LL.LLJILLL = null;
        this.LL.LLJJ = 0;
        C1276910jKj c1276910jKj2 = this.LL;
        C965350bED c965350bED = c1276910jKj2.LLILZ.LJJ;
        String str = c1276910jKj2.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("split on rtc, restoreParams, ");
        sbLIZ.append(resolution);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LL.getClass();
        this.LLILLJJLI.LLLLLLJ();
        C1276910jKj c1276910jKj3 = this.LL;
        C965350bED c965350bED2 = c1276910jKj3.LLILZ.LJJ;
        String str2 = c1276910jKj3.LLILZIL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("turnOffEffectDowngradingStrategy result is ");
        sbLIZ2.append(0);
        C1AZW.LIZIZ(c965350bED2, str2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        return Unit.LIZ;
    }
}
