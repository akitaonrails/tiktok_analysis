package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssem;

/* JADX INFO: renamed from: X.0g4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151490g4R extends AbstractC214823195h {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public C1151490g4R(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(C1151490g4R c1151490g4R, int i) {
        Object objLJJJLZIJ;
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((GiftAnchorPanelGiftPageCenterAssem) c1151490g4R.l0).LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            objLJJJLZIJ = C13LP.LJJJLZIJ(i, state.LJII());
        } else {
            objLJJJLZIJ = null;
        }
        if (objLJJJLZIJ instanceof C1146360fwA) {
            return 4;
        }
        return 1;
    }

    public static final int LJFF$1(C1151490g4R c1151490g4R, int i) {
        if (((C1115340f88) c1151490g4R.l0).LLILLL.getItemViewType(i) == 3) {
            return ((C1115340f88) c1151490g4R.l0).LLILZIL;
        }
        return 1;
    }
}
