package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614530O8l implements InterfaceC613720O5i<C614520O8k> {
    public final IAVEffectService.EffectPlatformLoader LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C614530O8l)) {
            return false;
        }
        C614530O8l c614530O8l = (C614530O8l) obj;
        return Intrinsics.LJFF(this.LIZ, c614530O8l.LIZ) && Intrinsics.LJFF(this.LIZIZ, c614530O8l.LIZIZ) && this.LIZJ == c614530O8l.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectEffectMutation(effectPlatformSupplier=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFavorite=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return new C613690O5f(3, 3000L, true);
    }

    @Override // X.InterfaceC613730O5j
    public final Object LIZIZ(C0O8O c0o8o, InterfaceC1364105Vn<? super C614520O8k> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        this.LIZ.load(new InterfaceC2385309Wh() { // from class: X.0O8m
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("CollectEffectMutation@f8aa.operate$2$1");
                InterfaceC1635410sex interfaceC1635410sex = (InterfaceC1635410sex) c15o7.LJIIL();
                List listSingletonList = Collections.singletonList(this.LIZ.LIZIZ);
                boolean z = this.LIZ.LIZJ;
                final InterfaceC1364105Vn<C614520O8k> interfaceC1364105Vn2 = c23260099m;
                interfaceC1635410sex.qg(new IModFavoriteList() { // from class: X.0O8j
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList
                    public final void onFail(ExceptionResult exceptionResult) {
                        InterfaceC1364105Vn<C614520O8k> interfaceC1364105Vn3 = interfaceC1364105Vn2;
                        C098200Yq c098200Yq = new C098200Yq(new C614490O8h(exceptionResult));
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC1364105Vn3.resumeWith(c098200Yq);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(List<String> list) {
                        InterfaceC1364105Vn<C614520O8k> interfaceC1364105Vn3 = interfaceC1364105Vn2;
                        C614520O8k c614520O8k = new C614520O8k();
                        C189200o6.m2constructorimpl(c614520O8k);
                        interfaceC1364105Vn3.resumeWith(c614520O8k);
                    }
                }, "default", listSingletonList, z);
                C1C7U.LIZIZ("CollectEffectMutation@f8aa.operate$2$1");
                return null;
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public C614530O8l(IAVEffectService.EffectPlatformLoader effectPlatformLoader, String str, boolean z) {
        this.LIZ = effectPlatformLoader;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
