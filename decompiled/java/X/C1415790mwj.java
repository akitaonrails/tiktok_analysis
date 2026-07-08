package X;

import Y.AsS49S0100000_22;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415790mwj implements InterfaceC1415800mwk {
    public AsS49S0100000_22 LIZIZ;
    public InterfaceC1408730mlL LIZJ;
    public int LIZ = -1;
    public int LIZLLL = Integer.MAX_VALUE;
    public int LJ = -1;

    @Override // X.InterfaceC1415800mwk
    public final void LIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        AsS49S0100000_22 asS49S0100000_22 = this.LIZIZ;
        if (asS49S0100000_22 != null) {
            viewOnAttachStateChangeListenerC20604515jv.removeOnScrollListener(asS49S0100000_22);
        }
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = Integer.MAX_VALUE;
        this.LJ = -1;
    }

    @Override // X.InterfaceC1415800mwk
    public final int LIZIZ(List<C1408710mlJ> list) {
        C1408710mlJ next;
        int iIntValue;
        Image image;
        Integer viewWidth;
        Iterator<C1408710mlJ> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LLILZLL != null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1408710mlJ c1408710mlJ = next;
        if (c1408710mlJ != null && (image = c1408710mlJ.LLILZLL) != null && (viewWidth = image.getViewWidth()) != null) {
            iIntValue = viewWidth.intValue();
        } else {
            iIntValue = 40;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        if (iLIZIZ < 1) {
            iLIZIZ = 1;
        }
        int iLIZLLL = C958103op.LIZLLL() / iLIZIZ;
        if (iLIZLLL < 1) {
            return 1;
        }
        return iLIZLLL;
    }

    @Override // X.InterfaceC1415800mwk
    public final void LIZJ(List list, final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        Iterator it2 = ((ArrayList) list).iterator();
        final int i = 0;
        while (it2.hasNext()) {
            if (((C1408710mlJ) it2.next()).LLILLJJLI) {
                if (i >= 0 && i != this.LIZ) {
                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new Runnable() { // from class: X.01j3
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SingleLineHorizontalScrollController@25a9.onItemsBound$1");
                            try {
                                viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(i);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SingleLineHorizontalScrollController@25a9.onItemsBound$1");
                        }
                    });
                    this.LIZ = i;
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.InterfaceC1415800mwk
    public final void LIZLLL(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C1415770mwh c1415770mwh, C1408720mlK c1408720mlK) {
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
        c1415770mwh.getClass();
        viewOnAttachStateChangeListenerC20604515jv.setClipToPadding(false);
        viewOnAttachStateChangeListenerC20604515jv.setClipChildren(false);
        viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
        viewOnAttachStateChangeListenerC20604515jv.setPadding(c1415770mwh.LIZIZ, c1415770mwh.LIZ, c1415770mwh.LIZJ, 0);
        this.LIZJ = c1408720mlK;
        if (this.LIZIZ == null) {
            AsS49S0100000_22 asS49S0100000_22 = new AsS49S0100000_22(this, 0);
            this.LIZIZ = asS49S0100000_22;
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(asS49S0100000_22);
        }
    }
}
