package X;

import Y.AObjectS246S0100000_25;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import java.util.List;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0syw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1647800syw extends AbstractC2255721DQs<InterfaceC1654370t9X> implements InterfaceC1654370t9X, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public BaseStickerModel LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647520syU.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public boolean LLIZ = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647800syw.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1647800syw.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/aweme/infinisticker/RecordInfiniStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1647800syw.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public InterfaceC1654370t9X W1() {
        return this;
    }

    private final InterfaceC1647520syU getInfiniStickerApi() {
        return (InterfaceC1647520syU) this.LLILLL.getValue(this, LLJILJIL[1]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZ.getValue(this, LLJILJIL[2]);
    }

    @Override // X.InterfaceC1654370t9X
    public void b6() {
        MusicStickerModel musicStickerModel;
        BaseStickerModel baseStickerModel;
        if (this.LLILZLL) {
            StickerModel stickerModelPX1 = pX1();
            if (!(stickerModelPX1 instanceof MusicStickerModel) || (musicStickerModel = (MusicStickerModel) stickerModelPX1) == null || (baseStickerModel = this.LLILZIL) == null) {
                return;
            }
            this.LLILZLL = false;
            InterfaceC1647520syU infiniStickerApi = getInfiniStickerApi();
            if (infiniStickerApi != null) {
                infiniStickerApi.J4(musicStickerModel.copy(BaseStickerModel.copy$default(musicStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, baseStickerModel.getCenterX(), baseStickerModel.getCenterY(), 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModel.getTranslateX(), baseStickerModel.getTranslateY(), baseStickerModel.getScale(), baseStickerModel.getRotation(), 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31457377, 15, null), musicStickerModel.visible, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom));
            }
        }
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLJJLI.getValue(this, LLJILJIL[0]);
    }

    @Override // X.InterfaceC1654370t9X
    public void lQ() {
        MusicStickerModel musicStickerModel;
        StickerModel stickerModelPX1 = pX1();
        if (!(stickerModelPX1 instanceof MusicStickerModel) || (musicStickerModel = (MusicStickerModel) stickerModelPX1) == null) {
            return;
        }
        MusicStickerModel musicStickerModelLIZ = C1443950ng9.LIZ(getShortVideoContext().creativeModel, musicStickerModel.getStickerStyle(), null);
        if (musicStickerModelLIZ == null) {
            mm0();
            return;
        }
        if (!Intrinsics.LJFF(musicStickerModel.getMusicId(), musicStickerModelLIZ.getMusicId())) {
            C860620XpU.LIZ(getShortVideoContext());
        }
        Zu(musicStickerModel.copy(musicStickerModel.baseStickerModel, musicStickerModel.visible, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModelLIZ.getMusicId(), musicStickerModelLIZ.getArtistName(), musicStickerModelLIZ.getTitle(), musicStickerModelLIZ.getCover(), musicStickerModelLIZ.isPGC(), musicStickerModelLIZ.getStickerStyle(), musicStickerModel.musicStickerFrom));
    }

    @Override // X.InterfaceC1654370t9X
    public void mm0() {
        StickerModel stickerModelPX1 = pX1();
        if (stickerModelPX1 == null) {
            return;
        }
        InterfaceC1647520syU infiniStickerApi = getInfiniStickerApi();
        if (infiniStickerApi != null) {
            infiniStickerApi.L2(stickerModelPX1.getId());
        }
        this.LLILZIL = null;
        this.LLILZLL = false;
    }

    public final void o2() {
        C860620XpU.LIZIZ(getShortVideoContext(), Boolean.valueOf(this.LLJ), Boolean.valueOf(this.LLIZLLLIL), Boolean.valueOf(this.LLJI), Boolean.valueOf(this.LLJIJIL));
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJI = false;
        this.LLJIJIL = false;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getShortVideoContext().cameraComponentModel.isRetakeMode || getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
            return;
        }
        if (getDiContainer().LIZJ(InterfaceC1647520syU.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1647520syU.class, new AwS604S0100000_25(this, 106));
        }
        getRecordControlApi().lC2().LIZ(this, new AObjectS246S0100000_25(this, 125));
        getRecordControlApi().Vt0().LIZ(this, new AObjectS246S0100000_25(this, 126));
        getRecordControlApi().xk1().LIZ(this, new AObjectS246S0100000_25(this, 127));
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        Bu((getShortVideoContext().cameraComponentModel.isRetakeMode || getShortVideoContext().cameraComponentModel.isEditorProRecordMode || !this.LLIZ) ? false : true);
    }

    public final StickerModel pX1() {
        List<StickerModel> listLLLILZLLLI;
        InterfaceC1647520syU infiniStickerApi = getInfiniStickerApi();
        if (infiniStickerApi == null || (listLLLILZLLLI = infiniStickerApi.LLLILZLLLI(EnumC1466150oFx.MUSIC_STICKER)) == null) {
            return null;
        }
        return (StickerModel) C13LP.LJJJLZIJ(0, listLLLILZLLLI);
    }

    public final boolean X1() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1647800syw(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1654370t9X
    public void Bu(boolean z) {
        InterfaceC1647520syU infiniStickerApi;
        List<C0FTJ<StickerModel>> listLLLLLZ;
        InterfaceC1647520syU infiniStickerApi2;
        if ((!z || (!getShortVideoContext().cameraComponentModel.isRetakeMode && !getShortVideoContext().cameraComponentModel.isEditorProRecordMode)) && (infiniStickerApi = getInfiniStickerApi()) != null && (listLLLLLZ = infiniStickerApi.LLLLLZ(EnumC1466150oFx.MUSIC_STICKER)) != null && (!listLLLLLZ.isEmpty())) {
            ((C0FTJ) ListProtector.get(listLLLLLZ, 0)).setVisible(z);
            if (!z && (infiniStickerApi2 = getInfiniStickerApi()) != null) {
                infiniStickerApi2.LJ0(false, "", (C0FTJ) ListProtector.get(listLLLLLZ, 0), null, null, null);
            }
        }
    }

    public final void Z1(boolean z) {
        this.LLIZ = z;
    }

    @Override // X.InterfaceC1654370t9X
    public void Zu(MusicStickerModel musicStickerModel) {
        InterfaceC1647520syU infiniStickerApi = getInfiniStickerApi();
        if (infiniStickerApi != null) {
            infiniStickerApi.J4(musicStickerModel);
        }
    }

    @Override // X.InterfaceC1654370t9X
    public void zi(boolean z) {
        MusicStickerModel musicStickerModel;
        if (this.LLILZLL) {
            return;
        }
        StickerModel stickerModelPX1 = pX1();
        if ((stickerModelPX1 instanceof MusicStickerModel) && (musicStickerModel = (MusicStickerModel) stickerModelPX1) != null) {
            if (z) {
                this.LLILZIL = BaseStickerModel.copy$default(musicStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
                this.LLILZLL = true;
            }
            InterfaceC1647520syU infiniStickerApi = getInfiniStickerApi();
            if (infiniStickerApi != null) {
                infiniStickerApi.J4(musicStickerModel.copy(BaseStickerModel.copy$default(musicStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(148)), 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31457377, 15, null), musicStickerModel.visible, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom));
            }
        }
    }
}
