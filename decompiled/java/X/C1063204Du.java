package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;

/* JADX INFO: renamed from: X.04Du, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1063204Du extends FrameLayout implements C04EW {
    public final C1063104Dt LL;
    public final SmartImageView LLILLJJLI;

    public C1063204Du(Context context) {
        super(context, null);
        this.LL = new C1063104Dt(this);
        int iLIZIZ = C0H9H.LIZIZ(20);
        C426750GoL.LJIIL(this, Integer.valueOf(iLIZIZ), 0, Integer.valueOf(iLIZIZ), 0, 16);
        SmartImageView smartImageView = new SmartImageView(context);
        this.LLILLJJLI = smartImageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(smartImageView, layoutParams);
    }

    @Override // X.C04EW
    public final void LLF(C1063004Ds c1063004Ds) {
        this.LL.LIZIZ(c1063004Ds);
        this.LL.LIZ(c1063004Ds);
        C809003Ea c809003Ea = C809003Ea.LIZ;
        SmartImageView smartImageView = this.LLILLJJLI;
        Icon icon = c1063004Ds.LIZJ;
        c809003Ea.getClass();
        C809003Ea.LIZ(smartImageView, icon);
    }
}
