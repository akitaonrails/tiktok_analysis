package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.SocialEditRootScene$doCustomInSingleModeAction$1", f = "SocialEditRootScene.kt", l = {2479}, m = "invokeSuspend")
public final class C564350MBl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1455250nyN LLILLJJLI;
    public final /* synthetic */ Runnable LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Runnable LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564350MBl(C1455250nyN c1455250nyN, Runnable runnable, boolean z, Runnable runnable2, String str, InterfaceC1364105Vn<? super C564350MBl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1455250nyN;
        this.LLILLL = runnable;
        this.LLILZ = z;
        this.LLILZIL = runnable2;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C564350MBl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialEditRootScene@8880.doCustomInSingleModeAction$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C564340MBk c564340MBk = new C564340MBk(this.LLILLJJLI, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c564340MBk) == objLJFF) {
                C1C7U.LIZIZ("SocialEditRootScene@8880.doCustomInSingleModeAction$1");
                return objLJFF;
            }
        }
        C1455250nyN c1455250nyN = this.LLILLJJLI;
        c1455250nyN.LLLLZ(c1455250nyN.LLJL, c1455250nyN.LLJLIL, this.LLILLL, this.LLILZ, this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialEditRootScene@8880.doCustomInSingleModeAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
