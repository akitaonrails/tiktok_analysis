package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZWA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZWA {
    public static <T extends BaseTemplate> C461530I7z LIZ(C0ZWC<T> c0zwc, InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (!(interfaceC1891350zJl instanceof C0ZWC)) {
            return C461450I7r.LIZIZ(c0zwc, interfaceC1891350zJl);
        }
        C0ZWC c0zwc2 = (C0ZWC) interfaceC1891350zJl;
        if (c0zwc.getImageData().LIZ == c0zwc2.getImageData().LIZ && c0zwc.getImageData().LIZIZ == c0zwc2.getImageData().LIZIZ && c0zwc.getImageData().LIZJ.LIZ(c0zwc2.getImageData().LIZJ)) {
            z = false;
        } else {
            z = true;
        }
        C0ZWG c0zwg = new C0ZWG(z, !Intrinsics.LJFF(c0zwc.LJLIL(), c0zwc2.LJLIL()), !Intrinsics.LJFF(c0zwc.getImageData().LIZLLL, c0zwc2.getImageData().LIZLLL), !c0zwc.getImageData().LIZJ.LIZJ(c0zwc2.getImageData().LIZJ), !c0zwc.getImageData().LIZJ.LIZIZ(c0zwc2.getImageData().LIZJ));
        C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0zwc, interfaceC1891350zJl);
        if (c461530I7zLIZIZ == null) {
            return null;
        }
        return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0zwg, 5);
    }
}
