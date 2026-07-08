package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0FHX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FHX implements Callable {
    public final /* synthetic */ C0FI2 LL;
    public final /* synthetic */ TextFontStyleData LLILLJJLI;
    public final /* synthetic */ C0FID LLILLL;
    public final /* synthetic */ Boolean LLILZ;
    public final /* synthetic */ C0FIA LLILZIL;
    public final /* synthetic */ long LLILZLL;

    public /* synthetic */ C0FHX(long j, C0FID c0fid, C0FI2 c0fi2, TextFontStyleData textFontStyleData, C0FIA c0fia, Boolean bool) {
        this.LL = c0fi2;
        this.LLILLJJLI = textFontStyleData;
        this.LLILLL = c0fid;
        this.LLILZ = bool;
        this.LLILZIL = c0fia;
        this.LLILZLL = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        final C0FI2 c0fi2 = this.LL;
        final TextFontStyleData textFontStyleData = this.LLILLJJLI;
        final C0FID c0fid = this.LLILLL;
        final Boolean bool = this.LLILZ;
        final C0FIA c0fia = this.LLILZIL;
        final long j = this.LLILZLL;
        c0fi2.getClass();
        C1C7U.LIZ("EditStickerFontStyleManager@4190.downloadFontAndMotion$1L");
        C196909122h.LIZ().LJIIL(textFontStyleData.LJ, new IFetchEffectListener() { // from class: X.0FI3
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect) {
                Effect effect2 = effect;
                TextFontStyleData textFontStyleDataLJJIJL = c0fi2.LJJIJL(effect2);
                if (textFontStyleDataLJJIJL != null) {
                    C0FID c0fid2 = c0fid;
                    if (c0fid2 != null) {
                        textFontStyleDataLJJIJL.LJ = effect2;
                        c0fid2.LIZLLL(textFontStyleDataLJJIJL, true);
                    }
                    C0FI2 c0fi22 = c0fi2;
                    Boolean bool2 = bool;
                    C0FIA c0fia2 = c0fia;
                    c0fi22.getClass();
                    if (bool2.booleanValue()) {
                        c0fi22.LIZJ(textFontStyleDataLJJIJL, c0fia2, 0);
                    }
                    C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TextFontTypeLayout#downloadFontAndMotion, fontTitle = ");
                    sbLIZ.append(textFontStyleData.title);
                    sbLIZ.append("download success, cost = ");
                    sbLIZ.append(System.currentTimeMillis() - j);
                    C201955140j.LIZJ(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                C0FID c0fid3 = c0fid;
                if (c0fid3 == null) {
                    return;
                }
                c0fid3.LIZJ();
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                C0FIE c0fie;
                if (effect != null) {
                    try {
                        if (effect.getExtra() != null) {
                            TextFontStyleData textFontStyleData2 = (TextFontStyleData) GsonProtectorUtils.fromJson(C123O.LIZ(), effect.getExtra(), TextFontStyleData.class);
                            Exception exception = exceptionResult.getException();
                            if (textFontStyleData2 != null && (c0fie = C196909122h.LIZLLL) != null) {
                                c0fie.LIZ(textFontStyleData2, false, exception);
                            }
                        }
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                Map<String, TextFontStyleData> map = c0fi2.LIZIZ;
                if (map != null && map.get(textFontStyleData.fileName) != null) {
                    c0fi2.LIZIZ.get(textFontStyleData.fileName).LIZLLL = 2;
                }
                C0FID c0fid2 = c0fid;
                if (c0fid2 != null) {
                    c0fid2.LIZJ();
                }
                C201955140j.LJII(C1465490oEt.LIZIZ, "textFontDownload err: " + exceptionResult.getMsg());
            }
        });
        C1C7U.LIZIZ("EditStickerFontStyleManager@4190.downloadFontAndMotion$1L");
        return null;
    }
}
