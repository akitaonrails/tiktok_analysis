package X;

import android.content.Context;
import com.ss.android.ugc.aweme.service.TemplateMediaServiceImpl;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.096e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.TemplateMediaServiceImpl$compressMedias$compressJob$1$compressVideoTask$1", f = "TemplateMediaServiceImpl.kt", l = {82}, m = "invokeSuspend")
public final class C23174096e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Long>>, Object> {
    public int LL;
    public final /* synthetic */ TemplateMediaServiceImpl LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ List<C23179096j> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23174096e(TemplateMediaServiceImpl templateMediaServiceImpl, Context context, List<C23179096j> list, String str, InterfaceC1364105Vn<? super C23174096e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateMediaServiceImpl;
        this.LLILLL = context;
        this.LLILZ = list;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23174096e(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMediaServiceImpl@c2fb.compressMedias$compressJob$1$compressVideoTask$1");
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
            TemplateMediaServiceImpl templateMediaServiceImpl = this.LLILLJJLI;
            Context context = this.LLILLL;
            List<C23179096j> list = this.LLILZ;
            String str = this.LLILZIL;
            this.LL = 1;
            obj = templateMediaServiceImpl.LIZJ(context, list, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateMediaServiceImpl@c2fb.compressMedias$compressJob$1$compressVideoTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TemplateMediaServiceImpl@c2fb.compressMedias$compressJob$1$compressVideoTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
