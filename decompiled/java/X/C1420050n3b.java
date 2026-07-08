package X;

import Y.ARunnableS122S0100000_22;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.INLEAsyncRenderPlayStatusListener;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener;
import com.bytedance.ies.nle.editor_jni.NLEResourceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0n3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420050n3b {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIJ;
    public final C1DRG LIZ;
    public final C1664750tQH LIZIZ;
    public final MutableLiveData<Boolean> LIZJ;
    public final MutableLiveData LIZLLL;
    public final AtomicLong LJ;
    public final AtomicInteger LJFF;
    public final AtomicInteger LJI;
    public final AtomicInteger LJII;
    public final AtomicLong LJIIIIZZ;
    public final AtomicLong LJIIIZ;
    public final AtomicBoolean LJIIJ;
    public final BPEAHandler LJIIJJI;
    public final ConcurrentHashMap<String, String> LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final ARunnableS122S0100000_22 LJIILL;
    public INLEPlayer LJIILLIIL;
    public final C01GW LJIIZILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1420050n3b.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LJIJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C1420050n3b(C1DRG c1drg) {
        this.LIZ = c1drg;
        this.LIZIZ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(null);
        this.LIZJ = mutableLiveData;
        this.LIZLLL = mutableLiveData;
        this.LJ = new AtomicLong();
        this.LJFF = new AtomicInteger();
        this.LJI = new AtomicInteger();
        this.LJII = new AtomicInteger();
        this.LJIIIIZZ = new AtomicLong();
        this.LJIIIZ = new AtomicLong();
        this.LJIIJ = new AtomicBoolean();
        this.LJIIJJI = new BPEAHandler(Looper.getMainLooper());
        this.LJIIL = new ConcurrentHashMap<>();
        this.LJIILIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 243));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 242));
        this.LJIILL = new ARunnableS122S0100000_22(this, 28);
        this.LJIIZILJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 244));
    }

    public final void LIZ(INLEPlayer iNLEPlayer) {
        if (iNLEPlayer != null) {
            iNLEPlayer.setResourceManager((NLEResourceManager) this.LJIIZILJ.getValue());
            iNLEPlayer.setAsyncRenderPlayStatusListener((INLEAsyncRenderPlayStatusListener) this.LJIILJJIL.getValue());
            iNLEPlayer.addNLEResourceDownloadListener((INLEResourceDownloadStatusListener) this.LJIILIIL.getValue());
        }
        this.LJIILLIIL = iNLEPlayer;
    }

    public final void LIZIZ(String str) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncRenderService ASYNC_RENDER: templateType=");
        sbLIZ.append(((VideoPublishEditModel) this.LIZIZ.getValue(this, LJIJ[0])).creativeModel.autoCutModel.curTemplateType);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
    }
}
