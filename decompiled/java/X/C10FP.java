package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.services.optimization.InjectLayoutInflater;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10FP, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10FP {
    public static View LIZ(Context context, ViewGroup viewGroup) {
        InjectLayoutInflater injectLayoutInflaterCreateInjectLayoutInflater = ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).createInjectLayoutInflater();
        if (injectLayoutInflaterCreateInjectLayoutInflater.isInjectionEnabled()) {
            injectLayoutInflaterCreateInjectLayoutInflater.setTag("DisclosureCellPublishOptionViewFactory#layout_option_template_disclosure_cell");
            return injectLayoutInflaterCreateInjectLayoutInflater.inflate(context, R.layout.d73, viewGroup, false);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        C127K c127k = new C127K(context, null, 6);
        c127k.setId(R.id.fwb);
        c127k.setAccessory(new C11G4(context, null));
        frameLayout.addView(c127k, new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }
}
