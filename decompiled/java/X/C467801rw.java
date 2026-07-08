package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareVM$getShareItemInfoList$contact$1", f = "QuickShareVM.kt", l = {204}, m = "invokeSuspend")
public final class C467801rw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMContact>>, Object> {
    public int LL;

    public C467801rw(InterfaceC1364105Vn<? super C467801rw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C467801rw(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickShareVM@6d02.getShareItemInfoList$contact$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C13BV c13bv = C13BV.INSTANCE;
            this.LL = 1;
            obj = C065Z.LIZJ(c13bv, true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("QuickShareVM@6d02.getShareItemInfoList$contact$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("QuickShareVM@6d02.getShareItemInfoList$contact$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMContact>> interfaceC1364105Vn) {
        return new C467801rw(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
