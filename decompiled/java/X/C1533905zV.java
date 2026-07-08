package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.newselector.repository.RelatedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.05zV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1533905zV implements InterfaceC908170Zjz {
    public static final C1533905zV LLILZIL = new C1533905zV(0);
    public static final C054G LLILZLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final C1231704rr LL;
    public final Keva LLILLJJLI;
    public AnonymousClass0956 LLILLL;
    public final Map<String, List<RelatedFriendStruct>> LLILZ;

    public final C1533705zT LIZJ() {
        try {
            Object object = new ObjectInputStream(new ByteArrayInputStream(this.LLILLJJLI.getBytes(LIZLLL(), new byte[0]))).readObject();
            if (object instanceof C1533705zT) {
                return (C1533705zT) object;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("related_friends_data_");
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1533905zV(int i) {
        C1231704rr c1231704rr = new C1231704rr("RelatedFriendsDataMgr", null, 6);
        Keva repo = Keva.getRepo("im_group_chat_related_friends");
        this.LL = c1231704rr;
        this.LLILLJJLI = repo;
        this.LLILZ = new LinkedHashMap();
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f0 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:49:0x00f7
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<java.lang.String> r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533905zV.LIZIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 3) {
            ((LinkedHashMap) this.LLILZ).clear();
        }
    }
}
