package X;

import Y.ARunnableS43S0101000_32;
import android.content.ComponentCallbacks2;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListItemAnimator;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18ZE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18ZE extends AbstractC1664490tPr<C904980Zeq, C905000Zes> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C01GW LLJJJIL = C1509305vX.LIZ(new AwS576S0100000_32(this, 516));
    public volatile C1807750x8v LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18ZE.class, "messageListItemAnimatorFactory", "getMessageListItemAnimatorFactory()Lcom/ss/android/ugc/aweme/im/messagelist/ui/MessageListItemAnimatorFactory;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final ViewOnAttachStateChangeListenerC20604515jv LLLLLJIL() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJIL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C19EG c19eg;
        super.onActivityCreated(bundle);
        View view = null;
        C1196320hEk.LIZIZ(LLLLLJIL(), C1558360qeg.LJ(LLLLLJIL(), null));
        ComponentCallbacks2 componentCallbacks2 = this.mActivity;
        if (componentCallbacks2 instanceof C19EG) {
            c19eg = (C19EG) componentCallbacks2;
        } else {
            c19eg = null;
        }
        if (componentCallbacks2 instanceof InterfaceC1563380qmm) {
            ((InterfaceC1563380qmm) componentCallbacks2).LLLIIL(EnumC682280QpW.MAIN, new AwS433S0200000_32(this, c19eg, 48));
        } else {
            LLLLLJIL().setLifecycleOwner(new C18ZH(c19eg, this, LLLLLJIL()));
        }
        InterfaceC1631630sYr<View, ViewOnAttachStateChangeListenerC20604515jv, LifecycleOwner, ViewModelStoreOwner, Unit> interfaceC1631630sYr = LLLLIL().LIZ;
        Scene sceneLIZ = C565530MFz.LIZ(this);
        if (sceneLIZ != null) {
            view = sceneLIZ.mView;
        }
        interfaceC1631630sYr.invoke(view, LLLLLJIL(), this, this);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJIL = LLLLLJIL();
        if (this.LLJJJJ == null) {
            synchronized (this) {
                if (this.LLJJJJ == null) {
                    this.LLJJJJ = (C1807750x8v) C1807670x8n.LLLLIL();
                }
            }
        }
        viewOnAttachStateChangeListenerC20604515jvLLLLLJIL.setItemAnimator(new MessageListItemAnimator(this, LLLLLJIL(), false, new InterfaceC459890I1r() { // from class: X.18ZG
            @Override // X.InterfaceC459890I1r
            public final void LIZ(String str, Rect rect) {
            }

            @Override // X.InterfaceC459890I1r
            public final Rect LIZIZ(String str) {
                return null;
            }

            @Override // X.InterfaceC459890I1r
            public final boolean LIZJ(RecyclerView.ViewHolder viewHolder) {
                return false;
            }
        }, new C0I91(false)));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C300220Bpk.LIZ()) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJIL = LLLLLJIL();
            viewOnAttachStateChangeListenerC20604515jvLLLLLJIL.LL.LLLJ(new C0Q9R() { // from class: X.18ZF
                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    if (i >= i2 - 1) {
                        HandlerHook.viewPost(this.LIZ.LLLLLJIL(), new ARunnableS43S0101000_32(i, this.LIZ, 4));
                    }
                }
            });
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bg6, viewGroup, false);
    }
}
