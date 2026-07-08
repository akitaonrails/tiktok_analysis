package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.0zHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890020zHc extends AbstractC1870540ymC {
    public static final /* synthetic */ int LJFF = 0;
    public Boolean LIZ;
    public Long LIZIZ;
    public String LIZJ;
    public Long LIZLLL;
    public EnumC992900bwe LJ = EnumC992900bwe.NOT_FOUND;

    @Override // X.AbstractC1870540ymC
    public final List<String> LIZ() {
        return C1697810uHb.LJIIJJI("needUpdate", "totalSize", "version", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "localVersion");
    }
}
