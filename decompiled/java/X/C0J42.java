package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;

/* JADX INFO: renamed from: X.0J42, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J42 extends C09AY implements InterfaceC1685430txd<String, Context, LayoutInflater, Integer, ViewGroup, Boolean, View> {
    public C0J42() {
        super(6);
    }

    @Override // X.InterfaceC1685430txd
    public final View invoke(String str, Context context, LayoutInflater layoutInflater, Integer num, ViewGroup viewGroup, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        return ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).loadLayoutFiles(str, context, layoutInflater, num.intValue(), viewGroup, zBooleanValue);
    }
}
