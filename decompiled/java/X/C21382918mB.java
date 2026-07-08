package X;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditItem;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18mB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity$onCreate$6$1", f = "CreatorCaptionEditActivity.kt", l = {}, m = "invokeSuspend")
public final class C21382918mB extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public final /* synthetic */ CreatorCaptionEditActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21382918mB(CreatorCaptionEditActivity creatorCaptionEditActivity, InterfaceC1364105Vn<? super C21382918mB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorCaptionEditActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21382918mB c21382918mB = new C21382918mB(this.LLILLJJLI, interfaceC1364105Vn);
        c21382918mB.LL = ((Boolean) obj).booleanValue();
        return c21382918mB;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return invoke(bool.booleanValue(), interfaceC1364105Vn);
    }

    public final Object invoke(boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(z), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        ArrayList arrayList;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2;
        List<CreatorCaptionEditData> list;
        C1C7U.LIZ("CreatorCaptionEditActivity@fad2.onCreate$6$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        C21383818mK c21383818mK = (C21383818mK) this.LLILLJJLI.LLLIIIL.getValue();
        int i2 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        c21383818mK.LIZLLL(i);
        FrameLayout frameLayout = (FrameLayout) this.LLILLJJLI.LLJL.getValue();
        if (z) {
            i2 = 8;
        }
        C786410Ut5.LJZ(i2, frameLayout);
        CreatorCaptionEditActivity creatorCaptionEditActivity = this.LLILLJJLI;
        int iLLLLZIL = creatorCaptionEditActivity.LLLLZIL(creatorCaptionEditActivity.LLLZLZ().LIZLLL());
        C21383018mC c21383018mC = null;
        if (z) {
            CreatorCaptionEditViewModel creatorCaptionEditViewModelLLLLZLL = this.LLILLJJLI.LLLLZLL();
            CreatorCaptionEditItem creatorCaptionEditItem = creatorCaptionEditViewModelLLLLZLL.LLIZ;
            if (creatorCaptionEditItem != null && (list = creatorCaptionEditItem.transSubtitleItem) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<CreatorCaptionEditData> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getText());
                }
            } else {
                arrayList = null;
            }
            creatorCaptionEditViewModelLLLLZLL.LLIZLLLIL = arrayList;
            C21383018mC c21383018mC2 = this.LLILLJJLI.LLILLJJLI;
            if (c21383018mC2 != null) {
                c21383018mC = c21383018mC2;
            }
            RecyclerView recyclerView = c21383018mC.LLIZ;
            if (recyclerView != null && (viewHolderFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(iLLLLZIL)) != null) {
                C21383318mF c21383318mF = (C21383318mF) viewHolderFindViewHolderForAdapterPosition2;
                c21383318mF.LL.requestFocus();
                KeyboardUtils.LIZJ(c21383318mF.LL);
            }
        } else {
            C21383018mC c21383018mC3 = this.LLILLJJLI.LLILLJJLI;
            if (c21383018mC3 == null) {
                c21383018mC3 = null;
            }
            RecyclerView recyclerView2 = c21383018mC3.LLIZ;
            if (recyclerView2 != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iLLLLZIL)) != null) {
                ((C21383318mF) viewHolderFindViewHolderForAdapterPosition).LL.clearFocus();
            }
            C21383018mC c21383018mC4 = this.LLILLJJLI.LLILLJJLI;
            if (c21383018mC4 != null) {
                c21383018mC = c21383018mC4;
            }
            c21383018mC.LLLII();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorCaptionEditActivity@fad2.onCreate$6$1");
        return unit;
    }
}
