package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.lynx.tasm.LynxViewClient;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0wJG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775720wJG extends LynxViewClient {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIIIZZ() {
        if (1 - this.$t != 0) {
            super.LJIIIIZZ();
        } else {
            LJIIIIZZ$0(this);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL() {
        if (this.$t != 0) {
            super.LJIILJJIL();
        } else {
            LJIILJJIL$0(this);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJII(C1318050kP5 c1318050kP5) {
        if (1 - this.$t != 0) {
            super.LJJII(c1318050kP5);
        } else {
            LJJII$0(this, c1318050kP5);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(String str, Map map, Map map2) {
        if (this.$t != 0) {
            super.LJJIIZ(str, map, map2);
        } else {
            LJJIIZ$0(this, str, map, map2);
        }
    }

    public static final void LJIIIIZZ$0(C1775720wJG c1775720wJG) {
        ((C1769940w9w) c1775720wJG.l0).LIZ.clear();
    }

    public static final void LJIILJJIL$0(C1775720wJG c1775720wJG) {
        C1739060vM8 c1739060vM8 = (C1739060vM8) c1775720wJG.l1;
        c1739060vM8.LIZLLL = true;
        c1739060vM8.LIZJ("lynx load success");
    }

    public static final void LJJII$0(C1775720wJG c1775720wJG, C1318050kP5 c1318050kP5) {
        View view = c1318050kP5.LIZ;
        if (view == null || !(view instanceof RecyclerView) || !((C1769940w9w) c1775720wJG.l0).LIZ.add(Integer.valueOf(view.hashCode()))) {
            return;
        }
        ((RecyclerView) view).addOnScrollListener((C1770020wA4) c1775720wJG.l1);
    }

    public C1775720wJG(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJJIIZ$0(C1775720wJG c1775720wJG, String str, Map map, Map map2) {
        SparkActivity sparkActivity = ((C1211320hcw) c1775720wJG.l0).LLILLJJLI;
        if (sparkActivity != null && (!((HashMap) map2).isEmpty())) {
            C948503nH.LJ(sparkActivity, C23271099x.INSTANCE, new C1315705Cx(sparkActivity, null));
        }
    }
}
