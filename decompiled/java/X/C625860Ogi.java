package X;

import Y.AfS178S0100000_9;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Ogi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625860Ogi {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(410));

    public final void LIZ(final Function1<? super Integer, Unit> function1) {
        boolean zLJI = MethodIDManager.LJI(202392);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - C625420Og0.LJIIIIZZ().getLong("key_last_verify_timestamp", 0L)) < 86400000) {
            ((AbstractC1604130rqV) this.LIZ.getValue()).LJIIIZ("skip verify");
            function1.invoke(0);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C625420Og0.LJIIIIZZ().LJIIIIZZ("key_last_verify_timestamp", jCurrentTimeMillis);
        final C625550OgD c625550OgD = new C625550OgD();
        c625550OgD.LJL(C11S5.LIZ()).LJJIIJ(new InterfaceC781210Ukh() { // from class: X.0OgW
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                function1.invoke(Integer.valueOf(c625550OgD.LLILLJJLI));
            }
        }).LJJLL(new AfS178S0100000_9(this, 43), new AfS178S0100000_9(this, 44));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
