package X;

import X.InterfaceC643820PNc;
import Y.ACallableS417S0100000_10;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.NativeGpsPopupConfig;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0PNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643810PNb<TopView extends InterfaceC643820PNc> extends C1260870iur<C0PN8, TopView> {
    @Override // X.C1260870iur
    public final /* bridge */ /* synthetic */ void LJIIJ(AbstractC666100QAu abstractC666100QAu) {
        throw null;
    }

    @Override // X.C1260870iur
    public final void LJIILIIL() {
        T t = this.LL;
        if (t == 0 || this.LLILLJJLI == 0) {
            return;
        }
        int i = ((AbstractC1255880imo) t).mListQueryType;
        if (i == 1) {
            LJIIZILJ().LJ();
        } else if (i == 2) {
            LJIIZILJ().Jm();
        } else if (i == 4) {
            LJIIZILJ().showLoadMoreLoading();
        }
    }

    @Override // X.C1260870iur
    public final void LJIILJJIL() {
        T t = this.LL;
        if (t != 0) {
            ((C0PN2) t).LJIIJJI(0, "search grid unBindModel");
            C0PN8 c0pn8 = (C0PN8) this.LL;
            c0pn8.getClass();
            C0PIF c0pif = C0PIF.LIZ;
            List<SearchMixFeed> items = c0pn8.getItems();
            c0pif.getClass();
            if (items != null) {
                C15O7.LIZIZ(new ACallableS417S0100000_10(items, 3), C823050WQl.LIZIZ(), null);
            }
            C0PIF.LJIIIIZZ(c0pn8.getAwemeList());
        }
        super.LJIILJJIL();
    }

    public final void LJIILLIIL() {
        K k;
        if (this.LL == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        ((InterfaceC643820PNc) k).VI0();
    }

    public final InterfaceC1212360hec<?> LJIIZILJ() {
        return ((InterfaceC643820PNc) this.LLILLJJLI).eu1();
    }

    public final C0PO1 LJIJ() {
        return ((InterfaceC643820PNc) this.LLILLJJLI).vb0();
    }

    public final InterfaceC643870PNh LJIJI() {
        return ((InterfaceC643820PNc) this.LLILLJJLI).xY1();
    }

    public final void LJIJJ() {
        if (this.LL == 0 || this.LLILLJJLI == 0 || !LJIJ().isViewValid()) {
            return;
        }
        ((InterfaceC643820PNc) this.LLILLJJLI).zQ1((SearchMixFeedList) this.LL.getData());
    }

    public final void LJIL() {
        K k = this.LLILLJJLI;
        if (k == 0) {
            return;
        }
        ((InterfaceC643820PNc) k).FB0(false);
    }

    public final void LJJIII() {
        K k;
        T t = this.LL;
        if (t == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        ((InterfaceC643820PNc) k).V30((SearchMixFeedList) t.getData());
    }

    public final void LJJIIJ() {
        if (this.LL == 0 || this.LLILLJJLI == 0 || !LJIJ().isViewValid()) {
            return;
        }
        ((InterfaceC643820PNc) this.LLILLJJLI).MH0((SearchMixFeedList) this.LL.getData());
    }

    public final void LJJIIJZLJL() {
        if (this.LL == 0 || this.LLILLJJLI == 0 || !LJIJ().isViewValid()) {
            return;
        }
        ((InterfaceC643820PNc) this.LLILLJJLI).PZ();
    }

    public final void LJJIIZ() {
        K k;
        if (this.LL == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        ((InterfaceC643820PNc) k).lY1();
    }

    public final void LJJIJIL() {
        K k;
        if (this.LL == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        ((InterfaceC643820PNc) k).Sy0();
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        if (this.LL == 0 || this.LLILLJJLI == 0 || !LJIJ().isViewValid()) {
            return;
        }
        if (this.LL.getData() != null) {
            ((InterfaceC643820PNc) this.LLILLJJLI).vw(((SearchApiResult) this.LL.getData()).globalDoodleConfig);
            C0P58.LIZIZ(Integer.valueOf(this.LLILLJJLI.hashCode()), ((SearchMixFeedList) this.LL.getData()).mBacktrace);
        }
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) this.LL;
        int i = abstractC1255880imo.mListQueryType;
        if (i != 1) {
            if (i != 4 || abstractC1255880imo.getData() == 0) {
                return;
            }
            List<SearchMixFeed> list = ((SearchMixFeedList) this.LL.getData()).mItems;
            if (list != null && (!list.isEmpty())) {
                ((C0PN8) this.LL).LJJIJIIJIL(list);
            }
            ((SearchMixFeedList) this.LL.getData()).mItems = ((AbstractC1255880imo) this.LL).getItems();
            ((InterfaceC643820PNc) this.LLILLJJLI).Wo((SearchMixFeedList) this.LL.getData());
            return;
        }
        if (abstractC1255880imo.getData() == 0) {
            LJIIZILJ().Ng1();
            return;
        }
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParamI = LJIJI().I();
        c644060POa.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParamI);
        c0po5LJII.LIZIZ(((AbstractC1255880imo) this.LL).getItems().size());
        c0po5LJII.LJII(((C0PN2) this.LL).LLJILJILJ);
        c0po5LJII.LJIJ((InterfaceC1201180hMa) this.LL.getData());
        ((SearchMixFeedList) this.LL.getData()).mItems = ((AbstractC1255880imo) this.LL).getItems();
        ((InterfaceC643820PNc) this.LLILLJJLI).L71((SearchMixFeedList) this.LL.getData());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c A[Catch: Exception -> 0x00cf, PHI: r2
      0x008c: PHI (r2v7 java.lang.String) = (r2v4 java.lang.String), (r2v8 java.lang.String) binds: [B:15:0x0087, B:17:0x008a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00cf, blocks: (B:12:0x007d, B:14:0x0083, B:18:0x008c, B:21:0x0093, B:23:0x0099, B:26:0x00a9), top: B:34:0x007d }] */
    @Override // X.C1260870iur
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.lang.Object... r6) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C643810PNb.LIZJ(java.lang.Object[]):boolean");
    }

    public final void LJIILL(C0PN8 c0pn8) {
        super.LJIIJ(c0pn8);
        T t = this.LL;
        if (t != 0 && this.LLILLJJLI != 0) {
            ((C0PN2) t).LLJ = LJIJI().ZA();
        }
        if (c0pn8 != null) {
            c0pn8.onModelBound();
        }
    }

    public final void LJJ(SearchMixFeed searchMixFeed) {
        if (this.LL != 0 && this.LLILLJJLI != 0 && LJIJ().isViewValid()) {
            InterfaceC643820PNc interfaceC643820PNc = (InterfaceC643820PNc) this.LLILLJJLI;
            this.LL.getData();
            interfaceC643820PNc.Vs0(searchMixFeed);
        }
    }

    public final void LJJIIZI(String str) {
        InterfaceC643820PNc interfaceC643820PNc = (InterfaceC643820PNc) this.LLILLJJLI;
        if (interfaceC643820PNc != null) {
            interfaceC643820PNc.WV0(str);
        }
    }

    public final void LJJIJ(String str) {
        C0PN8 c0pn8 = (C0PN8) this.LL;
        if (c0pn8 != null) {
            c0pn8.LLJJJJJIL = str;
            if (str != null && !str.isEmpty()) {
                C0PHR c0phr = C0PHR.LIZ;
                C0PHT c0phtLJJIIZ = c0pn8.LJJIIZ();
                c0phr.getClass();
                C0PHR.LIZ(c0phtLJJIIZ, str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJIIJI(GlobalDoodleConfig globalDoodleConfig) {
        Fragment fragment;
        Object c098200Yq;
        boolean z;
        K k = this.LLILLJJLI;
        if (k instanceof Fragment) {
            fragment = (Fragment) k;
        } else {
            fragment = null;
        }
        if (globalDoodleConfig != null && fragment != null) {
            try {
                c098200Yq = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str = (String) c098200Yq;
            boolean shouldShowNativeGPSPopup = globalDoodleConfig.getShouldShowNativeGPSPopup();
            boolean zIsLoggable = Log.isLoggable("SearchGpsPopupDevForce", 2);
            boolean zBooleanValue = ((Boolean) C04SV.LIZ.getValue()).booleanValue();
            if (((Number) C1108204Vc.LIZ.getValue()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!zBooleanValue && !zIsLoggable) {
                C0PPN c0ppn = C0PPN.LIZ;
                EnumC682580Qq0 enumC682580Qq0 = EnumC682580Qq0.NATIVE_BANNER;
                c0ppn.getClass();
                C0PPN.LIZ("use_popup_banner_off", str, enumC682580Qq0, null);
            } else if (!shouldShowNativeGPSPopup && !zIsLoggable) {
                C0PPN c0ppn2 = C0PPN.LIZ;
                EnumC682580Qq0 enumC682580Qq02 = EnumC682580Qq0.NATIVE_BANNER;
                c0ppn2.getClass();
                C0PPN.LIZ("server_flag_off", str, enumC682580Qq02, null);
            } else if (str != null && (!a0.LJJJIL(str)) && !Intrinsics.LJFF(C644010PNv.LIZ.getAndSet(str), str)) {
                C687890QyZ.LIZ.getClass();
                C19EG activity = fragment.getActivity();
                if (activity == null) {
                    C0PPN c0ppn3 = C0PPN.LIZ;
                    EnumC682580Qq0 enumC682580Qq03 = EnumC682580Qq0.NATIVE_BANNER;
                    c0ppn3.getClass();
                    C0PPN.LIZ("native_banner_no_activity", str, enumC682580Qq03, null);
                } else {
                    NativeGpsPopupConfig nativeGpsPopupConfigLJII = C687890QyZ.LJII();
                    C687890QyZ.LJI(new C687920Qyc(EnumC682580Qq0.NATIVE_BANNER, EnumC687950Qyf.PRECISE, "search", C687890QyZ.LJIIIIZZ(), str, C687890QyZ.LJIIIZ(), nativeGpsPopupConfigLJII.popupDelayMs, nativeGpsPopupConfigLJII.cooldownAfterCloseDays, nativeGpsPopupConfigLJII.cooldownUpgradeDays, nativeGpsPopupConfigLJII.upgradeThreshold, z, new WeakReference(activity), new WeakReference(fragment), new InterfaceC687970Qyh() { // from class: X.0PNo
                        @Override // X.InterfaceC687970Qyh
                        public final void LIZ(Map<String, ? extends Object> map) {
                        }

                        @Override // X.InterfaceC687970Qyh
                        public final void LIZIZ(int i, String str2) {
                        }

                        @Override // X.InterfaceC687970Qyh
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC687970Qyh
                        public final void LIZLLL(String str2) {
                        }

                        @Override // X.InterfaceC687970Qyh
                        public final void LJ(int i) {
                        }
                    }));
                }
            }
        }
        InterfaceC643820PNc interfaceC643820PNc = (InterfaceC643820PNc) this.LLILLJJLI;
        if (interfaceC643820PNc != null) {
            interfaceC643820PNc.vw(globalDoodleConfig);
        }
    }

    public final void LJJIJIIJIL(float f) {
        ((InterfaceC643820PNc) this.LLILLJJLI).Cb1(1.0f);
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        if (this.LL != 0 && this.LLILLJJLI != 0 && LJIJ().isViewValid()) {
            int i = ((AbstractC1255880imo) this.LL).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    ((InterfaceC643820PNc) this.LLILLJJLI).ug(exc);
                    return;
                }
                return;
            }
            ((InterfaceC643820PNc) this.LLILLJJLI).LLLLLZIL(exc);
        }
    }

    public final void LJIJJLI(int i, Exception exc) {
        K k = this.LLILLJJLI;
        if (k == 0) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    LJIIZILJ().Ng1();
                }
            } else if (exc != null) {
                LJIIZILJ().Uq2(exc);
            }
            C665250Q7n c665250Q7n = C665250Q7n.LIZ;
            SearchResultParam searchResultParam = ((C0PN2) this.LL).LLILZ;
            c665250Q7n.getClass();
            C665250Q7n.LIZJ("request_error", -1, -1, "", searchResultParam, null, null);
            return;
        }
        ((InterfaceC643820PNc) k).FB0(true);
        ((InterfaceC643820PNc) this.LLILLJJLI).HW();
        C665250Q7n c665250Q7n2 = C665250Q7n.LIZ;
        SearchResultParam searchResultParam2 = ((C0PN2) this.LL).LLILZ;
        c665250Q7n2.getClass();
        C665250Q7n.LIZJ("request_success", -1, -1, "", searchResultParam2, null, null);
    }

    public final void LJJI(boolean z, SearchMixFeed searchMixFeed, SearchMixFeedList searchMixFeedList) {
        K k = this.LLILLJJLI;
        if (k == 0) {
            return;
        }
        ((InterfaceC643820PNc) k).IL0(z, searchMixFeed, (SearchMixFeedList) this.LL.getData());
    }

    public final void LJJII(SearchMixFeedList searchMixFeedList, int i, int i2, int i3) {
        if (this.LL != 0 && this.LLILLJJLI != 0 && LJIJ().isViewValid()) {
            ((InterfaceC643820PNc) this.LLILLJJLI).RD(searchMixFeedList, i, i2, i3);
        }
    }
}
