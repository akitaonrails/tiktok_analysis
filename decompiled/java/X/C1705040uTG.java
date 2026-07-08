package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0uTG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705040uTG implements InterfaceC1705380uTo<List<? extends Effect>> {
    public final /* synthetic */ InterfaceC1364105Vn<List<String>> LIZ;

    public C1705040uTG(C23260099m c23260099m) {
        this.LIZ = c23260099m;
    }

    @Override // X.InterfaceC1705380uTo
    public final void LIZ(Integer num, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchTrackingTypeList errorCode:");
        sbLIZ.append(num);
        sbLIZ.append(" errorMsg:");
        sbLIZ.append(str);
        C1706630uVp.LIZJ("StickerResHelper", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1364105Vn<List<String>> interfaceC1364105Vn = this.LIZ;
        EnumC1705050uTH[] enumC1705050uTHArrValues = EnumC1705050uTH.values();
        ArrayList arrayList = new ArrayList(enumC1705050uTHArrValues.length);
        for (EnumC1705050uTH enumC1705050uTH : enumC1705050uTHArrValues) {
            arrayList.add(enumC1705050uTH.getTypeName());
        }
        C189200o6.m2constructorimpl(arrayList);
        interfaceC1364105Vn.resumeWith(arrayList);
    }

    @Override // X.InterfaceC1705380uTo
    public final void LIZIZ(List<? extends Effect> list, boolean z) {
        List<? extends Effect> list2 = list;
        if (list2.isEmpty()) {
            InterfaceC1364105Vn<List<String>> interfaceC1364105Vn = this.LIZ;
            EnumC1705050uTH[] enumC1705050uTHArrValues = EnumC1705050uTH.values();
            ArrayList arrayList = new ArrayList(enumC1705050uTHArrValues.length);
            for (EnumC1705050uTH enumC1705050uTH : enumC1705050uTHArrValues) {
                arrayList.add(enumC1705050uTH.getTypeName());
            }
            C189200o6.m2constructorimpl(arrayList);
            interfaceC1364105Vn.resumeWith(arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends Effect> it2 = list2.iterator();
        while (it2.hasNext()) {
            String strLIZLLL = C1705060uTI.LIZLLL(C1705060uTI.LIZ(it2.next()), "ame_tracking_type");
            if (strLIZLLL != null) {
                arrayList2.add(strLIZLLL);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchTrackingTypeList list:");
        sbLIZ.append(arrayList2);
        C1706630uVp.LJFF("StickerResHelper", C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) C1705010uTD.LIZIZ).addAll(arrayList2);
        InterfaceC1364105Vn<List<String>> interfaceC1364105Vn2 = this.LIZ;
        C189200o6.m2constructorimpl(arrayList2);
        interfaceC1364105Vn2.resumeWith(arrayList2);
    }
}
