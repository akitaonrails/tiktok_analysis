package X;

import Y.AObjectS355S0100000_12;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0UrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC785360UrO extends C214906198m {
    public final DataChannel LL;
    public final ViewGroup LLILLJJLI;

    public abstract void LJJIIJ(boolean z);

    public AbstractC785360UrO(Context context, final DataChannel dataChannel, List list) {
        super(context);
        this.LL = dataChannel;
        ViewGroup viewGroup = (ViewGroup) C786410Ut5.Sd(R.layout.g62, C786410Ut5.ne(context), null);
        this.LLILLJJLI = viewGroup;
        setWidth(-1);
        setHeight(-2);
        setContentView(viewGroup);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setWindowLayoutMode(-1, -2);
        setAnimationStyle(R.style.aht);
        EnumC1088870eRR.POPUP.createHolder(dataChannel, (ViewGroup) viewGroup.findViewById(R.id.y6v), list, EnumC1088900eRU.ICON_WITH_TEXT_EFFECT);
        dataChannel.BQ2(dataChannel.LLILZ, DismissToolbarPopEvent.class, new AObjectS355S0100000_12((ViewOnLayoutChangeListenerC769370UFz) this, 10));
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0UrP
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                EnumC1088870eRR.POPUP.release(dataChannel);
            }
        });
    }
}
