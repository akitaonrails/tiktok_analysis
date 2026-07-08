package X;

import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0myl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1417050myl extends C05YF {
    boolean E52(Pair<Integer, ? extends C0MJ9> pair);

    void FN();

    LiveEvent<Pair<Integer, Integer>> FW1();

    void Fj2(String str);

    void Fz(C1417310mzB c1417310mzB, boolean z);

    void HB0(String str);

    LiveEvent<Unit> HC2();

    void Il2(String str);

    void Kd0(CutsameDataItem cutsameDataItem, C0MJ9 c0mj9);

    void Lm1(C1417310mzB c1417310mzB);

    void MM0(String str);

    void Pl2(String str);

    void Qd();

    void Qm1();

    void Tz0(C1417310mzB c1417310mzB, C1417310mzB c1417310mzB2, AVMusic aVMusic, String str, C1417180myy c1417180myy);

    LiveEvent<Unit> WR();

    C1417310mzB XC1(int i, C0MJ9 c0mj9);

    void Xm1(C0MJ9 c0mj9);

    LiveEvent<String> Yx();

    boolean Z72();

    int ZM1();

    LiveEvent<Unit> aM();

    LiveEvent<Unit> bR1();

    LiveEvent<Unit> bv0();

    void clearCache();

    void d32(C0MJ9 c0mj9);

    void g51(Pair<Integer, ? extends C0MJ9> pair, NLEModel nLEModel);

    void i40(TemplateMobParams templateMobParams, SelectedMaterialItem selectedMaterialItem);

    void ih1(CutsameDataItem cutsameDataItem, C0MJ9 c0mj9, int i, NLEModel nLEModel, AVMusic aVMusic, String str, boolean z, int i2, boolean z2);

    boolean isShowing();

    LiveEvent<Unit> kG0();

    void lJ1();

    int lw2();

    void nL0(int i, C0MJ9 c0mj9, C1417310mzB c1417310mzB);

    List<AutoCutMediaModel> nw2();

    void os1();

    void rA1(boolean z, boolean z2);
}
