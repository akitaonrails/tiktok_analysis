package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.MessageAlert;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsCommonComposeSubFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20696515yl extends C09AY implements InterfaceC1631620sYq<InterfaceC1686920u02, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C20696015yg LL;
    public final /* synthetic */ PushSettingsCommonComposeSubFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20696515yl(C20696015yg c20696015yg, PushSettingsCommonComposeSubFragment pushSettingsCommonComposeSubFragment, String str) {
        super(3);
        this.LL = c20696015yg;
        this.LLILLJJLI = pushSettingsCommonComposeSubFragment;
        this.LLILLL = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1686920u02 interfaceC1686920u02, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 17) == 16 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            List<AbstractC20694715yT> list = this.LL.LIZIZ;
            PushSettingsCommonComposeSubFragment pushSettingsCommonComposeSubFragment = this.LLILLJJLI;
            String str = this.LLILLL;
            for (AbstractC20694715yT abstractC20694715yT : list) {
                if (Intrinsics.LJFF(abstractC20694715yT.getUniqueId(), "in_app_active_status_push")) {
                    PrivacySettingsFeature imPrivacySettings = C1336205Ku.LIZ(false).getImPrivacySettings();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("createViewsFromSettings(ACTIVE_STATUS_PUSH) - is U16: ");
                    sbLIZ.append(!imPrivacySettings.LJIJJ());
                    sbLIZ.append(", EXP showActivityStatus: ");
                    sbLIZ.append(C896370ZEl.LIZ());
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (!imPrivacySettings.LJIJJ() || !C896370ZEl.LIZ()) {
                    }
                }
                if (!Intrinsics.LJFF(abstractC20694715yT.getUniqueId(), "in_app_im_msg_req_push") || C19212010Ec.LIZJ.LIZJ() != C05RV.BUSINESS_INBOX) {
                    if (C1697810uHb.LJIIJJI("in_app_im_msg_sound", "in_app_im_msg_vibration").contains(abstractC20694715yT.getUniqueId())) {
                        IMContactApi.LIZ.getClass();
                        InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
                        EnumC1725606pK enumC1725606pK = EnumC1725606pK.MESSAGE_ALERT;
                        MessageAlert messageAlert = (MessageAlert) interfaceC15516065qLIZJ.LJFF(enumC1725606pK, null, null, enumC1725606pK.getAllowUsingLocalStaleValue(), true);
                        if (messageAlert == null || !messageAlert.LIZ()) {
                        }
                    }
                    if (abstractC20694715yT instanceof C20694815yU) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-1850034819);
                        C20304714cf.LIZ(pushSettingsCommonComposeSubFragment.requireContext(), (C20694815yU) abstractC20694715yT, pushSettingsCommonComposeSubFragment.bS(), true, str, interfaceC1680500tpg2, 3072, 0);
                        interfaceC1680500tpg2.LJ();
                    } else if (abstractC20694715yT instanceof C1244400iUI) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-1849560426);
                        C1244410iUJ.LIZ(pushSettingsCommonComposeSubFragment.requireContext(), (C1244400iUI) abstractC20694715yT, pushSettingsCommonComposeSubFragment.bS(), interfaceC1680500tpg2, 0);
                        interfaceC1680500tpg2.LJ();
                    } else if (abstractC20694715yT instanceof C1244380iUG) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-1849198222);
                        C1244390iUH.LIZ(pushSettingsCommonComposeSubFragment.requireContext(), (C1244380iUG) abstractC20694715yT, pushSettingsCommonComposeSubFragment.bS(), pushSettingsCommonComposeSubFragment.getLayoutInflater(), true, interfaceC1680500tpg2, 24576, 0);
                        interfaceC1680500tpg2.LJ();
                    } else if (abstractC20694715yT instanceof C1244360iUE) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-1848711181);
                        C1244370iUF.LIZ(pushSettingsCommonComposeSubFragment.requireContext(), (C1244360iUE) abstractC20694715yT, pushSettingsCommonComposeSubFragment.bS(), interfaceC1680500tpg2, 0);
                        interfaceC1680500tpg2.LJ();
                    } else if (abstractC20694715yT instanceof C1244220iU0) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-1848356541);
                        C1244180iTw.LIZ(pushSettingsCommonComposeSubFragment.requireContext(), (C1244220iU0) abstractC20694715yT, pushSettingsCommonComposeSubFragment.bS(), true, interfaceC1680500tpg2, 3072, 0);
                        interfaceC1680500tpg2.LJ();
                    } else if (abstractC20694715yT instanceof C1244260iU4) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-1847948364);
                        C1244270iU5.LIZ(pushSettingsCommonComposeSubFragment.requireContext(), (C1244260iU4) abstractC20694715yT, pushSettingsCommonComposeSubFragment.bS(), interfaceC1680500tpg2, 0);
                        interfaceC1680500tpg2.LJ();
                    } else if (abstractC20694715yT instanceof C20694515yR) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-1847582409);
                        C20304814cg.LIZ(pushSettingsCommonComposeSubFragment.requireContext(), (C20694515yR) abstractC20694715yT, pushSettingsCommonComposeSubFragment.bS(), true, null, interfaceC1680500tpg2, 3072, 16);
                        interfaceC1680500tpg2.LJ();
                    } else if (abstractC20694715yT instanceof C20694615yS) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-1847153524);
                        C20305414cm.LIZ(pushSettingsCommonComposeSubFragment.requireContext(), (C20694615yS) abstractC20694715yT, pushSettingsCommonComposeSubFragment.bS(), pushSettingsCommonComposeSubFragment.getLayoutInflater(), true, interfaceC1680500tpg2, 24576, 0);
                        interfaceC1680500tpg2.LJ();
                    } else {
                        interfaceC1680500tpg2.LJJIIJZLJL(-1846703807);
                        interfaceC1680500tpg2.LJ();
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
