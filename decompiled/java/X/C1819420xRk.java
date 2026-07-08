package X;

import android.widget.CompoundButton;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.data.LiveModeratorListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.ui.LiveModeratorCell;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS41S0000100_27;
import njp.a;

/* JADX INFO: renamed from: X.0xRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.ui.LiveModeratorCell$updatePermission$1", f = "LiveModeratorCell.kt", l = {67}, m = "invokeSuspend")
public final class C1819420xRk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public LiveModeratorCell LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ LiveModeratorCell LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ CompoundButton LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819420xRk(LiveModeratorCell liveModeratorCell, boolean z, CompoundButton compoundButton, InterfaceC1364105Vn<? super C1819420xRk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = liveModeratorCell;
        this.LLILZLL = z;
        this.LLIZ = compoundButton;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1819420xRk(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        LiveModeratorCell liveModeratorCell;
        CompoundButton compoundButton;
        String str;
        long j;
        C750740Tce c750740Tce;
        Map<Integer, Integer> map;
        Integer num;
        Object objVQ2 = obj;
        C1C7U.LIZ("LiveModeratorCell@6d8.updatePermission$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                z = this.LL;
                compoundButton = (CompoundButton) this.LLILLL;
                liveModeratorCell = this.LLILLJJLI;
                C155000ia.LIZIZ(objVQ2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objVQ2);
            C751680TeA item = this.LLILZIL.getItem();
            if (item != null) {
                z = this.LLILZLL;
                liveModeratorCell = this.LLILZIL;
                compoundButton = this.LLIZ;
                C1833570xoZ c1833570xoZ = C1833570xoZ.LIZ;
                if (z) {
                    str = "moderators_lists_open";
                } else {
                    str = "moderators_lists_close";
                }
                C1833570xoZ.LJ(c1833570xoZ, str, String.valueOf(item.LL.LIZ), null, 4);
                AssemVMLazy assemVMLazy = liveModeratorCell.LL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveModeratorCell.LLILZLL;
                LiveModeratorListViewModel liveModeratorListViewModel = (LiveModeratorListViewModel) assemVMLazy.getValue();
                boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(z));
                C750740Tce c750740Tce2 = item.LL;
                long j2 = c750740Tce2.LIZ;
                String str2 = c750740Tce2.LIZIZ;
                this.LLILLJJLI = liveModeratorCell;
                this.LLILLL = compoundButton;
                this.LL = z;
                this.LLILZ = 1;
                objVQ2 = liveModeratorListViewModel.vQ2(zLJJJI ? 1 : 0, j2, str2, this);
                if (objVQ2 == objLJFF) {
                    C1C7U.LIZIZ("LiveModeratorCell@6d8.updatePermission$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LiveModeratorCell@6d8.updatePermission$1");
            return unit;
        }
        if (((Boolean) objVQ2).booleanValue()) {
            AssemVMLazy assemVMLazy2 = liveModeratorCell.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LiveModeratorCell.LLILZLL;
            AssemViewModel value = assemVMLazy2.getValue();
            List<C751680TeA> listListGetAll = ((AssemSingleListViewModel) liveModeratorCell.LL.getValue()).listGetAll();
            if (listListGetAll != null) {
                if (!listListGetAll.isEmpty()) {
                    i2 = 0;
                    for (C751680TeA c751680TeA : listListGetAll) {
                        if (c751680TeA != null && (c750740Tce = c751680TeA.LL) != null && (map = c750740Tce.LJIIIZ) != null && (num = map.get(C2286608xc.LJ(17))) != null && num.intValue() == 1 && (i2 = i2 + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                j = i2;
            } else {
                j = 0;
            }
            value.setState(new AwS41S0000100_27(j, 6));
        } else {
            C786410Ut5.w7(compoundButton, null);
            compoundButton.setChecked(!z);
            C786410Ut5.w7(compoundButton, new C1864680yck(liveModeratorCell, 3));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveModeratorCell@6d8.updatePermission$1");
        return unit2;
    }
}
