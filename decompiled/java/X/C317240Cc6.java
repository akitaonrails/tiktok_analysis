package X;

import com.ss.android.ugc.aweme.service.IMentionMixSearchService;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel$performMixSearchRefresh$2", f = "StoryUserListViewModel.kt", l = {392, 407, 424}, m = "invokeSuspend")
public final class C317240Cc6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC316870CbV<C317130Cbv>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ StoryUserListViewModel LLILZ;
    public final /* synthetic */ IMentionMixSearchService LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317240Cc6(IMentionMixSearchService iMentionMixSearchService, StoryUserListViewModel storyUserListViewModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = storyUserListViewModel;
        this.LLILZIL = iMentionMixSearchService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C317240Cc6 c317240Cc6 = new C317240Cc6(this.LLILZIL, this.LLILZ, interfaceC1364105Vn);
        c317240Cc6.LLILLL = obj;
        return c317240Cc6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[LOOP:0: B:9:0x0041->B:11:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0171 A[LOOP:1: B:32:0x016b->B:34:0x0171, LOOP_END] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C317240Cc6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC316870CbV<C317130Cbv>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
