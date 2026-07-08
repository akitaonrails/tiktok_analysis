package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickEnabledSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickIntervalSetting;

/* JADX INFO: renamed from: X.0ehl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098990ehl {
    public static void LIZ(final View.OnClickListener onClickListener, View view) {
        if (view != null) {
            if (FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue()) {
                final long value = FirstScreenDebounceClickIntervalSetting.INSTANCE.getValue();
                C786410Ut5.I7(new C01DW(value) { // from class: X.0ehn
                    @Override // X.C01DW
                    public final void LIZ(View view2) {
                        onClickListener.onClick(view2);
                    }
                }, view);
            } else {
                C786410Ut5.I7(onClickListener, view);
            }
        }
    }

    public static void LIZIZ(View view, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
        if (view != null) {
            if (FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue()) {
                final long value = FirstScreenDebounceClickIntervalSetting.INSTANCE.getValue();
                C786410Ut5.I7(new C01DW(value) { // from class: X.0ehm
                    @Override // X.C01DW
                    public final void LIZ(View view2) {
                        onClickListener.onClick(view2);
                    }

                    @Override // X.C01DW
                    public final void LIZIZ(View view2) {
                        View.OnClickListener onClickListener3 = onClickListener2;
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(view2);
                        }
                    }
                }, view);
            } else {
                C786410Ut5.I7(onClickListener, view);
            }
        }
    }
}
