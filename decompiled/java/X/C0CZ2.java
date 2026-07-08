package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.util.MentionNetworkRequestHelperKt$getMentionCheckResponseWithCache$2", f = "MentionNetworkRequestHelper.kt", l = {249, 275, 287}, m = "invokeSuspend")
public final class C0CZ2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends MentionGeneralCheckResponse, ? extends Boolean>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ List<IMUser> LLILZ;
    public final /* synthetic */ List<IMUser> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CZ2(long j, List<? extends IMUser> list, List<? extends IMUser> list2, InterfaceC1364105Vn<? super C0CZ2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = list;
        this.LLILZIL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CZ2 c0cz2 = new C0CZ2(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0cz2.LLILLJJLI = obj;
        return c0cz2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ee  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CZ2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends MentionGeneralCheckResponse, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
