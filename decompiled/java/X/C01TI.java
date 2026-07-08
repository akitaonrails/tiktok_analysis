package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01TI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01TI extends C09AY implements Function0<Map<String, String>> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01TI(boolean z, String str, String str2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, String> invoke() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.valueOf(this.LL), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("uri", this.LLILLL);
        return c2344009Gk.LIZ;
    }
}
