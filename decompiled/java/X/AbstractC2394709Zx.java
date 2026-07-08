package X;

import com.bytedance.retrofit2.RequestFactory;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.AwS582S0100000_3;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09Zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2394709Zx<ResponseT, ReturnT> extends AbstractC2396209aC<ReturnT> {
    public final RequestFactory<ReturnT> LIZ;

    public abstract Object LIZJ(SsHttpCall ssHttpCall, Object[] objArr);

    public AbstractC2394709Zx(RequestFactory<ReturnT> requestFactory) {
        this.LIZ = requestFactory;
    }

    @Override // X.AbstractC2396209aC
    public final ReturnT LIZ(Object[] objArr) {
        return (ReturnT) LIZJ(new SsHttpCall(this.LIZ, objArr), objArr);
    }

    public static <ResponseT, ReturnT> AbstractC2394709Zx<ResponseT, ReturnT> LIZLLL(Retrofit retrofit, Method method, final RequestFactory requestFactory) {
        Type genericReturnType;
        boolean z;
        boolean z2 = requestFactory.isKotlinSuspendFunction;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeLJ = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
            if (typeLJ instanceof WildcardType) {
                typeLJ = ((WildcardType) typeLJ).getLowerBounds()[0];
            }
            if (C2396109aB.LJFF(typeLJ) == C0X52.class && (typeLJ instanceof ParameterizedType)) {
                typeLJ = C2396109aB.LJ(0, (ParameterizedType) typeLJ);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new C2395809a8(null, C0X9S.class, typeLJ);
            if (!C2396109aB.LJIIIIZZ(annotations, InterfaceC2394909Zz.class)) {
                Annotation[] annotationArr = new Annotation[annotations.length + 1];
                annotationArr[0] = new InterfaceC2394909Zz() { // from class: X.09Zy
                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return 0;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(e3.g);
                        sbLIZ.append(InterfaceC2394909Zz.class.getName());
                        sbLIZ.append("()");
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // java.lang.annotation.Annotation
                    public final Class<? extends Annotation> annotationType() {
                        return InterfaceC2394909Zz.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return obj instanceof InterfaceC2394909Zz;
                    }
                };
                System.arraycopy(annotations, 0, annotationArr, 1, annotations.length);
                annotations = annotationArr;
            }
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        try {
            final C09SJ<?, ?> c09sjLIZIZ = retrofit.LIZIZ(null, genericReturnType, annotations);
            Type typeLIZ = c09sjLIZIZ.LIZ();
            if (typeLIZ != C0XLY.class) {
                if (typeLIZ != C0X52.class) {
                    if (typeLIZ != C2175508fh.class) {
                        if (requestFactory.httpMethod.equals("HEAD") && !Void.class.equals(typeLIZ)) {
                            throw C2396109aB.LJIIIZ(method, null, "HEAD method must use Void as response type.", new Object[0]);
                        }
                        try {
                            requestFactory.responseConverter = retrofit.LJ(typeLIZ, method.getAnnotations());
                            if (!z2) {
                                return new AbstractC2394709Zx<ResponseT, ReturnT>(requestFactory, c09sjLIZIZ) { // from class: X.09Zw
                                    public final C09SJ<ResponseT, ReturnT> LIZIZ;

                                    {
                                        this.LIZIZ = c09sjLIZIZ;
                                    }

                                    @Override // X.AbstractC2394709Zx
                                    public final Object LIZJ(SsHttpCall ssHttpCall, Object[] objArr) {
                                        return this.LIZIZ.LIZIZ(ssHttpCall);
                                    }
                                };
                            }
                            if (z) {
                                return new AbstractC2394709Zx<ResponseT, Object>(requestFactory, c09sjLIZIZ) { // from class: X.09Zv
                                    public final C09SJ<ResponseT, C0X9S<ResponseT>> LIZIZ;

                                    {
                                        this.LIZIZ = c09sjLIZIZ;
                                    }

                                    @Override // X.AbstractC2394709Zx
                                    public final Object LIZJ(SsHttpCall ssHttpCall, Object[] objArr) {
                                        C0X9S<ResponseT> c0x9sLIZIZ = this.LIZIZ.LIZIZ(ssHttpCall);
                                        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) objArr[objArr.length - 1];
                                        try {
                                            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
                                            c2252611DEt.LJIJJ();
                                            c2252611DEt.LJJII(new AwS582S0100000_3(c0x9sLIZIZ, 28));
                                            c0x9sLIZIZ.enqueue(new C1769206wM(c2252611DEt, 0));
                                            Object objLJIJ = c2252611DEt.LJIJ();
                                            if (objLJIJ == C099R.LJFF()) {
                                                C099Q.LIZJ(interfaceC1364105Vn);
                                            }
                                            return objLJIJ;
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            return C2394209Zs.LIZIZ(e, interfaceC1364105Vn);
                                        }
                                    }
                                };
                            }
                            return new AbstractC2394709Zx<ResponseT, Object>(requestFactory, c09sjLIZIZ) { // from class: X.09Zu
                                public final C09SJ<ResponseT, C0X9S<ResponseT>> LIZIZ;
                                public final boolean LIZJ = false;

                                {
                                    this.LIZIZ = c09sjLIZIZ;
                                }

                                @Override // X.AbstractC2394709Zx
                                public final Object LIZJ(SsHttpCall ssHttpCall, Object[] objArr) {
                                    C0X9S<ResponseT> c0x9sLIZIZ = this.LIZIZ.LIZIZ(ssHttpCall);
                                    InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) objArr[objArr.length - 1];
                                    try {
                                        if (this.LIZJ) {
                                            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
                                            c2252611DEt.LJIJJ();
                                            c2252611DEt.LJJII(new AwS582S0100000_3(c0x9sLIZIZ, 27));
                                            c0x9sLIZIZ.enqueue(new C2501609rC(c2252611DEt, 0));
                                            Object objLJIJ = c2252611DEt.LJIJ();
                                            if (objLJIJ == C099R.LJFF()) {
                                                C099Q.LIZJ(interfaceC1364105Vn);
                                                return objLJIJ;
                                            }
                                            return objLJIJ;
                                        }
                                        return C2394209Zs.LIZ(c0x9sLIZIZ, interfaceC1364105Vn);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        return C2394209Zs.LIZIZ(e, interfaceC1364105Vn);
                                    }
                                }
                            };
                        } catch (RuntimeException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw C2396109aB.LJIIIZ(method, e, "Unable to create converter for %s", typeLIZ);
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("'");
                    sbLIZ.append(C2396109aB.LJFF(typeLIZ).getName());
                    sbLIZ.append("' is not a valid response body type.");
                    throw C2396109aB.LJIIIZ(method, null, C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                }
                throw C2396109aB.LJIIIZ(method, null, "Response must include generic type (e.g., SsResponse<String>)", new Object[0]);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("'");
            sbLIZ2.append(C2396109aB.LJFF(typeLIZ).getName());
            sbLIZ2.append("' is not a valid response body type. Did you mean ResponseBody?");
            throw C2396109aB.LJIIIZ(method, null, C2188811AlT.LIZIZ(sbLIZ2), new Object[0]);
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw C2396109aB.LJIIIZ(method, e2, "Unable to create call adapter for %s", genericReturnType);
        }
    }
}
