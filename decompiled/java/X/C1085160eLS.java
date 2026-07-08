package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.viewmodule.PreviewDecorationWrapperWidget;
import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerPreviewWrapperWidget;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eLS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1085160eLS extends C2217421BqW implements Function0<Unit> {
    public C1085160eLS(Object obj) {
        super(0, obj, LiveEventStickerPreviewWrapperWidget.class, "onDeleteStickerSuccess", "onDeleteStickerSuccess()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ViewGroup viewGroup;
        PreviewDecorationWrapperWidget previewDecorationWrapperWidget = (PreviewDecorationWrapperWidget) this.receiver;
        View view = previewDecorationWrapperWidget.getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C786410Ut5.LJJJJI(viewGroup);
            ((ArrayList) previewDecorationWrapperWidget.LLILZIL).clear();
        }
        previewDecorationWrapperWidget.hide();
        previewDecorationWrapperWidget.dataChannel.SX0(C1085140eLQ.class, null);
        return Unit.LIZ;
    }
}
