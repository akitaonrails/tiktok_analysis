package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165370gQp implements InterfaceC736910SvR<C1165230gQb> {
    public boolean LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(655));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(656));
    public final List<Aweme> LLILLL = new ArrayList();
    public long LLIZLLLIL = -1;
    public String LLJ = "";
    public final String LLJI = "PLAYLIST_VIDEO_LIST";
    public String LLJIJIL = "";
    public final Set<String> LLJILJIL = new LinkedHashSet();

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final InterfaceC149400hg getOperator() {
        return (C1165230gQb) this.LL.getValue();
    }

    public static void LIZLLL(String str, List list) {
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int i2 = i + 1;
            Aweme aweme = (Aweme) it2.next();
            if (awemeLLILZ != null && Intrinsics.LJFF(aweme.getAid(), awemeLLILZ.getAid())) {
                ListProtector.set(list, i, awemeLLILZ);
            } else {
                Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                if (awemeLLILLL != null) {
                    ListProtector.set(list, i, awemeLLILLL);
                }
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c A[Catch: Exception -> 0x0143, all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:12:0x003e, B:38:0x00e8, B:40:0x012c, B:41:0x012e, B:49:0x0148, B:34:0x00b1, B:35:0x00ca), top: B:58:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r28, X.InterfaceC1364105Vn<? super X.AbstractC1623806Xk<kotlin.Unit>> r29) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1165370gQp.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> LIZIZ(java.lang.String r19, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse r20, int r21, java.lang.Long r22) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1165370gQp.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse, int, java.lang.Long):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c0  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r25, java.lang.String r26, int r27, java.lang.String r28, java.lang.String r29, java.lang.Long r30, java.lang.Integer r31, boolean r32, int r33, boolean r34, X.InterfaceC1364105Vn<? super X.C1165410gQt> r35) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1165370gQp.LIZJ(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, boolean, int, boolean, X.05Vn):java.lang.Object");
    }
}
