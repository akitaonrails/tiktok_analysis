package X;

import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1EBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277231EBl extends C09AY implements Function1<InterfaceC2277241EBm, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ SurfaceView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277231EBl(String str, SurfaceView surfaceView) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = surfaceView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC2277241EBm interfaceC2277241EBm) {
        interfaceC2277241EBm.LJIIJJI(this.LL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
