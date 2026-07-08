package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532670Kun extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Function2<String, Long, Unit> LLILZLL;
    public final /* synthetic */ InterfaceC1631630sYr<String, Long, Integer, String, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C532670Kun(Context context, String str, boolean z, int i, int i2, Function2<? super String, ? super Long, Unit> function2, InterfaceC1631630sYr<? super String, ? super Long, ? super Integer, ? super String, Unit> interfaceC1631630sYr) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = function2;
        this.LLIZ = interfaceC1631630sYr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        new C532650Kul(this.LL).isVideoLengthOrTypeSupportedAndShowErrToast(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
        return Unit.LIZ;
    }
}
