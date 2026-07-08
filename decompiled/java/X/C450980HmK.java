package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridAdapter;

/* JADX INFO: renamed from: X.0HmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450980HmK extends C450970HmJ implements InterfaceC450640Hlm {
    public final /* synthetic */ StickerGridAdapter LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450980HmK(StickerGridAdapter stickerGridAdapter, View view) {
        super(view);
        this.LLILLJJLI = stickerGridAdapter;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int i = stickerGridAdapter.LLJILJIL.LIZ;
            layoutParams.width = i;
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
