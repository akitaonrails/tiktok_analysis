package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0FMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursEditAutoCompleteListItem$requestAutoCompleteOptionsAndShow$1", f = "AddYoursEditAutoCompleteListItem.kt", l = {144}, m = "invokeSuspend")
public final class C388950FMv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;
    public final /* synthetic */ C388960FMw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C388950FMv(String str, TextView textView, C388960FMw c388960FMw, InterfaceC1364105Vn<? super C388950FMv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = textView;
        this.LLILZ = c388960FMw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C388950FMv(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursEditAutoCompleteListItem@4904.requestAutoCompleteOptionsAndShow$1");
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
                C1C7U.LIZIZ("AddYoursEditAutoCompleteListItem@4904.requestAutoCompleteOptionsAndShow$1");
                return objLJFF;
            }
        }
        if (!Intrinsics.LJFF(this.LLILLJJLI, a0.LJLIIIL(this.LLILLL.getText().toString()).toString())) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AddYoursEditAutoCompleteListItem@4904.requestAutoCompleteOptionsAndShow$1");
            return unit;
        }
        AddYoursStickerTopicRepoApi addYoursStickerTopicRepoApi = (AddYoursStickerTopicRepoApi) this.LLILZ.LIZLLL.getValue();
        if (addYoursStickerTopicRepoApi != null) {
            addYoursStickerTopicRepoApi.LIZ(this.LLILLJJLI, new AwS549S0100000_5(this.LLILZ, 151), new AwS441S0200000_5(this.LLILLL, this.LLILZ, 2));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursEditAutoCompleteListItem@4904.requestAutoCompleteOptionsAndShow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
