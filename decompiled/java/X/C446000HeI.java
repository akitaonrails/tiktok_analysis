package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446000HeI extends FrameLayout {
    public final int LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    private final C430200Gtu getDualAvatarView() {
        return (C430200Gtu) this.LLILLL.getValue();
    }

    private final C427660Gpo getSingleAvatarView() {
        return (C427660Gpo) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAvatars(java.util.List<? extends com.bytedance.android.live.base.model.ImageModel> r7) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C446000HeI.setAvatars(java.util.List):void");
    }

    public C446000HeI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = 36;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 3));
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 2));
        setClipChildren(false);
        setClipToPadding(false);
        addView(getSingleAvatarView(), new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ, 17));
        addView(getDualAvatarView(), new FrameLayout.LayoutParams(iLIZIZ2, iLIZIZ2, 17));
        C427660Gpo singleAvatarView = getSingleAvatarView();
        if ((singleAvatarView instanceof View) && singleAvatarView != null) {
            C500260Jjc.LJLJLJ(singleAvatarView, false);
        }
        C500260Jjc.LJLJLJ(getDualAvatarView(), false);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }
}
