package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import kotlin.jvm.internal.AwS421S0200000_20;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0jmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294160jmY extends FrameLayout {
    public final C01GW LL;
    public final PlayerController LLILLJJLI;
    public final C01GW LLILLL;

    private final Configuration getConfiguration() {
        return (Configuration) this.LLILLL.getValue();
    }

    private final FrameLayout getLoadingView() {
        return (FrameLayout) this.LL.getValue();
    }

    public C1294160jmY(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(new AwS548S0100000_4(context, 529));
        this.LLILLL = C452501pT.LIZIZ(new AwS421S0200000_20(context, this, 14));
        addView(getLoadingView());
        PlayerController playerController = this.LLILLJJLI;
        if (playerController != null) {
            playerController.detachAlphaView(this);
        }
        PlayerController playerController2 = this.LLILLJJLI;
        if (playerController2 != null) {
            playerController2.release();
        }
        PlayerController playerController3 = PlayerController.get(getConfiguration(), new C1470090oMJ(context));
        this.LLILLJJLI = playerController3;
        if (playerController3 != null) {
            playerController3.attachAlphaView(getLoadingView());
        }
    }
}
