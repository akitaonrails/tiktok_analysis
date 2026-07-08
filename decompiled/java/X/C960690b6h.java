package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0b6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960690b6h extends C09AY implements Function1<Object, Boolean> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C960690b6h(long j, long j2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        long id;
        boolean z = false;
        if (obj instanceof C955590ayT) {
            C955590ayT c955590ayT = (C955590ayT) obj;
            long j = this.LL;
            long j2 = this.LLILLJJLI;
            User owner = c955590ayT.LJ.getOwner();
            if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            if (id == j) {
                if (j2 == 0) {
                    RivalExtraInfo rivalExtraInfo = c955590ayT.LJIIJ;
                    if (rivalExtraInfo != null) {
                        rivalExtraInfo.inviteBlockReason = 0;
                    }
                    c955590ayT.LJIIJJI = false;
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
