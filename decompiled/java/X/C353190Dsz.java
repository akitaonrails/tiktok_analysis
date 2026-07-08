package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dsz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateMattingTask$replaceNewModels$4", f = "TemplateMattingTask.kt", l = {}, m = "invokeSuspend")
public final class C353190Dsz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<Effect> LL;
    public final /* synthetic */ C259800zU<Effect> LLILLJJLI;
    public final /* synthetic */ C259800zU<Effect> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353190Dsz(C259800zU<Effect> c259800zU, C259800zU<Effect> c259800zU2, C259800zU<Effect> c259800zU3, String str, InterfaceC1364105Vn<? super C353190Dsz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c259800zU2;
        this.LLILLL = c259800zU3;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353190Dsz(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Unit unit;
        Effect effect;
        C1C7U.LIZ("TemplateMattingTask@e9a9.replaceNewModels$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Effect effect2 = this.LL.element;
        if (effect2 != null) {
            String str = this.LLILZ;
            String unzipPath = effect2.getUnzipPath();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(File.separator);
            C2286708xd.LJ(unzipPath, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (((Boolean) C0B7X.LIZ.getValue()).booleanValue() && (effect = this.LLILLJJLI.element) != null) {
            String str2 = this.LLILZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cutout_alg_model");
            String str3 = File.separator;
            sbLIZ2.append(str3);
            sbLIZ2.append("blend");
            sbLIZ2.append(str3);
            File[] fileArrListFiles = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.CUTOUT, C2188811AlT.LIZIZ(sbLIZ2), true).listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                String unzipPath2 = effect.getUnzipPath();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str2);
                sbLIZ3.append(str3);
                C2286708xd.LJ(unzipPath2, C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        Effect effect3 = this.LLILLL.element;
        if (effect3 != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("cutout_alg_model");
            String str4 = File.separator;
            sbLIZ4.append(str4);
            sbLIZ4.append("saliency_matting");
            sbLIZ4.append(str4);
            C0VSJ c0vsjLJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.CUTOUT, C2188811AlT.LIZIZ(sbLIZ4), true);
            File[] fileArrListFiles2 = c0vsjLJIIJ.listFiles();
            if (fileArrListFiles2 == null || fileArrListFiles2.length == 0) {
                String unzipPath3 = effect3.getUnzipPath();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(c0vsjLJIIJ.getPath());
                sbLIZ5.append(str4);
                C2286708xd.LJ(unzipPath3, C2188811AlT.LIZIZ(sbLIZ5));
            }
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("TemplateMattingTask@e9a9.replaceNewModels$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
