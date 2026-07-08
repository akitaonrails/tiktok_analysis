package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.social.creation.mediapicker.navigation.StoryCameraRecordAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.navigation.StoryCameraRecordAction$open$1", f = "StoryCameraRecordAction.kt", l = {}, m = "invokeSuspend")
public final class C417001jk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryCameraRecordAction LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Bundle LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C417001jk(StoryCameraRecordAction storyCameraRecordAction, Context context, Bundle bundle, InterfaceC1364105Vn<? super C417001jk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyCameraRecordAction;
        this.LLILLJJLI = context;
        this.LLILLL = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C417001jk(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCameraRecordAction@f240.open$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.realOpenRecord(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryCameraRecordAction@f240.open$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
