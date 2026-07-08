package X;

/* JADX INFO: renamed from: X.0MDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564960MDu {
    public final EnumC564890MDn LIZ;
    public final AbstractC564980MDw LIZIZ;

    public C564960MDu() {
        this((AbstractC564980MDw) null, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C564960MDu(AbstractC564980MDw abstractC564980MDw, int i) {
        EnumC564890MDn enumC564890MDn;
        if ((i & 1) != 0) {
            enumC564890MDn = EnumC564890MDn.NONE;
        } else {
            enumC564890MDn = null;
        }
        this(enumC564890MDn, (i & 2) != 0 ? C0MEJ.LIZ : abstractC564980MDw);
    }

    public C564960MDu(EnumC564890MDn enumC564890MDn, AbstractC564980MDw abstractC564980MDw) {
        this.LIZ = enumC564890MDn;
        this.LIZIZ = abstractC564980MDw;
    }
}
