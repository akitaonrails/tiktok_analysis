package X;

import Y.AComparatorS35S0000000_16;
import com.bytedance.ies.ugc.aweme.rich.model.vast.model.AdVerification;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.List;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import kotlin.text.a0;
import kotlin.text.u;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: X.0dLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046600dLG {
    public final C1046620dLI LIZ;
    public final XPath LIZIZ;
    public int LIZJ;

    public C1046600dLG(C1046620dLI c1046620dLI) {
        this(c1046620dLI, 0);
    }

    public final void LIZIZ(Node node) {
        C08QT c08qt = new C08QT((C08QU) C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, node, C13LQ.LJIIJJI(new String[]{"./Error"})), this.LIZIZ));
        while (c08qt.hasNext()) {
            Object next = c08qt.next();
            C1046620dLI c1046620dLI = this.LIZ;
            c1046620dLI.errorSet = C590190NCv.LIZIZ(next, c1046620dLI.errorSet);
        }
        C08QT c08qt2 = new C08QT((C08QU) C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, node, C13LQ.LJIIJJI(new String[]{"./Impression"})), this.LIZIZ));
        while (c08qt2.hasNext()) {
            Object next2 = c08qt2.next();
            C1046620dLI c1046620dLI2 = this.LIZ;
            c1046620dLI2.impressionSet = C590190NCv.LIZIZ(next2, c1046620dLI2.impressionSet);
        }
        C197024126s c197024126s = new C197024126s(C1046700dLQ.LIZJ(this.LIZIZ, node, C13LQ.LJIIJJI(new String[]{"./AdVerifications/Verification", "./Extension[@type='AdVerifications']/AdVerifications/Verification", "./Extensions/Extension[@type='AdVerifications']/AdVerifications/Verification"})));
        while (c197024126s.hasNext()) {
            Object next3 = c197024126s.next();
            AdVerification adVerification = new AdVerification();
            adVerification.vender = a0.LJLIIIL(this.LIZIZ.evaluate("./@vendor", next3)).toString();
            adVerification.javascriptResource = a0.LJLIIIL(this.LIZIZ.evaluate("./JavaScriptResource/text()", next3)).toString();
            adVerification.verificationParameters = a0.LJLIIIL(this.LIZIZ.evaluate("./VerificationParameters/text()", next3)).toString();
            C1046620dLI c1046620dLI3 = this.LIZ;
            c1046620dLI3.adVerificationList = C590190NCv.LIZ(adVerification, c1046620dLI3.adVerificationList);
        }
        C197024126s c197024126s2 = new C197024126s(C1046700dLQ.LIZJ(this.LIZIZ, node, C13LQ.LJIIJJI(new String[]{"./ViewableImpression"})));
        while (c197024126s2.hasNext()) {
            Object next4 = c197024126s2.next();
            C08QT c08qt3 = new C08QT((C08QU) C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, next4, C13LQ.LJIIJJI(new String[]{"./Viewable"})), this.LIZIZ));
            while (c08qt3.hasNext()) {
                Object next5 = c08qt3.next();
                C1046620dLI c1046620dLI4 = this.LIZ;
                c1046620dLI4.viewableSet = C590190NCv.LIZIZ(next5, c1046620dLI4.viewableSet);
            }
            C08QT c08qt4 = new C08QT((C08QU) C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, next4, C13LQ.LJIIJJI(new String[]{"./NotViewable"})), this.LIZIZ));
            while (c08qt4.hasNext()) {
                Object next6 = c08qt4.next();
                C1046620dLI c1046620dLI5 = this.LIZ;
                c1046620dLI5.notViewableSet = C590190NCv.LIZIZ(next6, c1046620dLI5.notViewableSet);
            }
            C08QT c08qt5 = new C08QT((C08QU) C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, next4, C13LQ.LJIIJJI(new String[]{"./ViewUndetermined"})), this.LIZIZ));
            while (c08qt5.hasNext()) {
                Object next7 = c08qt5.next();
                C1046620dLI c1046620dLI6 = this.LIZ;
                c1046620dLI6.viewUndeterminedSet = C590190NCv.LIZIZ(next7, c1046620dLI6.viewUndeterminedSet);
            }
        }
    }

    public final C1045330dJD LJI(Node node) {
        C1045330dJD c1045330dJD = new C1045330dJD();
        XPath xPath = this.LIZIZ;
        c1045330dJD.clickThrough = (String) C09RB.LJIIL(C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(xPath, node, C13LQ.LJIIJJI(new String[]{"./ClickThrough", "./IconClickThrough"})), xPath));
        C08QT c08qt = new C08QT((C08QU) C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, node, C13LQ.LJIIJJI(new String[]{"./ClickTracking", "./IconClickTracking"})), this.LIZIZ));
        while (c08qt.hasNext()) {
            c1045330dJD.clickTracking = C590190NCv.LIZIZ(c08qt.next(), c1045330dJD.clickTracking);
        }
        return c1045330dJD;
    }

    public C1046600dLG(C1046620dLI c1046620dLI, int i) {
        this.LIZ = c1046620dLI;
        this.LIZIZ = XPathFactory.newInstance().newXPath();
    }

    public final boolean LIZJ(int i, String str) {
        List<C1046610dLH> list;
        List<C1046610dLH> list2;
        List<C1046610dLH> list3;
        this.LIZJ++;
        Document documentLIZ = null;
        try {
            if (str != null) {
                try {
                    documentLIZ = C1046700dLQ.LIZ(str);
                } catch (C1046750dLV e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
            if (documentLIZ == null) {
                int i2 = this.LIZJ - 1;
                this.LIZJ = i2;
                if (i2 == 0 && (list3 = this.LIZ.creativeList) != null && list3.size() > 1) {
                    C08XD.LJJ(list3, new AComparatorS35S0000000_16(6));
                }
                return false;
            }
            boolean zLJ = LJ(documentLIZ, i, 0);
            int i3 = this.LIZJ - 1;
            this.LIZJ = i3;
            if (i3 == 0 && (list2 = this.LIZ.creativeList) != null && list2.size() > 1) {
                C08XD.LJJ(list2, new AComparatorS35S0000000_16(7));
            }
            return zLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i4 = this.LIZJ - 1;
            this.LIZJ = i4;
            if (i4 == 0 && (list = this.LIZ.creativeList) != null && list.size() > 1) {
                C08XD.LJJ(list, new AComparatorS35S0000000_16(8));
            }
            throw th;
        }
    }

    public final void LIZLLL(Node node, boolean z) {
        boolean z2;
        C197024126s c197024126s = new C197024126s(C1046700dLQ.LIZJ(this.LIZIZ, node, C13LQ.LJIIJJI(new String[]{"./Creatives/Creative"})));
        while (c197024126s.hasNext()) {
            Object next = c197024126s.next();
            C1046610dLH c1046610dLH = new C1046610dLH();
            c1046610dLH.byWrapper = z;
            c1046610dLH.id = a0.LJLIIIL(this.LIZIZ.evaluate("./@id", next)).toString();
            XPath xPath = this.LIZIZ;
            c1046610dLH.duration = (String) C09RB.LJIIL(C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(xPath, next, C13LQ.LJIIJJI(new String[]{"./Linear/Duration"})), xPath));
            C197024126s c197024126s2 = new C197024126s(C1046700dLQ.LIZJ(this.LIZIZ, next, C13LQ.LJIIJJI(new String[]{"./Linear/TrackingEvents/Tracking"})));
            while (c197024126s2.hasNext()) {
                Object next2 = c197024126s2.next();
                C1046670dLN c1046670dLN = new C1046670dLN();
                c1046670dLN.name = a0.LJLIIIL(this.LIZIZ.evaluate("./@event", next2)).toString();
                c1046670dLN.offset = a0.LJLIIIL(this.LIZIZ.evaluate("./@offset", next2)).toString();
                c1046670dLN.url = a0.LJLIIIL(this.LIZIZ.evaluate("./text()", next2)).toString();
                c1046610dLH.trackingEventList = C590190NCv.LIZ(c1046670dLN, c1046610dLH.trackingEventList);
            }
            C08LX c08lx = new C08LX(new C08LY(C1046700dLQ.LIZJ(this.LIZIZ, next, C13LQ.LJIIJJI(new String[]{"./Linear/VideoClicks"})), new C1046630dLJ(this)));
            while (c08lx.hasNext()) {
                c1046610dLH.clickList = C590190NCv.LIZ(c08lx.next(), c1046610dLH.clickList);
            }
            C197024126s c197024126s3 = new C197024126s(C1046700dLQ.LIZJ(this.LIZIZ, next, C13LQ.LJIIJJI(new String[]{"./Linear/MediaFiles/MediaFile"})));
            while (c197024126s3.hasNext()) {
                Object next3 = c197024126s3.next();
                C1046650dLL c1046650dLL = new C1046650dLL();
                c1046650dLL.delivery = a0.LJLIIIL(this.LIZIZ.evaluate("./@delivery", next3)).toString();
                c1046650dLL.type = a0.LJLIIIL(this.LIZIZ.evaluate("./@type", next3)).toString();
                c1046650dLL.url = a0.LJLIIIL(this.LIZIZ.evaluate("./text()", next3)).toString();
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL(this.LIZIZ.evaluate("./@bitrate", next3)).toString());
                if (numLJIIJJI != null) {
                    c1046650dLL.bitRate = numLJIIJJI.intValue();
                }
                Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(a0.LJLIIIL(this.LIZIZ.evaluate("./@width", next3)).toString());
                if (numLJIIJJI2 != null) {
                    c1046650dLL.width = numLJIIJJI2.intValue();
                }
                Integer numLJIIJJI3 = C2095008Iq.LJIIJJI(a0.LJLIIIL(this.LIZIZ.evaluate("./@height", next3)).toString());
                if (numLJIIJJI3 != null) {
                    c1046650dLL.height = numLJIIJJI3.intValue();
                }
                String string = a0.LJLIIIL(this.LIZIZ.evaluate("./@scalable", next3)).toString();
                if (string.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c1046650dLL.scalable = Boolean.valueOf(u.LJIJI("true", string, true));
                }
                String string2 = a0.LJLIIIL(this.LIZIZ.evaluate("./@maintainAspectRatio", next3)).toString();
                if (string2.length() > 0) {
                    c1046650dLL.maintainAspectRatio = Boolean.valueOf(u.LJIJI("true", string2, true));
                }
                c1046610dLH.mediaFileList = C590190NCv.LIZ(c1046650dLL, c1046610dLH.mediaFileList);
            }
            C197024126s c197024126s4 = new C197024126s(C1046700dLQ.LIZJ(this.LIZIZ, next, C13LQ.LJIIJJI(new String[]{"./Linear/Icons/Icon"})));
            while (c197024126s4.hasNext()) {
                Object next4 = c197024126s4.next();
                C1045320dJC c1045320dJC = new C1045320dJC();
                Integer numLJIIJJI4 = C2095008Iq.LJIIJJI(a0.LJLIIIL(this.LIZIZ.evaluate("./@width", next4)).toString());
                if (numLJIIJJI4 != null) {
                    c1045320dJC.width = numLJIIJJI4.intValue();
                }
                Integer numLJIIJJI5 = C2095008Iq.LJIIJJI(a0.LJLIIIL(this.LIZIZ.evaluate("./@height", next4)).toString());
                if (numLJIIJJI5 != null) {
                    c1045320dJC.width = numLJIIJJI5.intValue();
                }
                c1045320dJC.program = this.LIZIZ.evaluate("./@program", next4);
                c1045320dJC.staticResource = C09RB.LJJIFFI(C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, next4, C13LQ.LJIIJJI(new String[]{"./StaticResource"})), this.LIZIZ));
                c1045320dJC.htmlResource = (String) C09RB.LJIIL(C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, next4, C13LQ.LJIIJJI(new String[]{"./HTMLResource"})), this.LIZIZ));
                c1045320dJC.iFrameResource = (String) C09RB.LJIIL(C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, next4, C13LQ.LJIIJJI(new String[]{"./IFrameResource"})), this.LIZIZ));
                c1045320dJC.viewTracking = C09RB.LJJIFFI(C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, next4, C13LQ.LJIIJJI(new String[]{"./IconViewTracking"})), this.LIZIZ));
                C197024126s c197024126s5 = new C197024126s(C1046700dLQ.LIZJ(this.LIZIZ, next4, C13LQ.LJIIJJI(new String[]{"./IconClicks"})));
                while (c197024126s5.hasNext()) {
                    Node node2 = (Node) c197024126s5.next();
                    c1045320dJC.clickList = C590190NCv.LIZ(LJI(node2), c1045320dJC.clickList);
                }
                c1046610dLH.iconList = C590190NCv.LIZ(c1045320dJC, c1046610dLH.iconList);
            }
            if (z) {
                C1046620dLI c1046620dLI = this.LIZ;
                List<C1046610dLH> linkedList = c1046620dLI.creativeList;
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
                ListProtector.add(linkedList, 0, c1046610dLH);
                c1046620dLI.creativeList = linkedList;
            } else {
                C1046620dLI c1046620dLI2 = this.LIZ;
                c1046620dLI2.creativeList = C590190NCv.LIZ(c1046610dLH, c1046620dLI2.creativeList);
            }
        }
    }

    public final boolean LJFF(int i, String str) {
        Document documentLIZ;
        List<C1046610dLH> list;
        List<C1046610dLH> list2;
        List<C1046610dLH> list3;
        this.LIZJ++;
        try {
            try {
                documentLIZ = C1046720dLS.LIZ(str);
            } catch (C0OAH e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                documentLIZ = null;
            } catch (C1046750dLV e2) {
                TryCatchGuardChecker.doCheck(e2);
                documentLIZ = null;
            }
            if (documentLIZ == null) {
                int i2 = this.LIZJ - 1;
                this.LIZJ = i2;
                if (i2 == 0 && (list3 = this.LIZ.creativeList) != null && list3.size() > 1) {
                    C08XD.LJJ(list3, new AComparatorS35S0000000_16(9));
                }
                return false;
            }
            boolean zLJ = LJ(documentLIZ, i, 0);
            int i3 = this.LIZJ - 1;
            this.LIZJ = i3;
            if (i3 == 0 && (list2 = this.LIZ.creativeList) != null && list2.size() > 1) {
                C08XD.LJJ(list2, new AComparatorS35S0000000_16(10));
            }
            return zLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i4 = this.LIZJ - 1;
            this.LIZJ = i4;
            if (i4 == 0 && (list = this.LIZ.creativeList) != null && list.size() > 1) {
                C08XD.LJJ(list, new AComparatorS35S0000000_16(11));
            }
            throw th;
        }
    }

    public C1046600dLG(C1046620dLI c1046620dLI, InterfaceC1046680dLO interfaceC1046680dLO) {
        this(c1046620dLI, 0);
    }

    public final boolean LIZ(Node node, int i, int i2) {
        if (i < 0) {
            return false;
        }
        C08QT c08qt = new C08QT((C08QU) C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, node, C13LQ.LJIIJJI(new String[]{"./VASTAdTagURI"})), this.LIZIZ));
        boolean z = false;
        while (c08qt.hasNext()) {
            try {
                try {
                    Document documentLIZ = C1046720dLS.LIZ((String) c08qt.next());
                    if (documentLIZ != null && LJ(documentLIZ, i, i2 + 1)) {
                        z = true;
                    }
                    return false;
                } catch (C0OAH e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                } catch (C1046750dLV e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
        return false;
    }

    public final boolean LJ(Document document, int i, int i2) {
        int i3 = i - 1;
        String str = this.LIZ.version;
        if (str == null || str.length() == 0) {
            this.LIZ.version = this.LIZIZ.evaluate("/VAST/@version", document);
        }
        C197024126s c197024126s = new C197024126s(C1046700dLQ.LIZJ(this.LIZIZ, document, C13LQ.LJIIJJI(new String[]{"/VAST/Ad/InLine"})));
        while (c197024126s.hasNext()) {
            Node node = (Node) c197024126s.next();
            String str2 = this.LIZ.adSystem;
            if (str2 == null || str2.length() == 0) {
                this.LIZ.adSystem = (String) C09RB.LJIIL(C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, node, C13LQ.LJIIJJI(new String[]{"./AdSystem"})), this.LIZIZ));
            }
            String str3 = this.LIZ.adTitle;
            if (str3 == null || str3.length() == 0) {
                this.LIZ.adTitle = (String) C09RB.LJIIL(C1046700dLQ.LIZIZ(C1046700dLQ.LIZJ(this.LIZIZ, node, C13LQ.LJIIJJI(new String[]{"./AdTitle"})), this.LIZIZ));
            }
            String string = a0.LJLIIIL(this.LIZIZ.evaluate("./Description/text()", node)).toString();
            if (string.length() > 0) {
                this.LIZ.description = string;
            }
            LIZLLL(node, false);
            LIZIZ(node);
        }
        C197024126s c197024126s2 = new C197024126s(C1046700dLQ.LIZJ(this.LIZIZ, document, C13LQ.LJIIJJI(new String[]{"/VAST/Ad/Wrapper"})));
        while (c197024126s2.hasNext()) {
            Node node2 = (Node) c197024126s2.next();
            LIZLLL(node2, true);
            LIZIZ(node2);
            if (!LIZ(node2, i3, i2)) {
                return false;
            }
        }
        return true;
    }
}
