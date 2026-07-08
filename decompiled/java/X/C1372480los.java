package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0los, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372480los extends FrameLayout implements InterfaceC1373050lpn {
    public final C11FQ LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final C427660Gpo LLILZIL;

    @Override // X.InterfaceC1373050lpn
    public final void LIZ() {
    }

    @Override // X.InterfaceC1373050lpn
    public C11FQ getQrCodeSquareView() {
        return this.LL;
    }

    public C1372480los(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f7r, this, true);
        C11FQ c11fq = (C11FQ) findViewById(R.id.v0a);
        this.LL = c11fq;
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.v09);
        this.LLILLL = (TuxTextView) findViewById(R.id.v08);
        this.LLILZ = (TuxTextView) findViewById(R.id.v0b);
        this.LLILZIL = (C427660Gpo) findViewById(R.id.v07);
        if (c11fq != null) {
            ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIIIZ();
            C14MJ.LJIIIZ(c11fq, "qr_code_default_view");
        }
    }
}
