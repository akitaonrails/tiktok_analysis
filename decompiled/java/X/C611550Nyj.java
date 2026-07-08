package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.database.AwemeMessageDatabase;

/* JADX INFO: renamed from: X.0Nyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C611550Nyj {
    public static final /* synthetic */ C611550Nyj LIZ = new C611550Nyj();

    public static InterfaceC593180NOi LIZ() {
        Context applicationContext;
        IAppContextManagerService iAppContextManagerService = (IAppContextManagerService) PluggableExtentionKt.pluggableSpiForReal(IAppContextManagerService.class);
        if (iAppContextManagerService == null || (applicationContext = iAppContextManagerService.getApplicationContext()) == null) {
            return null;
        }
        AwemeMessageDatabase awemeMessageDatabase = AwemeMessageDatabase.LL;
        if (awemeMessageDatabase == null) {
            synchronized (AwemeMessageDatabase.LLILLJJLI) {
                try {
                    awemeMessageDatabase = AwemeMessageDatabase.LL;
                    if (awemeMessageDatabase == null) {
                        Context contextN3 = C786410Ut5.N3(applicationContext);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("db_aweme_message_");
                        sbLIZ.append(C461720I8s.LIZIZ());
                        C796500VMi c796500VMiLIZ = C0OGG.LIZ(contextN3, AwemeMessageDatabase.class, C2188811AlT.LIZIZ(sbLIZ));
                        c796500VMiLIZ.LIZJ();
                        awemeMessageDatabase = (AwemeMessageDatabase) c796500VMiLIZ.LIZIZ();
                        AwemeMessageDatabase.LL = awemeMessageDatabase;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return awemeMessageDatabase.LIZ();
    }
}
