package X;

import android.view.View;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UIComponent;

/* JADX INFO: renamed from: X.0kGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313000kGw implements InterfaceC1313020kGy {
    public final /* synthetic */ UIListContainer LIZ;

    public C1313000kGw(UIListContainer uIListContainer) {
        this.LIZ = uIListContainer;
    }

    public final int LIZ(View view) {
        if (view instanceof C1312300kFo) {
            AndroidView androidView = (AndroidView) view;
            if (androidView.getDrawChildHook() instanceof UIComponent) {
                String str = ((UIComponent) androidView.getDrawChildHook()).LLILLJJLI;
                if (this.LIZ.LLILLL.contains(str)) {
                    return this.LIZ.LLILLL.indexOf(str);
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }
}
