package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0V1W, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V1W {
    public final C0V1X LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public Uri LIZLLL;
    public C0V1U LJ;
    public C0V1U LJFF;

    public C0V1W(C0V1X c0v1x) {
        this.LIZ = c0v1x;
    }

    public final void LIZ(int i, String str) {
        AbstractC1541650qDj abstractC1541650qDj;
        String str2;
        String str3;
        Boolean bool;
        if (str != null && str.startsWith("http") && !str.equals(this.LIZJ)) {
            this.LIZJ = str;
            try {
                Uri uri = UriProtector.parse(str);
                this.LIZLLL = uri;
                HashSet<C0V1Z> hashSet = ((C1541620qDg) this.LIZ).LIZ.LJFF;
                if (hashSet != null) {
                    try {
                        Iterator<C0V1Z> it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZ(uri);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786950Utx.LIZ("AddressParam");
                    }
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZLLL, "bdwk_extension");
                if (i == 0) {
                    List<C0V1V> listLIZ = C0V1U.LIZ(0, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    if (this.LJ == null) {
                        this.LJ = new C0V1U();
                    }
                    for (C0V1V c0v1v : (ArrayList) listLIZ) {
                        ((HashMap) this.LJ.LIZ).put(c0v1v.LIZ, c0v1v);
                    }
                }
                if (this.LJ == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("h2 url = ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C786950Utx.LIZ("AddressProcessor");
                    return;
                }
                List<C0V1V> listLIZ2 = C0V1U.LIZ(1, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                C0V1U c0v1u = this.LJFF;
                if (c0v1u == null) {
                    this.LJFF = new C0V1U();
                } else {
                    ((HashMap) c0v1u.LIZ).clear();
                }
                for (C0V1V c0v1v2 : (ArrayList) listLIZ2) {
                    ((HashMap) this.LJFF.LIZ).put(c0v1v2.LIZ, c0v1v2);
                }
                C0V1U c0v1u2 = this.LJFF;
                C0V1U c0v1u3 = this.LJ;
                c0v1u2.getClass();
                for (Map.Entry entry : ((HashMap) c0v1u3.LIZ).entrySet()) {
                    if (!((HashMap) c0v1u2.LIZ).containsKey(entry.getKey())) {
                        ((HashMap) c0v1u2.LIZ).put(entry.getKey(), entry.getValue());
                    }
                }
                C0V1U c0v1u4 = this.LJFF;
                if (c0v1u4 != null && !((HashMap) c0v1u4.LIZ).isEmpty()) {
                    for (C0V1Y c0v1y : ((C1541620qDg) this.LIZ).LIZJ) {
                        if ((c0v1y instanceof AbstractC1541650qDj) && (str2 = (abstractC1541650qDj = (AbstractC1541650qDj) c0v1y).LLILLL) != null) {
                            C0V1V c0v1v3 = (C0V1V) ((HashMap) c0v1u4.LIZ).get(str2);
                            if (c0v1v3 != null && (str3 = c0v1v3.LIZIZ) != null) {
                                if (str3.equals(CardStruct.IStatusCode.DEFAULT) || !str3.equals("1")) {
                                    bool = Boolean.FALSE;
                                } else {
                                    bool = Boolean.TRUE;
                                }
                                abstractC1541650qDj.LLILZ = bool.booleanValue();
                                this.LIZIZ = true;
                            } else {
                                abstractC1541650qDj.LLILZ = abstractC1541650qDj.LLILZIL;
                            }
                        }
                    }
                    return;
                }
                if (this.LIZIZ) {
                    for (C0V1Y c0v1y2 : ((C1541620qDg) this.LIZ).LIZJ) {
                        if (c0v1y2 instanceof AbstractC1541650qDj) {
                            AbstractC1541650qDj abstractC1541650qDj2 = (AbstractC1541650qDj) c0v1y2;
                            if (abstractC1541650qDj2.LLILLL != null) {
                                abstractC1541650qDj2.LLILZ = abstractC1541650qDj2.LLILZIL;
                            }
                        }
                    }
                    this.LIZIZ = false;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("h1 event = ");
                sbLIZ2.append(i);
                sbLIZ2.append(", url = ");
                sbLIZ2.append(str);
                C2188811AlT.LIZIZ(sbLIZ2);
                C786950Utx.LIZ("AddressProcessor");
            }
        }
    }
}
