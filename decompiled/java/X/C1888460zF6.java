package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.model.AiChatActionBarRepositoryImpl$getAiChatActionBarConfig$1", f = "AiChatActionBarRepository.kt", l = {31, LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT, 37, 44, 52}, m = "invokeSuspend")
public final class C1888460zF6 extends C09AX implements Function2<InterfaceC346701Wf<? super InterfaceC1157570gEF<? extends List<? extends C21288018So>>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1888480zF8 LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1888460zF6(C1888480zF8 c1888480zF8, String str, InterfaceC1364105Vn<? super C1888460zF6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1888480zF8;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1888460zF6 c1888460zF6 = new C1888460zF6(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1888460zF6.LLILLL = obj;
        return c1888460zF6;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:32:0x00b7, B:33:0x00ba, B:35:0x00be, B:25:0x0089, B:27:0x009f), top: B:67:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #0 {all -> 0x00c3, blocks: (B:32:0x00b7, B:33:0x00ba, B:35:0x00be, B:25:0x0089, B:27:0x009f), top: B:67:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1888460zF6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC1157570gEF<? extends List<? extends C21288018So>>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
