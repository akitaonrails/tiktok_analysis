package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.AwS2S0700000_9;
import njp.a;

/* JADX INFO: renamed from: X.0ORl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$preloadVideoWithDiff$2", f = "ShopMallRepository.kt", l = {}, m = "invokeSuspend")
public final class C619470ORl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1771500wCS LLILLJJLI;
    public final /* synthetic */ C1772630wEH LLILLL;
    public final /* synthetic */ C1772630wEH LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C619470ORl(C1771500wCS c1771500wCS, C1772630wEH c1772630wEH, C1772630wEH c1772630wEH2, String str, InterfaceC1364105Vn<? super C619470ORl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1771500wCS;
        this.LLILLL = c1772630wEH;
        this.LLILZ = c1772630wEH2;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C619470ORl c619470ORl = new C619470ORl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c619470ORl.LL = obj;
        return c619470ORl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        List listLJII;
        HashSet hashSet;
        HashSet hashSet2;
        C118300cf c118300cf;
        C118300cf c118300cf2;
        C118300cf c118300cf3;
        C118300cf c118300cf4;
        C1C7U.LIZ("ShopMallRepository@92e8.preloadVideoWithDiff$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1771500wCS c1771500wCS = this.LLILLJJLI;
        C1772630wEH c1772630wEH = this.LLILLL;
        C1772630wEH c1772630wEH2 = this.LLILZ;
        String str = this.LLILZIL;
        try {
            c1771500wCS.getClass();
            List listLJII2 = C1771500wCS.LJII(c1772630wEH);
            listLJII = C1771500wCS.LJII(c1772630wEH2);
            ArrayList arrayList = (ArrayList) listLJII2;
            hashSet = new HashSet(arrayList.size());
            hashSet2 = new HashSet(arrayList.size());
            C08QT c08qt = new C08QT(C09RB.LJIIIZ(C09RB.LJIIJJI(new C1939607ik(listLJII2)), AFwS240S0000000_9.get$arr$(708)));
            while (c08qt.hasNext()) {
                String str2 = (String) c08qt.next();
                String strLJFF = C1771500wCS.LJFF(str2);
                if (strLJFF != null && strLJFF.length() != 0) {
                    hashSet.add(strLJFF);
                } else {
                    hashSet2.add(C2286608xc.LJFF((((long) str2.hashCode()) << 32) ^ ((long) str2.length())));
                }
            }
            c118300cf = new C118300cf();
            c118300cf2 = new C118300cf();
            c118300cf3 = new C118300cf();
            c118300cf4 = new C118300cf();
        } catch (Throwable th) {
            th = th;
        }
        try {
            List listLJJII = C09RB.LJJII(C09RB.LJIIIZ(C09RB.LJIIIZ(C09RB.LJIIJJI(new C1939607ik(listLJII)), AFwS240S0000000_9.get$arr$(709)), new AwS2S0700000_9(c1771500wCS, (C1771500wCS) c118300cf, (C118300cf) hashSet, (HashSet<String>) c118300cf3, c118300cf2, (C118300cf) hashSet2, (HashSet<Long>) c118300cf4, (C118300cf) 0)));
            new C607470Ns9(str, hashSet, hashSet2, c118300cf, c118300cf2, listLJJII, c118300cf3, c118300cf4);
            C034X.LIZIZ();
            if (!listLJJII.isEmpty()) {
                if (!(!hashSet.isEmpty()) && !(!hashSet2.isEmpty())) {
                    C677160QhG.LIZ.getClass();
                    C677160QhG.LIZIZ(listLJJII);
                } else {
                    C677160QhG.LIZ.getClass();
                    C677160QhG.LIZ(listLJJII);
                }
                C677160QhG.LIZ.getClass();
                C1478160oZK.LIZ().LJJJJIZL(1009, "mall_home_scene");
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str3 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            new AwS158S1100000_9(str3, thM5exceptionOrNullimpl, 21);
            C034X.LIZIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallRepository@92e8.preloadVideoWithDiff$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
