package X;

import android.graphics.Rect;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.render.TextTemplateParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS134S0400000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FGA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public interface C0FGA {
    TextTemplateParams LIZ();

    void LIZIZ(Function1<? super TextTemplateParams, Unit> function1);

    void LIZJ();

    NLETrackSlot LIZLLL();

    void LJ(AwS549S0100000_5 awS549S0100000_5);

    int LJFF();

    void LJI(TextStickerModel textStickerModel, AwS549S0100000_5 awS549S0100000_5);

    boolean LJII();

    Rect LJIIIIZZ();

    void LJIIIZ(TextStickerModel textStickerModel);

    void LJIIJ(FrameLayout frameLayout, LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA, int i, AwS134S0400000_5 awS134S0400000_5);

    void LJIIJJI(FrameLayout frameLayout);

    void LJIIL(AwS584S0100000_5 awS584S0100000_5);

    void LLZLLLL();

    void destroy();

    INLEStickerRuntime getStickerApi();

    void recycleEngine();

    void resume();
}
