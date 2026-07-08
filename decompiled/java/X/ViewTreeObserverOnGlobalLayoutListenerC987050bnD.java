package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import kotlin.Pair;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC987050bnD implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC987050bnD viewTreeObserverOnGlobalLayoutListenerC987050bnD) {
        WindowMaskAssem windowMaskAssem = (WindowMaskAssem) viewTreeObserverOnGlobalLayoutListenerC987050bnD.l0;
        FrameLayout frameLayout = windowMaskAssem.LLJJIJIIJIL;
        if (frameLayout != null) {
            if (frameLayout.getWidth() != windowMaskAssem.LLLJIL || frameLayout.getHeight() != windowMaskAssem.LLLJL) {
                InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
                if (interfaceC937900aVwLJIIIIZZ != null) {
                    interfaceC937900aVwLJIIIIZZ.LJJJJLL();
                }
                windowMaskAssem.LLLJIL = frameLayout.getWidth();
                windowMaskAssem.LLLJL = frameLayout.getHeight();
            }
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC987050bnD viewTreeObserverOnGlobalLayoutListenerC987050bnD) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        ViewGroup viewGroupX1 = ((MultiCoHostWidget) viewTreeObserverOnGlobalLayoutListenerC987050bnD.l0).x1();
        if (viewGroupX1 != null) {
            MultiCoHostWidget multiCoHostWidget = (MultiCoHostWidget) viewTreeObserverOnGlobalLayoutListenerC987050bnD.l0;
            if (viewGroupX1.getWidth() != multiCoHostWidget.LLJJIII || viewGroupX1.getHeight() != multiCoHostWidget.LLJJIJI) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ViewTree LayoutChange, it.width = ");
                sbLIZ.append(viewGroupX1.getWidth());
                sbLIZ.append(", it.height = ");
                sbLIZ.append(C497740JfY.LJJI(viewGroupX1.getHeight()));
                C20441214yg.LJ("MultiCoHostWidget", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                if (interfaceC954180awCLJIIIZ != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL()) != null) {
                    interfaceC937900aVwLLIIJLIL.LJJJJLL();
                }
                multiCoHostWidget.LLJJIII = viewGroupX1.getWidth();
                multiCoHostWidget.LLJJIJI = viewGroupX1.getHeight();
            }
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC987050bnD viewTreeObserverOnGlobalLayoutListenerC987050bnD) {
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = ((MultiLiveSettingDialog) viewTreeObserverOnGlobalLayoutListenerC987050bnD.l0).LLJJJIL;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC987050bnD);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC987050bnD, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        MultiLiveSettingDialog multiLiveSettingDialog = (MultiLiveSettingDialog) viewTreeObserverOnGlobalLayoutListenerC987050bnD.l0;
        MultiLiveSettingDialog.VR(multiLiveSettingDialog.LLJJJIL, new AwS559S0100000_15(multiLiveSettingDialog, 776), new AwS559S0100000_15((MultiLiveSettingDialog) viewTreeObserverOnGlobalLayoutListenerC987050bnD.l0, 777));
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC987050bnD viewTreeObserverOnGlobalLayoutListenerC987050bnD) {
        C934190aPx c934190aPx = (C934190aPx) viewTreeObserverOnGlobalLayoutListenerC987050bnD.l0;
        c934190aPx.LJIJJLI("onGlobalLayout", new Pair(Integer.valueOf(c934190aPx.getWindow().getWidth()), Integer.valueOf(((C934190aPx) viewTreeObserverOnGlobalLayoutListenerC987050bnD.l0).getWindow().getHeight())));
        C786410Ut5.C3(((C934190aPx) viewTreeObserverOnGlobalLayoutListenerC987050bnD.l0).getWindow().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC987050bnD);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC987050bnD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
