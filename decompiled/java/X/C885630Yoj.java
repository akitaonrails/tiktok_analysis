package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.MessageRequestSetting;

/* JADX INFO: renamed from: X.0Yoj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885630Yoj {
    public static final C885630Yoj LIZ = new C885630Yoj();

    public static MessageRequestSetting LIZLLL() {
        IMContactApi.LIZ.getClass();
        InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
        EnumC1725606pK enumC1725606pK = EnumC1725606pK.MESSAGE_REQUEST_SETTING;
        MessageRequestSetting messageRequestSetting = (MessageRequestSetting) interfaceC15516065qLIZJ.LJFF(enumC1725606pK, null, null, enumC1725606pK.getAllowUsingLocalStaleValue(), true);
        return messageRequestSetting == null ? new MessageRequestSetting(C12859051l.LIZ().getBoolean("key_priority_option_state", false)) : messageRequestSetting;
    }

    public static boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "im_message_request_on_device_prioritization", false) > 0 && C19212010Ec.LIZJ.LJLLLLLL();
    }

    public static double LJ() {
        return C612090Nzb.LIZ() ? C877780Yc4.LIZ().acceptRateThreshold : C300850Bql.LIZ() ? C877780Yc4.LIZ().displayThresholdForClientAI : C877780Yc4.LIZ().displayThresholdForServer;
    }

    public static boolean LIZ(boolean z) {
        if (C300850Bql.LIZ() && LIZJ(z)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(boolean z) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_message_request_on_device_prioritization", false) != 2 || !C19212010Ec.LIZJ.LJLLLLLL()) {
            return false;
        }
        if (z && !LIZLLL().prioritySettingState) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.contacts.api.model.MessageRequestSetting> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C885660Yom
            if (r0 == 0) goto L53
            r8 = r10
            X.0Yom r8 = (X.C885660Yom) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L59
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L34
            com.ss.android.ugc.aweme.im.contacts.api.model.MessageRequestSetting r3 = new com.ss.android.ugc.aweme.im.contacts.api.model.MessageRequestSetting
            com.bytedance.keva.Keva r2 = X.C12859051l.LIZ()
            java.lang.String r1 = "key_priority_option_state"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r3.<init>(r0)
        L34:
            return r3
        L35:
            X.C155000ia.LIZIZ(r3)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.065q r3 = r0.LIZJ()
            X.06pK r4 = X.EnumC1725606pK.MESSAGE_REQUEST_SETTING
            r8.LLILLL = r1
            r5 = 0
            r7 = 0
            r6 = r5
            java.lang.Object r3 = r3.LJII(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L22
            return r2
        L53:
            X.0Yom r8 = new X.0Yom
            r8.<init>(r9, r10)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C885630Yoj.LJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C0Y8T r7, boolean r8, X.InterfaceC1364105Vn<? super java.lang.Double> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C885650Yol
            if (r0 == 0) goto L76
            r5 = r9
            X.0Yol r5 = (X.C885650Yol) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 != r3) goto L7c
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0YyC r1 = (X.C891500YyC) r1
            if (r1 == 0) goto L73
            X.1CE8 r0 = r1.persistent_ext
            if (r0 == 0) goto L73
            X.1CE3 r0 = r0.b2c_message_request
            if (r0 == 0) goto L73
            java.lang.Long r0 = r0.accept_rate
            if (r0 == 0) goto L73
            long r2 = r0.longValue()
            double r0 = (double) r2
        L37:
            java.lang.Double r0 = X.C2286608xc.LIZJ(r0)
            return r0
        L3c:
            X.C155000ia.LIZIZ(r1)
            if (r8 != 0) goto L58
            boolean r0 = X.C612090Nzb.LIZ()
            if (r0 == 0) goto L58
            X.0Yv7 r2 = X.C889590Yv7.LIZ
            X.0YvB r1 = X.EnumC889630YvB.CorePersistentExtFieldID_B2CMessageRequest
            java.lang.String r0 = r7.getConversationId()
            r5.LLILLL = r3
            java.lang.Object r1 = r2.LIZ(r1, r0, r5)
            if (r1 != r4) goto L22
            return r4
        L58:
            java.util.Map r1 = r7.getExt()
            if (r1 == 0) goto L73
            java.lang.String r0 = "a:message_request_priority"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L73
            java.lang.Double r0 = X.C2327809Ae.LJII(r0)
            if (r0 == 0) goto L73
            double r0 = r0.doubleValue()
            goto L37
        L73:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L37
        L76:
            X.0Yol r5 = new X.0Yol
            r5.<init>(r6, r9)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C885630Yoj.LJFF(X.0Y8T, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(boolean r7, kotlin.jvm.functions.Function0<kotlin.Unit> r8, kotlin.jvm.functions.Function0<kotlin.Unit> r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C885640Yok
            if (r0 == 0) goto L24
            r5 = r10
            X.0Yok r5 = (X.C885640Yok) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            kotlin.jvm.functions.Function0 r9 = r5.LLILLJJLI
            kotlin.jvm.functions.Function0 r8 = r5.LL
            goto L5b
        L24:
            X.0Yok r5 = new X.0Yok
            r5.<init>(r6, r10)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.im.contacts.api.model.MessageRequestSetting r2 = new com.ss.android.ugc.aweme.im.contacts.api.model.MessageRequestSetting     // Catch: java.lang.Exception -> L72
            if (r7 == 0) goto L3b
            r0 = 1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            r2.<init>(r0)     // Catch: java.lang.Exception -> L72
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ     // Catch: java.lang.Exception -> L72
            r0.getClass()     // Catch: java.lang.Exception -> L72
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()     // Catch: java.lang.Exception -> L72
            X.065q r1 = r0.LIZJ()     // Catch: java.lang.Exception -> L72
            X.06pK r0 = X.EnumC1725606pK.MESSAGE_REQUEST_SETTING     // Catch: java.lang.Exception -> L72
            r5.LL = r8     // Catch: java.lang.Exception -> L72
            r5.LLILLJJLI = r9     // Catch: java.lang.Exception -> L72
            r5.LLILZIL = r3     // Catch: java.lang.Exception -> L72
            java.lang.Object r1 = r1.LIZ(r0, r2, r5)     // Catch: java.lang.Exception -> L72
            if (r1 != r4) goto L5e
            return r4
        L5b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L72
        L5e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L72
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L6c
            if (r8 == 0) goto L7b
            r8.invoke()     // Catch: java.lang.Exception -> L72
            goto L7b
        L6c:
            if (r9 == 0) goto L7b
            r9.invoke()     // Catch: java.lang.Exception -> L72
            goto L7b
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r9 == 0) goto L7b
            r9.invoke()
        L7b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C885630Yoj.LJII(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }
}
