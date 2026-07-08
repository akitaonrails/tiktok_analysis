package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.ScrollEndEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0ifK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251240ifK extends ScrollView {
    public DataChannel LL;
    public C415700GRs LLILLJJLI;

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final DataChannel getDataChannel() {
        return this.LL;
    }

    public static C415700GRs LIZ(ViewGroup viewGroup) {
        View view;
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        do {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                view = (View) c09re.next();
                C415700GRs c415700GRs = (C415700GRs) view.findViewWithTag("DottedLineView");
                if (c415700GRs != null) {
                    return c415700GRs;
                }
            } else {
                return null;
            }
        } while (!(view instanceof ViewGroup));
        return LIZ((ViewGroup) view);
    }

    private final void setScrolling(boolean z) {
        if (z) {
            if (this.LLILLJJLI == null) {
                this.LLILLJJLI = LIZ(this);
            }
            C415700GRs c415700GRs = this.LLILLJJLI;
            if (c415700GRs != null) {
                C500260Jjc.LJIILIIL(c415700GRs);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C788530UwV.LIZ("dispatchScrollViewTouchEvent")) {
            C2188191AkT.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getAction() == 1 && motionEvent.getPointerCount() == 1) {
                if (this.LLILLJJLI == null) {
                    this.LLILLJJLI = LIZ(this);
                }
                C415700GRs c415700GRs = this.LLILLJJLI;
                if (c415700GRs != null) {
                    C500260Jjc.LJIILIIL(c415700GRs);
                }
            }
            Integer numValueOf = Integer.valueOf(motionEvent.getAction());
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0 || numValueOf.intValue() == 2) {
                    setScrolling(true);
                } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                    setScrolling(false);
                    DataChannel dataChannel = this.LL;
                    if (dataChannel != null) {
                        dataChannel.FQ2(ScrollEndEvent.class);
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public C1251240ifK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOverScrollMode(2);
    }
}
