package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dt1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.brush.CutoutBrushComponent$copyAndModifyAlgoModelPath$2", f = "CutoutBrushComponent.kt", l = {}, m = "invokeSuspend")
public final class C353210Dt1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ResourceItem LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353210Dt1(ResourceItem resourceItem, String str, InterfaceC1364105Vn<? super C353210Dt1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = resourceItem;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353210Dt1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CutoutBrushComponent@5ab9.copyAndModifyAlgoModelPath$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String path = this.LL.getPath();
        if (path == null) {
            path = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cutout_alg_model");
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(str);
        C0VSJ c0vsjLJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.CUTOUT, C2188811AlT.LIZIZ(sbLIZ), true);
        File[] fileArrListFiles = c0vsjLJIIJ.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0vsjLJIIJ.getPath());
            sbLIZ2.append(str);
            C2286708xd.LJ(path, C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LL.setPath(c0vsjLJIIJ.getPath());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutoutBrushComponent@5ab9.copyAndModifyAlgoModelPath$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
