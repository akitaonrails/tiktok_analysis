package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612230Nzp<S> {
    public final C603820NmG<String, Pair<S, S>> LIZ = new C603820NmG<>(LSPassThroughRecordSizeConfig.DEFAULT);
    public final CopyOnWriteArraySet<InterfaceC612240Nzq<S>> LIZIZ = new CopyOnWriteArraySet<>();
    public final C2252331DDr LIZJ = C09IR.LIZIZ(0, 1, EnumC2252401DDy.DROP_OLDEST, 1);

    public final void LIZ(S s, boolean z, EnumC612210Nzn enumC612210Nzn) {
        this.LIZJ.LIZJ(new C612220Nzo(s, z, enumC612210Nzn));
        Iterator<InterfaceC612240Nzq<S>> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(s, enumC612210Nzn);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(Object obj, String str, boolean z) {
        Pair<S, S> pairLIZJ = this.LIZ.LIZJ(str);
        if (pairLIZJ != null) {
            if (!Intrinsics.LJFF(pairLIZJ.getFirst(), obj)) {
                LIZ(obj, z, EnumC612210Nzn.MUTATION);
            }
            this.LIZ.LIZLLL(str, new Pair<>(obj, obj));
        } else {
            this.LIZ.LIZLLL(str, new Pair<>(obj, obj));
            LIZ(obj, z, EnumC612210Nzn.MUTATION);
        }
    }
}
