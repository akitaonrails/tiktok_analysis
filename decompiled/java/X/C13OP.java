package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse;
import com.ss.ugc.effectplatform.task.CategoryVersion;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13OP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13OP extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;

    @Override // X.AbstractC20000013Ne
    public final void execute() throws Throwable {
        CategoryEffectListResponse categoryEffectListResponse;
        String str;
        C20008813Qo c20008813QoLJIILIIL;
        C13R7 c13r7;
        System.currentTimeMillis();
        InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
        CategoryVersion categoryVersion = null;
        C20008813Qo c20008813QoLJIILIIL2 = interfaceC20004513Ox != null ? interfaceC20004513Ox.LJIILIIL(C13OQ.LJ(this.LJ, this.LJFF, this.LJI, this.LJII, this.LIZIZ, this.LIZLLL)) : null;
        try {
            if (c20008813QoLJIILIIL2 == null) {
                runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(10004), 83));
                return;
            }
            try {
                String strLJIIIZ = C13SB.LJIIIZ(c20008813QoLJIILIIL2);
                C13R7 c13r72 = this.LIZ.LJIJI;
                categoryEffectListResponse = c13r72 != null ? (CategoryEffectListResponse) c13r72.LIZ.convertJsonToObj(strLJIIIZ, CategoryEffectListResponse.class) : null;
                C13SB.LIZIZ(c20008813QoLJIILIIL2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Json Parse Exception: ");
                sbLIZ.append(e);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZIZ("FetchCategoryEffectCacheTask", strLIZIZ, null);
                C13SB.LIZIZ(c20008813QoLJIILIIL2);
                categoryEffectListResponse = null;
            }
            System.currentTimeMillis();
            if (categoryEffectListResponse == null || !categoryEffectListResponse.checkValue()) {
                runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(10004), 83));
                return;
            }
            CategoryPageModel data = categoryEffectListResponse.getData();
            if (data == null) {
                return;
            }
            C13RD c13rd = this.LIZ;
            if (c13rd.LJJJ == 2) {
                String str2 = this.LIZIZ;
                String str3 = this.LIZLLL;
                try {
                    InterfaceC20004513Ox interfaceC20004513Ox2 = c13rd.LJJIFFI;
                    if (interfaceC20004513Ox2 != null && (c20008813QoLJIILIIL = interfaceC20004513Ox2.LJIILIIL(C13OQ.LJFF(str2, str3))) != null) {
                        try {
                            String strLJIIIZ2 = C13SB.LJIIIZ(c20008813QoLJIILIIL);
                            c20008813QoLJIILIIL.close();
                            if (strLJIIIZ2 != null && (c13r7 = c13rd.LJIJI) != null) {
                                categoryVersion = (CategoryVersion) c13r7.LIZ.convertJsonToObj(strLJIIIZ2, CategoryVersion.class);
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = null;
                                    TryCatchGuardChecker.doCheck(th);
                                    if (th == null) {
                                        c20008813QoLJIILIIL.close();
                                    } else {
                                        try {
                                            c20008813QoLJIILIIL.close();
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("readCategoryVersion failed: ");
                    sbLIZ2.append(e2);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZIZ("FetchCategoryEffectCacheTask", strLIZIZ2, null);
                }
                C13LD c13ld = C13LD.LIZ;
                C13RD c13rd2 = this.LIZ;
                String str4 = this.LIZIZ;
                if (categoryVersion == null || (str = categoryVersion.logId) == null) {
                    str = "";
                }
                c13ld.getClass();
                C13LD.LIZJ(c13rd2, str4, data, false, str);
            }
            data.setCache(true);
            runOnMainThread(new AwS431S0200000_30(this, data, 87));
        } finally {
            TryCatchGuardChecker.doCheck(th);
            C13SB.LIZIZ(c20008813QoLJIILIIL2);
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 416));
    }

    public C13OP(C13RD c13rd, String str, String str2, String str3, int i, int i2, int i3, int i4) {
        super(str2, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = i4;
    }
}
