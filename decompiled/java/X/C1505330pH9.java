package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pH9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505330pH9 {
    public static final C1505410pHH LIZ = new AbstractC1505210pGx() { // from class: X.0pHH
        public static final /* synthetic */ int LIZJ = 0;

        @Override // X.AbstractC1505150pGr
        public final void LIZIZ() {
            LJIIIIZZ().LIZIZ("send_message_local_label", new C1505460pHM());
            LJIIIIZZ().LIZIZ("receive_message_local_label", new C1505460pHM());
            LJIIIIZZ().LIZIZ("like_message_local_label", new C1505460pHM());
            LJIIIIZZ().LIZIZ("send_message_local_time_stamp", new C1505460pHM());
            LJIIIIZZ().LIZIZ("receive_message_local_time_stamp", new C1505460pHM());
            LJIIIIZZ().LIZIZ("like_message_local_time_stamp", new C1505460pHM());
        }

        @Override // X.AbstractC1505150pGr
        public final ConcurrentHashMap<String, String> LJI() {
            return LJIIIIZZ().LIZLLL();
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
        @Override // X.AbstractC1505150pGr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String LIZJ(java.lang.String r11) {
            /*
                r10 = this;
                r9 = 0
                if (r11 == 0) goto L39
                int r1 = r11.hashCode()
                r0 = -541959104(0xffffffffdfb25c40, float:-2.5704436E19)
                if (r1 == r0) goto L2e
                r0 = 569317809(0x21ef19b1, float:1.620207E-18)
                if (r1 == r0) goto L23
                r0 = 585859468(0x22eb818c, float:6.383404E-18)
                if (r1 != r0) goto L39
                java.lang.String r0 = "receive_message_local_label"
                boolean r0 = r11.equals(r0)
                if (r0 == 0) goto L39
                java.lang.String r8 = "receive_message_local_time_stamp"
            L20:
                if (r8 != 0) goto L3b
                return r9
            L23:
                java.lang.String r0 = "send_message_local_label"
                boolean r0 = r11.equals(r0)
                if (r0 == 0) goto L39
                java.lang.String r8 = "send_message_local_time_stamp"
                goto L20
            L2e:
                java.lang.String r0 = "like_message_local_label"
                boolean r0 = r11.equals(r0)
                if (r0 == 0) goto L39
                java.lang.String r8 = "like_message_local_time_stamp"
                goto L20
            L39:
                r8 = r9
                goto L20
            L3b:
                X.0pHI r0 = r10.LJIIIIZZ()     // Catch: java.lang.Exception -> L4e
                java.lang.String r0 = r0.LIZJ(r8)     // Catch: java.lang.Exception -> L4e
                if (r0 == 0) goto L52
                long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L4e
                java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L4e
                goto L53
            L4e:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            L52:
                r0 = r9
            L53:
                if (r0 == 0) goto L84
                long r1 = r0.longValue()
                long r6 = java.lang.System.currentTimeMillis()
                X.0pHI r0 = r10.LJIIIIZZ()
                java.lang.String r5 = r0.LIZJ(r11)
                long r3 = r6 - r1
                r1 = 604800000(0x240c8400, double:2.988109026E-315)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 <= 0) goto L83
                X.0pHI r1 = r10.LJIIIIZZ()
                java.lang.String r0 = "0"
                r1.LJ(r11, r0)
                X.0pHI r1 = r10.LJIIIIZZ()
                java.lang.String r0 = java.lang.String.valueOf(r6)
                r1.LJ(r8, r0)
                return r9
            L83:
                return r5
            L84:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1505410pHH.LIZJ(java.lang.String):java.lang.String");
        }
    };
}
