package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import irm.AkS52S0200000_6;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0HN1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HN1 extends LinearLayout {
    public final C1295960jpS LL;
    public List<String> LLILLJJLI;
    public final C03AE LLILLL;
    public final C1DFK LLILZ;
    public C0HN3 LLILZIL;

    public final void LIZ() {
        if (this.LLILLJJLI.isEmpty()) {
            return;
        }
        List<String> list = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        SecureRandom secureRandom = new SecureRandom();
        while (arrayList.size() < 5) {
            Object obj = ListProtector.get(list, secureRandom.nextInt(list.size()));
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
        setData(arrayList);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZ.LIZIZ(null);
    }

    private final void setData(List<String> list) {
        C03AE c03ae = this.LLILLL;
        c03ae.LL = list;
        c03ae.notifyDataSetChanged();
    }

    public C0HN1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = C13BV.INSTANCE;
        C03AE c03ae = new C03AE();
        this.LLILLL = c03ae;
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLILZ = c1dfkLIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(c1dfkLIZ));
        setOrientation(0);
        setGravity(16);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dlb, this, true);
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.o6p);
        this.LL = c1295960jpS;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.o6n);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(c03ae);
        c1295960jpS.setAnimation("effect_dice_lottie.json");
        c1295960jpS.setSpeed(1.5f);
        C786410Ut5.I7(new AkS52S0200000_6(this, context, 0), c1295960jpS);
        C23250099c.LIZLLL(c054gLIZ, null, null, new C2329709Ax(this, null), 3);
    }
}
