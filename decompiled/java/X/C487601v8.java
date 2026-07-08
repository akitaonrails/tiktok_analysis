package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01v8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C487601v8 extends C2217421BqW implements InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, ? extends Unit>, C1533910q1F> {
    public C487601v8(Forest forest) {
        super(3, forest, Forest.class, "fetchResourceAsync", "fetchResourceAsync(Ljava/lang/String;Lcom/bytedance/forest/model/RequestParams;Lkotlin/jvm/functions/Function1;)Lcom/bytedance/forest/model/RequestOperation;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public final C1533910q1F invoke(String str, RequestParams requestParams, Function1<? super C1533790q13, ? extends Unit> function1) {
        return ((Forest) this.receiver).fetchResourceAsync(str, requestParams, function1);
    }
}
