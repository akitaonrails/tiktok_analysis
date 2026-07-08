package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667350tUT extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667350tUT(Bitmap bitmap, int i, float f, Function0<Unit> function0, Function0<Unit> function02, int i2) {
        super(2);
        this.LL = bitmap;
        this.LLILLJJLI = i;
        this.LLILLL = f;
        this.LLILZ = function0;
        this.LLILZIL = function02;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1667340tUS.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1));
        return Unit.LIZ;
    }
}
