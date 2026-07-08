package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.series.serieslist.assem.SeriesListAssem;
import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;
import com.ss.android.ugc.aweme.ui.assem.publish.CollabEditPageHeaderAssem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620820sHQ implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$1(C1620820sHQ c1620820sHQ, Editable editable) {
    }

    public static final void beforeTextChanged$0(C1620820sHQ c1620820sHQ, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1620820sHQ c1620820sHQ, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C1620820sHQ c1620820sHQ, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C1620820sHQ c1620820sHQ, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C1620820sHQ c1620820sHQ, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C1620820sHQ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C1620820sHQ c1620820sHQ, Editable editable) {
        String string;
        String string2;
        AssemViewModel assemViewModel = (AssemViewModel) ((CollabEditPageHeaderAssem) c1620820sHQ.l0).LLIZLLLIL.getValue();
        if (editable == null || (string2 = editable.toString()) == null || (string = a0.LJLIIIL(string2).toString()) == null) {
            string = "";
        }
        assemViewModel.setState(new AwS74S1000000_24(string, 24));
    }

    public static final void afterTextChanged$2(C1620820sHQ c1620820sHQ, Editable editable) {
        SeriesListAssemViewModel seriesListAssemViewModelIp = ((SeriesListAssem) c1620820sHQ.l0).ip();
        String strValueOf = String.valueOf(editable);
        if (C123100dR.LIZ(strValueOf)) {
            List<C1573950r3p> list = seriesListAssemViewModelIp.LL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (a0.LJJIIZI(((C1573950r3p) obj).LL.collectionName, strValueOf, true)) {
                    arrayList.add(obj);
                }
            }
            seriesListAssemViewModelIp.newState(new C627660Ojc(null, null, null, arrayList, 7));
        } else {
            seriesListAssemViewModelIp.getClass();
        }
        ((SeriesListAssem) c1620820sHQ.l0).Go().smoothScrollToPosition(0);
    }

    public static final void onTextChanged$1(C1620820sHQ c1620820sHQ, CharSequence charSequence, int i, int i2, int i3) {
        C1592990rYX.LJJJJL(((C1592990rYX) c1620820sHQ.l0).LL);
    }
}
