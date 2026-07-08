package X;

import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItemListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.repository.VibeFeedDetailOperator$getVibeFeedList$2", f = "VibeFeedDetailOperator.kt", l = {110}, m = "invokeSuspend")
public final class C629360OmM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VibeFeedItemListResponse>, Object> {
    public int LL;
    public final /* synthetic */ C0P32 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ EnumC629350OmL LLIZ;
    public final /* synthetic */ EnumC912680ZrG LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ C0P35 LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C629360OmM(C0P32 c0p32, String str, String str2, String str3, List<String> list, EnumC629350OmL enumC629350OmL, EnumC912680ZrG enumC912680ZrG, String str4, int i, C0P35 c0p35, InterfaceC1364105Vn<? super C629360OmM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0p32;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = list;
        this.LLIZ = enumC629350OmL;
        this.LLIZLLLIL = enumC912680ZrG;
        this.LLJ = str4;
        this.LLJI = i;
        this.LLJIJIL = c0p35;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C629360OmM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeFeedDetailOperator@bd0.getVibeFeedList$2");
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
            C0P32 c0p32 = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            List<String> list = this.LLILZLL;
            EnumC629350OmL enumC629350OmL = this.LLIZ;
            EnumC912680ZrG enumC912680ZrG = this.LLIZLLLIL;
            String str4 = this.LLJ;
            int i2 = this.LLJI;
            C0P35 c0p35 = this.LLJIJIL;
            this.LL = 1;
            obj = c0p32.LJLZ(str, str2, str3, list, enumC629350OmL, enumC912680ZrG, str4, i2, c0p35, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VibeFeedDetailOperator@bd0.getVibeFeedList$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VibeFeedDetailOperator@bd0.getVibeFeedList$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VibeFeedItemListResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
