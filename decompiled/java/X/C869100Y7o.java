package X;

import com.bytedance.im.core.proto.MessageBody;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgaroundindex.GetMsgByConvAroundIndexUseCase$pull$resultList$1$1", f = "GetMsgByConvAroundIndexUseCase.kt", l = {123}, m = "invokeSuspend")
public final class C869100Y7o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0Y7T>>, Object> {
    public C869090Y7n LL;
    public C869200Y7y LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public MessageBody LLILZLL;
    public Object LLIZ;
    public long LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final /* synthetic */ List<MessageBody> LLJIJIL;
    public final /* synthetic */ C869090Y7n LLJILJIL;
    public final /* synthetic */ C869200Y7y LLJILJILJ;
    public final /* synthetic */ long LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ int LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C869100Y7o(List<MessageBody> list, C869090Y7n c869090Y7n, C869200Y7y c869200Y7y, long j, String str, int i, InterfaceC1364105Vn<? super C869100Y7o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJIJIL = list;
        this.LLJILJIL = c869090Y7n;
        this.LLJILJILJ = c869200Y7y;
        this.LLJILLL = j;
        this.LLJJ = str;
        this.LLJJI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C869100Y7o(this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:11:0x0055, B:13:0x005b], limit reached: 39 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cf -> B:6:0x0031). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869100Y7o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0Y7T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
