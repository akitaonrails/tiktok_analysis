package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1302, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1302 extends AbstractC19939512zx {
    public final C199401130d LLILLJJLI;
    public final AnonymousClass1301[] LLILLL;
    public final C199422130y[] LLILZ;
    public final AnonymousClass1305[] LLILZIL;
    public final C19939112zt[] LLILZLL;
    public final AnonymousClass1302[] LLIZ;
    public final AnonymousClass1302[] LLIZLLLIL;
    public final C19939712zz LLJ;
    public volatile boolean LLJI;

    @Override // X.AbstractC19939512zx
    public final AnonymousClass1302 LJI() {
        return this;
    }

    @Override // X.AbstractC19939512zx
    public final AbstractC19939512zx LJIIJ() {
        return null;
    }

    @Override // X.AbstractC19939512zx
    public final String LJII() {
        return this.LLILLJJLI.getName();
    }

    @Override // X.AbstractC19939512zx
    public final String LJIIIZ() {
        return this.LLILLJJLI.getName();
    }

    public final C130B LJIIZILJ() {
        String syntax = this.LLILLJJLI.getSyntax();
        syntax.getClass();
        return !syntax.equals("proto3") ? !syntax.equals("editions") ? C130B.EDITION_PROTO2 : this.LLILLJJLI.getEdition() : C130B.EDITION_PROTO3;
    }

    public final void LJIJJ() {
        if (this.LLJI) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LLJI) {
                    return;
                }
                LJIIL(this.LLILLJJLI.getOptions().getFeatures());
                for (AnonymousClass1301 anonymousClass1301 : this.LLILLL) {
                    anonymousClass1301.LJJ();
                }
                for (C199422130y c199422130y : this.LLILZ) {
                    c199422130y.LJIJI();
                }
                for (AnonymousClass1305 anonymousClass1305 : this.LLILZIL) {
                    anonymousClass1305.LJIIL(anonymousClass1305.LLILLJJLI.getOptions().getFeatures());
                    for (AnonymousClass1304 anonymousClass1304 : anonymousClass1305.LLILZIL) {
                        anonymousClass1304.LJIIL(anonymousClass1304.LLILLJJLI.getOptions().getFeatures());
                    }
                }
                for (C19939112zt c19939112zt : this.LLILZLL) {
                    c19939112zt.LJIIL(c19939112zt.LLILLL.getOptions().getFeatures());
                }
                this.LLJI = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC19939512zx
    public final C199437131n LJIIJJI() {
        if (LJIIZILJ().getNumber() >= C130B.EDITION_2023.getNumber()) {
            return C199437131n.getDefaultInstance();
        }
        if (LJIIZILJ() != C130B.EDITION_PROTO2 || !this.LLILLJJLI.getOptions().getJavaStringCheckUtf8()) {
            return C199437131n.getDefaultInstance();
        }
        C199436131m c199436131mNewBuilder = C199437131n.newBuilder();
        C19933612z0<C199437131n, C130Q> c19933612z0 = AnonymousClass1307.LIZ;
        C130R c130rNewBuilder = C130Q.newBuilder();
        C130O c130o = C130O.VERIFY;
        c130rNewBuilder.getClass();
        c130o.getClass();
        c130rNewBuilder.LLILZIL |= 2;
        c130rNewBuilder.LLIZ = c130o.getNumber();
        c130rNewBuilder.LJIILLIIL();
        C130Q c130qLJIJJ = c130rNewBuilder.buildPartial();
        if (!c130qLJIJJ.isInitialized()) {
            throw AbstractC19931812yi.LJI(c130qLJIJJ);
        }
        c199436131mNewBuilder.getClass();
        AbstractC19933212yw abstractC19933212ywCheckNotLite = k0.checkNotLite(c19933612z0);
        c199436131mNewBuilder.LJJIFFI(abstractC19933212ywCheckNotLite);
        c199436131mNewBuilder.LJIJJ();
        c199436131mNewBuilder.LLILZIL.LJIILIIL(abstractC19933212ywCheckNotLite.LIZJ(), abstractC19933212ywCheckNotLite.LJFF(c130qLJIJJ));
        c199436131mNewBuilder.LJIILLIIL();
        return c199436131mNewBuilder.build();
    }

    public final void LJIJI() {
        try {
            LJIJJ();
        } catch (C19939612zy e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid features for \"");
            sbLIZ.append(this.LLILLJJLI.getName());
            sbLIZ.append("\".");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    @Override // X.AbstractC19939512zx
    public final /* bridge */ /* synthetic */ InterfaceC19930912yZ LJIILJJIL() {
        return this.LLILLJJLI;
    }

    public AnonymousClass1302(String str, AnonymousClass1301 anonymousClass1301) {
        C19939712zz c19939712zz = new C19939712zz(new AnonymousClass1302[0]);
        this.LLJ = c19939712zz;
        C199402130e c199402130eNewBuilder = C199401130d.newBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(anonymousClass1301.LLILZ);
        sbLIZ.append(".placeholder.proto");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ != null) {
            c199402130eNewBuilder.LLILZLL = strLIZIZ;
            c199402130eNewBuilder.LLILZIL |= 1;
            c199402130eNewBuilder.LJIILLIIL();
            str.getClass();
            c199402130eNewBuilder.LLIZ = str;
            c199402130eNewBuilder.LLILZIL |= 2;
            c199402130eNewBuilder.LJIILLIIL();
            C199403130f c199403130f = anonymousClass1301.LLILLJJLI;
            C130M<C199403130f, C199404130g, InterfaceC199409130l> c130m = c199402130eNewBuilder.LLJILJILJ;
            if (c130m == null) {
                c199403130f.getClass();
                c199402130eNewBuilder.LJIJJLI();
                c199402130eNewBuilder.LLJILJIL.add(c199403130f);
                c199402130eNewBuilder.LJIILLIIL();
            } else {
                c130m.LIZJ(c199403130f);
            }
            C199401130d c199401130dLJIJJ = c199402130eNewBuilder.buildPartial();
            if (c199401130dLJIJJ.isInitialized()) {
                this.LLILLJJLI = c199401130dLJIJJ;
                this.LLIZ = new AnonymousClass1302[0];
                this.LLIZLLLIL = new AnonymousClass1302[0];
                this.LLJI = false;
                this.LLILLL = new AnonymousClass1301[]{anonymousClass1301};
                this.LLILZ = AnonymousClass1303.LJ;
                this.LLILZIL = AnonymousClass1303.LJFF;
                this.LLILZLL = AnonymousClass1303.LIZLLL;
                c19939712zz.LIZ(this, str);
                c19939712zz.LIZIZ(anonymousClass1301);
                return;
            }
            throw AbstractC19931812yi.LJI(c199401130dLJIJJ);
        }
        c199402130eNewBuilder.getClass();
        throw null;
    }

    public static AnonymousClass1302 LJIILLIIL(C199401130d c199401130d, AnonymousClass1302[] anonymousClass1302Arr) throws C19939612zy {
        AnonymousClass1302 anonymousClass1302 = new AnonymousClass1302(c199401130d, anonymousClass1302Arr, new C19939712zz(anonymousClass1302Arr));
        for (AnonymousClass1301 anonymousClass1301 : anonymousClass1302.LLILLL) {
            anonymousClass1301.LJIILLIIL();
        }
        for (AnonymousClass1305 anonymousClass1305 : anonymousClass1302.LLILZIL) {
            for (AnonymousClass1304 anonymousClass1304 : anonymousClass1305.LLILZIL) {
                if (anonymousClass1304.LLILZ.LLILZ.LLJ.LJ(anonymousClass1304.LLILLJJLI.getInputType(), anonymousClass1304) instanceof AnonymousClass1301) {
                    if (!(anonymousClass1304.LLILZ.LLILZ.LLJ.LJ(anonymousClass1304.LLILLJJLI.getOutputType(), anonymousClass1304) instanceof AnonymousClass1301)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('\"');
                        sbLIZ.append(anonymousClass1304.LLILLJJLI.getOutputType());
                        sbLIZ.append("\" is not a message type.");
                        throw new C19939612zy(anonymousClass1304, C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('\"');
                    sbLIZ2.append(anonymousClass1304.LLILLJJLI.getInputType());
                    sbLIZ2.append("\" is not a message type.");
                    throw new C19939612zy(anonymousClass1304, C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        for (C19939112zt c19939112zt : anonymousClass1302.LLILZLL) {
            c19939112zt.LJIILLIIL();
        }
        return anonymousClass1302;
    }

    public static AnonymousClass1302 LJIJ(String[] strArr, AnonymousClass1302[] anonymousClass1302Arr) {
        byte[] bytes;
        if (strArr.length == 1) {
            bytes = strArr[0].getBytes(C19922012x8.LIZIZ);
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            bytes = sb.toString().getBytes(C19922012x8.LIZIZ);
        }
        try {
            C199401130d from = C199401130d.parseFrom(bytes);
            try {
                return LJIILLIIL(from, anonymousClass1302Arr);
            } catch (C19939612zy e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid embedded descriptor for \"");
                sbLIZ.append(from.getName());
                sbLIZ.append("\".");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
            }
        } catch (C19926612xs e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
        }
    }

    public AnonymousClass1302(C199401130d c199401130d, AnonymousClass1302[] anonymousClass1302Arr, C19939712zz c19939712zz) throws C19939612zy {
        AnonymousClass1301[] anonymousClass1301Arr;
        C199422130y[] c199422130yArr;
        AnonymousClass1305[] anonymousClass1305Arr;
        C19939112zt[] c19939112ztArr;
        this.LLJ = c19939712zz;
        this.LLILLJJLI = c199401130d;
        this.LLIZ = (AnonymousClass1302[]) anonymousClass1302Arr.clone();
        this.LLJI = false;
        HashMap map = new HashMap();
        for (AnonymousClass1302 anonymousClass1302 : anonymousClass1302Arr) {
            map.put(anonymousClass1302.LJIIIZ(), anonymousClass1302);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c199401130d.getPublicDependencyCount(); i++) {
            int publicDependency = c199401130d.getPublicDependency(i);
            if (publicDependency >= 0 && publicDependency < c199401130d.getDependencyCount()) {
                Object obj = map.get(c199401130d.getDependency(publicDependency));
                if (obj != null) {
                    arrayList.add(obj);
                }
            } else {
                throw new C19939612zy(this, "Invalid public dependency index.");
            }
        }
        AnonymousClass1302[] anonymousClass1302Arr2 = new AnonymousClass1302[arrayList.size()];
        this.LLIZLLLIL = anonymousClass1302Arr2;
        arrayList.toArray(anonymousClass1302Arr2);
        c19939712zz.LIZ(this, this.LLILLJJLI.getPackage());
        if (c199401130d.getMessageTypeCount() > 0) {
            anonymousClass1301Arr = new AnonymousClass1301[c199401130d.getMessageTypeCount()];
        } else {
            anonymousClass1301Arr = AnonymousClass1303.LIZJ;
        }
        this.LLILLL = anonymousClass1301Arr;
        for (int i2 = 0; i2 < c199401130d.getMessageTypeCount(); i2++) {
            this.LLILLL[i2] = new AnonymousClass1301(c199401130d.getMessageType(i2), this, null);
        }
        if (c199401130d.getEnumTypeCount() > 0) {
            c199422130yArr = new C199422130y[c199401130d.getEnumTypeCount()];
        } else {
            c199422130yArr = AnonymousClass1303.LJ;
        }
        this.LLILZ = c199422130yArr;
        for (int i3 = 0; i3 < c199401130d.getEnumTypeCount(); i3++) {
            this.LLILZ[i3] = new C199422130y(c199401130d.getEnumType(i3), this, null);
        }
        if (c199401130d.getServiceCount() > 0) {
            anonymousClass1305Arr = new AnonymousClass1305[c199401130d.getServiceCount()];
        } else {
            anonymousClass1305Arr = AnonymousClass1303.LJFF;
        }
        this.LLILZIL = anonymousClass1305Arr;
        for (int i4 = 0; i4 < c199401130d.getServiceCount(); i4++) {
            this.LLILZIL[i4] = new AnonymousClass1305(c199401130d.getService(i4), this);
        }
        if (c199401130d.getExtensionCount() > 0) {
            c19939112ztArr = new C19939112zt[c199401130d.getExtensionCount()];
        } else {
            c19939112ztArr = AnonymousClass1303.LIZLLL;
        }
        this.LLILZLL = c19939112ztArr;
        for (int i5 = 0; i5 < c199401130d.getExtensionCount(); i5++) {
            this.LLILZLL[i5] = new C19939112zt(c199401130d.getExtension(i5), this, null, i5, true);
        }
    }
}
