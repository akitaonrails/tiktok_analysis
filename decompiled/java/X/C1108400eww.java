package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108400eww extends C09AY implements Function1<C512730K8x, Unit> {
    public final /* synthetic */ AbstractC1108380ewu LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108400eww(AbstractC1108380ewu abstractC1108380ewu) {
        super(1);
        this.LL = abstractC1108380ewu;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C512730K8x c512730K8x) {
        C512730K8x c512730K8x2 = c512730K8x;
        if (this.LL.LJIIIZ() == c512730K8x2.LIZIZ) {
            AbstractC1108380ewu abstractC1108380ewu = this.LL;
            Map<String, String> map = c512730K8x2.LIZ;
            Function1<C512740K8y, Unit> function1 = c512730K8x2.LIZJ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) abstractC1108380ewu.LLJIJIL;
            linkedHashMap.clear();
            linkedHashMap.putAll(map);
            if (abstractC1108380ewu.LLIZ) {
                abstractC1108380ewu.LJIILLIIL(function1, true);
            } else {
                abstractC1108380ewu.LJIIZILJ(function1);
            }
        }
        return Unit.LIZ;
    }
}
