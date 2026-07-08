package X;

import com.bytedance.android.livesdk.livesetting.LiveAllSuspendApiSupportPbSetting;
import com.bytedance.android.livesdk.livesetting.LiveSuspendSupportPbWhiteListSetting;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.client.Request;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.09SQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09SQ extends C09S8 {
    @Override // X.C09S8
    public final C09SJ<?, ?> LIZ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (C2396109aB.LJFF(type) != C0X9S.class) {
            C20441214yg.LIZIZ("ttlivesdk", "getRawType(returnType) != Call.class");
            return null;
        }
        if (type instanceof ParameterizedType) {
            int i = 0;
            final Type typeLJ = C2396109aB.LJ(0, (ParameterizedType) type);
            int length = annotationArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                Annotation annotation = annotationArr[i];
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("annotation = ");
                sbLIZ.append(annotation);
                sbLIZ.append(", annotation_type:");
                sbLIZ.append(annotation.annotationType());
                C20441214yg.LIZIZ("ttlivesdk", C2188811AlT.LIZIZ(sbLIZ));
                if (annotation instanceof C09SO) {
                    C09SO c09so = (C09SO) annotation;
                    if (c09so != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Found PbRequest annotation: ");
                        sbLIZ2.append(c09so);
                        C20441214yg.LIZIZ("ttlivesdk", C2188811AlT.LIZIZ(sbLIZ2));
                        final EnumC1846380y9E enumC1846380y9EValue = c09so.value();
                        final String str = c09so.settingKey();
                        return new C09SJ<Object, C0X9S<?>>(typeLJ, enumC1846380y9EValue, str) { // from class: X.09SR
                            public final Type LIZ;
                            public final EnumC1846380y9E LIZIZ;
                            public final String LIZJ;

                            @Override // X.C09SJ
                            public final Type LIZ() {
                                return this.LIZ;
                            }

                            @Override // X.C09SJ
                            public final C0X9S<?> LIZIZ(C0X9S<Object> c0x9s) {
                                Request request = c0x9s.request();
                                if (this.LIZIZ != null && this.LIZJ != null) {
                                    if (LiveSuspendSupportPbWhiteListSetting.INSTANCE.supportPb(request.getPath())) {
                                        C09UB.LIZ(request, this.LIZIZ, this.LIZJ);
                                    } else if (LiveAllSuspendApiSupportPbSetting.INSTANCE.enable()) {
                                        C09UB.LIZ(request, this.LIZIZ, this.LIZJ);
                                        return c0x9s;
                                    }
                                }
                                return c0x9s;
                            }

                            {
                                this.LIZ = typeLJ;
                                this.LIZIZ = enumC1846380y9EValue;
                                this.LIZJ = str;
                            }
                        };
                    }
                } else {
                    i++;
                }
            }
            C20441214yg.LIZIZ("ttlivesdk", "PbRequest annotation not found");
            return null;
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
