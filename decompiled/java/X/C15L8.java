package X;

import Y.ARunnableS0S1510000_31;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.15L8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15L8 implements C15LG {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C15L7 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ MusicStickerStruct LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Boolean LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ Boolean LLJILLL;
    public final /* synthetic */ Boolean LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ ShootExtraData LLJJIJI;
    public final /* synthetic */ Boolean LLJJIJIIJIL;
    public final /* synthetic */ TtsVoiceInfo LLJJIJIL;
    public final /* synthetic */ String LLJJJ;
    public final /* synthetic */ String LLJJJIL;
    public final /* synthetic */ String LLJJJJ;
    public final /* synthetic */ boolean LLJJJJJIL;
    public final /* synthetic */ int LLJJJJLIIL;
    public final /* synthetic */ MusicRecordService LLJJL;

    @Override // X.C15LG
    public final boolean h4() {
        return this.LLJJL.LIZ;
    }

    @Override // X.C15LG
    public final void k8() {
        C0XPD.LIZIZ(this.LL, "single_song", "click_music_shoot", null, null);
    }

    @Override // X.C15LG
    public final void Sx(MusicModel musicModel) {
        if (this.LLJJJJJIL) {
            Activity activity = this.LL;
            C15L7 c15l7 = this.LLILLL;
            activity.runOnUiThread(new ARunnableS0S1510000_31(this, this.LLILLJJLI, activity, musicModel, this.LLILZ, c15l7, this.LLJILJIL, 1));
        }
    }

    @Override // X.C15LG
    public final void Nw(MusicModel musicModel, boolean z) {
        if (z) {
            this.LLJJL.LIZLLL(this.LL, musicModel, null, Boolean.TRUE);
        }
    }

    @Override // X.C15LG
    public final void fB(final Effect effect, final MusicModel musicModel) {
        final String string;
        C1398110mUD.LIZ = "single_song";
        String str = this.LLJJI;
        if (str != null) {
            C1398110mUD.LIZJ = str;
        }
        this.LLJJL.LIZIZ(true);
        String str2 = this.LLJIJIL;
        if (str2 != null && !str2.isEmpty()) {
            string = this.LLJIJIL;
        } else {
            string = UUID.randomUUID().toString();
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("MusicRecordService", new SimpleServiceLoadCallback() { // from class: X.15Lh
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                String musicId;
                HashMap<String, HashMap<String, String>> map = new HashMap<String, HashMap<String, String>>() { // from class: X.15Lj
                    {
                        put("shoot", new HashMap<String, String>() { // from class: X.15Ll
                            {
                                put("action_originated_from", "single_song");
                            }
                        });
                    }
                };
                RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.creationId(string);
                builder.startRecordTime(this.LIZLLL.LLJJL.LIZIZ);
                builder.decompressTime(j);
                builder.reshootConfig(new ReshootConfig(true, Boolean.TRUE));
                builder.shootWay(this.LIZLLL.LLJ);
                builder.musicWithSticker(effect);
                builder.translationType(3);
                builder.musicOrigin("single_song");
                builder.needLoadResourceAfterRecord(this.LIZLLL.LLJILJIL.booleanValue());
                builder.extraEventParams(map);
                builder.videoLength(Integer.valueOf(this.LIZLLL.LLJJJJLIIL));
                String str3 = this.LIZLLL.LLJJJ;
                if (str3 != null) {
                    builder.propResourceId(str3);
                }
                String str4 = this.LIZLLL.LLJILJILJ;
                if (str4 != null) {
                    builder.enterFrom(str4);
                }
                MusicModel musicModel2 = musicModel;
                if (musicModel2 != null && !musicModel2.getMusicId().isEmpty()) {
                    builder.musicId(musicModel.getMusicId());
                }
                MusicStickerStruct musicStickerStruct = this.LIZLLL.LLILZIL;
                if (musicStickerStruct != null) {
                    builder.musicStickerStruct(musicStickerStruct);
                }
                String str5 = this.LIZLLL.LLJJI;
                if (str5 != null) {
                    builder.enterMethod(str5);
                }
                String str6 = this.LIZLLL.LLJJIII;
                if (str6 != null) {
                    builder.shootFrom(str6);
                }
                Boolean bool = this.LIZLLL.LLJILLL;
                if (bool != null) {
                    builder.recordFromFeed(bool.booleanValue());
                }
                if (!TextUtils.isEmpty(this.LIZLLL.LLILLJJLI)) {
                    C15L8 c15l8 = this.LIZLLL;
                    MusicRecordService musicRecordService = c15l8.LLJJL;
                    String str7 = c15l8.LLILLJJLI;
                    musicRecordService.getClass();
                    builder.stickers(MusicRecordService.LIZ(str7));
                    if (!TextUtils.isEmpty(this.LIZLLL.LLILZLL)) {
                        builder.giphyGifIds(this.LIZLLL.LLILZLL);
                    }
                    C15L8 c15l82 = this.LIZLLL;
                    MusicRecordService musicRecordService2 = c15l82.LLJJL;
                    String str8 = c15l82.LLILLJJLI;
                    musicRecordService2.getClass();
                    ArrayList arrayListLIZ = MusicRecordService.LIZ(str8);
                    if (!arrayListLIZ.isEmpty()) {
                        builder.musicSticker((String) ListProtector.get(arrayListLIZ, 0));
                    }
                }
                String musicSticker = builder.build().getMusicSticker();
                Effect effect2 = effect;
                MusicModel musicModel3 = musicModel;
                if (musicModel3 != null) {
                    musicId = musicModel3.getMusicId();
                } else {
                    musicId = null;
                }
                builder.recordPresetResource(new RecordPresetResource(musicSticker, effect2, musicId, musicModel));
                Map<String, String> mapFetchSearchParams = C1ER1.LIZIZ.fetchSearchParams(this.LIZLLL.LLIZ, "");
                if ((mapFetchSearchParams instanceof HashMap) && mapFetchSearchParams.size() > 0) {
                    mapFetchSearchParams.put("shoot_from_search", "single_song");
                    builder.extraLogParams((HashMap) mapFetchSearchParams);
                }
                if (this.LIZLLL.LLJJ.booleanValue()) {
                    asyncAVService.uiService().recordService().openAlbumWithMusic(this.LIZLLL.LL, builder.build(), musicModel);
                } else if (effect != null && ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService().isEffectControlGame(effect)) {
                    asyncAVService.uiService().recordService().startRecord(this.LIZLLL.LL, builder.build());
                } else {
                    asyncAVService.uiService().recordService().startRecord(this.LIZLLL.LL, builder.build(), musicModel, true);
                }
            }
        });
    }

    @Override // X.C15LG
    public final void hb(boolean z, boolean z2) {
        C15L7 c15l7 = this.LLILLL;
        if (c15l7 != null && z2) {
            c15l7.LIZJ();
        }
        if (z) {
            this.LLJJL.LIZIZ(z);
            return;
        }
        ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLJJL.LIZJ;
        if (progressDialogC1399760mWs != null) {
            progressDialogC1399760mWs.dismiss();
            C785410UrT.LIZ(progressDialogC1399760mWs);
        }
    }

    @Override // X.C15LG
    public final void sa(int i, boolean z) {
        ProgressDialogC1399760mWs progressDialogC1399760mWs;
        ProgressDialogC1399760mWs progressDialogC1399760mWs2;
        C15L7 c15l7 = this.LLILLL;
        if (c15l7 != null) {
            c15l7.LIZLLL();
        }
        if (!z && (progressDialogC1399760mWs = this.LLJJL.LIZJ) != null) {
            progressDialogC1399760mWs.setProgress(i);
            if (i >= 98 && (progressDialogC1399760mWs2 = this.LLJJL.LIZJ) != null) {
                progressDialogC1399760mWs2.setCancelable(true);
            }
        }
    }

    @Override // X.C15LG
    public final void eL(final int i, final MusicModel musicModel, final String str) throws Throwable {
        String str2;
        C15L7 c15l7 = this.LLILLL;
        if (c15l7 != null) {
            c15l7.LJI();
        }
        this.LLJJL.LIZIZ(this.LLILZ);
        ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLJJL.LIZJ;
        if (progressDialogC1399760mWs != null) {
            progressDialogC1399760mWs.dismiss();
            C785410UrT.LIZ(progressDialogC1399760mWs);
        }
        C15L7 c15l72 = this.LLILLL;
        if (c15l72 != null) {
            c15l72.LJFF(musicModel, this.LLJJL.LJ.LJI);
        }
        final MusicRecordService musicRecordService = this.LLJJL;
        final Activity activity = this.LL;
        final MusicStickerStruct musicStickerStruct = this.LLILZIL;
        final String str3 = this.LLILLJJLI;
        final String str4 = this.LLILZLL;
        final String str5 = this.LLIZ;
        int i2 = this.LLIZLLLIL;
        final String str6 = this.LLJ;
        final String str7 = this.LLJI;
        String string = this.LLJIJIL;
        final Boolean bool = this.LLJILJIL;
        final String str8 = this.LLJILJILJ;
        final Boolean bool2 = this.LLJILLL;
        final Boolean bool3 = this.LLJJ;
        final String str9 = this.LLJJI;
        final String str10 = this.LLJJIII;
        final ShootExtraData shootExtraData = this.LLJJIJI;
        final Boolean bool4 = this.LLJJIJIIJIL;
        final TtsVoiceInfo ttsVoiceInfo = this.LLJJIJIL;
        final String str11 = this.LLJJJ;
        final String str12 = this.LLJJJIL;
        final String str13 = this.LLJJJJ;
        musicRecordService.getClass();
        C1398110mUD.LIZ = "single_song";
        if (str9 != null) {
            C1398110mUD.LIZJ = str9;
        }
        boolean zIsRecording = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().isRecording();
        final long jCurrentTimeMillis = System.currentTimeMillis() - musicRecordService.LIZIZ;
        if (zIsRecording && activity != null) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().addMusic(musicModel, 0);
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            if (TextUtils.equals(str5, "choose_music_with_banner") && i2 == 2) {
                str2 = "shoot_page_banner";
            } else if (TextUtils.equals(str5, "choose_music_with_banner") && i2 == 0) {
                str2 = "edit_page_banner";
            } else {
                str2 = "";
            }
            intent.putExtra("music_origin", str2);
            AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
            for (int length = abstractC1387200mCcArrLJII.length - 1; length >= 0; length--) {
                Object obj = abstractC1387200mCcArrLJII[length].LIZ;
                if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().isRecordSessionUIPage(obj)) {
                    for (int length2 = abstractC1387200mCcArrLJII.length - 1; length2 > length; length2--) {
                        abstractC1387200mCcArrLJII[length2].LJIIJJI(intent);
                        abstractC1387200mCcArrLJII[length2].LIZ();
                    }
                    return;
                }
                if (obj instanceof C08B7) {
                    break;
                }
            }
            C2204961BRm.LJIIL(-1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkiG521mXSA32NNmFGEhW+oHsW837UHVPSkw0", null));
            activity.finish();
            return;
        }
        if (string == null || string.isEmpty()) {
            string = UUID.randomUUID().toString();
        }
        final String str14 = string;
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("MusicRecordService", new SimpleServiceLoadCallback() { // from class: X.15Li
            /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onLoad(com.ss.android.ugc.aweme.services.AsyncAVService r9, long r10) {
                /*
                    Method dump skipped, instruction units count: 535
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20504815Li.onLoad(com.ss.android.ugc.aweme.services.AsyncAVService, long):void");
            }
        });
    }

    public C15L8(MusicRecordService musicRecordService, Activity activity, String str, C15L7 c15l7, boolean z, MusicStickerStruct musicStickerStruct, String str2, String str3, int i, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, Boolean bool4, TtsVoiceInfo ttsVoiceInfo, String str10, String str11, String str12, boolean z2, int i2) {
        this.LLJJL = musicRecordService;
        this.LL = activity;
        this.LLILLJJLI = str;
        this.LLILLL = c15l7;
        this.LLILZ = z;
        this.LLILZIL = musicStickerStruct;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = i;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = str6;
        this.LLJILJIL = bool;
        this.LLJILJILJ = str7;
        this.LLJILLL = bool2;
        this.LLJJ = bool3;
        this.LLJJI = str8;
        this.LLJJIII = str9;
        this.LLJJIJI = shootExtraData;
        this.LLJJIJIIJIL = bool4;
        this.LLJJIJIL = ttsVoiceInfo;
        this.LLJJJ = str10;
        this.LLJJJIL = str11;
        this.LLJJJJ = str12;
        this.LLJJJJJIL = z2;
        this.LLJJJJLIIL = i2;
    }
}
