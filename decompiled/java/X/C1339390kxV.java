package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0kxV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339390kxV implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Void> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C1339390kxV c1339390kxV, C09AJ c09aj) {
        ExecutorService executorServiceLIZ;
        C1C7U.LIZ("CustomStickerExtractor@41db.extractImage$1");
        final String str = ((StickerItemModel) c1339390kxV.l0).path;
        if (!new C0VSJ(str).exists()) {
            c09aj.onError(new IllegalStateException("File not exists"));
            C1C7U.LIZIZ("CustomStickerExtractor@41db.extractImage$1");
            return;
        }
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(C1325700kbQ.LIZLLL(Uri.fromFile(new C0VSJ(str))).LIZ(), (C1432850nOF) c1339390kxV.l1);
        if (C04TS.LIZ()) {
            executorServiceLIZ = C823050WQl.LIZLLL();
        } else {
            executorServiceLIZ = C807400Vlq.LIZ();
        }
        final C1432850nOF c1432850nOF = (C1432850nOF) c1339390kxV.l1;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new InterfaceC589510NAf<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0khj
            @Override // X.InterfaceC589510NAf
            public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
            }

            /* JADX WARN: Type inference failed for: r12v2 */
            /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
            /* JADX WARN: Type inference failed for: r12v6 */
            @Override // X.InterfaceC589510NAf
            public final void LIZ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) throws Throwable {
                C1323050kX9<AbstractC1327750kej> result;
                AbstractC1327750kej abstractC1327750kej;
                int duration;
                ?? r12;
                int[] iArr;
                if (interfaceC1320200kSY != null && (result = interfaceC1320200kSY.getResult()) != null && (abstractC1327750kej = result.get()) != null) {
                    C1432850nOF c1432850nOF2 = c1432850nOF;
                    C09AJ<Void> c09aj2 = c19482611Ke;
                    String str2 = str;
                    boolean z = abstractC1327750kej instanceof C1329380khM;
                    int[] iArr2 = C2224308nZ.LIZ;
                    if (z) {
                        C1329380khM c1329380khM = (C1329380khM) abstractC1327750kej;
                        if (c1329380khM.LIZIZ().LIZ.getDuration() <= 0) {
                            duration = 1;
                        } else {
                            duration = c1329380khM.LIZIZ().LIZ.getDuration();
                        }
                        int frameCount = c1329380khM.LIZIZ().LIZ.getFrameCount();
                        int i = ((int) (frameCount / (duration / LSPassThroughRecordSizeConfig.DEFAULT))) * 2;
                        for (int i2 = 0; i2 < frameCount; i2 += i) {
                            C1329620khk c1329620khk = new C1329620khk(new C1329920kiE(), new C1329590khh(new C1331210kkJ(), c1329380khM.LIZIZ(), new Rect(0, 0, c1329380khM.getWidth(), c1329380khM.getHeight())));
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c1329380khM.getWidth(), c1329380khM.getHeight(), Bitmap.Config.ARGB_8888);
                            c1329620khk.LIZ(i2, bitmapCreateBitmap);
                            int width = c1329380khM.getWidth();
                            int height = c1329380khM.getHeight();
                            c1432850nOF2.getClass();
                            if (width > height) {
                                r12 = 1;
                                iArr = new int[]{iArr2[0], (int) ((height / width) * iArr2[0])};
                            } else {
                                r12 = 1;
                                float f = width / height;
                                int i3 = iArr2[1];
                                iArr = new int[]{(int) (f * i3), i3};
                            }
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, iArr[0], iArr[r12], r12);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(c1432850nOF2.LJ);
                            sbLIZ.append("extract-frame-custom_sticker-");
                            sbLIZ.append(System.currentTimeMillis());
                            sbLIZ.append(".jpg");
                            C2475009mu.LJFF(70, Bitmap.CompressFormat.JPEG, bitmapCreateScaledBitmap, new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)));
                            C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
                            C786410Ut5.LJJJJ(bitmapCreateBitmap);
                        }
                        c09aj2.onComplete();
                        return;
                    }
                    c1432850nOF2.getClass();
                    Bitmap bitmapLIZIZ = C2475009mu.LIZIZ(str2, iArr2, Bitmap.Config.ARGB_4444);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c1432850nOF2.LJ);
                    sbLIZ2.append("extract-frame-custom_sticker-");
                    sbLIZ2.append(System.currentTimeMillis());
                    sbLIZ2.append(".jpg");
                    C2475009mu.LJFF(70, Bitmap.CompressFormat.JPEG, bitmapLIZIZ, new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)));
                    c09aj2.onComplete();
                }
            }

            @Override // X.InterfaceC589510NAf
            public final void LIZIZ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                C201955140j.LJ("fetchDecodedImage Error");
                c19482611Ke.onComplete();
            }

            @Override // X.InterfaceC589510NAf
            public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                C201955140j.LJ("fetchDecodedImage onCancellation");
                c19482611Ke.onComplete();
            }
        }, executorServiceLIZ);
        C1C7U.LIZIZ("CustomStickerExtractor@41db.extractImage$1");
    }

    public static final void subscribe$1(C1339390kxV c1339390kxV, C09AJ c09aj) {
        String string;
        final ImageModel imageModel = (ImageModel) c1339390kxV.l0;
        Executor executor = (Executor) c1339390kxV.l1;
        C1C7U.LIZ("LiveImageUtils@6e28.loadFirstAvailableImageBitmap$1L");
        C1325710kbR[] c1325710kbRArrLIZ = C1121670fIL.LIZ(imageModel);
        if (c1325710kbRArrLIZ != null && c1325710kbRArrLIZ.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (C1325710kbR c1325710kbR : c1325710kbRArrLIZ) {
                if (c1325710kbR != null) {
                    C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                    EnumC1320950kTl enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
                    c1325540kbALIZ.getClass();
                    arrayList.add(new C1320160kSU(c1325540kbALIZ, c1325710kbR, enumC1320950kTl));
                }
            }
            if (!arrayList.isEmpty()) {
                final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                new C1320930kTj(new C1320750kTR(arrayList)).LIZJ(new AbstractC447090Hg3() { // from class: X.0kbd
                    @Override // X.C0HWE
                    public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                        if (c19482611Ke.isDisposed()) {
                            C20441214yg.LJ("LiveImageUtils", "subscriber is disposed");
                        } else {
                            c19482611Ke.onError(interfaceC1320200kSY.LIZLLL());
                        }
                    }

                    @Override // X.AbstractC447090Hg3
                    public final void LJI(Bitmap bitmap) {
                        if (bitmap != null && bitmap.getConfig() != null) {
                            c19482611Ke.onNext(bitmap.copy(bitmap.getConfig(), false));
                            c19482611Ke.onComplete();
                            return;
                        }
                        C09AJ c09aj2 = c19482611Ke;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("No bitmap loaded for imageModel: ");
                        sbLIZ.append(imageModel.toString());
                        c09aj2.onError(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
                    }
                }, executor);
                C1C7U.LIZIZ("LiveImageUtils@6e28.loadFirstAvailableImageBitmap$1L");
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot build requests from imageModel: ");
        if (imageModel != null) {
            string = imageModel.toString();
        } else {
            string = "";
        }
        sbLIZ.append(string);
        c09aj.onError(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)));
        C1C7U.LIZIZ("LiveImageUtils@6e28.loadFirstAvailableImageBitmap$1L");
    }

    public C1339390kxV(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
