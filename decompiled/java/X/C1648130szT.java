package X;

import Y.AObjectS246S0100000_25;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.tools.detail.IStickerReuseSvcService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0szT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648130szT extends C1652410t6N {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C01GW LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1648130szT.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = 8;
    }

    private final InterfaceC1653800t8c F4() {
        return (InterfaceC1653800t8c) this.LLJJJ.getValue();
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJJJIL.getValue(this, LLJJJJ[0]);
    }

    @Override // X.C1652410t6N, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (!((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2() || ((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) {
            getRecordAdapterApi().S42(this);
            F4().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 258));
        }
    }

    @Override // X.C1652410t6N, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().S42(null);
    }

    private final boolean K4(Effect effect) {
        Pair<String, Double> pairLJJIJ;
        if (effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        if (C1446130njf.LIZIZ(effect, "music_is_force_bind", false) || C1446130njf.LIZIZ(effect, "is_music_beat", false) || (pairLJJIJ = C1624570sNT.LJJIJ(C1624570sNT.LIZJ(effect))) == null || TextUtils.isEmpty((CharSequence) pairLJJIJ.first) || pairLJJIJ.second == null) {
            return false;
        }
        return true;
    }

    public final boolean H4(C1647390syH c1647390syH) {
        if (!Intrinsics.LJFF(c1647390syH.LIZIZ, C1664590tQ1.LJII(this).getString(2131845845)) && !Intrinsics.LJFF(c1647390syH.LIZIZ, C1664590tQ1.LJII(this).getString(2131845845)) && !Intrinsics.LJFF(c1647390syH.LIZIZ, C1664590tQ1.LJII(this).getString(2131845848)) && !Intrinsics.LJFF(c1647390syH.LIZIZ, C1664590tQ1.LJII(this).getString(2131845846)) && !Intrinsics.LJFF(c1647390syH.LIZIZ, C1664590tQ1.LJII(this).getString(2131845847)) && !Intrinsics.LJFF(c1647390syH.LIZIZ, C1664590tQ1.LJII(this).getString(2131845844)) && !Intrinsics.LJFF(c1647390syH.LIZIZ, C1664590tQ1.LJII(this).getString(2131845852)) && !Intrinsics.LJFF(c1647390syH.LIZIZ, C1664590tQ1.LJII(this).getString(2131845854)) && !Intrinsics.LJFF(c1647390syH.LIZIZ, C1664590tQ1.LJII(this).getString(2131845851)) && !Intrinsics.LJFF(c1647390syH.LIZIZ, C1664590tQ1.LJII(this).getString(2131845861)) && !Intrinsics.LJFF(c1647390syH.LIZIZ, C1664590tQ1.LJII(this).getString(2131845850))) {
            return false;
        }
        return true;
    }

    @Override // X.C1652410t6N
    public boolean O3(Effect effect) {
        if (C1624570sNT.LJIIL(effect) || getShortVideoContext().cameraComponentModel.isRetakeMode || getShortVideoContext().cameraComponentModel.isEditorProRecordMode || d4.LJIL(getShortVideoContext())) {
            return false;
        }
        if (C1624200sMs.LJIILL(effect)) {
            if ((!C290840Bac.LIZ() && !this.LLILLJJLI) || !K4(effect)) {
                return false;
            }
            return true;
        }
        if (C1624200sMs.LJIIIIZZ(effect)) {
            return false;
        }
        if (!C1624570sNT.LJJIIZ(effect) && !C1622710sKT.LIZ(effect)) {
            if (getShortVideoContext().doNotLoadMusic.booleanValue()) {
                return false;
            }
            if (C123100dR.LIZ(getShortVideoContext().creativeModel.streamVoiceConversionModel.vcVoiceId)) {
                ((IStickerReuseSvcService) ServiceManager.get().getService(IStickerReuseSvcService.class)).LIZ();
            }
            return true;
        }
        return getShortVideoContext().creativeModel.micDataModel.recordOriginalSoundWithBGM;
    }

    public C1648130szT(C1DRG c1drg, boolean z) {
        super(c1drg, z);
        this.LLJJJ = C1449630npJ.LIZ(this, InterfaceC1653800t8c.class);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    }
}
