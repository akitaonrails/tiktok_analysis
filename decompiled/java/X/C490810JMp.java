package X;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.TextureView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0JMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490810JMp implements C0JNK, OnPreRenderListener {
    public C0JO7 LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(265));
    public final C01GW LLILLL;
    public final C054G LLILZ;
    public InterfaceC490720JMg LLILZIL;

    public final boolean LJ() {
        String currentSourceID;
        C0N0Y c0n0yLIZLLL;
        Boolean boolValueOf;
        C0JO7 c0jo7 = this.LL;
        if (c0jo7 == null || (currentSourceID = c0jo7.getCurrentSourceID()) == null || (c0n0yLIZLLL = LIZLLL(currentSourceID)) == null || (boolValueOf = Boolean.valueOf(c0n0yLIZLLL.isPlaying())) == null) {
            return false;
        }
        return boolValueOf.booleanValue();
    }

    public C490810JMp() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 651));
        this.LLILLL = c01gwLIZIZ;
        this.LLILZ = C2296808zG.LIZ(((AbstractC23273099z) c01gwLIZIZ.getValue()).plus(C2296908zH.LIZ()));
        this.LLILZIL = new InterfaceC490720JMg() { // from class: X.0N0V
            public final C1483410ohn LIZ = new C1483410ohn();

            @Override // X.InterfaceC490720JMg
            public final void LIZJ(String str) {
            }

            @Override // X.InterfaceC490720JMg
            public final void release() {
                this.LIZ.LJJL();
                this.LIZ.LJJIJ(null);
                this.LIZ.LJJIIJZLJL();
                this.LIZ.LJJIJL();
                this.LIZ.release();
            }

            @Override // X.InterfaceC490720JMg
            public final C0N0Y LIZ(String str) {
                return this.LIZ;
            }

            @Override // X.InterfaceC490720JMg
            public final C0N0Y LIZIZ(String str) {
                return this.LIZ;
            }
        };
    }

    @Override // X.C0JNK
    public final float LIZIZ(String str) {
        C0N0Y c0n0yLIZLLL = LIZLLL(str);
        if (c0n0yLIZLLL != null) {
            return c0n0yLIZLLL.getBitrate();
        }
        return 0.0f;
    }

    @Override // X.C0JNK
    public final boolean LIZJ(String str) {
        C0N0Y c0n0yLIZLLL = LIZLLL(str);
        if (c0n0yLIZLLL != null) {
            return c0n0yLIZLLL.isPlaying();
        }
        return false;
    }

    public final C0N0Y LIZLLL(String str) {
        return this.LLILZIL.LIZIZ(str);
    }

    public final void LJFF(C0JO7 c0jo7) {
        Video video = c0jo7.getPlayerChannel().LIZ;
        this.LL = c0jo7;
        c0jo7.setPlayer(this);
        TextureView textureView = c0jo7.getTextureView();
        if (textureView != null) {
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (textureView != null && textureView.isAvailable() && surfaceTexture != null && (Build.VERSION.SDK_INT < 26 || !surfaceTexture.isReleased())) {
                LJI(surfaceTexture, c0jo7, video, 0, true);
                return;
            }
        }
        TextureView textureView2 = c0jo7.getTextureView();
        if (textureView2 != null) {
            textureView2.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC490800JMo(this, c0jo7, video));
        }
    }

    @Override // X.C0JNK
    public final void LJJLIIIIJ(String str) {
        C0N0Y c0n0yLIZLLL = LIZLLL(str);
        if (c0n0yLIZLLL != null) {
            C490750JMj.LJ(c0n0yLIZLLL, this.LLILZ, new C490830JMr(null));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
    public final void onPreRenderReady(String str) {
        C490850JMt.LIZ(this, str);
    }

    @Override // X.C0JNK
    public final void pause(String str) {
        C0N0Y c0n0yLIZLLL = LIZLLL(str);
        if (c0n0yLIZLLL != null) {
            C490750JMj.LJ(c0n0yLIZLLL, this.LLILZ, new C490820JMq(null));
        }
    }

    @Override // X.C0JNK
    public final void LIZ(float f, String str) {
        C0N0Y c0n0yLIZLLL = LIZLLL(str);
        if (c0n0yLIZLLL != null) {
            C490750JMj.LJ(c0n0yLIZLLL, this.LLILZ, new C459001qW(f, null));
        }
    }

    public final void LJI(SurfaceTexture surfaceTexture, C0JO7 c0jo7, Video video, int i, boolean z) {
        C0N0Y c0n0yLIZLLL = LIZLLL(c0jo7.getCurrentSourceID());
        boolean z2 = c0jo7.LLILZIL.LIZIZ.LIZ.LIZ;
        if (c0n0yLIZLLL != null) {
            C490750JMj.LJ(c0n0yLIZLLL, this.LLILZ, new C0JNW(z, c0jo7, surfaceTexture, this, video, z2, i, null));
        }
    }
}
