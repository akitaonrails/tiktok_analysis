package X;

import android.content.Context;
import com.bytedance.hybrid.spark.roma.IRomaHostDepend;
import com.ss.android.ugc.aweme.hybridkit.task.RomaHostDepend;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550310qRh implements IRomaHostDepend {
    public static final C1550310qRh LIZIZ = new C1550310qRh();
    public final /* synthetic */ IRomaHostDepend LIZ;

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final void LIZ(Context context, String str) {
        this.LIZ.LIZ(context, str);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final boolean LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Long LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final void LJII(String str, JSONObject jSONObject) {
        this.LIZ.LJII(str, jSONObject);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Object LJIIIIZZ(Class cls, String str) {
        return this.LIZ.LJIIIIZZ(cls, str);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final String LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final void LJIIJ(IRomaHostDepend.ExposeType exposeType, String str) {
        this.LIZ.LJIIJ(exposeType, str);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final C1550330qRj LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final EnumC1153760g86 LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Set<String> LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Set<String> LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Map<String, String> LJIILL(String str) {
        return this.LIZ.LJIILL(str);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final Object LJIILLIIL(Class cls) {
        return this.LIZ.LJIILLIIL(cls);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final String LJIIZILJ() {
        return this.LIZ.LJIIZILJ();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final String getOpRegion() {
        return this.LIZ.getOpRegion();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final boolean isLocalTest() {
        return this.LIZ.isLocalTest();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaHostDepend
    public final boolean ki(String str) {
        return this.LIZ.ki(str);
    }

    public C1550310qRh() {
        IRomaHostDepend iRomaHostDepend;
        Object objLIZ = C04TD.LIZ(IRomaHostDepend.class, false);
        if (objLIZ != null) {
            iRomaHostDepend = (IRomaHostDepend) objLIZ;
        } else {
            if (C04TD.N0 == null) {
                synchronized (IRomaHostDepend.class) {
                    if (C04TD.N0 == null) {
                        C04TD.N0 = new RomaHostDepend();
                    }
                }
            }
            iRomaHostDepend = C04TD.N0;
        }
        this.LIZ = iRomaHostDepend;
    }
}
