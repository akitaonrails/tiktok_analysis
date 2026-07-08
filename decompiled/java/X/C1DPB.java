package X;

import Y.ARunnableS43S0400000_35;
import com.bytedance.ies.effecteditor.swig.EffectEditorJniJNI;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAsset;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUpdateType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.UUID;

/* JADX INFO: renamed from: X.1DPB, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DPB extends AbstractC1665240tR4<AbstractC1665250tR5, UIAnnotationAsset> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // X.AbstractC1665240tR4
    public final UIAnnotationErrorCode LIZIZ() {
        U u = this.LIZJ;
        return u == 0 ? UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr : u.refreshAnnotationPreview();
    }

    public final void LIZJ(String str) {
        synchronized (this) {
            if (str == null) {
                str = "";
            }
            try {
                this.LIZLLL = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Assets_");
                sbLIZ.append(UUID.randomUUID().toString());
                this.LJFF = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LIZLLL);
                String str2 = C08SB.LIZ;
                sbLIZ2.append(str2);
                sbLIZ2.append(EffectEditorJniJNI.kUIAnnotationAssetFirstPathInSticker());
                sbLIZ2.append(str2);
                sbLIZ2.append(this.LJFF);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                this.LJ = strLIZIZ;
                C08SB.LIZIZ(strLIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1DPB(UIAnnotationAsset uIAnnotationAsset, C1DPK c1dpk) {
        super(uIAnnotationAsset, c1dpk);
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = "";
        if (uIAnnotationAsset == null) {
            return;
        }
        final UIAnnotationAssetUIMore uIAnnotationAssetUIMoreDynamicCast = UIAnnotationAssetUIMore.dynamicCast(uIAnnotationAsset.getUIMore());
        this.LIZ = new AbstractC1665250tR5(uIAnnotationAssetUIMoreDynamicCast) { // from class: X.0tR7
        };
    }

    public final void LIZLLL(Object obj, UIAnnotationUpdateType uIAnnotationUpdateType, C1DO8 c1do8) {
        C1DOD.LIZ();
        C823050WQl.LIZJ().execute(new ARunnableS43S0400000_35(this, obj, uIAnnotationUpdateType, c1do8, 0));
    }
}
