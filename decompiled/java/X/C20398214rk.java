package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.helper.TTLivePlaybookFavoritesItemCount;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.event.PlaybookUpdateTvRecommendState;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookUEOptSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookTagAggregation;
import webcast.data.multi_guest_play.PlaybookTagInfo;

/* JADX INFO: renamed from: X.14rk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20398214rk extends AbstractC960470b6L<C20390514qV> {
    public static final int LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public static final int LLJJL;
    public static final long LLJJLIIIJLLLLLLLZ;
    public final PlaybookAnchorViewModel LL;
    public final DataChannel LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final InterfaceC20406814t8 LLILZ;
    public final boolean LLILZIL;
    public final EnumC20429714wp LLILZLL;
    public View LLIZ;
    public List<Playbook> LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public View LLJILJILJ;
    public C16F5 LLJILLL;
    public RecyclerView LLJJ;
    public final Set<Long> LLJJI;
    public final Set<Integer> LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public C428180Gqe LLJJJJ;

    public final void U5() {
        MutableLiveData<List<Playbook>> mutableLiveData;
        this.LLJ = true;
        this.LLJI = true;
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LL;
        V5((playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLJILJILJ) == null) ? null : mutableLiveData.getValue());
        RecyclerView recyclerView = this.LLJJ;
        if (recyclerView != null) {
            C428180Gqe c428180Gqe = this.LLJJJJ;
            if (c428180Gqe != null) {
                c428180Gqe.LLILLL = LLJJLIIIJLLLLLLLZ;
                c428180Gqe.LLILZIL = LLJJLIIIJLLLLLLLZ;
                c428180Gqe.LLILZLL = LLJJLIIIJLLLLLLLZ;
            }
            recyclerView.setItemAnimator(c428180Gqe);
        }
        RecyclerView recyclerView2 = this.LLJJ;
        if (recyclerView2 != null) {
            HandlerHook.viewPost(recyclerView2, new Runnable() { // from class: X.14rp
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    List<?> list;
                    RecyclerView recyclerView3;
                    C1C7U.LIZ("PlaybookPolymerizationHeaderListViewHolder@d4c8.refreshFavoriteListWithAnim$2");
                    try {
                        RecyclerView recyclerView4 = this.LL.LLJJ;
                        if (recyclerView4 != null && recyclerView4.getParent() != null && (((list = this.LL.N5().LL) == null || !list.isEmpty()) && (recyclerView3 = this.LL.LLJJ) != null)) {
                            recyclerView3.scrollToPosition(0);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PlaybookPolymerizationHeaderListViewHolder@d4c8.refreshFavoriteListWithAnim$2");
                }
            });
        }
    }

    public final void L5() {
        LinearLayoutManager linearLayoutManager;
        View viewFindViewByPosition;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        RecyclerView recyclerView = this.LLJJ;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1) {
            return;
        }
        List<?> list = N5().LL;
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            if (iFindFirstVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition < list.size()) {
                Object obj = ListProtector.get(list, iFindFirstVisibleItemPosition);
                if (obj instanceof C1868360yig) {
                    C1868360yig c1868360yig = (C1868360yig) obj;
                    long j = c1868360yig.LIZ.playbookId;
                    if (!this.LLJJI.contains(Long.valueOf(j)) && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) != null) {
                        Rect rect = new Rect();
                        viewFindViewByPosition.getGlobalVisibleRect(rect);
                        Rect rect2 = new Rect();
                        recyclerView.getGlobalVisibleRect(rect2);
                        Rect rect3 = new Rect();
                        if (rect3.setIntersect(rect, rect2)) {
                            float fWidth = rect3.width() * rect3.height();
                            float width = viewFindViewByPosition.getWidth() * viewFindViewByPosition.getHeight();
                            if (width > 0.0f && fWidth / width >= 0.5f) {
                                Playbook playbook2 = c1868360yig.LIZ;
                                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                                DataChannel dataChannel = this.LLILLJJLI;
                                int i = iFindFirstVisibleItemPosition + 1;
                                PlaybookAnchorViewModel playbookAnchorViewModel = this.LL;
                                C978360bZC.LJIILL(dataChannel, "show", playbook2, "favorite", i, (playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null || (playbook = value.playbook) == null || playbook.playbookId != playbook2.playbookId) ? false : true, false, null, null, 0, null, null, 4032);
                                this.LLJJI.add(Long.valueOf(j));
                            }
                        }
                    }
                }
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public final C951190arN N5() {
        return (C951190arN) this.LLJJIJI.getValue();
    }

    public final RecyclerView P5() {
        return (RecyclerView) this.LLJJJ.getValue();
    }

    public final C1117360fBO R5() {
        return (C1117360fBO) this.LLJJJIL.getValue();
    }

    static {
        C14KS.LJFF();
        C14KS.LJFF();
        C439101nJ.LIZ(53);
        C439101nJ.LIZ(16);
        LLJJJJJIL = C439101nJ.LIZ(4);
        LLJJJJLIIL = C439101nJ.LIZ(16);
        LLJJL = C439101nJ.LIZ(9);
        LLJJLIIIJLLLLLLLZ = 300L;
    }

    public final void T5() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerViewP5 = P5();
        RecyclerView.LayoutManager layoutManager = recyclerViewP5 != null ? recyclerViewP5.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            if (iFindFirstVisibleItemPosition < linearLayoutManager.getItemCount()) {
                Object obj = ListProtector.get(R5().LL, iFindFirstVisibleItemPosition);
                if (obj instanceof C20406414t4) {
                    C20406414t4 c20406414t4 = (C20406414t4) obj;
                    if (!this.LLJJIII.contains(Integer.valueOf(C20385714pj.LIZ(this.LL) | (c20406414t4.LIZ.tagType << 8)))) {
                        this.LLJJIII.add(Integer.valueOf(C20385714pj.LIZ(this.LL) | (c20406414t4.LIZ.tagType << 8)));
                        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                        C978360bZC.LJIIZILJ(c20406414t4.LIZ.tagType, 2, C20385714pj.LIZ(this.LL), "show");
                    }
                }
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public final void S5(C20390514qV c20390514qV) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindViewHolder isRequestFailed:");
        sbLIZ.append(c20390514qV.LIZ);
        C20441214yg.LIZIZ("PlaybookPolymerizationListHeaderViewBinder", C2188811AlT.LIZIZ(sbLIZ));
        if (c20390514qV.LIZ) {
            C500260Jjc.LJLJLJ(this.LLIZ, false);
            C500260Jjc.LJLJLJ(this.LLJILJILJ, false);
            C500260Jjc.LJLJLJ((View) this.LLJJIJIIJIL.getValue(), false);
        }
    }

    public final void V5(List<Playbook> list) {
        Long lValueOf;
        RecyclerView recyclerView;
        boolean z;
        boolean z2;
        boolean z3;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        C1868360yig c1868360yig;
        Playbook playbook2;
        if (list != null && !list.isEmpty()) {
            C500260Jjc.LJLJLJ(this.LLJILJILJ, true);
            C16F5 c16f5 = this.LLJILLL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJJ(2131854080, C1850730yGF.LJFF(list.size())));
            }
            this.LLIZLLLIL = list;
            if (this.LLJ) {
                Object objLJJJLL = C13LP.LJJJLL(N5().LL);
                if ((objLJJJLL instanceof C1868360yig) && (c1868360yig = (C1868360yig) objLJJJLL) != null && (playbook2 = c1868360yig.LIZ) != null) {
                    lValueOf = Long.valueOf(playbook2.playbookId);
                } else {
                    lValueOf = null;
                }
                C951190arN c951190arNN5 = N5();
                C410901il c410901il = new C410901il();
                int i = 0;
                for (Object obj : C13LP.LL(list, TTLivePlaybookFavoritesItemCount.INSTANCE.getValue())) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Playbook playbook3 = (Playbook) obj;
                        PlaybookAnchorViewModel playbookAnchorViewModel = this.LL;
                        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.playbook) != null && playbook3.playbookId == playbook.playbookId) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int size = list.size() - 1;
                        int value2 = TTLivePlaybookFavoritesItemCount.INSTANCE.getValue();
                        if (size > value2) {
                            size = value2;
                        }
                        if (i == size) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c410901il.add(new C1868360yig(playbook3, z, z2, z3));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                Long lValueOf2 = null;
                c951190arNN5.LLLII(c410901il);
                Playbook playbook4 = (Playbook) C13LP.LJJJLL(list);
                if (playbook4 != null) {
                    lValueOf2 = Long.valueOf(playbook4.playbookId);
                }
                if (!Intrinsics.LJFF(lValueOf, lValueOf2) && (recyclerView = this.LLJJ) != null) {
                    HandlerHook.viewPost(recyclerView, new Runnable() { // from class: X.0Gqg
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            RecyclerView recyclerView2;
                            C1C7U.LIZ("PlaybookPolymerizationHeaderListViewHolder@d4c8.updateFavoritesRVV2$2");
                            try {
                                RecyclerView recyclerView3 = this.LL.LLJJ;
                                if (recyclerView3 != null && recyclerView3.getParent() != null && (recyclerView2 = this.LL.LLJJ) != null) {
                                    recyclerView2.scrollToPosition(0);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PlaybookPolymerizationHeaderListViewHolder@d4c8.updateFavoritesRVV2$2");
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        View view = this.LLJILJILJ;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, false);
        }
    }

    public final void X5(C16F5 c16f5) {
        int i = C20400414s6.LIZ[this.LLILZLL.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                if (c16f5 != null) {
                    c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.ezt, this.itemView.getContext()));
                    c16f5.LJJJI(R.style.a9c);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        if (c16f5 == null) {
            return;
        }
        c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, this.itemView.getContext()));
        c16f5.LJJJI(R.style.a90);
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        S5((C20390514qV) obj);
    }

    public final void W5(List<PlaybookTagInfo> list, boolean z) {
        boolean z2;
        if (!MultiGuestPlaybookUEOptSetting.INSTANCE.isEnable()) {
            C500260Jjc.LJLJLJ(P5(), false);
            return;
        }
        final C410901il c410901il = new C410901il(R5().LL);
        final C410901il c410901il2 = new C410901il();
        if (list != null) {
            for (PlaybookTagInfo playbookTagInfo : list) {
                if (playbookTagInfo.tagType == C20385714pj.LIZIZ(this.LL)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c410901il2.add(new C20406414t4(playbookTagInfo, z2));
            }
        }
        try {
            C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(c410901il, c410901il2) { // from class: X.14rv
                public final C410901il LIZ;
                public final C410901il LIZIZ;

                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return this.LIZIZ.size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return this.LIZ.size();
                }

                {
                    this.LIZ = c410901il;
                    this.LIZIZ = c410901il2;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i, int i2) {
                    if (i >= this.LIZ.size() || i2 >= this.LIZIZ.size()) {
                        return false;
                    }
                    Object obj = this.LIZ.get(i);
                    Object obj2 = this.LIZIZ.get(i2);
                    if ((obj instanceof C20406414t4) && (obj2 instanceof C20406414t4)) {
                        C20406414t4 c20406414t4 = (C20406414t4) obj;
                        PlaybookTagInfo playbookTagInfo2 = c20406414t4.LIZ;
                        int i3 = playbookTagInfo2.tagType;
                        C20406414t4 c20406414t42 = (C20406414t4) obj2;
                        PlaybookTagInfo playbookTagInfo3 = c20406414t42.LIZ;
                        if (i3 != playbookTagInfo3.tagType || !Intrinsics.LJFF(playbookTagInfo2.tagTranslatedName, playbookTagInfo3.tagTranslatedName) || c20406414t4.LIZIZ != c20406414t42.LIZIZ) {
                            return false;
                        }
                        return true;
                    }
                    if (!(obj instanceof PlaybookTagInfo) || !(obj2 instanceof PlaybookTagInfo)) {
                        return false;
                    }
                    PlaybookTagInfo playbookTagInfo4 = (PlaybookTagInfo) obj;
                    PlaybookTagInfo playbookTagInfo5 = (PlaybookTagInfo) obj2;
                    if (playbookTagInfo4.tagType != playbookTagInfo5.tagType || !Intrinsics.LJFF(playbookTagInfo4.tagTranslatedName, playbookTagInfo5.tagTranslatedName)) {
                        return false;
                    }
                    return true;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i, int i2) {
                    if (i >= this.LIZ.size() || i2 >= this.LIZIZ.size() || this.LIZ.get(i).getClass() != this.LIZIZ.get(i2).getClass()) {
                        return false;
                    }
                    return true;
                }
            }, true);
            R5().LLLII(c410901il2);
            c21341918fZLIZ.LIZJ(R5());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            R5().LLLII(c410901il2);
            R5().notifyDataSetChanged();
        }
        if (z) {
            Iterator<?> it2 = R5().LL.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if ((next instanceof C20406414t4) && ((C20406414t4) next).LIZ.tagType == C20385714pj.LIZIZ(this.LL)) {
                    if (i >= 0) {
                        P5().scrollToPosition(i);
                    }
                } else {
                    i++;
                }
            }
        }
        if (list != null && !list.isEmpty()) {
            RecyclerView recyclerViewP5 = P5();
            if (recyclerViewP5 != null) {
                C500260Jjc.LJLJLJ(recyclerViewP5, true);
            }
            RecyclerView recyclerViewP52 = P5();
            if (recyclerViewP52 != null) {
                HandlerHook.viewPost(recyclerViewP52, new Runnable() { // from class: X.14ga
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PlaybookPolymerizationHeaderListViewHolder@d4c8.updateTagList$2");
                        try {
                            this.LL.T5();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PlaybookPolymerizationHeaderListViewHolder@d4c8.updateTagList$2");
                    }
                });
                return;
            }
            return;
        }
        RecyclerView recyclerViewP53 = P5();
        if (recyclerViewP53 == null) {
            return;
        }
        C500260Jjc.LJLJLJ(recyclerViewP53, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.0Gqe, X.19rz] */
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
    public C20398214rk(View view, PlaybookAnchorViewModel playbookAnchorViewModel, DataChannel dataChannel, LifecycleOwner lifecycleOwner, InterfaceC20406814t8 interfaceC20406814t8, boolean z, EnumC20429714wp enumC20429714wp) {
        MutableLiveData<List<PlaybookTagAggregation>> mutableLiveData;
        MutableLiveData<List<Playbook>> mutableLiveData2;
        super(view);
        this.LL = playbookAnchorViewModel;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = interfaceC20406814t8;
        this.LLILZIL = z;
        this.LLILZLL = enumC20429714wp;
        this.LLJ = true;
        this.LLJIJIL = C452501pT.LIZIZ(new C20402214sO(view, this));
        this.LLJILJIL = C452501pT.LIZIZ(new C20396714rV(this));
        this.LLJJI = new LinkedHashSet();
        this.LLJJIII = new LinkedHashSet();
        this.LLJJIJI = C452501pT.LIZIZ(new C20397314rb(view, this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C20399114rt(view, this));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C20402514sR(view));
        this.LLJJIJIL = c01gwLIZIZ;
        this.LLJJJ = C452501pT.LIZIZ(new C20398914rr(view));
        this.LLJJJIL = C452501pT.LIZIZ(new C20399214ru(this));
        View viewFindViewById = this.itemView.findViewById(R.id.dxj);
        this.LLIZ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        this.LLJILJILJ = this.itemView.findViewById(R.id.dw2);
        C16F5 c16f5 = (C16F5) this.itemView.findViewById(R.id.zlr);
        this.LLJILLL = c16f5;
        X5(c16f5);
        this.LLJJ = (RecyclerView) this.itemView.findViewById(R.id.tvf);
        C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.14sa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
                DataChannel dataChannel2 = this.LL.LLILLJJLI;
                if (dataChannel2 != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel2)) != null) {
                    playbookAnchorServiceV2LIZIZ.LJJJLIIL();
                }
            }
        }, this.LLJILLL);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.itemView.getContext());
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = this.LLJJ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.LLJJ;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(N5());
        }
        RecyclerView recyclerView3 = this.LLJJ;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.14su
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView4, int i) {
                    if (i == 0) {
                        this.LL.L5();
                    }
                }

                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView4, int i, int i2) {
                    this.LL.L5();
                }
            });
        }
        N5().registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.14t2
            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                this.LIZ.L5();
            }
        });
        ?? r1 = new C423520Gj8() { // from class: X.0Gqe
            @Override // X.AbstractC21674919sB, X.AbstractC21673719rz
            public final boolean LJII(RecyclerView.ViewHolder viewHolder) {
                return false;
            }

            @Override // X.C423520Gj8, X.AbstractC21673719rz
            public final boolean LJIIIIZZ(RecyclerView.ViewHolder viewHolder, List<Object> list) {
                return false;
            }

            @Override // X.C423520Gj8, X.AbstractC21674919sB
            public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
                final View view2;
                if (!this.LLJJIJIL.LLJI) {
                    super.LJJI(viewHolder);
                    return true;
                }
                View view3 = viewHolder.itemView;
                C786410Ut5.Ob(view3, 0.5f);
                C786410Ut5.pc(view3, 0.5f);
                C786410Ut5.T4(view3, 0.0f);
                C786410Ut5.Pd(ObjectAnimator.ofPropertyValuesHolder(view3, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f)).setDuration(C20398214rk.LLJJLIIIJLLLLLLLZ));
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                RecyclerView recyclerView4 = this.LLJJIJIL.LLJJ;
                RecyclerView.LayoutManager layoutManager = null;
                if (recyclerView4 != null) {
                    layoutManager = recyclerView4.getLayoutManager();
                }
                if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                    C20398214rk c20398214rk = this.LLJJIJIL;
                    int itemCount = c20398214rk.N5().getItemCount();
                    for (int i = absoluteAdapterPosition + 1; i < itemCount; i++) {
                        RecyclerView recyclerView5 = c20398214rk.LLJJ;
                        if (recyclerView5 != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView5.findViewHolderForAdapterPosition(i)) != null && (view2 = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                            view2.animate().translationXBy(view2.getWidth()).setDuration(C20398214rk.LLJJLIIIJLLLLLLLZ).alpha(1.0f).withEndAction(new Runnable() { // from class: X.0Gqf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("PlaybookPolymerizationHeaderListViewHolder@d4c8.getFavoritesItemAnimator$1$animateAdd$1$1$1");
                                    try {
                                        C786410Ut5.Jc(view2, 0.0f);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("PlaybookPolymerizationHeaderListViewHolder@d4c8.getFavoritesItemAnimator$1$animateAdd$1$1$1");
                                }
                            }).start();
                        }
                    }
                }
                this.LLJJIJIL.LLJI = false;
                super.LJJI(viewHolder);
                return true;
            }
        };
        this.LLJJJJ = r1;
        RecyclerView recyclerView4 = this.LLJJ;
        if (recyclerView4 != 0) {
            recyclerView4.setItemAnimator(r1);
        }
        this.LLJ = true;
        this.LLJI = false;
        if (playbookAnchorViewModel != null && (mutableLiveData2 = playbookAnchorViewModel.LLJILJILJ) != null) {
            mutableLiveData2.observe(this.LLILLL, new Observer() { // from class: X.14sp
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.LL.V5((List) obj);
                }
            });
        }
        if (dataChannel != null) {
            dataChannel.EQ2(lifecycleOwner, PlaybookUpdateTvRecommendState.class, new C20329214gc(this));
        }
        TextView textView = (TextView) c01gwLIZIZ.getValue();
        if (textView != null) {
            textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, this.itemView.getContext()));
        }
        X5((C16F5) c01gwLIZIZ.getValue());
        if (MultiGuestPlaybookUEOptSetting.INSTANCE.isEnable()) {
            final C013C c013c = new C013C();
            c013c.element = true;
            P5().setAdapter(R5());
            RecyclerView recyclerViewP5 = P5();
            if (recyclerViewP5 != null) {
                recyclerViewP5.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.14st
                    @Override // X.AbstractC1585810rMx
                    public final void LJJIIZI(RecyclerView recyclerView5, int i, int i2) {
                        if (i != 0) {
                            this.LL.T5();
                        }
                    }
                });
            }
            if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLJJIJI) != null) {
                mutableLiveData.observe(this.LLILLL, new Observer() { // from class: X.14rH
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        Object next;
                        List list = (List) obj;
                        List<PlaybookTagInfo> list2 = null;
                        if (list != null) {
                            C20398214rk c20398214rk = this.LL;
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (((PlaybookTagAggregation) next).playbookFirstLevelTagType == C20385714pj.LIZ(c20398214rk.LL)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            PlaybookTagAggregation playbookTagAggregation = (PlaybookTagAggregation) next;
                            if (playbookTagAggregation != null) {
                                list2 = playbookTagAggregation.tags;
                            }
                        }
                        this.LL.W5(list2, c013c.element);
                    }
                });
            }
        }
    }
}
