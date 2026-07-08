package X;

import Y.AComparatorS35S0000000_16;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vast.model.AdVerification;
import java.util.LinkedList;
import java.util.List;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import kotlin.text.a0;
import kotlin.text.u;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: X.0dLF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046590dLF {
    public final C1045270dJ7 LIZ;
    public final InterfaceC1046660dLM LIZIZ;
    public final XPath LIZJ;
    public int LIZLLL;

    public C1046590dLF(C1045270dJ7 c1045270dJ7) {
        this(c1045270dJ7, (InterfaceC1045310dJB) null, 6);
    }

    public C1046590dLF(C1045270dJ7 c1045270dJ7, InterfaceC1045310dJB interfaceC1045310dJB) {
        this(c1045270dJ7, interfaceC1045310dJB, 4);
    }

    public final void LIZIZ(Node node) {
        C08QT c08qt = new C08QT((C08QU) C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, node, C13LQ.LJIIJJI(new String[]{"./Error"})), this.LIZJ));
        while (c08qt.hasNext()) {
            Object next = c08qt.next();
            C1045270dJ7 c1045270dJ7 = this.LIZ;
            c1045270dJ7.errorSet = C1717206ny.LIZIZ(next, c1045270dJ7.errorSet);
        }
        C08QT c08qt2 = new C08QT((C08QU) C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, node, C13LQ.LJIIJJI(new String[]{"./Impression"})), this.LIZJ));
        while (c08qt2.hasNext()) {
            Object next2 = c08qt2.next();
            C1045270dJ7 c1045270dJ72 = this.LIZ;
            c1045270dJ72.impressionSet = C1717206ny.LIZIZ(next2, c1045270dJ72.impressionSet);
        }
        C197024126s c197024126s = new C197024126s(C1046710dLR.LIZJ(this.LIZJ, node, C13LQ.LJIIJJI(new String[]{"./AdVerifications/Verification", "./Extension[@type='AdVerifications']/AdVerifications/Verification", "./Extensions/Extension[@type='AdVerifications']/AdVerifications/Verification"})));
        while (c197024126s.hasNext()) {
            Object next3 = c197024126s.next();
            AdVerification adVerification = new AdVerification();
            adVerification.vender = a0.LJLIIIL(this.LIZJ.evaluate("./@vendor", next3)).toString();
            adVerification.javascriptResource = a0.LJLIIIL(this.LIZJ.evaluate("./JavaScriptResource/text()", next3)).toString();
            adVerification.verificationParameters = a0.LJLIIIL(this.LIZJ.evaluate("./VerificationParameters/text()", next3)).toString();
            C1045270dJ7 c1045270dJ73 = this.LIZ;
            c1045270dJ73.adVerificationList = C1717206ny.LIZ(adVerification, c1045270dJ73.adVerificationList);
        }
        C197024126s c197024126s2 = new C197024126s(C1046710dLR.LIZJ(this.LIZJ, node, C13LQ.LJIIJJI(new String[]{"./ViewableImpression"})));
        while (c197024126s2.hasNext()) {
            Object next4 = c197024126s2.next();
            C08QT c08qt3 = new C08QT((C08QU) C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, next4, C13LQ.LJIIJJI(new String[]{"./Viewable"})), this.LIZJ));
            while (c08qt3.hasNext()) {
                Object next5 = c08qt3.next();
                C1045270dJ7 c1045270dJ74 = this.LIZ;
                c1045270dJ74.viewableSet = C1717206ny.LIZIZ(next5, c1045270dJ74.viewableSet);
            }
            C08QT c08qt4 = new C08QT((C08QU) C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, next4, C13LQ.LJIIJJI(new String[]{"./NotViewable"})), this.LIZJ));
            while (c08qt4.hasNext()) {
                Object next6 = c08qt4.next();
                C1045270dJ7 c1045270dJ75 = this.LIZ;
                c1045270dJ75.notViewableSet = C1717206ny.LIZIZ(next6, c1045270dJ75.notViewableSet);
            }
            C08QT c08qt5 = new C08QT((C08QU) C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, next4, C13LQ.LJIIJJI(new String[]{"./ViewUndetermined"})), this.LIZJ));
            while (c08qt5.hasNext()) {
                Object next7 = c08qt5.next();
                C1045270dJ7 c1045270dJ76 = this.LIZ;
                c1045270dJ76.viewUndeterminedSet = C1717206ny.LIZIZ(next7, c1045270dJ76.viewUndeterminedSet);
            }
        }
    }

    public final C1045060dIm LJI(Node node) {
        C1045060dIm c1045060dIm = new C1045060dIm();
        XPath xPath = this.LIZJ;
        c1045060dIm.clickThrough = (String) C09RB.LJIIL(C1046710dLR.LIZIZ(C1046710dLR.LIZJ(xPath, node, C13LQ.LJIIJJI(new String[]{"./ClickThrough", "./IconClickThrough"})), xPath));
        C08QT c08qt = new C08QT((C08QU) C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, node, C13LQ.LJIIJJI(new String[]{"./ClickTracking", "./IconClickTracking"})), this.LIZJ));
        while (c08qt.hasNext()) {
            c1045060dIm.clickTracking = C1717206ny.LIZIZ(c08qt.next(), c1045060dIm.clickTracking);
        }
        return c1045060dIm;
    }

    public final boolean LIZJ(int i, String str) {
        Document documentLIZ;
        List<C1045260dJ6> list;
        List<C1045260dJ6> list2;
        List<C1045260dJ6> list3;
        InterfaceC1046660dLM interfaceC1046660dLM = this.LIZIZ;
        if (interfaceC1046660dLM != null) {
            interfaceC1046660dLM.LIZJ();
        }
        this.LIZLLL++;
        if (str != null) {
            try {
                try {
                    documentLIZ = C1046710dLR.LIZ(str);
                } catch (C1046740dLU e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                    InterfaceC1046660dLM interfaceC1046660dLM2 = this.LIZIZ;
                    if (interfaceC1046660dLM2 != null) {
                        interfaceC1046660dLM2.LIZLLL(e);
                    }
                    documentLIZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                InterfaceC1046660dLM interfaceC1046660dLM3 = this.LIZIZ;
                if (interfaceC1046660dLM3 != null) {
                    interfaceC1046660dLM3.exit();
                }
                int i2 = this.LIZLLL - 1;
                this.LIZLLL = i2;
                if (i2 == 0 && (list = this.LIZ.creativeList) != null && list.size() > 1) {
                    C08XD.LJJ(list, new AComparatorS35S0000000_16(14));
                }
                throw th;
            }
        } else {
            documentLIZ = null;
        }
        if (documentLIZ == null) {
            InterfaceC1046660dLM interfaceC1046660dLM4 = this.LIZIZ;
            if (interfaceC1046660dLM4 != null) {
                interfaceC1046660dLM4.exit();
            }
            int i3 = this.LIZLLL - 1;
            this.LIZLLL = i3;
            if (i3 == 0 && (list3 = this.LIZ.creativeList) != null && list3.size() > 1) {
                C08XD.LJJ(list3, new AComparatorS35S0000000_16(12));
            }
            return false;
        }
        InterfaceC1046660dLM interfaceC1046660dLM5 = this.LIZIZ;
        if (interfaceC1046660dLM5 != null) {
            interfaceC1046660dLM5.LIZIZ();
        }
        boolean zLJ = LJ(documentLIZ, i, 0);
        InterfaceC1046660dLM interfaceC1046660dLM6 = this.LIZIZ;
        if (interfaceC1046660dLM6 != null) {
            interfaceC1046660dLM6.exit();
        }
        int i4 = this.LIZLLL - 1;
        this.LIZLLL = i4;
        if (i4 == 0 && (list2 = this.LIZ.creativeList) != null && list2.size() > 1) {
            C08XD.LJJ(list2, new AComparatorS35S0000000_16(13));
        }
        return zLJ;
    }

    public final void LIZLLL(Node node, boolean z) {
        boolean z2;
        C197024126s c197024126s = new C197024126s(C1046710dLR.LIZJ(this.LIZJ, node, C13LQ.LJIIJJI(new String[]{"./Creatives/Creative"})));
        while (c197024126s.hasNext()) {
            Object next = c197024126s.next();
            C1045260dJ6 c1045260dJ6 = new C1045260dJ6();
            c1045260dJ6.byWrapper = z;
            c1045260dJ6.id = a0.LJLIIIL(this.LIZJ.evaluate("./@id", next)).toString();
            XPath xPath = this.LIZJ;
            c1045260dJ6.duration = (String) C09RB.LJIIL(C1046710dLR.LIZIZ(C1046710dLR.LIZJ(xPath, next, C13LQ.LJIIJJI(new String[]{"./Linear/Duration"})), xPath));
            C197024126s c197024126s2 = new C197024126s(C1046710dLR.LIZJ(this.LIZJ, next, C13LQ.LJIIJJI(new String[]{"./Linear/TrackingEvents/Tracking"})));
            while (c197024126s2.hasNext()) {
                Object next2 = c197024126s2.next();
                C1045050dIl c1045050dIl = new C1045050dIl();
                c1045050dIl.name = a0.LJLIIIL(this.LIZJ.evaluate("./@event", next2)).toString();
                c1045050dIl.offset = a0.LJLIIIL(this.LIZJ.evaluate("./@offset", next2)).toString();
                c1045050dIl.url = a0.LJLIIIL(this.LIZJ.evaluate("./text()", next2)).toString();
                c1045260dJ6.trackingEventList = C1717206ny.LIZ(c1045050dIl, c1045260dJ6.trackingEventList);
            }
            C08LX c08lx = new C08LX(new C08LY(C1046710dLR.LIZJ(this.LIZJ, next, C13LQ.LJIIJJI(new String[]{"./Linear/VideoClicks"})), new C1046640dLK(this)));
            while (c08lx.hasNext()) {
                c1045260dJ6.clickList = C1717206ny.LIZ(c08lx.next(), c1045260dJ6.clickList);
            }
            C197024126s c197024126s3 = new C197024126s(C1046710dLR.LIZJ(this.LIZJ, next, C13LQ.LJIIJJI(new String[]{"./Linear/MediaFiles/MediaFile"})));
            while (c197024126s3.hasNext()) {
                Object next3 = c197024126s3.next();
                C1045280dJ8 c1045280dJ8 = new C1045280dJ8();
                c1045280dJ8.delivery = a0.LJLIIIL(this.LIZJ.evaluate("./@delivery", next3)).toString();
                c1045280dJ8.type = a0.LJLIIIL(this.LIZJ.evaluate("./@type", next3)).toString();
                c1045280dJ8.url = a0.LJLIIIL(this.LIZJ.evaluate("./text()", next3)).toString();
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL(this.LIZJ.evaluate("./@bitrate", next3)).toString());
                if (numLJIIJJI != null) {
                    c1045280dJ8.bitRate = numLJIIJJI.intValue();
                }
                Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(a0.LJLIIIL(this.LIZJ.evaluate("./@width", next3)).toString());
                if (numLJIIJJI2 != null) {
                    c1045280dJ8.width = numLJIIJJI2.intValue();
                }
                Integer numLJIIJJI3 = C2095008Iq.LJIIJJI(a0.LJLIIIL(this.LIZJ.evaluate("./@height", next3)).toString());
                if (numLJIIJJI3 != null) {
                    c1045280dJ8.height = numLJIIJJI3.intValue();
                }
                String string = a0.LJLIIIL(this.LIZJ.evaluate("./@scalable", next3)).toString();
                if (string.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c1045280dJ8.scalable = Boolean.valueOf(u.LJIJI("true", string, true));
                }
                String string2 = a0.LJLIIIL(this.LIZJ.evaluate("./@maintainAspectRatio", next3)).toString();
                if (string2.length() > 0) {
                    c1045280dJ8.maintainAspectRatio = Boolean.valueOf(u.LJIJI("true", string2, true));
                }
                c1045260dJ6.mediaFileList = C1717206ny.LIZ(c1045280dJ8, c1045260dJ6.mediaFileList);
            }
            C197024126s c197024126s4 = new C197024126s(C1046710dLR.LIZJ(this.LIZJ, next, C13LQ.LJIIJJI(new String[]{"./Linear/Icons/Icon"})));
            while (c197024126s4.hasNext()) {
                Object next4 = c197024126s4.next();
                C1045070dIn c1045070dIn = new C1045070dIn();
                Integer numLJIIJJI4 = C2095008Iq.LJIIJJI(a0.LJLIIIL(this.LIZJ.evaluate("./@width", next4)).toString());
                if (numLJIIJJI4 != null) {
                    c1045070dIn.width = numLJIIJJI4.intValue();
                }
                Integer numLJIIJJI5 = C2095008Iq.LJIIJJI(a0.LJLIIIL(this.LIZJ.evaluate("./@height", next4)).toString());
                if (numLJIIJJI5 != null) {
                    c1045070dIn.width = numLJIIJJI5.intValue();
                }
                c1045070dIn.program = this.LIZJ.evaluate("./@program", next4);
                c1045070dIn.staticResource = C09RB.LJJIFFI(C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, next4, C13LQ.LJIIJJI(new String[]{"./StaticResource"})), this.LIZJ));
                c1045070dIn.htmlResource = (String) C09RB.LJIIL(C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, next4, C13LQ.LJIIJJI(new String[]{"./HTMLResource"})), this.LIZJ));
                c1045070dIn.iFrameResource = (String) C09RB.LJIIL(C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, next4, C13LQ.LJIIJJI(new String[]{"./IFrameResource"})), this.LIZJ));
                c1045070dIn.viewTracking = C09RB.LJJIFFI(C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, next4, C13LQ.LJIIJJI(new String[]{"./IconViewTracking"})), this.LIZJ));
                C197024126s c197024126s5 = new C197024126s(C1046710dLR.LIZJ(this.LIZJ, next4, C13LQ.LJIIJJI(new String[]{"./IconClicks"})));
                while (c197024126s5.hasNext()) {
                    Node node2 = (Node) c197024126s5.next();
                    c1045070dIn.clickList = C1717206ny.LIZ(LJI(node2), c1045070dIn.clickList);
                }
                c1045260dJ6.iconList = C1717206ny.LIZ(c1045070dIn, c1045260dJ6.iconList);
            }
            if (z) {
                C1045270dJ7 c1045270dJ7 = this.LIZ;
                List<C1045260dJ6> linkedList = c1045270dJ7.creativeList;
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
                ListProtector.add(linkedList, 0, c1045260dJ6);
                c1045270dJ7.creativeList = linkedList;
            } else {
                C1045270dJ7 c1045270dJ72 = this.LIZ;
                c1045270dJ72.creativeList = C1717206ny.LIZ(c1045260dJ6, c1045270dJ72.creativeList);
            }
        }
    }

    public final boolean LJFF(int i, String str) {
        Document documentLIZ;
        List<C1045260dJ6> list;
        List<C1045260dJ6> list2;
        List<C1045260dJ6> list3;
        InterfaceC1046660dLM interfaceC1046660dLM = this.LIZIZ;
        if (interfaceC1046660dLM != null) {
            interfaceC1046660dLM.LIZ();
        }
        this.LIZLLL++;
        try {
            try {
                documentLIZ = C1046730dLT.LIZ(str);
            } catch (C0OAG e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                InterfaceC1046660dLM interfaceC1046660dLM2 = this.LIZIZ;
                if (interfaceC1046660dLM2 != null) {
                    interfaceC1046660dLM2.LJI(e);
                }
                documentLIZ = null;
            } catch (C1046740dLU e2) {
                TryCatchGuardChecker.doCheck(e2);
                InterfaceC1046660dLM interfaceC1046660dLM3 = this.LIZIZ;
                if (interfaceC1046660dLM3 != null) {
                    interfaceC1046660dLM3.LIZLLL(e2);
                }
                documentLIZ = null;
            }
            if (documentLIZ == null) {
                InterfaceC1046660dLM interfaceC1046660dLM4 = this.LIZIZ;
                if (interfaceC1046660dLM4 != null) {
                    interfaceC1046660dLM4.exit();
                }
                int i2 = this.LIZLLL - 1;
                this.LIZLLL = i2;
                if (i2 == 0 && (list3 = this.LIZ.creativeList) != null && list3.size() > 1) {
                    C08XD.LJJ(list3, new AComparatorS35S0000000_16(15));
                }
                return false;
            }
            InterfaceC1046660dLM interfaceC1046660dLM5 = this.LIZIZ;
            if (interfaceC1046660dLM5 != null) {
                interfaceC1046660dLM5.LIZIZ();
            }
            boolean zLJ = LJ(documentLIZ, i, 0);
            InterfaceC1046660dLM interfaceC1046660dLM6 = this.LIZIZ;
            if (interfaceC1046660dLM6 != null) {
                interfaceC1046660dLM6.exit();
            }
            int i3 = this.LIZLLL - 1;
            this.LIZLLL = i3;
            if (i3 == 0 && (list2 = this.LIZ.creativeList) != null && list2.size() > 1) {
                C08XD.LJJ(list2, new AComparatorS35S0000000_16(16));
            }
            return zLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            InterfaceC1046660dLM interfaceC1046660dLM7 = this.LIZIZ;
            if (interfaceC1046660dLM7 != null) {
                interfaceC1046660dLM7.exit();
            }
            int i4 = this.LIZLLL - 1;
            this.LIZLLL = i4;
            if (i4 == 0 && (list = this.LIZ.creativeList) != null && list.size() > 1) {
                C08XD.LJJ(list, new AComparatorS35S0000000_16(17));
            }
            throw th;
        }
    }

    public C1046590dLF(C1045270dJ7 c1045270dJ7, InterfaceC1045310dJB interfaceC1045310dJB, InterfaceC1046660dLM interfaceC1046660dLM) {
        this.LIZ = c1045270dJ7;
        this.LIZIZ = interfaceC1046660dLM;
        this.LIZJ = XPathFactory.newInstance().newXPath();
    }

    public final boolean LIZ(Node node, int i, int i2) {
        InterfaceC1046660dLM interfaceC1046660dLM;
        Document documentLIZ;
        if (i < 0) {
            InterfaceC1046660dLM interfaceC1046660dLM2 = this.LIZIZ;
            if (interfaceC1046660dLM2 != null) {
                C08QT c08qt = new C08QT((C08QU) C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, node, C13LQ.LJIIJJI(new String[]{"./VASTAdTagURI"})), this.LIZJ));
                while (c08qt.hasNext()) {
                    c08qt.next();
                    interfaceC1046660dLM2.LJFF();
                }
            }
            return false;
        }
        C08QT c08qt2 = new C08QT((C08QU) C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, node, C13LQ.LJIIJJI(new String[]{"./VASTAdTagURI"})), this.LIZJ));
        boolean z = false;
        while (c08qt2.hasNext()) {
            String str = (String) c08qt2.next();
            InterfaceC1046660dLM interfaceC1046660dLM3 = this.LIZIZ;
            if (interfaceC1046660dLM3 != null) {
                interfaceC1046660dLM3.LIZ();
            }
            try {
                try {
                    documentLIZ = C1046730dLT.LIZ(str);
                } catch (C0OAG e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                    InterfaceC1046660dLM interfaceC1046660dLM4 = this.LIZIZ;
                    if (interfaceC1046660dLM4 != null) {
                        interfaceC1046660dLM4.LJI(e);
                    }
                } catch (C1046740dLU e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    InterfaceC1046660dLM interfaceC1046660dLM5 = this.LIZIZ;
                    if (interfaceC1046660dLM5 != null) {
                        interfaceC1046660dLM5.LIZLLL(e2);
                    }
                }
                if (documentLIZ != null) {
                    InterfaceC1046660dLM interfaceC1046660dLM6 = this.LIZIZ;
                    if (interfaceC1046660dLM6 != null) {
                        interfaceC1046660dLM6.LIZIZ();
                    }
                    if (LJ(documentLIZ, i, i2 + 1)) {
                        InterfaceC1046660dLM interfaceC1046660dLM7 = this.LIZIZ;
                        if (interfaceC1046660dLM7 != null) {
                            interfaceC1046660dLM7.exit();
                        }
                        z = true;
                    } else {
                        InterfaceC1046660dLM interfaceC1046660dLM8 = this.LIZIZ;
                        if (interfaceC1046660dLM8 != null) {
                            interfaceC1046660dLM8.exit();
                        }
                        return false;
                    }
                } else {
                    InterfaceC1046660dLM interfaceC1046660dLM9 = this.LIZIZ;
                    if (interfaceC1046660dLM9 != null) {
                        interfaceC1046660dLM9.exit();
                    }
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                InterfaceC1046660dLM interfaceC1046660dLM10 = this.LIZIZ;
                if (interfaceC1046660dLM10 != null) {
                    interfaceC1046660dLM10.exit();
                }
                throw th;
            }
        }
        if (!z && (interfaceC1046660dLM = this.LIZIZ) != null) {
            interfaceC1046660dLM.LIZLLL(new C1046740dLU("VASTAdTagURI missing"));
        }
        return z;
    }

    public final boolean LJ(Document document, int i, int i2) {
        int i3 = i - 1;
        String str = this.LIZ.version;
        if (str == null || str.length() == 0) {
            this.LIZ.version = this.LIZJ.evaluate("/VAST/@version", document);
        }
        C197024126s c197024126s = new C197024126s(C1046710dLR.LIZJ(this.LIZJ, document, C13LQ.LJIIJJI(new String[]{"/VAST/Ad/InLine"})));
        while (c197024126s.hasNext()) {
            Node node = (Node) c197024126s.next();
            InterfaceC1046660dLM interfaceC1046660dLM = this.LIZIZ;
            if (interfaceC1046660dLM != null) {
                interfaceC1046660dLM.LJ();
            }
            String str2 = this.LIZ.adSystem;
            if (str2 == null || str2.length() == 0) {
                this.LIZ.adSystem = (String) C09RB.LJIIL(C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, node, C13LQ.LJIIJJI(new String[]{"./AdSystem"})), this.LIZJ));
            }
            String str3 = this.LIZ.adTitle;
            if (str3 == null || str3.length() == 0) {
                this.LIZ.adTitle = (String) C09RB.LJIIL(C1046710dLR.LIZIZ(C1046710dLR.LIZJ(this.LIZJ, node, C13LQ.LJIIJJI(new String[]{"./AdTitle"})), this.LIZJ));
            }
            String string = a0.LJLIIIL(this.LIZJ.evaluate("./Description/text()", node)).toString();
            if (string.length() > 0) {
                this.LIZ.description = string;
            }
            LIZLLL(node, false);
            LIZIZ(node);
        }
        C197024126s c197024126s2 = new C197024126s(C1046710dLR.LIZJ(this.LIZJ, document, C13LQ.LJIIJJI(new String[]{"/VAST/Ad/Wrapper"})));
        while (c197024126s2.hasNext()) {
            Node node2 = (Node) c197024126s2.next();
            InterfaceC1046660dLM interfaceC1046660dLM2 = this.LIZIZ;
            if (interfaceC1046660dLM2 != null) {
                interfaceC1046660dLM2.LJII();
            }
            LIZLLL(node2, true);
            LIZIZ(node2);
            if (!LIZ(node2, i3, i2)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ C1046590dLF(C1045270dJ7 c1045270dJ7, InterfaceC1045310dJB interfaceC1045310dJB, int i) {
        this(c1045270dJ7, (i & 2) != 0 ? null : interfaceC1045310dJB, (InterfaceC1046660dLM) null);
    }
}
