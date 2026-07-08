package X;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzno;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* JADX INFO: renamed from: X.12eA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19804412eA extends AbstractC19810512f9 {
    public C19805112eH LIZJ;
    public InterfaceC19813312fb LIZLLL;
    public final Set<InterfaceC19813012fY> LJ;
    public boolean LJFF;
    public final AtomicReference<String> LJI;
    public final Object LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public C19811712fL LJIIJ;
    public PriorityQueue<zzmu> LJIIJJI;
    public C19781912aX LJIIL;
    public final AtomicLong LJIILIIL;
    public long LJIILJJIL;
    public final C19806312eT LJIILL;
    public boolean LJIILLIIL;
    public C19800812da LJIIZILJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC19810412f8 LJIJ;
    public C19811812fM LJIJI;
    public final C19800312dV LJIJJ;

    @Override // X.AbstractC19810512f9
    public final boolean LJIILL() {
        return false;
    }

    public final void LJJIZ() {
        LJ();
        String strLIZ = LIZIZ().LJIILIIL.LIZ();
        if (strLIZ != null) {
            if ("unset".equals(strLIZ)) {
                this.LIZ.LJIILIIL.getClass();
                LJJIFFI("app", "_npa", null, System.currentTimeMillis());
            } else {
                Long lValueOf = Long.valueOf("true".equals(strLIZ) ? 1L : 0L);
                this.LIZ.LJIILIIL.getClass();
                LJJIFFI("app", "_npa", lValueOf, System.currentTimeMillis());
            }
        }
        if (this.LIZ.LJFF() && this.LJIILLIIL) {
            LJIILJJIL().LJIIL.LIZJ("Recording app launch after enabling measurement for the first time (FE)");
            LJJIJIIJIL();
            LJIIJ().LJ.LIZ();
            LJIIL().LJIILL(new Runnable() { // from class: X.12eK
                public final void LIZ() {
                    C19806312eT c19806312eT = this.LL.LJIILL;
                    c19806312eT.LIZ.LJIIL().LJ();
                    if (c19806312eT.LIZIZ()) {
                        if (c19806312eT.LIZJ()) {
                            c19806312eT.LIZ.LJIIJJI().LJJ.LIZIZ(null);
                            Bundle bundle = new Bundle();
                            C786410Ut5.LJJJI("source", "(not set)", bundle);
                            C786410Ut5.LJJJI("medium", "(not set)", bundle);
                            C786410Ut5.LJJJI("_cis", "intent", bundle);
                            bundle.putLong("_cc", 1L);
                            c19806312eT.LIZ.LJIILIIL().LJJJIL("auto", "_cmpx", bundle);
                        } else {
                            String strLIZ2 = c19806312eT.LIZ.LJIIJJI().LJJ.LIZ();
                            if (TextUtils.isEmpty(strLIZ2)) {
                                c19806312eT.LIZ.LJIILJJIL().LJI.LIZJ("Cache still valid but referrer not found");
                            } else {
                                long jLIZ = ((c19806312eT.LIZ.LJIIJJI().LJJI.LIZ() / 3600000) - 1) * 3600000;
                                Uri uri = UriProtector.parse(strLIZ2);
                                Bundle bundle2 = new Bundle();
                                Pair pair = new Pair(uri.getPath(), bundle2);
                                for (String str : UriProtector.getQueryParameterNames(uri)) {
                                    C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle2);
                                }
                                ((BaseBundle) pair.second).putLong("_cc", jLIZ);
                                Object obj = pair.first;
                                c19806312eT.LIZ.LJIILIIL().LJJJIL(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                            }
                            c19806312eT.LIZ.LJIIJJI().LJJ.LIZIZ(null);
                        }
                        c19806312eT.LIZ.LJIIJJI().LJJI.LIZIZ(0L);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzjm@3944.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzjm@3944.run");
                }
            });
            return;
        }
        LJIILJJIL().LJIIL.LIZJ("Updating Scion state (FE)");
        final C19804512eB c19804512eBLJIIIZ = LJIIIZ();
        c19804512eBLJIIIZ.LJ();
        c19804512eBLJIIIZ.LJIIJJI();
        final zzn zznVarLJJIIZ = c19804512eBLJIIIZ.LJJIIZ(true);
        c19804512eBLJIIIZ.LJIIZILJ(new Runnable() { // from class: X.12dh
            public final void LIZ() {
                C19804512eB c19804512eB = c19804512eBLJIIIZ;
                InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                if (interfaceC19802012dm == null) {
                    c19804512eB.LJIILJJIL().LJFF.LIZJ("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    C0W3J.LJIIIIZZ(zznVarLJJIIZ);
                    interfaceC19802012dm.F(zznVarLJJIIZ);
                    c19804512eBLJIIIZ.LJJIIJZLJL();
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c19804512eBLJIIIZ.LJIILJJIL().LJFF.LIZ(e, "Failed to send measurementEnabled to the service");
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzlr@3987.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzlr@3987.run");
            }
        });
    }

    public final PriorityQueue<zzmu> LJJIJIIJI() {
        if (this.LJIIJJI == null) {
            this.LJIIJJI = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: X.12fO
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((zzmu) obj).zzb);
                }
            }, new Comparator() { // from class: X.0uKM
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.LJIIJJI;
    }

    public final void LJJIJIL() {
        if (!(C786410Ut5.N3(this.LIZ.LIZ) instanceof Application) || this.LIZJ == null) {
            return;
        }
        ((Application) C786410Ut5.N3(this.LIZ.LIZ)).unregisterActivityLifecycleCallbacks(this.LIZJ);
    }

    public final void LJJIJLIJ() {
        String string;
        int i;
        int i2;
        String string2;
        int i3;
        Bundle bundle;
        String str;
        int iLIZIZ;
        LJ();
        LJIILJJIL().LJIIL.LIZJ("Handle tcf update.");
        SharedPreferences sharedPreferencesLJIILLIIL = LIZIZ().LJIILLIIL();
        HashMap map = new HashMap();
        try {
            string = sharedPreferencesLJIILLIIL.getString("IABTCF_VendorConsents", "\u0000");
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            string = "\u0000";
        }
        if (!"\u0000".equals(string) && string.length() > 754) {
            map.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        try {
            i = sharedPreferencesLJIILLIIL.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException e2) {
            TryCatchGuardChecker.doCheck(e2);
            i = -1;
        }
        if (i != -1) {
            map.put("gdprApplies", String.valueOf(i));
        }
        try {
            i2 = sharedPreferencesLJIILLIIL.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException e3) {
            TryCatchGuardChecker.doCheck(e3);
            i2 = -1;
        }
        if (i2 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(i2));
        }
        try {
            int i4 = sharedPreferencesLJIILLIIL.getInt("IABTCF_PolicyVersion", -1);
            if (i4 != -1) {
                map.put("PolicyVersion", String.valueOf(i4));
            }
        } catch (ClassCastException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            string2 = sharedPreferencesLJIILLIIL.getString("IABTCF_PurposeConsents", "\u0000");
        } catch (ClassCastException e5) {
            TryCatchGuardChecker.doCheck(e5);
            string2 = "\u0000";
        }
        if (!"\u0000".equals(string2)) {
            map.put("PurposeConsents", string2);
        }
        try {
            i3 = sharedPreferencesLJIILLIIL.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException e6) {
            TryCatchGuardChecker.doCheck(e6);
            i3 = -1;
        }
        if (i3 != -1) {
            map.put("CmpSdkID", String.valueOf(i3));
        }
        C1287780jcG c1287780jcG = new C1287780jcG(map);
        LJIILJJIL().LJIILIIL.LIZ(c1287780jcG, "Tcf preferences read");
        C19804812eE c19804812eELIZIZ = LIZIZ();
        c19804812eELIZIZ.LJ();
        String string3 = c19804812eELIZIZ.LJIIZILJ().getString("stored_tcf_param", "");
        String strLIZ = c1287780jcG.LIZ();
        if (strLIZ.equals(string3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = c19804812eELIZIZ.LJIIZILJ().edit();
        editorEdit.putString("stored_tcf_param", strLIZ);
        editorEdit.apply();
        if ("1".equals(((HashMap) c1287780jcG.LIZ).get("GoogleConsent")) && "1".equals(((HashMap) c1287780jcG.LIZ).get("gdprApplies")) && "1".equals(((HashMap) c1287780jcG.LIZ).get("EnableAdvertiserConsentMode")) && 1 != 0 && (iLIZIZ = c1287780jcG.LIZIZ()) >= 0) {
            String str2 = (String) ((HashMap) c1287780jcG.LIZ).get("PurposeConsents");
            if (TextUtils.isEmpty(str2)) {
                bundle = Bundle.EMPTY;
            } else {
                bundle = new Bundle();
                if (str2.length() > 0) {
                    C786410Ut5.LJJJI(EnumC19776112Zb.AD_STORAGE.zze, str2.charAt(0) == '1' ? "granted" : "denied", bundle);
                }
                if (str2.length() > 3) {
                    C786410Ut5.LJJJI(EnumC19776112Zb.AD_PERSONALIZATION.zze, (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied", bundle);
                }
                if (str2.length() > 6 && iLIZIZ >= 4) {
                    C786410Ut5.LJJJI(EnumC19776112Zb.AD_USER_DATA.zze, (str2.charAt(0) == '1' && str2.charAt(6) == '1') ? "granted" : "denied", bundle);
                }
            }
        } else {
            bundle = Bundle.EMPTY;
        }
        LJIILJJIL().LJIILIIL.LIZ(bundle, "Consent generated from Tcf");
        if (bundle != Bundle.EMPTY) {
            this.LIZ.LJIILIIL.getClass();
            LJIJJ(bundle, -30, System.currentTimeMillis());
        }
        Bundle bundle2 = new Bundle();
        StringBuilder sb = new StringBuilder("1");
        try {
            str = (String) ((HashMap) c1287780jcG.LIZ).get("CmpSdkID");
        } catch (NumberFormatException e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        int i5 = !TextUtils.isEmpty(str) ? CastIntegerProtector.parseInt(str) : -1;
        if (i5 < 0 || i5 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((i5 >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i5 & 63));
        }
        int iLIZIZ2 = c1287780jcG.LIZIZ();
        if (iLIZIZ2 < 0 || iLIZIZ2 > 63) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iLIZIZ2));
        }
        int i6 = ("1".equals(((HashMap) c1287780jcG.LIZ).get("gdprApplies")) ? 2 : 0) | 4;
        if ("1".equals(((HashMap) c1287780jcG.LIZ).get("EnableAdvertiserConsentMode"))) {
            i6 |= 8;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i6));
        C786410Ut5.LJJJI("_tcfd", sb.toString(), bundle2);
        LJJJIL("auto", "_tcf", bundle2);
    }

    public final void LJJIJIIJIL() {
        LJ();
        LJIIJJI();
        if (this.LIZ.LJI()) {
            Boolean boolLJIIZILJ = this.LIZ.LJI.LJIIZILJ("google_analytics_deferred_deep_link_enabled");
            if (boolLJIIZILJ != null && boolLJIIZILJ.booleanValue()) {
                LJIILJJIL().LJIIL.LIZJ("Deferred Deep Link feature enabled.");
                LJIIL().LJIILL(new Runnable() { // from class: X.12de
                    /* JADX WARN: Type inference failed for: r1v1, types: [X.12da] */
                    public final void LIZ() {
                        final C19804412eA c19804412eA = this.LL;
                        c19804412eA.LJ();
                        if (c19804412eA.LIZIZ().LJIJJ.LIZIZ()) {
                            c19804412eA.LJIILJJIL().LJIIL.LIZJ("Deferred Deep Link already retrieved. Not fetching again.");
                            return;
                        }
                        long jLIZ = c19804412eA.LIZIZ().LJIJJLI.LIZ();
                        c19804412eA.LIZIZ().LJIJJLI.LIZIZ(1 + jLIZ);
                        if (jLIZ >= 5) {
                            c19804412eA.LJIILJJIL().LJIIIIZZ.LIZJ("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                            c19804412eA.LIZIZ().LJIJJ.LIZ(true);
                        } else {
                            if (c19804412eA.LJIIZILJ == null) {
                                c19804412eA.LJIIZILJ = new AbstractC19809612f0(c19804412eA.LIZ) { // from class: X.12da
                                    @Override // X.AbstractC19809612f0
                                    public final void LIZJ() throws Throwable {
                                        Pair pair;
                                        Bundle bundle;
                                        C19804712eD c19804712eD = c19804412eA.LIZ;
                                        c19804712eD.LJIIL().LJ();
                                        C19804712eD.LJ(c19804712eD.LJIIZILJ);
                                        C19804712eD.LJ(c19804712eD.LJIIZILJ);
                                        String strLJIILLIIL = c19804712eD.LJIIJ().LJIILLIIL();
                                        C19804812eE c19804812eELJIIJJI = c19804712eD.LJIIJJI();
                                        c19804812eELJIIJJI.LJ();
                                        if (c19804812eELJIIJJI.LJIJJLI().LJIIIZ(EnumC19776112Zb.AD_STORAGE)) {
                                            c19804812eELJIIJJI.LIZ.LJIILIIL.getClass();
                                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                                            if (c19804812eELJIIJJI.LJIIIIZZ == null || jElapsedRealtime >= c19804812eELJIIJJI.LJIIJ) {
                                                C19791812c8 c19791812c8 = c19804812eELJIIJJI.LIZ.LJI;
                                                c19791812c8.getClass();
                                                c19804812eELJIIJJI.LJIIJ = jElapsedRealtime + c19791812c8.LJIIJJI(strLJIILLIIL, C19817012gC.LIZIZ);
                                                try {
                                                    AdvertisingIdClient.Info info = (C10EU.LJIILIIL() && C20123813oa.LIZ()) ? new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true) : C2204961BRm.LLLLLILLIL(c19804812eELJIIJJI.LIZ.LIZ, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOID9zPVdd3eEmUDB28eQ", new String[]{"016a9"}));
                                                    c19804812eELJIIJJI.LJIIIIZZ = "";
                                                    String strLLLLLIL = C2204961BRm.LLLLLIL(info, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOID9zPVdd3eEmUDB28eQ", new String[]{"016a9"}));
                                                    if (strLLLLLIL != null) {
                                                        c19804812eELJIIJJI.LJIIIIZZ = strLLLLLIL;
                                                    }
                                                    c19804812eELJIIJJI.LJIIIZ = info.LIZIZ;
                                                } catch (Exception e) {
                                                    TryCatchGuardChecker.doCheck(e);
                                                    c19804812eELJIIJJI.LJIILJJIL().LJIIL.LIZ(e, "Unable to get advertising id");
                                                    c19804812eELJIIJJI.LJIIIIZZ = "";
                                                }
                                                pair = new Pair(c19804812eELJIIJJI.LJIIIIZZ, Boolean.valueOf(c19804812eELJIIJJI.LJIIIZ));
                                            } else {
                                                pair = new Pair(c19804812eELJIIJJI.LJIIIIZZ, Boolean.valueOf(c19804812eELJIIJJI.LJIIIZ));
                                            }
                                        } else {
                                            pair = new Pair("", Boolean.FALSE);
                                        }
                                        Boolean boolLJIIZILJ2 = c19804712eD.LJI.LJIIZILJ("google_analytics_adid_collection_enabled");
                                        if ((boolLJIIZILJ2 != null && !boolLJIIZILJ2.booleanValue()) || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                                            c19804712eD.LJIILJJIL().LJIIL.LIZJ("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                                            return;
                                        }
                                        C19804712eD.LJ(c19804712eD.LJIIZILJ);
                                        C19810012f4 c19810012f4 = c19804712eD.LJIIZILJ;
                                        c19810012f4.LJFF();
                                        ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(c19810012f4.LIZ.LIZ, "connectivity");
                                        if (connectivityManager != null) {
                                            try {
                                                NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager);
                                                if (networkInfoLJIJ != null && networkInfoLJIJ.isConnected()) {
                                                    StringBuilder sb = new StringBuilder();
                                                    C19804512eB c19804512eBLJIILL = c19804712eD.LJIILL();
                                                    c19804512eBLJIILL.LJ();
                                                    c19804512eBLJIILL.LJIIJJI();
                                                    if (!c19804512eBLJIILL.LJJIII() || c19804512eBLJIILL.LIZJ().LJJLIIJ() >= 234200) {
                                                        C19804412eA c19804412eALJIILIIL = c19804712eD.LJIILIIL();
                                                        c19804412eALJIILIIL.LJ();
                                                        C19804512eB c19804512eBLJIIIZ = c19804412eALJIILIIL.LJIIIZ();
                                                        c19804512eBLJIIIZ.LJ();
                                                        c19804512eBLJIIIZ.LJIIJJI();
                                                        InterfaceC19802012dm interfaceC19802012dm = c19804512eBLJIIIZ.LIZLLL;
                                                        if (interfaceC19802012dm == null) {
                                                            c19804512eBLJIIIZ.LJIL();
                                                            c19804512eBLJIIIZ.LJIILJJIL().LJIIL.LIZJ("Failed to get consents; not connected to service yet.");
                                                        } else {
                                                            try {
                                                                zzal zzalVarH = interfaceC19802012dm.h(c19804512eBLJIIIZ.LJJIIZ(false));
                                                                c19804512eBLJIIIZ.LJJIIJZLJL();
                                                                if (zzalVarH != null && (bundle = zzalVarH.zza) != null) {
                                                                    C19781912aX c19781912aXLIZJ = C19781912aX.LIZJ(100, bundle);
                                                                    sb.append("&gcs=");
                                                                    sb.append(c19781912aXLIZJ.LJIILLIIL());
                                                                    C19781812aW c19781812aWLIZIZ = C19781812aW.LIZIZ(100, bundle);
                                                                    sb.append("&dma=");
                                                                    sb.append(c19781812aWLIZIZ.LIZJ == Boolean.FALSE ? 0 : 1);
                                                                    if (!TextUtils.isEmpty(c19781812aWLIZIZ.LIZLLL)) {
                                                                        sb.append("&dma_cps=");
                                                                        sb.append(c19781812aWLIZIZ.LIZLLL);
                                                                    }
                                                                    int i = C19781812aW.LIZ(bundle) == Boolean.TRUE ? 0 : 1;
                                                                    sb.append("&npa=");
                                                                    sb.append(i);
                                                                    c19804712eD.LJIILJJIL().LJIILIIL.LIZ(sb, "Consent query parameters to Bow");
                                                                }
                                                            } catch (RemoteException e2) {
                                                                TryCatchGuardChecker.doCheck(e2);
                                                                c19804512eBLJIIIZ.LJIILJJIL().LJFF.LIZ(e2, "Failed to get consents; remote exception");
                                                            }
                                                        }
                                                        int i2 = c19804712eD.LJJIIZI;
                                                        c19804712eD.LJJIIZI = i2 + 1;
                                                        boolean z = i2 < 10;
                                                        c19804712eD.LJIILJJIL().LJIIL.LIZ(Integer.valueOf(c19804712eD.LJJIIZI), "Failed to retrieve DMA consent from the service, " + (z ? "Retrying." : "Skipping.") + " retryCount");
                                                        if (z) {
                                                            LIZIZ(2000L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    C19803112dx c19803112dxLJIILLIIL = c19804712eD.LJIILLIIL();
                                                    c19804712eD.LJIIJ();
                                                    String str = (String) pair.first;
                                                    long jLIZ2 = c19804712eD.LJIIJJI().LJIJJLI.LIZ() - 1;
                                                    String string = sb.toString();
                                                    c19803112dxLJIILLIIL.getClass();
                                                    try {
                                                        C0W3J.LJI(str);
                                                        C0W3J.LJI(strLJIILLIIL);
                                                        String strJ4 = C786410Ut5.j4("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{C786410Ut5.j4("v%s.%s", new Object[]{95001L, Integer.valueOf(c19803112dxLJIILLIIL.LJJLIIJ())}), str, strLJIILLIIL, Long.valueOf(jLIZ2)});
                                                        if (strLJIILLIIL.equals(c19803112dxLJIILLIIL.LIZ.LJI.LJIJ("debug.deferred.deeplink", ""))) {
                                                            strJ4 = strJ4.concat("&ddl_test=1");
                                                        }
                                                        if (!string.isEmpty()) {
                                                            if (string.charAt(0) != '&') {
                                                                strJ4 = strJ4.concat("&");
                                                            }
                                                            strJ4 = strJ4.concat(string);
                                                        }
                                                        URL url = new URL(strJ4);
                                                        C19804712eD.LJ(c19804712eD.LJIIZILJ);
                                                        C19810012f4 c19810012f42 = c19804712eD.LJIIZILJ;
                                                        C19801012dc c19801012dc = new C19801012dc(c19804712eD);
                                                        c19810012f42.LJ();
                                                        c19810012f42.LJFF();
                                                        c19810012f42.LJIIL().LJIIJ(new RunnableC19813412fc(c19810012f42, strLJIILLIIL, url, c19801012dc));
                                                        return;
                                                    } catch (IllegalArgumentException | MalformedURLException e3) {
                                                        TryCatchGuardChecker.doCheck(e3);
                                                        c19803112dxLJIILLIIL.LJIILJJIL().LJFF.LIZ(e3.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                                        return;
                                                    }
                                                }
                                            } catch (SecurityException e4) {
                                                TryCatchGuardChecker.doCheck(e4);
                                            }
                                        }
                                        c19804712eD.LJIILJJIL().LJIIIIZZ.LIZJ("Network is not available for Deferred Deep Link request. Skipping");
                                    }
                                };
                            }
                            c19804412eA.LJIIZILJ.LIZIZ(0L);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzje@393c.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzje@393c.run");
                    }
                });
            }
            final C19804512eB c19804512eBLJIIIZ = LJIIIZ();
            c19804512eBLJIIIZ.LJ();
            c19804512eBLJIIIZ.LJIIJJI();
            final zzn zznVarLJJIIZ = c19804512eBLJIIIZ.LJJIIZ(true);
            c19804512eBLJIIIZ.LJI().LJIIZILJ(3, new byte[0]);
            c19804512eBLJIIIZ.LJIIZILJ(new Runnable() { // from class: X.12du
                public final void LIZ() throws Throwable {
                    C19804512eB c19804512eB = c19804512eBLJIIIZ;
                    InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                    if (interfaceC19802012dm == null) {
                        c19804512eB.LJIILJJIL().LJFF.LIZJ("Discarding data. Failed to send app launch");
                        return;
                    }
                    try {
                        C0W3J.LJIIIIZZ(zznVarLJJIIZ);
                        interfaceC19802012dm.I(zznVarLJJIIZ);
                        c19804512eBLJIIIZ.LJI().LJIJJ();
                        c19804512eBLJIIIZ.LJIJJ(interfaceC19802012dm, null, zznVarLJJIIZ);
                        c19804512eBLJIIIZ.LJJIIJZLJL();
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        c19804512eBLJIIIZ.LJIILJJIL().LJFF.LIZ(e, "Failed to send app launch to the service");
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzlk@3980.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzlk@3980.run");
                }
            });
            this.LJIILLIIL = false;
            C19804812eE c19804812eELIZIZ = LIZIZ();
            c19804812eELIZIZ.LJ();
            String string = c19804812eELIZIZ.LJIIZILJ().getString("previous_os_version", null);
            c19804812eELIZIZ.LIZ.LJIIIZ().LJFF();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c19804812eELIZIZ.LJIIZILJ().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.LIZ.LJIIIZ().LJFF();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("_po", string, bundle);
            LJJJIL("auto", "_ou", bundle);
        }
    }

    public final void LJJIJL() {
        C19820512gl.LIZ();
        if (this.LIZ.LJI.LJIJI(null, C19817012gC.LJLILLLLZI)) {
            if (LJIIL().LJIIZILJ()) {
                LJIILJJIL().LJFF.LIZJ("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C19812512fT.LIZ()) {
                LJIILJJIL().LJFF.LIZJ("Cannot get trigger URIs from main thread");
                return;
            }
            LJIIJJI();
            LJIILJJIL().LJIILIIL.LIZJ("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            LJIIL().LJIIIIZZ(atomicReference, Mp4ScreenVideoLoadTimeout.CONTROL, "get trigger URIs", new Runnable() { // from class: X.12dv
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzja@3938.run");
                    try {
                        C19804412eA c19804412eA = this.LL;
                        final AtomicReference atomicReference2 = atomicReference;
                        final Bundle bundleLIZ = c19804412eA.LIZIZ().LJIILJJIL.LIZ();
                        final C19804512eB c19804512eBLJIIIZ = c19804412eA.LJIIIZ();
                        if (bundleLIZ == null) {
                            bundleLIZ = new Bundle();
                        }
                        c19804512eBLJIIIZ.LJ();
                        c19804512eBLJIIIZ.LJIIJJI();
                        final zzn zznVarLJJIIZ = c19804512eBLJIIIZ.LJJIIZ(false);
                        c19804512eBLJIIIZ.LJIIZILJ(new Runnable() { // from class: X.12dr
                            public final void LIZ() {
                                C19804512eB c19804512eB;
                                InterfaceC19802012dm interfaceC19802012dm;
                                synchronized (atomicReference2) {
                                    try {
                                        try {
                                            try {
                                                c19804512eB = c19804512eBLJIIIZ;
                                                interfaceC19802012dm = c19804512eB.LIZLLL;
                                            } catch (RemoteException e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                c19804512eBLJIIIZ.LJIILJJIL().LJFF.LIZ(e, "Failed to get trigger URIs; remote exception");
                                                atomicReference2.notify();
                                            }
                                            if (interfaceC19802012dm == null) {
                                                c19804512eB.LJIILJJIL().LJFF.LIZJ("Failed to get trigger URIs; not connected to service");
                                                atomicReference2.notify();
                                                return;
                                            }
                                            C0W3J.LJIIIIZZ(zznVarLJJIIZ);
                                            atomicReference2.set(interfaceC19802012dm.LJJJIL(bundleLIZ, zznVarLJJIIZ));
                                            c19804512eBLJIIIZ.LJJIIJZLJL();
                                            atomicReference2.notify();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            atomicReference2.notify();
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        throw th2;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ2;
                                C1C7U.LIZ("zzlh@397d.run");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ2) {
                                    }
                                }
                                C1C7U.LIZIZ("zzlh@397d.run");
                            }
                        });
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzja@3938.run");
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                LJIILJJIL().LJFF.LIZJ("Timed out waiting for get trigger URIs");
            } else {
                LJIIL().LJIILL(new Runnable() { // from class: X.12eb
                    public final void LIZ() {
                        C19804412eA c19804412eA = this.LL;
                        List<zzmu> list2 = list;
                        c19804412eA.LJ();
                        if (Build.VERSION.SDK_INT >= 30) {
                            SparseArray<Long> sparseArrayLJIJI = c19804412eA.LIZIZ().LJIJI();
                            for (zzmu zzmuVar : list2) {
                                if (!sparseArrayLJIJI.contains(zzmuVar.zzc) || sparseArrayLJIJI.get(zzmuVar.zzc).longValue() < zzmuVar.zzb) {
                                    c19804412eA.LJJIJIIJI().add(zzmuVar);
                                }
                            }
                            c19804412eA.LJJIL();
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzjd@393b.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzjd@393b.run");
                    }
                });
            }
        }
    }

    public final void LJJIL() {
        final zzmu zzmuVarPoll;
        MeasurementManagerFutures measurementManagerFuturesLJLI;
        LJ();
        if (LJJIJIIJI().isEmpty() || this.LJIIIIZZ || (zzmuVarPoll = LJJIJIIJI().poll()) == null || (measurementManagerFuturesLJLI = LIZJ().LJLI()) == null) {
            return;
        }
        this.LJIIIIZZ = true;
        LJIILJJIL().LJIILIIL.LIZ(zzmuVarPoll.zza, "Registering trigger URI");
        ListenableFuture listenableFutureRegisterTriggerAsync = measurementManagerFuturesLJLI.registerTriggerAsync(UriProtector.parse(zzmuVarPoll.zza));
        if (listenableFutureRegisterTriggerAsync == null) {
            this.LJIIIIZZ = false;
            LJJIJIIJI().add(zzmuVarPoll);
            return;
        }
        if (!this.LIZ.LJI.LJIJI(null, C19817012gC.LJLJJLL)) {
            SparseArray<Long> sparseArrayLJIJI = LIZIZ().LJIJI();
            sparseArrayLJIJI.put(zzmuVarPoll.zzc, Long.valueOf(zzmuVarPoll.zzb));
            LIZIZ().LJIIIIZZ(sparseArrayLJIJI);
        }
        C09UU.LIZ(listenableFutureRegisterTriggerAsync, new C11U6<Object>(this) { // from class: X.12eR
            public final /* synthetic */ C19804412eA LIZIZ;

            /* JADX WARN: Type inference failed for: r1v6, types: [X.12fL] */
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                this.LIZIZ.LJ();
                C19804412eA c19804412eA = this.LIZIZ;
                c19804412eA.LJIIIIZZ = false;
                if (!c19804412eA.LIZ.LJI.LJIJI(null, C19817012gC.LJLJJLL)) {
                    this.LIZIZ.LJJIL();
                    this.LIZIZ.LJIILJJIL().LJFF.LIZ(th, "registerTriggerAsync failed with throwable");
                    return;
                }
                this.LIZIZ.LJJIJIIJI().add(zzmuVarPoll);
                C19804412eA c19804412eA2 = this.LIZIZ;
                if (c19804412eA2.LJIIIZ > 64) {
                    c19804412eA2.LJIIIZ = 1;
                    c19804412eA2.LJIILJJIL().LJIIIIZZ.LIZIZ(C19806212eS.LJIIJ(this.LIZIZ.LJFF().LJIILLIIL()), "registerTriggerAsync failed. May try later. App ID, throwable", C19806212eS.LJIIJ(th.toString()));
                    return;
                }
                c19804412eA2.LJIILJJIL().LJIIIIZZ.LIZLLL("registerTriggerAsync failed. App ID, delay in seconds, throwable", C19806212eS.LJIIJ(this.LIZIZ.LJFF().LJIILLIIL()), C19806212eS.LJIIJ(String.valueOf(this.LIZIZ.LJIIIZ)), C19806212eS.LJIIJ(th.toString()));
                final C19804412eA c19804412eA3 = this.LIZIZ;
                int i = c19804412eA3.LJIIIZ;
                if (c19804412eA3.LJIIJ == null) {
                    c19804412eA3.LJIIJ = new AbstractC19809612f0(c19804412eA3.LIZ) { // from class: X.12fL
                        @Override // X.AbstractC19809612f0
                        public final void LIZJ() {
                            c19804412eA3.LJJIL();
                        }
                    };
                }
                c19804412eA3.LJIIJ.LIZIZ(i * LSPassThroughRecordSizeConfig.DEFAULT);
                this.LIZIZ.LJIIIZ <<= 1;
            }

            @Override // X.C11U6
            public final void onSuccess(Object obj) {
                this.LIZIZ.LJ();
                if (this.LIZIZ.LIZ.LJI.LJIJI(null, C19817012gC.LJLJJLL)) {
                    SparseArray<Long> sparseArrayLJIJI2 = this.LIZIZ.LIZIZ().LJIJI();
                    zzmu zzmuVar = zzmuVarPoll;
                    sparseArrayLJIJI2.put(zzmuVar.zzc, Long.valueOf(zzmuVar.zzb));
                    this.LIZIZ.LIZIZ().LJIIIIZZ(sparseArrayLJIJI2);
                    C19804412eA c19804412eA = this.LIZIZ;
                    c19804412eA.LJIIIIZZ = false;
                    c19804412eA.LJIIIZ = 1;
                    c19804412eA.LJIILJJIL().LJIIL.LIZ(zzmuVarPoll.zza, "Successfully registered trigger URI");
                    this.LIZIZ.LJJIL();
                    return;
                }
                C19804412eA c19804412eA2 = this.LIZIZ;
                c19804412eA2.LJIIIIZZ = false;
                c19804412eA2.LJJIL();
                this.LIZIZ.LJIILJJIL().LJIIL.LIZ(zzmuVarPoll.zza, "registerTriggerAsync ran. uri");
            }

            {
                this.LIZIZ = this;
            }
        }, new Executor() { // from class: X.12fI
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.LL.LJIIL().LJIILL(runnable);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.12dV] */
    public C19804412eA(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LJ = new CopyOnWriteArraySet();
        this.LJII = new Object();
        this.LJIIIIZZ = false;
        this.LJIIIZ = 1;
        this.LJIILLIIL = true;
        this.LJIJJ = new InterfaceC19804312e9() { // from class: X.12dV
            @Override // X.InterfaceC19804312e9
            public final void LIZ(String str, String str2, Bundle bundle) {
                if (TextUtils.isEmpty(str)) {
                    C19804412eA c19804412eA = this.LIZ;
                    c19804412eA.LIZ.LJIILIIL.getClass();
                    c19804412eA.LJJI("auto", "_err", bundle, true, true, System.currentTimeMillis());
                    return;
                }
                this.LIZ.LIZ.getClass();
                throw new IllegalStateException("Unexpected call on client side");
            }
        };
        this.LJI = new AtomicReference<>();
        this.LJIIL = C19781912aX.LIZJ;
        this.LJIILJJIL = -1L;
        this.LJIILIIL = new AtomicLong(0L);
        this.LJIILL = new C19806312eT(c19804712eD);
    }

    public final void LJJIIJ(C19781912aX c19781912aX) {
        boolean z;
        Boolean boolValueOf;
        LJ();
        if ((!c19781912aX.LJIJI() || !c19781912aX.LJIJ()) && !LJIIIZ().LJJIFFI()) {
            z = false;
        } else {
            z = true;
        }
        C19804712eD c19804712eD = this.LIZ;
        c19804712eD.LJIIL().LJ();
        if (z != c19804712eD.LJJIIJZLJL) {
            C19804712eD c19804712eD2 = this.LIZ;
            c19804712eD2.LJIIL().LJ();
            c19804712eD2.LJJIIJZLJL = z;
            C19804812eE c19804812eELIZIZ = LIZIZ();
            c19804812eELIZIZ.LJ();
            if (c19804812eELIZIZ.LJIIZILJ().contains("measurement_enabled_from_api")) {
                boolValueOf = Boolean.valueOf(c19804812eELIZIZ.LJIIZILJ().getBoolean("measurement_enabled_from_api", true));
            } else {
                boolValueOf = null;
            }
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                LJJIJ(false, Boolean.valueOf(z));
            }
        }
    }

    public final void LJJJI(String str) {
        this.LJI.set(str);
    }

    public static Object LJIILLIIL(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public final void LJIJI(long j, boolean z) {
        LJ();
        LJIIJJI();
        LJIILJJIL().LJIIL.LIZJ("Resetting analytics data (FE)");
        C19809512ez c19809512ezLJIIJ = LJIIJ();
        c19809512ezLJIIJ.LJ();
        C19805612eM c19805612eM = c19809512ezLJIIJ.LJFF;
        c19805612eM.LIZJ.LIZ();
        if (c19805612eM.LIZLLL.LIZ.LJI.LJIJI(null, C19817012gC.LLIFFJFJJ)) {
            c19805612eM.LIZLLL.LIZ.LJIILIIL.getClass();
            c19805612eM.LIZ = SystemClock.elapsedRealtime();
        } else {
            c19805612eM.LIZ = 0L;
        }
        c19805612eM.LIZIZ = c19805612eM.LIZ;
        LJFF().LJIJI();
        boolean zLJFF = this.LIZ.LJFF();
        C19804812eE c19804812eELIZIZ = LIZIZ();
        c19804812eELIZIZ.LJI.LIZIZ(j);
        if (!TextUtils.isEmpty(c19804812eELIZIZ.LIZIZ().LJIL.LIZ())) {
            c19804812eELIZIZ.LJIL.LIZIZ(null);
        }
        c19804812eELIZIZ.LJIILLIIL.LIZIZ(0L);
        c19804812eELIZIZ.LJIIZILJ.LIZIZ(0L);
        if (!c19804812eELIZIZ.LIZ.LJI.LJJ()) {
            c19804812eELIZIZ.LJIILL(!zLJFF);
        }
        c19804812eELIZIZ.LJJ.LIZIZ(null);
        c19804812eELIZIZ.LJJI.LIZIZ(0L);
        c19804812eELIZIZ.LJJIFFI.LIZIZ(null);
        if (z) {
            final C19804512eB c19804512eBLJIIIZ = LJIIIZ();
            c19804512eBLJIIIZ.LJ();
            c19804512eBLJIIIZ.LJIIJJI();
            final zzn zznVarLJJIIZ = c19804512eBLJIIIZ.LJJIIZ(false);
            c19804512eBLJIIIZ.LJI().LJIJI();
            c19804512eBLJIIIZ.LJIIZILJ(new Runnable() { // from class: X.12df
                public final void LIZ() {
                    C19804512eB c19804512eB = c19804512eBLJIIIZ;
                    InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                    if (interfaceC19802012dm == null) {
                        c19804512eB.LJIILJJIL().LJFF.LIZJ("Failed to reset data on the service: not connected to service");
                        return;
                    }
                    try {
                        C0W3J.LJIIIIZZ(zznVarLJJIIZ);
                        interfaceC19802012dm.L(zznVarLJJIIZ);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        c19804512eBLJIIIZ.LJIILJJIL().LJFF.LIZ(e, "Failed to reset data on the service: remote exception");
                    }
                    c19804512eBLJIIIZ.LJJIIJZLJL();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzlj@397f.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzlj@397f.run");
                }
            });
        }
        LJIIJ().LJ.LIZ();
        this.LJIILLIIL = !zLJFF;
    }

    public final void LJJIII(final C19781812aW c19781812aW, boolean z) {
        Runnable runnable = new Runnable(this) { // from class: X.12eO
            public final /* synthetic */ C19804412eA LLILLJJLI;

            public final void LIZ() {
                C19804812eE c19804812eELIZIZ = this.LLILLJJLI.LIZIZ();
                C19781812aW c19781812aW2 = c19781812aW;
                c19804812eELIZIZ.LJ();
                if (!C19781912aX.LJIIIIZZ(c19781812aW2.LIZ, c19804812eELIZIZ.LJIJJ().LIZ)) {
                    this.LLILLJJLI.LJIILJJIL().LJIIJJI.LIZ(Integer.valueOf(c19781812aW.LIZ), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = c19804812eELIZIZ.LJIIZILJ().edit();
                editorEdit.putString("dma_consent_settings", c19781812aW2.LIZIZ);
                editorEdit.apply();
                this.LLILLJJLI.LJIILJJIL().LJIILIIL.LIZ(c19781812aW, "Setting DMA consent. consent");
                if (!this.LLILLJJLI.LIZ.LJI.LJIJI(null, C19817012gC.LJLLI) || !this.LLILLJJLI.LJIIIZ().LJJII()) {
                    this.LLILLJJLI.LJIIIZ().LJIJJLI(false);
                    return;
                }
                final C19804512eB c19804512eBLJIIIZ = this.LLILLJJLI.LJIIIZ();
                c19804512eBLJIIIZ.LJ();
                c19804512eBLJIIIZ.LJIIJJI();
                c19804512eBLJIIIZ.LJIIZILJ(new Runnable() { // from class: X.12dn
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzld@3979.run");
                        try {
                            C19804512eB c19804512eB = c19804512eBLJIIIZ;
                            InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                            if (interfaceC19802012dm == null) {
                                c19804512eB.LJIILJJIL().LJFF.LIZJ("Failed to send Dma consent settings to service");
                            } else {
                                try {
                                    interfaceC19802012dm.E(c19804512eB.LJJIIZ(false));
                                    c19804512eB.LJJIIJZLJL();
                                } catch (RemoteException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c19804512eB.LJIILJJIL().LJFF.LIZ(e, "Failed to send Dma consent settings to the service");
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzld@3979.run");
                    }
                });
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzkh@395e.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzkh@395e.run");
            }

            {
                this.LLILLJJLI = this;
            }
        };
        if (z) {
            LJ();
            runnable.run();
        } else {
            LJIIL().LJIILL(runnable);
        }
    }

    public final void LJJIJ(boolean z, Boolean bool) {
        LJ();
        LJIIJJI();
        LJIILJJIL().LJIIL.LIZ(bool, "Setting app measurement enabled (FE)");
        LIZIZ().LJIIIZ(bool);
        if (z) {
            C19804812eE c19804812eELIZIZ = LIZIZ();
            c19804812eELIZIZ.LJ();
            SharedPreferences.Editor editorEdit = c19804812eELIZIZ.LJIIZILJ().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        C19804712eD c19804712eD = this.LIZ;
        c19804712eD.LJIIL().LJ();
        if (c19804712eD.LJJIIJZLJL || (bool != null && !bool.booleanValue())) {
            LJJIZ();
        }
    }

    public final void LJJJ(long j, Bundle bundle) {
        C0W3J.LJIIIIZZ(bundle);
        final Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            LJIILJJIL().LJIIIIZZ.LIZJ("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C09FV.LIZ(bundle2, "app_id", String.class, null);
        C09FV.LIZ(bundle2, "origin", String.class, null);
        C09FV.LIZ(bundle2, "name", String.class, null);
        C09FV.LIZ(bundle2, "value", Object.class, null);
        C09FV.LIZ(bundle2, "trigger_event_name", String.class, null);
        C09FV.LIZ(bundle2, "trigger_timeout", Long.class, 0L);
        C09FV.LIZ(bundle2, "timed_out_event_name", String.class, null);
        C09FV.LIZ(bundle2, "timed_out_event_params", Bundle.class, null);
        C09FV.LIZ(bundle2, "triggered_event_name", String.class, null);
        C09FV.LIZ(bundle2, "triggered_event_params", Bundle.class, null);
        C09FV.LIZ(bundle2, "time_to_live", Long.class, 0L);
        C09FV.LIZ(bundle2, "expired_event_name", String.class, null);
        C09FV.LIZ(bundle2, "expired_event_params", Bundle.class, null);
        C0W3J.LJI(bundle2.getString("name"));
        C0W3J.LJI(bundle2.getString("origin"));
        C0W3J.LJIIIIZZ(LJIILLIIL(bundle2, "value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object objLJIILLIIL = LJIILLIIL(bundle2, "value");
        if (LIZJ().LJJJLL(string) != 0) {
            LJIILJJIL().LJFF.LIZ(this.LIZ.LJIIL.LJI(string), "Invalid conditional user property name");
            return;
        }
        if (LIZJ().LJIIIZ(objLJIILLIIL, string) != 0) {
            LJIILJJIL().LJFF.LIZIZ(this.LIZ.LJIIL.LJI(string), "Invalid conditional user property value", objLJIILLIIL);
            return;
        }
        Object objLJJLIIIJ = LIZJ().LJJLIIIJ(objLJIILLIIL, string);
        if (objLJJLIIIJ == null) {
            LJIILJJIL().LJFF.LIZIZ(this.LIZ.LJIIL.LJI(string), "Unable to normalize conditional user property value", objLJIILLIIL);
            return;
        }
        C09FV.LIZIZ(bundle2, objLJJLIIIJ);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            LJIILJJIL().LJFF.LIZIZ(this.LIZ.LJIIL.LJI(string), "Invalid conditional user property timeout", Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 <= 15552000000L && j3 >= 1) {
            LJIIL().LJIILL(new Runnable(this) { // from class: X.12dZ
                public final /* synthetic */ C19804412eA LLILLJJLI;

                public final void LIZ() {
                    C19804412eA c19804412eA = this.LLILLJJLI;
                    Bundle bundle3 = bundle2;
                    c19804412eA.LJ();
                    c19804412eA.LJIIJJI();
                    C0W3J.LJIIIIZZ(bundle3);
                    String string2 = bundle3.getString("name");
                    String string3 = bundle3.getString("origin");
                    C0W3J.LJI(string2);
                    C0W3J.LJI(string3);
                    C0W3J.LJIIIIZZ(C19804412eA.LJIILLIIL(bundle3, "value"));
                    if (!c19804412eA.LIZ.LJFF()) {
                        c19804412eA.LJIILJJIL().LJIILIIL.LIZJ("Conditional property not set since app measurement is disabled");
                        return;
                    }
                    zzno zznoVar = new zzno(bundle3.getLong("triggered_timestamp"), C19804412eA.LJIILLIIL(bundle3, "value"), string2, string3);
                    try {
                        C19803112dx c19803112dxLIZJ = c19804412eA.LIZJ();
                        bundle3.getString("app_id");
                        zzbf zzbfVarLJIJJLI = c19803112dxLIZJ.LJIJJLI(bundle3.getString("triggered_event_name"), bundle3.getBundle("triggered_event_params"), string3, 0L, true);
                        C19803112dx c19803112dxLIZJ2 = c19804412eA.LIZJ();
                        bundle3.getString("app_id");
                        zzbf zzbfVarLJIJJLI2 = c19803112dxLIZJ2.LJIJJLI(bundle3.getString("timed_out_event_name"), bundle3.getBundle("timed_out_event_params"), string3, 0L, true);
                        C19803112dx c19803112dxLIZJ3 = c19804412eA.LIZJ();
                        bundle3.getString("app_id");
                        c19804412eA.LJIIIZ().LJIILLIIL(new zzac(bundle3.getString("app_id"), string3, zznoVar, bundle3.getLong("creation_timestamp"), false, bundle3.getString("trigger_event_name"), zzbfVarLJIJJLI2, bundle3.getLong("trigger_timeout"), zzbfVarLJIJJLI, bundle3.getLong("time_to_live"), c19803112dxLIZJ3.LJIJJLI(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), string3, 0L, true)));
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzjx@394f.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzjx@394f.run");
                }

                {
                    this.LLILLJJLI = this;
                }
            });
        } else {
            LJIILJJIL().LJFF.LIZIZ(this.LIZ.LJIIL.LJI(string), "Invalid conditional user property time to live", Long.valueOf(j3));
        }
    }

    public static void LJJIIZI(C19804412eA c19804412eA, C19781912aX c19781912aX, C19781912aX c19781912aX2) {
        boolean z;
        if (!C19820612gm.LIZ() || !c19804412eA.LIZ.LJI.LJIJI(null, C19817012gC.LLFII)) {
            EnumC19776112Zb[] enumC19776112ZbArr = {EnumC19776112Zb.ANALYTICS_STORAGE, EnumC19776112Zb.AD_STORAGE};
            c19781912aX.getClass();
            int i = 0;
            while (true) {
                EnumC19776112Zb enumC19776112Zb = enumC19776112ZbArr[i];
                if (!c19781912aX2.LJIIIZ(enumC19776112Zb) && c19781912aX.LJIIIZ(enumC19776112Zb)) {
                    z = true;
                    break;
                }
                i++;
                if (i >= 2) {
                    z = false;
                    break;
                }
            }
            boolean zLJIIL = c19781912aX.LJIIL(c19781912aX2, EnumC19776112Zb.ANALYTICS_STORAGE, EnumC19776112Zb.AD_STORAGE);
            if (z || zLJIIL) {
                c19804412eA.LJFF().LJIJI();
            }
        }
    }

    public final void LJIJJ(Bundle bundle, int i, long j) {
        boolean z;
        String str;
        String string;
        Boolean bool;
        LJIIJJI();
        C19781912aX c19781912aX = C19781912aX.LIZJ;
        for (EnumC19776112Zb enumC19776112Zb : EnumC19782012aY.STORAGE.LL) {
            if (bundle.containsKey(enumC19776112Zb.zze) && (string = bundle.getString(enumC19776112Zb.zze)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else {
                    if (!string.equals("denied")) {
                        LJIILJJIL().LJIIJ.LIZ(string, "Ignoring invalid consent setting");
                        LJIILJJIL().LJIIJ.LIZJ("Valid consent values are 'granted', 'denied'");
                        break;
                    }
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    LJIILJJIL().LJIIJ.LIZ(string, "Ignoring invalid consent setting");
                    LJIILJJIL().LJIIJ.LIZJ("Valid consent values are 'granted', 'denied'");
                    break;
                }
            }
        }
        if (this.LIZ.LJI.LJIJI(null, C19817012gC.LJLLILLLL) && LJIIL().LJIIZILJ()) {
            z = true;
        } else {
            z = false;
        }
        C19781912aX c19781912aXLIZJ = C19781912aX.LIZJ(i, bundle);
        if (c19781912aXLIZJ.LJIJJ()) {
            LJJIIJZLJL(c19781912aXLIZJ, j, z);
        }
        C19781812aW c19781812aWLIZIZ = C19781812aW.LIZIZ(i, bundle);
        if (c19781812aWLIZIZ.LJ()) {
            LJJIII(c19781812aWLIZIZ, z);
        }
        Boolean boolLIZ = C19781812aW.LIZ(bundle);
        if (boolLIZ != null) {
            if (i == -30) {
                str = "tcf";
            } else {
                str = "app";
            }
            LJIJJLI(boolLIZ.toString(), str, "allow_personalized_ads", false);
        }
    }

    public final void LJJ(String str, String str2, Bundle bundle) {
        this.LIZ.LJIILIIL.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0W3J.LJI(str);
        final Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("name", str, bundle2);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            C786410Ut5.LJJJI("expired_event_name", str2, bundle2);
            C786410Ut5.LJJIIZI(bundle2, bundle, "expired_event_params");
        }
        LJIIL().LJIILL(new Runnable(this) { // from class: X.12dY
            public final /* synthetic */ C19804412eA LLILLJJLI;

            public final void LIZ() {
                C19804412eA c19804412eA = this.LLILLJJLI;
                Bundle bundle3 = bundle2;
                c19804412eA.LJ();
                c19804412eA.LJIIJJI();
                C0W3J.LJIIIIZZ(bundle3);
                String string = bundle3.getString("name");
                C0W3J.LJI(string);
                if (!c19804412eA.LIZ.LJFF()) {
                    c19804412eA.LJIILJJIL().LJIILIIL.LIZJ("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                zzno zznoVar = new zzno(0L, null, string, "");
                try {
                    C19803112dx c19803112dxLIZJ = c19804412eA.LIZJ();
                    bundle3.getString("app_id");
                    c19804412eA.LJIIIZ().LJIILLIIL(new zzac(bundle3.getString("app_id"), "", zznoVar, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), c19803112dxLIZJ.LJIJJLI(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzjw@394e.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzjw@394e.run");
            }

            {
                this.LLILLJJLI = this;
            }
        });
    }

    public final void LJJIIJZLJL(C19781912aX c19781912aX, final long j, boolean z) {
        final C19781912aX c19781912aX2;
        boolean z2;
        boolean zLJIILIIL;
        final boolean z3;
        final C19781912aX c19781912aXLJIIJJI = c19781912aX;
        LJIIJJI();
        int i = c19781912aXLJIIJJI.LIZIZ;
        C19820412gk.LIZ();
        if (this.LIZ.LJI.LJIJI(null, C19817012gC.LLD)) {
            if (i != -10) {
                EnumC19782112aZ enumC19782112aZ = c19781912aXLJIIJJI.LIZ.get(EnumC19776112Zb.AD_STORAGE);
                if (enumC19782112aZ == null) {
                    enumC19782112aZ = EnumC19782112aZ.UNINITIALIZED;
                }
                EnumC19782112aZ enumC19782112aZ2 = EnumC19782112aZ.UNINITIALIZED;
                if (enumC19782112aZ == enumC19782112aZ2) {
                    EnumC19782112aZ enumC19782112aZ3 = c19781912aXLJIIJJI.LIZ.get(EnumC19776112Zb.ANALYTICS_STORAGE);
                    if (enumC19782112aZ3 == null) {
                        enumC19782112aZ3 = enumC19782112aZ2;
                    }
                    if (enumC19782112aZ3 == enumC19782112aZ2) {
                        LJIILJJIL().LJIIJ.LIZJ("Ignoring empty consent settings");
                        return;
                    }
                }
            }
        } else if (i != -10 && c19781912aXLJIIJJI.LJIILJJIL() == null && c19781912aXLJIIJJI.LJIILL() == null) {
            LJIILJJIL().LJIIJ.LIZJ("Discarding empty consent settings");
            return;
        }
        synchronized (this.LJII) {
            try {
                c19781912aX2 = this.LJIIL;
                z2 = false;
                if (C19781912aX.LJIIIIZZ(i, c19781912aX2.LIZIZ)) {
                    zLJIILIIL = c19781912aXLJIIJJI.LJIILIIL(this.LJIIL);
                    if (c19781912aXLJIIJJI.LJIJI() && !this.LJIIL.LJIJI()) {
                        z2 = true;
                    }
                    c19781912aXLJIIJJI = c19781912aXLJIIJJI.LJIIJJI(this.LJIIL);
                    this.LJIIL = c19781912aXLJIIJJI;
                    z3 = z2;
                    z2 = true;
                } else {
                    zLJIILIIL = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!z2) {
            LJIILJJIL().LJIIJJI.LIZ(c19781912aXLJIIJJI, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        final long andIncrement = this.LJIILIIL.getAndIncrement();
        if (zLJIILIIL) {
            LJJJI(null);
            Runnable runnable = new Runnable(this) { // from class: X.12eh
                public final /* synthetic */ C19804412eA LLILZLL;

                public final void LIZ() {
                    this.LLILZLL.LJJIIJ(c19781912aXLJIIJJI);
                    if (!C19820612gm.LIZ() || !this.LLILZLL.LIZ.LJI.LJIJI(null, C19817012gC.LLFII)) {
                        this.LLILZLL.LJIJI(j, false);
                    }
                    C19804412eA.LJJIIZ(this.LLILZLL, c19781912aXLJIIJJI, andIncrement, true, z3);
                    C19804412eA.LJJIIZI(this.LLILZLL, c19781912aXLJIIJJI, c19781912aX2);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzkg@395d.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzkg@395d.run");
                }

                {
                    this.LLILZLL = this;
                }
            };
            if (z) {
                LJ();
                runnable.run();
                return;
            } else {
                LJIIL().LJIILLIIL(runnable);
                return;
            }
        }
        final C19781912aX c19781912aX3 = c19781912aXLJIIJJI;
        final boolean z4 = z3;
        Runnable runnable2 = new Runnable(this) { // from class: X.12f7
            public final /* synthetic */ C19804412eA LLILZIL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzkj@3960.run");
                try {
                    this.LLILZIL.LJJIIJ(c19781912aX3);
                    C19804412eA.LJJIIZ(this.LLILZIL, c19781912aX3, andIncrement, false, z4);
                    C19804412eA.LJJIIZI(this.LLILZIL, c19781912aX3, c19781912aX2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzkj@3960.run");
            }

            {
                this.LLILZIL = this;
            }
        };
        if (z) {
            LJ();
            runnable2.run();
        } else if (i != 30 && i != -10) {
            LJIIL().LJIILL(runnable2);
        } else {
            LJIIL().LJIILLIIL(runnable2);
        }
    }

    public final void LJJJIL(String str, String str2, Bundle bundle) {
        LJ();
        this.LIZ.LJIILIIL.getClass();
        LJIIZILJ(System.currentTimeMillis(), str, str2, bundle);
    }

    public final void LJIIZILJ(long j, String str, String str2, Bundle bundle) {
        boolean z;
        LJ();
        if (this.LIZLLL != null && !C19803112dx.LJJLIL(str2)) {
            z = false;
        } else {
            z = true;
        }
        LJIL(str, str2, j, bundle, true, z, true, null);
    }

    public final void LJIJJLI(Object obj, String str, String str2, boolean z) {
        this.LIZ.LJIILIIL.getClass();
        LJJII(str, str2, obj, z, System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
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
    public final void LJJIFFI(java.lang.String r14, java.lang.String r15, java.lang.Object r16, long r17) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19804412eA.LJJIFFI(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public static void LJJIIZ(C19804412eA c19804412eA, C19781912aX c19781912aX, long j, boolean z, boolean z2) {
        c19804412eA.LJ();
        c19804412eA.LJIIJJI();
        C19781912aX c19781912aXLJIJJLI = c19804412eA.LIZIZ().LJIJJLI();
        if (j <= c19804412eA.LJIILJJIL && C19781912aX.LJIIIIZZ(c19781912aXLJIJJLI.LIZIZ, c19781912aX.LIZIZ)) {
            c19804412eA.LJIILJJIL().LJIIJJI.LIZ(c19781912aX, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        C19804812eE c19804812eELIZIZ = c19804412eA.LIZIZ();
        c19804812eELIZIZ.LJ();
        int i = c19781912aX.LIZIZ;
        if (c19804812eELIZIZ.LJIIJ(i)) {
            SharedPreferences.Editor editorEdit = c19804812eELIZIZ.LJIIZILJ().edit();
            editorEdit.putString("consent_settings", c19781912aX.LJIIZILJ());
            editorEdit.putInt("consent_source", i);
            editorEdit.apply();
            c19804412eA.LJIILJJIL().LJIILIIL.LIZ(c19781912aX, "Setting storage consent. consent");
            c19804412eA.LJIILJJIL = j;
            if (c19804412eA.LIZ.LJI.LJIJI(null, C19817012gC.LJLLI) && c19804412eA.LJIIIZ().LJJII()) {
                final C19804512eB c19804512eBLJIIIZ = c19804412eA.LJIIIZ();
                c19804512eBLJIIIZ.LJ();
                c19804512eBLJIIIZ.LJIIJJI();
                if ((!C19820612gm.LIZ() || !c19804512eBLJIIIZ.LIZ.LJI.LJIJI(null, C19817012gC.LLFII)) && z) {
                    c19804512eBLJIIIZ.LJI().LJIJI();
                }
                c19804512eBLJIIIZ.LJIIZILJ(new Runnable() { // from class: X.12dl
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzla@3976.run");
                        try {
                            C19804512eB c19804512eB = c19804512eBLJIIIZ;
                            InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                            if (interfaceC19802012dm == null) {
                                c19804512eB.LJIILJJIL().LJFF.LIZJ("Failed to send storage consent settings to service");
                            } else {
                                try {
                                    interfaceC19802012dm.R(c19804512eB.LJJIIZ(false));
                                    c19804512eB.LJJIIJZLJL();
                                } catch (RemoteException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c19804512eB.LJIILJJIL().LJFF.LIZ(e, "Failed to send storage consent settings to the service");
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzla@3976.run");
                    }
                });
            } else {
                c19804412eA.LJIIIZ().LJIJJLI(z);
            }
            if (z2) {
                c19804412eA.LJIIIZ().LJIJI(new AtomicReference<>());
                return;
            }
            return;
        }
        c19804412eA.LJIILJJIL().LJIIJJI.LIZ(Integer.valueOf(c19781912aX.LIZIZ), "Lower precedence consent source ignored, proposed source");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(java.lang.String r15, final java.lang.String r16, java.lang.Object r17, boolean r18, final long r19) {
        /*
            r14 = this;
            r9 = r15
            if (r9 != 0) goto L5
            java.lang.String r9 = "app"
        L5:
            r7 = 0
            r3 = 24
            r8 = r14
            r10 = r16
            if (r18 == 0) goto L33
            X.12dx r0 = r8.LIZJ()
            int r4 = r0.LJJJLL(r10)
        L15:
            java.lang.String r5 = "_ev"
            r1 = 1
            if (r4 == 0) goto L55
            r8.LIZJ()
            java.lang.String r6 = X.C19803112dx.LJJ(r3, r10, r1)
            if (r10 == 0) goto L27
            int r7 = r10.length()
        L27:
            X.12eD r0 = r8.LIZ
            r0.LJIILLIIL()
            X.12dV r2 = r8.LJIJJ
            r3 = 0
            X.C19803112dx.LJJIL(r2, r3, r4, r5, r6, r7)
            return
        L33:
            X.12dx r4 = r8.LIZJ()
            java.lang.String r2 = "user property"
            boolean r0 = r4.LJJLIIIJJI(r2, r10)
            if (r0 == 0) goto L53
            java.lang.String[] r1 = X.C19776612Zg.LIZ
            r0 = 0
            boolean r0 = r4.LJJJJL(r2, r10, r1, r0)
            if (r0 != 0) goto L4b
            r4 = 15
            goto L15
        L4b:
            boolean r0 = r4.LJJJI(r3, r2, r10)
            if (r0 == 0) goto L53
            r4 = 0
            goto L15
        L53:
            r4 = 6
            goto L15
        L55:
            r2 = r17
            r12 = r19
            if (r2 == 0) goto L9f
            X.12dx r0 = r8.LIZJ()
            int r4 = r0.LJIIIZ(r2, r10)
            if (r4 == 0) goto L88
            r8.LIZJ()
            java.lang.String r6 = X.C19803112dx.LJJ(r3, r10, r1)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L74
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto L7c
        L74:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r7 = r0.length()
        L7c:
            X.12eD r0 = r8.LIZ
            r0.LJIILLIIL()
            X.12dV r2 = r8.LJIJJ
            r3 = 0
            X.C19803112dx.LJJIL(r2, r3, r4, r5, r6, r7)
            return
        L88:
            X.12dx r0 = r8.LIZJ()
            java.lang.Object r11 = r0.LJJLIIIJ(r2, r10)
            if (r11 == 0) goto L9e
            X.12jR r0 = r8.LJIIL()
            X.0T8e r7 = new X.0T8e
            r7.<init>(r8)
            r0.LJIILL(r7)
        L9e:
            return
        L9f:
            r11 = 0
            X.12jR r0 = r8.LJIIL()
            X.0T8e r7 = new X.0T8e
            r7.<init>(r8)
            r0.LJIILL(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19804412eA.LJJII(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void LJJI(String str, final String str2, Bundle bundle, final boolean z, final boolean z2, final long j) {
        final boolean z3;
        String str3;
        String str4;
        C19811512fJ c19811512fJ;
        Bundle bundle2 = bundle;
        final String str5 = str;
        if (str5 == null) {
            str5 = "app";
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (Objects.equals(str2, "screen_view")) {
            final C19805012eG c19805012eGLJIIIIZZ = LJIIIIZZ();
            synchronized (c19805012eGLJIIIIZZ.LJIIJJI) {
                try {
                    if (!c19805012eGLJIIIIZZ.LJIIJ) {
                        c19805012eGLJIIIIZZ.LJIILJJIL().LJIIJ.LIZJ("Cannot log screen view event when the app is in the background.");
                        return;
                    }
                    String string = bundle2.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > c19805012eGLJIIIIZZ.LIZ.LJI.LJII(null, false))) {
                        c19805012eGLJIIIIZZ.LJIILJJIL().LJIIJ.LIZ(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                        return;
                    }
                    String string2 = bundle2.getString("screen_class");
                    if (string2 != null) {
                        if (string2.length() <= 0 || string2.length() > c19805012eGLJIIIIZZ.LIZ.LJI.LJII(null, false)) {
                            c19805012eGLJIIIIZZ.LJIILJJIL().LJIIJ.LIZ(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                            return;
                        }
                    } else {
                        Activity activity = c19805012eGLJIIIIZZ.LJI;
                        if (activity != null) {
                            string2 = c19805012eGLJIIIIZZ.LJIILLIIL(activity.getClass());
                        } else {
                            string2 = "Activity";
                        }
                    }
                    C19811512fJ c19811512fJ2 = c19805012eGLJIIIIZZ.LIZJ;
                    if (c19805012eGLJIIIIZZ.LJII && c19811512fJ2 != null) {
                        c19805012eGLJIIIIZZ.LJII = false;
                        boolean zEquals = Objects.equals(c19811512fJ2.LIZIZ, string2);
                        boolean zEquals2 = Objects.equals(c19811512fJ2.LIZ, string);
                        if (zEquals && zEquals2) {
                            c19805012eGLJIIIIZZ.LJIILJJIL().LJIIJ.LIZJ("Ignoring call to log screen view event with duplicate parameters.");
                            return;
                        }
                    }
                    C19811612fK c19811612fK = c19805012eGLJIIIIZZ.LJIILJJIL().LJIILIIL;
                    if (string == null) {
                        str3 = "null";
                    } else {
                        str3 = string;
                    }
                    if (string2 == null) {
                        str4 = "null";
                    } else {
                        str4 = string2;
                    }
                    c19811612fK.LIZIZ(str3, "Logging screen view with name, class", str4);
                    if (c19805012eGLJIIIIZZ.LIZJ == null) {
                        c19811512fJ = c19805012eGLJIIIIZZ.LIZLLL;
                    } else {
                        c19811512fJ = c19805012eGLJIIIIZZ.LIZJ;
                    }
                    final C19811512fJ c19811512fJ3 = new C19811512fJ(c19805012eGLJIIIIZZ.LIZJ().LJL(), j, true, string, string2);
                    c19805012eGLJIIIIZZ.LIZJ = c19811512fJ3;
                    c19805012eGLJIIIIZZ.LIZLLL = c19811512fJ;
                    c19805012eGLJIIIIZZ.LJIIIIZZ = c19811512fJ3;
                    c19805012eGLJIIIIZZ.LIZ.LJIILIIL.getClass();
                    final long jElapsedRealtime = SystemClock.elapsedRealtime();
                    final Bundle bundle3 = bundle2;
                    final C19811512fJ c19811512fJ4 = c19811512fJ;
                    c19805012eGLJIIIIZZ.LJIIL().LJIILL(new Runnable() { // from class: X.12ew
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("zzkv@396c.run");
                            try {
                                C19805012eG c19805012eG = c19805012eGLJIIIIZZ;
                                Bundle bundle4 = bundle3;
                                C19811512fJ c19811512fJ5 = c19811512fJ3;
                                C19811512fJ c19811512fJ6 = c19811512fJ4;
                                long j2 = jElapsedRealtime;
                                if (bundle4 != null) {
                                    bundle4.remove("screen_name");
                                    bundle4.remove("screen_class");
                                }
                                c19805012eG.LJIJJLI(c19811512fJ5, c19811512fJ6, j2, true, c19805012eG.LIZJ().LJIIZILJ("screen_view", bundle4, null, false));
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("zzkv@396c.run");
                        }
                    });
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (z2 && this.LIZLLL != null && !C19803112dx.LJJLIL(str2)) {
            z3 = false;
        } else {
            z3 = true;
        }
        final Bundle bundle4 = new Bundle(bundle2);
        for (String str6 : bundle4.keySet()) {
            Object objLJIIIIZZ = C19803112dx.LJIIIIZZ(bundle4, str6);
            if (objLJIIIIZZ instanceof Bundle) {
                C786410Ut5.LJJIIZI(bundle4, new Bundle((Bundle) objLJIIIIZZ), str6);
            } else if (objLJIIIIZZ instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) objLJIIIIZZ;
                for (int i = 0; i < parcelableArr.length; i++) {
                    if (parcelableArr[i] instanceof Bundle) {
                        parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                    }
                }
            } else if (objLJIIIIZZ instanceof List) {
                List list = (List) objLJIIIIZZ;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Object obj = ListProtector.get(list, i2);
                    if (obj instanceof Bundle) {
                        ListProtector.set(list, i2, new Bundle((Bundle) obj));
                    }
                }
            }
        }
        LJIIL().LJIILL(new Runnable(this) { // from class: X.0T8d
            public final /* synthetic */ String LLIZLLLIL = null;
            public final /* synthetic */ C19804412eA LLJ;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzjr@3949.run");
                try {
                    this.LLJ.LJIL(str5, str2, j, bundle4, z2, z3, z, this.LLIZLLLIL);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzjr@3949.run");
            }

            {
                this.LLJ = this;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a6, code lost:
    
        if (r9.LJJJI(40, "event", r28) == false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(java.lang.String r27, java.lang.String r28, long r29, android.os.Bundle r31, boolean r32, boolean r33, boolean r34, final java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19804412eA.LJIL(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }
}
