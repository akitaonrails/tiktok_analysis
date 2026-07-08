package Y;

import X.C09JN;
import X.C1558360qeg;
import X.C1583510rJF;
import X.C1586680rOM;
import X.C1586750rOT;
import X.C1587150rP7;
import X.C1589640rT8;
import X.C1595430rcT;
import X.C19EG;
import X.C1C7U;
import X.C2188811AlT;
import X.C2487409ou;
import X.C296600Bju;
import X.InterfaceC1586670rOL;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class AfS2S0000200_24 implements C09JN {
    public final int $t;
    public long j0;
    public long j1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS2S0000200_24 afS2S0000200_24, Object obj) {
        String str;
        List<ISocialTabProtocol> arrayList;
        SocialFeedRedDotResponse repostFeedResponse;
        Integer numValueOf;
        String statusMessage;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3;
        NewContentResponse.RepostFeedRedDotResponse repostFeedResponse2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        C1C7U.LIZ("RedDotRepository@a90a.request$requestTask$1$4");
        NewContentResponse newContentResponse = (NewContentResponse) obj;
        C1586680rOM c1586680rOM = C1586680rOM.LIZ;
        long j = afS2S0000200_24.j0;
        long j2 = afS2S0000200_24.j1;
        c1586680rOM.getClass();
        InterfaceC1586670rOL interfaceC1586670rOL = (InterfaceC1586670rOL) C1586680rOM.LJIIIZ.getValue();
        if (interfaceC1586670rOL != null) {
            interfaceC1586670rOL.LIZ(newContentResponse, j, j2, C1586680rOM.LJI, C1586680rOM.LJ, C1586680rOM.LJFF);
        }
        C1586680rOM.LJ = newContentResponse;
        C1586680rOM.LJFF = Long.valueOf(j2);
        if (C1595430rcT.LIZIZ.LIZIZ().redDotLogic().LJIIZILJ()) {
            if (newContentResponse == null || (friendsFeedResponse = newContentResponse.getFriendsFeedResponse()) == null || (arrayList2 = friendsFeedResponse.getRedDotList()) == null) {
                arrayList2 = new ArrayList<>();
            }
            IFriendsTabDebugService iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
            if (iFriendsTabDebugService != null) {
                iFriendsTabDebugService.LIZJ();
            }
            if (!C296600Bju.LIZ() || (C296600Bju.LIZ() && !C1589640rT8.LIZIZ.l2())) {
                Set<String> set = C1586680rOM.LJIIJJI;
                set.clear();
                set.addAll(arrayList2);
                Set<String> set2 = C1586680rOM.LJIIJ;
                set2.clear();
                set2.addAll(arrayList2);
            }
            if (!C296600Bju.LIZ() || (C296600Bju.LIZ() && !C1587150rP7.LIZIZ.LJIIL())) {
                if (newContentResponse == null || (repostFeedResponse2 = newContentResponse.getRepostFeedResponse()) == null || (arrayList3 = repostFeedResponse2.getRedDotList()) == null) {
                    arrayList3 = new ArrayList<>();
                }
                Set<String> set3 = C1586680rOM.LJIILIIL;
                set3.clear();
                set3.addAll(arrayList3);
                Set<String> set4 = C1586680rOM.LJIIL;
                set4.clear();
                set4.addAll(arrayList3);
            }
        }
        if (newContentResponse != null) {
            BaseResponse.ServerTimeExtra serverTimeExtra = newContentResponse.extra;
            if (serverTimeExtra != null) {
                str = serverTimeExtra.logid;
            } else {
                str = null;
            }
            C1586680rOM.LIZIZ = str;
            NewContentResponse.RepostFeedRedDotResponse repostFeedResponse3 = newContentResponse.getRepostFeedResponse();
            if (repostFeedResponse3 != null && repostFeedResponse3.getShouldShowTab()) {
                C2487409ou.LIZJ(new Runnable() { // from class: X.0rIx
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI2;
                        C1C7U.LIZ("RedDotRepository@a90a.dispatchResponse$1");
                        try {
                            C1587150rP7.LIZIZ.LJIJJ();
                            C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
                            if (c19egLIZIZ != null && (iSocial2TabProtocolAbilityLJI2 = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) != null) {
                                iSocial2TabProtocolAbilityLJI2.rO0();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("RedDotRepository@a90a.dispatchResponse$1");
                    }
                });
            }
            C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
            if (c19egLIZIZ == null || (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) == null || (arrayList = iSocial2TabProtocolAbilityLJI.sV1()) == null) {
                arrayList = new ArrayList<>();
            }
            for (ISocialTabProtocol iSocialTabProtocol : arrayList) {
                String tag = iSocialTabProtocol.getTag();
                if (Intrinsics.LJFF(tag, "FRIENDS_FEED") || Intrinsics.LJFF(tag, "REPOST_FEED")) {
                    C1586680rOM c1586680rOM2 = C1586680rOM.LIZ;
                    String tag2 = iSocialTabProtocol.getTag();
                    c1586680rOM2.getClass();
                    if (Intrinsics.LJFF(tag2, "FRIENDS_FEED")) {
                        repostFeedResponse = newContentResponse.getFriendsFeedResponse();
                    } else if (Intrinsics.LJFF(tag2, "REPOST_FEED")) {
                        repostFeedResponse = newContentResponse.getRepostFeedResponse();
                    } else {
                        numValueOf = null;
                        statusMessage = null;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("friends feed red dot error ");
                        sbLIZ.append(numValueOf);
                        sbLIZ.append(", ");
                        sbLIZ.append(statusMessage);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (repostFeedResponse != null) {
                        if (repostFeedResponse.checkResponseValid()) {
                            iSocialTabProtocol.d21(repostFeedResponse);
                        } else {
                            numValueOf = Integer.valueOf(repostFeedResponse.getStatusCode());
                            statusMessage = repostFeedResponse.getStatusMessage();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("friends feed red dot error ");
                            sbLIZ2.append(numValueOf);
                            sbLIZ2.append(", ");
                            sbLIZ2.append(statusMessage);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    } else {
                        numValueOf = null;
                        statusMessage = null;
                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                        sbLIZ22.append("friends feed red dot error ");
                        sbLIZ22.append(numValueOf);
                        sbLIZ22.append(", ");
                        sbLIZ22.append(statusMessage);
                        C2188811AlT.LIZIZ(sbLIZ22);
                    }
                }
            }
            C1586750rOT.LIZ().LJIIJ(newContentResponse, C1586680rOM.LIZJ);
        }
        C1C7U.LIZIZ("RedDotRepository@a90a.request$requestTask$1$4");
    }

    public static final void accept$1(AfS2S0000200_24 afS2S0000200_24, Object obj) {
        C1C7U.LIZ("RedDotRepository@a90a.request$requestTask$1$5");
        Throwable th = (Throwable) obj;
        C1586680rOM c1586680rOM = C1586680rOM.LIZ;
        long j = afS2S0000200_24.j0;
        long j2 = afS2S0000200_24.j1;
        c1586680rOM.getClass();
        InterfaceC1586670rOL interfaceC1586670rOL = (InterfaceC1586670rOL) C1586680rOM.LJIIIZ.getValue();
        if (interfaceC1586670rOL != null) {
            interfaceC1586670rOL.LIZIZ(th, j, j2, C1586680rOM.LJI, C1586680rOM.LJFF);
        }
        C1586680rOM.LJFF = Long.valueOf(j2);
        C1586680rOM.LJIIIIZZ = false;
        C1586750rOT.LIZ().LJFF(th, C1586680rOM.LIZJ);
        C1C7U.LIZIZ("RedDotRepository@a90a.request$requestTask$1$5");
    }

    public AfS2S0000200_24(long j, long j2, int i) {
        this.$t = i;
        this.j0 = j;
        this.j1 = j2;
    }
}
