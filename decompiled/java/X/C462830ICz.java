package X;

import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ICz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462830ICz {
    public static AwemeCardTemplate LIZIZ(C0ZR4 c0zr4) {
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(C0I6Y.LIZ(c0zr4), BaseTemplate.class);
        if (baseTemplateLIZ instanceof AwemeCardTemplate) {
            return (AwemeCardTemplate) baseTemplateLIZ;
        }
        return null;
    }

    public static C461530I7z LIZ(C0ZR4 c0zr4, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0ZR4 c0zr42;
        if ((interfaceC1891350zJl instanceof C0ZR4) && (c0zr42 = (C0ZR4) interfaceC1891350zJl) != null) {
            C0ZR5 c0zr5 = new C0ZR5(!Intrinsics.LJFF(c0zr4.LLILII().LIZ.LIZ.getContentPB(), c0zr42.LLILII().LIZ.LIZ.getContentPB()), !Intrinsics.LJFF(c0zr4.LIZJ(), c0zr42.LIZJ()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0zr4, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0zr5, 5);
        }
        return C461450I7r.LIZIZ(c0zr4, interfaceC1891350zJl);
    }
}
