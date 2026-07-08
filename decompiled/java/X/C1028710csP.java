package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0csP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028710csP {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(InterfaceC1028700csO interfaceC1028700csO, Object obj) {
        if (!(obj instanceof Object[])) {
            if (obj != null) {
                interfaceC1028700csO.getProvidedContexts().put(obj.getClass(), obj);
                for (Class<?> cls : obj.getClass().getInterfaces()) {
                    interfaceC1028700csO.getProvidedContexts().put(cls, obj);
                }
                return;
            }
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public static final void LIZIZ(C1028770csV c1028770csV, Class cls, AwemeRawAd awemeRawAd) {
        if (!(awemeRawAd instanceof Object[])) {
            if (awemeRawAd != null && cls.isAssignableFrom(awemeRawAd.getClass())) {
                c1028770csV.LIZ.put(cls, awemeRawAd);
                for (Class<?> cls2 : cls.getInterfaces()) {
                    c1028770csV.LIZ.put((Class<? extends Object>) cls2, awemeRawAd);
                }
                return;
            }
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }
}
