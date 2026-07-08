package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.measurement.internal.zzba;
import com.google.android.gms.measurement.internal.zzmu;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.12Zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19777312Zn extends AbstractC19781512aT {
    @Override // X.AbstractC19781512aT
    public final boolean LJIIJ() {
        return false;
    }

    public final List<Integer> LJJJJJ() {
        Context context = this.LIZIZ.LJIIJJI.LIZ;
        List<C19812612fU<?>> list = C19817012gC.LIZ;
        C19834812j4 c19834812j4LIZ = C19834812j4.LIZ(context.getContentResolver(), C2211508lV.LIZ("com.google.android.gms.measurement"), new Runnable() { // from class: X.0uKI
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzbg@3846.run");
                try {
                    AbstractC19833712it.LJIIIZ.incrementAndGet();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzbg@3846.run");
            }
        });
        Map<String, String> mapEmptyMap = c19834812j4LIZ == null ? Collections.emptyMap() : c19834812j4LIZ.LIZIZ();
        if (mapEmptyMap == null || mapEmptyMap.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = C19817012gC.LJJJIL.LIZ(null).intValue();
        for (Map.Entry<String, String> entry : mapEmptyMap.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i = CastIntegerProtector.parseInt(entry.getValue());
                    if (i != 0) {
                        arrayList.add(Integer.valueOf(i));
                        if (arrayList.size() >= iIntValue) {
                            LJIILJJIL().LJIIIIZZ.LIZ(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LJIILJJIL().LJIIIIZZ.LIZ(e, "Experiment ID NumberFormatException");
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public C19777312Zn(C12Z4 c12z4) {
        super(c12z4);
    }

    public static Bundle LJIILL(List<C19777712Zr> list) {
        Bundle bundle = new Bundle();
        for (C19777712Zr c19777712Zr : list) {
            String str = c19777712Zr.zzf;
            if (c19777712Zr.LJJIJIIJI()) {
                bundle.putDouble(str, c19777712Zr.zzj);
            } else if (c19777712Zr.LJJIJIIJIL()) {
                bundle.putFloat(str, c19777712Zr.zzi);
            } else if (c19777712Zr.LJJIJLIJ()) {
                C786410Ut5.LJJJI(str, c19777712Zr.zzg, bundle);
            } else if (c19777712Zr.LJJIJIL()) {
                bundle.putLong(str, c19777712Zr.zzh);
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.measurement.internal.zzbf LJIL(X.C19795812cm r9) {
        /*
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.LIZJ
            r0 = 1
            android.os.Bundle r3 = LJIILLIIL(r1, r0)
            java.lang.String r1 = "_o"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r3.get(r1)     // Catch: java.lang.Exception -> L16 java.lang.OutOfMemoryError -> L1b
            if (r0 == 0) goto L1f
            goto L22
        L16:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L1f
        L1b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L1f:
            java.lang.String r7 = "app"
            goto L26
        L22:
            java.lang.String r7 = r0.toString()
        L26:
            java.lang.String r2 = r9.LIZ
            java.lang.String[] r1 = X.C19781212aQ.LIZ
            java.lang.String[] r0 = X.C19781212aQ.LIZJ
            java.lang.String r5 = X.C19785212b4.LIZ(r2, r1, r0)
            if (r5 != 0) goto L34
            java.lang.String r5 = r9.LIZ
        L34:
            com.google.android.gms.measurement.internal.zzbf r4 = new com.google.android.gms.measurement.internal.zzbf
            com.google.android.gms.measurement.internal.zzba r6 = new com.google.android.gms.measurement.internal.zzba
            r6.<init>(r3)
            long r8 = r9.LIZIZ
            r4.<init>(r5, r6, r7, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19777312Zn.LJIL(X.12cm):com.google.android.gms.measurement.internal.zzbf");
    }

    public static List<Long> LJJIII(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            int i2 = 0;
            do {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
                i2++;
                arrayList.add(Long.valueOf(j));
            } while (i2 < 64);
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static boolean LJJJIL(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    public final long LJIILIIL(byte[] bArr) {
        C0W3J.LJIIIIZZ(bArr);
        LIZJ().LJ();
        MessageDigest messageDigestLJLIIL = C19803112dx.LJLIIL();
        if (messageDigestLJLIIL == null) {
            LJIILJJIL().LJFF.LIZJ("Failed to get MD5");
            return 0L;
        }
        return C19803112dx.LJIILL(messageDigestLJLIIL.digest(bArr));
    }

    public final C12ZI LJIJI(C12ZA c12za) {
        C12ZH c12zhLJJIIJ = C12ZI.LJJIIJ();
        long j = c12za.LJ;
        c12zhLJJIIJ.LJIIJ();
        C12ZI.LJJIII(j, (C12ZI) c12zhLJJIIJ.LLILLJJLI);
        zzba zzbaVar = c12za.LJFF;
        zzbaVar.getClass();
        C19781412aS c19781412aS = new C19781412aS(zzbaVar);
        while (c19781412aS.hasNext()) {
            String str = (String) c19781412aS.next();
            C19778912a3 c19778912a3LJJIIZI = C19777712Zr.LJJIIZI();
            c19778912a3LJJIIZI.LJIILIIL(str);
            Object objLLIIIL = c12za.LJFF.LLIIIL(str);
            C0W3J.LJIIIIZZ(objLLIIIL);
            LJJIJIIJI(c19778912a3LJJIIZI, objLLIIIL);
            c12zhLJJIIJ.LJIILIIL(c19778912a3LJJIIZI);
        }
        return (C12ZI) c12zhLJJIIJ.LJI();
    }

    public final String LJJI(C12ZF c12zf) {
        Long lValueOf;
        Long lValueOf2;
        Double dValueOf;
        C12ZZ c12zzLLFZ;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        C19820112gh.LIZ();
        if (this.LIZ.LJI.LJIJI(null, C19817012gC.LJJZ) && c12zf.zzf.size() > 0) {
            LIZJ();
            if (C19803112dx.LJJLIIIJLLLLLLLZ(c12zf.zzf.get(0).zzu) && c12zf.LJJIII()) {
                LJJIJLIJ(sb, 0, "UploadSubdomain", c12zf.zzh);
            }
        }
        for (C12ZD c12zd : c12zf.zzf) {
            if (c12zd != null) {
                LJJIJIIJIL(sb, 1);
                sb.append("bundle {\n");
                if (c12zd.LJJJLIIL()) {
                    LJJIJLIJ(sb, 1, "protocol_version", Integer.valueOf(c12zd.zzg));
                }
                C19820712gn.LIZ();
                if (this.LIZ.LJI.LJIJI(c12zd.zzu, C19817012gC.LJJLL) && c12zd.LJJJZ()) {
                    LJJIJLIJ(sb, 1, "session_stitching_token", c12zd.zzbd);
                }
                LJJIJLIJ(sb, 1, "platform", c12zd.zzo);
                if (c12zd.LJJJJL()) {
                    LJJIJLIJ(sb, 1, "gmp_version", Long.valueOf(c12zd.zzw));
                }
                if (c12zd.LJJLIIIJILLIZJL()) {
                    LJJIJLIJ(sb, 1, "uploading_gmp_version", Long.valueOf(c12zd.zzx));
                }
                if (c12zd.LJJJJJ()) {
                    LJJIJLIJ(sb, 1, "dynamite_version", Long.valueOf(c12zd.zzau));
                }
                if (c12zd.LJJIJIIJIL()) {
                    LJJIJLIJ(sb, 1, "config_version", Long.valueOf(c12zd.zzam));
                }
                LJJIJLIJ(sb, 1, "gmp_app_id", c12zd.zzae);
                LJJIJLIJ(sb, 1, "admob_app_id", c12zd.zzar);
                LJJIJLIJ(sb, 1, "app_id", c12zd.zzu);
                LJJIJLIJ(sb, 1, "app_version", c12zd.zzv);
                if (c12zd.LJJIIZI()) {
                    LJJIJLIJ(sb, 1, "app_version_major", Integer.valueOf(c12zd.zzai));
                }
                LJJIJLIJ(sb, 1, "firebase_instance_id", c12zd.zzah);
                if (c12zd.LJJJJIZL()) {
                    LJJIJLIJ(sb, 1, "dev_cert_hash", Long.valueOf(c12zd.zzab));
                }
                LJJIJLIJ(sb, 1, "app_store", c12zd.zzt);
                if (c12zd.LJJLIIIJ()) {
                    LJJIJLIJ(sb, 1, "upload_timestamp_millis", Long.valueOf(c12zd.zzj));
                }
                if (c12zd.LJJL()) {
                    LJJIJLIJ(sb, 1, "start_timestamp_millis", Long.valueOf(c12zd.zzk));
                }
                if (c12zd.LJJJJJL()) {
                    LJJIJLIJ(sb, 1, "end_timestamp_millis", Long.valueOf(c12zd.zzl));
                }
                if (c12zd.LJJJJZI()) {
                    LJJIJLIJ(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c12zd.zzm));
                }
                if (c12zd.LJJJJZ()) {
                    LJJIJLIJ(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c12zd.zzn));
                }
                LJJIJLIJ(sb, 1, "app_instance_id", c12zd.zzaa);
                LJJIJLIJ(sb, 1, "resettable_device_id", c12zd.zzy);
                LJJIJLIJ(sb, 1, "ds_id", c12zd.zzao);
                if (c12zd.LJJJJLL()) {
                    LJJIJLIJ(sb, 1, "limited_ad_tracking", Boolean.valueOf(c12zd.zzz));
                }
                LJJIJLIJ(sb, 1, "os_version", c12zd.zzp);
                LJJIJLIJ(sb, 1, "device_model", c12zd.zzq);
                LJJIJLIJ(sb, 1, "user_default_language", c12zd.zzr);
                if (c12zd.LJJLIIIIJ()) {
                    LJJIJLIJ(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c12zd.zzs));
                }
                if (c12zd.LJJIJIIJI()) {
                    LJJIJLIJ(sb, 1, "bundle_sequential_index", Integer.valueOf(c12zd.zzac));
                }
                C19820112gh.LIZ();
                LIZJ();
                if (C19803112dx.LJJLIIIJLLLLLLLZ(c12zd.zzu) && this.LIZ.LJI.LJIJI(null, C19817012gC.LJJZ) && c12zd.LJJJJI()) {
                    LJJIJLIJ(sb, 1, "delivery_index", Integer.valueOf(c12zd.zzbo));
                }
                if (c12zd.LJJJLZIJ()) {
                    LJJIJLIJ(sb, 1, "service_upload", Boolean.valueOf(c12zd.zzaf));
                }
                LJJIJLIJ(sb, 1, "health_monitor", c12zd.zzad);
                if (c12zd.LJJJLL()) {
                    LJJIJLIJ(sb, 1, "retry_counter", Integer.valueOf(c12zd.zzaq));
                }
                if (c12zd.LJJJIL()) {
                    LJJIJLIJ(sb, 1, "consent_signals", c12zd.zzax);
                }
                if (c12zd.LJJJJLI()) {
                    LJJIJLIJ(sb, 1, "is_dma_region", Boolean.valueOf(c12zd.zzbj));
                }
                if (c12zd.LJJJJ()) {
                    LJJIJLIJ(sb, 1, "core_platform_services", c12zd.zzbk);
                }
                if (c12zd.LJJJI()) {
                    LJJIJLIJ(sb, 1, "consent_diagnostics", c12zd.zzbi);
                }
                if (c12zd.LJJLI()) {
                    LJJIJLIJ(sb, 1, "target_os_version", Long.valueOf(c12zd.zzbg));
                }
                C19820512gl.LIZ();
                if (this.LIZ.LJI.LJIJI(c12zd.zzu, C19817012gC.LJLIL)) {
                    LJJIJLIJ(sb, 1, "ad_services_version", Integer.valueOf(c12zd.LJJI()));
                    if (c12zd.LJJIJ() && (c12zzLLFZ = c12zd.LLFZ()) != null) {
                        LJJIJIIJIL(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        LJJIJLIJ(sb, 2, "eligible", Boolean.valueOf(c12zzLLFZ.zzf));
                        LJJIJLIJ(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c12zzLLFZ.zzg));
                        LJJIJLIJ(sb, 2, "pre_r", Boolean.valueOf(c12zzLLFZ.zzh));
                        LJJIJLIJ(sb, 2, "r_extensions_too_old", Boolean.valueOf(c12zzLLFZ.zzi));
                        LJJIJLIJ(sb, 2, "adservices_extension_too_old", Boolean.valueOf(c12zzLLFZ.zzj));
                        LJJIJLIJ(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(c12zzLLFZ.zzk));
                        LJJIJLIJ(sb, 2, "measurement_manager_disabled", Boolean.valueOf(c12zzLLFZ.zzl));
                        LJJIJIIJIL(sb, 2);
                        sb.append("}\n");
                    }
                }
                InterfaceC19875012pY<C12ZE> interfaceC19875012pY = c12zd.zzi;
                if (interfaceC19875012pY != null) {
                    for (C12ZE c12ze : interfaceC19875012pY) {
                        if (c12ze != null) {
                            LJJIJIIJIL(sb, 2);
                            sb.append("user_property {\n");
                            if (c12ze.LJJIJLIJ()) {
                                lValueOf = Long.valueOf(c12ze.zzf);
                            } else {
                                lValueOf = null;
                            }
                            LJJIJLIJ(sb, 2, "set_timestamp_millis", lValueOf);
                            LJJIJLIJ(sb, 2, "name", this.LIZ.LJIIL.LJI(c12ze.zzg));
                            LJJIJLIJ(sb, 2, "string_value", c12ze.zzh);
                            if (c12ze.LJJIJL()) {
                                lValueOf2 = Long.valueOf(c12ze.zzi);
                            } else {
                                lValueOf2 = null;
                            }
                            LJJIJLIJ(sb, 2, "int_value", lValueOf2);
                            if (c12ze.LJJIJIIJIL()) {
                                dValueOf = Double.valueOf(c12ze.zzk);
                            } else {
                                dValueOf = null;
                            }
                            LJJIJLIJ(sb, 2, "double_value", dValueOf);
                            LJJIJIIJIL(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                InterfaceC19875012pY<C19778112Zv> interfaceC19875012pY2 = c12zd.zzag;
                if (interfaceC19875012pY2 != null) {
                    for (C19778112Zv c19778112Zv : interfaceC19875012pY2) {
                        if (c19778112Zv != null) {
                            LJJIJIIJIL(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c19778112Zv.LJJIJIIJI()) {
                                LJJIJLIJ(sb, 2, "audience_id", Integer.valueOf(c19778112Zv.LJJI()));
                            }
                            if (c19778112Zv.LJJIJIIJIL()) {
                                LJJIJLIJ(sb, 2, "new_audience", Boolean.valueOf(c19778112Zv.zzi));
                            }
                            LJJIL(sb, "current_data", c19778112Zv.LJJIIZI());
                            if (c19778112Zv.LJJIJIL()) {
                                LJJIL(sb, "previous_data", c19778112Zv.LJJIJ());
                            }
                            LJJIJIIJIL(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                InterfaceC19875012pY<C12ZI> interfaceC19875012pY3 = c12zd.zzh;
                if (interfaceC19875012pY3 != null) {
                    for (C12ZI c12zi : interfaceC19875012pY3) {
                        if (c12zi != null) {
                            LJJIJIIJIL(sb, 2);
                            sb.append("event {\n");
                            LJJIJLIJ(sb, 2, "name", this.LIZ.LJIIL.LIZJ(c12zi.zzg));
                            if (c12zi.LJJIJ()) {
                                LJJIJLIJ(sb, 2, "timestamp_millis", Long.valueOf(c12zi.zzh));
                            }
                            if (c12zi.LJJIIZI()) {
                                LJJIJLIJ(sb, 2, "previous_timestamp_millis", Long.valueOf(c12zi.zzi));
                            }
                            if (c12zi.LJJIIZ()) {
                                LJJIJLIJ(sb, 2, "count", Integer.valueOf(c12zi.LJJI()));
                            }
                            if (c12zi.zzf.size() != 0) {
                                LJJIIJZLJL(2, sb, c12zi.zzf);
                            }
                            LJJIJIIJIL(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                LJJIJIIJIL(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public final byte[] LJJJJ(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZ(e, "Failed to gzip content");
            throw e;
        }
    }

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
    public final boolean LJJJJI(String str) throws Throwable {
        Account[] accountArr;
        ((InterfaceC19785912bB) C19815312fv.LLILLJJLI.get()).zza();
        if (this.LIZ.LJI.LJIJI(null, C19817012gC.LJZ)) {
            return false;
        }
        C0W3J.LJIIIIZZ(str);
        C12Z5 c12z5LJJJLIIL = LJI().LJJJLIIL(str);
        if (c12z5LJJJLIIL == null) {
            return false;
        }
        C19807812ei c19807812eiLJIIIZ = this.LIZ.LJIIIZ();
        c19807812eiLJIIIZ.LJ();
        c19807812eiLJIIIZ.LIZ.LJIILIIL.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - c19807812eiLJIIIZ.LJI > 86400000) {
            c19807812eiLJIIIZ.LJFF = null;
        }
        Boolean bool = c19807812eiLJIIIZ.LJFF;
        if (bool != null) {
            if (!bool.booleanValue()) {
                return false;
            }
        } else {
            if (C838410Wul.LIZ(c19807812eiLJIIIZ.LIZ.LIZ, "android.permission.GET_ACCOUNTS") != 0) {
                c19807812eiLJIIIZ.LJIILJJIL().LJIIIZ.LIZJ("Permission error checking for dasher/unicorn accounts");
                c19807812eiLJIIIZ.LJI = jCurrentTimeMillis;
                c19807812eiLJIIIZ.LJFF = Boolean.FALSE;
                return false;
            }
            if (c19807812eiLJIIIZ.LJ == null) {
                c19807812eiLJIIIZ.LJ = AccountManager.get(c19807812eiLJIIIZ.LIZ.LIZ);
            }
            try {
                accountArr = (Account[]) C2204961BRm.LIZJ(c19807812eiLJIIIZ.LJ, "com.google", new String[]{"service_HOSTED"}, null, null, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOID9zPVdd3eEmUDB28GG", new String[]{"016a9"})).getResult();
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                TryCatchGuardChecker.doCheck(e);
                c19807812eiLJIIIZ.LJIILJJIL().LJI.LIZ(e, "Exception checking account types");
            }
            if (accountArr != null && accountArr.length > 0) {
                c19807812eiLJIIIZ.LJFF = Boolean.TRUE;
                c19807812eiLJIIIZ.LJI = jCurrentTimeMillis;
            } else {
                Account[] accountArr2 = (Account[]) C2204961BRm.LIZJ(c19807812eiLJIIIZ.LJ, "com.google", new String[]{"service_uca"}, null, null, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOID9zPVdd3eEmUDB28GG", new String[]{"016a9"})).getResult();
                if (accountArr2 != null && accountArr2.length > 0) {
                    c19807812eiLJIIIZ.LJFF = Boolean.TRUE;
                    c19807812eiLJIIIZ.LJI = jCurrentTimeMillis;
                }
                c19807812eiLJIIIZ.LJI = jCurrentTimeMillis;
                c19807812eiLJIIIZ.LJFF = Boolean.FALSE;
                return false;
            }
        }
        c12z5LJJJLIIL.LIZ.LJIIL().LJ();
        if (c12z5LJJJLIIL.LJIILL) {
            C19779612aA c19779612aALJII = LJII();
            c19779612aALJII.LJ();
            C19779712aB c19779712aBLJJIFFI = c19779612aALJII.LJJIFFI(str);
            if (c19779712aBLJJIFFI != null && c19779712aBLJJIFFI.zzm) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final byte[] LJJJJIZL(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr2, 0, i);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZ(e, "Failed to ungzip content");
            throw e;
        }
    }

    public static int LJIIJJI(C12ZC c12zc, String str) {
        for (int i = 0; i < ((C12ZD) c12zc.LLILLJJLI).zzi.size(); i++) {
            if (str.equals(((C12ZD) c12zc.LLILLJJLI).zzi.get(i).zzg)) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle LJIILLIIL(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                C786410Ut5.LJJJI(str, null, bundle);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = ListProtector.get(arrayList, i);
                        i++;
                        arrayList2.add(LJIILLIIL((Map) obj2, false));
                    }
                    C786410Ut5.LJJIJLIJ(bundle, str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                C786410Ut5.LJJJI(str, obj.toString(), bundle);
            }
        }
        return bundle;
    }

    public static C19777712Zr LJIJJ(C12ZI c12zi, String str) {
        for (C19777712Zr c19777712Zr : c12zi.zzf) {
            if (c19777712Zr.zzf.equals(str)) {
                return c19777712Zr;
            }
        }
        return null;
    }

    public static AbstractC19899712tX LJIJJLI(AbstractC19899712tX abstractC19899712tX, byte[] bArr) {
        C19853712m7 c19853712m7LIZIZ = C19853712m7.LIZIZ;
        if (c19853712m7LIZIZ == null) {
            synchronized (C19853712m7.class) {
                try {
                    c19853712m7LIZIZ = C19853712m7.LIZIZ;
                    if (c19853712m7LIZIZ == null) {
                        c19853712m7LIZIZ = AbstractC2107408Nk.LIZIZ(C19853712m7.class);
                        C19853712m7.LIZIZ = c19853712m7LIZIZ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c19853712m7LIZIZ == null) {
                abstractC19899712tX.getClass();
                abstractC19899712tX.LJIIJJI(bArr, bArr.length, C19853712m7.LIZJ);
                return abstractC19899712tX;
            }
        }
        abstractC19899712tX.getClass();
        abstractC19899712tX.LJIIJJI(bArr, bArr.length, c19853712m7LIZIZ);
        return abstractC19899712tX;
    }

    public static Map LJJIIJ(Bundle bundle, boolean z) {
        Object obj;
        boolean z2;
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            boolean z3 = obj instanceof Parcelable[];
            if (!z3 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z3) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(LJJIIJ((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = ListProtector.get(arrayList2, i);
                            i++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(LJJIIJ((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(LJJIIJ((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static void LJJIJIIJIL(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static boolean LJJIZ(int i, InterfaceC19785612b8 interfaceC19785612b8) {
        if (i < (((C19886512rP) interfaceC19785612b8).LLILLL << 6)) {
            if (((1 << (i % 64)) & ((Long) ListProtector.get(interfaceC19785612b8, i / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Object LJJJI(C12ZI c12zi, String str) {
        C19777712Zr c19777712ZrLJIJJ = LJIJJ(c12zi, str);
        if (c19777712ZrLJIJJ != null) {
            if (c19777712ZrLJIJJ.LJJIJLIJ()) {
                return c19777712ZrLJIJJ.zzg;
            }
            if (c19777712ZrLJIJJ.LJJIJIL()) {
                return Long.valueOf(c19777712ZrLJIJJ.zzh);
            }
            if (c19777712ZrLJIJJ.LJJIJIIJI()) {
                return Double.valueOf(c19777712ZrLJIJJ.zzj);
            }
            if (c19777712ZrLJIJJ.zzk.size() > 0) {
                InterfaceC19875012pY<C19777712Zr> interfaceC19875012pY = c19777712ZrLJIJJ.zzk;
                ArrayList arrayList = new ArrayList();
                for (C19777712Zr c19777712Zr : interfaceC19875012pY) {
                    if (c19777712Zr != null) {
                        Bundle bundle = new Bundle();
                        for (C19777712Zr c19777712Zr2 : c19777712Zr.zzk) {
                            if (c19777712Zr2.LJJIJLIJ()) {
                                C786410Ut5.LJJJI(c19777712Zr2.zzf, c19777712Zr2.zzg, bundle);
                            } else if (c19777712Zr2.LJJIJIL()) {
                                bundle.putLong(c19777712Zr2.zzf, c19777712Zr2.zzh);
                            } else if (c19777712Zr2.LJJIJIIJI()) {
                                bundle.putDouble(c19777712Zr2.zzf, c19777712Zr2.zzj);
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    public final <T extends Parcelable> T LJIIZILJ(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                T tCreateFromParcel = creator.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                return tCreateFromParcel;
            } catch (C816410W0x e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZJ("Failed to load parcelable from buffer");
                parcelObtain.recycle();
                return null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain.recycle();
            throw th;
        }
    }

    public final List LJJII(InterfaceC19785612b8 interfaceC19785612b8, List list) {
        int i;
        ArrayList arrayList = new ArrayList(interfaceC19785612b8);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            if (num.intValue() < 0) {
                LJIILJJIL().LJIIIIZZ.LIZ(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    LJIILJJIL().LJIIIIZZ.LIZIZ(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    ListProtector.set(arrayList, iIntValue, Long.valueOf(((Long) ListProtector.get(arrayList, iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            i = size;
            size = size2;
            if (size2 < 0 || ((Long) ListProtector.get(arrayList, size2)).longValue() != 0) {
                break;
            }
            size2--;
        }
        return arrayList.subList(0, i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJJIJIIJI(C19778912a3 c19778912a3, Object obj) {
        Object obj2;
        c19778912a3.LJIIJ();
        C19777712Zr.LJJIII((C19777712Zr) c19778912a3.LLILLJJLI);
        c19778912a3.LJIIJ();
        C19777712Zr.LJJIIJ((C19777712Zr) c19778912a3.LLILLJJLI);
        c19778912a3.LJIIJ();
        C19777712Zr.LJJIIZ((C19777712Zr) c19778912a3.LLILLJJLI);
        c19778912a3.LJIIJ();
        C19777712Zr c19777712Zr = (C19777712Zr) c19778912a3.LLILLJJLI;
        c19777712Zr.getClass();
        c19777712Zr.zzk = C19886312rN.LLILZ;
        if (obj instanceof String) {
            c19778912a3.LJIILJJIL((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c19778912a3.LJIIL(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c19778912a3.LJIIJ();
            C19777712Zr.LJJI((C19777712Zr) c19778912a3.LLILLJJLI, dDoubleValue);
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C19778912a3 c19778912a3LJJIIZI = C19777712Zr.LJJIIZI();
                    for (String str : bundle.keySet()) {
                        C19778912a3 c19778912a3LJJIIZI2 = C19777712Zr.LJJIIZI();
                        c19778912a3LJJIIZI2.LJIILIIL(str);
                        try {
                            obj2 = bundle.get(str);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            obj2 = null;
                        } catch (OutOfMemoryError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            obj2 = null;
                        }
                        if (obj2 instanceof Long) {
                            c19778912a3LJJIIZI2.LJIIL(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            c19778912a3LJJIIZI2.LJIILJJIL((String) obj2);
                        } else if (obj2 instanceof Double) {
                            double dDoubleValue2 = ((Double) obj2).doubleValue();
                            c19778912a3LJJIIZI2.LJIIJ();
                            C19777712Zr.LJJI((C19777712Zr) c19778912a3LJJIIZI2.LLILLJJLI, dDoubleValue2);
                        }
                        c19778912a3LJJIIZI.LJIIJ();
                        C19777712Zr c19777712Zr2 = (C19777712Zr) c19778912a3LJJIIZI.LLILLJJLI;
                        AbstractC19899612tW abstractC19899612tWLJI = c19778912a3LJJIIZI2.LJI();
                        c19777712Zr2.getClass();
                        InterfaceC19875012pY<C19777712Zr> interfaceC19875012pY = c19777712Zr2.zzk;
                        if (!interfaceC19875012pY.LIZIZ()) {
                            c19777712Zr2.zzk = AbstractC19899612tW.LJIILIIL(interfaceC19875012pY);
                        }
                        c19777712Zr2.zzk.add((C19777712Zr) abstractC19899612tWLJI);
                    }
                    if (((C19777712Zr) c19778912a3LJJIIZI.LLILLJJLI).zzk.size() > 0) {
                        arrayList.add(c19778912a3LJJIIZI.LJI());
                    }
                }
            }
            c19778912a3.LJIIJ();
            C19777712Zr c19777712Zr3 = (C19777712Zr) c19778912a3.LLILLJJLI;
            int i = C19777712Zr.LL;
            InterfaceC19875012pY<C19777712Zr> interfaceC19875012pY2 = c19777712Zr3.zzk;
            if (!interfaceC19875012pY2.LIZIZ()) {
                c19777712Zr3.zzk = AbstractC19899612tW.LJIILIIL(interfaceC19875012pY2);
            }
            AbstractC19899312tT.LJI(arrayList, c19777712Zr3.zzk);
            return;
        }
        LJIILJJIL().LJFF.LIZ(obj, "Ignoring invalid (type) event param value");
    }

    public final boolean LJJJ(long j, long j2) {
        if (j != 0 && j2 > 0) {
            this.LIZ.LJIILIIL.getClass();
            if (Math.abs(System.currentTimeMillis() - j) <= j2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static String LJJIFFI(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJJIJ(C12ZH c12zh, String str, Object obj) {
        List<C19777712Zr> listLJIJJ = c12zh.LJIJJ();
        int i = 0;
        while (true) {
            if (i < listLJIJJ.size()) {
                if (str.equals(((C19777712Zr) ListProtector.get(listLJIJJ, i)).zzf)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        C19778912a3 c19778912a3LJJIIZI = C19777712Zr.LJJIIZI();
        c19778912a3LJJIIZI.LJIILIIL(str);
        if (obj instanceof Long) {
            c19778912a3LJJIIZI.LJIIL(((Long) obj).longValue());
        } else if (obj instanceof String) {
            c19778912a3LJJIIZI.LJIILJJIL((String) obj);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c19778912a3LJJIIZI.LJIIJ();
            C19777712Zr.LJJI((C19777712Zr) c19778912a3LJJIIZI.LLILLJJLI, dDoubleValue);
        }
        if (i >= 0) {
            c12zh.LJIIJ();
            C12ZI c12zi = (C12ZI) c12zh.LLILLJJLI;
            AbstractC19899612tW abstractC19899612tWLJI = c19778912a3LJJIIZI.LJI();
            int i2 = C12ZI.LL;
            c12zi.getClass();
            c12zi.LJJIJIIJI();
            c12zi.zzf.set(i, abstractC19899612tWLJI);
            return;
        }
        c12zh.LJIILIIL(c19778912a3LJJIIZI);
    }

    public static void LJJIL(StringBuilder sb, String str, C19778212Zw c19778212Zw) {
        Integer numValueOf;
        Integer numValueOf2;
        Long lValueOf;
        if (c19778212Zw == null) {
            return;
        }
        LJJIJIIJIL(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (((C19886512rP) c19778212Zw.zzf).LLILLL != 0) {
            LJJIJIIJIL(sb, 4);
            sb.append("results: ");
            int i = 0;
            for (Long l : c19778212Zw.zzf) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (((C19886512rP) c19778212Zw.zze).LLILLL != 0) {
            LJJIJIIJIL(sb, 4);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : c19778212Zw.zze) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (c19778212Zw.zzg.size() != 0) {
            LJJIJIIJIL(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (C19778812a2 c19778812a2 : c19778212Zw.zzg) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                if (c19778812a2.LJJIIZ()) {
                    numValueOf2 = Integer.valueOf(c19778812a2.LJJI());
                } else {
                    numValueOf2 = null;
                }
                sb.append(numValueOf2);
                sb.append(":");
                if (c19778812a2.LJJIIJZLJL()) {
                    lValueOf = Long.valueOf(c19778812a2.zzg);
                } else {
                    lValueOf = null;
                }
                sb.append(lValueOf);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (c19778212Zw.zzh.size() != 0) {
            LJJIJIIJIL(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (C19778712a1 c19778712a1 : c19778212Zw.zzh) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                if (c19778712a1.LJJIII()) {
                    numValueOf = Integer.valueOf(c19778712a1.zzf);
                } else {
                    numValueOf = null;
                }
                sb.append(numValueOf);
                sb.append(": [");
                Iterator<Long> it2 = c19778712a1.zzg.iterator();
                int i9 = 0;
                while (it2.hasNext()) {
                    long jLongValue = it2.next().longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append(e3.f);
                i7 = i8;
            }
            sb.append("}\n");
        }
        LJJIJIIJIL(sb, 3);
        sb.append("}\n");
    }

    public final void LJJIIJZLJL(int i, StringBuilder sb, InterfaceC19875012pY interfaceC19875012pY) {
        String strLJFF;
        String str;
        Long lValueOf;
        if (interfaceC19875012pY == null) {
            return;
        }
        int i2 = i + 1;
        Iterator<E> it2 = interfaceC19875012pY.iterator();
        while (it2.hasNext()) {
            C19777712Zr c19777712Zr = (C19777712Zr) it2.next();
            if (c19777712Zr != null) {
                LJJIJIIJIL(sb, i2);
                sb.append("param {\n");
                Double dValueOf = null;
                if (c19777712Zr.LJJIJL()) {
                    strLJFF = this.LIZ.LJIIL.LJFF(c19777712Zr.zzf);
                } else {
                    strLJFF = null;
                }
                LJJIJLIJ(sb, i2, "name", strLJFF);
                if (c19777712Zr.LJJIJLIJ()) {
                    str = c19777712Zr.zzg;
                } else {
                    str = null;
                }
                LJJIJLIJ(sb, i2, "string_value", str);
                if (c19777712Zr.LJJIJIL()) {
                    lValueOf = Long.valueOf(c19777712Zr.zzh);
                } else {
                    lValueOf = null;
                }
                LJJIJLIJ(sb, i2, "int_value", lValueOf);
                if (c19777712Zr.LJJIJIIJI()) {
                    dValueOf = Double.valueOf(c19777712Zr.zzj);
                }
                LJJIJLIJ(sb, i2, "double_value", dValueOf);
                if (c19777712Zr.zzk.size() > 0) {
                    LJJIIJZLJL(i2, sb, c19777712Zr.zzk);
                }
                LJJIJIIJIL(sb, i2);
                sb.append("}\n");
            }
        }
    }

    public final void LJJIJIL(StringBuilder sb, int i, C19778612a0 c19778612a0) {
        if (c19778612a0 == null) {
            return;
        }
        LJJIJIIJIL(sb, i);
        sb.append("filter {\n");
        if (c19778612a0.LJJIIJZLJL()) {
            LJJIJLIJ(sb, i, "complement", Boolean.valueOf(c19778612a0.zzh));
        }
        if (c19778612a0.LJJIIZI()) {
            LJJIJLIJ(sb, i, "param_name", this.LIZ.LJIIL.LJFF(c19778612a0.zzi));
        }
        if (c19778612a0.LJJIJ()) {
            int i2 = i + 1;
            C19778512Zz c19778512ZzLJJIIJ = c19778612a0.LJJIIJ();
            if (c19778512ZzLJJIIJ != null) {
                LJJIJIIJIL(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (c19778512ZzLJJIIJ.LJJIIJZLJL()) {
                    LJJIJLIJ(sb, i2, "match_type", c19778512ZzLJJIIJ.LJJI().name());
                }
                if (c19778512ZzLJJIIJ.LJJIIJ()) {
                    LJJIJLIJ(sb, i2, "expression", c19778512ZzLJJIIJ.zzg);
                }
                if (c19778512ZzLJJIIJ.LJJIII()) {
                    LJJIJLIJ(sb, i2, "case_sensitive", Boolean.valueOf(c19778512ZzLJJIIJ.zzh));
                }
                if (c19778512ZzLJJIIJ.zzi.size() > 0) {
                    LJJIJIIJIL(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str : c19778512ZzLJJIIJ.zzi) {
                        LJJIJIIJIL(sb, i2 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                LJJIJIIJIL(sb, i2);
                sb.append("}\n");
            }
        }
        if (c19778612a0.LJJIIZ()) {
            LJJIJL(sb, i + 1, "number_filter", c19778612a0.LJJIII());
        }
        LJJIJIIJIL(sb, i);
        sb.append("}\n");
    }

    public static void LJJIIZ(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public static void LJJIIZI(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                LJJIIZ(builder, str3, string, set);
            }
        }
    }

    public static void LJJIJL(StringBuilder sb, int i, String str, C19778312Zx c19778312Zx) {
        if (c19778312Zx == null) {
            return;
        }
        LJJIJIIJIL(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (c19778312Zx.LJJIII()) {
            LJJIJLIJ(sb, i, "comparison_type", c19778312Zx.LJJI().name());
        }
        if (c19778312Zx.LJJIIJZLJL()) {
            LJJIJLIJ(sb, i, "match_as_float", Boolean.valueOf(c19778312Zx.zzg));
        }
        if (c19778312Zx.LJJIIJ()) {
            LJJIJLIJ(sb, i, "comparison_value", c19778312Zx.zzh);
        }
        if (c19778312Zx.LJJIIZI()) {
            LJJIJLIJ(sb, i, "min_comparison_value", c19778312Zx.zzi);
        }
        if (c19778312Zx.LJJIIZ()) {
            LJJIJLIJ(sb, i, "max_comparison_value", c19778312Zx.zzj);
        }
        LJJIJIIJIL(sb, i);
        sb.append("}\n");
    }

    public static void LJJIJLIJ(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        LJJIJIIJIL(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public final zzmu LJJ(String str, C12ZC c12zc, C12ZH c12zh, String str2) throws Throwable {
        int iIndexOf;
        C19820512gl.LIZ();
        if (!this.LIZ.LJI.LJIJI(str, C19817012gC.LJLIL)) {
            return null;
        }
        this.LIZ.LJIILIIL.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = this.LIZ.LJI.LJIILIIL(str, C19817012gC.LJJL).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        C19777612Zq c19777612Zq = this.LIZIZ.LJIIIZ;
        String strLJJIIJZLJL = c19777612Zq.LJII().LJJIIJZLJL(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(c19777612Zq.LIZ.LJI.LJIILIIL(str, C19817012gC.LJJJJLL));
        if (!TextUtils.isEmpty(strLJJIIJZLJL)) {
            String strLJIILIIL = c19777612Zq.LIZ.LJI.LJIILIIL(str, C19817012gC.LJJJJZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJJIIJZLJL);
            sbLIZ.append(e3.d);
            sbLIZ.append(strLJIILIIL);
            builder.authority(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            builder.authority(c19777612Zq.LIZ.LJI.LJIILIIL(str, C19817012gC.LJJJJZ));
        }
        builder.path(c19777612Zq.LIZ.LJI.LJIILIIL(str, C19817012gC.LJJJJZI));
        LJJIIZ(builder, "gmp_app_id", ((C12ZD) c12zc.LLILLJJLI).zzae, setUnmodifiableSet);
        LJJIIZ(builder, "gmp_version", "95001", setUnmodifiableSet);
        String str4 = ((C12ZD) c12zc.LLILLJJLI).zzaa;
        C19791812c8 c19791812c8 = this.LIZ.LJI;
        C19812612fU<Boolean> c19812612fU = C19817012gC.LJLJJI;
        if (c19791812c8.LJIJI(str, c19812612fU) && LJII().LJJIIZI(str)) {
            str4 = "";
        }
        LJJIIZ(builder, "app_instance_id", str4, setUnmodifiableSet);
        LJJIIZ(builder, "rdid", ((C12ZD) c12zc.LLILLJJLI).zzy, setUnmodifiableSet);
        LJJIIZ(builder, "bundle_id", c12zc.LJJIJ(), setUnmodifiableSet);
        String strLJIJI = c12zh.LJIJI();
        String strLIZ = C19785212b4.LIZ(strLJIJI, C19781212aQ.LIZJ, C19781212aQ.LIZ);
        if (!TextUtils.isEmpty(strLIZ)) {
            strLJIJI = strLIZ;
        }
        LJJIIZ(builder, "app_event_name", strLJIJI, setUnmodifiableSet);
        LJJIIZ(builder, "app_version", String.valueOf(((C12ZD) c12zc.LLILLJJLI).zzai), setUnmodifiableSet);
        String strSubstring = ((C12ZD) c12zc.LLILLJJLI).zzp;
        if (this.LIZ.LJI.LJIJI(str, c19812612fU) && LJII().LJJIJ(str) && !TextUtils.isEmpty(strSubstring) && (iIndexOf = strSubstring.indexOf(e3.d)) != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        LJJIIZ(builder, "os_version", strSubstring, setUnmodifiableSet);
        LJJIIZ(builder, "timestamp", String.valueOf(c12zh.LJIJ()), setUnmodifiableSet);
        String str5 = "1";
        if (((C12ZD) c12zc.LLILLJJLI).zzz) {
            LJJIIZ(builder, "lat", "1", setUnmodifiableSet);
        }
        LJJIIZ(builder, "privacy_sandbox_version", String.valueOf(((C12ZD) c12zc.LLILLJJLI).LJJI()), setUnmodifiableSet);
        LJJIIZ(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        LJJIIZ(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        LJJIIZ(builder, "request_uuid", str2, setUnmodifiableSet);
        List<C19777712Zr> listLJIJJ = c12zh.LJIJJ();
        Bundle bundle = new Bundle();
        for (C19777712Zr c19777712Zr : listLJIJJ) {
            String str6 = c19777712Zr.zzf;
            if (c19777712Zr.LJJIJIIJI()) {
                C786410Ut5.LJJJI(str6, String.valueOf(c19777712Zr.zzj), bundle);
            } else if (c19777712Zr.LJJIJIIJIL()) {
                C786410Ut5.LJJJI(str6, String.valueOf(c19777712Zr.zzi), bundle);
            } else if (c19777712Zr.LJJIJLIJ()) {
                C786410Ut5.LJJJI(str6, c19777712Zr.zzg, bundle);
            } else if (c19777712Zr.LJJIJIL()) {
                C786410Ut5.LJJJI(str6, String.valueOf(c19777712Zr.zzh), bundle);
            }
        }
        LJJIIZI(builder, this.LIZ.LJI.LJIILIIL(str, C19817012gC.LJJJZ).split("\\|"), bundle, setUnmodifiableSet);
        List<C12ZE> listUnmodifiableList = Collections.unmodifiableList(((C12ZD) c12zc.LLILLJJLI).zzi);
        Bundle bundle2 = new Bundle();
        for (C12ZE c12ze : listUnmodifiableList) {
            String str7 = c12ze.zzg;
            if (c12ze.LJJIJIIJIL()) {
                C786410Ut5.LJJJI(str7, String.valueOf(c12ze.zzk), bundle2);
            } else if (c12ze.LJJIJIL()) {
                C786410Ut5.LJJJI(str7, String.valueOf(c12ze.zzj), bundle2);
            } else if (c12ze.LJJIL()) {
                C786410Ut5.LJJJI(str7, c12ze.zzh, bundle2);
            } else if (c12ze.LJJIJL()) {
                C786410Ut5.LJJJI(str7, String.valueOf(c12ze.zzi), bundle2);
            }
        }
        LJJIIZI(builder, this.LIZ.LJI.LJIILIIL(str, C19817012gC.LJJJLZIJ).split("\\|"), bundle2, setUnmodifiableSet);
        if (!((C12ZD) c12zc.LLILLJJLI).zzbj) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        LJJIIZ(builder, "dma", str5, setUnmodifiableSet);
        if (!((C12ZD) c12zc.LLILLJJLI).zzbk.isEmpty()) {
            LJJIIZ(builder, "dma_cps", ((C12ZD) c12zc.LLILLJJLI).zzbk, setUnmodifiableSet);
        }
        return new zzmu(builder.build().toString(), jCurrentTimeMillis, 1);
    }
}
