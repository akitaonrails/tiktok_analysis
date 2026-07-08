package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.01HJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01HJ extends AbstractDialogC341101Ub {
    public static final /* synthetic */ int LLJZ = 0;
    public final C01H0 LLJJIJI;
    public List<? extends LinkPlayerInfo> LLJJIJIIJIL;
    public final C01H9 LLJJIJIL;
    public Long LLJJJ;
    public final Boolean LLJJJIL;
    public final DataChannel LLJJJJ;
    public final List<String> LLJJJJJIL;
    public final C334801Rq LLJJJJLIIL;
    public C16FS LLJJL;
    public C16FS LLJJLIIIJLLLLLLLZ;
    public final HashMap<String, Integer> LLJL;
    public boolean LLJLIL;
    public View LLJLILLLLZIIL;
    public Function0<Unit> LLJLL;
    public String LLJLLIL;
    public final C21688219uK LLJLLL;

    @Override // X.AbstractDialogC341101Ub, X.AbstractDialogC423201kk
    public final void LJL() {
        IInteractService iInteractService;
        super.LJL();
        this.LLJJL = (C16FS) findViewById(R.id.v_h);
        this.LLJJLIIIJLLLLLLLZ = (C16FS) findViewById(R.id.v_j);
        this.LLJLLL.LJ(this.LLJILLL);
        this.LLJLILLLLZIIL = findViewById(R.id.nkl);
        C16FS c16fs = this.LLJJLIIIJLLLLLLLZ;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131843337));
        }
        LiveIconView liveIconView = this.LLJILJIL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ViewOnClickListenerC512201z6(this, 39));
        }
        LiveIconView liveIconView2 = this.LLJILJILJ;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new ViewOnClickListenerC512201z6(this, 40));
        }
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        LJLILLLLZI(interfaceC302601FgLIZ != null ? interfaceC302601FgLIZ.LJIIL() : 0);
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        Integer numValueOf = interfaceC302601FgLIZ2 != null ? Integer.valueOf(interfaceC302601FgLIZ2.LJIIL()) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                LJLJJI(this, this.LLJJIJIIJIL, false, false, this.LLJJJJJIL, 6);
            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 2) {
                LJLJJLL(this.LLJJIJIL);
            }
        }
        if (C930540aK4.LIZJ() || (iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class)) == null || !iInteractService.l62()) {
            return;
        }
        List<? extends LinkPlayerInfo> list = this.LLJJIJIIJIL;
        if (list == null || list.isEmpty()) {
            View view = this.LLJLILLLLZIIL;
            if (view != null) {
                C12ES.LJIILL(0, view);
                return;
            }
            return;
        }
        View view2 = this.LLJLILLLLZIIL;
        if (view2 != null) {
            C439101nJ.LJI(view2);
        }
    }

    @Override // X.AbstractDialogC341101Ub
    public final void LJLI() {
        this.LLJJI.LLLI(C01HM.class, new C946420ajg(new InterfaceC946440aji() { // from class: X.01H1
            @Override // X.InterfaceC946440aji
            public final void LIZIZ(long j) {
            }

            @Override // X.InterfaceC946440aji
            public final Long LIZJ() {
                return this.LIZ.LLJJJ;
            }

            @Override // X.InterfaceC946440aji
            public final C21688219uK LJ() {
                return this.LIZ.LLJLLL;
            }

            @Override // X.InterfaceC946440aji
            public final void LIZ(long j) {
                this.LIZ.LLJJIJI.LIZ(j);
            }

            @Override // X.InterfaceC946440aji
            public final void LIZLLL(long j) {
                this.LIZ.LLJJIJI.LIZLLL(j);
            }
        }, this.LLJJJJ));
        this.LLJJI.LLLI(C930130aJP.class, new C930090aJL(null));
        C951190arN c951190arN = this.LLJJI;
        final C5182020e c5182020e = new C5182020e(this, 249);
        c951190arN.LLLI(C00UO.class, new AbstractC960430b6H<C00UO, C951700asC>(c5182020e) { // from class: X.0asB
            public final Function0<Unit> LIZIZ;

            {
                this.LIZIZ = c5182020e;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C951700asC(C786410Ut5.Td(layoutInflater, R.layout.h_4, viewGroup, false), this.LIZIZ);
            }
        });
    }

    public final List<CreateShowParams.ListUser> LJLIIL() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.LLJJI.LL) {
            if (obj instanceof C01HM) {
                CreateShowParams.ListUser listUser = new CreateShowParams.ListUser();
                ShowListUser showListUser = ((C01HM) obj).LIZ;
                listUser.userId = showListUser.userId;
                listUser.linkmicId = showListUser.linkmicIdStr;
                listUser.order = showListUser.order;
                arrayList.add(listUser);
            }
        }
        return arrayList;
    }

    public final void LJLIL() {
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (!C01ZD.LIZ(7) || !C930540aK4.LIZJ()) {
            this.LLJJIJI.LJFF(LJLIIL(), this.LLJJJJLIIL);
            dismiss();
            C785410UrT.LIZ(this);
        } else {
            C916770Zxr c916770Zxr = C916770Zxr.LIZ;
            Context context = getContext();
            C5182020e c5182020e = new C5182020e(this, 250);
            c916770Zxr.getClass();
            C916770Zxr.LIZ(context, "live_show", c5182020e, true);
        }
    }

    public final void LJLJI() {
        if (!C01HT.LIZ() && !C01HT.LIZJ()) {
            C16FS c16fs = this.LLJJLIIIJLLLLLLLZ;
            if (c16fs != null) {
                C786410Ut5.LLJJJ(c16fs, 8);
                return;
            }
            return;
        }
        C16FS c16fs2 = this.LLJJLIIIJLLLLLLLZ;
        if (c16fs2 != null) {
            C786410Ut5.LLJJJ(c16fs2, 0);
            c16fs2.j0(R.style.a7g);
            if (C01HT.LIZJ()) {
                c16fs2.setEnabled(true);
                C500260Jjc.LJLIIIL(500L, c16fs2, new C5183020f(this, 169));
            } else {
                c16fs2.setEnabled(false);
                C500260Jjc.LJLIIIL(500L, c16fs2, AnonymousClass0207.get$arr$(75));
            }
        }
    }

    public static final int LJLIIIL(String str) {
        OnLineMicInfo onLineMicInfoLLII;
        MicPositionInfo micPositionInfo;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (onLineMicInfoLLII = interfaceC954180awCLLJLL.LLII(str)) != null && (micPositionInfo = onLineMicInfoLLII.micPositionData) != null) {
            return micPositionInfo.position;
        }
        return -1;
    }

    public final void LJLILLLLZI(int i) {
        C16FS c16fs;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3 && (c16fs = this.LLJJL) != null) {
                    c16fs.setText(C497740JfY.LJIJI(2131843562));
                    c16fs.j0(R.style.a85);
                    C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.01HR
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                        }
                    });
                }
            } else {
                C16FS c16fs2 = this.LLJJL;
                if (c16fs2 != null) {
                    c16fs2.setText(C497740JfY.LJIJI(2131843562));
                    c16fs2.j0(R.style.a85);
                    C786410Ut5.h8(c16fs2, new ViewOnClickListenerC512201z6(this, 41));
                }
            }
        } else {
            C16FS c16fs3 = this.LLJJL;
            if (c16fs3 != null) {
                c16fs3.setText(C497740JfY.LJIJI(2131843566));
                c16fs3.j0(R.style.a7h);
                C500260Jjc.LJLIIIL(500L, c16fs3, new C020W(c16fs3, this, 34));
            }
        }
        LJLJI();
    }

    public final void LJLJJLL(C01H9 c01h9) {
        boolean z;
        C20441214yg.LIZIZ("LiveShowAnchorListDialog", "updateUserListWhenInShow");
        if (c01h9 == null) {
            return;
        }
        C951190arN c951190arN = this.LLJJI;
        C410901il c410901il = new C410901il();
        if (!InterfaceC934710aQn.Rb.LIZIZ().booleanValue()) {
            c410901il.add(new C00UO(0));
        }
        ShowListUser showListUser = c01h9.LIZ;
        if (showListUser != null) {
            c410901il.add(new C01HM(showListUser, true, -1));
            this.LLJL.put(showListUser.linkmicIdStr, Integer.valueOf(showListUser.order));
        }
        List<ShowListUser> list = c01h9.LIZIZ;
        if (list != null) {
            for (ShowListUser showListUser2 : list) {
                c410901il.add(new C01HM(showListUser2, true, -1));
                this.LLJL.put(showListUser2.linkmicIdStr, Integer.valueOf(showListUser2.order));
            }
        }
        List<ShowListUser> list2 = c01h9.LIZJ;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                c410901il.add(new C930130aJP(C497740JfY.LJIJI(2131843564), 6));
            }
            for (ShowListUser showListUser3 : list2) {
                List<? extends LinkPlayerInfo> list3 = this.LLJJIJIIJIL;
                if (list3 != null) {
                    Iterator<? extends LinkPlayerInfo> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        LinkPlayerInfo next = it2.next();
                        if (Intrinsics.LJFF(next.mInteractIdStr, showListUser3.linkmicIdStr)) {
                            if (next != null) {
                                z = true;
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                c410901il.add(new C01HM(showListUser3, z, -1));
                this.LLJL.put(showListUser3.linkmicIdStr, Integer.valueOf(showListUser3.order));
            }
        }
        c951190arN.LLLII(c410901il);
    }

    public final void LJLJJL(List<? extends LinkPlayerInfo> list, boolean z) {
        C20441214yg.LIZIZ("LiveShowAnchorListDialog", "updateUserListWhenInIdleForUpdate");
        if (list == null) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : this.LLJL.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        Iterator<? extends LinkPlayerInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            String str = it2.next().mInteractIdStr;
            if (map.get(str) != null) {
                map.remove(str);
            } else {
                arrayList.add(str);
            }
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry2 : map.entrySet()) {
                this.LLJL.remove(entry2.getKey());
                for (Map.Entry<String, Integer> entry3 : this.LLJL.entrySet()) {
                    if (entry3.getValue().intValue() > ((Number) entry2.getValue()).intValue()) {
                        this.LLJL.put(entry3.getKey(), Integer.valueOf(entry3.getValue().intValue() - 1));
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            int size = this.LLJL.size();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                size++;
                this.LLJL.put((String) it3.next(), Integer.valueOf(size));
            }
        }
        LJLJJI(this, list, true, z, null, 8);
    }

    public static void LJLJJI(C01HJ c01hj, List list, boolean z, boolean z2, List list2, int i) {
        View view;
        int iLJLIIIL;
        int i2;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        c01hj.getClass();
        C20441214yg.LIZIZ("LiveShowAnchorListDialog", "updateUserListWhenInIdle");
        if (list != null) {
            C951190arN c951190arN = c01hj.LLJJI;
            C410901il c410901il = new C410901il();
            if (!InterfaceC934710aQn.Rb.LIZIZ().booleanValue()) {
                c410901il.add(new C00UO(0));
            }
            if (!z) {
                if (C01HT.LIZIZ()) {
                    if (list2 != null && !list2.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (list2.contains(((LinkPlayerInfo) obj).mInteractIdStr)) {
                                arrayList.add(obj);
                            }
                        }
                        Iterator it2 = C13LP.LJLLLL(new C512501z9(list2, 3), arrayList).iterator();
                        i2 = 0;
                        while (it2.hasNext()) {
                            i2++;
                            c01hj.LLJL.put(((LinkPlayerInfo) it2.next()).mInteractIdStr, Integer.valueOf(i2));
                        }
                    } else {
                        i2 = 0;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj2;
                        if (list2 == null || !list2.contains(linkPlayerInfo.mInteractIdStr)) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it3 = C13LP.LJLLLL(new C512501z9(c01hj, 4), arrayList2).iterator();
                    while (it3.hasNext()) {
                        i2++;
                        c01hj.LLJL.put(((LinkPlayerInfo) it3.next()).mInteractIdStr, Integer.valueOf(i2));
                    }
                } else {
                    Iterator it4 = C13LP.LJLLLL(new C512501z9(c01hj, 5), list).iterator();
                    int i3 = 0;
                    while (it4.hasNext()) {
                        i3++;
                        c01hj.LLJL.put(((LinkPlayerInfo) it4.next()).mInteractIdStr, Integer.valueOf(i3));
                    }
                }
            }
            for (LinkPlayerInfo linkPlayerInfo2 : C13LP.LJLLLL(new C512501z9(c01hj, 6), list)) {
                ShowListUser showListUser = new ShowListUser();
                showListUser.userId = linkPlayerInfo2.mUser.getId();
                showListUser.status = 0;
                Integer num = c01hj.LLJL.get(linkPlayerInfo2.mInteractIdStr);
                if (num != null) {
                    iLJLIIIL = num.intValue();
                } else {
                    iLJLIIIL = LJLIIIL(linkPlayerInfo2.mInteractIdStr);
                }
                showListUser.order = iLJLIIIL;
                showListUser.nickname = C0KVU.LIZ(linkPlayerInfo2.mUser);
                showListUser.avatarThumb = linkPlayerInfo2.mUser.getAvatarThumb();
                showListUser.linkmicIdStr = linkPlayerInfo2.mInteractIdStr;
                int i4 = linkPlayerInfo2.appVersion;
                showListUser.enigmaInfo = linkPlayerInfo2.mUser.enigmaInfo;
                c410901il.add(new C01HM(showListUser, true, i4));
            }
            c951190arN.LLLII(c410901il);
            if ((!list.isEmpty()) && (view = c01hj.LLJLILLLLZIIL) != null) {
                C439101nJ.LJI(view);
            }
            if (z2) {
                c01hj.LLJJI.notifyDataSetChanged();
            }
        }
    }

    public C01HJ(Context context, C01H0 c01h0, List<? extends LinkPlayerInfo> list, C01H9 c01h9, Long l, Boolean bool, DataChannel dataChannel, List<String> list2, C334801Rq c334801Rq) {
        super(context);
        this.LLJJIJI = c01h0;
        this.LLJJIJIIJIL = list;
        this.LLJJIJIL = c01h9;
        this.LLJJJ = l;
        this.LLJJJIL = bool;
        this.LLJJJJ = dataChannel;
        this.LLJJJJJIL = list2;
        this.LLJJJJLIIL = c334801Rq;
        this.LLJL = new HashMap<>();
        this.LLJLLIL = "info_icon";
        this.LLJLLL = new C21688219uK(new AbstractC21688119uJ() { // from class: X.01HK
            public C946390ajd LIZJ;
            public int LIZLLL = -1;

            @Override // X.AbstractC21688119uJ
            public final boolean LJII() {
                return false;
            }

            @Override // X.AbstractC21688119uJ
            public final void LJIILL() {
            }

            @Override // X.AbstractC21688119uJ
            public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                return AbstractC21688119uJ.LJIIIZ(3, 0);
            }

            @Override // X.AbstractC21688119uJ
            public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
                long j;
                long j2;
                ShowListUser showListUser;
                int i2;
                C01HM c01hm;
                ShowListUser showListUser2;
                ShowListUser showListUser3;
                C01HM c01hm2;
                ShowListUser showListUser4;
                C946390ajd c946390ajd;
                ShowListUser showListUser5;
                int i3 = -1;
                if (i == 2) {
                    if ((viewHolder instanceof C946390ajd) && (c946390ajd = (C946390ajd) viewHolder) != null) {
                        c946390ajd.itemView.setBackgroundResource(R.color.aas);
                        c946390ajd.itemView.setElevation(8.0f);
                        this.LIZJ = c946390ajd;
                        C01HM c01hm3 = c946390ajd.LLILLL;
                        if (c01hm3 != null && (showListUser5 = c01hm3.LIZ) != null) {
                            i3 = showListUser5.order;
                        }
                        this.LIZLLL = i3;
                    }
                    C01HJ c01hj = this.LJ;
                    c01hj.LLJLIL = true;
                    Iterator<T> it2 = c01hj.LLJL.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        C306901Gx.LJ.put((String) entry.getKey(), (Integer) entry.getValue());
                    }
                    return;
                }
                C946390ajd c946390ajd2 = this.LIZJ;
                if (!(c946390ajd2 instanceof C946390ajd)) {
                    c946390ajd2 = null;
                }
                long j3 = 0;
                if (c946390ajd2 != null && (c01hm2 = c946390ajd2.LLILLL) != null && (showListUser4 = c01hm2.LIZ) != null) {
                    j = showListUser4.userId;
                } else {
                    j = 0;
                }
                HashMap<String, Integer> map = this.LJ.LLJL;
                String str = "1";
                if (map.size() == C306901Gx.LJ.size()) {
                    Iterator<T> it3 = map.entrySet().iterator();
                    String str2 = CardStruct.IStatusCode.DEFAULT;
                    while (it3.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it3.next();
                        int iIntValue = ((Number) entry2.getValue()).intValue();
                        Integer num = C306901Gx.LJ.get(entry2.getKey());
                        if (num == null || iIntValue != num.intValue()) {
                            str2 = "1";
                        }
                    }
                    str = str2;
                }
                C306901Gx.LJ = new HashMap<>();
                Map mapLIZ = C306901Gx.LIZ();
                mapLIZ.put("guest_id", String.valueOf(j));
                mapLIZ.put("is_liveshow_ongoing", C306901Gx.LJFF());
                mapLIZ.put("is_success", str);
                C306901Gx.LJIL("livesdk_anchor_multiguest_liveshow_order_change", mapLIZ);
                C946390ajd c946390ajd3 = this.LIZJ;
                if (!(c946390ajd3 instanceof C946390ajd)) {
                    c946390ajd3 = null;
                }
                if (c946390ajd3 != null) {
                    c946390ajd3.itemView.setBackgroundColor(0);
                    c946390ajd3.itemView.setElevation(0.0f);
                }
                C01HJ c01hj2 = this.LJ;
                c01hj2.LLJLIL = false;
                Function0<Unit> function0 = c01hj2.LLJLL;
                if (function0 != null) {
                    function0.invoke();
                    this.LJ.LLJLL = null;
                }
                InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                if (interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIIL() == 2) {
                    C946390ajd c946390ajd4 = this.LIZJ;
                    if ((c946390ajd4 instanceof C946390ajd) && c946390ajd4 != null) {
                        C01HM c01hm4 = c946390ajd4.LLILLL;
                        if (c01hm4 != null && (showListUser3 = c01hm4.LIZ) != null) {
                            i3 = showListUser3.order;
                        }
                        if (i3 == this.LIZLLL) {
                            C20441214yg.LIZIZ("LiveShowAnchorListDialog", "onSelectedChanged targetOrder == lastDragVHOrder return");
                            return;
                        }
                        if ((c946390ajd4 instanceof C946390ajd) && c946390ajd4 != null && (c01hm = c946390ajd4.LLILLL) != null && (showListUser2 = c01hm.LIZ) != null) {
                            j2 = showListUser2.userId;
                        } else {
                            j2 = 0;
                        }
                        long j4 = 0;
                        for (Object obj : this.LJ.LLJJI.LL) {
                            if ((obj instanceof C01HM) && ((i2 = (showListUser = ((C01HM) obj).LIZ).status) == 2 || i2 == 1)) {
                                int i4 = showListUser.order;
                                if (i4 == i3 - 1) {
                                    j3 = showListUser.userId;
                                }
                                if (i4 == i3 + 1) {
                                    j4 = showListUser.userId;
                                }
                            }
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onUpdateUserOrder targetUserId: ");
                        sbLIZ.append(j2);
                        sbLIZ.append("; preUserId: ");
                        sbLIZ.append(j3);
                        sbLIZ.append("; nextUserId: ");
                        sbLIZ.append(j4);
                        C20441214yg.LIZIZ("LiveShowAnchorListDialog", C2188811AlT.LIZIZ(sbLIZ));
                        this.LJ.LLJJIJI.LJIIIIZZ(j2, j3, j4);
                    }
                }
            }

            @Override // X.AbstractC21688119uJ
            public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                Boolean boolValueOf;
                C946390ajd c946390ajd;
                C01HM c01hm;
                ShowListUser showListUser;
                String str;
                C946390ajd c946390ajd2;
                C01HM c01hm2;
                ShowListUser showListUser2;
                String str2;
                Integer num;
                String str3;
                Object next;
                Object next2;
                C01HM c01hm3;
                ShowListUser showListUser3;
                C01HM c01hm4;
                ShowListUser showListUser4;
                ShowListUser showListUser5;
                ShowListUser showListUser6;
                ShowListUser showListUser7;
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder2.getAbsoluteAdapterPosition();
                Object obj = ListProtector.get(this.LJ.LLJJI.LL, absoluteAdapterPosition2);
                InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                if (interfaceC302601FgLIZ != null) {
                    boolValueOf = Boolean.valueOf(interfaceC302601FgLIZ.LJIJI());
                } else {
                    boolValueOf = null;
                }
                if (!C500260Jjc.LJJJI(boolValueOf) ? !(obj instanceof C01HM) : !((obj instanceof C01HM) && ((C01HM) obj).LIZ.status == 1)) {
                    return false;
                }
                this.LJ.LLJJI.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
                C01HJ c01hj = this.LJ;
                c01hj.getClass();
                if ((viewHolder instanceof C946390ajd) && (viewHolder2 instanceof C946390ajd) && (c01hm = (c946390ajd = (C946390ajd) viewHolder).LLILLL) != null && (showListUser = c01hm.LIZ) != null && (str = showListUser.linkmicIdStr) != null && (c01hm2 = (c946390ajd2 = (C946390ajd) viewHolder2).LLILLL) != null && (showListUser2 = c01hm2.LIZ) != null && (str2 = showListUser2.linkmicIdStr) != null && (num = c01hj.LLJL.get(str)) != null) {
                    int iIntValue = num.intValue();
                    HashMap<String, Integer> map = c01hj.LLJL;
                    C01HM c01hm5 = c946390ajd2.LLILLL;
                    if (c01hm5 != null && (showListUser7 = c01hm5.LIZ) != null) {
                        str3 = showListUser7.linkmicIdStr;
                    } else {
                        str3 = null;
                    }
                    Integer num2 = map.get(str3);
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        if (iIntValue != -1 && iIntValue2 != -1) {
                            C16F5 c16f5 = c946390ajd.LLIZ;
                            if (c16f5 != null) {
                                c16f5.setText(String.valueOf(iIntValue2));
                            }
                            C01HM c01hm6 = c946390ajd.LLILLL;
                            if (c01hm6 != null && (showListUser6 = c01hm6.LIZ) != null) {
                                showListUser6.order = iIntValue2;
                            }
                            C16F5 c16f52 = c946390ajd2.LLIZ;
                            if (c16f52 != null) {
                                c16f52.setText(String.valueOf(iIntValue));
                            }
                            C01HM c01hm7 = c946390ajd2.LLILLL;
                            if (c01hm7 != null && (showListUser5 = c01hm7.LIZ) != null) {
                                showListUser5.order = iIntValue;
                            }
                            Iterator<?> it2 = c01hj.LLJJI.LL.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if ((next instanceof C01HM) && Intrinsics.LJFF(((C01HM) next).LIZ.linkmicIdStr, str)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            Iterator<?> it3 = c01hj.LLJJI.LL.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                    if ((next2 instanceof C01HM) && Intrinsics.LJFF(((C01HM) next2).LIZ.linkmicIdStr, str2)) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            if ((next instanceof C01HM) && (c01hm4 = (C01HM) next) != null && (showListUser4 = c01hm4.LIZ) != null) {
                                showListUser4.order = iIntValue2;
                            }
                            if ((next2 instanceof C01HM) && (c01hm3 = (C01HM) next2) != null && (showListUser3 = c01hm3.LIZ) != null) {
                                showListUser3.order = iIntValue;
                            }
                            c01hj.LLJL.put(str, Integer.valueOf(iIntValue2));
                            c01hj.LLJL.put(str2, Integer.valueOf(iIntValue));
                        }
                    }
                }
                if (C01HT.LIZIZ()) {
                    C01HJ c01hj2 = this.LJ;
                    C01H0 c01h02 = c01hj2.LLJJIJI;
                    List listLJLLLL = C13LP.LJLLLL(new C512401z8(26), c01hj2.LLJL.entrySet());
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                    Iterator it4 = listLJLLLL.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((Map.Entry) it4.next()).getKey());
                    }
                    c01h02.LJ(new ArrayList(arrayList));
                }
                return true;
            }
        });
    }
}
