package Y;

import X.AbstractC1585810rMx;
import X.C013C;
import X.C01GW;
import X.C0OQG;
import X.C2252321DDq;
import X.InterfaceC904700ZeO;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.scrolltobottomindicator.ScrollToBottomIndicator;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageListAssem;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class AsS16S0300000_9 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsS16S0300000_9(Object obj, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, ScrollToBottomIndicator scrollToBottomIndicator, C01GW<? extends InterfaceC904700ZeO> c01gw) {
        this.$t = c01gw;
        this.l0 = obj;
        this.l1 = viewOnAttachStateChangeListenerC20604515jv;
        this.l2 = scrollToBottomIndicator;
    }

    public static final void LJJIIZI$0(AsS16S0300000_9 asS16S0300000_9, RecyclerView recyclerView, int i, int i2) {
        if (((C013C) asS16S0300000_9.l0).element) {
            ((List) asS16S0300000_9.l1).addAll(C0OQG.LIZ(((BulletinPageListAssem) asS16S0300000_9.l2).Go()));
        }
    }

    public static final void LJJIIZI$1(AsS16S0300000_9 asS16S0300000_9, RecyclerView recyclerView, int i, int i2) {
        ChatLinearLayoutManager chatLinearLayoutManager;
        boolean z;
        RecyclerView.LayoutManager layoutManager = ((ViewOnAttachStateChangeListenerC20604515jv) asS16S0300000_9.l0).getLayoutManager();
        if ((layoutManager instanceof ChatLinearLayoutManager) && (chatLinearLayoutManager = (ChatLinearLayoutManager) layoutManager) != null) {
            C2252321DDq c2252321DDq = ((ScrollToBottomIndicator) asS16S0300000_9.l1).LLJJJ;
            if (chatLinearLayoutManager.LJIILIIL() > 0 && ((InterfaceC904700ZeO) ((C01GW) asS16S0300000_9.l2).getValue()).LIZIZ()) {
                z = true;
            } else {
                z = false;
            }
            c2252321DDq.setValue(Boolean.valueOf(z));
        }
    }
}
