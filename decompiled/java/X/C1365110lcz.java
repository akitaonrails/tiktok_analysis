package X;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365110lcz {
    public final Context LIZ;
    public final View LIZIZ;
    public SharePackage LIZJ;
    public final BaseContent LIZLLL;
    public final Map<String, String> LJ;
    public final Map<String, String> LJFF;
    public final Map<String, String> LJI;
    public final ShareTextBoxViewModel LJII;
    public final LifecycleOwner LJIIIIZZ;
    public final String LJIIIZ;
    public final View LJIIJ;
    public final EditText LJIIJJI;
    public final TuxTextView LJIIL;
    public final C197039127h LJIILIIL;
    public final RemoteImageView LJIILJJIL;
    public final TuxIconView LJIILL;
    public C1365140ld2 LJIILLIIL;
    public View LJIIZILJ;
    public boolean LJIJ;
    public List<C0I1Z> LJIJI;
    public boolean LJIJJ;
    public final boolean LJIJJLI;
    public final C1402370mb5 LJIL;
    public final ViewGroup LJJ;

    public final void LIZIZ() {
        ArrayList arrayList;
        List listLL;
        C1365140ld2 c1365140ld2 = this.LJIILLIIL;
        int i = c1365140ld2 != null ? c1365140ld2.LIZIZ : 0;
        List<C0I1Z> list = this.LJIJI;
        if (list == null || (listLL = C13LP.LL(list, i)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C0I1Z) it2.next()).LIZ);
            }
        }
        IInternalShareApi.LIZ.getClass();
        InterfaceC1367800lhK interfaceC1367800lhKLIZJ = C1370970lmR.LIZ().LIZJ();
        SharePackage sharePackage = this.LIZJ;
        C1365140ld2 c1365140ld22 = this.LJIILLIIL;
        int i2 = c1365140ld22 != null ? c1365140ld22.LIZIZ : 0;
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(arrayList);
        if (strLJI == null) {
            strLJI = "";
        }
        interfaceC1367800lhKLIZJ.LJJIIZ(sharePackage, i2, null, C2097908Jt.LIZJ(new Pair("reason", strLJI)), C0I0B.LJFF.LIZIZ());
    }

    public static Long LIZLLL(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Long lValueOf = null;
        if (z) {
            return null;
        }
        try {
            lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
            return lValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return lValueOf;
        }
    }

    public final String LIZ(int i) {
        String strLIZ = C1368910lj7.LIZ(i);
        if (strLIZ == null) {
            return this.LIZ.getString(i);
        }
        return strLIZ;
    }

    public final void LIZJ(boolean z) throws Throwable {
        String string;
        ShareTextBoxViewModel shareTextBoxViewModel = this.LJII;
        String string2 = null;
        Editable editableLLJILLL = C2204961BRm.LLJILLL(this.LJIIJJI, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzG3SDhT2DsSx9m1G5IYHvFWqNTg3AHF25Rh5qYck0uetpcfiGdxb6vYMk8fzSktOvb4CmLxw==", null));
        if (editableLLJILLL != null && (string = editableLLJILLL.toString()) != null) {
            string2 = a0.LJLIIIL(string).toString();
        }
        shareTextBoxViewModel.AQ2(string2, this.LIZLLL, this.LJ, this.LJFF, this.LJI, z, new C1236580iHg(this));
        if (Intrinsics.LJFF(this.LJIIIZ, "share_more_panel") || Intrinsics.LJFF(this.LJIIIZ, "more_tiktok_contacts")) {
            IInternalShareApi.LIZ.getClass();
            C1370970lmR.LIZ().LIZIZ().LJJIZ(this.LJII.zQ2());
        }
    }

    public final void LJ(boolean z) {
        boolean z2;
        List<C0I1Z> list;
        InterfaceC1366500lfE interfaceC1366500lfE = C1370370llT.LJIIIIZZ;
        boolean z3 = true;
        if (interfaceC1366500lfE != null && !interfaceC1366500lfE.LJIIJJI(this.LIZJ)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && Intrinsics.LJFF(this.LJIIIZ, "share_more_panel")) {
            C786410Ut5.l(this.LJIILJJIL, 8);
            C786410Ut5.LLLLLLZZ(this.LJIILL, 8);
            C426750GoL.LJIIIZ(this.LJIIJJI, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, false, 27);
        } else {
            IInternalShareApi.LIZ.getClass();
            if (!C1370970lmR.LIZ().LIZIZ().LJIILJJIL(this.LJIILJJIL, this.LJIILL, this.LIZJ)) {
                C786410Ut5.l(this.LJIILJJIL, 8);
                C786410Ut5.LLLLLLZZ(this.LJIILL, 8);
                C426750GoL.LJIIIZ(this.LJIIJJI, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, false, 27);
            }
        }
        String string = this.LIZJ.extras.getString("enter_method");
        if (string == null) {
            string = "";
        }
        boolean z4 = this.LIZJ.extras.getBoolean("key_disable_emoji_panel");
        if (this.LIZJ.LJIILJJIL() && !Intrinsics.LJFF(string, "forward") && !z4) {
            if (!this.LIZJ.extras.getBoolean("comment_direct_share") && !this.LIZJ.extras.getBoolean("show_edit_send_direct_im_share")) {
                z3 = false;
            }
            IInternalShareApi.LIZ.getClass();
            InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
            EditText editText = this.LJIIJJI;
            C1402370mb5 c1402370mb5 = this.LJIL;
            ViewGroup viewGroup = this.LJJ;
            this.LIZJ.extras.getString("share_emoji_list_storage_uid");
            C1365140ld2 c1365140ld2LJ = interfaceC1364710lcLLIZIZ.LJ(editText, c1402370mb5, viewGroup);
            this.LJIILLIIL = c1365140ld2LJ;
            View view = null;
            if (c1365140ld2LJ != null) {
                list = c1365140ld2LJ.LIZJ;
            } else {
                list = null;
            }
            this.LJIJI = list;
            if (c1365140ld2LJ != null) {
                view = c1365140ld2LJ.LIZ;
            }
            this.LJIIZILJ = view;
            this.LJJ.addView(view);
            C786410Ut5.LJLZ(0, this.LJJ);
            if (!z || z3) {
                LIZIZ();
            }
        }
    }

    public C1365110lcz(Context context, View view, SharePackage sharePackage, BaseContent baseContent, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, ShareTextBoxViewModel shareTextBoxViewModel, LifecycleOwner lifecycleOwner, String str) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = sharePackage;
        this.LIZLLL = baseContent;
        this.LJ = map;
        this.LJFF = map2;
        this.LJI = map3;
        this.LJII = shareTextBoxViewModel;
        this.LJIIIIZZ = lifecycleOwner;
        this.LJIIIZ = str;
        view.findViewById(R.id.v1s);
        view.findViewById(R.id.v04);
        view.findViewById(R.id.mew);
        this.LJIIJ = view.findViewById(R.id.moq);
        this.LJIIJJI = (EditText) view.findViewById(R.id.gqg);
        this.LJIIL = (TuxTextView) view.findViewById(R.id.zda);
        this.LJIILIIL = (C197039127h) view.findViewById(R.id.tv_send);
        this.LJIILJJIL = (RemoteImageView) view.findViewById(R.id.ld7);
        this.LJIILL = (TuxIconView) view.findViewById(R.id.k5e);
        this.LJIJ = true;
        this.LJIJJLI = Intrinsics.LJFF(this.LIZJ.itemType, "comment");
        this.LJIL = new C1402370mb5(this, 4);
        this.LJJ = (ViewGroup) view.findViewById(R.id.v03);
    }
}
