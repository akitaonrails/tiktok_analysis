package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142620fq8 extends C09AY implements Function0<C1142570fq3> {
    public final /* synthetic */ C1142590fq5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142620fq8(C1142590fq5 c1142590fq5) {
        super(0);
        this.LL = c1142590fq5;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0fq3] */
    @Override // kotlin.jvm.functions.Function0
    public final C1142570fq3 invoke() {
        final C1142610fq7 c1142610fq7 = this.LL.LIZ;
        return new InterfaceC1097310ef3(c1142610fq7) { // from class: X.0fq3
            public final Function0<PcsApi> LIZ;

            @Override // X.InterfaceC1097310ef3
            public final InterfaceC1121900fIi LJFF() {
                C1142280fpa c1142280fpaLIZIZ = C1142560fq2.LIZIZ(EnumC1142580fq4.GO_LIVE, null);
                if (c1142280fpaLIZIZ instanceof InterfaceC1121900fIi) {
                    return c1142280fpaLIZIZ;
                }
                return null;
            }

            {
                this.LIZ = c1142610fq7;
            }

            @Override // X.InterfaceC1097310ef3
            public final InterfaceC1103440eow LIZIZ(String str) {
                C1142280fpa c1142280fpaLIZIZ = C1142560fq2.LIZIZ(EnumC1142580fq4.AUDIENCE_LIVE, str);
                if (!(c1142280fpaLIZIZ instanceof InterfaceC1103440eow)) {
                    return null;
                }
                return c1142280fpaLIZIZ;
            }

            @Override // X.InterfaceC1097310ef3
            public final InterfaceC1083960eJW LIZJ(String str) {
                C1142280fpa c1142280fpaLIZIZ = C1142560fq2.LIZIZ(EnumC1142580fq4.ANCHOR_LIVE, str);
                if (!(c1142280fpaLIZIZ instanceof InterfaceC1083960eJW)) {
                    return null;
                }
                return c1142280fpaLIZIZ;
            }

            @Override // X.InterfaceC1097310ef3
            public final InterfaceC1121900fIi LIZ(String str, LifecycleCoroutineScope lifecycleCoroutineScope) {
                return C1142560fq2.LIZ(EnumC1142580fq4.GO_LIVE, lifecycleCoroutineScope, this.LIZ.invoke(), str, null);
            }

            @Override // X.InterfaceC1097310ef3
            public final InterfaceC1083960eJW LIZLLL(String str, String str2, C054G c054g) {
                return C1142560fq2.LIZ(EnumC1142580fq4.ANCHOR_LIVE, c054g, this.LIZ.invoke(), str, str2);
            }

            @Override // X.InterfaceC1097310ef3
            public final InterfaceC1103440eow LJ(String str, String str2, InterfaceC497601wk interfaceC497601wk) {
                return C1142560fq2.LIZ(EnumC1142580fq4.AUDIENCE_LIVE, interfaceC497601wk, this.LIZ.invoke(), str, str2);
            }
        };
    }
}
