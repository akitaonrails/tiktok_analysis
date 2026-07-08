package X;

import com.appsflyer.AppsFlyerLib;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817170W3v extends C09AY implements Function0<C814380Vx6<Unit>> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C817170W3v(boolean z) {
        super(0);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C814380Vx6<Unit> invoke() throws Throwable {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        boolean zBooleanValue = this.LL;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQdp1HqHmhUw2mNpb2yZtIDa7H5MsJaIgLZsWOxKufaA==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {Boolean.valueOf(zBooleanValue)};
        C0WZW c0wzw = new C0WZW(false, "(Z)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11030, "com/appsflyer/AppsFlyerLib", "setCollectIMEI", appsFlyerLib, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11030, "com/appsflyer/AppsFlyerLib", "setCollectIMEI", null, objArr, appsFlyerLib, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    appsFlyerLib = (AppsFlyerLib) obj;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                }
            }
            appsFlyerLib.setCollectIMEI(zBooleanValue);
            c0wst.LIZ(11030, "com/appsflyer/AppsFlyerLib", "setCollectIMEI", null, objArr, appsFlyerLib, c0wzw, true);
        }
        return C814390Vx7.LIZ(Unit.LIZ);
    }
}
