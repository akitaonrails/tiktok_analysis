package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Kq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.user.ChatListIMUserUpdater$getLocalUser$2", f = "ChatListIMUserUpdater.kt", l = {}, m = "invokeSuspend")
public final class C1335805Kq extends C09AX implements Function2<List<? extends String>, InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> {
    public /* synthetic */ Object LL;

    public C1335805Kq(InterfaceC1364105Vn<? super C1335805Kq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1335805Kq c1335805Kq = new C1335805Kq(interfaceC1364105Vn);
        c1335805Kq.LL = obj;
        return c1335805Kq;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "ChatListIMUserUpdater@737c.getLocalUser$2"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r0 = r5.LL
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = X.C13LP.LJJJLL(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L33
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r2 = r0.LJ()
            r1 = 0
            java.lang.String r0 = "im_local_db"
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r2.LJIIL(r3, r1, r0)
            if (r0 == 0) goto L33
            java.util.List r0 = java.util.Collections.singletonList(r0)
            if (r0 != 0) goto L35
        L33:
            X.13BV r0 = X.C13BV.INSTANCE
        L35:
            X.C1C7U.LIZIZ(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1335805Kq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, InterfaceC1364105Vn<? super List<? extends IMUser>> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
