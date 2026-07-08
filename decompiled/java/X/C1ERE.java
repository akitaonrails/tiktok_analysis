package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.SubSpaceFeedLynxUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ERE, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ERE extends C09AY implements Function0<C20316714eb> {
    public C1ERE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.14eb] */
    @Override // kotlin.jvm.functions.Function0
    public final C20316714eb invoke() {
        return new InterfaceC20309914dV() { // from class: X.14eb
            @Override // X.InterfaceC20309914dV
            public final List<C1311670kEn> LIZ() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C1311670kEn() { // from class: X.14ez
                    @Override // X.C1311670kEn
                    public final LynxUI<?> LJFF(s sVar) {
                        return new SubSpaceFeedLynxUI(sVar);
                    }
                });
                return arrayList;
            }
        };
    }
}
