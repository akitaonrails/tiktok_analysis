package X;

import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tNN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.normal.MobileEffectUploadTask$uploadAMEDrafts$1", f = "MobileEffectUploadTask.kt", l = {153, 171}, m = "invokeSuspend")
public final class C1662950tNN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1662990tNR LL;
    public UploadImageConfig LLILLJJLI;
    public UploadImageConfig LLILLL;
    public UploadAuthKeyConfig LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public final /* synthetic */ List<UploadableDraftEffect> LLIZLLLIL;
    public final /* synthetic */ C1662990tNR LLJ;
    public final /* synthetic */ UploadImageConfig LLJI;
    public final /* synthetic */ UploadImageConfig LLJIJIL;
    public final /* synthetic */ UploadAuthKeyConfig LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1662950tNN(UploadAuthKeyConfig uploadAuthKeyConfig, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, C1662990tNR c1662990tNR, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = list;
        this.LLJ = c1662990tNR;
        this.LLJI = uploadImageConfig;
        this.LLJIJIL = uploadImageConfig2;
        this.LLJILJIL = uploadAuthKeyConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        List<UploadableDraftEffect> list = this.LLIZLLLIL;
        C1662990tNR c1662990tNR = this.LLJ;
        return new C1662950tNN(this.LLJILJIL, this.LLJI, this.LLJIJIL, c1662990tNR, list, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x004b, code lost:
    
        X.C1737910vKH.LIZJ(r5, new X.C1738220vKm("UpdateEffectResult.FailToGetAuthKey", r3.error_code, "fail to get auth key"));
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005a -> B:13:0x004b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0104 -> B:7:0x002c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1662950tNN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
