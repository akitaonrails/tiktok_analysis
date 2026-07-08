package X;

import com.bytedance.retrofit2.Retrofit;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.09SS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09SS extends C09S8 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C09S8 LIZ;

    public C09SS(C2396409aE c2396409aE) {
        this.LIZ = c2396409aE;
    }

    @Override // X.C09S8
    public final C09SJ<?, ?> LIZ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Annotation[] annotationArr2;
        if (annotationArr == null) {
            annotationArr2 = new Annotation[0];
        } else {
            annotationArr2 = annotationArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : annotationArr2) {
            if (annotation instanceof C09SO) {
                arrayList.add(annotation);
            }
        }
        C09SO c09so = (C09SO) C13LP.LJJJLL(arrayList);
        if (c09so == null) {
            return this.LIZ.LIZ(type, annotationArr, retrofit);
        }
        C09SJ<?, ?> c09sjLIZ = this.LIZ.LIZ(type, annotationArr, retrofit);
        if (c09sjLIZ != null) {
            return new C09UD(c09sjLIZ, c09so.value(), c09so.settingKey());
        }
        return null;
    }
}
