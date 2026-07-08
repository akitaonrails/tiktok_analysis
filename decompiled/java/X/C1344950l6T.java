package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commentv2.commentlist.CommentApiV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0l6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344950l6T implements C0S28 {
    @Override // X.C0S28
    public final Object LJJIJLIJ(int i, int i2, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        return CommentApiV2.LIZIZ.LJIJI(str, i, i2, interfaceC1364105Vn);
    }

    @Override // X.C0S28
    public final Object LLLIIL(String str, long j, int i, String str2, Aweme aweme, String str3, List list, boolean z, Long l, boolean z2, Integer num, InterfaceC1364105Vn interfaceC1364105Vn) {
        String strLIZIZ;
        String aid;
        User author;
        String strJ3;
        boolean z3;
        Integer numLJ;
        Integer numLJ2;
        Float fLIZLLL;
        String str4;
        int[] iArrLIZ = C422830Gi1.LIZ(100);
        if (iArrLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iArrLIZ[0]);
            sbLIZ.append('_');
            sbLIZ.append(iArrLIZ[1]);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        CommentApiV2 commentApiV2 = CommentApiV2.LIZIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        int iLIZ = C737370SwB.LIZ(str3);
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        int value = C1343890l4l.LIZ(author, str3).getValue();
        try {
            JSONArray jSONArray = new JSONArray((Collection) list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pre_comment_entity_words", jSONArray);
            strJ3 = C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            strJ3 = null;
        }
        if (!C1350950lG9.LIZIZ.LJFF() && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z) {
            numLJ = C2286608xc.LJ(1);
        } else {
            numLJ = null;
        }
        if (z) {
            C23093093b.LIZ.getClass();
            numLJ2 = C2286608xc.LJ(((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getEffectiveConnectionType());
        } else {
            numLJ2 = null;
        }
        if (z) {
            C23093093b.LIZ.getClass();
            fLIZLLL = C2286608xc.LIZLLL(C23093093b.LIZ());
        } else {
            fLIZLLL = null;
        }
        C1346160l8Q c1346160l8Q = C1346170l8R.LIZ;
        if (c1346160l8Q == null || (str4 = c1346160l8Q.LIZIZ) == null) {
            str4 = "";
        }
        String authorUid = null;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C1346170l8R.LIZJ, ",", null, null, 0, null, null, 62);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        return commentApiV2.LJIJJLI(str, j, i, str2, aid, "", iLIZ, strLIZIZ, false, "", value, str3, strJ3, z3, numLJ, numLJ2, fLIZLLL, l, str4, strLJJLIIIJ, num, authorUid, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    @Override // X.C0S28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLJLIL(java.lang.String r25, long r26, int r28, java.lang.String r29, int r30, int r31, com.ss.android.ugc.aweme.feed.model.Aweme r32, java.lang.String r33, java.util.List<java.lang.String> r34, java.lang.String r35, java.lang.Long r36, java.lang.Integer r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, boolean r39, java.lang.Integer r40, boolean r41, java.lang.String r42, java.lang.Long r43, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.comment.model.CommentItemList> r44) {
        /*
            r24 = this;
            r3 = r44
            boolean r0 = r3 instanceof X.C1344960l6U
            if (r0 == 0) goto L59
            r4 = r3
            X.0l6U r4 = (X.C1344960l6U) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L61
            X.C155000ia.LIZIZ(r3)
        L24:
            return r3
        L25:
            X.C155000ia.LIZIZ(r3)
            r23 = r43
            r22 = r42
            r21 = r41
            r20 = r40
            r19 = r39
            r18 = r38
            r17 = r37
            r16 = r36
            r14 = r34
            r13 = r33
            r12 = r32
            r11 = r31
            r10 = r30
            r8 = r28
            r6 = r26
            r5 = r25
            r15 = r35
            r9 = r29
            X.11NZ r0 = X.C1345950l85.LIZ(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.LLILLL = r1
            java.lang.Object r3 = X.C11UD.LIZJ(r0, r4)
            if (r3 != r2) goto L24
            return r2
        L59:
            X.0l6U r4 = new X.0l6U
            r0 = r24
            r4.<init>(r0, r3)
            goto L14
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1344950l6T.LLJLIL(java.lang.String, long, int, java.lang.String, int, int, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.util.List, java.lang.String, java.lang.Long, java.lang.Integer, kotlin.jvm.functions.Function0, boolean, java.lang.Integer, boolean, java.lang.String, java.lang.Long, X.05Vn):java.lang.Object");
    }
}
