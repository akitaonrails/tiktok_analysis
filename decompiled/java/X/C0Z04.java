package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Z04, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z04 extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C0Z0A LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC882520Yji LLILZ;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.LL;
        Function2<? super String, ? super Map<String, String>, Unit> function2 = this.LLILLJJLI.LJFF;
        if (function2 != null) {
            function2.invoke("tars_env_observable", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, this.LLILLL), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failed"), new Pair("error", th.toString()), new Pair("duration", String.valueOf(jUptimeMillis))));
        }
        InterfaceC882520Yji interfaceC882520Yji = this.LLILZ;
        if (interfaceC882520Yji != null) {
            interfaceC882520Yji.LIZ(new C892820Z0u("observableEnvReady", th));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z04(C2185208hG c2185208hG, long j, C0Z0A c0z0a, String str, C0Z0J c0z0j) {
        super(c2185208hG);
        this.LL = j;
        this.LLILLJJLI = c0z0a;
        this.LLILLL = str;
        this.LLILZ = c0z0j;
    }
}
