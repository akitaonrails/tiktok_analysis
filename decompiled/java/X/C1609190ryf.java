package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Xfermode;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ryf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609190ryf extends View implements InterfaceC1609330ryt {
    public C1609240ryk LL;
    public EnumC1607270rvZ LLILLJJLI;
    public final C01GW LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    private final Integer getDotColor() {
        Integer num;
        Object c098200Yq;
        Integer num2;
        C1609240ryk c1609240ryk = this.LL;
        if (c1609240ryk != null && (num2 = c1609240ryk.LIZ) != null) {
            return num2;
        }
        if (c1609240ryk == null || (num = c1609240ryk.LIZIZ) == null) {
            return null;
        }
        try {
            int iIntValue = num.intValue();
            Integer numLIZJ = C1308910kAL.LIZJ(iIntValue, getContext());
            c098200Yq = Integer.valueOf(numLIZJ != null ? numLIZJ.intValue() : C446980Hfs.LIZ(getContext(), iIntValue));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (Integer) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    private final Paint getPaint() {
        return (Paint) this.LLILLL.getValue();
    }

    public final EnumC1607270rvZ getBusinessTag() {
        return this.LLILLJJLI;
    }

    public final C1609240ryk getUiData() {
        return this.LL;
    }

    public C1609190ryf(Context context) {
        super(context, null, 0);
        this.LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(402));
        this.LLILZ = C418440Gaw.LIZIZ(2);
        this.LLILZIL = getWidth();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Boolean boolValueOf;
        float f = this.LLILZIL * 0.5f;
        C1609240ryk c1609240ryk = this.LL;
        if (c1609240ryk != null) {
            boolValueOf = Boolean.valueOf(c1609240ryk.LJ);
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            getPaint().setXfermode((Xfermode) C418870Gbd.LIZ.getValue());
            canvas.drawCircle(f, f, f, getPaint());
            LIZ(f, f, canvas);
            return;
        }
        LIZ(f, f, canvas);
    }

    @Override // X.InterfaceC1609330ryt
    public void setContainerView(AvatarComponentView avatarComponentView) {
        float fFloatValue;
        Function1<C1608740rxw, Float> function1;
        if (this.LLILZLL != avatarComponentView.getAvatarSizePx()) {
            this.LLILZLL = avatarComponentView.getAvatarSizePx();
            C1608740rxw c1608740rxwLIZ = C1609280ryo.LIZ(avatarComponentView);
            C1609240ryk c1609240ryk = this.LL;
            if (c1609240ryk != null && (function1 = c1609240ryk.LJFF) != null) {
                fFloatValue = function1.invoke(c1608740rxwLIZ).floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            this.LLILZ = fFloatValue;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setContainerView: avatar_size_px = ");
            sbLIZ.append(this.LLILZLL);
            sbLIZ.append(", size_data = ");
            sbLIZ.append(c1608740rxwLIZ);
            sbLIZ.append(", outline = ");
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC1609330ryt
    public void setUIConfig(C1609000ryM c1609000ryM) {
        C1609240ryk c1609240ryk;
        this.LLILLJJLI = c1609000ryM.LIZ;
        InterfaceC1609020ryO interfaceC1609020ryOLIZ = c1609000ryM.LIZJ.LIZ().LIZ();
        if (interfaceC1609020ryOLIZ instanceof C1609240ryk) {
            c1609240ryk = (C1609240ryk) interfaceC1609020ryOLIZ;
        } else {
            c1609240ryk = null;
        }
        this.LL = c1609240ryk;
    }

    public final void LIZ(float f, float f2, Canvas canvas) {
        getPaint().setXfermode(null);
        Integer dotColor = getDotColor();
        if (dotColor != null) {
            getPaint().setColor(dotColor.intValue());
        }
        canvas.drawCircle(f, f2, f - this.LLILZ, getPaint());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILZIL = i;
    }
}
