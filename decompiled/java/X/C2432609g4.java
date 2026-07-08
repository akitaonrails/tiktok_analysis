package X;

import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.09g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2432609g4 {
    public static final C2458409kE LIZJ = new C2458409kE("LocalTestingConfigParser");
    public final XmlPullParser LIZ;
    public final C2426309f3 LIZIZ;

    public C2432609g4(XmlPullParser xmlPullParser) {
        this.LIZ = xmlPullParser;
        C2426009f0 c2426009f0 = AbstractC2426109f1.LIZ;
        C2426309f3 c2426309f3 = new C2426309f3();
        c2426309f3.LIZIZ = new HashMap();
        this.LIZIZ = c2426309f3;
    }

    public final void LIZ(String str, InterfaceC2433209gA interfaceC2433209gA) {
        while (true) {
            int next = this.LIZ.next();
            if (next != 3 && next != 1) {
                if (this.LIZ.getEventType() == 2) {
                    if (this.LIZ.getName().equals(str)) {
                        interfaceC2433209gA.zza();
                    } else {
                        throw new XmlPullParserException(C786410Ut5.j4("Expected '%s' tag but found '%s'.", new Object[]{str, this.LIZ.getName()}), this.LIZ, null);
                    }
                }
            } else {
                return;
            }
        }
    }
}
