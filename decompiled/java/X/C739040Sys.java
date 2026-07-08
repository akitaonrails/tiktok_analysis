package X;

import kotlin.Unit;
import kotlin.jvm.internal.AwS5S0700000_11;

/* JADX INFO: renamed from: X.0Sys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C739040Sys extends C09AY implements InterfaceC1685420txc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1685420txc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C739040Sys(InterfaceC725030ScH interfaceC725030ScH, InterfaceC725030ScH<RECEIVER> interfaceC725030ScH2, InterfaceC1685430txd<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        super(5);
        this.$t = interfaceC1685430txd;
        this.l0 = interfaceC725030ScH;
        this.l1 = interfaceC725030ScH2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C739040Sys(InterfaceC725050ScJ interfaceC725050ScJ, InterfaceC725050ScJ<? extends RECEIVER> interfaceC725050ScJ2, InterfaceC1685430txd<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        super(5);
        this.$t = interfaceC1685430txd;
        this.l0 = interfaceC725050ScJ;
        this.l1 = interfaceC725050ScJ2;
    }

    public static final Object invoke$0(C739040Sys c739040Sys, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C03H5 actualReceiver = ((InterfaceC725050ScJ) c739040Sys.l0).getActualReceiver();
        if (actualReceiver != null) {
            C723830SaL.LIZIZ(actualReceiver, new AwS5S0700000_11((InterfaceC1685430txd) c739040Sys.l1, (InterfaceC1685430txd<C03H5, Object, Object, Object, Object, Object, Unit>) actualReceiver, (C03H5) obj, obj2, obj3, obj4, obj5, (Object) 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C739040Sys c739040Sys, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C03H5 receiverForHostVM = ((InterfaceC725030ScH) c739040Sys.l0).getReceiverForHostVM();
        if (receiverForHostVM == null) {
            receiverForHostVM = ((InterfaceC725030ScH) c739040Sys.l0).getActualReceiverHolder().getActualReceiver();
        }
        if (receiverForHostVM != null) {
            ((InterfaceC1685430txd) c739040Sys.l1).invoke(receiverForHostVM, obj, obj2, obj3, obj4, obj5);
        }
        return Unit.LIZ;
    }
}
