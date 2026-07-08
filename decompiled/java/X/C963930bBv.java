package X;

import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostAuxStreamSwitchListFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS629S0100000_15;
import tikcast.linkmic.common.CohostStreamConfig;

/* JADX INFO: renamed from: X.0bBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963930bBv extends AbstractC963920bBu {
    public C963930bBv(MultiCoHostAuxStreamSwitchListFragment multiCoHostAuxStreamSwitchListFragment) {
        super(multiCoHostAuxStreamSwitchListFragment);
        C915980Zwa.LJII().LLLJIL(C954930axP.class, new AwS629S0100000_15(this, 9));
    }

    public static List LJIIJ(C954930axP c954930axP) {
        String str;
        List<C954460awe> list = c954930axP.LIZ;
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : list) {
            CohostStreamConfig cohostStreamConfig = c954460awe.LJJI;
            if (cohostStreamConfig != null) {
                str = cohostStreamConfig.screenShareStreamId;
            } else {
                str = null;
            }
            if (C500260Jjc.LJJIIZ(str)) {
                arrayList.add(c954460awe);
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC963920bBu
    public final void LJIIIZ(long j, long j2) {
        if (j != 0 && j2 != 0) {
            C915980Zwa.LJII().LLLILZ(j, j2);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("replaceAuxStream");
        sbLIZ.append(", get StreamId failed, userList = ");
        sbLIZ.append(C915980Zwa.LJII().LJIJJ());
        C20441214yg.LJ("MultiCoHostAuxStreamSwitchListPresenter", C2188811AlT.LIZIZ(sbLIZ));
    }
}
