package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12eE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19804812eE extends AbstractC19810712fB {
    public static final Pair<String, Long> LJJII = new Pair<>("", 0L);
    public SharedPreferences LIZJ;
    public final Object LIZLLL;
    public SharedPreferences LJ;
    public C19807212ec LJFF;
    public final C19811012fE LJI;
    public final C19811112fF LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public final C19811012fE LJIIJJI;
    public final C19810912fD LJIIL;
    public final C19811112fF LJIILIIL;
    public final C19814212fk LJIILJJIL;
    public final C19810912fD LJIILL;
    public final C19811012fE LJIILLIIL;
    public final C19811012fE LJIIZILJ;
    public boolean LJIJ;
    public final C19810912fD LJIJI;
    public final C19810912fD LJIJJ;
    public final C19811012fE LJIJJLI;
    public final C19811112fF LJIL;
    public final C19811112fF LJJ;
    public final C19811012fE LJJI;
    public final C19814212fk LJJIFFI;

    @Override // X.AbstractC19810712fB
    public final boolean LJII() {
        return true;
    }

    public final void LJIILIIL() {
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(this.LIZ.LIZ, 0, "com.google.android.gms.measurement.prefs");
        this.LIZJ = sharedPreferencesLIZJ;
        boolean z = sharedPreferencesLIZJ.getBoolean("has_been_opened", false);
        this.LJIJ = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.LIZJ.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.LJFF = new C19807212ec(this, Math.max(0L, C19817012gC.LIZLLL.LIZ(null).longValue()));
    }

    public final SparseArray<Long> LJIJI() {
        Bundle bundleLIZ = this.LJIILJJIL.LIZ();
        if (bundleLIZ == null) {
            return new SparseArray<>();
        }
        int[] intArray = bundleLIZ.getIntArray("uriSources");
        long[] longArray = bundleLIZ.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            LJIILJJIL().LJFF.LIZJ("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final SharedPreferences LJIILLIIL() {
        LJ();
        LJFF();
        if (this.LJ == null) {
            synchronized (this.LIZLLL) {
                try {
                    if (this.LJ == null) {
                        String packageName = this.LIZ.LIZ.getPackageName();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(packageName);
                        sbLIZ.append("_preferences");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        LJIILJJIL().LJIILIIL.LIZ(strLIZIZ, "Default prefs file");
                        this.LJ = C810670Vr7.LIZJ(this.LIZ.LIZ, 0, strLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJ;
    }

    public final SharedPreferences LJIIZILJ() {
        LJ();
        LJFF();
        C0W3J.LJIIIIZZ(this.LIZJ);
        return this.LIZJ;
    }

    public final C19781812aW LJIJJ() {
        LJ();
        return C19781812aW.LIZJ(LJIIZILJ().getString("dma_consent_settings", null));
    }

    public final C19781912aX LJIJJLI() {
        LJ();
        return C19781912aX.LIZLLL(LJIIZILJ().getInt("consent_source", 100), LJIIZILJ().getString("consent_settings", "G1"));
    }

    public final Boolean LJIL() {
        LJ();
        if (LJIIZILJ().contains("measurement_enabled")) {
            return Boolean.valueOf(LJIIZILJ().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public C19804812eE(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LIZLLL = new Object();
        this.LJIIJJI = new C19811012fE(this, "session_timeout", 1800000L);
        this.LJIIL = new C19810912fD(this, "start_new_session", true);
        this.LJIILLIIL = new C19811012fE(this, "last_pause_time", 0L);
        this.LJIIZILJ = new C19811012fE(this, "session_id", 0L);
        this.LJIILIIL = new C19811112fF(this, "non_personalized_ads");
        this.LJIILJJIL = new C19814212fk(this, "last_received_uri_timestamps_by_source");
        this.LJIILL = new C19810912fD(this, "allow_remote_dynamite", false);
        this.LJI = new C19811012fE(this, "first_open_time", 0L);
        new C19811012fE(this, "app_install_time", 0L);
        this.LJII = new C19811112fF(this, "app_instance_id");
        this.LJIJI = new C19810912fD(this, "app_backgrounded", false);
        this.LJIJJ = new C19810912fD(this, "deep_link_retrieval_complete", false);
        this.LJIJJLI = new C19811012fE(this, "deep_link_retrieval_attempts", 0L);
        this.LJIL = new C19811112fF(this, "firebase_feature_rollouts");
        this.LJJ = new C19811112fF(this, "deferred_attribution_cache");
        this.LJJI = new C19811012fE(this, "deferred_attribution_cache_timestamp", 0L);
        this.LJJIFFI = new C19814212fk(this, "default_event_parameters");
    }

    public final void LJIIIIZZ(SparseArray<Long> sparseArray) {
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            iArr[i] = sparseArray.keyAt(i);
            jArr[i] = sparseArray.valueAt(i).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.LJIILJJIL.LIZIZ(bundle);
    }

    public final void LJIIIZ(Boolean bool) {
        LJ();
        SharedPreferences.Editor editorEdit = LJIIZILJ().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final boolean LJIIJ(int i) {
        return C19781912aX.LJIIIIZZ(i, LJIIZILJ().getInt("consent_source", 100));
    }

    public final boolean LJIIJJI(long j) {
        if (j - this.LJIIJJI.LIZ() > this.LJIILLIIL.LIZ()) {
            return true;
        }
        return false;
    }

    public final void LJIILL(boolean z) {
        LJ();
        LJIILJJIL().LJIILIIL.LIZ(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = LJIIZILJ().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }
}
