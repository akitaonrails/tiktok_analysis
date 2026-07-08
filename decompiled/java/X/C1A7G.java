package X;

import android.content.Context;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.1A7G, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1A7G extends TextureView implements C0IF5, InterfaceC1090410eTv {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public DataChannel LLILZIL;
    public C1090400eTu LLILZLL;
    public C1A7N LLIZ;
    public int LLIZLLLIL;

    @Override // X.InterfaceC464060IHs
    public final void LIZIZ() {
        this.LL = 0;
        this.LLILLJJLI = 0;
        this.LLIZ = null;
        if (getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
    }

    public /* bridge */ /* synthetic */ void setRoomID(Long l) {
    }

    public /* bridge */ /* synthetic */ void setVisibilityChangeListener(C1A7H c1a7h) {
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLIZLLLIL++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        if (this.LLILZLL == null) {
            this.LLILZLL = new C1090400eTu();
        }
        return this.LLILZLL;
    }

    @Override // X.InterfaceC464060IHs
    public final void reset() {
        C827750WdZ.LIZ("RenderView", "TextureView:reset");
        this.LL = 0;
        this.LLILLJJLI = 0;
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC464060IHs
    public int getStreamHeight() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC464060IHs
    public int getStreamWidth() {
        return this.LL;
    }

    public int getTextureLayout() {
        return this.LLILLL;
    }

    public C1A7G(Context context) {
        super(context);
        this.LLILLL = 2;
        this.LLILZ = 1.7777778f;
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // X.C0IF5
    public void setDataChannel(DataChannel dataChannel) {
        this.LLILZIL = dataChannel;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    @Override // X.InterfaceC464060IHs
    public void setScaleType(int i) {
        LIZJ(i, "");
    }

    @Override // X.C0IF5
    public void setSmoothEnterHandler(C1A7N c1a7n) {
        this.LLIZ = c1a7n;
    }

    @Override // X.InterfaceC464060IHs
    public void setTargetScaleResolution(float f) {
        this.LLILZ = f;
    }

    public C1A7G(Context context, int i) {
        super(context, null, 0);
        this.LLILLL = 2;
        this.LLILZ = 1.7777778f;
    }

    @Override // X.InterfaceC464060IHs
    public final void LIZJ(int i, String str) {
        this.LLILLL = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextureView:setScaleType :");
        sbLIZ.append(i);
        C827750WdZ.LIZ("RenderView", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r0 > r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (r0 > r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        r1 = (r5 * 1.0f) / r2;
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
    
        r5 = r0;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A7G.onMeasure(int, int):void");
    }

    @Override // X.InterfaceC464060IHs
    public final void setVideoSize(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextureView:setVideoSize width:");
        sbLIZ.append(i);
        sbLIZ.append(" height:");
        sbLIZ.append(i2);
        C827750WdZ.LIZ("RenderView", C2188811AlT.LIZIZ(sbLIZ));
        if (i > 0 && i2 > 0) {
            this.LL = i;
            this.LLILLJJLI = i2;
            requestLayout();
        }
    }
}
