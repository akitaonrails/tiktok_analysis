package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565960MHq extends AbstractC2255721DQs<C0MEE> implements C0MEE, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final C0MEE LLILLL = this;
    public final MutableLiveData<SingleImageData> LLILZ = new MutableLiveData<>();
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 572));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C565960MHq.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = 8;
    }

    private final InterfaceC484050IyZ Z1() {
        return (InterfaceC484050IyZ) this.LLILZLL.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLIZ[0]);
    }

    private final InterfaceC524950KiL W1() {
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) getDiContainer().LJIIL(null, InterfaceC524950KiL.class);
        return interfaceC524950KiL == null ? C0MWZ.LIZ(this.LLILLJJLI) : interfaceC524950KiL;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC524950KiL interfaceC524950KiLW1 = W1();
        if (interfaceC524950KiLW1 != null) {
            interfaceC524950KiLW1.Qh(Z1());
        }
    }

    public C0MEE X1() {
        return this.LLILLL;
    }

    @Override // X.C0MEE
    public LiveData<SingleImageData> Y() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SingleImageData o2(MediaModel mediaModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getEditModel().getCreationId());
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SrcImageInfo srcImageInfo = new SrcImageInfo(mediaModel.LJFF(), mediaModel.height, mediaModel.width, null, null, 24, null);
        EditImageInfo editImageInfo = new EditImageInfo(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2097151, 0 == true ? 1 : 0);
        editImageInfo.setFullScreen(C1450870nrJ.LJIIJ(mediaModel.width / mediaModel.height));
        int i = mediaModel.width;
        int i2 = mediaModel.height;
        long j = mediaModel.duration;
        return new SingleImageData(strLIZIZ, mediaModel.id, srcImageInfo, null, editImageInfo, null, null, null, null, null, null, 0, mediaModel.aigcInfo, new ImportVideoInfo(i, i2, 0, 0, null, j, j, null, null, 0, 0.0f, mediaModel.LJFF(), mediaModel.LJFF(), false, null, mediaModel.aigcInfo, 0L, 92060, null), null, null, false, null, null, null, null, null, false, 8376288, null);
    }

    public C565960MHq(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
    }
}
