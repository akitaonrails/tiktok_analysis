package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Dlp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348750Dlp {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(NLEModel nLEModel) {
        if (nLEModel == null) {
            return false;
        }
        VecNLEResourceNodeSPtr allResources = nLEModel.getAllResources();
        if (!(allResources instanceof Collection) || !allResources.isEmpty()) {
            for (NLEResourceNode nLEResourceNode : allResources) {
                if (nLEResourceNode.hasResourceFile() && LIZIZ(nLEResourceNode.getResourceFile())) {
                    return true;
                }
                NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) nLEResourceNode);
                if (nLEResourceAVDynamicCast != null) {
                    if (nLEResourceAVDynamicCast.hasFileInfo() && LIZIZ(nLEResourceAVDynamicCast.getFileInfo())) {
                        return true;
                    }
                    if (nLEResourceAVDynamicCast.hasReverseResourceFile() && LIZIZ(nLEResourceAVDynamicCast.getReverseResourceFile())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LIZIZ(String str) {
        if (str == null) {
            return false;
        }
        if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
            return false;
        }
        return true;
    }

    public static final Set<String> LIZJ(NLEModel nLEModel, Function1<? super String, String> function1, Function1<? super String, Unit> function12, Function1<? super HashMap<String, String>, Unit> function13) {
        Object c098200Yq;
        VecNLEResourceNodeSPtr allResources;
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (nLEModel != null && (allResources = nLEModel.getAllResources()) != null) {
            for (NLEResourceNode nLEResourceNode : allResources) {
                if (nLEResourceNode.hasResourceFile()) {
                    LIZLLL(map, linkedHashSet, function1, nLEResourceNode.getResourceFile());
                }
                NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) nLEResourceNode);
                if (nLEResourceAVDynamicCast != null) {
                    if (nLEResourceAVDynamicCast.hasFileInfo()) {
                        LIZLLL(map, linkedHashSet, function1, nLEResourceAVDynamicCast.getFileInfo());
                    }
                    if (nLEResourceAVDynamicCast.hasReverseResourceFile()) {
                        LIZLLL(map, linkedHashSet, function1, nLEResourceAVDynamicCast.getReverseResourceFile());
                    }
                }
            }
        }
        if (!map.isEmpty()) {
            try {
                function13.invoke(map);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updatePath threw, leaving in-memory NLE unchanged; recoverable err=");
                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                function12.invoke(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return linkedHashSet;
    }

    public static final void LIZLLL(HashMap<String, String> map, Set<String> set, Function1<? super String, String> function1, String str) {
        if (str != null && LIZIZ(str) && !map.containsKey(str) && !set.contains(str)) {
            String strInvoke = function1.invoke(str);
            if (strInvoke != null) {
                map.put(str, strInvoke);
            } else {
                set.add(str);
            }
        }
    }
}
