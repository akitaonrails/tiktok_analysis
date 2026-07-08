package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS37S0310000_17;

/* JADX INFO: renamed from: X.0egO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098140egO extends C09AY implements Function0<InterfaceC1541990qEH> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ MiddleTouchWidget LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function1<InterfaceC1541990qEH, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1098140egO(Context context, String str, MiddleTouchWidget middleTouchWidget, boolean z, Function1<? super InterfaceC1541990qEH, Unit> function1, Function0<Unit> function0) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = middleTouchWidget;
        this.LLILZ = z;
        this.LLILZIL = function1;
        this.LLILZLL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1541990qEH invoke() {
        InterfaceC1541990qEH interfaceC1541990qEHNN = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).NN(this.LL, this.LLILLJJLI, null, true, new AwS37S0310000_17(this.LLILLL, (MiddleTouchWidget) this.LLILZ, (boolean) this.LLILZIL, (Function1<? super InterfaceC1541990qEH, Unit>) this.LLILZLL, (Function0<Unit>) 3));
        MiddleTouchWidget middleTouchWidget = this.LLILLL;
        C1098060egG c1098060egG = C1098060egG.LIZ;
        C1098060egG.LIZIZ().LJIIIIZZ = System.currentTimeMillis();
        c1098060egG.LJ();
        middleTouchWidget.LLILLL = interfaceC1541990qEHNN;
        return interfaceC1541990qEHNN;
    }
}
