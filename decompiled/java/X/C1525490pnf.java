package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0pnf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525490pnf implements InterfaceC1525570pnn {
    public final Context LL;
    public final C1525590pnp LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1525510pnh());
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1525520pni());
    public InterfaceC1525900poK LLILZIL;

    @Override // X.InterfaceC1525570pnn
    public final void LJJJIL(final Set<Long> set) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[DataPatchServiceV4] ");
        sbLIZ.append("notify patch ");
        sbLIZ.append(set);
        C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJJZZIII((Handler) this.LLILLL.getValue(), new Runnable() { // from class: X.0pne
            /* JADX WARN: Removed duplicated region for block: B:102:0x0364  */
            /* JADX WARN: Removed duplicated region for block: B:240:0x0667 A[Catch: all -> 0x0c71, TryCatch #12 {all -> 0x0c71, blocks: (B:238:0x0661, B:240:0x0667, B:241:0x0674, B:242:0x067d, B:244:0x0683, B:245:0x0694, B:247:0x069a, B:248:0x06af, B:249:0x06c3, B:251:0x06ca, B:252:0x06e1, B:253:0x06e5, B:255:0x06eb, B:256:0x06fc), top: B:479:0x0661 }] */
            /* JADX WARN: Removed duplicated region for block: B:241:0x0674 A[Catch: all -> 0x0c71, TryCatch #12 {all -> 0x0c71, blocks: (B:238:0x0661, B:240:0x0667, B:241:0x0674, B:242:0x067d, B:244:0x0683, B:245:0x0694, B:247:0x069a, B:248:0x06af, B:249:0x06c3, B:251:0x06ca, B:252:0x06e1, B:253:0x06e5, B:255:0x06eb, B:256:0x06fc), top: B:479:0x0661 }] */
            /* JADX WARN: Removed duplicated region for block: B:266:0x0766 A[Catch: all -> 0x0c6f, TRY_ENTER, TryCatch #10 {all -> 0x0c6f, blocks: (B:267:0x0784, B:275:0x07ef, B:279:0x0818, B:284:0x0831, B:274:0x07db, B:266:0x0766), top: B:477:0x0818 }] */
            /* JADX WARN: Removed duplicated region for block: B:295:0x0883 A[Catch: all -> 0x0a39, TRY_LEAVE, TryCatch #19 {all -> 0x0a39, blocks: (B:293:0x0879, B:295:0x0883), top: B:493:0x0879 }] */
            /* JADX WARN: Removed duplicated region for block: B:321:0x09ad A[Catch: all -> 0x0c6d, TryCatch #8 {all -> 0x0c6d, blocks: (B:296:0x0885, B:298:0x088b, B:300:0x08a7, B:301:0x08c3, B:303:0x08c7, B:305:0x08d0, B:307:0x08de, B:309:0x08e6, B:311:0x0909, B:313:0x092f, B:314:0x093d, B:316:0x0959, B:318:0x0965, B:319:0x0987, B:321:0x09ad, B:322:0x09bc, B:324:0x09c2, B:326:0x09dc, B:328:0x09ea, B:330:0x0a0e, B:332:0x0a1c, B:329:0x0a05, B:333:0x0a21, B:335:0x0a27, B:348:0x0a45, B:349:0x0a53, B:351:0x0a59, B:353:0x0a71, B:355:0x0a7f, B:362:0x0aaa, B:366:0x0ac4, B:367:0x0ad7, B:369:0x0add, B:406:0x0c0d, B:370:0x0b08, B:374:0x0b20, B:376:0x0b2c, B:377:0x0b33, B:379:0x0b39, B:385:0x0b52, B:386:0x0b5a, B:387:0x0b62, B:388:0x0b6a, B:390:0x0b7c, B:391:0x0b81, B:392:0x0b8b, B:394:0x0b91, B:396:0x0b9d, B:398:0x0ba7, B:402:0x0bd6, B:404:0x0bda, B:399:0x0bc8, B:401:0x0bce, B:373:0x0b15, B:365:0x0ab2, B:405:0x0c03, B:358:0x0a9c, B:407:0x0c11), top: B:473:0x0885 }] */
            /* JADX WARN: Removed duplicated region for block: B:324:0x09c2 A[Catch: all -> 0x0c6d, TryCatch #8 {all -> 0x0c6d, blocks: (B:296:0x0885, B:298:0x088b, B:300:0x08a7, B:301:0x08c3, B:303:0x08c7, B:305:0x08d0, B:307:0x08de, B:309:0x08e6, B:311:0x0909, B:313:0x092f, B:314:0x093d, B:316:0x0959, B:318:0x0965, B:319:0x0987, B:321:0x09ad, B:322:0x09bc, B:324:0x09c2, B:326:0x09dc, B:328:0x09ea, B:330:0x0a0e, B:332:0x0a1c, B:329:0x0a05, B:333:0x0a21, B:335:0x0a27, B:348:0x0a45, B:349:0x0a53, B:351:0x0a59, B:353:0x0a71, B:355:0x0a7f, B:362:0x0aaa, B:366:0x0ac4, B:367:0x0ad7, B:369:0x0add, B:406:0x0c0d, B:370:0x0b08, B:374:0x0b20, B:376:0x0b2c, B:377:0x0b33, B:379:0x0b39, B:385:0x0b52, B:386:0x0b5a, B:387:0x0b62, B:388:0x0b6a, B:390:0x0b7c, B:391:0x0b81, B:392:0x0b8b, B:394:0x0b91, B:396:0x0b9d, B:398:0x0ba7, B:402:0x0bd6, B:404:0x0bda, B:399:0x0bc8, B:401:0x0bce, B:373:0x0b15, B:365:0x0ab2, B:405:0x0c03, B:358:0x0a9c, B:407:0x0c11), top: B:473:0x0885 }] */
            /* JADX WARN: Removed duplicated region for block: B:329:0x0a05 A[Catch: all -> 0x0c6d, TryCatch #8 {all -> 0x0c6d, blocks: (B:296:0x0885, B:298:0x088b, B:300:0x08a7, B:301:0x08c3, B:303:0x08c7, B:305:0x08d0, B:307:0x08de, B:309:0x08e6, B:311:0x0909, B:313:0x092f, B:314:0x093d, B:316:0x0959, B:318:0x0965, B:319:0x0987, B:321:0x09ad, B:322:0x09bc, B:324:0x09c2, B:326:0x09dc, B:328:0x09ea, B:330:0x0a0e, B:332:0x0a1c, B:329:0x0a05, B:333:0x0a21, B:335:0x0a27, B:348:0x0a45, B:349:0x0a53, B:351:0x0a59, B:353:0x0a71, B:355:0x0a7f, B:362:0x0aaa, B:366:0x0ac4, B:367:0x0ad7, B:369:0x0add, B:406:0x0c0d, B:370:0x0b08, B:374:0x0b20, B:376:0x0b2c, B:377:0x0b33, B:379:0x0b39, B:385:0x0b52, B:386:0x0b5a, B:387:0x0b62, B:388:0x0b6a, B:390:0x0b7c, B:391:0x0b81, B:392:0x0b8b, B:394:0x0b91, B:396:0x0b9d, B:398:0x0ba7, B:402:0x0bd6, B:404:0x0bda, B:399:0x0bc8, B:401:0x0bce, B:373:0x0b15, B:365:0x0ab2, B:405:0x0c03, B:358:0x0a9c, B:407:0x0c11), top: B:473:0x0885 }] */
            /* JADX WARN: Removed duplicated region for block: B:391:0x0b81 A[Catch: all -> 0x0c6d, TryCatch #8 {all -> 0x0c6d, blocks: (B:296:0x0885, B:298:0x088b, B:300:0x08a7, B:301:0x08c3, B:303:0x08c7, B:305:0x08d0, B:307:0x08de, B:309:0x08e6, B:311:0x0909, B:313:0x092f, B:314:0x093d, B:316:0x0959, B:318:0x0965, B:319:0x0987, B:321:0x09ad, B:322:0x09bc, B:324:0x09c2, B:326:0x09dc, B:328:0x09ea, B:330:0x0a0e, B:332:0x0a1c, B:329:0x0a05, B:333:0x0a21, B:335:0x0a27, B:348:0x0a45, B:349:0x0a53, B:351:0x0a59, B:353:0x0a71, B:355:0x0a7f, B:362:0x0aaa, B:366:0x0ac4, B:367:0x0ad7, B:369:0x0add, B:406:0x0c0d, B:370:0x0b08, B:374:0x0b20, B:376:0x0b2c, B:377:0x0b33, B:379:0x0b39, B:385:0x0b52, B:386:0x0b5a, B:387:0x0b62, B:388:0x0b6a, B:390:0x0b7c, B:391:0x0b81, B:392:0x0b8b, B:394:0x0b91, B:396:0x0b9d, B:398:0x0ba7, B:402:0x0bd6, B:404:0x0bda, B:399:0x0bc8, B:401:0x0bce, B:373:0x0b15, B:365:0x0ab2, B:405:0x0c03, B:358:0x0a9c, B:407:0x0c11), top: B:473:0x0885 }] */
            /* JADX WARN: Removed duplicated region for block: B:425:0x0c5e A[Catch: all -> 0x0c6b, TRY_LEAVE, TryCatch #6 {all -> 0x0c6b, blocks: (B:408:0x0c2d, B:410:0x0c31, B:412:0x0c36, B:414:0x0c3b, B:417:0x0c44, B:424:0x0c53, B:425:0x0c5e), top: B:469:0x0c2d }] */
            /* JADX WARN: Removed duplicated region for block: B:455:0x0d00 A[LOOP:4: B:39:0x00fa->B:455:0x0d00, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:475:0x036d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:520:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:544:0x0cc3 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:561:0x0cbf A[EDGE_INSN: B:561:0x0cbf->B:450:0x0cbf BREAK  A[LOOP:7: B:60:0x01ab->B:563:0x01ab], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:562:0x03b0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:592:0x0a1c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:594:0x083e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:76:0x021e  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x02af  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x02f6  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x02f8 A[Catch: UnsupportedEncodingException -> 0x0c98, TryCatch #31 {UnsupportedEncodingException -> 0x0c98, blocks: (B:88:0x02f2, B:92:0x02fe, B:91:0x02f8), top: B:516:0x02f2 }] */
            /* JADX WARN: Removed duplicated region for block: B:99:0x035d A[Catch: UnsupportedEncodingException -> 0x03d8, TRY_ENTER, TRY_LEAVE, TryCatch #30 {UnsupportedEncodingException -> 0x03d8, blocks: (B:93:0x031c, B:99:0x035d), top: B:514:0x031c }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 3411
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1525480pne.run():void");
            }
        });
    }

    public C1525490pnf(Context context, C1525590pnp c1525590pnp) {
        this.LL = context;
        this.LLILLJJLI = c1525590pnp;
    }

    public final void LJI(List<C0WYW> list, C0WYY c0wyy, C0WYY c0wyy2) {
        String str;
        ArrayList<C0WYW> arrayList = (ArrayList) list;
        for (C0WYW c0wyw : arrayList) {
            if (c0wyw.LJIIIIZZ == EnumC825070WYf.FILE_PATH) {
                try {
                    ((InterfaceC1525530pnj) this.LLILZ.getValue()).LJJIZ(new String(c0wyw.LJ, Charsets.UTF_8));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        if (c0wyy != null) {
            EnumC825070WYf enumC825070WYf = c0wyy.LJIIIIZZ;
            EnumC825070WYf enumC825070WYf2 = EnumC825070WYf.FILE_PATH;
            if (enumC825070WYf == enumC825070WYf2) {
                try {
                    byte[] bArr = c0wyy.LJFF;
                    Charset charset = Charsets.UTF_8;
                    String str2 = new String(bArr, charset);
                    if (c0wyy2.LJIIIIZZ == enumC825070WYf2) {
                        str = new String(c0wyy2.LJFF, charset);
                    } else {
                        str = null;
                    }
                    if (!TextUtils.equals(str, str2)) {
                        ((InterfaceC1525530pnj) this.LLILZ.getValue()).LJJIZ(str2);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
        arrayList.clear();
    }
}
