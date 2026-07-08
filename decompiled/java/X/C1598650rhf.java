package X;

import Y.ARunnableS124S0100000_24;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.bean.MixRankSkylightItem;
import com.ss.android.ugc.aweme.bean.MixRankSkylightResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.inbox.ab.Meta;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.item.StoryCacheData;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS110S0110000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rhf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598650rhf extends AbstractC1903430zdF<InboxHorizontalTopListCombinePod> implements InterfaceC724530SbT, InterfaceC1598970riB, InterfaceC1508640pMU {
    public static final /* synthetic */ int LLJZ = 0;
    public final Fragment LLJ;
    public final String LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C994590bzN LLJJJJ;
    public final C1600450rkZ LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final C1598800rhu LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final InterfaceC899440ZQg LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public C1597950rgX LLJLLL;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "SkylightContainerVH";
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final List<C0ZP4> T5() {
        return (List) this.LLJLILLLLZIIL.getValue();
    }

    public final IInboxLiveService U5() {
        return (IInboxLiveService) this.LLJILLL.getValue();
    }

    public final SkylightListViewModel V5() {
        return (SkylightListViewModel) this.LLJJIJIL.getValue();
    }

    public final void W5() {
        if (this.LLJIJIL <= 0 || !((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4().LJIILIIL("livesdk_enter_message_window")) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("request_id", "");
        c2344009Gk.LIZLLL(jCurrentTimeMillis - this.LLJILJILJ, "live_cell_load_time");
        c2344009Gk.LJIIIIZZ("enter_from_merge", "message");
        c2344009Gk.LJIIIIZZ("enter_method", "live_cover");
        int i = 1;
        if (!this.itemView.canScrollHorizontally(1) && !this.itemView.canScrollHorizontally(-1)) {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_draw");
        C20684815ws.LJIILLIIL("livesdk_enter_message_window", c2344009Gk.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
    
        if (r1 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r0 != null) goto L8;
     */
    @Override // androidx.lifecycle.LifecycleOwner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.lifecycle.Lifecycle getLifecycle() {
        /*
            r2 = this;
            boolean r0 = X.C1591220rVg.LIZLLL()
            if (r0 == 0) goto L11
            androidx.fragment.app.Fragment r0 = r2.LLJ
            if (r0 == 0) goto L65
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
        Le:
            if (r0 == 0) goto L65
        L10:
            return r0
        L11:
            boolean r0 = X.C07OD.LIZ()
            if (r0 == 0) goto L36
            androidx.fragment.app.Fragment r0 = r2.LLJ
            if (r0 == 0) goto L2d
            X.0mCc r0 = X.C520040KaQ.LIZIZ(r0)
            if (r0 == 0) goto L2d
            androidx.lifecycle.LifecycleOwner r0 = r0.LJFF()
            if (r0 == 0) goto L2d
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 != 0) goto L10
        L2d:
            androidx.fragment.app.Fragment r0 = r2.LLJ
            if (r0 == 0) goto L65
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            goto Le
        L36:
            X.0rkZ r0 = r2.LLJJJJJIL
            android.content.Context r0 = r0.getContext()
            androidx.lifecycle.LifecycleOwner r1 = X.C0SY5.LIZIZ(r0)
            if (r1 == 0) goto L65
            boolean r0 = r1 instanceof X.C199Y
            if (r0 == 0) goto L60
            boolean r0 = r1 instanceof X.InterfaceC1711206n0
            if (r0 == 0) goto L60
            X.19EG r1 = (X.C19EG) r1
            boolean r0 = r1 instanceof X.C199Y
            if (r0 == 0) goto L65
            X.15ms r1 = (X.InterfaceC20622815ms) r1
            X.198i r1 = X.C20629915o1.LIZ(r1)
            if (r1 == 0) goto L65
            boolean r0 = r1 instanceof X.C0J5E
            if (r0 == 0) goto L65
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L65
        L60:
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            goto Le
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "cannot get lifecycle from context"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598650rhf.getLifecycle():androidx.lifecycle.Lifecycle");
    }

    @Override // X.InterfaceC1598970riB
    public final String LJJJJJ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1598970riB
    public final /* bridge */ /* synthetic */ C1600450rkZ LLZZJLIL() {
        return this.LLJJJJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    @Override // X.InterfaceC1598970riB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIIII(boolean r8) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598650rhf.LLLIIII(boolean):void");
    }

    @Override // X.AbstractC1903430zdF
    public final void R5(AbstractC895380ZAq abstractC895380ZAq) {
        boolean z;
        boolean z2;
        Integer numValueOf;
        String strLIZIZ;
        List<MixRankSkylightItem> skylightItems;
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = (InboxHorizontalTopListCombinePod) abstractC895380ZAq;
        SystemClock.uptimeMillis();
        C1598660rhg.LIZ.getClass();
        C1598730rhn c1598730rhn = C1598660rhg.LIZLLL;
        c1598730rhn.getClass();
        c1598730rhn.LJ = System.currentTimeMillis();
        C1598660rhg.LJ.LIZJ(3);
        inboxHorizontalTopListCombinePod.isDefault();
        Set<Long> inboxCellMobSet = U5().getInboxCellMobSet();
        if (inboxCellMobSet != null) {
            inboxCellMobSet.clear();
        }
        C1599330ril.LIZ.getClass();
        C1599330ril.LIZJ.clear();
        if (!Intrinsics.LJFF(V5().LLJJIJI, this.LLJJJJJIL)) {
            V5().setListState(this.LLJJJJJIL.getState());
            if (((Meta) C1599610rjD.LIZIZ.getValue()).fixed) {
                V5().LLJJIJI = this.LLJJJJJIL;
            } else {
                V5().LLJJIJI = this.LLJJJJJIL;
            }
            this.LLJJJJJIL.LJIIL(V5().getConfig());
        }
        Long liveResponseTime = inboxHorizontalTopListCombinePod.getLiveResponseTime();
        if (liveResponseTime != null) {
            this.LLJILJILJ = liveResponseTime.longValue();
        }
        this.LLJIJIL = inboxHorizontalTopListCombinePod.getLiveNotices().size();
        SkylightListViewModel skylightListViewModelV5 = V5();
        skylightListViewModelV5.LLJILLL = hashCode();
        boolean zIsDefault = inboxHorizontalTopListCombinePod.isDefault();
        if (skylightListViewModelV5.LLJJI != null && Intrinsics.LJFF(inboxHorizontalTopListCombinePod, skylightListViewModelV5.FQ2())) {
            z = true;
        } else {
            z = false;
        }
        if (!zIsDefault && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightListViewModel.onBindData: shouldRefresh=");
        sbLIZ.append(z2);
        sbLIZ.append(" isDefault=");
        sbLIZ.append(zIsDefault);
        sbLIZ.append(" isSamePod=");
        sbLIZ.append(z);
        sbLIZ.append(" combinePod.mixRankSkylightData=");
        Long l = null;
        if (inboxHorizontalTopListCombinePod.getMixRankSkylightData() == null) {
            strLIZIZ = "NULL";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("items=");
            MixRankSkylightResponse mixRankSkylightData = inboxHorizontalTopListCombinePod.getMixRankSkylightData();
            if (mixRankSkylightData != null && (skylightItems = mixRankSkylightData.getSkylightItems()) != null) {
                numValueOf = Integer.valueOf(skylightItems.size());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(" isLoadMoreData=");
        sbLIZ.append(inboxHorizontalTopListCombinePod.isLoadMoreData());
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onBindData, shouldRefresh: ");
        sbLIZ3.append(z2);
        sbLIZ3.append(", isDefault: ");
        sbLIZ3.append(zIsDefault);
        sbLIZ3.append(", isSamePod: ");
        sbLIZ3.append(z);
        C1720106oR.LJI("SkylightListViewModel", C2188811AlT.LIZIZ(sbLIZ3));
        if (skylightListViewModelV5.LLJJI == null || inboxHorizontalTopListCombinePod != skylightListViewModelV5.FQ2()) {
            skylightListViewModelV5.LLIZ.clear();
            skylightListViewModelV5.LLIZLLLIL = true;
        }
        skylightListViewModelV5.LLJJI = inboxHorizontalTopListCombinePod;
        Long l2 = C0J50.LIZ;
        if (l2 != null) {
            l2.longValue();
            C0J50.LIZ = null;
            l = l2;
        }
        skylightListViewModelV5.LLJILJILJ = l;
        skylightListViewModelV5.withState(new AwS110S0110000_24(z2, skylightListViewModelV5, 3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("MultiViewModel vh: ");
        sbLIZ4.append(skylightListViewModelV5.LLJILLL);
        sbLIZ4.append(" vm onBindData: target live room id: ");
        sbLIZ4.append(skylightListViewModelV5.LLJILJILJ);
        sbLIZ4.append(" shouldRefresh ");
        sbLIZ4.append(z2);
        C2188811AlT.LIZIZ(sbLIZ4);
        X5(inboxHorizontalTopListCombinePod, false);
        SystemClock.uptimeMillis();
    }

    public final void a6(long j) {
        InboxLiveNotice inboxLiveNoticeLIZIZ;
        SlimRoom slimRoom;
        Iterator it2 = ((ArrayList) this.LLJJJJJIL.getState().LJII()).iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                if ((interfaceC1891350zJl instanceof AbstractC1598130rgp) && (inboxLiveNoticeLIZIZ = ((AbstractC1598130rgp) interfaceC1891350zJl).LIZIZ()) != null && (slimRoom = inboxLiveNoticeLIZIZ.roomInfo) != null && slimRoom.getId() == j) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        d6(i);
    }

    public final void d6(int i) {
        if (i >= 0 && i < this.LLJJJJJIL.getState().LJIIIIZZ() && !V5().LLJJIJIIJIL) {
            ((LinearLayoutManager) this.LLJJJJJIL.getLayoutManager()).scrollToPositionWithOffset(i, 0);
        }
    }

    @Override // X.InterfaceC1598970riB
    public final void j(boolean z) {
        if (z) {
            n3(EnumC1598770rhr.SKYLIGHT_ATTACH);
            AbstractC1585810rMx abstractC1585810rMx = (AbstractC1585810rMx) this.LLJLL.getValue();
            if (abstractC1585810rMx != null) {
                this.LLJJJJJIL.addOnScrollListener(abstractC1585810rMx);
            }
            C1599050riJ c1599050riJ = (C1599050riJ) this.LLJLLIL.getValue();
            if (c1599050riJ != null) {
                this.LLJJJJJIL.addOnChildAttachStateChangeListener(c1599050riJ);
                return;
            }
            return;
        }
        o4(EnumC1598770rhr.SKYLIGHT_ATTACH);
        AbstractC1585810rMx abstractC1585810rMx2 = (AbstractC1585810rMx) this.LLJLL.getValue();
        if (abstractC1585810rMx2 != null) {
            this.LLJJJJJIL.removeOnScrollListener(abstractC1585810rMx2);
        }
        C1599050riJ c1599050riJ2 = (C1599050riJ) this.LLJLLIL.getValue();
        if (c1599050riJ2 == null) {
            return;
        }
        this.LLJJJJJIL.removeOnChildAttachStateChangeListener(c1599050riJ2);
        C0ZP4 c0zp4 = C1599060riK.LIZLLL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        C1599060riK.LIZLLL = null;
        C1599060riK.LIZJ = false;
        C1599060riK.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC1598970riB
    public final void n3(EnumC1598770rhr enumC1598770rhr) {
        RecyclerView.ViewHolder childViewHolder;
        RecyclerView.LayoutManager layoutManager = this.LLJJJJJIL.getLayoutManager();
        if (layoutManager != null) {
            int childCount = layoutManager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = layoutManager.getChildAt(i);
                if (childAt != null && (childViewHolder = this.LLJJJJJIL.getChildViewHolder(childAt)) != null) {
                    U5().callResumeAnimation(childViewHolder, enumC1598770rhr);
                }
            }
        }
    }

    @Override // X.InterfaceC1598970riB
    public final void o4(EnumC1598770rhr enumC1598770rhr) {
        RecyclerView.ViewHolder childViewHolder;
        RecyclerView.LayoutManager layoutManager = this.LLJJJJJIL.getLayoutManager();
        if (layoutManager != null) {
            int childCount = layoutManager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = layoutManager.getChildAt(i);
                if (childAt != null && (childViewHolder = this.LLJJJJJIL.getChildViewHolder(childAt)) != null) {
                    U5().callPauseAnimation(childViewHolder, enumC1598770rhr);
                }
            }
        }
    }

    public static final void X5(InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod, boolean z) {
        String str;
        List<SkylightData> dataList;
        C0JAU.LIZ().LJI();
        C0JAM c0jamLIZ = C0JAU.LIZ();
        if (!c0jamLIZ.LIZLLL) {
            HashMap<String, String> map = new HashMap<>();
            SkylightDataResponse skylightData = inboxHorizontalTopListCombinePod.getSkylightData();
            int i = 0;
            if (skylightData != null && (dataList = skylightData.getDataList()) != null && (!dataList.isEmpty())) {
                Iterator<SkylightData> it2 = dataList.iterator();
                while (it2.hasNext()) {
                    if (it2.next().bizType == 3) {
                        i++;
                    }
                }
            }
            map.put("room_cnt", String.valueOf(i));
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_prefetch_data", str);
            c0jamLIZ.LJIIJ(null, null, null, map, z);
        }
    }

    public static final void b6(SkylightListViewModel skylightListViewModel, C1598650rhf c1598650rhf) {
        if (C298500Bmy.LIZ()) {
            C1618440sDa.LIZIZ.LJJIJIL().LIZJ("notification_page", "refresh");
        }
        if (!skylightListViewModel.DQ2(c1598650rhf.hashCode())) {
            return;
        }
        Long l = skylightListViewModel.LLJILJILJ;
        if (l != null) {
            c1598650rhf.a6(l.longValue());
        } else {
            HandlerHook.viewPost(c1598650rhf.LLJJJJJIL, new ARunnableS124S0100000_24(c1598650rhf, 155));
        }
        C614770O9j c614770O9j = C614770O9j.LIZIZ;
        c614770O9j.LIZJ().LIZJ(c1598650rhf.LLJJJJJIL, "notification_page");
        c614770O9j.LIZJ().LJII("notification_page");
        HandlerHook.viewPost(c1598650rhf.itemView, new ARunnableS124S0100000_24(c1598650rhf, 156));
        c1598650rhf.LLJJJJJIL.LJJIII();
    }

    public static final void c6(SkylightListViewModel skylightListViewModel, C1598650rhf c1598650rhf) {
        boolean z;
        C20600815jK<InterfaceC1891350zJl> state;
        List<InterfaceC1891350zJl> listLJII;
        if (!skylightListViewModel.DQ2(c1598650rhf.hashCode())) {
            return;
        }
        C1600070rjx.LIZIZ(new AwS603S0100000_24(c1598650rhf.LLJJJJJIL.getState().LJII(), (List<? extends InterfaceC1594550rb3>) 521));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = skylightListViewModel.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null && (listLJII = state.LJII()) != null && !listLJII.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        c1598650rhf.LLLIIII(z);
        c1598650rhf.LLJJJJJIL.LJJIFFI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x032f  */
    /* JADX WARN: Type inference failed for: r0v105, types: [X.0rcQ, X.19sR] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1598650rhf(final android.view.View r22, androidx.fragment.app.Fragment r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598650rhf.<init>(android.view.View, androidx.fragment.app.Fragment, boolean):void");
    }

    @Override // X.InterfaceC1598970riB
    public final void B1(InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod, StoryCacheData storyCacheData, List list, AwS603S0100000_24 awS603S0100000_24) {
        if (!Intrinsics.LJFF(V5().LLJJIJI, this.LLJJJJJIL)) {
            V5().setListState(this.LLJJJJJIL.getState());
            if (((Meta) C1599610rjD.LIZIZ.getValue()).fixed) {
                V5().LLJJIJI = this.LLJJJJJIL;
            } else {
                V5().LLJJIJI = this.LLJJJJJIL;
            }
            this.LLJJJJJIL.LJIIL(V5().getConfig());
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1569750qx3(this, inboxHorizontalTopListCombinePod, storyCacheData, list, awS603S0100000_24, null), 3);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.AbstractC1903430zdF, X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        if (!Intrinsics.LJFF(str, "NOTIFICATION")) {
            C0JAU.LIZ().LIZIZ();
            if (C298500Bmy.LIZ()) {
                C1618440sDa.LIZIZ.LJJIJIL().LIZJ("notification_page", "exit");
            }
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
