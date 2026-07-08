package X;

import android.view.View;
import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinChildSwitchCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinSettingRadioCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinSettingSwitchCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinSwitchCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import kotlin.jvm.internal.AwS135S0201000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0P4H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4H implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
        }
    }

    public C0P4H(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onCheckedChanged$0(C0P4H c0p4h, CompoundButton compoundButton, boolean z) {
        String strI5;
        C127K c127k = ((BulletinChildSwitchCell) c0p4h.l0).LL;
        if (c127k != null) {
            c127k.setCellEnabled(false);
        }
        C127A c127a = ((BulletinChildSwitchCell) c0p4h.l0).LLILLJJLI;
        if (c127a != null) {
            c127a.LJIIJJI(true);
        }
        BulletinChildSwitchCell bulletinChildSwitchCell = (BulletinChildSwitchCell) c0p4h.l0;
        C0OJ6 c0oj6 = (C0OJ6) c0p4h.l1;
        bulletinChildSwitchCell.getClass();
        String str = c0oj6.LLIZ;
        if (str != null && (strI5 = BulletinChildSwitchCell.I5(c0oj6)) != null) {
            C604750Nnl.LIZ.getClass();
            C604750Nnl.LIZIZ(str, strI5, "bulletin_board_detail_page", z);
        }
        ((C0OJ6) c0p4h.l1).LLJ.invoke(Boolean.valueOf(z), ((BulletinChildSwitchCell) c0p4h.l0).itemView);
    }

    public static final void onCheckedChanged$1(C0P4H c0p4h, CompoundButton compoundButton, boolean z) {
        ((C1877307Wx) c0p4h.l0).getClass();
        if (z) {
            AnonymousClass1278 anonymousClass1278 = ((BulletinSettingRadioCell) c0p4h.l1).LLILLJJLI;
            if (anonymousClass1278 != null) {
                anonymousClass1278.LJIIJJI(true);
            }
            ((C1877307Wx) c0p4h.l0).getClass();
            throw null;
        }
    }

    public static final void onCheckedChanged$2(C0P4H c0p4h, CompoundButton compoundButton, boolean z) {
        InboxEntranceFunction inboxEntranceFunction;
        String str;
        BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) ((BulletinSettingSwitchCell) c0p4h.l0).LL.getValue();
        final BulletinSettingSwitchCell bulletinSettingSwitchCell = (BulletinSettingSwitchCell) c0p4h.l0;
        C617220OIu c617220OIu = bulletinSettingSwitchCell.LLILZ;
        final C127K c127k = (C127K) c0p4h.l1;
        bulletinProfileViewModel.TQ2(c617220OIu, new InterfaceC617070OIf() { // from class: X.0OJ2
            @Override // X.InterfaceC617070OIf
            public final void LIZ() {
                C1389890mGx c1389890mGx = new C1389890mGx(c127k);
                c1389890mGx.LJIIIZ(2131828035);
                c1389890mGx.LJIIJJI();
            }

            @Override // X.InterfaceC617070OIf
            public final void LIZIZ() {
                bulletinSettingSwitchCell.I5();
            }

            @Override // X.InterfaceC617070OIf
            public final void LIZJ() {
                C127A c127a = bulletinSettingSwitchCell.LLILLL;
                if (c127a != null) {
                    c127a.LJIIJJI(true);
                }
            }
        });
        BulletinSettingSwitchCell bulletinSettingSwitchCell2 = (BulletinSettingSwitchCell) c0p4h.l0;
        C617220OIu c617220OIu2 = bulletinSettingSwitchCell2.LLILZ;
        if (c617220OIu2 != null && (inboxEntranceFunction = c617220OIu2.LL) != null) {
            int i = inboxEntranceFunction.functionType;
            if (i == C0ORP.PIN.getType()) {
                if (inboxEntranceFunction.actionStatus == 0) {
                    str = "pin";
                } else {
                    str = "unpin";
                }
            } else if (i == C0ORP.MUTE.getType()) {
                if (inboxEntranceFunction.actionStatus == 0) {
                    str = "mute";
                } else {
                    str = "unmute";
                }
            } else {
                if (i != C0ORP.ARCHIVE.getType()) {
                    return;
                }
                if (inboxEntranceFunction.actionStatus == 0) {
                    str = "archive";
                } else {
                    str = "unarchive";
                }
            }
            Long l = ((BulletinProfileViewModel) bulletinSettingSwitchCell2.LL.getValue()).LLILLJJLI;
            if (l != null) {
                C0OPQ.LJIIIIZZ(C0OPQ.LIZ, String.valueOf(l.longValue()), str, ((BulletinProfileViewModel) bulletinSettingSwitchCell2.LL.getValue()).IE(), 0, null, 24);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0OIs] */
    public static final void onCheckedChanged$3(C0P4H c0p4h, CompoundButton compoundButton, boolean z) {
        BulletinFunctionSetting bulletinFunctionSetting;
        String str;
        BulletinFunctionSetting bulletinFunctionSetting2;
        BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) ((BulletinSwitchCell) c0p4h.l0).LL.getValue();
        final BulletinSwitchCell bulletinSwitchCell = (BulletinSwitchCell) c0p4h.l0;
        C617210OIt c617210OIt = bulletinSwitchCell.LLILZ;
        final C127K c127k = (C127K) c0p4h.l1;
        ?? r7 = new InterfaceC617070OIf() { // from class: X.0OIs
            @Override // X.InterfaceC617070OIf
            public final void LIZ() {
                C1389890mGx c1389890mGx = new C1389890mGx(c127k);
                c1389890mGx.LJIIIZ(2131828035);
                c1389890mGx.LJIIJJI();
            }

            @Override // X.InterfaceC617070OIf
            public final void LIZIZ() {
                bulletinSwitchCell.I5();
            }

            @Override // X.InterfaceC617070OIf
            public final void LIZJ() {
                C127A c127a = bulletinSwitchCell.LLILLL;
                if (c127a != null) {
                    c127a.LJIIJJI(true);
                }
            }
        };
        if (c617210OIt != null && (bulletinFunctionSetting2 = c617210OIt.LL) != null) {
            r7.LIZJ();
            int i = bulletinFunctionSetting2.status;
            if (bulletinFunctionSetting2.functionType == EnumC617170OIp.SHOW_CHANNEL_IN_PROFILE.getType()) {
                InterfaceC420801kM interfaceC420801kM = bulletinProfileViewModel.LLJILJIL;
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                int i2 = 1;
                if (i == 1) {
                    i2 = 0;
                }
                bulletinProfileViewModel.LLJILJIL = ((C0OIU) bulletinProfileViewModel.DQ2().getOperator()).LLLLIIIILLL(i2, new AwS135S0201000_9(i2, bulletinProfileViewModel, bulletinFunctionSetting2, 3), new AwS553S0100000_9((C617200OIs) r7, 1742));
            }
        }
        BulletinSwitchCell bulletinSwitchCell2 = (BulletinSwitchCell) c0p4h.l0;
        C617210OIt c617210OIt2 = bulletinSwitchCell2.LLILZ;
        if (c617210OIt2 != null && (bulletinFunctionSetting = c617210OIt2.LL) != null && bulletinFunctionSetting.functionType == EnumC617170OIp.SHOW_CHANNEL_IN_PROFILE.getType()) {
            if (bulletinFunctionSetting.status == 0) {
                str = "profile_invisible";
            } else {
                str = "profile_visible";
            }
            Long l = ((BulletinProfileViewModel) bulletinSwitchCell2.LL.getValue()).LLILLJJLI;
            if (l != null) {
                C0OPQ.LJIIIIZZ(C0OPQ.LIZ, String.valueOf(l.longValue()), str, ((BulletinProfileViewModel) bulletinSwitchCell2.LL.getValue()).IE(), 0, null, 24);
            }
        }
    }

    public static final void onCheckedChanged$4(C0P4H c0p4h, CompoundButton compoundButton, boolean z) {
        compoundButton.setTag((C635460OwC) c0p4h.l0);
        ((View.OnClickListener) c0p4h.l1).onClick(compoundButton);
    }
}
