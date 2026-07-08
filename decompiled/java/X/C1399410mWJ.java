package X;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mWJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399410mWJ extends AbstractC1066890drz {
    public final C01GW LLJ = C452501pT.LIZIZ(new C1067440dss());
    public final C01GW LLJI = C452501pT.LIZIZ(new C1399430mWL());
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1399420mWK(this));

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final String LIZLLL() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        return interfaceC1392640mLO.LIZIZ().getString(((Boolean) this.LLJIJIL.getValue()).booleanValue() ? 2131827015 : 2131827016);
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "is_social_avatar_sticker");
        return new C1400390mXt(new AwS565S0100000_21(c2344009Gk, 1267), new AwS565S0100000_21(c2344009Gk, 1268), new AwS565S0100000_21(c2344009Gk, 1269), null, null, 24);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1399410mWJ();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.SOCIAL_AVATAR_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        ISocialAvatarStoryPostService iSocialAvatarStoryPostService = (ISocialAvatarStoryPostService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStoryPostService.class, false, false, false, 14, null);
        if (iSocialAvatarStoryPostService != null && iSocialAvatarStoryPostService.enable()) {
            AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
            list.remove(anchorCommonStruct2);
            LJIILIIL(anchorCommonStruct2);
            this.LLIZ = anchorCommonStruct2;
            if (arrayList.size() == 1) {
                return EnumC1050190dR3.DONE;
            }
            return EnumC1050190dR3.PROCEED;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            list.remove(it2.next());
        }
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        C19EG c19eg;
        int i;
        String uid;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
        if ((activityLIZIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZIZ) != null) {
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 == null) {
                interfaceC1392640mLO3 = null;
            }
            LifecycleOwner lifecycleOwnerLJ = interfaceC1392640mLO3.LJ();
            if (((Boolean) this.LLJIJIL.getValue()).booleanValue()) {
                ISocialAvatarStoryPostService iSocialAvatarStoryPostService = (ISocialAvatarStoryPostService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStoryPostService.class, false, false, false, 14, null);
                if (iSocialAvatarStoryPostService != null) {
                    if (lifecycleOwnerLJ == null) {
                        lifecycleOwnerLJ = c19eg;
                    }
                    String uid2 = ((User) this.LLJ.getValue()).getUid();
                    InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
                    if (interfaceC1392640mLO4 == null) {
                        interfaceC1392640mLO4 = null;
                    }
                    User author = interfaceC1392640mLO4.LJJLIIIJJIZ().getAuthor();
                    if (author != null) {
                        uid = author.getUid();
                    } else {
                        uid = null;
                    }
                    boolean zLJFF = Intrinsics.LJFF(uid2, uid);
                    InterfaceC1392640mLO interfaceC1392640mLO5 = this.LL;
                    if (interfaceC1392640mLO5 == null) {
                        interfaceC1392640mLO5 = null;
                    }
                    boolean zLJJIJIL = C729510SjV.LJJIJIL(interfaceC1392640mLO5.LJJLIIIJJIZ());
                    InterfaceC1392640mLO interfaceC1392640mLO6 = this.LL;
                    if (interfaceC1392640mLO6 != null) {
                        interfaceC1392640mLO2 = interfaceC1392640mLO6;
                    }
                    iSocialAvatarStoryPostService.LIZ(c19eg, lifecycleOwnerLJ, zLJFF, zLJJIJIL, C459610I0p.LIZIZ(interfaceC1392640mLO2.LJJLIIIJJIZ()));
                    return;
                }
                return;
            }
            ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarService.class, false, false, false, 14, null);
            if (iSocialAvatarService == null) {
                return;
            }
            InterfaceC1392640mLO interfaceC1392640mLO7 = this.LL;
            if (interfaceC1392640mLO7 == null) {
                interfaceC1392640mLO7 = null;
            }
            if (C729510SjV.LJJIJIL(interfaceC1392640mLO7.LJJLIIIJJIZ())) {
                i = 2;
            } else {
                i = 5;
            }
            iSocialAvatarService.LJIILLIIL(new C0HHA(c19eg, "click_social_avatar_sticker", "social_avatar_sticker_anchor", null, null, i, false, false, null, false, null, 4024), null, null);
        }
    }
}
