package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ConcurrentHashMap;
import joo.f;

/* JADX INFO: renamed from: X.0nm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1447660nm8 extends C19A3 {
    @Override // com.bytedance.scene.Scene
    public void onDestroyView() {
        String string;
        super.onDestroyView();
        f.LIZ.getClass();
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LargeTransaction: clear scene memory bundles for ");
        sbLIZ.append(this);
        C201955140j.LJIILJJIL(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
        Bundle bundle = this.mArguments;
        if (bundle == null || (string = bundle.getString("scene_bundle_uuid")) == null || string.length() == 0) {
            return;
        }
        ((ConcurrentHashMap) f.LIZIZ).remove(string);
    }

    @InterfaceC1294060jmO
    public Bundle requireArgumentsSafely() {
        Bundle argumentsSafely = getArgumentsSafely();
        if (argumentsSafely != null) {
            return argumentsSafely;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene ");
        sbLIZ.append(this);
        sbLIZ.append(" does not have any arguments.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @InterfaceC1294060jmO
    public Bundle getArgumentsSafely() {
        return this.mArguments;
    }

    @InterfaceC1294060jmO
    public void setArgumentsSafely(Bundle bundle) {
        this.mArguments = bundle;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
