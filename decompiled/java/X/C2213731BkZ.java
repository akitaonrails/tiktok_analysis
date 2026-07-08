package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerImpl;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213731BkZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC830880Wic LL;
    public final /* synthetic */ C830930Wih LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<InterfaceC830810WiV> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2213731BkZ(String str, List list, C830930Wih c830930Wih, AbstractC830880Wic abstractC830880Wic) {
        super(0);
        this.LL = abstractC830880Wic;
        this.LLILLJJLI = c830930Wih;
        this.LLILLL = str;
        this.LLILZ = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2213881Bko c2213881Bko = new C2213881Bko();
        C2213751Bkb c2213751BkbLIZ = C2213851Bkl.LIZ();
        if (c2213751BkbLIZ != null) {
            c2213751BkbLIZ.LIZ = this.LLILLL;
        } else {
            c2213751BkbLIZ = null;
        }
        try {
            TTMStrategyCenterManagerImpl tTMStrategyCenterManagerImpl = TTMStrategyCenterManagerImpl.LIZ;
            tTMStrategyCenterManagerImpl.LJ();
            if (TTMStrategyCenterManagerImpl.LIZLLL) {
                C830930Wih c830930Wih = this.LLILLJJLI;
                if (c830930Wih == null || !c830930Wih.LJ) {
                    String str = this.LLILLL;
                    List<InterfaceC830810WiV> list = this.LLILZ;
                    C830930Wih c830930Wih2 = this.LLILLJJLI;
                    AbstractC830880Wic abstractC830880Wic = this.LL;
                    tTMStrategyCenterManagerImpl.getClass();
                    TTMStrategyCenterManagerImpl.LJI(str, list, c830930Wih2, abstractC830880Wic, c2213881Bko, c2213751BkbLIZ);
                } else {
                    Object obj = new Object();
                    Object objPutIfAbsent = TTMStrategyCenterManagerImpl.LJIIIIZZ.putIfAbsent(this.LLILLL, obj);
                    if (objPutIfAbsent != null) {
                        obj = objPutIfAbsent;
                    }
                    String str2 = this.LLILLL;
                    List<InterfaceC830810WiV> list2 = this.LLILZ;
                    C830930Wih c830930Wih3 = this.LLILLJJLI;
                    AbstractC830880Wic abstractC830880Wic2 = this.LL;
                    synchronized (obj) {
                        try {
                            InterfaceC830890Wid interfaceC830890Wid = TTMStrategyCenterManagerImpl.LJII.get(str2);
                            if (interfaceC830890Wid != null) {
                                abstractC830880Wic2.LIZJ(interfaceC830890Wid, EnumC2213771Bkd.TTMStateCodeSuccess);
                            } else {
                                tTMStrategyCenterManagerImpl.getClass();
                                TTMStrategyCenterManagerImpl.LJI(str2, list2, c830930Wih3, abstractC830880Wic2, c2213881Bko, c2213751BkbLIZ);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            } else {
                AbstractC830880Wic abstractC830880Wic3 = this.LL;
                EnumC2213771Bkd enumC2213771Bkd = EnumC2213771Bkd.TTMStrategyCenterInitError;
                abstractC830880Wic3.LIZJ(null, enumC2213771Bkd);
                if (c2213751BkbLIZ != null) {
                    c2213751BkbLIZ.LIZJ = C204536151q.LIZ(enumC2213771Bkd);
                    c2213751BkbLIZ.LIZ();
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            ConcurrentHashMap<String, InterfaceC830890Wid> concurrentHashMap = C2213861Bkm.LIZ;
            String str3 = this.LLILLL;
            ConcurrentHashMap<String, InterfaceC830890Wid> concurrentHashMap2 = C2213861Bkm.LIZ;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.remove(str3);
            }
            AbstractC830880Wic abstractC830880Wic4 = this.LL;
            EnumC2213771Bkd enumC2213771Bkd2 = EnumC2213771Bkd.TTMSceneException;
            abstractC830880Wic4.LIZJ(null, enumC2213771Bkd2);
            if (c2213751BkbLIZ != null) {
                c2213751BkbLIZ.LIZ = this.LLILLL;
                c2213751BkbLIZ.LIZJ = C204536151q.LIZ(enumC2213771Bkd2);
                c2213751BkbLIZ.LIZLLL = th2.toString();
                c2213751BkbLIZ.LJIIIZ = c2213881Bko.LIZIZ;
                c2213751BkbLIZ.LIZ();
            }
        }
        return Unit.LIZ;
    }
}
