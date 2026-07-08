package X;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.DiffEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13LD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LD {
    public static final C13LD LIZ = new C13LD();

    public static void LIZIZ(EffectChannelModel effectChannelModel) {
        LJIILLIIL(effectChannelModel.getUrl_prefix(), effectChannelModel.getEffect_list());
        LJIILLIIL(effectChannelModel.getUrl_prefix(), effectChannelModel.getCollection_list());
    }

    public static String LJFF(ProviderEffect providerEffect) {
        String url;
        String video_360p_url;
        String video_480p_url;
        String video_720p_url;
        String video_1080p_url;
        if (Intrinsics.LJFF(providerEffect.getMedia_source(), String.valueOf(EnumC0314008y.TopTiktok.ordinal() + 1))) {
            ProviderEffect.Video video = providerEffect.getVideo();
            if (video == null) {
                return null;
            }
            return video.getVideo_toptiktok_url();
        }
        Integer library_material_type = providerEffect.getLibrary_material_type();
        int typeOrdinal = ProviderEffect.MaterialType.VIDEO_CLIP.getTypeOrdinal();
        if (library_material_type != null && library_material_type.intValue() == typeOrdinal) {
            ProviderEffect.Video video2 = providerEffect.getVideo();
            if (video2 != null && (video_1080p_url = video2.getVideo_1080p_url()) != null && !a0.LJJJIL(video_1080p_url)) {
                ProviderEffect.Video video3 = providerEffect.getVideo();
                if (video3 == null) {
                    return null;
                }
                return video3.getVideo_1080p_url();
            }
            ProviderEffect.Video video4 = providerEffect.getVideo();
            if (video4 != null && (video_720p_url = video4.getVideo_720p_url()) != null && !a0.LJJJIL(video_720p_url)) {
                ProviderEffect.Video video5 = providerEffect.getVideo();
                if (video5 == null) {
                    return null;
                }
                return video5.getVideo_720p_url();
            }
            ProviderEffect.Video video6 = providerEffect.getVideo();
            if (video6 != null && (video_480p_url = video6.getVideo_480p_url()) != null && !a0.LJJJIL(video_480p_url)) {
                ProviderEffect.Video video7 = providerEffect.getVideo();
                if (video7 == null) {
                    return null;
                }
                return video7.getVideo_480p_url();
            }
            ProviderEffect.Video video8 = providerEffect.getVideo();
            if (video8 == null || (video_360p_url = video8.getVideo_360p_url()) == null || a0.LJJJIL(video_360p_url)) {
                return "";
            }
            ProviderEffect.Video video9 = providerEffect.getVideo();
            if (video9 == null) {
                return null;
            }
            return video9.getVideo_360p_url();
        }
        Integer library_material_type2 = providerEffect.getLibrary_material_type();
        int typeOrdinal2 = ProviderEffect.MaterialType.GIF.getTypeOrdinal();
        if (library_material_type2 != null && library_material_type2.intValue() == typeOrdinal2) {
            String material_mp4_url = providerEffect.getMaterial_mp4_url();
            if (material_mp4_url == null) {
                return "";
            }
            return material_mp4_url;
        }
        ProviderEffect.StickerBean sticker_info = providerEffect.getSticker_info();
        if (sticker_info == null || (url = sticker_info.getUrl()) == null) {
            return "";
        }
        return url;
    }

    public static boolean LJI(Effect effect) {
        UrlModel base_url;
        if (effect == null) {
            return false;
        }
        if (EffectKt.containDiffInfo(effect)) {
            DiffEffect file_diff = effect.getFile_diff();
            UrlModel diff_url = null;
            if (file_diff != null) {
                base_url = file_diff.getBase_url();
            } else {
                base_url = null;
            }
            DiffEffect file_diff2 = effect.getFile_diff();
            if (file_diff2 != null) {
                diff_url = file_diff2.getDiff_url();
            }
            if (base_url == null || diff_url == null || LJII(base_url) || LJII(diff_url)) {
                return false;
            }
            return true;
        }
        return !LJII(effect.getFile_url());
    }

    public static boolean LJII(UrlModel urlModel) {
        List<String> urlList;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()) {
            return true;
        }
        return false;
    }

    public static List LIZ(String str, List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r4, java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13LD.LJIIIIZZ(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect, java.lang.String):void");
    }

    public static void LJIIIZ(String str, List list) {
        String md5;
        UrlModel diff_url;
        if (list == null) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Effect effect = (Effect) it2.next();
            DiffEffect file_diff = effect.getFile_diff();
            if (file_diff != null && (diff_url = file_diff.getDiff_url()) != null) {
                md5 = diff_url.getMd5();
            } else {
                md5 = null;
            }
            if (EffectKt.containDiffInfo(effect) && !C504670Jqj.LIZIZ(md5)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                String str2 = C13SB.LIZ;
                sbLIZ.append(str2);
                sbLIZ.append(md5);
                sbLIZ.append(".zip");
                effect.setZipPath(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(str2);
                sbLIZ2.append(md5);
                effect.setUnzipPath(C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                String str3 = C13SB.LIZ;
                sbLIZ3.append(str3);
                sbLIZ3.append(u.LJJIFFI(u.LJJIFFI(effect.getId(), "\"", "_", false), "/", "_", false));
                sbLIZ3.append(".zip");
                effect.setZipPath(C2188811AlT.LIZIZ(sbLIZ3));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append(str3);
                sbLIZ4.append(u.LJJIFFI(u.LJJIFFI(effect.getId(), "\"", "_", false), "/", "_", false));
                effect.setUnzipPath(C2188811AlT.LIZIZ(sbLIZ4));
            }
            LJIIL(effect, str);
        }
    }

    public static void LJIIJJI(String str, List list) {
        if (list == null) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Effect effect = (Effect) it2.next();
            if (!C504670Jqj.LIZIZ(str)) {
                effect.setRecId(str);
            }
        }
    }

    public static void LJIIL(Effect effect, String str) {
        String uri;
        UrlModel trans_file_url = effect.getTrans_file_url();
        if (trans_file_url != null && (uri = trans_file_url.getUri()) != null && !a0.LJJJIL(uri)) {
            String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(effect.getId(), "\"", "_", false), "/", "_", false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(C13SB.LIZ);
            sbLIZ.append(strLJJIFFI);
            sbLIZ.append("_trans_");
            sbLIZ.append(uri);
            effect.setTransResPath(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static boolean LJIILL(Effect effect, List list) {
        List url_prefix;
        List url_prefix2;
        List url_prefix3;
        Integer url_sub_type;
        Integer url_sub_type2;
        Integer url_sub_type3;
        if (effect.getFile_url().getUrl_sub_type() == null || ((url_sub_type3 = effect.getFile_url().getUrl_sub_type()) != null && url_sub_type3.intValue() == 0)) {
            if (effect.getFile_url().getUri() != null) {
                if (effect.getFile_url().getUrl_prefix() != null && (!r0.isEmpty())) {
                    url_prefix = effect.getFile_url().getUrl_prefix();
                } else {
                    url_prefix = list;
                }
                if (url_prefix != null && !url_prefix.isEmpty()) {
                    UrlModel file_url = effect.getFile_url();
                    C13LD c13ld = LIZ;
                    String uri = effect.getFile_url().getUri();
                    c13ld.getClass();
                    List<String> listLIZ = LIZ(uri, url_prefix);
                    if (listLIZ == null) {
                        listLIZ = new ArrayList<>();
                    }
                    file_url.setUrlList(listLIZ);
                }
            } else {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("effect ");
                sbLIZ.append(effect.getId());
                sbLIZ.append(" file uri is null");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZIZ("EffectUtils", strLIZIZ, null);
            }
        }
        if (effect.getIcon_url().getUrl_sub_type() == null || ((url_sub_type2 = effect.getIcon_url().getUrl_sub_type()) != null && url_sub_type2.intValue() == 0)) {
            if (effect.getIcon_url().getUri() != null) {
                if (effect.getIcon_url().getUrl_prefix() != null && (!r0.isEmpty())) {
                    url_prefix2 = effect.getIcon_url().getUrl_prefix();
                } else {
                    url_prefix2 = list;
                }
                if (url_prefix2 != null && !url_prefix2.isEmpty()) {
                    UrlModel icon_url = effect.getIcon_url();
                    C13LD c13ld2 = LIZ;
                    String uri2 = effect.getIcon_url().getUri();
                    c13ld2.getClass();
                    List<String> listLIZ2 = LIZ(uri2, url_prefix2);
                    if (listLIZ2 == null) {
                        listLIZ2 = new ArrayList<>();
                    }
                    icon_url.setUrlList(listLIZ2);
                }
            } else {
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("effect ");
                sbLIZ2.append(effect.getId());
                sbLIZ2.append(" icon uri is null");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss2.getClass();
                C13SS.LIZIZ("EffectUtils", strLIZIZ2, null);
            }
        }
        List<String> urlList = effect.getHint_icon().getUrlList();
        if (urlList != null && !urlList.isEmpty() && (effect.getHint_icon().getUrl_sub_type() == null || ((url_sub_type = effect.getHint_icon().getUrl_sub_type()) != null && url_sub_type.intValue() == 0))) {
            if (effect.getHint_icon().getUrl_prefix() != null && (!r0.isEmpty())) {
                url_prefix3 = effect.getHint_icon().getUrl_prefix();
            } else {
                url_prefix3 = list;
            }
            if (url_prefix3 != null && !url_prefix3.isEmpty()) {
                UrlModel hint_icon = effect.getHint_icon();
                List<String> listLIZ3 = LIZ(effect.getHint_icon().getUri(), url_prefix3);
                if (listLIZ3 == null) {
                    listLIZ3 = new ArrayList<>();
                }
                hint_icon.setUrlList(listLIZ3);
            }
        }
        UrlModel trans_file_url = effect.getTrans_file_url();
        if (trans_file_url != null) {
            String uri3 = trans_file_url.getUri();
            if (uri3 == null || a0.LJJJIL(uri3)) {
                return true;
            }
            C13LD c13ld3 = LIZ;
            String uri4 = trans_file_url.getUri();
            c13ld3.getClass();
            List<String> listLIZ4 = LIZ(uri4, list);
            if (listLIZ4 != null) {
                trans_file_url.setUrlList(listLIZ4);
            }
        }
        return false;
    }

    public static void LJIILLIIL(List list, List list2) {
        if (list2 == null) {
            return;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext() && !LJIILL((Effect) it2.next(), list)) {
        }
    }

    public static void LJIIJ(Effect effect, String str, String str2, String str3) {
        String md5;
        UrlModel diff_url;
        DiffEffect file_diff = effect.getFile_diff();
        if (file_diff != null && (diff_url = file_diff.getDiff_url()) != null) {
            md5 = diff_url.getMd5();
        } else {
            md5 = null;
        }
        if (EffectKt.containDiffInfo(effect) && !C504670Jqj.LIZIZ(md5)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            String str4 = C13SB.LIZ;
            sbLIZ.append(str4);
            sbLIZ.append(md5);
            sbLIZ.append(".zip");
            effect.setZipPath(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str4);
            sbLIZ2.append(md5);
            effect.setUnzipPath(C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            String str5 = C13SB.LIZ;
            sbLIZ3.append(str5);
            sbLIZ3.append(effect.getId());
            sbLIZ3.append(".zip");
            effect.setZipPath(C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append(str5);
            sbLIZ4.append(effect.getId());
            effect.setUnzipPath(C2188811AlT.LIZIZ(sbLIZ4));
        }
        if (str2 == null) {
            str2 = "";
        }
        effect.setPanel(str2);
        effect.setLogId(str3);
        LJIIL(effect, str);
    }

    public static void LJIILIIL(String str, String str2, String str3, List list) {
        if (list == null) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LJIIJ((Effect) it2.next(), str, str2, str3);
        }
    }

    public static void LIZJ(C13RD c13rd, String str, CategoryPageModel categoryPageModel, boolean z, String str2) {
        String rec_id;
        List<Effect> category_effects;
        List<Effect> collection;
        CategoryEffectModel category_effects2 = categoryPageModel.getCategory_effects();
        if (category_effects2 != null) {
            LJIILIIL(c13rd.LJII, str, str2, category_effects2.getCategory_effects());
            LJIILIIL(c13rd.LJII, str, str2, category_effects2.getCollection());
            LJIILIIL(c13rd.LJII, str, str2, category_effects2.getBind_effects());
            if (z || c13rd.LJIJ == 2) {
                LJIILLIIL(categoryPageModel.getUrl_prefix(), category_effects2.getCategory_effects());
                LJIILLIIL(categoryPageModel.getUrl_prefix(), category_effects2.getCollection());
                LJIILLIIL(categoryPageModel.getUrl_prefix(), category_effects2.getBind_effects());
            }
            CategoryPageModel.Extra extra = categoryPageModel.getExtra();
            if (extra != null && (rec_id = extra.getRec_id()) != null) {
                C13LD c13ld = LIZ;
                CategoryEffectModel category_effects3 = categoryPageModel.getCategory_effects();
                List<Effect> bind_effects = null;
                if (category_effects3 != null) {
                    category_effects = category_effects3.getCategory_effects();
                } else {
                    category_effects = null;
                }
                c13ld.getClass();
                LJIIJJI(rec_id, category_effects);
                CategoryEffectModel category_effects4 = categoryPageModel.getCategory_effects();
                if (category_effects4 != null) {
                    collection = category_effects4.getCollection();
                } else {
                    collection = null;
                }
                LJIIJJI(rec_id, collection);
                CategoryEffectModel category_effects5 = categoryPageModel.getCategory_effects();
                if (category_effects5 != null) {
                    bind_effects = category_effects5.getBind_effects();
                }
                LJIIJJI(rec_id, bind_effects);
            }
        }
    }

    public static void LIZLLL(C13RD c13rd, String str, HorizontalEffectsModel horizontalEffectsModel, String str2, boolean z) {
        if (horizontalEffectsModel != null) {
            if (z) {
                for (Effect effect : horizontalEffectsModel.trending_effects) {
                    C13LD c13ld = LIZ;
                    String str3 = c13rd.LJII;
                    c13ld.getClass();
                    LJIIJ(effect, str3, str, str2);
                    LJIILL(effect, horizontalEffectsModel.url_prefix);
                }
                List<? extends Effect> list = horizontalEffectsModel.favorite_effects;
                if (list != null) {
                    for (Effect effect2 : list) {
                        C13LD c13ld2 = LIZ;
                        String str4 = c13rd.LJII;
                        c13ld2.getClass();
                        LJIIJ(effect2, str4, str, str2);
                        LJIILL(effect2, horizontalEffectsModel.url_prefix);
                    }
                }
                List<? extends Effect> list2 = horizontalEffectsModel.insert_effects;
                if (list2 != null) {
                    for (Effect effect3 : list2) {
                        C13LD c13ld3 = LIZ;
                        String str5 = c13rd.LJII;
                        c13ld3.getClass();
                        LJIIJ(effect3, str5, str, str2);
                        LJIILL(effect3, horizontalEffectsModel.url_prefix);
                    }
                }
                List<? extends Effect> list3 = horizontalEffectsModel.recent_effects;
                if (list3 != null) {
                    for (Effect effect4 : list3) {
                        C13LD c13ld4 = LIZ;
                        String str6 = c13rd.LJII;
                        c13ld4.getClass();
                        LJIIJ(effect4, str6, str, str2);
                        LJIILL(effect4, horizontalEffectsModel.url_prefix);
                    }
                }
                List<? extends Effect> list4 = horizontalEffectsModel.left_trending_effects;
                if (list4 != null) {
                    for (Effect effect5 : list4) {
                        C13LD c13ld5 = LIZ;
                        String str7 = c13rd.LJII;
                        c13ld5.getClass();
                        LJIIJ(effect5, str7, str, str2);
                        LJIILL(effect5, horizontalEffectsModel.url_prefix);
                    }
                    return;
                }
                return;
            }
            C13LD c13ld6 = LIZ;
            String str8 = c13rd.LJII;
            List<? extends Effect> list5 = horizontalEffectsModel.trending_effects;
            c13ld6.getClass();
            LJIILIIL(str8, str, str2, list5);
            LJIILIIL(c13rd.LJII, str, str2, horizontalEffectsModel.favorite_effects);
            LJIILIIL(c13rd.LJII, str, str2, horizontalEffectsModel.insert_effects);
            LJIILIIL(c13rd.LJII, str, str2, horizontalEffectsModel.recent_effects);
            LJIILIIL(c13rd.LJII, str, str2, horizontalEffectsModel.left_trending_effects);
            LJIILLIIL(horizontalEffectsModel.url_prefix, horizontalEffectsModel.trending_effects);
            LJIILLIIL(horizontalEffectsModel.url_prefix, horizontalEffectsModel.favorite_effects);
            LJIILLIIL(horizontalEffectsModel.url_prefix, horizontalEffectsModel.insert_effects);
            LJIILLIIL(horizontalEffectsModel.url_prefix, horizontalEffectsModel.recent_effects);
            LJIILLIIL(horizontalEffectsModel.url_prefix, horizontalEffectsModel.left_trending_effects);
        }
    }

    public static void LJ(C13LD c13ld, C13RD c13rd, String str, PanelInfoModel panelInfoModel, boolean z, String str2, int i) {
        String rec_id;
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            str2 = "";
        }
        c13ld.getClass();
        CategoryEffectModel category_effects = panelInfoModel.getCategory_effects();
        if (category_effects != null) {
            LJIILIIL(c13rd.LJII, str, str2, category_effects.getCategory_effects());
            LJIILIIL(c13rd.LJII, str, str2, category_effects.getCollection());
            LJIILIIL(c13rd.LJII, str, str2, category_effects.getBind_effects());
            if (z || c13rd.LJIJ == 2) {
                LJIILLIIL(panelInfoModel.getUrl_prefix(), category_effects.getCategory_effects());
                LJIILLIIL(panelInfoModel.getUrl_prefix(), category_effects.getCollection());
                LJIILLIIL(panelInfoModel.getUrl_prefix(), category_effects.getBind_effects());
            }
            PanelInfoModel.Extra extra = panelInfoModel.getExtra();
            if (extra != null && (rec_id = extra.getRec_id()) != null) {
                C13LD c13ld2 = LIZ;
                List<Effect> category_effects2 = category_effects.getCategory_effects();
                c13ld2.getClass();
                LJIIJJI(rec_id, category_effects2);
                LJIIJJI(rec_id, category_effects.getCollection());
                LJIIJJI(rec_id, category_effects.getBind_effects());
            }
        }
    }
}
