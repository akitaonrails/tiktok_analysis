package X;

import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0miz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.normal.AISelfUploadTask$uploadAISelfTaskForImageCanvasMode$1", f = "AISelfUploadTask.kt", l = {97, 111, 111, 107}, m = "invokeSuspend")
public final class C1407270miz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1407220miu LL;
    public AISelfModel LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public IAIMEServices LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ C1407220miu LLJ;
    public final /* synthetic */ AISelfModel LLJI;
    public final /* synthetic */ UploadAuthKeyConfig LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407270miz(AISelfModel aISelfModel, UploadAuthKeyConfig uploadAuthKeyConfig, C1407220miu c1407220miu, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = c1407220miu;
        this.LLJI = aISelfModel;
        this.LLJIJIL = uploadAuthKeyConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407270miz(this.LLJI, this.LLJIJIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cb A[PHI: r5 r6 r12
      0x01cb: PHI (r5v4 X.0miu) = (r5v1 X.0miu), (r5v6 X.0miu), (r5v6 X.0miu) binds: [B:68:0x01ca, B:10:0x0028, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r6v5 com.ss.android.ugc.aweme.creative.model.AISelfModel) = 
      (r6v2 com.ss.android.ugc.aweme.creative.model.AISelfModel)
      (r6v7 com.ss.android.ugc.aweme.creative.model.AISelfModel)
      (r6v7 com.ss.android.ugc.aweme.creative.model.AISelfModel)
     binds: [B:68:0x01ca, B:10:0x0028, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r12v12 java.lang.Integer) = (r12v4 java.lang.Integer), (r12v14 java.lang.Integer), (r12v14 java.lang.Integer) binds: [B:68:0x01ca, B:10:0x0028, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407270miz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
