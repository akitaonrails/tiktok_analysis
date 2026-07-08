package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tNS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectUploader$createEffectWithError$2", f = "MobileEffectUploader.kt", l = {83, 84}, m = "invokeSuspend")
public final class C1663000tNS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1662960tNO>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2277008w4 LLILLL;
    public final /* synthetic */ UploadableMobileEffect LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ UploadImageConfig LLJI;
    public final /* synthetic */ UploadImageConfig LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1663000tNS(C2277008w4 c2277008w4, UploadableMobileEffect uploadableMobileEffect, String str, Integer num, String str2, String str3, String str4, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, InterfaceC1364105Vn<? super C1663000tNS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2277008w4;
        this.LLILZ = uploadableMobileEffect;
        this.LLILZIL = str;
        this.LLILZLL = num;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = uploadImageConfig;
        this.LLJIJIL = uploadImageConfig2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1663000tNS c1663000tNS = new C1663000tNS(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1663000tNS.LLILLJJLI = obj;
        return c1663000tNS;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0296  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1663000tNS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1662960tNO> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
