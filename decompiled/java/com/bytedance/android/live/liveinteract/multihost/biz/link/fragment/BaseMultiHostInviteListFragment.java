package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.AbstractC960950b77;
import X.C098200Yq;
import X.C0UO0;
import X.C1117360fBO;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C15EQ;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16F5;
import X.C1776540wKa;
import X.C1844420y64;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1EOY;
import X.C20441214yg;
import X.C20484615Do;
import X.C2188811AlT;
import X.C410901il;
import X.C481090Itn;
import X.C497740JfY;
import X.C501540Jlg;
import X.C766270U4b;
import X.C772770UTb;
import X.C786410Ut5;
import X.C800330VaR;
import X.C915980Zwa;
import X.C924810aAp;
import X.C930940aKi;
import X.C943660afE;
import X.C943970afj;
import X.C945060ahU;
import X.C955400ayA;
import X.C955440ayE;
import X.C955510ayL;
import X.C955540ayO;
import X.C955590ayT;
import X.C955650ayZ;
import X.C956080azG;
import X.C956740b0K;
import X.C960020b5c;
import X.C960880b70;
import X.C960910b73;
import X.C962250b9D;
import X.C962490b9b;
import X.EnumC961060b7I;
import X.EnumC961230b7Z;
import X.InterfaceC19341710lj;
import X.InterfaceC21506019Ek;
import X.InterfaceC21676519sR;
import X.InterfaceC956060azE;
import X.InterfaceC956210azT;
import X.InterfaceC957060b0q;
import X.InterfaceC958410b31;
import X.InterfaceC961740b8O;
import X.InterfaceC962020b8q;
import X.InterfaceC978780bZs;
import X.RunnableC781530UlD;
import Y.ARunnableS115S0100000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.LivingNoticeManager;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostShowHistoryListSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostInviteListSectionOptSettings;
import com.bytedance.android.livesdkapi.depend.model.live.AgeRestricted;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS100S1000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseMultiHostInviteListFragment extends MultiCoHostInviteListContract$AbsView implements InterfaceC956060azE, InterfaceC956210azT, InterfaceC957060b0q, InterfaceC962020b8q, InterfaceC961740b8O, InterfaceC21506019Ek {
    public Function1<? super Long, Unit> LLJILJILJ;
    public View LLJILLL;
    public DataChannel LLJJ;
    public C11JF LLJJIII;
    public boolean LLJJIJIIJIL;
    public C955510ayL LLJJIJIL;
    public C16F5 LLJJJ;
    public LiveIconView LLJJJIL;
    public RunnableC781530UlD LLJJJJ;
    public View LLJJJJJIL;
    public C481090Itn LLJJJJLIIL;
    public C962490b9b LLJJL;
    public WeakReference<InterfaceC978780bZs> LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public InterfaceC958410b31 LLJLILLLLZIIL;
    public C1844420y64 LLJLLIL;
    public final C1117360fBO LLJJI = new C1117360fBO();
    public EnumC961060b7I LLJJIJI = EnumC961060b7I.Normal;
    public final List<Long> LLJLL = new ArrayList();

    public abstract void BS();

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void Kh(Throwable th) {
    }

    public abstract String getName();

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

    public static boolean zS() {
        if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1()) {
            return false;
        }
        if (!C915980Zwa.LJII().LJJIII()) {
            return (C924810aAp.LJ().LJJII == 0 || C915980Zwa.LJII().LJJLIIIJJI()) ? false : true;
        }
        C20441214yg.LIZIZ("BaseMultiHostInviteListFragment", "isShowMultiHint; enableCohostInMg=true");
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final boolean PR() {
        RunnableC781530UlD runnableC781530UlD = this.LLJJJJ;
        boolean z = false;
        if (runnableC781530UlD != null && runnableC781530UlD.getScrollState() == 0) {
            z = true;
        }
        return !z;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void SR() {
        this.LLJJI.notifyDataSetChanged();
        ES();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void aS() {
        if (this.mStatusViewValid) {
            C955650ayZ.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void iS() {
        C20484615Do c20484615Do;
        LiveSheetFragment liveSheetFragment = this.LLILLJJLI;
        if (liveSheetFragment == null || (c20484615Do = liveSheetFragment.LLJJIJIL) == null) {
            return;
        }
        c20484615Do.LIZ(1);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void nS() {
        C11JF c11jf = this.LLJJIII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIII = (C11JF) C11NZ.LJJJJLI(1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS184S0100000_15(this, 76));
    }

    @Override // X.InterfaceC21506019Ek
    public final void onBackStackChanged() {
        C410901il c410901il;
        AbstractC960950b77 abstractC960950b77;
        AbstractC960950b77 abstractC960950b772 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b772 == null || (c410901il = abstractC960950b772.LLJILJILJ) == null || !(!c410901il.isEmpty()) || !Intrinsics.LJFF(C943660afE.LIZJ(), this) || CoHostShowHistoryListSetting.INSTANCE.isEnable() || (abstractC960950b77 = (AbstractC960950b77) this.LLILLL) == null) {
            return;
        }
        abstractC960950b77.LJIILJJIL(this.LLJJIJI.getValue(), false);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void qS() {
        AbstractC960950b77 abstractC960950b77;
        if (this.mStatusViewValid && (abstractC960950b77 = (AbstractC960950b77) this.LLILLL) != null) {
            int size = abstractC960950b77.LLJILJILJ.size();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateAllBtnState, itemCount=");
            sbLIZ.append(size);
            C20441214yg.LJIIIZ("BaseMultiHostInviteListFragment", C2188811AlT.LIZIZ(sbLIZ));
            if (size > 0) {
                this.LLJJI.notifyItemRangeChanged(0, size);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void sS() {
        AbstractC960950b77 abstractC960950b77;
        if (this.mStatusViewValid && (abstractC960950b77 = (AbstractC960950b77) this.LLILLL) != null) {
            this.LLJJI.notifyItemChanged(abstractC960950b77.LLJILJIL, C1697810uHb.LJIILJJIL(1));
        }
    }

    public final void ES() {
        if (!zS()) {
            View viewYS = yS(false);
            if (viewYS != null) {
                C786410Ut5.LJLLLLLL(8, viewYS);
                return;
            }
            return;
        }
        View viewYS2 = yS(true);
        if (viewYS2 != null) {
            C786410Ut5.LJLLLLLL(0, viewYS2);
            C16F5 c16f5 = (C16F5) viewYS2.findViewById(R.id.zy5);
            LiveIconView liveIconView = null;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 0);
                c16f5.setText(getString(2131843683));
            } else {
                c16f5 = null;
            }
            this.LLJJJ = c16f5;
            LiveIconView liveIconView2 = (LiveIconView) viewYS2.findViewById(R.id.lou);
            if (liveIconView2 != null) {
                C786410Ut5.LLJJIJIL(liveIconView2, 0);
                liveIconView = liveIconView2;
            }
            this.LLJJJIL = liveIconView;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void ht() {
        C766270U4b.LIZLLL(2131843537);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.LLJLILLLLZIIL = null;
        getChildFragmentManager().LLD(this);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AgeRestricted ageRestricted;
        super.onResume();
        AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b77 != null) {
            abstractC960950b77.LJIILJJIL(this.LLJJIJI.getValue(), LiveCoHostInviteListSectionOptSettings.INSTANCE.isEnable());
        }
        C960020b5c.LIZ(null);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (ageRestricted = room.ageRestricted) == null || ageRestricted.ageInterval != 4) {
            return;
        }
        C766270U4b.LIZLLL(2131844071);
    }

    @Override // X.InterfaceC956210azT
    public final void Kc(Room room) {
        AbstractC960950b77 abstractC960950b77;
        if (this.mStatusViewValid && (abstractC960950b77 = (AbstractC960950b77) this.LLILLL) != null) {
            abstractC960950b77.LJIIJJI(room);
        }
    }

    @Override // X.InterfaceC961740b8O
    public final void bp(EnumC961230b7Z enumC961230b7Z) {
        AbstractC960950b77 abstractC960950b77;
        if (this.mStatusViewValid && (abstractC960950b77 = (AbstractC960950b77) this.LLILLL) != null) {
            if (enumC961230b7Z == EnumC961230b7Z.FRIEND_LIST_TYPE) {
                if (abstractC960950b77.LLILLJJLI) {
                    abstractC960950b77.LJJIJL(enumC961230b7Z);
                    C1117360fBO c1117360fBO = this.LLJJI;
                    int i = abstractC960950b77.LLILZ;
                    int i2 = abstractC960950b77.LLILLL;
                    c1117360fBO.notifyItemRangeInserted(i - i2, i2);
                    return;
                }
                abstractC960950b77.LJJIJIL(enumC961230b7Z);
                RunnableC781530UlD runnableC781530UlD = this.LLJJJJ;
                if (runnableC781530UlD != null) {
                    runnableC781530UlD.scrollToPosition(0);
                }
                RunnableC781530UlD runnableC781530UlD2 = this.LLJJJJ;
                if (runnableC781530UlD2 == null) {
                    return;
                }
                HandlerHook.viewPost(runnableC781530UlD2, new ARunnableS115S0100000_15(this, 63));
                return;
            }
            if (enumC961230b7Z == EnumC961230b7Z.MAY_KNOW_LIST_TYPE) {
                if (abstractC960950b77.LLILZIL) {
                    abstractC960950b77.LJJIJL(enumC961230b7Z);
                    C1117360fBO c1117360fBO2 = this.LLJJI;
                    int i3 = abstractC960950b77.LLIZ;
                    int i4 = abstractC960950b77.LLILZLL;
                    c1117360fBO2.notifyItemRangeInserted(i3 - i4, i4);
                    return;
                }
                abstractC960950b77.LJJIJIL(enumC961230b7Z);
                this.LLJJI.notifyDataSetChanged();
                return;
            }
            if (abstractC960950b77.LLJ) {
                abstractC960950b77.LJJIJL(enumC961230b7Z);
                C1117360fBO c1117360fBO3 = this.LLJJI;
                int i5 = abstractC960950b77.LLJIJIL;
                int i6 = abstractC960950b77.LLJI;
                c1117360fBO3.notifyItemRangeInserted(i5 - i6, i6);
                return;
            }
            abstractC960950b77.LJJIJIL(enumC961230b7Z);
            this.LLJJI.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC957060b0q
    public final void hk(C955590ayT c955590ayT) {
        AbstractC960950b77 abstractC960950b77;
        if (this.mStatusViewValid && (abstractC960950b77 = (AbstractC960950b77) this.LLILLL) != null) {
            abstractC960950b77.LJJIJ(c955590ayT);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void rS(int i) {
        if (!this.mStatusViewValid) {
            return;
        }
        this.LLJJI.notifyItemChanged(i, C1697810uHb.LJIILJJIL(1));
    }

    public final View wS(boolean z) {
        View view = (View) C962250b9D.LJIIIZ(this.LLJLIL, null, new AwS559S0100000_15(this, 396), R.id.mag, z);
        if (view == null) {
            return null;
        }
        this.LLJLIL = view;
        return view;
    }

    public final View yS(boolean z) {
        View view = (View) C962250b9D.LJIIIZ(this.LLJL, null, new AwS559S0100000_15(this, 397), R.id.oqz, z);
        if (view == null) {
            return null;
        }
        this.LLJL = view;
        return view;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void ZR(Throwable th, Room room) {
        InterfaceC958410b31 interfaceC958410b31;
        if (!this.mStatusViewValid) {
            return;
        }
        if (!(th instanceof MultiCoHostViolationException)) {
            C501540Jlg.LIZJ(getContext(), th);
        }
        if (((ArrayList) this.LLJLL).contains(Long.valueOf(room.getId())) && (interfaceC958410b31 = this.LLJLILLLLZIIL) != null) {
            interfaceC958410b31.LIZ(-1005, "invite blocked by server");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public void cS(int i, int i2) {
        this.LLJJI.notifyItemRangeInserted(i, i2);
    }

    @Override // X.InterfaceC956060azE
    public final void ns(C955590ayT c955590ayT, Room room) {
        AbstractC960950b77 abstractC960950b77;
        if (this.mStatusViewValid && (abstractC960950b77 = (AbstractC960950b77) this.LLILLL) != null) {
            abstractC960950b77.LJIIL(c955590ayT, room);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        C962490b9b c962490b9b;
        RunnableC781530UlD runnableC781530UlD;
        View viewFindViewById;
        C481090Itn c481090Itn;
        C16F5 c16f5;
        LiveIconView liveIconView;
        C1844420y64 c1844420y64;
        AbstractC21673719rz itemAnimator;
        AbstractC21673719rz itemAnimator2;
        Window window;
        boolean z;
        InterfaceC978780bZs interfaceC978780bZs;
        LivingNoticeManager livingNoticeManager;
        C945060ahU c945060ahU;
        C19EG activity;
        AbstractC21673719rz itemAnimator3;
        AbstractC21674919sB abstractC21674919sB;
        C19EG activity2;
        int right;
        int bottom;
        this.LLJJIJI = C960910b73.LJ(this.LLJJ);
        C19GS c19gs = null;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        this.LLJILLL = C943970afj.LIZIZ(layoutInflater, context, R.layout.giw, viewGroup);
        if (this.LLJ && (activity2 = getActivity()) != null) {
            View view = this.LLJILLL;
            if (view != null) {
                view.setBackground(C800330VaR.LIZIZ(activity2, R.drawable.duy));
            }
            View view2 = this.LLJILLL;
            if (view2 != null) {
                int left = view2.getLeft();
                int iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
                View view3 = this.LLJILLL;
                if (view3 != null) {
                    right = view3.getRight();
                } else {
                    right = 0;
                }
                View view4 = this.LLJILLL;
                if (view4 != null) {
                    bottom = view4.getBottom();
                } else {
                    bottom = 0;
                }
                view2.setPadding(left, iLIZIZ, right, bottom);
            }
        }
        View view5 = this.LLJILLL;
        if (view5 != null) {
            c962490b9b = (C962490b9b) view5.findViewById(R.id.kzs);
        } else {
            c962490b9b = null;
        }
        this.LLJJL = c962490b9b;
        View view6 = this.LLJILLL;
        if (view6 != null) {
            runnableC781530UlD = (RunnableC781530UlD) view6.findViewById(R.id.kzt);
        } else {
            runnableC781530UlD = null;
        }
        this.LLJJJJ = runnableC781530UlD;
        View view7 = this.LLJILLL;
        if (view7 != null) {
            viewFindViewById = view7.findViewById(R.id.kzq);
        } else {
            viewFindViewById = null;
        }
        this.LLJJJJJIL = viewFindViewById;
        View view8 = this.LLJILLL;
        if (view8 != null) {
            c481090Itn = (C481090Itn) view8.findViewById(R.id.kzr);
        } else {
            c481090Itn = null;
        }
        this.LLJJJJLIIL = c481090Itn;
        View view9 = this.LLJILLL;
        if (view9 != null) {
            c16f5 = (C16F5) view9.findViewById(R.id.zy5);
        } else {
            c16f5 = null;
        }
        this.LLJJJ = c16f5;
        View view10 = this.LLJILLL;
        if (view10 != null) {
            liveIconView = (LiveIconView) view10.findViewById(R.id.lou);
        } else {
            liveIconView = null;
        }
        this.LLJJJIL = liveIconView;
        View view11 = this.LLJILLL;
        if (view11 != null) {
            c1844420y64 = (C1844420y64) view11.findViewById(R.id.kzp);
        } else {
            c1844420y64 = null;
        }
        this.LLJLLIL = c1844420y64;
        RunnableC781530UlD runnableC781530UlD2 = this.LLJJJJ;
        if (runnableC781530UlD2 != null) {
            runnableC781530UlD2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RunnableC781530UlD runnableC781530UlD3 = this.LLJJJJ;
        if (runnableC781530UlD3 != null) {
            itemAnimator = runnableC781530UlD3.getItemAnimator();
        } else {
            itemAnimator = null;
        }
        if (itemAnimator instanceof AbstractC21674919sB) {
            RunnableC781530UlD runnableC781530UlD4 = this.LLJJJJ;
            if (runnableC781530UlD4 != null) {
                itemAnimator3 = runnableC781530UlD4.getItemAnimator();
            } else {
                itemAnimator3 = null;
            }
            if (itemAnimator3 instanceof AbstractC21674919sB) {
                abstractC21674919sB = (AbstractC21674919sB) itemAnimator3;
            } else {
                abstractC21674919sB = null;
            }
            if (abstractC21674919sB != null) {
                abstractC21674919sB.LLIZ = false;
            }
        }
        RunnableC781530UlD runnableC781530UlD5 = this.LLJJJJ;
        if (runnableC781530UlD5 != null) {
            runnableC781530UlD5.setAdapter(this.LLJJI);
        }
        BS();
        RunnableC781530UlD runnableC781530UlD6 = this.LLJJJJ;
        if (runnableC781530UlD6 != null) {
            runnableC781530UlD6.LIZLLL();
        }
        RunnableC781530UlD runnableC781530UlD7 = this.LLJJJJ;
        if (runnableC781530UlD7 != null) {
            itemAnimator2 = runnableC781530UlD7.getItemAnimator();
        } else {
            itemAnimator2 = null;
        }
        if (itemAnimator2 instanceof AbstractC21674919sB) {
            ((AbstractC21674919sB) itemAnimator2).LLIZ = false;
        }
        LiveSheetFragment liveSheetFragment = this.LLILLJJLI;
        if (liveSheetFragment != null && (activity = liveSheetFragment.getActivity()) != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        RunnableC781530UlD runnableC781530UlD8 = this.LLJJJJ;
        if (runnableC781530UlD8 != null) {
            runnableC781530UlD8.addOnScrollListener(new C772770UTb(C1EOY.LIZ.LIZIZ("panel_broadcast_link_slide"), window));
        }
        List<Long> listLJII = C962250b9D.LJII(this.LLJJ);
        this.LLILZLL = ((Number) ListProtector.get(listLJII, 0)).longValue();
        boolean z2 = true;
        this.LLILZ = ((Number) ListProtector.get(listLJII, 1)).longValue();
        this.LLILZIL = ((Number) ListProtector.get(listLJII, 2)).longValue();
        DataChannel dataChannel = this.LLJJ;
        if (dataChannel != null && (c945060ahU = (C945060ahU) dataChannel.gg0(C956740b0K.class)) != null && c945060ahU.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C915980Zwa.LJI().LIZ().LJJJZ();
            z2 = false;
        }
        this.LLIZ = z2;
        DataChannel dataChannel2 = this.LLJJ;
        if (dataChannel2 != null) {
            dataChannel2.SX0(C956740b0K.class, new C945060ahU(false, 0L, false));
        }
        DataChannel dataChannel3 = this.LLJJ;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, IsViewerLimitedStatusChannel.class, new AwS594S0100000_15(this, 471));
        }
        RunnableC781530UlD runnableC781530UlD9 = this.LLJJJJ;
        if (runnableC781530UlD9 != null) {
            runnableC781530UlD9.setItemAnimator(new C15EQ());
        }
        RunnableC781530UlD runnableC781530UlD10 = this.LLJJJJ;
        if (runnableC781530UlD10 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                livingNoticeManager = new LivingNoticeManager(context2);
            } else {
                livingNoticeManager = null;
            }
            runnableC781530UlD10.setLayoutManager(livingNoticeManager);
        }
        Map<String, C955440ayE> map = C956080azG.LIZ;
        final RunnableC781530UlD runnableC781530UlD11 = this.LLJJJJ;
        String name = getName();
        if (C956080azG.LIZLLL && runnableC781530UlD11 != null && ((LinkedHashMap) C956080azG.LIZ).get("event_cohost_show_invitation_list") != null) {
            final AwS100S1000000_15 awS100S1000000_15 = new AwS100S1000000_15(name, 10);
            runnableC781530UlD11.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0b80
                @Override // X.InterfaceC21676519sR
                public final void m3(View view12) {
                }

                @Override // X.InterfaceC21676519sR
                public final void g5(View view12) {
                    runnableC781530UlD11.removeOnChildAttachStateChangeListener(this);
                    C786410Ut5.y3(view12.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC987020bnA(view12, awS100S1000000_15, 1));
                }
            });
        }
        C955400ayA.LJIL = System.currentTimeMillis();
        if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).t42()) {
            AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
            if (abstractC960950b77 != null) {
                abstractC960950b77.LJJIIJZLJL();
            }
        } else {
            AbstractC960950b77 abstractC960950b772 = (AbstractC960950b77) this.LLILLL;
            if (abstractC960950b772 != null) {
                abstractC960950b772.LJJIIJ();
            }
        }
        View view12 = this.LLJJJJJIL;
        if (view12 != null) {
            C786410Ut5.LJLLLLLL(0, view12);
        }
        this.LLJJIJIIJIL = false;
        C481090Itn c481090Itn2 = this.LLJJJJLIIL;
        if (c481090Itn2 != null) {
            c481090Itn2.setOnRefreshListener(new InterfaceC19341710lj() { // from class: X.0b7A
                @Override // X.InterfaceC19341710lj
                public final void LJFF() {
                    BaseMultiHostInviteListFragment baseMultiHostInviteListFragment = this.LL;
                    if (baseMultiHostInviteListFragment.LLJJIJIIJIL) {
                        return;
                    }
                    baseMultiHostInviteListFragment.LLJJIJIIJIL = true;
                    baseMultiHostInviteListFragment.LLILZLL = 0L;
                    JSONObject jSONObject = new JSONObject();
                    C0K04.LJFF("from", "refresh", jSONObject);
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                    C0K04.LJFF("room_id", room != null ? room.getIdStr() : null, jSONObject);
                    Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                    C0K04.LJFF("record_id", room2 != null ? room2.getIdStr() : null, jSONObject);
                    Room room3 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                    C0K04.LJ("user_id", room3 != null ? room3.getOwnerUserId() : 0L, jSONObject);
                    BaseMultiHostInviteListFragment baseMultiHostInviteListFragment2 = this.LL;
                    baseMultiHostInviteListFragment2.LLJJIJI = C960910b73.LJ(baseMultiHostInviteListFragment2.LLJJ);
                    C955400ayA c955400ayA = C955400ayA.LIZ;
                    HashMap map2 = new HashMap();
                    C955400ayA.LJIIL(c955400ayA, map2, null, true, 10);
                    C955400ayA.LLIILII("livesdk_connection_list_refresh", map2);
                    BaseMultiHostInviteListFragment baseMultiHostInviteListFragment3 = this.LL;
                    AbstractC960950b77 abstractC960950b773 = (AbstractC960950b77) baseMultiHostInviteListFragment3.LLILLL;
                    if (abstractC960950b773 != null) {
                        abstractC960950b773.LJIILJJIL(baseMultiHostInviteListFragment3.LLJJIJI.getValue(), false);
                    }
                    AbstractC960950b77 abstractC960950b774 = (AbstractC960950b77) this.LL.LLILLL;
                    if (abstractC960950b774 != null) {
                        abstractC960950b774.LJJIJIIJI();
                    }
                }
            });
        }
        T t = this.LLILLL;
        if (t != 0) {
            t.onCreate();
        }
        WeakReference<InterfaceC978780bZs> weakReference = this.LLJJLIIIJLLLLLLLZ;
        if (weakReference != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZ();
        }
        if (this.LLJ) {
            C1844420y64 c1844420y642 = this.LLJLLIL;
            if (c1844420y642 != null) {
                int visibility = c1844420y642.getVisibility();
                c1844420y642.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c1844420y642);
            }
            C962250b9D.LIZ(this.LLJJL, false);
        }
        View view13 = this.LLJILLL;
        if (!(view13 instanceof View)) {
            view13 = null;
        }
        if (view13 != null) {
            try {
                ViewTreeLifecycleOwner.set(view13, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view13, this);
                view13.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity3 = getActivity();
                if (activity3 instanceof C19GS) {
                    c19gs = (C19GS) activity3;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view13;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view13;
    }

    @Override // X.InterfaceC956210azT
    public final void GP(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j) {
        if (!this.mStatusViewValid) {
            return;
        }
        C960880b70.LIZ(c955590ayT, getContext(), this.LLJJ);
        AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b77 != null) {
            abstractC960950b77.LJIIIZ(c955590ayT, c955540ayO, z, j);
        }
    }

    @Override // X.InterfaceC956060azE
    public final void ce(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j, InterfaceC958410b31 interfaceC958410b31) {
        long id;
        if (!this.mStatusViewValid) {
            return;
        }
        Function1<? super Long, Unit> function1 = this.LLJILJILJ;
        if (function1 != null) {
            User owner = c955590ayT.LJ.getOwner();
            if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            function1.invoke(Long.valueOf(id));
        }
        AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b77 != null) {
            abstractC960950b77.LJIJJ(c955590ayT, c955540ayO, z, j);
        }
        if (interfaceC958410b31 != null) {
            this.LLJLILLLLZIIL = interfaceC958410b31;
            ((ArrayList) this.LLJLL).add(Long.valueOf(c955590ayT.LJ.getId()));
        }
    }
}
