package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEditorUgcSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949690aox extends AbstractC960470b6L<C20408214tM> {
    public final InterfaceC937090aUd LL;
    public final LifecycleOwner LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        View view;
        View view2 = this.LLIZ;
        if (view2 != null) {
            C500260Jjc.LJLIIIL(500L, view2, new C949680aow(this));
        }
        View view3 = this.LLILLL;
        if (view3 != null) {
            C500260Jjc.LJLIIIL(500L, view3, new C949710aoz(this));
        }
        View view4 = this.LLILZ;
        if (view4 != null) {
            C500260Jjc.LJLIIIL(500L, view4, new C949660aou(this));
        }
        if (PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
            C500260Jjc.LJLJLJ(this.LLIZ, true);
            C500260Jjc.LJLJLJ(this.LLILLL, false);
            C500260Jjc.LJLJLJ(this.LLILZ, false);
            View view5 = this.LLILZIL;
            if (view5 != null) {
                C500260Jjc.LJLJLJ(view5, true);
            }
            C978360bZC.LJIJJ("playbook_original", "create_entrance", null, "create", null, 48);
            View view6 = this.LLILZIL;
            if (view6 != null) {
                C500260Jjc.LJLIIIL(500L, view6, new C949670aov(this));
            }
            if (C500260Jjc.LJJIJLIJ()) {
                RedDotExtensionKt.LJI(this.LLILZLL, this.LLILLJJLI, null, C0UX6.PLAYBOOK_UGC_ENTRANCE, null);
            }
        } else {
            C500260Jjc.LJLJLJ(this.LLIZ, false);
            C500260Jjc.LJLJLJ(this.LLILLL, true);
            C500260Jjc.LJLJLJ(this.LLILZ, true);
            View view7 = this.LLILZIL;
            if (view7 != null) {
                C500260Jjc.LJLJLJ(view7, false);
            }
        }
        if ((Intrinsics.LJFF(C19263510Xx.LIZIZ(), "ar") || Intrinsics.LJFF(C19263510Xx.LIZIZ(), "AR")) && (view = this.LLILLL) != null) {
            C786410Ut5.Ob(view, -1.0f);
        }
    }

    public C949690aox(View view, InterfaceC937090aUd interfaceC937090aUd, LifecycleOwner lifecycleOwner) {
        super(view);
        this.LL = interfaceC937090aUd;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = view.findViewById(R.id.rgn);
        this.LLILZ = view.findViewById(R.id.rgo);
        this.LLILZIL = view.findViewById(R.id.rgl);
        this.LLILZLL = view.findViewById(R.id.qsw);
        this.LLIZ = view.findViewById(R.id.rgm);
    }
}
