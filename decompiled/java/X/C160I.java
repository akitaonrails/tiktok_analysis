package X;

import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.160I, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C160I extends C2217421BqW implements Function1<C160B, Unit> {
    public C160I(CLACaptionViewModelV2 cLACaptionViewModelV2) {
        super(1, cLACaptionViewModelV2, CLACaptionViewModelV2.class, "onBaseCaptionDisplayStateChange", "onBaseCaptionDisplayStateChange(Lcom/ss/android/ugc/aweme/sharedmodel/CaptionDisplayState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C160B c160b) throws JSONException {
        C207044160c c207044160cVQ2 = ((CLACaptionViewModelV2) this.receiver).vQ2();
        c207044160cVQ2.LLJI = c160b;
        c207044160cVQ2.LIZJ();
        return Unit.LIZ;
    }
}
