package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.sei.TicketInfo;
import com.bytedance.android.livesdk.sei.TicketInfoExtra;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0ac2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941680ac2 implements InterfaceC941880acM {
    public C11JF LIZ;
    public TicketInfoExtra LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r10 = this;
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKd> r0 = X.C930890aKd.class
            java.lang.Object r0 = r1.gg0(r0)
            X.0UIe r0 = (X.InterfaceC769940UIe) r0
            r1 = 0
            if (r0 == 0) goto La2
            X.0jFs r3 = r0.getLiveCore()
        L11:
            com.bytedance.android.livesdk.sei.TicketInfoExtra r0 = r10.LIZIZ
            if (r0 == 0) goto L90
            java.util.Map<java.lang.String, com.bytedance.android.livesdk.sei.TicketInfo> r0 = r0.map
            r5 = 0
            if (r0 == 0) goto L90
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L90
            if (r3 == 0) goto L38
            java.lang.String r4 = "mg_t"
            org.json.JSONObject r9 = new org.json.JSONObject
            com.google.gson.Gson r2 = X.C19748512Ol.LIZIZ
            com.bytedance.android.livesdk.sei.TicketInfoExtra r0 = r10.LIZIZ
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r2, r0)
            r9.<init>(r0)
            r6 = 1
            java.lang.String r7 = "1610666011"
            r8 = r6
            r3.LJJIZ(r4, r5, r6, r7, r8, r9)
        L38:
            com.bytedance.android.livesdk.sei.TicketInfoExtra r0 = r10.LIZIZ
            if (r0 == 0) goto Lc0
            java.util.Map<java.lang.String, com.bytedance.android.livesdk.sei.TicketInfo> r0 = r0.map
            if (r0 == 0) goto Lc0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdk.sei.TicketInfo r0 = (com.bytedance.android.livesdk.sei.TicketInfo) r0
            java.lang.String r0 = r0.animId
            if (r0 == 0) goto L5f
            r5 = 1
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            if (r0 == 0) goto Lc0
            r0.booleanValue()
        L68:
            com.bytedance.android.livesdk.sei.TicketInfoExtra r0 = r10.LIZIZ
            if (r0 == 0) goto La5
            java.util.Map<java.lang.String, com.bytedance.android.livesdk.sei.TicketInfo> r0 = r0.map
            if (r0 == 0) goto La5
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L78:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdk.sei.TicketInfo r0 = (com.bytedance.android.livesdk.sei.TicketInfo) r0
            r0.animId = r1
            goto L78
        L90:
            if (r3 == 0) goto L68
            java.lang.String r4 = "mg_t"
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r6 = 1
            r5 = 0
            java.lang.String r7 = "1610666011"
            r8 = r6
            r3.LJJIZ(r4, r5, r6, r7, r8, r9)
            goto L68
        La2:
            r3 = r1
            goto L11
        La5:
            com.bytedance.android.livesdk.sei.TicketInfoExtra r1 = r10.LIZIZ
            if (r1 == 0) goto Lc0
            if (r3 == 0) goto Lc0
            java.lang.String r4 = "mg_t"
            org.json.JSONObject r9 = new org.json.JSONObject
            com.google.gson.Gson r0 = X.C19748512Ol.LIZIZ
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r1)
            r9.<init>(r0)
            r6 = 1
            r5 = 0
            java.lang.String r7 = "1610666011"
            r8 = r6
            r3.LJJIZ(r4, r5, r6, r7, r8, r9)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C941680ac2.LIZIZ():void");
    }

    @Override // X.InterfaceC941880acM
    public final void clear() {
        C20441214yg.LIZIZ("IntervalTicketHandlerImpl", "clear");
        this.LIZIZ = null;
        C11JF c11jf = this.LIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC941880acM
    public final void LIZ(int i, String str, List list) {
        TicketInfoExtra ticketInfoExtra;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C941840acI c941840acI = (C941840acI) it2.next();
            String strSE = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).sE(c941840acI.LIZ);
            if (strSE != null) {
                linkedHashMap.put(strSE, new TicketInfo(Long.valueOf(c941840acI.LIZIZ), c941840acI.LIZJ, c941840acI.LIZLLL, c941840acI.LJ, c941840acI.LJFF, Integer.valueOf(c941840acI.LJI), Integer.valueOf(c941840acI.LJII)));
            }
        }
        if (linkedHashMap.isEmpty()) {
            ticketInfoExtra = null;
        } else {
            if (!C01ZE.LIZ()) {
                i = 0;
            }
            ticketInfoExtra = new TicketInfoExtra(str, linkedHashMap, i, null);
        }
        this.LIZIZ = ticketInfoExtra;
        LIZIZ();
        if (ticketInfoExtra != null && this.LIZ == null) {
            this.LIZ = (C11JF) C11NZ.LJJJJJL(0L, LSPassThroughRecordSizeConfig.DEFAULT, TimeUnit.MILLISECONDS).LJJLJLI(new AfS184S0100000_15(this, 223));
        }
    }
}
