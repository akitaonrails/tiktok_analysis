package X;

import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0YHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871560YHa extends C09AY implements Function0<C881620YiG> {
    public final /* synthetic */ C0YHW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C871560YHa(C0YHW c0yhw) {
        super(0);
        this.LL = c0yhw;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0YiG] */
    @Override // kotlin.jvm.functions.Function0
    public final C881620YiG invoke() {
        final C0YJV c0yjv = new C0YJV(this.LL.LJIIL().LIZJ);
        return new InterfaceC881630YiH(c0yjv) { // from class: X.0YiG
            public final InterfaceC881630YiH LIZ;

            @Override // X.InterfaceC881630YiH
            public final C872090YJb LIZ(String str) {
                return this.LIZ.LIZ(str);
            }

            @Override // X.InterfaceC881630YiH
            public final void LIZIZ(Object obj, String str, AwS593S0100000_14 awS593S0100000_14) {
                this.LIZ.LIZIZ(obj, str, awS593S0100000_14);
            }

            @Override // X.InterfaceC881630YiH
            public final Long LIZLLL(long j, String str) {
                return this.LIZ.LIZLLL(j, str);
            }

            @Override // X.InterfaceC881630YiH
            public final void LJ(C878990Ye1 c878990Ye1, Object obj) {
                this.LIZ.LJ(c878990Ye1, obj);
            }

            @Override // X.InterfaceC881630YiH
            public final void LJFF(Function0<Unit> function0) {
                this.LIZ.LJFF(function0);
            }

            @Override // X.InterfaceC881630YiH
            public final void LJI(Object obj) {
                this.LIZ.LJI(obj);
            }

            @Override // X.InterfaceC881630YiH
            public final void LJII(Function0<Unit> function0) {
                this.LIZ.LJII(function0);
            }

            @Override // X.InterfaceC881630YiH
            public final void clear() {
                this.LIZ.clear();
            }

            {
                this.LIZ = c0yjv;
            }

            @Override // X.InterfaceC881630YiH
            public final void LIZJ(String str, boolean z, List list) {
                if (ChatRoomAdaptiveRequestManager.LIZ.LJLJLJ()) {
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    C882690Yjz.LJIIIZ("AdaptiveReadReceiptRepo", "batchFetch intercepted");
                    return;
                }
                this.LIZ.LIZJ(str, z, list);
            }

            @Override // X.InterfaceC881630YiH
            public final void fetch(String str, String str2, boolean z) {
                if (ChatRoomAdaptiveRequestManager.LIZ.LJLJLJ()) {
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    C882690Yjz.LJIIIZ("AdaptiveReadReceiptRepo", "fetch intercepted");
                    return;
                }
                this.LIZ.fetch(str, str2, z);
            }
        };
    }
}
