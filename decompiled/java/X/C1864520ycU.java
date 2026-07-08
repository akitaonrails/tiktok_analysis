package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaGridContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaGridContentAssem$setupPowerList$1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ycU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864520ycU extends AbstractC214823195h {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final int LJFF$0(C1864520ycU c1864520ycU, int i) {
        if (ListProtector.get(((DetailMediaGridContentAssem) c1864520ycU.l0).kp().getListItems(), i) instanceof C0ZW7) {
            return 1;
        }
        return ((DetailMediaGridContentAssem$setupPowerList$1) c1864520ycU.l1).LLILLJJLI;
    }

    public static final int LJFF$1(C1864520ycU c1864520ycU, int i) {
        List<InterfaceC1891350zJl> listLJII = ((ViewOnAttachStateChangeListenerC20604515jv) c1864520ycU.l0).getState().LJII();
        if (i >= ((ArrayList) listLJII).size()) {
            return ((GridLayoutManager) c1864520ycU.l1).LLILLJJLI;
        }
        Object obj = ListProtector.get(listLJII, i);
        if (!(obj instanceof C20605115k1) && !(obj instanceof C1157200gDe) && !(obj instanceof C1271604yI) && !(obj instanceof C1781260wSC) && !(obj instanceof C1271504yH)) {
            return 1;
        }
        return ((GridLayoutManager) c1864520ycU.l1).LLILLJJLI;
    }

    public C1864520ycU(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
