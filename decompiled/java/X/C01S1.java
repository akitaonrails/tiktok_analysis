package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01S1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.StickerSchemaManager$applySticker$1", f = "StickerSchemaManager.kt", l = {61, 74, 79}, m = "invokeSuspend")
public final class C01S1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01S1(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01S1(this.LLILLL, this.LLILZ, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StickerSchemaManager@2284.applySticker$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StickerSchemaManager@2284.applySticker$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDr = C01S3.LIZIZ;
            this.LL = 1;
            obj = C09IC.LJIIZILJ(c2252331DDr, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerSchemaManager@2284.applySticker$1");
                return objLJFF;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    if (iIntValue == 4) {
                        C20441214yg.LJ("StickerSchemaManager", "fetch sticker check fail");
                        DataChannel dataChannel = C01S3.LIZ;
                        String str = this.LLILLL;
                        String str2 = this.LLILZ;
                        Function2<Boolean, String, Unit> function2 = this.LLILLJJLI;
                        this.LL = 3;
                        C1DFH c1dfh = C0PEM.LIZ;
                        Object objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C01S2(str, str2, null, function2));
                        if (objLJI != C099R.LJFF()) {
                            objLJI = Unit.LIZ;
                        }
                        if (objLJI == objLJFF) {
                            C1C7U.LIZIZ("StickerSchemaManager@2284.applySticker$1");
                            return objLJFF;
                        }
                    }
                } else {
                    C20441214yg.LJ("StickerSchemaManager", "fetch sticker check success");
                    DataChannel dataChannel2 = C01S3.LIZ;
                    String str3 = this.LLILLL;
                    String str4 = this.LLILZ;
                    Function2<Boolean, String, Unit> function22 = this.LLILLJJLI;
                    this.LL = 2;
                    C1DFH c1dfh2 = C0PEM.LIZ;
                    Object objLJI2 = C23250099c.LJI(this, C2107308Nj.LIZ, new C01S2(str3, str4, null, function22));
                    if (objLJI2 != C099R.LJFF()) {
                        objLJI2 = Unit.LIZ;
                    }
                    if (objLJI2 == objLJFF) {
                        C1C7U.LIZIZ("StickerSchemaManager@2284.applySticker$1");
                        return objLJFF;
                    }
                }
            } else {
                C20441214yg.LJ("StickerSchemaManager", "fetch sticker list fail");
                Function2<Boolean, String, Unit> function23 = this.LLILLJJLI;
                if (function23 != null) {
                    function23.invoke(false, "fetch sticker list fail");
                }
            }
        } else {
            C20441214yg.LJ("StickerSchemaManager", "fetch sticker list success");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerSchemaManager@2284.applySticker$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
