package X;

import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.List;

/* JADX INFO: renamed from: X.11lL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class ViewOnTouchListenerC19594111lL implements View.OnTouchListener, WeakHandler.IHandler {
    public List<C19595011lU> LL;
    public C705930RmZ LLILLJJLI;
    public final InterfaceC386401eo LLILLL;
    public final InterfaceC19595211lW LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public MotionEvent LLJILJILJ;
    public MotionEvent LLJILLL;
    public int LLJJ;
    public final WeakHandler LLJJI;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Integer numValueOf;
        long jLLL;
        if (message != null && (numValueOf = Integer.valueOf(message.what)) != null && numValueOf.intValue() == 0) {
            InterfaceC19595211lW interfaceC19595211lW = this.LLILZ;
            InterfaceC386401eo interfaceC386401eo = this.LLILLL;
            if (interfaceC386401eo != null) {
                jLLL = interfaceC386401eo.LLL();
            } else {
                jLLL = 0;
            }
            interfaceC19595211lW.LJI((MotionEvent) HandlerHook.getMessageObj(message.obj), jLLL);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        WeakHandler weakHandler;
        Message messageObtainMessage;
        long jLLL;
        long jLLL2;
        InterfaceC19595111lV interfaceC19595111lV;
        WeakHandler weakHandler2;
        Integer numValueOf = null;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        }
        long eventTime = 0;
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                WeakHandler weakHandler3 = this.LLJJI;
                if (weakHandler3 != null && weakHandler3.hasMessages(0) && (weakHandler2 = this.LLJJI) != null) {
                    weakHandler2.removeMessages(0);
                }
                MotionEvent motionEvent2 = this.LLJILJILJ;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.LLJILJILJ = MotionEvent.obtain(motionEvent);
                this.LLJIJIL = true;
                this.LLJI = true;
                this.LLILZIL = motionEvent.getX();
                this.LLILZLL = motionEvent.getY();
                this.LLJJ = -1;
                for (C19595011lU c19595011lU : this.LL) {
                    InterfaceC19594611lQ interfaceC19594611lQ = c19595011lU.LIZJ;
                    InterfaceC386401eo interfaceC386401eo = this.LLILLL;
                    if (interfaceC386401eo != null) {
                        jLLL2 = interfaceC386401eo.LLL();
                    } else {
                        jLLL2 = 0;
                    }
                    if (interfaceC19594611lQ.LJI(motionEvent.getX(), motionEvent.getY(), c19595011lU.LIZJ.getStickerType(), jLLL2)) {
                        this.LLJJ = c19595011lU.LIZJ.getStickerType();
                        C705930RmZ c705930RmZ = this.LLILLJJLI;
                        if (c705930RmZ != null && (interfaceC19595111lV = c705930RmZ.LJIILIIL) != null) {
                            c19595011lU.LIZJ.getStickerType();
                            interfaceC19595111lV.LIZJ();
                        }
                        if (!c19595011lU.LIZJ.LJIIL()) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (numValueOf.intValue() == 2) {
                int x = (int) (motionEvent.getX() - this.LLILZIL);
                int y = (int) (motionEvent.getY() - this.LLILZLL);
                int i = (x * x) + (y * y);
                if (i > this.LLIZLLLIL || Math.abs(x) >= this.LLIZ) {
                    this.LLJIJIL = false;
                    WeakHandler weakHandler4 = this.LLJJI;
                    if (weakHandler4 != null) {
                        weakHandler4.removeMessages(0);
                    }
                }
                if (i > this.LLJ) {
                    this.LLJI = false;
                    return false;
                }
            } else if (numValueOf.intValue() == 1 && this.LLJIJIL) {
                this.LLJILJIL = false;
                MotionEvent motionEvent3 = this.LLJILJILJ;
                MotionEvent motionEvent4 = this.LLJILLL;
                if (motionEvent3 != null && motionEvent4 != null && motionEvent != null && this.LLJI) {
                    long eventTime2 = motionEvent.getEventTime() - motionEvent4.getEventTime();
                    if (eventTime2 <= ViewConfiguration.getDoubleTapTimeout() && eventTime2 >= 40) {
                        int x2 = ((int) motionEvent3.getX()) - ((int) motionEvent.getX());
                        int y2 = ((int) motionEvent3.getY()) - ((int) motionEvent.getY());
                        if ((x2 * x2) + (y2 * y2) < this.LLJ) {
                            this.LLJILJIL = true;
                            InterfaceC19595211lW interfaceC19595211lW = this.LLILZ;
                            InterfaceC386401eo interfaceC386401eo2 = this.LLILLL;
                            if (interfaceC386401eo2 != null) {
                                jLLL = interfaceC386401eo2.LLL();
                            } else {
                                jLLL = 0;
                            }
                            interfaceC19595211lW.LJII(jLLL, this.LLJJ, this.LLJILJILJ);
                        }
                    }
                }
                if (!this.LLJILJIL && this.LLJILJILJ != null && motionEvent != null && this.LLJIJIL && (weakHandler = this.LLJJI) != null && (messageObtainMessage = weakHandler.obtainMessage(0)) != null) {
                    messageObtainMessage.obj = this.LLJILJILJ;
                    WeakHandler weakHandler5 = this.LLJJI;
                    if (weakHandler5 != null) {
                        long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime();
                        MotionEvent motionEvent5 = this.LLJILJILJ;
                        if (motionEvent5 != null) {
                            eventTime = motionEvent5.getEventTime();
                        }
                        weakHandler5.sendMessageDelayed(messageObtainMessage, doubleTapTimeout + eventTime);
                    }
                }
                MotionEvent motionEvent6 = this.LLJILLL;
                if (motionEvent6 != null) {
                    motionEvent6.recycle();
                }
                this.LLJILLL = MotionEvent.obtain(motionEvent);
                return false;
            }
        }
        return false;
    }

    public ViewOnTouchListenerC19594111lL(C19EG c19eg, List list, C705930RmZ c705930RmZ, InterfaceC386401eo interfaceC386401eo, InterfaceC19595211lW interfaceC19595211lW) {
        this.LL = list;
        this.LLILLJJLI = c705930RmZ;
        this.LLILLL = interfaceC386401eo;
        this.LLILZ = interfaceC19595211lW;
        int scaledDoubleTapSlop = ViewConfiguration.get(c19eg).getScaledDoubleTapSlop();
        int scaledTouchSlop = ViewConfiguration.get(c19eg).getScaledTouchSlop() * 3;
        this.LLIZ = scaledTouchSlop;
        this.LLIZLLLIL = scaledTouchSlop * scaledTouchSlop;
        this.LLJ = scaledDoubleTapSlop * scaledDoubleTapSlop;
        this.LLJJ = -1;
        this.LLJJI = new WeakHandler(this);
    }
}
