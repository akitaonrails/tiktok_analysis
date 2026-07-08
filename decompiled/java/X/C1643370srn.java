package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0srn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.effectlogic.AnnotationEffectExportLogic$saveIcon$2", f = "AnnotationEffectExportLogic.kt", l = {132, 144}, m = "invokeSuspend")
public final class C1643370srn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ Effect LLILZ;
    public final /* synthetic */ C1643410srr LLILZIL;
    public final /* synthetic */ Bitmap LLILZLL;
    public final /* synthetic */ UploadableMobileEffect2 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1643370srn(Effect effect, C1643410srr c1643410srr, Bitmap bitmap, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC1364105Vn<? super C1643370srn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = effect;
        this.LLILZIL = c1643410srr;
        this.LLILZLL = bitmap;
        this.LLIZ = uploadableMobileEffect2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1643370srn(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0164  */
    /* JADX WARN: Type inference failed for: r0v37, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v60, types: [T, android.graphics.Bitmap] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1643370srn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
