package X;

import android.widget.CompoundButton;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardEditAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.create.BulletinBoardCreateAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinEditShowEntrypointCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkBenchSettingUnsubscribeSwitchCell;
import com.ss.android.ugc.aweme.inbox.workbench.view.filter.WorkBenchFilterCheckCell;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchSettingViewModel;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntryToggle;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.ss.android.ugc.aweme.share.improve.action.aidubbing.AIDubbingSheetFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS63S0210000_9;
import kotlin.jvm.internal.AwS69S0301000_9;
import kotlin.jvm.internal.AwS95S0201000_9;

/* JADX INFO: renamed from: X.0P4M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4M implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

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
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                break;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                break;
            case 7:
                onCheckedChanged$7(this, compoundButton, z);
                break;
        }
    }

    public C0P4M(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C0P4M c0p4m, CompoundButton compoundButton, boolean z) {
        ((BulletinBoardEditAssem) c0p4m.l0).Lo().LLJILJIL = z;
        C0OP5.LJI.LJIIJJI("show_on_profile");
    }

    public static final void onCheckedChanged$1(C0P4M c0p4m, CompoundButton compoundButton, boolean z) {
        int status;
        BulletinBizResourceEntryToggle item = ((BulletinEditShowEntrypointCell) c0p4m.l0).getItem();
        if (item != null) {
            BulletinEditShowEntrypointCell bulletinEditShowEntrypointCell = (BulletinEditShowEntrypointCell) c0p4m.l0;
            C127A c127a = bulletinEditShowEntrypointCell.LLILLL;
            if (c127a != null) {
                c127a.LJIIJJI(true);
            }
            AssemVMLazy assemVMLazy = bulletinEditShowEntrypointCell.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinEditShowEntrypointCell.LLILZ;
            BulletinBoardEditViewModel bulletinBoardEditViewModel = (BulletinBoardEditViewModel) assemVMLazy.getValue();
            int status2 = item.getStatus();
            EnumC618410ONj enumC618410ONj = EnumC618410ONj.RESOURCE_ENTRY_STATUS_OPEN;
            if (status2 == enumC618410ONj.getStatus()) {
                status = EnumC618410ONj.RESOURCE_ENTRY_STATUS_CLOSE.getStatus();
            } else {
                status = enumC618410ONj.getStatus();
            }
            bulletinBoardEditViewModel.withState(new AwS95S0201000_9(bulletinBoardEditViewModel, item, status, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Ovh] */
    public static final void onCheckedChanged$2(C0P4M c0p4m, CompoundButton compoundButton, boolean z) {
        int value;
        C635140Ovg item = ((WorkBenchSettingUnsubscribeSwitchCell) c0p4m.l0).getItem();
        if (item == null) {
            return;
        }
        AssemVMLazy assemVMLazy = ((WorkBenchSettingUnsubscribeSwitchCell) c0p4m.l0).LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = WorkBenchSettingUnsubscribeSwitchCell.LLILZ;
        WorkBenchSettingViewModel workBenchSettingViewModel = (WorkBenchSettingViewModel) assemVMLazy.getValue();
        final WorkBenchSettingUnsubscribeSwitchCell workBenchSettingUnsubscribeSwitchCell = (WorkBenchSettingUnsubscribeSwitchCell) c0p4m.l0;
        ?? r4 = new InterfaceC635170Ovj() { // from class: X.0Ovh
            @Override // X.InterfaceC635170Ovj
            public final void LIZ() {
                C1389890mGx c1389890mGx = new C1389890mGx(workBenchSettingUnsubscribeSwitchCell.itemView);
                c1389890mGx.LJIIIZ(2131828035);
                c1389890mGx.LJIIJJI();
            }

            @Override // X.InterfaceC635170Ovj
            public final void LIZIZ() {
                workBenchSettingUnsubscribeSwitchCell.I5();
            }

            @Override // X.InterfaceC635170Ovj
            public final void LIZJ(boolean z2) {
                C127A c127a = workBenchSettingUnsubscribeSwitchCell.LLILLL;
                if (c127a != null) {
                    c127a.LJIIJJI(z2);
                }
            }
        };
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            r4.LIZ();
            r4.LIZIZ();
        } else {
            r4.LIZJ(true);
            C635200Ovm c635200Ovm = new C635200Ovm();
            InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((LinkedHashMap) workBenchSettingViewModel.LLILZLL).get(c635200Ovm);
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            if (item.LLILLL) {
                value = EnumC635130Ovf.SUBSCRIBE.getValue();
            } else {
                value = EnumC635130Ovf.UNSUBSCRIBE.getValue();
            }
            workBenchSettingViewModel.LLILZLL.put(c635200Ovm, ((InterfaceC624050Odn) workBenchSettingViewModel.LL.getValue().getOperator()).A(item.LL, item.LLILLJJLI, new AwS69S0301000_9((C635150Ovh) r4, workBenchSettingViewModel, value, item, 0), new AwS553S0100000_9((C635150Ovh) r4, 1671), item.LLILLL));
        }
        C635080Ova c635080Ova = C635080Ova.LIZ;
        String str = item.LLILZIL;
        boolean z2 = !item.LLILLL;
        c635080Ova.getClass();
        C635080Ova.LIZIZ("setting_page", null, str, z2);
    }

    public static final void onCheckedChanged$3(C0P4M c0p4m, CompoundButton compoundButton, boolean z) {
        String str;
        String str2;
        AssemVMLazy assemVMLazy = ((WorkBenchFilterCheckCell) c0p4m.l0).LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = WorkBenchFilterCheckCell.LLILZ;
        WorkBenchViewModel workBenchViewModel = (WorkBenchViewModel) assemVMLazy.getValue();
        C623820OdQ item = ((WorkBenchFilterCheckCell) c0p4m.l0).getItem();
        if (item != null) {
            workBenchViewModel.withState(new AwS63S0210000_9(workBenchViewModel, item, z, 3));
        }
        C635080Ova c635080Ova = C635080Ova.LIZ;
        String strLIZ = C623900OdY.LIZ(((WorkBenchViewModel) ((WorkBenchFilterCheckCell) c0p4m.l0).LL.getValue()).LLILZ);
        C623820OdQ item2 = ((WorkBenchFilterCheckCell) c0p4m.l0).getItem();
        if (item2 == null || (str = item2.LLILLJJLI) == null) {
            str = "";
        }
        if (z) {
            str2 = "select";
        } else {
            str2 = "unselect";
        }
        c635080Ova.getClass();
        C635080Ova.LIZ(strLIZ, str, str2);
    }

    public static final void onCheckedChanged$4(C0P4M c0p4m, CompoundButton compoundButton, boolean z) {
        ((BulletinBoardCreateAssem) c0p4m.l0).Go().LLJILJIL = z;
        C0OP5.LJI.LJIIJJI("show_on_profile");
    }

    public static final void onCheckedChanged$5(C0P4M c0p4m, CompoundButton compoundButton, boolean z) {
        AIDubbingSheetFragment aIDubbingSheetFragment = (AIDubbingSheetFragment) c0p4m.l0;
        aIDubbingSheetFragment.LLIZ = z;
        AwS600S0100000_21 awS600S0100000_21 = aIDubbingSheetFragment.LLIZLLLIL;
        if (awS600S0100000_21 != null) {
            awS600S0100000_21.invoke(Boolean.valueOf(z));
        }
    }

    public static final void onCheckedChanged$6(C0P4M c0p4m, CompoundButton compoundButton, boolean z) {
        ((AuthorizedScope) c0p4m.l0).setEnabled(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$7(C0P4M c0p4m, CompoundButton compoundButton, boolean z) {
        ((C635800Owk) c0p4m.l0).LIZJ = z;
    }
}
