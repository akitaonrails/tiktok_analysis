package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import org.w3c.dom.Document;

/* JADX INFO: renamed from: X.0dLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046710dLR {
    public static final Document LIZ(String str) throws C1046740dLU {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(Charsets.UTF_8));
            try {
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(byteArrayInputStream);
                C2107108Nh.LIZ(byteArrayInputStream, null);
                return document;
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(byteArrayInputStream, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            C1AF0.LJ(th4);
            throw new C1046740dLU(th4);
        }
    }

    public static Sequence LIZIZ(C197025126t c197025126t, XPath xPath) {
        return C09RB.LJIIIZ(new C08LY(new C08LY(c197025126t, new AwS595S0100000_16(xPath, 19)), AFwS231S0000000_3.get$arr$(8)), AFwS229S0000000_2.get$arr$(7));
    }

    public static final C197025126t LIZJ(XPath xPath, Object obj, Sequence sequence) {
        return C09RB.LJIILIIL(sequence, new AwS382S0200000_16(xPath, obj, 5));
    }
}
