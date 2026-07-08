package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.decoration.AllShareBgDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0aqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C950860aqq extends C2217421BqW implements Function2<List<? extends C950750aqf>, Boolean, Unit> {
    public C950860aqq(Object obj) {
        super(2, obj, AllShareBgDialog.class, "handleResult", "handleResult(Ljava/util/List;Z)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends C950750aqf> list, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((AllShareBgDialog) this.receiver).uS(list, zBooleanValue);
        return Unit.LIZ;
    }
}
