package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381810m3v extends AbstractC1368180lhw {
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C1382380m4q LLJJIJI;
    public final List<String> LLJJIJIIJIL;
    public final List<IMContact> LLJJIJIL;
    public final C1382380m4q LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C1382300m4i<IMContact> LLJJJJJIL;
    public C1382250m4d<IMContact> LLJJJJLIIL;

    @Override // X.AbstractC1381820m3w
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC1381820m3w
    public final C1381890m43 LIZ() {
        if (!((PrivacySettingsFeature) this.LLILZ.getValue()).LJIJ()) {
            return new C1381890m43(this.LL);
        }
        final C1368260li4 c1368260li4 = this.LL;
        return new C1381890m43(c1368260li4) { // from class: X.05qc
            public static final /* synthetic */ int LJFF = 0;
            public final C1381950m49 LIZLLL;
            public final C01GW LJ;

            {
                super(c1368260li4);
                this.LIZLLL = new C1381950m49(c1368260li4);
                this.LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(78));
            }

            @Override // X.C1381890m43
            public final boolean LIZ(IMContact iMContact) {
                if ((iMContact instanceof IMUser) && ((List) this.LJ.getValue()).contains(iMContact.getUid())) {
                    if (((IMUser) iMContact).getShareStatus() == 2) {
                        return false;
                    }
                    return true;
                }
                if (!this.LIZLLL.LIZ(iMContact)) {
                    return false;
                }
                return super.LIZ(iMContact);
            }
        };
    }

    @Override // X.AbstractC1381820m3w
    public final C1382250m4d LJI() {
        C1382250m4d<IMContact> c1382250m4d = this.LLJJJJLIIL;
        if (c1382250m4d != null) {
            return c1382250m4d;
        }
        C1382120m4Q c1382120m4Q = new C1382120m4Q();
        c1382120m4Q.LIZ.LIZIZ = this.LLJJJJJIL;
        c1382120m4Q.LIZ.LIZLLL = new C1381800m3u(this);
        C1381970m4B c1381970m4B = new C1381970m4B(this);
        C1382250m4d c1382250m4d2 = c1382120m4Q.LIZ;
        c1382250m4d2.LJ = c1381970m4B;
        c1382250m4d2.LIZ = this;
        this.LLJJJJLIIL = c1382250m4d2;
        return c1382250m4d2;
    }

    public final List<Integer> LJIIL() {
        return (List) this.LLJJI.getValue();
    }

    public final List<String> LJIILIIL() {
        return (List) this.LLJJIII.getValue();
    }

    public final boolean LJIILJJIL() {
        return (Intrinsics.LJFF(this.LL.LIZJ, Boolean.TRUE) && Intrinsics.LJFF(this.LL.LIZLLL, "aweme")) || this.LL.LJIJJ;
    }

    @Override // X.AbstractC1381820m3w, X.InterfaceC1369300ljk
    public final void LIZLLL() {
        LJIILIIL().clear();
        LJIIL().clear();
        super.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1381810m3v(X.C1368260li4 r9) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1381810m3v.<init>(X.0li4):void");
    }

    public static List LJIILLIIL(List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IMUser iMUser = (IMUser) ListProtector.get(list, i2);
            if (iMUser.getFollowStatus() == 2) {
                IMUser iMUserClone = iMUser.clone();
                if (arrayList.isEmpty()) {
                    iMUserClone.setType(5);
                } else {
                    iMUserClone.setType(6);
                }
                arrayList.add(iMUserClone);
            }
            if (i2 == 0) {
                i = 3;
            } else {
                i = 0;
            }
            iMUser.setType(i);
        }
        return arrayList;
    }

    public final void LJIIZILJ(List<IMContact> list) {
        String str;
        int size = list.size();
        String str2 = null;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String initialLetter = ((IMUser) ListProtector.get(list, i2)).getInitialLetter();
            if (!TextUtils.isEmpty(initialLetter)) {
                if (str2 != null && !TextUtils.equals(initialLetter, str2)) {
                    LJIILIIL().add(str2);
                    LJIIL().add(Integer.valueOf(i));
                    i = 1;
                } else {
                    i++;
                }
                if (i2 == list.size() - 1) {
                    List<String> listLJIILIIL = LJIILIIL();
                    if (initialLetter == null) {
                        str = "";
                    } else {
                        str = initialLetter;
                    }
                    listLJIILIIL.add(str);
                    LJIIL().add(Integer.valueOf(i));
                }
                str2 = initialLetter;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r6, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1381980m4C
            if (r0 == 0) goto L40
            r4 = r7
            X.0m4C r4 = (X.C1381980m4C) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L46
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            X.0li4 r0 = r5.LL
            java.lang.String r1 = r0.LJIJJLI
            if (r1 == 0) goto L4e
            int r0 = r1.length()
            if (r0 == 0) goto L4e
            X.0m4v r0 = new X.0m4v
            r0.<init>(r1)
            r4.LLILLL = r2
            java.lang.Object r1 = r0.LIZ(r6, r4)
            if (r1 != r3) goto L22
            return r3
        L40:
            X.0m4C r4 = new X.0m4C
            r4.<init>(r5, r7)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1381810m3v.LJIIJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[PHI: r1
      0x002f: PHI (r1v42 java.lang.Object) = (r1v10 java.lang.Object), (r1v0 java.lang.Object) binds: [B:244:0x04a9, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0358 A[LOOP:10: B:170:0x0352->B:172:0x0358, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203  */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v0, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v19, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r18, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact>> r19) {
        /*
            Method dump skipped, instruction units count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1381810m3v.LJIILL(java.util.List, X.05Vn):java.lang.Object");
    }
}
