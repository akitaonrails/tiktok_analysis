package X;

/* JADX INFO: renamed from: X.0MIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566280MIw implements InterfaceC0148002o {
    public final EnumC1216670hlZ LL;

    public C566280MIw() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C566280MIw) && this.LL == ((C566280MIw) obj).LL;
    }

    public final int hashCode() {
        EnumC1216670hlZ enumC1216670hlZ = this.LL;
        if (enumC1216670hlZ == null) {
            return 0;
        }
        return enumC1216670hlZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditProfileAiMeState(currentUserAimeStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C566280MIw(EnumC1216670hlZ enumC1216670hlZ) {
        this.LL = enumC1216670hlZ;
    }
}
