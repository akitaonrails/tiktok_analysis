package X;

import Y.ARunnableS34S0201000_29;
import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15o6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20630415o6 {
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.InterfaceC20630715o9 r5) {
        /*
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = X.C20630515o7.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto Lb8
            com.bytedance.scene.Scene r0 = r5.getScene()
            com.bytedance.scene.navigation.NavigationScene r1 = X.C1447800nmM.LIZ(r0)
            com.bytedance.scene.Scene r0 = r5.getScene()
            android.app.Activity r3 = r0.mActivity
            r4 = 0
            if (r3 == 0) goto La2
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L93
            boolean r0 = r3 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto La2
            X.198d r3 = (X.InterfaceC214897198d) r3
        L29:
            boolean r0 = X.C294740Bgu.LIZ()
            r2 = 1
            if (r0 == 0) goto L77
            if (r1 == 0) goto L34
            com.bytedance.scene.Scene r4 = r1.mParentScene
        L34:
            boolean r0 = r4 instanceof X.C198H
            if (r0 == 0) goto L77
            X.198H r4 = (X.C198H) r4
            if (r4 == 0) goto L77
            boolean r0 = r4 instanceof X.InterfaceC20622815ms
            if (r0 == 0) goto L77
            r0 = r4
            X.15ms r0 = (X.InterfaceC20622815ms) r0
            com.bytedance.scene.navigation.NavigationScene r0 = r0.getNavigationScene()
            if (r0 == 0) goto L61
            java.util.List r0 = r0.getSceneList()
            int r0 = r0.size()
            if (r0 == r2) goto L61
            boolean r0 = X.C20630315o5.LIZ(r5, r1)
            if (r0 == 0) goto La4
            X.19BM r0 = r5.buildPopOptions()
            r1.LLLLLLIL(r0)
        L60:
            return
        L61:
            boolean r0 = r4 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L60
            r3 = r4
            androidx.lifecycle.LifecycleOwner r3 = (androidx.lifecycle.LifecycleOwner) r3
            if (r3 == 0) goto L60
            X.0QpW r2 = X.EnumC682280QpW.FINISH
            kotlin.jvm.internal.AwS575S0100000_31 r1 = new kotlin.jvm.internal.AwS575S0100000_31
            r0 = 761(0x2f9, float:1.066E-42)
            r1.<init>(r4, r0)
            X.C1563370qml.LIZ(r3, r2, r1)
            return
        L77:
            if (r3 == 0) goto L60
            if (r1 == 0) goto Lb4
            java.util.List r0 = r1.getSceneList()
            int r0 = r0.size()
            if (r0 == r2) goto Lb4
            boolean r0 = X.C20630315o5.LIZ(r5, r1)
            if (r0 == 0) goto Lac
            X.19BM r0 = r5.buildPopOptions()
            r1.LLLLLLIL(r0)
            return
        L93:
            boolean r0 = r3 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto La2
            X.198d r3 = (X.InterfaceC214897198d) r3
            if (r3 == 0) goto La2
            boolean r0 = r3.getEnableSAF()
            if (r0 == 0) goto La2
            goto L29
        La2:
            r3 = r4
            goto L29
        La4:
            com.bytedance.scene.Scene r0 = r5.getScene()
            r1.remove(r0)
            return
        Lac:
            com.bytedance.scene.Scene r0 = r5.getScene()
            r1.remove(r0)
            return
        Lb4:
            r3.finishLastPage()
            return
        Lb8:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            r2.<init>(r1)
            Y.ARunnableS131S0100000_31 r1 = new Y.ARunnableS131S0100000_31
            r0 = 63
            r1.<init>(r5, r0)
            X.C786410Ut5.LJJZZIII(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20630415o6.LIZ(X.15o9):void");
    }

    public static void LIZIZ(InterfaceC20630715o9 interfaceC20630715o9, int i, Intent intent) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = C20630515o7.LIZ;
        if (Intrinsics.LJFF(looperMyLooper, looper)) {
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(interfaceC20630715o9.getScene());
            Activity activity = interfaceC20630715o9.getScene().mActivity;
            if (navigationSceneLIZ != null && navigationSceneLIZ.getSceneList().size() != 1) {
                navigationSceneLIZ.LLLLLLZZ(interfaceC20630715o9.getScene(), new C20630615o8(i, intent));
                return;
            } else {
                if (activity == null) {
                    return;
                }
                C2204961BRm.LJIIL(i, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KMObQrng3SSTDPgYEDl6IdxJ", null));
                return;
            }
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(looper), new ARunnableS34S0201000_29(interfaceC20630715o9, i, intent, 2));
    }
}
