package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.12qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19883812qy extends AbstractC19884012r0 {
    public static final C19883812qy LLIZ = new C19883812qy(0, null, new Object[0]);
    public final transient Object LLILZ;
    public final transient Object[] LLILZIL;
    public final transient int LLILZLL;

    public C19883812qy(int i, Object obj, Object[] objArr) {
        this.LLILZ = obj;
        this.LLILZIL = objArr;
        this.LLILZLL = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC19884012r0
    public final C19884312r3 LIZ() {
        return new C19884312r3(1, this.LLILZLL, this.LLILZIL);
    }

    @Override // X.AbstractC19884012r0
    public final C19884512r5 LIZIZ() {
        return new C19884512r5(this, this.LLILZIL, this.LLILZLL);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.12r4] */
    @Override // X.AbstractC19884012r0
    public final C19884412r4 LIZJ() {
        final C19884312r3 c19884312r3 = new C19884312r3(0, this.LLILZLL, this.LLILZIL);
        return new AbstractC19884812r8(this, c19884312r3) { // from class: X.12r4
            public final transient AbstractC19884012r0 LLILLL;
            public final transient AbstractC19884912r9 LLILZ;

            @Override // X.AbstractC19884812r8, X.AbstractC19884712r7
            public final AbstractC19884912r9 zzd() {
                return this.LLILZ;
            }

            @Override // X.AbstractC19884812r8, X.AbstractC19884712r7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final /* synthetic */ Iterator iterator() {
                return this.LLILZ.listIterator(0);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.LLILLL.size();
            }

            @Override // X.AbstractC19884812r8, X.AbstractC19884712r7
            /* JADX INFO: renamed from: zze */
            public final AbstractC19885512rF iterator() {
                return this.LLILZ.listIterator(0);
            }

            @Override // X.AbstractC19884712r7
            public final int LIZJ(Object[] objArr) {
                return this.LLILZ.LIZJ(objArr);
            }

            @Override // X.AbstractC19884712r7, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (this.LLILLL.get(obj) != null) {
                    return true;
                }
                return false;
            }

            {
                this.LLILLL = this;
                this.LLILZ = c19884312r3;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[RETURN] */
    @Override // X.AbstractC19884012r0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L98
            int r0 = r8.LLILZLL
            java.lang.Object[] r4 = r8.LLILZIL
            r1 = 1
            if (r0 != r1) goto L1e
            r0 = 0
            r0 = r4[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L98
            r0 = r4[r1]
            java.util.Objects.requireNonNull(r0)
        L1b:
            if (r0 == 0) goto L98
            return r0
        L1e:
            java.lang.Object r5 = r8.LLILZ
            if (r5 == 0) goto L98
            boolean r0 = r5 instanceof byte[]
            r6 = -1
            if (r0 == 0) goto L4c
            byte[] r5 = (byte[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r9.hashCode()
            int r2 = X.C19883912qz.LIZ(r0)
        L34:
            r2 = r2 & r3
            r1 = r5[r2]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 == r0) goto L98
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L49
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L1b
        L49:
            int r2 = r2 + 1
            goto L34
        L4c:
            boolean r0 = r5 instanceof short[]
            if (r0 == 0) goto L76
            short[] r5 = (short[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r9.hashCode()
            int r2 = X.C19883912qz.LIZ(r0)
        L5d:
            r2 = r2 & r3
            short r0 = r5[r2]
            char r1 = (char) r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 == r0) goto L98
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L73
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L1b
        L73:
            int r2 = r2 + 1
            goto L5d
        L76:
            int[] r5 = (int[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r9.hashCode()
            int r2 = X.C19883912qz.LIZ(r0)
        L83:
            r2 = r2 & r3
            r1 = r5[r2]
            if (r1 == r6) goto L98
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L95
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L1b
        L95:
            int r2 = r2 + 1
            goto L83
        L98:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19883812qy.get(java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r7v1 ??, r7v3 ??, r7v2 ??, r7v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.trySplitConstInsns(FixTypesVisitor.java:580)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    public static X.C19883812qy LIZLLL(int r14, java.lang.Object[] r15, X.C19884112r1 r16) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19883812qy.LIZLLL(int, java.lang.Object[], X.12r1):X.12qy");
    }
}
