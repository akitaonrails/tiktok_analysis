package X;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01s5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareServiceImpl$generateStoryImageAndBackground$2", f = "MixStudioShareServiceImpl.kt", l = {37, 37}, m = "invokeSuspend")
public final class C468701s5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468701s5(int i, Context context, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = list;
        this.LLILZLL = z;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C468701s5 c468701s5 = new C468701s5(this.LLIZ, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn, this.LLILZLL);
        c468701s5.LLILLJJLI = obj;
        return c468701s5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0957 anonymousClass0957LIZIZ;
        Object obj2;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("MixStudioShareServiceImpl@4c44.generateStoryImageAndBackground$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.LLILLJJLI;
                    C155000ia.LIZIZ(objLJLIIIL);
                    Pair pair = new Pair(obj2, objLJLIIIL);
                    C1C7U.LIZIZ("MixStudioShareServiceImpl@4c44.generateStoryImageAndBackground$2");
                    return pair;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass0957LIZIZ = (AnonymousClass0957) this.LLILLJJLI;
            C155000ia.LIZIZ(objLJLIIIL);
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C468801s6(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null), 3);
            anonymousClass0957LIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C468601s4(this.LLIZ, this.LLILLL, this.LLILZ, null), 3);
            this.LLILLJJLI = anonymousClass0957LIZIZ;
            this.LL = 1;
            objLJLIIIL = c099gLIZIZ.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("MixStudioShareServiceImpl@4c44.generateStoryImageAndBackground$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = objLJLIIIL;
        this.LL = 2;
        Object objLJLIIIL2 = anonymousClass0957LIZIZ.LJLIIIL(this);
        if (objLJLIIIL2 == objLJFF) {
            C1C7U.LIZIZ("MixStudioShareServiceImpl@4c44.generateStoryImageAndBackground$2");
            return objLJFF;
        }
        obj2 = objLJLIIIL;
        objLJLIIIL = objLJLIIIL2;
        Pair pair2 = new Pair(obj2, objLJLIIIL);
        C1C7U.LIZIZ("MixStudioShareServiceImpl@4c44.generateStoryImageAndBackground$2");
        return pair2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
