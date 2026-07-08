package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450650nqx {
    public VESize LIZJ;
    public CanvasFilterParam LIZLLL;
    public final HashMap<String, VEVideoTransformFilterParam> LIZ = new HashMap<>();
    public String LIZIZ = "unset";
    public final MutableLiveData<VEVideoTransformFilterParam> LJ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJFF = new MutableLiveData<>(null);
    public final MutableLiveData<Pair<Integer, Integer>> LJI = new MutableLiveData<>(null);

    public final VEVideoTransformFilterParam LIZ() {
        HashMap<String, VEVideoTransformFilterParam> map = this.LIZ;
        String str = this.LIZIZ;
        VEVideoTransformFilterParam vEVideoTransformFilterParamLJIJ = map.get(str);
        if (vEVideoTransformFilterParamLJIJ == null) {
            CanvasFilterParam canvasFilterParam = this.LIZLLL;
            vEVideoTransformFilterParamLJIJ = canvasFilterParam != null ? C1444940nhk.LJIJ(canvasFilterParam) : new VEVideoTransformFilterParam();
            map.put(str, vEVideoTransformFilterParamLJIJ);
        }
        return vEVideoTransformFilterParamLJIJ;
    }

    public final void LIZIZ(String str, CanvasFilterParam canvasFilterParam) {
        this.LIZIZ = str;
        if (canvasFilterParam != null) {
            if (this.LIZ.get(str) == null) {
                this.LIZ.put(str, C1444940nhk.LJIJ(canvasFilterParam));
                return;
            }
            VEVideoTransformFilterParam vEVideoTransformFilterParam = this.LIZ.get(str);
            if (vEVideoTransformFilterParam == null) {
                return;
            }
            vEVideoTransformFilterParam.scaleFactor = canvasFilterParam.getScaleFactor();
            vEVideoTransformFilterParam.transX = canvasFilterParam.getTransX();
            vEVideoTransformFilterParam.transY = canvasFilterParam.getTransY();
            vEVideoTransformFilterParam.degree = canvasFilterParam.getDegree();
        }
    }
}
