package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import java.util.List;
import webcast.api.sub.PrivilegeTag;

/* JADX INFO: renamed from: X.0Jfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497990Jfx extends AbstractC498030Jg1 {
    public final Fragment LL;
    public final TuxTag LLILLJJLI;

    public C497990Jfx(View view, Fragment fragment) {
        super(view);
        this.LL = fragment;
        this.LLILLJJLI = (TuxTag) view.findViewById(R.id.f63);
    }

    @Override // X.AbstractC498030Jg1
    public final void I5(final PrivilegeTag privilegeTag, final List<PrivilegeTag> list) {
        TuxTag tuxTag = this.LLILLJJLI;
        if (tuxTag != null) {
            tuxTag.setText(privilegeTag.text);
        }
        TuxTag tuxTag2 = this.LLILLJJLI;
        if (tuxTag2 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jg0
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view) {
                    Fragment fragment;
                    if (view != null && privilegeTag.category != 6 && (fragment = this.LL) != null && fragment.isAdded()) {
                        C498010Jfz.LIZ(fragment.getParentFragmentManager(), list);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(500L);
                }
            }, tuxTag2);
        }
    }
}
