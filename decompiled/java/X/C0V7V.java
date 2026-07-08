package X;

/* JADX INFO: renamed from: X.0V7V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V7V {
    public static final C0V7V LJ = new C0V7V();
    public C792540V7c LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public C0V8H LIZLLL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0V8H] */
    public final synchronized void LIZ() {
        if (this.LIZJ) {
            return;
        }
        C792540V7c c792540V7c = this.LIZ;
        if (c792540V7c != null && c792540V7c.LIZ && c792540V7c.LJIIL) {
            if (C792420V6q.LJIILJJIL()) {
                this.LIZJ = true;
                this.LIZLLL = new AbstractRunnableC792500V6y() { // from class: X.0V8H
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("DiskCollector@7bd5.collect$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("DiskCollector@7bd5.collect$1");
                    }

                    /* JADX WARN: Removed duplicated region for block: B:113:0x03a6  */
                    /* JADX WARN: Removed duplicated region for block: B:117:0x03e4  */
                    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
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
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ() {
                        /*
                            Method dump skipped, instruction units count: 1022
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0V8H.LIZ():void");
                    }
                };
                C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT).LIZJ(this.LIZLLL);
            }
        }
    }

    public final synchronized void LIZIZ(C792540V7c c792540V7c) {
        if (c792540V7c == null) {
            return;
        }
        this.LIZ = c792540V7c;
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateConfig:");
            sbLIZ.append(c792540V7c);
            C792910V8n.LIZ("APM-Disk", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!this.LIZIZ) {
            return;
        }
        C0V7R c0v7r = (C0V7R) C792590V7h.LIZ(C0V7R.class);
        if (c0v7r != null && !c0v7r.isForeground()) {
            LIZ();
        }
    }
}
