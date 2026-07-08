package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.model.ECSystemPhotoModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.view.ECPhotoSearchBubbleAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.guide.view.ECPhotoSearchBubbleAssem$checkAndInitGuideBubble$1$2", f = "ECPhotoSearchBubbleAssem.kt", l = {108}, m = "invokeSuspend")
public final class C595980NZc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ECPhotoSearchBubbleAssem LLILLJJLI;
    public final /* synthetic */ AbstractC621770Oa7 LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595980NZc(ECPhotoSearchBubbleAssem eCPhotoSearchBubbleAssem, AbstractC621770Oa7 abstractC621770Oa7, Context context, InterfaceC1364105Vn<? super C595980NZc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = eCPhotoSearchBubbleAssem;
        this.LLILLL = abstractC621770Oa7;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C595980NZc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ECPhotoSearchBubbleAssem@ae92.checkAndInitGuideBubble$1$2");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C595970NZb c595970NZb = new C595970NZb(this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c595970NZb);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ECPhotoSearchBubbleAssem@ae92.checkAndInitGuideBubble$1$2");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        this.LLILLJJLI.zo(((Boolean) pair.getFirst()).booleanValue(), (ECSystemPhotoModel) pair.getSecond(), (C621760Oa6) this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECPhotoSearchBubbleAssem@ae92.checkAndInitGuideBubble$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
