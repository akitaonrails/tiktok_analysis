package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCollaborativeTriggerGiftIdSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.IndexedValue;

/* JADX INFO: renamed from: X.0fU6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128960fU6 {
    public static final /* synthetic */ int LJFF = 0;
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public final C1127050fR1 LIZJ;
    public boolean LIZLLL;
    public final C1129060fUG LJ;

    public final boolean LIZ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        Long lLIZJ;
        if (abstractC1126600fQI == null) {
            return false;
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            lLIZJ = C1131540fYG.LIZJ(dataChannel);
        } else {
            lLIZJ = null;
        }
        long jLJFF = abstractC1126600fQI.LJFF();
        if (lLIZJ == null || jLJFF != lLIZJ.longValue()) {
            return false;
        }
        return true;
    }

    public final void LIZJ(long j) {
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList;
        C1127050fR1 c1127050fR1;
        C1127050fR1 c1127050fR12 = this.LIZJ;
        if (c1127050fR12 != null && (linkedList = c1127050fR12.LL) != null) {
            int i = 0;
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : linkedList) {
                if (abstractC1126600fQI != null && abstractC1126600fQI.LJFF() == j) {
                    if (i != -1 && (c1127050fR1 = this.LIZJ) != null) {
                        c1127050fR1.notifyItemChanged(i);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.0fZO] */
    public C1128960fU6(DataChannel dataChannel, C1128710fTh c1128710fTh, C1127050fR1 c1127050fR1) {
        this.LIZ = dataChannel;
        this.LIZIZ = c1128710fTh;
        this.LIZJ = c1127050fR1;
        long giftId = LiveGiftCollaborativeTriggerGiftIdSetting.INSTANCE.getGiftId();
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C1132240fZO.LIZ;
        this.LJ = new C1129060fUG(this, c259800zU, giftId, c238400w2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(long j, String str, boolean z) {
        C1127050fR1 c1127050fR1;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList;
        Object next;
        InterfaceC1126420fQ0 interfaceC1126420fQ0;
        if (j != -1 && (c1127050fR1 = this.LIZJ) != null && (linkedList = c1127050fR1.LL) != null) {
            Iterator it2 = C13LP.LLIIL(linkedList).iterator();
            while (true) {
                C717610SCx c717610SCx = (C717610SCx) it2;
                if (c717610SCx.hasNext()) {
                    next = c717610SCx.next();
                    AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) ((IndexedValue) next).LIZIZ;
                    if (abstractC1126600fQI != null && abstractC1126600fQI.LJFF() == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            IndexedValue indexedValue = (IndexedValue) next;
            if (indexedValue != null) {
                if (z) {
                    C012R.LIZ((AbstractC1126600fQI) indexedValue.LIZIZ, str);
                } else {
                    AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) indexedValue.LIZIZ;
                    if (abstractC1126600fQI2 != null) {
                        interfaceC1126420fQ0 = abstractC1126600fQI2.LJIIZILJ;
                    } else {
                        interfaceC1126420fQ0 = null;
                    }
                    if (interfaceC1126420fQ0 instanceof C012E) {
                        abstractC1126600fQI2.LJIIZILJ = null;
                    }
                }
                this.LIZJ.notifyItemChanged(indexedValue.LIZ);
            }
        }
    }
}
