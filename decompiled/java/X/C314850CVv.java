package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.comment.emoji.LiveCommentDefaultEmojiInfoSetting;
import com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager$getEmojiDrawable$1$drawable$1", f = "OnlineDrawableEmojiResourceManager.kt", l = {}, m = "invokeSuspend")
public final class C314850CVv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Drawable>, Object> {
    public final /* synthetic */ OnlineDrawableEmojiResourceManager LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Resources LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314850CVv(OnlineDrawableEmojiResourceManager onlineDrawableEmojiResourceManager, String str, Resources resources, InterfaceC1364105Vn<? super C314850CVv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = onlineDrawableEmojiResourceManager;
        this.LLILLJJLI = str;
        this.LLILLL = resources;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314850CVv(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnlineDrawableEmojiResourceManager@2e65.getEmojiDrawable$1$drawable$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, String> mapLIZIZ = this.LL.LIZIZ();
        if (mapLIZIZ == null) {
            mapLIZIZ = LiveCommentDefaultEmojiInfoSetting.INSTANCE.getValue();
        }
        Drawable drawableLIZ = null;
        if (mapLIZIZ.containsKey(this.LLILLJJLI)) {
            OnlineDrawableEmojiResourceManager onlineDrawableEmojiResourceManager = this.LL;
            String str = this.LLILLJJLI;
            Resources resources = this.LLILLL;
            if (onlineDrawableEmojiResourceManager.LJFF.LIZJ(str) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getRes from cache ");
                sbLIZ.append(str);
                C20441214yg.LJIIIZ("OnlineSmallEmojiResourceManager", C2188811AlT.LIZIZ(sbLIZ));
                Bitmap bitmapLIZJ = onlineDrawableEmojiResourceManager.LJFF.LIZJ(str);
                if (bitmapLIZJ != null) {
                    drawableLIZ = new BitmapDrawable(resources, bitmapLIZJ);
                }
            } else {
                drawableLIZ = onlineDrawableEmojiResourceManager.LIZ(str);
            }
            C1C7U.LIZIZ("OnlineDrawableEmojiResourceManager@2e65.getEmojiDrawable$1$drawable$1");
            return drawableLIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getEmojiDrawable not online small emoji ");
        sbLIZ2.append(this.LLILLJJLI);
        C20441214yg.LJIIIZ("OnlineSmallEmojiResourceManager", C2188811AlT.LIZIZ(sbLIZ2));
        C1C7U.LIZIZ("OnlineDrawableEmojiResourceManager@2e65.getEmojiDrawable$1$drawable$1");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Drawable> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
