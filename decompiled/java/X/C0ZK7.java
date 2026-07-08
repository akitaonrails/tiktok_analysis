package X;

/* JADX INFO: renamed from: X.0ZK7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZK7 implements C0ZK6 {
    public final C1231704rr LIZ = new C1231704rr("[AS][LifecycleMonitorRootPageMonitorImpl]", null, 6);

    @Override // X.C0ZK6
    public final boolean LIZIZ() {
        boolean zLJI = C1906580ziK.LJI();
        C1231704rr c1231704rr = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callIsInBackground ");
        sbLIZ.append(zLJI);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        return zLJI;
    }

    @Override // X.C0ZK6
    public final void LIZ(final C897590ZJd c897590ZJd) {
        this.LIZ.LIZIZ();
        C1906580ziK.LIZJ().LIZJ().LJLLLLLL(new C09JN() { // from class: X.0ZK8
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LifecycleMonitorRootPageMonitorImpl@6700.addActivityStatusLifecycleObserver$1");
                if (((Boolean) obj).booleanValue()) {
                    C0ZK7 c0zk7 = this.LL;
                    C0ZKA c0zka = c897590ZJd;
                    c0zk7.getClass();
                    c0zka.onStop();
                    c0zk7.LIZ.LIZIZ();
                } else {
                    C0ZK7 c0zk72 = this.LL;
                    C0ZKA c0zka2 = c897590ZJd;
                    c0zk72.getClass();
                    c0zka2.onStart();
                    c0zk72.LIZ.LIZIZ();
                }
                C1C7U.LIZIZ("LifecycleMonitorRootPageMonitorImpl@6700.addActivityStatusLifecycleObserver$1");
            }
        });
        if (!C1906580ziK.LJI()) {
            this.LIZ.LIZIZ();
            c897590ZJd.onStart();
            this.LIZ.LIZIZ();
        }
        C1906580ziK.LIZJ().LJIIIIZZ().LJLLLLLL(new C09JN() { // from class: X.0ZK9
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LifecycleMonitorRootPageMonitorImpl@6700.addActivityStatusLifecycleObserver$2");
                C0ZK7 c0zk7 = this.LL;
                C0ZKA c0zka = c897590ZJd;
                c0zk7.getClass();
                c0zka.onDestroy();
                c0zk7.LIZ.LIZIZ();
                C1C7U.LIZIZ("LifecycleMonitorRootPageMonitorImpl@6700.addActivityStatusLifecycleObserver$2");
            }
        });
    }
}
