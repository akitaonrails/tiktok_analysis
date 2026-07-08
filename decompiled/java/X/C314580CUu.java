package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0CUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction$startLikePanelFlow$1$terminal$1", f = "SocialThoughtRouteAction.kt", l = {}, m = "invokeSuspend")
public final class C314580CUu extends C09AX implements Function2<C319530Cfn, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314580CUu(String str, InterfaceC1364105Vn<? super C314580CUu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C314580CUu c314580CUu = new C314580CUu(this.LLILLJJLI, interfaceC1364105Vn);
        c314580CUu.LL = obj;
        return c314580CUu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("SocialThoughtRouteAction@262b.startLikePanelFlow$1$terminal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C319530Cfn c319530Cfn = (C319530Cfn) this.LL;
        if (Intrinsics.LJFF(c319530Cfn.LIZ, this.LLILLJJLI) && !c319530Cfn.LJ) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("SocialThoughtRouteAction@262b.startLikePanelFlow$1$terminal$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C319530Cfn c319530Cfn, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c319530Cfn, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
