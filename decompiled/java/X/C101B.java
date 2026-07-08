package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.tiktok.tuc.model.TUCActionData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.101B, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C101B extends C09AY implements Function2<Boolean, Exception, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C101D LLILLJJLI;
    public final /* synthetic */ List<TUCActionData> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C101B(Context context, C101D c101d, List<TUCActionData> list, int i) {
        super(2);
        this.LL = context;
        this.LLILLJJLI = c101d;
        this.LLILLL = list;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Exception exc) {
        if (bool.booleanValue()) {
            C101C.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ + 1);
        } else {
            C722430SVl.LIZ.invoke("tuc_action_processor_failure", C2097908Jt.LIZJ(new Pair("actionName", ((TUCActionData) ListProtector.get(this.LLILLL, this.LLILZ)).actionName)));
        }
        return Unit.LIZ;
    }
}
