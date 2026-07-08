package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$shareQuestion$1", f = "MessageViewModel.kt", l = {3239}, m = "invokeSuspend")
public final class C0CWA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ List<TakoVideoItem> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CWA(MessageViewModel messageViewModel, Aweme aweme, List<TakoVideoItem> list, String str, String str2, boolean z, Map<String, String> map, String str3, InterfaceC1364105Vn<? super C0CWA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = aweme;
        this.LLILZ = list;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = z;
        this.LLIZLLLIL = map;
        this.LLJ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CWA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.shareQuestion$1");
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
            C1863380yae c1863380yae = this.LLILLJJLI.LLJJJJ;
            if (c1863380yae != null) {
                Aweme aweme = this.LLILLL;
                List<TakoVideoItem> list = this.LLILZ;
                String str = this.LLILZIL;
                String str2 = this.LLILZLL;
                boolean z = this.LLIZ;
                Map<String, String> map = this.LLIZLLLIL;
                String str3 = this.LLJ;
                this.LL = 1;
                if (c1863380yae.LJIL(aweme, list, str, str2, z, map, str3, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@9229.shareQuestion$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.shareQuestion$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
