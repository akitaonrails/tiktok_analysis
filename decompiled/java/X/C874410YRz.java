package X;

import java.util.List;

/* JADX INFO: renamed from: X.0YRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874410YRz extends AbstractC874400YRy {
    public C874410YRz() {
        super("camera-validate-photo-attachment");
    }

    @Override // X.AbstractC873650YPb
    public final boolean LIZIZ(C873880YPy c873880YPy) {
        Integer num = c873880YPy.LIZ;
        if (num != null && num.intValue() == 1802) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC874400YRy
    public final boolean LIZJ(C869590Y9l c869590Y9l) {
        List<C0YC6> attachments;
        String secretKey;
        if (c869590Y9l != null && (attachments = c869590Y9l.getAttachments()) != null) {
            for (C0YC6 c0yc6 : attachments) {
                String uri = c0yc6.getUri();
                if (uri != null && uri.length() > 0 && (secretKey = c0yc6.getSecretKey()) != null && secretKey.length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
