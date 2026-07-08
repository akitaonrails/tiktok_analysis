package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.MobileEffectExportWorkflowImpl$exportEffect$1", f = "MobileEffectExportWorkflowImpl.kt", l = {342, 357, 358, 367}, m = "invokeSuspend")
public final class C1626030sPp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1622420sK0 LLILZ;
    public final /* synthetic */ C1622410sJz LLILZIL;
    public final /* synthetic */ UploadableMobileEffect2 LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ InterfaceC1622430sK1 LLJ;
    public final /* synthetic */ Effect LLJI;
    public final /* synthetic */ Bitmap LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626030sPp(C1622420sK0 c1622420sK0, C1622410sJz c1622410sJz, UploadableMobileEffect2 uploadableMobileEffect2, boolean z, boolean z2, InterfaceC1622430sK1 interfaceC1622430sK1, Effect effect, Bitmap bitmap, InterfaceC1364105Vn<? super C1626030sPp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1622420sK0;
        this.LLILZIL = c1622410sJz;
        this.LLILZLL = uploadableMobileEffect2;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = interfaceC1622430sK1;
        this.LLJI = effect;
        this.LLJIJIL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1626030sPp c1626030sPp = new C1626030sPp(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1626030sPp.LLILLL = obj;
        return c1626030sPp;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d A[LOOP:0: B:35:0x0117->B:37:0x011d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1626030sPp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
