package X;

import Y.ACallableS427S0100000_22;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0naX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440470naX {
    public static final C1440470naX LIZ = new C1440470naX();
    public static Context LIZIZ;

    public static Context LIZJ() {
        if (!((Boolean) C0ARY.LIZ.getValue()).booleanValue()) {
            return ActivityStack.getTopActivity();
        }
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            return topActivity;
        }
        Context context = LIZIZ;
        return context != null ? context : C1BWL.LIZ();
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (C1440480naY.LIZ() && (!C1428470nHB.LLIIIJ(videoPublishEditModel))) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, ImageAlbumData imageAlbumData) throws IOException {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        C15O7 c15o7LJIIJ;
        List<SingleImageData> imageList;
        Bitmap bitmapCreateBitmap;
        String path;
        ImageAlbumData imageAlbumData2;
        ImageAlbumData imageAlbumData3;
        List<SingleImageData> imageList2;
        ImageStickerInfoNewEngine stickerInfoNewEngine;
        CopyOnWriteArrayList<TextStickerModel> textStickerModels;
        int i = 0;
        if (C1428470nHB.LJLIIL(videoPublishEditModel)) {
            ImageAlbumData imageAlbumData4 = videoPublishEditModel.getImageAlbumData();
            if (((imageAlbumData4 != null && imageAlbumData4.hasTextStickers()) || ((imageAlbumData2 = videoPublishEditModel.getImageAlbumData()) != null && imageAlbumData2.hasMentionStickers())) && (imageAlbumData3 = videoPublishEditModel.getImageAlbumData()) != null && (imageList2 = imageAlbumData3.getImageList()) != null) {
                int i2 = 0;
                for (SingleImageData singleImageData : imageList2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        SingleImageData singleImageData2 = singleImageData;
                        LIZ.getClass();
                        LIZJ();
                        new Pair(Integer.valueOf(C1450870nrJ.LIZIZ), Integer.valueOf(C1450870nrJ.LIZ));
                        C287070BMz.LIZ();
                        C1440500naa c1440500naa = new C1440500naa(new C1432120nN4(), new AwS601S0100000_22(singleImageData2, 687));
                        String strLJJJI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJI(videoPublishEditModel.getCreativeInfo(), "");
                        Context contextLIZJ = LIZJ();
                        C786410Ut5.M3(C0CHQ.LIZ);
                        C0FIG c0fig = new C0FIG();
                        String id = singleImageData2.getId();
                        if (id == null) {
                            id = String.valueOf(i2);
                        }
                        C1442120ndC c1442120ndC = new C1442120ndC(contextLIZJ, strLJJJI, c1440500naa, c0fig, id);
                        if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel) && (stickerInfoNewEngine = singleImageData2.getStickerInfoNewEngine()) != null && (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) != null && !textStickerModels.isEmpty()) {
                            c1442120ndC.LIZ(textStickerModels);
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        } else if (C1466090oFr.LJIIL(videoPublishEditModel.creativeModel.stickerModel)) {
            LIZJ();
            new Pair(Integer.valueOf(videoPublishEditModel.getVideoCanvasWidth()), Integer.valueOf(videoPublishEditModel.getVideoCanvasHeight()));
            C287070BMz.LIZ();
            C1440500naa c1440500naa2 = new C1440500naa(new C1432110nN3(), new AwS584S0100000_5(videoPublishEditModel, 954));
            String strLJJJI2 = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJI(videoPublishEditModel.getCreativeInfo(), "");
            Context contextLIZJ2 = LIZJ();
            C786410Ut5.M3(C0CHQ.LIZ);
            C1442120ndC c1442120ndC2 = new C1442120ndC(contextLIZJ2, strLJJJI2, c1440500naa2, new C0FIG(), "");
            LIZ.getClass();
            if ((!C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel) || LIZ(videoPublishEditModel)) && videoPublishEditModel.hasTextSticker()) {
                List<TextStickerModel> list2 = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
                ArrayList arrayList = new ArrayList();
                for (TextStickerModel textStickerModel : list2) {
                    if (textStickerModel.needCompile()) {
                        LIZ.getClass();
                        if (!((Boolean) C287000BMs.LIZ.getValue()).booleanValue() || (!C0F8Y.LJIIJ(r3))) {
                            arrayList.add(textStickerModel);
                        }
                    }
                }
                c1442120ndC2.LIZ(arrayList);
            }
            List<StickerModel> listLJFF = C1466090oFr.LJFF(videoPublishEditModel.creativeModel.stickerModel);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (ArrayList) listLJFF) {
                if (((StickerModel) obj).getStickerType() != EnumC1466150oFx.TEXT) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((StickerModel) obj2).needCompile()) {
                    arrayList3.add(obj2);
                }
            }
            c1442120ndC2.LIZ(arrayList3);
            c1442120ndC2.LIZ(videoPublishEditModel.creativeModel.stickerModel.commentStickerModels);
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && C1428470nHB.LLIIIL(videoPublishEditModel)) {
            return;
        }
        if (C1428470nHB.LJLIIL(videoPublishEditModel)) {
            if ((imageAlbumData == null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) == null) || (imageList = imageAlbumData.getImageList()) == null) {
                return;
            }
            C1440490naZ c1440490naZ = new C1440490naZ(LIZJ(), videoPublishEditModel, C1450870nrJ.LIZIZ, C1450870nrJ.LIZ);
            ArrayList arrayList4 = new ArrayList();
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getStickerInfo().getStickers(), arrayList4);
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : arrayList4) {
                if (((StickerItemModel) obj3).isTextSticker()) {
                    arrayList5.add(obj3);
                }
            }
            for (Object obj4 : arrayList5) {
                int i4 = i + 1;
                if (i >= 0) {
                    StickerItemModel stickerItemModel = (StickerItemModel) obj4;
                    String strValueOf = String.valueOf(i);
                    Pair pair = new Pair(Integer.valueOf(c1440490naZ.LIZJ), Integer.valueOf(c1440490naZ.LIZLLL));
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    int iIntValue2 = ((Number) pair.getSecond()).intValue();
                    TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C123O.LIZ(), stickerItemModel.extra, TextStickerData.class);
                    C196925122x c196925122x = new C196925122x(c1440490naZ.LIZ, null, textStickerData, false, null, Boolean.FALSE);
                    c196925122x.LJIIZILJ(textStickerData);
                    VideoPublishEditModel videoPublishEditModel2 = c1440490naZ.LIZIZ;
                    EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.TEXT_STICKER;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strValueOf);
                    sbLIZ.append(".png");
                    C0VSJ c0vsjLIZJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(videoPublishEditModel2.getCreativeInfo(), enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), true);
                    c0vsjLIZJ.createNewFile();
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.setDensity(C2219091BtD.LIZ().getResources().getDisplayMetrics().densityDpi);
                        if (c196925122x.getDrawingCacheBackgroundColor() != 0) {
                            bitmapCreateBitmap.eraseColor(c196925122x.getDrawingCacheBackgroundColor());
                        }
                        C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), c196925122x);
                    } catch (OutOfMemoryError e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2219091BtD.LIZLLL().LIZIZ(e);
                        bitmapCreateBitmap = null;
                    }
                    if (C2475009mu.LJFF(100, Bitmap.CompressFormat.PNG, bitmapCreateBitmap, c0vsjLIZJ)) {
                        path = c0vsjLIZJ.getPath();
                    } else {
                        C2475009mu.LJ(bitmapCreateBitmap);
                        path = null;
                    }
                    stickerItemModel.path = path;
                    i = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        if (!LIZ(videoPublishEditModel) || (infoStickerModel = videoPublishEditModel.getInfoStickerModel()) == null || (list = infoStickerModel.stickers) == null || !(!list.isEmpty())) {
            return;
        }
        SafeHandler safeHandler = C1440510nab.LIZ;
        ArrayList arrayList6 = new ArrayList();
        for (StickerItemModel stickerItemModel2 : list) {
            if (stickerItemModel2.isTextSticker()) {
                if (C123100dR.LIZ(stickerItemModel2.path)) {
                    TextStickerData textStickerData2 = (TextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel2.extra, TextStickerData.class);
                    if (textStickerData2.getCanvasWidth() != 0 && textStickerData2.getCanvasHeight() != 0 && textStickerData2.getVideoWidth() != 0 && textStickerData2.getVideoHeight() != 0) {
                        c15o7LJIIJ = C15O7.LIZIZ(new ACallableS427S0100000_22(textStickerData2, 14), C15O7.LJIIIIZZ, null).LJIIZILJ(new C1466860oH6(stickerItemModel2, textStickerData2, 12), C15O7.LJI);
                    } else {
                        c15o7LJIIJ = C15O7.LJIIJ(new C1432100nN2());
                    }
                    arrayList6.add(c15o7LJIIJ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("StickerCompileManager sticker path is empty id: ");
                    sbLIZ2.append(stickerItemModel2.stickerId);
                    sbLIZ2.append(", text: ");
                    sbLIZ2.append(stickerItemModel2.getText());
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        try {
            C15O7.LJJ(arrayList6).LJIJJLI();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("compile sticker e: ");
            sbLIZ3.append(e2.getMessage());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }
}
