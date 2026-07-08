package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS114S0101000_6;
import kotlin.jvm.internal.AwS120S1100000_6;
import kotlin.jvm.internal.AwS24S1400000_19;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS92S0201000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment$openSocialAvatarActionSheet$1$1$1", f = "ProfileEditFragment.kt", l = {}, m = "invokeSuspend")
public final class C442930HYl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1255030ilR LL;
    public final /* synthetic */ ProfileEditFragment LLILLJJLI;
    public final /* synthetic */ AvatarComponentView LLILLL;
    public final /* synthetic */ C364901bL LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442930HYl(C1255030ilR c1255030ilR, ProfileEditFragment profileEditFragment, AvatarComponentView avatarComponentView, C364901bL c364901bL, InterfaceC1364105Vn<? super C442930HYl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1255030ilR;
        this.LLILLJJLI = profileEditFragment;
        this.LLILLL = avatarComponentView;
        this.LLILZ = c364901bL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C442930HYl(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FragmentManager parentFragmentManager;
        String str;
        C1C7U.LIZ("ProfileEditFragment@18c.openSocialAvatarActionSheet$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1255030ilR c1255030ilR = this.LL;
        C19EG activity = this.LLILLJJLI.getActivity();
        AvatarComponentView avatarComponentView = this.LLILLL;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        this.LLILLJJLI.getClass();
        ProfileEditFragment.hS();
        C364901bL c364901bL = this.LLILZ;
        C1255650imR c1255650imR = c1255030ilR.LL;
        if (c1255650imR != null && curUser != null) {
            String string = null;
            if (!TextUtils.isEmpty(c1255030ilR.LLILZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("file://");
                sbLIZ.append(c1255030ilR.LLILZ);
                string = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).toString();
            }
            Fragment fragment = c1255650imR.LIZIZ;
            if (fragment != null && fragment.isAdded() && (parentFragmentManager = fragment.getParentFragmentManager()) != null) {
                C437480HDm c437480HDm = C437480HDm.LIZ;
                String uid = curUser.getUid();
                c437480HDm.getClass();
                if (C437480HDm.LIZ(uid)) {
                    str = "view_avatar";
                } else {
                    str = "create_avatar";
                }
                C0HWW.LIZ.getClass();
                C0HWW.LJIILLIIL("show", str);
                C1247530iZL c1247530iZL = new C1247530iZL();
                c1247530iZL.LJI = new AwS585S0100000_6(c364901bL, 279);
                c1247530iZL.LIZIZ(C437510HDp.LIZ(C437510HDp.LIZ, curUser, 0, null, null, null, 30));
                c1247530iZL.LIZ(new AwS120S1100000_6(str, c1255650imR, 5));
                C1247530iZL c1247530iZL2 = new C1247530iZL();
                c1247530iZL2.LIZJ(R.raw.icon_camera);
                c1247530iZL2.LIZIZ(R.string.lem);
                c1247530iZL2.LIZ(new AwS92S0201000_6(c1255650imR, activity, 1));
                C1247530iZL c1247530iZL3 = new C1247530iZL();
                c1247530iZL3.LIZJ(R.raw.icon_image_alt_1);
                c1247530iZL3.LIZIZ(2131833202);
                c1247530iZL3.LIZ(new AwS114S0101000_6(c1255650imR, 3));
                C1247530iZL c1247530iZL4 = new C1247530iZL();
                c1247530iZL4.LIZJ(R.raw.icon_eye);
                c1247530iZL4.LIZIZ(R.string.f5z);
                c1247530iZL4.LIZ(new AwS24S1400000_19(c1255650imR, activity, avatarComponentView, string, curUser, 1));
                List listLJIILJJIL = C1697810uHb.LJIILJJIL(c1247530iZL, c1247530iZL2, c1247530iZL3, c1247530iZL4);
                if (!C0HZE.LIZIZ.LIZJ()) {
                    C19719612Di.LJJIIZ(listLJIILJJIL);
                }
                C1390850mIV c1390850mIV = new C1390850mIV();
                C1247530iZL[] c1247530iZLArr = (C1247530iZL[]) listLJIILJJIL.toArray(new C1247530iZL[0]);
                c1390850mIV.LIZ((C1247530iZL[]) Arrays.copyOf(c1247530iZLArr, c1247530iZLArr.length));
                c1390850mIV.LIZJ().show(parentFragmentManager, "Click Social Avatar Edit Action Sheet");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileEditFragment@18c.openSocialAvatarActionSheet$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
