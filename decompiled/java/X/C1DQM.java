package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DQM, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DQM {
    public static C1DQL LIZ(String str) {
        for (C1DQL c1dql : C1DQL.values()) {
            if (Intrinsics.LJFF(str, c1dql.getVALUE())) {
                return c1dql;
            }
        }
        return C1DQL.AUTO;
    }
}
