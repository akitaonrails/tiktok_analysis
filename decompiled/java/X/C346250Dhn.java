package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Dhn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346250Dhn extends AbstractC214823195h {
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

    public static final int LJFF$0(C346250Dhn c346250Dhn, int i) {
        int itemViewType = ((C339940DUi) c346250Dhn.l0).getItemViewType(i);
        if (itemViewType == EnumC339930DUh.HEADER.ordinal()) {
            return ((GridLayoutManager) c346250Dhn.l1).LLILLJJLI;
        }
        if (itemViewType != EnumC339930DUh.DRAFT.ordinal() && itemViewType == EnumC339930DUh.FOOTER.ordinal()) {
            return ((GridLayoutManager) c346250Dhn.l1).LLILLJJLI;
        }
        return 1;
    }

    public static final int LJFF$1(C346250Dhn c346250Dhn, int i) {
        List<InterfaceC1891350zJl> listLJII = ((ViewOnAttachStateChangeListenerC20604515jv) c346250Dhn.l0).getState().LJII();
        int headerCount = ((ViewOnAttachStateChangeListenerC20604515jv) c346250Dhn.l0).getHeaderCount();
        if (i < headerCount) {
            return ((WrapGridLayoutManager) c346250Dhn.l1).LLILLJJLI;
        }
        if (i >= headerCount + ((ArrayList) listLJII).size()) {
            return ((WrapGridLayoutManager) c346250Dhn.l1).LLILLJJLI;
        }
        return 1;
    }

    public C346250Dhn(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
