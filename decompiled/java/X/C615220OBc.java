package X;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.AddMemberHelper$openAddMemberPanelForPublicGroup$1", f = "AddMemberHelper.kt", l = {165, 174}, m = "invokeSuspend")
public final class C615220OBc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1390130mHL LL;
    public int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C0Y8T LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ EnumC1230500i7s LLIZLLLIL;
    public final /* synthetic */ C19EG LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615220OBc(Context context, C0Y8T c0y8t, List<String> list, String str, String str2, EnumC1230500i7s enumC1230500i7s, C19EG c19eg, InterfaceC1364105Vn<? super C615220OBc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = c0y8t;
        this.LLILZIL = list;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = enumC1230500i7s;
        this.LLJ = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C615220OBc(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0mHL, android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615220OBc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
