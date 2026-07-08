package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionNode;
import com.ss.android.ugc.aweme.im.strategy.track.ISCPTrackService;
import com.ss.android.ugc.aweme.im.strategy.track.data.SCPTrackNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Zm4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909460Zm4 {
    public final ISCPTrackService LIZ;

    public C909460Zm4() {
        this(0);
    }

    public C909460Zm4(int i) {
        this.LIZ = null;
    }

    public static Pair LIZJ(DecisionNode decisionNode, InterfaceC1707406mO interfaceC1707406mO, InterfaceC898340ZMa interfaceC898340ZMa) {
        boolean z;
        String str;
        System.currentTimeMillis();
        boolean zLIZJ = false;
        try {
            str = decisionNode.nodeAttribute;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = true;
        }
        if (str == null) {
            Boolean bool = Boolean.FALSE;
            return new Pair(bool, bool);
        }
        Object objLIZ = interfaceC1707406mO.LIZ(str, interfaceC898340ZMa);
        InterfaceC909670ZmP interfaceC909670ZmPLIZ = C2215511BnR.LIZ(decisionNode.nodeType);
        String str2 = decisionNode.nodeValue;
        if (str2 == null) {
            Boolean bool2 = Boolean.FALSE;
            return new Pair(bool2, bool2);
        }
        String str3 = decisionNode.nodeOperation;
        if (str3 == null) {
            Boolean bool3 = Boolean.FALSE;
            return new Pair(bool3, bool3);
        }
        zLIZJ = interfaceC909670ZmPLIZ.LIZJ(objLIZ, str2, str3);
        z = false;
        System.currentTimeMillis();
        C0ZMW.LIZ();
        return new Pair(Boolean.valueOf(zLIZJ), Boolean.valueOf(z));
    }

    public static Pair LIZ(DecisionNode decisionNode, InterfaceC1707406mO interfaceC1707406mO, InterfaceC898340ZMa interfaceC898340ZMa, SCPTrackNode sCPTrackNode) {
        SCPTrackNode sCPTrackNode2;
        ArrayList arrayList = new ArrayList();
        Pair pairLIZJ = LIZJ(decisionNode, interfaceC1707406mO, interfaceC898340ZMa);
        boolean zBooleanValue = ((Boolean) pairLIZJ.getFirst()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pairLIZJ.getSecond()).booleanValue();
        if (sCPTrackNode != null) {
            try {
                sCPTrackNode.nodeAttribute = decisionNode.nodeAttribute;
                sCPTrackNode.nodeType = decisionNode.nodeType;
                sCPTrackNode.nodeOperation = decisionNode.nodeOperation;
                sCPTrackNode.nodeValue = decisionNode.nodeValue;
                sCPTrackNode.configName = decisionNode.configName;
                sCPTrackNode.pass = Boolean.valueOf(zBooleanValue);
                sCPTrackNode.hasException = Boolean.valueOf(zBooleanValue2);
                sCPTrackNode.nodeList = new ArrayList();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (zBooleanValue) {
            List<DecisionNode> list = decisionNode.nodeList;
            if (list != null && !list.isEmpty()) {
                List<DecisionNode> list2 = decisionNode.nodeList;
                if (list2 != null) {
                    for (DecisionNode decisionNode2 : list2) {
                        if (sCPTrackNode != null) {
                            sCPTrackNode2 = new SCPTrackNode(null, null, null, null, null, null, null, null);
                            List<SCPTrackNode> list3 = sCPTrackNode.nodeList;
                            if (list3 != null) {
                                list3.add(sCPTrackNode2);
                            }
                        } else {
                            sCPTrackNode2 = null;
                        }
                        Pair pairLIZ = LIZ(decisionNode2, interfaceC1707406mO, interfaceC898340ZMa, sCPTrackNode2);
                        Collection collection = (Collection) pairLIZ.getFirst();
                        boolean zBooleanValue3 = ((Boolean) pairLIZ.getSecond()).booleanValue();
                        arrayList.addAll(collection);
                        if (!zBooleanValue2 && !zBooleanValue3) {
                            zBooleanValue2 = false;
                        } else {
                            zBooleanValue2 = true;
                        }
                    }
                }
            } else {
                String str = decisionNode.configName;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        } else {
            String str2 = decisionNode.nodeAttribute;
            if (str2 != null) {
                C909400Zly.LIZIZ.getClass();
                if (C909400Zly.LJIIJJI()) {
                    interfaceC1707406mO.LIZ(str2, interfaceC898340ZMa);
                }
            }
        }
        return new Pair(arrayList, Boolean.valueOf(zBooleanValue2));
    }

    public static Pair LIZIZ(DecisionNode decisionNode, InterfaceC1707406mO interfaceC1707406mO, InterfaceC898340ZMa interfaceC898340ZMa, SCPTrackNode sCPTrackNode) {
        SCPTrackNode sCPTrackNode2;
        Pair pairLIZJ = LIZJ(decisionNode, interfaceC1707406mO, interfaceC898340ZMa);
        boolean zBooleanValue = ((Boolean) pairLIZJ.getFirst()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pairLIZJ.getSecond()).booleanValue();
        if (sCPTrackNode != null) {
            try {
                sCPTrackNode.nodeAttribute = decisionNode.nodeAttribute;
                sCPTrackNode.nodeType = decisionNode.nodeType;
                sCPTrackNode.nodeOperation = decisionNode.nodeOperation;
                sCPTrackNode.nodeValue = decisionNode.nodeValue;
                sCPTrackNode.configName = decisionNode.configName;
                sCPTrackNode.pass = Boolean.valueOf(zBooleanValue);
                sCPTrackNode.hasException = Boolean.valueOf(zBooleanValue2);
                sCPTrackNode.nodeList = new ArrayList();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (zBooleanValue) {
            List<DecisionNode> list = decisionNode.nodeList;
            boolean z = false;
            if (list != null && !list.isEmpty()) {
                List<DecisionNode> list2 = decisionNode.nodeList;
                if (list2 != null) {
                    for (DecisionNode decisionNode2 : list2) {
                        if (sCPTrackNode != null) {
                            sCPTrackNode2 = new SCPTrackNode(null, null, null, null, null, null, null, null);
                            List<SCPTrackNode> list3 = sCPTrackNode.nodeList;
                            if (list3 != null) {
                                list3.add(sCPTrackNode2);
                            }
                        } else {
                            sCPTrackNode2 = null;
                        }
                        Pair pairLIZIZ = LIZIZ(decisionNode2, interfaceC1707406mO, interfaceC898340ZMa, sCPTrackNode2);
                        String str = (String) pairLIZIZ.getFirst();
                        boolean zBooleanValue3 = ((Boolean) pairLIZIZ.getSecond()).booleanValue();
                        if (str != null && str.length() > 0) {
                            if (zBooleanValue3 || zBooleanValue2) {
                                z = true;
                            }
                            return new Pair(str, Boolean.valueOf(z));
                        }
                    }
                }
            } else {
                String str2 = decisionNode.configName;
                if (str2 != null) {
                    return new Pair(str2, Boolean.valueOf(zBooleanValue2));
                }
            }
        } else {
            try {
                String str3 = decisionNode.nodeAttribute;
                if (str3 != null) {
                    C909400Zly.LIZIZ.getClass();
                    if (C909400Zly.LJIIJJI()) {
                        interfaceC1707406mO.LIZ(str3, interfaceC898340ZMa);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return new Pair(null, Boolean.valueOf(zBooleanValue2));
    }
}
