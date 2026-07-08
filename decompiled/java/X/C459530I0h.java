package X;

import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0I0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C459530I0h extends C2217421BqW implements Function1<InterfaceC1364105Vn<? super List<? extends SetSticker>>, Object>, InterfaceC842703Qz {
    public C459530I0h(C455830Hu9 c455830Hu9) {
        super(1, c455830Hu9, C455830Hu9.class, "fetchRemoteStickerList", "fetchRemoteStickerList(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends SetSticker>> interfaceC1364105Vn) {
        return ((C455830Hu9) this.receiver).LIZ(interfaceC1364105Vn);
    }
}
