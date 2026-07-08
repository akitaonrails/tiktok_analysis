package X;

import android.content.Context;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fangroup.utils.FanGroupJoinDowngradeImpl$tryJoinGroup$3", f = "FanGroupJoinServiceImpl.kt", l = {133}, m = "invokeSuspend")
public final class C1231120i8s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1231150i8v LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ GroupJoinResponse LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1231120i8s(C1231150i8v c1231150i8v, boolean z, int i, String str, Context context, GroupJoinResponse groupJoinResponse, InterfaceC1364105Vn<? super C1231120i8s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1231150i8v;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = context;
        this.LLIZ = groupJoinResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1231120i8s(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01df  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1231120i8s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
