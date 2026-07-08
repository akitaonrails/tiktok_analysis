package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0m3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1381820m3w implements InterfaceC328360Cu2<IMContact>, InterfaceC1369300ljk {
    public final C1368260li4 LL;
    public InterfaceC328360Cu2<IMContact> LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(685));
    public final C01GW LLILZ;
    public final AbstractC2250601D7a<? extends Object, IMContact> LLILZIL;
    public final C1382380m4q LLILZLL;
    public final C1382380m4q LLIZ;
    public volatile List<String> LLIZLLLIL;

    public void LIZIZ(String str, String str2) {
    }

    public void LIZJ() {
    }

    @Override // X.InterfaceC1369300ljk
    public final void LJ() {
        this.LLILLJJLI = null;
    }

    public boolean LJFF() {
        return this instanceof C1381860m40;
    }

    public abstract C1382250m4d LJI();

    public void LJJZZIII(String str) {
    }

    public C1381890m43 LIZ() {
        return new C1381890m43(this.LL);
    }

    @Override // X.InterfaceC1369300ljk
    public final List<IMContact> data() {
        return new ArrayList((Collection) this.LLILLL.getValue());
    }

    public void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh start, ts: ");
        sbLIZ.append(SystemClock.elapsedRealtime());
        C2188811AlT.LIZIZ(sbLIZ);
        if (LJI().LJI) {
            return;
        }
        LJI().LJFF();
    }

    @Override // X.InterfaceC1369300ljk
    public final boolean LJIIJJI() {
        return LJI().LJ();
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [X.0m4N] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0O2F] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0O2E] */
    public AbstractC1381820m3w(final C1368260li4 c1368260li4) {
        AbstractC1382080m4M abstractC1382080m4M;
        this.LL = c1368260li4;
        String str = C1382030m4H.LIZIZ;
        String str2 = C1382030m4H.LIZJ;
        this.LLILZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(624));
        C891600YyM.LIZ.getClass();
        C890330YwJ c890330YwJ = IMChatListApi.LJJIII;
        c890330YwJ.getClass();
        if (C890330YwJ.LIZ().LJJJ().LIZIZ() && !LJFF()) {
            abstractC1382080m4M = new AbstractC1382080m4M<C891570YyJ, Object, IMContact>() { // from class: X.0YyP
                public final C891570YyJ LIZ = new AbstractC2250601D7a<Object, IMContact>() { // from class: X.0YyJ
                    public static final /* synthetic */ int LJI = 0;

                    @Override // X.AbstractC2250601D7a
                    public final Function1<Object, IMContact> LIZJ() {
                        return new C891590YyL(this);
                    }

                    @Override // X.AbstractC2250601D7a
                    public final Object LJ(InterfaceC1364105Vn<? super List<Object>> interfaceC1364105Vn) {
                        List<InterfaceC884440Ymo> listLJIIJ;
                        ArrayList arrayList;
                        IMChatListApi.LJJIII.getClass();
                        InterfaceC882680Yjy interfaceC882680YjyLJJIL = C890330YwJ.LIZ().LJJIL();
                        if (interfaceC882680YjyLJJIL != null && (listLJIIJ = interfaceC882680YjyLJJIL.LJIIJ(true)) != null) {
                            if (listLJIIJ.size() > 90) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("loadInternal: ");
                                sbLIZ.append(listLJIIJ.size());
                                sbLIZ.append(", limit: ");
                                sbLIZ.append(90);
                                C2188811AlT.LIZIZ(sbLIZ);
                                arrayList = new ArrayList(listLJIIJ.subList(0, 90));
                            } else {
                                arrayList = new ArrayList(listLJIIJ);
                            }
                            return new ArrayList(arrayList);
                        }
                        return new ArrayList();
                    }

                    @Override // X.AbstractC2250601D7a
                    public final Object LJI(InterfaceC1364105Vn<? super List<Object>> interfaceC1364105Vn) {
                        throw new UnsupportedOperationException("Recent not support load more");
                    }
                };

                @Override // X.AbstractC1382080m4M
                public final AbstractC2250601D7a LIZ() {
                    return this.LIZ;
                }

                @Override // X.AbstractC1382080m4M
                public final /* bridge */ /* synthetic */ AbstractC2250601D7a LIZIZ() {
                    return this.LIZ;
                }
            };
            ?? r0 = new AbstractC1382150m4T<Object>(c1368260li4) { // from class: X.0m4N
            };
            C1381890m43 c1381890m43LIZ = LIZ();
            abstractC1382080m4M.LIZIZ().LIZIZ = new C0Z8X(r0, null);
            if (!c1368260li4.LJIJI) {
                abstractC1382080m4M.LIZIZ().LIZJ = new C0O29(new C0O2D<Object>(c1368260li4) { // from class: X.0O2F
                }, null);
            }
            abstractC1382080m4M.LIZIZ().LIZLLL = new C0O2A(c1381890m43LIZ, null);
        } else {
            c890330YwJ.getClass();
            boolean zLIZIZ = C890330YwJ.LIZ().LJJJ().LIZIZ();
            boolean zLJFF = LJFF();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("use RecentLoader, cacheReady: ");
            sbLIZ.append(zLIZIZ);
            sbLIZ.append(", forceLoadFromDatabase: ");
            sbLIZ.append(zLJFF);
            C2188811AlT.LIZIZ(sbLIZ);
            abstractC1382080m4M = new AbstractC1382080m4M<C891550YyH, C0Y8T, IMContact>() { // from class: X.0YyO
                public final C891550YyH LIZ = new C891550YyH();

                @Override // X.AbstractC1382080m4M
                public final AbstractC2250601D7a LIZ() {
                    return this.LIZ;
                }

                @Override // X.AbstractC1382080m4M
                public final /* bridge */ /* synthetic */ AbstractC2250601D7a LIZIZ() {
                    return this.LIZ;
                }
            };
            C1382100m4O c1382100m4O = new C1382100m4O(c1368260li4);
            ?? r3 = new C0O2D<C0Y8T>(c1368260li4) { // from class: X.0O2E
            };
            C1381890m43 c1381890m43LIZ2 = LIZ();
            abstractC1382080m4M.LIZIZ().LIZIZ = new C894900Z8u(c1382100m4O, null);
            abstractC1382080m4M.LIZIZ().LIZJ = new C0O2C(r3, null);
            abstractC1382080m4M.LIZIZ().LIZLLL = new C0O2B(c1381890m43LIZ2, null);
        }
        this.LLILZIL = abstractC1382080m4M.LIZ();
        C1382050m4J c1382050m4J = new C1382050m4J();
        C1382380m4q c1382380m4q = c1382050m4J.LIZ;
        c1382380m4q.LJII = str;
        c1382380m4q.LJIIIIZZ = false;
        c1382050m4J.LIZ.LJI = new AwS565S0100000_21(this, 1700);
        c1382050m4J.LIZJ(100);
        this.LLILZLL = c1382050m4J.LIZ;
        C1382050m4J c1382050m4J2 = new C1382050m4J();
        C1382380m4q c1382380m4q2 = c1382050m4J2.LIZ;
        c1382380m4q2.LJII = str2;
        c1382380m4q2.LJIIIIZZ = false;
        c1382050m4J2.LIZ.LJI = new AwS565S0100000_21(this, 1701);
        c1382050m4J2.LIZJ(100);
        this.LLIZ = c1382050m4J2.LIZ;
    }

    public static List LJIIIIZZ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            IMUser iMUserLIZ = C903150Zbt.LIZ((IMContact) it2.next());
            if (iMUserLIZ != null) {
                String uid = iMUserLIZ.getUid();
                if (uid == null) {
                    uid = "";
                }
                arrayList.add(uid);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC328360Cu2
    public void WD2(Throwable th) {
        InterfaceC328360Cu2<IMContact> interfaceC328360Cu2 = this.LLILLJJLI;
        if (interfaceC328360Cu2 != null) {
            interfaceC328360Cu2.WD2(th);
        }
    }

    @Override // X.InterfaceC328360Cu2
    public final void ug(Throwable th) {
        InterfaceC328360Cu2<IMContact> interfaceC328360Cu2 = this.LLILLJJLI;
        if (interfaceC328360Cu2 != null) {
            interfaceC328360Cu2.ug(th);
        }
    }

    @Override // X.InterfaceC328360Cu2
    public void r61(List<IMContact> list, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccess start: ");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            ((List) this.LLILLL.getValue()).clear();
            ((List) this.LLILLL.getValue()).addAll(list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((List) this.LLILLL.getValue()).size();
        InterfaceC328360Cu2<IMContact> interfaceC328360Cu2 = this.LLILLJJLI;
        if (interfaceC328360Cu2 != null) {
            interfaceC328360Cu2.r61(list, z);
        }
    }

    @Override // X.InterfaceC328360Cu2
    public final void tg2(List<IMContact> list, boolean z) {
        ((List) this.LLILLL.getValue()).addAll(list);
        InterfaceC328360Cu2<IMContact> interfaceC328360Cu2 = this.LLILLJJLI;
        if (interfaceC328360Cu2 != null) {
            interfaceC328360Cu2.tg2(list, z);
        }
    }

    public static void LJII(AbstractC1381820m3w abstractC1381820m3w, final Function2 function2, final Function1 function1) {
        final AFwS289S0000000_6 aFwS289S0000000_6 = AFwS289S0000000_6.get$arr$(61);
        final AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(473);
        abstractC1381820m3w.LLILLJJLI = new InterfaceC328360Cu2<IMContact>() { // from class: X.0Cu3
            @Override // X.InterfaceC328360Cu2
            public final void WD2(Throwable th) {
                function1.invoke(th);
            }

            @Override // X.InterfaceC328360Cu2
            public final void ug(Throwable th) {
                aFwS259S0000000_21.invoke(th);
            }

            @Override // X.InterfaceC328360Cu2
            public final void r61(List<IMContact> list, boolean z) {
                function2.invoke(list, Boolean.valueOf(z));
            }

            @Override // X.InterfaceC328360Cu2
            public final void tg2(List<IMContact> list, boolean z) {
                aFwS289S0000000_6.invoke(list, Boolean.valueOf(z));
            }
        };
    }
}
