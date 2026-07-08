package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0pCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502660pCq implements InterfaceC1502770pD1<Long> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public final String LIZ = "send_message_label_14d";
    public volatile C1502640pCo LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1502660pCq.class, "storage", "getStorage()Lcom/ss/android/ugc/aweme/im/userportrait/impl/storage/standard/StandardKevaLongStorage;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1502770pD1
    public final Long LJFF() {
        Long lLJIILIIL;
        String strLIZJ = C1510700pPo.LIZ().LIZJ(this.LIZ);
        if (strLIZJ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZJ)) != null) {
            return lLJIILIIL;
        }
        C1502640pCo c1502640pCo = this.LIZIZ;
        if (c1502640pCo == null) {
            synchronized (this) {
                c1502640pCo = this.LIZIZ;
                if (c1502640pCo == null) {
                    c1502640pCo = new C1502640pCo(this.LIZ);
                    this.LIZIZ = c1502640pCo;
                }
            }
        }
        return c1502640pCo.LIZ();
    }

    public final void LIZ(long j) {
        C1502640pCo c1502640pCo = this.LIZIZ;
        if (c1502640pCo == null) {
            synchronized (this) {
                c1502640pCo = this.LIZIZ;
                if (c1502640pCo == null) {
                    c1502640pCo = new C1502640pCo(this.LIZ);
                    this.LIZIZ = c1502640pCo;
                }
            }
        }
        C087T c087t = (C087T) c1502640pCo.LIZJ.getValue();
        String str = c1502640pCo.LIZ;
        String strValueOf = String.valueOf(j);
        if (strValueOf != null) {
            Keva keva = c087t.LIZ;
            strValueOf.toString();
            keva.storeString(str, strValueOf);
            return;
        }
        c087t.LIZ.erase(str);
    }
}
