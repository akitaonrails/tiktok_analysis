package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507340pKO extends C09AY implements Function1<byte[], byte[]> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C0XM9 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507340pKO(boolean z, boolean z2, String str, String str2, C0XM9 c0xm9) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c0xm9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final byte[] invoke(byte[] bArr) {
        C1507350pKP c1507350pKP;
        boolean z;
        String strLIZ;
        C0XLO c0xlo;
        byte[] bArr2 = bArr;
        String strLIZJ = null;
        if (this.LL || !this.LLILLJJLI) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        IEcomProtobufService iEcomProtobufService = C1507370pKR.LIZ;
        try {
            c1507350pKP = new C1507350pKP((byte[]) C23250099c.LJ(C23271099x.INSTANCE, new C1507320pKM(str2, str, null, bArr2)), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR203, e, null);
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getSimpleName();
            }
            c1507350pKP = new C1507350pKP(null, message);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (c1507350pKP.LIZ != null) {
            z = true;
        } else {
            z = false;
        }
        String str3 = this.LLILZ;
        C0XM9 c0xm9 = this.LLILZIL;
        if (c0xm9 != null) {
            strLIZ = c0xm9.LIZJ.LJFF.LIZ();
        } else {
            strLIZ = null;
        }
        C0XM9 c0xm92 = this.LLILZIL;
        if (c0xm92 != null && (c0xlo = c0xm92.LIZJ) != null) {
            strLIZJ = c0xlo.LJI.LIZJ("ec_biz_scene");
        }
        C1507370pKR.LIZ(jCurrentTimeMillis2, z, str3, strLIZ, strLIZJ, C1507330pKN.LIZ, c1507350pKP.LIZIZ);
        return c1507350pKP.LIZ;
    }
}
