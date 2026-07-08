package X;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.FusedMusic;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ui.EPTemplateInfo;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.model.SummaryData;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.template.ICAssetInfo;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mO8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394340mO8 {
    public static final C1394340mO8 LIZ = new C1394340mO8();

    public static String LIZLLL(String str) {
        boolean z;
        CreativeToolsPluginService creativeToolsPluginService;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
            C844470XAv.LIZ.getClass();
            if (creativeToolsPluginService.LJI(C844470XAv.LIZ()) && str != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(NLEEditorJniJNI.NLEMusicResourceProtocol_KEY_CLIP_ID());
                sbLIZ.append('=');
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{C2188811AlT.LIZIZ(sbLIZ)}, 0, 6);
                if (listLJJLIIIJILLIZJL != null && listLJJLIIIJILLIZJL.size() > 1 && C123100dR.LIZ((String) ListProtector.get(listLJJLIIIJILLIZJL, 1))) {
                    return (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
                }
            }
            return null;
        }
        return null;
    }

    public static final Map<String, String> LJ(AnchorCommonStruct anchorCommonStruct) {
        String id;
        String strSubType;
        String str;
        Pair[] pairArr = new Pair[2];
        String strSubType2 = null;
        if (anchorCommonStruct != null) {
            id = anchorCommonStruct.getId();
        } else {
            id = null;
        }
        pairArr[0] = new Pair("tt_template_id", id);
        if (anchorCommonStruct != null) {
            strSubType = anchorCommonStruct.subType();
        } else {
            strSubType = null;
        }
        pairArr[1] = new Pair("tt_template_type", strSubType);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (anchorCommonStruct != null) {
            strSubType2 = anchorCommonStruct.subType();
        }
        if (Intrinsics.LJFF(strSubType2, "sgt") && (str = (String) ListProtector.get(C0LEI.LIZIZ(anchorCommonStruct.getExtra(), "template_tier_type"), 0)) != null && str.length() != 0) {
            mapLJIIJ.put("template_tier_type", str);
        }
        return mapLJIIJ;
    }

    public static String LJI(AnchorCommonStruct anchorCommonStruct) {
        String extra = anchorCommonStruct.getExtra();
        if (extra != null) {
            try {
                new p();
                if (Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), p.LIZJ(extra).LJIILIIL().LJJIIZ("author_id").LJIL())) {
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static final C1394430mOH<String, String, Boolean> LJII(AnchorCommonStruct anchorCommonStruct) {
        boolean zLJ;
        if (anchorCommonStruct == null) {
            return null;
        }
        try {
            new p();
            n nVarLJIILIIL = p.LIZJ(anchorCommonStruct.getExtra()).LJIILIIL();
            String strLJIL = nVarLJIILIIL.LJJIIZ("icon").LJIL();
            String strLJIL2 = nVarLJIILIIL.LJJIIZ("title").LJIL();
            if (nVarLJIILIIL.LJJIJIIJIL("is_commerce_music")) {
                zLJ = nVarLJIILIIL.LJJIIZ("is_commerce_music").LJ();
            } else {
                zLJ = false;
            }
            return new C1394430mOH<>(strLJIL, strLJIL2, Boolean.valueOf(zLJ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LJIIIIZZ(AnchorCommonStruct anchorCommonStruct) {
        if (!((Boolean) C0B7Q.LIZ.getValue()).booleanValue() || anchorCommonStruct == null || anchorCommonStruct.getType() != EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
            return null;
        }
        try {
            String extra = anchorCommonStruct.getExtra();
            new p();
            String strLJIL = p.LIZJ(extra).LJIILIIL().LJJIIZ("nle_extra").LJIL();
            if (C2105908Mv.LIZ(strLJIL)) {
                return null;
            }
            new p();
            String strLJIL2 = p.LIZJ(strLJIL).LJIILIIL().LJJIIZ("ai_template_func_list").LJIL();
            if (C2105908Mv.LIZ(strLJIL2)) {
                return null;
            }
            return strLJIL2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static final MusicInfo LJIIIZ(Aweme aweme) {
        MusicInfo musicInfo;
        float f;
        ?? arrayList;
        MusicFusion musicFusion;
        List<FusedMusic> list;
        double dDoubleValue;
        Music music = aweme.getMusic();
        Long lValueOf = null;
        if (music == null) {
            return null;
        }
        try {
            String strValueOf = String.valueOf(music.getId());
            int musicBeginTime = aweme.getMusicBeginTime();
            String musicVolume = aweme.getMusicVolume();
            if (musicVolume != null) {
                f = CastFloatProtector.parseFloat(musicVolume) / 50;
            } else {
                f = 1.0f;
            }
            Music music2 = aweme.getMusic();
            if (music2 != null && (musicFusion = music2.getMusicFusion()) != null && (list = musicFusion.fusedMusicInfos) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (FusedMusic fusedMusic : list) {
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parseAwemeMusicInfo: fusedMusic: volume = ");
                    sbLIZ.append(fusedMusic.volume);
                    C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                    int i = fusedMusic.index;
                    long j = fusedMusic.startTimeInMs;
                    long j2 = fusedMusic.endTimeInMs;
                    Music music3 = fusedMusic.music;
                    if (music3 != null) {
                        lValueOf = Long.valueOf(music3.getId());
                    }
                    String strValueOf2 = String.valueOf(lValueOf);
                    long j3 = fusedMusic.playStartTimeInMs;
                    boolean zIsMainSong = fusedMusic.isMainSong();
                    Double d = fusedMusic.volume;
                    if (d != null) {
                        dDoubleValue = d.doubleValue() / ((double) 50);
                    } else {
                        dDoubleValue = 1.0d;
                    }
                    arrayList.add(new com.ss.android.ugc.aweme.creative.model.FusedMusic(i, j, j2, strValueOf2, j3, zIsMainSong, Double.valueOf(dDoubleValue)));
                    lValueOf = null;
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            musicInfo = new MusicInfo(strValueOf, musicBeginTime, f, arrayList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("parseAwemeMusicInfo: ");
            sbLIZ2.append(Log.getStackTraceString(e));
            C201955140j.LJII(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
            musicInfo = null;
        }
        C201955140j.LJIILJJIL(C1398350mUb.LIZIZ, "parseAwemeMusicInfo: " + GsonProtectorUtils.toJson(C08JS.LIZIZ(), musicInfo));
        return musicInfo;
    }

    public static final EPTemplateInfo LJIIJ(AnchorCommonStruct anchorCommonStruct) {
        LIZ.getClass();
        Pair pairLJIILLIIL = LJIILLIIL(anchorCommonStruct);
        Object first = pairLJIILLIIL.getFirst();
        String str = (String) pairLJIILLIIL.getSecond();
        boolean z = false;
        if (first == null && str == null) {
            return new EPTemplateInfo(false, null, 3, null);
        }
        if (Intrinsics.LJFF(first, "1") || C123100dR.LIZ(str)) {
            z = true;
        }
        if (str == null) {
            str = "";
        }
        return new EPTemplateInfo(z, str);
    }

    public static final String LJIIJJI(AnchorCommonStruct anchorCommonStruct) {
        String strLJIL = null;
        if (anchorCommonStruct == null) {
            return null;
        }
        try {
            new p();
            strLJIL = p.LIZJ(anchorCommonStruct.getExtra()).LJIILIIL().LJJIIZ("music_id").LJIL();
            return strLJIL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJIL;
        }
    }

    public static final MusicInfo LJIILIIL(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        CreativeToolsPluginService creativeToolsPluginService;
        if (anchorCommonStruct == null) {
            return null;
        }
        try {
            new p();
            n nVarLJIILIIL = p.LIZJ(anchorCommonStruct.getExtra()).LJIILIIL();
            String strLJIL = nVarLJIILIIL.LJJIIZ("music_id").LJIL();
            new p();
            List listLJ = C08JS.LJ(TemplateSlot[].class, p.LIZJ(nVarLJIILIIL.LJJIIZ("nle_summary").LJIL()).LJIILIIL().LJJIIZ("slots").LJIL());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJ) {
                TemplateSlot templateSlot = (TemplateSlot) obj;
                if (Intrinsics.LJFF(templateSlot.getType(), "audio") && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
                    C844470XAv.LIZ.getClass();
                    if (creativeToolsPluginService.LJI(C844470XAv.LIZ()) && NLEEditorJniJNI.NLEMusicResourceProtocol_isMusicResource(templateSlot.getSource())) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() == 1 && C123100dR.LIZ(strLJIL)) {
                return new MusicInfo(strLJIL, (int) (((TemplateSlot) arrayList.get(0)).getClipStart() * ((double) LSPassThroughRecordSizeConfig.DEFAULT)), 0.0f, null, 12, null);
            }
            if (C1394440mOI.LJ(anchorCommonStruct) == EnumC1394470mOL.AIGT || C1394440mOI.LJ(anchorCommonStruct) == EnumC1394470mOL.SGT) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Object obj2 : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    TemplateSlot templateSlot2 = (TemplateSlot) obj2;
                    double clipStart = templateSlot2.getClipStart();
                    double d = LSPassThroughRecordSizeConfig.DEFAULT;
                    long j = (long) (clipStart * d);
                    long clipEnd = (long) (templateSlot2.getClipEnd() * d);
                    C1394340mO8 c1394340mO8 = LIZ;
                    String source = templateSlot2.getSource();
                    c1394340mO8.getClass();
                    String strLIZLLL = LIZLLL(source);
                    if (strLIZLLL == null) {
                        strLIZLLL = "";
                    }
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList2.add(new com.ss.android.ugc.aweme.creative.model.FusedMusic(i, j, clipEnd, strLIZLLL, (long) (d * templateSlot2.getStartTime()), z, Double.valueOf(1.0d)));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return new MusicInfo(strLJIL, 0, 0.0f, arrayList2, 6, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseTemplateMusicInfo failed: ");
            sbLIZ.append(Log.getStackTraceString(e));
            C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static String LJIILL(Integer num) {
        int value = EnumC1394360mOA.VISIBLE_FOR_STATUS_NORMAL.getValue();
        if (num != null && num.intValue() == value) {
            return EnumC1394350mO9.VISIBLE_FOR_STATUS_NORMAL.getValue();
        }
        int value2 = EnumC1394360mOA.INVISIBLE_FOR_FEATURE_BEATS_UNSUPPORTED.getValue();
        if (num != null && num.intValue() == value2) {
            return EnumC1394350mO9.INVISIBLE_FOR_FEATURE_BEATS_UNSUPPORTED.getValue();
        }
        int value3 = EnumC1394360mOA.INVISIBLE_FOR_TEMPLATE_ANCHOR_STATUS.getValue();
        if (num != null && num.intValue() == value3) {
            return EnumC1394350mO9.INVISIBLE_FOR_TEMPLATE_ANCHOR_STATUS.getValue();
        }
        int value4 = EnumC1394360mOA.INVISIBLE_FOR_AB.getValue();
        if (num != null && num.intValue() == value4) {
            return EnumC1394350mO9.INVISIBLE_FOR_AB.getValue();
        }
        int value5 = EnumC1394360mOA.INVISIBLE_FOR_COMMERCE_ACCOUNT.getValue();
        if (num != null && num.intValue() == value5) {
            return EnumC1394350mO9.INVISIBLE_FOR_COMMERCE_ACCOUNT.getValue();
        }
        int value6 = EnumC1394360mOA.INVISIBLE_FOR_NOT_GOT_FEATURE_BITS.getValue();
        if (num != null && num.intValue() == value6) {
            return EnumC1394350mO9.INVISIBLE_FOR_NOT_GOT_FEATURE_BITS.getValue();
        }
        int value7 = EnumC1394360mOA.INVISIBLE_FOR_NO_FILTER_INFO.getValue();
        if (num != null && num.intValue() == value7) {
            return EnumC1394350mO9.INVISIBLE_FOR_NO_FILTER_INFO.getValue();
        }
        int value8 = EnumC1394360mOA.INVISIBLE_FOR_OTHER_REASON.getValue();
        if (num != null && num.intValue() == value8) {
            return EnumC1394350mO9.INVISIBLE_FOR_OTHER_REASON.getValue();
        }
        return EnumC1394350mO9.INVISIBLE_FOR_OTHER_REASON.getValue();
    }

    public static Pair LJIILLIIL(AnchorCommonStruct anchorCommonStruct) {
        String strLJIL;
        String strLJIL2;
        if (anchorCommonStruct == null) {
            return new Pair(null, null);
        }
        if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE()) {
            String extra = anchorCommonStruct.getExtra();
            if (C123100dR.LIZ(extra)) {
                try {
                    new p();
                    n nVarLJIILIIL = p.LIZJ(extra).LJIILIIL();
                    k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("is_use_editor_pro_template");
                    if (kVarLJJIIZ != null) {
                        strLJIL = kVarLJJIIZ.LJIL();
                    } else {
                        strLJIL = null;
                    }
                    k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("template_used_functions");
                    if (kVarLJJIIZ2 != null) {
                        strLJIL2 = kVarLJJIIZ2.LJIL();
                    } else {
                        strLJIL2 = null;
                    }
                    return new Pair(strLJIL, strLJIL2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return new Pair(null, null);
    }

    public static final C1387380mCu LJIIZILJ(Aweme aweme) {
        String str;
        ICAssetInfo iCAssetInfo;
        if (aweme != null && aweme.getAnchors() != null) {
            try {
                if (aweme.getAnchors().size() > 0) {
                    for (AnchorCommonStruct anchorCommonStruct : aweme.getAnchors()) {
                        if (C1394440mOI.LIZJ(anchorCommonStruct.getType()) || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE()) {
                            LIZ.getClass();
                            int iLJIJ = LJIJ(anchorCommonStruct, aweme);
                            String strSubType = anchorCommonStruct.subType();
                            String id = anchorCommonStruct.getId();
                            Pair pairLJIILLIIL = LJIILLIIL(anchorCommonStruct);
                            String str2 = (String) pairLJIILLIIL.getFirst();
                            String str3 = (String) pairLJIILLIIL.getSecond();
                            String strLJFF = LJFF(anchorCommonStruct, aweme);
                            String strLJI = LJI(anchorCommonStruct);
                            String strValueOf = String.valueOf(anchorCommonStruct.getType());
                            C1394490mON c1394490mONLIZLLL = C1394440mOI.LIZLLL(anchorCommonStruct);
                            String str4 = null;
                            String str5 = "";
                            if (strLJFF == null) {
                                str = null;
                                strLJFF = null;
                            } else if (strLJFF.length() == 0) {
                                str = "1";
                                strLJFF = "";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                            String strLJIILL = LJIILL(Integer.valueOf(iLJIJ));
                            ICAssetInfo[] templateAssetInfo = aweme.getTemplateAssetInfo();
                            if (templateAssetInfo != null && (iCAssetInfo = (ICAssetInfo) C13LQ.LJJIFFI(templateAssetInfo)) != null && (str4 = iCAssetInfo.extra) != null) {
                                Long l = iCAssetInfo.resourceId;
                                if (l == null || (id = l.toString()) == null) {
                                    id = "";
                                }
                                List<String> listLIZIZ = C0LEI.LIZIZ(str4, "dispatch_type", "template_type");
                                String str6 = (String) ListProtector.get(listLIZIZ, 0);
                                strSubType = (String) ListProtector.get(listLIZIZ, 1);
                                if (str6 != null) {
                                    c1394490mONLIZLLL = new C1394490mON(str6);
                                }
                                if (strSubType == null) {
                                    strSubType = "";
                                }
                            }
                            String strValueOf2 = String.valueOf(iLJIJ);
                            String strLJIIIIZZ = LJIIIIZZ(anchorCommonStruct);
                            if (strLJIIIIZZ != null) {
                                str5 = strLJIIIIZZ;
                            }
                            return new C1387380mCu(str2, str3, strSubType, id, str, strLJFF, strLJI, strValueOf, strValueOf2, strLJIILL, str4, c1394490mONLIZLLL, str5);
                        }
                    }
                }
                return new C1387380mCu(null, null, null, null, null, null, 8191);
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                return new C1387380mCu(null, null, null, null, null, null, 8191);
            }
        }
        return new C1387380mCu(null, null, null, null, null, null, 8191);
    }

    public static final C2344009Gk LIZJ(C2344009Gk c2344009Gk, AnchorCommonStruct anchorCommonStruct) {
        String str;
        if (anchorCommonStruct == null) {
            return c2344009Gk;
        }
        c2344009Gk.LJFF("tt_template_type", anchorCommonStruct.subType());
        c2344009Gk.LJFF("tt_template_id", anchorCommonStruct.getId());
        LIZ.getClass();
        String strLJIIIIZZ = LJIIIIZZ(anchorCommonStruct);
        if (strLJIIIIZZ == null) {
            strLJIIIIZZ = "";
        }
        c2344009Gk.LJFF("ai_template_func_list", strLJIIIIZZ);
        if (Intrinsics.LJFF(anchorCommonStruct.subType(), "sgt") && (str = (String) ListProtector.get(C0LEI.LIZIZ(anchorCommonStruct.getExtra(), "template_tier_type"), 0)) != null && str.length() != 0) {
            c2344009Gk.LJFF("template_tier_type", str);
        }
        return c2344009Gk;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJFF(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r16, com.ss.android.ugc.aweme.feed.model.Aweme r17) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1394340mO8.LJFF(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public static final ShootExtraData LJIIL(Aweme aweme, Activity activity) {
        Intent intent;
        Intent intent2;
        LIZ.getClass();
        MusicDetailCommonModel musicDetailCommonModel = MusicDetailCommonModel.INSTANCE;
        Intent intent3 = null;
        if (activity != null) {
            intent = activity.getIntent();
        } else {
            intent = null;
        }
        int iIsFromFollowupSquareOriginalVideoInnerFeed = musicDetailCommonModel.isFromFollowupSquareOriginalVideoInnerFeed(aweme, intent, true);
        if (!C636090OxD.LIZ()) {
            ShootExtraData shootExtraData = new ShootExtraData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
            shootExtraData.setFromFollowupSquareOriginalVideo(String.valueOf(iIsFromFollowupSquareOriginalVideoInnerFeed));
            return shootExtraData;
        }
        if (activity != null) {
            intent2 = activity.getIntent();
        } else {
            intent2 = null;
        }
        String strCurSquareActionPositionOnInnerFeed = musicDetailCommonModel.curSquareActionPositionOnInnerFeed(aweme, intent2);
        if (strCurSquareActionPositionOnInnerFeed.length() == 0) {
            return null;
        }
        if (activity != null) {
            intent3 = activity.getIntent();
        }
        String strSquareRecTypeInnerFeed = musicDetailCommonModel.squareRecTypeInnerFeed(aweme, intent3);
        String strSquareRecReasonInnerFeed = musicDetailCommonModel.squareRecReasonInnerFeed(aweme, activity);
        ShootExtraData shootExtraData2 = new ShootExtraData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
        shootExtraData2.setFollowupSquareActionPosition(strCurSquareActionPositionOnInnerFeed);
        shootExtraData2.setFromFollowupSquareOriginalVideo(String.valueOf(iIsFromFollowupSquareOriginalVideoInnerFeed));
        shootExtraData2.setFollowupSquareRecommendType(strSquareRecTypeInnerFeed);
        shootExtraData2.setFollowupSquareRecommendReason(strSquareRecReasonInnerFeed);
        return shootExtraData2;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJIJ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r17, com.ss.android.ugc.aweme.feed.model.Aweme r18) {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1394340mO8.LJIJ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, com.ss.android.ugc.aweme.feed.model.Aweme):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r13, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1394340mO8.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, java.lang.String):java.lang.Integer");
    }

    public static final void LIZIZ(C2344009Gk c2344009Gk, Aweme aweme, Activity activity) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        String stringExtra;
        String stringExtra2;
        String aid;
        String strCarryMetaSongId;
        String idStr;
        Music music;
        Music music2;
        Music music3;
        Intent intent4;
        Intent intent5;
        MusicDetailCommonModel musicDetailCommonModel = MusicDetailCommonModel.INSTANCE;
        String strCarryTemplateId = null;
        if (activity != null) {
            intent = activity.getIntent();
        } else {
            intent = null;
        }
        c2344009Gk.LIZJ(musicDetailCommonModel.isFromFollowupSquareOriginalVideoInnerFeed(aweme, intent, true), "is_from_followup_square_original_video");
        if (!C636090OxD.LIZ()) {
            return;
        }
        if (activity != null) {
            intent2 = activity.getIntent();
        } else {
            intent2 = null;
        }
        String strCurSquareActionPositionOnInnerFeed = musicDetailCommonModel.curSquareActionPositionOnInnerFeed(aweme, intent2);
        if (strCurSquareActionPositionOnInnerFeed != null && strCurSquareActionPositionOnInnerFeed.length() != 0) {
            if (activity != null) {
                intent3 = activity.getIntent();
            } else {
                intent3 = null;
            }
            String strSquareRecTypeInnerFeed = musicDetailCommonModel.squareRecTypeInnerFeed(aweme, intent3);
            String strSquareRecReasonInnerFeed = musicDetailCommonModel.squareRecReasonInnerFeed(aweme, activity);
            if (activity != null && (intent5 = activity.getIntent()) != null) {
                try {
                    stringExtra = intent5.getStringExtra("shoot_way");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
            } else {
                stringExtra = null;
            }
            if (activity != null && (intent4 = activity.getIntent()) != null) {
                try {
                    stringExtra2 = intent4.getStringExtra("music_selected_from");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    stringExtra2 = null;
                }
            } else {
                stringExtra2 = null;
            }
            c2344009Gk.LJFF("followup_square_action_position", strCurSquareActionPositionOnInnerFeed);
            c2344009Gk.LJFF("followup_square_recommend_type", strSquareRecTypeInnerFeed);
            c2344009Gk.LJFF("followup_square_recommend_reason", strSquareRecReasonInnerFeed);
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJFF("last_group_id", aid);
            if (aweme != null && (music3 = aweme.getMusic()) != null) {
                strCarryMetaSongId = music3.carryMetaSongId();
            } else {
                strCarryMetaSongId = null;
            }
            c2344009Gk.LJFF("meta_song_id", strCarryMetaSongId);
            if (aweme != null && (music2 = aweme.getMusic()) != null) {
                idStr = music2.getIdStr();
            } else {
                idStr = null;
            }
            c2344009Gk.LJFF("music_id", idStr);
            if (aweme != null && (music = aweme.getMusic()) != null) {
                strCarryTemplateId = music.carryTemplateId();
            }
            c2344009Gk.LJFF("tt_template_id", strCarryTemplateId);
            c2344009Gk.LJFF("enter_from", "music_detail");
            c2344009Gk.LJFF("shoot_way", stringExtra);
            c2344009Gk.LJFF("music_selected_from", stringExtra2);
        }
    }

    public static UgcTemplateAlbumConfig LJIILJJIL(AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, String str3, AsyncAVService asyncAVService) {
        MusicModel musicModelConvertToMusicModel;
        UgcTemplateAlbumConfig ugcTemplateAlbumConfig = new UgcTemplateAlbumConfig();
        Music music = aweme.getMusic();
        if (music != null) {
            musicModelConvertToMusicModel = music.convertToMusicModel();
        } else {
            musicModelConvertToMusicModel = null;
        }
        ugcTemplateAlbumConfig.setMusicModel(musicModelConvertToMusicModel);
        SummaryData summaryDataResolveNLESummary = asyncAVService.uiService().videoTemplateService().resolveNLESummary(GsonProtectorUtils.parse(new p(), anchorCommonStruct.getExtra()).LJIILIIL().LJJIIZ("nle_summary").LJIL());
        TemplateSlot templateSlot = summaryDataResolveNLESummary.audioSlot;
        if (templateSlot != null) {
            double clipStart = templateSlot.getClipStart();
            double d = LSPassThroughRecordSizeConfig.DEFAULT;
            ugcTemplateAlbumConfig.setMusicStart((int) (clipStart * d));
            ugcTemplateAlbumConfig.setMusicEnd((int) (templateSlot.getClipEnd() * d));
        }
        ugcTemplateAlbumConfig.setMusicSlot(summaryDataResolveNLESummary.audioSlot);
        List<TemplateSlot> second = asyncAVService.uiService().videoTemplateService().tryToSameAssetSlots(asyncAVService.uiService().videoTemplateService().tryToFreezeAssetSlots(summaryDataResolveNLESummary.slots).getSecond(), false).getSecond();
        ugcTemplateAlbumConfig.getSlotList().addAll(second);
        ArrayList<Float> clipDurations = ugcTemplateAlbumConfig.getClipDurations();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(second, 10));
        Iterator<TemplateSlot> it2 = second.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf((float) it2.next().getDuration()));
        }
        clipDurations.addAll(arrayList);
        ugcTemplateAlbumConfig.setAnchor(anchorCommonStruct);
        ugcTemplateAlbumConfig.setTemplateId(anchorCommonStruct.getId());
        ugcTemplateAlbumConfig.setCreativeInfo(new CreativeInfo(null, 0, null, 7, null));
        ugcTemplateAlbumConfig.setMainAnchorType(str3);
        ugcTemplateAlbumConfig.setTtTemplateType(anchorCommonStruct.subType());
        ugcTemplateAlbumConfig.setEpTemplateInfo(LJIIJ(anchorCommonStruct));
        ugcTemplateAlbumConfig.setShootWay("ugc_template");
        ugcTemplateAlbumConfig.setEnterMethod(str);
        ugcTemplateAlbumConfig.setRelationEnterMethod(str2);
        ugcTemplateAlbumConfig.setHasMagic(asyncAVService.uiService().videoTemplateService().hasMagic(summaryDataResolveNLESummary.featuresList));
        ugcTemplateAlbumConfig.setFeatureList(summaryDataResolveNLESummary.featuresList);
        ugcTemplateAlbumConfig.setAwemeMusicInfo(LJIIIZ(aweme));
        ugcTemplateAlbumConfig.setTemplateMusicInfo(LJIILIIL(anchorCommonStruct));
        ugcTemplateAlbumConfig.setTemplateMusicId(LJIIJJI(anchorCommonStruct));
        return ugcTemplateAlbumConfig;
    }
}
