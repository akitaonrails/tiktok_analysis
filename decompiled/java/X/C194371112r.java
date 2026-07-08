package X;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.112r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194371112r {
    public final Scene LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final Activity LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 929));
    public final C194372112s LJ = new C113D() { // from class: X.112s
        public boolean LIZ;

        @Override // X.C113D
        public final void LIZ() {
        }

        @Override // X.C113D
        public final void LIZIZ() {
        }

        @Override // X.C113D
        public final boolean LIZJ(EffectModel effectModel) {
            return false;
        }

        @Override // X.C113D
        public final boolean LJFF() {
            return false;
        }

        @Override // X.C113D
        public final void LJIIIIZZ() {
        }

        @Override // X.C113D
        public final void LJIIIZ() {
        }

        @Override // X.C113D
        public final void LJIIJ(EffectModel effectModel, String str, boolean z, EffectSearchModel effectSearchModel) {
        }

        @Override // X.C113D
        public final void LJIIJJI(String str) {
        }

        @Override // X.C113D
        public final boolean LJIIL() {
            return true;
        }

        @Override // X.C113D
        public final void LJIILIIL(String str, boolean z) {
        }

        @Override // X.C113D
        public final boolean LJIILL(EffectModel effectModel) {
            return true;
        }

        @Override // X.C113D
        public final void LJIILLIIL() {
        }

        @Override // X.C113D
        public final void LJIIZILJ(EffectModel effectModel) {
        }

        @Override // X.C113D
        public final boolean LJIJ(String str) {
            return false;
        }

        @Override // X.C113D
        public final List<EffectModel> LJIJI(int i, String str) {
            return null;
        }

        @Override // X.C113D
        public final void LJIJJ(C364270EPx c364270EPx) {
        }

        @Override // X.C113D
        public final void LJIL(int i, EffectModel effectModel) {
        }

        @Override // X.C113D
        public final boolean LJ(int i) {
            if (this.LIZIZ.LIZIZ().LLJJJ && !this.LIZ) {
                return false;
            }
            if (5 == i || i == 0) {
                if (Intrinsics.LJFF(((LiveData) this.LIZIZ.LIZIZ().LLJJIJIIJIL.getValue()).getValue(), Boolean.TRUE)) {
                    return false;
                }
                C194373112t c194373112t = (C194373112t) ((LiveData) this.LIZIZ.LIZIZ().LLILZ.getValue()).getValue();
                if (c194373112t != null && c194373112t.LIZJ) {
                    Activity activity = this.LIZIZ.LIZJ;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131837605);
                    C1390380mHk.LIZ(activity, 3011, creativeToastBuilder);
                    return false;
                }
            }
            return true;
        }

        @Override // X.C113D
        public final void LJIILJJIL(EffectModel effectModel) {
            this.LIZ = false;
            this.LIZIZ.LIZIZ().xQ2().setValue(VEEffectSelectOp.selectFilter(1, effectModel));
        }

        @Override // X.C113D
        public final boolean LJJ(EffectModel effectModel) {
            this.LIZ = true;
            if (C113I.LJ(effectModel.category)) {
                return false;
            }
            this.LIZIZ.LIZIZ().xQ2().setValue(VEEffectSelectOp.selectFilter(0, effectModel));
            return true;
        }

        @Override // X.C113D
        public final void LJI(int i, EffectModel effectModel) {
            String str;
            C364270EPx value = this.LIZIZ.LIZIZ().BQ2().getValue();
            if (value != null) {
                str = value.LIZIZ;
                if (str != null && str.length() == 0) {
                    return;
                }
            } else {
                str = null;
            }
            C1413450msx.LJIIZILJ(C1413450msx.LIZ, this.LIZIZ.LIZIZ, effectModel.key, str, i, false, false, null, Integer.valueOf(effectModel.source), effectModel.designerId, effectModel, null, null, null, new C1413460msy(126, C1403680mdC.LIZLLL(effectModel), null, null), false, 23616);
        }

        @Override // X.C113D
        public final boolean LJII(int i, int i2) {
            int iMo51if;
            InterfaceC1452170ntP value = this.LIZIZ.LIZIZ().vQ2().LIZIZ().getValue();
            if (value != null) {
                iMo51if = value.mo51if();
            } else {
                iMo51if = 0;
            }
            C19558011fW.LIZ.getClass();
            if (C19558011fW.LIZLLL(iMo51if, i)) {
                Activity activity = this.LIZIZ.LIZJ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131833535);
                C1390380mHk.LIZ(activity, 3011, creativeToastBuilder);
                return false;
            }
            this.LIZIZ.LIZIZ().xQ2().setValue(VEEffectSelectOp.selectTime(i));
            return true;
        }

        @Override // X.C113D
        public final void LJIJJLI(String str, List<? extends EffectPointModel> list) {
            String str2;
            C364270EPx value = this.LIZIZ.LIZIZ().BQ2().getValue();
            if (value != null && (str2 = value.LIZIZ) != null && Intrinsics.LJFF(str, str2)) {
                this.LIZIZ.LIZJ(str, list);
            }
        }

        @Override // X.C113D
        public final boolean LIZLLL(EffectModel effectModel, int i, boolean z) {
            this.LIZIZ.LIZIZ().xQ2().setValue(VEEffectSelectOp.selectTrans(effectModel));
            return true;
        }
    };

    public final EditEffectVideoModel LIZIZ() {
        return (EditEffectVideoModel) this.LIZLLL.getValue();
    }

    public final List<EffectPointModel> LIZ(String str) {
        ArrayList<EffectPointModel> arrayListDt = LIZIZ().vQ2().dt();
        ArrayList arrayList = new ArrayList();
        for (EffectPointModel effectPointModel : arrayListDt) {
            if (Intrinsics.LJFF(effectPointModel.getCategory(), str)) {
                arrayList.add(effectPointModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.112s] */
    public C194371112r(AbstractC214814194y abstractC214814194y, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = abstractC214814194y;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = abstractC214814194y.requireActivity();
    }

    public final void LIZJ(String str, List<? extends EffectPointModel> list) {
        boolean z;
        C194373112t c194373112t;
        if (list == null) {
            list = LIZ(str);
        }
        LiveData liveData = (LiveData) LIZIZ().LLILZ.getValue();
        boolean z2 = false;
        if (str.length() == 0) {
            c194373112t = new C194373112t(0);
        } else {
            boolean z3 = !C113I.LIZLLL(str);
            if (z3 && (!list.isEmpty())) {
                z = true;
                C366400EYc.LIZ.getClass();
                if (list.size() >= 5) {
                    TreeMap treeMap = new TreeMap();
                    C2097608Jq.LJIILL(treeMap, new Pair[0]);
                    for (EffectPointModel effectPointModel : list) {
                        ArrayList arrayList = (ArrayList) treeMap.get(Integer.valueOf(effectPointModel.getUiStartPoint()));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        ArrayList arrayList2 = (ArrayList) treeMap.get(Integer.valueOf(effectPointModel.getUiEndPoint()));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        Integer numValueOf = Integer.valueOf(effectPointModel.getUiStartPoint());
                        arrayList.add(1);
                        treeMap.put(numValueOf, arrayList);
                        Integer numValueOf2 = Integer.valueOf(effectPointModel.getUiEndPoint());
                        arrayList2.add(-1);
                        treeMap.put(numValueOf2, arrayList2);
                    }
                    Iterator it2 = treeMap.entrySet().iterator();
                    int iLIZ = 0;
                    int iIntValue = 0;
                    while (it2.hasNext()) {
                        Iterator it3 = ((ArrayList) ((Map.Entry) it2.next()).getValue()).iterator();
                        while (it3.hasNext()) {
                            iIntValue += ((Number) it3.next()).intValue();
                            iLIZ = C1330280kio.LIZ(iIntValue, iLIZ);
                        }
                    }
                    if (iLIZ >= 5) {
                        z2 = true;
                    }
                }
            } else {
                z = false;
            }
            c194373112t = new C194373112t(z3, z, z2);
        }
        liveData.setValue(c194373112t);
    }
}
