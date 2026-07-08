package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372510lov extends FrameLayout implements InterfaceC1373050lpn {
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final C11FQ LLILLL;

    @Override // X.InterfaceC1373050lpn
    public final void LIZ() {
    }

    @Override // X.InterfaceC1373050lpn
    public C11FQ getQrCodeSquareView() {
        return this.LLILLL;
    }

    public C1372510lov(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f89, this, true);
        C11FQ c11fq = (C11FQ) findViewById(R.id.v0a);
        this.LLILLL = c11fq;
        this.LLILLJJLI = (TextView) findViewById(R.id.v0e);
        this.LL = (TextView) findViewById(R.id.v0d);
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIIIZ();
        if (c11fq != null) {
            C14MJ.LJIIIZ(c11fq, "qr_code_default_view");
        }
    }
}
