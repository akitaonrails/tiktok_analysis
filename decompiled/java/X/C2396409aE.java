package X;

import com.bytedance.retrofit2.Retrofit;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.09aE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2396409aE extends C09S8 {
    public final C11RO LIZ = null;
    public final boolean LIZIZ;

    public static C2396409aE LIZIZ() {
        return new C2396409aE(false);
    }

    public C2396409aE(boolean z) {
        this.LIZIZ = z;
    }

    @Override // X.C09S8
    public final C09SJ<?, ?> LIZ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        final boolean z;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        final boolean z5;
        String str;
        Class<?> clsLJFF = C2396109aB.LJFF(type);
        if (clsLJFF == AbstractC19486711Lt.class) {
            final Class<Void> cls = Void.class;
            final C11RO c11ro = this.LIZ;
            final boolean z6 = this.LIZIZ;
            final boolean z7 = false;
            final boolean z8 = true;
            return new C09SJ<R, Object>(cls, c11ro, z6, z7, z8, z7, z7, z7, z8) { // from class: X.11Ps
                public final Type LIZ;
                public final C11RO LIZIZ;
                public final boolean LIZJ;
                public final boolean LIZLLL;
                public final boolean LJ;
                public final boolean LJFF;
                public final boolean LJI;
                public final boolean LJII;
                public final boolean LJIIIIZZ;

                @Override // X.C09SJ
                public final Type LIZ() {
                    return this.LIZ;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
                @Override // X.C09SJ
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZIZ(final X.C0X9S<R> r3) {
                    /*
                        r2 = this;
                        boolean r0 = r2.LIZJ
                        if (r0 == 0) goto L30
                        X.11Py r1 = new X.11Py
                        r1.<init>(r3)
                    L9:
                        boolean r0 = r2.LIZLLL
                        if (r0 == 0) goto L26
                        X.11Pu r0 = new X.11Pu
                        r0.<init>(r1)
                    L12:
                        r1 = r0
                    L13:
                        X.11RO r0 = r2.LIZIZ
                        if (r0 == 0) goto L1b
                        X.11Hw r1 = r1.LJL(r0)
                    L1b:
                        boolean r0 = r2.LJFF
                        if (r0 == 0) goto L36
                        X.11Pr r0 = X.EnumC19496911Pr.LATEST
                        X.11NN r0 = r1.LJLJLJ(r0)
                        return r0
                    L26:
                        boolean r0 = r2.LJ
                        if (r0 == 0) goto L13
                        X.11Pt r0 = new X.11Pt
                        r0.<init>(r1)
                        goto L12
                    L30:
                        X.11Px r1 = new X.11Px
                        r1.<init>(r3)
                        goto L9
                    L36:
                        boolean r0 = r2.LJI
                        if (r0 == 0) goto L40
                        X.11Ha r0 = new X.11Ha
                        r0.<init>(r1)
                        return r0
                    L40:
                        boolean r0 = r2.LJII
                        if (r0 == 0) goto L4a
                        X.11IK r0 = new X.11IK
                        r0.<init>(r1)
                        return r0
                    L4a:
                        boolean r0 = r2.LJIIIIZZ
                        if (r0 == 0) goto L54
                        X.11IW r0 = new X.11IW
                        r0.<init>(r1)
                        return r0
                    L54:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C19497011Ps.LIZIZ(X.0X9S):java.lang.Object");
                }

                {
                    this.LIZ = cls;
                    this.LIZIZ = c11ro;
                    this.LIZJ = z6;
                    this.LIZLLL = z7;
                    this.LJ = z8;
                    this.LJFF = z7;
                    this.LJI = z7;
                    this.LJII = z7;
                    this.LJIIIIZZ = z8;
                }
            };
        }
        final boolean z9 = false;
        if (clsLJFF == C11NN.class) {
            z = true;
        } else {
            z = false;
        }
        if (clsLJFF == AbstractC19484711Kz.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (clsLJFF == AbstractC19483511Kn.class) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (clsLJFF != C11NZ.class && !z && !z2 && !z3) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (!z) {
                if (!z2) {
                    if (z3) {
                        str = "Maybe";
                    } else {
                        str = "Observable";
                    }
                } else {
                    str = "Single";
                }
            } else {
                str = "Flowable";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" return type must be parameterized as ");
            sbLIZ.append(str);
            sbLIZ.append("<Foo> or ");
            sbLIZ.append(str);
            sbLIZ.append("<? extends Foo>");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        final Type typeLJ = C2396109aB.LJ(0, (ParameterizedType) type);
        Class<?> clsLJFF2 = C2396109aB.LJFF(typeLJ);
        if (clsLJFF2 == C0X52.class) {
            if (typeLJ instanceof ParameterizedType) {
                typeLJ = C2396109aB.LJ(0, (ParameterizedType) typeLJ);
                z5 = false;
                z4 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (clsLJFF2 == C2396509aF.class) {
            if (typeLJ instanceof ParameterizedType) {
                typeLJ = C2396109aB.LJ(0, (ParameterizedType) typeLJ);
                z5 = true;
                z4 = false;
            } else {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
        } else {
            z4 = true;
            z5 = false;
        }
        final C11RO c11ro2 = this.LIZ;
        final boolean z10 = this.LIZIZ;
        return new C09SJ<R, Object>(typeLJ, c11ro2, z10, z5, z4, z, z2, z3, z9) { // from class: X.11Ps
            public final Type LIZ;
            public final C11RO LIZIZ;
            public final boolean LIZJ;
            public final boolean LIZLLL;
            public final boolean LJ;
            public final boolean LJFF;
            public final boolean LJI;
            public final boolean LJII;
            public final boolean LJIIIIZZ;

            @Override // X.C09SJ
            public final Type LIZ() {
                return this.LIZ;
            }

            @Override // X.C09SJ
            public final Object LIZIZ(C0X9S<R> v) {
                /*
                    this = this;
                    boolean r0 = r2.LIZJ
                    if (r0 == 0) goto L30
                    X.11Py r1 = new X.11Py
                    r1.<init>(r3)
                L9:
                    boolean r0 = r2.LIZLLL
                    if (r0 == 0) goto L26
                    X.11Pu r0 = new X.11Pu
                    r0.<init>(r1)
                L12:
                    r1 = r0
                L13:
                    X.11RO r0 = r2.LIZIZ
                    if (r0 == 0) goto L1b
                    X.11Hw r1 = r1.LJL(r0)
                L1b:
                    boolean r0 = r2.LJFF
                    if (r0 == 0) goto L36
                    X.11Pr r0 = X.EnumC19496911Pr.LATEST
                    X.11NN r0 = r1.LJLJLJ(r0)
                    return r0
                L26:
                    boolean r0 = r2.LJ
                    if (r0 == 0) goto L13
                    X.11Pt r0 = new X.11Pt
                    r0.<init>(r1)
                    goto L12
                L30:
                    X.11Px r1 = new X.11Px
                    r1.<init>(r3)
                    goto L9
                L36:
                    boolean r0 = r2.LJI
                    if (r0 == 0) goto L40
                    X.11Ha r0 = new X.11Ha
                    r0.<init>(r1)
                    return r0
                L40:
                    boolean r0 = r2.LJII
                    if (r0 == 0) goto L4a
                    X.11IK r0 = new X.11IK
                    r0.<init>(r1)
                    return r0
                L4a:
                    boolean r0 = r2.LJIIIIZZ
                    if (r0 == 0) goto L54
                    X.11IW r0 = new X.11IW
                    r0.<init>(r1)
                    return r0
                L54:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19497011Ps.LIZIZ(X.0X9S):java.lang.Object");
            }

            {
                this.LIZ = typeLJ;
                this.LIZIZ = c11ro2;
                this.LIZJ = z10;
                this.LIZLLL = z5;
                this.LJ = z4;
                this.LJFF = z;
                this.LJI = z2;
                this.LJII = z3;
                this.LJIIIIZZ = z9;
            }
        };
    }
}
