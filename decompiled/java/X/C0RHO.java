package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0RHO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC1294060jmO
public final class C0RHO {
    public final C0SRL LIZ;
    public final VideoItemParams LIZIZ;
    public ViewGroup LIZJ;
    public C692980RGe LIZLLL;
    public C705930RmZ LJ;

    public C0RHO(C0SRL c0srl, VideoItemParams videoItemParams) {
        List<InteractStickerStruct> interactStickerStructs;
        ViewGroup viewGroupLJIIJJI;
        this.LIZ = c0srl;
        this.LIZIZ = videoItemParams;
        Aweme aweme = c0srl.LIZJ;
        if (aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null && (!interactStickerStructs.isEmpty())) {
            if (c0srl.LJIIZILJ) {
                viewGroupLJIIJJI = c0srl.LJIIJJI();
            } else {
                viewGroupLJIIJJI = c0srl.LJ;
            }
            this.LIZJ = viewGroupLJIIJJI;
            this.LIZLLL = (C692980RGe) viewGroupLJIIJJI.findViewById(R.id.rl0);
        }
    }
}
