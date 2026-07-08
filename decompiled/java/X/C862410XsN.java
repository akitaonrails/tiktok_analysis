package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$createGroupConversation$1", f = "DefaultIMUseCaseCenter.kt", l = {361}, m = "invokeSuspend")
public final class C862410XsN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<Long> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Boolean LLJILJIL;
    public final /* synthetic */ InterfaceC863580XuG LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862410XsN(C863650XuN c863650XuN, int i, List<Long> list, String str, Map<String, String> map, String str2, String str3, String str4, String str5, String str6, Boolean bool, InterfaceC863580XuG interfaceC863580XuG, InterfaceC1364105Vn<? super C862410XsN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = i;
        this.LLILZ = list;
        this.LLILZIL = str;
        this.LLILZLL = map;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = str6;
        this.LLJILJIL = bool;
        this.LLJILJILJ = interfaceC863580XuG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862410XsN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.createGroupConversation$1");
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
            C0Y4D c0y4dLJFF = this.LLILLJJLI.LLILZIL.LJFF();
            int i2 = this.LLILLL;
            List<Long> list = this.LLILZ;
            String str = this.LLILZIL;
            Map<String, String> map = this.LLILZLL;
            String str2 = this.LLIZ;
            String str3 = this.LLIZLLLIL;
            String str4 = this.LLJ;
            String str5 = this.LLJI;
            String str6 = this.LLJIJIL;
            Boolean bool = this.LLJILJIL;
            InterfaceC863580XuG interfaceC863580XuG = this.LLJILJILJ;
            this.LL = 1;
            if (c0y4dLJFF.LIZJ(i2, list, str, map, str2, str3, str4, str5, str6, bool, interfaceC863580XuG, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.createGroupConversation$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.createGroupConversation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
