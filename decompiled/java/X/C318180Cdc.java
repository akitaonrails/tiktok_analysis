package X;

import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cdc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$dedupDrafts$2", f = "MyEffectsViewModel.kt", l = {387}, m = "invokeSuspend")
public final class C318180Cdc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftEffect>>, Object> {
    public int LL;
    public final /* synthetic */ MyEffectsViewModel LLILLJJLI;
    public final /* synthetic */ List<DraftEffect> LLILLL;
    public final /* synthetic */ List<MobileEffect> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318180Cdc(MyEffectsViewModel myEffectsViewModel, List<DraftEffect> list, List<MobileEffect> list2, InterfaceC1364105Vn<? super C318180Cdc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = myEffectsViewModel;
        this.LLILLL = list;
        this.LLILZ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318180Cdc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC318140CdY interfaceC318140CdYLJIIJ;
        C1C7U.LIZ("MyEffectsViewModel@4e1b.dedupDrafts$2");
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
            this.LLILLJJLI.getClass();
            IEffectCreatorService iEffectCreatorServiceEQ2 = MyEffectsViewModel.EQ2();
            if (iEffectCreatorServiceEQ2 == null) {
                List<DraftEffect> list = this.LLILLL;
                C1C7U.LIZIZ("MyEffectsViewModel@4e1b.dedupDrafts$2");
                return list;
            }
            List<MobileEffect> list2 = this.LLILZ;
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (MobileEffect mobileEffect : list2) {
                Pair pair = new Pair(mobileEffect.getEffectId(), new C318160Cda(mobileEffect.getModerationStatus()));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            InterfaceC318150CdZ interfaceC318150CdZ = new InterfaceC318150CdZ() { // from class: X.0Cdb
                @Override // X.InterfaceC318150CdZ
                public final void LIZ(List<String> list3, Function1<? super Map<String, C318160Cda>, Unit> function1) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Map<String, C318160Cda> map = linkedHashMap;
                    for (Object obj2 : (ArrayList) list3) {
                        C318160Cda c318160Cda = map.get(obj2);
                        if (c318160Cda == null) {
                            c318160Cda = new C318160Cda(0);
                        }
                        linkedHashMap2.put(obj2, c318160Cda);
                    }
                    function1.invoke(linkedHashMap2);
                }
            };
            InterfaceC318260Cdk interfaceC318260CdkDraftService = iEffectCreatorServiceEQ2.draftService();
            if (interfaceC318260CdkDraftService != null && (interfaceC318140CdYLJIIJ = interfaceC318260CdkDraftService.LJIIJ()) != null) {
                List<DraftEffect> list3 = this.LLILLL;
                this.LL = 1;
                obj = interfaceC318140CdYLJIIJ.LIZ(interfaceC318150CdZ, list3, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MyEffectsViewModel@4e1b.dedupDrafts$2");
                    return objLJFF;
                }
            }
            obj = C13BV.INSTANCE;
            C1C7U.LIZIZ("MyEffectsViewModel@4e1b.dedupDrafts$2");
            return obj;
        }
        if (obj == null) {
            obj = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("MyEffectsViewModel@4e1b.dedupDrafts$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftEffect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
