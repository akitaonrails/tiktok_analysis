package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.1BcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208681BcQ {
    public final SharedPreferences LIZ;
    public final C830490Whz<String, Object> LIZIZ = new C830490Whz<>();

    public C2208681BcQ(SharedPreferences sharedPreferences) {
        this.LIZ = sharedPreferences;
    }

    public final synchronized float LIZ(InterfaceC2208731BcV interfaceC2208731BcV) {
        boolean z;
        Float fValueOf;
        if (interfaceC2208731BcV.type() == EnumC2208691BcR.Float) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJ(z);
        fValueOf = (Float) this.LIZIZ.get(interfaceC2208731BcV.key());
        if (fValueOf == null) {
            interfaceC2208731BcV.LIZIZ();
            fValueOf = Float.valueOf(this.LIZ.getFloat(interfaceC2208731BcV.key(), ((Float) interfaceC2208731BcV.LIZ()).floatValue()));
            this.LIZIZ.put(interfaceC2208731BcV.key(), fValueOf);
        }
        return fValueOf.floatValue();
    }

    public final synchronized int LIZIZ(InterfaceC2208731BcV interfaceC2208731BcV) {
        boolean z;
        Integer numValueOf;
        if (interfaceC2208731BcV.type() == EnumC2208691BcR.Integer) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJ(z);
        numValueOf = (Integer) this.LIZIZ.get(interfaceC2208731BcV.key());
        if (numValueOf == null) {
            interfaceC2208731BcV.LIZIZ();
            numValueOf = Integer.valueOf(this.LIZ.getInt(interfaceC2208731BcV.key(), ((Integer) interfaceC2208731BcV.LIZ()).intValue()));
            this.LIZIZ.put(interfaceC2208731BcV.key(), numValueOf);
        }
        return numValueOf.intValue();
    }

    public final synchronized long LIZJ(InterfaceC2208731BcV interfaceC2208731BcV) {
        boolean z;
        Long lValueOf;
        if (interfaceC2208731BcV.type() == EnumC2208691BcR.Long) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJ(z);
        lValueOf = (Long) this.LIZIZ.get(interfaceC2208731BcV.key());
        if (lValueOf == null) {
            interfaceC2208731BcV.LIZIZ();
            lValueOf = Long.valueOf(this.LIZ.getLong(interfaceC2208731BcV.key(), ((Long) interfaceC2208731BcV.LIZ()).longValue()));
            this.LIZIZ.put(interfaceC2208731BcV.key(), lValueOf);
        }
        return lValueOf.longValue();
    }

    public final synchronized String LIZLLL(InterfaceC2208731BcV interfaceC2208731BcV) {
        boolean z;
        String string;
        if (interfaceC2208731BcV.type() == EnumC2208691BcR.String) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJ(z);
        string = (String) this.LIZIZ.get(interfaceC2208731BcV.key());
        if (string == null) {
            interfaceC2208731BcV.LIZIZ();
            string = this.LIZ.getString(interfaceC2208731BcV.key(), (String) interfaceC2208731BcV.LIZ());
            this.LIZIZ.put(interfaceC2208731BcV.key(), string);
        }
        return string;
    }

    public final synchronized void LJ(InterfaceC2208731BcV interfaceC2208731BcV, boolean z) {
        boolean z2;
        Boolean bool;
        if (interfaceC2208731BcV.type() == EnumC2208691BcR.Boolean) {
            z2 = true;
        } else {
            z2 = false;
        }
        C19864312np.LJ(z2);
        C830490Whz<String, Object> c830490Whz = this.LIZIZ;
        String strKey = interfaceC2208731BcV.key();
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        c830490Whz.put(strKey, bool);
        interfaceC2208731BcV.LIZIZ();
        this.LIZ.edit().putBoolean(interfaceC2208731BcV.key(), z).apply();
    }

    public final synchronized void LJFF(InterfaceC2208731BcV interfaceC2208731BcV, float f) {
        boolean z;
        if (interfaceC2208731BcV.type() == EnumC2208691BcR.Float) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJ(z);
        this.LIZIZ.put(interfaceC2208731BcV.key(), Float.valueOf(f));
        interfaceC2208731BcV.LIZIZ();
        this.LIZ.edit().putFloat(interfaceC2208731BcV.key(), f).apply();
    }

    public final synchronized void LJI(InterfaceC2208731BcV interfaceC2208731BcV, int i) {
        boolean z;
        if (interfaceC2208731BcV.type() == EnumC2208691BcR.Integer) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJ(z);
        this.LIZIZ.put(interfaceC2208731BcV.key(), Integer.valueOf(i));
        interfaceC2208731BcV.LIZIZ();
        this.LIZ.edit().putInt(interfaceC2208731BcV.key(), i).apply();
    }

    public final synchronized void LJII(InterfaceC2208731BcV interfaceC2208731BcV, long j) {
        boolean z;
        if (interfaceC2208731BcV.type() == EnumC2208691BcR.Long) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJ(z);
        this.LIZIZ.put(interfaceC2208731BcV.key(), Long.valueOf(j));
        interfaceC2208731BcV.LIZIZ();
        this.LIZ.edit().putLong(interfaceC2208731BcV.key(), j).apply();
    }

    public final synchronized void LJIIIIZZ(InterfaceC2208731BcV interfaceC2208731BcV, String str) {
        boolean z;
        if (interfaceC2208731BcV.type() == EnumC2208691BcR.String) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJ(z);
        this.LIZIZ.put(interfaceC2208731BcV.key(), str);
        interfaceC2208731BcV.LIZIZ();
        this.LIZ.edit().putString(interfaceC2208731BcV.key(), str).apply();
    }
}
