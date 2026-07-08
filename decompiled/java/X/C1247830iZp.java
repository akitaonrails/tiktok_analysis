package X;

import android.view.View;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment$buildContentSectionActionBaseItem$1$2$invokeSuspend$$inlined$parseBizData$2", f = "ProfileIdentifierFragment.kt", l = {}, m = "invokeSuspend")
public final class C1247830iZp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileIdentifierFragment LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ ProfileComponents LLILZ;
    public final /* synthetic */ ProfileIdentifierFragment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1247830iZp(ProfileIdentifierFragment profileIdentifierFragment, Object obj, InterfaceC1364105Vn interfaceC1364105Vn, View view, ProfileComponents profileComponents, ProfileIdentifierFragment profileIdentifierFragment2) {
        super(2, interfaceC1364105Vn);
        this.LL = profileIdentifierFragment;
        this.LLILLJJLI = obj;
        this.LLILLL = view;
        this.LLILZ = profileComponents;
        this.LLILZIL = profileIdentifierFragment2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1247830iZp(this.LL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1247830iZp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
