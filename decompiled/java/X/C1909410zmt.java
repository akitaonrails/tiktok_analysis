package X;

import Y.ACListenerS162S0100000_28;
import Y.ACListenerS60S0101000_28;
import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ug.spi.IPraiseDialogDiff;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909410zmt extends LinearLayout {
    public final AbstractC1909290zmh LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final List<TuxIconView> LLJ;
    public int LLJI;

    private final TuxIconView getStar1() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    private final TuxIconView getStar2() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    private final TuxIconView getStar3() {
        return (TuxIconView) this.LLILZIL.getValue();
    }

    private final TuxIconView getStar4() {
        return (TuxIconView) this.LLILZLL.getValue();
    }

    private final TuxIconView getStar5() {
        return (TuxIconView) this.LLIZ.getValue();
    }

    private final TuxTextView getTitle() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final void LIZ() {
        int size = this.LLJ.size();
        for (int i = 0; i < size; i++) {
            if (i < this.LLJI) {
                ((TuxIconView) ListProtector.get(this.LLJ, i)).setTintColorRes(R.attr.ny);
            } else {
                ((TuxIconView) ListProtector.get(this.LLJ, i)).setTintColorRes(R.attr.a02);
            }
        }
    }

    public final C197039127h getSubmit() {
        return (C197039127h) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1909410zmt(Context context, AbstractC1909290zmh abstractC1909290zmh) {
        super(context, null, 0);
        this.LL = abstractC1909290zmh;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 966));
        this.LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 972));
        this.LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 973));
        this.LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 974));
        this.LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 963));
        this.LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 964));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 965));
        ArrayList arrayList = new ArrayList();
        this.LLJ = arrayList;
        IPraiseDialogDiff.LIZ.getClass();
        C1909260zme.LIZ().LIZIZ();
        this.LLJI = 0;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i5w, this, true);
        arrayList.add(getStar1());
        arrayList.add(getStar2());
        arrayList.add(getStar3());
        arrayList.add(getStar4());
        arrayList.add(getStar5());
        getSubmit().setEnabled(this.LLJI > 0);
        C786410Ut5.U8(getSubmit(), new ACListenerS162S0100000_28(this, 165));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C786410Ut5.a9((TuxIconView) ListProtector.get(this.LLJ, i), new ACListenerS60S0101000_28(i, this, 2));
        }
        if (this.LLJI > 0) {
            LIZ();
        }
    }
}
