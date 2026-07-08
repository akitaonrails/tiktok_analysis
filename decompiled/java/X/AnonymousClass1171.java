package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1171, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1171 implements C0QRD {
    public final /* synthetic */ AnonymousClass1172 LIZ;

    @Override // X.C0QRD
    public final void onFailed() {
        String strLLLLLJIL = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLLLLJIL(0);
        TextView textView = (TextView) this.LIZ.LIZ.LIZ.findViewById(R.id.tv_static_text);
        if (textView != null) {
            textView.setText(strLLLLLJIL);
        }
    }

    public AnonymousClass1171(AnonymousClass1172 anonymousClass1172) {
        this.LIZ = anonymousClass1172;
    }
}
