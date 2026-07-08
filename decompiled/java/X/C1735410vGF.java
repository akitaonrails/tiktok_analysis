package X;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.relieveaweme.TiktokRelieveAweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0vGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735410vGF implements C1BNA, WeakHandler.IHandler {
    public static Integer LLILZ;
    public static Integer LLILZIL;
    public final C138P LL;
    public final WeakHandler LLILLJJLI;
    public final ArrayList<InterfaceC1726400v1i> LLILLL;

    public static int LIZJ() {
        if (LLILZIL == null) {
            LLILZIL = 5000;
        }
        return LLILZIL.intValue();
    }

    @Override // X.C1BNA
    public final void LIZ() {
        this.LLILLJJLI.removeMessages(100004);
        if (!this.LLILLJJLI.hasMessages(100003)) {
            this.LLILLJJLI.sendEmptyMessageDelayed(100003, LIZJ());
        }
        C138P c138p = this.LL;
        if (c138p.LIZIZ) {
            return;
        }
        c138p.LIZLLL();
    }

    public C1735410vGF() {
        ArrayList<InterfaceC1726400v1i> arrayList = new ArrayList<>();
        this.LLILLL = arrayList;
        this.LL = new C138P();
        this.LLILLJJLI = new WeakHandler(this);
        arrayList.clear();
        AbstractC1726380v1g abstractC1726380v1g = new AbstractC1726380v1g() { // from class: X.15Yl
            @Override // X.InterfaceC1726400v1i
            public final boolean LIZ(long j, long j2) {
                C15YW c15yw = C15YW.LIZ;
                long jLIZJ = C1735410vGF.LIZJ();
                c15yw.getClass();
                if (!C294510BgX.LIZ() && jLIZJ > 0) {
                    if (!C15YW.LIZJ()) {
                        C15YX.LIZ.getClass();
                        C15YX.LJFF(null);
                        C15YX.LJI(0L);
                    } else {
                        C15YX.LIZ.getClass();
                        C15YX.LJI(C15YX.LIZLLL() + (jLIZJ / 1000));
                    }
                }
                C15YW.LJI();
                return false;
            }
        };
        if (!arrayList.contains(abstractC1726380v1g)) {
            arrayList.add(abstractC1726380v1g);
        }
        AbstractC1726380v1g abstractC1726380v1g2 = new AbstractC1726380v1g() { // from class: X.0v1f
            public final C1699600uKU LIZ = new C1699600uKU();

            @Override // X.AbstractC1726380v1g, X.InterfaceC1726400v1i
            public final void onCleared() {
                this.LIZ.LIZJ = 0;
                C346050DhT.LIZJ().LLILZLL = "";
            }

            @Override // X.InterfaceC1726400v1i
            public final boolean LIZ(long j, long j2) {
                C1699600uKU c1699600uKU = this.LIZ;
                c1699600uKU.getClass();
                long j3 = ((long) C346050DhT.LIZJ().LLILZ) * 1000;
                if (j3 >= 0) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j);
                    calendar.set(11, c1699600uKU.LIZ);
                    calendar.set(12, c1699600uKU.LIZIZ);
                    calendar.set(13, 0);
                    long timeInMillis = calendar.getTimeInMillis();
                    long jLongValue = SharePrefCache.inst().getLastHintToastTime().LIZ().longValue();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(jLongValue);
                    new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(calendar2.getTime());
                    if (jLongValue < timeInMillis && j >= timeInMillis) {
                        SharePrefCache.inst().getLastHintToastTime().LJ(Long.valueOf(timeInMillis));
                        c1699600uKU.LIZJ = 0;
                    } else {
                        timeInMillis = jLongValue;
                    }
                    if (j - timeInMillis > j3) {
                        this.LIZ.getClass();
                        if (j2 > ((long) C346050DhT.LIZJ().LLILZ) * 1000) {
                            this.LIZ.getClass();
                            if (((long) C346050DhT.LIZJ().LLILZ) * 1000 > 0) {
                                C1699600uKU c1699600uKU2 = this.LIZ;
                                c1699600uKU2.getClass();
                                SharePrefCache.inst().getLastHintToastTime().LJ(Long.valueOf(System.currentTimeMillis()));
                                c1699600uKU2.LIZJ++;
                                this.LIZ.getClass();
                                C346050DhT.LIZJ().LLILZLL = String.valueOf(((((long) C346050DhT.LIZJ().LLILZ) * 1000) * ((long) this.LIZ.LIZJ)) / 60000);
                            }
                        }
                    }
                }
                return false;
            }
        };
        if (!arrayList.contains(abstractC1726380v1g2)) {
            arrayList.add(abstractC1726380v1g2);
        }
        AbstractC1726380v1g abstractC1726380v1g3 = new AbstractC1726380v1g() { // from class: X.0v1b
            public final C01GW LIZ = C452501pT.LIZIZ(new C1726360v1e());

            @Override // X.AbstractC1726380v1g, X.InterfaceC1726400v1i
            public final void onCleared() {
                C1701670uNp.LIZIZ = false;
            }

            @Override // X.InterfaceC1726400v1i
            public final boolean LIZ(long j, long j2) {
                int i;
                int i2 = C346050DhT.LIZJ().LLILLJJLI;
                int i3 = C346050DhT.LIZJ().LLILLL;
                int i4 = 0;
                if (i2 <= 0 || i3 <= 0) {
                    return false;
                }
                C346050DhT c346050DhTLIZJ = C346050DhT.LIZJ();
                c346050DhTLIZJ.LLILZIL.setTimeInMillis(j);
                int i5 = c346050DhTLIZJ.LLILZIL.get(11);
                if (i5 < c346050DhTLIZJ.LL && i5 >= 5) {
                    i = c346050DhTLIZJ.LLILLJJLI;
                } else {
                    i = c346050DhTLIZJ.LLILLL;
                }
                long j3 = ((long) i) * 1000;
                if (j3 <= 0 || j2 <= j3 || !((AbstractC1610280s0Q) this.LIZ.getValue()).LIZ(j)) {
                    return false;
                }
                ((AbstractC1610280s0Q) this.LIZ.getValue()).LIZIZ().LJ(Long.valueOf(j));
                C346050DhT c346050DhTLIZJ2 = C346050DhT.LIZJ();
                c346050DhTLIZJ2.LLILZIL.setTimeInMillis(System.currentTimeMillis());
                int i6 = c346050DhTLIZJ2.LLILZIL.get(11);
                if (i6 >= c346050DhTLIZJ2.LL || i6 < 5) {
                    i4 = 1;
                }
                ((InterfaceC1726340v1c) C1726350v1d.LIZ.getValue()).LIZ(i4 ^ 1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0uNo
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("RelieveAwemeTimeTicker@a6c6.tryToPerform$1");
                        TiktokRelieveAweme tiktokRelieveAweme = (TiktokRelieveAweme) obj;
                        if (!TextUtils.isEmpty(tiktokRelieveAweme.getAwemeId())) {
                            C1701670uNp.LIZIZ = true;
                            C1701670uNp.LIZ = tiktokRelieveAweme.getAwemeId();
                        }
                        C1C7U.LIZIZ("RelieveAwemeTimeTicker@a6c6.tryToPerform$1");
                    }
                }, new C09JN() { // from class: X.0uNn
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("RelieveAwemeTimeTicker@a6c6.tryToPerform$2");
                        C1C7U.LIZIZ("RelieveAwemeTimeTicker@a6c6.tryToPerform$2");
                    }
                });
                return true;
            }
        };
        if (!arrayList.contains(abstractC1726380v1g3)) {
            arrayList.add(abstractC1726380v1g3);
        }
        ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIILIIL(new InterfaceC19392410tu() { // from class: X.0vGG
            @Override // X.InterfaceC19392410tu
            public final void LIZ() {
            }

            @Override // X.InterfaceC19392410tu
            public final void LIZIZ() {
                WeakHandler weakHandler = this.LIZ.LLILLJJLI;
                if (C1735410vGF.LLILZ == null) {
                    C1735410vGF.LLILZ = 30000;
                }
                weakHandler.sendEmptyMessageDelayed(100004, C1735410vGF.LLILZ.intValue());
            }
        });
    }

    @Override // X.C1BNA
    public final void LIZIZ() {
        if (((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).md()) {
            return;
        }
        WeakHandler weakHandler = this.LLILLJJLI;
        if (LLILZ == null) {
            LLILZ = 30000;
        }
        weakHandler.sendEmptyMessageDelayed(100004, LLILZ.intValue());
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        switch (message.what) {
            case 100003:
                this.LLILLJJLI.sendEmptyMessageDelayed(100003, LIZJ());
                final long jLIZIZ = this.LL.LIZIZ(TimeUnit.MILLISECONDS);
                boolean zLJI = MethodIDManager.LJI(71874);
                C15O7.LIZJ(new Callable() { // from class: X.0v1h
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1735410vGF c1735410vGF = this.LL;
                        long j = jLIZIZ;
                        c1735410vGF.getClass();
                        C1C7U.LIZ("ContinuousTimeCalculator@da73.notifyTime$1L");
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Iterator<InterfaceC1726400v1i> it2 = c1735410vGF.LLILLL.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZ(jCurrentTimeMillis, j);
                        }
                        C1C7U.LIZIZ("ContinuousTimeCalculator@da73.notifyTime$1L");
                        return null;
                    }
                });
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                break;
            case 100004:
                this.LLILLJJLI.removeMessages(100003);
                this.LL.LIZJ();
                Iterator<InterfaceC1726400v1i> it2 = this.LLILLL.iterator();
                while (it2.hasNext()) {
                    it2.next().onCleared();
                }
                break;
        }
    }
}
