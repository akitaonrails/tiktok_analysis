package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.share.dislike.ChooseItemViewModel;
import com.ss.android.ugc.aweme.share.dislike.NewDislikeReason;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.IndexedValue;

/* JADX INFO: renamed from: X.15mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20623215mw implements InterfaceC447300HgO {
    public final C19GS LIZ;
    public final LinearLayout LIZIZ;
    public NewDislikeReason[] LIZJ;
    public final ChooseItemViewModel LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Integer> LIZJ() {
        String str;
        ArrayList arrayList = new ArrayList();
        NewDislikeReason[] newDislikeReasonArr = this.LIZJ;
        C717610SCx c717610SCx = new C717610SCx(new C20623315mx(this.LIZIZ).iterator());
        while (c717610SCx.hasNext()) {
            IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
            View view = (View) indexedValue.LIZIZ;
            if ((view instanceof C447290HgN) && ((C447290HgN) view).LLILZ.isChecked() && newDislikeReasonArr != null && (str = newDislikeReasonArr[indexedValue.LIZ].id) != null) {
                arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt(str)));
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC447300HgO
    public final void LIZ(C447290HgN c447290HgN) {
        int i = this.LIZLLL.LL;
        int i2 = 0;
        if (c447290HgN.LLILZ.isChecked()) {
            ChooseItemViewModel chooseItemViewModel = this.LIZLLL;
            int i3 = i + 1;
            chooseItemViewModel.LL = i3;
            if (chooseItemViewModel.LLILZ) {
                i2 = chooseItemViewModel.LLILLJJLI;
            }
            chooseItemViewModel.vQ2(i3 + i2);
            return;
        }
        ChooseItemViewModel chooseItemViewModel2 = this.LIZLLL;
        int i4 = i - 1;
        chooseItemViewModel2.LL = i4;
        if (chooseItemViewModel2.LLILZ) {
            i2 = chooseItemViewModel2.LLILLJJLI;
        }
        chooseItemViewModel2.vQ2(i4 + i2);
    }

    public final void LIZIZ(List<NewDislikeReason> list) {
        this.LIZJ = (NewDislikeReason[]) list.toArray(new NewDislikeReason[0]);
        for (NewDislikeReason newDislikeReason : list) {
            LinearLayout linearLayout = this.LIZIZ;
            C447290HgN c447290HgN = new C447290HgN(this.LIZ, this);
            c447290HgN.setDescText(String.valueOf(newDislikeReason.text));
            linearLayout.addView(c447290HgN);
        }
    }

    public C20623215mw(C19GS c19gs, LinearLayout linearLayout) {
        this.LIZ = c19gs;
        this.LIZIZ = linearLayout;
        this.LIZLLL = (ChooseItemViewModel) ViewModelProviders.of(c19gs).get(ChooseItemViewModel.class);
    }
}
