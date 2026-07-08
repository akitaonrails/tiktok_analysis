package X;

import Y.AObserverS226S0100000_24;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0rQ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587710rQ1 extends C1255920ims<C1587810rQB> {
    public boolean LLILZIL;
    public InterfaceC666290QBn LLILZLL;
    public InterfaceC1255930imt<Aweme> LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public String LLJIJIL;

    @Override // X.C1255920ims
    public final int LJIIZILJ(List<Object> list) {
        return 0;
    }

    public final boolean LJIIIIZZ() {
        T t = this.LL;
        return t != 0 && ((AbstractC1255880imo) t).isHasMore();
    }

    public final List<String> LJIJJLI() {
        List<FriendsFeed> list;
        String aid;
        T t = this.LL;
        ArrayList arrayList = null;
        if (t != 0 && (list = ((C1587810rQB) t).LLILLJJLI) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((CopyOnWriteArrayList) list).iterator();
            while (it2.hasNext()) {
                Aweme aweme = ((FriendsFeed) it2.next()).getAweme();
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                arrayList.add(aid);
            }
        }
        return arrayList;
    }

    public final void LJIL() {
        if (this.LLILZIL) {
            this.LLILZIL = false;
            C1587810rQB c1587810rQB = (C1587810rQB) this.LL;
            if (c1587810rQB != null) {
                c1587810rQB.LL = false;
            }
        }
        if (this.LLJ) {
            C1440005kM.LIZ(new C1581940rGi("FRIENDS_FEED"));
        } else {
            C1440005kM.LIZ(new C1581940rGi());
        }
    }

    @Override // X.C1255920ims, X.C1260870iur
    public final void LIZ() {
        super.LIZ();
        this.LLIZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess() {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587710rQ1.onSuccess():void");
    }

    @Override // X.C1260870iur
    public final void LJIILJJIL() {
        super.LJIILJJIL();
    }

    public C1587710rQ1(Fragment fragment) {
        LifecycleOwner lifecycleOwnerLIZJ = C1591220rVg.LIZLLL() ? fragment : StateOwner.LL.LIZJ();
        if (lifecycleOwnerLIZJ != null) {
            StateOwner.LL.getClass();
            StateOwner.LLJILJILJ.observe(lifecycleOwnerLIZJ, new AObserverS226S0100000_24(this, 24));
        }
    }

    @Override // X.C1260870iur
    public final boolean LIZJ(Object... objArr) {
        boolean zLJI = MethodIDManager.LJI(137757);
        InterfaceC666290QBn interfaceC666290QBn = this.LLILZLL;
        if (interfaceC666290QBn != null) {
            interfaceC666290QBn.Uh(this.LLIZLLLIL);
        }
        boolean zLIZJ = super.LIZJ(Arrays.copyOf(objArr, objArr.length));
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zLIZJ;
    }

    @Override // X.C1260870iur
    public final void LJIIJ(AbstractC666100QAu abstractC666100QAu) {
        super.LJIIJ(abstractC666100QAu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1255920ims
    public final void LJIILL(InterfaceC1255930imt<?> interfaceC1255930imt) {
        this.LLIZ = interfaceC1255930imt;
    }

    @Override // X.C1255920ims
    public final boolean LJIILLIIL(Object obj) {
        Object c098200Yq;
        Integer numValueOf;
        if (obj == null) {
            return false;
        }
        try {
            if (obj instanceof Aweme) {
                if (C729510SjV.LJJIJIL((Aweme) obj)) {
                    return false;
                }
                List<FriendsFeed> items = ((C1587810rQB) this.LL).getItems();
                if (!C086I.LIZIZ(items)) {
                    if (items == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(items.size());
                    }
                    int iIntValue = numValueOf.intValue();
                    for (int i = 0; i < iIntValue; i++) {
                        FriendsFeed friendsFeed = items.get(i);
                        if (TextUtils.equals(((Aweme) obj).getAid(), C735370Ssx.LIZJ(friendsFeed.getAweme()))) {
                            ((C1587810rQB) this.LL).deleteItem(friendsFeed);
                            return true;
                        }
                    }
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("friends feed deleteItem called error ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C2344809Gs.LJFF("FriendsFeedPresenter", C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    public final void LJIJI(C1587810rQB c1587810rQB) {
        super.LJIIJ(c1587810rQB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0016 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIJJ(java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r12) {
        /*
            r11 = this;
            r0 = r12
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r4 = 1
            r0 = r0 ^ 1
            r10 = 0
            if (r0 != 0) goto Le
            r12 = r10
        Le:
            r8 = 0
            if (r12 == 0) goto La3
            java.util.Iterator r9 = r12.iterator()
            r8 = 0
        L16:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r3 = r9.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            T extends X.0QAu r6 = r11.LL
            X.0rQB r6 = (X.C1587810rQB) r6
            java.util.List r5 = r6.getItems()
            boolean r0 = X.C086I.LIZIZ(r5)
            if (r0 != 0) goto L16
            if (r5 == 0) goto La1
            java.util.Iterator r2 = r5.iterator()
        L36:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r7 = r2.next()
            com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed r7 = (com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed) r7
            if (r7 == 0) goto L36
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.getAweme()
            if (r0 == 0) goto L36
            java.lang.String r1 = r3.getAid()
            java.lang.String r0 = r0.getAid()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L36
        L58:
            java.util.List r1 = r6.LJIIJJI()
            boolean r0 = X.C086I.LIZIZ(r1)
            if (r0 != 0) goto L16
            int r3 = X.C729980SkG.LJFF(r3, r1)
            if (r3 < 0) goto L86
            java.util.List<X.05yG> r0 = r6.mNotifyListeners
            java.util.Iterator r2 = r0.iterator()
        L6e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r1 = r2.next()
            X.05yG r1 = (X.InterfaceC1526205yG) r1
            if (r1 == 0) goto L6e
            boolean r0 = r1 instanceof X.InterfaceC1255940imu
            if (r0 == 0) goto L6e
            X.0imu r1 = (X.InterfaceC1255940imu) r1
            r1.Y1(r3)
            goto L6e
        L86:
            if (r7 == 0) goto L16
            if (r5 == 0) goto L9f
            boolean r0 = r5.remove(r7)
            if (r0 != r4) goto L9f
            r1 = 1
        L91:
            T r0 = r6.mData
            com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse r0 = (com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse) r0
            if (r0 == 0) goto L99
            r0.friendFeedData = r5
        L99:
            if (r1 == 0) goto L16
            int r8 = r8 + 1
            goto L16
        L9f:
            r1 = 0
            goto L91
        La1:
            r7 = r10
            goto L58
        La3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587710rQ1.LJIJJ(java.util.List):int");
    }

    @Override // X.C1255920ims, X.InterfaceC1255940imu
    public final void Y1(int i) {
        InterfaceC1255930imt<Aweme> interfaceC1255930imt = this.LLIZ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.Y1(i);
        }
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        InterfaceC1212360hec interfaceC1212360hec;
        LJIL();
        InterfaceC666290QBn interfaceC666290QBn = this.LLILZLL;
        if (interfaceC666290QBn != null) {
            interfaceC666290QBn.Uh(true);
        }
        this.LLIZLLLIL = false;
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) this.LL;
        if (abstractC1255880imo == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(abstractC1255880imo.mListQueryType);
        if (numValueOf != null) {
            if (numValueOf.intValue() == 1) {
                InterfaceC1212360hec interfaceC1212360hec2 = (InterfaceC1212360hec) this.LLILLJJLI;
                if (interfaceC1212360hec2 != null) {
                    interfaceC1212360hec2.Uq2(exc);
                }
            } else if (numValueOf.intValue() == 4) {
                InterfaceC1212360hec interfaceC1212360hec3 = (InterfaceC1212360hec) this.LLILLJJLI;
                if (interfaceC1212360hec3 != null) {
                    interfaceC1212360hec3.Wi(exc);
                }
            } else if (numValueOf.intValue() == 2 && (interfaceC1212360hec = (InterfaceC1212360hec) this.LLILLJJLI) != null) {
                interfaceC1212360hec.bD1(exc);
            }
        }
        C0R9P.LIZJ(EnumC1609900rzo.TAB_FRIENDS);
    }

    @Override // X.C1255920ims
    public final boolean LJIJ(Object obj, int i) {
        Integer numValueOf;
        List items = ((AbstractC1255880imo) this.LL).getItems();
        if (C086I.LIZIZ(items)) {
            items = new ArrayList();
        }
        if (i >= 0) {
            if (items != null) {
                numValueOf = Integer.valueOf(items.size());
            } else {
                numValueOf = null;
            }
            if (i <= numValueOf.intValue()) {
                ListProtector.add(items, i, obj);
                ((AbstractC1255880imo) this.LL).setItems(items);
                if (this.LLILLJJLI != 0) {
                    if (((AbstractC1255880imo) this.LL).isDataEmpty()) {
                        ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
                        return true;
                    }
                    w(i, ((C1587810rQB) this.LL).LJIIJJI());
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C1255920ims, X.InterfaceC1255940imu
    public final void w(int i, List list) {
        InterfaceC1255930imt<Aweme> interfaceC1255930imt = this.LLIZ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.w(i, C19719512Dh.LIZIZ(list));
        }
    }
}
