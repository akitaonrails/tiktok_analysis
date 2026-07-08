package X;

import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.mvtemplate.AVVideoViewComponentFactoryImpl;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.TemplateNewPreloadTask$runTask$1$1$1", f = "TemplateNewPreloadTask.kt", l = {}, m = "invokeSuspend")
public final class C1337760kus extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1422570n7f LL;
    public final /* synthetic */ C1425060nBg LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1337760kus(C1425060nBg c1425060nBg, InterfaceC1422570n7f interfaceC1422570n7f, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1422570n7f;
        this.LLILLJJLI = c1425060nBg;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1337760kus(this.LLILLJJLI, this.LL, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateNewPreloadTask@abef.runTask$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.yG1() && this.LL.t().isEmpty()) {
            InterfaceC1422570n7f interfaceC1422570n7f = this.LL;
            String str = this.LLILLL;
            final C1425060nBg c1425060nBg = this.LLILLJJLI;
            interfaceC1422570n7f.zp1(true, str, C1337770kut.LIZ(), false, new InterfaceC1422520n7a() { // from class: X.0nBX
                @Override // X.InterfaceC1423360n8w
                public final /* bridge */ /* synthetic */ void LIZJ(List list, C1423470n97 c1423470n97, TemplateCategoryData templateCategoryData, List list2, C1422890n8B c1422890n8B) {
                }

                @Override // X.InterfaceC1423360n8w
                public final void onCancel() {
                }

                @Override // X.InterfaceC1423360n8w
                public final void LIZ(C1422880n8A c1422880n8A) {
                    c1425060nBg.LJIIJ();
                }

                @Override // X.InterfaceC1423360n8w
                public final void LIZIZ(List<? extends TemplateCategoryData> list, C1423470n97 c1423470n97, C1423320n8s<TemplateCategoryData, C1419590n2r, C1422890n8B, C1422880n8A> c1423320n8s) {
                    List<C1419590n2r> list2;
                    C1419590n2r c1419590n2r;
                    AVVideoViewComponentFactoryImpl aVVideoViewComponentFactoryImplLIZ;
                    InterfaceC1425180nBs interfaceC1425180nBsCreate;
                    c1425060nBg.LJIIJ();
                    if (!C299160Bo2.LIZ() && c1423320n8s != null && (list2 = c1423320n8s.LIZIZ) != null && (c1419590n2r = (C1419590n2r) C13LP.LJJJLL(list2)) != null) {
                        C1425060nBg c1425060nBg2 = c1425060nBg;
                        c1425060nBg2.getClass();
                        s sVar = s.LIZ;
                        Asset asset = c1419590n2r.LIZ;
                        sVar.getClass();
                        CutsameDataItem cutsameDataItemLJJLIIIJLJLI = s.LJJLIIIJLJLI(asset);
                        if (cutsameDataItemLJJLIIIJLJLI != null) {
                            Video videoLIZ = C1419160n2A.LIZ(cutsameDataItemLJJLIIIJLJLI);
                            C1DRG c1drg = c1425060nBg2.LLJ;
                            if (c1drg != null && (aVVideoViewComponentFactoryImplLIZ = ((InterfaceC1424960nBW) c1drg.LJII(InterfaceC1424960nBW.class, null)).LIZ()) != null && (interfaceC1425180nBsCreate = aVVideoViewComponentFactoryImplLIZ.create()) != null) {
                                interfaceC1425180nBsCreate.preloadVideo(videoLIZ, 819200);
                            }
                        }
                    }
                }
            });
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TemplateNewPreloadTask@abef.runTask$1$1$1");
            return unit;
        }
        this.LLILLJJLI.LJIIJ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateNewPreloadTask@abef.runTask$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
