package X;

import android.graphics.Rect;
import com.ss.android.vesdk.faceinfo.VEFaceAttribute;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0twa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.FaceDetectionManagerImpl$onDetected$1", f = "FaceDetectionManager.kt", l = {393, 396, 398}, m = "invokeSuspend")
public final class C1684780twa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1684810twd LLILLL;
    public final /* synthetic */ C1684860twi LLILZ;
    public final /* synthetic */ Rect LLILZIL;
    public final /* synthetic */ C1684910twn LLILZLL;
    public final /* synthetic */ VEFaceAttribute LLIZ;
    public final /* synthetic */ InterfaceC1684790twb LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1684780twa(C1684810twd c1684810twd, C1684860twi c1684860twi, Rect rect, C1684910twn c1684910twn, VEFaceAttribute vEFaceAttribute, InterfaceC1684790twb interfaceC1684790twb, InterfaceC1364105Vn<? super C1684780twa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1684810twd;
        this.LLILZ = c1684860twi;
        this.LLILZIL = rect;
        this.LLILZLL = c1684910twn;
        this.LLIZ = vEFaceAttribute;
        this.LLIZLLLIL = interfaceC1684790twb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1684780twa(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684780twa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
