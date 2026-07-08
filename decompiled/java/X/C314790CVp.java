package X;

import com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager$preloadEmojiRes$1$1", f = "OnlineDrawableEmojiResourceManager.kt", l = {}, m = "invokeSuspend")
public final class C314790CVp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ OnlineDrawableEmojiResourceManager LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314790CVp(List<String> list, OnlineDrawableEmojiResourceManager onlineDrawableEmojiResourceManager, InterfaceC1364105Vn<? super C314790CVp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = onlineDrawableEmojiResourceManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314790CVp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnlineDrawableEmojiResourceManager@2e65.preloadEmojiRes$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list = this.LL;
        OnlineDrawableEmojiResourceManager onlineDrawableEmojiResourceManager = this.LLILLJJLI;
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            onlineDrawableEmojiResourceManager.LIZ(it2.next());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnlineDrawableEmojiResourceManager@2e65.preloadEmojiRes$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
