package X;

/* JADX INFO: renamed from: X.1Bnz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215851Bnz {
    public final EnumC2215821Bnw LIZ;
    public final Object LIZIZ;
    public C2215851Bnz LIZJ = null;
    public C2215851Bnz LIZLLL = null;

    public final boolean LIZIZ() {
        EnumC2215821Bnw enumC2215821Bnw = this.LIZ;
        return enumC2215821Bnw == EnumC2215821Bnw.OPERATOR_COMPARE || enumC2215821Bnw == EnumC2215821Bnw.OPERATOR_AND || enumC2215821Bnw == EnumC2215821Bnw.OPERATOR_OR || enumC2215821Bnw == EnumC2215821Bnw.OPERATOR_MOD;
    }

    public final boolean LIZJ() {
        EnumC2215821Bnw enumC2215821Bnw = this.LIZ;
        return enumC2215821Bnw == EnumC2215821Bnw.PARAM || enumC2215821Bnw == EnumC2215821Bnw.CONST_LONG || enumC2215821Bnw == EnumC2215821Bnw.CONST_DOUBLE || enumC2215821Bnw == EnumC2215821Bnw.CONST_FLOAT || enumC2215821Bnw == EnumC2215821Bnw.CONST_INT || enumC2215821Bnw == EnumC2215821Bnw.CONST_BOOLEAN || enumC2215821Bnw == EnumC2215821Bnw.CONST_STRING;
    }

    public final boolean LIZ() {
        if (LIZIZ()) {
            return (this.LIZJ == null || this.LIZLLL == null) ? false : true;
        }
        return true;
    }

    public C2215851Bnz(EnumC2215821Bnw enumC2215821Bnw, Object obj) {
        this.LIZ = enumC2215821Bnw;
        this.LIZIZ = obj;
    }
}
