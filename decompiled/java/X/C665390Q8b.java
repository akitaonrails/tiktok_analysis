package X;

/* JADX INFO: renamed from: X.0Q8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665390Q8b {
    public static final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        InterfaceC737790Swr interfaceC737790Swr;
        Object host = interfaceC665370Q7z.getHost();
        if ((host instanceof InterfaceC737790Swr) && (interfaceC737790Swr = (InterfaceC737790Swr) host) != null) {
            interfaceC737790Swr.pQ(interfaceC665370Q7z);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The host of ");
        sbLIZ.append(interfaceC665370Q7z);
        sbLIZ.append(" is not an ability provider, have you forget to write @ProvidesTo in ");
        sbLIZ.append(interfaceC665370Q7z.getHost());
        sbLIZ.append('?');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
