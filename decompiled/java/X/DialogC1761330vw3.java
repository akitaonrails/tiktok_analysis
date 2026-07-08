package X;

import Y.ARunnableS37S0101000_26;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.dependency.share.ShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vw3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class DialogC1761330vw3 extends DialogC1761350vw5 implements InterfaceC21650419oE, InterfaceC1763860w08 {
    public final boolean LLJ;
    public final C01GW LLJI;
    public InterfaceC1761420vwC LLJIJIL;
    public InterfaceC1761410vwB LLJILJIL;
    public final List<InterfaceC1761400vwA> LLJILJILJ;
    public boolean LLJILLL;
    public final BPEAHandler LLJJ;
    public boolean LLJJI;
    public final C1761360vw6 LLJJIII;
    public final C01GW LLJJIJI;

    @Override // X.InterfaceC21650419oE
    public final void kG(float f, int i) {
    }

    @Override // X.InterfaceC21650419oE
    public final void xP(int i) {
    }

    public final C1763120vyw LJJLL() {
        return (C1763120vyw) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1763860w08
    public final void Bz() {
        dismiss();
        C785410UrT.LIZ(this);
    }

    public final boolean LJJZ() {
        IECommerceHostService iECommerceHostService;
        C928103jz top;
        Context context;
        Activity activityLIZ;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        return (rootPageMonitor == null || (top = rootPageMonitor.getTop()) == null || (context = top.LIZ) == null || (activityLIZ = C1388190mED.LIZ(context)) == null || Intrinsics.LJFF(activityLIZ, C1388190mED.LIZ(getContext()))) ? false : true;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        AnonymousClass0317 anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin;
        Activity.ScreenCaptureCallback screenCaptureCallback;
        super.onStart();
        if (Build.VERSION.SDK_INT >= 34) {
            Object value = this.LLJJIJI.getValue();
            if ((value instanceof Activity.ScreenCaptureCallback) && (screenCaptureCallback = (Activity.ScreenCaptureCallback) value) != null) {
                Executor executorLIZJ = C838410Wul.LIZJ(getContext());
                Activity activityLIZ = C1388190mED.LIZ(getContext());
                if (activityLIZ != null) {
                    activityLIZ.registerScreenCaptureCallback(executorLIZJ, screenCaptureCallback);
                }
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = ShareDependencyService.createIShareDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IShareDependencyService.class.getName(), anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IShareDependencyService.class);
        }
        ((IShareDependencyService) anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin).addScreenShotListener(this.LLJJIII);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        AnonymousClass0317 anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin;
        Activity.ScreenCaptureCallback screenCaptureCallback;
        Activity activityLIZ;
        super.onStop();
        if (Build.VERSION.SDK_INT >= 34) {
            Object value = this.LLJJIJI.getValue();
            if ((value instanceof Activity.ScreenCaptureCallback) && (screenCaptureCallback = (Activity.ScreenCaptureCallback) value) != null && (activityLIZ = C1388190mED.LIZ(getContext())) != null) {
                activityLIZ.unregisterScreenCaptureCallback(screenCaptureCallback);
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = ShareDependencyService.createIShareDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IShareDependencyService.class.getName(), anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IShareDependencyService.class);
        }
        ((IShareDependencyService) anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin).removeScreenShotListener(this.LLJJIII);
    }

    @Override // X.InterfaceC1763860w08
    public final void D6(int i) {
        this.LLILLL = true;
        this.LL.scrollToPosition(i);
        this.LL.smoothScrollBy(0, 0);
    }

    @Override // X.DialogC1761350vw5
    public final void LJJLIIIJLLLLLLLZ(int i) {
        boolean zLJI = MethodIDManager.LJI(72065);
        Iterator<InterfaceC1761400vwA> it2 = this.LLJILJILJ.iterator();
        while (it2.hasNext()) {
            it2.next().onPageSelected(i);
        }
        if (LJJLL().LLJJ) {
            HandlerHook.viewPost(this.LL, new ARunnableS37S0101000_26(this, i, 8));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJJLJ(InterfaceC1761370vw7 interfaceC1761370vw7) {
        ((ArrayList) this.LLIZLLLIL).add(interfaceC1761370vw7);
    }

    public final void LJJLJLI(InterfaceC1761400vwA interfaceC1761400vwA) {
        ((ArrayList) this.LLJILJILJ).add(interfaceC1761400vwA);
    }

    public final void LJJZZI(List list) {
        LJJLL().LLJ = list;
        LJJLL().notifyDataSetChanged();
    }

    @Override // X.InterfaceC21650419oE
    public final void gA(int i) {
        if (i == 2) {
            Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1761370vw7) it2.next()).LJFF();
            }
        }
    }

    @Override // X.DialogC1761350vw5, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC1761420vwC interfaceC1761420vwC = this.LLJIJIL;
        if (interfaceC1761420vwC != null) {
            interfaceC1761420vwC.onShow();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0vw6] */
    public DialogC1761330vw3(Context context, boolean z) {
        super(context);
        this.LLJ = z;
        this.LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1456));
        this.LLJILJILJ = new ArrayList();
        this.LLJJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJJIII = new AbstractC1389240mFu() { // from class: X.0vw6
            @Override // X.AbstractC1389240mFu
            public final boolean LIZ(String str) {
                InterfaceC1761410vwB interfaceC1761410vwB;
                if (this.LIZ.LJJZ() || (interfaceC1761410vwB = this.LIZ.LLJILJIL) == null || !interfaceC1761410vwB.LIZ(str)) {
                    return false;
                }
                return true;
            }
        };
        this.LLJJIJI = C452501pT.LIZIZ(new C1761380vw8(this));
        C1763120vyw c1763120vywLJJLL = LJJLL();
        this.LLILZ = c1763120vywLJJLL;
        this.LL.setAdapter(c1763120vywLJJLL);
        AbstractC1763150vyz<?> abstractC1763150vyz = this.LLILZ;
        if (abstractC1763150vyz != null) {
            abstractC1763150vyz.LLILLL = new InterfaceC21650419oE() { // from class: X.0vw4
                @Override // X.InterfaceC21650419oE
                public final void xP(int i) {
                }

                @Override // X.InterfaceC21650419oE
                public final void gA(int i) {
                    if (i == 0) {
                        this.LJJLIIIJLLLLLLLZ(((LinearLayoutManager) this.LL.getLayoutManager()).findFirstCompletelyVisibleItemPosition());
                    } else {
                        if (i != 2) {
                            return;
                        }
                        DialogC1761350vw5 dialogC1761350vw5 = this;
                        dialogC1761350vw5.dismiss();
                        C785410UrT.LIZ(dialogC1761350vw5);
                    }
                }

                @Override // X.InterfaceC21650419oE
                public final void kG(float f, int i) {
                    this.LLILLJJLI.getBackground().setAlpha((int) (255 * f));
                    Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1761370vw7) it2.next()).setAlpha(f);
                    }
                }
            };
        }
    }

    public final void LJJZZIII(int i, Rect rect) {
        int size;
        if (((ArrayList) this.LLIZLLLIL).isEmpty()) {
            ((ArrayList) this.LLIZLLLIL).add(new C1761270vvx());
        }
        for (InterfaceC1761370vw7 interfaceC1761370vw7 : (ArrayList) this.LLIZLLLIL) {
            if (!this.LLJILLL) {
                interfaceC1761370vw7.LJII(this.LLILLJJLI, this);
            }
            List<? extends AbstractC1763110vyv> list = LJJLL().LLJ;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            interfaceC1761370vw7.onShow(size);
        }
        if (!isShowing()) {
            AbstractC1763150vyz<?> abstractC1763150vyz = this.LLILZ;
            if (abstractC1763150vyz != null && i < abstractC1763150vyz.getItemCount()) {
                this.LL.scrollToPosition(i);
                AbstractC1763150vyz<?> abstractC1763150vyz2 = this.LLILZ;
                if (abstractC1763150vyz2 != null && i < abstractC1763150vyz2.getItemCount()) {
                    abstractC1763150vyz2.LL = true;
                    abstractC1763150vyz2.getClass();
                    abstractC1763150vyz2.LLILLJJLI = rect;
                }
                show();
                C785410UrT.LIZIZ(this);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(this);
                C816490W1f.LIZ(this);
            } else {
                show();
                C785410UrT.LIZIZ(this);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(this);
                C816490W1f.LIZ(this);
            }
        }
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1761370vw7) it2.next()).onPageSelected(i);
        }
    }
}
