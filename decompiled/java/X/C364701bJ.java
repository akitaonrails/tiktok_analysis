package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.ur.socialavatar.SocialAvatarStoryUtils$downloadSocialAvatarBackground$2$1$2", f = "SocialAvatarStoryUtils.kt", l = {133}, m = "invokeSuspend")
public final class C364701bJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<Unit> LLILLL;
    public final /* synthetic */ C364901bL LLILZ;
    public final /* synthetic */ File LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C364701bJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn, C364901bL c364901bL, File file, InterfaceC1364105Vn<? super C364701bJ> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = interfaceC1364105Vn;
        this.LLILZ = c364901bL;
        this.LLILZIL = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C364701bJ c364701bJ = new C364701bJ(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c364701bJ.LLILLJJLI = obj;
        return c364701bJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarStoryUtils@8e2e.downloadSocialAvatarBackground$2$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, null, null, new C364801bK(this.LLILZ, this.LLILZIL, null), 3);
            this.LL = 1;
            if (c099gLIZIZ.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarStoryUtils@8e2e.downloadSocialAvatarBackground$2$1$2");
                return objLJFF;
            }
        }
        InterfaceC1364105Vn<Unit> interfaceC1364105Vn = this.LLILLL;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC1364105Vn.resumeWith(unit);
        C1C7U.LIZIZ("SocialAvatarStoryUtils@8e2e.downloadSocialAvatarBackground$2$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
