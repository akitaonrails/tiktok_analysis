package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0L2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536670L2z extends AbstractC2255721DQs<InterfaceC537390L5t> implements InterfaceC537390L5t, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL = 10009;
    public final MutableLiveData<MediaModel> LLILZ = new MutableLiveData<>();
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C0L31.class, null);
    public final InterfaceC537390L5t LLIZ = this;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 569));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C536670L2z.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C536670L2z.class, "aiLiveQuotaV2Api", "getAiLiveQuotaV2Api()Lcom/ss/android/ugc/gamora/editor/ailive/newprompt/functions/AILiveQuotaV2Api;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJI = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.BaseBundle, android.os.Bundle] */
    private final Bundle W1() {
        ?? r1;
        ?? bundle = new Bundle();
        C786410Ut5.LJJJI("shoot_way", getEditModel().mShootWay, bundle);
        C786410Ut5.LJJJI("content_source", C1428470nHB.LJIILIIL(getEditModel()), bundle);
        C786410Ut5.LJJJI("content_type", C1428470nHB.LJIILL(getEditModel()), bundle);
        C786410Ut5.LJJJI("enter_from", "video_edit_page", bundle);
        C786410Ut5.LJJJI("enter_method", getEditModel().getShootEnterMethod(), bundle);
        Boolean bool = getEditModel().getAILivePhotoModel().mobParam.aiAliveChangePhoto;
        if (bool != null) {
            C0HWW c0hww = C0HWW.LIZ;
            boolean zBooleanValue = bool.booleanValue();
            c0hww.getClass();
            r1 = zBooleanValue;
        } else {
            r1 = 0;
        }
        bundle.putInt("ai_alive_change_photo", r1);
        bundle.putInt("process_cnt", Z1().rz0());
        C537520L6g.LJFF(bundle, getEditModel().getCreativeInfo());
        bundle.putBoolean("Key_enable_single_select_mode", false);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("key_set_column_count", 3);
        bundle.putInt("key_support_flag", 27);
        bundle.putBoolean("album_dark_mode", true);
        bundle.putInt("key_choose_scene", 63);
        if (C297780Blo.LIZ()) {
            bundle.putBoolean("album_fluency_opt", true);
        }
        return bundle;
    }

    private final C0L31 Z1() {
        return (C0L31) this.LLILZLL.getValue(this, LLJ[1]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJ[0]);
    }

    private final InterfaceC484050IyZ w2() {
        return (InterfaceC484050IyZ) this.LLIZLLLIL.getValue();
    }

    private final InterfaceC524950KiL X1() {
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) getDiContainer().LJIIL(null, InterfaceC524950KiL.class);
        return interfaceC524950KiL == null ? C0MWZ.LIZ(this.LLILLJJLI) : interfaceC524950KiL;
    }

    @Override // X.InterfaceC537390L5t
    public void LLLLIILL() {
        Bundle bundleW1 = W1();
        Context sceneContext = this.LLILLJJLI.getSceneContext();
        if (sceneContext != null) {
            InterfaceC569060MTo interfaceC569060MToLIZ = C1660680tJi.LIZ();
            int i = this.LLILLL;
            interfaceC569060MToLIZ.LIZJ(sceneContext, bundleW1, i, i);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC524950KiL interfaceC524950KiLX1 = X1();
        if (interfaceC524950KiLX1 != null) {
            interfaceC524950KiLX1.Qh(w2());
        }
    }

    @Override // X.InterfaceC537390L5t
    public LiveData<MediaModel> dR0() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public InterfaceC537390L5t o2() {
        return this.LLIZ;
    }

    public final List<MediaModel> G2(Intent intent) {
        ArrayList parcelableArrayListExtra;
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) == null || parcelableArrayListExtra.isEmpty()) {
            return null;
        }
        return parcelableArrayListExtra;
    }

    public final void H2(MediaModel mediaModel) {
        this.LLILZ.setValue(mediaModel);
    }

    public C536670L2z(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
    }
}
