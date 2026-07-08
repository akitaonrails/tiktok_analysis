package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.05ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1504005ug implements InterfaceC871940YIm, InterfaceC497601wk {
    public static final C1504005ug LL = new C1504005ug();
    public static final ConcurrentHashMap<String, InterfaceC1502705uT> LLILLJJLI = new ConcurrentHashMap<>();
    public static final C1DFH LLILLL = C0PEM.LIZ;

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return LLILLL;
    }

    public static InterfaceC1502705uT LIZIZ(String str, EnumC1504205ui enumC1504205ui) {
        InterfaceC1502705uT interfaceC1502705uTPutIfAbsent;
        Integer numLJIILIIL = C1336205Ku.LIZ(false).getImPrivacySettings().LJIILIIL("direct_message");
        if (numLJIILIIL != null && numLJIILIIL.intValue() == 3) {
            return new InterfaceC1502705uT() { // from class: X.05uc
                public static final C2252321DDq LLILLJJLI;
                public static final C2252321DDq LLILLL;

                @Override // X.InterfaceC1515605wY
                public final int LIZLLL() {
                    return 0;
                }

                static {
                    C13BV c13bv = C13BV.INSTANCE;
                    LLILLJJLI = C1BNE.LIZ(c13bv);
                    C1BNE.LIZ(c13bv);
                    LLILLL = C1BNE.LIZ(0);
                }

                @Override // X.InterfaceC1515605wY
                public final C05YD<List<C1808590xAH>> LIZIZ() {
                    return LLILLJJLI;
                }

                @Override // X.InterfaceC1515605wY
                public final C05YD<Integer> LIZJ() {
                    return LLILLL;
                }

                @Override // X.InterfaceC1503505ub
                public final Object LJ(C1504405uk c1504405uk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    return Unit.LIZ;
                }

                @Override // X.InterfaceC1503505ub
                public final Object LIZ(long j, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    return Unit.LIZ;
                }
            };
        }
        ConcurrentHashMap<String, InterfaceC1502705uT> concurrentHashMap = LLILLJJLI;
        InterfaceC1502705uT typingBuffer$im_common_core_release = concurrentHashMap.get(str);
        if (typingBuffer$im_common_core_release == null && (interfaceC1502705uTPutIfAbsent = concurrentHashMap.putIfAbsent(str, (typingBuffer$im_common_core_release = enumC1504205ui.getTypingBuffer$im_common_core_release()))) != null) {
            typingBuffer$im_common_core_release = interfaceC1502705uTPutIfAbsent;
        }
        return typingBuffer$im_common_core_release;
    }

    @Override // X.InterfaceC871940YIm
    public final void LIZ(String str, int i, Long l, Long l2, Long l3, C0YM0 c0ym0) {
        C23250099c.LIZLLL(this, null, null, new C1503905uf(str, l, l2, i, l3, c0ym0, null), 3);
    }
}
