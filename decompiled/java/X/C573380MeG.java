package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic;
import com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0MeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573380MeG {
    public final C573060Mdk LIZ;
    public final WeakReference<Activity> LIZIZ;
    public final InterfaceC573490MeR LIZJ;
    public final InterfaceC573480MeQ LIZLLL;
    public final List<String> LJ;
    public final String LJFF;
    public InterfaceC1635410sex LJI;
    public final String LJII;
    public final MusicModel LJIIIIZZ;
    public final WeakReference<IPreDownloadMusic> LJIIIZ;
    public String LJIIJ;
    public MusicModel LJIIJJI;
    public boolean LJIIL;
    public IPhotoPreDownloadMusic LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public Map<String, ? extends Object> LJIILLIIL;

    public /* synthetic */ C573380MeG(C573060Mdk c573060Mdk, WeakReference weakReference, InterfaceC573490MeR interfaceC573490MeR, InterfaceC573480MeQ interfaceC573480MeQ, List list, String str, int i) {
        this(c573060Mdk, (i & 2) != 0 ? null : weakReference, (i & 4) != 0 ? null : interfaceC573490MeR, (i & 8) != 0 ? null : interfaceC573480MeQ, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str, null, null, null, null);
    }

    public C573380MeG(C573060Mdk c573060Mdk, WeakReference<Activity> weakReference, InterfaceC573490MeR interfaceC573490MeR, InterfaceC573480MeQ interfaceC573480MeQ, List<String> list, String str, InterfaceC1635410sex interfaceC1635410sex, String str2, MusicModel musicModel, WeakReference<IPreDownloadMusic> weakReference2) {
        this.LIZ = c573060Mdk;
        this.LIZIZ = weakReference;
        this.LIZJ = interfaceC573490MeR;
        this.LIZLLL = interfaceC573480MeQ;
        this.LJ = list;
        this.LJFF = str;
        this.LJI = interfaceC1635410sex;
        this.LJII = str2;
        this.LJIIIIZZ = musicModel;
        this.LJIIIZ = weakReference2;
        this.LJIIL = true;
    }
}
