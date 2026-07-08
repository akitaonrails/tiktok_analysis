package X;

import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1809420xBc extends FrameLayout {
    public final View LL;
    public final C1809390xBZ LLILLJJLI;
    public boolean LLILLL;

    private final int getLayoutRes() {
        return R.layout.dry;
    }

    public final void setAvatarList(List<C111S> list) {
        if (list != null) {
            C1809390xBZ c1809390xBZ = this.LLILLJJLI;
            c1809390xBZ.LL = list;
            c1809390xBZ.notifyDataSetChanged();
        }
    }

    public final void setLoadingIndex(Integer num) {
        C1809390xBZ c1809390xBZ = this.LLILLJJLI;
        Integer num2 = c1809390xBZ.LLILZ;
        if (num2 != null) {
            c1809390xBZ.notifyItemChanged(num2.intValue());
        }
        c1809390xBZ.LLILZ = num;
        if (num != null) {
            c1809390xBZ.notifyItemChanged(num.intValue());
        }
    }

    public final void setOnAvatarClickListener(Function2<? super Integer, ? super C111S, Unit> function2) {
        this.LLILLJJLI.LLILLJJLI = function2;
    }

    public final void setPlusClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.I7(new AkS64S0200000_27(this, onClickListener, 19), this.LL);
    }

    public final void setPlusEnabled(boolean z) {
        float f;
        this.LLILLL = z;
        View view = this.LL;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        C786410Ut5.T4(view, f);
    }

    public final void setSelectedIndex(Integer num) {
        C1809390xBZ c1809390xBZ = this.LLILLJJLI;
        Integer num2 = c1809390xBZ.LLILLL;
        if (num2 != null) {
            c1809390xBZ.notifyItemChanged(num2.intValue());
        }
        c1809390xBZ.LLILLL = num;
        if (num != null) {
            c1809390xBZ.notifyItemChanged(num.intValue());
        }
    }

    public C1809420xBc(C19EG c19eg, AttributeSet attributeSet, int i) {
        super(c19eg, attributeSet, i);
        C1809390xBZ c1809390xBZ = new C1809390xBZ();
        this.LLILLJJLI = c1809390xBZ;
        FrameLayout.inflate(c19eg, getLayoutRes(), this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        this.LL = findViewById(R.id.luk);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mel);
        C422610Ghf c422610Ghf = new C422610Ghf(getContext(), 0);
        c422610Ghf.LJ(C800330VaR.LIZIZ(getContext(), R.drawable.cp4));
        recyclerView.addItemDecoration(c422610Ghf);
        recyclerView.setLayoutManager(new LinearLayoutManager(c19eg, 0, false));
        recyclerView.setAdapter(c1809390xBZ);
        setPlusEnabled(this.LLILLL);
    }
}
