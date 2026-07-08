package X;

import Y.ARunnableS128S0100000_28;
import Y.ARunnableS74S0200000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS144S0110000_28;

/* JADX INFO: renamed from: X.0z8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884640z8w extends AbstractC19588311kP<AICaptionTagStickerModel> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final TextView LLILZIL;

    public C1884640z8w(Context context) {
        super(0, 8, context, (AttributeSet) null);
        this.LLILZIL = (TextView) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d1b, this, true).findViewById(R.id.z96);
    }

    public final void LIZIZ(boolean z, boolean z2) {
        AwS144S0110000_28 awS144S0110000_28 = new AwS144S0110000_28(z, this, 2);
        if (z2) {
            awS144S0110000_28.invoke();
        } else {
            HandlerHook.viewPost(this, new ARunnableS128S0100000_28(awS144S0110000_28, 66));
        }
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        this.LLILZ = interactStickerStruct;
        HandlerHook.viewPost(this, new ARunnableS74S0200000_5(stickerModel, this, 45));
    }
}
