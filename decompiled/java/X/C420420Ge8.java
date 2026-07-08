package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ge8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420420Ge8 extends LinearLayout {
    public LiveRoomStruct LL;
    public C427760Gpy LLILLJJLI;
    public TuxTextView LLILLL;

    public final LiveRoomStruct getLiveRoomStruct() {
        return this.LL;
    }

    public final void setLiveRoomStruct(LiveRoomStruct liveRoomStruct) {
        this.LL = liveRoomStruct;
    }

    public C420420Ge8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(16);
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        setBackground(c384050F3z.LIZ(context));
    }
}
