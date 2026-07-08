package X;

/* JADX INFO: renamed from: X.0VjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805810VjH {
    public static EnumC805800VjG LIZ(int i) {
        EnumC805800VjG enumC805800VjG = EnumC805800VjG.RECONNECT_WS;
        if (i != enumC805800VjG.getWhat()) {
            EnumC805800VjG enumC805800VjG2 = EnumC805800VjG.PUSH_RECEIVE;
            if (i != enumC805800VjG2.getWhat()) {
                EnumC805800VjG enumC805800VjG3 = EnumC805800VjG.IMSDK_RECEIVE;
                if (i != enumC805800VjG3.getWhat()) {
                    EnumC805800VjG enumC805800VjG4 = EnumC805800VjG.MIX_CHAIN_FIX;
                    if (i != enumC805800VjG4.getWhat()) {
                        EnumC805800VjG enumC805800VjG5 = EnumC805800VjG.LOGOUT;
                        if (i != enumC805800VjG5.getWhat()) {
                            return EnumC805800VjG.UNKNOWN;
                        }
                        return enumC805800VjG5;
                    }
                    return enumC805800VjG4;
                }
                return enumC805800VjG3;
            }
            return enumC805800VjG2;
        }
        return enumC805800VjG;
    }
}
