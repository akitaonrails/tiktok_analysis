package X;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00mb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C179900mb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C179900mb(int i, int i2, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        if (this.LL != this.LLILLJJLI) {
            Handler handlerLIZIZ = C799570VYd.LIZIZ();
            final int i = this.LL;
            final int i2 = this.LLILLJJLI;
            final boolean z = this.LLILLL;
            C786410Ut5.LJJZZIII(handlerLIZIZ, new Runnable() { // from class: X.00ma
                public final void LIZ() throws JSONException {
                    Throwable th = new Throwable("StatusBarHeightError");
                    JSONObject jSONObject = new JSONObject();
                    int i3 = i;
                    int i4 = i2;
                    boolean z2 = z;
                    jSONObject.put("status_bar_height", i3);
                    jSONObject.put("cache_status_bar_height", i4);
                    jSONObject.put("from_cache", z2);
                    C1AF0.LJFF(th, C786410Ut5.J3(jSONObject));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TopTabStatusBarHeightFix@f95a.reportStatusBarHeight$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TopTabStatusBarHeightFix@f95a.reportStatusBarHeight$1$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
