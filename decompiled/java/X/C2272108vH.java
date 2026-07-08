package X;

import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.Icon;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08vH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$uploadImage$2", f = "MobileEffectUtil.kt", l = {1472, 1473, 1474, 1481, 1482}, m = "invokeSuspend")
public final class C2272108vH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Icon>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ EditImage LLILZIL;
    public final /* synthetic */ EditImage LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2272108vH(EditImage editImage, EditImage editImage2, InterfaceC1364105Vn<? super C2272108vH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = editImage;
        this.LLILZLL = editImage2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2272108vH c2272108vH = new C2272108vH(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c2272108vH.LLILZ = obj;
        return c2272108vH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2272108vH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Icon>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
