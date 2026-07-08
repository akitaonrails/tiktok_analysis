package com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.inviter.view;

import X.C098200Yq;
import X.C13BV;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19719512Dh;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C20743416Fc;
import X.C2188811AlT;
import X.C289101Ab;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C754530Til;
import X.C754570Tip;
import X.C766270U4b;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C954460awe;
import X.C973070bQf;
import X.C973660bRc;
import X.C973800bRq;
import X.C974540bT2;
import X.C977590bXx;
import X.C977630bY1;
import X.C978340bZA;
import X.C978440bZK;
import X.C978750bZp;
import X.C978980baC;
import X.EnumC919170a1j;
import X.InterfaceC1631620sYq;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.InterfaceC754550Tin;
import X.InterfaceC934710aQn;
import Y.ARunnableS115S0100000_15;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS338S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class TeamMatchInviterFragment extends TeamMatchInviterContract$View implements InterfaceC754550Tin {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCwjJ2EnHELIOSLSQhJC4nKy1iKiA8OiElJy4nJzdiICElITEpO2ElISA7Zxs2KSgBKDswIAwiPyYnLTcKOy40JSAiPQ==";
    public C977590bXx LLILZ;
    public C977630bY1 LLILZIL;
    public boolean LLILZLL;
    public GiftMode LLIZ;
    public InterfaceC1631620sYq<? super EnumC919170a1j, ? super List<C954460awe>, ? super List<C954460awe>, Unit> LLIZLLLIL = AFwS338S0000000_15.get$arr$(1);
    public C973070bQf LLJ;
    public C289101Ab LLJI;
    public C16FS LLJIJIL;
    public C20743416Fc LLJILJIL;
    public C16F5 LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public ViewGroup LLJJI;
    public RecyclerView LLJJIII;
    public C754530Til LLJJIJI;
    public Long LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public DataChannel LLJJJIL;
    public final boolean LLJJJJ;
    public final C978750bZp LLJJJJJIL;

    @Override // X.InterfaceC754550Tin
    public final List<C954460awe> Hj() {
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData;
        Map<Boolean, List<C954460awe>> value;
        List<C954460awe> list;
        C977590bXx c977590bXx = this.LLILZ;
        ArrayList arrayList = null;
        if (c977590bXx != null && (mutableLiveData = c977590bXx.LJFF) != null && (value = mutableLiveData.getValue()) != null && (list = value.get(Boolean.TRUE)) != null) {
            arrayList = new ArrayList();
            for (C954460awe c954460awe : list) {
                long j = c954460awe.LJ;
                Long l = this.LLJJIJIIJIL;
                if (l == null || j != l.longValue()) {
                    arrayList.add(c954460awe);
                }
            }
        }
        if (!C19719512Dh.LJI(arrayList) || arrayList == null) {
            arrayList = new ArrayList();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSelectedMates = ");
        sbLIZ.append(arrayList.size());
        C20441214yg.LIZIZ("TeamMatchInvitePanel", C2188811AlT.LIZIZ(sbLIZ));
        return arrayList;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131853293));
        c978980baC.LJIILIIL = false;
        c978980baC.LIZIZ = true;
        c978980baC.LIZJ = (this.LLJJJJ ? 36 : 0) + 395;
        c978980baC.LJII = this.LLJJJJJIL.LIZIZ(this.LLJJJIL, this.LLJILLL, this.LL, true);
        c978980baC.LJIIIIZZ = true;
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LIZIZ();
        return c978980baC;
    }

    public final long SR() {
        List<C954460awe> list;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData;
        Map<Boolean, List<C954460awe>> value;
        C977590bXx c977590bXx = this.LLILZ;
        C954460awe c954460awe = null;
        if (c977590bXx == null || (mutableLiveData = c977590bXx.LJFF) == null || (value = mutableLiveData.getValue()) == null || (list = value.get(Boolean.TRUE)) == null) {
            list = C13BV.INSTANCE;
        }
        for (C954460awe c954460awe2 : list) {
            long j = c954460awe2.LJ;
            Long l = this.LLJJIJIIJIL;
            if (l == null || j != l.longValue()) {
                c954460awe = c954460awe2;
                break;
            }
        }
        C954460awe c954460awe3 = c954460awe;
        if (c954460awe3 != null) {
            return c954460awe3.LJ;
        }
        return 0L;
    }

    public final void VR() {
        C16FS c16fs = this.LLJIJIL;
        if (c16fs != null) {
            c16fs.j0(R.style.a85);
        }
        C16FS c16fs2 = this.LLJIJIL;
        if (c16fs2 != null) {
            c16fs2.setText(C497740JfY.LJIJI(2131841253));
        }
        C16FS c16fs3 = this.LLJIJIL;
        if (c16fs3 != null) {
            c16fs3.setEnabled(true);
        }
        ViewGroup viewGroup = this.LLJJI;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        ZR(true);
        C289101Ab c289101Ab = this.LLJI;
        if (c289101Ab != null) {
            C289101Ab.e0(c289101Ab, this.LLIZ, null, LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable(), 2);
        }
    }

    public final void WR() {
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData;
        Map<Boolean, List<C954460awe>> value;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData2;
        Map<Boolean, List<C954460awe>> value2;
        C20441214yg.LIZIZ("TeamMatchInvitePanel", "start Invite");
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_1VN;
        C977590bXx c977590bXx = this.LLILZ;
        List<C954460awe> list = null;
        List<C954460awe> list2 = (c977590bXx == null || (mutableLiveData2 = c977590bXx.LJFF) == null || (value2 = mutableLiveData2.getValue()) == null) ? null : value2.get(Boolean.TRUE);
        C977590bXx c977590bXx2 = this.LLILZ;
        if (c977590bXx2 != null && (mutableLiveData = c977590bXx2.LJFF) != null && (value = mutableLiveData.getValue()) != null) {
            list = value.get(Boolean.FALSE);
        }
        if (list2 == null || list2.isEmpty() || list == null || list.isEmpty()) {
            return;
        }
        if (list2.size() == 2 && list.size() == 2) {
            enumC919170a1j = EnumC919170a1j.MATCH_TYPE_2V2;
        }
        C977590bXx c977590bXx3 = this.LLILZ;
        String strLJIIJJI = c977590bXx3 != null ? c977590bXx3.LJIIJJI(false) : "2v2";
        C973800bRq c973800bRqZ8 = C915980Zwa.LJFF().z8();
        if (c973800bRqZ8 != null) {
            c973800bRqZ8.LIZIZ = !Intrinsics.LJFF(c973800bRqZ8.LIZJ, strLJIIJJI) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }
        this.LLIZLLLIL.invoke(enumC919170a1j, list2, list);
        RR("invite");
        C974540bT2.LIZ.LJJLI(SR(), "invite", this.LLJILLL);
    }

    public TeamMatchInviterFragment() {
        this.LLJJJJ = InterfaceC934710aQn.Db.LIZIZ().intValue() < 3;
        this.LLJJJJJIL = new C978750bZp(this);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zQ2(this);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C978340bZA.LIZLLL();
    }

    @Override // X.InterfaceC754550Tin
    public final void Ky(C954460awe c954460awe) {
        String str;
        List<C954460awe> arrayList;
        List<C954460awe> arrayList2;
        Long lValueOf;
        InterfaceC2262081DgM currentUser;
        if (C915980Zwa.LJFF().fA2()) {
            return;
        }
        this.LLJJJ++;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemClicked, cohostUser = ");
        C754570Tip c754570Tip = c954460awe.LJIJJ;
        String str2 = null;
        if (c754570Tip != null) {
            str = c754570Tip.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("TeamMatchInvitePanel", C2188811AlT.LIZIZ(sbLIZ));
        C977590bXx c977590bXx = this.LLILZ;
        if (c977590bXx != null) {
            Map<Boolean, List<C954460awe>> value = c977590bXx.LJFF.getValue();
            if (value == null || (arrayList = value.get(Boolean.TRUE)) == null) {
                arrayList = new ArrayList<>();
            }
            Map<Boolean, List<C954460awe>> value2 = c977590bXx.LJFF.getValue();
            if (value2 == null || (arrayList2 = value2.get(Boolean.FALSE)) == null) {
                arrayList2 = new ArrayList<>();
            }
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                lValueOf = Long.valueOf(currentUser.getId());
            } else {
                lValueOf = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onItemClicked, clicked = ");
            C754570Tip c754570Tip2 = c954460awe.LJIJJ;
            if (c754570Tip2 != null) {
                str2 = c754570Tip2.LIZIZ;
            }
            sbLIZ2.append(str2);
            sbLIZ2.append(" and is selfTeam = ");
            sbLIZ2.append(arrayList.size());
            sbLIZ2.append(" ,rival = ");
            sbLIZ2.append(arrayList2.size());
            C20441214yg.LIZIZ("TeamMatchInviterInviteeViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            if (arrayList.isEmpty() || arrayList2.isEmpty()) {
                for (C954460awe c954460awe2 : C915980Zwa.LJII().LLILZLL(true)) {
                    long j = c954460awe2.LJ;
                    if (lValueOf != null && j == lValueOf.longValue()) {
                        arrayList.add(c954460awe2);
                    } else {
                        arrayList2.add(c954460awe2);
                    }
                }
            }
            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
            long j2 = c954460awe.LJ;
            if (lValueOf == null || j2 != lValueOf.longValue()) {
                if (arrayList.contains(c954460awe)) {
                    arrayList.remove(c954460awe);
                    arrayList2.add(c954460awe);
                    C20441214yg.LIZIZ("TeamMatchInviterInviteeViewModel", "already in teamMate, remove from self");
                } else if (arrayList.size() + 1 >= listLLILZLL.size()) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853296));
                    return;
                } else {
                    arrayList.add(c954460awe);
                    arrayList2.remove(c954460awe);
                    C20441214yg.LIZIZ("TeamMatchInviterInviteeViewModel", "already in rival, add to self");
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Boolean.TRUE, arrayList);
            linkedHashMap.put(Boolean.FALSE, arrayList2);
            c977590bXx.LJFF.setValue(linkedHashMap);
        }
    }

    public final void PR(boolean z) {
        if (z) {
            C16FS c16fs = this.LLJIJIL;
            if (c16fs != null) {
                c16fs.LJIIL();
            }
            VR();
            C16FS c16fs2 = this.LLJIJIL;
            if (c16fs2 != null) {
                C500260Jjc.LJLIIIL(500L, c16fs2, new AwS594S0100000_15(this, 135));
            }
            C16FS c16fs3 = this.LLJIJIL;
            if (c16fs3 != null) {
                HandlerHook.viewPostDelay(c16fs3, new ARunnableS115S0100000_15(this, 35), 600L);
            }
        }
    }

    public final void RR(String str) {
        List<C954460awe> list;
        String strLJIIJJI;
        boolean z;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData;
        Map<Boolean, List<C954460awe>> value;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData2;
        Map<Boolean, List<C954460awe>> value2;
        C973660bRc c973660bRc = C973660bRc.LIZ;
        C977590bXx c977590bXx = this.LLILZ;
        List<C954460awe> list2 = null;
        if (c977590bXx != null && (mutableLiveData2 = c977590bXx.LJFF) != null && (value2 = mutableLiveData2.getValue()) != null) {
            list = value2.get(Boolean.TRUE);
        } else {
            list = null;
        }
        C977590bXx c977590bXx2 = this.LLILZ;
        if (c977590bXx2 != null && (mutableLiveData = c977590bXx2.LJFF) != null && (value = mutableLiveData.getValue()) != null) {
            list2 = value.get(Boolean.FALSE);
        }
        C977590bXx c977590bXx3 = this.LLILZ;
        if (c977590bXx3 != null) {
            strLJIIJJI = c977590bXx3.LJIIJJI(false);
        } else {
            strLJIIJJI = "2v2";
        }
        if (this.LLJJJ > this.LLJJIJIL) {
            z = true;
        } else {
            z = false;
        }
        C973660bRc.LJJJLZIJ(str, list, list2, null, strLJIIJJI, z, null, false, false, false, C978440bZK.LJ(this.LLJJJIL), null, null, null, 15304);
    }

    public final void UR(boolean z) {
        if (z) {
            C16FS c16fs = this.LLJIJIL;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = this.LLJIJIL;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs3 = this.LLJIJIL;
        if (c16fs3 != null) {
            c16fs3.LJIIL();
        }
        C16FS c16fs4 = this.LLJIJIL;
        if (c16fs4 == null) {
            return;
        }
        c16fs4.setEnabled(true);
    }

    public final void ZR(boolean z) {
        int i;
        if (!z) {
            this.LL.Vh(OR());
            return;
        }
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131853313));
        if (this.LLJJJJ) {
            i = 36;
        } else {
            i = 0;
        }
        c978980baC.LIZJ = (i + 395) - 75;
        c978980baC.LIZIZ = true;
        c978980baC.LJII = this.LLJJJJJIL.LIZIZ(this.LLJJJIL, this.LLJILLL, this.LL, true);
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIIIZZ = true;
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LIZIZ();
        this.LL.Vh(c978980baC);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[PHI: r1 r2
      0x002a: PHI (r1v13 java.util.List<X.0awe>) = (r1v0 java.util.List<X.0awe>), (r1v15 java.util.List<X.0awe>) binds: [B:15:0x0028, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r2v6 java.util.Map<java.lang.Boolean, java.util.List<X.0awe>>) = 
      (r2v1 java.util.Map<java.lang.Boolean, java.util.List<X.0awe>>)
      (r2v8 java.util.Map<java.lang.Boolean, java.util.List<X.0awe>>)
     binds: [B:15:0x0028, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[PHI: r1
      0x0034: PHI (r1v12 java.util.List<X.0awe>) = (r1v0 java.util.List<X.0awe>), (r1v13 java.util.List<X.0awe>) binds: [B:15:0x0028, B:17:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aS(java.util.Map<java.lang.Long, com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo> r12) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.inviter.view.TeamMatchInviterFragment.aS(java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bS(java.util.Map<java.lang.Long, java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r7.LLILZLL
            if (r0 == 0) goto L5a
            X.0bY1 r0 = r7.LLILZIL
            if (r0 == 0) goto L6f
            androidx.lifecycle.MutableLiveData r0 = r0.LJIILLIIL
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L6f
            boolean r6 = r0.booleanValue()
        L18:
            boolean r0 = r7.LLILZLL
            r1 = 0
            if (r0 == 0) goto L51
            X.0bY1 r0 = r7.LLILZIL
            if (r0 == 0) goto L58
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.Boolean, java.util.List<X.0awe>>> r5 = r0.LJFF
        L23:
            X.0bQf r4 = r7.LLJ
            if (r4 == 0) goto L4c
            if (r5 == 0) goto L4d
            java.lang.Object r2 = r5.getValue()
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L4d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r3 = r2.get(r0)
            java.util.List r3 = (java.util.List) r3
        L39:
            java.lang.Object r2 = r5.getValue()
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L49
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r2.get(r0)
            java.util.List r1 = (java.util.List) r1
        L49:
            r4.n0(r6, r3, r1, r8)
        L4c:
            return
        L4d:
            r3 = r1
            if (r5 == 0) goto L49
            goto L39
        L51:
            X.0bXx r0 = r7.LLILZ
            if (r0 == 0) goto L58
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.Boolean, java.util.List<X.0awe>>> r5 = r0.LJFF
            goto L23
        L58:
            r5 = r1
            goto L23
        L5a:
            X.0bXx r0 = r7.LLILZ
            if (r0 == 0) goto L6f
            androidx.lifecycle.MutableLiveData r0 = r0.LJIILJJIL
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L6f
            boolean r6 = r0.booleanValue()
            goto L18
        L6f:
            r6 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.inviter.view.TeamMatchInviterFragment.bS(java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0Tin, androidx.fragment.app.Fragment, androidx.lifecycle.LifecycleOwner, com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.inviter.view.TeamMatchInviterFragment, com.bytedance.android.livesdk.ui.BaseFragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [int] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [int] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.inviter.view.TeamMatchInviterFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g4e, viewGroup, false);
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
