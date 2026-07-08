package X;

import Y.ARunnableS115S0100000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940930aap extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public boolean LLJI;
    public C941290abP LLJIJIL;

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.hwm);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        super.onAttachedToWindow();
        this.LLJI = true;
        C930540aK4.LJJJ(this, new ARunnableS115S0100000_15(this, 203));
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLJ.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null) {
            return;
        }
        getCompositeDisposable().LIZ(C937310aUz.LJI(new C11IW(C11NZ.LJIIL(C937310aUz.LIZ(c938230aWTLIZJ.LIZ), C937310aUz.LIZ(c938230aWTLIZJ.LJIILIIL), c938230aWTLIZJ.LIZJ.LJJIFFI(), c938230aWTLIZJ.LJ.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0aXV
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return C13BV.INSTANCE;
                }
                return C1697810uHb.LJIILJJIL(Long.valueOf(((C2262071DgL) C13LP.LJJJJZI(list)).getId()));
            }
        }).LJJII(new InterfaceC1627390sS1() { // from class: X.0aaq
            @Override // X.InterfaceC1627390sS1
            public final boolean test(Object obj, Object obj2) {
                return Intrinsics.LJFF(C13LP.LJJJLL((List) obj), C13LP.LJJJLL((List) obj2));
            }
        }), new InterfaceC941150abB<T1, T2, T3, T4, R>() { // from class: X.0ab9
            @Override // X.InterfaceC941150abB
            public final R LIZ(T1 t1, T2 t2, T3 t3, T4 t4) {
                return (R) new C11H6(t1, t2, t3, t4);
            }
        }).LJJIJIIJIL(new AfS184S0100000_15(this, 230))), getRealTag(), "combineLatest").LJIILL().LJIIZILJ());
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJI = false;
        C941290abP c941290abP = this.LLJIJIL;
        if (c941290abP != null) {
            c941290abP.LIZLLL = true;
        }
        this.LLJIJIL = null;
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.VOICE_BORDER;
    }

    public C940930aap(Context context, C957020b0m c957020b0m, DataChannel dataChannel, WeakReference weakReference) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
    }
}
