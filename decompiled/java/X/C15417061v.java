package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotUpdateRequest;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotUpdateResponse;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.IMAIBotApi;

/* JADX INFO: renamed from: X.061v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15417061v {
    public final AnonymousClass0623 LIZ;

    public C15417061v(C15415061t c15415061t) {
        this.LIZ = c15415061t;
    }

    public static InterfaceC1175604io LIZLLL(BotUpdateRequest botUpdateRequest) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            IMAIBotApi.LIZ.getClass();
            BotUpdateResponse botUpdateResponseLIZLLL = AnonymousClass0621.LIZ().updateBot(botUpdateRequest).LIZLLL();
            String strValueOf = String.valueOf(botUpdateResponseLIZLLL.statusCode);
            C1508705vR c1508705vR = C1508705vR.LL;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            c1508705vR.getClass();
            C1508705vR.LJII(jElapsedRealtime2, strValueOf, "update_bot");
            int i = botUpdateResponseLIZLLL.statusCode;
            if (i == 0) {
                return new C1175504in(botUpdateResponseLIZLLL);
            }
            return new C1175704ip(i, botUpdateResponseLIZLLL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1508705vR c1508705vR2 = C1508705vR.LL;
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            c1508705vR2.getClass();
            C1508705vR.LJII(jElapsedRealtime3, "-1", "update_bot");
            C062H.LIZ();
            return new C1175404im(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(long r13, X.InterfaceC1364105Vn<? super java.lang.Long> r15) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15417061v.LIZJ(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r8, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo, com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo> r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C15421061z
            if (r0 == 0) goto L6b
            r6 = r11
            X.061z r6 = (X.C15421061z) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L3a
            if (r0 != r3) goto L71
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r5)
            X.0623 r0 = r7.LIZ
            r6.LLILLJJLI = r10
            r6.LL = r8
            r6.LLILZIL = r1
            com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo r5 = r0.LIZ(r8)
            if (r5 != r4) goto L41
            return r4
        L3a:
            long r8 = r6.LL
            kotlin.jvm.functions.Function1 r10 = r6.LLILLJJLI
            X.C155000ia.LIZIZ(r5)
        L41:
            if (r5 != 0) goto L55
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "applyToLocalRepo skipped, botId not in repo: "
            r1.append(r0)
            r1.append(r8)
            X.C2188811AlT.LIZIZ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L55:
            X.0623 r2 = r7.LIZ
            java.lang.Object r0 = r10.invoke(r5)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 0
            r6.LLILLJJLI = r0
            r6.LLILZIL = r3
            java.lang.Object r0 = r2.LIZLLL(r1, r6)
            if (r0 != r4) goto L25
            return r4
        L6b:
            X.061z r6 = new X.061z
            r6.<init>(r7, r11)
            goto L12
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15417061v.LIZ(long, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r32, boolean r33, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo> r34) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15417061v.LIZIZ(int, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(long r17, X.C1512105vz r19, X.InterfaceC1364105Vn<? super X.InterfaceC1256804vu> r20) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15417061v.LJ(long, X.05vz, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(long r15, X.AnonymousClass0622 r17, X.InterfaceC1364105Vn<? super X.InterfaceC1256904vv> r18) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15417061v.LJFF(long, X.0622, X.05Vn):java.lang.Object");
    }
}
