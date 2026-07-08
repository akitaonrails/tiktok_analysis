package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS146S1100000_32;
import njp.a;

/* JADX INFO: renamed from: X.18XY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.entry.guide.AiChatGuideDialogScene$showGuideVideo$2", f = "AiChatGuideDialogScene.kt", l = {}, m = "invokeSuspend")
public final class C18XY extends C09AX implements Function2<InterfaceC1157570gEF<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C18XX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18XY(C18XX c18xx, InterfaceC1364105Vn<? super C18XY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c18xx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C18XY c18xy = new C18XY(this.LLILLJJLI, interfaceC1364105Vn);
        c18xy.LL = obj;
        return c18xy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SurfaceTexture surfaceTexture;
        C1C7U.LIZ("AiChatGuideDialogScene@f163.showGuideVideo$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1157570gEF interfaceC1157570gEF = (InterfaceC1157570gEF) this.LL;
        if (interfaceC1157570gEF instanceof C1157450gE3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloaded: ");
            sbLIZ.append(interfaceC1157570gEF);
            C21290818Tq.LIZ("AiChatGuideDialogScene", C2188811AlT.LIZIZ(sbLIZ));
            C18XX c18xx = this.LLILLJJLI;
            String str = (String) ((C1157450gE3) interfaceC1157570gEF).LIZ;
            c18xx.getClass();
            C21290818Tq.LIZ("AiChatGuideDialogScene", "initPlayer");
            final AwS146S1100000_32 awS146S1100000_32 = new AwS146S1100000_32(c18xx, str, 11);
            TextureView textureViewLLLIIIIL = c18xx.LLLIIIIL();
            if (textureViewLLLIIIIL != null && (surfaceTexture = textureViewLLLIIIIL.getSurfaceTexture()) != null) {
                C21290818Tq.LIZ("AiChatGuideDialogScene", "initPlayer: surface texture already available");
                awS146S1100000_32.invoke(surfaceTexture);
            } else {
                C21290818Tq.LIZ("AiChatGuideDialogScene", "initPlayer: surface texture not available, set listener");
                TextureView textureViewLLLIIIIL2 = c18xx.LLLIIIIL();
                if (textureViewLLLIIIIL2 != null) {
                    textureViewLLLIIIIL2.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.18XZ
                        @Override // android.view.TextureView.SurfaceTextureListener
                        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture2) {
                            return true;
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture2, int i, int i2) {
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture2) {
                        }

                        @Override // android.view.TextureView.SurfaceTextureListener
                        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture2, int i, int i2) {
                            C21290818Tq.LIZ("AiChatGuideDialogScene", "onSurfaceTextureAvailable");
                            awS146S1100000_32.invoke(surfaceTexture2);
                        }
                    });
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatGuideDialogScene@f163.showGuideVideo$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1157570gEF<? extends String> interfaceC1157570gEF, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1157570gEF, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
