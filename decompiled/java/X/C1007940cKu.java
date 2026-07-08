package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS132S1200000_16;

/* JADX INFO: renamed from: X.0cKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007940cKu {
    public static final void LIZJ(C1007900cKq c1007900cKq, AbstractC1008090cL9 abstractC1008090cL9) {
        Map<String, AnoleComponentRelationModel> map = c1007900cKq.LIZLLL.componentRelations;
        if (map != null) {
            for (Map.Entry<String, AnoleComponentRelationModel> entry : map.entrySet()) {
                String key = entry.getKey();
                AnoleComponentRelationModel value = entry.getValue();
                InterfaceC1007930cKt interfaceC1007930cKt = c1007900cKq.LJII.get(key);
                if (interfaceC1007930cKt != null && interfaceC1007930cKt.Ek()) {
                    LIZLLL(c1007900cKq, key, abstractC1008090cL9, value);
                } else {
                    C0C3J c0c3j = C0C3J.LIZ;
                    AwS132S1200000_16 awS132S1200000_16 = new AwS132S1200000_16(c1007900cKq, key, abstractC1008090cL9, 8);
                    c0c3j.getClass();
                    if (((Boolean) C0C3J.LIZIZ.getValue()).booleanValue()) {
                        awS132S1200000_16.invoke();
                    }
                }
            }
        }
    }

    public static final boolean LIZ(C1007900cKq c1007900cKq, String str, AnoleComponentAppearModel anoleComponentAppearModel) {
        InterfaceC1007930cKt interfaceC1007930cKt = c1007900cKq.LJII.get(str);
        if (interfaceC1007930cKt == null) {
            return false;
        }
        if (interfaceC1007930cKt.Gk(anoleComponentAppearModel)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" hide failed because isReachedMaxHideCount");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        return true;
    }

    public static final void LJI(C1007900cKq c1007900cKq, String str, AnoleComponentAppearModel anoleComponentAppearModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type:");
        sbLIZ.append(str);
        sbLIZ.append(" showComponent before");
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1007930cKt interfaceC1007930cKt = c1007900cKq.LJII.get(str);
        if (interfaceC1007930cKt != null) {
            C1008020cL2.LIZ(c1007900cKq, C1004000cEY.LIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("type:");
            sbLIZ2.append(str);
            sbLIZ2.append(" showComponent after");
            C2188811AlT.LIZIZ(sbLIZ2);
            interfaceC1007930cKt.Nk(anoleComponentAppearModel);
        }
    }

    public static final C1008460cLk LIZIZ(C1007900cKq c1007900cKq, String str, AnoleComponentAppearModel anoleComponentAppearModel, AnoleComponentRelationModel anoleComponentRelationModel) {
        C1008540cLs c1008540cLs = EnumC1008530cLr.Companion;
        int i = c1007900cKq.LJIIJ;
        c1008540cLs.getClass();
        if (!C1008540cLs.LIZ(anoleComponentAppearModel, i)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" show failed because is not meet appear phase");
            C2188811AlT.LIZIZ(sbLIZ);
            return new C1008460cLk(false, EnumC1007990cKz.ANOLE_NOT_IN_APPEARPHASE);
        }
        InterfaceC1007930cKt interfaceC1007930cKt = c1007900cKq.LJII.get(str);
        if (interfaceC1007930cKt == null) {
            return new C1008460cLk(false, EnumC1007990cKz.ANOLE_COMPONENT_NULL);
        }
        if (interfaceC1007930cKt.Kk(anoleComponentAppearModel)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" show failed because isReachedMaxShowCount");
            C2188811AlT.LIZIZ(sbLIZ2);
            return new C1008460cLk(false, EnumC1007990cKz.ANOLE_REACHED_MAX_SHOW_COUNT);
        }
        if (interfaceC1007930cKt.Bk(anoleComponentAppearModel)) {
            interfaceC1007930cKt.Lk();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(" show failed because isWithinSkipCount");
            C2188811AlT.LIZIZ(sbLIZ3);
            return new C1008460cLk(false, EnumC1007990cKz.ANOLE_WITHIN_SKIP_COUNT);
        }
        if (!interfaceC1007930cKt.Ak().skipPreBusinessCheck && !c1007900cKq.LJ.h3(interfaceC1007930cKt.Ak().slotID, interfaceC1007930cKt, anoleComponentAppearModel)) {
            interfaceC1007930cKt.Ik(EnumC586190Myv.BUSINESS_BLOCK);
            return new C1008460cLk(false, EnumC1007990cKz.ANOLE_UPTO_BUSINESS);
        }
        List<String> list = anoleComponentRelationModel.dependencies;
        if (list != null) {
            List listLJLIIIL = C13LP.LJLIIIL(str, list);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) listLJLIIIL).iterator();
            while (it2.hasNext()) {
                InterfaceC1007930cKt interfaceC1007930cKt2 = c1007900cKq.LJII.get(it2.next());
                if (interfaceC1007930cKt2 != null) {
                    arrayList.add(interfaceC1007930cKt2);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (!((InterfaceC1007930cKt) it3.next()).isReady().LIZ) {
                        interfaceC1007930cKt.Ik(EnumC586190Myv.DEPENDENCIES_NOT_READY);
                        return new C1008460cLk(false, EnumC1007990cKz.ANOLE_DEPENDENCY_NOT_READY);
                    }
                }
            }
        }
        return new C1008460cLk(true, null);
    }

    public static final void LIZLLL(C1007900cKq c1007900cKq, String str, AbstractC1008090cL9 abstractC1008090cL9, AnoleComponentRelationModel anoleComponentRelationModel) {
        LJFF(c1007900cKq, str, abstractC1008090cL9, anoleComponentRelationModel);
        LJ(c1007900cKq, str, abstractC1008090cL9, anoleComponentRelationModel);
    }

    public static final void LJ(C1007900cKq c1007900cKq, String str, AbstractC1008090cL9 abstractC1008090cL9, AnoleComponentRelationModel anoleComponentRelationModel) {
        List<AnoleComponentAppearModel> list = anoleComponentRelationModel.hideModels;
        if (list != null) {
            for (AnoleComponentAppearModel anoleComponentAppearModel : list) {
                if (!abstractC1008090cL9.LIZJ(anoleComponentAppearModel)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("type:");
                    sbLIZ.append(str);
                    sbLIZ.append(" shouldAppearComponent not hide type = ");
                    sbLIZ.append(anoleComponentAppearModel.type);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else if (!LIZ(c1007900cKq, str, anoleComponentAppearModel)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("type:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" checkHideComponentPreconditions = false");
                    C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    InterfaceC1007930cKt interfaceC1007930cKt = c1007900cKq.LJII.get(str);
                    if (interfaceC1007930cKt != null) {
                        interfaceC1007930cKt.Dk(anoleComponentAppearModel);
                    }
                }
            }
        }
    }

    public static final void LJFF(C1007900cKq c1007900cKq, String str, AbstractC1008090cL9 abstractC1008090cL9, AnoleComponentRelationModel anoleComponentRelationModel) {
        List<AnoleComponentAppearModel> list = anoleComponentRelationModel.showModels;
        if (list != null) {
            for (AnoleComponentAppearModel anoleComponentAppearModel : list) {
                if (!abstractC1008090cL9.LIZJ(anoleComponentAppearModel)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("type:");
                    sbLIZ.append(str);
                    sbLIZ.append(" shouldAppearComponent not show type = ");
                    sbLIZ.append(anoleComponentAppearModel.type);
                    sbLIZ.append(" appearTime = ");
                    sbLIZ.append(abstractC1008090cL9.LIZ());
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    C1008460cLk c1008460cLkLIZIZ = LIZIZ(c1007900cKq, str, anoleComponentAppearModel, anoleComponentRelationModel);
                    if (!c1008460cLkLIZIZ.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("type:");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" checkShowComponentPreconditions = false");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        InterfaceC1007910cKr interfaceC1007910cKr = c1007900cKq.LJ;
                        EnumC1007990cKz enumC1007990cKz = c1008460cLkLIZIZ.LIZIZ;
                        if (enumC1007990cKz == null) {
                            enumC1007990cKz = EnumC1007990cKz.ANOLE_UNKNOWN;
                        }
                        interfaceC1007910cKr.LIZIZ(new C991880bv0(str, enumC1007990cKz), c1007900cKq.LJII.get(str));
                    } else {
                        LJI(c1007900cKq, str, anoleComponentAppearModel);
                    }
                }
            }
        }
    }
}
