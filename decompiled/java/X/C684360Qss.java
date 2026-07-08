package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Qss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder$setupRelationBtn$4", f = "SearchUserViewHolder.kt", l = {886, 888, 890}, m = "invokeSuspend")
public final class C684360Qss extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public User LL;
    public int LLILLJJLI;
    public final /* synthetic */ ViewOnClickListenerC662370PyV LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C684360Qss(ViewOnClickListenerC662370PyV viewOnClickListenerC662370PyV, InterfaceC1364105Vn<? super C684360Qss> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = viewOnClickListenerC662370PyV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C684360Qss(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C684360Qss.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
