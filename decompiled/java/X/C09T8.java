package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09T8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.audiodownload.manager.TTSStreamManager$init$1", f = "TTSStreamManager.kt", l = {94}, m = "invokeSuspend")
public final class C09T8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09T8(boolean z, InterfaceC1364105Vn<? super C09T8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09T8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0VSJ c0vsj;
        int readHoldCount;
        Unit unit;
        C1C7U.LIZ("TTSStreamManager@c055.init$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C09T7 c09t7 = C09T7.LIZ;
            C09T7.LJ();
            C09T7.LJFF = this.LLILLJJLI;
            C11YP c11yp = C11YP.LIZIZ;
            C201955140j.LIZLLL(c11yp, C09T7.LIZIZ, "initial TextToAudioManager");
            C09TR c09tr = C09T7.LIZJ;
            C09TB c09tb = C09T7.LJIILJJIL;
            boolean z = this.LLILLJJLI;
            this.LL = 1;
            c09tr.getClass();
            C201955140j.LIZLLL(c11yp, "instant_clone_stream", "init stream sdk");
            int i2 = 0;
            if (!c09tr.LJ.compareAndSet(false, true)) {
                C201955140j.LIZLLL(c11yp, "instant_clone_stream", "init stream fail, already init");
                C201955140j.LIZLLL(c11yp, C09TR.LJIILIIL, "has init pre");
                unit = Unit.LIZ;
            } else {
                C201955140j.LIZLLL(c11yp, "instant_clone_stream", "init stream success");
                c09tr.LJI = z;
                String str = C09TR.LJIILIIL;
                C201955140j.LIZLLL(c11yp, str, "initSami start");
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String str2 = c09tr.LIZJ;
                if (str2 != null) {
                    c0vsj = new C0VSJ(str2);
                } else {
                    c0vsj = null;
                }
                if (c0vsj == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("saveDir is error:");
                    sbLIZ.append(c09tr.LIZJ);
                    C201955140j.LJIIIIZZ(c11yp, str, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    if (!c0vsj.exists() || !c0vsj.isDirectory()) {
                        c0vsj.mkdirs();
                    }
                    ReentrantReadWriteLock reentrantReadWriteLock = c09tr.LJIIIIZZ;
                    ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                    } else {
                        readHoldCount = 0;
                    }
                    for (int i3 = 0; i3 < readHoldCount; i3++) {
                        lock.unlock();
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        C11YP c11yp2 = C11YP.LIZIZ;
                        String str3 = C09TR.LJIILIIL;
                        C201955140j.LIZLLL(c11yp2, str3, "real createSamiHandler start");
                        int iLIZLLL = c09tr.LIZLLL(c09tb);
                        C201955140j.LIZLLL(c11yp2, str3, "real createSamiHandler end");
                        while (i2 < readHoldCount) {
                            lock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                        C2376309Sv.LIZ.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("error_code", String.valueOf(iLIZLLL));
                        C20684815ws.LJIILLIIL("streaming_tts_init", linkedHashMap);
                        C11YP c11yp3 = C11YP.LIZIZ;
                        String str4 = C09TR.LJIILIIL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("initSami end, useT = ");
                        sbLIZ2.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
                        sbLIZ2.append("ms, ret = ");
                        sbLIZ2.append(iLIZLLL);
                        C201955140j.LIZLLL(c11yp3, str4, C2188811AlT.LIZIZ(sbLIZ2));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        while (i2 < readHoldCount) {
                            lock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                        throw th;
                    }
                }
                unit = Unit.LIZ;
            }
            if (unit == objLJFF) {
                C1C7U.LIZIZ("TTSStreamManager@c055.init$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TTSStreamManager@c055.init$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
