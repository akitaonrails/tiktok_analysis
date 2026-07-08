package X;

import Y.AObjectS241S0100000_8;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aikit.api.common.FileService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0LR4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LR4 extends AbstractC2255721DQs<InterfaceC550010Lhf> implements InterfaceC550010Lhf, InterfaceC379610EuV {
    public static final C0LR6 LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C549510Lgr LL;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC389540FPc.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC548750Lfd.class, null);
    public final MutableLiveData<MediaModel> LLILZLL = new MutableLiveData<>();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0LR6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0LR4.class, "activityResultApi", "getActivityResultApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/base/activityresult/AIActivityResultApi;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0LR4.class, "aigcDataSource", "getAigcDataSource()Lcom/ss/android/ugc/aweme/aigc/quality/mob/api/AIGCDataSource;", 0)};
        LLIZ = new Object() { // from class: X.0LR6
        };
    }

    public InterfaceC550010Lhf o2() {
        return this;
    }

    private final Bundle W1() {
        AbstractC548720Lfa abstractC548720Lfa;
        List<InterfaceC548750Lfd> listProvideDataSources;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", "create_video", bundle);
        bundle.putBoolean("Key_enable_single_select_mode", false);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("key_set_column_count", 3);
        bundle.putInt("key_support_flag", 11);
        bundle.putBoolean("album_dark_mode", true);
        bundle.putInt("key_choose_scene", 65);
        bundle.putBoolean("album_fluency_opt", true);
        C786410Ut5.LJJJI("shoot_way", (String) Z1().getValue(C1E3X.LIZIZ), bundle);
        InterfaceC548750Lfd interfaceC548750LfdZ1 = Z1();
        if ((interfaceC548750LfdZ1 instanceof AbstractC548720Lfa) && (abstractC548720Lfa = (AbstractC548720Lfa) interfaceC548750LfdZ1) != null && (listProvideDataSources = abstractC548720Lfa.provideDataSources()) != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC548750Lfd interfaceC548750Lfd : listProvideDataSources) {
                if (interfaceC548750Lfd instanceof AIGCEntranceInfo) {
                    arrayList.add(interfaceC548750Lfd);
                }
            }
            AIGCEntranceInfo aIGCEntranceInfo = (AIGCEntranceInfo) C13LP.LJJJLL(arrayList);
            if (aIGCEntranceInfo != null) {
                C786410Ut5.LJJIJL(bundle, "aigc_entrance_info", aIGCEntranceInfo);
            }
        }
        bundle.putBoolean("select_material_scene_force_disable_finish_anim", true);
        return bundle;
    }

    private final InterfaceC389540FPc X1() {
        return (InterfaceC389540FPc) this.LLILZ.getValue(this, LLIZLLLIL[0]);
    }

    private final InterfaceC548750Lfd Z1() {
        return (InterfaceC548750Lfd) this.LLILZIL.getValue(this, LLIZLLLIL[1]);
    }

    @Override // X.InterfaceC550010Lhf
    public void Wb() {
        MutableLiveData<MediaModel> mutableLiveData = this.LLILZLL;
        MediaModel mediaModel = new MediaModel(-1L);
        mediaModel.LJIILL("");
        mutableLiveData.setValue(mediaModel);
    }

    public final FileService w2() {
        C547860LeC.LIZ.getClass();
        return C547860LeC.LJ();
    }

    @Override // X.InterfaceC550010Lhf
    public void LLLLIILL() {
        C1660680tJi.LIZ().LIZJ((Context) getDiContainer().LJII(C19EG.class, null), W1(), 10300, 10300);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        X1().LLZIL().LIZ(this, new AObjectS241S0100000_8(this, 2));
    }

    public MutableLiveData<MediaModel> G2() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC550010Lhf
    public /* bridge */ /* synthetic */ LiveData LLLLIIL() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final List<MediaModel> H2(Intent intent) {
        ArrayList parcelableArrayListExtra;
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) == null || parcelableArrayListExtra.isEmpty()) {
            return null;
        }
        return parcelableArrayListExtra;
    }

    public final void W2(MediaModel mediaModel) {
        this.LLILZLL.setValue(mediaModel);
    }

    @Override // X.InterfaceC550010Lhf
    public void dB0(MediaModel mediaModel) {
        W2(mediaModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[Catch: all -> 0x00b3, PHI: r0
      0x0028: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v14 java.lang.String) binds: [B:8:0x0013, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00b3, blocks: (B:3:0x0003, B:5:0x0009, B:7:0x000f, B:9:0x0015, B:11:0x0028), top: B:40:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.mediachoose.helper.MediaModel T2(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r20, com.ss.android.ugc.aweme.aikit.experiments.AIGCImagePreprocessConfigExp.AIGCImagePreprocessConfig r21) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LR4.T2(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, com.ss.android.ugc.aweme.aikit.experiments.AIGCImagePreprocessConfigExp$AIGCImagePreprocessConfig):com.ss.android.ugc.aweme.mediachoose.helper.MediaModel");
    }

    public C0LR4(C549510Lgr c549510Lgr, C19A3 c19a3, C1DRG c1drg) {
        this.LL = c549510Lgr;
        this.LLILLJJLI = c19a3;
        this.LLILLL = c1drg;
    }
}
