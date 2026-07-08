package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS122S1100000_8;
import kotlin.jvm.internal.AwS59S1000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Mna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.AsyncPhotoSaver$saveBitmap$1", f = "AsyncPhotoSaver.kt", l = {}, m = "invokeSuspend")
public final class C579160Mna extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ NowsShootModel LLILZLL;
    public final /* synthetic */ Function1<String, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C579160Mna(Bitmap bitmap, CreativeInfo creativeInfo, boolean z, boolean z2, NowsShootModel nowsShootModel, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C579160Mna> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
        this.LLILLL = creativeInfo;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = nowsShootModel;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C579160Mna c579160Mna = new C579160Mna(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c579160Mna.LL = obj;
        return c579160Mna;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("AsyncPhotoSaver@c9cc.saveBitmap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        Bitmap bitmap = this.LLILLJJLI;
        CreativeInfo creativeInfo = this.LLILLL;
        if (this.LLILZ) {
            str = "outer.jpg";
        } else {
            str = "inner.jpg";
        }
        String path = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILLIIL(creativeInfo, EnumC20228214Cy.NOWS, "", true).getPath(), str).getPath();
        C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C579150MnZ(bitmap, path, this.LLILZ, this.LLILZLL, this.LLILLL, null), 3);
        if (this.LLILZIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(path);
            sbLIZ.append("_calculate_bg");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C099G c099gLIZIZ2 = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C322530Ckd(bitmap, null), 3);
            c099gLIZIZ2.LJII(new AwS59S1000000_8(strLIZIZ, 18));
            C373801cm.LIZ(strLIZIZ, c099gLIZIZ2);
        }
        C373801cm.LIZ(path, c099gLIZIZ);
        c099gLIZIZ.LJII(new AwS122S1100000_8(path, (String) this.LLIZ, (Function1<? super CreativeModel, String>) 19));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AsyncPhotoSaver@c9cc.saveBitmap$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
