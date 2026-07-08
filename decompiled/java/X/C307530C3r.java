package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307530C3r extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C307530C3r(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C307500C3o.LIZ.getClass();
        String string = ((Keva) C307500C3o.LJ.getValue()).getString(this.LL, null);
        if (Intrinsics.LJFF(string, "--KEVA_EMPTY_OBJECT--")) {
            return null;
        }
        return string;
    }
}
