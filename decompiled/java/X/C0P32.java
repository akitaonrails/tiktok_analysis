package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0P32, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P32 implements C0P3A {
    public static final C0P32 LLILLJJLI = new C0P32();
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(375));

    public final C0P38 LLJLILLLLZIIL() {
        return (C0P38) this.LL.getValue();
    }

    @Override // X.C0P3A
    public final Object LJJLL(String str) {
        IAwemeService iAwemeService;
        C0P31 c0p31LIZJ = C0P30.LIZ().LIZJ(str);
        if (c0p31LIZJ != null && (iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null)) != null) {
            String strLIZJ = c0p31LIZJ.LIZJ();
            if (strLIZJ.length() == 0) {
                return C13BV.INSTANCE;
            }
            if (C1575980r76.LJI(strLIZJ)) {
                return C13BV.INSTANCE;
            }
            if (!c0p31LIZJ.LJJI(strLIZJ)) {
                return C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            Aweme awemeLLILZ = iAwemeService.LLILZ(strLIZJ);
            if (awemeLLILZ == null) {
                return arrayList;
            }
            arrayList.add(awemeLLILZ);
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.C0P3A
    public final Object LLIIJLIL(String str) {
        List<UrlModel> listLJ;
        C0P31 c0p31LIZJ = LLJLILLLLZIIL().LIZJ(str);
        if (c0p31LIZJ == null || (listLJ = c0p31LIZJ.LJ()) == null) {
            return C13BV.INSTANCE;
        }
        return listLJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[PHI: r14
      0x0096: PHI (r14v2 java.lang.String) = (r14v0 java.lang.String), (r14v4 java.lang.String) binds: [B:34:0x007a, B:32:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    @Override // X.C0P3A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(java.lang.String r19, java.lang.String r20, java.lang.String r21, X.EnumC629350OmL r22, X.EnumC912680ZrG r23, X.InterfaceC1364105Vn<? super java.lang.Integer> r24) {
        /*
            r18 = this;
            r3 = r24
            r10 = r21
            boolean r0 = r3 instanceof X.C0P34
            r7 = r18
            if (r0 == 0) goto Laa
            r4 = r3
            X.0P34 r4 = (X.C0P34) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r4.LLILZ = r2
        L18:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            java.lang.String r2 = ""
            r5 = 1
            if (r0 == 0) goto L51
            if (r0 != r5) goto Lb1
            java.lang.Object r10 = r4.LL
            java.lang.String r10 = (java.lang.String) r10
            X.C155000ia.LIZIZ(r6)
            r1 = 1
        L2f:
            com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItemListResponse r6 = (com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItemListResponse) r6
            r3 = 0
            if (r6 == 0) goto L4c
            boolean r0 = X.C1575980r76.LIZJ(r6)
            if (r0 != r1) goto L4c
            X.0P38 r1 = r7.LLJLILLLLZIIL()
            if (r6 == 0) goto L45
            java.lang.String r0 = r6.feedId
            if (r0 == 0) goto L45
            r2 = r0
        L45:
            boolean r0 = r1.LJII(r10, r2)
            if (r0 == 0) goto L4c
            r3 = 1
        L4c:
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)
            return r0
        L51:
            X.C155000ia.LIZIZ(r6)
            X.0Om2 r0 = X.C629160Om2.LIZ
            r0.getClass()
            boolean r1 = X.C629160Om2.LIZ()
            r13 = r23
            if (r1 == 0) goto L79
            X.0P38 r0 = r7.LLJLILLLLZIIL()
            X.0P31 r0 = r0.LIZJ(r10)
            if (r0 == 0) goto L79
            kotlin.Pair r0 = r0.LJIJJ()
            if (r0 == 0) goto L79
            java.lang.Object r14 = r0.getSecond()
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L96
        L79:
            r14 = r2
            if (r1 != 0) goto L96
            r15 = 15
        L7e:
            X.13BV r11 = X.C13BV.INSTANCE
            r4.LL = r10
            r4.LLILZ = r5
            X.0P35 r16 = X.C0P35.REFRESH
            r1 = 1
            r12 = r22
            r9 = r20
            r8 = r19
            r17 = r4
            java.lang.Object r6 = r7.LJLZ(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r6 != r3) goto L2f
            return r3
        L96:
            boolean r0 = r13.isGroup()
            if (r0 == 0) goto La3
            com.ss.android.ugc.aweme.vibefeed.experiment.SharedFeedDynamicConfig r0 = X.C629160Om2.LIZIZ()
            int r15 = r0.groupPageSize
            goto L7e
        La3:
            com.ss.android.ugc.aweme.vibefeed.experiment.SharedFeedDynamicConfig r0 = X.C629160Om2.LIZIZ()
            int r15 = r0.pageSize
            goto L7e
        Laa:
            X.0P34 r4 = new X.0P34
            r4.<init>(r7, r3)
            goto L18
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0P32.LJJLIIIJILLIZJL(java.lang.String, java.lang.String, java.lang.String, X.0OmL, X.0ZrG, X.05Vn):java.lang.Object");
    }

    @Override // X.C0P3A
    public final Object K(String str, String str2, String str3, List list, EnumC629350OmL enumC629350OmL, EnumC912680ZrG enumC912680ZrG, String str4, int i, C0P35 c0p35, C638600P3a c638600P3a) {
        return C23250099c.LJI(c638600P3a, C0PEM.LIZJ, new C629360OmM(this, str, str2, str3, list, enumC629350OmL, enumC912680ZrG, str4, i, c0p35, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLZ(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.List<java.lang.String> r31, X.EnumC629350OmL r32, X.EnumC912680ZrG r33, java.lang.String r34, int r35, X.C0P35 r36, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItemListResponse> r37) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0P32.LJLZ(java.lang.String, java.lang.String, java.lang.String, java.util.List, X.0OmL, X.0ZrG, java.lang.String, int, X.0P35, X.05Vn):java.lang.Object");
    }
}
