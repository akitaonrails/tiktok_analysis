package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.095H, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C095H {
    public static final C095I LIZ(InterfaceC346201Wa interfaceC346201Wa) {
        AbstractC23133094p abstractC23133094p;
        InterfaceC346201Wa interfaceC346201WaDropChannelOperators;
        C095E.LJLJI.getClass();
        int i = C095F.LIZIZ;
        if (1 >= i) {
            i = 1;
        }
        int i2 = i - 1;
        if ((interfaceC346201Wa instanceof AbstractC23133094p) && (interfaceC346201WaDropChannelOperators = (abstractC23133094p = (AbstractC23133094p) interfaceC346201Wa).dropChannelOperators()) != null) {
            int i3 = abstractC23133094p.capacity;
            if (i3 != -3 && i3 != -2 && i3 != 0) {
                i2 = i3;
            } else if (abstractC23133094p.onBufferOverflow != EnumC2252401DDy.SUSPEND || i3 == 0) {
                i2 = 0;
            }
            return new C095I(i2, abstractC23133094p.context, abstractC23133094p.onBufferOverflow, interfaceC346201WaDropChannelOperators);
        }
        return new C095I(i2, C23271099x.INSTANCE, EnumC2252401DDy.SUSPEND, interfaceC346201Wa);
    }

    public static final AnonymousClass0956 LIZIZ(InterfaceC497601wk interfaceC497601wk, CoroutineContext coroutineContext, InterfaceC346201Wa interfaceC346201Wa, C05YC c05yc, C05YW c05yw, Object obj) {
        C099V c099v;
        C05YW.LIZ.getClass();
        if (Intrinsics.LJFF(c05yw, C1370905Yd.LIZIZ)) {
            c099v = C099V.DEFAULT;
        } else {
            c099v = C099V.UNDISPATCHED;
        }
        return C23250099c.LIZJ(interfaceC497601wk, coroutineContext, c099v, new C05YV(c05yw, interfaceC346201Wa, c05yc, obj, null));
    }
}
