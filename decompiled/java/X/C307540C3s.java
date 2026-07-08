package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307540C3s extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C307540C3s(String str, C259800zU<String> c259800zU) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C307500C3o c307500C3o = C307500C3o.LIZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI.element;
        c307500C3o.getClass();
        if (str2 == null) {
            ((Keva) C307500C3o.LJ.getValue()).storeString(str, "--KEVA_EMPTY_OBJECT--");
        } else {
            ((Keva) C307500C3o.LJ.getValue()).storeString(str, str2);
        }
        return Unit.LIZ;
    }
}
