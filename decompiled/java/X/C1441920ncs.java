package X;

import android.graphics.BitmapFactory;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ncs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441920ncs {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(InfoStickerModel infoStickerModel, InterfaceC1452170ntP interfaceC1452170ntP) {
        C348100Dkm c348100DkmLIZIZ;
        List<StickerItemModel> list;
        String str;
        String strLIZIZ;
        ArrayList arrayList = new ArrayList();
        if (interfaceC1452170ntP != null) {
            c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
        } else {
            c348100DkmLIZIZ = null;
        }
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && !list.isEmpty() && interfaceC1452170ntP != null && C1452440ntq.LIZ(interfaceC1452170ntP) && c348100DkmLIZIZ != null) {
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                if (!C1440480naY.LIZ() || !stickerItemModel.isTextSticker()) {
                    if (stickerItemModel.isImageStickerLayer && (str = stickerItemModel.path) != null) {
                        if (C2354709Kn.LIZIZ(str)) {
                            strLIZIZ = stickerItemModel.path;
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(infoStickerModel.infoStickerDraftDir);
                            sbLIZ.append(File.separator);
                            sbLIZ.append(new C0VSJ(stickerItemModel.path).getName());
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        if (!C2354709Kn.LIZIZ(strLIZIZ)) {
                            C365090ETb.LIZIZ();
                            C1632480saE c1632480saE = C1632480saE.LIZIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("infoSticker not exist ");
                            sbLIZ2.append(stickerItemModel);
                            C201955140j.LJIIJ(c1632480saE, "addInteractStickers error", new Exception(C2188811AlT.LIZIZ(sbLIZ2)));
                        } else {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(strLIZIZ, options);
                            float f = (options.outHeight * 1.0f) / options.outWidth;
                            C348450DlL c348450DlL = new C348450DlL(false, 15);
                            c348450DlL.LJIIL = strLIZIZ;
                            float f2 = stickerItemModel.w;
                            c348450DlL.LJIILIIL = f2;
                            c348450DlL.LJIILJJIL = f2 * f * c348100DkmLIZIZ.LIZ.getModel().getCanvasRatio();
                            c348450DlL.LJFF = stickerItemModel.currentOffsetX;
                            c348450DlL.LJI = stickerItemModel.currentOffsetY;
                            c348450DlL.LJIIJ = stickerItemModel.scale;
                            c348450DlL.LJII = stickerItemModel.rotateAngle;
                            c348450DlL.LIZLLL = stickerItemModel.startTime;
                            c348450DlL.LJ = stickerItemModel.endTime;
                            c348450DlL.LIZJ = stickerItemModel.layerWeight;
                            c348100DkmLIZIZ.LJIIIZ().LJJJJI(c348450DlL);
                            String str2 = c348450DlL.LIZIZ;
                            if (str2 != null) {
                                arrayList.add(str2);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static List LIZIZ(InfoStickerModel infoStickerModel, InterfaceC1452170ntP interfaceC1452170ntP) {
        List<StickerItemModel> list;
        String strLIZIZ;
        float f;
        int i;
        ArrayList arrayList = new ArrayList();
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && !list.isEmpty() && C1452440ntq.LIZ(interfaceC1452170ntP)) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null) {
                for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                    if (!C1452440ntq.LIZ(interfaceC1452170ntP)) {
                        break;
                    }
                    if (stickerItemModel == null) {
                        C365090ETb.LIZIZ();
                    } else if (!stickerItemModel.isSubtitle() && !stickerItemModel.isSubtitleRule()) {
                        if (C2354709Kn.LIZIZ(stickerItemModel.path)) {
                            strLIZIZ = stickerItemModel.path;
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(infoStickerModel.infoStickerDraftDir);
                            sbLIZ.append(new C0VSJ(stickerItemModel.path).getName());
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        if (!C2354709Kn.LIZIZ(strLIZIZ)) {
                            C365090ETb.LIZIZ();
                        } else if (stickerItemModel.isImageStickerLayer) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(strLIZIZ, options);
                            int i2 = options.outHeight;
                            if (i2 > 0 && (i = options.outWidth) > 0) {
                                f = (i2 * 1.0f) / i;
                            } else {
                                f = 1.7777778f;
                            }
                            C348450DlL c348450DlL = new C348450DlL(false, 15);
                            c348450DlL.LJIIL = strLIZIZ;
                            float f2 = stickerItemModel.w;
                            c348450DlL.LJIILIIL = f2;
                            c348450DlL.LJIILJJIL = f2 * f * c348100DkmLIZIZ.LIZ.getModel().getCanvasRatio();
                            c348450DlL.LJFF = stickerItemModel.currentOffsetX;
                            c348450DlL.LJI = stickerItemModel.currentOffsetY;
                            c348450DlL.LJIIJ = stickerItemModel.scale;
                            c348450DlL.LJII = -stickerItemModel.rotateAngle;
                            c348450DlL.LIZLLL = stickerItemModel.startTime;
                            c348450DlL.LJ = stickerItemModel.endTime;
                            c348450DlL.LIZJ = stickerItemModel.layerWeight;
                            c348100DkmLIZIZ.LJIIIZ().LJJJJI(c348450DlL);
                            String str = c348450DlL.LIZIZ;
                            if (str != null) {
                                arrayList.add(str);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return arrayList;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return arrayList;
    }
}
