package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06C9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.datasource.StreakPetDataSource$fetchStreaksInfo$1", f = "StreakPetDataSource.kt", l = {83}, m = "invokeSuspend")
public final class C06C9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1569106Cj LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C06CA LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06C9(String str, String str2, C1569106Cj c1569106Cj, String str3, C06CA c06ca, InterfaceC1364105Vn<? super C06C9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = c1569106Cj;
        this.LLIZ = str3;
        this.LLIZLLLIL = c06ca;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06C9 c06c9 = new C06C9(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c06c9.LLILLL = obj;
        return c06c9;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:28:0x0074, B:30:0x0087, B:33:0x008d), top: B:187:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06C9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
