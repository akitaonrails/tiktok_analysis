package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sharepanel.api.experiment.ForwardLimitSetting;

/* JADX INFO: renamed from: X.0Z7O, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z7O implements InterfaceC883330Yl1 {
    public static final C0Z7O LL;
    public static Keva LLILLJJLI;

    public final synchronized Keva LIZIZ() {
        Keva repo;
        repo = LLILLJJLI;
        if (repo == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("forward_limit_repo");
            String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            sbLIZ.append(curUserId);
            repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            LLILLJJLI = repo;
        }
        return repo;
    }

    static {
        C0Z7O c0z7o = new C0Z7O();
        LL = c0z7o;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        C883250Ykt.LIZIZ(c0z7o);
    }

    public final boolean LIZ(int i, String str) {
        int iLIZIZ = ForwardLimitSetting.LIZIZ(i);
        if (iLIZIZ >= 0) {
            if (iLIZIZ == 0) {
                return false;
            }
            Keva kevaLIZIZ = LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("count");
            sbLIZ.append(str);
            int i2 = kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
            if (i2 != 0) {
                Keva kevaLIZIZ2 = LIZIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("expired_time");
                sbLIZ2.append(str);
                if (kevaLIZIZ2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L) < System.currentTimeMillis()) {
                    Keva kevaLIZIZ3 = LIZIZ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("count");
                    sbLIZ3.append(str);
                    kevaLIZIZ3.storeInt(C2188811AlT.LIZIZ(sbLIZ3), 0);
                } else if (i2 >= iLIZIZ) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC883330Yl1
    public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
        if (enumC883280Ykw != EnumC883280Ykw.UNKNOWN) {
            LLILLJJLI = null;
        }
    }
}
