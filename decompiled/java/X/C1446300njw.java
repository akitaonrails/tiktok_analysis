package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0njw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1446300njw extends C2217421BqW implements Function0<Unit> {
    public final /* synthetic */ C259800zU<InterfaceC420801kM> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1446300njw(C259800zU<InterfaceC420801kM> c259800zU) {
        super(0, C1449605lu.class, "manualCancel", "tryInitData$manualCancel(Lkotlin/jvm/internal/Ref$ObjectRef;)V", 0);
        this.LL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C259800zU<InterfaceC420801kM> c259800zU = this.LL;
        C564000MAc.LIZJ("SWCompileProbe ; ManualCancel");
        InterfaceC420801kM interfaceC420801kM = c259800zU.element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        TEVideoUtils.nativeCancelCompileProbe();
        return Unit.LIZ;
    }
}
