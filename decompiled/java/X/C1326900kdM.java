package X;

import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0kdM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326900kdM {
    public static final boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (C289770BXj.LIZ()) {
            InterfaceC1326920kdO interfaceC1326920kdO = (InterfaceC1326920kdO) C1328130kfL.LJIILIIL().LJIIIZ().get(C06TB.DM_AVATAR.getSpace());
            if (interfaceC1326920kdO != null) {
                if (interfaceC1326920kdO.LJII(C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(UriProtector.parse(str)), null))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return C1328130kfL.LJIILIIL().LJIJJ().LJII(C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(UriProtector.parse(str)), null));
    }

    public static final void LIZIZ(C1331670kl3 c1331670kl3) {
        if (C289770BXj.LIZ()) {
            C06TB c06tb = C06TB.DM_AVATAR;
            if (C287740BPo.LIZJ && C1328130kfL.LJIJJLI() && C1328130kfL.LJIILIIL().LJIIIIZZ().containsKey(c06tb.getSpace())) {
                c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3.LJJJJJ = c06tb.getSpace();
                return;
            }
            return;
        }
        C823170WQx<String> c823170WQx = C897770ZJv.LIZ;
        c1331670kl3.LJJIIZ = EnumC714850S2h.SMALL;
    }
}
