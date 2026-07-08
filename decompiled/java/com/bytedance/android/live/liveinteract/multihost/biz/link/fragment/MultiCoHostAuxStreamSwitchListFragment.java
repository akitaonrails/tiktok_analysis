package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.C098200Yq;
import X.C0KVU;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C1841350y17;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C754570Tip;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C954460awe;
import X.C955400ayA;
import X.C978980baC;
import Y.ACListenerS53S0101000_15;
import Y.ACListenerS81S0300000_15;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostAuxStreamSwitchListContract$AbsView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostAuxStreamSwitchListFragment extends MultiCoHostAuxStreamSwitchListContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgPGsuIDV9HELIOSJCwiImE1OiQrJCo9PGsBPCMnIQYjASAgPAQ5MRwnOiAtJBwkITEvIQM6OzEKOy40JSAiPQ==";
    public List<C954460awe> LLILZ = new ArrayList();
    public View LLILZIL;
    public ViewGroup LLILZLL;
    public ViewGroup LLIZ;
    public ViewGroup LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public C16F5 LLJIJIL;
    public C1841350y17 LLJILJIL;
    public C1841350y17 LLJILJILJ;
    public C1841350y17 LLJILLL;
    public C16FS LLJJ;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131853129));
        c978980baC.LIZJ = (this.LLILZ.size() * 52) + 110;
        c978980baC.LJIILIIL = false;
        c978980baC.LIZLLL = false;
        c978980baC.LJII = RR();
        return c978980baC;
    }

    public final void UR() {
        C1841350y17 c1841350y17;
        String str;
        C1841350y17 c1841350y172;
        String str2;
        C1841350y17 c1841350y173;
        String str3;
        long jLJJL = C915980Zwa.LJII().LJJL();
        if (!(!this.LLILZ.isEmpty())) {
            ViewGroup viewGroup = this.LLILZLL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(jLJJL <= 0 ? 8 : 0, viewGroup);
            }
            ViewGroup viewGroup2 = this.LLIZ;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(8, viewGroup2);
            }
            ViewGroup viewGroup3 = this.LLIZLLLIL;
            if (viewGroup3 != null) {
                C786410Ut5.LJLZ(8, viewGroup3);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shareScreenStreamUserList data invalid, disPlayAuxStreamUid = ");
            sbLIZ.append(jLJJL);
            sbLIZ.append(", userList = ");
            sbLIZ.append(C915980Zwa.LJII().LJIJJ());
            C20441214yg.LJ("MultiCoHostShareScreenSwitchListFragment", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int i = 0;
        for (C954460awe c954460awe : this.LLILZ) {
            int i2 = i + 1;
            String str4 = null;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C954460awe c954460awe2 = c954460awe;
            if (i == 0) {
                ViewGroup viewGroup4 = this.LLILZLL;
                if (viewGroup4 != null) {
                    C786410Ut5.LJLZ(0, viewGroup4);
                }
                C16F5 c16f5 = this.LLJ;
                if (c16f5 != null) {
                    Object[] objArr = new Object[1];
                    C754570Tip c754570Tip = c954460awe2.LJIJJ;
                    if (c754570Tip != null) {
                        str = c754570Tip.LIZ;
                        str4 = c754570Tip.LIZIZ;
                    } else {
                        str = null;
                    }
                    objArr[0] = C0KVU.LIZIZ(str, str4);
                    c16f5.setText(C497740JfY.LJIJJ(2131853128, objArr));
                }
                if (jLJJL == c954460awe2.LJ && (c1841350y17 = this.LLJILJIL) != null) {
                    c1841350y17.setChecked(true);
                }
                ViewGroup viewGroup5 = this.LLIZ;
                if (viewGroup5 != null) {
                    C786410Ut5.LJLZ(8, viewGroup5);
                }
                ViewGroup viewGroup6 = this.LLIZLLLIL;
                if (viewGroup6 != null) {
                    C786410Ut5.LJLZ(8, viewGroup6);
                }
            } else if (i == 1) {
                ViewGroup viewGroup7 = this.LLIZ;
                if (viewGroup7 != null) {
                    C786410Ut5.LJLZ(0, viewGroup7);
                }
                C16F5 c16f52 = this.LLJI;
                if (c16f52 != null) {
                    Object[] objArr2 = new Object[1];
                    C754570Tip c754570Tip2 = c954460awe2.LJIJJ;
                    if (c754570Tip2 != null) {
                        str2 = c754570Tip2.LIZ;
                        str4 = c754570Tip2.LIZIZ;
                    } else {
                        str2 = null;
                    }
                    objArr2[0] = C0KVU.LIZIZ(str2, str4);
                    c16f52.setText(C497740JfY.LJIJJ(2131853128, objArr2));
                }
                if (jLJJL == c954460awe2.LJ && (c1841350y172 = this.LLJILJILJ) != null) {
                    c1841350y172.setChecked(true);
                }
                ViewGroup viewGroup8 = this.LLIZLLLIL;
                if (viewGroup8 != null) {
                    C786410Ut5.LJLZ(8, viewGroup8);
                }
            } else if (i == 2) {
                C16F5 c16f53 = this.LLJIJIL;
                if (c16f53 != null) {
                    Object[] objArr3 = new Object[1];
                    C754570Tip c754570Tip3 = c954460awe2.LJIJJ;
                    if (c754570Tip3 != null) {
                        str3 = c754570Tip3.LIZ;
                        str4 = c754570Tip3.LIZIZ;
                    } else {
                        str3 = null;
                    }
                    objArr3[0] = C0KVU.LIZIZ(str3, str4);
                    c16f53.setText(C497740JfY.LJIJJ(2131853128, objArr3));
                }
                if (jLJJL == c954460awe2.LJ && (c1841350y173 = this.LLJILLL) != null) {
                    c1841350y173.setChecked(true);
                }
                ViewGroup viewGroup9 = this.LLIZLLLIL;
                if (viewGroup9 != null) {
                    C786410Ut5.LJLZ(0, viewGroup9);
                }
            }
            i = i2;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostAuxStreamSwitchListContract$AbsView
    public final List<C954460awe> PR() {
        return this.LLILZ;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostAuxStreamSwitchListContract$AbsView
    public final void SR(List<C954460awe> list) {
        if (!this.mStatusViewValid) {
            return;
        }
        this.LLILZ = list;
        if (((ArrayList) list).isEmpty()) {
            this.LL.dismiss();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAuxStreamUserListChanged auxStreamUserList = ");
        sbLIZ.append(list);
        C20441214yg.LIZIZ("MultiCoHostShareScreenSwitchListFragment", C2188811AlT.LIZIZ(sbLIZ));
        UR();
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131853129));
        c978980baC.LIZJ = (this.LLILZ.size() * 52) + 110;
        c978980baC.LJIILIIL = false;
        c978980baC.LIZLLL = false;
        c978980baC.LJII = RR();
        this.LL.Vh(c978980baC);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gk0, viewGroup, false);
        viewTd.findViewById(R.id.tjm);
        this.LLILZLL = (ViewGroup) viewTd.getRootView().findViewById(R.id.dv4);
        this.LLIZ = (ViewGroup) viewTd.getRootView().findViewById(R.id.dv5);
        this.LLIZLLLIL = (ViewGroup) viewTd.getRootView().findViewById(R.id.dv6);
        this.LLJ = (C16F5) viewTd.findViewById(R.id.tv_share_stream_username1);
        this.LLJI = (C16F5) viewTd.findViewById(R.id.tv_share_stream_username2);
        this.LLJIJIL = (C16F5) viewTd.findViewById(R.id.tv_share_stream_username3);
        this.LLJILJIL = (C1841350y17) viewTd.findViewById(R.id.st2);
        this.LLJILJILJ = (C1841350y17) viewTd.findViewById(R.id.st3);
        this.LLJILLL = (C1841350y17) viewTd.findViewById(R.id.st4);
        this.LLJJ = (C16FS) viewTd.findViewById(R.id.cvm);
        this.LLILZIL = viewTd;
        UR();
        List listLJIIJJI = C1697810uHb.LJIIJJI(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL);
        List listLJIIJJI2 = C1697810uHb.LJIIJJI(this.LLJ, this.LLJI, this.LLJIJIL);
        Iterator it2 = C1697810uHb.LJIIJJI(this.LLILZLL, this.LLIZ, this.LLIZLLLIL).iterator();
        int i2 = 0;
        while (true) {
            C19GS c19gs = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    ViewGroup viewGroup2 = (ViewGroup) next;
                    if (viewGroup2 != null) {
                        C786410Ut5.K7(viewGroup2, new ACListenerS53S0101000_15(i2, listLJIIJJI, 3));
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                for (Object obj : listLJIIJJI) {
                    int i4 = i + 1;
                    if (i >= 0) {
                        C1841350y17 c1841350y17 = (C1841350y17) obj;
                        if (c1841350y17 != null) {
                            C786410Ut5.e9(c1841350y17, new ACListenerS53S0101000_15(i, listLJIIJJI, 4));
                        }
                        i = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                C16FS c16fs = this.LLJJ;
                if (c16fs != null) {
                    C786410Ut5.h8(c16fs, new ACListenerS81S0300000_15(listLJIIJJI, this, listLJIIJJI2, 4));
                }
                C955400ayA c955400ayA = C955400ayA.LIZ;
                C955400ayA.LJLJI("show");
                View view = this.LLILZIL;
                if (!(view instanceof View)) {
                    view = null;
                }
                if (view != null) {
                    try {
                        ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                        ViewTreeViewModelStoreOwner.set(view, this);
                        view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                        C19EG activity = getActivity();
                        if (activity instanceof C19GS) {
                            c19gs = (C19GS) activity;
                        }
                        C1685300txQ.LIZ(c19gs);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return view;
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return view;
            }
        }
    }
}
