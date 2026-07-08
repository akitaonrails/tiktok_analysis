package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539530LDz {
    public static final List<String> LIZ(AnchorCommonStruct anchorCommonStruct) {
        String extra;
        List<String> listLJ;
        List<String> list = null;
        try {
            new p();
            if (anchorCommonStruct == null) {
                extra = null;
            } else {
                extra = anchorCommonStruct.getExtra();
            }
            String strLJIL = p.LIZJ(extra).LJIILIIL().LJJIIZ("nle_summary").LJIL();
            new p();
            k kVarLJJIIZ = p.LIZJ(strLJIL).LJIILIIL().LJJIIZ("features");
            kVarLJJIIZ.getClass();
            if (kVarLJJIIZ instanceof h) {
                listLJ = (List) C08JS.LIZIZ().LIZLLL(kVarLJJIIZ, new TypeToken<List<? extends String>>() { // from class: X.0L2t
                }.getType());
            } else {
                listLJ = C08JS.LJ(String[].class, kVarLJJIIZ.LJIL());
            }
            list = listLJ;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public static final List<TemplateSlot> LIZIZ(ArrayList<TemplateSlot> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (TemplateSlot templateSlot : arrayList) {
            TemplateSlot templateSlot2 = templateSlot;
            if (Intrinsics.LJFF(templateSlot2.getType(), "audio") && NLEEditorJniJNI.NLEMusicResourceProtocol_isMusicResource(templateSlot2.getSource())) {
                arrayList2.add(templateSlot);
            }
        }
        return arrayList2;
    }

    public static final ArrayList<Integer> LIZJ(List<TemplateSlot> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<TemplateSlot> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf((float) it2.next().getDuration()));
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf((int) (((Number) it3.next()).floatValue() * LSPassThroughRecordSizeConfig.DEFAULT)));
        }
        return arrayList2;
    }

    public static final String LIZLLL(AnchorCommonStruct anchorCommonStruct) {
        String extra;
        try {
            new p();
            if (anchorCommonStruct == null) {
                extra = null;
            } else {
                extra = anchorCommonStruct.getExtra();
            }
            String strLJIL = p.LIZJ(extra).LJIILIIL().LJJIIZ("nle_summary").LJIL();
            if (strLJIL == null) {
                return "";
            }
            return strLJIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return "";
        }
    }

    public static final ArrayList<TemplateSlot> LJ(ArrayList<TemplateSlot> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (TemplateSlot templateSlot : arrayList) {
            if (Intrinsics.LJFF(templateSlot.getType(), "video")) {
                arrayList2.add(templateSlot);
            }
        }
        ArrayList<TemplateSlot> arrayListLIZ = C09HN.LIZ(arrayList2);
        if (arrayListLIZ == null) {
            return new ArrayList<>();
        }
        return arrayListLIZ;
    }

    public static final ArrayList<TemplateSlot> LJFF(AnchorCommonStruct anchorCommonStruct) {
        String extra;
        ArrayList<TemplateSlot> arrayListLIZ = null;
        try {
            new p();
            if (anchorCommonStruct == null) {
                extra = null;
            } else {
                extra = anchorCommonStruct.getExtra();
            }
            String strLJIL = p.LIZJ(extra).LJIILIIL().LJJIIZ("nle_summary").LJIL();
            new p();
            arrayListLIZ = C09HN.LIZ(C08JS.LJ(TemplateSlot[].class, p.LIZJ(strLJIL).LJIILIIL().LJJIIZ("slots").LJIL()));
            return arrayListLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return arrayListLIZ;
        }
    }

    public static final String LJI(AnchorCommonStruct anchorCommonStruct) {
        String extra;
        String strLJIL = null;
        try {
            new p();
            if (anchorCommonStruct == null) {
                extra = null;
            } else {
                extra = anchorCommonStruct.getExtra();
            }
            strLJIL = p.LIZJ(extra).LJIILIIL().LJJIIZ("tags").LJIL();
            return strLJIL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJIL;
        }
    }
}
