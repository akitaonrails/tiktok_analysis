package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12Vm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19766812Vm extends AbstractC19670611xg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public C19U1 LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public final C1664750tQH LLJJ;
    public final String LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19766812Vm.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19766812Vm.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC19670711xh
    public final String getTag() {
        return this.LLJJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C19U1 c19u1 = (C19U1) requireViewById(R.id.oiy);
        this.LLJILJILJ = c19u1;
        C19U1 c19u12 = null;
        if (c19u1 == null) {
            c19u1 = null;
        }
        C19U0 c19u0NewTab = c19u1.newTab();
        C19U1 c19u13 = c19u0NewTab.LJII;
        if (c19u13 != null) {
            c19u0NewTab.LJFF(c19u13.getResources().getText(2131848921));
            c19u1.addTab(c19u0NewTab);
            C19U1 c19u14 = this.LLJILJILJ;
            if (c19u14 == null) {
                c19u14 = null;
            }
            C19U0 c19u0NewTab2 = c19u14.newTab();
            C19U1 c19u15 = c19u0NewTab2.LJII;
            if (c19u15 != null) {
                c19u0NewTab2.LJFF(c19u15.getResources().getText(2131848922));
                c19u14.addTab(c19u0NewTab2);
                C19U1 c19u16 = this.LLJILJILJ;
                if (c19u16 != null) {
                    c19u12 = c19u16;
                }
                c19u12.addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.12Vn
                    @Override // X.InterfaceC1586460rO0
                    public final void Yn(C19U0 c19u0) {
                    }

                    @Override // X.InterfaceC1586460rO0
                    public final void ih(C19U0 c19u0) {
                    }

                    @Override // X.InterfaceC1586460rO0
                    public final void Oq(C19U0 c19u0) {
                        if (c19u0 == null) {
                            return;
                        }
                        C19766812Vm c19766812Vm = this.LL;
                        C1664750tQH c1664750tQH = c19766812Vm.LLJJ;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C19766812Vm.LLJJIII;
                        boolean z = true;
                        JediViewModel jediViewModel = (JediViewModel) c1664750tQH.getValue(c19766812Vm, interfaceC2217461BqaArr[1]);
                        int i = c19u0.LJ;
                        jediViewModel.getClass();
                        jediViewModel.setStateImmediate(new AwS41S0001000_29(i, 22));
                        C19766812Vm c19766812Vm2 = this.LL;
                        C12VU c12vu = (C12VU) c19766812Vm2.LLJILLL.getValue(c19766812Vm2, interfaceC2217461BqaArr[0]);
                        if (c19u0.LJ != 0) {
                            z = false;
                        }
                        c12vu.Lu2(z);
                    }
                });
                BaseJediViewModel.iR2((BaseJediViewModel) this.LLJJ.getValue(this, LLJJIII[1]), this, new C2217381BqS() { // from class: X.12Vl
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((EditAdjustClipsBottomViewState) obj).isMusicSyncMode();
                    }
                }, new AwS608S0100000_29(this, 747));
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public C19766812Vm(C1DRG c1drg, C12VS c12vs) {
        super(c1drg, c12vs, R.id.iat);
        this.LLJILLL = C1664770tQJ.LIZ(this.LLJI, C12VU.class, null);
        this.LLJJ = C1664770tQJ.LIZ(this.LLJI, EditAdjustClipsBottomViewModel.class, null);
        this.LLJJI = "ModeSwitchScene";
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.sw, viewGroup, false);
    }
}
