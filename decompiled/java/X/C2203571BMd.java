package X;

import android.content.Context;

/* JADX INFO: renamed from: X.1BMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203571BMd {
    public static final C2203571BMd LJIILLIIL = new C2203571BMd();
    public Context LIZ;
    public C0WT0 LIZIZ;
    public boolean LIZJ;
    public final C2203641BMk LIZLLL = new C810410Vqh<Boolean>() { // from class: X.1BMk
        @Override // X.C810410Vqh
        public final Boolean LIZIZ() {
            return Boolean.valueOf(C805560Vis.LIZLLL().LIZ.getBoolean("enable", true));
        }
    };
    public final C2203671BMn LJ = new C810410Vqh<Integer>() { // from class: X.1BMn
        @Override // X.C810410Vqh
        public final Integer LIZIZ() {
            return Integer.valueOf(C805560Vis.LIZLLL().LIZ(6, "maxCrashCount"));
        }
    };
    public final C2203681BMo LJFF = new C810410Vqh<Integer>() { // from class: X.1BMo
        @Override // X.C810410Vqh
        public final Integer LIZIZ() {
            return Integer.valueOf(C805560Vis.LIZLLL().LIZ(3, "clearDataThreshold"));
        }
    };
    public final C2203691BMp LJI = new C810410Vqh<Long>() { // from class: X.1BMp
        @Override // X.C810410Vqh
        public final Long LIZIZ() {
            return Long.valueOf(C805560Vis.LIZLLL().LIZIZ(180000L, "maxStartStageDuration"));
        }
    };
    public final C2203701BMq LJII = new C810410Vqh<Long>() { // from class: X.1BMq
        @Override // X.C810410Vqh
        public final Long LIZIZ() {
            return Long.valueOf(C805560Vis.LIZLLL().LIZIZ(600000L, "requestQuietPeriod"));
        }
    };
    public final C2203711BMr LJIIIIZZ = new C810410Vqh<Long>() { // from class: X.1BMr
        @Override // X.C810410Vqh
        public final Long LIZIZ() {
            return Long.valueOf(C805560Vis.LIZLLL().LIZIZ(86400000L, "protectedPeriod"));
        }
    };
    public final C2203721BMs LJIIIZ = new C810410Vqh<Long>() { // from class: X.1BMs
        @Override // X.C810410Vqh
        public final Long LIZIZ() {
            return Long.valueOf(C805560Vis.LIZLLL().LIZIZ(2L, "accumulativeCrashCount"));
        }
    };
    public final C2203731BMt LJIIJ = new C810410Vqh<Long>() { // from class: X.1BMt
        @Override // X.C810410Vqh
        public final Long LIZIZ() {
            return Long.valueOf(C805560Vis.LIZLLL().LIZIZ(5L, "maxCrashInQuietCount"));
        }
    };
    public final C2203741BMu LJIIJJI = new C810410Vqh<Long>() { // from class: X.1BMu
        @Override // X.C810410Vqh
        public final Long LIZIZ() {
            return Long.valueOf(C805560Vis.LIZLLL().LIZIZ(5400000L, "smartRequestQuietPeriod"));
        }
    };
    public final C2203651BMl LJIIL = new C810410Vqh<Long>() { // from class: X.1BMl
        @Override // X.C810410Vqh
        public final Long LIZIZ() {
            return Long.valueOf(C805560Vis.LIZLLL().LIZIZ(2L, "smartAccumulativeCrashCount"));
        }
    };
    public final C2203661BMm LJIILIIL = new C810410Vqh<Long>() { // from class: X.1BMm
        @Override // X.C810410Vqh
        public final Long LIZIZ() {
            return Long.valueOf(C805560Vis.LIZLLL().LIZIZ(5L, "smartMaxCrashInQuietCount"));
        }
    };
    public final C2203761BMw LJIILJJIL = new C810410Vqh<String>() { // from class: X.1BMw
        @Override // X.C810410Vqh
        public final String LIZIZ() {
            return C805560Vis.LIZLLL().LIZJ("cloudExceptionList", "");
        }
    };
    public final C2203631BMj LJIILL = new C810410Vqh<Float>() { // from class: X.1BMj
        @Override // X.C810410Vqh
        public final Float LIZIZ() {
            return Float.valueOf(C805560Vis.LIZLLL().LIZ.getFloat("stackSameThreshold", -1.0f));
        }
    };

    public final synchronized void LIZIZ() {
        if (!this.LIZJ) {
            C2203641BMk c2203641BMk = this.LIZLLL;
            C805560Vis c805560VisLIZLLL = C805560Vis.LIZLLL();
            c2203641BMk.LIZJ(Boolean.valueOf(c805560VisLIZLLL.LIZ.getBoolean("enable", LIZ().booleanValue())));
            LIZJ(Integer.valueOf(C805560Vis.LIZLLL().LIZ(LIZ().intValue(), "maxCrashCount")));
            LIZJ(Integer.valueOf(C805560Vis.LIZLLL().LIZ(LIZ().intValue(), "clearDataThreshold")));
            LIZJ(Long.valueOf(C805560Vis.LIZLLL().LIZIZ(LIZ().longValue(), "maxStartStageDuration")));
            LIZJ(Long.valueOf(C805560Vis.LIZLLL().LIZIZ(LIZ().longValue(), "requestQuietPeriod")));
            LIZJ(Long.valueOf(C805560Vis.LIZLLL().LIZIZ(LIZ().longValue(), "protectedPeriod")));
            LIZJ(Long.valueOf(C805560Vis.LIZLLL().LIZIZ(LIZ().longValue(), "accumulativeCrashCount")));
            LIZJ(Long.valueOf(C805560Vis.LIZLLL().LIZIZ(LIZ().longValue(), "maxCrashInQuietCount")));
            LIZJ(Long.valueOf(C805560Vis.LIZLLL().LIZIZ(LIZ().longValue(), "smartRequestQuietPeriod")));
            LIZJ(Long.valueOf(C805560Vis.LIZLLL().LIZIZ(LIZ().longValue(), "smartAccumulativeCrashCount")));
            LIZJ(Long.valueOf(C805560Vis.LIZLLL().LIZIZ(LIZ().longValue(), "smartMaxCrashInQuietCount")));
            LIZJ(C805560Vis.LIZLLL().LIZJ("cloudExceptionList", LIZ()));
            C2203631BMj c2203631BMj = this.LJIILL;
            C805560Vis c805560VisLIZLLL2 = C805560Vis.LIZLLL();
            c2203631BMj.LIZJ(Float.valueOf(c805560VisLIZLLL2.LIZ.getFloat("stackSameThreshold", LIZ().floatValue())));
            this.LIZJ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("<loadData> finish Config=");
            sbLIZ.append(LJIILLIIL);
            C2200391B9x.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final long LIZ() {
        return LIZ().longValue();
    }

    public final void LIZJ() {
        C805560Vis c805560VisLIZLLL = C805560Vis.LIZLLL();
        c805560VisLIZLLL.LIZ.edit().putBoolean("enable", LIZ().booleanValue()).apply();
        C805560Vis.LIZLLL().LJI(LIZ().intValue(), "maxCrashCount");
        C805560Vis.LIZLLL().LJI(LIZ().intValue(), "clearDataThreshold");
        C805560Vis.LIZLLL().LJII(LIZ().longValue(), "maxStartStageDuration");
        C805560Vis.LIZLLL().LJII(LIZ().longValue(), "requestQuietPeriod");
        C805560Vis.LIZLLL().LJII(LIZ().longValue(), "protectedPeriod");
        C805560Vis.LIZLLL().LJII(LIZ().longValue(), "accumulativeCrashCount");
        C805560Vis.LIZLLL().LJII(LIZ().longValue(), "maxCrashInQuietCount");
        C805560Vis.LIZLLL().LJII(LIZ().longValue(), "smartRequestQuietPeriod");
        C805560Vis.LIZLLL().LJII(LIZ().longValue(), "smartAccumulativeCrashCount");
        C805560Vis.LIZLLL().LJII(LIZ().longValue(), "smartMaxCrashInQuietCount");
        C805560Vis.LIZLLL().LJIIIIZZ("cloudExceptionList", LIZ());
        C805560Vis c805560VisLIZLLL2 = C805560Vis.LIZLLL();
        c805560VisLIZLLL2.LIZ.edit().putFloat("stackSameThreshold", LIZ().floatValue()).apply();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<saveData> finish Config=");
        sbLIZ.append(LJIILLIIL);
        C2200391B9x.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SafeModeConfig{enable=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", maxCrashCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maxStartStageDuration=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", requestQuietPeriod=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", protectedPeriod=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", accumulativeCrashCount=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", maxCrashInQuietCount=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", smartRequestQuietPeriod=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", smartAccumulativeCrashCount=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", smartMaxCrashInQuietCount=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", cloudExceptionList=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", stackSameThreshold=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
