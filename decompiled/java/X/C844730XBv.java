package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0XBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844730XBv extends C0XC4 {
    public static final long[] LJIILLIIL = {10000, 30000, 60000, 120000, 120000, 120000, 180000, 180000};
    public static final long[] LJIIZILJ = {180000, 360000, 540000, 540000, 900000, 1800000};
    public static final long[] LJIJ = {100, 15000, 20000, 20000, 60000, 60000, 180000, 180000, 540000, 540000};
    public final C0XD7 LJII;
    public final C844630XBl LJIIIIZZ;
    public final C0XBM LJIIIZ;
    public final C0XBK LJIIJ;
    public final C0XBM LJIIJJI;
    public final C844770XBz LJIIL;
    public final C0XDH LJIILIIL;
    public final boolean LJIILJJIL;
    public boolean LJIILL;

    @Override // X.C0XC4
    public final String LIZJ() {
        return "r";
    }

    @Override // X.C0XC4
    public final void LJ() {
    }

    @Override // X.C0XC4
    public final void LJFF() {
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x03cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff A[Catch: all -> 0x03ce, TRY_ENTER, TryCatch #7 {all -> 0x03ce, blocks: (B:28:0x00de, B:35:0x00ff), top: B:185:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0XC4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C844730XBv.LIZIZ():boolean");
    }

    @Override // X.C0XC4
    public final long[] LIZLLL() {
        int iLIZLLL = this.LJIIJJI.LIZLLL();
        if (iLIZLLL == 0) {
            return LJIJ;
        }
        long[] jArr = LJIIZILJ;
        if (iLIZLLL != 1) {
            if (iLIZLLL == 2) {
                return LJIILLIIL;
            }
            C844830XCf.LIZLLL(null);
        }
        return jArr;
    }

    @Override // X.C0XC4
    public final long LJI() {
        return ((C0XCO) this.LJII).LLILLJJLI ? 21600000L : 43200000L;
    }

    @Override // X.C0XC4
    public final void LIZ() {
        C0XCA c0xcaLJ = C0XC2.LIZJ().LJ(this.LJIIL.LIZ);
        C844770XBz c844770XBz = this.LJIIL;
        SharedPreferences sharedPreferencesLIZ = C844580XBg.LIZ(c844770XBz.LIZJ, c844770XBz);
        SharedPreferences.Editor editorEdit = sharedPreferencesLIZ.edit();
        if (!sharedPreferencesLIZ.getBoolean("is_first_register_for_app", false) && editorEdit != null) {
            editorEdit.putBoolean("is_first_register_for_app", true);
            editorEdit.apply();
            c0xcaLJ.LJFF = true;
        }
        c0xcaLJ.LJIIIZ = this.LJIILL && this.LIZJ == 0;
        C844770XBz c844770XBz2 = this.LJIIL;
        C0XC2.LIZJ().LJ(c844770XBz2.LIZ).LIZIZ(c844770XBz2, "dr_register_result");
        this.LJIILL = false;
        c0xcaLJ.LJIIIZ = false;
    }

    @Override // X.C0XC4
    public final void LJII(boolean z) {
        C0XC2.LIZJ().LJ(this.LJIIL.LIZ).LJIIIIZZ = z;
    }

    @Override // X.C0XC4
    public final void LJIIIIZZ(int i) {
        C0XCA c0xcaLJ = C0XC2.LIZJ().LJ(this.LIZIZ.LIZ);
        if (c0xcaLJ != null) {
            c0xcaLJ.LIZLLL = i;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C844730XBv(C844770XBz c844770XBz, C0XBM c0xbm, C844630XBl c844630XBl, Boolean bool, C0XD7 c0xd7, C0XDH c0xdh) {
        SharedPreferences sharedPreferencesLIZ;
        Context context = c844770XBz.LIZJ;
        long j = 0;
        if (c844630XBl != null && (sharedPreferencesLIZ = c844630XBl.LIZ(c844770XBz)) != null) {
            long j2 = sharedPreferencesLIZ.getLong("register_time", 0L);
            C0XBN c0xbnLIZJ = c0xbm.LIZJ();
            if ((!C2123908Tt.LIZ(c0xbnLIZJ.LL) || !C2123908Tt.LIZ(c0xbnLIZJ.LLILLJJLI)) && j2 != 0) {
                sharedPreferencesLIZ.edit().putLong("register_time", 0L).apply();
            } else {
                j = j2;
            }
        }
        super(context, c844770XBz, j);
        this.LJIIJJI = c0xbm;
        this.LJIIL = c844770XBz;
        this.LJII = c0xd7;
        this.LJIIIIZZ = c844630XBl;
        this.LJIILJJIL = bool.booleanValue();
        this.LJIIIZ = c0xbm;
        this.LJIIJ = (C0XBK) C0XBH.LIZ(C0XBK.class, String.valueOf(c844770XBz.LIZ));
        this.LJIILIIL = c0xdh;
    }
}
