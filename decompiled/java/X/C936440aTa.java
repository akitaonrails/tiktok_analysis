package X;

import Y.AfS184S0100000_15;
import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aTa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936440aTa extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public C16FV LLJI;
    public Integer LLJIJIL;

    /* JADX INFO: renamed from: getLayoutId, reason: collision with other method in class */
    public Void m40getLayoutId() {
        return null;
    }

    @Override // X.AbstractC939840aZ4
    public /* bridge */ /* synthetic */ Integer getLayoutId() {
        return (Integer) m40getLayoutId();
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutIdLazy() {
        return Integer.valueOf(R.layout.htm);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<Integer>> c11pq;
        super.onAttachedToWindow();
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLJ.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null || (c11pq = c938230aWTLIZJ.LIZLLL) == null) {
            return;
        }
        getCompositeDisposable().LIZ(new C11IW(C937310aUz.LIZ(c11pq).LJJIJIIJIL(new AfS184S0100000_15(this, 242))).LJIILL().LJIIZILJ());
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.NETWORK;
    }

    @Override // X.AbstractC939840aZ4
    public Integer getExternalHiddenViewWidth() {
        return this.LLJIJIL;
    }

    public final C16FV LJIIIZ(boolean z) {
        C16FV c16fv;
        C16FV c16fv2 = this.LLJI;
        if (c16fv2 == null) {
            c16fv2 = null;
            if (z && (c16fv = (C16FV) LJI(R.id.lpm)) != null) {
                this.LLJI = c16fv;
                return c16fv;
            }
        }
        return c16fv2;
    }

    public final void LJIIJ(List<Integer> list) {
        int i;
        EnumC920860a4S enumC920860a4SLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("networkStateOptional:");
        sbLIZ.append(C13LP.LJJJLL(list));
        sbLIZ.append(" externalVisibilityType:");
        sbLIZ.append(getExternalHiddenViewWidth());
        C937310aUz.LJII("NetworkBizViewElement", C2188811AlT.LIZIZ(sbLIZ));
        if (getExternalHiddenViewWidth() == null && !list.isEmpty()) {
            Integer num = (Integer) C13LP.LJJJLL(list);
            if (num != null && (enumC920860a4SLIZ = C920900a4W.LIZ(num.intValue())) != null) {
                i = C920880a4U.LIZ[enumC920860a4SLIZ.ordinal()];
            } else {
                i = -1;
            }
            if (i != 1) {
                if (i != 2) {
                    C16FV c16fvLJIIIZ = LJIIIZ(false);
                    if (c16fvLJIIIZ != null) {
                        C917650ZzH.LJ(c16fvLJIIIZ);
                        return;
                    } else {
                        C439101nJ.LJI(this);
                        return;
                    }
                }
                C12ES.LJIILL(0, this);
                C16FV c16fvLJIIIZ2 = LJIIIZ(true);
                if (c16fvLJIIIZ2 != null) {
                    C917650ZzH.LJFF(c16fvLJIIIZ2);
                }
                C16FV c16fvLJIIIZ3 = LJIIIZ(true);
                if (c16fvLJIIIZ3 == null) {
                    return;
                }
                c16fvLJIIIZ3.setImageResource(R.drawable.ep7);
                return;
            }
            C12ES.LJIILL(0, this);
            C16FV c16fvLJIIIZ4 = LJIIIZ(true);
            if (c16fvLJIIIZ4 != null) {
                C917650ZzH.LJFF(c16fvLJIIIZ4);
            }
            C16FV c16fvLJIIIZ5 = LJIIIZ(true);
            if (c16fvLJIIIZ5 == null) {
                return;
            }
            c16fvLJIIIZ5.setImageResource(R.drawable.ep6);
            return;
        }
        C439101nJ.LJI(this);
    }

    @Override // X.AbstractC939840aZ4
    public void setExternalHiddenViewWidth(Integer num) {
        C938220aWS c938220aWS;
        String str;
        C11PQ<List<Integer>> c11pq;
        List<Integer> listLJLZ;
        Integer num2 = this.LLJIJIL;
        this.LLJIJIL = num;
        if (!Intrinsics.LJFF(num2, num) && (c938220aWS = this.LLJ.get()) != null) {
            PosIdentity posIdentity = getWindow().getPosIdentity();
            if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null) {
                str = "";
            }
            C938230aWT c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false);
            if (c938230aWTLIZJ != null && (c11pq = c938230aWTLIZJ.LIZLLL) != null && (listLJLZ = c11pq.LJLZ()) != null) {
                LJIIJ(listLJLZ);
            }
        }
    }

    public C936440aTa(Context context, C957020b0m c957020b0m, DataChannel dataChannel, WeakReference weakReference) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
    }
}
