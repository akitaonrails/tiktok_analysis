package X;

import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.i18n.storage.I18nResBundle;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0qMA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546880qMA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1546870qM9 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ I18nResBundle LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546880qMA(C1546870qM9 c1546870qM9, String str, I18nResBundle i18nResBundle, String str2) {
        super(0);
        this.LL = c1546870qM9;
        this.LLILLJJLI = str;
        this.LLILLL = i18nResBundle;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws Throwable {
        C1546870qM9 c1546870qM9 = this.LL;
        String str = this.LLILLJJLI;
        I18nResBundle i18nResBundle = this.LLILLL;
        C1546970qMJ c1546970qMJ = c1546870qM9.LIZLLL;
        String strValueOf = String.valueOf(i18nResBundle.lastAccess);
        Keva keva = c1546970qMJ.LIZ;
        C08CX c08cx = C08CX.INSTANCE;
        Set<String> setLJIIIIZZ = C15442062u.LJIIIIZZ(str, keva.getStringSet(strValueOf, c08cx));
        if (setLJIIIIZZ.isEmpty()) {
            c1546970qMJ.LIZ.erase(strValueOf);
        } else {
            c1546970qMJ.LIZ.storeStringSet(strValueOf, setLJIIIIZZ);
        }
        C1546970qMJ c1546970qMJ2 = c1546870qM9.LJ;
        String str2 = i18nResBundle.geckoChannel;
        Set<String> setLJIIIIZZ2 = C15442062u.LJIIIIZZ(str, c1546970qMJ2.LIZ.getStringSet(str2, c08cx));
        if (setLJIIIIZZ2.isEmpty()) {
            c1546970qMJ2.LIZ.erase(str2);
        } else {
            c1546970qMJ2.LIZ.storeStringSet(str2, setLJIIIIZZ2);
        }
        C0VSJ c0vsjLIZ = this.LL.LIZ(this.LLILLJJLI);
        c0vsjLIZ.createNewFile();
        C09BH.LJIIIZ(c0vsjLIZ, this.LLILZ, Charsets.UTF_8);
        return Unit.LIZ;
    }
}
