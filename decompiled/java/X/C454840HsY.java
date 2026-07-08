package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454840HsY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ DefaultStickerClickHandler LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454840HsY(View view, DefaultStickerClickHandler defaultStickerClickHandler, C19EG c19eg, String str, String str2) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = defaultStickerClickHandler;
        this.LLILLL = c19eg;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (C1388190mED.LIZ(this.LL.getContext()) != null) {
            DefaultStickerClickHandler defaultStickerClickHandler = this.LLILLJJLI;
            C19EG c19eg = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            defaultStickerClickHandler.getClass();
            DefaultStickerClickHandler.LJFF(c19eg, str, str2, "video_sticker");
        }
        return Unit.LIZ;
    }
}
