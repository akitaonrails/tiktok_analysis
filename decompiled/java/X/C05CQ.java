package X;

import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05CQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator$fetchEffect$4$1", f = "Text2ImageGenerator.kt", l = {729}, m = "invokeSuspend")
public final class C05CQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Effect>>, Object> {
    public int LL;
    public final /* synthetic */ Text2ImageGenerator LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05CQ(Text2ImageGenerator text2ImageGenerator, String str, InterfaceC1364105Vn<? super C05CQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = text2ImageGenerator;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05CQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageGenerator@4a7d.fetchEffect$4$1");
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
            Text2ImageGenerator text2ImageGenerator = this.LLILLJJLI;
            List listSingletonList = Collections.singletonList(this.LLILLL);
            this.LL = 1;
            obj = text2ImageGenerator.LIZJ("photo_mode_text_image_emphasis", listSingletonList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("Text2ImageGenerator@4a7d.fetchEffect$4$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("Text2ImageGenerator@4a7d.fetchEffect$4$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Effect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
