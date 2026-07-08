package Y;

import X.C0SPV;
import X.C13BV;
import X.C1600750rl3;
import X.C1618440sDa;
import X.C1847707Ln;
import X.C19EG;
import X.C2189821An6;
import X.C720800SPe;
import X.C724240Sb0;
import X.C724270Sb3;
import X.DialogInterfaceOnDismissListenerC738790SyT;
import X.EnumC1260930iux;
import X.InterfaceC1597970rgZ;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.mutual.IMutualRelationService;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationServiceImpl;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p0.StoryRelationLabelInfoComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ACListenerS48S0400000_11 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$0(Y.ACListenerS48S0400000_11 r13, android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS48S0400000_11.onClick$0(Y.ACListenerS48S0400000_11, android.view.View):void");
    }

    public static final void onClick$1(ACListenerS48S0400000_11 aCListenerS48S0400000_11, View view) {
        Integer numValueOf;
        int i;
        List<MutualUser> list;
        String secUid;
        String uid;
        Object obj;
        C2189821An6 c2189821An6;
        MatchedFriendStruct matchedFriendStruct;
        MutualStruct mutualStruct;
        MatchedFriendStruct matchedFriendStruct2;
        MutualStruct mutualStruct2;
        MatchedFriendStruct matchedFriendStruct3;
        MutualStruct mutualStruct3;
        C19EG c19egLIZ = C724240Sb0.LIZ((StoryRelationLabelInfoComponent) aCListenerS48S0400000_11.l0);
        if (c19egLIZ == null) {
            return;
        }
        User author = ((Aweme) aCListenerS48S0400000_11.l1).getAuthor();
        String from = null;
        if (author != null && (matchedFriendStruct3 = author.getMatchedFriendStruct()) != null && (mutualStruct3 = matchedFriendStruct3.mMutualStruct) != null) {
            numValueOf = Integer.valueOf(mutualStruct3.mutualType);
        } else {
            numValueOf = null;
        }
        String strLIZ = C1847707Ln.LIZ(((StoryRelationLabelInfoComponent) aCListenerS48S0400000_11.l0).LJJIJL().getContext(), numValueOf);
        User author2 = ((Aweme) aCListenerS48S0400000_11.l1).getAuthor();
        if (author2 != null && (matchedFriendStruct2 = author2.getMatchedFriendStruct()) != null && (mutualStruct2 = matchedFriendStruct2.mMutualStruct) != null) {
            i = mutualStruct2.total;
        } else {
            i = 0;
        }
        User author3 = ((Aweme) aCListenerS48S0400000_11.l1).getAuthor();
        if (author3 == null || (matchedFriendStruct = author3.getMatchedFriendStruct()) == null || (mutualStruct = matchedFriendStruct.mMutualStruct) == null || (list = mutualStruct.userList) == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            DataCenter dataCenter = ((VideoItemParams) aCListenerS48S0400000_11.l2).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(null, "to_profile");
            }
            InterfaceC1597970rgZ interfaceC1597970rgZLJJIJIL = C1618440sDa.LIZIZ.LJJIJIL();
            C724270Sb3 c724270Sb3 = ((StoryRelationLabelInfoComponent) aCListenerS48S0400000_11.l0).LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj).baseFeedPageParams;
            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                from = c2189821An6.getFrom();
            }
            interfaceC1597970rgZLJJIJIL.LJFF(C1600750rl3.LIZIZ(from), "click_relation_label", EnumC1260930iux.ENTER_PROFILE, (User) aCListenerS48S0400000_11.l3, null, false);
            return;
        }
        StoryRelationLabelInfoComponent storyRelationLabelInfoComponent = (StoryRelationLabelInfoComponent) aCListenerS48S0400000_11.l0;
        ArrayList arrayList = new ArrayList();
        for (MutualUser mutualUser : list) {
            if (mutualUser != null && (uid = mutualUser.getUid()) != null) {
                arrayList.add(uid);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (MutualUser mutualUser2 : list) {
            if (mutualUser2 != null && (secUid = mutualUser2.getSecUid()) != null) {
                arrayList3.add(secUid);
            }
        }
        ArrayList<String> arrayList4 = new ArrayList<>(arrayList3);
        DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT = new DialogInterfaceOnDismissListenerC738790SyT(storyRelationLabelInfoComponent, 10);
        IMutualRelationService iMutualRelationServiceLIZJ = MutualRelationServiceImpl.LIZJ();
        if (strLIZ == null) {
            strLIZ = c19egLIZ.getString(2131836397);
        }
        iMutualRelationServiceLIZJ.LIZ(c19egLIZ, arrayList2, arrayList4, i, strLIZ, dialogInterfaceOnDismissListenerC738790SyT);
        ((StoryRelationLabelInfoComponent) aCListenerS48S0400000_11.l0).Ep(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS48S0400000_11(Object obj, Aweme aweme, C0SPV c0spv, C720800SPe c720800SPe, Map<String, String> map) {
        this.$t = map;
        this.l0 = obj;
        this.l1 = aweme;
        this.l2 = c0spv;
        this.l3 = c720800SPe;
    }
}
