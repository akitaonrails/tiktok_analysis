package X;

import com.ss.android.ugc.aweme.aigc.AITaskServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AITaskServiceImpl$checkDraftAndCameoPermissions$2", f = "AITaskServiceImpl.kt", l = {209, 210}, m = "invokeSuspend")
public final class C542040LNq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C542120LNy>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC546090LbL LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ AITaskServiceImpl LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542040LNq(InterfaceC546090LbL interfaceC546090LbL, boolean z, String str, AITaskServiceImpl aITaskServiceImpl, String str2, List<String> list, InterfaceC1364105Vn<? super C542040LNq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC546090LbL;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = aITaskServiceImpl;
        this.LLIZ = str2;
        this.LLIZLLLIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C542040LNq c542040LNq = new C542040LNq(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c542040LNq.LLILLJJLI = obj;
        return c542040LNq;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C542040LNq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C542120LNy> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
