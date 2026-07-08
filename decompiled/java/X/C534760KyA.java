package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0KyA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.util.ImageUtils$getMediaFrame$1", f = "ImageUtils.kt", l = {}, m = "invokeSuspend")
public final class C534760KyA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AutoCutMediaModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C534760KyA(AutoCutMediaModel autoCutMediaModel, String str, int i, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C534760KyA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = autoCutMediaModel;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534760KyA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageUtils@13b5.getMediaFrame$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.filePath;
        String str2 = this.LLILLJJLI;
        int i = this.LLILLL;
        AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(this.LLILZ, OppoPermissionPopupMaskDelayExp.DEFAULT);
        VEUtils.saveVideoFrames(str, new int[]{i}, 360, -1, false, str2, "", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("_0.jpeg");
        awS587S0100000_8.invoke(C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageUtils@13b5.getMediaFrame$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
