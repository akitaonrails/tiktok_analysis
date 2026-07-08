package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0I9A, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I9A {
    public static final /* synthetic */ int LJIJJ = 0;
    public final C1322110kVd LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final C0I9I LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final Bitmap.Config LJIIIZ;
    public final boolean LJIIJ;
    public final String LJIIJJI;
    public final C869590Y9l LJIIL;
    public final Map<String, String> LJIILIIL;
    public C1325710kbR[] LJIILJJIL;
    public AbstractC1320710kTN LJIILL;
    public C1320810kTX LJIILLIIL;
    public final C0I9E LJIIZILJ;
    public final C21308018a6 LJIJ;
    public final C1327780kem LJIJI;

    public final boolean LIZJ() {
        return Build.VERSION.SDK_INT >= 28 && this.LJFF && this.LIZIZ > 0 && this.LIZJ > 0 && ((Boolean) C269750Ahh.LIZ.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1325710kbR LIZ(java.lang.String r8) {
        /*
            r7 = this;
            com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder r6 = new com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder
            r6.<init>()
            android.graphics.Bitmap$Config r0 = r7.LJIIIZ
            r6.setBitmapConfig(r0)
            int r0 = r7.LJII
            r6.LIZIZ(r0)
            boolean r0 = r7.LJI
            r6.LJ = r0
            r4 = 1
            r6.LIZLLL = r4
            r0 = 0
            r6.LJFF = r0
            boolean r0 = r7.LIZJ()
            if (r0 == 0) goto L2e
            X.0kkX r5 = new X.0kkX
            int r3 = r7.LIZIZ
            int r2 = r7.LIZJ
            int r1 = r7.LJ
            boolean r0 = r7.LJFF
            r5.<init>(r3, r2, r1, r0)
            r6.LJIIIZ = r5
        L2e:
            X.0khK r1 = new X.0khK
            r1.<init>(r6)
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)
            X.0kbQ r3 = X.C1325700kbQ.LIZLLL(r0)
            r3.LJFF = r1
            X.18a6 r0 = r7.LJIJ
            X.0klJ r0 = X.C1331830klJ.LJIIL(r0)
            r3.LJIIZILJ = r0
            boolean r0 = r7.LJIIIIZZ
            if (r0 == 0) goto L67
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = "__NO_COOKIE"
            java.lang.String r0 = "1"
            r2.put(r1, r0)
            X.0I9O r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageLoadingApi.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageLoadingApi> r0 = X.C0I9O.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageLoadingApi r0 = (com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageLoadingApi) r0
            if (r0 == 0) goto L67
            r0.LIZIZ(r3, r2)
        L67:
            int r2 = r7.LIZJ
            if (r2 <= 0) goto L76
            int r1 = r7.LIZIZ
            if (r1 <= 0) goto L76
            X.0kZh r0 = new X.0kZh
            r0.<init>(r1, r2)
            r3.LIZJ = r0
        L76:
            java.lang.String r0 = r7.LJIIJJI
            if (r0 == 0) goto L9b
            boolean r0 = X.C1328130kfL.LJIJJLI()
            if (r0 == 0) goto L9b
            X.0kfL r0 = X.C1328130kfL.LJIILIIL()
            X.0knU r1 = r0.LJIIIIZZ()
            java.lang.String r0 = r7.LJIIJJI
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L9b
            X.0kbC r0 = X.EnumC1325560kbC.CUSTOM
            r3.LJI = r0
            java.lang.String r0 = r7.LJIIJJI
            r0.getClass()
            r3.LJIJI = r0
        L9b:
            boolean r0 = r7.LJIIJ
            if (r0 == 0) goto Lc1
            X.0Y9l r1 = r7.LJIIL
            r2 = 0
            if (r1 == 0) goto Lbf
            r0 = 516(0x204, float:7.23E-43)
            java.lang.Object r1 = r1.getLocalCache(r0)
        Laa:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto Lb1
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
        Lb1:
            boolean r0 = X.C123100dR.LIZ(r2)
            if (r0 != 0) goto Lc1
        Lb7:
            r3.LJI(r4)
            X.0kbR r0 = r3.LIZ()
            return r0
        Lbf:
            r1 = r2
            goto Laa
        Lc1:
            r4 = 0
            goto Lb7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0I9A.LIZ(java.lang.String):X.0kbR");
    }

    public final C1325710kbR[] LIZIZ(UrlModel urlModel) {
        if (this.LJIILJJIL == null) {
            List<String> urlList = urlModel.getUrlList();
            C1325710kbR[] c1325710kbRArr = null;
            if (urlList != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(urlList, 10));
                Iterator<String> it2 = urlList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(LIZ(it2.next()));
                }
                c1325710kbRArr = (C1325710kbR[]) arrayList.toArray(new C1325710kbR[0]);
            }
            this.LJIILJJIL = c1325710kbRArr;
        }
        C1325710kbR[] c1325710kbRArr2 = this.LJIILJJIL;
        if (c1325710kbRArr2 == null) {
            return new C1325710kbR[0];
        }
        return c1325710kbRArr2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0kem] */
    public C0I9A(C1322110kVd c1322110kVd, UrlModel urlModel, int i, int i2, C0I9I c0i9i, int i3, boolean z, boolean z2, int i4, boolean z3, Bitmap.Config config, boolean z4, String str, boolean z5, String str2, String str3, C869590Y9l c869590Y9l, Map map) {
        this.LIZ = c1322110kVd;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = c0i9i;
        this.LJ = i3;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = i4;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = config;
        this.LJIIJ = z4;
        this.LJIIJJI = str;
        this.LJIIL = c869590Y9l;
        this.LJIILIIL = map;
        if (C123100dR.LIZ(str)) {
            map.put("cache_space", str);
        }
        this.LJIIZILJ = new C0I9E(this);
        this.LJIJ = new C21308018a6(str3, c869590Y9l, map, 8);
        this.LJIJI = new C1321250kUF() { // from class: X.0kem
            public long LIZIZ = -1;

            @Override // X.C1320700kTM
            public final void LJIIIZ(String str4, Object obj, Animatable animatable) {
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZLLL(String str4, Throwable th) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("isSuccess", false);
                    if (th != null) {
                        jSONObject.put("err_msg", th.getMessage());
                    }
                    this.LIZJ.LJIJ.Ck(jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJFF(Object obj, String str4) {
                this.LIZIZ = System.currentTimeMillis();
            }

            @Override // X.C1321250kUF, X.C1320700kTM
            public final void LJII(String str4, C1325710kbR c1325710kbR, Throwable th) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("isSuccess", false);
                    if (th != null) {
                        jSONObject.put("err_msg", th.getMessage());
                    }
                    this.LIZJ.LJIJ.Ck(jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.C1321250kUF, X.C1320700kTM
            public final void LJIIIIZZ(String str4, Object obj, Animatable animatable, C1325710kbR c1325710kbR, Map<Object, Object> map2) {
                int iCurrentTimeMillis;
                String str5;
                if (c1325710kbR == null) {
                    return;
                }
                String string = c1325710kbR.LIZIZ.toString();
                int i5 = -1;
                if (this.LIZIZ > 0) {
                    iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.LIZIZ);
                } else {
                    iCurrentTimeMillis = -1;
                }
                C1330000kiM imageFormat = null;
                if (obj instanceof AbstractC1327750kej) {
                    AbstractC1327750kej abstractC1327750kej = (AbstractC1327750kej) obj;
                    imageFormat = abstractC1327750kej.getImageFormat();
                    if (abstractC1327750kej.isRequestInternet) {
                        i5 = 0;
                    } else if (abstractC1327750kej.isHitDiskCache) {
                        i5 = 2;
                    } else if (abstractC1327750kej.isHitMemoryCache()) {
                        i5 = 1;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSuccess", true);
                    Object obj2 = ((HashMap) map2).get("drawableWidth");
                    Object obj3 = "";
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    jSONObject.put("image_width", obj2);
                    Object obj4 = ((HashMap) map2).get("drawableHeight");
                    if (obj4 != null) {
                        obj3 = obj4;
                    }
                    jSONObject.put("image_height", obj3);
                    jSONObject.put("duration", iCurrentTimeMillis);
                    jSONObject.put("from", i5);
                    if (imageFormat == null) {
                        str5 = "undefined";
                    } else {
                        str5 = imageFormat.LIZIZ;
                    }
                    jSONObject.put("image_type", str5);
                    jSONObject.put("uri", string);
                    this.LIZJ.LJIJ.Ck(jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }
}
