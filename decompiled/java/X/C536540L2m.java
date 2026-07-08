package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateDetailService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.util.ProcessorConfig;
import com.ss.android.ugc.aweme.shortvideo.util.SpeedConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS43S0500000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C536540L2m implements InterfaceC522520KeQ {
    public final Activity LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final C1DRG LLILZ;
    public final C01GW LLILZIL;

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    public InterfaceC533910Kwn LJ() {
        return (InterfaceC533910Kwn) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
        LJ().LIZ();
    }

    public static String LIZJ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public /* synthetic */ C536540L2m(Activity activity, long j, long j2) {
        this(j, j2, activity, null);
    }

    @Override // X.InterfaceC522520KeQ
    public void LIZ(int i, int i2, Intent intent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Parcelable parcelableExtra;
        AnchorCommonStruct anchorCommonStruct;
        String str;
        ProcessorConfig processorConfig;
        int iIntValue;
        int iIntValue2;
        boolean z7;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        ITemplateAlbumService iTemplateAlbumService;
        String strLJFF;
        AnchorCommonStruct anchorCommonStruct2;
        String str2;
        C443120HZe c443120HZe;
        String strLIZJ;
        C534170KxD c534170KxD = new C534170KxD(intent);
        if (i2 != -1) {
            c534170KxD.onMediaChooseFail("resultCode != Activity.RESULT_OK");
            return;
        }
        if (i != 1) {
            c534170KxD.onMediaChooseFail("requestCode!= ChooseMedia.REQUEST_CODE_LOCAL_VIDEO");
            return;
        }
        String strLIZJ2 = LIZJ(intent, "extra_edit_effect_uid");
        long longExtra = intent.getLongExtra("extra_start_enter_edit_page", -1L);
        int intExtra = intent.getIntExtra("extra_stick_point_type", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null) {
            return;
        }
        if (parcelableArrayListExtra.isEmpty()) {
            c534170KxD.onMediaChooseFail("selectedMediaData isNullOrEmpty()");
            return;
        }
        ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
        if (shortVideoContext == null) {
            return;
        }
        int i3 = C530180Kqm.LIZIZ;
        C443120HZe c443120HZeLIZ = C530180Kqm.LIZ(this.LL, parcelableArrayListExtra, 0L, C530180Kqm.LIZ);
        boolean zBooleanValue = ((Boolean) c443120HZeLIZ.getFirst()).booleanValue();
        int iIntValue3 = ((Number) c443120HZeLIZ.getSecond()).intValue();
        long jLongValue = ((Number) c443120HZeLIZ.getThird()).longValue();
        if (!zBooleanValue) {
            c534170KxD.onMediaChooseFail("isValid = false");
            return;
        }
        if (C530750Krh.LJFF == null) {
            C530750Krh.LIZIZ(this.LL);
        }
        C530750Krh.LJFF.LIZ();
        int size = parcelableArrayListExtra.size();
        for (int i4 = 0; i4 < size; i4++) {
            C530750Krh c530750Krh = C530750Krh.LJFF;
            Object obj = ListProtector.get(parcelableArrayListExtra, i4);
            if (obj == null) {
                c530750Krh.getClass();
            } else if (!((ArrayList) c530750Krh.LIZLLL).contains(obj)) {
                ((ArrayList) c530750Krh.LIZLLL).add(obj);
            }
        }
        if (intent.hasExtra("key_story_canvas_bg_color_start") && intent.hasExtra("key_story_canvas_bg_color_end")) {
            int intExtra2 = intent.getIntExtra("key_story_canvas_bg_color_start", 0);
            int intExtra3 = intent.getIntExtra("key_story_canvas_bg_color_end", 0);
            shortVideoContext.creativeModel.editModel.storyCanvasBgColorFromAlbumStart = Integer.valueOf(intExtra2);
            shortVideoContext.creativeModel.editModel.storyCanvasBgColorFromAlbumEnd = Integer.valueOf(intExtra3);
        }
        int intExtra4 = intent.getIntExtra("key_choose_scene", -1);
        if (intExtra4 == 18) {
            z = true;
        } else {
            z = false;
        }
        if (intExtra4 != 24 && intExtra4 != 36) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (intExtra4 == 40) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i5 = shortVideoContext.creativeModel.mvModel.templateType;
        EnumC1412640mre enumC1412640mre = EnumC1412640mre.PUGC_TEMPLATE;
        if (i5 == enumC1412640mre.getValue()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((!z3 || !z4) && intExtra4 != 36) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z || z2 || z3 || C123100dR.LIZ(strLIZJ2) || intExtra4 == 31) {
            AVMusic aVMusic = (AVMusic) intent.getSerializableExtra("aweme_music");
            MusicBuzModel musicBuzModel = shortVideoContext.creativeModel.musicBuzModel;
            musicBuzModel.musicOrigin = "mv_default";
            C1452640nuA.LJII(aVMusic, false, musicBuzModel);
        }
        C574750MgT c574750MgT = C574750MgT.LIZ;
        String str3 = shortVideoContext.shootWay;
        String creationId = shortVideoContext.getCreationId();
        String str4 = shortVideoContext.albumPreviewNextMethod;
        c574750MgT.getClass();
        C574750MgT.LIZIZ = str3;
        C574750MgT.LIZJ = creationId;
        if (str4 != null) {
            C574750MgT.LJI = str4;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("show_green_background_upload_content_next_switch", true)) {
            TemplateConsumeData templateConsumeData = shortVideoContext.creativeModel.templateConsumeData;
            if (templateConsumeData.LIZ()) {
                String str5 = templateConsumeData.templateId;
                if (str5 == null) {
                    str5 = "";
                }
                ITemplateDetailService iTemplateDetailService = C536250L1j.LIZ;
                if ((iTemplateDetailService == null || (strLIZJ = iTemplateDetailService.LIZ(str5)) == null) && (strLIZJ = shortVideoContext.creativeModel.mvModel.templateName) == null && (strLIZJ = LIZJ(intent, "key_ugc_template_name")) == null) {
                    strLIZJ = "";
                }
                String str6 = templateConsumeData.templateType;
                if (str6 == null) {
                    str6 = "";
                }
                c443120HZe = new C443120HZe(str5, strLIZJ, str6);
            } else if (z5) {
                c443120HZe = new C443120HZe(LIZJ(intent, "key_ugc_template_id"), LIZJ(intent, "key_ugc_template_name"), C1412630mrd.LIZLLL(enumC1412640mre));
            } else {
                c443120HZe = new C443120HZe("", "", "");
            }
            String str7 = (String) c443120HZe.getFirst();
            String str8 = (String) c443120HZe.getSecond();
            String str9 = (String) c443120HZe.getThird();
            C526770KlH c526770KlH = C526770KlH.LIZ;
            C528230Knd c528230KndLIZ = C523870Kgb.LIZ(intent);
            C524800Ki6 c524800Ki6 = new C524800Ki6(C522280Ke2.LIZ(parcelableArrayListExtra), Integer.valueOf(C522280Ke2.LIZIZ(parcelableArrayListExtra)));
            c526770KlH.getClass();
            C526770KlH.LIZ(shortVideoContext, parcelableArrayListExtra, iIntValue3, (int) jLongValue, str7, str8, str9, c528230KndLIZ, c524800Ki6);
        }
        C526770KlH c526770KlH2 = C526770KlH.LIZ;
        C528230Knd c528230KndLIZ2 = C523870Kgb.LIZ(intent);
        c526770KlH2.getClass();
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("content_type", "video");
            if (parcelableArrayListExtra.size() > 1) {
                str2 = "multiple_content";
            } else {
                str2 = "single_content";
            }
            c0lab.LJ("upload_type", str2);
            c0lab.LIZ(C530690Krb.LIZ(parcelableArrayListExtra), "source_is_hdr");
            if (c528230KndLIZ2 != null) {
                c0lab.LJ("shoot_way", c528230KndLIZ2.LIZ);
                c0lab.LJ("shoot_enter_method", c528230KndLIZ2.LIZLLL);
                c0lab.LJ("shoot_enter_from", c528230KndLIZ2.LIZJ);
                c0lab.LIZ(c528230KndLIZ2.LJ ? 1 : 0, "is_draft");
                c0lab.LJ("multi_select_status", c528230KndLIZ2.LIZ());
                c0lab.LIZ(c528230KndLIZ2.LJIIJ ? 1 : 0, "in_detail");
                c0lab.LJ("album_from_page", c528230KndLIZ2.LJI);
                c0lab.LJ("album_from_scene", c528230KndLIZ2.LJII);
            }
            C20684815ws.LJIILLIIL("upload_content_next", c0lab.LIZ);
        }
        Intent intentLIZLLL = LIZLLL(this.LL, shortVideoContext, intExtra, longExtra, strLIZJ2);
        if (intent.hasExtra("key_story_canvas_bg_color_start") && intent.hasExtra("key_story_canvas_bg_color_end")) {
            intentLIZLLL.putExtra("key_story_canvas_bg_color_start", intent.getIntExtra("key_story_canvas_bg_color_start", 0));
            intentLIZLLL.putExtra("key_story_canvas_bg_color_end", intent.getIntExtra("key_story_canvas_bg_color_end", 0));
        }
        for (String str10 : C1697810uHb.LJIIJJI("prop_id", "prop_resource_id", "is_ai_prop", "ai_prop_type", "sub_ai_prop_type", "ai_prop_model_name", "is_default_prop", "tab_key", "prop_trigger_type", "prop_selected_from")) {
            String strLIZJ3 = LIZJ(intent, str10);
            if (strLIZJ3 != null) {
                intentLIZLLL.putExtra(str10, strLIZJ3);
            }
        }
        if (intent.hasExtra("effect_source")) {
            intentLIZLLL.putExtra("effect_source", LIZJ(intent, "effect_source"));
        }
        if (intent.hasExtra("is_async")) {
            intentLIZLLL.putExtra("is_async", LIZJ(intent, "is_async"));
        }
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intentLIZLLL);
        if (z2) {
            String strLIZJ4 = LIZJ(intent, "key_ugc_template_id");
            Serializable serializableExtra = intent.getSerializableExtra("key_ugc_template_anchor");
            if (serializableExtra instanceof AnchorCommonStruct) {
                anchorCommonStruct2 = (AnchorCommonStruct) serializableExtra;
            } else {
                anchorCommonStruct2 = null;
            }
            C0MUK.LIZIZ(intentLIZLLL).ugcTemplateData.ugcTemplateId = strLIZJ4;
            C0MUK.LIZIZ(intentLIZLLL).ugcTemplateData.ugcTemplateOriginAnchor = anchorCommonStruct2;
            C0MUK.LIZIZ(intentLIZLLL).ugcTemplateData.isUgcTemplateFromAnchor = z2;
            C0MUK.LIZIZ(intentLIZLLL).ugcTemplateData.ugcTemplateTag = LIZJ(intent, "ugc_template_tag");
            C0MUK.LIZIZ(intentLIZLLL).followUpPublishTrackerModel.followUpFirstItemId = C1443560nfW.LJI;
            C0MUK.LIZIZ(intentLIZLLL).followUpPublishTrackerModel.followUpItemIdGroups = C1443560nfW.LJII;
            C0MUK.LIZIZ(intentLIZLLL).followUpPublishTrackerModel.enterRecordFromFeed = true;
            C0MUK.LIZIZ(intentLIZLLL).followUpPublishTrackerModel.followUpPromoId = C1443560nfW.LJIIJJI;
        }
        if (z3) {
            creativeModelLIZIZ.mvModel.templateId = LIZJ(intent, "key_ugc_template_id");
            intentLIZLLL.putExtra("template_type", shortVideoContext.creativeModel.mvModel.templateType);
            intentLIZLLL.putExtra("template_name", LIZJ(intent, "key_ugc_template_name"));
            intentLIZLLL.putExtra("anchor_name", LIZJ(intent, "key_ugc_anchor_name"));
            intentLIZLLL.putExtra("template_tags", LIZJ(intent, "key_ugc_template_tag"));
        }
        if (intExtra4 == 36) {
            z6 = true;
        } else {
            z6 = false;
        }
        C0MUK.LIZIZ(intentLIZLLL).ugcTemplateData.isPUgcTemplateFromAnchor = z6;
        boolean z8 = C0MUK.LIZIZ(intentLIZLLL).pugcTemplateData.isUsingServerMaigc;
        if (intExtra4 == 5 && (iTemplateAlbumService = C523300Kfg.LIZ) != null && (strLJFF = iTemplateAlbumService.LJFF()) != null) {
            ITemplateDetailService iTemplateDetailService2 = C536250L1j.LIZ;
            z8 = iTemplateDetailService2 != null && iTemplateDetailService2.LIZJ(strLJFF);
        }
        if (z2) {
            Serializable serializableExtra2 = intent.getSerializableExtra("key_ugc_template_anchor");
            if ((serializableExtra2 instanceof AnchorCommonStruct) && (anchorCommonStruct = (AnchorCommonStruct) serializableExtra2) != null) {
                List<String> listLIZ = C539530LDz.LIZ(anchorCommonStruct);
                if (listLIZ != null && listLIZ.contains("UGC_MAGIC_V2")) {
                    z8 = true;
                    break;
                }
                ArrayList<TemplateSlot> arrayListLJFF = C539530LDz.LJFF(anchorCommonStruct);
                if (arrayListLJFF != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TemplateSlot templateSlot : arrayListLJFF) {
                        String[] processor = templateSlot.getProcessor();
                        if (processor != null && processor.length != 0) {
                            arrayList.add(templateSlot);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String[] processor2 = ((TemplateSlot) it2.next()).getProcessor();
                        if (processor2 != null && (str = (String) C13LQ.LJJIFFI(processor2)) != null) {
                            try {
                                Uri uri = UriProtector.parse(str);
                                String str11 = (String) C13LP.LJJJLZIJ(0, uri.getPathSegments());
                                Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(queryParameterNames, 10));
                                if (iLIZIZ < 16) {
                                    iLIZIZ = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                                for (Object obj2 : queryParameterNames) {
                                    linkedHashMap.put(obj2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, (String) obj2));
                                }
                                String str12 = (String) linkedHashMap.get("input");
                                if (str12 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str12)) != null) {
                                    iIntValue = numLJIIJJI3.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                String str13 = (String) linkedHashMap.get("output");
                                if (str13 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str13)) != null) {
                                    iIntValue2 = numLJIIJJI2.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                String str14 = (String) linkedHashMap.get("need_server_execute");
                                if (str14 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str14)) != null && numLJIIJJI.intValue() == 1) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                String str15 = (String) linkedHashMap.get("config");
                                if (str15 == null) {
                                    str15 = "";
                                }
                                String str16 = (String) linkedHashMap.get("speed_config");
                                if (str16 == null) {
                                    str16 = "";
                                }
                                SpeedConfig speedConfig = (SpeedConfig) C08JS.LIZIZ().LJIIIIZZ(str16, new TypeToken<SpeedConfig>() { // from class: X.0L2q
                                }.getType());
                                if (speedConfig == null) {
                                    speedConfig = new SpeedConfig(new ArrayList(), 0);
                                }
                                if (str11 == null) {
                                    str11 = "";
                                }
                                processorConfig = new ProcessorConfig(str11, iIntValue, iIntValue2, str15, z7, speedConfig);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                processorConfig = new ProcessorConfig("", 0, 0, "", false, new SpeedConfig(new ArrayList(), 0));
                            }
                            if (processorConfig.needServer) {
                                z8 = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (intent.hasExtra("audio_record_param") && (parcelableExtra = intent.getParcelableExtra("audio_record_param")) != null) {
            intentLIZLLL.putExtra("audio_record_param", parcelableExtra);
        }
        if (intent.hasExtra("voice_volume")) {
            intentLIZLLL.putExtra("voice_volume", intent.getFloatExtra("voice_volume", 1.0f));
        }
        if (z8 && !C533090KvT.LIZIZ.LJFF()) {
            Activity activity = this.LL;
            AwS43S0500000_8 awS43S0500000_8 = new AwS43S0500000_8(this, (C536540L2m) parcelableArrayListExtra, (List<? extends MediaModel>) intent, intentLIZLLL, (Intent) c534170KxD, (C534170KxD) 0);
            String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
            Keva keva = C357770E0x.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("server_rendering_consent_template_");
            sbLIZ.append(currentUserID);
            keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
            final Boolean bool = Boolean.TRUE;
            final AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(awS43S0500000_8, 276);
            if (!C0CHQ.LIZ().getAccountService().isLogin()) {
                C0XPD.LIZIZ(activity, "video_edit_page", "", null, new InterfaceC849390XTt() { // from class: X.0E1H
                    public final /* synthetic */ boolean LIZ = true;

                    @Override // X.InterfaceC849390XTt
                    public final void LIZ() {
                        if (this.LIZ && Intrinsics.LJFF(bool, Boolean.FALSE)) {
                            String currentUserID2 = C0CHQ.LIZ().getAccountService().getCurrentUserID();
                            Keva keva2 = C357770E0x.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("server_rendering_consent_template_");
                            sbLIZ2.append(currentUserID2);
                            keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
                        }
                        awS587S0100000_8.invoke(Boolean.FALSE);
                    }

                    @Override // X.InterfaceC849390XTt
                    public final void LIZIZ() {
                        awS587S0100000_8.invoke(Boolean.TRUE);
                    }
                });
                return;
            }
            Boolean bool2 = Boolean.FALSE;
            if (Intrinsics.LJFF(bool, bool2)) {
                String currentUserID2 = C0CHQ.LIZ().getAccountService().getCurrentUserID();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("server_rendering_consent_template_");
                sbLIZ2.append(currentUserID2);
                keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
            }
            awS587S0100000_8.invoke(bool2);
            return;
        }
        LJ().LIZIZ(parcelableArrayListExtra, intent, intentLIZLLL, c534170KxD, null);
    }

    public C536540L2m(long j, long j2, Activity activity, C1DRG c1drg) {
        this.LL = activity;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = c1drg;
        this.LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 297));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent LIZLLL(android.app.Activity r7, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r8, int r9, long r10, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536540L2m.LIZLLL(android.app.Activity, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, int, long, java.lang.String):android.content.Intent");
    }
}
