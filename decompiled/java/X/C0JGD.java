package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0JGD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JGD extends AbstractC495800JcQ<Unit> implements InterfaceC496390JdN {
    public C16F5 LLILZIL;
    public final DataChannel LLILZLL;
    public final EnumC495780JcO LLIZ;
    public final boolean LLIZLLLIL;

    @Override // X.InterfaceC496390JdN
    public final void LIZJ(boolean z) {
    }

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.gyj;
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        View view = this.LLILLL;
        this.LLILZIL = view != null ? (C16F5) view.findViewById(R.id.user_name) : null;
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        C500260Jjc.LJIILIIL(this.LLILLL);
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLIZ;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJFF() {
        return this.LLIZLLLIL;
    }

    public C0JGD(C495920Jcc c495920Jcc) {
        super(c495920Jcc);
        this.LLILZLL = c495920Jcc.LJIIJJI;
        this.LLIZ = EnumC495780JcO.COVER_HEADER;
        this.LLIZLLLIL = true;
    }

    @Override // X.InterfaceC496390JdN
    public final void LIZ(C21578619ce c21578619ce, int i) {
        int iIntValue;
        View view = this.LLILLL;
        if (view != null) {
            Integer num = (Integer) this.LLILZLL.gg0(C0TZQ.class);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C786410Ut5.T4(view, C497740JfY.LJJI(i - iIntValue) / 36);
            if (view.getAlpha() > 0.0f) {
                C500260Jjc.LLFFF(view);
            } else {
                C500260Jjc.LJIILIIL(view);
            }
        }
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJIIIZ(User user, Object obj) {
        if (LJIIIIZZ(user)) {
            return false;
        }
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null) {
            c16f5.setText(C0KVU.LIZLLL(user));
            return true;
        }
        return true;
    }
}
