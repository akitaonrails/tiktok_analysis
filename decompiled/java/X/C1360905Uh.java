package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05Uh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem$RenderUi$3$5$3$1", f = "TakoContentPreviewAssem.kt", l = {413, 414}, m = "invokeSuspend")
public final class C1360905Uh extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05UN LLILLJJLI;
    public final /* synthetic */ TakoContentPreviewAssem LLILLL;
    public final /* synthetic */ C1679860toe LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360905Uh(C05UN c05un, TakoContentPreviewAssem takoContentPreviewAssem, C1679860toe c1679860toe, InterfaceC1364105Vn<? super C1360905Uh> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c05un;
        this.LLILLL = takoContentPreviewAssem;
        this.LLILZ = c1679860toe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1360905Uh(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            TakoContentPreviewItem takoContentPreviewItem = (TakoContentPreviewItem) C13LP.LJJJLZIJ(this.LLILLJJLI.LIZIZ(), this.LLILLJJLI.LIZLLL().LL);
            if (takoContentPreviewItem == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$3$1");
                return unit;
            }
            ((C13FE) this.LLILLL.LLJIJIL).setValue(true);
            if (takoContentPreviewItem instanceof TakoContentPreviewItem.Video) {
                InterfaceC1360805Ug interfaceC1360805UgLo = this.LLILLL.Lo();
                C1845270y7R c1845270y7R = ((TakoContentPreviewItem.Video) takoContentPreviewItem).video;
                this.LL = 1;
                if (interfaceC1360805UgLo.Xc(c1845270y7R) == objLJFF) {
                    C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$3$1");
                    return objLJFF;
                }
            } else if (takoContentPreviewItem instanceof TakoContentPreviewItem.Image) {
                InterfaceC1360805Ug interfaceC1360805UgLo2 = this.LLILLL.Lo();
                List<String> list = ((TakoContentPreviewItem.Image) takoContentPreviewItem).imageUrls;
                C1679860toe c1679860toe = this.LLILZ;
                String str = c1679860toe.LLILLL;
                Map<String, String> map = c1679860toe.LLILZLL;
                boolean z = c1679860toe.LLILZ;
                List<String> list2 = c1679860toe.LLILZIL;
                this.LL = 2;
                if (interfaceC1360805UgLo2.sD(list, str, map, z, list2, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$3$1");
                    return objLJFF;
                }
            } else {
                throw new C1954807lC();
            }
        }
        this.LLILLL.Lo().nG("post");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$3$1");
        return unit2;
    }
}
