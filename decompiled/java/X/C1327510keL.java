package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0keL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327510keL implements InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> {
    public final Executor LIZ;
    public final ContentResolver LIZIZ;

    public C1327510keL(Executor executor, ContentResolver contentResolver) {
        this.LIZ = executor;
        this.LIZIZ = contentResolver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0keK, java.lang.Runnable] */
    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(final InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        final InterfaceC1325690kbP interfaceC1325690kbPLIZ = interfaceC1327930kf1.LIZ();
        final String id = interfaceC1327930kf1.getId();
        final C1325710kbR c1325710kbRLJFF = interfaceC1327930kf1.LJFF();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        final ?? r1 = new AbstractC1327520keM<C1323050kX9<AbstractC1327750kej>>(interfaceC1328020kfA, interfaceC1325690kbPLIZ, id) { // from class: X.0keK
            @Override // X.AbstractRunnableC2124508Tz
            public final Object LIZJ() throws IOException {
                int i;
                ContentResolver contentResolver = this.LLJI.LIZIZ;
                Uri uri = c1325710kbRLJFF.LIZIZ;
                C1324630kZh c1324630kZh = c1325710kbRLJFF.LJIIJJI;
                int i2 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                if (c1324630kZh != null) {
                    i = c1324630kZh.LIZ;
                    i2 = c1324630kZh.LIZIZ;
                } else {
                    i = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                }
                Bitmap bitmapLoadThumbnail = contentResolver.loadThumbnail(uri, new Size(i, i2), cancellationSignal);
                if (bitmapLoadThumbnail == null) {
                    return null;
                }
                return C1323050kX9.LJIJJLI(new C1325120kaU(bitmapLoadThumbnail, C530820Kro.LIZIZ(), C1328060kfE.LIZLLL, 0));
            }

            @Override // X.AbstractC1327520keM, X.AbstractRunnableC2124508Tz
            public final void LIZLLL() {
                super.LIZLLL();
                cancellationSignal.cancel();
            }

            @Override // X.AbstractRunnableC2124508Tz
            public final void LIZIZ(Object obj) {
                C1323050kX9.LJII((C1323050kX9) obj);
            }

            @Override // X.AbstractC1327520keM, X.AbstractRunnableC2124508Tz
            public final void LJ(Exception exc) {
                super.LJ(exc);
                interfaceC1325690kbPLIZ.LJIIIZ(id, "LocalThumbnailBitmapProducer", false);
            }

            @Override // X.AbstractC1327520keM, X.AbstractRunnableC2124508Tz
            public final void LJFF(Object obj) {
                boolean z;
                super.LJFF(obj);
                InterfaceC1325690kbP interfaceC1325690kbP = interfaceC1325690kbPLIZ;
                String str = id;
                if (obj != null) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC1325690kbP.LJIIIZ(str, "LocalThumbnailBitmapProducer", z);
            }

            @Override // X.AbstractC1327520keM
            public final Map LJIIIIZZ(C1323050kX9<AbstractC1327750kej> c1323050kX9) {
                boolean z;
                if (c1323050kX9 != null) {
                    z = true;
                } else {
                    z = false;
                }
                return C19871212ow.of("createdThumbnail", String.valueOf(z));
            }
        };
        interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0keO
            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                r1.LIZ();
            }
        });
        this.LIZ.execute(r1);
    }
}
