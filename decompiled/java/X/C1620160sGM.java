package X;

import Y.ACallableS6S0211000_9;
import Y.ARunnableS109S0100000_9;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sGM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620160sGM {
    public static final Map<String, String> LIZ = new LinkedHashMap();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3255));

    public static boolean LIZ(UrlModel urlModel) {
        if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
            Iterator<String> it2 = urlModel.getUrlList().iterator();
            while (it2.hasNext()) {
                if (!TextUtils.isEmpty(it2.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean LIZLLL(SmartImageView smartImageView, Video video, String str, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4 = z2;
        boolean z5 = z;
        if ((i & 8) != 0) {
            z5 = true;
        }
        if ((i & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 128) != 0) {
            z4 = false;
        }
        return LIZIZ(smartImageView, video, str, z5, null, null, z3, null, false, false, true, z4);
    }

    public static void LJ(final SmartImageView smartImageView, final UrlModel urlModel, final Video video, final boolean z, String str, String str2, final InterfaceC624400OeM interfaceC624400OeM, final boolean z2, Bitmap.Config config, boolean z3) {
        int i;
        String strLIZIZ;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (z) {
            i = C1330870kjl.LIZLLL.LIZ;
        } else {
            i = -1;
        }
        final ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(urlModel);
        if (!TextUtils.isEmpty(str2) && !imageUrlModelLIZ.isEmpty()) {
            List<String> urls = imageUrlModelLIZ.getUrls();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(urls, 10));
            for (String str3 : urls) {
                String string = "";
                try {
                    Uri uri = UriProtector.parse(str3);
                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                    Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                    for (String str4 : queryParameterNames) {
                        if (Intrinsics.LJFF(str4, "l")) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = CardStruct.IStatusCode.DEFAULT;
                        } else {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4);
                        }
                        builderClearQuery.appendQueryParameter(str4, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                    string = builderClearQuery.build().toString();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                Map<String, String> map = LIZ;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                String str5 = (String) linkedHashMap.get(string);
                if (str5 != null && str5.length() > 0) {
                    string = (String) linkedHashMap.get(string);
                    if (string == null) {
                        string = str3;
                    }
                } else {
                    map.put(string, str3);
                }
                if (a0.LJJIIZI(str3, "?", false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(string);
                    sbLIZ.append("&ilog=");
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(string);
                    sbLIZ2.append("?ilog=");
                    sbLIZ2.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                arrayList.add(strLIZIZ);
            }
            imageUrlModelLIZ.setUrls(arrayList);
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZ);
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        c1331670kl3LJIIIIZZ.LIZLLL(str);
        if ((((Boolean) C1791006zs.LIZ.getValue()).booleanValue() || config != null) && config != null) {
            c1331670kl3LJIIIIZZ.LJIL = config;
        }
        if (Intrinsics.LJFF("AwemeViewHolder", str) && C295250Bhj.LIZ()) {
            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3LJIIIIZZ.LJJJJJ = "profile_post_img";
        }
        InterfaceC1331190kkH interfaceC1331190kkH = new InterfaceC1331190kkH() { // from class: X.0OeL
            @Override // X.InterfaceC1331190kkH
            public final void onError(int i2) {
                C15O7.LIZIZ(new ACallableS6S0211000_9(z, i2, imageUrlModelLIZ, video, 0), C823050WQl.LIZIZ(), null);
            }
        };
        c1331670kl3LJIIIIZZ.LJJJ = i;
        c1331670kl3LJIIIIZZ.LJJJI = interfaceC1331190kkH;
        c1331670kl3LJIIIIZZ.LJJIJL = true;
        c1331670kl3LJIIIIZZ.LJFF = 1;
        AbstractC1335900krs abstractC1335900krs = new AbstractC1335900krs() { // from class: X.0OeN
            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri2, View view, Throwable th2) {
                String message;
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("animationFrameScheduler onFailed uri: ");
                sbLIZ3.append(uri2);
                sbLIZ3.append(", throwable: ");
                sbLIZ3.append(th2);
                C1720106oR.LJI("DynamicCoverHelper", C2188811AlT.LIZIZ(sbLIZ3));
                InterfaceC624400OeM interfaceC624400OeM2 = interfaceC624400OeM;
                if (interfaceC624400OeM2 != null) {
                    C823050WQl.LIZIZ().submit(new ARunnableS109S0100000_9((C624420OeO) interfaceC624400OeM2, 217));
                }
                if (z && !imageUrlModelLIZ.isEmpty() && video.getPlayAddr() != null && !TextUtils.isEmpty(video.getPlayAddr().getUri())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("frames", -1);
                        jSONObject.put("vid", video.getPlayAddr().getUri());
                        jSONObject.put("url", imageUrlModelLIZ.getUrls().get(0));
                        if (th2 != null) {
                            message = th2.getMessage();
                        } else {
                            message = null;
                        }
                        jSONObject.put("errMsg", message);
                        C794240VDq.LIZJ("aweme_animated_image_frames_error", jSONObject);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("animated frame error: ");
                        sbLIZ4.append(jSONObject);
                        C1720106oR.LJI("DynamicCoverHelper", C2188811AlT.LIZIZ(sbLIZ4));
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri2, View view, C428600GrK c428600GrK, Animatable animatable) {
                smartImageView.setUserVisibleHint(true);
                InterfaceC624400OeM interfaceC624400OeM2 = interfaceC624400OeM;
                if (interfaceC624400OeM2 != null) {
                    C624420OeO c624420OeO = (C624420OeO) interfaceC624400OeM2;
                    int i2 = c624420OeO.LIZ.LLJZ;
                    if (i2 == 0 || i2 == 14) {
                        C823050WQl.LIZIZ().submit(new ARunnableS109S0100000_9(c624420OeO, 218));
                    }
                }
                if (z2) {
                    smartImageView.LJI();
                }
                UrlModel urlModel2 = new UrlModel();
                UrlModel urlModel3 = urlModel;
                ImageUrlModel imageUrlModel = imageUrlModelLIZ;
                urlModel2.setUri(urlModel3.getUri());
                urlModel2.setUrlList(imageUrlModel.getUrls());
                video.setCachedOuterCoverUrl(urlModel2);
            }
        };
        if (z3) {
            c1331670kl3LJIIIIZZ.LJIIL(abstractC1335900krs);
        } else {
            c1331670kl3LJIIIIZZ.LJIIJ(abstractC1335900krs);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (X.C0VO3.LIZIZ("use_dynamic_cover", r2) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.bytedance.lighten.loader.SmartImageView r13, com.ss.android.ugc.aweme.feed.model.Video r14, java.lang.String r15, boolean r16, X.InterfaceC624400OeM r17, java.lang.String r18, boolean r19, android.graphics.Bitmap.Config r20, boolean r21, boolean r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620160sGM.LIZIZ(com.bytedance.lighten.loader.SmartImageView, com.ss.android.ugc.aweme.feed.model.Video, java.lang.String, boolean, X.0OeM, java.lang.String, boolean, android.graphics.Bitmap$Config, boolean, boolean, boolean, boolean):boolean");
    }
}
