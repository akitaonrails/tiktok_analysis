package X;

import com.bytedance.android.livesdk.sei.SeiAppData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966630bGH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC954180awC LL;
    public final /* synthetic */ C945320ahu LLILLJJLI;
    public final /* synthetic */ SeiAppData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966630bGH(InterfaceC954180awC interfaceC954180awC, C945320ahu c945320ahu, SeiAppData seiAppData) {
        super(0);
        this.LL = interfaceC954180awC;
        this.LLILLJJLI = c945320ahu;
        this.LLILLL = seiAppData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJLIIIJ(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
