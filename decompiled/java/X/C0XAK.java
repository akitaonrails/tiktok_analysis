package X;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS129S1200000_13;

/* JADX INFO: renamed from: X.0XAK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XAK extends C09AY implements Function0<C0XAJ> {
    public C0XAK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0XAJ] */
    @Override // kotlin.jvm.functions.Function0
    public final C0XAJ invoke() {
        return new InterfaceC774480UZq() { // from class: X.0XAJ
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(395));
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(394));

            public final boolean LJ() {
                return ((Boolean) this.LIZIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC774480UZq
            public final void LIZIZ() {
                if (LJ()) {
                    C0XA7.LIZ.getClass();
                    C0XA7.LIZ("live_broadcast");
                }
            }

            @Override // X.InterfaceC774480UZq
            public final void LIZJ() {
                if (LJ()) {
                    C0VWW.LIZIZ("normal_live_room");
                }
            }

            @Override // X.InterfaceC774480UZq
            public final void LIZ(Context context) {
                if (!LJ()) {
                    return;
                }
                C0XA7 c0xa7 = C0XA7.LIZ;
                C0XAE c0xae = (C0XAE) this.LIZ.getValue();
                c0xa7.getClass();
                C0XA7.LIZIZ(context, "live_broadcast", c0xae);
            }

            @Override // X.InterfaceC774480UZq
            public final void LIZLLL(AFwS199S0000000_12 aFwS199S0000000_12, AFwS199S0000000_12 aFwS199S0000000_122) {
                if (!LJ()) {
                    return;
                }
                C0VWW.LJFF("normal_live_room", new AwS129S1200000_13("normal_live_room", (String) aFwS199S0000000_12, (Function0<? extends Map<String, ? extends Object>>) aFwS199S0000000_122, (Function0<? extends Map<String, ? extends Object>>) 4));
            }
        };
    }
}
