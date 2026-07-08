package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookUEOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookNonMultiGuestEnableSetting;
import java.util.List;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: renamed from: X.14qC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20388614qC extends C09AY implements Function0<C20385014pc> {
    public final /* synthetic */ PlaybookAnchorViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20388614qC(PlaybookAnchorViewModel playbookAnchorViewModel) {
        super(0);
        this.LL = playbookAnchorViewModel;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.14pc] */
    @Override // kotlin.jvm.functions.Function0
    public final C20385014pc invoke() {
        final PlaybookAnchorViewModel playbookAnchorViewModel = this.LL;
        return new InterfaceC20387114px() { // from class: X.14pc
            @Override // X.InterfaceC20387114px
            public final void LIZ(List<PlaybookTagAggregation> list) {
                playbookAnchorViewModel.LLJJIJI.postValue(list);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set tagInfoList: ");
                sbLIZ.append(list);
                C20441214yg.LIZIZ("PlaybookAnchorViewModel", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC20387114px
            public final void LIZIZ(List<Playbook> list) {
                PlaybookAnchorViewModel playbookAnchorViewModel2 = playbookAnchorViewModel;
                playbookAnchorViewModel2.getClass();
                C500260Jjc.LJJLIIIJJIZ(new C173100lV(playbookAnchorViewModel2, list));
            }

            @Override // X.InterfaceC20387114px
            public final void LIZJ(boolean z) {
                playbookAnchorViewModel.LLJIJIL.postValue(Boolean.valueOf(z));
            }

            @Override // X.InterfaceC20387114px
            public final void LIZLLL(C20389914qP c20389914qP) {
                playbookAnchorViewModel.LLJJIII.postValue(c20389914qP);
            }

            @Override // X.InterfaceC20387114px
            public final void LJ(List<Playbook> list) {
                PlaybookAnchorViewModel playbookAnchorViewModel2 = playbookAnchorViewModel;
                playbookAnchorViewModel2.getClass();
                C500260Jjc.LJJLIIIJJIZ(new C173200lW(playbookAnchorViewModel2, list));
            }

            @Override // X.InterfaceC20387114px
            public final void LJFF(Long l) {
                playbookAnchorViewModel.LLJJ.postValue(l);
            }

            @Override // X.InterfaceC20387114px
            public final void LJI(C1158290gFP c1158290gFP) {
                playbookAnchorViewModel.LLJJIJIIJIL.postValue(c1158290gFP);
            }

            @Override // X.InterfaceC20387114px
            public final void LJII(int i, List<Playbook> list) {
                PlaybookAnchorViewModel playbookAnchorViewModel2 = playbookAnchorViewModel;
                playbookAnchorViewModel2.KQ2(i).postValue(list);
                if (!PlaybookNonMultiGuestEnableSetting.INSTANCE.enable() && !MultiGuestPlaybookUEOptSetting.INSTANCE.isEnable()) {
                    C500260Jjc.LJJLIIIJJIZ(new C173300lX(playbookAnchorViewModel2, list));
                } else {
                    playbookAnchorViewModel2.LLJILLL.postValue(list);
                }
            }
        };
    }
}
