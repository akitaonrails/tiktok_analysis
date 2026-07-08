package X;

import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Lpy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.input.box.component.InputBoxUIComponent$triggerPermissionCheck$2", f = "InputBoxUIComponent.kt", l = {157}, m = "invokeSuspend")
public final class C555160Lpy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<InputBlock> LLILLJJLI;
    public final /* synthetic */ C557370LtX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555160Lpy(List<InputBlock> list, C557370LtX c557370LtX, InterfaceC1364105Vn<? super C555160Lpy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c557370LtX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555160Lpy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        C1C7U.LIZ("InputBoxUIComponent@202d.triggerPermissionCheck$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<InputBlock> list2 = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            Iterator<InputBlock> it2 = list2.iterator();
            while (it2.hasNext()) {
                MentionDataItem mentionDataItem = it2.next().userItem;
                if (mentionDataItem != null) {
                    arrayList.add(mentionDataItem);
                }
            }
            List<MentionDataItem> listLJJJJI = C13LP.LJJJJI(arrayList);
            InterfaceC555170Lpz inputBoxEventHandler$tools_ai_uikit_df_release = this.LLILLL.LLJILLL.getInputBoxEventHandler$tools_ai_uikit_df_release();
            if (inputBoxEventHandler$tools_ai_uikit_df_release != null) {
                this.LL = 1;
                obj = inputBoxEventHandler$tools_ai_uikit_df_release.LIZLLL(listLJJJJI, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InputBoxUIComponent@202d.triggerPermissionCheck$2");
                    return objLJFF;
                }
            } else {
                list = null;
                this.LLILLL.i3(new AwS587S0100000_8(list, (List<MentionDataItem>) 542));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("InputBoxUIComponent@202d.triggerPermissionCheck$2");
                return unit;
            }
        }
        list = (List) obj;
        this.LLILLL.i3(new AwS587S0100000_8(list, (List<MentionDataItem>) 542));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InputBoxUIComponent@202d.triggerPermissionCheck$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
