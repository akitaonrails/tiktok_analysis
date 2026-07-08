package X;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.CoverInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.FileInf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415070mvZ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.ss.android.ugc.effectmanager.common.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.ss.android.ugc.effectmanager.common.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r46v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r57v0, types: [com.ss.android.ugc.effectmanager.common.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r62v0, types: [com.ss.ugc.effectplatform.model.TemplateEffectExtra] */
    /* JADX WARN: Type inference failed for: r64v0, types: [com.ss.ugc.effectplatform.model.DiffEffect] */
    /* JADX WARN: Type inference failed for: r70v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r71v0, types: [com.ss.android.ugc.effectmanager.effect.model.EffectLabel] */
    /* JADX WARN: Type inference failed for: r72v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r79v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    public static final Effect LIZ(Asset asset) {
        FileInf file;
        CoverInfo cover;
        String str;
        UrlModel urlModel;
        List listSingletonList;
        List<String> url_list = null;
        if (C296620Bjw.LIZ()) {
            List<FileInf> package_list = asset.getPackage_list();
            if (package_list != null) {
                file = (FileInf) C13LP.LJJJLL(package_list);
            } else {
                file = null;
            }
            List<CoverInfo> cover_list = asset.getCover_list();
            if (cover_list != null) {
                cover = (CoverInfo) C13LP.LJJJLL(cover_list);
            } else {
                cover = null;
            }
        } else {
            file = asset.getFile();
            cover = asset.getCover();
        }
        String asset_id = asset.getAsset_id();
        String asset_id2 = asset.getAsset_id();
        if (file != null) {
            str = null;
            urlModel = new UrlModel(new ArrayList(), null, null, null, null);
            List<String> url_list2 = file.getUrl_list();
            if (url_list2 == null) {
                url_list2 = C13BV.INSTANCE;
            }
            urlModel.setUrl_list(url_list2);
            urlModel.setUri(file.getUri());
        } else {
            str = null;
            url_list = null;
            urlModel = new UrlModel(new ArrayList(), null, null, null, null);
        }
        UrlModel urlModel2 = new UrlModel(new ArrayList(), url_list, url_list, url_list, url_list);
        if (cover != null) {
            url_list = cover.getUrl_list();
        }
        urlModel2.setUrl_list(url_list);
        String resource_id = asset.getResource_id();
        String sticker_source = asset.getBusiness_extra().getSticker_source();
        if (Intrinsics.LJFF(sticker_source, "im")) {
            listSingletonList = Collections.singletonList("im_sticker");
        } else if (Intrinsics.LJFF(sticker_source, "upload")) {
            listSingletonList = Collections.singletonList("custom_sticker_uploaded");
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        String unzip_path = asset.getBusiness_extra().getUnzip_path();
        if (unzip_path == null) {
            unzip_path = "";
        }
        return new Effect(str, str, str, str, asset_id, asset_id2, urlModel, urlModel2, str, str, 0, str, str, listSingletonList, str, str, str, str, 0, 0, 0, str, str, str, str, str, str, str, str, str, str, false, str, false, resource_id, str, 0L, str, str, 0L, str, str, str, unzip_path, str, false, str, str, str, str, str, str, str, str, str, 0L, str, str, str, 0L, 0L, str, str, str, str, str, false, false, -8433, -2053, 15, str);
    }
}
