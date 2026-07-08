package X;

import com.ss.android.ugc.aweme.im.saas.host.impl.feed.invitation.JoinGroupBottomButtonAssem;
import com.ss.android.ugc.aweme.publicgroup.data.GroupForInvitation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.feed.invitation.JoinGroupBottomButtonAssem$tryJoinGroup$1", f = "JoinGroupBottomButtonAssem.kt", l = {103}, m = "invokeSuspend")
public final class C1230430i7l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ JoinGroupBottomButtonAssem LLILZIL;
    public final /* synthetic */ GroupForInvitation LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230430i7l(String str, long j, JoinGroupBottomButtonAssem joinGroupBottomButtonAssem, GroupForInvitation groupForInvitation, String str2, InterfaceC1364105Vn<? super C1230430i7l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = joinGroupBottomButtonAssem;
        this.LLILZLL = groupForInvitation;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1230430i7l c1230430i7l = new C1230430i7l(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1230430i7l.LLILLJJLI = obj;
        return c1230430i7l;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:25:0x0091, B:28:0x0097, B:30:0x009b, B:39:0x00ab, B:41:0x00af, B:42:0x00b1, B:44:0x00b7, B:45:0x00c6, B:47:0x00db, B:48:0x0102, B:49:0x0105, B:50:0x010a, B:51:0x010b, B:53:0x011c, B:54:0x0139, B:17:0x0061, B:20:0x0073, B:21:0x0077), top: B:61:0x0061 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1230430i7l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
