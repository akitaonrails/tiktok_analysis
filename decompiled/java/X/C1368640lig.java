package X;

import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel$performSearchWithDebounce$1", f = "ShareMoreViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1368640lig extends C09AX implements Function2<String, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ShareMoreViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368640lig(ShareMoreViewModel shareMoreViewModel, InterfaceC1364105Vn<? super C1368640lig> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = shareMoreViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1368640lig c1368640lig = new C1368640lig(this.LLILLJJLI, interfaceC1364105Vn);
        c1368640lig.LL = obj;
        return c1368640lig;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("ShareMoreViewModel@e3f8.performSearchWithDebounce$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str2 = (String) this.LL;
        InterfaceC1368670lij interfaceC1368670lij = this.LLILLJJLI.LLILLJJLI;
        if (C1368750lir.LIZ().optEnable) {
            str = C1368750lir.LIZ().configKey;
        } else {
            str = "";
        }
        interfaceC1368670lij.LIZIZ(str2, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareMoreViewModel@e3f8.performSearchWithDebounce$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
