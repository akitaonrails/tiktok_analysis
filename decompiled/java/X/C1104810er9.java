package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0er9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104810er9 extends C09AY implements Function1<Context, Unit> {
    public final /* synthetic */ C1104820erA LL;
    public final /* synthetic */ VirtualTicketEnvelopeInfo LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104810er9(C1104820erA c1104820erA, VirtualTicketEnvelopeInfo virtualTicketEnvelopeInfo, long j, long j2, long j3) {
        super(1);
        this.LL = c1104820erA;
        this.LLILLJJLI = virtualTicketEnvelopeInfo;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(android.content.Context r19) {
        /*
            r18 = this;
            r11 = r19
            android.content.Context r11 = (android.content.Context) r11
            r5 = r18
            X.0erA r0 = r5.LL
            r0.getClass()
            X.C1104820erA.LJ()
            java.util.Set<java.lang.Long> r0 = X.C1104800er8.LIZ
            com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfo r10 = r5.LLILLJJLI
            if (r10 == 0) goto L5d
            long r1 = r10.envelopeId
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L5d
            long r6 = X.C158B.LIZ()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            long r3 = r10.sendTimeSec
            long r0 = r10.displaySeconds
            long r3 = r3 + r0
            long r3 = r3 - r6
            java.lang.String r0 = "livesdk_match_virtual_tickets_icon_click"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            java.util.HashMap r0 = X.C1104800er8.LIZ(r10)
            r2.LJJIIZI(r0)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L3b
            r8 = r3
        L3b:
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = "left_countdown"
            r2.LJJII(r1, r0)
            r2.LJIL()
            r2.LIZ()
        L4a:
            X.0erA r2 = r5.LL
            long r12 = r5.LLILLL
            long r14 = r5.LLILZ
            long r0 = r5.LLILZIL
            r2.getClass()
            r16 = r0
            X.C1104820erA.LJFF(r11, r12, r14, r16)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5d:
            java.lang.String r1 = "VirtualTicketCrossRoomIconTracker"
            java.lang.String r0 = "reportIconClick skipped: invalid envelope"
            X.C20441214yg.LJIIL(r1, r0)
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1104810er9.invoke(java.lang.Object):java.lang.Object");
    }
}
