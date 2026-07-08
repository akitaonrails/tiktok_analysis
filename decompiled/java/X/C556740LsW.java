package X;

/* JADX INFO: renamed from: X.0LsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556740LsW {
    public static final <T> C326350Cqn<T> LIZ() {
        return new C326350Cqn<>(506, "New framework is disabled");
    }

    public static final <T> C326350Cqn<T> LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Session for ");
        sbLIZ.append(str);
        sbLIZ.append(" not found");
        return new C326350Cqn<>(502, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final <T> C326350Cqn<T> LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Workflow for ");
        sbLIZ.append(str);
        sbLIZ.append(" not found");
        return new C326350Cqn<>(503, C2188811AlT.LIZIZ(sbLIZ));
    }
}
