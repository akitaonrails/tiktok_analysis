package X;

import com.ss.android.ugc.aweme.aikit.api.create.MentionService;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0LNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.component.AITheaterCameoControlComponent$onCreate$5$1", f = "AITheaterCameoControlComponent.kt", l = {194}, m = "invokeSuspend")
public final class C541990LNl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<MentionDataItem> LLILLJJLI;
    public final /* synthetic */ C549180LgK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541990LNl(List<MentionDataItem> list, C549180LgK c549180LgK, InterfaceC1364105Vn<? super C541990LNl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c549180LgK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C541990LNl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJIILIIL;
        InterfaceC549200LgM interfaceC549200LgM;
        MentionDataItem next;
        String str;
        Object objLJII = obj;
        C1C7U.LIZ("AITheaterCameoControlComponent@4a33.onCreate$5$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJII);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJII);
            C546890Lcd.LIZ.getClass();
            MentionService mentionServiceLIZJ = C546890Lcd.LIZJ();
            List<MentionDataItem> list = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            Iterator<MentionDataItem> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().uid;
                if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                    arrayList.add(lLJIILIIL);
                }
            }
            this.LL = 1;
            objLJII = mentionServiceLIZJ.LJII(null, arrayList, Boolean.FALSE, this);
            if (objLJII == objLJFF) {
                C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.onCreate$5$1");
                return objLJFF;
            }
        }
        List<MentionDataItem> list2 = (List) objLJII;
        InterfaceC549570Lgx<InterfaceC549200LgM> interfaceC549570LgxLIZ = this.LLILLL.o2().LIZ();
        if (interfaceC549570LgxLIZ != null && (interfaceC549200LgM = (InterfaceC549200LgM) interfaceC549570LgxLIZ.getApi()) != null) {
            if (list2 != null) {
                List<MentionDataItem> list3 = this.LLILLJJLI;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (MentionDataItem mentionDataItem : list2) {
                    Iterator<MentionDataItem> it3 = list3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(mentionDataItem.uid, next.uid)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    MentionDataItem mentionDataItem2 = next;
                    if (mentionDataItem2 != null) {
                        str = mentionDataItem2.relationType;
                    } else {
                        str = null;
                    }
                    arrayList2.add(MentionDataItem.LIZ(mentionDataItem, null, str, null, null, null, 8127));
                }
                interfaceC549200LgM.t2(arrayList2, false);
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.onCreate$5$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.onCreate$5$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
