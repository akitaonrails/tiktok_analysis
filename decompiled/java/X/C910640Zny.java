package X;

import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler;
import kotlin.jvm.internal.AwS415S0200000_14;

/* JADX INFO: renamed from: X.0Zny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910640Zny {
    public static C910680Zo2 LIZIZ(UnreadHandler unreadHandler, C910740Zo8 c910740Zo8, MessageListScrollAbility messageListScrollAbility) {
        return new C910680Zo2(unreadHandler.tP2(), c910740Zo8.LIZ, unreadHandler.tJ(), new AwS415S0200000_14(messageListScrollAbility, c910740Zo8, 48), c910740Zo8.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler r7, long r8, X.InterfaceC910720Zo6 r10, com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility r11, X.InterfaceC1364105Vn<? super X.C910680Zo2> r12) {
        /*
            boolean r0 = r12 instanceof X.C910650Znz
            if (r0 == 0) goto L40
            r3 = r12
            X.0Znz r3 = (X.C910650Znz) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r6 = r3.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLILZIL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L5d
            long r8 = r3.LLILLL
            com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility r11 = r3.LLILLJJLI
            com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler r7 = r3.LL
            X.C155000ia.LIZIZ(r6)
        L28:
            X.0Zo8 r6 = (X.C910740Zo8) r6
            r5 = 0
            if (r6 != 0) goto L46
            return r5
        L2e:
            X.C155000ia.LIZIZ(r6)
            r3.LL = r7
            r3.LLILLJJLI = r11
            r3.LLILLL = r8
            r3.LLILZIL = r0
            java.lang.Object r6 = r7.kQ1(r10, r3)
            if (r6 != r2) goto L28
            return r2
        L40:
            X.0Znz r3 = new X.0Znz
            r3.<init>(r12)
            goto L12
        L46:
            long r3 = r6.LIZ
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L4f
            return r5
        L4f:
            long r0 = r6.LIZIZ
            boolean r0 = r7.HZ0(r8, r0)
            if (r0 == 0) goto L58
            return r5
        L58:
            X.0Zo2 r0 = r7.nz1(r11, r6)
            return r0
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C910640Zny.LIZ(com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler, long, X.0Zo6, com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility, X.05Vn):java.lang.Object");
    }
}
