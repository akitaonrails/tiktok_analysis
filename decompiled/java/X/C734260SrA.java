package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS479S0200000_11;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: renamed from: X.0SrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734260SrA implements InterfaceC1205300hTE {
    public final String LIZ = "homepage_nearby";
    public final WeakReference<Fragment> LIZIZ;
    public final InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> LIZJ;
    public long LIZLLL;
    public long LJ;
    public int LJFF;
    public int LJI;

    @Override // X.InterfaceC1205300hTE
    public final void LIZ(Aweme aweme) {
        Fragment fragment;
        boolean z;
        List arrayList;
        if (aweme == null || (fragment = this.LIZIZ.get()) == null) {
            return;
        }
        int iLIZIZ = C303210BuZ.LIZIZ();
        if (iLIZIZ == 0) {
            z = !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        } else if (iLIZIZ > 0 && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && aweme.getUserDigg() == 0 && C740470T2v.LIZ() >= iLIZIZ) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (z) {
            C735330Sst c735330Sst = new C735330Sst();
            c735330Sst.LIZLLL = this.LIZ;
            c735330Sst.LJJLIIIJLLLLLLLZ = 3;
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            c735330Sst.LJJLIIIJ = aid;
            c735330Sst.LJIJI(aweme);
            c735330Sst.LJJLIIIJJIZ = "click_like";
            c735330Sst.LJJLIIIJL = !C740470T2v.LIZIZ() ? 1 : 0;
            c735330Sst.LJJLIIIJLJLI = 1;
            c735330Sst.LJIILJJIL();
            if (!C740470T2v.LIZIZ()) {
                C740470T2v.LIZJ();
            }
            C0O3D[] c0o3dArr = new C0O3D[1];
            C734270SrB c734270SrB = C734270SrB.LIZIZ;
            Context context = fragment.getContext();
            String str2 = this.LIZ;
            C627150Oin c627150Oin = new C627150Oin();
            String aid2 = aweme.getAid();
            if (aid2 != null) {
                str = aid2;
            }
            C786410Ut5.LJJJI("group_id", str, c627150Oin.LIZ);
            C786410Ut5.LJJJI("author_id", AwemeExtKt.getAuthorUid(aweme), c627150Oin.LIZ);
            c0o3dArr[0] = c734270SrB.LIZ(context, str2, c627150Oin.LIZ, AFwS198S0000000_11.get$arr$(451), AFwS243S0000000_11.get$arr$(742));
            arrayList = C1697810uHb.LJIILJJIL(c0o3dArr);
        } else {
            arrayList = new ArrayList();
        }
        C0OAB.LIZIZ.LIZ(fragment, aweme, arrayList, new AwS447S0200000_11(this, aweme, 22), new AwS479S0200000_11(this, aweme, 2));
    }

    public C734260SrA(WeakReference weakReference, AwS667S0100000_18 awS667S0100000_18) {
        this.LIZIZ = weakReference;
        this.LIZJ = awS667S0100000_18;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    @Override // X.InterfaceC1205300hTE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r3, com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r2 = this;
            r2.LJI = r3
            if (r4 == 0) goto L22
            r4.isLike()
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r4.getStatistics()
            if (r0 == 0) goto L22
            long r0 = r0.getDiggCount()
        L11:
            r2.LIZLLL = r0
            if (r4 == 0) goto L20
            int r0 = r4.getUserDigg()
        L19:
            r2.LJFF = r0
            long r0 = r2.LIZLLL
            r2.LJ = r0
            return
        L20:
            r0 = 0
            goto L19
        L22:
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C734260SrA.LIZIZ(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void LIZJ(Aweme aweme, boolean z, boolean z2) {
        int i;
        long j;
        boolean z3;
        if (aweme == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fake handleDiggClick, isLike = ");
        sbLIZ.append(z);
        sbLIZ.append(", userDigg = ");
        sbLIZ.append(aweme.getUserDigg());
        sbLIZ.append(", isUserClick = ");
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        long j2 = this.LIZLLL;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        this.LIZLLL = j2 + ((long) i);
        if (z) {
            if (this.LJFF == 1) {
                if (this.LJ < 1 && !AwemeExtKt.isDelete(aweme)) {
                    this.LJ = 1L;
                }
                j = this.LJ;
            } else {
                j = 1 + this.LJ;
            }
        } else if (this.LJFF == 1 && !AwemeExtKt.isDelete(aweme)) {
            j = this.LJ - 1;
        } else {
            j = this.LJ;
        }
        InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> interfaceC1631620sYq = this.LIZJ;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        if (j < 0) {
            j = 0;
        }
        AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.getDiggShowScene() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1205150hSz.LIZ.getClass();
        interfaceC1631620sYq.invoke(aid, new C731910SnN(C618720OOo.LIZ(j), z, !z3, true), Boolean.valueOf(z2));
        if (z) {
            if (z2) {
                C1205260hTA c1205260hTA = C1205260hTA.LIZ;
                String strValueOf = String.valueOf(this.LJI);
                c1205260hTA.getClass();
                C1205260hTA.LJI(aweme, strValueOf);
                return;
            }
            return;
        }
        if (!z2) {
            return;
        }
        C1205260hTA c1205260hTA2 = C1205260hTA.LIZ;
        String strValueOf2 = String.valueOf(this.LJI);
        c1205260hTA2.getClass();
        C1205260hTA.LJII(aweme, strValueOf2);
    }
}
