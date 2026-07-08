package X;

import android.app.Application;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$fetchDraftEffects$2", f = "MyEffectsViewModel.kt", l = {307}, m = "invokeSuspend")
public final class C318190Cdd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftEffect>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MyEffectsViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318190Cdd(MyEffectsViewModel myEffectsViewModel, InterfaceC1364105Vn<? super C318190Cdd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = myEffectsViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C318190Cdd c318190Cdd = new C318190Cdd(this.LLILLL, interfaceC1364105Vn);
        c318190Cdd.LLILLJJLI = obj;
        return c318190Cdd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<CKEDraftInfo> listLJII;
        List listLJLLLL;
        boolean z;
        Object objLIZ = obj;
        C1C7U.LIZ("MyEffectsViewModel@4e1b.fetchDraftEffects$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            this.LLILLL.getClass();
            IEffectCreatorService iEffectCreatorServiceEQ2 = MyEffectsViewModel.EQ2();
            if (C1656550tD3.LIZ() && iEffectCreatorServiceEQ2 != null) {
                Application application = C0CHQ.LIZ;
                InterfaceC318260Cdk interfaceC318260CdkDraftService = iEffectCreatorServiceEQ2.draftService();
                if (interfaceC318260CdkDraftService != null && (listLJII = interfaceC318260CdkDraftService.LJII(application)) != null && (listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0Cdf
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return ((CKEDraftInfo) obj3).getUpdateTime().compareTo(((CKEDraftInfo) obj2).getUpdateTime());
                    }
                }, listLJII)) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("draftList = ");
                    sbLIZ.append(listLJLLLL);
                    C201955140j.LIZIZ("AMESDK", C2188811AlT.LIZIZ(sbLIZ));
                    C118300cf c118300cf = new C118300cf();
                    c118300cf.element = LSPassThroughRecordSizeConfig.DEFAULT;
                    MyEffectsViewModel myEffectsViewModel = this.LLILLL;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                    int i2 = 0;
                    for (Object obj2 : listLJLLLL) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            CKEDraftInfo cKEDraftInfo = (CKEDraftInfo) obj2;
                            c118300cf.element++;
                            String effectId = cKEDraftInfo.getEffectId();
                            if (effectId.length() > 0) {
                                z = true;
                            } else {
                                effectId = String.valueOf(c118300cf.element);
                                z = false;
                            }
                            arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C318200Cde(cKEDraftInfo, myEffectsViewModel, effectId, null, z), 3));
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    this.LL = 1;
                    objLIZ = C1D9F.LIZ(arrayList, this);
                    if (objLIZ == objLJFF) {
                        C1C7U.LIZIZ("MyEffectsViewModel@4e1b.fetchDraftEffects$2");
                        return objLJFF;
                    }
                } else {
                    C13BV c13bv = C13BV.INSTANCE;
                    C1C7U.LIZIZ("MyEffectsViewModel@4e1b.fetchDraftEffects$2");
                    return c13bv;
                }
            } else {
                C13BV c13bv2 = C13BV.INSTANCE;
                C1C7U.LIZIZ("MyEffectsViewModel@4e1b.fetchDraftEffects$2");
                return c13bv2;
            }
        }
        List listLJJJJLI = C13LP.LJJJJLI((Iterable) objLIZ);
        C1C7U.LIZIZ("MyEffectsViewModel@4e1b.fetchDraftEffects$2");
        return listLJJJJLI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DraftEffect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
