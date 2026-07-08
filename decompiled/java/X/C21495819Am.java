package X;

import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.navigation.Record;

/* JADX INFO: renamed from: X.19Am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21495819Am implements InterfaceC21499219Bu {
    public final InterfaceC21496319Ar LIZ;
    public final Record LIZIZ;
    public final NavigationScene LIZJ;
    public final View LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    @Override // X.InterfaceC21499219Bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute(java.lang.Runnable r19) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21495819Am.execute(java.lang.Runnable):void");
    }

    public C21495819Am(InterfaceC21496319Ar interfaceC21496319Ar, Record record) {
        View view;
        Scene scene;
        this.LIZ = interfaceC21496319Ar;
        this.LIZIZ = record;
        this.LIZJ = interfaceC21496319Ar.getNavigationScene();
        if (record != null && (scene = record.mScene) != null) {
            view = scene.mView;
        } else {
            view = null;
        }
        this.LIZLLL = view;
    }
}
