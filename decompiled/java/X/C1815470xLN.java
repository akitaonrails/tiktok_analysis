package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel$doneScenery$1$2$1", f = "SceneryApplyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1815470xLN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SceneryApplyViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815470xLN(SceneryApplyViewModel sceneryApplyViewModel, InterfaceC1364105Vn<? super C1815470xLN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sceneryApplyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1815470xLN(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SceneryApplyViewModel@a4ab.doneScenery$1$2$1"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel r0 = r7.LL
            X.0xLT r0 = r0.vQ2()
            com.bytedance.android.livesdk.model.BoardItem r3 = r0.LL
            r4 = 1
            r2 = 0
            if (r3 == 0) goto L38
            com.bytedance.android.livesdk.model.SceneryContent r1 = r3.sceneryContent
            if (r1 == 0) goto L38
            int r0 = r1.sceneryType
            if (r0 != 0) goto L38
            com.bytedance.android.livesdk.model.ImageContent r0 = r1.imageContent
            if (r0 == 0) goto L2d
            android.graphics.Bitmap r0 = r0.LIZ
            if (r0 == 0) goto L2d
            r0.recycle()
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r0)
        L2d:
            com.bytedance.android.livesdk.model.SceneryContent r0 = r3.sceneryContent
            if (r0 == 0) goto L38
            com.bytedance.android.livesdk.model.ImageContent r1 = r0.imageContent
            if (r1 == 0) goto L38
            r0 = 0
            r1.LIZ = r0
        L38:
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel r0 = r7.LL
            X.0xLP r0 = r0.LL
            r0.qk(r2)
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel r0 = r7.LL
            X.0xLP r1 = r0.LL
            X.0xLT r0 = r0.vQ2()
            com.bytedance.android.livesdk.model.BoardItem r0 = r0.LL
            r1.Ek(r0, r4)
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel r5 = r7.LL
            X.0xLR r0 = r5.LLILLJJLI
            int r3 = r0.getLayoutType()
            java.lang.String r0 = "livesdk_decoration_scenery_source_editing_save"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            X.0xLT r0 = r5.vQ2()
            java.lang.String r1 = r0.LLILLL
            java.lang.String r0 = "decoration_entrance"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "clicked_picture_source"
            java.lang.String r0 = "upload"
            r2.LJJII(r0, r1)
            if (r3 == 0) goto L9b
            if (r3 == r4) goto L98
            r0 = 3
            if (r3 != r0) goto L9b
            java.lang.String r1 = "full_screen"
        L8a:
            java.lang.String r0 = "clicked_layout"
            r2.LJJII(r1, r0)
            r2.LIZ()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L98:
            java.lang.String r1 = "top"
            goto L8a
        L9b:
            java.lang.String r1 = "cancel"
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1815470xLN.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
