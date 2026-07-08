package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS385S0200000_19;

/* JADX INFO: renamed from: X.0j2U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265600j2U {
    public static String LIZ(boolean z) {
        n nVar = new n();
        if ((((Number) C296100Bj6.LIZ.getValue()).intValue() & 4) != 0 && z) {
            nVar.LJJIII(1, "reverseFollowingListSort");
        }
        if (C2277051EAt.LIZ() && z) {
            n nVar2 = new n();
            nVar2.LJJII(Boolean.TRUE, "enable");
            nVar2.LJJIII(Integer.valueOf(((Number) C2277051EAt.LIZLLL.getValue()).intValue()), "dismiss_type");
            nVar2.LJJII(Boolean.valueOf(((Boolean) C2277051EAt.LJ.getValue()).booleanValue()), "pin_unread");
            nVar2.LJJIII(Integer.valueOf(((Number) C2277051EAt.LJFF.getValue()).intValue()), "topn");
            nVar.LJJIIJ("following_list_new_post_tag_exp", nVar2.toString());
        }
        return nVar.toString();
    }

    public static int LIZIZ(boolean z) {
        if (!z && C13LQ.LJLIIL(new Integer[]{2, 3}).contains(Integer.valueOf(((Number) C277610AuN.LIZ.getValue()).intValue()))) {
            return EnumC1265510j2L.SOURCE_TYPE_BY_MAF_TOP.getValue();
        }
        return EnumC1265510j2L.SOURCE_TYPE_BY_CREATE_TIME.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(InterfaceC1265640j2Y interfaceC1265640j2Y, FollowingItemList followingItemList) {
        C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        ((AssemViewModel) interfaceC1265640j2Y).withState(new AwS385S0200000_19(c013c, c259800zU, 92));
        ((AssemViewModel) interfaceC1265640j2Y).setState(new AwS228S0300000_19(c013c, (C013C) followingItemList, (FollowingItemList) c259800zU, (C259800zU<String>) 26));
    }
}
