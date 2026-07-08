package com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.inviter.view;

import X.C01HZ;
import X.C098200Yq;
import X.C0R9K;
import X.C1117360fBO;
import X.C1161920gLG;
import X.C13BV;
import X.C1685300txQ;
import X.C1776540wKa;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C410901il;
import X.C475510Ikn;
import X.C497740JfY;
import X.C498540Jgq;
import X.C786410Ut5;
import X.C915900ZwS;
import X.C915980Zwa;
import X.C977620bY0;
import X.C977820bYK;
import X.C978340bZA;
import X.C978520bZS;
import X.C978750bZp;
import X.C978980baC;
import X.C979480bb0;
import X.C979490bb1;
import X.C979500bb2;
import X.C979520bb4;
import X.C979690bbL;
import X.C979750bbR;
import X.EnumC499801x6;
import X.EnumC975850bV9;
import X.InterfaceC1844530y6F;
import X.InterfaceC21506019Ek;
import X.InterfaceC975870bVB;
import X.InterfaceC978780bZs;
import X.RunnableC781530UlD;
import Y.ARunnableS115S0100000_15;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TwoMatchInviterFragmentV2 extends TwoMatchInviterContract$View implements InterfaceC21506019Ek, InterfaceC1844530y6F {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCwjJ2EnHELIOSPyohKDswIGsvJiAhLCwiKDs8OmslJzk6PCA+Zzk6LTJiHTg8BSQ4KicaJjMlPSohDjctLiI2JjEaew==";
    public C977620bY0 LLILZ;
    public int LLILZIL;
    public C979500bb2 LLILZLL;
    public C979750bbR LLIZ;
    public RunnableC781530UlD LLIZLLLIL;
    public View LLJI;
    public TextView LLJIJIL;
    public View LLJILJIL;
    public C979480bb0 LLJILLL;
    public DataChannel LLJJ;
    public C979690bbL LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJIIJIL;
    public TuxPanel LLJJIJIL;
    public final C1117360fBO LLJ = new C1117360fBO();
    public List<? extends C498540Jgq> LLJILJILJ = C13BV.INSTANCE;
    public final long LLJJIJI = System.currentTimeMillis();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        return PR(null);
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeCancelled() {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeProgressed(C1776540wKa c1776540wKa) {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    @Override // X.InterfaceC1844530y6F
    public final void Qp() {
        C977620bY0 c977620bY0 = this.LLILZ;
        if (c977620bY0 != null) {
            c977620bY0.LJIILLIIL();
        }
        C0R9K.LIZ(this.LLIZLLLIL, new ARunnableS115S0100000_15(this, 37));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        WeakReference<InterfaceC978780bZs> weakReference;
        InterfaceC978780bZs interfaceC978780bZs;
        InterfaceC975870bVB interfaceC975870bVBLJFF;
        C20441214yg.LIZIZ("TwoMatchInvitePanelV2", "onDestroy");
        TuxPanel tuxPanel = this.LLJJIJIL;
        if (tuxPanel != null) {
            tuxPanel.dismiss();
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zQ2(this);
        }
        getChildFragmentManager().LLD(this);
        this.LLJILJILJ = C13BV.INSTANCE;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        C977620bY0 c977620bY0 = this.LLILZ;
        if (c977620bY0 != null) {
            c977620bY0.LJIJJLI.setValue(new C977820bYK(new C410901il(), 0, 0, 14, 0));
            c977620bY0.LJJIFFI.LJFF();
            c977620bY0.LJJ.setValue(0);
            c977620bY0.LJJIJIL = new C979520bb4(-1, -1);
        }
        this.LLILZIL = 0;
        if (this.LLJJI != null && (interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF()) != null) {
            interfaceC975870bVBLJFF.LIZ();
        }
        C979690bbL c979690bbL = this.LLJJI;
        if (c979690bbL != null && (weakReference = c979690bbL.LIZ) != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZIZ(this.LLJJIII);
        }
        super.onDestroy();
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("match_panel"));
        }
        C01HZ c01hzKi12 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi12 != null) {
            c01hzKi12.LIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("match_icon"));
        }
    }

    @Override // X.InterfaceC21506019Ek
    public final void onBackStackChanged() {
        C979490bb1 c979490bb1;
        if (isVisible()) {
            C979480bb0 c979480bb0 = this.LLJILLL;
            if (c979480bb0 != null && (c979490bb1 = c979480bb0.LJIIL) != null) {
                C979480bb0 c979480bb02 = c979490bb1.LLILZIL;
                C978750bZp c978750bZp = new C978750bZp(c979490bb1.LLILZIL.LIZIZ);
                C979480bb0 c979480bb03 = c979490bb1.LLILZIL;
                c978750bZp.LIZJ(false);
                c978750bZp.LIZ(c979490bb1.itemView, c979480bb03.LJIIIZ, new AwS559S0100000_15(c979480bb03, 1017));
                Text textLJI = C978520bZS.LJI();
                if (textLJI == null) {
                    textLJI = new Text();
                    textLJI.defaultPattern = "";
                }
                c978750bZp.LJFF(false, textLJI, true);
                c979480bb02.LJIILLIIL = c978750bZp;
            }
            this.LL.uC(1, this.LLILZIL);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C978340bZA.LIZLLL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getChildFragmentManager().LLD(this);
        this.LL.Ja(this);
    }

    public final C978980baC PR(Function0<Unit> function0) {
        EnumC975850bV9 enumC975850bV9;
        int i;
        C979500bb2 c979500bb2 = this.LLILZLL;
        ComposeView composeViewLIZIZ = null;
        if (c979500bb2 != null) {
            enumC975850bV9 = c979500bb2.LJFF;
        } else {
            enumC975850bV9 = null;
        }
        if (enumC975850bV9 == EnumC975850bV9.INVITER_FROM_FRIEND_RANK) {
            i = 2131855551;
        } else {
            i = 2131843042;
        }
        C978980baC c978980baC = new C978980baC();
        c978980baC.LJIILIIL = false;
        c978980baC.LIZIZ = true;
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(i));
        c978980baC.LJIIIIZZ = true;
        C979480bb0 c979480bb0 = this.LLJILLL;
        if (c979480bb0 != null) {
            composeViewLIZIZ = c979480bb0.LJIILLIIL.LIZIZ(c979480bb0.LJIIJJI, c979480bb0.LJIIIIZZ, c979480bb0.LJIIIZ, true);
        }
        c978980baC.LJII = composeViewLIZIZ;
        c978980baC.LJIIJ = new AwS416S0200000_15(this, (TwoMatchInviterFragmentV2) function0, (Function0<Unit>) 14);
        c978980baC.LJIIJJI = new AwS416S0200000_15(this, (TwoMatchInviterFragmentV2) function0, (Function0<Unit>) 15);
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LIZIZ();
        return c978980baC;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RR(java.lang.String r12) {
        /*
            r11 = this;
            X.0fBO r0 = r11.LLJ
            java.util.List<?> r0 = r0.LL
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C979040baI
            if (r0 == 0) goto Ld
            r3.add(r1)
            goto Ld
        L1f:
            java.lang.Object r1 = X.C13LP.LJJJLL(r3)
            X.0baI r1 = (X.C979040baI) r1
            X.0bbL r0 = r11.LLJJI
            if (r0 == 0) goto L60
            boolean r0 = r0.LIZJ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2f:
            boolean r2 = X.C176600m4.LIZIZ(r0)
            java.lang.String r3 = "match_panel"
            if (r1 == 0) goto L5e
            int r0 = r1.LIZ
            r4 = 1
            if (r0 != r4) goto L5e
        L3c:
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0bVB r0 = r0.LJFF()
            if (r0 == 0) goto L5c
            java.util.List r0 = r0.LJ()
            if (r0 == 0) goto L5c
            int r5 = r0.size()
        L50:
            r7 = 1000(0x3e8, float:1.401E-42)
            com.bytedance.ies.sdk.datachannel.DataChannel r8 = r11.LLJJ
            r9 = 0
            r10 = 704(0x2c0, float:9.87E-43)
            r6 = r12
            X.C978350bZB.LIZIZ(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L5c:
            r5 = 0
            goto L50
        L5e:
            r4 = 0
            goto L3c
        L60:
            r0 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.inviter.view.TwoMatchInviterFragmentV2.RR(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b A[PHI: r5
      0x013b: PHI (r5v6 long) = (r5v5 long), (r5v17 long) binds: [B:56:0x0133, B:58:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0Jgq[], java.lang.Object[]] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.inviter.view.TwoMatchInviterFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gcv, viewGroup, false);
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
