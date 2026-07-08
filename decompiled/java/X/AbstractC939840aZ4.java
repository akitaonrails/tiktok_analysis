package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS559S0100000_15;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aZ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC939840aZ4 extends FrameLayout implements LifecycleOwner, InterfaceC940680aaQ {
    public final DataChannel LL;
    public C957020b0m LLILLJJLI;
    public final InterfaceC940060aZQ LLILLL;
    public final C11NJ LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;
    public View LLIZ;

    public abstract EnumC939900aZA getElementType();

    public Integer getExternalHiddenViewWidth() {
        return null;
    }

    public int getLayoutBizViewThemeMode() {
        return 0;
    }

    public abstract Integer getLayoutId();

    public Integer getLayoutIdLazy() {
        return null;
    }

    public void setExternalHiddenViewWidth(Integer num) {
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LLILZIL.getValue();
    }

    public final InterfaceC940060aZQ getLayoutManager() {
        InterfaceC940060aZQ interfaceC940060aZQ;
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue() && (interfaceC940060aZQ = this.LLILLL) != null) {
            return interfaceC940060aZQ;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LLIIJLIL() : null;
        if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) {
            return (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL;
        }
        return null;
    }

    public final int getMaxWidth() {
        int iWidth = this.LLILLJJLI.getShapeDescriptor().LIZ.width();
        int i = 0;
        if (iWidth <= 0) {
            return 0;
        }
        Object parent = getParent();
        while ((parent instanceof View) && (parent instanceof C957020b0m)) {
            View view = (View) parent;
            iWidth -= view.getPaddingStart() + view.getPaddingEnd();
            i++;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                iWidth -= marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            }
            parent = view.getParent();
            if (i > 10 || iWidth <= 0) {
                break;
            }
        }
        return iWidth;
    }

    public C940610aaJ getPriority() {
        InterfaceC940680aaQ.LJLLL.getClass();
        return C940330aZr.LIZIZ;
    }

    public final boolean LJII() {
        if (C917900Zzg.LIZ()) {
            return true;
        }
        return LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue() && this.LLILLJJLI.getShapeDescriptor().LIZIZ > 0;
    }

    public int getElementWidth() {
        return getWidth();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    public final String getRealTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutBizViewElement_");
        sbLIZ.append(getElementType());
        sbLIZ.append('_');
        PosIdentity posIdentity = this.LLILLJJLI.getPosIdentity();
        sbLIZ.append(posIdentity != null ? posIdentity.value : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutBizViewElement_");
        PosIdentity posIdentity = this.LLILLJJLI.getPosIdentity();
        sbLIZ.append(posIdentity != null ? posIdentity.value : null);
        C937310aUz.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "onAttachedToWindow");
        getLifecycleRegistry().setCurrentState(Lifecycle.State.STARTED);
        LJIIIIZZ(getLayoutId());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutBizViewElement_");
        PosIdentity posIdentity = this.LLILLJJLI.getPosIdentity();
        sbLIZ.append(posIdentity != null ? posIdentity.value : null);
        C937310aUz.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "onDetachedFromWindow");
        this.LLILZ.LJ();
        if (getLifecycleRegistry().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            Lifecycle.State currentState = getLifecycleRegistry().getCurrentState();
            Lifecycle.State state = Lifecycle.State.DESTROYED;
            if (currentState != state) {
                getLifecycleRegistry().setCurrentState(state);
            }
        }
        super.onDetachedFromWindow();
    }

    public final C11NJ getCompositeDisposable() {
        return this.LLILZ;
    }

    public DataChannel getDataChannel() {
        return this.LL;
    }

    public final InterfaceC940060aZQ getExternalLayout() {
        return this.LLILLL;
    }

    public final View getInflateView() {
        return this.LLIZ;
    }

    public final boolean getInflated() {
        return this.LLILZLL;
    }

    public final C957020b0m getWindow() {
        return this.LLILLJJLI;
    }

    public final <T extends View> T LJI(int i) {
        LJIIIIZZ(getLayoutIdLazy());
        return (T) findViewById(i);
    }

    public final void LJIIIIZZ(Integer num) {
        if (num != null) {
            num.intValue();
            if (!this.LLILZLL) {
                if (LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
                    int layoutBizViewThemeMode = getLayoutBizViewThemeMode();
                    if (layoutBizViewThemeMode != 0) {
                        if (layoutBizViewThemeMode != 1) {
                            if (layoutBizViewThemeMode == 2) {
                                this.LLILZLL = true;
                                C786410Ut5.Td(C1834150xpV.LIZJ(C786410Ut5.ne(getContext())), num.intValue(), this, true);
                                return;
                            }
                            return;
                        }
                        this.LLILZLL = true;
                        C786410Ut5.Td(C1834150xpV.LJ(C786410Ut5.ne(getContext())), num.intValue(), this, true);
                        return;
                    }
                    Context context = getContext();
                    this.LLILZLL = true;
                    this.LLIZ = C786410Ut5.Td(C786410Ut5.ne(context), num.intValue(), this, true);
                    return;
                }
                Context context2 = getContext();
                this.LLILZLL = true;
                this.LLIZ = C786410Ut5.Td(C786410Ut5.ne(context2), num.intValue(), this, true);
            }
        }
    }

    public final void setInflateView(View view) {
        this.LLIZ = view;
    }

    public final void setInflated(boolean z) {
        this.LLILZLL = z;
    }

    public final void setWindow(C957020b0m c957020b0m) {
        this.LLILLJJLI = c957020b0m;
    }

    public AbstractC939840aZ4(Context context, DataChannel dataChannel, C957020b0m c957020b0m, InterfaceC940060aZQ interfaceC940060aZQ) {
        super(context);
        this.LL = dataChannel;
        this.LLILLJJLI = c957020b0m;
        this.LLILLL = interfaceC940060aZQ;
        this.LLILZ = new C11NJ();
        this.LLILZIL = C292401Bi.LIZ(new AwS559S0100000_15(this, 1135));
    }
}
