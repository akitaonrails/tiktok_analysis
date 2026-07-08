package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC824980WXw {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public static final C824970WXv Companion = new Object() { // from class: X.0WXv
    };
    public final String LL;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC824980WXw[] valuesCustom() {
        return (EnumC824980WXw[]) Arrays.copyOf(values(), 2);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static final EnumC824980WXw fromString(String str) {
        Companion.getClass();
        EnumC824980WXw[] enumC824980WXwArrValuesCustom = valuesCustom();
        int length = enumC824980WXwArrValuesCustom.length;
        int i = 0;
        while (i < length) {
            EnumC824980WXw enumC824980WXw = enumC824980WXwArrValuesCustom[i];
            i++;
            if (Intrinsics.LJFF(enumC824980WXw.toString(), str)) {
                return enumC824980WXw;
            }
        }
        return FACEBOOK;
    }

    EnumC824980WXw(String str) {
        this.LL = str;
    }
}
