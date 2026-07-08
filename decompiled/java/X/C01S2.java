package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01S2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.StickerSchemaManager$setSticker$2", f = "StickerSchemaManager.kt", l = {}, m = "invokeSuspend")
public final class C01S2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01S2(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01S2(this.LL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "StickerSchemaManager@2284.setSticker$2"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            java.lang.String r0 = r5.LL
            com.bytedance.android.livesdk.model.RoomSticker r3 = X.C342601Uq.LJ(r0)
            if (r3 == 0) goto L62
            java.lang.String r0 = r5.LLILLJJLI
            kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.String, kotlin.Unit> r2 = r5.LLILLL
            r3.LIZJ = r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = X.C01S3.LIZ
            if (r1 == 0) goto L22
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.SelectRoomStickerEvent> r0 = com.bytedance.android.livesdk.chatroom.event.SelectRoomStickerEvent.class
            r1.LC0(r0, r3)
        L22:
            if (r2 == 0) goto L62
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "success"
            r2.invoke(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
        L30:
            kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.String, kotlin.Unit> r3 = r5.LLILLL
            java.lang.String r2 = r5.LL
            if (r0 != 0) goto L5c
            if (r3 == 0) goto L42
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "sticker not found"
            r3.invoke(r1, r0)
        L42:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "not sticker id "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " found in list"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "StickerSchemaManager"
            X.C20441214yg.LJ(r0, r1)
        L5c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L62:
            r0 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01S2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
