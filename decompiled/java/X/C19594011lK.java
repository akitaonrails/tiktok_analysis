package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import avg.f;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.AwS430S0200000_29;
import mf.a;

/* JADX INFO: renamed from: X.11lK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19594011lK<T extends StickerModel> extends AbstractC19588311kP<T> {
    public final C01GW LLILZIL;

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LJJJJLL.getValue());
    }

    public final InterfaceC19578611iq getStickerClickListener() {
        return (InterfaceC19578611iq) this.LLILZIL.getValue();
    }

    public C19594011lK(Context context, C19591211ks c19591211ks) {
        super(0, context, (AttributeSet) null, c19591211ks);
        this.LLILZIL = C452501pT.LIZIZ(new AwS430S0200000_29(c19591211ks, (C19591211ks) this, (C19594011lK<StickerModel>) 122));
    }
}
