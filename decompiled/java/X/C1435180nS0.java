package X;

import com.ss.android.ugc.aweme.analytics.IMediaUploadPerformanceMonitor;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0nS0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435180nS0 extends AbstractC1446660nkW {
    public final AbstractC1433570nPP LJ;
    public C1434970nRf LJFF;

    public static EnumC1435490nSV LJI(Object obj) {
        if (obj == EnumC1434770nRL.COMPILE) {
            return EnumC1435490nSV.COMPILE;
        }
        if (obj == EnumC1434770nRL.COVER_EXTRACT) {
            return EnumC1435490nSV.COVER_EXTRACT;
        }
        if (obj == EnumC1434770nRL.AUTH_KEY) {
            return EnumC1435490nSV.AUTH;
        }
        if (obj == EnumC1434770nRL.UPLOAD) {
            return EnumC1435490nSV.UPLOAD;
        }
        return EnumC1435490nSV.NONE;
    }

    public C1435180nS0(Object obj, AbstractC1433570nPP abstractC1433570nPP) {
        super(2, obj);
        this.LJ = abstractC1433570nPP;
    }

    @Override // X.AbstractC1446660nkW
    public final void LJ(Object obj, C1404610meh c1404610meh) {
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434970nRf) {
                if (next != null) {
                    this.LJFF = (C1434970nRf) next;
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        AbstractC1433570nPP abstractC1433570nPP = this.LJ;
        C1433600nPS c1433600nPS = C1433600nPS.LIZ;
        C1434970nRf c1434970nRf = this.LJFF;
        if (c1434970nRf == null) {
            c1434970nRf = null;
        }
        abstractC1433570nPP.onFinish(c1433600nPS, null, c1434970nRf.LIZ);
        LJII(false, -1, "cancel", LJI(obj));
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        Throwable t = c1435220nS4.getT();
        C1434340nQe c1434340nQe = C1434330nQd.Companion;
        int code = c1435220nS4.getCode();
        c1434340nQe.getClass();
        C1434650nR9 c1434650nR9 = new C1434650nR9(t, C1434340nQe.LIZ(code), c1435220nS4.getCode(), c1435220nS4.getNodeTag().toString());
        AbstractC1433570nPP abstractC1433570nPP = this.LJ;
        C1433450nPD c1433450nPD = new C1433450nPD(new C1433270nOv(String.valueOf(c1435220nS4.getCode()), c1435220nS4.getNodeTag().toString(), c1434650nR9.isUserNetworkBad(), c1434650nR9.getCause(), Boolean.valueOf(c1434650nR9.isRecover()), c1434650nR9.getErrorCode()));
        C1434970nRf c1434970nRf = this.LJFF;
        if (c1434970nRf == null) {
            c1434970nRf = null;
        }
        abstractC1433570nPP.onFinish(c1433450nPD, null, c1434970nRf.LIZ);
        LJII(false, Integer.valueOf(c1435220nS4.getCode()), c1435220nS4.toString(), LJI(c1435220nS4.getNodeTag()));
    }

    public final void LJII(boolean z, Integer num, String str, EnumC1435490nSV enumC1435490nSV) {
        IMediaUploadPerformanceMonitor iMediaUploadPerformanceMonitorLJII = C912070ZqH.LIZIZ.LJIILLIIL().LJII();
        C1434970nRf c1434970nRf = this.LJFF;
        if (c1434970nRf == null) {
            c1434970nRf = null;
        }
        InterfaceC1435230nS5 interfaceC1435230nS5LIZ = iMediaUploadPerformanceMonitorLJII.LIZ(c1434970nRf.LIZ.creationId);
        interfaceC1435230nS5LIZ.LJIIJJI(enumC1435490nSV);
        if (num != null) {
            interfaceC1435230nS5LIZ.LIZJ(num.intValue());
        }
        if (str != null) {
            interfaceC1435230nS5LIZ.LJIIIZ(str);
        }
        if (!z) {
            interfaceC1435230nS5LIZ.LJ(z);
            interfaceC1435230nS5LIZ.LIZ();
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        Iterator<Object> it2 = ((C1404610meh) obj2).LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1435240nS6) {
                if (next != null) {
                    final C1435240nS6 c1435240nS6 = (C1435240nS6) next;
                    AbstractC1433570nPP abstractC1433570nPP = this.LJ;
                    AbstractC1433460nPE abstractC1433460nPE = new AbstractC1433460nPE(c1435240nS6) { // from class: X.0nPV
                        public final InterfaceC1433640nPW LIZ;

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("DMMediaSuccess response:");
                            sbLIZ.append(this.LIZ);
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LIZ = c1435240nS6;
                        }
                    };
                    C1434970nRf c1434970nRf = this.LJFF;
                    if (c1434970nRf == null) {
                        c1434970nRf = null;
                    }
                    abstractC1433570nPP.onFinish(abstractC1433460nPE, null, c1434970nRf.LIZ);
                    LJII(true, null, null, EnumC1435490nSV.NONE);
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.creation.config.DMMediaPublishResult");
    }
}
