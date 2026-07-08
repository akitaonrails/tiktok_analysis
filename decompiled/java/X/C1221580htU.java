package X;

import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: X.0htU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221580htU<T> implements InterfaceC442640HXi {
    public final /* synthetic */ InterfaceC1221570htT LIZ;

    public C1221580htU(InterfaceC1221570htT interfaceC1221570htT) {
        this.LIZ = interfaceC1221570htT;
    }

    @Override // X.InterfaceC442640HXi
    public final void onResult(Object obj) {
        File file = (File) obj;
        if (file != null) {
            this.LIZ.LIZIZ(Uri.fromFile(file));
        } else {
            this.LIZ.LIZ();
        }
    }
}
