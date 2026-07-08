package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lXA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361500lXA extends C09AY implements Function0<C1361490lX9> {
    public C1361500lXA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lX9] */
    @Override // kotlin.jvm.functions.Function0
    public final C1361490lX9 invoke() {
        return new AbstractC1361480lX8<C1869620yki>() { // from class: X.0lX9
            public final C08I7<String, C1869620yki> LIZIZ = new C08I7<>(10);

            @Override // X.AbstractC1361480lX8
            public final InterfaceC1361520lXC LJI() {
                final C08I7<String, C1869620yki> c08i7 = this.LIZIZ;
                return new InterfaceC1361520lXC<Object>() { // from class: X.0lX6
                    @Override // X.InterfaceC1361520lXC
                    public final Object get(String str) {
                        return c08i7.LIZIZ(str);
                    }

                    @Override // X.InterfaceC1361520lXC
                    public final void LIZIZ(String str, Object obj) {
                        c08i7.LIZLLL(str, obj);
                    }
                };
            }

            @Override // X.AbstractC1361480lX8, X.AbstractC1361510lXB
            public final /* bridge */ /* synthetic */ InterfaceC1361520lXC LIZJ(Aweme aweme) {
                return LJI();
            }

            @Override // X.AbstractC1361510lXB
            public final String LIZIZ(Aweme aweme, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(aweme.getAid());
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }
}
