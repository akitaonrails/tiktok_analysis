package X;

import Y.ARunnableS19S0500000_31;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.comp.api.game.data.GameUploadResult;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.167R, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C167R extends C167U {
    public InterfaceC420801kM LLILLL;
    public Map<String, ? extends Object> LLILZ;
    public String LLILZIL;
    public CompletionBlock<C167Y> LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.lang.String] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        C167V c167v = (C167V) xBaseParamModel;
        this.LLILZ = c167v.getParams();
        this.LLILZIL = c167v.getUrl();
        List<String> imageList = c167v.getImageList();
        this.LLILZLL = completionBlock;
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int size = imageList.size();
        for (int i = 0; i < size; i++) {
            try {
                final C259800zU c259800zU = new C259800zU();
                final String str = imageList.get(i);
                final byte[] bArrDecode = null;
                final C167Z c167z = (C167Z) C1909107dp.LIZJ(C167Z.class, null);
                arrayList2.add(c167z);
                if (Intrinsics.LJFF(c167v.getType(), "path")) {
                    JSONObject jSONObject = new JSONObject(str);
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(C09NT.LJ(activityLIZLLL.getContentResolver(), UriProtector.parse(JSONObjectProtectorUtils.getString(jSONObject, "uri"))));
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
                        bArrDecode = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                    }
                    c259800zU.element = JSONObjectProtectorUtils.getString(jSONObject, "file_name");
                } else {
                    bArrDecode = Base64.decode(str, 0);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("upload_photo_");
                    sbLIZ.append(i);
                    sbLIZ.append('_');
                    sbLIZ.append(System.currentTimeMillis());
                    c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
                }
                c167z.setPath((String) c259800zU.element);
                if (bArrDecode != null) {
                    try {
                        c167z.setSize(String.valueOf(bArrDecode.length));
                        arrayList.add(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.167T
                            @Override // X.InterfaceC1478005qU
                            public final void subscribe(C09AJ<C470590Icr<GameUploadResult>> c09aj) {
                                C1C7U.LIZ("UploadImageForGameMethod@ea49.handle$2$1");
                                C823050WQl.LIZLLL().submit(new ARunnableS19S0500000_31((C19482611Ke) c09aj, this.LIZ, bArrDecode, c259800zU, c167z, 1));
                                C1C7U.LIZIZ("UploadImageForGameMethod@ea49.handle$2$1");
                            }
                        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0XJY
                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj) {
                                return new C0WIY(str, obj);
                            }
                        }));
                    } catch (JSONException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (JSONException e3) {
                e = e3;
            } catch (Exception e4) {
                e = e4;
            }
        }
        C11NZ.LJJJJIZL(arrayList).LJJJ(C19487811Me.LIZ, true).LJIILIIL(new C0UO0()).LIZIZ(new InterfaceC626120Oh8<C0WIY<String, C470590Icr<GameUploadResult>>>() { // from class: X.167S
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                C167R c167r = this.LL;
                ArrayList<C167Z> arrayList3 = arrayList2;
                c167r.getClass();
                C167Y c167y = (C167Y) C1909107dp.LIZJ(C167Y.class, null);
                c167y.setUploadedImageList(arrayList3);
                CompletionBlock<C167Y> completionBlock2 = c167r.LLILZLL;
                if (completionBlock2 != null) {
                    completionBlock2.onSuccess(c167y, "");
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                CompletionBlock<C167Y> completionBlock2 = this.LL.LLILZLL;
                if (completionBlock2 != null) {
                    C2382909Vj.LIZ(completionBlock2, 0, "request error.", null, 4);
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(C0WIY<String, C470590Icr<GameUploadResult>> c0wiy) {
                C470590Icr<GameUploadResult> c470590Icr = c0wiy.LIZIZ;
                if (c470590Icr != null) {
                    C167R c167r = this.LL;
                    CompletionBlock<C167Y> completionBlock2 = completionBlock;
                    ArrayList<C167Z> arrayList3 = arrayList2;
                    if (c470590Icr.statusCode == 0) {
                        c167r.getClass();
                        C167Y c167y = (C167Y) C1909107dp.LIZJ(C167Y.class, null);
                        c167y.setUploadedImageList(arrayList3);
                        completionBlock2.onSuccess(c167y, "");
                        return;
                    }
                    CompletionBlock<C167Y> completionBlock3 = c167r.LLILZLL;
                    if (completionBlock3 == null) {
                        return;
                    }
                    C2382909Vj.LIZ(completionBlock3, 0, "request error.", null, 4);
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL.LLILLL = interfaceC420801kM;
            }
        });
    }

    public final C470590Icr<GameUploadResult> LIZJ(String str, byte[] bArr, String str2, C167Z c167z) throws Exception {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedByteArray("multipart/form-data", bArr, str2));
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        Map<String, ? extends Object> map = this.LLILZ;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), (String) entry.getValue());
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            multipartTypedOutput.writeTo(byteArrayOutputStream);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String string = builderBuildUpon.build().toString();
        C1515210pX5 c1515210pX5LIZLLL = C1515210pX5.LIZLLL();
        ArrayList arrayList = new ArrayList(1);
        String strMimeType = multipartTypedOutput.mimeType();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        long length = multipartTypedOutput.length();
        String strMd5Stub = multipartTypedOutput.md5Stub();
        c1515210pX5LIZLLL.getClass();
        C1500830p9t c1500830p9tLIZ = ((C1500860p9w) C1515210pX5.LJIIIIZZ(-1, string, arrayList, strMimeType, byteArray, length, strMd5Stub)).LIZ();
        String str3 = new String(c1500830p9tLIZ.LJ, Charsets.UTF_8);
        if (c1500830p9tLIZ.LIZIZ == 200) {
            Gson gson = C19748512Ol.LIZIZ;
            C470590Icr<GameUploadResult> c470590Icr = (C470590Icr) GsonProtectorUtils.fromJson(gson, str3, new TypeToken<C470590Icr<GameUploadResult>>() { // from class: X.167b
            }.getType());
            if (c470590Icr.statusCode != 0) {
                try {
                    c470590Icr.LJ = (RequestError) GsonProtectorUtils.fromJson(gson, C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str3), "data")), RequestError.class);
                    return c470590Icr;
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return c470590Icr;
                }
            }
            GameUploadResult gameUploadResult = c470590Icr.data;
            if (gameUploadResult != null) {
                c167z.setUri(gameUploadResult.uri);
                c167z.setUrl(gameUploadResult.url);
            }
            return c470590Icr;
        }
        throw new Exception();
    }
}
