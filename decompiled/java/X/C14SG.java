package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* JADX INFO: renamed from: X.14SG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14SG<T> implements C0XIL<T> {
    public static final Gson LIZIZ;
    public final Class<T> LIZ;

    static {
        e eVarLIZIZ = JsonParseUtils.LIZIZ();
        eVarLIZIZ.LIZLLL(new MusicTypeAdapterFactory());
        eVarLIZIZ.LIZLLL(new UserTypeAdapterFactory());
        if (C298410Bmp.LIZ()) {
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi(IUnKnownOwnershipBusinessOuterService.class);
            if (iUnKnownOwnershipBusinessOuterService != null) {
                eVarLIZIZ.LIZLLL(iUnKnownOwnershipBusinessOuterService.LJIJ());
            }
            C0O5Y.LIZ.getClass();
            C0O5Y.LIZJ = true;
        }
        LIZIZ = eVarLIZIZ.LIZ();
    }

    public C14SG(Class<T> cls) {
        this.LIZ = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, X.08Uu, com.ss.android.ugc.aweme.base.api.BaseResponse] */
    @Override // X.C0XIL
    public final T LIZ(Object obj) {
        BaseResponse.class.isAssignableFrom(this.LIZ);
        try {
            T t = (T) LIZIZ.LJII(obj.toString(), this.LIZ);
            if (t instanceof BaseResponse) {
                try {
                    ?? r1 = (T) ((BaseResponse) t);
                    r1.checkValid();
                    return r1;
                } catch (C0XIR e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw new C23112093u(-1, th);
                }
            }
            return t;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            throw new C0XIO(th2);
        }
    }
}
