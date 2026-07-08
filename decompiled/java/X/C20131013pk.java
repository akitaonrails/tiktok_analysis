package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.13pk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20131013pk extends SQLiteOpenHelper {
    public static volatile C20131013pk LLILLJJLI;
    public boolean LL;

    public static C20131013pk LIZ() {
        if (LLILLJJLI == null) {
            synchronized (C20131013pk.class) {
                try {
                    if (LLILLJJLI == null) {
                        LLILLJJLI = new C20131013pk();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILLJJLI;
    }

    public C20131013pk() {
        super(C2199681B7e.LJFF(), "downloader.db", (SQLiteDatabase.CursorFactory) null, 16);
        this.LL = false;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        Context contextLJFF = C2199681B7e.LJFF();
        if (this.LL || contextLJFF == null) {
            return super.getReadableDatabase();
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/data/data/");
            sbLIZ.append(contextLJFF.getPackageName());
            sbLIZ.append("/database/main/");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (!c0vsj.exists()) {
                c0vsj.mkdir();
            }
            super.getReadableDatabase().execSQL("PRAGMA temp_store_directory = tempDir");
            this.LL = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return super.getReadableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (Build.VERSION.SDK_INT == 28) {
            sQLiteDatabase.disableWriteAheadLogging();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloader( _id INTEGER PRIMARY KEY, url TEXT, savePath TEXT, tempPath TEXT, name TEXT, chunkCount INTEGER, status INTEGER, curBytes INTEGER, totalBytes INTEGER, eTag TEXT, onlyWifi INTEGER, force INTEGER, retryCount INTEGER, extra TEXT, mimeType TEXT, title TEXT, notificationEnable INTEGER, notificationVisibility INTEGER, isFirstDownload INTEGER, isFirstSuccess INTEGER, needHttpsToHttpRetry INTEGER, downloadTime INTEGER, packageName TEXT, md5 TEXT, retryDelay INTEGER, curRetryTime INTEGER, retryDelayStatus INTEGER, defaultHttpServiceBackUp INTEGER, chunkRunnableReuse INTEGER, retryDelayTimeArray TEXT, chunkDowngradeRetry INTEGER, backUpUrlsStr TEXT, backUpUrlRetryCount INTEGER, realDownloadTime INTEGER, retryScheduleMinutes INTEGER, independentProcess INTEGER, auxiliaryJsonobjectString TEXT, iconUrl TEXT, appVersionCode INTEGER, taskId TEXT, downloadStartTimeStamp INTEGER, downloadFinishTimeStamp INTEGER, installedTimeStamp INTEGER, hasDoInstallation INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OldVersion: ");
            sbLIZ.append(i);
            sbLIZ.append(" newVersion: ");
            sbLIZ.append(i2);
            C1490830otl.LIZIZ("DownloadDBHelper", "onDowngrade", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C2199751B7l.LJFF.LJIIIIZZ("support_sqlite_downgrade", 0) > 0) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS downloader");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS segments");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(th);
                C1490830otl.LIZJ("DownloadDBHelper", "onDowngrade", C2188811AlT.LIZIZ(sbLIZ2));
            }
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OldVersion: ");
            sbLIZ.append(i);
            sbLIZ.append(" newVersion: ");
            sbLIZ.append(i2);
            C1490830otl.LIZIZ("DownloadDBHelper", "onUpgrade", C2188811AlT.LIZIZ(sbLIZ));
        }
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD mimeType TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD title TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationEnable INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationVisibility INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstDownload INTEGER");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstSuccess INTEGER");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadTime INTEGER");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD packageName TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD md5 TEXT");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelay INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD curRetryTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayStatus INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER");
            case 7:
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkRunnableReuse INTEGER");
            case BdTuring.TYPE_ECAF /* 9 */:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayTimeArray TEXT");
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkDowngradeRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlsStr TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlRetryCount INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD realDownloadTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryScheduleMinutes INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD independentProcess INTEGER");
            case BdTuring.TYPE_EMAIL /* 11 */:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD auxiliaryJsonobjectString TEXT");
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD iconUrl TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD appVersionCode INTEGER");
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD taskId TEXT");
            case 15:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadStartTimeStamp INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadFinishTimeStamp INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD installedTimeStamp INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD hasDoInstallation INTEGER");
                break;
        }
    }
}
