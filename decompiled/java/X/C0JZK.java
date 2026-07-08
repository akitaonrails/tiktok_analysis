package X;

import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.api.subscription.setting.SubVipSubOnlyLiveSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.SubSplitStatus;

/* JADX INFO: renamed from: X.0JZK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JZK extends C09AY implements Function1<InterfaceC497601wk, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LL;
    public final /* synthetic */ C19EG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JZK(SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, C19EG c19eg) {
        super(1);
        this.LL = subOnlyLiveSettingDialogVM;
        this.LLILLJJLI = c19eg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC497601wk interfaceC497601wk) {
        long j;
        final boolean z;
        SubSplitStatus subSplitStatus;
        int i;
        int i2;
        Long lValueOf;
        int i3;
        User owner;
        User owner2;
        SubscribeInfo subscribeInfo;
        final SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM = this.LL;
        C19EG c19eg = this.LLILLJJLI;
        Room room = subOnlyLiveSettingDialogVM.vQ2().LLILLJJLI;
        if (room != null) {
            j = room.visibleScopeType;
        } else {
            j = 0;
        }
        int i4 = 0;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        Room room2 = subOnlyLiveSettingDialogVM.vQ2().LLILLJJLI;
        if (room2 != null && (owner2 = room2.getOwner()) != null && (subscribeInfo = owner2.getSubscribeInfo()) != null) {
            subSplitStatus = subscribeInfo.subSplitStatus;
        } else {
            subSplitStatus = null;
        }
        boolean zPY1 = iFansClubService.pY1(subSplitStatus);
        C782110Um9 c782110Um9 = new C782110Um9(c19eg);
        if (zPY1) {
            i = 2131856630;
        } else {
            i = 2131842845;
        }
        c782110Um9.LJIIZILJ(i);
        if (!z) {
            i2 = 2131844226;
        } else {
            i2 = 2131856075;
        }
        c782110Um9.LJII(i2);
        c782110Um9.LJIILIIL(2131842841, new InterfaceC743640TFa() { // from class: X.0JZG
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                int i5;
                liveDialog.dismiss();
                SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM2 = subOnlyLiveSettingDialogVM;
                subOnlyLiveSettingDialogVM2.getClass();
                if (SubVipSubOnlyLiveSetting.INSTANCE.isEnable()) {
                    Map<String, String> mapLIZ = C0KPJ.df.LIZ();
                    if (mapLIZ == null) {
                        mapLIZ = new HashMap<>();
                    }
                    C493830JYf c493830JYfLIZ = C0JYR.LIZ(mapLIZ);
                    C494680Jac.LJIJJLI(c493830JYfLIZ.LJ, c493830JYfLIZ.LJFF);
                    if (c493830JYfLIZ.LJFF > 0) {
                        subOnlyLiveSettingDialogVM2.withState(new C410001ic(subOnlyLiveSettingDialogVM2, 15, c493830JYfLIZ.LJFF, subOnlyLiveSettingDialogVM2.vQ2().LLILLL));
                    } else if (c493830JYfLIZ.LJ > 0) {
                        subOnlyLiveSettingDialogVM2.withState(new C410001ic(subOnlyLiveSettingDialogVM2, 16, c493830JYfLIZ.LJ, subOnlyLiveSettingDialogVM2.vQ2().LLILLL));
                    } else {
                        subOnlyLiveSettingDialogVM2.withState(new C410001ic(subOnlyLiveSettingDialogVM2, 10, 0L, subOnlyLiveSettingDialogVM2.vQ2().LLILLL));
                    }
                } else {
                    subOnlyLiveSettingDialogVM2.withState(new C410001ic(subOnlyLiveSettingDialogVM2, 10, 0L, subOnlyLiveSettingDialogVM2.vQ2().LLILLL));
                }
                C389001fE.LIZ("fan-club-manage-online-page-refresh", null, System.currentTimeMillis(), false);
                SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM3 = subOnlyLiveSettingDialogVM;
                subOnlyLiveSettingDialogVM3.wQ2(subOnlyLiveSettingDialogVM3.vQ2().LLILLL, "open");
                if (z) {
                    SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM4 = subOnlyLiveSettingDialogVM;
                    Room room3 = subOnlyLiveSettingDialogVM4.vQ2().LLILLJJLI;
                    if (room3 != null) {
                        i5 = (int) room3.visibleScopeType;
                    } else {
                        i5 = 0;
                    }
                    subOnlyLiveSettingDialogVM4.xQ2(i5, "click", "switch");
                }
            }
        });
        c782110Um9.LJIIJ(2131844245, new InterfaceC743640TFa() { // from class: X.0JZJ
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                int i5;
                subOnlyLiveSettingDialogVM.setState(new C0JZT());
                liveDialog.dismiss();
                SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM2 = subOnlyLiveSettingDialogVM;
                subOnlyLiveSettingDialogVM2.wQ2(subOnlyLiveSettingDialogVM2.vQ2().LLILLL, "cancel");
                if (z) {
                    SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM3 = subOnlyLiveSettingDialogVM;
                    Room room3 = subOnlyLiveSettingDialogVM3.vQ2().LLILLJJLI;
                    if (room3 != null) {
                        i5 = (int) room3.visibleScopeType;
                    } else {
                        i5 = 0;
                    }
                    subOnlyLiveSettingDialogVM3.xQ2(i5, "click", "cancel");
                }
            }
        });
        c782110Um9.LJIJI = new DialogInterface.OnCancelListener() { // from class: X.0JZV
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                subOnlyLiveSettingDialogVM.setState(new C0JZW());
            }
        };
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscriber_only_live_popup_show");
        c474500IjALIZ.LJIJJLI(subOnlyLiveSettingDialogVM.vQ2().LLILLL);
        c474500IjALIZ.LJJII(subOnlyLiveSettingDialogVM.vQ2().LL, "show_entrance");
        c474500IjALIZ.LJJII(subOnlyLiveSettingDialogVM.vQ2().LL, "click_position");
        Room room3 = subOnlyLiveSettingDialogVM.vQ2().LLILLJJLI;
        if (room3 != null) {
            lValueOf = Long.valueOf(room3.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        Room room4 = subOnlyLiveSettingDialogVM.vQ2().LLILLJJLI;
        if (room4 != null && (owner = room4.getOwner()) != null && owner.isAnchorHasSubQualification()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(1 ^ i3), "is_opt_in");
        c474500IjALIZ.LIZ();
        if (z) {
            Room room5 = subOnlyLiveSettingDialogVM.vQ2().LLILLJJLI;
            if (room5 != null) {
                i4 = (int) room5.visibleScopeType;
            }
            subOnlyLiveSettingDialogVM.xQ2(i4, "show", null);
        }
        subOnlyLiveSettingDialogVM.setState(new C0JZU());
        return Unit.LIZ;
    }
}
