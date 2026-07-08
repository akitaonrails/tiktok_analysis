package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzba;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzno;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: X.12dx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19803112dx extends AbstractC19810712fB {
    public static final String[] LJIIIIZZ = {"firebase_", "google_", "ga_"};
    public static final String[] LJIIIZ = {"_err"};
    public SecureRandom LIZJ;
    public final AtomicLong LIZLLL;
    public int LJ;
    public MeasurementManagerFutures LJFF;
    public Boolean LJI;
    public Integer LJII;

    public static MessageDigest LJLIIL() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    @Override // X.AbstractC19810712fB
    public final boolean LJII() {
        return true;
    }

    public final int LJJLIIJ() {
        if (this.LJII == null) {
            this.LJII = Integer.valueOf(C829100Wfk.getInstance().getApkVersion(this.LIZ.LIZ) / LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return this.LJII.intValue();
    }

    public final long LJL() {
        long andIncrement;
        long j;
        if (this.LIZLLL.get() != 0) {
            synchronized (this.LIZLLL) {
                try {
                    this.LIZLLL.compareAndSet(-1L, 1L);
                    andIncrement = this.LIZLLL.getAndIncrement();
                } finally {
                }
            }
            return andIncrement;
        }
        synchronized (this.LIZLLL) {
            try {
                long jNanoTime = System.nanoTime();
                this.LIZ.LJIILIIL.getClass();
                long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
                int i = this.LJ + 1;
                this.LJ = i;
                j = jNextLong + ((long) i);
            } finally {
            }
        }
        return j;
    }

    public final MeasurementManagerFutures LJLI() {
        if (this.LJFF == null) {
            this.LJFF = MeasurementManagerFutures.from(this.LIZ.LIZ);
        }
        return this.LJFF;
    }

    public final String LJLIIIL() {
        byte[] bArr = new byte[16];
        LJLIL().nextBytes(bArr);
        return C786410Ut5.k4(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJLJI() {
        Integer num;
        if (this.LJI == null) {
            MeasurementManagerFutures measurementManagerFuturesLJLI = LJLI();
            boolean z = false;
            if (measurementManagerFuturesLJLI == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = (Integer) measurementManagerFuturesLJLI.getMeasurementApiStatusAsync().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z = true;
                        }
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                        e = e;
                        num2 = num;
                        TryCatchGuardChecker.doCheck(e);
                        LJIILJJIL().LJIIIIZZ.LIZ(e, "Measurement manager api exception");
                        this.LJI = Boolean.FALSE;
                        num = num2;
                    }
                }
                this.LJI = Boolean.valueOf(z);
            } catch (InterruptedException e2) {
                e = e2;
            } catch (CancellationException e3) {
                e = e3;
            } catch (ExecutionException e4) {
                e = e4;
            } catch (TimeoutException e5) {
                e = e5;
            }
            LJIILJJIL().LJIILIIL.LIZ(num, "Measurement manager api status result");
        }
        return this.LJI.booleanValue();
    }

    public final void LJJJLIIL() {
        LJ();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                LJIILJJIL().LJIIIIZZ.LIZJ("Utils falling back to Random for random id");
            }
        }
        this.LIZLLL.set(jNextLong);
    }

    public final long LJJLJ() {
        long j;
        LJ();
        if (!LJJLIIIJLJLI(C19817012gC.LJJJLL.LIZ(null), this.LIZ.LJIIJ().LJIILLIIL())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = (SdkExtensions.getExtensionVersion(30) > 3 ? SdkExtensions.getExtensionVersion(1000000) : 0) < C19817012gC.LJJJJL.LIZ(null).intValue() ? 16L : 0L;
        }
        if (!LJJLIIIJL("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0 && !LJLJI()) {
            j |= 64;
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final SecureRandom LJLIL() {
        LJ();
        if (this.LIZJ == null) {
            this.LIZJ = new SecureRandom();
        }
        return this.LIZJ;
    }

    public final boolean LJLILLLLZI() {
        LJ();
        return LJJLJ() == 1;
    }

    public C19803112dx(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LIZLLL = new AtomicLong(0L);
    }

    public static long LJIILIIL(zzba zzbaVar) {
        long length = 0;
        if (zzbaVar == null) {
            return 0L;
        }
        C19781412aS c19781412aS = new C19781412aS(zzbaVar);
        while (c19781412aS.hasNext()) {
            Object objLLIIIL = zzbaVar.LLIIIL((String) c19781412aS.next());
            if (objLLIIIL instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) objLLIIIL).length;
            }
        }
        return length;
    }

    public static long LJIILL(byte[] bArr) {
        boolean z;
        C0W3J.LJIIIIZZ(bArr);
        int i = 0;
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LJIIJJI(z);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public static Bundle LJIJI(List<zzno> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzno zznoVar : list) {
            String str = zznoVar.zzd;
            if (str != null) {
                C786410Ut5.LJJJI(zznoVar.zza, str, bundle);
            } else {
                Long l = zznoVar.zzc;
                if (l != null) {
                    bundle.putLong(zznoVar.zza, l.longValue());
                } else {
                    Double d = zznoVar.zzf;
                    if (d != null) {
                        bundle.putDouble(zznoVar.zza, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static boolean LJJJJ(Context context) {
        ActivityInfo receiverInfo;
        C0W3J.LJIIIIZZ(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public static boolean LJJJJI(Intent intent) {
        String stringExtra;
        try {
            stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
            return false;
        }
        return true;
    }

    public static boolean LJJJJIZL(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static byte[] LJJJJLL(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain.recycle();
            throw th;
        }
    }

    public static boolean LJJJJZI(Context context) {
        C0W3J.LJIIIIZZ(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return LJJLIIIJILLIZJL(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return LJJLIIIJILLIZJL(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static ArrayList<Bundle> LJJJZ(List<zzac> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzac zzacVar : list) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("app_id", zzacVar.zza, bundle);
            C786410Ut5.LJJJI("origin", zzacVar.zzb, bundle);
            bundle.putLong("creation_timestamp", zzacVar.zzd);
            C786410Ut5.LJJJI("name", zzacVar.zzc.zza, bundle);
            Object objZza = zzacVar.zzc.zza();
            C0W3J.LJIIIIZZ(objZza);
            C09FV.LIZIZ(bundle, objZza);
            bundle.putBoolean("active", zzacVar.zze);
            String str = zzacVar.zzf;
            if (str != null) {
                C786410Ut5.LJJJI("trigger_event_name", str, bundle);
            }
            zzbf zzbfVar = zzacVar.zzg;
            if (zzbfVar != null) {
                C786410Ut5.LJJJI("timed_out_event_name", zzbfVar.zza, bundle);
                zzba zzbaVar = zzbfVar.zzb;
                if (zzbaVar != null) {
                    C786410Ut5.LJJIIZI(bundle, zzbaVar.LLIFFJFJJ(), "timed_out_event_params");
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.zzh);
            zzbf zzbfVar2 = zzacVar.zzi;
            if (zzbfVar2 != null) {
                C786410Ut5.LJJJI("triggered_event_name", zzbfVar2.zza, bundle);
                zzba zzbaVar2 = zzbfVar2.zzb;
                if (zzbaVar2 != null) {
                    C786410Ut5.LJJIIZI(bundle, zzbaVar2.LLIFFJFJJ(), "triggered_event_params");
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.zzc.zzb);
            bundle.putLong("time_to_live", zzacVar.zzj);
            zzbf zzbfVar3 = zzacVar.zzk;
            if (zzbfVar3 != null) {
                C786410Ut5.LJJJI("expired_event_name", zzbfVar3.zza, bundle);
                zzba zzbaVar3 = zzbfVar3.zzb;
                if (zzbaVar3 != null) {
                    C786410Ut5.LJJIIZI(bundle, zzbaVar3.LLIFFJFJJ(), "expired_event_params");
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean LJJLIIIJLLLLLLLZ(String str) {
        return LJJLIIIJLJLI(C19817012gC.LJJZZIII.LIZ(null), str);
    }

    public static boolean LJJLIL(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static boolean LJJLJLI(String str) {
        C0W3J.LJI(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static int LJJZZIII(String str) {
        if ("_ldl".equals(str)) {
            return SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        if ("_lgclid".equals(str) || "_gbraid".equals(str) || "_dl_gbraid".equals(str) || "_mr_gbraid".equals(str)) {
            return 100;
        }
        return 36;
    }

    public final int LJIIJ(String str) {
        if (!LJJLIIIIJ("event", str)) {
            return 2;
        }
        if (!LJJJJL("event", str, C19781212aQ.LIZ, C19781212aQ.LIZIZ)) {
            return 13;
        }
        if (!LJJJI(40, "event", str)) {
            return 2;
        }
        return 0;
    }

    public final Bundle LJIILLIIL(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objLJJJLZIJ = LJJJLZIJ(LJIIIIZZ(bundle, str), str);
                if (objLJJJLZIJ == null) {
                    LJIILJJIL().LJIIJ.LIZ(this.LIZ.LJIIL.LJFF(str), "Param value can't be null");
                } else {
                    LJJII(bundle2, str, objLJJJLZIJ);
                }
            }
        }
        return bundle2;
    }

    public final boolean LJJJJZ(int i) {
        Boolean bool = this.LIZ.LJIILL().LJ;
        if (LJJLIIJ() < i / LSPassThroughRecordSizeConfig.DEFAULT) {
            if (bool != null && !bool.booleanValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int LJJJLL(String str) {
        if (!LJJLIIIIJ("user property", str)) {
            return 6;
        }
        if (!LJJJJL("user property", str, C19776612Zg.LIZ, null)) {
            return 15;
        }
        if (!LJJJI(24, "user property", str)) {
            return 6;
        }
        return 0;
    }

    public final boolean LJJLIIIJL(String str) {
        LJ();
        if (C812450Vtz.LIZ(this.LIZ.LIZ).LIZ.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        LJIILJJIL().LJIIL.LIZ(str, "Permission not granted");
        return false;
    }

    public final boolean LJJLL(String str) {
        List listLJJJJZ;
        if (TextUtils.isEmpty(str) || (listLJJJJZ = C2204961BRm.LJJJJZ(this.LIZ.LIZ.getPackageManager(), new Intent("android.intent.action.VIEW", UriProtector.parse(str)), 0, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOID9zPVdd3eEmUDB286I", new String[]{"016a9"}))) == null || listLJJJJZ.isEmpty()) {
            return false;
        }
        return true;
    }

    public final int LJJZ(String str) {
        if (!LJJLIIIIJ("event param", str)) {
            return 3;
        }
        if (!LJJJJL("event param", str, null, null)) {
            return 14;
        }
        if (!LJJJI(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final int LJJZZI(String str) {
        if (!LJJLIIIJJI("event param", str)) {
            return 3;
        }
        if (!LJJJJL("event param", str, null, null)) {
            return 14;
        }
        if (!LJJJI(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public static Object LJIIIIZZ(Bundle bundle, String str) {
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

    public static boolean LJJJJLI(String str, String[] strArr) {
        C0W3J.LJIIIIZZ(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJJL(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean LJJLIIIJILLIZJL(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public static boolean LJJLIIIJLJLI(String str, String str2) {
        if (!str.equals("*") && !Arrays.asList(str.split(",")).contains(str2)) {
            return false;
        }
        return true;
    }

    public final int LJIIIZ(Object obj, String str) {
        boolean zLJJJIL;
        if ("_ldl".equals(str)) {
            zLJJJIL = LJJJIL(LJJZZIII(str), "user property referrer", str, obj);
        } else {
            zLJJJIL = LJJJIL(LJJZZIII(str), "user property", str, obj);
        }
        if (zLJJJIL) {
            return 0;
        }
        return 7;
    }

    public final Bundle LJIJJ(boolean z, Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_campaign");
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_source");
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_medium");
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gclid");
                if (z) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gbraid");
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = null;
                }
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_id");
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "dclid");
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "srsltid");
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sfmc_id");
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = null;
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = null;
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = null;
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = null;
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = null;
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = null;
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = null;
            }
            if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3) && TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4) && ((!z || TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) && TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6) && TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7) && TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8) && TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                C786410Ut5.LJJJI("campaign", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, bundle);
            }
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                C786410Ut5.LJJJI("source", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, bundle);
            }
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                C786410Ut5.LJJJI("medium", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, bundle);
            }
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
                C786410Ut5.LJJJI("gclid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, bundle);
            }
            if (z && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) {
                C786410Ut5.LJJJI("gbraid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, bundle);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gad_source");
            if (z && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10)) {
                C786410Ut5.LJJJI("gad_source", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10, bundle);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_term");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11)) {
                C786410Ut5.LJJJI("term", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11, bundle);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_content");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12)) {
                C786410Ut5.LJJJI("content", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12, bundle);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aclid");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13)) {
                C786410Ut5.LJJJI("aclid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13, bundle);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "cp1");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14)) {
                C786410Ut5.LJJJI("cp1", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14, bundle);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anid");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15)) {
                C786410Ut5.LJJJI("anid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15, bundle);
            }
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6)) {
                C786410Ut5.LJJJI("campaign_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, bundle);
            }
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7)) {
                C786410Ut5.LJJJI("dclid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7, bundle);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_source_platform");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16)) {
                C786410Ut5.LJJJI("source_platform", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16, bundle);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_creative_format");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17)) {
                C786410Ut5.LJJJI("creative_format", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17, bundle);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_marketing_tactic");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18)) {
                C786410Ut5.LJJJI("marketing_tactic", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18, bundle);
            }
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8)) {
                C786410Ut5.LJJJI("srsltid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8, bundle);
            }
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9)) {
                C786410Ut5.LJJJI("sfmc_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9, bundle);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJIIIIZZ.LIZ(e, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final void LJJI(long j, Bundle bundle) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            LJIILJJIL().LJIIIIZZ.LIZ(Long.valueOf(j2), "Params already contained engagement");
        }
        bundle.putLong("_et", j + j2);
    }

    public final void LJJIFFI(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                LIZJ().LJJII(bundle, str, LJIIIIZZ(bundle2, str));
            }
        }
    }

    public final void LJJIII(InterfaceC19804212e8 interfaceC19804212e8, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            interfaceC19804212e8.LJJ(bundle);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(e, "Error returning int value to wrapper");
        }
    }

    public final void LJJIIJ(InterfaceC19804212e8 interfaceC19804212e8, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            interfaceC19804212e8.LJJ(bundle);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(e, "Error returning long value to wrapper");
        }
    }

    public final void LJJIIJZLJL(InterfaceC19804212e8 interfaceC19804212e8, Bundle bundle) {
        try {
            interfaceC19804212e8.LJJ(bundle);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(e, "Error returning bundle value to wrapper");
        }
    }

    public final void LJJIIZ(InterfaceC19804212e8 interfaceC19804212e8, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIL(bundle, "r", arrayList);
        try {
            interfaceC19804212e8.LJJ(bundle);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(e, "Error returning bundle list to wrapper");
        }
    }

    public final void LJJIIZI(InterfaceC19804212e8 interfaceC19804212e8, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            interfaceC19804212e8.LJJ(bundle);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(e, "Error returning boolean value to wrapper");
        }
    }

    public final void LJJIJ(InterfaceC19804212e8 interfaceC19804212e8, byte[] bArr) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJ(bundle, "r", bArr);
        try {
            interfaceC19804212e8.LJJ(bundle);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(e, "Error returning byte array to wrapper");
        }
    }

    public final void LJJIJIIJIL(String str, InterfaceC19804212e8 interfaceC19804212e8) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("r", str, bundle);
        try {
            interfaceC19804212e8.LJJ(bundle);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(e, "Error returning string value to wrapper");
        }
    }

    public final void LJJIJL(C12ZX c12zx, int i) {
        int i2 = 0;
        for (String str : new TreeSet(c12zx.LIZLLL.keySet())) {
            if (LJJLJLI(str) && (i2 = i2 + 1) > i) {
                LJIILJJIL().LJII.LIZIZ(this.LIZ.LJIIL.LIZJ(c12zx.LIZ), "Event can't contain more than " + i + " params", this.LIZ.LJIIL.LIZ(c12zx.LIZLLL));
                LJJL(5, c12zx.LIZLLL);
                c12zx.LIZLLL.remove(str);
            }
        }
    }

    public final boolean LJJJ(double d, String str) {
        try {
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(this.LIZ.LIZ, 0, "google.analytics.deferred.deeplink.prefs").edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return editorEdit.commit();
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZ(e, "Failed to persist Deferred Deep Link. exception");
            return false;
        }
    }

    public final boolean LJJJJJ(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            C0W3J.LJIIIIZZ(str);
            if (!str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                if (TextUtils.isEmpty(this.LIZ.LIZIZ)) {
                    LJIILJJIL().LJII.LIZ(C19806212eS.LJIIJ(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                }
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            C0W3J.LJIIIIZZ(str2);
            if (!str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                LJIILJJIL().LJII.LIZ(C19806212eS.LJIIJ(str2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
            return true;
        }
        if (TextUtils.isEmpty(this.LIZ.LIZIZ)) {
            LJIILJJIL().LJII.LIZJ("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    public final Object LJJJLZIJ(Object obj, String str) {
        int iLJII;
        if ("_ev".equals(str)) {
            return LJIL(obj, this.LIZ.LJI.LJIIJ(null, false), true, true);
        }
        if (LJJLIL(str)) {
            iLJII = this.LIZ.LJI.LJIIJ(null, false);
        } else {
            iLJII = this.LIZ.LJI.LJII(null, false);
        }
        return LJIL(obj, iLJII, false, true);
    }

    public final boolean LJJLI(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoLIZIZ = C812450Vtz.LIZ(context).LIZIZ(64, str);
            if (packageInfoLIZIZ != null && (signatureArr = packageInfoLIZIZ.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZ(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJIILJJIL().LJFF.LIZ(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean LJJLIIIIJ(String str, String str2) {
        if (str2 == null) {
            LJIILJJIL().LJII.LIZ(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            LJIILJJIL().LJII.LIZ(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            LJIILJJIL().LJII.LIZIZ(str, "Name must start with a letter or _ (underscore). Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                LJIILJJIL().LJII.LIZIZ(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final Object LJJLIIIJ(Object obj, String str) {
        if ("_ldl".equals(str)) {
            return LJIL(obj, LJJZZIII(str), true, false);
        }
        return LJIL(obj, LJJZZIII(str), false, false);
    }

    public final boolean LJJLIIIJJI(String str, String str2) {
        if (str2 == null) {
            LJIILJJIL().LJII.LIZ(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            LJIILJJIL().LJII.LIZ(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            LJIILJJIL().LJII.LIZIZ(str, "Name must start with a letter. Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                LJIILJJIL().LJII.LIZIZ(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean LJJLIIIJJIZ(String str, String str2) {
        C19820112gh.LIZ();
        if (this.LIZ.LJI.LJIJI(null, C19817012gC.LJJZZI) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.LIZ.LJI.LJIJ("debug.firebase.analytics.app", "").equals(str);
    }

    public static String LJJ(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i) {
            if (!z) {
                return null;
            }
            String strSubstring = str.substring(0, str.offsetByCodePoints(0, i));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strSubstring);
            sbLIZ.append("...");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static void LJJIJLIJ(C19811512fJ c19811512fJ, Bundle bundle, boolean z) {
        if (bundle != null) {
            if (c19811512fJ != null) {
                if (!bundle.containsKey("_sc") || z) {
                    String str = c19811512fJ.LIZ;
                    if (str != null) {
                        C786410Ut5.LJJJI("_sn", str, bundle);
                    } else {
                        bundle.remove("_sn");
                    }
                    String str2 = c19811512fJ.LIZIZ;
                    if (str2 != null) {
                        C786410Ut5.LJJJI("_sc", str2, bundle);
                    } else {
                        bundle.remove("_sc");
                    }
                    bundle.putLong("_si", c19811512fJ.LIZJ);
                    return;
                }
                return;
            }
            if (z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
            }
        }
    }

    public final void LJJII(Bundle bundle, String str, Object obj) {
        String simpleName;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            C786410Ut5.LJJJI(str, String.valueOf(obj), bundle);
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            C786410Ut5.LJJIJLIJ(bundle, str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                simpleName = obj.getClass().getSimpleName();
            } else {
                simpleName = null;
            }
            LJIILJJIL().LJIIJ.LIZIZ(this.LIZ.LJIIL.LJFF(str), "Not putting event parameter. Invalid value type. name, type", simpleName);
        }
    }

    public final void LJJIZ(Parcelable[] parcelableArr, int i, boolean z) {
        C0W3J.LJIIIIZZ(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (LJJLJLI(str) && !LJJJJLI(str, C19786812bK.LIZLLL) && (i2 = i2 + 1) > i) {
                    if (z) {
                        LJIILJJIL().LJII.LIZIZ(this.LIZ.LJIIL.LJFF(str), "Param can't contain more than " + i + " item-scoped custom parameters", this.LIZ.LJIIL.LIZ(bundle));
                        LJJL(28, bundle);
                    } else {
                        LJIILJJIL().LJII.LIZIZ(this.LIZ.LJIIL.LJFF(str), "Param cannot contain item-scoped custom parameters", this.LIZ.LJIIL.LIZ(bundle));
                        LJJL(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean LJJJI(int i, String str, String str2) {
        if (str2 == null) {
            LJIILJJIL().LJII.LIZ(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i) {
            LJIILJJIL().LJII.LIZLLL("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
        return true;
    }

    public static void LJJIJIIJI(Object obj, int i, String str, Bundle bundle) {
        if (LJJL(i, bundle)) {
            C786410Ut5.LJJJI("_ev", LJJ(40, str, true), bundle);
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean LJJJJJL(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty) {
            if (!zIsEmpty2) {
                C0W3J.LJIIIIZZ(str);
                if (!str.equals(str2)) {
                    return true;
                }
                return false;
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        }
        if (zIsEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            }
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        }
        if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        }
        return false;
    }

    public final Bundle LJIIZILJ(String str, Bundle bundle, List list, boolean z) {
        int i;
        int iLJJZ;
        String str2;
        String str3;
        boolean zLJJJJLI = LJJJJLI(str, C19781212aQ.LIZLLL);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            if (this.LIZ.LJI.LIZJ().LJJJJZ(201500000)) {
                i = 100;
            } else {
                i = 25;
            }
            int i2 = 0;
            for (String str4 : new TreeSet(bundle.keySet())) {
                if ((list == null || !list.contains(str4)) && ((!z && (iLJJZ = LJJZZI(str4)) != 0) || (iLJJZ = LJJZ(str4)) != 0)) {
                    if (iLJJZ == 3) {
                        str2 = str4;
                    } else {
                        str2 = null;
                    }
                    LJJIJIIJI(str2, iLJJZ, str4, bundle2);
                    bundle2.remove(str4);
                } else {
                    int iLJIIJJI = LJIIJJI(str, str4, LJIIIIZZ(bundle, str4), bundle2, list, z, zLJJJJLI);
                    if (iLJIIJJI == 17) {
                        LJJIJIIJI(Boolean.FALSE, iLJIIJJI, str4, bundle2);
                    } else if (iLJIIJJI != 0 && !"_ev".equals(str4)) {
                        if (iLJIIJJI == 21) {
                            str3 = str;
                        } else {
                            str3 = str4;
                        }
                        LJJIJIIJI(LJIIIIZZ(bundle, str4), iLJIIJJI, str3, bundle2);
                        bundle2.remove(str4);
                    }
                    if (LJJLJLI(str4) && (i2 = i2 + 1) > i) {
                        LJIILJJIL().LJII.LIZIZ(this.LIZ.LJIIL.LIZJ(str), "Event can't contain more than " + i + " params", this.LIZ.LJIIL.LIZ(bundle));
                        LJJL(5, bundle2);
                        bundle2.remove(str4);
                    }
                }
            }
            return bundle2;
        }
        return null;
    }

    public final Object LJIL(Object obj, int i, boolean z, boolean z2) {
        long j;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j = 1;
                } else {
                    j = 0;
                }
                return Long.valueOf(j);
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            }
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if (!z2) {
                    return null;
                }
                if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        Bundle bundleLJIILLIIL = LJIILLIIL((Bundle) parcelable);
                        if (!bundleLJIILLIIL.isEmpty()) {
                            arrayList.add(bundleLJIILLIIL);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return LJJ(i, String.valueOf(obj), z);
        }
        return obj;
    }

    public final boolean LJJJIL(int i, String str, String str2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i) {
                LJIILJJIL().LJIIJ.LIZLLL("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean LJJJJL(String str, String str2, String[] strArr, String[] strArr2) {
        if (str2 == null) {
            LJIILJJIL().LJII.LIZ(str, "Name is required and can't be null. Type");
            return false;
        }
        for (String str3 : LJIIIIZZ) {
            if (str2.startsWith(str3)) {
                LJIILJJIL().LJII.LIZIZ(str, "Name starts with reserved prefix. Type, name", str2);
                return false;
            }
        }
        if (strArr == null || !LJJJJLI(str2, strArr) || (strArr2 != null && LJJJJLI(str2, strArr2))) {
            return true;
        }
        LJIILJJIL().LJII.LIZIZ(str, "Name is reserved. Type, name", str2);
        return false;
    }

    public final zzbf LJIJJLI(String str, Bundle bundle, String str2, long j, boolean z) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (LJIIJ(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            C786410Ut5.LJJJI("_o", str2, bundle2);
            Bundle bundleLJIIZILJ = LJIIZILJ(str, bundle2, Collections.singletonList("_o"), true);
            if (z) {
                bundleLJIIZILJ = LJIILLIIL(bundleLJIIZILJ);
            }
            C0W3J.LJIIIIZZ(bundleLJIIZILJ);
            return new zzbf(str, new zzba(bundleLJIIZILJ), str2, j);
        }
        LJIILJJIL().LJFF.LIZ(this.LIZ.LJIIL.LJI(str), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    public final void LJJIJIL(String str, String str2, Bundle bundle, List list, boolean z) {
        int i;
        int iLJJZ;
        String str3;
        int iLJIIJJI;
        if (bundle == null) {
            return;
        }
        C19791812c8 c19791812c8 = this.LIZ.LJI;
        c19791812c8.getClass();
        C19820212gi.LIZ();
        if (c19791812c8.LIZ.LJI.LJIJI(null, C19817012gC.LJLIIIL) && c19791812c8.LIZJ().LJJJJZ(231100000)) {
            i = 35;
        } else {
            i = 0;
        }
        int i2 = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if ((list == null || !list.contains(str4)) && ((!z && (iLJJZ = LJJZZI(str4)) != 0) || (iLJJZ = LJJZ(str4)) != 0)) {
                if (iLJJZ == 3) {
                    str3 = str4;
                } else {
                    str3 = null;
                }
                LJJIJIIJI(str3, iLJJZ, str4, bundle);
                bundle.remove(str4);
            } else {
                if (LJJJJIZL(LJIIIIZZ(bundle, str4))) {
                    LJIILJJIL().LJIIJ.LIZLLL("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    iLJIIJJI = 22;
                } else {
                    iLJIIJJI = LJIIJJI(str, str4, LJIIIIZZ(bundle, str4), bundle, list, z, false);
                    if (iLJIIJJI != 0) {
                    }
                    if (!LJJLJLI(str4) && !LJJJJLI(str4, C19786812bK.LIZLLL)) {
                        i2++;
                        if (!LJJJJZ(231100000)) {
                            LJIILJJIL().LJII.LIZIZ(this.LIZ.LJIIL.LIZJ(str), "Item array not supported on client's version of Google Play Services (Android Only)", this.LIZ.LJIIL.LIZ(bundle));
                            LJJL(23, bundle);
                            bundle.remove(str4);
                        } else if (i2 > i) {
                            C19820212gi.LIZ();
                            if (this.LIZ.LJI.LJIJI(null, C19817012gC.LJLIIIL)) {
                                LJIILJJIL().LJII.LIZIZ(this.LIZ.LJIIL.LIZJ(str), "Item can't contain more than " + i + " item-scoped custom params", this.LIZ.LJIIL.LIZ(bundle));
                                LJJL(28, bundle);
                                bundle.remove(str4);
                            } else {
                                LJIILJJIL().LJII.LIZIZ(this.LIZ.LJIIL.LIZJ(str), "Item cannot contain custom parameters", this.LIZ.LJIIL.LIZ(bundle));
                                LJJL(23, bundle);
                                bundle.remove(str4);
                            }
                        }
                    }
                }
                if (!"_ev".equals(str4)) {
                    LJJIJIIJI(LJIIIIZZ(bundle, str4), iLJIIJJI, str4, bundle);
                    bundle.remove(str4);
                } else if (!LJJLJLI(str4)) {
                }
            }
        }
    }

    public static void LJJIL(InterfaceC19804312e9 interfaceC19804312e9, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        LJJL(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            C786410Ut5.LJJJI(str2, str3, bundle);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        interfaceC19804312e9.LIZ(str, "_err", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIJJI(java.lang.String r21, java.lang.String r22, java.lang.Object r23, android.os.Bundle r24, java.util.List r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19803112dx.LJIIJJI(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }
}
