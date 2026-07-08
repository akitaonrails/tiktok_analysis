package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01fY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$EffectRenderStrategy$render$2", f = "PCSBoardEffectService.kt", l = {316, 317, 318}, m = "invokeSuspend")
public final class C391001fY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C099G LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C394101g3 LLILZIL;
    public final /* synthetic */ InterfaceC395901gL LLILZLL;
    public final /* synthetic */ C388501f9 LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C391001fY(Context context, C388501f9 c388501f9, InterfaceC395901gL interfaceC395901gL, C394101g3 c394101g3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c394101g3;
        this.LLILZLL = interfaceC395901gL;
        this.LLIZ = c388501f9;
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C394101g3 c394101g3 = this.LLILZIL;
        InterfaceC395901gL interfaceC395901gL = this.LLILZLL;
        C391001fY c391001fY = new C391001fY(this.LLIZLLLIL, this.LLIZ, interfaceC395901gL, c394101g3, interfaceC1364105Vn);
        c391001fY.LLILZ = obj;
        return c391001fY;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C391001fY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
