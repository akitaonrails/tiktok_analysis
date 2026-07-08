package X;

/* JADX INFO: renamed from: X.10mr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19348710mr {
    public final EnumC19356510o7 LIZ;
    public EnumC19356310o5 LIZIZ;
    public final EnumC826620Wbk LIZJ;
    public EnumC19354810nq LIZLLL;

    public C19348710mr(EnumC19356510o7 enumC19356510o7, EnumC19356310o5 enumC19356310o5, EnumC826620Wbk enumC826620Wbk) {
        this(enumC19356510o7, enumC19356310o5, enumC826620Wbk, 8);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(',');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(',');
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19348710mr(EnumC19356510o7 enumC19356510o7, EnumC19356310o5 enumC19356310o5, EnumC826620Wbk enumC826620Wbk, int i) {
        EnumC19354810nq enumC19354810nq;
        enumC19356510o7 = (i & 1) != 0 ? EnumC19356510o7.DECIMAL : enumC19356510o7;
        enumC19356310o5 = (i & 2) != 0 ? EnumC19356310o5.STANDARD : enumC19356310o5;
        enumC826620Wbk = (i & 4) != 0 ? EnumC826620Wbk.SHORT : enumC826620Wbk;
        if ((i & 8) != 0) {
            enumC19354810nq = EnumC19354810nq.ROUND_BANKER;
        } else {
            enumC19354810nq = null;
        }
        this.LIZ = enumC19356510o7;
        this.LIZIZ = enumC19356310o5;
        this.LIZJ = enumC826620Wbk;
        this.LIZLLL = enumC19354810nq;
    }
}
