package X;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.Filter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0oXU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477020oXU {
    public final InterfaceC1477100oXc LIZ;

    public C1477020oXU() {
        this.LIZ = (C582130MsN.LIZ().getConfig().getDimensionPickConfig().getVersion() != 2 ? (InterfaceC1475660oVI) C1126604au.LIZ("com.ss.android.ugc.aweme.playerkit.configpickerimpl.ConfigPickerService") : (InterfaceC1475660oVI) C1126604au.LIZ("com.ss.android.ugc.aweme.playerkit.configpickerimplv2.ConfigPickerService")).LIZIZ();
    }

    public final List LIZ(String str, List list) {
        System.currentTimeMillis();
        if (list != null && list.size() != 0) {
            IDimensionBitrateFilterConfig dimensionBitrateFilterConfig = C582130MsN.LIZ().getConfig().getDimensionBitrateFilterConfig();
            if (dimensionBitrateFilterConfig != null && dimensionBitrateFilterConfig.enable()) {
                final C1484380ojM c1484380ojMConfig = dimensionBitrateFilterConfig.config();
                c1484380ojMConfig.LJFF = str;
                C1477400oY6.LJJJJI.LJIILJJIL(str);
                InterfaceC1477100oXc interfaceC1477100oXc = this.LIZ;
                final Type type = new TypeToken<Filter>() { // from class: X.0oXb
                }.getType();
                final C1484330ojH c1484330ojH = (C1484330ojH) interfaceC1477100oXc;
                c1484330ojH.getClass();
                List list2 = (List) C1475720oVO.LIZ("match total time cost", new InterfaceC1475730oVP() { // from class: X.0ojI
                    @Override // X.InterfaceC1475730oVP
                    public final Object execute() {
                        C1484330ojH c1484330ojH2 = c1484330ojH;
                        C1484380ojM c1484380ojM = c1484380ojMConfig;
                        Type type2 = type;
                        synchronized (c1484330ojH2) {
                            c1484330ojH2.LIZ.LIZJ(c1484380ojM);
                            C1484350ojJ c1484350ojJ = c1484330ojH2.LIZIZ;
                            c1484350ojJ.LIZ = c1484380ojM;
                            if (c1484350ojJ.LIZJ == null) {
                                c1484350ojJ.LIZ();
                            }
                            ArrayList arrayList = (ArrayList) c1484330ojH2.LIZ.LIZIZ(c1484350ojJ.LIZJ);
                            if (arrayList.size() == 0) {
                                return null;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(C12843050v.LIZ(((ConditionConfig) it2.next()).configContent, type2));
                            }
                            return arrayList2;
                        }
                    }
                });
                if (list.size() == 0) {
                    list = new ArrayList();
                } else if (list2 != null && list2.size() != 0) {
                    List arrayList = new ArrayList(list);
                    Iterator it2 = list2.iterator();
                    loop0: while (true) {
                        list = arrayList;
                        while (it2.hasNext()) {
                            arrayList = ((Filter) it2.next()).filter(list);
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        }
                    }
                }
            } else {
                C1477400oY6.LJJJJI.LJJI(str, list, list);
            }
        } else {
            C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
            synchronized (c1477400oY6) {
                if (!TextUtils.isEmpty(str)) {
                    c1477400oY6.LJIIJJI.put(str, new C0N9X(list, list));
                }
            }
        }
        System.currentTimeMillis();
        return list;
    }
}
