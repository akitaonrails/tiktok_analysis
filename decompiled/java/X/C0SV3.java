package X;

import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.componentmanager.maker.next.service.FcpServiceAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SV3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C0SV3 extends C2217421BqW implements Function0<String> {
    public C0SV3(Object obj) {
        super(0, obj, FcpServiceAssem.class, "getCurrentAwemeId", "getCurrentAwemeId()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Aweme awemeLJIIIIZZ;
        FcpServiceAssem fcpServiceAssem = (FcpServiceAssem) this.receiver;
        MainBusinessAbility mainBusinessAbility = fcpServiceAssem.LLILLL;
        if (mainBusinessAbility == null) {
            synchronized (fcpServiceAssem) {
                mainBusinessAbility = fcpServiceAssem.LLILLL;
                if (mainBusinessAbility == null) {
                    C0QSJ c0qsjLIZLLL = fcpServiceAssem.LLILZIL;
                    if (c0qsjLIZLLL == null) {
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = fcpServiceAssem.LLILZ;
                        if (interfaceC665370Q7zLJIIIZ == null) {
                            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(fcpServiceAssem);
                            fcpServiceAssem.LLILZ = interfaceC665370Q7zLJIIIZ;
                        }
                        c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
                        fcpServiceAssem.LLILZIL = c0qsjLIZLLL;
                    }
                    mainBusinessAbility = c0qsjLIZLLL != null ? (MainBusinessAbility) c0qsjLIZLLL.getAbility(MainBusinessAbility.class) : null;
                    fcpServiceAssem.LLILLL = mainBusinessAbility;
                }
            }
        }
        if (mainBusinessAbility == null || (awemeLJIIIIZZ = mainBusinessAbility.LJIIIIZZ()) == null) {
            return null;
        }
        return awemeLJIIIIZZ.getAid();
    }
}
