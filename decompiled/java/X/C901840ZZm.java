package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.utils.IAccessibilityUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901840ZZm extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C0ZKF LLIZ;

    @Override // android.view.View
    public int getSourceLayoutResId() {
        return R.layout.clw;
    }

    private final IDMAvatarLoader getAvatarLoader() {
        return (IDMAvatarLoader) this.LLILZLL.getValue();
    }

    public final SmartImageView getUnliveAvatarIv() {
        return (SmartImageView) this.LLILZIL.getValue();
    }

    public final C197039127h getUnliveFollowIv() {
        return (C197039127h) this.LLILLL.getValue();
    }

    public final C197039127h getUnliveMoreVideoTv() {
        return (C197039127h) this.LLILZ.getValue();
    }

    public final TuxTextView getUnliveNameTv() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final TuxTextView getUnliveTitleTv() {
        return (TuxTextView) this.LL.getValue();
    }

    public final void h0() {
        C1331070kk5 hierarchy = getUnliveAvatarIv().getHierarchy();
        hierarchy.LJJ(R.drawable.c5w);
        C1331100kk8 c1331100kk8 = hierarchy.LIZJ;
        if (c1331100kk8 != null) {
            c1331100kk8.LIZIZ = true;
            c1331100kk8.LJFF(C418440Gaw.LIZIZ(1));
            c1331100kk8.LJIIIZ(C418440Gaw.LIZIZ(1));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, getContext());
            c1331100kk8.LJFF = numLIZJ != null ? numLIZJ.intValue() : 0;
        }
    }

    public final void e0(String str) {
        if (str == null) {
            h0();
            return;
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(str, null, "im_local_db");
        if (iMUserLJIIL == null) {
            h0();
            return;
        }
        getAvatarLoader().LJ(iMUserLJIIL, this.LLIZ);
        IAccessibilityUtils.LIZ.getClass();
        IAccessibilityUtils iAccessibilityUtilsLIZ = C0I31.LIZ();
        if (iAccessibilityUtilsLIZ == null) {
            return;
        }
        iAccessibilityUtilsLIZ.LIZ(getUnliveAvatarIv(), iMUserLJIIL);
    }

    public C901840ZZm(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        super(context, attributeSet, i);
        this.LL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1325));
        this.LLILLJJLI = C1509305vX.LIZ(new AwS558S0100000_14(this, 1324));
        this.LLILLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1322));
        this.LLILZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 1323));
        this.LLILZIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1321));
        this.LLILZLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1320));
        C20742916Ex.LIZ(context, getSourceLayoutResId(), this, true, -1);
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, 26);
        getUnliveTitleTv().setAutoSizeTextTypeUniformWithConfiguration(12, 14, 2, 1);
        getUnliveNameTv().setAutoSizeTextTypeUniformWithConfiguration(10, 12, 2, 1);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLIZ = new C0ZKF(0, 0, iLIZIZ, iLIZIZ2, iIntValue, (C0ZK1) null, 99);
    }
}
