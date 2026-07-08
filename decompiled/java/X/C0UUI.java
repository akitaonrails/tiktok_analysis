package X;

import android.content.Context;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UUI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UUI extends SurfaceView implements InterfaceC923870a9J, InterfaceC923890a9L {
    public final C0UUH LL;

    @Override // X.InterfaceC923870a9J
    public final /* synthetic */ void LIZ(String str, String str2) {
    }

    @Override // X.InterfaceC923890a9L
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.InterfaceC923870a9J
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIILLIIL() {
    }

    public void setDataChannel(DataChannel dataChannel) {
    }

    public /* bridge */ /* synthetic */ void setLinkMicLiveEffectCallback(InterfaceC924050a9b interfaceC924050a9b) {
    }

    public /* bridge */ /* synthetic */ void setStreamCallback(InterfaceC774920UaY interfaceC774920UaY) {
    }

    @Override // X.InterfaceC923870a9J
    public final boolean LJFF() {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            return c0uuh.LLILZLL;
        }
        return true;
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIJJI() {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LJII(false);
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIL() {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LJIIL();
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIILJJIL() {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LJII(true);
        }
    }

    @Override // X.InterfaceC923870a9J
    public Object getAttachedComposerManager() {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            return c0uuh.LLJJ;
        }
        return null;
    }

    @Override // X.InterfaceC923870a9J
    public C0UH6 getEffectWrapperProxy() {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            return c0uuh.getEffectWrapperProxy();
        }
        return null;
    }

    @Override // X.InterfaceC923870a9J
    public InterfaceC769940UIe getLiveStream() {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            return c0uuh.LLIZLLLIL;
        }
        return null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        C1273890jFr c1273890jFr;
        super.onAttachedToWindow();
        C0UUH c0uuh = this.LL;
        if (c0uuh == null || (c1273890jFr = c0uuh.LLIZLLLIL) == null) {
            return;
        }
        c1273890jFr.J3(CertProviderManagerKt.findCert("bpea-multiguest_livestream_resume_inpreview_panel", 1476788234), false);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        C11JF c11jf;
        super.onDetachedFromWindow();
        C0UUH c0uuh = this.LL;
        if (c0uuh == null || !c0uuh.LLJILLL) {
            return;
        }
        if (!c0uuh.LLILZIL) {
            InterfaceC769000UEo interfaceC769000UEo = c0uuh.LLJJ;
            if (interfaceC769000UEo != null) {
                if (interfaceC769000UEo instanceof InterfaceC932350aMz) {
                    interfaceC769000UEo.release();
                }
                InterfaceC769000UEo interfaceC769000UEo2 = c0uuh.LLJJ;
                if (interfaceC769000UEo2 instanceof C0U78) {
                    ((C0U78) interfaceC769000UEo2).LJIIL();
                }
            }
            C0UHA c0uha = c0uuh.LLIZ;
            if (c0uha != null) {
                c0uha.LJIIZILJ(CertProviderManagerKt.findCert("bpea-multiguest_destory_linkmic_preview", 1476788483));
            }
            C1273890jFr c1273890jFr = c0uuh.LLIZLLLIL;
            if (c1273890jFr != null) {
                c1273890jFr.LJIILL(CertProviderManagerKt.findCert("bpea-live_stream_pause_in_linkmic_preview", 1476788483));
                C1273890jFr c1273890jFr2 = c0uuh.LLIZLLLIL;
                if (c1273890jFr2 != null) {
                    c1273890jFr2.release(CertProviderManagerKt.findCert("bpea-livestream_release_in_linkmic_preview", 1476788483));
                }
            }
            C2247601Cy6 c2247601Cy6 = c0uuh.LLJJI;
            if (c2247601Cy6 != null) {
                c2247601Cy6.LIZLLL();
            }
            c0uuh.LLILZLL = true;
        }
        if (c0uuh.LLILZIL || (c11jf = c0uuh.LLJIJIL) == null) {
            return;
        }
        c11jf.dispose();
    }

    @Override // X.InterfaceC923890a9L
    public final Boolean LIZJ() {
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC923870a9J
    public final void LJ(Cert cert) {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LJ(cert);
        }
    }

    @Override // X.InterfaceC923870a9J
    public final void LJI(boolean z) {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LJI(z);
        }
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIIIZ(C936050aSx c936050aSx) {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LJIIIZ(c936050aSx);
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIILL(Cert cert) {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LJIILL(cert);
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIZILJ(Cert cert) {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LJIIZILJ(cert);
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void release(Cert cert) {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.release(cert);
        }
    }

    public void setCurrentLayoutParam(ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public void setReleaseMode(boolean z) {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LLJILLL = z;
        }
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIIIZZ(Cert cert, boolean z) {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LJIIIIZZ(cert, z);
        }
    }

    @Override // X.InterfaceC923870a9J
    public final void LJIILIIL(Cert cert, boolean z) {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LJIILIIL(cert, z);
        }
    }

    public C0UUI(Context context, C758340Tou c758340Tou, Object obj) {
        super(context, null);
        this.LL = new C0UUH(context, this, c758340Tou, obj);
    }

    @Override // X.InterfaceC923890a9L
    public final void LJIIJ(int i, int i2, int i3) {
        C0UUH c0uuh = this.LL;
        if (c0uuh != null) {
            c0uuh.LJIIJ(i, i2, i3);
        }
    }
}
