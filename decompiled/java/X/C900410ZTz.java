package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics;
import com.ss.android.ugc.aweme.im.service.refresh.IMessageRefreshManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0ZTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900410ZTz implements C1DW6 {
    public final String LL;
    public final int[] LLILLJJLI;
    public final List<C869590Y9l> LLILLL;
    public final EnumC904370Zdr LLILZ;
    public final C900390ZTx LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final AtomicBoolean LLIZLLLIL;
    public volatile boolean LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C2252331DDr LLJILJIL;
    public final AnonymousClass0950 LLJILJILJ;
    public boolean LLJILLL;

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    public final List<C869590Y9l> LIZ() {
        if (!this.LLILZLL) {
            if (!this.LLIZ) {
                this.LLIZ = true;
                IIMMediaGridPerformanceAnalytics iIMMediaGridPerformanceAnalytics = (IIMMediaGridPerformanceAnalytics) this.LLJIJIL.getValue();
                if (iIMMediaGridPerformanceAnalytics != null) {
                    iIMMediaGridPerformanceAnalytics.LIZIZ(this.LL, this.LLILZ);
                }
            }
            return this.LLILLL;
        }
        List<C869590Y9l> listLJIIIIZZ = this.LLILZIL.LIZ().LJIIIIZZ();
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : listLJIIIIZZ) {
            if (C13LQ.LJIILJJIL(c869590Y9l.getMsgType(), this.LLILLJJLI)) {
                arrayList.add(c869590Y9l);
            }
        }
        return arrayList;
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
        this.LLJILJIL.LIZJ(Unit.LIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
        this.LLJILJIL.LIZJ(Unit.LIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
        this.LLJILJIL.LIZJ(Unit.LIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void nc(List<? extends C869590Y9l> list) {
        this.LLJILJIL.LIZJ(Unit.LIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void ns(String str) {
        this.LLJILJIL.LIZJ(Unit.LIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
        this.LLJILJIL.LIZJ(Unit.LIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
        IMessageRefreshManager iMessageRefreshManager;
        boolean z;
        this.LLJ = false;
        this.LLIZLLLIL.set(true);
        if (enumC872590YKz == EnumC872590YKz.SUCCESS) {
            if (list != null && !list.isEmpty() && list.size() >= 15) {
                z = true;
            } else {
                z = false;
            }
            this.LLJILLL = z;
        }
        if (list != null && !list.isEmpty() && (iMessageRefreshManager = (IMessageRefreshManager) this.LLJI.getValue()) != null) {
            iMessageRefreshManager.LIZJ(((C869590Y9l) ListProtector.get(list, 0)).getConversationId(), list);
        }
        this.LLJILJIL.LIZJ(Unit.LIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
        IMessageRefreshManager iMessageRefreshManager;
        if ((!list2.isEmpty()) && (iMessageRefreshManager = (IMessageRefreshManager) this.LLJI.getValue()) != null) {
            iMessageRefreshManager.LIZJ(((C869590Y9l) ListProtector.get(list2, 0)).getConversationId(), list2);
        }
        this.LLJILJIL.LIZJ(Unit.LIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
        IMessageRefreshManager iMessageRefreshManager;
        if (list != null && !list.isEmpty() && (iMessageRefreshManager = (IMessageRefreshManager) this.LLJI.getValue()) != null) {
            iMessageRefreshManager.LIZJ(((C869590Y9l) ListProtector.get(list, 0)).getConversationId(), list);
        }
        this.LLJILJIL.LIZJ(Unit.LIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
        this.LLJILJIL.LIZJ(Unit.LIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        IMessageRefreshManager iMessageRefreshManager;
        if (list != null && !list.isEmpty()) {
            Iterator<C869590Y9l> it2 = list.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if (C13LQ.LJIILJJIL(it2.next().getMsgType(), this.LLILLJJLI) && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i2 != 0) {
                if (list != null && (!list.isEmpty()) && (iMessageRefreshManager = (IMessageRefreshManager) this.LLJI.getValue()) != null) {
                    iMessageRefreshManager.LIZJ(((C869590Y9l) ListProtector.get(list, 0)).getConversationId(), list);
                }
                this.LLJILJIL.LIZJ(Unit.LIZ);
            }
        }
    }

    public C900410ZTz(String str, int[] iArr, List list, EnumC904370Zdr enumC904370Zdr) {
        this.LL = str;
        this.LLILLJJLI = iArr;
        this.LLILLL = list;
        this.LLILZ = enumC904370Zdr;
        C900390ZTx c900390ZTxLIZ = C900380ZTw.LIZ(str, iArr, 15, C13BV.INSTANCE, true, 32);
        this.LLILZIL = c900390ZTxLIZ;
        this.LLIZLLLIL = new AtomicBoolean(false);
        this.LLJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(14));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(70));
        this.LLJIJIL = c01gwLIZIZ;
        c900390ZTxLIZ.LIZ().LJJJIL(this);
        IIMMediaGridPerformanceAnalytics iIMMediaGridPerformanceAnalytics = (IIMMediaGridPerformanceAnalytics) c01gwLIZIZ.getValue();
        if (iIMMediaGridPerformanceAnalytics != null) {
            iIMMediaGridPerformanceAnalytics.LJI(str, enumC904370Zdr);
        }
        c900390ZTxLIZ.LIZIZ();
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLJILJIL = c2252331DDrLIZIZ;
        this.LLJILJILJ = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLJILLL = true;
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
        IMessageRefreshManager iMessageRefreshManager;
        if (!this.LLIZ) {
            this.LLIZ = true;
            IIMMediaGridPerformanceAnalytics iIMMediaGridPerformanceAnalytics = (IIMMediaGridPerformanceAnalytics) this.LLJIJIL.getValue();
            if (iIMMediaGridPerformanceAnalytics != null) {
                iIMMediaGridPerformanceAnalytics.LIZIZ(this.LL, this.LLILZ);
            }
        }
        this.LLILZLL = true;
        if (list != null && !list.isEmpty() && (iMessageRefreshManager = (IMessageRefreshManager) this.LLJI.getValue()) != null) {
            iMessageRefreshManager.LIZJ(((C869590Y9l) ListProtector.get(list, 0)).getConversationId(), list);
        }
        this.LLJILJIL.LIZJ(Unit.LIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            Iterator<? extends C869590Y9l> it2 = list.iterator();
            while (it2.hasNext()) {
                if (C13LQ.LJIILJJIL(it2.next().getMsgType(), this.LLILLJJLI) && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i2 != 0) {
                this.LLJILJIL.LIZJ(Unit.LIZ);
            }
        }
    }
}
