package X;

import android.content.Context;
import android.database.ContentObserver;
import android.provider.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oHW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467120oHW {
    public final Context LIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public final ArrayList<String> LIZIZ = new ArrayList<>();
    public final C1467620oIK LJ = new ContentObserver() { // from class: X.0oIK
        {
            super(null);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            super.onChange(z);
            this.LIZ.LIZ();
        }
    };

    public final void LIZ() {
        int i;
        if (!this.LIZLLL || this.LIZIZ.size() > 100 || this.LIZ == null) {
            return;
        }
        HashMap map = new HashMap();
        try {
            i = Settings.System.getInt(this.LIZ.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            i = 0;
        }
        map.put("b", Float.valueOf((i * 1.0f) / 255.0f));
        map.put("t", Long.valueOf(System.currentTimeMillis()));
        C790040Uyw.LIZJ(C786410Ut5.J3(new JSONObject(map)), this.LIZIZ);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oIK] */
    public C1467120oHW(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }
}
