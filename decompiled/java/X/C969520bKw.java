package X;

import android.graphics.drawable.Drawable;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.linkroom.widget.AudienceBottomLeftLinkWidget;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C969520bKw extends C2217421BqW implements Function1<Integer, Unit> {
    public C969520bKw(Object obj) {
        super(1, obj, AudienceBottomLeftLinkWidget.class, "adjustEnable", "adjustEnable(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int i;
        Drawable drawableMutate;
        int iIntValue = num.intValue();
        AudienceBottomLeftLinkWidget audienceBottomLeftLinkWidget = (AudienceBottomLeftLinkWidget) this.receiver;
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                audienceBottomLeftLinkWidget.getClass();
            } else {
                audienceBottomLeftLinkWidget.x1();
            }
        } else {
            LiveIconView liveIconView = audienceBottomLeftLinkWidget.LLILLJJLI;
            if (liveIconView != null) {
                if (audienceBottomLeftLinkWidget.LL) {
                    i = R.drawable.eo_;
                } else {
                    i = R.drawable.eo8;
                }
                Drawable drawableLIZ = C0UDZ.LIZ(i);
                if (drawableLIZ != null && (drawableMutate = drawableLIZ.mutate()) != null) {
                    drawableMutate.setAlpha(128);
                } else {
                    drawableMutate = null;
                }
                liveIconView.setImageDrawable(new C20743516Fd(drawableMutate));
            }
        }
        return Unit.LIZ;
    }
}
