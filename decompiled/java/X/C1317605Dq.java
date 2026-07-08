package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05Dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager$fetchIMUserList$2", f = "IMContactManager.kt", l = {278}, m = "invokeSuspend")
public final class C1317605Dq extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Function1<Throwable, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1317605Dq(List<String> list, String str, boolean z, boolean z2, boolean z3, boolean z4, Function1<? super Throwable, Unit> function1, InterfaceC1364105Vn<? super C1317605Dq> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = z4;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1317605Dq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends IMUser>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactManager@fb8a.fetchIMUserList$2");
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
            C1BG1 c1bg1 = C1BG1.LIZ;
            List<String> list = this.LLILLJJLI;
            String str = this.LLILLL;
            boolean z = this.LLILZ;
            boolean z2 = this.LLILZIL;
            boolean z3 = this.LLILZLL;
            boolean z4 = this.LLIZ;
            Function1<Throwable, Unit> function1 = this.LLIZLLLIL;
            this.LL = 1;
            obj = c1bg1.LJIJ(list, str, z, z2, z3, z4, function1, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMContactManager@fb8a.fetchIMUserList$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IMContactManager@fb8a.fetchIMUserList$2");
        return obj;
    }
}
