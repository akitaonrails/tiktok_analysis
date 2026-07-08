package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitSheetAssem;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import java.util.List;

/* JADX INFO: renamed from: X.0gkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177650gkd extends AbstractC1177930gl5 {
    public final /* synthetic */ PoiRevisitSheetAssem LIZ;

    @Override // X.AbstractC1177930gl5
    public final void LIZJ(View view, float f) {
    }

    public C1177650gkd(PoiRevisitSheetAssem poiRevisitSheetAssem) {
        this.LIZ = poiRevisitSheetAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1177930gl5
    public final void LIZLLL(int i, View view) {
        IPoiRevisitNavAssemAbility iPoiRevisitNavAssemAbility;
        String str;
        List<PoiRevisitApi.PoiRevisitCardModel> list;
        PoiRevisitApi.PoiRevisitCardModel poiRevisitCardModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRevisitSheetAssem Sheet Behavior onStateChanged newState=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZ.Go().LLJ;
        String str2 = null;
        if (interfaceC665370Q7z != null) {
            iPoiRevisitNavAssemAbility = (IPoiRevisitNavAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiRevisitNavAssemAbility.class, null);
        } else {
            iPoiRevisitNavAssemAbility = null;
        }
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        PoiRevisitSheetAssem poiRevisitSheetAssem = this.LIZ;
                        if (poiRevisitSheetAssem.LLJILJILJ && poiRevisitSheetAssem.LLJILLL != 5) {
                            C1177570gkV c1177570gkV = C1177570gkV.LIZ;
                            Fragment fragmentLJI = C724240Sb0.LJI(poiRevisitSheetAssem);
                            c1177570gkV.getClass();
                            C1177570gkV.LJII(fragmentLJI, "bottom", C1177570gkV.LIZ(iPoiRevisitNavAssemAbility));
                        }
                        PoiRevisitSheetAssem poiRevisitSheetAssem2 = this.LIZ;
                        poiRevisitSheetAssem2.LLJILJILJ = false;
                        C1177630gkb c1177630gkb = (C1177630gkb) poiRevisitSheetAssem2.Go().LLJIJIL.getValue();
                        if (c1177630gkb != null) {
                            str = c1177630gkb.LIZ;
                        } else {
                            str = null;
                        }
                        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = this.LIZ.Go().wQ2(true, true, true);
                        if (poiRevisitCardListResponseWQ2 != null && (list = poiRevisitCardListResponseWQ2.poiCardList) != null && (poiRevisitCardModel = (PoiRevisitApi.PoiRevisitCardModel) C13LP.LJJJJZI(list)) != null) {
                            str2 = poiRevisitCardModel.poiId;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("PoiRevisitSheetAssem Sheet Behavior onStateChanged HIDDEN, targetPoiId=");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", firstPoiId=");
                        sbLIZ2.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (str == null) {
                            PoiRevisitViewModel.zQ2(this.LIZ.Go(), str2);
                        }
                        this.LIZ.LLJILLL = 5;
                        return;
                    }
                    return;
                }
                PoiRevisitSheetAssem poiRevisitSheetAssem3 = this.LIZ;
                if (poiRevisitSheetAssem3.LLJILJILJ && poiRevisitSheetAssem3.LLJILLL != 4) {
                    C1177570gkV c1177570gkV2 = C1177570gkV.LIZ;
                    Fragment fragmentLJI2 = C724240Sb0.LJI(poiRevisitSheetAssem3);
                    c1177570gkV2.getClass();
                    C1177570gkV.LJII(fragmentLJI2, "not_full", C1177570gkV.LIZ(iPoiRevisitNavAssemAbility));
                }
                PoiRevisitSheetAssem poiRevisitSheetAssem4 = this.LIZ;
                poiRevisitSheetAssem4.LLJILJILJ = false;
                poiRevisitSheetAssem4.LLJILLL = 4;
                return;
            }
            PoiRevisitSheetAssem poiRevisitSheetAssem5 = this.LIZ;
            if (poiRevisitSheetAssem5.LLJILJILJ && poiRevisitSheetAssem5.LLJILLL != 3) {
                C1177570gkV c1177570gkV3 = C1177570gkV.LIZ;
                Fragment fragmentLJI3 = C724240Sb0.LJI(poiRevisitSheetAssem5);
                c1177570gkV3.getClass();
                C1177570gkV.LJII(fragmentLJI3, "full", C1177570gkV.LIZ(iPoiRevisitNavAssemAbility));
            }
            PoiRevisitSheetAssem poiRevisitSheetAssem6 = this.LIZ;
            poiRevisitSheetAssem6.LLJILJILJ = false;
            poiRevisitSheetAssem6.LLJILLL = 3;
            return;
        }
        this.LIZ.LLJILJILJ = true;
    }
}
