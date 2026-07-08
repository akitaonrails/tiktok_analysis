package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS403S0200000_2;

/* JADX INFO: renamed from: X.06iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1686306iz implements C06OA {
    public final Context LLILLJJLI;
    public final Fragment LLILLL;
    public TuxSheet LLILZ;
    public final /* synthetic */ C06ME LL = new C06ME();
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1192));

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    public final void LIZIZ() {
        Fragment fragment;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        FragmentManager fragmentManagerLJ;
        if (this.LLILLJJLI == null || (fragment = this.LLILLL) == null || (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragment)) == null || (fragmentManagerLJ = abstractC1387200mCcLIZIZ.LJ()) == null || !LIZ()) {
            return;
        }
        C770750ULh c770750ULh = new C770750ULh();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.s5;
        c770750ULh.LIZ = c0hti.LIZ(this.LLILLJJLI);
        c770750ULh.LJ = this.LLILLJJLI.getString(2131847942);
        c770750ULh.LIZLLL = 1;
        c770750ULh.LJ(new C1667580tUq(R.raw.icon_bookmark_collection_fill, null, this.LLILLJJLI.getString(2131847943), C1308910kAL.LIZJ(R.attr.a1k, this.LLILLJJLI), 2), new C1667580tUq(R.raw.icon_person_fill, null, this.LLILLJJLI.getString(2131847944), C1308910kAL.LIZJ(R.attr.a1k, this.LLILLJJLI), 2));
        c770750ULh.LJIILLIIL = true;
        c770750ULh.LJI(this.LLILLJJLI.getString(2131847941), AFwS229S0000000_2.get$arr$(805));
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        DialogInterfaceOnCancelListenerC1767706w7 dialogInterfaceOnCancelListenerC1767706w7 = new DialogInterfaceOnCancelListenerC1767706w7(this, 1);
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        tuxSheet.LL = dialogInterfaceOnCancelListenerC1767706w7;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1767806w8(this, 10);
        this.LLILZ = tuxSheet;
        C2252408s6.LJIIIIZZ(new AwS403S0200000_2(this, fragmentManagerLJ, 75));
        IFavoriteService iFavoriteService = (IFavoriteService) this.LLILZIL.getValue();
        if (iFavoriteService != null) {
            iFavoriteService.LJJIJIIJIL();
        }
    }

    public final boolean LIZ() {
        IFavoriteService iFavoriteService;
        return (!C1171750gb7.LIZ() || (iFavoriteService = (IFavoriteService) this.LLILZIL.getValue()) == null || iFavoriteService.LJJIJLIJ()) ? false : true;
    }

    public C1686306iz(Context context, Fragment fragment) {
        this.LLILLJJLI = context;
        this.LLILLL = fragment;
    }
}
