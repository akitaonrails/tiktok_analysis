package X;

/* JADX INFO: renamed from: X.0Oeh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C624610Oeh {
    public static EnumC624620Oei LIZ(EnumC624770Oex enumC624770Oex) {
        switch (C624710Oer.LIZ[enumC624770Oex.ordinal()]) {
            case 1:
                return EnumC624620Oei.UNINITIALIZED;
            case 2:
            case 3:
            case 4:
            case 5:
                return EnumC624620Oei.PAUSE;
            case 6:
                return EnumC624620Oei.RESUME;
            case 7:
                return EnumC624620Oei.DOWNLOADED;
            default:
                throw new C1954807lC();
        }
    }
}
