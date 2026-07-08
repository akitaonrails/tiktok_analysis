package X;

import Y.ARunnableS110S0100000_10;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0PMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643760PMw implements InterfaceC1603360rpG, InterfaceC643790PMz, InterfaceC326650CrH, C14FB, C0PDP {
    public TakoInnerDetailVM LL;
    public final C14FS LLILLJJLI;
    public final C0PHT LLILLL;
    public boolean LLILZ;
    public InterfaceC1209780haS LLILZIL;

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 7000;
    }

    @Override // X.InterfaceC1603360rpG
    public final void unInit() {
    }

    @Override // X.InterfaceC643790PMz
    public final boolean LJIIJJI() {
        return this.LLILLJJLI.LLILZIL.length() > 0 && this.LLILLJJLI.LLJJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[PHI: r0
      0x0086: PHI (r0v23 X.0PHw) = (r0v22 X.0PHw), (r0v92 X.0PHw) binds: [B:16:0x005d, B:23:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104 A[PHI: r0
      0x0104: PHI (r0v35 X.0PHw) = (r0v34 X.0PHw), (r0v48 X.0PHw) binds: [B:38:0x00db, B:45:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018a A[PHI: r0
      0x018a: PHI (r0v64 X.0PHw) = (r0v63 X.0PHw), (r0v77 X.0PHw) binds: [B:62:0x0161, B:69:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0PDP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> getAwemeList() {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C643760PMw.getAwemeList():java.util.List");
    }

    @Override // X.InterfaceC1603360rpG
    public final Object getViewModel() {
        TakoInnerDetailVM takoInnerDetailVM = this.LL;
        return takoInnerDetailVM == null ? new Object() : takoInnerDetailVM;
    }

    public C643760PMw() {
        C14FS c14fs = (C14FS) C144I.LIZ().uk0().LIZIZ();
        this.LLILLJJLI = c14fs;
        this.LLILLL = c14fs.LLILLJJLI;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        return ((ArrayList) getAwemeList()).isEmpty();
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return this.LLILZ;
    }

    @Override // X.C14FB
    public final void LIZIZ(Aweme aweme) {
        String str;
        C0PHX c0phx;
        String str2;
        C0PHX c0phx2;
        if (aweme != null) {
            C0PHT c0pht = this.LLILLJJLI.LLILLJJLI;
            String aid = aweme.getAid();
            C0PHW c0phwLIZJ = c0pht.LIZJ();
            if (c0phwLIZJ != null) {
                int i = 0;
                C0PHW c0phwLIZ = c0phwLIZJ;
                int i2 = 0;
                while (true) {
                    if (c0phwLIZ != null) {
                        str = c0phwLIZ.LIZ;
                    } else {
                        str = null;
                    }
                    if (u.LJIJI(str, aid, false)) {
                        if (c0phwLIZ != null && (c0phx = c0phwLIZ.LIZJ) != null) {
                            c0phx.LJI = true;
                        }
                        while (i < i2) {
                            C0PHW c0phwLIZJ2 = c0pht.LIZJ();
                            if (c0phwLIZJ2 != null) {
                                C0PHW c0phwLIZ2 = c0phwLIZJ2.LIZ();
                                if (c0phwLIZ2 == null) {
                                    C0PHW c0phw = c0pht.LJ;
                                    if (c0phw != null) {
                                        c0phw.LJIIIIZZ(null);
                                    }
                                } else {
                                    C0PHW c0phw2 = c0pht.LJ;
                                    if (c0phw2 != null) {
                                        c0phw2.LJIIIIZZ(c0phwLIZ2);
                                    }
                                    C0PHW c0phw3 = c0pht.LJ;
                                    if (c0phw3 != null) {
                                        c0phw3.LJFF = null;
                                    }
                                    C0PI0.LIZIZ(c0pht, "consume down");
                                }
                            }
                            i++;
                        }
                    } else {
                        if (c0phwLIZJ != null) {
                            str2 = c0phwLIZJ.LIZ;
                        } else {
                            str2 = null;
                        }
                        if (u.LJIJI(str2, aid, false)) {
                            if (c0phwLIZJ != null && (c0phx2 = c0phwLIZJ.LIZJ) != null) {
                                c0phx2.LJI = true;
                            }
                            while (i < i2) {
                                C0PHW c0phwLIZJ3 = c0pht.LIZJ();
                                if (c0phwLIZJ3 != null) {
                                    if (c0phwLIZJ3.LIZIZ() == null) {
                                        C0PHW c0phw4 = c0pht.LJ;
                                        if (c0phw4 != null) {
                                            c0phw4.LJIIIIZZ(null);
                                        }
                                    } else {
                                        C0PHW c0phw5 = c0pht.LJ;
                                        if (c0phw5 != null) {
                                            c0phw5.LJIIIIZZ(c0phwLIZJ3.LIZIZ());
                                        }
                                        C0PI0.LIZIZ(c0pht, "consume up");
                                    }
                                }
                                i++;
                            }
                        } else {
                            i2++;
                            if (c0phwLIZJ != null) {
                                c0phwLIZJ = c0phwLIZJ.LIZIZ();
                            } else {
                                c0phwLIZJ = null;
                            }
                            if (c0phwLIZ != null) {
                                c0phwLIZ = c0phwLIZ.LIZ();
                            } else {
                                c0phwLIZ = null;
                            }
                            if (c0phwLIZJ == null && c0phwLIZ == null) {
                                break;
                            }
                        }
                    }
                }
            }
            aweme.getAid();
        }
    }

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        this.LLILZIL = interfaceC1209780haS;
        TakoInnerDetailVM takoInnerDetailVM = this.LL;
        if (takoInnerDetailVM != null) {
            DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) interfaceC1209780haS;
            takoInnerDetailVM.xQ2(new AwS411S0200000_10(detailFragmentPanel, this, 123), new AwS376S0200000_10(detailFragmentPanel, this, 148), new AwS376S0200000_10(detailFragmentPanel, this, 149));
        }
        TakoInnerDetailVM takoInnerDetailVM2 = this.LL;
        if (takoInnerDetailVM2 != null) {
            DetailFragmentPanel detailFragmentPanel2 = (DetailFragmentPanel) interfaceC1209780haS;
            AssemViewModel.asyncSubscribe$default(takoInnerDetailVM2, new C2217371BqR() { // from class: X.0PMx
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C329290CvX) obj).LLILLJJLI;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C329290CvX) obj).LLILLJJLI = (AbstractC1623806Xk) obj2;
                }
            }, null, new AwS376S0200000_10(detailFragmentPanel2, this, 150), new AwS554S0100000_10(this, 1310), new AwS376S0200000_10(detailFragmentPanel2, this, 151), 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0147  */
    @Override // X.InterfaceC1603360rpG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean init(androidx.fragment.app.Fragment r12) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C643760PMw.init(androidx.fragment.app.Fragment):boolean");
    }

    @Override // X.InterfaceC326650CrH
    public final boolean j9(int i, Aweme aweme) {
        C0PHY c0phyLIZJ = this.LLILLL.LIZJ();
        if (c0phyLIZJ != null) {
            int i2 = 0;
            do {
                c0phyLIZJ = c0phyLIZJ.LIZ();
                if (c0phyLIZJ != null) {
                    i2++;
                }
            } while (i2 < 2);
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        TakoInnerDetailVM takoInnerDetailVM;
        if (i != 1) {
            if (i == 4 && this.LLILLJJLI.LLJJ) {
                C644780PQu c644780PQu = C644780PQu.LIZ;
                AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(this, 641);
                c644780PQu.getClass();
                C2252051DCp c2252051DCp = C2252051DCp.LIZ;
                ARunnableS110S0100000_10 aRunnableS110S0100000_10 = new ARunnableS110S0100000_10(awS589S0100000_10, 89);
                c2252051DCp.getClass();
                C2252051DCp.LJFF().execute(aRunnableS110S0100000_10);
                return;
            }
            return;
        }
        if (!((ArrayList) getAwemeList()).isEmpty() || (takoInnerDetailVM = this.LL) == null) {
            return;
        }
        List<Pair<String, Long>> list = this.LLILLJJLI.LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Pair<String, Long>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getFirst());
        }
        takoInnerDetailVM.vQ2(arrayList.toString());
    }
}
