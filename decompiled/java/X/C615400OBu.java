package X;

import com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel;
import com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment$onViewCreated$1", f = "DesignerStickerDetailAwemeListFragment.kt", l = {130}, m = "invokeSuspend")
public final class C615400OBu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DesignerStickerDetailAwemeListFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615400OBu(DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment, InterfaceC1364105Vn<? super C615400OBu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = designerStickerDetailAwemeListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C615400OBu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DesignerStickerDetailAwemeListFragment@7e8.onViewCreated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            FeatureVideoViewModel featureVideoViewModelUS = this.LLILLJJLI.uS();
            String str = this.LLILLJJLI.LLLIZZ;
            this.LL = 1;
            if (featureVideoViewModelUS.vQ2(str, this) == objLJFF) {
                C1C7U.LIZIZ("DesignerStickerDetailAwemeListFragment@7e8.onViewCreated$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DesignerStickerDetailAwemeListFragment@7e8.onViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
