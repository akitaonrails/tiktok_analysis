package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0swY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cameraspec.ChangeCameraSpecComponent$changeCameraSpec$2", f = "ChangeCameraSpecComponent.kt", l = {305, 317, 324, 328}, m = "invokeSuspend")
public final class C1646320swY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1649170t19 LLILLJJLI;
    public final /* synthetic */ EnumC1448590nnd LLILLL;
    public final /* synthetic */ EnumC1448590nnd LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C1646150swH LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1646320swY(C1649170t19 c1649170t19, EnumC1448590nnd enumC1448590nnd, EnumC1448590nnd enumC1448590nnd2, String str, String str2, C1646150swH c1646150swH, boolean z, String str3, int i, InterfaceC1364105Vn<? super C1646320swY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1649170t19;
        this.LLILLL = enumC1448590nnd;
        this.LLILZ = enumC1448590nnd2;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = c1646150swH;
        this.LLIZLLLIL = z;
        this.LLJ = str3;
        this.LLJI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1646320swY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e4  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1646320swY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
