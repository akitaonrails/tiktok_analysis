package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0iWB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245570iWB {
    public static final /* synthetic */ C1245570iWB LIZ = new C1245570iWB();
    public static final C1245560iWA LIZIZ = new IIMBulletinBoardService() { // from class: X.0iWA
        @Override // com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService
        public final Object LLZZJLIL(String str, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService
        public final void d0(Aweme aweme, Map<String, String> map) {
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService
        public final boolean e0() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService
        public final boolean f0(String str) {
            if (str == null || !u.LJJIIJZLJL(str, "bulletin", false)) {
                return false;
            }
            return true;
        }
    };
    public static final C01GW<IIMBulletinBoardService> LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(256));

    public static IIMBulletinBoardService LIZ() {
        return LIZJ.getValue();
    }
}
