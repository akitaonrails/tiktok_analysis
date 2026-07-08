package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.landing.handler.BusinessChatEntranceTypeHandler$requestLandingMessage$1$1", f = "BusinessChatEntranceTypeHandler.kt", l = {44}, m = "invokeSuspend")
public final class C1735606qw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1735706qx LLILLJJLI;
    public final /* synthetic */ C909290Zln LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735606qw(C1735706qx c1735706qx, C909290Zln c909290Zln, Long l, InterfaceC1364105Vn<? super C1735606qw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1735706qx;
        this.LLILLL = c909290Zln;
        this.LLILZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1735606qw(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws org.json.JSONException {
        /*
            r18 = this;
            java.lang.String r9 = "BusinessChatEntranceTypeHandler@b862.requestLandingMessage$1$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r3 = X.C099R.LJFF()
            r4 = r18
            int r0 = r4.LL
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 != r2) goto L9f
            X.C155000ia.LIZIZ(r19)
        L15:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L1b:
            X.C155000ia.LIZIZ(r19)
            X.06qx r6 = r4.LLILLJJLI
            r6.LIZLLL = r2
            int r5 = r6.LIZJ
            java.lang.String r7 = "item_id"
            java.lang.String r8 = "creative_id"
            r1 = 2
            if (r5 == r1) goto L9a
            r0 = 3
            if (r5 == r0) goto L93
            r0 = 6
            if (r5 == r0) goto L8e
            r0 = 8
            if (r5 == r0) goto L93
            X.0Zln r0 = r6.LIZIZ
            java.lang.String r15 = r0.getSingleChatFromUserId()
            if (r15 != 0) goto L3f
            java.lang.String r15 = ""
        L3f:
            X.06qx r0 = r4.LLILLJJLI
            com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM r10 = r0.LIZ
            X.0Zln r11 = r4.LLILLL
            java.lang.Long r0 = r4.LLILZ
            long r12 = r0.longValue()
            X.06qx r0 = r4.LLILLJJLI
            int r14 = r0.LIZJ
            if (r14 != r1) goto L87
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            X.0Zln r0 = r0.LIZIZ
            org.json.JSONObject r5 = r0.getBizInfoExtraMap()
            if (r5 == 0) goto L75
            long r0 = r5.optLong(r8)
            r6.put(r8, r0)
            java.lang.String r0 = r5.optString(r7)
            r6.put(r7, r0)
            java.lang.String r1 = "tt_clid"
            java.lang.String r0 = r5.optString(r1)
            r6.put(r1, r0)
        L75:
            java.lang.String r16 = X.C786410Ut5.J3(r6)
        L79:
            r4.LL = r2
            r17 = r4
            java.lang.Object r0 = r10.zQ2(r11, r12, r14, r15, r16, r17)
            if (r0 != r3) goto L15
            X.C1C7U.LIZIZ(r9)
            return r3
        L87:
            X.0Zln r0 = r0.LIZIZ
            java.lang.String r16 = r0.getBizInfoExtra()
            goto L79
        L8e:
            java.lang.String r15 = r6.LIZ(r7)
            goto L3f
        L93:
            java.lang.String r0 = "room_id"
            java.lang.String r15 = r6.LIZ(r0)
            goto L3f
        L9a:
            java.lang.String r15 = r6.LIZ(r8)
            goto L3f
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1735606qw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
