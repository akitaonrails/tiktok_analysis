package X;

import com.ss.android.ugc.effectmanager.common.model.ExtendedUrlModel;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.13Pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20006713Pt {
    public C0J3I<String, C13Q9> LIZ = new C0J3I<>();
    public final Map<String, ModelInfo> LIZIZ = new LinkedHashMap();

    public final Map<String, ModelInfo> LIZIZ() {
        if (this.LIZIZ.isEmpty()) {
            Iterator<C13Q9> it2 = this.LIZ.LIZIZ().iterator();
            while (it2.hasNext()) {
                ModelInfo modelInfo = it2.next().LIZ;
                String name = modelInfo.getName();
                this.LIZIZ.put(name, modelInfo);
                List<ModelInfo> demotion_list = modelInfo.getDemotion_list();
                if (demotion_list != null) {
                    for (ModelInfo modelInfo2 : demotion_list) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(name);
                        sbLIZ.append("_level");
                        sbLIZ.append(modelInfo2.getLevel());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        modelInfo2.setName(strLIZIZ);
                        modelInfo2.setVersion(modelInfo.getVersion());
                        this.LIZIZ.put(strLIZIZ, modelInfo2);
                    }
                }
            }
        }
        return this.LIZIZ;
    }

    public final ExtendedUrlModel LIZ(String str) {
        Map<String, ModelInfo> mapLIZIZ = LIZIZ();
        if (mapLIZIZ.containsKey(str)) {
            ModelInfo modelInfo = (ModelInfo) ((LinkedHashMap) mapLIZIZ).get(str);
            if (modelInfo != null) {
                return modelInfo.getFileUrl();
            }
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("modelName ");
        sbLIZ.append(str);
        sbLIZ.append(" doesn't exist");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
