package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.guide.TikTokDefaultStickerGuidePresenter;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: renamed from: X.197p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214883197p implements InterfaceC1623070sL3 {
    public final /* synthetic */ ShortVideoContext LIZ;
    public final /* synthetic */ C1DRG LIZIZ;

    public C214883197p(C1DRG c1drg, ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = c1drg;
    }

    @Override // X.InterfaceC1623070sL3
    public final InterfaceC1628620sU0 LIZ(View view, View view2, FrameLayout frameLayout) {
        ShortVideoContext shortVideoContext = this.LIZ;
        C214881197n c214881197n = new C214881197n(AFwS219S0000000_30.get$arr$(250), this.LIZIZ, view, view2);
        ((ArrayList) c214881197n.LJ).add(new AwS681S0100000_32(c214881197n, shortVideoContext, 23));
        c214881197n.LJI = new C197C(shortVideoContext);
        return new TikTokDefaultStickerGuidePresenter(c214881197n, new AnonymousClass1983(this.LIZIZ), frameLayout);
    }
}
