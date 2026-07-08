package X;

import com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailFragmentV2;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragment;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: renamed from: X.0ma8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401780ma8 extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C1401780ma8 c1401780ma8) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((PhotoDetailFragmentV2) c1401780ma8.l0, null), "source_default_key", C1344550l5p.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(AFwS259S0000000_21.get$arr$(91));
        }
    }

    public static final void LIZIZ$1(C1401780ma8 c1401780ma8) {
        ((PollCreateFragment) c1401780ma8.l0).closePanel();
    }

    public static final void LIZIZ$2(C1401780ma8 c1401780ma8) {
        ((FriendsTextPublishKeyboardFragment) c1401780ma8.l0).dismiss();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401780ma8(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
