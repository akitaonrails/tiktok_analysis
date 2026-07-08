package X;

import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemCursor;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OaO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$getBulletinBoardItemResponse$result$1", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C621940OaO extends C09AX implements Function1<InterfaceC1364105Vn<? super Pair<? extends List<? extends C619060OPw>, ? extends BulletinItemCursor>>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ BulletinItemCursor LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C621940OaO(String str, BulletinItemCursor bulletinItemCursor, InterfaceC1364105Vn<? super C621940OaO> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = bulletinItemCursor;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C621940OaO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Pair<? extends List<? extends C619060OPw>, ? extends BulletinItemCursor>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:48|22|(4:(9:24|27|(1:29)|30|50|31|52|32|33)(1:25)|52|32|33)|26|30|50|31) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x029b, code lost:
    
        r4 = e;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621940OaO.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
