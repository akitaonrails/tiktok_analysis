package X;

import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import dmt.av.video.VEPreviewParams;

/* JADX INFO: renamed from: X.0nco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1441880nco {
    public Context LIZ;
    public LifecycleOwner LIZIZ;
    public SurfaceView LIZJ;
    public LiveData<VEPreviewParams> LIZLLL;
    public LiveData<C1452730nuJ> LJ;
    public InterfaceC1452170ntP LJFF;
    public boolean LJII;
    public final AbstractC1452680nuE LJIIIZ;
    public final boolean LJIIJ;
    public boolean LJIIJJI;
    public final MutableLiveData<Integer> LJI = new MutableLiveData<>();
    public final MutableLiveData<Void> LJIIIIZZ = new MutableLiveData<>();

    public C1441880nco(int i, boolean z, int i2) {
        this.LJIIJ = z;
        C1441900ncq c1441900ncq = new C1441900ncq();
        EnumC1441790ncf.Companion.getClass();
        c1441900ncq.LJIIJ = C1441800ncg.LIZ(i);
        EnumC1441860ncm.Companion.getClass();
        c1441900ncq.LJIIJJI = C1441870ncn.LIZ(i2);
        if ("AiChatExtractFramesScene".equals("MvSaveLocalCompile")) {
            c1441900ncq.LIZIZ = "MvSaveLocalCompile";
        } else {
            c1441900ncq.LIZIZ = "VEVideoPublishEditPresenter";
        }
        c1441900ncq.LJI = true;
        c1441900ncq.LIZJ = z;
        this.LJIIIZ = C574110MfR.LIZ(0, c1441900ncq);
    }
}
