package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0pCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502670pCr implements InterfaceC1502770pD1<Long> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public final String LIZ;
    public volatile C1502640pCo LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1502670pCr.class, "storage", "getStorage()Lcom/ss/android/ugc/aweme/im/userportrait/impl/storage/standard/StandardKevaLongStorage;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1502770pD1
    public final Long LJFF() {
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

    public C1502670pCr(String str) {
        this.LIZ = str;
    }

    public final void LIZ(Object obj) {
        long jLongValue = ((Number) obj).longValue();
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
        String strValueOf = String.valueOf(jLongValue);
        if (strValueOf != null) {
            Keva keva = c087t.LIZ;
            strValueOf.toString();
            keva.storeString(str, strValueOf);
            return;
        }
        c087t.LIZ.erase(str);
    }
}
