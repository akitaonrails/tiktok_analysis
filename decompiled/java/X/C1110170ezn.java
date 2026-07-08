package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ezn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110170ezn extends C1110310f01 {
    public final LifecycleOwner LJJJJZ;

    @Override // X.AbstractC1110520f0M
    public final boolean LLLI() {
        return false;
    }

    public final List<BadgeStruct> LLLJ() {
        User user;
        ArrayList arrayList = new ArrayList();
        List<BadgeStruct> listLLJLIL = LLJLIL();
        if (listLLJLIL != null || ((user = getUser()) != null && (listLLJLIL = user.getBadgeList()) != null)) {
            for (BadgeStruct badgeStruct : listLLJLIL) {
                if (badgeStruct != null && badgeStruct.badgeScene == 6) {
                    arrayList.add(badgeStruct);
                }
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final int LJIIL() {
        return C497740JfY.LJFF(R.color.a3d);
    }

    @Override // X.C1110310f01
    public final LifecycleOwner LLLIL() {
        LifecycleOwner lifecycleOwnerLLLIL = super.LLLIL();
        return lifecycleOwnerLLLIL == null ? this.LJJJJZ : lifecycleOwnerLLLIL;
    }

    public C1110170ezn(ChatMessage chatMessage) {
        super(chatMessage);
        this.LJJJJZ = null;
    }

    @Override // X.AbstractC1110160ezm, X.AbstractC1110520f0M, X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public final void LJJJJZ(C1109770ez9 c1109770ez9) {
        super.LJJJJZ(c1109770ez9);
        LLJZIJLIL(LLLJ(), c1109770ez9, 8);
    }

    @Override // X.AbstractC1110520f0M, X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public final void LJLI(C1109770ez9 c1109770ez9) {
        super.LJLI(c1109770ez9);
        LLJZIJLIL(LLLJ(), c1109770ez9, 8);
    }

    public C1110170ezn(ChatMessage chatMessage, LifecycleOwner lifecycleOwner) {
        super(chatMessage);
        this.LJJJJZ = lifecycleOwner;
    }
}
