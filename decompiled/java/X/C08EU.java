package X;

import com.bytedance.morpheus.PluginEntity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08EU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EU extends C09AY implements Function0<List<? extends PluginEntity>> {
    public C08EU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends PluginEntity> invoke() {
        try {
            C844470XAv.LIZ.getClass();
            return C13LQ.LJJLL((Object[]) new Gson().LJFF(new InputStreamReader(C844470XAv.LIZ().getResources().getAssets().open("plugins.json")), PluginEntity[].class));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            return Collections.singletonList(new PluginEntity(message, "!!ERROR!!"));
        }
    }
}
