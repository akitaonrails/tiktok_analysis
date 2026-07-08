package X;

import com.bytedance.im.core.proto.MessageBody;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xsf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$saveNormalMessagesAndNotifyUI$1", f = "DefaultIMUseCaseCenter.kt", l = {770}, m = "invokeSuspend")
public final class C862590Xsf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ List<MessageBody> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862590Xsf(C863650XuN c863650XuN, List<MessageBody> list, String str, int i, String str2, String str3, long j, int i2, InterfaceC1364105Vn<? super C862590Xsf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = j;
        this.LLJ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862590Xsf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.saveNormalMessagesAndNotifyUI$1");
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
            C0Y77 c0y77LIZIZ = this.LLILLJJLI.LLILZIL.LIZIZ();
            List<MessageBody> list = this.LLILLL;
            String str = this.LLILZ;
            int i2 = this.LLILZIL;
            String str2 = this.LLILZLL;
            String str3 = this.LLIZ;
            long j = this.LLIZLLLIL;
            int i3 = this.LLJ;
            this.LL = 1;
            if (c0y77LIZIZ.LIZLLL(list, str, i2, str2, str3, j, i3, C0Y82.UNKNOWN, null, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.saveNormalMessagesAndNotifyUI$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.saveNormalMessagesAndNotifyUI$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
