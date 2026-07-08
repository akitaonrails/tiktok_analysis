package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.measurement.internal.zzno;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.12Z6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12Z6 extends AbstractC19781512aT {
    public static final String[] LJFF = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] LJI = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] LJII = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;"};
    public static final String[] LJIIIIZZ = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] LJIIIZ = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] LJIIJ = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] LJIIJJI = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] LJIIL = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] LJIILIIL = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] LJIILJJIL = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final C12Z9 LIZLLL;
    public final C19785112b3 LJ;

    @Override // X.AbstractC19781512aT
    public final boolean LJIIJ() {
        return false;
    }

    public final long LJIIJJI() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = LJIILIIL().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZ(e, "Error querying raw events");
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final SQLiteDatabase LJIILIIL() {
        LJ();
        try {
            return this.LIZLLL.getWritableDatabase();
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJIIIIZZ.LIZ(e, "Error opening database");
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIILL() throws java.lang.Throwable {
        /*
            r5 = this;
            android.database.sqlite.SQLiteDatabase r1 = r5.LJIILIIL()
            r4 = 0
            java.lang.String r0 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r3 = r1.rawQuery(r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L20 java.lang.Throwable -> L38
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L36
            if (r0 == 0) goto L1a
            r0 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L36
            r3.close()
            return r0
        L1a:
            r3.close()
            return r4
        L1e:
            r2 = move-exception
            goto L22
        L20:
            r2 = move-exception
            r3 = r4
        L22:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L36
            X.12eS r0 = r5.LJIILJJIL()     // Catch: java.lang.Throwable -> L36
            X.12fK r1 = r0.LJFF     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "Database error getting next bundle app id"
            r1.LIZ(r2, r0)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L35
            r3.close()
        L35:
            return r4
        L36:
            r0 = move-exception
            goto L3a
        L38:
            r0 = move-exception
            r3 = r4
        L3a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r3 == 0) goto L42
            r3.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12Z6.LJIILL():java.lang.String");
    }

    public final void LJJLIIIJILLIZJL() {
        LJIIIIZZ();
        LJIILIIL().beginTransaction();
    }

    public final void LJJLIIIJJIZ() {
        LJIIIIZZ();
        LJIILIIL().endTransaction();
    }

    public final void LJJLIIIJL() {
        LJ();
        LJIIIIZZ();
        if (this.LIZ.LIZ.getDatabasePath("google_app_measurement.db").exists()) {
            long jLIZ = this.LIZIZ.LJIIIIZZ.LJ.LIZ();
            this.LIZ.LJIILIIL.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jLIZ) > C19817012gC.LJJIFFI.LIZ(null).longValue()) {
                this.LIZIZ.LJIIIIZZ.LJ.LIZIZ(jElapsedRealtime);
                LJ();
                LJIIIIZZ();
                if (this.LIZ.LIZ.getDatabasePath("google_app_measurement.db").exists()) {
                    SQLiteDatabase sQLiteDatabaseLJIILIIL = LJIILIIL();
                    this.LIZ.LJIILIIL.getClass();
                    int iDelete = sQLiteDatabaseLJIILIIL.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(C19791812c8.LJIJJLI())});
                    if (iDelete > 0) {
                        LJIILJJIL().LJIILIIL.LIZ(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void LJJLIIIJLJLI() {
        LJIIIIZZ();
        LJIILIIL().setTransactionSuccessful();
    }

    public C12Z6(C12Z4 c12z4) {
        super(c12z4);
        this.LJ = new C19785112b3(this.LIZ.LJIILIIL);
        this.LIZLLL = new C12Z9(this, this.LIZ.LIZ);
    }

    public final long LJIIZILJ(C12ZD c12zd) {
        LJ();
        LJIIIIZZ();
        C0W3J.LJI(c12zd.zzu);
        byte[] bArrLJIIJ = c12zd.LJIIJ();
        long jLJIILIIL = LJFF().LJIILIIL(bArrLJIIJ);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c12zd.zzu);
        contentValues.put("metadata_fingerprint", Long.valueOf(jLJIILIIL));
        contentValues.put("metadata", bArrLJIIJ);
        try {
            LJIILIIL().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jLJIILIIL;
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(c12zd.zzu), "Error storing raw event metadata. appId", e);
            throw e;
        }
    }

    public final long LJIJI(String str) {
        C0W3J.LJI(str);
        LJ();
        LJIIIIZZ();
        try {
            return LJIILIIL().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, this.LIZ.LJI.LJIIIZ(str, C19817012gC.LJIILLIIL))))});
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error deleting over the limit events. appId", e);
            return 0L;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0051: MOVE (r5 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777297), block:B:21:0x0051 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIJJLI(long r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.LJ()
            r6.LJIIIIZZ()
            r5 = 0
            android.database.sqlite.SQLiteDatabase r4 = r6.LJIILIIL()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r1 = 0
            r2[r1] = r0     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            android.database.Cursor r3 = r4.rawQuery(r3, r2)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L50
            if (r0 != 0) goto L30
            X.12eS r0 = r6.LJIILJJIL()     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L50
            X.12fK r1 = r0.LJIILIIL     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L50
            java.lang.String r0 = "No expired configs for apps with pending events"
            r1.LIZJ(r0)     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L50
            r3.close()
            return r5
        L30:
            java.lang.String r0 = r3.getString(r1)     // Catch: android.database.sqlite.SQLiteException -> L38 java.lang.Throwable -> L50
            r3.close()
            return r0
        L38:
            r2 = move-exception
            goto L3c
        L3a:
            r2 = move-exception
            r3 = r5
        L3c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L50
            X.12eS r0 = r6.LJIILJJIL()     // Catch: java.lang.Throwable -> L50
            X.12fK r1 = r0.LJFF     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "Error selecting expired configs"
            r1.LIZ(r2, r0)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L4f
            r3.close()
        L4f:
            return r5
        L50:
            r0 = move-exception
            r5 = r3
            goto L54
        L53:
            r0 = move-exception
        L54:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r5 == 0) goto L5c
            r5.close()
        L5c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12Z6.LJIJJLI(long):java.lang.String");
    }

    public final void LJJIIJ(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseLJIILIIL = LJIILIIL();
            if (contentValues.getAsString("app_id") == null) {
                LJIILJJIL().LJII.LIZ(C19806212eS.LJIIJ("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("app_id");
            sbLIZ.append(" = ?");
            if (sQLiteDatabaseLJIILIIL.update("consent_settings", contentValues, C2188811AlT.LIZIZ(sbLIZ), new String[]{r3}) == 0 && sQLiteDatabaseLJIILIIL.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ("consent_settings"), "Failed to insert/update table (got -1). key", C19806212eS.LJIIJ("app_id"));
            }
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZLLL("Error storing into table. key", C19806212eS.LJIIJ("consent_settings"), C19806212eS.LJIIJ("app_id"), e);
        }
    }

    public final void LJJIJL(List<Long> list) {
        LJ();
        LJIIIIZZ();
        if (list.size() != 0) {
            if (!this.LIZ.LIZ.getDatabasePath("google_app_measurement.db").exists()) {
                return;
            }
            String str = e3.h + TextUtils.join(",", list) + ")";
            if (LJJJJI("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                LJIILJJIL().LJIIIIZZ.LIZJ("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                LJIILIIL().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
                return;
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZ(e, "Error incrementing retry count. error");
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public final boolean LJJIL(zzac zzacVar) {
        LJ();
        LJIIIIZZ();
        String str = zzacVar.zza;
        C0W3J.LJIIIIZZ(str);
        if (LJJJLL(str, zzacVar.zzc.zza) == null && LJJJJI("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zza);
        Object objZza = zzacVar.zzc.zza();
        C0W3J.LJIIIIZZ(objZza);
        LJJIIJZLJL(contentValues, objZza);
        contentValues.put("active", Boolean.valueOf(zzacVar.zze));
        contentValues.put("trigger_event_name", zzacVar.zzf);
        contentValues.put("trigger_timeout", Long.valueOf(zzacVar.zzh));
        LIZJ();
        contentValues.put("timed_out_event", C19803112dx.LJJJJLL(zzacVar.zzg));
        contentValues.put("creation_timestamp", Long.valueOf(zzacVar.zzd));
        LIZJ();
        contentValues.put("triggered_event", C19803112dx.LJJJJLL(zzacVar.zzi));
        contentValues.put("triggered_timestamp", Long.valueOf(zzacVar.zzc.zzb));
        contentValues.put("time_to_live", Long.valueOf(zzacVar.zzj));
        LIZJ();
        contentValues.put("expired_event", C19803112dx.LJJJJLL(zzacVar.zzk));
        try {
            if (LJIILIIL().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(str), "Failed to insert/update conditional user property (got -1)");
                return true;
            }
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error storing conditional user property", e);
        }
        return true;
    }

    public final boolean LJJJIL(C19784112at c19784112at) {
        LJ();
        LJIIIIZZ();
        if (LJJJLL(c19784112at.LIZ, c19784112at.LIZJ) == null) {
            if (C19803112dx.LJJLJLI(c19784112at.LIZJ)) {
                if (LJJJJI("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c19784112at.LIZ}) >= this.LIZ.LJI.LJI(c19784112at.LIZ, C19817012gC.LJJIJIIJI, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(c19784112at.LIZJ) && LJJJJI("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c19784112at.LIZ, c19784112at.LIZIZ}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c19784112at.LIZ);
        contentValues.put("origin", c19784112at.LIZIZ);
        contentValues.put("name", c19784112at.LIZJ);
        contentValues.put("set_timestamp", Long.valueOf(c19784112at.LIZLLL));
        LJJIIJZLJL(contentValues, c19784112at.LJ);
        try {
            if (LJIILIIL().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(c19784112at.LIZ), "Failed to insert/update user property (got -1). appId");
                return true;
            }
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(c19784112at.LIZ), "Error storing user property. appId", e);
        }
        return true;
    }

    public final long LJJJJ(String str) {
        long jLJIILLIIL;
        C0W3J.LJI(str);
        C0W3J.LJI("first_open_count");
        LJ();
        LJIIIIZZ();
        SQLiteDatabase sQLiteDatabaseLJIILIIL = LJIILIIL();
        sQLiteDatabaseLJIILIIL.beginTransaction();
        try {
            try {
                jLJIILLIIL = LJIILLIIL(-1L, "select first_open_count from app2 where app_id=?", new String[]{str});
            } catch (SQLiteException e) {
                e = e;
                jLJIILLIIL = 0;
            }
            if (jLJIILLIIL == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (sQLiteDatabaseLJIILIIL.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Failed to insert column (got -1). appId", "first_open_count");
                    sQLiteDatabaseLJIILIIL.endTransaction();
                    return -1L;
                }
                jLJIILLIIL = 0;
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZLLL("Error inserting column. appId", C19806212eS.LJIIJ(str), "first_open_count", e);
                sQLiteDatabaseLJIILIIL.endTransaction();
                return jLJIILLIIL;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + jLJIILLIIL));
                if (sQLiteDatabaseLJIILIIL.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Failed to update column (got 0). appId", "first_open_count");
                    sQLiteDatabaseLJIILIIL.endTransaction();
                    return -1L;
                }
                sQLiteDatabaseLJIILIIL.setTransactionSuccessful();
                sQLiteDatabaseLJIILIIL.endTransaction();
                return jLJIILLIIL;
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sQLiteDatabaseLJIILIIL.endTransaction();
            throw th;
        }
    }

    public final long LJJJJL(String str) {
        C0W3J.LJI(str);
        LJ();
        LJIIIIZZ();
        return LJIILLIIL(-1L, "select first_open_count from app2 where app_id=?", new String[]{str});
    }

    public final long LJJJJLI(String str) {
        C0W3J.LJI(str);
        return LJIILLIIL(0L, "select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str});
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0336 A[Catch: SQLiteException -> 0x04a7, all -> 0x04c5, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x04a7, blocks: (B:4:0x0082, B:8:0x008c, B:9:0x0098, B:10:0x009c, B:12:0x00a4, B:15:0x00b9, B:16:0x00c3, B:17:0x00c7, B:19:0x00cd, B:22:0x00e3, B:24:0x0125, B:28:0x012e, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:38:0x018e, B:40:0x01bd, B:44:0x01c6, B:48:0x01d8, B:49:0x01df, B:53:0x01f5, B:55:0x0200, B:56:0x0212, B:57:0x0215, B:58:0x0219, B:60:0x0221, B:61:0x0225, B:75:0x026d, B:76:0x0270, B:77:0x0274, B:79:0x027c, B:81:0x0285, B:83:0x028d, B:87:0x0296, B:91:0x02a8, B:92:0x02af, B:93:0x02b6, B:94:0x02ba, B:96:0x02c2, B:97:0x02c8, B:101:0x02da, B:109:0x02eb, B:110:0x02ef, B:114:0x0303, B:115:0x030a, B:116:0x030e, B:120:0x0322, B:121:0x0327, B:122:0x032a, B:123:0x032e, B:125:0x0336, B:126:0x033c, B:130:0x034e, B:133:0x0359, B:134:0x0360, B:135:0x0363, B:136:0x0367, B:138:0x036f, B:140:0x0377, B:144:0x0380, B:148:0x0392, B:152:0x039d, B:160:0x03b2, B:161:0x03cc, B:162:0x03df, B:163:0x03e3, B:165:0x03eb, B:168:0x03f5, B:171:0x0405, B:174:0x040e, B:175:0x0412, B:177:0x041a, B:179:0x0422, B:180:0x042a, B:184:0x0448, B:186:0x044e, B:187:0x0456, B:190:0x0471, B:192:0x047a, B:155:0x03a5, B:159:0x03ae, B:63:0x022d, B:64:0x0230, B:65:0x0234, B:67:0x023a, B:69:0x0248, B:70:0x024e, B:52:0x01f1, B:37:0x0189, B:21:0x00db, B:14:0x00b2), top: B:257:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0360 A[Catch: SQLiteException -> 0x04a7, all -> 0x04c5, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x04a7, blocks: (B:4:0x0082, B:8:0x008c, B:9:0x0098, B:10:0x009c, B:12:0x00a4, B:15:0x00b9, B:16:0x00c3, B:17:0x00c7, B:19:0x00cd, B:22:0x00e3, B:24:0x0125, B:28:0x012e, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:38:0x018e, B:40:0x01bd, B:44:0x01c6, B:48:0x01d8, B:49:0x01df, B:53:0x01f5, B:55:0x0200, B:56:0x0212, B:57:0x0215, B:58:0x0219, B:60:0x0221, B:61:0x0225, B:75:0x026d, B:76:0x0270, B:77:0x0274, B:79:0x027c, B:81:0x0285, B:83:0x028d, B:87:0x0296, B:91:0x02a8, B:92:0x02af, B:93:0x02b6, B:94:0x02ba, B:96:0x02c2, B:97:0x02c8, B:101:0x02da, B:109:0x02eb, B:110:0x02ef, B:114:0x0303, B:115:0x030a, B:116:0x030e, B:120:0x0322, B:121:0x0327, B:122:0x032a, B:123:0x032e, B:125:0x0336, B:126:0x033c, B:130:0x034e, B:133:0x0359, B:134:0x0360, B:135:0x0363, B:136:0x0367, B:138:0x036f, B:140:0x0377, B:144:0x0380, B:148:0x0392, B:152:0x039d, B:160:0x03b2, B:161:0x03cc, B:162:0x03df, B:163:0x03e3, B:165:0x03eb, B:168:0x03f5, B:171:0x0405, B:174:0x040e, B:175:0x0412, B:177:0x041a, B:179:0x0422, B:180:0x042a, B:184:0x0448, B:186:0x044e, B:187:0x0456, B:190:0x0471, B:192:0x047a, B:155:0x03a5, B:159:0x03ae, B:63:0x022d, B:64:0x0230, B:65:0x0234, B:67:0x023a, B:69:0x0248, B:70:0x024e, B:52:0x01f1, B:37:0x0189, B:21:0x00db, B:14:0x00b2), top: B:257:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x036f A[Catch: SQLiteException -> 0x04a7, all -> 0x04c5, TryCatch #10 {SQLiteException -> 0x04a7, blocks: (B:4:0x0082, B:8:0x008c, B:9:0x0098, B:10:0x009c, B:12:0x00a4, B:15:0x00b9, B:16:0x00c3, B:17:0x00c7, B:19:0x00cd, B:22:0x00e3, B:24:0x0125, B:28:0x012e, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:38:0x018e, B:40:0x01bd, B:44:0x01c6, B:48:0x01d8, B:49:0x01df, B:53:0x01f5, B:55:0x0200, B:56:0x0212, B:57:0x0215, B:58:0x0219, B:60:0x0221, B:61:0x0225, B:75:0x026d, B:76:0x0270, B:77:0x0274, B:79:0x027c, B:81:0x0285, B:83:0x028d, B:87:0x0296, B:91:0x02a8, B:92:0x02af, B:93:0x02b6, B:94:0x02ba, B:96:0x02c2, B:97:0x02c8, B:101:0x02da, B:109:0x02eb, B:110:0x02ef, B:114:0x0303, B:115:0x030a, B:116:0x030e, B:120:0x0322, B:121:0x0327, B:122:0x032a, B:123:0x032e, B:125:0x0336, B:126:0x033c, B:130:0x034e, B:133:0x0359, B:134:0x0360, B:135:0x0363, B:136:0x0367, B:138:0x036f, B:140:0x0377, B:144:0x0380, B:148:0x0392, B:152:0x039d, B:160:0x03b2, B:161:0x03cc, B:162:0x03df, B:163:0x03e3, B:165:0x03eb, B:168:0x03f5, B:171:0x0405, B:174:0x040e, B:175:0x0412, B:177:0x041a, B:179:0x0422, B:180:0x042a, B:184:0x0448, B:186:0x044e, B:187:0x0456, B:190:0x0471, B:192:0x047a, B:155:0x03a5, B:159:0x03ae, B:63:0x022d, B:64:0x0230, B:65:0x0234, B:67:0x023a, B:69:0x0248, B:70:0x024e, B:52:0x01f1, B:37:0x0189, B:21:0x00db, B:14:0x00b2), top: B:257:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03a5 A[Catch: SQLiteException -> 0x04a7, all -> 0x04c5, TryCatch #10 {SQLiteException -> 0x04a7, blocks: (B:4:0x0082, B:8:0x008c, B:9:0x0098, B:10:0x009c, B:12:0x00a4, B:15:0x00b9, B:16:0x00c3, B:17:0x00c7, B:19:0x00cd, B:22:0x00e3, B:24:0x0125, B:28:0x012e, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:38:0x018e, B:40:0x01bd, B:44:0x01c6, B:48:0x01d8, B:49:0x01df, B:53:0x01f5, B:55:0x0200, B:56:0x0212, B:57:0x0215, B:58:0x0219, B:60:0x0221, B:61:0x0225, B:75:0x026d, B:76:0x0270, B:77:0x0274, B:79:0x027c, B:81:0x0285, B:83:0x028d, B:87:0x0296, B:91:0x02a8, B:92:0x02af, B:93:0x02b6, B:94:0x02ba, B:96:0x02c2, B:97:0x02c8, B:101:0x02da, B:109:0x02eb, B:110:0x02ef, B:114:0x0303, B:115:0x030a, B:116:0x030e, B:120:0x0322, B:121:0x0327, B:122:0x032a, B:123:0x032e, B:125:0x0336, B:126:0x033c, B:130:0x034e, B:133:0x0359, B:134:0x0360, B:135:0x0363, B:136:0x0367, B:138:0x036f, B:140:0x0377, B:144:0x0380, B:148:0x0392, B:152:0x039d, B:160:0x03b2, B:161:0x03cc, B:162:0x03df, B:163:0x03e3, B:165:0x03eb, B:168:0x03f5, B:171:0x0405, B:174:0x040e, B:175:0x0412, B:177:0x041a, B:179:0x0422, B:180:0x042a, B:184:0x0448, B:186:0x044e, B:187:0x0456, B:190:0x0471, B:192:0x047a, B:155:0x03a5, B:159:0x03ae, B:63:0x022d, B:64:0x0230, B:65:0x0234, B:67:0x023a, B:69:0x0248, B:70:0x024e, B:52:0x01f1, B:37:0x0189, B:21:0x00db, B:14:0x00b2), top: B:257:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03eb A[Catch: SQLiteException -> 0x04a7, all -> 0x04c5, TryCatch #10 {SQLiteException -> 0x04a7, blocks: (B:4:0x0082, B:8:0x008c, B:9:0x0098, B:10:0x009c, B:12:0x00a4, B:15:0x00b9, B:16:0x00c3, B:17:0x00c7, B:19:0x00cd, B:22:0x00e3, B:24:0x0125, B:28:0x012e, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:38:0x018e, B:40:0x01bd, B:44:0x01c6, B:48:0x01d8, B:49:0x01df, B:53:0x01f5, B:55:0x0200, B:56:0x0212, B:57:0x0215, B:58:0x0219, B:60:0x0221, B:61:0x0225, B:75:0x026d, B:76:0x0270, B:77:0x0274, B:79:0x027c, B:81:0x0285, B:83:0x028d, B:87:0x0296, B:91:0x02a8, B:92:0x02af, B:93:0x02b6, B:94:0x02ba, B:96:0x02c2, B:97:0x02c8, B:101:0x02da, B:109:0x02eb, B:110:0x02ef, B:114:0x0303, B:115:0x030a, B:116:0x030e, B:120:0x0322, B:121:0x0327, B:122:0x032a, B:123:0x032e, B:125:0x0336, B:126:0x033c, B:130:0x034e, B:133:0x0359, B:134:0x0360, B:135:0x0363, B:136:0x0367, B:138:0x036f, B:140:0x0377, B:144:0x0380, B:148:0x0392, B:152:0x039d, B:160:0x03b2, B:161:0x03cc, B:162:0x03df, B:163:0x03e3, B:165:0x03eb, B:168:0x03f5, B:171:0x0405, B:174:0x040e, B:175:0x0412, B:177:0x041a, B:179:0x0422, B:180:0x042a, B:184:0x0448, B:186:0x044e, B:187:0x0456, B:190:0x0471, B:192:0x047a, B:155:0x03a5, B:159:0x03ae, B:63:0x022d, B:64:0x0230, B:65:0x0234, B:67:0x023a, B:69:0x0248, B:70:0x024e, B:52:0x01f1, B:37:0x0189, B:21:0x00db, B:14:0x00b2), top: B:257:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x041a A[Catch: SQLiteException -> 0x04a7, all -> 0x04c5, TryCatch #10 {SQLiteException -> 0x04a7, blocks: (B:4:0x0082, B:8:0x008c, B:9:0x0098, B:10:0x009c, B:12:0x00a4, B:15:0x00b9, B:16:0x00c3, B:17:0x00c7, B:19:0x00cd, B:22:0x00e3, B:24:0x0125, B:28:0x012e, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:38:0x018e, B:40:0x01bd, B:44:0x01c6, B:48:0x01d8, B:49:0x01df, B:53:0x01f5, B:55:0x0200, B:56:0x0212, B:57:0x0215, B:58:0x0219, B:60:0x0221, B:61:0x0225, B:75:0x026d, B:76:0x0270, B:77:0x0274, B:79:0x027c, B:81:0x0285, B:83:0x028d, B:87:0x0296, B:91:0x02a8, B:92:0x02af, B:93:0x02b6, B:94:0x02ba, B:96:0x02c2, B:97:0x02c8, B:101:0x02da, B:109:0x02eb, B:110:0x02ef, B:114:0x0303, B:115:0x030a, B:116:0x030e, B:120:0x0322, B:121:0x0327, B:122:0x032a, B:123:0x032e, B:125:0x0336, B:126:0x033c, B:130:0x034e, B:133:0x0359, B:134:0x0360, B:135:0x0363, B:136:0x0367, B:138:0x036f, B:140:0x0377, B:144:0x0380, B:148:0x0392, B:152:0x039d, B:160:0x03b2, B:161:0x03cc, B:162:0x03df, B:163:0x03e3, B:165:0x03eb, B:168:0x03f5, B:171:0x0405, B:174:0x040e, B:175:0x0412, B:177:0x041a, B:179:0x0422, B:180:0x042a, B:184:0x0448, B:186:0x044e, B:187:0x0456, B:190:0x0471, B:192:0x047a, B:155:0x03a5, B:159:0x03ae, B:63:0x022d, B:64:0x0230, B:65:0x0234, B:67:0x023a, B:69:0x0248, B:70:0x024e, B:52:0x01f1, B:37:0x0189, B:21:0x00db, B:14:0x00b2), top: B:257:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x044e A[Catch: SQLiteException -> 0x04a7, all -> 0x04c5, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x04a7, blocks: (B:4:0x0082, B:8:0x008c, B:9:0x0098, B:10:0x009c, B:12:0x00a4, B:15:0x00b9, B:16:0x00c3, B:17:0x00c7, B:19:0x00cd, B:22:0x00e3, B:24:0x0125, B:28:0x012e, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:38:0x018e, B:40:0x01bd, B:44:0x01c6, B:48:0x01d8, B:49:0x01df, B:53:0x01f5, B:55:0x0200, B:56:0x0212, B:57:0x0215, B:58:0x0219, B:60:0x0221, B:61:0x0225, B:75:0x026d, B:76:0x0270, B:77:0x0274, B:79:0x027c, B:81:0x0285, B:83:0x028d, B:87:0x0296, B:91:0x02a8, B:92:0x02af, B:93:0x02b6, B:94:0x02ba, B:96:0x02c2, B:97:0x02c8, B:101:0x02da, B:109:0x02eb, B:110:0x02ef, B:114:0x0303, B:115:0x030a, B:116:0x030e, B:120:0x0322, B:121:0x0327, B:122:0x032a, B:123:0x032e, B:125:0x0336, B:126:0x033c, B:130:0x034e, B:133:0x0359, B:134:0x0360, B:135:0x0363, B:136:0x0367, B:138:0x036f, B:140:0x0377, B:144:0x0380, B:148:0x0392, B:152:0x039d, B:160:0x03b2, B:161:0x03cc, B:162:0x03df, B:163:0x03e3, B:165:0x03eb, B:168:0x03f5, B:171:0x0405, B:174:0x040e, B:175:0x0412, B:177:0x041a, B:179:0x0422, B:180:0x042a, B:184:0x0448, B:186:0x044e, B:187:0x0456, B:190:0x0471, B:192:0x047a, B:155:0x03a5, B:159:0x03ae, B:63:0x022d, B:64:0x0230, B:65:0x0234, B:67:0x023a, B:69:0x0248, B:70:0x024e, B:52:0x01f1, B:37:0x0189, B:21:0x00db, B:14:0x00b2), top: B:257:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x047a A[Catch: SQLiteException -> 0x04a7, all -> 0x04c5, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x04a7, blocks: (B:4:0x0082, B:8:0x008c, B:9:0x0098, B:10:0x009c, B:12:0x00a4, B:15:0x00b9, B:16:0x00c3, B:17:0x00c7, B:19:0x00cd, B:22:0x00e3, B:24:0x0125, B:28:0x012e, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:38:0x018e, B:40:0x01bd, B:44:0x01c6, B:48:0x01d8, B:49:0x01df, B:53:0x01f5, B:55:0x0200, B:56:0x0212, B:57:0x0215, B:58:0x0219, B:60:0x0221, B:61:0x0225, B:75:0x026d, B:76:0x0270, B:77:0x0274, B:79:0x027c, B:81:0x0285, B:83:0x028d, B:87:0x0296, B:91:0x02a8, B:92:0x02af, B:93:0x02b6, B:94:0x02ba, B:96:0x02c2, B:97:0x02c8, B:101:0x02da, B:109:0x02eb, B:110:0x02ef, B:114:0x0303, B:115:0x030a, B:116:0x030e, B:120:0x0322, B:121:0x0327, B:122:0x032a, B:123:0x032e, B:125:0x0336, B:126:0x033c, B:130:0x034e, B:133:0x0359, B:134:0x0360, B:135:0x0363, B:136:0x0367, B:138:0x036f, B:140:0x0377, B:144:0x0380, B:148:0x0392, B:152:0x039d, B:160:0x03b2, B:161:0x03cc, B:162:0x03df, B:163:0x03e3, B:165:0x03eb, B:168:0x03f5, B:171:0x0405, B:174:0x040e, B:175:0x0412, B:177:0x041a, B:179:0x0422, B:180:0x042a, B:184:0x0448, B:186:0x044e, B:187:0x0456, B:190:0x0471, B:192:0x047a, B:155:0x03a5, B:159:0x03ae, B:63:0x022d, B:64:0x0230, B:65:0x0234, B:67:0x023a, B:69:0x0248, B:70:0x024e, B:52:0x01f1, B:37:0x0189, B:21:0x00db, B:14:0x00b2), top: B:257:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x040e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022d A[Catch: SQLiteException -> 0x04a7, all -> 0x04c5, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x04a7, blocks: (B:4:0x0082, B:8:0x008c, B:9:0x0098, B:10:0x009c, B:12:0x00a4, B:15:0x00b9, B:16:0x00c3, B:17:0x00c7, B:19:0x00cd, B:22:0x00e3, B:24:0x0125, B:28:0x012e, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:38:0x018e, B:40:0x01bd, B:44:0x01c6, B:48:0x01d8, B:49:0x01df, B:53:0x01f5, B:55:0x0200, B:56:0x0212, B:57:0x0215, B:58:0x0219, B:60:0x0221, B:61:0x0225, B:75:0x026d, B:76:0x0270, B:77:0x0274, B:79:0x027c, B:81:0x0285, B:83:0x028d, B:87:0x0296, B:91:0x02a8, B:92:0x02af, B:93:0x02b6, B:94:0x02ba, B:96:0x02c2, B:97:0x02c8, B:101:0x02da, B:109:0x02eb, B:110:0x02ef, B:114:0x0303, B:115:0x030a, B:116:0x030e, B:120:0x0322, B:121:0x0327, B:122:0x032a, B:123:0x032e, B:125:0x0336, B:126:0x033c, B:130:0x034e, B:133:0x0359, B:134:0x0360, B:135:0x0363, B:136:0x0367, B:138:0x036f, B:140:0x0377, B:144:0x0380, B:148:0x0392, B:152:0x039d, B:160:0x03b2, B:161:0x03cc, B:162:0x03df, B:163:0x03e3, B:165:0x03eb, B:168:0x03f5, B:171:0x0405, B:174:0x040e, B:175:0x0412, B:177:0x041a, B:179:0x0422, B:180:0x042a, B:184:0x0448, B:186:0x044e, B:187:0x0456, B:190:0x0471, B:192:0x047a, B:155:0x03a5, B:159:0x03ae, B:63:0x022d, B:64:0x0230, B:65:0x0234, B:67:0x023a, B:69:0x0248, B:70:0x024e, B:52:0x01f1, B:37:0x0189, B:21:0x00db, B:14:0x00b2), top: B:257:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026d A[Catch: SQLiteException -> 0x04a7, all -> 0x04c5, TRY_ENTER, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x04a7, blocks: (B:4:0x0082, B:8:0x008c, B:9:0x0098, B:10:0x009c, B:12:0x00a4, B:15:0x00b9, B:16:0x00c3, B:17:0x00c7, B:19:0x00cd, B:22:0x00e3, B:24:0x0125, B:28:0x012e, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:38:0x018e, B:40:0x01bd, B:44:0x01c6, B:48:0x01d8, B:49:0x01df, B:53:0x01f5, B:55:0x0200, B:56:0x0212, B:57:0x0215, B:58:0x0219, B:60:0x0221, B:61:0x0225, B:75:0x026d, B:76:0x0270, B:77:0x0274, B:79:0x027c, B:81:0x0285, B:83:0x028d, B:87:0x0296, B:91:0x02a8, B:92:0x02af, B:93:0x02b6, B:94:0x02ba, B:96:0x02c2, B:97:0x02c8, B:101:0x02da, B:109:0x02eb, B:110:0x02ef, B:114:0x0303, B:115:0x030a, B:116:0x030e, B:120:0x0322, B:121:0x0327, B:122:0x032a, B:123:0x032e, B:125:0x0336, B:126:0x033c, B:130:0x034e, B:133:0x0359, B:134:0x0360, B:135:0x0363, B:136:0x0367, B:138:0x036f, B:140:0x0377, B:144:0x0380, B:148:0x0392, B:152:0x039d, B:160:0x03b2, B:161:0x03cc, B:162:0x03df, B:163:0x03e3, B:165:0x03eb, B:168:0x03f5, B:171:0x0405, B:174:0x040e, B:175:0x0412, B:177:0x041a, B:179:0x0422, B:180:0x042a, B:184:0x0448, B:186:0x044e, B:187:0x0456, B:190:0x0471, B:192:0x047a, B:155:0x03a5, B:159:0x03ae, B:63:0x022d, B:64:0x0230, B:65:0x0234, B:67:0x023a, B:69:0x0248, B:70:0x024e, B:52:0x01f1, B:37:0x0189, B:21:0x00db, B:14:0x00b2), top: B:257:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027c A[Catch: SQLiteException -> 0x04a7, all -> 0x04c5, TryCatch #10 {SQLiteException -> 0x04a7, blocks: (B:4:0x0082, B:8:0x008c, B:9:0x0098, B:10:0x009c, B:12:0x00a4, B:15:0x00b9, B:16:0x00c3, B:17:0x00c7, B:19:0x00cd, B:22:0x00e3, B:24:0x0125, B:28:0x012e, B:29:0x0164, B:33:0x0178, B:34:0x017f, B:38:0x018e, B:40:0x01bd, B:44:0x01c6, B:48:0x01d8, B:49:0x01df, B:53:0x01f5, B:55:0x0200, B:56:0x0212, B:57:0x0215, B:58:0x0219, B:60:0x0221, B:61:0x0225, B:75:0x026d, B:76:0x0270, B:77:0x0274, B:79:0x027c, B:81:0x0285, B:83:0x028d, B:87:0x0296, B:91:0x02a8, B:92:0x02af, B:93:0x02b6, B:94:0x02ba, B:96:0x02c2, B:97:0x02c8, B:101:0x02da, B:109:0x02eb, B:110:0x02ef, B:114:0x0303, B:115:0x030a, B:116:0x030e, B:120:0x0322, B:121:0x0327, B:122:0x032a, B:123:0x032e, B:125:0x0336, B:126:0x033c, B:130:0x034e, B:133:0x0359, B:134:0x0360, B:135:0x0363, B:136:0x0367, B:138:0x036f, B:140:0x0377, B:144:0x0380, B:148:0x0392, B:152:0x039d, B:160:0x03b2, B:161:0x03cc, B:162:0x03df, B:163:0x03e3, B:165:0x03eb, B:168:0x03f5, B:171:0x0405, B:174:0x040e, B:175:0x0412, B:177:0x041a, B:179:0x0422, B:180:0x042a, B:184:0x0448, B:186:0x044e, B:187:0x0456, B:190:0x0471, B:192:0x047a, B:155:0x03a5, B:159:0x03ae, B:63:0x022d, B:64:0x0230, B:65:0x0234, B:67:0x023a, B:69:0x0248, B:70:0x024e, B:52:0x01f1, B:37:0x0189, B:21:0x00db, B:14:0x00b2), top: B:257:0x0082 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C12Z5 LJJJLIIL(java.lang.String r62) {
        /*
            Method dump skipped, instruction units count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12Z6.LJJJLIIL(java.lang.String):X.12Z5");
    }

    public final C19781912aX LJJJLZIJ(String str) {
        C0W3J.LJIIIIZZ(str);
        LJ();
        LJIIIIZZ();
        return C19781912aX.LJIIJ(LJIL("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19781912aX LJJL(java.lang.String r7) {
        /*
            r6 = this;
            X.C0W3J.LJIIIIZZ(r7)
            r6.LJ()
            r6.LJIIIIZZ()
            java.lang.String r5 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r4 = 1
            java.lang.String[] r2 = new java.lang.String[r4]
            r1 = 0
            r2[r1] = r7
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r6.LJIILIIL()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r3 = r0.rawQuery(r5, r2)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L5d
            if (r0 != 0) goto L2c
            X.12eS r0 = r6.LJIILJJIL()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L5d
            X.12fK r1 = r0.LJIILIIL     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L5d
            java.lang.String r0 = "No data found"
            r1.LIZJ(r0)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L5d
            goto L57
        L2c:
            java.lang.String r1 = r3.getString(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L5d
            int r0 = r3.getInt(r4)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L5d
            X.12aX r0 = X.C19781912aX.LIZLLL(r0, r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L5d
            r3.close()
            if (r0 != 0) goto L5c
            goto L5a
        L3e:
            r2 = move-exception
            goto L43
        L40:
            r0 = move-exception
            goto L5e
        L42:
            r2 = move-exception
        L43:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L5d
            X.12eS r0 = r6.LJIILJJIL()     // Catch: java.lang.Throwable -> L5d
            X.12fK r1 = r0.LJFF     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "Error querying database."
            r1.LIZ(r2, r0)     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L5a
            r3.close()
            goto L5a
        L57:
            r3.close()
        L5a:
            X.12aX r0 = X.C19781912aX.LIZJ
        L5c:
            return r0
        L5d:
            r0 = move-exception
        L5e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r3 == 0) goto L66
            r3.close()
        L66:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12Z6.LJJL(java.lang.String):X.12aX");
    }

    public final List<C19784112at> LJJLIIIIJ(String str) {
        C0W3J.LJI(str);
        LJ();
        LJIIIIZZ();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = LJIILIIL().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    long j = cursorQuery.getLong(2);
                    Object objLJIJJ = LJIJJ(3, cursorQuery);
                    if (objLJIJJ == null) {
                        LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new C19784112at(j, objLJIJJ, str, string2, string));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error querying user properties. appId", e);
                List<C19784112at> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final void LJJLIIIJ(String str) {
        C12ZS c12zsLJJJJZI;
        LJJLI("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = LJIILIIL().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (c12zsLJJJJZI = LJJJJZI(str, string)) != null) {
                        LJJIJIIJIL("events_snapshot", c12zsLJJJJZI);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error creating snapshot. appId", e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJJI(java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12Z6.LJJLIIIJJI(java.lang.String):void");
    }

    public static void LJJIIJZLJL(ContentValues contentValues, Object obj) {
        C0W3J.LJI("value");
        C0W3J.LJIIIIZZ(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put("value", (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final Object LJIJJ(int i, Cursor cursor) {
        int type = cursor.getType(i);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            LJIILJJIL().LJFF.LIZ(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                            return null;
                        }
                        LJIILJJIL().LJFF.LIZJ("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i);
                }
                return Double.valueOf(cursor.getDouble(i));
            }
            return Long.valueOf(cursor.getLong(i));
        }
        LJIILJJIL().LJFF.LIZJ("Loaded invalid null value from database");
        return null;
    }

    public final String LJIL(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = LJIILIIL().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                }
                cursorRawQuery.close();
                return "";
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZIZ(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
    
        LJIILJJIL().LJFF.LIZ(java.lang.Integer.valueOf(com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig.DEFAULT), "Read more than the max allowed conditional properties, ignoring extra");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzac> LJJIFFI(java.lang.String r30, java.lang.String[] r31) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12Z6.LJJIFFI(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void LJJIIZ(C12ZD c12zd, boolean z) {
        LJ();
        LJIIIIZZ();
        C0W3J.LJI(c12zd.zzu);
        C0W3J.LJIIJJI(c12zd.LJJJJJL());
        LJJLIIIJL();
        this.LIZ.LJIILIIL.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c12zd.zzl < jCurrentTimeMillis - C19791812c8.LJIJJLI() || c12zd.zzl > C19791812c8.LJIJJLI() + jCurrentTimeMillis) {
            LJIILJJIL().LJIIIIZZ.LIZLLL("Storing bundle outside of the max uploading time span. appId, now, timestamp", C19806212eS.LJIIJ(c12zd.zzu), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c12zd.zzl));
        }
        try {
            byte[] bArrLJJJJ = LJFF().LJJJJ(c12zd.LJIIJ());
            LJIILJJIL().LJIILIIL.LIZ(Integer.valueOf(bArrLJJJJ.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c12zd.zzu);
            contentValues.put("bundle_end_timestamp", Long.valueOf(c12zd.zzl));
            contentValues.put("data", bArrLJJJJ);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c12zd.LJJJLL()) {
                contentValues.put("retry_count", Integer.valueOf(c12zd.zzaq));
            }
            try {
                if (LJIILIIL().insert("queue", null, contentValues) == -1) {
                    LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(c12zd.zzu), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(c12zd.zzu), "Error storing bundle. appId", e);
            }
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(c12zd.zzu), "Data loss. Failed to serialize bundle. appId", e2);
        }
    }

    public final void LJJIIZI(String str, zzmu zzmuVar) {
        LJ();
        LJIIIIZZ();
        C0W3J.LJI(str);
        this.LIZ.LJIILIIL.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzmuVar.zzb < jCurrentTimeMillis - C19791812c8.LJIJJLI() || zzmuVar.zzb > C19791812c8.LJIJJLI() + jCurrentTimeMillis) {
            LJIILJJIL().LJIIIIZZ.LIZLLL("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C19806212eS.LJIIJ(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzmuVar.zzb));
        }
        LJIILJJIL().LJIILIIL.LIZJ("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzmuVar.zza);
        contentValues.put("source", Integer.valueOf(zzmuVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zzmuVar.zzb));
        try {
            if (LJIILIIL().insert("trigger_uris", null, contentValues) == -1) {
                LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error storing trigger URI. appId", e);
        }
    }

    public final void LJJIJIIJI(String str, String str2) {
        C0W3J.LJI(str);
        C0W3J.LJI(str2);
        LJ();
        LJIIIIZZ();
        try {
            LJIILIIL().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZLLL("Error deleting conditional property", C19806212eS.LJIIJ(str), this.LIZ.LJIIL.LJI(str2), e);
        }
    }

    public final void LJJIJIIJIL(String str, C12ZS c12zs) {
        Long l;
        C0W3J.LJIIIIZZ(c12zs);
        LJ();
        LJIIIIZZ();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c12zs.LIZ);
        contentValues.put("name", c12zs.LIZIZ);
        contentValues.put("lifetime_count", Long.valueOf(c12zs.LIZJ));
        contentValues.put("current_bundle_count", Long.valueOf(c12zs.LIZLLL));
        contentValues.put("last_fire_timestamp", Long.valueOf(c12zs.LJFF));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c12zs.LJI));
        contentValues.put("last_bundled_day", c12zs.LJII);
        contentValues.put("last_sampled_complex_event_id", c12zs.LJIIIIZZ);
        contentValues.put("last_sampling_rate", c12zs.LJIIIZ);
        contentValues.put("current_session_count", Long.valueOf(c12zs.LJ));
        Boolean bool = c12zs.LJIIJ;
        if (bool != null && bool.booleanValue()) {
            l = 1L;
        } else {
            l = null;
        }
        contentValues.put("last_exempt_from_sampling", l);
        try {
            if (LJIILIIL().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(c12zs.LIZ), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(c12zs.LIZ), "Error storing event aggregates. appId", e);
        }
    }

    public final void LJJIJIL(String str, C19781912aX c19781912aX) {
        C0W3J.LJIIIIZZ(str);
        LJ();
        LJIIIIZZ();
        LJJJJJL(str, LJJL(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c19781912aX.LJIIZILJ());
        LJJIIJ(contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x03e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(X.C12Z5 r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12Z6.LJJIJLIJ(X.12Z5, boolean):void");
    }

    public final long LJJJJI(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = LJIILIIL().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    long j = cursorRawQuery.getLong(0);
                    cursorRawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZIZ(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void LJJJJJ(String str, List list) {
        C0W3J.LJI(str);
        LJIIIIZZ();
        LJ();
        SQLiteDatabase sQLiteDatabaseLJIILIIL = LJIILIIL();
        try {
            long jLJJJJI = LJJJJI("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, this.LIZ.LJI.LJIIIZ(str, C19817012gC.LJJIJ)));
            if (jLJJJJI <= iMax) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < ((ArrayList) list).size(); i++) {
                Integer num = (Integer) ListProtector.get(list, i);
                if (num == null) {
                    return;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            sQLiteDatabaseLJIILIIL.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + (e3.h + TextUtils.join(",", arrayList) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Database error querying filters. appId", e);
        }
    }

    public final void LJJJJJL(String str, C19781912aX c19781912aX) {
        C0W3J.LJIIIIZZ(str);
        C0W3J.LJIIIIZZ(c19781912aX);
        LJ();
        LJIIIIZZ();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c19781912aX.LJIIZILJ());
        contentValues.put("consent_source", Integer.valueOf(c19781912aX.LIZIZ));
        LJJIIJ(contentValues);
    }

    public final zzac LJJJJLL(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        boolean z;
        C0W3J.LJI(str);
        C0W3J.LJI(str2);
        LJ();
        LJIIIIZZ();
        Cursor cursor = null;
        try {
            cursorQuery = LJIILIIL().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    Object objLJIJJ = LJIJJ(1, cursorQuery);
                    if (cursorQuery.getInt(2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    C19777312Zn c19777312ZnLJFF = LJFF();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzbf> creator = zzbf.CREATOR;
                    zzac zzacVar = new zzac(str, string, new zzno(cursorQuery.getLong(8), objLJIJJ, str2, string), cursorQuery.getLong(6), z, string2, (zzbf) c19777312ZnLJFF.LJIIZILJ(blob, creator), j, (zzbf) LJFF().LJIIZILJ(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzbf) LJFF().LJIIZILJ(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Got multiple records for conditional property, expected one", this.LIZ.LJIIL.LJI(str2));
                    }
                    cursorQuery.close();
                    return zzacVar;
                } catch (SQLiteException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    LJIILJJIL().LJFF.LIZLLL("Error querying conditional property", C19806212eS.LJIIJ(str), this.LIZ.LJIIL.LJI(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
            th = th;
            cursor = cursorQuery;
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        TryCatchGuardChecker.doCheck(th);
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final C12ZS LJJJJZI(String str, String str2) {
        return LJJJJZ("events", str, str2);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0095: MOVE (r12 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:33554581), block:B:26:0x0095 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19784112at LJJJLL(java.lang.String r21, java.lang.String r22) {
        /*
            r20 = this;
            r17 = r21
            X.C0W3J.LJI(r17)
            r2 = r22
            X.C0W3J.LJI(r2)
            r0 = r20
            r0.LJ()
            r0.LJIIIIZZ()
            r12 = 0
            android.database.sqlite.SQLiteDatabase r7 = r0.LJIILIIL()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L97
            java.lang.String r8 = "user_attributes"
            java.lang.String r4 = "set_timestamp"
            java.lang.String r3 = "value"
            java.lang.String r1 = "origin"
            java.lang.String[] r9 = new java.lang.String[]{r4, r3, r1}     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L97
            java.lang.String r10 = "app_id=? and name=?"
            r4 = 2
            java.lang.String[] r11 = new java.lang.String[r4]     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L97
            r6 = 0
            r11[r6] = r17     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L97
            r3 = 1
            r11[r3] = r2     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L97
            r13 = r12
            r14 = r12
            android.database.Cursor r5 = r7.query(r8, r9, r10, r11, r12, r13, r14)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> L97
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L94
            if (r1 != 0) goto L3e
            r5.close()
            return r12
        L3e:
            long r14 = r5.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L94
            java.lang.Object r16 = r0.LJIJJ(r3, r5)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L94
            if (r16 != 0) goto L4c
            r5.close()
            return r12
        L4c:
            java.lang.String r18 = r5.getString(r4)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L94
            X.12at r13 = new X.12at     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L94
            r19 = r2
            r13.<init>(r14, r16, r17, r18, r19)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L94
            boolean r1 = r5.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L94
            if (r1 == 0) goto L6c
            X.12eS r1 = r0.LJIILJJIL()     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L94
            X.12fK r4 = r1.LJFF     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L94
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            X.12fZ r1 = X.C19806212eS.LJIIJ(r17)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L94
            r4.LIZ(r1, r3)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L94
        L6c:
            r5.close()
            return r13
        L70:
            r6 = move-exception
            goto L74
        L72:
            r6 = move-exception
            r5 = r12
        L74:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r6)     // Catch: java.lang.Throwable -> L94
            X.12eS r1 = r0.LJIILJJIL()     // Catch: java.lang.Throwable -> L94
            X.12fK r4 = r1.LJFF     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "Error querying user property. appId"
            X.12fZ r1 = X.C19806212eS.LJIIJ(r17)     // Catch: java.lang.Throwable -> L94
            X.12eD r0 = r0.LIZ     // Catch: java.lang.Throwable -> L94
            X.12aP r0 = r0.LJIIL     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = r0.LJI(r2)     // Catch: java.lang.Throwable -> L94
            r4.LIZLLL(r3, r1, r0, r6)     // Catch: java.lang.Throwable -> L94
            if (r5 == 0) goto L93
            r5.close()
        L93:
            return r12
        L94:
            r0 = move-exception
            r12 = r5
            goto L98
        L97:
            r0 = move-exception
        L98:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r12 == 0) goto La0
            r12.close()
        La0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12Z6.LJJJLL(java.lang.String, java.lang.String):X.12at");
    }

    public final void LJJJZ(String str, String str2) {
        C0W3J.LJI(str);
        C0W3J.LJI(str2);
        LJ();
        LJIIIIZZ();
        try {
            LJIILIIL().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZLLL("Error deleting user property. appId", C19806212eS.LJIIJ(str), this.LIZ.LJIIL.LJI(str2), e);
        }
    }

    public final void LJJLI(String str, String str2) {
        C0W3J.LJI(str2);
        LJ();
        LJIIIIZZ();
        try {
            LJIILIIL().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str2), "Error deleting snapshot. appId", e);
        }
    }

    public final long LJIILLIIL(long j, String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = LJIILIIL().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    long j2 = cursorRawQuery.getLong(0);
                    cursorRawQuery.close();
                    return j2;
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZIZ(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155 A[EDGE_INSN: B:87:0x0155->B:68:0x0155 BREAK  A[LOOP:0: B:17:0x0054->B:67:0x0152], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJJ(int r19, int r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12Z6.LJJ(int, int, java.lang.String):java.util.List");
    }

    public final List<zzac> LJJI(String str, String str2, String str3) {
        C0W3J.LJI(str);
        LJ();
        LJIIIIZZ();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append("*");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            sb.append(" and name glob ?");
        }
        return LJJIFFI(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final boolean LJJIZ(String str, int i, C19778012Zu c19778012Zu) {
        Integer numValueOf;
        Boolean boolValueOf;
        LJIIIIZZ();
        LJ();
        C0W3J.LJI(str);
        C0W3J.LJIIIIZZ(c19778012Zu);
        Integer numValueOf2 = null;
        if (c19778012Zu.zzg.isEmpty()) {
            C19811612fK c19811612fK = LJIILJJIL().LJIIIIZZ;
            C19813112fZ c19813112fZLJIIJ = C19806212eS.LJIIJ(str);
            Integer numValueOf3 = Integer.valueOf(i);
            if (c19778012Zu.LJJIIJZLJL()) {
                numValueOf2 = Integer.valueOf(c19778012Zu.zzf);
            }
            c19811612fK.LIZLLL("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", c19813112fZLJIIJ, numValueOf3, String.valueOf(numValueOf2));
            return false;
        }
        byte[] bArrLJIIJ = c19778012Zu.LJIIJ();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        if (c19778012Zu.LJJIIJZLJL()) {
            numValueOf = Integer.valueOf(c19778012Zu.zzf);
        } else {
            numValueOf = null;
        }
        contentValues.put("filter_id", numValueOf);
        contentValues.put("event_name", c19778012Zu.zzg);
        if (c19778012Zu.LJJIIZ()) {
            boolValueOf = Boolean.valueOf(c19778012Zu.zzm);
        } else {
            boolValueOf = null;
        }
        contentValues.put("session_scoped", boolValueOf);
        contentValues.put("data", bArrLJIIJ);
        try {
            if (LJIILIIL().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(str), "Failed to insert event filter (got -1). appId");
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error storing event filter. appId", e);
            return false;
        }
    }

    public final boolean LJJJ(String str, int i, C19778412Zy c19778412Zy) {
        Integer numValueOf;
        Boolean boolValueOf;
        LJIIIIZZ();
        LJ();
        C0W3J.LJI(str);
        C0W3J.LJIIIIZZ(c19778412Zy);
        Integer numValueOf2 = null;
        if (c19778412Zy.zzg.isEmpty()) {
            C19811612fK c19811612fK = LJIILJJIL().LJIIIIZZ;
            C19813112fZ c19813112fZLJIIJ = C19806212eS.LJIIJ(str);
            Integer numValueOf3 = Integer.valueOf(i);
            if (c19778412Zy.LJJIIJZLJL()) {
                numValueOf2 = Integer.valueOf(c19778412Zy.LJJI());
            }
            c19811612fK.LIZLLL("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", c19813112fZLJIIJ, numValueOf3, String.valueOf(numValueOf2));
            return false;
        }
        byte[] bArrLJIIJ = c19778412Zy.LJIIJ();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        if (c19778412Zy.LJJIIJZLJL()) {
            numValueOf = Integer.valueOf(c19778412Zy.LJJI());
        } else {
            numValueOf = null;
        }
        contentValues.put("filter_id", numValueOf);
        contentValues.put("property_name", c19778412Zy.zzg);
        if (c19778412Zy.LJJIIZ()) {
            boolValueOf = Boolean.valueOf(c19778412Zy.zzk);
        } else {
            boolValueOf = null;
        }
        contentValues.put("session_scoped", boolValueOf);
        contentValues.put("data", bArrLJIIJ);
        try {
            if (LJIILIIL().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(str), "Failed to insert property filter (got -1). appId");
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error storing property filter. appId", e);
            return false;
        }
    }

    public final boolean LJJJI(C12ZA c12za, long j, boolean z) {
        LJ();
        LJIIIIZZ();
        C0W3J.LJI(c12za.LIZ);
        byte[] bArrLJIIJ = LJFF().LJIJI(c12za).LJIIJ();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c12za.LIZ);
        contentValues.put("name", c12za.LIZIZ);
        contentValues.put("timestamp", Long.valueOf(c12za.LIZLLL));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", bArrLJIIJ);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (LJIILIIL().insert("raw_events", null, contentValues) == -1) {
                LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(c12za.LIZ), "Failed to insert raw event (got -1). appId");
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(c12za.LIZ), "Error storing raw event. appId", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        LJIILJJIL().LJFF.LIZ(java.lang.Integer.valueOf(com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig.DEFAULT), "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C19784112at> LJJJJIZL(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12Z6.LJJJJIZL(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C12ZS LJJJJZ(java.lang.String r28, java.lang.String r29, java.lang.String r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12Z6.LJJJJZ(java.lang.String, java.lang.String, java.lang.String):X.12ZS");
    }

    public final void LJJIJ(String str, Long l, long j, C12ZI c12zi) {
        LJ();
        LJIIIIZZ();
        C0W3J.LJIIIIZZ(c12zi);
        C0W3J.LJI(str);
        byte[] bArrLJIIJ = c12zi.LJIIJ();
        LJIILJJIL().LJIILIIL.LIZIZ(this.LIZ.LJIIL.LIZJ(str), "Saving complex main event, appId, data size", Integer.valueOf(bArrLJIIJ.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrLJIIJ);
        try {
            if (LJIILIIL().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error storing complex main event. appId", e);
        }
    }

    public final C19784812b0 LJJIII(boolean z, String str, boolean z2, long j, boolean z3) {
        return LJJII(j, str, 1L, false, false, z, false, z2, z3);
    }

    public final C19784812b0 LJJII(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C0W3J.LJI(str);
        LJ();
        LJIIIIZZ();
        String[] strArr = {str};
        C19784812b0 c19784812b0 = new C19784812b0();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseLJIILIIL = LJIILIIL();
                Cursor cursorQuery = sQLiteDatabaseLJIILIIL.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    LJIILJJIL().LJIIIIZZ.LIZ(C19806212eS.LJIIJ(str), "Not updating daily counts, app is not known. appId");
                    cursorQuery.close();
                    return c19784812b0;
                }
                if (cursorQuery.getLong(0) == j) {
                    c19784812b0.LIZIZ = cursorQuery.getLong(1);
                    c19784812b0.LIZ = cursorQuery.getLong(2);
                    c19784812b0.LIZJ = cursorQuery.getLong(3);
                    c19784812b0.LIZLLL = cursorQuery.getLong(4);
                    c19784812b0.LJ = cursorQuery.getLong(5);
                    c19784812b0.LJFF = cursorQuery.getLong(6);
                }
                if (z) {
                    c19784812b0.LIZIZ += j2;
                }
                if (z2) {
                    c19784812b0.LIZ += j2;
                }
                if (z3) {
                    c19784812b0.LIZJ += j2;
                }
                if (z4) {
                    c19784812b0.LIZLLL += j2;
                }
                if (z5) {
                    c19784812b0.LJ += j2;
                }
                if (z6) {
                    c19784812b0.LJFF += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(c19784812b0.LIZ));
                contentValues.put("daily_events_count", Long.valueOf(c19784812b0.LIZIZ));
                contentValues.put("daily_conversions_count", Long.valueOf(c19784812b0.LIZJ));
                contentValues.put("daily_error_events_count", Long.valueOf(c19784812b0.LIZLLL));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c19784812b0.LJ));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(c19784812b0.LJFF));
                sQLiteDatabaseLJIILIIL.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c19784812b0;
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error updating daily counts. appId", e);
                if (0 != 0) {
                    cursor.close();
                }
                return c19784812b0;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
