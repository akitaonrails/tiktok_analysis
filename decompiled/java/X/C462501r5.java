package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01r5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C462501r5 extends C09AY implements Function1<EnumC953640avK, Unit> {
    public final /* synthetic */ NoticeboardGuestController LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C462501r5(NoticeboardGuestController noticeboardGuestController, long j) {
        super(1);
        this.LL = noticeboardGuestController;
        this.LLILLJJLI = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.EnumC953640avK r5) {
        /*
            r4 = this;
            X.0avK r5 = (X.EnumC953640avK) r5
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController r0 = r4.LL
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.0avK> r2 = r0.LIZJ
            long r0 = r4.LLILLJJLI
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r0, r5)
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController r3 = r4.LL
            int r1 = r5.getValue()
            r3.getClass()
            r0 = 4
            if (r1 == r0) goto L24
            r0 = 5
            if (r1 == r0) goto L24
            r3.LJIIIZ()
        L21:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L24:
            boolean r0 = X.C930540aK4.LIZLLL()
            if (r0 != 0) goto L21
            X.11JF r0 = r3.LJIIJ
            if (r0 == 0) goto L40
            X.11JF r0 = r3.LJIIJ
            if (r0 == 0) goto L56
            boolean r0 = r0.isDisposed()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L3a:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L21
        L40:
            X.01us r2 = new X.01us
            r2.<init>(r3)
            X.01un r1 = new X.01un
            r1.<init>(r3)
            X.01ut r0 = new X.01ut
            r0.<init>(r3)
            X.11JF r0 = X.C953620avI.LJIIIZ(r2, r1, r0)
            r3.LJIIJ = r0
            goto L21
        L56:
            r0 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C462501r5.invoke(java.lang.Object):java.lang.Object");
    }
}
