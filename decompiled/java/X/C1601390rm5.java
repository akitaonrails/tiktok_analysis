package X;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import com.ss.android.ugc.feed.platform.panel.live.IFeedDataChangeAbility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS425S0200000_24;

/* JADX INFO: renamed from: X.0rm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601390rm5 extends C1255920ims<C1601380rm4> implements InterfaceC606900NrE {
    public boolean LLILZIL;
    public InterfaceC666290QBn LLILZLL;
    public boolean LLIZLLLIL;
    public final Fragment LLJI;
    public String LLJIJIL;
    public int LLJILJIL;
    public C1601460rmC LLJILJILJ;
    public RecommendFeedFragmentPanel LLJJ;
    public String LLJ = "";
    public final List<C607290Nrr> LLJJI = new ArrayList();
    public boolean LLJJIII = false;
    public boolean LLJJIJI = false;
    public boolean LLJJIJIIJIL = true;
    public final C0S4J LLJJIJIL = new C0S4J("FeedFetchPresenter");
    public boolean LLJJJ = false;
    public volatile boolean LLJJJIL = false;
    public boolean LLIZ = false;
    public final C587880N3y LLJILLL = new Object() { // from class: X.0N3y
        public static final /* synthetic */ int LIZ = 0;

        {
            C587840N3u.LIZ.LIZ(EnumC587870N3x.FEED_REQ);
        }
    };

    public final void LJJ() {
        T t;
        C1601380rm4 c1601380rm4;
        FeedItemList feedItemList;
        RecommendFeedFragmentPanel recommendFeedFragmentPanel;
        IFeedDataChangeAbility iFeedDataChangeAbility;
        if (!C2093608Ic.LIZJ(this.LLJIJIL, "homepage_hot") || (t = this.LL) == 0 || (feedItemList = (c1601380rm4 = (C1601380rm4) t).LLILZ) == null || (recommendFeedFragmentPanel = this.LLJJ) == null) {
            return;
        }
        if (this.LLJILJIL == 1 && c1601380rm4.LLJI) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7z = recommendFeedFragmentPanel.LL;
        int i = FeedLiveStatusManagerComponent.LLJLIL;
        if (interfaceC665370Q7z == null || (iFeedDataChangeAbility = (IFeedDataChangeAbility) C1558520qew.LIZ(interfaceC665370Q7z, IFeedDataChangeAbility.class, null)) == null) {
            return;
        }
        iFeedDataChangeAbility.tD1(feedItemList);
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01f0  */
    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess() {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601390rm5.onSuccess():void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0N3y] */
    public C1601390rm5(Fragment fragment) {
        this.LLJI = fragment;
    }

    public static void LJJI(int i) {
        if (C798410VTr.LIZ()) {
            HashMap map = new HashMap();
            map.put("monitor_scene", "scene_feed_data");
            map.put("vv_code", Integer.valueOf(i));
            C798410VTr.LJFF(map);
        }
    }

    @Override // X.C1255920ims, X.InterfaceC1255940imu
    public final boolean B1(C0PN0 c0pn0) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLILZ;
        if (interfaceC1255930imt != null) {
            return interfaceC1255930imt.B1(c0pn0);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0Nrq] */
    @Override // X.C1260870iur
    public final boolean LIZJ(Object... objArr) {
        String str;
        boolean zLJI = MethodIDManager.LJI(137661);
        boolean z = false;
        ((Integer) objArr[0]).intValue();
        int iIntValue = ((Integer) objArr[0]).intValue();
        String str2 = "";
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 4) {
                    str = "";
                } else {
                    str = "load_more";
                }
            } else {
                str = "load_latest";
            }
        } else {
            str = "refresh";
        }
        this.LLJ = str;
        C0R9P.LIZLLL(EnumC1609900rzo.RECOMMEND_FEED, this.LLJI.getActivity());
        C1601460rmC c1601460rmC = (C1601460rmC) objArr[1];
        int i = c1601460rmC.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    str2 = "homepage_fresh";
                }
            } else {
                str2 = "homepage_follow";
            }
        } else {
            str2 = "homepage_hot";
        }
        this.LLJIJIL = str2;
        this.LLJILJIL = c1601460rmC.LIZIZ;
        this.LLJILJILJ = c1601460rmC;
        InterfaceC666290QBn interfaceC666290QBn = this.LLILZLL;
        if (interfaceC666290QBn != null) {
            interfaceC666290QBn.Uh(this.LLIZLLLIL);
        }
        T t = this.LL;
        if (this.LLJILJIL == 14 && c1601460rmC.LJJIJL) {
            if (t != 0 && t.sendRequest(objArr)) {
                z = true;
            }
            this.LLIZ = z;
        } else {
            this.LLIZ = super.LIZJ(objArr);
        }
        if (this.LLIZ) {
            final int i2 = this.LLJILJIL;
            ?? r2 = new Object(i2) { // from class: X.0Nrq
            };
            Iterator it2 = ((ArrayList) this.LLJJI).iterator();
            while (it2.hasNext()) {
                ((C607290Nrr) it2.next()).LIZIZ(r2);
            }
        }
        C0S4J c0s4j = this.LLJJIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[sendRequest] ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(",");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(",");
        sbLIZ.append(this.LLIZLLLIL);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLIZ) {
            C1601950rmz c1601950rmz = C1601950rmz.LIZ;
            C1601230rlp c1601230rlp = new C1601230rlp(c1601460rmC);
            c1601950rmz.getClass();
            C0S78.LIZJ(new C1601580rmO(c1601460rmC, "feed_request", c1601230rlp), true);
        }
        boolean z2 = this.LLIZ;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return z2;
    }

    @Override // X.C1260870iur
    /* JADX INFO: renamed from: LJIJI, reason: merged with bridge method [inline-methods] */
    public final void LJIIJ(C1601380rm4 c1601380rm4) {
        super.LJIIJ(c1601380rm4);
        c1601380rm4.LL = this;
        this.LLJJJ = c1601380rm4.LLJJ;
    }

    public final void LJIJJ(String str) {
        if (!TextUtils.isEmpty(str) && ((AbstractC1255880imo) this.LL).getItems() != null) {
            for (int size = ((AbstractC1255880imo) this.LL).getItems().size() - 1; size >= 0; size--) {
                Aweme aweme = (Aweme) ListProtector.get(((AbstractC1255880imo) this.LL).getItems(), size);
                if (aweme != null && TextUtils.equals(str, AwemeExtKt.getAuthorUid(aweme))) {
                    ((C1601380rm4) this.LL).deleteItem(aweme);
                }
            }
        }
    }

    public final void LJIJJLI(Aweme aweme) {
        List items = ((AbstractC1255880imo) this.LL).getItems();
        if (C086I.LIZIZ(items)) {
            items = new ArrayList();
        }
        if (items.size() < 0) {
            return;
        }
        ListProtector.add(items, 0, aweme);
        ((AbstractC1255880imo) this.LL).setItems(items);
        if (this.LLILLJJLI != 0) {
            if (((AbstractC1255880imo) this.LL).isDataEmpty()) {
                ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
            } else {
                w(0, items);
            }
        }
    }

    @Override // X.C1255920ims, X.InterfaceC1255940imu
    public final void LLLZZIL(List list) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLILZ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.LLLZZIL(list);
        }
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        boolean z;
        C1616470sAP.LIZIZ.LIZJ(null);
        C0R9P.LIZJ(EnumC1609900rzo.RECOMMEND_FEED);
        getClass();
        C0NET.LIZ.getClass();
        SystemClock.elapsedRealtime();
        if (Feed0VVManager.LIZIZ < 0) {
            Feed0VVManager.LIZIZ = SystemClock.elapsedRealtime();
        }
        if (exc != null && !TextUtils.isEmpty(exc.getMessage())) {
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            C10R5 c10r5LIZ = C10RS.LIZ();
            try {
                if (c10r5LIZ.LJI == -1) {
                    c10r5LIZ.LJI = C1498560p6E.LIZIZ(exc, null);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.LLILZIL) {
            this.LLILZIL = false;
            this.LL.getClass();
        }
        C1440005kM.LIZ(new C1581940rGi());
        InterfaceC666290QBn interfaceC666290QBn = this.LLILZLL;
        if (interfaceC666290QBn != null) {
            if (this.LLIZ && !this.LLIZLLLIL) {
                z = false;
            } else {
                z = true;
            }
            interfaceC666290QBn.Uh(z);
        }
        T t = this.LL;
        if (t != 0) {
            C607220Nrk c607220Nrk = new C607220Nrk(this.LLJILJIL, ((AbstractC1255880imo) t).mListQueryType, null);
            Iterator it2 = ((ArrayList) this.LLJJI).iterator();
            while (it2.hasNext()) {
                ((C607290Nrr) it2.next()).LIZ(c607220Nrk);
            }
        }
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        C0N44.LIZ.getClass();
        super.onFailed(exc);
        if (((AbstractC1255880imo) this.LL).mListQueryType == 9) {
            K k = this.LLILLJJLI;
            if (k instanceof InterfaceC1601600rmQ) {
                ((InterfaceC1601600rmQ) k).LJIJJLI(exc);
            }
        }
        C799900VZk.LIZ.getClass();
        C799900VZk.LIZIZ();
        C1601460rmC c1601460rmC = this.LLJILJILJ;
        if (c1601460rmC != null && exc != null) {
            C1601950rmz c1601950rmz = C1601950rmz.LIZ;
            AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(c1601460rmC, exc, 9);
            c1601950rmz.getClass();
            C0S78.LIZJ(new C1601580rmO(c1601460rmC, "feed_request_response", awS425S0200000_24), true);
        }
        C0S4J c0s4j = this.LLJJIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onFailed] ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(",");
        sbLIZ.append(this.LLJIJIL);
        c0s4j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ), exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "homepage_hot"
            boolean r0 = X.C2093608Ic.LIZJ(r6, r0)
            if (r0 == 0) goto L7c
            T extends X.0QAu r1 = r4.LL
            if (r1 == 0) goto L7c
            r0 = 1
            if (r5 != r0) goto L32
            X.0rm4 r1 = (X.C1601380rm4) r1
            boolean r0 = r1.LLJI
            if (r0 != 0) goto L29
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            X.0rmI r1 = r0.S3()
            r0 = 0
            r1.LIZ(r0)
        L29:
            T extends X.0QAu r0 = r4.LL
            X.0rm4 r0 = (X.C1601380rm4) r0
            boolean r0 = r0.LLJI
            if (r0 == 0) goto L35
            return
        L32:
            if (r5 != r0) goto L35
            goto L29
        L35:
            long r2 = java.lang.System.currentTimeMillis()
            T extends X.0QAu r0 = r4.LL
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.ss.android.ugc.aweme.feed.model.FeedItemList) r0
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.feed.model.Extra r0 = r0.extra
            if (r0 == 0) goto L49
            long r2 = r0.now
        L49:
            X.01GW r0 = X.C292930Bdz.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7d
            T extends X.0QAu r0 = r4.LL
            X.0rm4 r0 = (X.C1601380rm4) r0
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r0.LLILZ
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            X.0rmI r1 = r0.S3()
            T extends X.0QAu r0 = r4.LL
            X.0rm4 r0 = (X.C1601380rm4) r0
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r0.LLILZ
            java.util.List r0 = r0.getItems()
            r1.LJIIJJI(r2, r0)
        L7c:
            return
        L7d:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            X.0rmI r1 = r0.S3()
            T extends X.0QAu r0 = r4.LL
            X.0imo r0 = (X.AbstractC1255880imo) r0
            java.util.List r0 = r0.getItems()
            r1.LJIIJJI(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601390rm5.LJIL(int, java.lang.String):void");
    }

    @Override // X.InterfaceC606900NrE
    public final List fF(int i, int i2, String str, List list) {
        T t = this.LL;
        if (t != 0) {
            return ((C1601380rm4) t).fF(i, i2, str, list);
        }
        return null;
    }
}
