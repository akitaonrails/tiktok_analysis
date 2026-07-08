package X;

import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.160m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C207054160m extends C2217421BqW implements Function1<Boolean, Unit> {
    public C207054160m(Object obj) {
        super(1, obj, CLACaptionAssemV2.class, "onBlockUIUpdateChanged", "onBlockUIUpdateChanged(Z)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        CLACaptionAssemV2 cLACaptionAssemV2 = (CLACaptionAssemV2) this.receiver;
        if (!zBooleanValue) {
            if (cLACaptionAssemV2.LLJJIII && ((Boolean) C0A7W.LIZ.getValue()).booleanValue()) {
                cLACaptionAssemV2.Ip(((C160C) cLACaptionAssemV2.Bp().getState()).LL);
            }
        } else {
            cLACaptionAssemV2.getClass();
        }
        return Unit.LIZ;
    }
}
