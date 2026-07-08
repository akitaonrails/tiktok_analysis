package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS77S0500000_16;

/* JADX INFO: renamed from: X.0dUS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052300dUS extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ BAAnchorServiceImpl LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052300dUS(C118300cf c118300cf, C118300cf c118300cf2, C118300cf c118300cf3, BAAnchorServiceImpl bAAnchorServiceImpl, Context context, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.LL = c118300cf;
        this.LLILLJJLI = c118300cf2;
        this.LLILLL = c118300cf3;
        this.LLILZ = bAAnchorServiceImpl;
        this.LLILZIL = context;
        this.LLILZLL = function0;
        this.LLIZ = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1668330tW3.LJIIIIZZ(48, 0, interfaceC1680500tpg2, C0MBB.LIZIZ(this.LL.element, interfaceC1680500tpg2), new AwS77S0500000_16(this.LLILLL, (C118300cf) this.LLILZ, (BAAnchorServiceImpl) this.LLILZIL, (Context) this.LLILZLL, this.LLIZ, (Function0<Unit>) 2), true);
            C1668330tW3.LJIIIZ(48, 0, interfaceC1680500tpg2, C0MBB.LIZIZ(this.LLILLJJLI.element, interfaceC1680500tpg2), new AwS417S0200000_16(this.LLILLL, (C118300cf) this.LLIZ, (Function0<Unit>) 119), true);
        }
        return Unit.LIZ;
    }
}
