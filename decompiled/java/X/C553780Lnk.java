package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.input.mentionpanel.component.InputMentionPanelComponent$refreshMyselfProgress$1", f = "InputMentionPanelComponent.kt", l = {386}, m = "invokeSuspend")
public final class C553780Lnk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C555030Lpl LLILLJJLI;
    public final /* synthetic */ InterfaceC549270LgT LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553780Lnk(C555030Lpl c555030Lpl, InterfaceC549270LgT interfaceC549270LgT, InterfaceC1364105Vn<? super C553780Lnk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c555030Lpl;
        this.LLILLL = interfaceC549270LgT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553780Lnk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object next;
        Integer numLJ;
        C1C7U.LIZ("InputMentionPanelComponent@aece.refreshMyselfProgress$1");
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
            InterfaceC553790Lnl mentionPanelSearchHandler$tools_ai_uikit_df_release = this.LLILLJJLI.LLJILJILJ.getMentionPanelSearchHandler$tools_ai_uikit_df_release();
            if (mentionPanelSearchHandler$tools_ai_uikit_df_release != null) {
                this.LL = 1;
                obj = mentionPanelSearchHandler$tools_ai_uikit_df_release.LIZIZ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InputMentionPanelComponent@aece.refreshMyselfProgress$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InputMentionPanelComponent@aece.refreshMyselfProgress$1");
            return unit;
        }
        List list = (List) obj;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C549450Lgl.LJFF((MentionDataItem) next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            MentionDataItem mentionDataItem = (MentionDataItem) next;
            if (mentionDataItem != null) {
                InterfaceC549270LgT interfaceC549270LgT = this.LLILLL;
                if (interfaceC549270LgT instanceof C549300LgW) {
                    numLJ = C2286608xc.LJ(((C549300LgW) interfaceC549270LgT).LIZ);
                } else {
                    numLJ = null;
                }
                InterfaceC549270LgT interfaceC549270LgT2 = this.LLILLL;
                if (interfaceC549270LgT2 instanceof C549280LgU) {
                    str = ((C549280LgU) interfaceC549270LgT2).LIZ;
                }
                this.LLILLJJLI.n5(MentionDataItem.LIZ(mentionDataItem, str, null, C2286608xc.LJ(1), null, numLJ, 7519));
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("InputMentionPanelComponent@aece.refreshMyselfProgress$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("InputMentionPanelComponent@aece.refreshMyselfProgress$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
