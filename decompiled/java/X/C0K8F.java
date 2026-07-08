package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.UploadResult;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.text.Charsets;
import org.json.JSONObject;
import webcast.api.sub.ImageConvertResponse;

/* JADX INFO: renamed from: X.0K8F, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K8F {
    public static final C0K8F LIZ = new C0K8F();
    public static final Map<EnumC1983607pq, C20337914i1<Map<String, String>>> LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC1983607pq.INNER, C0KPJ.te);
        linkedHashMap.put(EnumC1983607pq.OUTER, C0KPJ.ue);
        LIZIZ = linkedHashMap;
    }

    public static String LIZ() {
        C1515210pX5.LIZLLL().getClass();
        Map mapLIZIZ = C1515210pX5.LIZIZ();
        if (mapLIZIZ == null) {
            mapLIZIZ = C2097608Jq.LJ();
        }
        String str = (String) mapLIZIZ.get("fake_region");
        String str2 = (String) mapLIZIZ.get("carrier_region");
        String str3 = (String) mapLIZIZ.get("sys_region");
        String str4 = (String) mapLIZIZ.get("app_language");
        if (TextUtils.isEmpty(str)) {
            str = TextUtils.isEmpty(str2) ? TextUtils.isEmpty(str3) ? str4 : str3 : str2;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return str.toUpperCase(Locale.US);
    }

    public static void LIZIZ(String str, final C495090JbH c495090JbH) {
        final C0K8Q c0k8q = new C0K8Q();
        C480460Ism.LIZ().getClass();
        C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getSpotlightInfo(UserService.getInstance().user().getCurrentUser().getId()), EnumC510330Jzr.GENERAL, str, "sub/privilege/spotlight", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0K8I
            @Override // X.C09JN
            public final /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SubscribeHelperKt@784e.sam$io_reactivex_functions_Consumer$0");
                c495090JbH.invoke(obj);
                C1C7U.LIZIZ("SubscribeHelperKt@784e.sam$io_reactivex_functions_Consumer$0");
            }
        }, new C09JN() { // from class: X.0K8I
            @Override // X.C09JN
            public final /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SubscribeHelperKt@784e.sam$io_reactivex_functions_Consumer$0");
                c0k8q.invoke(obj);
                C1C7U.LIZIZ("SubscribeHelperKt@784e.sam$io_reactivex_functions_Consumer$0");
            }
        });
    }

    public static Bitmap LIZJ(Context context, View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(context.getResources().getDisplayMetrics().densityDpi);
        if (view.getDrawingCacheBackgroundColor() != 0) {
            bitmapCreateBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        C842150X1x.LIZIZ(canvas, view);
        return bitmapCreateBitmap;
    }

    public static List LIZLLL(List list, Function1 function1) {
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Boolean) function1.invoke(next)).booleanValue()) {
                if (next != null) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.remove(next);
                    ListProtector.add(arrayList, 0, next);
                    return arrayList;
                }
            }
        }
        return list;
    }

    public static C470590Icr LJIIL(String str, byte[] bArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getHostDomain());
        sbLIZ.append("/webcast/resource/upload/");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedByteArray("multipart/form-data", bArr, str));
        Uri.Builder builderBuildUpon = UriProtector.parse(strLIZIZ).buildUpon();
        builderBuildUpon.appendQueryParameter(Scene.SCENE_SERVICE, "tikcast_subscription");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            multipartTypedOutput.writeTo(byteArrayOutputStream);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SubLinkShareImgLoadListener uploadFile error: ");
            sbLIZ2.append(e);
            C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        String string = builderBuildUpon.build().toString();
        C1515210pX5 c1515210pX5LIZLLL = C1515210pX5.LIZLLL();
        ArrayList arrayList = new ArrayList(1);
        String strMimeType = multipartTypedOutput.mimeType();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        long length = multipartTypedOutput.length();
        String strMd5Stub = multipartTypedOutput.md5Stub();
        c1515210pX5LIZLLL.getClass();
        try {
            C1500830p9t c1500830p9tLIZ = ((C1500860p9w) C1515210pX5.LJIIIIZZ(-1, string, arrayList, strMimeType, byteArray, length, strMd5Stub)).LIZ();
            if (c1500830p9tLIZ != null) {
                String str2 = new String(c1500830p9tLIZ.LJ, Charsets.UTF_8);
                if (c1500830p9tLIZ.LIZIZ != 200) {
                    return null;
                }
                Gson gson = C19748512Ol.LIZIZ;
                C470590Icr c470590Icr = (C470590Icr) GsonProtectorUtils.fromJson(gson, str2, new TypeToken<C470590Icr<UploadResult>>() { // from class: X.0K8J
                }.getType());
                try {
                    if (c470590Icr.statusCode != 0) {
                        c470590Icr.LJ = (RequestError) gson.LJII(C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str2), "data")), RequestError.class);
                        return c470590Icr;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("SubLinkShareImgLoadListener uploadFile error: ");
                    sbLIZ3.append(e2);
                    C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                return c470590Icr;
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("SubLinkShareImgLoadListener uploadFile error: ");
            sbLIZ4.append(e3);
            C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        }
        return null;
    }

    public static void LJII(Context context, String str, Map map) {
        if (context == null) {
            return;
        }
        C0KYM c0kymLIZ = C513270KAz.LIZ(str);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c0kymLIZ.LJII((String) entry.getKey(), (String) entry.getValue());
            }
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c0kymLIZ.LIZ().toString()));
    }

    public static void LJIIJJI(boolean z, C0K8A c0k8a, C0K8C c0k8c) {
        if (z) {
            if (c0k8a.LIZ.length() > 0 && c0k8a.LIZIZ.length() > 0 && c0k8c != null) {
                c0k8c.LIZ(c0k8a);
                return;
            }
            return;
        }
        if (c0k8c == null) {
            return;
        }
        c0k8c.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(android.content.Context r4, com.bytedance.android.livesdkapi.depend.model.live.Room r5, java.lang.String r6, java.lang.String r7) {
        /*
            X.0Jby r2 = new X.0Jby
            r2.<init>(r6)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r3 = r0.user()
            long r0 = r5.getOwnerUserId()
            java.lang.String r1 = r3.LJIJ(r0)
            java.lang.String r0 = "anchor_id"
            r2.LIZJ(r0, r1)
            java.lang.String r3 = "room_id"
            long r0 = r5.getId()
            r2.LIZIZ(r0, r3)
            qo2.w r0 = qo2.w.LIZ
            r0.getClass()
            java.lang.String r1 = qo2.w.LJIIIZ()
            java.lang.String r0 = "enter_from_merge"
            r2.LIZJ(r0, r1)
            java.lang.String r1 = qo2.w.LJIIL()
            java.lang.String r0 = "enter_method"
            r2.LIZJ(r0, r1)
            java.lang.String r0 = "show_entrance"
            r2.LIZJ(r0, r7)
            java.lang.String r1 = qo2.w.LJIJI()
            java.lang.String r0 = "request_id"
            r2.LIZJ(r0, r1)
            java.lang.String r1 = qo2.w.LJJII()
            java.lang.String r0 = "video_id"
            r2.LIZJ(r0, r1)
            com.bytedance.android.live.base.model.user.User r0 = r5.getOwner()
            if (r0 == 0) goto L7d
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L7d
            boolean r0 = r0.isSubscribed()
            r1 = 1
            if (r0 != r1) goto L7d
        L64:
            java.lang.String r0 = "is_subscribe"
            r2.LIZ(r1, r0)
            java.lang.String r0 = r2.LIZLLL()
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r0 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r0
            r0.handle(r4, r1)
            return
        L7d:
            r1 = 0
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0K8F.LJI(android.content.Context, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0K8H] */
    public static Object LJIIIZ(final Bitmap bitmap, final int i, final Bitmap.CompressFormat compressFormat, AbstractC23140094w abstractC23140094w) {
        if (bitmap == null) {
            return null;
        }
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        C0K8F c0k8f = LIZ;
        final ?? r2 = new C0K8P() { // from class: X.0K8H
            @Override // X.C0K8P
            public final void LIZ() {
                InterfaceC1364105Vn<String> interfaceC1364105Vn = c23260099m;
                C189200o6.m2constructorimpl(null);
                interfaceC1364105Vn.resumeWith(null);
            }

            @Override // X.C0K8P
            public final void LIZIZ(String str) {
                InterfaceC1364105Vn<String> interfaceC1364105Vn = c23260099m;
                C189200o6.m2constructorimpl(str);
                interfaceC1364105Vn.resumeWith(str);
            }
        };
        c0k8f.getClass();
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0K8G
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SubscribeHelper@e290.uploadBitmap$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SubscribeHelper@e290.uploadBitmap$1");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void LIZ() {
                UploadResult uploadResult;
                String str;
                UploadResult uploadResult2;
                String str2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sub_share_link_upload_photo_");
                sbLIZ.append(System.currentTimeMillis());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(compressFormat, i, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C0K8F.LIZ.getClass();
                C470590Icr c470590IcrLJIIL = C0K8F.LJIIL(strLIZIZ, byteArray);
                if (c470590IcrLJIIL == null || (uploadResult = (UploadResult) c470590IcrLJIIL.data) == null || (str = uploadResult.uri) == null || str.length() == 0) {
                    C0K8P c0k8p = r2;
                    if (c0k8p != null) {
                        c0k8p.LIZ();
                        return;
                    }
                    return;
                }
                if (c470590IcrLJIIL == null || (uploadResult2 = (UploadResult) c470590IcrLJIIL.data) == null || (str2 = uploadResult2.uri) == null || str2.length() == 0) {
                    C0K8P c0k8p2 = r2;
                    if (c0k8p2 != null) {
                        c0k8p2.LIZ();
                        return;
                    }
                    return;
                }
                C0K8P c0k8p3 = r2;
                if (c0k8p3 != null) {
                    c0k8p3.LIZIZ(str2);
                }
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    public static void LJIIJ(int i, int i2, final View view, final Context context, final String str, final EnumC1983607pq enumC1983607pq, final C0K88 c0k88) {
        if (i != i2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sub_share_link_upload_photo_");
        sbLIZ.append(System.currentTimeMillis());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0K8D
            /* JADX WARN: Type inference failed for: r0v7, types: [T, android.graphics.Bitmap] */
            public final void LIZ() {
                final C259800zU c259800zU = new C259800zU();
                try {
                    C0K8F c0k8f = C0K8F.LIZ;
                    View view2 = view;
                    Context context2 = context;
                    c0k8f.getClass();
                    c259800zU.element = C0K8F.LIZJ(context2, view2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SubLinkShareImgLoadListener getViewBitmap error: ");
                    sbLIZ2.append(e);
                    C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                C786410Ut5.LJLLLLLL(8, view);
                if (c259800zU.element == 0) {
                    C0K88 c0k882 = c0k88;
                    if (c0k882 != null) {
                        c0k882.LIZIZ(view);
                        return;
                    }
                    return;
                }
                ExecutorService executorServiceLIZLLL = C823050WQl.LIZLLL();
                final String str2 = strLIZIZ;
                final C0K88 c0k883 = c0k88;
                final View view3 = view;
                final EnumC1983607pq enumC1983607pq2 = enumC1983607pq;
                final String str3 = str;
                executorServiceLIZLLL.execute(new Runnable() { // from class: X.0K8E
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void LIZ() {
                        UploadResult uploadResult;
                        String str4;
                        UploadResult uploadResult2;
                        String str5;
                        ImageConvertResponse.Images images;
                        List<String> list;
                        Map map;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        c259800zU.element.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        C0K8F c0k8f2 = C0K8F.LIZ;
                        String str6 = str2;
                        c0k8f2.getClass();
                        C470590Icr c470590IcrLJIIL = C0K8F.LJIIL(str6, byteArray);
                        if (c470590IcrLJIIL == null || (uploadResult = (UploadResult) c470590IcrLJIIL.data) == null || (str4 = uploadResult.uri) == null || str4.length() == 0) {
                            C0K88 c0k884 = c0k883;
                            if (c0k884 != null) {
                                c0k884.LIZIZ(view3);
                                return;
                            }
                            return;
                        }
                        if (c470590IcrLJIIL != null && (uploadResult2 = (UploadResult) c470590IcrLJIIL.data) != null && (str5 = uploadResult2.uri) != null && str5.length() != 0) {
                            try {
                                C480460Ism.LIZ().getClass();
                                C0X52<C470590Icr<ImageConvertResponse.Data>> c0x52Execute = ((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).subImageConvert(str5).execute();
                                if (c0x52Execute.LIZJ() && (images = (ImageConvertResponse.Images) C13LP.LJJJLZIJ(0, c0x52Execute.LIZIZ.data.images)) != null && (list = images.url) != null) {
                                    String str7 = (String) C13LP.LJJJLZIJ(0, list);
                                    if (str7 != null && str7.length() != 0) {
                                        C20337914i1 c20337914i1 = (C20337914i1) ((LinkedHashMap) C0K8F.LIZIZ).get(enumC1983607pq2);
                                        if (c20337914i1 != null && (map = (Map) c20337914i1.LIZIZ()) != null) {
                                            map.put(str3, str7);
                                        }
                                        C0K88 c0k885 = c0k883;
                                        if (c0k885 != null) {
                                            c0k885.LIZJ(view3, str7);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("SubLinkShareImgLoadListener convertUriToUrl error: ");
                                sbLIZ3.append(e2);
                                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        }
                        C0K88 c0k886 = c0k883;
                        if (c0k886 != null) {
                            c0k886.LIZIZ(view3);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SubscribeHelper@e290.tryGetViewBitmap$1$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SubscribeHelper@e290.tryGetViewBitmap$1$1");
                    }
                });
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SubscribeHelper@e290.tryGetViewBitmap$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SubscribeHelper@e290.tryGetViewBitmap$1");
            }
        });
    }

    public static void LJ(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Map map, String str8, String str9) {
        String str10;
        if (context == null) {
            return;
        }
        C495520Jby c495520Jby = new C495520Jby(str);
        c495520Jby.LIZJ("previous_page", str2);
        c495520Jby.LIZJ("show_entrance", str3);
        c495520Jby.LIZJ("entrance_from", str3);
        c495520Jby.LIZJ("container_type", str8);
        c495520Jby.LIZJ("priority_region", LIZ());
        c495520Jby.LIZJ("event_page", str4);
        if (!z) {
            c495520Jby.LIZJ("mask_bg_color", "00000000");
        }
        c495520Jby.LIZJ("anchor_id", str5);
        c495520Jby.LIZJ("room_id", str6);
        c495520Jby.LIZJ("click_position", str7);
        c495520Jby.LIZJ("live_type", str9);
        if (SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
            str10 = "1";
        } else {
            str10 = CardStruct.IStatusCode.DEFAULT;
        }
        c495520Jby.LIZJ("enable_code_cache", str10);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c495520Jby.LIZJ((String) entry.getKey(), (String) entry.getValue());
            }
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
    }
}
