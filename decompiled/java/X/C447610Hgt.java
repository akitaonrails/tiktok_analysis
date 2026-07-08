package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Hgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447610Hgt extends ClickableSpan {
    public final PublicAreaMessageCommon.CreatorSuccessInfo.TagItem LL;
    public final Function1<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem, Unit> LLILLJJLI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.LLILLJJLI.invoke(this.LL);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C447610Hgt(PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem, Function1<? super PublicAreaMessageCommon.CreatorSuccessInfo.TagItem, Unit> function1) {
        this.LL = tagItem;
        this.LLILLJJLI = function1;
    }
}
