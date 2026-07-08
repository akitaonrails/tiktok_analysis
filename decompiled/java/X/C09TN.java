package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.09TN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C11Y7 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ C259800zU<SpeakerCenter.KevaSpeakerBean> LLILZ;
    public final /* synthetic */ TextStickerData LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09TN(C11Y7 c11y7, String str, C259800zU<String> c259800zU, C259800zU<SpeakerCenter.KevaSpeakerBean> c259800zU2, TextStickerData textStickerData, boolean z) {
        super(0);
        this.LL = c11y7;
        this.LLILLJJLI = str;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
        this.LLILZIL = textStickerData;
        this.LLILZLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        this.LL.Va0(this.LLILLJJLI, this.LLILLL.element, this.LLILZ.element, this.LLILZIL, this.LLILZLL);
        return Unit.LIZ;
    }
}
