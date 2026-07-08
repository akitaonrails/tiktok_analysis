package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.android.livesdk.rank.api.BoardsPermissionChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xKN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814850xKN extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ LiveBoardsPageDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814850xKN(LiveBoardsPageDialogFragment liveBoardsPageDialogFragment) {
        super(1);
        this.LL = liveBoardsPageDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        boolean zLJFF;
        boolean z;
        C062P<InterfaceC111300bX> c062p2 = c062p;
        LiveBoardsPageDialogFragment liveBoardsPageDialogFragment = this.LL;
        String str = liveBoardsPageDialogFragment.LLILLJJLI;
        boolean zRR = liveBoardsPageDialogFragment.RR();
        LiveBoardsPageDialogFragment liveBoardsPageDialogFragment2 = this.LL;
        String str2 = liveBoardsPageDialogFragment2.LLILLL;
        String str3 = liveBoardsPageDialogFragment2.LLILZ;
        DataChannel dataChannel = liveBoardsPageDialogFragment2.dataChannel;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(BoardsPermissionChannel.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        C758470Tp7 c758470Tp7LIZ = C758510TpB.LIZ();
        if (c758470Tp7LIZ != null) {
            z = c758470Tp7LIZ.LIZIZ;
        } else {
            z = false;
        }
        c062p2.LIZ = new C1781580wSi(str, str2, str3, zRR, zLJFF, z);
        return Unit.LIZ;
    }
}
