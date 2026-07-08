package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12H9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$loadBundleBeauty$2$localData$1", f = "BeautySource.kt", l = {}, m = "invokeSuspend")
public final class C12H9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<BeautyCategory>>, Object> {
    public final /* synthetic */ C12HN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12H9(C12HN c12hn, InterfaceC1364105Vn<? super C12H9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c12hn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12H9(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BeautySource@786f.loadBundleBeauty$2$localData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<BeautyCategory> listLJIJ = this.LL.LIZ.LJIJ();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        if (listLJIJ != null) {
            for (BeautyCategory beautyCategory : listLJIJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) c259800zU.element);
                sbLIZ.append(beautyCategory.getCategoryResponse().getName());
                c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LJT getPanelDataFromLocal: ");
        sbLIZ2.append((String) c259800zU.element);
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (listLJIJ != null) {
            C12HN c12hn = this.LL;
            if (!c12hn.LJIJJ.LIZJ(c12hn.LIZIZ, listLJIJ)) {
                C19570511hX.LIZIZ("LJT getPanelDataFromLocal: panel not valid, local is null");
                listLJIJ = null;
            }
        }
        C1C7U.LIZIZ("BeautySource@786f.loadBundleBeauty$2$localData$1");
        return listLJIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<BeautyCategory>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
