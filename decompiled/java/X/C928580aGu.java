package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928580aGu extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ MultiLiveAsAnchorListDialogV2 LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;
    public final /* synthetic */ List<LinkPlayerInfo> LLILZ;
    public final /* synthetic */ List<ListByTypeResponse.ReservedUser> LLILZIL;
    public final /* synthetic */ List<LinkPlayerInfo> LLILZLL;
    public final /* synthetic */ List<LinkPlayerInfo> LLIZ;
    public final /* synthetic */ List<LinkPlayerInfo> LLIZLLLIL;
    public final /* synthetic */ List<LinkPlayerInfo> LLJ;
    public final /* synthetic */ List<ListByTypeResponse.GiftScoreAppliedUser> LLJI;
    public final /* synthetic */ List<ListByTypeResponse.ChatGroupInfo> LLJIJIL;
    public final /* synthetic */ List<LinkPlayerInfo> LLJILJIL;
    public final /* synthetic */ List<LinkPlayerInfo> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C928580aGu(MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2, C013C c013c, Boolean bool, List<? extends LinkPlayerInfo> list, List<ListByTypeResponse.ReservedUser> list2, List<? extends LinkPlayerInfo> list3, List<? extends LinkPlayerInfo> list4, List<? extends LinkPlayerInfo> list5, List<? extends LinkPlayerInfo> list6, List<ListByTypeResponse.GiftScoreAppliedUser> list7, List<ListByTypeResponse.ChatGroupInfo> list8, List<? extends LinkPlayerInfo> list9, List<? extends LinkPlayerInfo> list10) {
        super(1);
        this.LL = multiLiveAsAnchorListDialogV2;
        this.LLILLJJLI = c013c;
        this.LLILLL = bool;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = list3;
        this.LLIZ = list4;
        this.LLIZLLLIL = list5;
        this.LLJ = list6;
        this.LLJI = list7;
        this.LLJIJIL = list8;
        this.LLJILJIL = list9;
        this.LLJILJILJ = list10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LL;
            boolean z = this.LLILLJJLI.element;
            this.LLILLL.booleanValue();
            multiLiveAsAnchorListDialogV2.LLJLLL(z, null, null, null, null, this.LLILZ, null, null, null, null, null);
        } else {
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22 = this.LL;
            boolean z2 = this.LLILLJJLI.element;
            List<ListByTypeResponse.ReservedUser> list = this.LLILZIL;
            List<LinkPlayerInfo> list2 = this.LLILZLL;
            List<LinkPlayerInfo> list3 = this.LLIZ;
            List<LinkPlayerInfo> list4 = this.LLIZLLLIL;
            this.LLILLL.booleanValue();
            multiLiveAsAnchorListDialogV22.LLJLLL(z2, list, list2, list3, list4, this.LLILZ, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ);
        }
        return Unit.LIZ;
    }
}
