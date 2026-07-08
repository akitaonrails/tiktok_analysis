package X;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.im.core.internal.utils.WeakHandler;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0YIM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public abstract class C0YIM implements InterfaceC864600Xvu, C0YE4 {
    public final WeakHandler LL;
    public final WeakHandler LLILLJJLI;
    public WeakHandler LLILLL;
    public final ConcurrentLinkedQueue<C0YIN> LLILZ = new ConcurrentLinkedQueue<>();
    public long LLILZIL = 0;
    public int LLILZLL = 0;
    public long LLIZ = 0;
    public final C0YEM LLIZLLLIL;

    public abstract String LJIIIIZZ();

    public abstract void LJIIJ(C0YIN c0yin);

    public abstract void LJIIJJI(C0YIN c0yin);

    public void LJFF() {
        this.LLILZ.clear();
    }

    public String LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(" ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC864600Xvu
    public final void clear() {
        LJFF();
        this.LL.removeMessages(101);
        this.LLILLJJLI.removeMessages(102);
        this.LL.removeMessages(103);
        this.LL.removeMessages(105);
    }

    public C0YIM(C0YEM c0yem) {
        Looper looperW2;
        this.LLIZLLLIL = c0yem;
        if (c0yem.LJIIIZ().LJJLIIIJ.LIZJ) {
            looperW2 = Looper.getMainLooper();
        } else {
            HandlerThread handlerThread = new HandlerThread(LJIIIIZZ());
            handlerThread.start();
            looperW2 = C786410Ut5.W2(handlerThread);
        }
        this.LL = new WeakHandler(looperW2, this);
        this.LLILLJJLI = new WeakHandler(looperW2, this);
    }

    @Override // X.InterfaceC864600Xvu
    public final void LIZIZ(Long l) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 106;
        messageObtain.obj = l;
        this.LLILLJJLI.sendMessage(messageObtain);
    }

    @Override // X.InterfaceC864600Xvu
    public final void LIZJ(WeakHandler weakHandler) {
        this.LLILLL = weakHandler;
    }

    @Override // X.InterfaceC864600Xvu
    public final void LIZLLL(List<Long> list) {
        ArrayList<Long> arrayList = (ArrayList) list;
        if (!arrayList.isEmpty() && !this.LLILZ.isEmpty()) {
            for (Long l : arrayList) {
                Iterator<C0YIN> it2 = this.LLILZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C0YIN next = it2.next();
                        if (l.longValue() == next.LL) {
                            next.LLILZ = null;
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC864600Xvu
    public final void LJ(C0YIN c0yin) {
        this.LLIZLLLIL.LJIILIIL().LJ();
        Request request = c0yin.LLILZLL;
        if (request != null && request.cmd.intValue() > C0YMR.IMCMD_NOT_USED.getValue()) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            messageObtain.obj = c0yin;
            this.LL.sendMessage(messageObtain);
            return;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LLIZLLLIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(" send abort, item invalid:");
        sbLIZ.append(c0yin);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C0YIN LJI(long j) {
        for (C0YIN c0yin : this.LLILZ) {
            if (c0yin.LLILZLL != null && c0yin.LL == j) {
                return c0yin;
            }
        }
        return null;
    }

    public void LJIIL(C0YIN c0yin) {
        C868780Y6i c868780Y6iLIZLLL = this.LLIZLLLIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(" handleTimeOut");
        sbLIZ.append(c0yin);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (c0yin != null) {
            c0yin.LJIIL(-1002, "request time out");
            LJIILJJIL(c0yin);
        }
    }

    public void LJIILIIL(C0YIN c0yin) {
        if (this.LLILZ.contains(c0yin)) {
            LJIIZILJ(103, c0yin);
            LJIIZILJ(105, c0yin);
            this.LLILZ.remove(c0yin);
            LJIILJJIL(c0yin);
        }
    }

    public final void LJIILJJIL(C0YIN c0yin) {
        WeakHandler weakHandler = this.LLILLL;
        if (weakHandler != null) {
            Message messageObtain = Message.obtain(weakHandler, c0yin.LJI());
            messageObtain.obj = c0yin;
            this.LLILLL.sendMessage(messageObtain);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0247 A[Catch: 0YIJ -> 0x0254, TryCatch #0 {0YIJ -> 0x0254, blocks: (B:57:0x019f, B:59:0x021a, B:61:0x0226, B:63:0x022c, B:67:0x0247, B:69:0x024b, B:70:0x024d, B:64:0x022f, B:66:0x023d), top: B:79:0x019f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(X.C0YIN r22) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YIM.LJIILLIIL(X.0YIN):void");
    }

    public final void LJIJ(C0YIN c0yin) {
        boolean zLJI = MethodIDManager.LJI(137697);
        C0YLY c0ylyNewBuilder = c0yin.LLILZLL.newBuilder();
        c0ylyNewBuilder.LJIL = Integer.valueOf(c0yin.LLJIJIL + c0yin.LLJILJIL);
        Request requestBuild = c0ylyNewBuilder.build();
        c0yin.LLILZLL = requestBuild;
        Integer num = requestBuild.cmd;
        String str = this.LLIZLLLIL.LJIIIZ().LJI;
        if (str == null) {
            str = "";
        }
        int bizId = this.LLIZLLLIL.getBizId();
        if (num != null) {
            try {
                String strLIZ = C0YMS.LIZ(num.intValue());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(strLIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C0YIW c0yiw = new C0YIW(bizId);
                C0YIS c0yis = c0yiw.LIZ;
                c0yis.LIZ = strLIZIZ;
                c0yis.LIZIZ = strLIZ;
                C0YEM c0yem = this.LLIZLLLIL;
                int iIntValue = num.intValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Start Send Request By HTTP: cmd:");
                sbLIZ2.append(num);
                sbLIZ2.append(", sequenceId=");
                sbLIZ2.append(c0yin.LL);
                sbLIZ2.append(", path=");
                sbLIZ2.append(c0yiw.LIZ.LIZ);
                C0YQL.LIZLLL(c0yem, iIntValue, C2188811AlT.LIZIZ(sbLIZ2), requestBuild);
                if (this.LLIZLLLIL.LJIILL().LIZIZ == 0) {
                    c0yiw.LIZ.LIZJ = "application/x-protobuf";
                    if (this.LLIZLLLIL.LJIIIZ().LJIILIIL == 0) {
                        c0yiw.LIZ.LIZLLL = requestBuild.encode();
                    } else {
                        c0yiw.LIZ.LJ = requestBuild;
                    }
                } else {
                    c0yiw.LIZ.LIZJ = "application/json";
                    if (this.LLIZLLLIL.LJIIIZ().LJIILIIL == 0) {
                        c0yiw.LIZ.LIZLLL = GsonProtectorUtils.toJson(C09EF.LIZ, requestBuild).getBytes();
                    } else {
                        c0yiw.LIZ.LJ = requestBuild;
                    }
                }
                C0YIS c0yis2 = c0yiw.LIZ;
                System.currentTimeMillis();
                C868780Y6i c868780Y6iLIZLLL = this.LLIZLLLIL.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(LJII());
                sbLIZ3.append("httpSend ");
                sbLIZ3.append(c0yin);
                c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
                this.LLIZLLLIL.LJ().LIZ().LJFF(c0yis2, new C0YIL(this, c0yin, c0yis2), false);
                long j = this.LLIZLLLIL.LJIILL().LIZJ.LJ;
                if (j > 0) {
                    LJIIZILJ(105, c0yin);
                    LJIILL(105, c0yin, j);
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C868780Y6i c868780Y6iLIZLLL2 = this.LLIZLLLIL.LIZLLL();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("sendByHttp abort, cmd invalid:");
        sbLIZ4.append(num);
        c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ4));
        c0yin.LJIIL(-1019, "cmd invalid");
        LJIILJJIL(c0yin);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:5|(1:7)(1:27)|8|(1:10)(2:21|(1:23)(2:24|(1:26)(5:130|131|139|132|135)))|(4:12|(4:14|(3:16|(2:18|(1:20)(7:142|40|(9:46|(1:48)(1:78)|49|(1:51)(1:77)|52|(2:54|(2:56|(4:58|(1:60)|62|(2:64|(3:66|(3:69|(3:144|71|72)(1:145)|67)|143)))(1:74))(1:75))(1:76)|61|62|(0))|80|(1:82)(1:90)|83|(7:117|(1:119)|120|(1:122)(1:129)|123|(1:125)(1:128)|126)))|141)|28|(3:30|(2:32|(1:34)(14:146|40|(11:42|44|46|(0)(0)|49|(0)(0)|52|(0)(0)|61|62|(0))|80|(0)(0)|83|(2:85|87)|117|(0)|120|(0)(0)|123|(0)(0)|126))|147))|35|(1:37))|131|139|132|135) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x033e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x033f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        r1.LIZLLL().LJIIIZ("toJson", r2);
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        if (r2 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0171, code lost:
    
        if (r4 == false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b7  */
    @Override // X.C0YE4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMsg(android.os.Message r11) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YIM.handleMsg(android.os.Message):void");
    }

    @Override // X.InterfaceC864600Xvu
    public final void LIZ(Response response, C1164204gy c1164204gy) {
        if (response == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 102;
        messageObtain.obj = new C871830YIb(response, c1164204gy, SystemClock.uptimeMillis());
        messageObtain.arg1 = 1;
        this.LLILLJJLI.sendMessage(messageObtain);
    }

    public final void LJIIIZ(C0YIN c0yin, C0YIX c0yix) {
        if (c0yin.LLILZLL != null) {
            int i = c0yix.LIZ;
            int i2 = 200;
            if (i >= 200 && i < 300) {
                try {
                    Response response = c0yix.LIZJ;
                    if (response != null) {
                        c0yin.LLIZ = response;
                    } else if (c0yin.LLJJIII.LIZIZ == 0) {
                        c0yin.LLIZ = Response.ADAPTER.decode(c0yix.LIZIZ);
                    } else {
                        c0yin.LLIZ = (Response) C09EF.LIZ.LJII(new String(c0yix.LIZIZ), Response.class);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c0yin.LLJJIJI.LJIIIZ("RequestItem setResponse", e);
                }
            }
            if (c0yin.LLIZ == null) {
                C0YON c0yon = new C0YON();
                Request request = c0yin.LLILZLL;
                c0yon.LIZLLL = request.cmd;
                c0yon.LJII = request.inbox_type;
                c0yon.LJI = null;
                c0yon.LJ = Long.valueOf(c0yin.LL);
                int i3 = c0yix.LIZ;
                if (i3 < 200 || i3 >= 300) {
                    i2 = i3;
                }
                c0yon.LJFF = Integer.valueOf(i2);
                c0yin.LLIZ = c0yon.build();
            }
            c0yin.LLJ = c0yix.LIZ;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 102;
        messageObtain.obj = c0yin;
        messageObtain.arg1 = 2;
        this.LLILLJJLI.sendMessage(messageObtain);
    }

    public final void LJIIZILJ(int i, C0YIN c0yin) {
        WeakHandler weakHandler = this.LL;
        if (weakHandler != null && c0yin != null) {
            weakHandler.removeMessages(i, c0yin);
        }
    }

    public final void LJIILL(int i, C0YIN c0yin, long j) {
        WeakHandler weakHandler = this.LL;
        if (weakHandler != null && c0yin != null) {
            if (j < 0) {
                j = 0;
            }
            Message messageObtainMessage = weakHandler.obtainMessage(i);
            messageObtainMessage.obj = c0yin;
            this.LL.sendMessageDelayed(messageObtainMessage, j);
        }
    }
}
