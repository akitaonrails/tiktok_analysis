package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1Amn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189631Amn implements Handler.Callback {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                return handleMessage$0(this, message);
            case 1:
                return handleMessage$1(this, message);
            case 2:
                return handleMessage$2(this, message);
            case 3:
                return handleMessage$3(this, message);
            case 4:
                return handleMessage$4(this, message);
            default:
                return false;
        }
    }

    public C2189631Amn(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean handleMessage$0(C2189631Amn c2189631Amn, Message message) {
        C19GN c19gn;
        CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) c2189631Amn.l0;
        copyrightViolationHelper.getClass();
        C1C7U.LIZ("CopyrightViolationHelper@26e1.<init>$2L");
        int i = message.what;
        if (i == 1) {
            C19GN c19gn2 = copyrightViolationHelper.LLILLJJLI;
            if (c19gn2 != null && !c19gn2.isShowing()) {
                C786410Ut5.B4(copyrightViolationHelper.LLILLJJLI);
                return true;
            }
            return false;
        }
        if (i == 2 && (c19gn = copyrightViolationHelper.LLILLL) != null && !c19gn.isShowing()) {
            copyrightViolationHelper.LLIZLLLIL.run();
            return true;
        }
        return false;
    }

    public static final boolean handleMessage$1(C2189631Amn c2189631Amn, Message message) {
        C2186951AiT c2186951AiT;
        int i = message.what;
        if (i == R.id.zxing_prewiew_size_ready) {
            C2186761AiA c2186761AiA = (C2186761AiA) c2189631Amn.l0;
            C2186841AiI c2186841AiI = (C2186841AiI) HandlerHook.getMessageObj(message.obj);
            c2186761AiA.LLJILLL = c2186841AiI;
            C2186841AiI c2186841AiI2 = c2186761AiA.LLJILJILJ;
            if (c2186841AiI2 != null) {
                if (c2186841AiI != null && (c2186951AiT = c2186761AiA.LLJIJIL) != null) {
                    int i2 = c2186841AiI.LL;
                    int i3 = c2186841AiI.LLILLJJLI;
                    int i4 = c2186841AiI2.LL;
                    int i5 = c2186841AiI2.LLILLJJLI;
                    c2186761AiA.LLJJ = c2186951AiT.LIZJ.LIZIZ(c2186841AiI, c2186951AiT.LIZ);
                    Rect rect = new Rect(0, 0, i4, i5);
                    Rect rect2 = c2186761AiA.LLJJ;
                    Rect rect3 = new Rect(rect);
                    rect3.intersect(rect2);
                    if (c2186761AiA.LLJJIJIIJIL != null) {
                        rect3.inset(Math.max(0, (rect3.width() - c2186761AiA.LLJJIJIIJIL.LL) / 2), Math.max(0, (rect3.height() - c2186761AiA.LLJJIJIIJIL.LLILLJJLI) / 2));
                    } else {
                        int iMin = (int) Math.min(((double) rect3.width()) * c2186761AiA.LLJJIJIL, ((double) rect3.height()) * c2186761AiA.LLJJIJIL);
                        rect3.inset(iMin, iMin);
                        if (rect3.height() > rect3.width()) {
                            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                        }
                    }
                    c2186761AiA.LLJJIII = rect3;
                    Rect rect4 = new Rect(c2186761AiA.LLJJIII);
                    Rect rect5 = c2186761AiA.LLJJ;
                    rect4.offset(-rect5.left, -rect5.top);
                    Rect rect6 = new Rect((rect4.left * i2) / c2186761AiA.LLJJ.width(), (rect4.top * i3) / c2186761AiA.LLJJ.height(), (rect4.right * i2) / c2186761AiA.LLJJ.width(), (rect4.bottom * i3) / c2186761AiA.LLJJ.height());
                    c2186761AiA.LLJJIJI = rect6;
                    if (rect6.width() > 0 && c2186761AiA.LLJJIJI.height() > 0) {
                        c2186761AiA.LLJJJJLIIL.LIZJ();
                    } else {
                        c2186761AiA.LLJJIJI = null;
                        c2186761AiA.LLJJIII = null;
                    }
                    c2186761AiA.requestLayout();
                    c2186761AiA.LJFF();
                } else {
                    c2186761AiA.LLJJIJI = null;
                    c2186761AiA.LLJJIII = null;
                    c2186761AiA.LLJJ = null;
                    throw new IllegalStateException("containerSize or previewSize is not set yet");
                }
            }
            return true;
        }
        if (i == R.id.zxing_camera_error) {
            Exception exc = (Exception) HandlerHook.getMessageObj(message.obj);
            C2186761AiA c2186761AiA2 = (C2186761AiA) c2189631Amn.l0;
            if (c2186761AiA2.LL != null) {
                c2186761AiA2.LIZ();
                ((C2186761AiA) c2189631Amn.l0).LLJJJJLIIL.LIZLLL(exc);
            }
        } else if (i == R.id.zxing_camera_closed) {
            ((C2186761AiA) c2189631Amn.l0).LLJJJJLIIL.LJ();
            return false;
        }
        return false;
    }

    public static final boolean handleMessage$2(C2189631Amn c2189631Amn, Message message) {
        if (message.what == 1001) {
            Iterator<InterfaceC21580219cu> it2 = ((C21580119ct) c2189631Amn.l0).LL.iterator();
            while (it2.hasNext()) {
                it2.next().c3();
            }
            return true;
        }
        return true;
    }

    public static final boolean handleMessage$3(C2189631Amn c2189631Amn, Message message) {
        if (message.what == 1) {
            ((C2186801AiE) c2189631Amn.l0).LIZIZ();
            return true;
        }
        return false;
    }

    public static final boolean handleMessage$4(C2189631Amn c2189631Amn, Message message) {
        Message messageObtainMessage;
        BPEAHandler bPEAHandler;
        float f;
        int iLIZ;
        int iLIZ2;
        ActivityC2186501Ahk activityC2186501Ahk;
        int i = message.what;
        if (i == 10001) {
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj != null) {
                C2186601Ahu c2186601Ahu = (C2186601Ahu) messageObj;
                C2186531Ahn c2186531Ahn = (C2186531Ahn) c2189631Amn.l0;
                c2186531Ahn.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start of handleSingleFrame, ");
                sbLIZ.append(c2186601Ahu.LIZJ);
                sbLIZ.append(", ");
                sbLIZ.append(c2186601Ahu.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                if (c2186531Ahn.LIZIZ && c2186531Ahn.LJII != null) {
                    try {
                        if (c2186531Ahn.LJFF && (activityC2186501Ahk = c2186531Ahn.LJII) != null) {
                            activityC2186501Ahk.LLILLL = System.currentTimeMillis();
                        }
                        byte[] bArr = c2186601Ahu.LIZ;
                        if (bArr == null) {
                            c2186531Ahn.LJFF = false;
                            return true;
                        }
                        int i2 = c2186601Ahu.LIZJ;
                        int i3 = c2186601Ahu.LIZIZ;
                        int i4 = c2186601Ahu.LIZLLL;
                        C118300cf c118300cf = new C118300cf();
                        C118300cf c118300cf2 = new C118300cf();
                        int i5 = c2186531Ahn.LJII.getResources().getConfiguration().orientation;
                        int i6 = c2186601Ahu.LIZJ;
                        int i7 = c2186601Ahu.LIZIZ;
                        if (i5 == 1) {
                            f = 90.0f;
                        } else {
                            f = 180.0f;
                        }
                        Bitmap bitmapLIZIZ = C1289680jfK.LIZIZ(bArr, i6, i7, f);
                        C2186581Ahs c2186581Ahs = c2186531Ahn.LJI;
                        if (c2186581Ahs != null) {
                            if (i5 != 1) {
                                iLIZ2 = c2186581Ahs.LIZ(0, i2);
                                iLIZ = c2186531Ahn.LJI.LIZ(1, i3);
                                c118300cf.element = c2186531Ahn.LJI.LIZ(2, i2);
                                c118300cf2.element = c2186531Ahn.LJI.LIZ(3, i3);
                            } else {
                                iLIZ = c2186581Ahs.LIZ(1, i2);
                                iLIZ2 = c2186531Ahn.LJI.LIZ(0, i3);
                                c118300cf.element = c2186531Ahn.LJI.LIZ(2, i3);
                                c118300cf2.element = c2186531Ahn.LJI.LIZ(3, i2);
                            }
                            if (c118300cf.element > i2 || c118300cf2.element > i3) {
                                c118300cf.element = i2;
                                c118300cf2.element = i3;
                            }
                        } else {
                            c118300cf.element = i2;
                            c118300cf2.element = i3;
                            iLIZ = 0;
                            iLIZ2 = 0;
                        }
                        if (i3 * i2 <= bArr.length) {
                            RunnableC823120WQs.LIZIZ(new RunnableC2186701Ai4(c2186531Ahn, bitmapLIZIZ, c2186531Ahn.LJFF, i4, i2, i3, iLIZ2, iLIZ, c118300cf, c118300cf2));
                        }
                    } finally {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                    c2186531Ahn.LJFF = false;
                }
                BPEAHandler bPEAHandler2 = c2186531Ahn.LJ;
                if (bPEAHandler2 != null && (messageObtainMessage = bPEAHandler2.obtainMessage(10002)) != null && (bPEAHandler = c2186531Ahn.LJ) != null) {
                    C786410Ut5.LJLJLJ(bPEAHandler, messageObtainMessage, 1000L);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.pipo.ocr.ocr.view.SourceData");
            }
        } else if (i == 10002) {
            ((C2186531Ahn) c2189631Amn.l0).LIZIZ();
            return true;
        }
        return true;
    }
}
