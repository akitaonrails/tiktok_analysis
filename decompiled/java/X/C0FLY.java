package X;

import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import njp.a;

/* JADX INFO: renamed from: X.0FLY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.text.ability.TextEditAddYoursListAbility$showRecommendTopicWhenTextEmpty$1", f = "TextEditAddYoursListAbility.kt", l = {181}, m = "invokeSuspend")
public final class C0FLY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0FLW LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FLY(C0FLW c0flw, String str, InterfaceC1364105Vn<? super C0FLY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0flw;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FLY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextEditAddYoursListAbility@8ce0.showRecommendTopicWhenTextEmpty$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("TextEditAddYoursListAbility@8ce0.showRecommendTopicWhenTextEmpty$1");
                return objLJFF;
            }
        }
        AddYoursStickerTopicRepoApi addYoursStickerTopicRepoApi = (AddYoursStickerTopicRepoApi) this.LLILLJJLI.LIZLLL.getValue();
        if (addYoursStickerTopicRepoApi != null) {
            addYoursStickerTopicRepoApi.LIZIZ(new AwS549S0100000_5(this.LLILLJJLI, 1568), new AwS619S0100000_5(this.LLILLJJLI, 66));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextEditAddYoursListAbility@8ce0.showRecommendTopicWhenTextEmpty$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
