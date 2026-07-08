package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.abtest.AlbumSelectionRestoreConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Khq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524640Khq implements InterfaceC530040KqY {
    @Override // X.InterfaceC530040KqY
    public final boolean LIZ() {
        return Intrinsics.LJFF(((AlbumSelectionRestoreConfig) C524670Kht.LIZIZ.getValue()).enable, Boolean.TRUE);
    }

    @Override // X.InterfaceC530040KqY
    public final void LIZIZ(C19EG c19eg, C1DRG c1drg, Intent intent) {
        List parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = C13BV.INSTANCE;
        }
        if (intent.getParcelableExtra("key_short_video_context") == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("key_skip_c2pa_read_task", false);
        if (((IPoiVideoPublishService) ServiceManager.get().getService(IPoiService.class)).enableReadLocationMetaData()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C540060LGa c540060LGa = C540060LGa.LIZ;
            WeakReference weakReference = new WeakReference(c19eg);
            C524630Khp c524630Khp = new C524630Khp(jCurrentTimeMillis, c19eg, booleanExtra, intent, c1drg);
            c540060LGa.getClass();
            C540060LGa.LIZIZ(parcelableArrayListExtra, weakReference, c524630Khp);
            return;
        }
        LIZJ(c19eg, booleanExtra, intent, c1drg, 11, 0L, 0L, 1, -1);
    }

    public static final void LIZJ(C19EG c19eg, boolean z, Intent intent, C1DRG c1drg, int i, long j, long j2, int i2, int i3) {
        long j3;
        C2471909mP.LIZ.getClass();
        C2471909mP.LJJIJIIJIL(true);
        if (C298100BmK.LIZ()) {
            j3 = 15000;
        } else {
            j3 = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        ExecutorC527170Klv.LLILLJJLI.LIZ(j3, new Runnable() { // from class: X.09mw
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MediaChooseServiceImpl@e6e.handleMediaChooseResult$onChosenResult$1");
                try {
                    C2471909mP.LIZ.getClass();
                    if (C2471909mP.LJIIZILJ) {
                        C2471909mP.LJJIJIIJIL(false);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MediaChooseServiceImpl@e6e.handleMediaChooseResult$onChosenResult$1");
            }
        });
        C345210Dg7 c345210Dg7LIZIZ = C345220Dg8.LIZIZ();
        c345210Dg7LIZIZ.LIZ(new C526700KlA(c19eg, false));
        if (!z) {
            c345210Dg7LIZIZ.LIZ(new C535450KzH());
        }
        C345210Dg7.LIZLLL(c345210Dg7LIZIZ, intent, new C524620Kho(c19eg, c1drg, i, j, j2, i2, i3, intent));
    }
}
