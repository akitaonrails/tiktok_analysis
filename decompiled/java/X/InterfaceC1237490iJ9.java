package X;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0iJ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1237490iJ9 extends Serializable {
    void addEdge(String str, String str2, String str3);

    void addFlow(String str, String str2, InterfaceC1237490iJ9 interfaceC1237490iJ9);

    String getFirstStepId();

    HashMap<String, HashMap<String, String>> getFlowGraph();

    String getNextStepId(String str, String str2);
}
