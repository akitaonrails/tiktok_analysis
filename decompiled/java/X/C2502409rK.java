package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.featureflags.TiktokAvatarLokiConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09rK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2502409rK implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<T> c09aj) throws Throwable {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
            case 4:
                subscribe$4(this, c09aj);
                break;
            case 5:
                subscribe$5(this, c09aj);
                break;
            case 6:
                subscribe$6(this, c09aj);
                break;
            case 7:
                subscribe$7(this, c09aj);
                break;
        }
    }

    public C2502409rK(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C2502409rK c2502409rK, C09AJ c09aj) {
        C1C7U.LIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.taskToObservable$1");
        ((C15O7) c2502409rK.l0).LIZLLL(new C2501509rB((C19482611Ke) c09aj, 5));
        C1C7U.LIZIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.taskToObservable$1");
    }

    public static final void subscribe$1(C2502409rK c2502409rK, C09AJ c09aj) {
        C1C7U.LIZ("NoticeVideoManager$InnerManager@6dab.requestDataReal$1");
        try {
            String string = ((List) c2502409rK.l0).toString();
            C23053091n.LIZ.getClass();
            Object arrayList = ((DetailFeedService) C23053091n.LIZJ.getValue()).LJIILIIL(4, string).items;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            C08E7.LIZ(c09aj, arrayList);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("NoticeVideoManager", "requestDataReal error", th);
            C08E7.LIZ(c09aj, new ArrayList());
        }
        C1C7U.LIZIZ("NoticeVideoManager$InnerManager@6dab.requestDataReal$1");
    }

    public static final void subscribe$2(C2502409rK c2502409rK, C09AJ c09aj) {
        C1C7U.LIZ("AutoCutTosDelegate@4f50.updateKey$1");
        if (C297690Blf.LIZ() && !C0CHQ.LIZ().getAccountService().isLogin()) {
            c09aj.tryOnError(new IllegalStateException("Not login"));
            C1C7U.LIZIZ("AutoCutTosDelegate@4f50.updateKey$1");
            return;
        }
        String str = ((C1419510n2j) c2502409rK.l0).LIZ;
        if (str != null && C123100dR.LIZ(str)) {
            String str2 = ((C1419510n2j) c2502409rK.l0).LIZ;
            if (str2 == null) {
                str2 = "";
            }
            c09aj.onNext(str2);
            ((C1419510n2j) c2502409rK.l0).LIZ = null;
            C1C7U.LIZIZ("AutoCutTosDelegate@4f50.updateKey$1");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(0);
        linkedHashMap.put("purpose", "AI");
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        C11U6<VideoCreation> c11u6 = new C11U6<VideoCreation>() { // from class: X.08yV
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                c19482611Ke.tryOnError(th);
            }

            @Override // X.C11U6
            public final void onSuccess(VideoCreation videoCreation) {
                if (videoCreation instanceof UploadAuthKeyConfig) {
                    c19482611Ke.onNext(C2292508yZ.LIZJ(videoCreation));
                } else {
                    c19482611Ke.tryOnError(new IllegalArgumentException("upload tos key result is not UploadAuthKeyConfig"));
                }
            }
        };
        ListenableFuture<UploadAuthKeyConfig> uploadAuthKeyConfig = ((UploaderRetrofitService) C0CHQ.LIZ().getNetworkService().createRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ(), true, UploaderRetrofitService.class)).getUploadAuthKeyConfig(linkedHashMap);
        uploadAuthKeyConfig.LJIIJJI(new C135Q(uploadAuthKeyConfig, c11u6), EnumC2272608vM.LL);
        C1C7U.LIZIZ("AutoCutTosDelegate@4f50.updateKey$1");
    }

    public static final void subscribe$3(C2502409rK c2502409rK, C09AJ c09aj) {
        EnumC2476709nB enumC2476709nB;
        Rect rect;
        C1C7U.LIZ("LocalLottieBitmapAsset@1a0d.centerRound$1");
        try {
            int iMin = Math.min(((Bitmap) c2502409rK.l0).getWidth(), ((Bitmap) c2502409rK.l0).getHeight()) / 2;
            Point point = new Point(((Bitmap) c2502409rK.l0).getWidth() / 2, ((Bitmap) c2502409rK.l0).getHeight() / 2);
            if (((Bitmap) c2502409rK.l0).getWidth() > ((Bitmap) c2502409rK.l0).getHeight()) {
                enumC2476709nB = EnumC2476709nB.LLILLJJLI;
            } else {
                enumC2476709nB = EnumC2476709nB.LL;
            }
            int i = iMin * 2;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(rect2);
            float fMin = Math.min(((Bitmap) c2502409rK.l0).getWidth(), ((Bitmap) c2502409rK.l0).getHeight()) / 2;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            if (enumC2476709nB == EnumC2476709nB.LLILLJJLI) {
                int i2 = point.x;
                rect = new Rect(i2 - iMin, 0, i2 + iMin, i);
            } else {
                int i3 = point.y;
                rect = new Rect(0, i3 - iMin, i, i3 + iMin);
            }
            canvas.drawBitmap((Bitmap) c2502409rK.l0, rect, rect2, paint);
            c09aj.onNext(bitmapCreateBitmap);
            c09aj.onComplete();
            C786410Ut5.LJJJJ((Bitmap) c2502409rK.l0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c09aj.onNext((Bitmap) c2502409rK.l0);
            c09aj.onComplete();
        }
        C1C7U.LIZIZ("LocalLottieBitmapAsset@1a0d.centerRound$1");
    }

    public static final void subscribe$4(C2502409rK c2502409rK, C09AJ c09aj) {
        C1C7U.LIZ("NaviAvatarRequest@9a41.getFetchHeadEffectObservable$1");
        InterfaceC1635390sev interfaceC1635390sev = ((C19426510zP) c2502409rK.l0).LIZJ;
        C01GW c01gw = TiktokAvatarLokiConfig.LIZIZ;
        String str = ((TiktokAvatarLokiConfig.TiktokAvatarLokiConfigData) c01gw.getValue()).lokiPanelName;
        String str2 = ((TiktokAvatarLokiConfig.TiktokAvatarLokiConfigData) c01gw.getValue()).headCategoryKey;
        final C19426510zP c19426510zP = (C19426510zP) c2502409rK.l0;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        C1635120seU.LIZLLL(50, 0, 0, 0, new IFetchCategoryEffectListener() { // from class: X.08ya
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                c19482611Ke.onError(new Exception("Cannot fetch panel info"));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                List<Effect> effects;
                CategoryEffectModel categoryEffects;
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                if (!c19482611Ke.isDisposed()) {
                    if (categoryPageModel2 == null || (categoryEffects = categoryPageModel2.getCategoryEffects()) == null || (effects = categoryEffects.getEffects()) == null) {
                        effects = C13BV.INSTANCE;
                    }
                    for (Effect effect : effects) {
                        if (Intrinsics.LJFF(effect.getName(), ((TiktokAvatarLokiConfig.TiktokAvatarLokiConfigData) TiktokAvatarLokiConfig.LIZIZ.getValue()).recordHeadEffectName)) {
                            if (!c19426510zP.LIZJ.LJIJJLI(effect)) {
                                c19426510zP.LIZJ.LJIIL(effect, new C2500109qx(c19482611Ke, effect, 0));
                                return;
                            } else {
                                c19482611Ke.onNext(effect);
                                return;
                            }
                        }
                    }
                    c19482611Ke.onError(new Exception("No head effect found"));
                }
            }
        }, interfaceC1635390sev, str, str2, null, null);
        C1C7U.LIZIZ("NaviAvatarRequest@9a41.getFetchHeadEffectObservable$1");
    }

    public static final void subscribe$5(C2502409rK c2502409rK, C09AJ c09aj) {
        C1C7U.LIZ("ApiExtKt@a0c9.taskToObservable$1");
        ((C15O7) c2502409rK.l0).LIZLLL(new C2501509rB((C19482611Ke) c09aj, 17));
        C1C7U.LIZIZ("ApiExtKt@a0c9.taskToObservable$1");
    }

    public static final void subscribe$6(C2502409rK c2502409rK, C09AJ c09aj) throws Throwable {
        String strLJIJI;
        Bitmap bitmapLIZLLL;
        C0VSJ c0vsjLIZLLL;
        ExifInterface exifInterfaceLJIILL;
        int i;
        C0VSJ c0vsjLIZLLL2;
        C1C7U.LIZ("EditPreviewStickerScene@344a.showImage$observable$1");
        C20577315fX c20577315fX = (C20577315fX) c2502409rK.l0;
        CreativeInfo creativeInfo = c20577315fX.LLJJ;
        MediaModel mediaModel = c20577315fX.LLJI;
        try {
            exifInterfaceLJIILL = C2471909mP.LJIILL(mediaModel.LJFF());
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJ("readPictureDegree failed: " + e.getMessage());
        }
        if (exifInterfaceLJIILL != null) {
            int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(exifInterfaceLJIILL, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmZZD9yDsHH5CASStf3DW23DCNOrI/q1gj53sNVIx+6xjqZFxCV9h8OUTKOozYpamG", null));
            if (iLJLILLLLZI != 3) {
                if (iLJLILLLLZI != 6) {
                    if (iLJLILLLLZI == 8) {
                        i = 270;
                    }
                    strLJIJI = C2471909mP.LJIJI(mediaModel.LJFF());
                    if (strLJIJI != null && ((u.LJIIZILJ(strLJIJI, ".heif", true) || u.LJIIZILJ(strLJIJI, "/heif", true) || u.LJIIZILJ(strLJIJI, ".heic", true) || u.LJIIZILJ(strLJIJI, "/heic", true)) && C0C64.LJIILLIIL().LJIIIZ(31744, "custom_sticker_heic_fix", true, false) && C2401309b1.LIZ() && (bitmapLIZLLL = C2471909mP.LIZLLL(mediaModel.LJFF(), null)) != null && (c0vsjLIZLLL = C2279508wT.LIZLLL(creativeInfo, Bitmap.createBitmap(bitmapLIZLLL, 0, 0, bitmapLIZLLL.getWidth(), bitmapLIZLLL.getHeight()), Bitmap.CompressFormat.JPEG)) != null)) {
                        mediaModel.LJIILL(c0vsjLIZLLL.getAbsolutePath());
                    }
                } else {
                    i = 90;
                }
            } else {
                i = 180;
            }
            Bitmap bitmapLIZLLL2 = C2471909mP.LIZLLL(mediaModel.LJFF(), null);
            Matrix matrix = new Matrix();
            matrix.postRotate(i);
            if (bitmapLIZLLL2 != null && (c0vsjLIZLLL2 = C2279508wT.LIZLLL(creativeInfo, Bitmap.createBitmap(bitmapLIZLLL2, 0, 0, bitmapLIZLLL2.getWidth(), bitmapLIZLLL2.getHeight(), matrix, true), Bitmap.CompressFormat.JPEG)) != null) {
                mediaModel.LJIILL(c0vsjLIZLLL2.getAbsolutePath());
            }
        } else {
            strLJIJI = C2471909mP.LJIJI(mediaModel.LJFF());
            if (strLJIJI != null) {
                mediaModel.LJIILL(c0vsjLIZLLL.getAbsolutePath());
            }
        }
        C20577315fX c20577315fX2 = (C20577315fX) c2502409rK.l0;
        c20577315fX2.LLJZ = c20577315fX2.LLJI.LJFF();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inScaled = false;
        C2471909mP.LJ(c20577315fX2.LLJZ, options);
        int i2 = options.outWidth;
        c20577315fX2.LLJJLIIIJLLLLLLLZ = i2;
        c20577315fX2.LLJL = options.outHeight;
        c20577315fX2.LLJLIL = i2;
        C20577315fX c20577315fX3 = (C20577315fX) c2502409rK.l0;
        if (c20577315fX3.LLJL > 0 && c20577315fX3.LLJJLIIIJLLLLLLLZ > 0) {
            c09aj.onComplete();
        } else {
            c09aj.onError(new IllegalStateException("Calculate image size error."));
        }
        C1C7U.LIZIZ("EditPreviewStickerScene@344a.showImage$observable$1");
    }

    public static final void subscribe$7(C2502409rK c2502409rK, C09AJ c09aj) {
        EnumC2476809nC enumC2476809nC;
        Rect rect;
        C1C7U.LIZ("LocalLottieBitmapAsset@d70b.centerRound$1");
        try {
            int iMin = Math.min(((Bitmap) c2502409rK.l0).getWidth(), ((Bitmap) c2502409rK.l0).getHeight()) / 2;
            Point point = new Point(((Bitmap) c2502409rK.l0).getWidth() / 2, ((Bitmap) c2502409rK.l0).getHeight() / 2);
            if (((Bitmap) c2502409rK.l0).getWidth() > ((Bitmap) c2502409rK.l0).getHeight()) {
                enumC2476809nC = EnumC2476809nC.LLILLJJLI;
            } else {
                enumC2476809nC = EnumC2476809nC.LL;
            }
            int i = iMin * 2;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(rect2);
            float fMin = Math.min(((Bitmap) c2502409rK.l0).getWidth(), ((Bitmap) c2502409rK.l0).getHeight()) / 2;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            if (enumC2476809nC == EnumC2476809nC.LLILLJJLI) {
                int i2 = point.x;
                rect = new Rect(i2 - iMin, 0, i2 + iMin, i);
            } else {
                int i3 = point.y;
                rect = new Rect(0, i3 - iMin, i, i3 + iMin);
            }
            canvas.drawBitmap((Bitmap) c2502409rK.l0, rect, rect2, paint);
            c09aj.onNext(bitmapCreateBitmap);
            c09aj.onComplete();
            C786410Ut5.LJJJJ((Bitmap) c2502409rK.l0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c09aj.onNext((Bitmap) c2502409rK.l0);
            c09aj.onComplete();
        }
        C1C7U.LIZIZ("LocalLottieBitmapAsset@d70b.centerRound$1");
    }
}
