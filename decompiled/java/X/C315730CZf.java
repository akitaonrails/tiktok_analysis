package X;

import com.ss.android.ugc.aweme.base.vm.MentionListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel$mixSearchRefresh$2", f = "MentionListViewModel.kt", l = {488, 498, 516}, m = "invokeSuspend")
public final class C315730CZf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ MentionListViewModel LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315730CZf(MentionListViewModel mentionListViewModel, long j, String str, InterfaceC1364105Vn<? super C315730CZf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = mentionListViewModel;
        this.LLILZIL = j;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C315730CZf c315730CZf = new C315730CZf(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c315730CZf.LLILLL = obj;
        return c315730CZf;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c1  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315730CZf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
