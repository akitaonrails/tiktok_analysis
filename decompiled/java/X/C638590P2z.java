package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638590P2z implements InterfaceC586170Myt, C0P38 {
    public static final C01GW<C638590P2z> LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(344));
    public final ConcurrentHashMap<String, C0P31> LL = new ConcurrentHashMap<>();
    public Keva LLILLJJLI;

    public C638590P2z() {
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJIILL(this);
        }
    }

    @Override // X.C0P38
    public final void LIZ(String str) {
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        String strLIZLLL = LIZLLL(str);
        Keva kevaLJIIIIZZ = LJIIIIZZ(strLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vibe_last_show_red_dot_feed_id");
        sbLIZ.append(str);
        kevaLJIIIIZZ.storeString(C2188811AlT.LIZIZ(sbLIZ), strLIZLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    @Override // X.C0P38
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0P31 LIZJ(final java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C638590P2z.LIZJ(java.lang.String):X.0P31");
    }

    @Override // X.C0P38
    public final String LIZLLL(String str) {
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        Keva kevaLJIIIIZZ = LJIIIIZZ(strLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vibe_updated_feed_id");
        sbLIZ.append(str);
        return kevaLJIIIIZZ.getString(C2188811AlT.LIZIZ(sbLIZ), "");
    }

    @Override // X.C0P38
    public final void LJ(C0P31 c0p31) {
        Keva kevaLJIIIIZZ = LJIIIIZZ(c0p31.getUid());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("items_stats_");
        sbLIZ.append(c0p31.getConversationId());
        kevaLJIIIIZZ.storeString(C2188811AlT.LIZIZ(sbLIZ), c0p31.LJIIL());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("history_summary_");
        sbLIZ2.append(c0p31.getConversationId());
        kevaLJIIIIZZ.storeString(C2188811AlT.LIZIZ(sbLIZ2), c0p31.LIZIZ());
    }

    public final Keva LJIIIIZZ(String str) {
        Keva keva = this.LLILLJJLI;
        if (keva == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("vibe_consumed_");
            sbLIZ.append(str);
            Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI = repo;
            return repo;
        }
        return keva;
    }

    @Override // X.C0P38
    public final void LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[clear feed] reason = ");
        sbLIZ.append(str2);
        sbLIZ.append(", conversationId = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C0P31 c0p31LIZJ = LIZJ(str);
        if (c0p31LIZJ == null) {
            return;
        }
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        Keva kevaLJIIIIZZ = LJIIIIZZ(strLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("items_stats_");
        sbLIZ2.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("history_summary_");
        sbLIZ3.append(str);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        kevaLJIIIIZZ.erase(strLIZIZ);
        kevaLJIIIIZZ.erase(strLIZIZ2);
        c0p31LIZJ.clear();
        ConcurrentHashMap<String, C0P31> concurrentHashMap = this.LL;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZ);
        sbLIZ4.append(':');
        sbLIZ4.append(str);
        concurrentHashMap.remove(C2188811AlT.LIZIZ(sbLIZ4));
    }

    @Override // X.C0P38
    public final void LJFF(String str, String str2) {
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        Keva kevaLJIIIIZZ = LJIIIIZZ(strLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vibe_last_consumed_feed_id");
        sbLIZ.append(str);
        kevaLJIIIIZZ.storeString(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    @Override // X.C0P38
    public final void LJI(String str, String str2) {
        if (str2.length() == 0) {
            return;
        }
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        Keva kevaLJIIIIZZ = LJIIIIZZ(strLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vibe_updated_feed_id");
        sbLIZ.append(str);
        kevaLJIIIIZZ.storeString(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    @Override // X.C0P38
    public final boolean LJII(String str, String str2) {
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        Keva kevaLJIIIIZZ = LJIIIIZZ(strLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vibe_last_consumed_feed_id");
        sbLIZ.append(str);
        if (Intrinsics.LJFF(kevaLJIIIIZZ.getString(C2188811AlT.LIZIZ(sbLIZ), ""), str2)) {
            return false;
        }
        if (C1576040r7C.LIZ() && C1576040r7C.LJFF().redDotShowOnlyOnce) {
            String strLIZ2 = C1575440r6E.LIZ();
            if (strLIZ2 == null) {
                strLIZ2 = "";
            }
            Keva kevaLJIIIIZZ2 = LJIIIIZZ(strLIZ2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("vibe_last_show_red_dot_feed_id");
            sbLIZ2.append(str);
            if (Intrinsics.LJFF(kevaLJIIIIZZ2.getString(C2188811AlT.LIZIZ(sbLIZ2), ""), str2)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (!z) {
            return;
        }
        if (i != 2 && i != 3) {
            return;
        }
        this.LL.clear();
        this.LLILLJJLI = null;
    }
}
