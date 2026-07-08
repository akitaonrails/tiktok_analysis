package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383120F0k extends AbstractC383250F0x {
    public final C01GW LIZIZ;
    public final C383610F2h LIZJ;
    public List<String> LIZLLL;
    public final Map<String, Float> LJ;
    public int LJFF;
    public int LJI;

    public final float LIZ(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJ;
        Object objValueOf = linkedHashMap.get(str);
        if (objValueOf == null) {
            objValueOf = Float.valueOf(C383680F2o.LIZ(this.LIZ.getContext(), str));
            linkedHashMap.put(str, objValueOf);
        }
        return ((Number) objValueOf).floatValue();
    }

    public C383120F0k(ViewGroup viewGroup, C383150F0n c383150F0n, C383130F0l c383130F0l, Function0 function0) {
        super(viewGroup);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(viewGroup, 1189));
        this.LIZIZ = c01gwLIZIZ;
        C383610F2h c383610F2h = new C383610F2h(c383150F0n, c383130F0l, function0);
        this.LIZJ = c383610F2h;
        this.LIZLLL = C13BV.INSTANCE;
        this.LJ = new LinkedHashMap();
        RecyclerView recyclerView = (RecyclerView) c01gwLIZIZ.getValue();
        recyclerView.addItemDecoration(new C0DXR() { // from class: X.03Im
            public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                if (recyclerView2.getChildAdapterPosition(view) == 0) {
                    rect.left = this.LL;
                }
                rect.right = this.LL;
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext(), 0, false));
        recyclerView.setAdapter(c383610F2h);
        C786410Ut5.x3(recyclerView.getViewTreeObserver(), new C0FX0(this, 1));
    }
}
