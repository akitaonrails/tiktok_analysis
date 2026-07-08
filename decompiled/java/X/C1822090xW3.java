package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServiceBioRevampOptSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onboarding.LivePcsCreatorRevampSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeetingdmdialog.dialog.CalendlyMeetingDmDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.moderator.PcsServiceBioModeratorDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingHostFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.PcsServiceSkuDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryBigImageStylePanelDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummarySmallImageStyle3Dialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryTextStyle2Dialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryTextStylePanelDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.IntelligentBoardTemplateForYouSheet;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.OneStopSheetFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAISummaryBoardSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOptinSafSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONException;
import webcast.api.sub.FormInfo;

/* JADX INFO: renamed from: X.0xW3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822090xW3 implements C0JJO {
    @Override // X.C0JJO
    public final CalendlyMeetingDmDialog LJIIIZ() {
        return new CalendlyMeetingDmDialog();
    }

    @Override // X.C0JJO
    public final C758450Tp5 LJIIZILJ() {
        return C758450Tp5.LL;
    }

    @Override // X.C0JJO
    public final PcsServicePlusOptinFragment LIZ(PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams) {
        PcsServicePlusOptinFragment.LLIZ.getClass();
        PcsServicePlusOptinFragment pcsServicePlusOptinFragment = new PcsServicePlusOptinFragment();
        pcsServicePlusOptinFragment.LL = pcsServicePlusOptinPageParams;
        return pcsServicePlusOptinFragment;
    }

    @Override // X.C0JJO
    public final void LIZIZ(C0JLC c0jlc) {
        PcsServiceBioModeratorDialog.LLJZIJLIL.getClass();
        FragmentManager fragmentManagerLIZJ = C507500JvI.LIZJ((Context) C507500JvI.LIZIZ().get());
        PcsServiceBioModeratorDialog pcsServiceBioModeratorDialog = new PcsServiceBioModeratorDialog();
        pcsServiceBioModeratorDialog.LLJZ = c0jlc;
        C19322110iZ.LJ(fragmentManagerLIZJ, pcsServiceBioModeratorDialog, null, "service_plus_moderator", null, 0, null);
    }

    @Override // X.C0JJO
    public final OneStopSheetFragment LIZLLL(Bundle bundle) {
        OneStopSheetFragment.LLJZ.getClass();
        OneStopSheetFragment oneStopSheetFragment = new OneStopSheetFragment();
        oneStopSheetFragment.setArguments(bundle);
        return oneStopSheetFragment;
    }

    @Override // X.C0JJO
    public final void LJIIJ(C1822010xVv c1822010xVv) {
        PcsServiceSkuDialog.LLLII.getClass();
        C1821430xUz.LIZ(c1822010xVv);
    }

    @Override // X.C0JJO
    public final Fragment LJIIL(PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams) {
        if (LivePcsCreatorRevampSetting.INSTANCE.isEnabled()) {
            PcsOnboardingHostFragment pcsOnboardingHostFragment = new PcsOnboardingHostFragment();
            Gson gson = C1822270xWL.LIZ;
            pcsOnboardingHostFragment.setArguments(C1822270xWL.LIZIZ(pcsServicePlusOptinPageParams));
            return pcsOnboardingHostFragment;
        }
        if (LivePcsOptinSafSetting.INSTANCE.enableSAF()) {
            Fragment fragmentLIZIZ = C1822110xW5.LIZIZ(pcsServicePlusOptinPageParams);
            if (fragmentLIZIZ != null) {
                return fragmentLIZIZ;
            }
            PcsServicePlusOptinFragment.LLIZ.getClass();
            PcsServicePlusOptinFragment pcsServicePlusOptinFragment = new PcsServicePlusOptinFragment();
            pcsServicePlusOptinFragment.LL = pcsServicePlusOptinPageParams;
            return pcsServicePlusOptinFragment;
        }
        PcsServicePlusOptinFragment.LLIZ.getClass();
        PcsServicePlusOptinFragment pcsServicePlusOptinFragment2 = new PcsServicePlusOptinFragment();
        pcsServicePlusOptinFragment2.LL = pcsServicePlusOptinPageParams;
        return pcsServicePlusOptinFragment2;
    }

    @Override // X.C0JJO
    public final void LJIILIIL(List<FormInfo> list) {
        IHostPCS iHostPCS;
        String str;
        MatchResult matchResultFind$default;
        List<String> listLIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<FormInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = it2.next().schema;
            if (str2.length() > 0 && 1 != 0) {
                try {
                    matchResultFind$default = Regex.find$default(new Regex("gecko/resource/(.*?)/index\\.html"), URLDecoder.decode(str2, "UTF-8"), 0, 2, null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("ServicePlusBioPreloadScene", e);
                }
                if (matchResultFind$default == null || (listLIZ = matchResultFind$default.LIZ()) == null || (str = listLIZ.get(1)) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    arrayList.add(str);
                }
            }
        }
        List listLJJJJI = C13LP.LJJJJI(arrayList);
        if ((!listLJJJJI.isEmpty()) && (iHostPCS = (IHostPCS) C1161920gLG.LIZJ(IHostPCS.class)) != null) {
            iHostPCS.zP2(listLJJJJI);
        }
    }

    @Override // X.C0JJO
    public final void LJIILJJIL(PcsThirdPartyLinkData pcsThirdPartyLinkData) {
        User owner;
        User owner2;
        if (LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage()) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            String string = pcsThirdPartyLinkData.anchorId;
            Long lValueOf = null;
            if (!(!a0.LJJJIL(string))) {
                string = null;
            }
            String str = "";
            if (string == null && (room == null || (owner2 = room.getOwner()) == null || (string = Long.valueOf(owner2.getId()).toString()) == null)) {
                string = "";
            }
            String secUid = pcsThirdPartyLinkData.secAnchorId;
            if (((!a0.LJJJIL(secUid)) && secUid != null) || (room != null && (owner = room.getOwner()) != null && (secUid = owner.getSecUid()) != null)) {
                str = secUid;
            }
            Long l = pcsThirdPartyLinkData.roomId;
            if (l == null) {
                if (room != null) {
                    lValueOf = Long.valueOf(room.getId());
                }
            } else {
                lValueOf = l;
            }
            LJIIJ(new C1822010xVv(EnumC1785280wYg.THIRD_PARTY_SERVICE, pcsThirdPartyLinkData.showEntrance, false, true, false, null, C2095008Iq.LJIILIIL(string), str, lValueOf, Long.valueOf(pcsThirdPartyLinkData.skuId), null, null, false, null, null, null, null, null, 523316));
            return;
        }
        String str2 = PcsThirdPartyLinkDialog._pnsPageId;
        C1821440xV0.LIZ(pcsThirdPartyLinkData);
    }

    @Override // X.C0JJO
    public final void LJ(int i, DataChannel dataChannel) {
        InterfaceC20484815Dq interfaceC20484815Dq;
        int iBroadcastDialogStyle = LiveAISummaryBoardSetting.INSTANCE.broadcastDialogStyle();
        if (iBroadcastDialogStyle != 1) {
            if (iBroadcastDialogStyle != 2) {
                if (iBroadcastDialogStyle != 3) {
                    if (iBroadcastDialogStyle != 4) {
                        AiSummaryBigImageStylePanelDialog aiSummaryBigImageStylePanelDialog = new AiSummaryBigImageStylePanelDialog();
                        aiSummaryBigImageStylePanelDialog.LLJZIJLIL = null;
                        aiSummaryBigImageStylePanelDialog.LLLF = null;
                        aiSummaryBigImageStylePanelDialog.LLLFF = i;
                        interfaceC20484815Dq = aiSummaryBigImageStylePanelDialog;
                    } else {
                        AiSummarySmallImageStyle3Dialog aiSummarySmallImageStyle3Dialog = new AiSummarySmallImageStyle3Dialog();
                        aiSummarySmallImageStyle3Dialog.LLJLLL = i;
                        interfaceC20484815Dq = aiSummarySmallImageStyle3Dialog;
                    }
                } else {
                    AiSummaryTextStyle2Dialog aiSummaryTextStyle2Dialog = new AiSummaryTextStyle2Dialog();
                    aiSummaryTextStyle2Dialog.LLJLLL = i;
                    interfaceC20484815Dq = aiSummaryTextStyle2Dialog;
                }
            } else {
                AiSummaryTextStylePanelDialog.LLLII.getClass();
                AiSummaryTextStylePanelDialog aiSummaryTextStylePanelDialog = new AiSummaryTextStylePanelDialog();
                aiSummaryTextStylePanelDialog.LLLFZ = i;
                interfaceC20484815Dq = aiSummaryTextStylePanelDialog;
            }
        } else {
            AiSummaryTextStylePanelDialog.LLLII.getClass();
            AiSummaryTextStylePanelDialog aiSummaryTextStylePanelDialog2 = new AiSummaryTextStylePanelDialog();
            aiSummaryTextStylePanelDialog2.LLLFZ = i;
            interfaceC20484815Dq = aiSummaryTextStylePanelDialog2;
        }
        C19322110iZ.LJFF((FragmentManager) dataChannel.gg0(C748880TZe.class), interfaceC20484815Dq, "live_ai_summary_big_image_style", null, 0);
        C0IJT.LIZ("livesdk_in_live_ai_board_capsule_page_show").LIZ();
    }

    @Override // X.C0JJO
    public final void LJI(DataChannel dataChannel, int i) {
        FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        AiSummaryTextStylePanelDialog.LLLII.getClass();
        AiSummaryTextStylePanelDialog aiSummaryTextStylePanelDialog = new AiSummaryTextStylePanelDialog();
        aiSummaryTextStylePanelDialog.LLLFZ = i;
        C19322110iZ.LJFF(fragmentManager, aiSummaryTextStylePanelDialog, "live_ai_summary_text_style", null, 0);
        C0IJT.LIZ("livesdk_in_live_ai_board_capsule_page_show").LIZ();
    }

    @Override // X.C0JJO
    public final PcsServiceBioFragmentV2 LJIILL(C521380Kca c521380Kca, Map map) {
        if (LivePcsServiceBioRevampOptSetting.INSTANCE.enablePreloadUI()) {
            PcsServiceBioFragmentV2.LLILZLL.getClass();
            if (PcsServiceBioFragmentV2.LLIZLLLIL == null) {
                PcsServiceBioFragmentV2.LLIZLLLIL = new C1150304ej();
            }
            C1150304ej c1150304ej = PcsServiceBioFragmentV2.LLIZLLLIL;
            if (c1150304ej != null) {
                c1150304ej.LJIIIZ();
            }
        }
        PcsServiceBioFragmentV2.LLILZLL.getClass();
        PcsServiceBioFragmentV2 pcsServiceBioFragmentV2 = new PcsServiceBioFragmentV2();
        pcsServiceBioFragmentV2.LLILLL = c521380Kca;
        pcsServiceBioFragmentV2.LLILZ = map;
        return pcsServiceBioFragmentV2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ae  */
    @Override // X.C0JJO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(android.content.Context r19, com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams r20) {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1822090xW3.LJIJ(android.content.Context, com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams):void");
    }

    @Override // X.C0JJO
    public final void LJII(long j, DataChannel dataChannel, String str) {
        FragmentManager fragmentManager;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            IntelligentBoardTemplateForYouSheet.LLLII.getClass();
            IntelligentBoardTemplateForYouSheet intelligentBoardTemplateForYouSheet = new IntelligentBoardTemplateForYouSheet();
            intelligentBoardTemplateForYouSheet.LLJZIJLIL = str;
            intelligentBoardTemplateForYouSheet.LLL = "";
            intelligentBoardTemplateForYouSheet.LLLF = dataChannel;
            intelligentBoardTemplateForYouSheet.LLLFF = j;
            C19322110iZ.LJFF(fragmentManager, intelligentBoardTemplateForYouSheet, "IntelligentBoardTemplateForYouSheet", null, 0);
        }
    }

    @Override // X.C0JJO
    public final void LJIIIIZZ(Context context, FragmentManager fragmentManager, PcsCalendlyBookingData pcsCalendlyBookingData) {
        C786410Ut5.LJJIJL(new Bundle(), "calendly_page_params", pcsCalendlyBookingData);
        C490380JKy c490380JKy = new C490380JKy(this, pcsCalendlyBookingData, fragmentManager);
        C490390JKz c490390JKz = new C490390JKz(c490380JKy);
        C0JL0 c0jl0 = new C0JL0();
        C0JT6<Boolean> c0jt6 = InterfaceC1106030et7.l9;
        Boolean boolLIZ = c0jt6.LIZ();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolLIZ, bool)) {
            c490380JKy.invoke();
            return;
        }
        C1822150xW9 c1822150xW9 = new C1822150xW9(c490390JKz);
        C1822160xWA c1822160xWA = new C1822160xWA(c0jl0);
        C1391960mKI c1391960mKI = new C1391960mKI();
        c1391960mKI.LJII = C497740JfY.LJIJI(2131851509);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJIJI(2131851507));
        sbLIZ.append('\n');
        sbLIZ.append(C497740JfY.LJIJI(2131851508));
        c1391960mKI.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ);
        c1391960mKI.LIZIZ(C497740JfY.LJIJI(2131851505), new C1822130xW7(c1822150xW9));
        c1391960mKI.LIZJ(C497740JfY.LJIJI(2131851506), new C1822140xW8(c1822160xWA));
        c1391960mKI.LIZ = false;
        c1391960mKI.LJIILJJIL = true;
        TuxPanel tuxPanel = c1391960mKI.LIZ().LIZ;
        if (tuxPanel != null) {
            tuxPanel.show(fragmentManager, "calendly_user_agreement");
        }
        c0jt6.LIZJ(bool);
    }

    @Override // X.C0JJO
    public final void LIZJ(String str, String str2, DataChannel dataChannel, Bundle bundle, C1814370xJb c1814370xJb) {
        FragmentManager fragmentManager;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            LiveBoardsPageDialogFragment.LLJILJILJ.getClass();
            LiveBoardsPageDialogFragment liveBoardsPageDialogFragment = new LiveBoardsPageDialogFragment();
            liveBoardsPageDialogFragment.LLILZIL = c1814370xJb;
            liveBoardsPageDialogFragment.dataChannel = dataChannel;
            liveBoardsPageDialogFragment.LLILLJJLI = str;
            C786410Ut5.LJJJI("show_entrance", str, bundle);
            if (str2 != null) {
                C786410Ut5.LJJJI("room_id", str2, bundle);
            }
            liveBoardsPageDialogFragment.setArguments(bundle);
            liveBoardsPageDialogFragment.show(fragmentManager, "LiveBoardsPageDialogFragment");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0201 A[PHI: r10
      0x0201: PHI (r10v1 boolean) = (r10v0 boolean), (r10v6 boolean), (r10v6 boolean), (r10v6 boolean), (r10v6 boolean) binds: [B:123:0x01fd, B:63:0x012f, B:65:0x0133, B:67:0x0137, B:69:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0206 A[PHI: r9 r10
      0x0206: PHI (r9v1 boolean) = (r9v0 boolean), (r9v4 boolean), (r9v4 boolean), (r9v4 boolean) binds: [B:126:0x0202, B:72:0x0146, B:74:0x014a, B:76:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r10v2 boolean) = (r10v1 boolean), (r10v5 boolean), (r10v5 boolean), (r10v5 boolean) binds: [B:126:0x0202, B:72:0x0146, B:74:0x014a, B:76:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015f  */
    @Override // X.C0JJO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C521380Kca r17, java.util.Map<java.lang.String, java.lang.String> r18, boolean r19, boolean r20, webcast.api.sub.SMBPreviewResponse.ResponseData r21) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1822090xW3.LJFF(X.0Kca, java.util.Map, boolean, boolean, webcast.api.sub.SMBPreviewResponse$ResponseData):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // X.C0JJO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.Map r12, boolean r13) {
        /*
            r8 = this;
            X.0Kca r3 = new X.0Kca
            r3.<init>(r9, r10, r13, r11)
            com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting r0 = com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting.INSTANCE
            boolean r0 = r0.useNewBioPage()
            r7 = 0
            r2 = r8
            if (r0 == 0) goto L49
            X.0ep4 r0 = X.C1103520ep4.LIZ
            X.0xWQ r0 = X.C1103520ep4.LIZJ(r10, r11)
            if (r0 == 0) goto L36
            X.01GW r0 = r0.LIZIZ
            java.lang.Object r1 = r0.getValue()
            X.0xWO r1 = (X.C1822300xWO) r1
        L1f:
            if (r1 == 0) goto L36
            java.util.List<webcast.api.sub.FormInfo> r0 = r1.LJIIJ
            if (r0 == 0) goto L36
            com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServiceBioFormPreloadSetting r0 = com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServiceBioFormPreloadSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L36
            java.util.List<webcast.api.sub.FormInfo> r0 = r1.LJIIJ
            if (r0 != 0) goto L33
            X.13BV r0 = X.C13BV.INSTANCE
        L33:
            r2.LJIILIIL(r0)
        L36:
            X.0KVe r0 = X.C518520KVe.LIZIZ
            java.lang.Object r0 = r0.LIZIZ(r10, r11)
            X.0wY1 r0 = (X.C1784870wY1) r0
            if (r0 == 0) goto L42
            webcast.api.sub.SMBPreviewResponse$ResponseData r7 = r0.LIZJ
        L42:
            r5 = 0
            r4 = r12
            r6 = r5
            r2.LJFF(r3, r4, r5, r6, r7)
            return
        L49:
            X.0KVe r0 = X.C518520KVe.LIZIZ
            java.lang.Object r0 = r0.LIZIZ(r10, r11)
            X.0wY1 r0 = (X.C1784870wY1) r0
            if (r0 == 0) goto L36
            X.0xWO r1 = r0.LIZIZ
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1822090xW3.LJIIJJI(java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean):void");
    }

    @Override // X.C0JJO
    public final void LJIILLIIL(String str, String str2, String str3, String str4, String str5, List<String> list, Map<String, String> map, final Map<String, String> map2) {
        Context context;
        FragmentManager supportFragmentManager;
        C1749450vct c1749450vct = C1749450vct.LIZ;
        c1749450vct.getClass();
        final Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("anchor_id", str), new Pair("show_entrance", str2), new Pair("panel_type", str3), new Pair("leads_id", str5));
        WeakReference weakReferenceLIZIZ = C507500JvI.LIZIZ();
        if (weakReferenceLIZIZ.get() != null && (context = (Context) weakReferenceLIZIZ.get()) != null) {
            ArrayList arrayList = new ArrayList();
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("call", new C1749520vd0(context.getString(2131855842), new C1749480vcw(c1749450vct))), new Pair("email", new C1749520vd0(context.getString(2131855845), new C1749490vcx(c1749450vct))), new Pair("copy_call", new C1749520vd0(context.getString(2131855844), new C1749530vd1(c1749450vct))), new Pair("copy_email", new C1749520vd0(context.getString(2131855844), new C1749540vd2(c1749450vct))), new Pair("add_to_contacts", new C1749520vd0(context.getString(2131855841), new C1749500vcy(c1749450vct))));
            for (String str6 : list) {
                C1749520vd0 c1749520vd0 = (C1749520vd0) mapLJIIIIZZ.get(str6);
                if (c1749520vd0 != null) {
                    C1247510iZJ c1247510iZJ = new C1247510iZJ();
                    c1247510iZJ.LIZ = c1749520vd0.LIZ;
                    c1247510iZJ.LIZ(new C1749510vcz(str6, mapLJIIJ, map, c1749520vd0, context, map2));
                    arrayList.add(c1247510iZJ);
                }
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C1390850mIV c1390850mIV = new C1390850mIV();
                c1390850mIV.LIZ.LLJJIJI = str4;
                c1390850mIV.LIZLLL(2131855843);
                c1390850mIV.LJI(arrayList);
                c1390850mIV.LIZ.LL = new DialogInterface.OnCancelListener() { // from class: X.0vcu
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) throws JSONException {
                        mapLJIIJ.put("click_position", "cancel");
                        C1749450vct c1749450vct2 = C1749450vct.LIZ;
                        Map<String, String> map3 = mapLJIIJ;
                        Map<String, String> map4 = map2;
                        c1749450vct2.getClass();
                        C1749450vct.LIZLLL(map3, map4);
                    }
                };
                c1390850mIV.LIZJ().show(supportFragmentManager, "PcsContactActionSheet");
                C1749450vct.LIZ.getClass();
                C1749450vct.LJ("show", mapLJIIJ, map2);
            }
        }
    }
}
