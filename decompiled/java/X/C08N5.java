package X;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08N5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08N5 implements Comparator {
    public static final C08N5 LL;
    public static final /* synthetic */ C08N5[] LLILLJJLI;

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }

    static {
        C08N5 c08n5 = new C08N5();
        LL = c08n5;
        LLILLJJLI = new C08N5[]{c08n5};
    }

    public static C08N5[] values() {
        return (C08N5[]) LLILLJJLI.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }
}
