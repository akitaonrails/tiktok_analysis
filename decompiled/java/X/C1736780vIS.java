package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vIS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$updateEffectNameImage$2", f = "MobileEffectUtil.kt", l = {291, 293, 295}, m = "invokeSuspend")
public final class C1736780vIS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1736670vIH>, Object> {
    public Object LL;
    public UploadImageConfig LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ Uri LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1736780vIS(int i, Uri uri, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = uri;
        this.LLILZLL = str;
        this.LLIZ = i;
        this.LLIZLLLIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1736780vIS c1736780vIS = new C1736780vIS(this.LLIZ, this.LLILZIL, this.LLILZLL, this.LLIZLLLIL, interfaceC1364105Vn);
        c1736780vIS.LLILZ = obj;
        return c1736780vIS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a A[Catch: Exception -> 0x016c, TryCatch #0 {Exception -> 0x016c, blocks: (B:42:0x00e9, B:44:0x012a, B:45:0x0134, B:49:0x0163, B:50:0x0166, B:51:0x0169), top: B:56:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134 A[Catch: Exception -> 0x016c, TryCatch #0 {Exception -> 0x016c, blocks: (B:42:0x00e9, B:44:0x012a, B:45:0x0134, B:49:0x0163, B:50:0x0166, B:51:0x0169), top: B:56:0x00e9 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1736780vIS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1736670vIH> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
