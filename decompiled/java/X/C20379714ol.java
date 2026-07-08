package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.14ol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20379714ol extends AbstractC960470b6L<C1868230yiT> {
    public final InterfaceC20380614ou LL;
    public final View LLILLJJLI;

    public final void L5(C1868230yiT c1868230yiT) {
        C500260Jjc.LJLIIIL(500L, this.itemView, new AwS610S0100000_31(this, 497));
        View view = this.LLILLJJLI;
        if (view != null) {
            if (c1868230yiT.LIZ.invoke().intValue() > 1) {
                view.setClickable(true);
                C786410Ut5.T4(view, 1.0f);
                C500260Jjc.LJLIIIL(500L, view, new AwS610S0100000_31(this, 498));
            } else {
                view.setClickable(false);
                C786410Ut5.T4(view, 0.5f);
                C500260Jjc.LJLIIIL(500L, view, AFwS276S0000000_31.get$arr$(327));
            }
        }
    }

    public C20379714ol(View view, InterfaceC20380614ou interfaceC20380614ou) {
        super(view);
        this.LL = interfaceC20380614ou;
        this.LLILLJJLI = view.findViewById(R.id.lv_);
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C1868230yiT) obj);
    }
}
