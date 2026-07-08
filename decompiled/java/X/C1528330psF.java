package X;

import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.StartLiveResponse;
import com.bytedance.android.live.network.response.pb.ProtoResponse;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.LinkMicExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0psF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528330psF extends AbstractC2343909Gj {
    public final ThreadLocal<C1516680pZS> LIZ = new ThreadLocal<>();
    public final C2336109Dj LIZIZ;

    public C1528330psF(C2336109Dj c2336109Dj) {
        this.LIZIZ = c2336109Dj;
    }

    public static RequestError LJIIJJI(C1528350psH c1528350psH) {
        RequestError requestError = new RequestError();
        requestError.message = c1528350psH.LIZIZ;
        requestError.prompts = c1528350psH.LIZJ;
        requestError.alert = c1528350psH.LIZLLL;
        return requestError;
    }

    public static boolean LJIILJJIL(Class cls, C1516680pZS c1516680pZS) throws IOException {
        if (cls != null && cls != Void.class && cls != Object.class && cls != Unit.class) {
            return true;
        }
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, kotlin.Unit] */
    public static C926820aE4 LJIIIIZZ(Class cls, C1516680pZS c1516680pZS, ProtoResponse protoResponse) {
        T tLIZJ;
        C926820aE4 c926820aE4 = new C926820aE4();
        C1528350psH c1528350psH = protoResponse.header;
        c926820aE4.statusCode = c1528350psH.LIZ;
        LinkMicExtra linkMicExtra = new LinkMicExtra();
        linkMicExtra.now = c1528350psH.LJ;
        linkMicExtra.extraJsonString = c1528350psH.LJFF;
        c926820aE4.extra = linkMicExtra;
        if (c1528350psH.LIZ == 0) {
            if (LJIILJJIL(cls, c1516680pZS)) {
                byte[] bArr = protoResponse.body;
                if (cls == TypedInput.class) {
                    tLIZJ = new TypedByteArray(null, bArr, new String[0]);
                } else {
                    C1515210pX5.LIZLLL().getClass();
                    tLIZJ = C1515210pX5.LJI(cls).LIZJ(c1516680pZS);
                }
                c926820aE4.data = tLIZJ;
                return c926820aE4;
            }
            if (cls == Void.class) {
                c926820aE4.data = null;
                return c926820aE4;
            }
            if (cls == Unit.class) {
                c926820aE4.data = Unit.LIZ;
                return c926820aE4;
            }
            c926820aE4.data = new Object();
            return c926820aE4;
        }
        c926820aE4.LJ = LJIIJJI(c1528350psH);
        return c926820aE4;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [R extends com.bytedance.android.livesdk.model.Extra, com.bytedance.android.livesdk.model.Extra] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static C472830IgT LJIIIZ(Class cls, C1516680pZS c1516680pZS, C1528350psH c1528350psH) throws IOException {
        C472830IgT c472830IgT = new C472830IgT();
        c472830IgT.statusCode = c1528350psH.LIZ;
        ?? extra = new Extra();
        extra.now = c1528350psH.LJ;
        c472830IgT.extra = extra;
        c472830IgT.data = new ArrayList();
        if (c1528350psH.LIZ == 0) {
            long jLIZJ = c1516680pZS.LIZJ();
            while (true) {
                int iLJI = c1516680pZS.LJI();
                if (iLJI != -1) {
                    if (iLJI == 1) {
                        if (LJIILJJIL(cls, c1516680pZS)) {
                            List<T> list = c472830IgT.data;
                            C1515210pX5.LIZLLL().getClass();
                            list.add((T) C1515210pX5.LJI(cls).LIZJ(c1516680pZS));
                        }
                    } else {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                } else {
                    c1516680pZS.LJ(jLIZJ);
                    return c472830IgT;
                }
            }
        } else {
            c472830IgT.LJ = LJIIJJI(c1528350psH);
            return c472830IgT;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [R extends com.bytedance.android.livesdk.model.Extra, com.bytedance.android.livesdk.model.Extra] */
    public static C470590Icr LJIIJ(Class cls, C1516680pZS c1516680pZS, C1528350psH c1528350psH) throws IOException {
        C470590Icr c470590Icr = new C470590Icr();
        c470590Icr.statusCode = c1528350psH.LIZ;
        ?? extra = new Extra();
        extra.now = c1528350psH.LJ;
        c470590Icr.extra = extra;
        if (c1528350psH.LIZ == 0) {
            long jLIZJ = c1516680pZS.LIZJ();
            while (true) {
                int iLJI = c1516680pZS.LJI();
                if (iLJI != -1) {
                    if (iLJI == 1) {
                        if (LJIILJJIL(cls, c1516680pZS)) {
                            C1515210pX5.LIZLLL().getClass();
                            c470590Icr.data = C1515210pX5.LJI(cls).LIZJ(c1516680pZS);
                        } else if (cls == Void.class) {
                            c470590Icr.data = null;
                        } else if (cls == Unit.class) {
                            c470590Icr.data = Unit.LIZ;
                        } else {
                            c470590Icr.data = new Object();
                        }
                    } else {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                } else {
                    c1516680pZS.LJ(jLIZJ);
                    return c470590Icr;
                }
            }
        } else {
            c470590Icr.LJ = LJIIJJI(c1528350psH);
            return c470590Icr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Object] */
    public static StartLiveResponse LJIIL(Class cls, C1516680pZS c1516680pZS, C1528350psH c1528350psH) throws IOException {
        StartLiveResponse startLiveResponse = new StartLiveResponse();
        startLiveResponse.statusCode = c1528350psH.LIZ;
        Extra extra = new Extra();
        extra.now = c1528350psH.LJ;
        startLiveResponse.extra = extra;
        if (c1528350psH.LIZ == 0) {
            long jLIZJ = c1516680pZS.LIZJ();
            while (true) {
                int iLJI = c1516680pZS.LJI();
                if (iLJI != -1) {
                    if (iLJI == 1) {
                        if (LJIILJJIL(cls, c1516680pZS)) {
                            C1515210pX5.LIZLLL().getClass();
                            startLiveResponse.data = C1515210pX5.LJI(cls).LIZJ(c1516680pZS);
                        } else {
                            C1516700pZU.LJ(c1516680pZS);
                        }
                    } else {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                } else {
                    c1516680pZS.LJ(jLIZJ);
                    return startLiveResponse;
                }
            }
        } else {
            Room room = (Room) startLiveResponse.data;
            if (room != null) {
                room.message = c1528350psH.LIZIZ;
                room.prompts = c1528350psH.LIZJ;
            }
            RequestError requestError = new RequestError();
            requestError.message = c1528350psH.LIZIZ;
            requestError.prompts = c1528350psH.LIZJ;
            requestError.alert = c1528350psH.LIZLLL;
            startLiveResponse.LIZ = requestError;
            return startLiveResponse;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<TypedInput, ?> LJ(final Type type, final Annotation[] annotationArr, final Retrofit retrofit) {
        String strValue;
        if (!(type instanceof ParameterizedType)) {
            return LJIILIIL(type, annotationArr, retrofit);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class)) {
            return LJIILIIL(type, annotationArr, retrofit);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        final Class[] clsArr = new Class[2];
        int i = 0;
        if (actualTypeArguments.length >= 1) {
            Type type2 = actualTypeArguments[0];
            if (!(type2 instanceof Class)) {
                return LJIILIIL(type, annotationArr, retrofit);
            }
            clsArr[0] = type2;
        }
        if (actualTypeArguments.length == 2) {
            Type type3 = actualTypeArguments[1];
            if (!(type3 instanceof Class)) {
                return LJIILIIL(type, annotationArr, retrofit);
            }
            clsArr[1] = type3;
        } else if (actualTypeArguments.length > 2) {
            return LJIILIIL(type, annotationArr, retrofit);
        }
        final Class cls = (Class) rawType;
        if (cls != C470590Icr.class && cls != C472830IgT.class && cls != BaseResponse.class && cls != BaseListResponse.class && cls != C926820aE4.class && cls != StartLiveResponse.class) {
            return LJIILIIL(type, annotationArr, retrofit);
        }
        int length = annotationArr.length;
        while (true) {
            if (i < length) {
                Annotation annotation = annotationArr[i];
                if (annotation instanceof InterfaceC1501160pAQ) {
                    strValue = ((InterfaceC1501160pAQ) annotation).value();
                    break;
                }
                if (annotation instanceof InterfaceC1501170pAR) {
                    strValue = ((InterfaceC1501170pAR) annotation).value();
                    break;
                }
                i++;
            } else {
                strValue = null;
                break;
            }
        }
        TextUtils.isEmpty(strValue);
        return new InterfaceC1501660pBE() { // from class: X.0psE
            /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[RETURN] */
            @Override // X.InterfaceC1501660pBE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZ(java.lang.Object r9) throws java.io.IOException {
                /*
                    r8 = this;
                    X.0psF r5 = r8.LIZ
                    java.lang.Class r7 = r2
                    java.lang.Class[] r6 = r3
                    java.lang.reflect.Type r4 = r4
                    java.lang.annotation.Annotation[] r3 = r5
                    com.bytedance.retrofit2.Retrofit r2 = r6
                    com.bytedance.retrofit2.mime.TypedInput r9 = (com.bytedance.retrofit2.mime.TypedInput) r9
                    r5.getClass()
                    java.lang.String r1 = r9.mimeType()
                    java.lang.String r0 = "application/x-protobuf"
                    boolean r0 = android.text.TextUtils.equals(r1, r0)
                    if (r0 == 0) goto Lb5
                    java.lang.ThreadLocal<X.0pZS> r0 = r5.LIZ
                    java.lang.Object r3 = r0.get()
                    X.0pZS r3 = (X.C1516680pZS) r3
                    if (r3 != 0) goto L31
                    X.0pZS r3 = new X.0pZS
                    r3.<init>()
                    java.lang.ThreadLocal<X.0pZS> r0 = r5.LIZ
                    r0.set(r3)
                L31:
                    java.io.InputStream r1 = r9.in()
                    X.0pIj r0 = new X.0pIj
                    r0.<init>(r1)
                    r3.LJIIL(r0)
                    com.bytedance.android.live.network.response.pb.ProtoResponse r4 = com.bytedance.android.live.network.response.pb.ProtoResponse.LIZ(r3)
                    byte[] r1 = r4.body
                    X.0pIl r0 = new X.0pIl
                    r0.<init>(r1)
                    r3.LJIIL(r0)
                    java.lang.Class<X.0Icr> r0 = X.C470590Icr.class
                    r5 = 0
                    r2 = 0
                    if (r7 != r0) goto L5a
                    r1 = r6[r2]     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    X.0psH r0 = r4.header     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    X.0Icr r0 = X.C1528330psF.LJIIJ(r1, r3, r0)     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    goto L9c
                L5a:
                    java.lang.Class<X.0IgT> r0 = X.C472830IgT.class
                    if (r7 != r0) goto L67
                    r1 = r6[r2]     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    X.0psH r0 = r4.header     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    X.0IgT r1 = X.C1528330psF.LJIIIZ(r1, r3, r0)     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    goto L9a
                L67:
                    java.lang.Class<com.bytedance.android.live.network.response.BaseResponse> r0 = com.bytedance.android.live.network.response.BaseResponse.class
                    r1 = 1
                    if (r7 != r0) goto L77
                    r2 = r6[r2]     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    r1 = r6[r1]     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    X.0psH r0 = r4.header     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    com.bytedance.android.live.network.response.BaseResponse r0 = X.C1528330psF.LJII(r2, r1, r3, r0)     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    goto L9c
                L77:
                    java.lang.Class<X.0aE4> r0 = X.C926820aE4.class
                    if (r7 != r0) goto L82
                    r0 = r6[r2]     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    X.0aE4 r0 = X.C1528330psF.LJIIIIZZ(r0, r3, r4)     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    goto L9c
                L82:
                    java.lang.Class<com.bytedance.android.live.network.response.StartLiveResponse> r0 = com.bytedance.android.live.network.response.StartLiveResponse.class
                    if (r7 != r0) goto L90
                    r1 = r6[r2]     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    X.0psH r0 = r4.header     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    com.bytedance.android.live.network.response.StartLiveResponse r0 = X.C1528330psF.LJIIL(r1, r3, r0)     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    r1 = r5
                    goto L9f
                L90:
                    r2 = r6[r2]     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    r1 = r6[r1]     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    X.0psH r0 = r4.header     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                    com.bytedance.android.live.network.response.BaseListResponse r1 = X.C1528330psF.LJI(r2, r1, r3, r0)     // Catch: java.lang.Exception -> La6 java.io.IOException -> Lb0
                L9a:
                    r0 = r5
                    goto L9f
                L9c:
                    r1 = r5
                    r5 = r0
                    r0 = r1
                L9f:
                    if (r5 != 0) goto La5
                    if (r0 == 0) goto La4
                    return r0
                La4:
                    return r1
                La5:
                    return r5
                La6:
                    r1 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                    java.io.IOException r0 = new java.io.IOException
                    r0.<init>(r1)
                    throw r0
                Lb0:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    throw r0
                Lb5:
                    X.09DO r0 = r5.LJIILIIL(r4, r3, r2)
                    java.lang.Object r5 = r0.LIZ(r9)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1528320psE.LIZ(java.lang.Object):java.lang.Object");
            }
        };
    }

    public final C09DO LJIILIIL(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return (C09DO) this.LIZIZ.LJ(type, annotationArr, retrofit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static BaseListResponse LJI(Class cls, Class cls2, C1516680pZS c1516680pZS, C1528350psH c1528350psH) throws IOException {
        R r;
        BaseListResponse baseListResponse = new BaseListResponse();
        int i = c1528350psH.LIZ;
        baseListResponse.statusCode = i;
        if (i == 0) {
            baseListResponse.data = new ArrayList();
            long jLIZJ = c1516680pZS.LIZJ();
            while (true) {
                int iLJI = c1516680pZS.LJI();
                if (iLJI != -1) {
                    if (iLJI != 1) {
                        if (iLJI != 2) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            C1515210pX5.LIZLLL().getClass();
                            R r2 = (R) C1515210pX5.LJI(cls2).LIZJ(c1516680pZS);
                            baseListResponse.extra = r2;
                            r2.now = c1528350psH.LJ;
                        }
                    } else if (LJIILJJIL(cls, c1516680pZS)) {
                        List<T> list = baseListResponse.data;
                        C1515210pX5.LIZLLL().getClass();
                        list.add((T) C1515210pX5.LJI(cls).LIZJ(c1516680pZS));
                    }
                } else {
                    c1516680pZS.LJ(jLIZJ);
                    return baseListResponse;
                }
            }
        } else {
            baseListResponse.LJ = LJIIJJI(c1528350psH);
            if (TextUtils.isEmpty(c1528350psH.LJFF)) {
                r = 0;
            } else {
                r = (R) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, c1528350psH.LJFF, cls2);
            }
            baseListResponse.extra = r;
            return baseListResponse;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, java.lang.Object] */
    public static BaseResponse LJII(Class cls, Class cls2, C1516680pZS c1516680pZS, C1528350psH c1528350psH) throws IOException {
        BaseResponse baseResponse = new BaseResponse();
        int i = c1528350psH.LIZ;
        baseResponse.statusCode = i;
        R r = 0;
        if (i == 0) {
            long jLIZJ = c1516680pZS.LIZJ();
            while (true) {
                int iLJI = c1516680pZS.LJI();
                if (iLJI != -1) {
                    if (iLJI != 1) {
                        if (iLJI != 2) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            C1515210pX5.LIZLLL().getClass();
                            R r2 = (R) C1515210pX5.LJI(cls2).LIZJ(c1516680pZS);
                            baseResponse.extra = r2;
                            r2.now = c1528350psH.LJ;
                        }
                    } else if (LJIILJJIL(cls, c1516680pZS)) {
                        C1515210pX5.LIZLLL().getClass();
                        baseResponse.data = C1515210pX5.LJI(cls).LIZJ(c1516680pZS);
                    } else if (cls == Void.class) {
                        baseResponse.data = null;
                    } else if (cls == Unit.class) {
                        baseResponse.data = Unit.LIZ;
                    } else {
                        baseResponse.data = new Object();
                    }
                } else {
                    c1516680pZS.LJ(jLIZJ);
                    return baseResponse;
                }
            }
        } else {
            baseResponse.LJ = LJIIJJI(c1528350psH);
            if (!TextUtils.isEmpty(c1528350psH.LJFF)) {
                r = (R) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, c1528350psH.LJFF, cls2);
            }
            baseResponse.extra = r;
            return baseResponse;
        }
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<?, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return this.LIZIZ.LIZLLL(type, annotationArr, annotationArr2, retrofit);
    }
}
