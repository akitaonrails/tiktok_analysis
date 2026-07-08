package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0m4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1381970m4B extends C2217421BqW implements Function2<List<IMContact>, InterfaceC1364105Vn<? super List<IMContact>>, Object>, InterfaceC842703Qz {
    public C1381970m4B(Object obj) {
        super(2, obj, C1381810m3v.class, "interceptFinish", "interceptFinish(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<IMContact> list, InterfaceC1364105Vn<? super List<IMContact>> interfaceC1364105Vn) {
        return ((C1381810m3v) this.receiver).LJIILL(list, interfaceC1364105Vn);
    }
}
