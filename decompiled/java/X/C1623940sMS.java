package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS122S1100000_8;
import kotlin.jvm.internal.AwS163S0101000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.text.u;
import lnn.q;
import lth.o;

/* JADX INFO: renamed from: X.0sMS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623940sMS {
    public final C1DRG LIZ;
    public final ShortVideoContext LIZIZ;
    public final q LIZJ;
    public final InterfaceC1628590sTx LIZLLL;
    public final C19EG LJ;
    public RecordPresetResource LJI;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS569S0100000_25(this, 892));
    public ConcurrentHashMap<String, Integer> LJII = new ConcurrentHashMap<>();
    public final String LJIIL = "load_parallel";
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 891));
    public C1622010sJL LJIILJJIL = new C1622010sJL();
    public C1622010sJL LJIILL = new C1622010sJL();
    public long LJIILLIIL = -1;
    public C15O7<Integer> LJIIZILJ = C15O7.LJIIJ(1);

    public final void LIZJ() {
        if (this.LJIIJ) {
            C201955140j.LIZ("ShootSameToRecordPage cancel load");
            this.LJIIJJI = true;
            RecordPresetResource recordPresetResource = this.LJI;
            if (recordPresetResource == null) {
                recordPresetResource = null;
            }
            LJIIL(recordPresetResource);
            C1622010sJL c1622010sJL = this.LJIILJJIL;
            c1622010sJL.LIZLLL = true;
            c1622010sJL.LJ = true;
            IAnotherMusicService iAnotherMusicService = o.LJI;
            RecordPresetResource recordPresetResource2 = this.LJI;
            if (recordPresetResource2 == null) {
                recordPresetResource2 = null;
            }
            iAnotherMusicService.LIZLLL(recordPresetResource2.getMusicId());
            LJIILIIL();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.LJIIIIZZ;
            long j2 = jCurrentTimeMillis - this.LJIIIZ;
            RecordPresetResource recordPresetResource3 = this.LJI;
            RecordPresetResource recordPresetResource4 = recordPresetResource3 != null ? recordPresetResource3 : null;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("shoot_way", this.LIZIZ.shootWay);
            c0lab.LJ("content_source", this.LIZIZ.LJ().getContentSource());
            c0lab.LJ("content_type", this.LIZIZ.LJ().getContentType());
            c0lab.LJ("creation_id", this.LIZIZ.getCreationId());
            c0lab.LJ("group_id", C1443560nfW.LJIIIIZZ());
            c0lab.LJ("music_id", LJI(recordPresetResource4));
            c0lab.LJ("effect_id", LJFF(recordPresetResource4));
            c0lab.LIZIZ(j2, "loading_effect_time");
            c0lab.LIZIZ(j, "loading_music_time");
            C20684815ws.LJIILLIIL("record_preset_resource_click_cancel", c0lab.LIZ);
        }
    }

    public final Map<String, String> LIZLLL() {
        String str;
        HashMap map = new HashMap();
        String str2 = this.LIZIZ.creativeModel.recordEffectModel.stickerFrom;
        if (str2 != null && str2.length() > 0) {
            map.put(Scene.SCENE_SERVICE, str2);
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, (List) this.LIZ.LJII(ArrayList.class, "gradleKey"));
        if ((objLJJJLZIJ instanceof String) && (str = (String) objLJJJLZIJ) != null && str.length() > 0) {
            map.put("grade_key", str);
        }
        return map;
    }

    public final boolean LJIIJ() {
        return this.LJII.containsKey("effect");
    }

    public final boolean LJIIJJI() {
        return this.LJII.containsKey("music");
    }

    public final void LJIILJJIL() {
        C19EG c19eg;
        if (this.LJIIJJI) {
            return;
        }
        if (!C13LP.LJJJJ(this.LIZIZ.shootWay, C1697810uHb.LJIIJJI("prop_page", "prop_reuse", "anchor_combine_prop", "scan")) || (c19eg = this.LJ) == null) {
            return;
        }
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131829549);
        C1390380mHk.LIZ(c19eg, 3005, creativeToastBuilder);
    }

    public final void LJIILL() {
        C19EG c19eg;
        if (this.LJIIJJI) {
            return;
        }
        if (!C13LP.LJJJJ(this.LIZIZ.shootWay, C1697810uHb.LJIIJJI("single_song", "collection_music", "draft_again")) || (c19eg = this.LJ) == null) {
            return;
        }
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131829550);
        C1390380mHk.LIZ(c19eg, 3005, creativeToastBuilder);
    }

    public final void LJIILIIL() {
        if (!LJIIJ() || this.LJIILJJIL.LJ) {
            if (!LJIIJJI() || this.LJIILJJIL.LIZLLL) {
                C15O7.LJJ(Collections.singletonList(this.LJIIZILJ)).LIZLLL(new C1698290uIN(this, 1));
            }
        }
    }

    public static String LJFF(RecordPresetResource recordPresetResource) {
        String effectId;
        String effectId2 = recordPresetResource.getEffectId();
        Effect effect = recordPresetResource.getEffect();
        if (TextUtils.isEmpty(effectId2)) {
            if (effect != null) {
                effectId = effect.getEffectId();
            } else {
                effectId = null;
            }
            if (!TextUtils.isEmpty(effectId)) {
                if (effect == null) {
                    return null;
                }
                return effect.getEffectId();
            }
            return effectId2;
        }
        return effectId2;
    }

    public static String LJI(RecordPresetResource recordPresetResource) {
        String musicId;
        String musicId2 = recordPresetResource.getMusicId();
        MusicModel musicModel = recordPresetResource.getMusicModel();
        if (TextUtils.isEmpty(musicId2)) {
            if (musicModel != null) {
                musicId = musicModel.getMusicId();
            } else {
                musicId = null;
            }
            if (!TextUtils.isEmpty(musicId)) {
                if (musicModel == null) {
                    return null;
                }
                return musicModel.getMusicId();
            }
            return musicId2;
        }
        return musicId2;
    }

    public final void LIZ(Effect effect) {
        Bundle bundle;
        if (this.LIZIZ.showCancelAfterPinProp.booleanValue()) {
            this.LIZJ.NJ(true, true);
            FaceStickerBean.sCurPropSource = "qa_prop";
        }
        q qVar = this.LIZJ;
        List listSingletonList = Collections.singletonList(effect);
        OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig = this.LIZIZ.greenScreenKitConfig;
        if (oPSDK$GreenScreenKitConfig != null) {
            bundle = oPSDK$GreenScreenKitConfig.toBundle();
        } else {
            bundle = null;
        }
        C1624010sMZ.LIZLLL(qVar, listSingletonList, true, true, null, false, bundle, null, null, 31736);
    }

    public final void LJIIL(RecordPresetResource recordPresetResource) {
        Effect effect = recordPresetResource.getEffect();
        String effectId = recordPresetResource.getEffectId();
        if (effect != null) {
            C1624010sMZ.LIZLLL(this.LIZJ, Collections.singletonList(effect), true, false, null, false, null, null, null, 32760);
            return;
        }
        if (effectId == null) {
            return;
        }
        q qVar = this.LIZJ;
        qVar.C0().LIZ(Collections.singletonList(effectId), LIZLLL(), new IFetchEffectListByIdsListener() { // from class: X.0sMT
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
            public final void onFail(ExceptionResult exceptionResult) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectListResponse effectListResponse) {
                List<Effect> data;
                Object obj;
                EffectListResponse effectListResponse2 = effectListResponse;
                if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (obj = ListProtector.get(data, 0)) != null) {
                    C1624010sMZ.LIZLLL(this.LIZ.LIZJ, Collections.singletonList(obj), true, false, null, false, null, null, null, 32760);
                }
            }
        });
    }

    public final void LIZIZ(AVMusic aVMusic, String str) {
        InterfaceC1628590sTx interfaceC1628590sTx = this.LIZLLL;
        if (interfaceC1628590sTx != null) {
            interfaceC1628590sTx.us(false, "", aVMusic, str);
        }
        InterfaceC1628590sTx interfaceC1628590sTx2 = this.LIZLLL;
        if (interfaceC1628590sTx2 != null) {
            interfaceC1628590sTx2.sn(C1421090n5H.LIZ(Boolean.FALSE, "", aVMusic, str, null, true, null, -1L, LivePreviewCTASmartDisplayManager.DEFAULT, false));
        }
        C1452640nuA.LJII(aVMusic, false, this.LIZIZ.creativeModel.musicBuzModel);
        ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) ((C1659660tI4) this.LIZ.LJII(C1659660tI4.class, null)).LIZ(ChooseMediaViewModel.class);
        chooseMediaViewModel.getClass();
        chooseMediaViewModel.yR2(new AwS122S1100000_8(aVMusic, str, 6));
        long j = this.LJIILLIIL;
        String creationId = this.LIZIZ.getCreationId();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "long_press");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "duration");
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        C20684815ws.LJIILLIIL("video_shoot_page_music_load_time", c2344009Gk.LIZ);
    }

    public final void LJ(Effect effect, final InterfaceC1622210sJf interfaceC1622210sJf) {
        C1624010sMZ.LIZLLL(this.LIZJ, Collections.singletonList(effect), true, true, new InterfaceC1625550sP3() { // from class: X.0sMV
            @Override // X.InterfaceC1625550sP3
            public final void LJIIIIZZ(Effect effect2) {
            }

            @Override // X.InterfaceC1625550sP3
            public final void onSuccess(Effect effect2) {
                if (effect2 != null) {
                    interfaceC1622210sJf.LJIIIIZZ(effect2);
                } else {
                    interfaceC1622210sJf.LIZ();
                }
            }

            @Override // X.InterfaceC1625550sP3
            public final void LJII(int i, Effect effect2) {
                C421570Gfz.LIZ(new AwS163S0101000_25(this, i, 8));
            }

            @Override // X.InterfaceC1625550sP3
            public final void LJIILLIIL(Effect effect2, ExceptionResult exceptionResult) {
                String effect_id;
                String string;
                interfaceC1622210sJf.LIZ();
                C1623940sMS c1623940sMS = this;
                BaseBundle baseBundle = (BaseBundle) c1623940sMS.LJIILIIL.getValue();
                long j = 0;
                if (baseBundle != null) {
                    j = baseBundle.getLong("extra_start_record_time", 0L);
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LIZIZ(System.currentTimeMillis() - j, "duration");
                c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                String string2 = null;
                if (effect2 != null) {
                    effect_id = effect2.getEffect_id();
                } else {
                    effect_id = null;
                }
                c0lab.LJ("prop_id", effect_id);
                c0lab.LJ("shoot_way", c1623940sMS.LIZIZ.shootWay);
                BaseBundle baseBundle2 = (BaseBundle) c1623940sMS.LJIILIIL.getValue();
                if (baseBundle2 != null) {
                    string = baseBundle2.getString("enter_from");
                } else {
                    string = null;
                }
                c0lab.LJ("enter_from", string);
                BaseBundle baseBundle3 = (BaseBundle) c1623940sMS.LJIILIIL.getValue();
                if (baseBundle3 != null) {
                    string2 = baseBundle3.getString("enter_method");
                }
                c0lab.LJ("enter_method", string2);
                if (u.LJIJI(c1623940sMS.LIZIZ.shootWay, "direct_shoot", false)) {
                    c0lab.LJ("type", "plus");
                }
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C2341909Fp.LIZ("tool_performance_prop_reuse_apply_time", c0lab.LIZ);
            }
        }, true, null, null, null, 31976);
    }

    public final void LJII(RecordPresetResource recordPresetResource, final InterfaceC1622210sJf interfaceC1622210sJf) {
        String effectId;
        String effectId2 = recordPresetResource.getEffectId();
        Effect effect = recordPresetResource.getEffect();
        if (TextUtils.isEmpty(effectId2)) {
            if (effect != null) {
                effectId = effect.getEffectId();
            } else {
                effectId = null;
            }
            if (!TextUtils.isEmpty(effectId)) {
                effectId2 = effect != null ? effect.getEffectId() : null;
            }
        }
        this.LJIIIZ = System.currentTimeMillis();
        if (effect != null) {
            LJ(effect, interfaceC1622210sJf);
            return;
        }
        if (effectId2 != null && effectId2.length() != 0) {
            this.LIZJ.C0().LIZ(Collections.singletonList(effectId2), LIZLLL(), new IFetchEffectListByIdsListener() { // from class: X.0sMU
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    interfaceC1622210sJf.LIZLLL();
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    List<Effect> data;
                    Effect effect2;
                    EffectListResponse effectListResponse2 = effectListResponse;
                    if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect2 = (Effect) ListProtector.get(data, 0)) != null) {
                        interfaceC1622210sJf.LJII(effect2);
                    } else {
                        interfaceC1622210sJf.LIZLLL();
                    }
                }
            });
            return;
        }
        C1622010sJL c1622010sJL = this.LJIILJJIL;
        c1622010sJL.LJ = true;
        c1622010sJL.LIZ = null;
        LJIIIZ(0, System.currentTimeMillis() - this.LJIIIZ, "effect");
        LJIILIIL();
    }

    public final void LJIIIIZZ(RecordPresetResource recordPresetResource, final InterfaceC1622210sJf interfaceC1622210sJf) {
        String musicId;
        String musicId2 = recordPresetResource.getMusicId();
        MusicModel musicModel = recordPresetResource.getMusicModel();
        if (TextUtils.isEmpty(musicId2)) {
            if (musicModel != null) {
                musicId = musicModel.getMusicId();
            } else {
                musicId = null;
            }
            if (!TextUtils.isEmpty(musicId)) {
                musicId2 = musicModel != null ? musicModel.getMusicId() : null;
            }
        }
        this.LJIIIIZZ = System.currentTimeMillis();
        if (musicId2 != null && musicId2.length() != 0) {
            o.LJI.requestMusic(musicId2, new InterfaceC1416890myV() { // from class: X.0sJe
                @Override // X.InterfaceC1416890myV
                public final void LIZIZ(Exception exc) {
                    interfaceC1622210sJf.LIZIZ();
                }

                @Override // X.InterfaceC1416890myV
                public final void LIZLLL(AVMusic aVMusic) {
                    if (aVMusic == null) {
                        interfaceC1622210sJf.LIZIZ();
                    } else if ((!AVCommerceServiceImpl.LJIIJ().LJ() || aVMusic.isCommerceMusic()) && o.LJI.LJFF(aVMusic, this.LJ)) {
                        interfaceC1622210sJf.LJFF(aVMusic);
                    } else {
                        interfaceC1622210sJf.LJ();
                    }
                }
            });
            return;
        }
        C1622010sJL c1622010sJL = this.LJIILJJIL;
        c1622010sJL.LIZLLL = true;
        c1622010sJL.LIZIZ = null;
        c1622010sJL.LIZJ = null;
        LJIIIZ(0, System.currentTimeMillis() - this.LJIIIIZZ, "music");
        LJIILIIL();
    }

    public final void LJIILLIIL(String str, int i) {
        if (this.LJII.isEmpty()) {
            return;
        }
        if (this.LJII.containsKey(str)) {
            this.LJII.put(str, Integer.valueOf(i));
        }
        Iterator<Integer> it2 = this.LJII.values().iterator();
        while (it2.hasNext()) {
            it2.next().intValue();
        }
        InterfaceC1621460sIS interfaceC1621460sIS = (InterfaceC1621460sIS) this.LJFF.getValue();
        this.LJII.size();
        interfaceC1621460sIS.A4();
    }

    public final void LJIIIZ(int i, long j, String str) {
        RecordPresetResource recordPresetResource = this.LJI;
        if (recordPresetResource == null) {
            recordPresetResource = null;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", this.LIZIZ.shootWay);
        c0lab.LJ("content_source", this.LIZIZ.LJ().getContentSource());
        c0lab.LJ("content_type", this.LIZIZ.LJ().getContentType());
        c0lab.LJ("creation_id", this.LIZIZ.getCreationId());
        c0lab.LJ("group_id", C1443560nfW.LJIIIIZZ());
        c0lab.LJ("music_id", LJI(recordPresetResource));
        c0lab.LJ("effect_id", LJFF(recordPresetResource));
        c0lab.LIZIZ(j, "loading_duration");
        c0lab.LIZ(i, "loading_status");
        c0lab.LJ("loading_type", str);
        C20684815ws.LJIILLIIL("record_preset_resource_loading_finish", c0lab.LIZ);
    }

    public C1623940sMS(C1DRG c1drg, ShortVideoContext shortVideoContext, q qVar, InterfaceC1628590sTx interfaceC1628590sTx) {
        this.LIZ = c1drg;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = qVar;
        this.LIZLLL = interfaceC1628590sTx;
        this.LJ = (C19EG) c1drg.LJII(C19EG.class, null);
    }
}
