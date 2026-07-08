package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372490lot extends FrameLayout implements InterfaceC1373050lpn {
    public final C11FQ LL;
    public final C427660Gpo LLILLJJLI;
    public final TuxTextView LLILLL;
    public final View LLILZ;

    @Override // X.InterfaceC1373050lpn
    public final void LIZ() {
    }

    @Override // X.InterfaceC1373050lpn
    public C11FQ getQrCodeSquareView() {
        return this.LL;
    }

    public C1372490lot(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ccv, this, true);
        this.LLILZ = findViewById(R.id.j84);
        findViewById(R.id.skf);
        this.LLILLJJLI = (C427660Gpo) findViewById(R.id.skg);
        this.LLILLL = (TuxTextView) findViewById(R.id.skh);
        C11FQ c11fq = (C11FQ) findViewById(R.id.sjz);
        this.LL = c11fq;
        ImageView imageView = (ImageView) findViewById(R.id.xvu);
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIIIZ();
        if (c11fq != null) {
            C14MJ.LJIIIZ(c11fq, "qr_code_default_view");
        }
        Integer numValueOf = Integer.valueOf(C1674990tgn.LIZIZ.LIZ());
        if (numValueOf.intValue() != 0) {
            int iIntValue = numValueOf.intValue();
            if (imageView != null) {
                imageView.setImageResource(iIntValue);
            }
        }
        Context context2 = getContext();
        Context context3 = C1383370m6R.LIZ;
        if (C0FV2.LIZIZ(context2) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320))) {
            View view = this.LLILZ;
            if (view != null) {
                C1383370m6R.LIZ(view, AnonymousClass0207.get$arr$(99));
            }
            C11FQ c11fq2 = this.LL;
            if (c11fq2 != null) {
                C1383370m6R.LIZ(c11fq2, AnonymousClass0207.get$arr$(100));
            }
        }
    }
}
