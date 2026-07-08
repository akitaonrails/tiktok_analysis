package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.im.service.analytics.IMChatPerfLogger;
import java.lang.ref.Reference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0V15, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V15 extends C09AY implements Function0<Unit> {
    public C0V15() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
        if (applicationContext instanceof Application) {
            C789620UyG c789620UyG = IMChatPerfLogger.LJIIIIZZ;
            Reference reference = (Reference) C13LP.LJJJLL(C08AJ.LIZ);
            c789620UyG.LIZ(reference != null ? (Activity) reference.get() : null);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(c789620UyG);
        }
        return Unit.LIZ;
    }
}
