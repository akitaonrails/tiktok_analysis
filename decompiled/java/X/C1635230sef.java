package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1635230sef extends C1635250seh {
    public final String LJFF;

    @Override // X.C1635250seh
    public final C11KS LJI(final int i, final C1634860se4 c1634860se4) {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0sej
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<C1641660sp2<ProviderEffectModel>> interfaceC2329309At) {
                InterfaceC1635390sev interfaceC1635390sevInvoke = this.LL.LIZJ.invoke();
                C1635230sef c1635230sef = this.LL;
                String str = c1635230sef.LJFF;
                String str2 = c1635230sef.LIZLLL;
                String str3 = c1635230sef.LJ;
                interfaceC1635390sevInvoke.LJJIJIIJIL(str, str2, c1634860se4.LIZ, i, false, str3, null, new C1635290sel((C11KT) interfaceC2329309At));
            }
        });
    }

    public C1635230sef(Function0<? extends InterfaceC1635390sev> function0, String str, String str2, String str3, C1634860se4 c1634860se4) {
        super(function0, str, str2, c1634860se4);
        this.LJFF = str3;
    }
}
