package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.197a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214868197a {
    public static final NavigationScene LIZ(final C19A3 c19a3, Bundle bundle) {
        C214936199q c214936199q = new C214936199q(bundle, C19A3.class);
        c214936199q.LIZJ = false;
        c214936199q.LIZLLL = false;
        c214936199q.LJ = 0;
        c214936199q.LJIIZILJ = C293940Bfc.LIZ();
        NavigationScene navigationScene = (NavigationScene) C2350509Ix.LIZ(c214936199q.LIZ(), NavigationScene.class);
        navigationScene.LLJIJIL = new InterfaceC214877197j() { // from class: X.0KzV
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle2) {
                return c19a3;
            }
        };
        return navigationScene;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [X.0uNC] */
    public static final Pair<NavigationScene, C19AK<?>> LIZIZ(final Activity activity, Class<? extends C19A3> cls, Bundle bundle, int i, boolean z, float f) {
        C214936199q c214936199q = new C214936199q(bundle, cls);
        c214936199q.LIZJ = false;
        c214936199q.LIZLLL = false;
        c214936199q.LJ = 0;
        c214936199q.LJIIZILJ = C293940Bfc.LIZ();
        if (z) {
            c214936199q.LJFF = true;
        }
        c214936199q.LJI = f;
        Scene sceneLIZ = C2350509Ix.LIZ(c214936199q.LIZ(), NavigationScene.class);
        C365090ETb.LIZIZ();
        return new Pair<>(sceneLIZ, new C19AK(i, new InterfaceC19394510uF(activity) { // from class: X.10uC
            public final Activity LIZ;

            {
                this.LIZ = activity;
            }

            @Override // X.InterfaceC19394510uF
            public final <T extends View> T LIZ(int i2) {
                T t = (T) this.LIZ.findViewById(i2);
                if (t != null) {
                    return t;
                }
                try {
                    String resourceName = this.LIZ.getResources().getResourceName(i2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(' ');
                    sbLIZ.append(resourceName);
                    sbLIZ.append(" view not found");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(' ');
                    sbLIZ2.append(i2);
                    sbLIZ2.append(" view not found");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }, sceneLIZ, new InterfaceC21498919Br() { // from class: X.197Z
            @Override // X.InterfaceC21498919Br
            public final C214937199r IQ() {
                return C214937199r.LJI.IQ();
            }
        }, new InterfaceC21498219Bk() { // from class: X.0uNC
            public final String LIZ = UUID.randomUUID().toString();
            public final String LIZIZ = UUID.randomUUID().toString();
            public String LIZJ;
            public String LIZLLL;

            @Override // X.InterfaceC21498219Bk
            public final void LJJIJIIJIL() {
                Map<String, Bundle> map = C08DH.LIZ;
                C19719512Dh.LIZJ(map).remove(this.LIZJ);
                ((HashMap) map).remove(this.LIZ);
                C1701150uMz c1701150uMz = C1701170uN1.LIZ;
                String str = this.LIZJ;
                String str2 = this.LIZLLL;
                ExecutorService executorService = C1701170uN1.LIZJ;
                executorService.execute(new RunnableC1699920uL0(str, str2));
                executorService.execute(new RunnableC1699920uL0(this.LIZ, this.LIZIZ));
            }

            @Override // X.InterfaceC21498219Bk
            public final Bundle onRestoreInstanceState(Bundle bundle2) {
                String string;
                String string2 = bundle2.getString("Key_TikTokCTSceneStateSaveStrategy_Scene");
                if (string2 == null || (string = bundle2.getString("Key_TikTokCTSceneStateSaveStrategy_Verify")) == null) {
                    return null;
                }
                this.LIZJ = string2;
                this.LIZLLL = string;
                HashMap map = (HashMap) C08DH.LIZ;
                Bundle bundle3 = (Bundle) map.get(string2);
                if (bundle3 != null) {
                    if (((Boolean) C268140Af6.LIZ.getValue()).booleanValue()) {
                        C13SS.LIZ.getClass();
                        C13SS.LIZ("MEMORY_LEAK", "onRestoreInstanceState remove bundle from memory cache");
                        map.remove(string2);
                    }
                    return bundle3;
                }
                C1701150uMz c1701150uMz = C1701170uN1.LIZ;
                Bundle bundleLIZ = C1701170uN1.LIZ(string2, string);
                if (bundleLIZ == null || bundleLIZ.size() <= 0) {
                    return null;
                }
                return bundleLIZ;
            }

            @Override // X.InterfaceC21498219Bk
            public final void LIZ(Bundle bundle2, Bundle bundle3) {
                if (!bundle2.containsKey("Key_TikTokCTSceneStateSaveStrategy_Scene") && !bundle2.containsKey("Key_TikTokCTSceneStateSaveStrategy_Verify")) {
                    C786410Ut5.LJJJI("Key_TikTokCTSceneStateSaveStrategy_Scene", this.LIZ, bundle2);
                    C786410Ut5.LJJJI("Key_TikTokCTSceneStateSaveStrategy_Verify", this.LIZIZ, bundle2);
                    ((HashMap) C08DH.LIZ).put(this.LIZ, bundle3);
                    C1701150uMz c1701150uMz = C1701170uN1.LIZ;
                    C1701170uN1.LIZIZ(this.LIZ, this.LIZIZ, bundle3, 0L, 24);
                    return;
                }
                throw new IllegalStateException("Host have multi scene environment");
            }
        }, true));
    }
}
