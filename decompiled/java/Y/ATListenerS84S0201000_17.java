package Y;

import X.C1115580f8W;
import X.C1115590f8X;
import X.InterfaceC1115630f8b;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.base.model.emoji.EmoteModel;

/* JADX INFO: loaded from: classes18.dex */
public class ATListenerS84S0201000_17 implements View.OnTouchListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            default:
                return false;
        }
    }

    public static final boolean onTouch$0(ATListenerS84S0201000_17 aTListenerS84S0201000_17, View view, MotionEvent motionEvent) {
        InterfaceC1115630f8b interfaceC1115630f8b;
        EmoteModel emoteModel = (EmoteModel) aTListenerS84S0201000_17.l0;
        if (emoteModel.readOnly || emoteModel.emoteResource == null || (interfaceC1115630f8b = ((C1115580f8W) aTListenerS84S0201000_17.l1).LLILLJJLI) == null) {
            return false;
        }
        return interfaceC1115630f8b.LLJILJILJ(view, motionEvent, aTListenerS84S0201000_17.i2, emoteModel);
    }

    public static final boolean onTouch$1(ATListenerS84S0201000_17 aTListenerS84S0201000_17, View view, MotionEvent motionEvent) {
        InterfaceC1115630f8b interfaceC1115630f8b;
        C1115590f8X c1115590f8X = (C1115590f8X) aTListenerS84S0201000_17.l0;
        if (!c1115590f8X.LLILZ) {
            return false;
        }
        EmoteModel emoteModel = (EmoteModel) aTListenerS84S0201000_17.l1;
        if (emoteModel.emoteResource == null || (interfaceC1115630f8b = c1115590f8X.LLILLJJLI) == null) {
            return false;
        }
        return interfaceC1115630f8b.LLJILJILJ(view, motionEvent, aTListenerS84S0201000_17.i2, emoteModel);
    }

    public ATListenerS84S0201000_17(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
