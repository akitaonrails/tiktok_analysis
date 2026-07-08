package X;

/* JADX INFO: renamed from: X.053u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12920053u {
    public static C12918053s LIZ() {
        String curUserId;
        EnumC12928054c enumC12928054c = EnumC12928054c.UID;
        if (C12921053v.LIZ[enumC12928054c.ordinal()] != 1 || (curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId()) == null) {
            curUserId = "";
        }
        return new C12918053s(curUserId, enumC12928054c, EnumC1502105uN.SERVER, EnumC12929054d.APP);
    }
}
