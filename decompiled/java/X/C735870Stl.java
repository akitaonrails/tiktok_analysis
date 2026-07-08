package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Stl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735870Stl extends C09AY implements Function2<String, Object, Unit> {
    public final /* synthetic */ Object LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C735870Stl(Object obj) {
        super(2);
        this.LL = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Object obj) throws JSONException {
        C735840Sti c735840Sti = C735840Sti.LIZ;
        Object obj2 = this.LL;
        c735840Sti.getClass();
        C735840Sti.LJIIJJI(obj2, str, obj);
        return Unit.LIZ;
    }
}
