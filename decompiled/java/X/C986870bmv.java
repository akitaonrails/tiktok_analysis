package X;

import com.bytedance.android.live.liveinteract.linkroom.toolbarsheet.MultiGuestToolAndPlayFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.MultiGuestGiftSwitchTargetDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.TemplateFragment;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0bmv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C986870bmv extends AbstractC214823195h {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            case 2:
                return LJFF$2(this, i);
            case 3:
                return LJFF$3(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public C986870bmv(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(C986870bmv c986870bmv, int i) {
        if (C13LP.LJJJLZIJ(i, ((TemplateFragment) c986870bmv.l0).LLJ.LL) instanceof C953550avB) {
            return 1;
        }
        return 2;
    }

    public static final int LJFF$1(C986870bmv c986870bmv, int i) {
        int itemViewType = ((AbstractC21673619ry) ((MultiGuestToolAndPlayFragment) c986870bmv.l0).LLL.getValue()).getItemViewType(i);
        if (itemViewType == 0) {
            return 2;
        }
        if (itemViewType != 1) {
            if (itemViewType == 2) {
                return 2;
            }
            return -1;
        }
        return 1;
    }

    public static final int LJFF$2(C986870bmv c986870bmv, int i) {
        if (C13LP.LJJJLZIJ(i, ((C969930bLb) c986870bmv.l0).LL) instanceof C953550avB) {
            return 1;
        }
        return 2;
    }

    public static final int LJFF$3(C986870bmv c986870bmv, int i) {
        int size = ((ArrayList) ((MultiGuestGiftSwitchTargetDialog) c986870bmv.l0).LLJI).size();
        int i2 = (size / 3) * 3;
        int i3 = size % 3;
        if (i3 == 0 || i < i2) {
            return 2;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                return 3;
            }
            return 2;
        }
        return 6;
    }
}
