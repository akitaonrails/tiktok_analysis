package X;

import android.graphics.RectF;
import com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarGenerateData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HKD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl$performUploadProcessInBackground$2", f = "SocialAvatarCreationServiceImpl.kt", l = {305, 343, 355}, m = "invokeSuspend")
public final class C0HKD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SocialAvatarCreationServiceImpl LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ RectF LLIZ;
    public final /* synthetic */ SocialAvatarGenerateData LLIZLLLIL;
    public final /* synthetic */ C0HL8 LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ float LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HKD(SocialAvatarCreationServiceImpl socialAvatarCreationServiceImpl, String str, String str2, RectF rectF, SocialAvatarGenerateData socialAvatarGenerateData, C0HL8 c0hl8, int i, int i2, int i3, float f, InterfaceC1364105Vn<? super C0HKD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = socialAvatarCreationServiceImpl;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = rectF;
        this.LLIZLLLIL = socialAvatarGenerateData;
        this.LLJ = c0hl8;
        this.LLJI = i;
        this.LLJIJIL = i2;
        this.LLJILJIL = i3;
        this.LLJILJILJ = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HKD c0hkd = new C0HKD(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c0hkd.LLILLL = obj;
        return c0hkd;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HKD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
