package X;

import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.PreviewConfig;
import com.ss.android.ugc.aweme.im.chatroom.api.model.PreviewJoinButtonState;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationPreviewEntryAssem;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.ss.android.ugc.aweme.publicgroup.data.GroupInvitation;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS598S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0i7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationPreviewEntryAssem$onViewCreated$3$1", f = "GroupInvitationPreviewEntryAssem.kt", l = {58}, m = "invokeSuspend")
public final class C1230400i7i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ GroupInvitationPreviewEntryAssem LLILLL;
    public final /* synthetic */ AbstractC1230540i7w LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230400i7i(long j, GroupInvitationPreviewEntryAssem groupInvitationPreviewEntryAssem, AbstractC1230540i7w abstractC1230540i7w, Map<String, String> map, InterfaceC1364105Vn<? super C1230400i7i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = groupInvitationPreviewEntryAssem;
        this.LLILZ = abstractC1230540i7w;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1230400i7i(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GroupInvitation groupInvitation;
        boolean z;
        C0Y8Y coreInfo;
        Map<String, String> mapLJ;
        boolean z2;
        Fragment parentFragment;
        Dialog dialog;
        C1230090i7D groupMetaData;
        C1C7U.LIZ("GroupInvitationPreviewEntryAssem@7202.onViewCreated$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z3 = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C874100YQu c874100YQu = C874100YQu.LIZ;
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (c874100YQu.LIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("GroupInvitationPreviewEntryAssem@7202.onViewCreated$3$1");
                return objLJFF;
            }
        }
        C0Y8T c0y8tLJJIIJZLJL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIIJZLJL(C2286608xc.LJFF(this.LLILLJJLI));
        GroupInvitationPreviewEntryAssem groupInvitationPreviewEntryAssem = this.LLILLL;
        Context context = groupInvitationPreviewEntryAssem.Ho().getContext();
        GroupInvitationVM groupInvitationVMJo = groupInvitationPreviewEntryAssem.Jo();
        AbstractC1230540i7w abstractC1230540i7w = (AbstractC1230540i7w) groupInvitationPreviewEntryAssem.LLIZLLLIL.getValue();
        DialogFragment dialogFragment = null;
        if (abstractC1230540i7w != null && (groupMetaData = abstractC1230540i7w.getGroupMetaData()) != null) {
            groupInvitation = groupMetaData.LIZLLL;
        } else {
            groupInvitation = null;
        }
        C1885507a1 c1885507a1LIZ = C1230360i7e.LIZ(context, groupInvitationVMJo, groupInvitation);
        PreviewConfig previewConfig = new PreviewConfig(new PreviewJoinButtonState(c1885507a1LIZ.LIZ, c1885507a1LIZ.LIZIZ), this.LLILZ.getJoinGroupSource().getValue(), this.LLILZIL);
        if (c0y8tLJJIIJZLJL != null && !c0y8tLJJIIJZLJL.isMember()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            previewConfig = null;
        }
        if (c0y8tLJJIIJZLJL != null) {
            coreInfo = c0y8tLJJIIJZLJL.getCoreInfo();
        } else {
            coreInfo = null;
        }
        if (coreInfo != null && !c0y8tLJJIIJZLJL.isDissolved()) {
            if (previewConfig != null) {
                final GroupInvitationPreviewEntryAssem groupInvitationPreviewEntryAssem2 = this.LLILLL;
                long j2 = this.LLILLJJLI;
                AbstractC1230540i7w abstractC1230540i7w2 = this.LLILZ;
                groupInvitationPreviewEntryAssem2.getClass();
                InterfaceC1230340i7c interfaceC1230340i7c = new InterfaceC1230340i7c() { // from class: X.0i7Y
                    @Override // X.InterfaceC1230340i7c
                    public final void LIZ(PopupDisplayMeta popupDisplayMeta) {
                        GroupInvitationVM groupInvitationVMJo2 = groupInvitationPreviewEntryAssem2.Jo();
                        InterfaceC1229620i6S interfaceC1229620i6SZQ2 = groupInvitationVMJo2.zQ2();
                        if (interfaceC1229620i6SZQ2 != null) {
                            C1229970i71 c1229970i71 = EnumC1229960i70.Companion;
                            int i2 = popupDisplayMeta.userGroupStatus;
                            c1229970i71.getClass();
                            interfaceC1229620i6SZQ2.LIZJ(C1229970i71.LIZ(i2), popupDisplayMeta);
                        }
                        groupInvitationVMJo2.setState(new AwS598S0100000_19(popupDisplayMeta, 614));
                        if (popupDisplayMeta.userGroupStatus == EnumC1229960i70.IN_GROUP.getValue()) {
                            groupInvitationVMJo2.xQ2(new C1230320i7a(String.valueOf(popupDisplayMeta.groupInfo.convShortId)));
                        }
                    }
                };
                C1230520i7u c1230520i7uLIZ = C1230420i7k.LIZ(abstractC1230540i7w2, groupInvitationPreviewEntryAssem2.Jo(), null);
                C899340ZPw.LIZ.put(Long.valueOf(j2), interfaceC1230340i7c);
                C899340ZPw.LIZIZ.put(Long.valueOf(j2), c1230520i7uLIZ);
            }
            C1230840i8Q c1230840i8Q = new Object() { // from class: X.0i8Q
            };
            Context context2 = this.LLILLL.Ho().getContext();
            String strValueOf = String.valueOf(this.LLILLJJLI);
            c1230840i8Q.getClass();
            if (previewConfig != null) {
                mapLJ = previewConfig.previewMobParams;
            } else {
                mapLJ = null;
            }
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            EnterChatParams enterChatParams = new EnterChatParams(context2, 3, strValueOf);
            enterChatParams.setPreviewConfig(previewConfig);
            String str = mapLJ.get("previous_page");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            enterChatParams.setEnterFromForMob(str);
            String str3 = mapLJ.get("enter_method");
            if (str3 != null) {
                str2 = str3;
            }
            enterChatParams.setEnterMethodForMob(str2);
            if (previewConfig != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            enterChatParams.setNoEnterChatEvent(z2);
            C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
            if (previewConfig != null) {
                GroupInvitationPreviewEntryAssem groupInvitationPreviewEntryAssem3 = this.LLILLL;
                groupInvitationPreviewEntryAssem3.getClass();
                Fragment fragmentLJI = C724240Sb0.LJI(groupInvitationPreviewEntryAssem3);
                if (fragmentLJI != null) {
                    parentFragment = fragmentLJI.getParentFragment();
                } else {
                    parentFragment = null;
                }
                if (parentFragment instanceof DialogFragment) {
                    dialogFragment = (DialogFragment) parentFragment;
                }
                if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && dialog.isShowing() && dialog.getWindow() != null) {
                    try {
                        boolean zLIZIZ = C960203pA.LIZIZ(groupInvitationPreviewEntryAssem3.Ho().getContext());
                        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(dialogFragment, false);
                        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
                        if (zLIZIZ) {
                            z3 = false;
                        }
                        tuxImmersionBarLIZJ.LIZIZ.LJIIJ(z3);
                        tuxImmersionBarLIZJ.LIZ(false);
                        tuxImmersionBarLIZJ.LIZLLL();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GroupInvitationPreviewEntryAssem@7202.onViewCreated$3$1");
            return unit;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL.LJJIJL());
        c1389890mGx.LJIIJ(C1383370m6R.LJIIJ(2131835079));
        c1389890mGx.LJIIJJI();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GroupInvitationPreviewEntryAssem@7202.onViewCreated$3$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
