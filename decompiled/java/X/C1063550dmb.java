package X;

/* JADX INFO: renamed from: X.0dmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063550dmb {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1063540dma LIZ(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -977423767:
                    if (str.equals("public")) {
                        return EnumC1063540dma.PUBLIC;
                    }
                    break;
                case -906273929:
                    if (str.equals("secure")) {
                        return EnumC1063540dma.SECURE;
                    }
                    break;
                case -608539730:
                    if (str.equals("protected")) {
                        return EnumC1063540dma.PROTECT;
                    }
                    break;
                case -314497661:
                    if (str.equals("private")) {
                        return EnumC1063540dma.PRIVATE;
                    }
                    break;
                case -309012785:
                    if (str.equals("protect")) {
                        return EnumC1063540dma.PROTECT;
                    }
                    break;
            }
        }
        return EnumC1063540dma.PUBLIC;
    }
}
