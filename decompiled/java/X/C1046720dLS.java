package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/* JADX INFO: renamed from: X.0dLS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046720dLS implements InterfaceC1046680dLO {
    public static Document LIZ(final String str) throws Exception {
        if (str != null) {
            try {
                return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(str);
            } catch (SAXException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                throw new C1046750dLV(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new Exception(str, th) { // from class: X.0OAH
                    public final String url;

                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetch failed ");
                        sbLIZ.append(str);
                        super(C2188811AlT.LIZIZ(sbLIZ), th);
                        this.url = str;
                    }
                };
            }
        }
        return null;
    }
}
