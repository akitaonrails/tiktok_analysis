package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;

/* JADX INFO: renamed from: X.0t1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649460t1c {
    public static final long LJ = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration();
    public final InterfaceC1649500t1g LIZ;
    public final InterfaceC1650730t3f LIZIZ;
    public final ShortVideoContext LIZJ;
    public final InterfaceC1648570t0B LIZLLL;

    public void onEvent(C1648150szV c1648150szV) {
        long j;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        EnumC1649480t1e enumC1649480t1eLIZ;
        EnumC1993707rT enumC1993707rT;
        String str;
        InterfaceC1650730t3f interfaceC1650730t3f;
        BackgroundVideo backgroundVideo;
        boolean z;
        c1648150szV.getClass();
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZJ.creativeModel.musicBuzModel);
        String str2 = this.LIZJ.cameraComponentModel.mMusicPath;
        if (c1648150szV.LIZ) {
            j = 15000;
        } else {
            j = LJ;
        }
        if (aVMusicExtractAVMusic != null && !TextUtils.isEmpty(str2)) {
            jLongValue2 = C579120MnW.LIZ(aVMusicExtractAVMusic, str2);
            if (this.LIZ != null && this.LIZJ.LJI().isEmpty()) {
                InterfaceC1649500t1g interfaceC1649500t1g = this.LIZ;
                if (jLongValue2 > j) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC1649500t1g.Dw(z);
            }
            jLongValue = Math.min(jLongValue2, j);
        } else {
            jLongValue = j;
            jLongValue2 = 0;
        }
        BackgroundVideo backgroundVideo2 = this.LIZJ.cameraComponentModel.curBackgroundVideo;
        if (backgroundVideo2 != null) {
            long maxDuration = backgroundVideo2.getMaxDuration();
            if (maxDuration > 0 && (backgroundVideo = this.LIZJ.cameraComponentModel.curBackgroundVideo) != null && !backgroundVideo.isMultiBgVideo()) {
                jLongValue = Math.min(jLongValue, maxDuration);
            }
        }
        if (this.LIZJ.LJJJJLL()) {
            C443120HZe<Long, Long, Long> c443120HZeLIZ = C1444030ngH.LIZ(this.LIZJ.stitchContext.stitchParams, str2, aVMusicExtractAVMusic, j);
            jLongValue2 = c443120HZeLIZ.getFirst().longValue();
            jLongValue3 = c443120HZeLIZ.getSecond().longValue();
            jLongValue = c443120HZeLIZ.getThird().longValue();
        } else {
            jLongValue3 = jLongValue;
        }
        if (this.LIZJ.LJJJJLL()) {
            enumC1649480t1eLIZ = C1649470t1d.LIZ(new C1649470t1d(), j, jLongValue);
        } else {
            enumC1649480t1eLIZ = C1649470t1d.LIZ(new C1649470t1d(), j, jLongValue2);
        }
        InterfaceC1648570t0B interfaceC1648570t0B = this.LIZLLL;
        if (c1648150szV.LIZ) {
            enumC1993707rT = EnumC1993707rT.FORM_15S;
        } else {
            enumC1993707rT = EnumC1993707rT.FORM_60S;
        }
        interfaceC1648570t0B.eI0(enumC1993707rT, false);
        ShortVideoContext shortVideoContext = this.LIZJ;
        shortVideoContext.cameraComponentModel.mCurrentDurationMode = !c1648150szV.LIZ;
        shortVideoContext.LJJLIIIJJI(jLongValue3);
        this.LIZLLL.ht1(new C531060KsC(jLongValue));
        if (enumC1649480t1eLIZ == EnumC1649480t1e.MUSIC && !c1648150szV.LIZLLL && (interfaceC1650730t3f = this.LIZIZ) != null) {
            interfaceC1650730t3f.nv(1);
        }
        ShortVideoContext shortVideoContext2 = this.LIZJ;
        if (this.LIZ != null && shortVideoContext2.LJI().isEmpty() && aVMusicExtractAVMusic != null) {
            if (aVMusicExtractAVMusic.getShootDuration() <= j && Math.abs(aVMusicExtractAVMusic.getShootDuration() - aVMusicExtractAVMusic.getDuration()) < 1000) {
                this.LIZ.Dw(false);
            } else {
                this.LIZ.Dw(true);
            }
        }
        C0CHQ.LIZ().LJJIIZI().LJJIIJ(this.LIZJ.cameraComponentModel.mCurrentDurationMode);
        C1436840nUg c1436840nUg = new C1436840nUg(C0CHQ.LIZ);
        if (!c1436840nUg.LIZJ().getBoolean("is_duration_mode_manually_change", false)) {
            c1436840nUg.LIZJ().edit().putBoolean("is_duration_mode_manually_change", true).apply();
        }
        if (c1648150szV.LIZJ != 2) {
            C0LAB c0lab = new C0LAB();
            if (c1648150szV.LIZ) {
                str = "15s";
            } else {
                str = "60s";
            }
            c0lab.LJ("to_status", str);
            c0lab.LJ("creation_id", this.LIZJ.getCreationId());
            c0lab.LJ("shoot_way", this.LIZJ.shootWay);
            int i = this.LIZJ.draftId;
            if (i != 0) {
                c0lab.LIZ(i, "draft_id");
            }
            if (!TextUtils.isEmpty(this.LIZJ.newDraftId)) {
                c0lab.LJ("new_draft_id", this.LIZJ.newDraftId);
            }
            C20684815ws.LJIILLIIL("change_record_mode", c0lab.LIZ);
        }
    }

    public C1649460t1c(ShortVideoContext shortVideoContext, C1DRG c1drg) {
        this.LIZJ = shortVideoContext;
        this.LIZ = (InterfaceC1649500t1g) c1drg.LJIIL(null, InterfaceC1649500t1g.class);
        this.LIZIZ = (InterfaceC1650730t3f) c1drg.LJIIL(null, InterfaceC1650730t3f.class);
        this.LIZLLL = (InterfaceC1648570t0B) c1drg.LJII(InterfaceC1648570t0B.class, null);
    }
}
