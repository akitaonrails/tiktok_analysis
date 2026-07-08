package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.00qB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC202100qB {
    NONE,
    BOUNDS;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC202100qB[] valuesCustom() {
        return (EnumC202100qB[]) Arrays.copyOf(values(), 2);
    }

    public static EnumC202100qB valueOf(String str) {
        return (EnumC202100qB) C08FF.LIZ(EnumC202100qB.class, str);
    }
}
