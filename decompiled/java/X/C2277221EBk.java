package X;

import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1EBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277221EBk extends C09AY implements Function1<InterfaceC2277241EBm, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ SurfaceView LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277221EBk(int i, int i2, SurfaceView surfaceView, String str) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = surfaceView;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC2277241EBm interfaceC2277241EBm) {
        String str = this.LL;
        interfaceC2277241EBm.LJIL(this.LLILLL, this.LLILZ, this.LLILLJJLI, str);
        return Unit.LIZ;
    }
}
