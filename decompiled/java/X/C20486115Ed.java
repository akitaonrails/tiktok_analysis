package X;

import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem$startPunishNoticePlayback$1", f = "MatchCountDownAssem.kt", l = {1602, 1604}, m = "invokeSuspend")
public final class C20486115Ed extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MatchCountDownAssem LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ List<Text> LLIZ;
    public final /* synthetic */ MatchCountDownAssem LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20486115Ed(List<? extends Text> list, MatchCountDownAssem matchCountDownAssem, InterfaceC1364105Vn<? super C20486115Ed> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = list;
        this.LLIZLLLIL = matchCountDownAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20486115Ed(this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x013e -> B:7:0x0023). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20486115Ed.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
