package X;

import X.InterfaceC919320a1y;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.0ai1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC945390ai1<T extends InterfaceC919320a1y> extends C0JSV<T> {
    public DataChannel dataChannel;
    public IMessageManager mMessageManager;
    public C0UO0 transformer;

    public <D> C0TCG<D> activityAutoDispose() {
        return C11RD.LJ((LifecycleOwner) ((InterfaceC919320a1y) this.mView).getContext());
    }

    public <D> C0TCG<D> activityAutoDisposeWithTransformer() {
        if (this.transformer == null) {
            this.transformer = new C0UO0();
        }
        LifecycleOwner lifeLifecycleOwner = getLifeLifecycleOwner();
        if (lifeLifecycleOwner == null) {
            return null;
        }
        return C11RD.LIZ(C11RB.LIZJ(lifeLifecycleOwner, Lifecycle.Event.ON_DESTROY), this.transformer);
    }

    public <D> C0TCG<D> autoDispose() {
        return C11RD.LJ((LifecycleOwner) this.mView);
    }

    public <D> C0TCG<D> autoDisposeWithTransformer() {
        if (this.transformer == null) {
            this.transformer = new C0UO0();
        }
        return C11RD.LIZ(C11RB.LIZJ((LifecycleOwner) this.mView, Lifecycle.Event.ON_DESTROY), this.transformer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0JSV
    public void detachView() {
        IMessageManager iMessageManager;
        if ((this instanceof OnMessageListener) && (iMessageManager = this.mMessageManager) != null) {
            iMessageManager.removeMessageListener((OnMessageListener) this);
        }
        this.dataChannel = null;
        super.detachView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleOwner getLifeLifecycleOwner() {
        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
        if (interfaceC919320a1y == 0) {
            return null;
        }
        if (interfaceC919320a1y instanceof Widget) {
            Fragment detailSafRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getDetailSafRootFragment(((Widget) interfaceC919320a1y).widgetCallback.getFragment());
            if (detailSafRootFragment != null) {
                return detailSafRootFragment;
            }
        }
        Context context = interfaceC919320a1y.getContext();
        if (C497280Jeo.LIZ || C464660IKa.LIZ()) {
            return C520010KaN.LJJIFFI(context, false);
        }
        if (context instanceof LifecycleOwner) {
            return (LifecycleOwner) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Object baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof LifecycleOwner) {
            return (LifecycleOwner) baseContext;
        }
        return null;
    }

    public String getLogTag() {
        return getClass().getName();
    }

    @Override // X.C0JSV
    public void attachView(T t) {
        super.attachView(t);
        if (t != null) {
            DataChannel dataChannelProvideDataChannel = t.provideDataChannel();
            this.dataChannel = dataChannelProvideDataChannel;
            if (dataChannelProvideDataChannel != null) {
                this.mMessageManager = (IMessageManager) dataChannelProvideDataChannel.gg0(C776250Uch.class);
            }
        }
    }

    public final void logThrowable(Throwable th) {
        C20441214yg.LJIIJ(6, getLogTag(), th.getStackTrace());
    }
}
