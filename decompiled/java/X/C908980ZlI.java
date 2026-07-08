package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908980ZlI {
    public final InterfaceC909070ZlR LIZ;
    public Long LIZIZ = null;
    public C05YD<? extends InterfaceC908660Zkm> LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024d A[PHI: r54
      0x024d: PHI (r54v1 int) = (r54v0 int), (r54v3 int) binds: [B:72:0x0249, B:22:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarMetaData LIZ() {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C908980ZlI.LIZ():com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarMetaData");
    }

    public final C908980ZlI LIZJ() {
        this.LIZ.LJI("chat");
        return this;
    }

    public C908980ZlI(InterfaceC909070ZlR interfaceC909070ZlR) {
        this.LIZ = interfaceC909070ZlR;
    }

    public final C908980ZlI LIZIZ(C0Y8T c0y8t) {
        long jCurrentTimeMillis;
        String str;
        Long lLJIILIIL;
        this.LIZ.LIZJ(c0y8t);
        Map<String, String> localExt = c0y8t.getLocalExt();
        if (localExt != null && (str = localExt.get("LAST_SELF_MSG_SNEND_TIME")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - (lLJIILIIL.longValue() / 1000);
        } else {
            jCurrentTimeMillis = -1;
        }
        this.LIZIZ = Long.valueOf(jCurrentTimeMillis);
        return this;
    }

    public final C908980ZlI LIZLLL(C869590Y9l c869590Y9l) {
        this.LIZ.LJFF(c869590Y9l);
        return this;
    }

    public final C908980ZlI LJ(IMUser iMUser) {
        this.LIZ.LIZIZ(iMUser);
        return this;
    }
}
