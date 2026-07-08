package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.concurrent.Callable;
import lgo.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656440tCs implements InterfaceC1623520sLm {
    public final InterfaceC1645720sva LIZ;
    public final InterfaceC1650230t2r LIZIZ;
    public final ShortVideoContext LIZJ;
    public final InterfaceC1456340o08<List<String>> LIZLLL;

    @Override // X.InterfaceC1623520sLm
    public final void LIZ(String str) {
        this.LIZIZ.cB0(str);
    }

    @Override // X.InterfaceC1623520sLm
    public final void LIZJ(final String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (C2286708xd.LJIIJJI(new C0VSJ(C0MVS.LIZIZ(this.LIZJ.creativeInfo))) >= 10) {
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String strLIZIZ = C0MVS.LIZIZ(this.LIZJ.creativeInfo);
        C1441190nbh c1441190nbhLJI = this.LIZJ.LJI();
        if (c1441190nbhLJI != null) {
            str2 = c1441190nbhLJI.segmentBeginTime;
        } else {
            str2 = null;
        }
        final String strLIZ = new C08IM(strLIZIZ, str2, str).LIZ();
        this.LIZIZ.AJ(new C0VSJ(strLIZ).getParentFile().getPath(), strLIZ, z);
        C15O7.LIZIZ(new Callable() { // from class: X.0tCq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("SavePhotoStickerProcessorImpl@2ef8.saveCapturedPhoto$1");
                VEFrame vEFrameJo = this.LL.LIZ.jo(str);
                Bitmap bitmap = vEFrameJo != null ? vEFrameJo.toBitmap() : null;
                C2475009mu.LJFF(100, Bitmap.CompressFormat.PNG, bitmap, new C0VSJ(strLIZ));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("save bitmap into file:");
                sbLIZ.append(strLIZ);
                sbLIZ.append(",width:");
                sbLIZ.append(bitmap != null ? bitmap.getWidth() : -1);
                sbLIZ.append(",height:");
                sbLIZ.append(bitmap != null ? bitmap.getHeight() : -1);
                Integer numValueOf = Integer.valueOf(Log.d("save_photo", C2188811AlT.LIZIZ(sbLIZ)));
                C1C7U.LIZIZ("SavePhotoStickerProcessorImpl@2ef8.saveCapturedPhoto$1");
                return numValueOf;
            }
        }, C15O7.LJI, null);
    }

    @Override // X.InterfaceC1623520sLm
    public final void LIZIZ(Effect effect, C19GS c19gs, LifecycleOwner lifecycleOwner) {
        if (effect != null) {
            C1656470tCv c1656470tCv = new Object() { // from class: X.0tCv
            };
            List<String> list = this.LIZLLL.get();
            c1656470tCv.getClass();
            if (!list.isEmpty()) {
                String strLIZLLL = C0MVS.LIZLLL(effect.getEffectId());
                if (!new C0VSJ(strLIZLLL).exists()) {
                    if (!TextUtils.isEmpty(effect.getExtra())) {
                        try {
                            C1446130njf.LIZ.getClass();
                            final String strLJFF = C1446130njf.LJFF(effect, "watermark_for_captured_image");
                            if (strLJFF != null && strLJFF.length() != 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append((String) ListProtector.get(list, 0));
                                sbLIZ.append(strLJFF);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                DownloadTask downloadTaskWith = C2200151B8z.with(c19gs);
                                downloadTaskWith.url(strLIZIZ);
                                downloadTaskWith.ignoreDataVerify(true);
                                downloadTaskWith.savePath(C0MVS.LIZJ());
                                downloadTaskWith.name(new C0VSJ(strLIZLLL).getName());
                                a.LIZIZ.LIZ().LIZIZ(lifecycleOwner, new AbstractC1656460tCu() { // from class: X.0tCt
                                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                                    public final void onSuccessed(DownloadInfo downloadInfo) throws JSONException {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("uri", strLJFF);
                                        C1637890six.LJ("effect_watermark_download_rate", 0, jSONObject);
                                    }

                                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) throws JSONException {
                                        String errorMessage;
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("uri", strLJFF);
                                        if (baseException != null) {
                                            errorMessage = baseException.getErrorMessage();
                                        } else {
                                            errorMessage = null;
                                        }
                                        jSONObject.put("exception", errorMessage);
                                        C1637890six.LJ("effect_watermark_download_rate", 1, jSONObject);
                                    }
                                }, downloadTaskWith, "SavePhotoStickerWatermarkFetcher#fetch");
                                downloadTaskWith.download();
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return;
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("extra cannot be null: stickerId");
                    sbLIZ2.append(effect.getId());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                return;
            }
            throw new IllegalArgumentException("url prefix cannot be empty");
        }
    }

    public C1656440tCs(InterfaceC1645720sva interfaceC1645720sva, InterfaceC1650230t2r interfaceC1650230t2r, ShortVideoContext shortVideoContext, C1621090sHr c1621090sHr) {
        this.LIZ = interfaceC1645720sva;
        this.LIZIZ = interfaceC1650230t2r;
        this.LIZJ = shortVideoContext;
        this.LIZLLL = c1621090sHr;
    }
}
