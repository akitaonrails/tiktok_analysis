package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09iD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel$checkComponentShowCondition$1$1", f = "ProfileFollowingSuggestViewModel.kt", l = {78, 84, 92, 101, 105}, m = "invokeSuspend")
public final class C2445909iD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileFollowingSuggestViewModel LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2445909iD(ProfileFollowingSuggestViewModel profileFollowingSuggestViewModel, Aweme aweme, InterfaceC1364105Vn<? super C2445909iD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileFollowingSuggestViewModel;
        this.LLILLL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2445909iD(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (r3 < X.C1ECA.LIZLLL()) goto L36;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2445909iD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
