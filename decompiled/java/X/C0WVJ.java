package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0WVJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0WVJ {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");

    public final String LL;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static C0WVJ[] valuesCustom() {
        return (C0WVJ[]) Arrays.copyOf(values(), 2);
    }

    public final String getRawValue() {
        return this.LL;
    }

    C0WVJ(String str) {
        this.LL = str;
    }
}
