package X;

import Y.ACListenerS169S0100000_35;
import android.view.View;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS649S0100000_35;

/* JADX INFO: renamed from: X.1E1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274721E1u implements InterfaceC1607260rvY {
    public final C01GW LL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(833));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(834));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(835));
    public Function2<? super EnumC1608710rxt, ? super InterfaceC1606880ruw, Unit> LLILZ;
    public AvatarComponentView LLILZIL;

    @Override // X.InterfaceC1607260rvY
    public final boolean LIZJ() {
        return !((Set) this.LLILLL.getValue()).isEmpty();
    }

    @Override // X.InterfaceC1607260rvY
    public final Function2<EnumC1608710rxt, InterfaceC1606880ruw, Unit> getOnNodeClickListener() {
        return this.LLILZ == null ? new AwS649S0100000_35(this, 28) : new AwS649S0100000_35(this, 29);
    }

    @Override // X.InterfaceC1607260rvY
    public final View.OnClickListener LIZIZ(int i) {
        if (i != 2) {
            if (i != 3) {
                return new ACListenerS169S0100000_35(this, 24);
            }
            return new ACListenerS169S0100000_35(this, 26);
        }
        if (((Set) this.LLILLJJLI.getValue()).isEmpty()) {
            return new ACListenerS169S0100000_35(this, 24);
        }
        return new ACListenerS169S0100000_35(this, 25);
    }

    @Override // X.InterfaceC1607260rvY
    public final void LIZLLL(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((Set) this.LLILLL.getValue()).clear();
                    return;
                }
                return;
            }
            ((Set) this.LLILLJJLI.getValue()).clear();
            return;
        }
        ((Set) this.LL.getValue()).clear();
    }

    @Override // X.InterfaceC1607260rvY
    public final void setAvatarComponentView(AvatarComponentView avatarComponentView) {
        this.LLILZIL = avatarComponentView;
    }

    @Override // X.InterfaceC1607260rvY
    public final void setOnNodeClickListener(Function2<? super EnumC1608710rxt, ? super InterfaceC1606880ruw, Unit> function2) {
        this.LLILZ = function2;
    }

    @Override // X.InterfaceC1607260rvY
    public final void LIZ(int i, View.OnClickListener onClickListener) {
        if (i != 2) {
            if (i != 3) {
                ((Set) this.LL.getValue()).add(onClickListener);
                return;
            } else {
                ((Set) this.LLILLL.getValue()).add(onClickListener);
                return;
            }
        }
        ((Set) this.LLILLJJLI.getValue()).add(onClickListener);
    }
}
