package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H4T, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem$loadTuxIcon$1", f = "LiveNotificationItem.kt", l = {234}, m = "invokeSuspend")
public final class C0H4T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ LiveNotificationItem LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H4T(String str, Context context, String str2, LiveNotificationItem liveNotificationItem, InterfaceC1364105Vn<? super C0H4T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = context;
        this.LLILZ = str2;
        this.LLILZIL = liveNotificationItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H4T(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("LiveNotificationItem@bfb8.loadTuxIcon$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C01GW c01gw = C2248361CzK.LIZ;
                Integer numLJ = C2248361CzK.LJ(this.LLILLL, this.LLILLJJLI);
                if (numLJ != null) {
                    iIntValue = numLJ.intValue();
                } else {
                    iIntValue = 0;
                }
                C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(this.LLILLL, this.LLILZ);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = C2286608xc.LIZLLL(Float.MAX_VALUE);
                c384050F3z.LIZ = C2286608xc.LJ(iIntValue);
                Drawable drawableLIZ = c384050F3z.LIZ(this.LLILLL);
                if (c698190Ra5LJFF == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveNotificationItem@bfb8.loadTuxIcon$1");
                    return unit;
                }
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = c698190Ra5LJFF.LIZ;
                c419910GdJ.LIZLLL = c698190Ra5LJFF.LIZIZ;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(28)));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(28)));
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C0H4S c0h4s = new C0H4S(this.LLILZIL, drawableLIZ, c419910GdJ, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c0h4s) == objLJFF) {
                    C1C7U.LIZIZ("LiveNotificationItem@bfb8.loadTuxIcon$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveNotificationItem@bfb8.loadTuxIcon$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
