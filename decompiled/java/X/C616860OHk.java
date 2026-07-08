package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel$updateBulletinListToNew$1$1", f = "BulletinListViewModel.kt", l = {648, 659, 666, 666, 669, 675}, m = "invokeSuspend")
public final class C616860OHk extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C0OK3 LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final /* synthetic */ BulletinListViewModel LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ C259800zU<C616870OHl> LLJI;
    public final /* synthetic */ long LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C616860OHk(BulletinListViewModel bulletinListViewModel, String str, C259800zU<C616870OHl> c259800zU, long j, InterfaceC1364105Vn<? super C616860OHk> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLIZLLLIL = bulletinListViewModel;
        this.LLJ = str;
        this.LLJI = c259800zU;
        this.LLJIJIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C616860OHk(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e5  */
    /* JADX WARN: Type inference failed for: r15v4, types: [T, X.0OHl] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616860OHk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
