package X;

import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0a54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921240a54 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LinkPlayerInfo LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ MultiGuestAsGuestModeratorManageDialog LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C921240a54(LinkPlayerInfo linkPlayerInfo, int i, boolean z, MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog, long j, AwS559S0100000_15 awS559S0100000_15) {
        super(0);
        this.LL = linkPlayerInfo;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = multiGuestAsGuestModeratorManageDialog;
        this.LLILZIL = j;
        this.LLILZLL = awS559S0100000_15;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinkControlDataHolder linkControlDataHolder;
        this.LL.mRoleType = this.LLILLJJLI;
        if (this.LLILLL && (linkControlDataHolder = this.LLILZ.linkControlDataHolder) != null) {
            linkControlDataHolder.LIZJ(this.LLILZIL);
        }
        this.LLILZLL.invoke();
        return Unit.LIZ;
    }
}
