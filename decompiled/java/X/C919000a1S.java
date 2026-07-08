package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS49S0500000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a1S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C919000a1S extends C2217421BqW implements Function2<C928720aH8, Function1<? super Boolean, ? extends Unit>, Unit> {
    public C919000a1S(Object obj) {
        super(2, obj, MultiLiveAsAnchorListDialogV2.class, "onRecentJoinedInviteAllClicked", "onRecentJoinedInviteAllClicked(Lcom/bytedance/android/live/liveinteract/multiguestv3/main/userinfo/anchor/model/MultiGuestRecentJoinedItem;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C928720aH8 c928720aH8, Function1<? super Boolean, ? extends Unit> function1) {
        C928720aH8 c928720aH82 = c928720aH8;
        Function1<? super Boolean, ? extends Unit> function12 = function1;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        multiLiveAsAnchorListDialogV2.getClass();
        List<LinkPlayerInfo> list = c928720aH82.LIZ;
        AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(multiLiveAsAnchorListDialogV2, c928720aH82, 122);
        AwS629S0100000_15 awS629S0100000_15 = new AwS629S0100000_15(multiLiveAsAnchorListDialogV2, 99);
        if (list.isEmpty()) {
            function12.invoke(Boolean.FALSE);
        } else {
            ArrayList arrayList = new ArrayList();
            for (LinkPlayerInfo linkPlayerInfo : list) {
                if (linkPlayerInfo.mUser.getId() > 0) {
                    arrayList.add(linkPlayerInfo);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList<LinkPlayerInfo> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(Long.valueOf(((LinkPlayerInfo) obj).mUser.getId()))) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                function12.invoke(Boolean.FALSE);
            } else {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (LinkPlayerInfo linkPlayerInfo2 : arrayList2) {
                    arrayList3.add(new C916860Zy0(linkPlayerInfo2.mUser.getId(), linkPlayerInfo2.LJII));
                }
                C918380a0S c918380a0SLIZ = C918390a0T.LIZ(arrayList3);
                C919020a1U c919020a1U = null;
                C915880ZwQ c915880ZwQ = new C915880ZwQ(null, false, 7);
                C918360a0Q c918360a0Q = new C918360a0Q(1, null, new AwS594S0100000_15(function12, (Function1<? super PosIdentity, Unit>) 1160), new AwS49S0500000_15(awS416S0200000_15, function12, arrayList2, multiLiveAsAnchorListDialogV2, awS629S0100000_15, 1));
                AbstractC921450a5P abstractC921450a5P = multiLiveAsAnchorListDialogV2.LLJIJIL;
                if (abstractC921450a5P != null) {
                    c919020a1U = new C919020a1U(abstractC921450a5P);
                }
                C918350a0P c918350a0P = new C918350a0P(c918380a0SLIZ, c915880ZwQ, c918360a0Q, new C918370a0R(Collections.singletonList(new C918760a14(c919020a1U, "invite_all_recent_guest")), 2));
                AbstractC921450a5P abstractC921450a5P2 = multiLiveAsAnchorListDialogV2.LLJIJIL;
                if (abstractC921450a5P2 != null) {
                    abstractC921450a5P2.LJJJLIIL(c918350a0P);
                    multiLiveAsAnchorListDialogV2.r = true;
                } else {
                    function12.invoke(Boolean.FALSE);
                }
            }
        }
        return Unit.LIZ;
    }
}
