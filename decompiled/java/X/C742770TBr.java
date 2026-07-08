package X;

/* JADX INFO: renamed from: X.0TBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742770TBr {
    public static Class LIZ(int i) {
        for (EnumC742780TBs enumC742780TBs : EnumC742780TBs.getEntries()) {
            if (i == enumC742780TBs.getMessageType()) {
                return enumC742780TBs.getMessageClass();
            }
        }
        return null;
    }
}
