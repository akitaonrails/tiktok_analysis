package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0nyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455220nyK {
    public final /* synthetic */ InterfaceC1455230nyL LIZ;

    public C1455220nyK(InterfaceC1455230nyL interfaceC1455230nyL) {
        this.LIZ = interfaceC1455230nyL;
    }

    public final C1455220nyK LIZ(List list) {
        C1456590o0X c1456590o0X = C1456590o0X.LIZIZ;
        InterfaceC1455230nyL interfaceC1455230nyL = this.LIZ;
        c1456590o0X.getClass();
        if (!C1256140inE.LIZ(list) && list != null) {
            final String str = (String) ListProtector.get(list, 0);
            if (TextUtils.isEmpty(str)) {
                InterfaceC1455240nyM interfaceC1455240nyM = c1456590o0X.LIZ;
                if (interfaceC1455240nyM != null) {
                    interfaceC1455240nyM.LIZ(null, false);
                }
            } else {
                C15O7.LIZJ(new Callable() { // from class: X.066r
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("MvMusicManager@4ac0.getMusicDetail$1");
                        Music musicLJII = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJII(str);
                        C1C7U.LIZIZ("MvMusicManager@4ac0.getMusicDetail$1");
                        return musicLJII;
                    }
                }).LJ(new C1466860oH6(interfaceC1455230nyL, c1456590o0X, 17), C15O7.LJIIIIZZ, null);
                return this;
            }
        } else {
            InterfaceC1455240nyM interfaceC1455240nyM2 = c1456590o0X.LIZ;
            if (interfaceC1455240nyM2 != null) {
                interfaceC1455240nyM2.LIZ(null, false);
                return this;
            }
        }
        return this;
    }

    public final C1455220nyK LIZIZ(final C1454880nxm c1454880nxm) {
        C1456590o0X.LIZIZ.LIZ = new InterfaceC1455240nyM() { // from class: X.0nyJ
            @Override // X.InterfaceC1455240nyM
            public final void LIZ(MusicModel musicModel, boolean z) {
                c1454880nxm.LIZ(new C15KP().apply(musicModel), z);
            }
        };
        return this;
    }
}
