package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;

/* JADX INFO: renamed from: X.0YTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC874920YTy extends AbstractC459940I1w {
    public abstract BaseTemplate LJIIIZ();

    @Override // X.AbstractC459940I1w
    public final C0I25 LIZLLL() {
        return new C460190I2v(LJIIIZ().encode());
    }

    @Override // X.AbstractC459940I1w
    public final int LJ() {
        return LJIIIZ().getMessageType();
    }

    @Override // X.AbstractC459940I1w
    public final InterfaceC459970I1z LJII(C874730YTf c874730YTf) {
        c874730YTf.LIZJ(LJIIIZ());
        return c874730YTf;
    }

    public AbstractC874920YTy(Context context, String str) {
        super(context, str);
    }
}
