package X;

import Y.AObserverS226S0100000_24;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent;
import com.ss.android.ugc.aweme.detail.ui.im.IMFirstFrameViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0rwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607720rwI extends C09AY implements InterfaceC2280201EMw<String, Float, Float, Bitmap, Boolean, Boolean, String, Float, Float, Bitmap, Unit> {
    public final /* synthetic */ IMDetailPageComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1607720rwI(IMDetailPageComponent iMDetailPageComponent) {
        super(10);
        this.LL = iMDetailPageComponent;
    }

    public final Object LIZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        String strLJZL;
        boolean z;
        boolean z2;
        Boolean boolValueOf;
        Object c098200Yq;
        String str = (String) obj;
        float fFloatValue = ((Number) obj2).floatValue();
        float fFloatValue2 = ((Number) obj3).floatValue();
        Bitmap bitmap = (Bitmap) obj4;
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
        String str2 = (String) obj7;
        float fFloatValue3 = ((Number) obj8).floatValue();
        float fFloatValue4 = ((Number) obj9).floatValue();
        Bitmap bitmap2 = (Bitmap) obj10;
        if (!zBooleanValue2) {
            str2 = str;
            fFloatValue3 = fFloatValue;
            fFloatValue4 = fFloatValue2;
            bitmap2 = bitmap;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupFakeCoverTransition: consuming isPhoto=");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", isPhotoMode=");
        sbLIZ.append(zBooleanValue2);
        sbLIZ.append(", effectiveUrl=");
        Float fValueOf = null;
        if (str2 != null) {
            strLJZL = C13LN.LJZL(80, str2);
        } else {
            strLJZL = null;
        }
        sbLIZ.append(strLJZL);
        sbLIZ.append(", size=");
        sbLIZ.append(fFloatValue3);
        sbLIZ.append('x');
        sbLIZ.append(fFloatValue4);
        sbLIZ.append(", hasBitmap=");
        boolean z3 = true;
        if (bitmap2 != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", fakeCoverView=");
        if (this.LL.LLLLLILLIL != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        C1607740rwK c1607740rwK = this.LL.LLLLLILLIL;
        if (c1607740rwK != null) {
            C1607740rwK.LIZ(c1607740rwK, str2, fFloatValue3, fFloatValue4, bitmap2, zBooleanValue, zBooleanValue2, 8);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setupFakeCoverTransition: fakeCoverView.isVisible=");
        C1607740rwK c1607740rwK2 = this.LL.LLLLLILLIL;
        if (c1607740rwK2 != null) {
            if (c1607740rwK2.getVisibility() != 0) {
                z3 = false;
            }
            boolValueOf = Boolean.valueOf(z3);
        } else {
            boolValueOf = null;
        }
        sbLIZ2.append(boolValueOf);
        sbLIZ2.append(", alpha=");
        C1607740rwK c1607740rwK3 = this.LL.LLLLLILLIL;
        if (c1607740rwK3 != null) {
            fValueOf = Float.valueOf(c1607740rwK3.getAlpha());
        }
        sbLIZ2.append(fValueOf);
        C2188811AlT.LIZIZ(sbLIZ2);
        C19EG activity = this.LL.getActivity();
        if (activity != null) {
            try {
                c098200Yq = this.LL.getFragment().getViewLifecycleOwner();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Fragment fragment = this.LL.getFragment();
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = fragment;
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) c098200Yq;
            IMFirstFrameViewModel iMFirstFrameViewModel = (IMFirstFrameViewModel) new ViewModelProvider(activity).get(IMFirstFrameViewModel.class);
            iMFirstFrameViewModel.LL.setValue(Boolean.FALSE);
            IMDetailPageComponent iMDetailPageComponent = this.LL;
            iMDetailPageComponent.LLLLLJIL = iMFirstFrameViewModel;
            C1607740rwK c1607740rwK4 = iMDetailPageComponent.LLLLLILLIL;
            if (c1607740rwK4 != null) {
                iMFirstFrameViewModel.LL.observe(lifecycleOwner, new AObserverS226S0100000_24(c1607740rwK4, 23));
            }
        }
        return Unit.LIZ;
    }
}
