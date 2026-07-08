package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.push.PushBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VS1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VS1 extends C0VS3 {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public String LJI;
    public PushBody LJII;

    public final ContentValues LIZ() {
        PushBody pushBody;
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", Long.valueOf(this.LIZIZ));
        contentValues.put("arrive_time", Long.valueOf(this.LIZJ));
        contentValues.put("client_intelligence_expire_time", Long.valueOf(this.LIZLLL));
        contentValues.put("sender", Integer.valueOf(this.LIZ));
        contentValues.put("handle_by_sdk", Integer.valueOf(this.LJ ? 1 : 0));
        contentValues.put("has_been_shown", Integer.valueOf(this.LJFF ? 1 : 0));
        if (TextUtils.isEmpty(this.LJI) && (pushBody = this.LJII) != null) {
            this.LJI = pushBody.LIZ();
        }
        contentValues.put("push_body", this.LJI);
        return contentValues;
    }

    public C0VS1(Cursor cursor) {
        boolean z;
        this.LIZIZ = cursor.getLong(0);
        this.LIZJ = cursor.getLong(1);
        this.LIZLLL = cursor.getLong(2);
        this.LIZ = cursor.getInt(3);
        if (cursor.getInt(4) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJ = z;
        this.LJFF = cursor.getInt(5) == 1;
        String string = cursor.getString(6);
        this.LJI = string;
        if (!TextUtils.isEmpty(string)) {
            try {
                this.LJII = new PushBody(new JSONObject(this.LJI));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LJII = null;
            }
        }
    }

    public C0VS1(int i, long j, long j2, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = 0L;
        this.LJ = false;
        this.LJFF = z;
        this.LJI = str;
    }
}
