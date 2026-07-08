package X;

import Y.AfS184S0100000_15;
import android.content.Context;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936450aTb extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public Integer LLJI;
    public LiveIconView LLJIJIL;

    @Override // X.AbstractC939840aZ4
    public C940610aaJ getPriority() {
        return new C940610aaJ(50, 0, 2);
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.htd);
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutIdLazy() {
        return Integer.valueOf(R.layout.htd);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        super.onAttachedToWindow();
        this.LLJIJIL = (LiveIconView) findViewById(R.id.pn2);
        if (getWindow().getShapeDescriptor().LIZ.width() >= ((int) C497740JfY.LIZIZ(64.0f))) {
            C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(12.0f), this.LLJIJIL);
            C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(12.0f), this.LLJIJIL);
        } else {
            C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(10.0f), this.LLJIJIL);
            C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(10.0f), this.LLJIJIL);
        }
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLJ.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null) {
            return;
        }
        getCompositeDisposable().LIZ(C937310aUz.LJI(new C11IW(C937310aUz.LIZ(c938230aWTLIZJ.LIZ).LJJIJIIJIL(new AfS184S0100000_15(this, 225))), getRealTag(), "audioEnabled").LJIILL().LJIIZILJ());
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.AUDIO_OFF;
    }

    @Override // X.AbstractC939840aZ4
    public Integer getExternalHiddenViewWidth() {
        return this.LLJI;
    }

    public final LiveIconView LJIIIZ(boolean z) {
        LiveIconView liveIconView;
        LiveIconView liveIconView2 = this.LLJIJIL;
        if (liveIconView2 == null) {
            liveIconView2 = null;
            if (z && (liveIconView = (LiveIconView) LJI(R.id.pn2)) != null) {
                this.LLJIJIL = liveIconView;
                return liveIconView;
            }
        }
        return liveIconView2;
    }

    public final void LJIIJ(List<Boolean> list) {
        String realTag = getRealTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audioEnabled: ");
        sbLIZ.append(list);
        C937310aUz.LJII(realTag, C2188811AlT.LIZIZ(sbLIZ));
        if ((!list.isEmpty()) && !((Boolean) C13LP.LJJJJZI(list)).booleanValue()) {
            C12ES.LJIILL(0, this);
            LiveIconView liveIconViewLJIIIZ = LJIIIZ(true);
            if (liveIconViewLJIIIZ != null) {
                C917650ZzH.LJFF(liveIconViewLJIIIZ);
            }
            if (getWindow().getShapeDescriptor().LIZ.width() >= ((int) C497740JfY.LIZIZ(64.0f))) {
                LiveIconView liveIconViewLJIIIZ2 = LJIIIZ(true);
                if (liveIconViewLJIIIZ2 != null) {
                    C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(12.0f), liveIconViewLJIIIZ2);
                }
                LiveIconView liveIconViewLJIIIZ3 = LJIIIZ(true);
                if (liveIconViewLJIIIZ3 != null) {
                    C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(12.0f), liveIconViewLJIIIZ3);
                    return;
                }
                return;
            }
            LiveIconView liveIconViewLJIIIZ4 = LJIIIZ(true);
            if (liveIconViewLJIIIZ4 != null) {
                C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(10.0f), liveIconViewLJIIIZ4);
            }
            LiveIconView liveIconViewLJIIIZ5 = LJIIIZ(true);
            if (liveIconViewLJIIIZ5 == null) {
                return;
            }
            C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(10.0f), liveIconViewLJIIIZ5);
            return;
        }
        LiveIconView liveIconViewLJIIIZ6 = LJIIIZ(false);
        if (liveIconViewLJIIIZ6 != null) {
            C917650ZzH.LJ(liveIconViewLJIIIZ6);
        } else {
            C439101nJ.LJI(this);
        }
    }

    @Override // X.AbstractC939840aZ4
    public void setExternalHiddenViewWidth(Integer num) {
        C938220aWS c938220aWS;
        String str;
        C11PQ<List<Boolean>> c11pq;
        List<Boolean> listLJLZ;
        Integer num2 = this.LLJI;
        this.LLJI = num;
        if (!Intrinsics.LJFF(num2, num) && (c938220aWS = this.LLJ.get()) != null) {
            PosIdentity posIdentity = getWindow().getPosIdentity();
            if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null) {
                str = "";
            }
            C938230aWT c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false);
            if (c938230aWTLIZJ != null && (c11pq = c938230aWTLIZJ.LIZ) != null && (listLJLZ = c11pq.LJLZ()) != null) {
                LJIIJ(listLJLZ);
            }
        }
    }

    public C936450aTb(Context context, C957020b0m c957020b0m, DataChannel dataChannel, WeakReference weakReference) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
    }
}
