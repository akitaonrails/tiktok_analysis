package X;

import android.content.Context;
import android.os.Message;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.17qH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21153517qH {
    public static final ConcurrentHashMap<EnumC21153717qJ, InterfaceC21264518Jn> LIZ = new ConcurrentHashMap<>();

    static {
        for (EnumC21153717qJ enumC21153717qJ : EnumC21153717qJ.values()) {
            ConcurrentHashMap<EnumC21153717qJ, InterfaceC21264518Jn> concurrentHashMap = LIZ;
            int i = C21153617qI.LIZ[enumC21153717qJ.ordinal()];
            concurrentHashMap.put(enumC21153717qJ, i != 1 ? i != 2 ? new AbstractC1701460uNU() { // from class: X.17q0
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return true;
                }

                @Override // X.InterfaceC21264518Jn
                public final void LIZ(final int i2, final Context context, final InterfaceC21263418Jc interfaceC21263418Jc) {
                    C786410Ut5.LJLIIL(5L, C21172617tM.LJFF.LIZ(), new Runnable() { // from class: X.17pz
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AtOnceSchduler@44ee.commitInflate$1");
                            try {
                                C21151817q0 c21151817q0 = this.LL;
                                InterfaceC21263418Jc interfaceC21263418Jc2 = interfaceC21263418Jc;
                                int i3 = i2;
                                Context context2 = context;
                                c21151817q0.getClass();
                                new C21151617py(context2, interfaceC21263418Jc2, new C21263218Ja(i3, context2, interfaceC21263418Jc2)).invoke();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AtOnceSchduler@44ee.commitInflate$1");
                        }
                    });
                }
            } : new C21151917q1() : new AbstractC1701460uNU() { // from class: X.17q0
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return true;
                }

                @Override // X.InterfaceC21264518Jn
                public final void LIZ(final int i2, final Context context, final InterfaceC21263418Jc interfaceC21263418Jc) {
                    C786410Ut5.LJLIIL(5L, C21172617tM.LJFF.LIZ(), new Runnable() { // from class: X.17pz
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AtOnceSchduler@44ee.commitInflate$1");
                            try {
                                C21151817q0 c21151817q0 = this.LL;
                                InterfaceC21263418Jc interfaceC21263418Jc2 = interfaceC21263418Jc;
                                int i3 = i2;
                                Context context2 = context;
                                c21151817q0.getClass();
                                new C21151617py(context2, interfaceC21263418Jc2, new C21263218Ja(i3, context2, interfaceC21263418Jc2)).invoke();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AtOnceSchduler@44ee.commitInflate$1");
                        }
                    });
                }
            });
        }
    }
}
