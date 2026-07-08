package X;

import Y.ACListenerS163S0100000_29;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewModel;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewState;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.0xnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833080xnm extends C1809420xBc {
    public final C19EG LLILZ;
    public final C01GW LLILZIL;
    public C11NJ LLILZLL;
    public C111R LLIZ;

    private final NaviAvatarListViewModel getViewModel() {
        return (NaviAvatarListViewModel) this.LLILZIL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C11NJ c11nj = this.LLILZLL;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLILZLL = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZLL = new C11NJ();
        LifecycleOwner lifecycleOwnerLIZ = C0EBE.LIZ(this);
        if (lifecycleOwnerLIZ == null) {
            lifecycleOwnerLIZ = this.LLILZ;
        }
        C11NJ c11nj = this.LLILZLL;
        if (c11nj != null) {
            c11nj.LIZ(getViewModel().jR2(lifecycleOwnerLIZ, new C2217381BqS() { // from class: X.0xnp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((NaviAvatarListViewState) obj).getAvatarList();
                }
            }, new C1765020w20(), new AwS606S0100000_27(this, 526)));
        }
        C11NJ c11nj2 = this.LLILZLL;
        if (c11nj2 != null) {
            c11nj2.LIZ(getViewModel().jR2(lifecycleOwnerLIZ, new C2217381BqS() { // from class: X.0xnn
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((NaviAvatarListViewState) obj).getSelectedIndex();
                }
            }, new C1765020w20(), new AwS606S0100000_27(this, 527)));
        }
        C11NJ c11nj3 = this.LLILZLL;
        if (c11nj3 != null) {
            c11nj3.LIZ(getViewModel().jR2(lifecycleOwnerLIZ, new C2217381BqS() { // from class: X.0xno
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((NaviAvatarListViewState) obj).getLoadingIndex();
                }
            }, new C1765020w20(), new AwS606S0100000_27(this, 528)));
        }
        setOnAvatarClickListener(new AwS643S0100000_29(this, 114));
        setPlusClickListener(new ACListenerS163S0100000_29(this, 270));
    }

    public C1833080xnm(C19EG c19eg) {
        super(c19eg, null, 0);
        this.LLILZ = C1388190mED.LIZIZ(c19eg);
        this.LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1007));
    }
}
