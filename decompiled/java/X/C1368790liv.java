package X;

import X.C0I0B;
import X.C1368790liv;
import X.C1370970lmR;
import X.C21673919s1;
import X.C2211751BhN;
import X.C2216408mI;
import X.C866950Xzh;
import Y.ACListenerS155S0100000_21;
import Y.AObserverS183S0200000_21;
import Y.AObserverS224S0100000_21;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS149S0400000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0liv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368790liv extends AbstractC1368920lj8 implements InterfaceC1363370laB {
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public RecyclerView LLJILLL;
    public View LLJJ;
    public boolean LLJJI;
    public ARunnableS79S0200000_10 LLJJIII;

    @Override // X.AbstractC1368920lj8, X.InterfaceC1364650lcF
    public final void Ew(boolean z) {
    }

    @Override // X.AbstractC1368920lj8, X.InterfaceC1364650lcF
    public final void bd(boolean z) {
    }

    public final C1368610lid LJFF() {
        return (C1368610lid) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC1363370laB
    public final C0ZE7 getActivityStatusParams() {
        C0ZE7 c0ze7 = new C0ZE7(LIZIZ());
        c0ze7.LIZIZ(EnumC1910440zoY.MORE_PANEL);
        c0ze7.LJFF = "more_panel";
        c0ze7.LIZLLL = "homepage_hot";
        return c0ze7;
    }

    @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
    public final void onDestroy() {
        RecyclerView recyclerView;
        KeyboardUtils.LIZIZ(this.LLIZ);
        ((Boolean) this.LLJIJIL.getValue()).booleanValue();
        C0OBG.LIZ.clear();
        RecyclerView recyclerView2 = this.LLJILLL;
        if (recyclerView2 != null) {
            C2211751BhN.LIZIZ(recyclerView2);
        }
        ARunnableS79S0200000_10 aRunnableS79S0200000_10 = this.LLJJIII;
        if (aRunnableS79S0200000_10 != null && (recyclerView = this.LLJILLL) != null) {
            HandlerHook.viewRemoveCallbacks(recyclerView, aRunnableS79S0200000_10);
        }
        C897520ZIw c897520ZIw = (C897520ZIw) this.LLJILJIL.getValue();
        if (c897520ZIw != null) {
            c897520ZIw.destroy();
        }
    }

    @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
    public final void onStart() {
        C897520ZIw c897520ZIw = (C897520ZIw) this.LLJILJIL.getValue();
        if (c897520ZIw != null) {
            c897520ZIw.LJ();
        }
    }

    @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
    public final void onStop() {
        C897520ZIw c897520ZIw = (C897520ZIw) this.LLJILJIL.getValue();
        if (c897520ZIw != null) {
            c897520ZIw.LJII();
        }
    }

    @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
    public final void E3(SharePackage sharePackage) {
        LJFF().LLILZLL = sharePackage;
    }

    @Override // X.AbstractC1368920lj8, X.InterfaceC1364650lcF
    public final void N9(boolean z) {
        C1368610lid c1368610lidLJFF = LJFF();
        if (z != c1368610lidLJFF.LLJJ) {
            c1368610lidLJFF.LLJJ = z;
            c1368610lidLJFF.LLIZ.LLJJIJIL.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
    public final void onCreate(Bundle bundle) {
        LIZLLL().refresh();
    }

    @Override // X.AbstractC1368920lj8, X.InterfaceC1364650lcF
    public final void z51(boolean z) {
        C1368610lid c1368610lidLJFF = LJFF();
        if (z != c1368610lidLJFF.LLJJI) {
            c1368610lidLJFF.LLJJI = z;
        }
    }

    @Override // X.InterfaceC1368960ljC
    public final void onViewCreated(View view, Bundle bundle) {
        final RecyclerView recyclerView;
        ViewGroup viewGroup;
        List<? extends IMContact> listLLIIII;
        List<IMUser> batchContacts;
        C16FB c16fb;
        View viewFindViewById;
        this.LLIZ = view;
        if (LJ()) {
            View view2 = this.LLIZ;
            if (view2 != null && (viewFindViewById = view2.findViewById(R.id.eqq)) != null) {
                C337180DJs.LIZ(viewFindViewById);
                return;
            }
            return;
        }
        View view3 = this.LLIZ;
        View viewFindViewById2 = null;
        if (view3 != null) {
            recyclerView = (RecyclerView) view3.findViewById(R.id.eqp);
        } else {
            recyclerView = null;
        }
        this.LLJILLL = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            final Context context = recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.internalshare.impl.effectshare.FriendsListComponent$setupRecyclerView$1$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                    super.onLayoutCompleted(c21673919s1);
                    if (C866950Xzh.LIZIZ(this.LL.LJFF().LLLFZ())) {
                        C1368790liv c1368790liv = this.LL;
                        if (c1368790liv.LLJJI) {
                            c1368790liv.LLJJI = false;
                            String str = c1368790liv.LIZJ().LIZJ;
                            if (str == null) {
                                str = "";
                            }
                            long jLIZIZ = C2216408mI.LIZIZ(str);
                            long jCurrentTimeMillis = System.currentTimeMillis() - jLIZIZ;
                            if (jLIZIZ > 0 && jCurrentTimeMillis > 0) {
                                IInternalShareApi.LIZ.getClass();
                                C1370970lmR.LIZ().LIZJ().LJIIZILJ(jCurrentTimeMillis, C0I0B.LJFF.LIZIZ(), this.LL.LIZJ().LIZIZ, this.LL.LIZJ().LIZJ);
                            }
                        }
                    }
                    C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
                }
            });
            recyclerView.setAdapter(LJFF());
            final Context context2 = recyclerView.getContext();
            recyclerView.addOnScrollListener(new C1379050lzT(context2) { // from class: X.0lbk
                @Override // X.C1379050lzT, X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                    super.LJJIIJ(recyclerView2, i);
                    if (i == 1) {
                        KeyboardUtils.LIZIZ(recyclerView.getRootView());
                        C1362630lYz.LIZ.getClass();
                        C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
                        if (c2096308Jd != null) {
                            c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.SLIDE_SEARCH_PANEL.getValue()));
                        }
                    }
                }
            });
        }
        View view4 = this.LLIZ;
        if (view4 != null && (c16fb = (C16FB) view4.findViewById(R.id.eqq)) != null) {
            c16fb.setOverScrollMode(EnumC19356710o9.ONLY_BOTTOM);
        }
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(LIZ());
        View view5 = this.LLIZ;
        if (view5 != null) {
            viewGroup = (ViewGroup) view5.findViewById(R.id.eqq);
        } else {
            viewGroup = null;
        }
        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.cu6, viewGroup, false);
        if (viewTd != null) {
            TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.zs0);
            if (tuxTextView != null) {
                C1368890lj5.LIZIZ(tuxTextView, 2131845822);
            }
            viewFindViewById2 = viewTd.findViewById(R.id.nu5);
        }
        this.LLJJ = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 222), viewFindViewById2);
        }
        if (viewTd != null) {
            C1368610lid c1368610lidLJFF = LJFF();
            View view6 = c1368610lidLJFF.LLILZ;
            if (view6 == null) {
                c1368610lidLJFF.LLILZ = viewTd;
                c1368610lidLJFF.LLILZIL = true;
                c1368610lidLJFF.notifyItemInserted(0);
            } else {
                Intrinsics.LJFF(view6, viewTd);
            }
        }
        ShareMoreViewModel shareMoreViewModelLIZLLL = LIZLLL();
        shareMoreViewModelLIZLLL.LLILLJJLI.LJL();
        shareMoreViewModelLIZLLL.LLJILJIL.observe(LIZIZ(), new AObserverS183S0200000_21(this, shareMoreViewModelLIZLLL, 9));
        shareMoreViewModelLIZLLL.LLJJI.observe(LIZIZ(), new AObserverS224S0100000_21(this, 69));
        shareMoreViewModelLIZLLL.LLIZLLLIL.observe(LIZIZ(), new AObserverS224S0100000_21(this, 70));
        shareMoreViewModelLIZLLL.LLJIJIL.observe(LIZIZ(), new AObserverS224S0100000_21(this, 71));
        Set<IMContact> set = LIZJ().LJIILL;
        if (set == null || (listLLIIII = C13LP.LLIIII(set)) == null) {
            listLLIIII = C13BV.INSTANCE;
        }
        shareMoreViewModelLIZLLL.CQ2(listLLIIII);
        if (((Boolean) this.LLJIJIL.getValue()).booleanValue()) {
            C1365460ldY c1365460ldY = LIZJ().LJIILJJIL;
            if (c1365460ldY == null || (batchContacts = c1365460ldY.getBatchContacts()) == null) {
                batchContacts = C13BV.INSTANCE;
            }
            shareMoreViewModelLIZLLL.CQ2(batchContacts);
        }
        shareMoreViewModelLIZLLL.LLJJJIL.setValue(0);
    }

    public C1368790liv(C1368870lj3 c1368870lj3, Map<String, String> map, Map<String, String> map2) {
        super(c1368870lj3);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1416));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(539));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS149S0400000_21(this, (C1368790liv) c1368870lj3, (C1368870lj3) map, map2, (Map<String, String>) 4));
        this.LLJJI = true;
    }
}
