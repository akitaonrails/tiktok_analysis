package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.05KW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05KW implements InterfaceC1329405Ie<InterfaceC1329505If> {
    public final C1334805Kg LIZ;
    public boolean LJ;
    public final Set<String> LIZIZ = new LinkedHashSet();
    public final Set<String> LIZJ = new LinkedHashSet();
    public final C1DEV LIZLLL = C2191201ApK.LIZ();
    public final C054G LJFF = C2296808zG.LIZ(C0PEM.LIZJ);
    public final String LJI = "user";

    @Override // X.InterfaceC1329405Ie
    public final void release() {
    }

    @Override // X.InterfaceC1329405Ie
    public final void reset() {
    }

    @Override // X.InterfaceC1329405Ie
    public final String LIZIZ() {
        return this.LJI;
    }

    public C05KW(C1334805Kg c1334805Kg) {
        this.LIZ = c1334805Kg;
    }

    @Override // X.InterfaceC1329405Ie
    public final void LIZ(List<? extends InterfaceC1329505If> list) {
        C23250099c.LIZLLL(this.LJFF, null, null, new C05KS(this, list, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee A[Catch: Exception -> 0x0136, TryCatch #2 {Exception -> 0x0136, blocks: (B:38:0x00da, B:39:0x00dd, B:40:0x00e8, B:42:0x00ee, B:44:0x00fa, B:45:0x00fe, B:46:0x0106, B:48:0x010c, B:50:0x0114, B:51:0x0118, B:52:0x0120, B:54:0x0126, B:56:0x012e, B:57:0x0132), top: B:76:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c A[Catch: Exception -> 0x0136, TryCatch #2 {Exception -> 0x0136, blocks: (B:38:0x00da, B:39:0x00dd, B:40:0x00e8, B:42:0x00ee, B:44:0x00fa, B:45:0x00fe, B:46:0x0106, B:48:0x010c, B:50:0x0114, B:51:0x0118, B:52:0x0120, B:54:0x0126, B:56:0x012e, B:57:0x0132), top: B:76:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126 A[Catch: Exception -> 0x0136, TryCatch #2 {Exception -> 0x0136, blocks: (B:38:0x00da, B:39:0x00dd, B:40:0x00e8, B:42:0x00ee, B:44:0x00fa, B:45:0x00fe, B:46:0x0106, B:48:0x010c, B:50:0x0114, B:51:0x0118, B:52:0x0120, B:54:0x0126, B:56:0x012e, B:57:0x0132), top: B:76:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05KW.LIZJ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1329405Ie
    public final void LJJIIJ(String str) {
        C23250099c.LIZLLL(this.LJFF, null, null, new C05KT(this, str, null), 3);
    }

    public static void LIZLLL(List list, Set set, IIMPreloadService iIMPreloadService) {
        UrlModel displayAvatar;
        List<String> urlList;
        Object objLJJJLL;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BaseContact baseContact = (BaseContact) it2.next();
            String uid = baseContact.getUid();
            if (uid != null && set.contains(uid) && (displayAvatar = baseContact.getDisplayAvatar()) != null && (urlList = displayAvatar.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                arrayList.add(new C048000Fi(uid, C2097608Jq.LJIIIIZZ(new Pair("URL", objLJJJLL), new Pair("CACHE_SPACE", C06TB.DM_AVATAR.getSpace()))));
            }
        }
        if ((!arrayList.isEmpty()) && iIMPreloadService != null && iIMPreloadService.LIZ() != null) {
            C1329305Id.LIZJ(arrayList);
        }
    }
}
