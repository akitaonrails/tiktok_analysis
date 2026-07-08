package Y;

import X.C09JN;
import X.C11O8;
import X.C11S5;
import X.C1701940uOG;
import X.C1877407Wy;
import X.C1C7U;
import X.C2355009Kq;
import X.C259800zU;
import X.C443530HaJ;
import Y.AfS172S0100000_3;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.retrofit2.mime.TypedFile;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CustomStickerApi;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResponse;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResult;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.ss.android.ugc.aweme.tools.music.aichoosemusic.upload.MediaUploadServiceImpl;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AfS139S0200000_3 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS139S0200000_3 afS139S0200000_3, Object obj) {
        C1C7U.LIZ("MediaUploadServiceImpl@9449.submit$4$shared$1");
        String str = (String) obj;
        if (str.length() > 0) {
            ((MediaUploadServiceImpl) afS139S0200000_3.l0).LIZIZ.LIZIZ((C1877407Wy) afS139S0200000_3.l1, str);
        }
        C1C7U.LIZIZ("MediaUploadServiceImpl@9449.submit$4$shared$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS139S0200000_3 afS139S0200000_3, Object obj) {
        C1C7U.LIZ("RedEnvelopeWidget@65b2.addPortalShortCutWithLottie$2$2$1");
        ((CountDownLatch) afS139S0200000_3.l0).countDown();
        ((C259800zU) afS139S0200000_3.l1).element = obj;
        C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addPortalShortCutWithLottie$2$2$1");
    }

    public static final void accept$10(AfS139S0200000_3 afS139S0200000_3, Object obj) {
        int iIntValue;
        C1C7U.LIZ("BackgroundColorUtils@7171.setExtractedColor$2$onCompleted$2");
        Integer num = (Integer) obj;
        SmartImageView smartImageView = (SmartImageView) afS139S0200000_3.l0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        smartImageView.setBackgroundColor(iIntValue);
        Function1 function1 = (Function1) afS139S0200000_3.l1;
        if (function1 != null) {
            function1.invoke(0);
        }
        C1C7U.LIZIZ("BackgroundColorUtils@7171.setExtractedColor$2$onCompleted$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS139S0200000_3 afS139S0200000_3, Object obj) {
        C1C7U.LIZ("RedEnvelopeWidget@65b2.addPortalShortCutWithLottie$2$2$3");
        ((C259800zU) afS139S0200000_3.l0).element = obj;
        ((CountDownLatch) afS139S0200000_3.l1).countDown();
        C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addPortalShortCutWithLottie$2$2$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS139S0200000_3 afS139S0200000_3, Object obj) {
        C1C7U.LIZ("VideoExtractTask@dccf.run$zipPath$1");
        ((C259800zU) afS139S0200000_3.l0).element = obj;
        ((CountDownLatch) afS139S0200000_3.l1).countDown();
        C1C7U.LIZIZ("VideoExtractTask@dccf.run$zipPath$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS139S0200000_3 afS139S0200000_3, Object obj) {
        C1C7U.LIZ("VideoExtractTask@dccf.run$zipPath$2");
        ((C259800zU) afS139S0200000_3.l0).element = obj;
        ((CountDownLatch) afS139S0200000_3.l1).countDown();
        C1C7U.LIZIZ("VideoExtractTask@dccf.run$zipPath$2");
    }

    public static final void accept$5(AfS139S0200000_3 afS139S0200000_3, Object obj) {
        T t;
        C1C7U.LIZ("SubPackageInfoService@c8d9.fetchSubUserInfo$1");
        DataResponse dataResponse = (DataResponse) obj;
        if (dataResponse != null && (t = dataResponse.data) != 0) {
            ((MutableLiveData) afS139S0200000_3.l0).postValue(t);
            ((Function1) afS139S0200000_3.l1).invoke(t);
        }
        C1C7U.LIZIZ("SubPackageInfoService@c8d9.fetchSubUserInfo$1");
    }

    public static final void accept$6(AfS139S0200000_3 afS139S0200000_3, Object obj) {
        C1C7U.LIZ("EditPreviewStickerViewModel@875e.compressImage$observable$2");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C11O8 c11o8LJJJLZIJ = ((CustomStickerApi) ((EditPreviewStickerViewModel) afS139S0200000_3.l0).LLILZLL.getValue()).cutoutSticker(new TypedFile("image/*", (File) obj)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        final EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) afS139S0200000_3.l0;
        final CreativeInfo creativeInfo = (CreativeInfo) afS139S0200000_3.l1;
        c11o8LJJJLZIJ.LJJLL(new C09JN() { // from class: X.09ba
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("EditPreviewStickerViewModel@875e.compressImage$observable$2$1");
                final CutoutResponse cutoutResponse = (CutoutResponse) obj2;
                EditPreviewStickerViewModel editPreviewStickerViewModel2 = editPreviewStickerViewModel;
                final CreativeInfo creativeInfo2 = creativeInfo;
                final long j = jCurrentTimeMillis;
                C11NJ c11nj = editPreviewStickerViewModel2.LLILZIL;
                if (c11nj == null || !c11nj.LLILLJJLI) {
                    InterfaceC420801kM interfaceC420801kMLJJLL = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.09bb
                        @Override // X.InterfaceC1478005qU
                        public final void subscribe(C09AJ<CutoutData> c09aj) throws Throwable {
                            C1C7U.LIZ("EditPreviewStickerViewModel@875e.handleResponse$observable$1");
                            CutoutResponse cutoutResponse2 = cutoutResponse;
                            if (cutoutResponse2 == null) {
                                c09aj.tryOnError(new C2404709bZ(null));
                            } else if (cutoutResponse2.status_code == 0) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("duration", jCurrentTimeMillis2 - j);
                                C1637890six.LIZJ("custom_sticker_imageclip_cost", jSONObject, null);
                                CutoutResult data = cutoutResponse.getData();
                                if (data == null) {
                                    c09aj.tryOnError(new C2404709bZ(null));
                                    C1C7U.LIZIZ("EditPreviewStickerViewModel@875e.handleResponse$observable$1");
                                    return;
                                } else {
                                    C0VSJ c0vsjLIZLLL = C2279508wT.LIZLLL(creativeInfo2, C2279508wT.LIZ(data.content), Bitmap.CompressFormat.PNG);
                                    if (c0vsjLIZLLL == null) {
                                        c09aj.tryOnError(new C2404709bZ(null));
                                    } else {
                                        c09aj.onNext(new CutoutData(c0vsjLIZLLL, data.contoursPoint, data.bbox));
                                    }
                                }
                            } else {
                                c09aj.tryOnError(new C2404709bZ(cutoutResponse.message));
                            }
                            C1C7U.LIZIZ("EditPreviewStickerViewModel@875e.handleResponse$observable$1");
                        }
                    }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS172S0100000_3(editPreviewStickerViewModel2, 55), new AfS172S0100000_3(editPreviewStickerViewModel2, 56));
                    C11NJ c11nj2 = editPreviewStickerViewModel2.LLILZIL;
                    if (c11nj2 != null) {
                        c11nj2.LIZ(interfaceC420801kMLJJLL);
                    }
                }
                C1C7U.LIZIZ("EditPreviewStickerViewModel@875e.compressImage$observable$2$1");
            }
        }, new AfS172S0100000_3(editPreviewStickerViewModel, 53));
        C1C7U.LIZIZ("EditPreviewStickerViewModel@875e.compressImage$observable$2");
    }

    public static final void accept$7(AfS139S0200000_3 afS139S0200000_3, Object obj) {
        C1C7U.LIZ("KYCCameraActivity@7f9f.processGalleryPhotos$disposable$2");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((List) afS139S0200000_3.l0).iterator();
        while (it2.hasNext()) {
            arrayList.add(((Uri) it2.next()).toString());
        }
        ((KYCCameraActivity) afS139S0200000_3.l1).LLLLZI(list, true);
        C1C7U.LIZIZ("KYCCameraActivity@7f9f.processGalleryPhotos$disposable$2");
    }

    public static final void accept$8(AfS139S0200000_3 afS139S0200000_3, Object obj) {
        C1C7U.LIZ("ImageUtilsForScreenShot@c8a.loadCircleImage$1");
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            C443530HaJ c443530HaJ = new C443530HaJ(((Context) afS139S0200000_3.l0).getResources(), bitmap);
            c443530HaJ.LIZIZ();
            ((Function1) afS139S0200000_3.l1).invoke(c443530HaJ);
        }
        C1C7U.LIZIZ("ImageUtilsForScreenShot@c8a.loadCircleImage$1");
    }

    public static final void accept$9(AfS139S0200000_3 afS139S0200000_3, Object obj) {
        C1C7U.LIZ("DrawGuessUtil@bdeb.uploadImageWhenFileReady$2");
        C2355009Kq.LJIILL(((File) afS139S0200000_3.l0).getPath());
        Function1 function1 = (Function1) afS139S0200000_3.l1;
        if (function1 != null) {
            function1.invoke("");
        }
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.uploadImageWhenFileReady$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS139S0200000_3(X.C259800zU r2, java.util.concurrent.CountDownLatch r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 1 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS139S0200000_3.<init>(X.00zU, java.util.concurrent.CountDownLatch, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS139S0200000_3(Object obj, Context context, Function1<? super Drawable, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
        this.l1 = context;
    }
}
