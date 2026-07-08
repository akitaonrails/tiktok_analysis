package X;

import android.util.Size;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.0KqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529850KqF implements InterfaceC529880KqI {
    public final InterfaceC529880KqI LIZ;
    public final InterfaceC529880KqI LIZIZ;

    public C529850KqF(C530920Kry c530920Kry, C531260KsW c531260KsW) {
        this.LIZ = c530920Kry;
        this.LIZIZ = c531260KsW;
    }

    @Override // X.InterfaceC529880KqI
    public final void LIZ(final C529750Kq5 c529750Kq5, final Size size, final TikTokMediaModel tikTokMediaModel, final InterfaceC529900KqK interfaceC529900KqK, final boolean z) {
        this.LIZ.LIZ(c529750Kq5, size, tikTokMediaModel, new InterfaceC529900KqK() { // from class: X.0KqG
            @Override // X.InterfaceC529900KqK
            public final void LIZ() {
                interfaceC529900KqK.LIZ();
            }

            @Override // X.InterfaceC529900KqK
            public final void LIZIZ() {
                interfaceC529900KqK.LIZIZ();
            }

            @Override // X.InterfaceC529900KqK
            public final void onFailure(Throwable th) {
                C201955140j.LJIIIZ(C533790Kwb.LIZIZ, "MediaLoader", "load thumbnail failed, use fallback loader", th);
                this.LIZIZ.LIZ(c529750Kq5, size, tikTokMediaModel, interfaceC529900KqK, z);
            }
        }, z);
    }
}
