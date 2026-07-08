package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dt3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.portrait.matting.MattingUtils$startFetchAiMattingResOpt$2$6", f = "MattingUtils.kt", l = {}, m = "invokeSuspend")
public final class C353230Dt3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<Effect> LL;
    public final /* synthetic */ C259800zU<Effect> LLILLJJLI;
    public final /* synthetic */ C0E48 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353230Dt3(C259800zU<Effect> c259800zU, C259800zU<Effect> c259800zU2, C0E48 c0e48, InterfaceC1364105Vn<? super C353230Dt3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c259800zU2;
        this.LLILLL = c0e48;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353230Dt3(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String path;
        File fileLJFF;
        File[] fileArrListFiles;
        File fileLJFF2;
        C1C7U.LIZ("MattingUtils@777b.startFetchAiMattingResOpt$2$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Effect effect = this.LL.element;
        Unit unit = null;
        if (effect != null) {
            C0E48 c0e48 = this.LLILLL;
            InterfaceC353240Dt4 interfaceC353240Dt4Ie = c0e48.Ie();
            if (interfaceC353240Dt4Ie == null || (fileLJFF2 = interfaceC353240Dt4Ie.LJFF()) == null || (path = fileLJFF2.getPath()) == null) {
                path = "";
            }
            InterfaceC353240Dt4 interfaceC353240Dt4Ie2 = c0e48.Ie();
            if (interfaceC353240Dt4Ie2 == null || (fileLJFF = interfaceC353240Dt4Ie2.LJFF()) == null || (fileArrListFiles = fileLJFF.listFiles()) == null || fileArrListFiles.length == 0) {
                String unzipPath = effect.getUnzipPath();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(path);
                sbLIZ.append(File.separator);
                C2286708xd.LJ(unzipPath, C2188811AlT.LIZIZ(sbLIZ));
            }
            C354090DuR.LIZJ = path;
            C354090DuR.LJII.storeString("ep_video_cutout_res_inner_path", path);
        }
        Effect effect2 = this.LLILLJJLI.element;
        if (effect2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cutout_alg_model");
            String str = File.separator;
            sbLIZ2.append(str);
            sbLIZ2.append("saliency_matting");
            sbLIZ2.append(str);
            C0VSJ c0vsjLJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.CUTOUT, C2188811AlT.LIZIZ(sbLIZ2), true);
            File[] fileArrListFiles2 = c0vsjLJIIJ.listFiles();
            if (fileArrListFiles2 == null || fileArrListFiles2.length == 0) {
                String unzipPath2 = effect2.getUnzipPath();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(c0vsjLJIIJ.getPath());
                sbLIZ3.append(str);
                C2286708xd.LJ(unzipPath2, C2188811AlT.LIZIZ(sbLIZ3));
            }
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("MattingUtils@777b.startFetchAiMattingResOpt$2$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
