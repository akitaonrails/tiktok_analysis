package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05B5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupMentionUtils$updateRecentMentionList$2", f = "GroupMentionUtils.kt", l = {}, m = "invokeSuspend")
public final class C05B5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05B5(String str, List<String> list, InterfaceC1364105Vn<? super C05B5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05B5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupMentionUtils@7cc7.updateRecentMentionList$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(C0YNP.LJIIIIZZ(this.LL, "a:recent_mentions", C13LP.LJJLIIIJ(this.LLILLJJLI, ",", null, null, 0, null, null, 62)));
        C1C7U.LIZIZ("GroupMentionUtils@7cc7.updateRecentMentionList$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
