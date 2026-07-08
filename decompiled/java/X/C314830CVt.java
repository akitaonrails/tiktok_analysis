package X;

import com.bytedance.android.livesdk.comment.emoji.LiveCommentDefaultEmojiInfoSetting;
import com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager$getAllOnlineSmallEmoji$1$1", f = "OnlineDrawableEmojiResourceManager.kt", l = {}, m = "invokeSuspend")
public final class C314830CVt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<C1115490f8N>>, Object> {
    public final /* synthetic */ OnlineDrawableEmojiResourceManager LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314830CVt(OnlineDrawableEmojiResourceManager onlineDrawableEmojiResourceManager, InterfaceC1364105Vn<? super C314830CVt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = onlineDrawableEmojiResourceManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314830CVt(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnlineDrawableEmojiResourceManager@2e65.getAllOnlineSmallEmoji$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        Map<String, String> mapLIZIZ = this.LL.LIZIZ();
        if (mapLIZIZ == null) {
            mapLIZIZ = LiveCommentDefaultEmojiInfoSetting.INSTANCE.getValue();
        }
        OnlineDrawableEmojiResourceManager onlineDrawableEmojiResourceManager = this.LL;
        for (Map.Entry<String, String> entry : mapLIZIZ.entrySet()) {
            C1115490f8N c1115490f8N = new C1115490f8N(onlineDrawableEmojiResourceManager.LJFF.LIZJ(entry.getKey()), entry.getKey());
            c1115490f8N.type = 1;
            arrayList.add(c1115490f8N);
        }
        C1C7U.LIZIZ("OnlineDrawableEmojiResourceManager@2e65.getAllOnlineSmallEmoji$1$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<C1115490f8N>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
