package X;

import Y.AfS171S0100000_2;
import Y.AfS173S0100000_4;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0Cbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316990Cbh extends AbstractC20610315kr {
    public static final /* synthetic */ int LLJJIJI = 0;
    public AnonymousClass0956 LLJJ;
    public AnonymousClass0956 LLJJI;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(638));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(637));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS548S0100000_4(this, 26));

    @Override // X.AbstractC1906720ziY
    public final AbstractC329610Cw3<?> LJIIJJI() {
        return (AbstractC329610Cw3) this.LLJJIII.getValue();
    }

    public final C099F LJJ() {
        IProfileService iProfileService = (IProfileService) PluggableExtentionKt.pluggableSpi$default(IProfileService.class, false, false, false, 14, null);
        if (iProfileService == null) {
            return null;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        String str = this.LLJI;
        if (str == null) {
            str = "";
        }
        C11NZ<RelationSearchResponse> c11nzQueryRelationSearchList = iProfileService.queryRelationSearchList(3, curUserId, str, 6);
        if (c11nzQueryRelationSearchList == null) {
            return null;
        }
        C11ON c11onLJJJJZI = c11nzQueryRelationSearchList.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0DC1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                ?? LJ;
                long jLongValue;
                int iIntValue;
                Integer num;
                Long l;
                RelationSearchResponse relationSearchResponse = (RelationSearchResponse) obj;
                List list = relationSearchResponse.searchUser;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                List<AliasPermissionUserData> list2 = relationSearchResponse.aliasPermissions;
                if (list2 != null) {
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LJ = new LinkedHashMap(iLIZIZ);
                    for (AliasPermissionUserData aliasPermissionUserData : list2) {
                        Pair pair = new Pair(aliasPermissionUserData.userId, aliasPermissionUserData.aliasPermissionType);
                        LJ.put(pair.getFirst(), pair.getSecond());
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
                IntRange intRangeLJIIIZ = C1697810uHb.LJIIIZ(list);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIIIZ, 10));
                C531650Kt9 it2 = intRangeLJIIIZ.iterator();
                while (it2.LLILLL) {
                    int iNextInt = it2.nextInt();
                    User user = (User) ListProtector.get(list, iNextInt);
                    String strLIZIZ = C1247000iYU.LIZIZ(user);
                    List<Long> list3 = relationSearchResponse.mentionBlockTypes;
                    if (list3 != null && (l = (Long) C13LP.LJJJLZIJ(iNextInt, list3)) != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    List<Integer> list4 = relationSearchResponse.matchBy;
                    if (list4 != null && (num = (Integer) C13LP.LJJJLZIJ(iNextInt, list4)) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer num2 = (Integer) LJ.get(user.getUid());
                    if (num2 != null) {
                        num2.intValue();
                    }
                    arrayList.add(new C316790CbN(strLIZIZ, user, jLongValue, iIntValue));
                }
                return arrayList;
            }
        });
        C099F c099fLIZIZ = C090F.LIZIZ();
        new C11IE(c11onLJJJJZI).LJIIZILJ(new C516201zk(c099fLIZIZ, 19), new AfS171S0100000_2(c099fLIZIZ, 1));
        return c099fLIZIZ;
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        this.LLJ.LIZ(this.LLJIJIL.LJJIFFI().LJIL(300L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZIZ).LJJLL(new AfS173S0100000_4(this, 2), new C09JN() { // from class: X.00OP
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("VideoCaptionMentionRemoteSearchChunk@558a.subscribeToSearch$2");
                C1C7U.LIZIZ("VideoCaptionMentionRemoteSearchChunk@558a.subscribeToSearch$2");
            }
        }));
    }

    public static final String LJJIFFI(C20611415l2 c20611415l2) {
        String str;
        C317510CcX c317510CcX = c20611415l2.LJIJJ;
        if (c317510CcX == null || (str = c317510CcX.LJIIIZ) == null) {
            C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
            User userLIZJ = C20611715l5.LIZJ(c20611415l2);
            c1243240iSQ.getClass();
            String nickname = userLIZJ.getNickname();
            if (nickname == null) {
                return "";
            }
            return nickname;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[Catch: Exception -> 0x02e1, TryCatch #0 {Exception -> 0x02e1, blocks: (B:63:0x012e, B:64:0x0131, B:68:0x0141, B:69:0x0145, B:71:0x014d, B:72:0x015a, B:74:0x0160, B:78:0x0179, B:80:0x0199, B:83:0x01a8, B:84:0x01ac, B:85:0x01b2, B:87:0x01b8, B:89:0x01c2, B:92:0x01c8, B:97:0x01d3, B:99:0x01d7, B:102:0x01e2, B:103:0x01f0, B:104:0x0211, B:106:0x0217, B:107:0x0223, B:108:0x0232, B:110:0x0238, B:112:0x0247, B:113:0x024b, B:114:0x026b, B:116:0x0271, B:117:0x027d, B:119:0x0286, B:120:0x0299, B:122:0x029f, B:123:0x02ae, B:125:0x02b4, B:126:0x02c3, B:128:0x02c9, B:129:0x02d8, B:34:0x009e, B:35:0x00a1, B:37:0x00a5, B:39:0x00aa, B:40:0x00b7, B:42:0x00bd, B:46:0x00d2, B:49:0x00df, B:53:0x00ef, B:54:0x010a, B:57:0x0119, B:18:0x0048, B:21:0x005a, B:26:0x007d, B:29:0x008d, B:31:0x0093, B:38:0x00a8, B:60:0x0123, B:22:0x0067, B:25:0x006e), top: B:134:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d A[Catch: Exception -> 0x02e1, TryCatch #0 {Exception -> 0x02e1, blocks: (B:63:0x012e, B:64:0x0131, B:68:0x0141, B:69:0x0145, B:71:0x014d, B:72:0x015a, B:74:0x0160, B:78:0x0179, B:80:0x0199, B:83:0x01a8, B:84:0x01ac, B:85:0x01b2, B:87:0x01b8, B:89:0x01c2, B:92:0x01c8, B:97:0x01d3, B:99:0x01d7, B:102:0x01e2, B:103:0x01f0, B:104:0x0211, B:106:0x0217, B:107:0x0223, B:108:0x0232, B:110:0x0238, B:112:0x0247, B:113:0x024b, B:114:0x026b, B:116:0x0271, B:117:0x027d, B:119:0x0286, B:120:0x0299, B:122:0x029f, B:123:0x02ae, B:125:0x02b4, B:126:0x02c3, B:128:0x02c9, B:129:0x02d8, B:34:0x009e, B:35:0x00a1, B:37:0x00a5, B:39:0x00aa, B:40:0x00b7, B:42:0x00bd, B:46:0x00d2, B:49:0x00df, B:53:0x00ef, B:54:0x010a, B:57:0x0119, B:18:0x0048, B:21:0x005a, B:26:0x007d, B:29:0x008d, B:31:0x0093, B:38:0x00a8, B:60:0x0123, B:22:0x0067, B:25:0x006e), top: B:134:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(boolean r29, X.AnonymousClass0957<? extends java.util.List<X.C316550Caz>> r30, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Boolean>> r31) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C316990Cbh.LJJI(boolean, X.0957, X.05Vn):java.lang.Object");
    }
}
