package X;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.ui.SceneContainerActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1959, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class AnonymousClass1959 extends Scene {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C801600VcU<? extends Class<? extends Scene>, Bundle> c801600VcULLLLLZL = SceneContainerActivity.LLLLLZL(requireActivity().getIntent());
        NavigationScene navigationSceneLIZIZ = C1447800nmM.LIZIZ(this);
        Class<? extends Scene> cls = (Class) c801600VcULLLLLZL.LIZ;
        Bundle bundle2 = c801600VcULLLLLZL.LIZIZ;
        C569760MWg c569760MWg = new C569760MWg();
        final int i = 0;
        c569760MWg.LIZJ = new AbstractC214793194d(i) { // from class: X.1958
            @Override // X.AbstractC214793194d
            public final boolean LJFF(Class<? extends Scene> cls2, Class<? extends Scene> cls3) {
                return true;
            }

            @Override // X.AbstractC214793194d
            public final void LIZJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
                View view = c214795194f.LIZIZ;
                View view2 = c214795194f2.LIZIZ;
                C195Z.LJ(view);
                C195Z.LJ(view2);
                C786410Ut5.LJLLLLLL(0, view);
                this.LIZ.getOverlay().add(view);
                runnable.run();
            }

            @Override // X.AbstractC214793194d
            public final void LJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY) {
                runnable.run();
            }
        };
        c569760MWg.LIZIZ = new InterfaceC363130ELn() { // from class: X.195A
            @Override // X.InterfaceC363130ELn
            public final void onResult(Object obj) {
                C195B c195b;
                Messenger messenger = (Messenger) this.LIZ.requireActivity().getIntent().getParcelableExtra("SingeProcessMessengerHandler");
                if (messenger != null) {
                    c195b = new C195B(messenger);
                } else {
                    c195b = null;
                }
                c195b.getClass();
                Message messageObtain = Message.obtain();
                messageObtain.obj = obj;
                try {
                    c195b.LIZ.send(messageObtain);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.LIZ.requireActivity().finish();
            }
        };
        navigationSceneLIZIZ.LLLLLLLLL(cls, bundle2, c569760MWg.LIZ());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new View(requireActivity());
    }
}
