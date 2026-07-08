package X;

import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20622615mq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC20622815ms LL;
    public final /* synthetic */ ConcurrentHashMap<AbstractC813200VvC, Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20622615mq(InterfaceC20622815ms interfaceC20622815ms, ConcurrentHashMap<AbstractC813200VvC, Boolean> concurrentHashMap) {
        super(0);
        this.LL = interfaceC20622815ms;
        this.LLILLJJLI = concurrentHashMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        NavigationScene navigationScene = this.LL.getNavigationScene();
        if (navigationScene == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        final ConcurrentHashMap<AbstractC813200VvC, Boolean> concurrentHashMap = this.LLILLJJLI;
        navigationScene.registerChildSceneLifecycleCallbacks(new C0Y8U() { // from class: X.15il
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0Y8U, X.C19AH
            public final void LJJIJIIJIL(Scene scene, Bundle bundle) {
                InterfaceC20630715o9 interfaceC20630715o9;
                if ((scene instanceof InterfaceC20630715o9) && (interfaceC20630715o9 = (InterfaceC20630715o9) scene) != null) {
                    for (Map.Entry<AbstractC813200VvC, Boolean> entry : concurrentHashMap.entrySet()) {
                        interfaceC20630715o9.d5(entry.getKey(), entry.getValue().booleanValue());
                    }
                }
            }
        }, false);
        return Unit.LIZ;
    }
}
