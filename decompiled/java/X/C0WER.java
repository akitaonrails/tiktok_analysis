package X;

/* JADX INFO: renamed from: X.0WER, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WER implements C0WFA {
    public static final C0WER LIZ = new C0WER();

    public static final void LIZ(InterfaceC820060WEy<?> interfaceC820060WEy) {
        C819850WEd c819850WEd = new C0WF0<C0WDU>() { // from class: X.0WEd
            public static final C0WEV LIZIZ = C0WEV.LIZIZ("logRequest");

            @Override // X.C0WF8
            public final void LIZ(Object obj, C0WF5 c0wf5) {
                c0wf5.LIZIZ(LIZIZ, ((C0WDU) obj).LIZ());
            }
        };
        C819930WEl c819930WEl = (C819930WEl) interfaceC820060WEy;
        c819930WEl.LIZ(C0WDU.class, c819850WEd);
        c819930WEl.LIZ(C0WDP.class, c819850WEd);
        C0WEJ c0wej = new C0WF0<C0WEI>() { // from class: X.0WEJ
            public static final C0WEV LIZIZ = C0WEV.LIZIZ("requestTimeMs");
            public static final C0WEV LIZJ = C0WEV.LIZIZ("requestUptimeMs");
            public static final C0WEV LIZLLL = C0WEV.LIZIZ("clientInfo");
            public static final C0WEV LJ = C0WEV.LIZIZ("logSource");
            public static final C0WEV LJFF = C0WEV.LIZIZ("logSourceName");
            public static final C0WEV LJI = C0WEV.LIZIZ("logEvent");
            public static final C0WEV LJII = C0WEV.LIZIZ("qosTier");

            @Override // X.C0WF8
            public final void LIZ(Object obj, C0WF5 c0wf5) {
                C0WEI c0wei = (C0WEI) obj;
                C0WF5 c0wf52 = c0wf5;
                c0wf52.LJ(LIZIZ, c0wei.LJFF());
                c0wf52.LJ(LIZJ, c0wei.LJI());
                c0wf52.LIZIZ(LIZLLL, c0wei.LIZ());
                c0wf52.LIZIZ(LJ, c0wei.LIZJ());
                c0wf52.LIZIZ(LJFF, c0wei.LIZLLL());
                c0wf52.LIZIZ(LJI, c0wei.LIZIZ());
                c0wf52.LIZIZ(LJII, c0wei.LJ());
            }
        };
        c819930WEl.LIZ(C0WEI.class, c0wej);
        c819930WEl.LIZ(C0WEH.class, c0wej);
        C0WEY c0wey = new C0WF0<C0WDQ>() { // from class: X.0WEY
            public static final C0WEV LIZIZ = C0WEV.LIZIZ("clientType");
            public static final C0WEV LIZJ = C0WEV.LIZIZ("androidClientInfo");

            @Override // X.C0WF8
            public final void LIZ(Object obj, C0WF5 c0wf5) {
                C0WDQ c0wdq = (C0WDQ) obj;
                C0WF5 c0wf52 = c0wf5;
                c0wf52.LIZIZ(LIZIZ, c0wdq.LIZIZ());
                c0wf52.LIZIZ(LIZJ, c0wdq.LIZ());
            }
        };
        c819930WEl.LIZ(C0WDQ.class, c0wey);
        c819930WEl.LIZ(C0WDF.class, c0wey);
        C0WF1 c0wf1 = new C0WF0<C0WF3>() { // from class: X.0WF1
            public static final C0WEV LIZIZ = C0WEV.LIZIZ("sdkVersion");
            public static final C0WEV LIZJ = C0WEV.LIZIZ("model");
            public static final C0WEV LIZLLL = C0WEV.LIZIZ("hardware");
            public static final C0WEV LJ = C0WEV.LIZIZ("device");
            public static final C0WEV LJFF = C0WEV.LIZIZ("product");
            public static final C0WEV LJI = C0WEV.LIZIZ("osBuild");
            public static final C0WEV LJII = C0WEV.LIZIZ("manufacturer");
            public static final C0WEV LJIIIIZZ = C0WEV.LIZIZ("fingerprint");
            public static final C0WEV LJIIIZ = C0WEV.LIZIZ("locale");
            public static final C0WEV LJIIJ = C0WEV.LIZIZ("country");
            public static final C0WEV LJIIJJI = C0WEV.LIZIZ("mccMnc");
            public static final C0WEV LJIIL = C0WEV.LIZIZ("applicationBuild");

            @Override // X.C0WF8
            public final void LIZ(Object obj, C0WF5 c0wf5) {
                C0WF3 c0wf3 = (C0WF3) obj;
                C0WF5 c0wf52 = c0wf5;
                c0wf52.LIZIZ(LIZIZ, c0wf3.LJIIJJI());
                c0wf52.LIZIZ(LIZJ, c0wf3.LJIIIIZZ());
                c0wf52.LIZIZ(LIZLLL, c0wf3.LJ());
                c0wf52.LIZIZ(LJ, c0wf3.LIZJ());
                c0wf52.LIZIZ(LJFF, c0wf3.LJIIJ());
                c0wf52.LIZIZ(LJI, c0wf3.LJIIIZ());
                c0wf52.LIZIZ(LJII, c0wf3.LJI());
                c0wf52.LIZIZ(LJIIIIZZ, c0wf3.LIZLLL());
                c0wf52.LIZIZ(LJIIIZ, c0wf3.LJFF());
                c0wf52.LIZIZ(LJIIJ, c0wf3.LIZIZ());
                c0wf52.LIZIZ(LJIIJJI, c0wf3.LJII());
                c0wf52.LIZIZ(LJIIL, c0wf3.LIZ());
            }
        };
        c819930WEl.LIZ(C0WF3.class, c0wf1);
        c819930WEl.LIZ(C0WF2.class, c0wf1);
        C819820WEa c819820WEa = new C0WF0<AbstractC819840WEc>() { // from class: X.0WEa
            public static final C0WEV LIZIZ = C0WEV.LIZIZ("eventTimeMs");
            public static final C0WEV LIZJ = C0WEV.LIZIZ("eventCode");
            public static final C0WEV LIZLLL = C0WEV.LIZIZ("eventUptimeMs");
            public static final C0WEV LJ = C0WEV.LIZIZ("sourceExtension");
            public static final C0WEV LJFF = C0WEV.LIZIZ("sourceExtensionJsonProto3");
            public static final C0WEV LJI = C0WEV.LIZIZ("timezoneOffsetSeconds");
            public static final C0WEV LJII = C0WEV.LIZIZ("networkConnectionInfo");

            @Override // X.C0WF8
            public final void LIZ(Object obj, C0WF5 c0wf5) {
                AbstractC819840WEc abstractC819840WEc = (AbstractC819840WEc) obj;
                C0WF5 c0wf52 = c0wf5;
                c0wf52.LJ(LIZIZ, abstractC819840WEc.LIZIZ());
                c0wf52.LIZIZ(LIZJ, abstractC819840WEc.LIZ());
                c0wf52.LJ(LIZLLL, abstractC819840WEc.LIZJ());
                c0wf52.LIZIZ(LJ, abstractC819840WEc.LJ());
                c0wf52.LIZIZ(LJFF, abstractC819840WEc.LJFF());
                c0wf52.LJ(LJI, abstractC819840WEc.LJI());
                c0wf52.LIZIZ(LJII, abstractC819840WEc.LIZLLL());
            }
        };
        c819930WEl.LIZ(AbstractC819840WEc.class, c819820WEa);
        c819930WEl.LIZ(C819830WEb.class, c819820WEa);
        C0WEW c0wew = new C0WF0<C0WDR>() { // from class: X.0WEW
            public static final C0WEV LIZIZ = C0WEV.LIZIZ("networkType");
            public static final C0WEV LIZJ = C0WEV.LIZIZ("mobileSubtype");

            @Override // X.C0WF8
            public final void LIZ(Object obj, C0WF5 c0wf5) {
                C0WDR c0wdr = (C0WDR) obj;
                C0WF5 c0wf52 = c0wf5;
                c0wf52.LIZIZ(LIZIZ, c0wdr.LIZIZ());
                c0wf52.LIZIZ(LIZJ, c0wdr.LIZ());
            }
        };
        c819930WEl.LIZ(C0WDR.class, c0wew);
        c819930WEl.LIZ(C0WDG.class, c0wew);
    }
}
