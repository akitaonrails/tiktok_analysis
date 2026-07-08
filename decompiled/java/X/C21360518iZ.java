package X;

import X.C1C7U;
import X.C21356918hz;
import X.C21360518iZ;
import X.InterfaceC21360618ia;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerManager$initHandler$1;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerManager$initHandler$2;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18iZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21360518iZ {
    public final InterfaceC21360418iY LIZ;
    public final Context LIZIZ;
    public final int LIZJ;
    public final C21356918hz LIZLLL;
    public final boolean LJ;
    public UploadPicStickerManager$initHandler$1 LJFF;
    public final HandlerThread LJI;
    public UploadPicStickerManager$initHandler$2 LJII;
    public InterfaceC21360618ia LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public final C21525019Ls LJIIJJI;

    public final void LIZ() {
        this.LJI.quitSafely();
        UploadPicStickerManager$initHandler$2 uploadPicStickerManager$initHandler$2 = this.LJII;
        if (uploadPicStickerManager$initHandler$2 != null) {
            uploadPicStickerManager$initHandler$2.removeCallbacksAndMessages(null);
        }
    }

    public final void LIZIZ() {
        UploadPicStickerManager$initHandler$1 uploadPicStickerManager$initHandler$1 = this.LJFF;
        if (uploadPicStickerManager$initHandler$1 == null) {
            uploadPicStickerManager$initHandler$1 = null;
        }
        C786410Ut5.LJLILLLLZI(uploadPicStickerManager$initHandler$1, 1001);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerManager$initHandler$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerManager$initHandler$2] */
    public C21360518iZ(InterfaceC21360418iY interfaceC21360418iY, Context context, int i, C21356918hz c21356918hz, boolean z) {
        this.LIZ = interfaceC21360418iY;
        this.LIZIZ = context;
        this.LIZJ = i;
        this.LIZLLL = c21356918hz;
        this.LJ = z;
        HandlerThread handlerThread = new HandlerThread("pixaloop_work");
        this.LJI = handlerThread;
        new C21525019Ls(this, 0);
        this.LJIIJJI = new C21525019Ls(this, 1);
        handlerThread.start();
        final Looper looperW2 = C786410Ut5.W2(handlerThread);
        this.LJFF = new BPEAHandler(looperW2) { // from class: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerManager$initHandler$1
            /* JADX WARN: Removed duplicated region for block: B:117:0x009b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x00c9 A[SYNTHETIC] */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void handleMessage(android.os.Message r26) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 328
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerManager$initHandler$1.handleMessage(android.os.Message):void");
            }
        };
        this.LJII = new BPEAHandler(Looper.getMainLooper()) { // from class: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerManager$initHandler$2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                InterfaceC21360618ia interfaceC21360618ia;
                C1C7U.LIZ("UploadPicStickerManager@2a59.initHandler$2");
                int i2 = message.what;
                if (i2 != 1001) {
                    if (i2 == 1002) {
                        C21356918hz c21356918hz2 = (C21356918hz) HandlerHook.getMessageObj(message.obj);
                        C21360518iZ c21360518iZ = this.LL;
                        String str = c21360518iZ.LJIIIZ;
                        if (str != null && Intrinsics.LJFF(str, c21356918hz2.LIZLLL)) {
                            InterfaceC21360618ia interfaceC21360618ia2 = c21360518iZ.LJIIIIZZ;
                            if (interfaceC21360618ia2 != null) {
                                interfaceC21360618ia2.LIZJ(c21356918hz2);
                            }
                            if (!TextUtils.isEmpty(c21356918hz2.LIZIZ) && Intrinsics.LJFF(c21356918hz2.LIZIZ, c21360518iZ.LJIIJ) && (interfaceC21360618ia = c21360518iZ.LJIIIIZZ) != null) {
                                interfaceC21360618ia.LIZLLL();
                            }
                        }
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (HandlerHook.getMessageObj(message.obj) != null) {
                        arrayList = (ArrayList) HandlerHook.getMessageObj(message.obj);
                    }
                    InterfaceC21360618ia interfaceC21360618ia3 = this.LL.LJIIIIZZ;
                    if (interfaceC21360618ia3 != null) {
                        interfaceC21360618ia3.LIZIZ(arrayList);
                    }
                }
                C1C7U.LIZIZ("UploadPicStickerManager@2a59.initHandler$2");
            }
        };
    }
}
