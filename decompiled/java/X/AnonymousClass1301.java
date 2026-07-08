package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.1301, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1301 extends AbstractC19939512zx {
    public final C199403130f LLILLJJLI;
    public volatile C131P LLILLL;
    public final String LLILZ;
    public final AbstractC19939512zx LLILZIL;
    public final AnonymousClass1301[] LLILZLL;
    public final C199422130y[] LLIZ;
    public final C19939112zt[] LLIZLLLIL;
    public final C19939112zt[] LLJ;
    public final C19939112zt[] LLJI;
    public final C19939212zu[] LLJIJIL;
    public final int LLJILJIL;
    public final int[] LLJILJILJ;
    public final int[] LLJILLL;

    @Override // X.AbstractC19939512zx
    public final AnonymousClass1302 LJI() {
        return this.LLILZIL.LJI();
    }

    @Override // X.AbstractC19939512zx
    public final String LJIIIZ() {
        return this.LLILLJJLI.getName();
    }

    public final void LJIILLIIL() throws C19939612zy {
        for (AnonymousClass1301 anonymousClass1301 : this.LLILZLL) {
            anonymousClass1301.LJIILLIIL();
        }
        for (C19939112zt c19939112zt : this.LLIZLLLIL) {
            c19939112zt.LJIILLIIL();
        }
        Arrays.sort(this.LLJ);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            C19939112zt[] c19939112ztArr = this.LLJ;
            if (i2 >= c19939112ztArr.length) {
                for (C19939112zt c19939112zt2 : this.LLJI) {
                    c19939112zt2.LJIILLIIL();
                }
                return;
            }
            C19939112zt c19939112zt3 = c19939112ztArr[i];
            C19939112zt c19939112zt4 = c19939112ztArr[i2];
            if (c19939112zt3.getNumber() == c19939112zt4.getNumber()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Field number ");
                sbLIZ.append(c19939112zt4.getNumber());
                sbLIZ.append(" has already been used in \"");
                sbLIZ.append(c19939112zt4.LLJIJIL.LLILZ);
                sbLIZ.append("\" by field \"");
                sbLIZ.append(c19939112zt3.LJIIIZ());
                sbLIZ.append("\".");
                throw new C19939612zy(c19939112zt4, C2188811AlT.LIZIZ(sbLIZ));
            }
            i = i2;
        }
    }

    public final List<C199422130y> LJIJI() {
        return Collections.unmodifiableList(Arrays.asList(this.LLIZ));
    }

    public final List<C19939112zt> LJIJJ() {
        return Collections.unmodifiableList(Arrays.asList(this.LLIZLLLIL));
    }

    public final C131P LJIJJLI() {
        if (this.LLILLL == null) {
            C131P options = this.LLILLJJLI.getOptions();
            if (options.hasFeatures()) {
                C131Q builder = options.toBuilder();
                builder.LLILZLL &= -33;
                builder.LLJILJIL = null;
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = builder.LLJILJILJ;
                if (c130n != null) {
                    c130n.LIZ = null;
                    builder.LLJILJILJ = null;
                }
                builder.LJIILLIIL();
                options = builder.buildPartial();
                if (!options.isInitialized()) {
                    throw AbstractC19931812yi.LJI(options);
                }
            }
            synchronized (this) {
                try {
                    if (this.LLILLL == null) {
                        this.LLILLL = options;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LLILLL;
    }

    public final void LJJ() {
        LJIIL(this.LLILLJJLI.getOptions().getFeatures());
        for (AnonymousClass1301 anonymousClass1301 : this.LLILZLL) {
            anonymousClass1301.LJJ();
        }
        for (C199422130y c199422130y : this.LLIZ) {
            c199422130y.LJIJI();
        }
        for (C19939212zu c19939212zu : this.LLJIJIL) {
            c19939212zu.LJIIL(c19939212zu.LLILLL.getOptions().getFeatures());
        }
        for (C19939112zt c19939112zt : this.LLIZLLLIL) {
            c19939112zt.LJIIL(c19939112zt.LLILLL.getOptions().getFeatures());
        }
        for (C19939112zt c19939112zt2 : this.LLJI) {
            c19939112zt2.LJIIL(c19939112zt2.LLILLL.getOptions().getFeatures());
        }
    }

    @Override // X.AbstractC19939512zx
    public final String LJII() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19939512zx
    public final AbstractC19939512zx LJIIJ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC19939512zx
    public final /* bridge */ /* synthetic */ InterfaceC19930912yZ LJIILJJIL() {
        return this.LLILLJJLI;
    }

    public AnonymousClass1301(String str) {
        String strSubstring;
        String strSubstring2;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring2 = str.substring(iLastIndexOf + 1);
            strSubstring = str.substring(0, iLastIndexOf);
        } else {
            strSubstring = "";
            strSubstring2 = str;
        }
        C199404130g c199404130gNewBuilder = C199403130f.newBuilder();
        if (strSubstring2 != null) {
            c199404130gNewBuilder.LLILZLL = strSubstring2;
            c199404130gNewBuilder.LLILZIL |= 1;
            c199404130gNewBuilder.LJIILLIIL();
            C199420130w c199420130wNewBuilder = C199419130v.newBuilder();
            c199420130wNewBuilder.LLILZLL = 1;
            c199420130wNewBuilder.LLILZIL |= 1;
            c199420130wNewBuilder.LJIILLIIL();
            c199420130wNewBuilder.LLIZ = 536870912;
            c199420130wNewBuilder.LLILZIL |= 2;
            c199420130wNewBuilder.LJIILLIIL();
            C199419130v c199419130vLJIJJ = c199420130wNewBuilder.buildPartial();
            if (c199419130vLJIJJ.isInitialized()) {
                C130M<C199419130v, C199420130w, InterfaceC199407130j> c130m = c199404130gNewBuilder.LLJJI;
                if (c130m == null) {
                    c199404130gNewBuilder.LJIJJLI();
                    c199404130gNewBuilder.LLJJ.add(c199419130vLJIJJ);
                    c199404130gNewBuilder.LJIILLIIL();
                } else {
                    c130m.LIZJ(c199419130vLJIJJ);
                }
                C199403130f c199403130fLJIJJ = c199404130gNewBuilder.buildPartial();
                if (c199403130fLJIJJ.isInitialized()) {
                    this.LLILLJJLI = c199403130fLJIJJ;
                    this.LLILZ = str;
                    this.LLILZLL = AnonymousClass1303.LIZJ;
                    this.LLIZ = AnonymousClass1303.LJ;
                    C19939112zt[] c19939112ztArr = AnonymousClass1303.LIZLLL;
                    this.LLIZLLLIL = c19939112ztArr;
                    this.LLJ = c19939112ztArr;
                    this.LLJI = c19939112ztArr;
                    this.LLJIJIL = AnonymousClass1303.LJI;
                    this.LLJILJIL = 0;
                    this.LLILZIL = new AnonymousClass1302(strSubstring, this);
                    this.LLJILJILJ = new int[]{1};
                    this.LLJILLL = new int[]{536870912};
                    return;
                }
                throw AbstractC19931812yi.LJI(c199403130fLJIJJ);
            }
            throw AbstractC19931812yi.LJI(c199419130vLJIJJ);
        }
        c199404130gNewBuilder.getClass();
        throw null;
    }

    public final C19939112zt LJIIZILJ(String str) {
        C19939712zz c19939712zz = LJI().LLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('.');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c19939712zz.getClass();
        AbstractC19939512zx abstractC19939512zxLIZJ = c19939712zz.LIZJ(strLIZIZ, EnumC19939412zw.ALL_SYMBOLS);
        if (abstractC19939512zxLIZJ instanceof C19939112zt) {
            return (C19939112zt) abstractC19939512zxLIZJ;
        }
        return null;
    }

    public final C19939112zt LJIJ(int i) {
        C19939112zt[] c19939112ztArr = this.LLJ;
        return (C19939112zt) AnonymousClass1303.LIZ(c19939112ztArr, c19939112ztArr.length, C19939112zt.LLJJ, i);
    }

    public AnonymousClass1301(C199403130f c199403130f, AnonymousClass1302 anonymousClass1302, AnonymousClass1301 anonymousClass1301) throws C19939612zy {
        C19939212zu[] c19939212zuArr;
        AnonymousClass1301[] anonymousClass1301Arr;
        C199422130y[] c199422130yArr;
        C19939112zt[] c19939112ztArr;
        C19939112zt[] c19939112ztArr2;
        C19939112zt[] c19939112ztArr3;
        if (anonymousClass1301 == null) {
            this.LLILZIL = anonymousClass1302;
        } else {
            this.LLILZIL = anonymousClass1301;
        }
        this.LLILLJJLI = c199403130f;
        this.LLILZ = AnonymousClass1303.LIZIZ(anonymousClass1302, anonymousClass1301, c199403130f.getName());
        if (c199403130f.getOneofDeclCount() > 0) {
            c19939212zuArr = new C19939212zu[c199403130f.getOneofDeclCount()];
        } else {
            c19939212zuArr = AnonymousClass1303.LJI;
        }
        this.LLJIJIL = c19939212zuArr;
        int i = 0;
        for (int i2 = 0; i2 < c199403130f.getOneofDeclCount(); i2++) {
            this.LLJIJIL[i2] = new C19939212zu(c199403130f.getOneofDecl(i2), this, i2);
        }
        if (c199403130f.getNestedTypeCount() > 0) {
            anonymousClass1301Arr = new AnonymousClass1301[c199403130f.getNestedTypeCount()];
        } else {
            anonymousClass1301Arr = AnonymousClass1303.LIZJ;
        }
        this.LLILZLL = anonymousClass1301Arr;
        for (int i3 = 0; i3 < c199403130f.getNestedTypeCount(); i3++) {
            this.LLILZLL[i3] = new AnonymousClass1301(c199403130f.getNestedType(i3), anonymousClass1302, this);
        }
        if (c199403130f.getEnumTypeCount() > 0) {
            c199422130yArr = new C199422130y[c199403130f.getEnumTypeCount()];
        } else {
            c199422130yArr = AnonymousClass1303.LJ;
        }
        this.LLIZ = c199422130yArr;
        for (int i4 = 0; i4 < c199403130f.getEnumTypeCount(); i4++) {
            this.LLIZ[i4] = new C199422130y(c199403130f.getEnumType(i4), anonymousClass1302, this);
        }
        if (c199403130f.getFieldCount() > 0) {
            c19939112ztArr = new C19939112zt[c199403130f.getFieldCount()];
        } else {
            c19939112ztArr = AnonymousClass1303.LIZLLL;
        }
        this.LLIZLLLIL = c19939112ztArr;
        for (int i5 = 0; i5 < c199403130f.getFieldCount(); i5++) {
            this.LLIZLLLIL[i5] = new C19939112zt(c199403130f.getField(i5), anonymousClass1302, this, i5, false);
        }
        if (c199403130f.getFieldCount() > 0) {
            c19939112ztArr2 = (C19939112zt[]) this.LLIZLLLIL.clone();
        } else {
            c19939112ztArr2 = AnonymousClass1303.LIZLLL;
        }
        this.LLJ = c19939112ztArr2;
        if (c199403130f.getExtensionCount() > 0) {
            c19939112ztArr3 = new C19939112zt[c199403130f.getExtensionCount()];
        } else {
            c19939112ztArr3 = AnonymousClass1303.LIZLLL;
        }
        this.LLJI = c19939112ztArr3;
        for (int i6 = 0; i6 < c199403130f.getExtensionCount(); i6++) {
            this.LLJI[i6] = new C19939112zt(c199403130f.getExtension(i6), anonymousClass1302, this, i6, true);
        }
        for (int i7 = 0; i7 < c199403130f.getOneofDeclCount(); i7++) {
            C19939212zu c19939212zu = this.LLJIJIL[i7];
            c19939212zu.LLIZ = new C19939112zt[c19939212zu.LLILZLL];
            c19939212zu.LLILZLL = 0;
        }
        for (int i8 = 0; i8 < c199403130f.getFieldCount(); i8++) {
            C19939112zt c19939112zt = this.LLIZLLLIL[i8];
            C19939212zu c19939212zu2 = c19939112zt.LLJILJIL;
            if (c19939212zu2 != null) {
                C19939112zt[] c19939112ztArr4 = c19939212zu2.LLIZ;
                int i9 = c19939212zu2.LLILZLL;
                c19939212zu2.LLILZLL = i9 + 1;
                c19939112ztArr4[i9] = c19939112zt;
            }
        }
        int i10 = 0;
        for (C19939212zu c19939212zu3 : this.LLJIJIL) {
            C19939112zt[] c19939112ztArr5 = c19939212zu3.LLIZ;
            if (c19939112ztArr5.length == 1 && c19939112ztArr5[0].LLIZLLLIL) {
                i10++;
            } else if (i10 > 0) {
                throw new C19939612zy(this, "Synthetic oneofs must come last.");
            }
        }
        this.LLJILJIL = this.LLJIJIL.length - i10;
        anonymousClass1302.LLJ.LIZIZ(this);
        if (c199403130f.getExtensionRangeCount() > 0) {
            this.LLJILJILJ = new int[c199403130f.getExtensionRangeCount()];
            this.LLJILLL = new int[c199403130f.getExtensionRangeCount()];
            for (C199419130v c199419130v : c199403130f.getExtensionRangeList()) {
                this.LLJILJILJ[i] = c199419130v.getStart();
                this.LLJILLL[i] = c199419130v.getEnd();
                i++;
            }
            Arrays.sort(this.LLJILJILJ);
            Arrays.sort(this.LLJILLL);
            return;
        }
        int[] iArr = AnonymousClass1303.LIZIZ;
        this.LLJILJILJ = iArr;
        this.LLJILLL = iArr;
    }
}
