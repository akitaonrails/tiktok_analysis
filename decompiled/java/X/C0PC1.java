package X;

import java.util.List;

/* JADX INFO: renamed from: X.0PC1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PC1 {
    public static final String LIZ(List<? extends InterfaceC682670Qq9> list) {
        List<String> summaries;
        StringBuilder sb = new StringBuilder();
        for (InterfaceC682670Qq9 interfaceC682670Qq9 : list) {
            Integer type = interfaceC682670Qq9.getType();
            if (type == null || type.intValue() != 1) {
                if (C123100dR.LIZ(interfaceC682670Qq9.getProcessedSummary()) && (summaries = interfaceC682670Qq9.getSummaries()) != null) {
                    for (String str : summaries) {
                        if (sb.length() > 0) {
                            sb.append("\n\n");
                        }
                        sb.append(str);
                    }
                }
            }
        }
        return sb.toString();
    }
}
