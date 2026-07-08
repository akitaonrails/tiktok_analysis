package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: X.0WFW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WFW extends SQLiteOpenHelper {
    public final String LL;

    public C0WFW(Context context) {
        super(context, "preinstall_attribution.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.LL = "create table preinstall_tb (\n    id integer primary key autoincrement,\n    preinstall_channel_af text,\n    preinstall_campaign_af text,\n    preinstall_channel_tt text,\n    system_file_channel text,\n    file_path text,\n    name_in_manifest text,\n    install_referrer text,\n    app_channel text,\n    apk_first_install_time long,\n    apk_last_update_time long,\n    is_factory_uninstall integer,\n    preinstall_method integer,\n    df_code integer\n)";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.LL);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1 && i2 == 2) {
            sQLiteDatabase.execSQL("alter table preinstall_tb add column df_code integer    ");
            sQLiteDatabase.close();
        }
    }
}
