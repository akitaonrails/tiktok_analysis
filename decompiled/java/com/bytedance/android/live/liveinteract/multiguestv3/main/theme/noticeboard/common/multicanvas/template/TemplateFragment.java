package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template;

import X.C01GW;
import X.C086900Uh;
import X.C098200Yq;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C410901il;
import X.C452501pT;
import X.C786410Ut5;
import X.C934890aR5;
import X.C951190arN;
import X.C953230auf;
import X.C953550avB;
import X.C969900bLY;
import X.C969920bLa;
import X.C969940bLc;
import X.C969960bLe;
import X.C970010bLj;
import X.C970030bLl;
import X.C970050bLn;
import X.C970060bLo;
import X.C972080bP4;
import X.EnumC971610bOJ;
import X.InterfaceC915550Zvt;
import X.InterfaceC952790atx;
import X.InterfaceC952920auA;
import X.InterfaceC953310aun;
import X.InterfaceC953490av5;
import X.InterfaceC970140bLw;
import X.RunnableC781530UlD;
import Y.AcS496S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.TemplateFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS2S2200100_15;
import kotlin.jvm.internal.AwS52S0000100_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS69S0100100_15;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public final class TemplateFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzs7HELIOSLSgpZyE8PCwvLC08KTcoZyw8JSgjJ2E+PSk4ICwyJjMtOmEnLSg8JS4nLWsYLCIjJCQ4LAkhKSIhLCEn";
    public C969920bLa LL;
    public boolean LLILLJJLI;
    public EnumC971610bOJ LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public RunnableC781530UlD LLIZ;
    public View LLIZLLLIL;
    public long LLJIJIL;
    public Function0<Unit> LLJILJIL;
    public final C951190arN LLJ = new C951190arN();
    public final HashSet<Long> LLJI = new HashSet<>();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 351));
    public final C969960bLe LLJILLL = new InterfaceC915550Zvt() { // from class: X.0bLe
        @Override // X.InterfaceC915550Zvt
        public final void LIZ(Throwable th) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("editTemplate, download fail, throwable: ");
            sbLIZ.append(th);
            C20441214yg.LJIIIZ("TemplateFragment", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC915550Zvt
        public final void LIZIZ(C953770avX c953770avX) throws Throwable {
            DataChannel dataChannel;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("editTemplate, download success, templateId = ");
            sbLIZ.append(c953770avX.LJIIL);
            C20441214yg.LJIIIZ("TemplateFragment", C2188811AlT.LIZIZ(sbLIZ));
            Context context = this.LIZ.getContext();
            if (context == null) {
                return;
            }
            Function0<Unit> function0 = this.LIZ.LLJILJIL;
            if (function0 != null) {
                function0.invoke();
            }
            C969920bLa c969920bLa = this.LIZ.LL;
            if (c969920bLa != null) {
                dataChannel = c969920bLa.LIZJ;
            } else {
                dataChannel = null;
            }
            DialogC971210bNf dialogC971210bNf = new DialogC971210bNf(context, dataChannel, c953770avX, AFwS203S0000000_15.get$arr$(112));
            dialogC971210bNf.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this.LIZ, 8));
            dialogC971210bNf.show();
            C785410UrT.LIZIZ(dialogC971210bNf);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC971210bNf);
            C816490W1f.LIZ(dialogC971210bNf);
        }
    };
    public final C969900bLY LLJJ = new C969900bLY(this);
    public final C970030bLl LLJJI = new InterfaceC952790atx() { // from class: X.0bLl
        @Override // X.InterfaceC952790atx
        public final void LJ() {
            this.LIZ.MR();
            RunnableC781530UlD runnableC781530UlD = this.LIZ.LLIZ;
            if (runnableC781530UlD != null) {
                runnableC781530UlD.smoothScrollToPosition(0);
            }
        }
    };
    public final C970050bLn LLJJIII = new InterfaceC952920auA() { // from class: X.0bLn
        @Override // X.InterfaceC952920auA
        public final void LIZJ() {
            this.LIZ.MR();
        }
    };
    public final C970060bLo LLJJIJI = new InterfaceC953310aun() { // from class: X.0bLo
        @Override // X.InterfaceC953310aun
        public final void LIZIZ() {
            this.LIZ.MR();
        }
    };
    public final C969940bLc LLJJIJIIJIL = new InterfaceC953490av5() { // from class: X.0bLc
        @Override // X.InterfaceC953490av5
        public final void LIZ(long j) {
            AwS69S0100100_15 awS69S0100100_15 = new AwS69S0100100_15(j, this.LIZ, 3);
            C953230auf.LIZ.getClass();
            if (C953230auf.LIZIZ.size() >= C953230auf.LIZLLL) {
                C953230auf.LJIJ(this.LIZ.requireContext(), new AwS559S0100000_15(awS69S0100100_15, 352), AFwS203S0000000_15.get$arr$(113));
            } else {
                awS69S0100100_15.invoke();
            }
        }

        @Override // X.InterfaceC953490av5
        public final void LJFF(long j) {
            C953230auf c953230auf = C953230auf.LIZ;
            C970050bLn c970050bLn = this.LIZ.LLJJIII;
            c953230auf.getClass();
            C953230auf.LIZJ(j, c970050bLn);
        }

        @Override // X.InterfaceC953490av5
        public final void LJI(long j) {
            C953230auf c953230auf = C953230auf.LIZ;
            C970050bLn c970050bLn = this.LIZ.LLJJIII;
            c953230auf.getClass();
            C953230auf.LIZJ(j, c970050bLn);
        }

        @Override // X.InterfaceC953490av5
        public final void LIZJ(int i, String str) {
            C969900bLY c969900bLY = this.LIZ.LLJJ;
            c969900bLY.LIZ = i;
            C953230auf.LIZ.getClass();
            C953230auf.LIZ(str, c969900bLY);
        }

        @Override // X.InterfaceC953490av5
        public final void LIZLLL(int i, long j, String str) {
            C953230auf c953230auf = C953230auf.LIZ;
            C970060bLo c970060bLo = this.LIZ.LLJJIJI;
            c953230auf.getClass();
            C953230auf.LJIJI(str, j, i, c970060bLo);
        }

        @Override // X.InterfaceC953490av5
        public final void LJ(long j, String str, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo) {
            BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
            C176600m4.LIZJ(new AwS52S0000100_15(this.LIZ.LLJIJIL, 0));
            CloudDraftItemManager.LJFF(j, this.LIZ.LLJILLL, str, null, convertNoticeboardMaterialInfo);
            this.LIZ.LLJIJIL = j;
        }

        @Override // X.InterfaceC953490av5
        public final void LIZIZ(long j, String str, String str2, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo) {
            EnumC952890au7 enumC952890au7;
            EnumC952890au7 enumC952890au72;
            EnumC952890au7 enumC952890au73;
            C953100auS c953100auS;
            C953100auS c953100auS2;
            C953100auS c953100auS3;
            C953100auS c953100auS4;
            AwS2S2200100_15 awS2S2200100_15 = new AwS2S2200100_15(this.LIZ, j, str2, str, convertNoticeboardMaterialInfo, 1);
            C953610avH.LJJI.getClass();
            if (C953610avH.LJJIIJ != null && !C934890aR5.LIZ()) {
                TemplateFragment templateFragment = this.LIZ;
                C969920bLa c969920bLa = templateFragment.LL;
                EnumC952890au7 enumC952890au74 = null;
                if (c969920bLa != null && (c953100auS4 = c969920bLa.LIZLLL) != null) {
                    enumC952890au7 = c953100auS4.LIZJ;
                } else {
                    enumC952890au7 = null;
                }
                if (enumC952890au7 != EnumC952890au7.PREVIEW_SETTING) {
                    if (c969920bLa != null && (c953100auS3 = c969920bLa.LIZLLL) != null) {
                        enumC952890au72 = c953100auS3.LIZJ;
                    } else {
                        enumC952890au72 = null;
                    }
                    if (enumC952890au72 != EnumC952890au7.PREVIEW_BOARD_ICON) {
                        if (c969920bLa != null && (c953100auS2 = c969920bLa.LIZLLL) != null) {
                            enumC952890au73 = c953100auS2.LIZJ;
                        } else {
                            enumC952890au73 = null;
                        }
                        if (enumC952890au73 != EnumC952890au7.PREVIEW_PLAYBOOK) {
                            if (c969920bLa != null && (c953100auS = c969920bLa.LIZLLL) != null) {
                                enumC952890au74 = c953100auS.LIZJ;
                            }
                            if (enumC952890au74 != EnumC952890au7.PREVIEW_TOOLBAR_PLAYBOOK) {
                                C782110Um9 c782110Um9 = new C782110Um9(templateFragment.requireContext());
                                c782110Um9.LJIIZILJ(2131854957);
                                c782110Um9.LJII(2131854956);
                                c782110Um9.LJIILIIL(2131854980, new AcS496S0100000_15(awS2S2200100_15, 26));
                                c782110Um9.LJIILL = false;
                                c782110Um9.LJIIJ(2131854971, new InterfaceC743640TFa() { // from class: X.0bLr
                                    @Override // X.InterfaceC743640TFa
                                    public final void LIZ(LiveDialog liveDialog) {
                                        liveDialog.dismiss();
                                    }
                                });
                                C786410Ut5.E4(c782110Um9.LIZ());
                                return;
                            }
                        }
                    }
                }
            }
            awS2S2200100_15.invoke();
        }
    };

    static {
        new Object() { // from class: X.0bLv
        };
    }

    public final void MR() {
        InterfaceC970140bLw interfaceC970140bLw;
        C410901il c410901il = new C410901il();
        ArrayList arrayList = new ArrayList();
        C953230auf.LIZ.getClass();
        Iterator<NoticeboardTemplate> it2 = C953230auf.LIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        C953230auf.LIZ.getClass();
        List listLLIIII = C13LP.LLIIII(C953230auf.LIZJ);
        if (arrayList.isEmpty()) {
            if (!C934890aR5.LIZ()) {
                c410901il.add(new C970010bLj(0, 0));
            }
            c410901il.add(new C086900Uh());
        } else {
            if (!C934890aR5.LIZ()) {
                c410901il.add(new C970010bLj(0, arrayList.size()));
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                c410901il.add(new C953550avB(0, (NoticeboardTemplate) it3.next()));
            }
        }
        if (listLLIIII != null && (!listLLIIII.isEmpty())) {
            c410901il.add(new C970010bLj(1, 0));
            Iterator it4 = listLLIIII.iterator();
            while (it4.hasNext()) {
                c410901il.add(new C953550avB(1, (NoticeboardTemplate) it4.next()));
            }
        }
        C969920bLa c969920bLa = this.LL;
        if (c969920bLa != null && (interfaceC970140bLw = c969920bLa.LIZIZ) != null) {
            interfaceC970140bLw.LIZ();
        }
        this.LLJ.LLLII(c410901il);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
        CloudDraftItemManager.LIZ(this.LLJILLL);
        C953230auf c953230auf = C953230auf.LIZ;
        C969900bLY c969900bLY = this.LLJJ;
        c953230auf.getClass();
        C953230auf.LJIILL(c969900bLY);
        C953230auf.LJIILL(this.LLJJI);
        C953230auf.LJIILL(this.LLJJIII);
        C953230auf.LJIILL(this.LLJJIJI);
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0167  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.TemplateFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C972080bP4.LIZ(layoutInflater), R.layout.gcf, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
