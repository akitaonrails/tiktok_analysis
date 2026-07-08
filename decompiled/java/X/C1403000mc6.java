package X;

import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403000mc6 {
    public static final int LIZJ(InfoStickerModel infoStickerModel) {
        int i = 0;
        if (infoStickerModel == null) {
            return 0;
        }
        List<StickerItemModel> list = infoStickerModel.stickers;
        if (list != null) {
            Iterator<StickerItemModel> it2 = list.iterator();
            while (it2.hasNext()) {
                int i2 = it2.next().type;
                if (i2 != 8 && i2 != 4 && i2 != 7 && i2 != 9 && i2 != 2) {
                    i++;
                }
            }
        }
        return i;
    }

    public static final String LJ(InfoStickerModel infoStickerModel, int i) {
        int i2;
        if (infoStickerModel == null || i < 0) {
            return null;
        }
        List<StickerItemModel> list = infoStickerModel.stickers;
        ArrayList arrayList = new ArrayList();
        Iterator<StickerItemModel> it2 = list.iterator();
        while (true) {
            i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            StickerItemModel next = it2.next();
            if (next.type == 2) {
                arrayList.add(next);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        String strLIZIZ = "";
        if (arrayList != null) {
            int size = arrayList.size();
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    StickerItemModel stickerItemModel = (StickerItemModel) obj;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(LIZ(stickerItemModel.startTime, stickerItemModel.endTime, i));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (i2 < size - 1) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(',');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return strLIZIZ;
    }

    public static final String LIZ(int i, int i2, int i3) {
        if (i >= 0 && i2 > 0 && i2 <= i3) {
            return C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Float.valueOf((i2 - i) / 1000.0f)}, 1));
        }
        return C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(i3 / 1000.0f)}, 1));
    }

    public static final String LIZIZ(InfoStickerModel infoStickerModel, int i, List<Integer> list) {
        if (infoStickerModel == null || i < 0) {
            return null;
        }
        List<StickerItemModel> list2 = infoStickerModel.stickers;
        ArrayList arrayList = new ArrayList();
        for (StickerItemModel stickerItemModel : list2) {
            if (!list.contains(Integer.valueOf(stickerItemModel.type))) {
                arrayList.add(stickerItemModel);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        String strLIZIZ = "";
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    StickerItemModel stickerItemModel2 = (StickerItemModel) obj;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(LIZ(stickerItemModel2.startTime, stickerItemModel2.endTime, i));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (i2 < size - 1) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(',');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return strLIZIZ;
    }

    public static final String LIZLLL(StickerNewEngineModel stickerNewEngineModel, EnumC1466150oFx enumC1466150oFx, int i) {
        int i2;
        if (i < 0) {
            return null;
        }
        List<StickerModel> listLJFF = C1466090oFr.LJFF(stickerNewEngineModel);
        ArrayList arrayList = new ArrayList();
        Iterator<StickerModel> it2 = listLJFF.iterator();
        while (true) {
            i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            StickerModel next = it2.next();
            if (next.getStickerType() == enumC1466150oFx) {
                arrayList.add(next);
            }
        }
        String strLIZIZ = "";
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                StickerModel stickerModel = (StickerModel) obj;
                if (!(stickerModel instanceof AICaptionTagStickerModel)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(LIZ((int) stickerModel.getBaseModel().getStartTime(), (int) stickerModel.getBaseModel().getEndTime(), i));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (i2 < arrayList.size() - 1) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(',');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return strLIZIZ;
    }
}
