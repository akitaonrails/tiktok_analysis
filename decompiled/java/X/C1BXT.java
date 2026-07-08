package X;

import com.ss.android.ugc.aweme.newlego.TaskHolder;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BXT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BXT {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final EnumC2206581BXs LIZLLL;
    public final Map<String, InterfaceC308150C6b> LJ = new LinkedHashMap();

    public final void LIZ(String str) {
        if (C1BXD.LIZIZ().LIZ.LIZ().contains(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TaskCollector SKIP | task = ");
            sbLIZ.append(str);
            sbLIZ.append(", reason = in_SkipTaskList");
            C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        InterfaceC308150C6b task = TaskHolder.getTask(str);
        if (task == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TaskCollector ADD-NULL | task = ");
            sbLIZ2.append(str);
            sbLIZ2.append(", reason = no_LegoTask");
            C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (!this.LJ.containsKey(str)) {
            this.LJ.put(str, task);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("TaskCollector COLLECT | ");
            sbLIZ3.append(C1BXU.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, str, null, null, null));
            C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("task name: ");
        sbLIZ4.append(str);
        sbLIZ4.append(" has been added");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public C1BXT(String str, String str2, String str3, EnumC2206581BXs enumC2206581BXs) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = enumC2206581BXs;
    }
}
