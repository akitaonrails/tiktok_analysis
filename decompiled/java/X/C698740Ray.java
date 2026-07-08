package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ray, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698740Ray extends C09AY implements Function2<InteractAreaComponent, C291001Au<? extends String>, Unit> {
    public C698740Ray() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InteractAreaComponent interactAreaComponent, C291001Au<? extends String> c291001Au) {
        Object obj;
        C699060RbU c699060RbU;
        C698730Rax c698730Rax;
        Function1<? super C698760Rb0, Unit> function1;
        InteractAreaComponent interactAreaComponent2 = interactAreaComponent;
        C291001Au<? extends String> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            obj = c291001Au2.LIZ;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(obj, ((VideoItemParams) C631370Opb.LIZ(interactAreaComponent2)).getAweme().getAid()) && (c699060RbU = interactAreaComponent2.LLLFFI) != null && (c698730Rax = c699060RbU.LLIZLLLIL) != null && !c698730Rax.LIZLLL.isEmpty() && (function1 = c698730Rax.LJFF) != null) {
            Object obj2 = c698730Rax.LJ;
            Collection<C698760Rb0> collectionValues = c698730Rax.LIZLLL.values();
            ArrayList<C698760Rb0> arrayList = new ArrayList();
            for (Object obj3 : collectionValues) {
                if (Intrinsics.LJFF(((C698760Rb0) obj3).LIZ, obj2)) {
                    arrayList.add(obj3);
                }
            }
            C19719612Di.LJJIII(c698730Rax.LIZLLL.entrySet(), new AwS590S0100000_11(obj2, 399), true);
            for (C698760Rb0 c698760Rb0 : arrayList) {
                function1.invoke(new C698760Rb0(c698760Rb0.LIZ, c698760Rb0.LIZIZ, c698760Rb0.LIZJ, c698760Rb0.LIZLLL, c698760Rb0.LJ, c698730Rax.LIZJ(c698760Rb0.LIZIZ)));
            }
        }
        return Unit.LIZ;
    }
}
