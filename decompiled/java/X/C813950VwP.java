package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0VwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813950VwP {
    public static Aweme LIZLLL;
    public static final C813950VwP LIZ = new C813950VwP();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("click_push_recommend", "click_push_newvideo", "click_push_commentvideo", "click_push_commentvideo_reply", "click_push_videoat", "click_push_comment", "click_push_duet");
    public static final CopyOnWriteArrayList<String> LIZJ = new CopyOnWriteArrayList<>();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(238));

    public static String LIZIZ() {
        C844470XAv.LIZ.getClass();
        String absolutePath = C786410Ut5.w2(C844470XAv.LIZ()).getAbsolutePath();
        if (absolutePath == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(absolutePath);
        sbLIZ.append(File.separator);
        sbLIZ.append("pushCache");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0VSJ LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ());
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            return null;
        }
        return c0vsj;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0097: MOVE (r5 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:16777367), block:B:30:0x0097 */
    public static Aweme LIZJ(String str) {
        C09CU c09cu;
        Aweme aweme;
        C09CU c09cu2;
        C0VSJ c0vsjLIZ = LIZ(str);
        C09CU c09cu3 = null;
        try {
            try {
                if (c0vsjLIZ == null) {
                    return null;
                }
                try {
                    if (System.currentTimeMillis() - c0vsjLIZ.lastModified() <= 172800000) {
                        c09cu2 = new C09CU(new C0VSF(c0vsjLIZ));
                        try {
                            aweme = (Aweme) C7740030o.LIZ().getGson().LJ(c09cu2, Aweme.class);
                        } catch (Exception e) {
                            e = e;
                            aweme = null;
                        }
                        try {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("get aweme from cache succeed, awemeId: ");
                            sbLIZ.append(aweme.getAid());
                            sbLIZ.append(", desc: ");
                            sbLIZ.append(aweme.getDesc());
                            C2188811AlT.LIZIZ(sbLIZ);
                            c09cu3 = c09cu2;
                        } catch (Exception e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                            C2137908Zd.LIZJ.LIZ(c09cu2);
                        }
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("aweme cache is expired, awemeId: ");
                        sbLIZ2.append(str);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        aweme = null;
                    }
                    C2137908Zd.LIZJ.LIZ(c09cu3);
                } catch (Exception e3) {
                    e = e3;
                    aweme = null;
                    c09cu2 = null;
                }
                LIZJ.remove(str);
                InterfaceC813980VwS interfaceC813980VwS = (InterfaceC813980VwS) LJ.getValue();
                if (interfaceC813980VwS != null) {
                    interfaceC813980VwS.LJ(str);
                }
                try {
                    c0vsjLIZ.delete();
                    return aweme;
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return aweme;
                }
            } catch (Throwable th) {
                th = th;
                c09cu3 = c09cu;
                TryCatchGuardChecker.doCheck(th);
                C2137908Zd.LIZJ.LIZ(c09cu3);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            C2137908Zd.LIZJ.LIZ(c09cu3);
            throw th;
        }
    }

    public static final boolean LIZLLL(String str) {
        try {
            Uri uri = UriProtector.parse(str);
            if (Intrinsics.LJFF(uri.getHost(), "aweme")) {
                if (!C13LP.LJJJJ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label"), LIZIZ)) {
                    if (!a0.LJJIIZI(str, "aweme/push_detail", false)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }
}
