package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372500lou extends FrameLayout implements InterfaceC1373050lpn {
    public final C11FQ LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final RemoteImageView LLILZIL;

    @Override // X.InterfaceC1373050lpn
    public final void LIZ() {
    }

    @Override // X.InterfaceC1373050lpn
    public C11FQ getQrCodeSquareView() {
        return this.LL;
    }

    public C1372500lou(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f8l, this, true);
        C11FQ c11fq = (C11FQ) findViewById(R.id.v0a);
        this.LL = c11fq;
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.v0d);
        this.LLILLL = (TuxTextView) findViewById(R.id.v0g);
        this.LLILZ = (TuxTextView) findViewById(R.id.v0b);
        this.LLILZIL = (RemoteImageView) findViewById(R.id.v0f);
        if (c11fq != null) {
            ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIIIZ();
            C14MJ.LJIIIZ(c11fq, "qr_code_default_view");
        }
    }
}
