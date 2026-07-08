package X;

import com.ss.android.ugc.tools.chat.data.TaskProgress;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01e7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot$updateProgress$1", f = "AITheaterSocialGeneratingMessageListProtocol.kt", l = {596, 599, 610, 622, 624}, m = "invokeSuspend")
public final class C382101e7 extends C09AX implements Function2<InterfaceC346701Wf<? super Integer>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ TaskProgress LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C382101e7(TaskProgress taskProgress, InterfaceC1364105Vn<? super C382101e7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = taskProgress;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C382101e7 c382101e7 = new C382101e7(this.LLJI, interfaceC1364105Vn);
        c382101e7.LLJ = obj;
        return c382101e7;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3 A[Catch: CancellationException -> 0x00f4, TRY_ENTER, TryCatch #1 {CancellationException -> 0x00f4, blocks: (B:14:0x0052, B:42:0x00d3), top: B:88:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e8 -> B:45:0x00eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x016a -> B:76:0x0170). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382101e7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Integer> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
