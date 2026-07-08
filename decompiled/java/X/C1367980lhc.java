package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lhc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1367980lhc extends C2217421BqW implements Function1<InterfaceC1364105Vn<? super Boolean>, Object>, InterfaceC842703Qz {
    public C1367980lhc(Object obj) {
        super(1, obj, C1381840m3y.class, "interceptStart", "interceptStart(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        if (((AbstractC1381820m3w) this.receiver).LL.LJ) {
            IMContactApi.LIZ.getClass();
            if (C069P.LIZ().LIZ().LIZLLL() > 0) {
                return true;
            }
            return false;
        }
        return true;
    }
}
