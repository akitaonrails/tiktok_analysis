package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0YS0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YS0 extends AbstractC874400YRy {
    public C0YS0() {
        super("camera-validate-video-attachment");
    }

    @Override // X.AbstractC873650YPb
    public final boolean LIZIZ(C873880YPy c873880YPy) {
        Integer num = c873880YPy.LIZ;
        if (num != null && num.intValue() == 1803) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC874400YRy
    public final boolean LIZJ(C869590Y9l c869590Y9l) {
        List<C0YC6> attachments;
        if (c869590Y9l != null && (attachments = c869590Y9l.getAttachments()) != null) {
            Iterator<C0YC6> it2 = attachments.iterator();
            while (it2.hasNext()) {
                String vid = it2.next().getVid();
                if (vid != null && vid.length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
