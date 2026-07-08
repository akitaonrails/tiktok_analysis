package X;

import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import com.ss.android.ugc.awemepushlib.os.lifecycle.LifecycleCallbackAdapter;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814250Vwt extends LifecycleCallbackAdapter {
    public final /* synthetic */ long LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ JSONObject LLILZIL;

    @Override // com.ss.android.ugc.awemepushlib.os.lifecycle.LifecycleCallbackAdapter, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C460020I2e.LIZ.unregisterActivityLifecycleCallbacks(this);
        C810560Vqw.LIZJ(new ARunnableS113S0100000_13(this, 128));
    }

    public C814250Vwt(long j, boolean z, String str, String str2, JSONObject jSONObject) {
        this.LL = j;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = jSONObject;
    }
}
