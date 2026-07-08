package X;

import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.i18n.storage.I18nResBundle;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qMB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546890qMB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1546870qM9 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ I18nResBundle LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546890qMB(C1546870qM9 c1546870qM9, String str, I18nResBundle i18nResBundle) {
        super(0);
        this.LL = c1546870qM9;
        this.LLILLJJLI = str;
        this.LLILLL = i18nResBundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZ(this.LLILLJJLI).delete();
        I18nResBundle i18nResBundle = this.LLILLL;
        if (i18nResBundle == null) {
            return null;
        }
        C1546870qM9 c1546870qM9 = this.LL;
        String str = this.LLILLJJLI;
        C1546970qMJ c1546970qMJ = c1546870qM9.LIZLLL;
        String strValueOf = String.valueOf(i18nResBundle.lastAccess);
        Keva keva = c1546970qMJ.LIZ;
        C08CX c08cx = C08CX.INSTANCE;
        Set<String> setLJI = C15442062u.LJI(str, keva.getStringSet(strValueOf, c08cx));
        if (setLJI.isEmpty()) {
            c1546970qMJ.LIZ.erase(strValueOf);
        } else {
            c1546970qMJ.LIZ.storeStringSet(strValueOf, setLJI);
        }
        C1546970qMJ c1546970qMJ2 = c1546870qM9.LJ;
        String str2 = i18nResBundle.geckoChannel;
        Set<String> setLJI2 = C15442062u.LJI(str, c1546970qMJ2.LIZ.getStringSet(str2, c08cx));
        if (setLJI2.isEmpty()) {
            c1546970qMJ2.LIZ.erase(str2);
        } else {
            c1546970qMJ2.LIZ.storeStringSet(str2, setLJI2);
        }
        return Unit.LIZ;
    }
}
