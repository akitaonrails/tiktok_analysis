package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.IProfileService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.playableconvertcomponent.AnolePlayableConvertComponentExtKt$initClickListener$1$1", f = "AnolePlayableConvertComponentExt.kt", l = {}, m = "invokeSuspend")
public final class C1001740cAu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1003830cEH LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001740cAu(C1003830cEH c1003830cEH, InterfaceC1364105Vn<? super C1001740cAu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1003830cEH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001740cAu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        IProfileService iProfileService;
        C1C7U.LIZ("AnolePlayableConvertComponentExtKt@6ce4.initClickListener$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL.LLILLJJLI.LIZJ;
        if ((obj2 instanceof Aweme) && (aweme = (Aweme) obj2) != null && (iProfileService = (IProfileService) PluggableExtentionKt.pluggableSpi$default(IProfileService.class, false, false, false, 14, null)) != null) {
            iProfileService.disLikeAweme(aweme, 0, "", 0, 0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnolePlayableConvertComponentExtKt@6ce4.initClickListener$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
