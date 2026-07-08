package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;

/* JADX INFO: renamed from: X.0J41, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J41 extends C09AY implements InterfaceC1685430txd<String, Context, LayoutInflater, Integer, ViewGroup, Boolean, View> {
    public C0J41() {
        super(6);
    }

    @Override // X.InterfaceC1685430txd
    public final View invoke(String str, Context context, LayoutInflater layoutInflater, Integer num, ViewGroup viewGroup, Boolean bool) {
        String str2 = str;
        Context context2 = context;
        LayoutInflater layoutInflater2 = layoutInflater;
        int iIntValue = num.intValue();
        ViewGroup viewGroup2 = viewGroup;
        boolean zBooleanValue = bool.booleanValue();
        ILayoutPreloadService iLayoutPreloadService = (ILayoutPreloadService) PluggableExtentionKt.pluggableSpi$default(ILayoutPreloadService.class, false, false, false, 14, null);
        if (iLayoutPreloadService != null) {
            return iLayoutPreloadService.loadLayoutFiles(str2, context2, layoutInflater2, iIntValue, viewGroup2, zBooleanValue);
        }
        return null;
    }
}
