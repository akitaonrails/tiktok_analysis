package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06pG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1725206pG extends C2217421BqW implements Function1<InterfaceC1364105Vn<? super List<? extends IMUserBaseInfo>>, Object>, InterfaceC842703Qz {
    public C1725206pG(InterfaceC1725106pF interfaceC1725106pF) {
        super(1, interfaceC1725106pF, InterfaceC1725106pF.class, "getAllUserBaseInfoFromDB", "getAllUserBaseInfoFromDB(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends IMUserBaseInfo>> interfaceC1364105Vn) {
        return ((InterfaceC1725106pF) this.receiver).LJIJ(interfaceC1364105Vn);
    }
}
