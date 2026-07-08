package X;

import X.AbstractC1397700mTY;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;

/* JADX INFO: renamed from: X.0mTX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractDialogInterfaceC1397690mTX<T extends AbstractC1397700mTY<T, ?>> implements DialogInterface {
    public final C1397600mTO LL;
    public final Context LLILLJJLI;
    public final InterfaceC1196790hFV LLILLL;
    public final DialogInterface.OnDismissListener LLILZ;
    public final DialogInterface.OnCancelListener LLILZIL;
    public final DialogInterface.OnShowListener LLILZLL;
    public Object LLIZ;

    public abstract Dialog LIZJ();

    @Override // android.content.DialogInterface
    public final void dismiss() {
        LIZIZ(null);
    }

    public final Dialog LJ() {
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJIL(this);
        C786410Ut5.B4(LIZJ());
        return LIZJ();
    }

    public final void LIZ() {
        Window window;
        LIZJ().setOnDismissListener(new DialogInterfaceOnDismissListenerC1402040maY(this, 7));
        LIZJ().setOnCancelListener(new DialogInterfaceOnCancelListenerC1401970maR(this, 9));
        if (this.LLILZLL != null) {
            LIZJ().setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: X.0mTZ
                public final /* synthetic */ AbstractDialogInterfaceC1397690mTX<AbstractC1397700mTY<Object, ?>> LL;

                {
                    this.LL = this;
                }

                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    AbstractDialogInterfaceC1397690mTX<AbstractC1397700mTY<Object, ?>> abstractDialogInterfaceC1397690mTX = this.LL;
                    abstractDialogInterfaceC1397690mTX.LLILZLL.onShow(abstractDialogInterfaceC1397690mTX);
                }
            });
        }
        InterfaceC1196790hFV interfaceC1196790hFV = this.LLILLL;
        if (interfaceC1196790hFV == null || (window = LIZJ().getWindow()) == null) {
            return;
        }
        WindowCallbackC1196760hFS windowCallbackC1196760hFS = new WindowCallbackC1196760hFS(window.getCallback());
        windowCallbackC1196760hFS.LLILLJJLI = interfaceC1196790hFV;
        window.setCallback(windowCallbackC1196760hFS);
    }

    public final void LIZLLL() {
        C1389610mGV.LIZIZ(LIZJ());
        C786410Ut5.B4(LIZJ());
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJIL(this);
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        LIZJ().cancel();
    }

    public AbstractDialogInterfaceC1397690mTX(T t) {
        float f = C1397600mTO.LJJII;
        this.LL = new C1397600mTO(t.LIZ);
        this.LLILLJJLI = t.LIZ;
        this.LLILLL = t.LJI;
        this.LLILZ = t.LIZLLL;
        this.LLILZIL = t.LJ;
        this.LLILZLL = t.LJFF;
    }

    public final void LIZIZ(Object obj) {
        this.LLIZ = obj;
        try {
            C786410Ut5.LIZIZ(LIZJ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
