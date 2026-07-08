package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx.MixSparkCard;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.util.Map;

/* JADX INFO: renamed from: X.0z4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881880z4U {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1881900z4W());

    public C1881880z4U() {
        LIZIZ("lynx_card", MixSparkCard.class, null);
    }

    public final InterfaceC1881300z3Y LIZ(String str) {
        return (InterfaceC1881300z3Y) ((Map) this.LIZ.getValue()).get(str);
    }

    public final void LIZIZ(String str, final Class<? extends InterfaceC1883030z6L> cls, InterfaceC1881300z3Y interfaceC1881300z3Y) {
        if (interfaceC1881300z3Y == null) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        Map map2 = (Map) this.LIZ.getValue();
        if (interfaceC1881300z3Y == null) {
            interfaceC1881300z3Y = new InterfaceC1881300z3Y(cls) { // from class: X.0z4V
                public final Class<? extends InterfaceC1883030z6L> LIZ;

                {
                    this.LIZ = cls;
                }

                @Override // X.InterfaceC1881300z3Y
                public final InterfaceC1883030z6L LIZ(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
                    InterfaceC1883030z6L c098200Yq;
                    Object obj = null;
                    try {
                        Constructor<? extends InterfaceC1883030z6L> constructor = this.LIZ.getConstructor(Context.class, C1155600gB4.class, InterfaceC1881340z3c.class);
                        if (constructor != null) {
                            c098200Yq = constructor.newInstance(context, c1155600gB4, interfaceC1881340z3c);
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl == null) {
                        obj = c098200Yq;
                    } else {
                        Map<String, Object> map3 = C1338270kvh.LIZ;
                        C20441214yg.LJFF("DefaultMixCardFactory", "buildCard error", thM5exceptionOrNullimpl);
                    }
                    return (InterfaceC1883030z6L) obj;
                }
            };
        }
        map2.put(str, interfaceC1881300z3Y);
    }
}
