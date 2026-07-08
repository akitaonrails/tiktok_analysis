package X;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ape, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC950120ape {
    public static final EnumC950120ape Applied;
    public static final EnumC950120ape Finished;
    public static final EnumC950120ape Invited;
    public static final /* synthetic */ EnumC950120ape[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC950120ape Linked;
    public static final EnumC950120ape None;
    public static final EnumC950120ape Prepared;
    public static final EnumC950120ape Received;
    public final int LL;

    public static InterfaceC2044707zh<EnumC950120ape> getEntries() {
        return LLILLL;
    }

    static {
        EnumC950120ape enumC950120ape = new EnumC950120ape("None", 0, 0);
        None = enumC950120ape;
        EnumC950120ape enumC950120ape2 = new EnumC950120ape("Invited", 1, 2);
        Invited = enumC950120ape2;
        EnumC950120ape enumC950120ape3 = new EnumC950120ape("Received", 2, 3);
        Received = enumC950120ape3;
        EnumC950120ape enumC950120ape4 = new EnumC950120ape("Applied", 3, 4);
        Applied = enumC950120ape4;
        EnumC950120ape enumC950120ape5 = new EnumC950120ape("Prepared", 4, 5);
        Prepared = enumC950120ape5;
        EnumC950120ape enumC950120ape6 = new EnumC950120ape("Linked", 5, 6);
        Linked = enumC950120ape6;
        EnumC950120ape enumC950120ape7 = new EnumC950120ape("Finished", 6, 7);
        Finished = enumC950120ape7;
        EnumC950120ape[] enumC950120apeArr = {enumC950120ape, enumC950120ape2, enumC950120ape3, enumC950120ape4, enumC950120ape5, enumC950120ape6, enumC950120ape7};
        LLILLJJLI = enumC950120apeArr;
        LLILLL = new C2254308sP(enumC950120apeArr);
    }

    public static EnumC950120ape[] values() {
        return (EnumC950120ape[]) LLILLJJLI.clone();
    }

    public final String getString() {
        Map<Integer, String> map = C950140apg.LIZ;
        String str = C950140apg.LIZ.get(Integer.valueOf(this.LL));
        return str == null ? "UNKNOWN" : str;
    }

    public final boolean isApplying() {
        return Applied == this;
    }

    public final boolean isIdle() {
        return None == this || Finished == this;
    }

    public final boolean isInProgress() {
        int i = this.LL;
        return i >= Invited.LL && i <= Linked.LL;
    }

    public final boolean isInviting() {
        return this == Invited;
    }

    public final boolean isJoiningOrLinked() {
        int i = this.LL;
        return i >= Invited.LL && i <= Linked.LL;
    }

    public final boolean isLinked() {
        return Linked == this;
    }

    public final boolean isLinking() {
        int i = this.LL;
        return i == Prepared.LL || i == Linked.LL;
    }

    public final boolean isInConnectingProcess() {
        return isInviting() || isApplying();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC950120ape valueOf(String str) {
        return (EnumC950120ape) C08FF.LIZ(EnumC950120ape.class, str);
    }

    public final boolean atLeast(EnumC950120ape enumC950120ape) {
        if (this.LL >= enumC950120ape.LL) {
            return true;
        }
        return false;
    }

    public EnumC950120ape(String str, int i, int i2) {
        this.LL = i2;
    }
}
