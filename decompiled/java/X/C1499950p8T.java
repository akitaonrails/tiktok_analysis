package X;

import com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS137S1100000_23;
import njp.a;

/* JADX INFO: renamed from: X.0p8T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.music.ImageMediaBoxPlayer$1$onCompleteLoaded$1", f = "ImageMediaBoxPlayer.kt", l = {}, m = "invokeSuspend")
public final class C1499950p8T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1491180ouK LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1499950p8T(C1491180ouK c1491180ouK, String str, InterfaceC1364105Vn<? super C1499950p8T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1491180ouK;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1499950p8T(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageMediaBoxPlayer@a827.<init>$1$onCompleteLoaded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMediaPlayerManagerService iMediaPlayerManagerService = (IMediaPlayerManagerService) this.LL.LJII.getValue();
        if (iMediaPlayerManagerService != null) {
            String str = this.LLILLJJLI;
            iMediaPlayerManagerService.LIZLLL(str, new AwS137S1100000_23(this.LL, str, 5));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageMediaBoxPlayer@a827.<init>$1$onCompleteLoaded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
