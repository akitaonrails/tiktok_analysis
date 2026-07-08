package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0m7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384300m7w extends C1384310m7x implements IDanmakuData {
    public String LJIIJJI;
    public long LJIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public String LJIIZILJ;
    public Integer LJIJI;
    public Integer LJIJJ;
    public Float LJIJJLI;
    public float LJIL;
    public IDanmakuData LJJ;
    public boolean LJJI;
    public final float LJJIFFI;
    public final float LJJII;
    public boolean LJJIII;
    public transient Function0<Unit> LJJIIJ;
    public transient C09AY LJJIIJZLJL;
    public EnumC1384130m7f LJIILIIL = EnumC1384130m7f.NORMAL;
    public String LJIJ = "";

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final C1384300m7w getData() {
        return this;
    }

    public C1384300m7w() {
        boolean z = C1384230m7p.LIZ;
        this.LJIL = C1384230m7p.LIZ ? 0.6f : 0.75f;
        boolean z2 = C1384350m81.LIZ;
        this.LJJIFFI = C1384350m81.LIZIZ.LIZIZ();
        this.LJJII = C1384350m81.LIZIZ.LIZ();
    }

    @Override // X.AbstractC1384320m7y
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" id: ");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append("\n showAtTime: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("\n text: ");
        sbLIZ.append((Object) this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final String getAid() {
        return this.LJIJ;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final float getCurrentAlpha() {
        return this.LJIL;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final EnumC1384130m7f getType() {
        return this.LJIILIIL;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final boolean isSelected() {
        return this.LJIILLIIL;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final boolean q1() {
        return this.LJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final long r1() {
        return this.LJIIL;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final boolean u1() {
        return this.LJJI;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final String v1() {
        return this.LJIIZILJ;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final IDanmakuData w1() {
        return this.LJJ;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final String x1() {
        return this.LJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final long y1() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final boolean z1() {
        return this.LJIILL;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final void A1(boolean z) {
        this.LJJI = z;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final void LIZ(boolean z) {
        if (z) {
            IDanmakuData.LIZ.getClass();
            HashMap<String, String> map = C1384250m7r.LIZIZ;
            String str = this.LJIJ;
            String str2 = this.LJIIJJI;
            if (str2 == null) {
                str2 = "";
            }
            map.put(str, str2);
            this.LJI = 100;
        } else {
            IDanmakuData.LIZ.getClass();
            C1384250m7r.LIZIZ.remove(this.LJIJ);
            this.LJI = 1;
        }
        this.LJIILLIIL = z;
        this.LJIIJ = true;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final void s1(long j) {
        this.LJIIL = j;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final void setCurrentAlpha(float f) {
        this.LJIL = f;
    }

    @Override // com.ss.android.ugc.aweme.model.IDanmakuData
    public final void t1(String str) {
        this.LJIIJJI = str;
        long j = -1;
        try {
            if (C123100dR.LIZ(str) && str != null) {
                j = CastLongProtector.parseLong(str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZJ = j;
    }
}
