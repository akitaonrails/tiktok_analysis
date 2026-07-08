package X;

import Y.AComparatorS27S0000000_8;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416110mxF {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<AutoCutMediaModel> LIZ(List<AutoCutMediaModel> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (AutoCutMediaModel autoCutMediaModel : list) {
                autoCutMediaModel.getClass();
                arrayList.add(new AutoCutMediaModel(autoCutMediaModel.filePath, autoCutMediaModel.fileUriPath, autoCutMediaModel.oriFilePath, autoCutMediaModel.width, autoCutMediaModel.height, autoCutMediaModel.isVideoType, autoCutMediaModel.duration, autoCutMediaModel.cutStartTime, autoCutMediaModel.cutDuration, autoCutMediaModel.speed, autoCutMediaModel.isLiveHighlight, null, 0 == true ? 1 : 0, 6144, 0 == true ? 1 : 0));
            }
        }
        return C13LP.LLIIII(arrayList);
    }

    public static final int LIZIZ(AutoCutModel autoCutModel) {
        return C1403130mcJ.LIZIZ(LJ(autoCutModel), autoCutModel.curIndexFromSource, LJIIJJI(autoCutModel.curSource));
    }

    public static final AutoCutThemeData LIZJ(AutoCutModel autoCutModel) {
        C0MJ9 c0mj9LJIIJJI = LJIIJJI(autoCutModel.curSource);
        if (c0mj9LJIIJJI == null) {
            return null;
        }
        return LJFF(autoCutModel.curIndexFromSource, autoCutModel, c0mj9LJIIJJI);
    }

    public static final AutoCutThemeData LIZLLL(AutoCutModel autoCutModel) {
        AutoCutThemeData next;
        Iterator<AutoCutThemeData> it2 = autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.isPreset) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static final List<AutoCutThemeData> LJ(AutoCutModel autoCutModel) {
        ArrayList arrayList = new ArrayList();
        List<AutoCutThemeData> list = autoCutModel.templateList;
        ArrayList arrayList2 = new ArrayList();
        for (AutoCutThemeData autoCutThemeData : list) {
            AutoCutThemeData autoCutThemeData2 = autoCutThemeData;
            C0MJ9 c0mj9LIZIZ = autoCutThemeData2.LIZIZ();
            if (c0mj9LIZIZ != null && !Collections.singletonList(C0MJ9.AUTO_CUT).contains(c0mj9LIZIZ) && autoCutThemeData2.LIZIZ() != C0MJ9.PLACE_HOLDER) {
                arrayList2.add(autoCutThemeData);
            }
        }
        arrayList.addAll(arrayList2);
        List<AutoCutThemeData> list2 = autoCutModel.templateList;
        ArrayList arrayList3 = new ArrayList();
        for (AutoCutThemeData autoCutThemeData3 : list2) {
            AutoCutThemeData autoCutThemeData4 = autoCutThemeData3;
            if (autoCutThemeData4.LIZIZ() == C0MJ9.AUTO_CUT || autoCutThemeData4.LIZIZ() == C0MJ9.PLACE_HOLDER) {
                if (autoCutThemeData4.indexFromSource >= 0) {
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!(!LJII((AutoCutThemeData) it2.next(), autoCutThemeData4))) {
                                break;
                            }
                        }
                    }
                    arrayList3.add(autoCutThemeData3);
                }
            }
        }
        arrayList.addAll(C13LP.LJLLLL(new AComparatorS27S0000000_8(12), arrayList3));
        return arrayList;
    }

    public static final C0MJ9 LJIIJJI(int i) {
        if (i >= 0 && i < C0MJ9.values().length) {
            return C0MJ9.values()[i];
        }
        return null;
    }

    public static final boolean LJI(List<AutoCutMediaModel> list, List<AutoCutMediaModel> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        boolean z = true;
        int i = 0;
        for (AutoCutMediaModel autoCutMediaModel : list) {
            int i2 = i + 1;
            if (i >= 0) {
                AutoCutMediaModel autoCutMediaModel2 = autoCutMediaModel;
                if (z && (Intrinsics.LJFF(autoCutMediaModel2.filePath, ((AutoCutMediaModel) ListProtector.get(list2, i)).filePath) || Intrinsics.LJFF(autoCutMediaModel2.oriFilePath, ((AutoCutMediaModel) ListProtector.get(list2, i)).oriFilePath))) {
                    z = true;
                } else {
                    z = false;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return z;
    }

    public static final boolean LJII(AutoCutThemeData autoCutThemeData, AutoCutThemeData autoCutThemeData2) {
        int i;
        if (autoCutThemeData2 == null || (i = autoCutThemeData.templateType) != autoCutThemeData2.templateType) {
            return false;
        }
        if (C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1412640mre.CUT_SAME.getValue()), Integer.valueOf(EnumC1412640mre.PUGC_TEMPLATE.getValue()), Integer.valueOf(EnumC1412640mre.AIGT.getValue()), Integer.valueOf(EnumC1412640mre.SGT.getValue())).contains(Integer.valueOf(i))) {
            return Intrinsics.LJFF(autoCutThemeData.templateId, autoCutThemeData2.templateId);
        }
        if (i == EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue()) {
            return Intrinsics.LJFF(autoCutThemeData.templateId, autoCutThemeData2.templateId);
        }
        return Intrinsics.LJFF(autoCutThemeData.musicId, autoCutThemeData2.musicId);
    }

    public static final AutoCutThemeData LJFF(int i, AutoCutModel autoCutModel, C0MJ9 c0mj9) {
        AutoCutThemeData next;
        Iterator<AutoCutThemeData> it2 = autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AutoCutThemeData autoCutThemeData = next;
                if (autoCutThemeData.LIZIZ() == c0mj9 && autoCutThemeData.indexFromSource == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static final void LJIIIIZZ(AutoCutModel autoCutModel, int i, AutoCutThemeData autoCutThemeData) {
        int iOrdinal;
        autoCutModel.curIndexFromSource = i;
        autoCutModel.lastIndexFromSourceWhenChangeMusic = i;
        C0MJ9 c0mj9LIZIZ = autoCutThemeData.LIZIZ();
        if (c0mj9LIZIZ != null) {
            iOrdinal = c0mj9LIZIZ.ordinal();
        } else {
            iOrdinal = -1;
        }
        autoCutModel.curSource = iOrdinal;
        autoCutModel.curTemplateType = autoCutThemeData.templateType;
        autoCutModel.curTemplateId = autoCutThemeData.templateId;
        autoCutModel.curTemplateGroupId = autoCutThemeData.templateGroupId;
        autoCutModel.curTemplateTag = autoCutThemeData.templateTag;
        autoCutModel.curSceneType = autoCutThemeData.sceneType;
        autoCutModel.curGenerateType = -1;
    }

    public static final void LJIIIZ(AutoCutModel autoCutModel, int i, C0MJ9 c0mj9, int i2, String str, String str2, String str3, int i3, String str4) {
        int iOrdinal;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCurTheme: indexFromSource = ");
        sbLIZ.append(i);
        sbLIZ.append(", source = ");
        sbLIZ.append(c0mj9);
        sbLIZ.append(", templateType = ");
        sbLIZ.append(i2);
        sbLIZ.append(", templateId = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        autoCutModel.curIndexFromSource = i;
        autoCutModel.lastIndexFromSourceWhenChangeMusic = i;
        if (c0mj9 != null) {
            iOrdinal = c0mj9.ordinal();
        } else {
            iOrdinal = -1;
        }
        autoCutModel.curSource = iOrdinal;
        autoCutModel.curTemplateType = i2;
        autoCutModel.curTemplateId = str;
        autoCutModel.curTemplateGroupId = str2;
        autoCutModel.curTemplateTag = str3;
        autoCutModel.curSceneType = str4;
        autoCutModel.curGenerateType = i3;
        autoCutModel.isNone = false;
    }
}
