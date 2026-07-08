package X;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820280WFu extends C09AY implements Function0<C814380Vx6<Unit>> {
    public final /* synthetic */ C0WG5 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C820280WFu(C0WG5 c0wg5, String str, String str2) {
        super(0);
        this.LL = c0wg5;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C814380Vx6<Unit> invoke() throws Throwable {
        FirebaseAnalytics firebaseAnalytics = this.LL.LIZ;
        String str = this.LLILLJJLI;
        Object obj = this.LLILLL;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQdp1HqHmhUw2mMY/0359FB66bZtQZRElSwVrkXl8Q+gfSDKB5vNaXndutmOfs", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {str, obj};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11037, "com/google/firebase/analytics/FirebaseAnalytics", "setUserProperty", firebaseAnalytics, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11037, "com/google/firebase/analytics/FirebaseAnalytics", "setUserProperty", null, objArr, firebaseAnalytics, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj2 = objArr2[0];
                if (obj2 != null) {
                    firebaseAnalytics = (FirebaseAnalytics) obj2;
                }
                Object obj3 = objArr2[1];
                if (obj3 != null) {
                    str = (String) obj3;
                }
                Object obj4 = objArr2[2];
                if (obj4 != null) {
                    obj = obj4;
                }
            }
            C820210WFn c820210WFn = firebaseAnalytics.LIZ;
            c820210WFn.getClass();
            c820210WFn.LIZIZ(new C820400WGg(c820210WFn, null, str, obj, false));
            c0wst.LIZ(11037, "com/google/firebase/analytics/FirebaseAnalytics", "setUserProperty", null, objArr, firebaseAnalytics, c0wzw, true);
        }
        return C814390Vx7.LIZ(Unit.LIZ);
    }
}
