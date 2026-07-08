package X;

import Y.ACallableS410S0100000_2;
import Y.AfS138S0200000_2;
import Y.AkS482S0100000_21;
import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1609006Rs {
    public static final C1609006Rs LIZ = new C1609006Rs();

    public static boolean LIZJ(AwemeSharePackage awemeSharePackage) {
        if (awemeSharePackage == null) {
            return false;
        }
        return Intrinsics.LJFF(awemeSharePackage.extras.getString("panel_source", ""), "share_post_and_group_chat_panel");
    }

    public static C1371430lnB LIZ(SharePackage sharePackage, String str, String str2) {
        String nickname = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getNickname();
        if (sharePackage instanceof AwemeSharePackage) {
            String string = C1374720lsU.LIZIZ().getString(2131835351, nickname);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(' ');
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (Intrinsics.LJFF(str2, "email")) {
                return new C1371430lnB(strLIZIZ, C1374720lsU.LIZIZ().getString(2131845764), "");
            }
            return new C1371430lnB(strLIZIZ, "", 4);
        }
        return new C1371430lnB(str, (String) null, 6);
    }

    public static void LIZIZ(final long j, final AwemeSharePackage awemeSharePackage, final String str, final InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C11NJ) awemeSharePackage.LJJII().LIZ.getValue()).LIZ(AbstractC19483511Kn.LJIIJJI(new ACallableS410S0100000_2(awemeSharePackage, 0)).LJIJJ(C11S5.LIZ()).LJIIJ(new InterfaceC1487280oo2() { // from class: X.0iXu
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                GroupInviteInfoModel groupInviteInfoModel = (GroupInviteInfoModel) obj;
                String inviteId = groupInviteInfoModel.getInviteId();
                if (inviteId != null && inviteId.length() != 0 && groupInviteInfoModel.getInviteError() == null) {
                    C1609006Rs c1609006Rs = C1609006Rs.LIZ;
                    String str2 = awemeSharePackage.url;
                    String inviteId2 = groupInviteInfoModel.getInviteId();
                    if (inviteId2 == null) {
                        inviteId2 = "";
                    }
                    c1609006Rs.getClass();
                    C0XI4 c0xi4 = new C0XI4(str2);
                    if (C703302op.LIZ(inviteId2)) {
                        c0xi4.LJ("group_invite_id", inviteId2);
                    }
                    String strLJFF = c0xi4.LJFF();
                    AwemeSharePackage awemeSharePackage2 = awemeSharePackage;
                    return C1374720lsU.LJ(strLJFF, awemeSharePackage2.itemType, str, awemeSharePackage2, 4);
                }
                return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0idY
                    @Override // X.InterfaceC1254030ijp
                    public final void LIZ(C11KY c11ky) {
                        c11ky.onError(new Throwable("invite id is empty"));
                    }
                });
            }
        }).LJIIJ(new AkS482S0100000_21(awemeSharePackage, 0)).LJIILIIL(C1701940uOG.LIZIZ()).LJIIZILJ(new C09JN() { // from class: X.06Rp
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ExternalShareGroupUtils@7fa9.getExternalShareGroupLink$4");
                awemeSharePackage.extras.putInt("external_share_group_invitation_fail", 0);
                awemeSharePackage.extras.putLong("link_duration", System.currentTimeMillis() - j);
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = interfaceC1364105Vn;
                C1609006Rs c1609006Rs = C1609006Rs.LIZ;
                AwemeSharePackage awemeSharePackage2 = awemeSharePackage;
                String str2 = str;
                c1609006Rs.getClass();
                String str3 = C1609006Rs.LIZ(awemeSharePackage2, (String) obj, str2).LIZLLL;
                C189200o6.m2constructorimpl(str3);
                interfaceC1364105Vn2.resumeWith(str3);
                C1C7U.LIZIZ("ExternalShareGroupUtils@7fa9.getExternalShareGroupLink$4");
            }
        }, new AfS138S0200000_2(awemeSharePackage, interfaceC1364105Vn, 0)));
    }
}
