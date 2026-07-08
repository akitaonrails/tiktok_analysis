package X;

import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.160D, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C160D extends C2217421BqW implements Function1<Boolean, Unit> {
    public C160D(Object obj) {
        super(1, obj, CLACaptionAssemV2.class, "onIsHolderSelectedChangedAfterScrolling", "onIsHolderSelectedChangedAfterScrolling(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        CLACaptionAssemV2 cLACaptionAssemV2 = (CLACaptionAssemV2) this.receiver;
        if (zBooleanValue) {
            cLACaptionAssemV2.Bp().PU1(cLACaptionAssemV2.getContext());
        } else {
            cLACaptionAssemV2.Bp().EK();
        }
        return Unit.LIZ;
    }
}
