package X;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: X.13Ib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19986713Ib {
    public static final String LIZ(InterfaceC19983313Gt interfaceC19983313Gt, AbstractC19987213Ig abstractC19987213Ig) {
        for (Annotation annotation : interfaceC19983313Gt.getAnnotations()) {
            if (annotation instanceof C13JQ) {
                return ((C13JQ) annotation).discriminator();
            }
        }
        return abstractC19987213Ig.LIZ.LJIIIZ;
    }
}
