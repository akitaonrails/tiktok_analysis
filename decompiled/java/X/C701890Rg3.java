package X;

import com.ss.android.ugc.feed.platform.componentmanager.data.FCPConfigState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701890Rg3 extends C09AY implements InterfaceC1631620sYq<InterfaceC703670Riv<FCPConfigState>, Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, InterfaceC700750ReD, InterfaceC700750ReD> {
    public final /* synthetic */ Function2<String, Long, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C701890Rg3(Function2<? super String, ? super Long, Unit> function2) {
        super(3);
        this.LL = function2;
    }

    @Override // X.InterfaceC1631620sYq
    public final InterfaceC700750ReD invoke(InterfaceC703670Riv<FCPConfigState> interfaceC703670Riv, Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> function1, InterfaceC700750ReD interfaceC700750ReD) {
        InterfaceC700750ReD interfaceC700750ReD2 = interfaceC700750ReD;
        interfaceC700750ReD2.getType();
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC700750ReD interfaceC700750ReDInvoke = function1.invoke(interfaceC700750ReD2);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        Function2<String, Long, Unit> function2 = this.LL;
        if (function2 != null) {
            function2.invoke(interfaceC700750ReD2.getType(), Long.valueOf(jCurrentTimeMillis2));
        }
        return interfaceC700750ReDInvoke;
    }
}
