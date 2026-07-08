package X;

import Y.AObjectS366S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.os.Handler;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0qU2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551760qU2 extends AbstractC1552240qUo<List<UpdatePackage>, UpdatePackage> {
    public static final AtomicInteger LJIIJ = new AtomicInteger(1);
    public static final AtomicInteger LJIIJJI = new AtomicInteger(0);
    public Executor LJI;
    public OptionCheckUpdateParams LJII;
    public C1551680qTu LJIIIIZZ;
    public final CopyOnWriteArrayList<AbstractRunnableC1551740qU0> LJIIIZ = new CopyOnWriteArrayList<>();

    public final void LIZLLL() {
        synchronized (this.LJIIIZ) {
            try {
                if (this.LJIIIZ.isEmpty()) {
                    return;
                }
                Iterator<AbstractRunnableC1551740qU0> it2 = this.LJIIIZ.iterator();
                while (it2.hasNext()) {
                    this.LJI.execute(it2.next());
                }
                this.LJIIIZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC1552240qUo
    public final void LIZIZ(Object... objArr) {
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj instanceof Executor) {
                this.LJI = (Executor) obj;
                Object obj2 = objArr[1];
                if (obj2 == null) {
                    Object pipelineData = this.LJ.getPipelineData("option_params");
                    if (pipelineData instanceof OptionCheckUpdateParams) {
                        this.LJII = (OptionCheckUpdateParams) pipelineData;
                    }
                } else {
                    this.LJII = (OptionCheckUpdateParams) obj2;
                }
            } else {
                throw new IllegalArgumentException("ParallelInterceptor args must be instance of Executor");
            }
        } else {
            this.LJI = C786410Ut5.d4(2);
        }
        Object pipelineData2 = this.LJ.getPipelineData("update_operation");
        if (pipelineData2 instanceof C1551680qTu) {
            this.LJIIIIZZ = (C1551680qTu) pipelineData2;
        }
    }

    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(final InterfaceC1552320qUw<UpdatePackage> interfaceC1552320qUw, List<UpdatePackage> list) {
        final int channelUpdatePriority;
        List<UpdatePackage> list2 = list;
        OptionCheckUpdateParams optionCheckUpdateParams = this.LJII;
        if (optionCheckUpdateParams != null) {
            channelUpdatePriority = optionCheckUpdateParams.getChannelUpdatePriority();
            C1551800qU6 checkUpdateData = this.LJII.getCheckUpdateData();
            if (checkUpdateData != null && !list2.isEmpty()) {
                checkUpdateData.LJIILIIL.LJII = System.currentTimeMillis();
            }
        } else {
            channelUpdatePriority = 1;
        }
        C1551680qTu c1551680qTu = this.LJIIIIZZ;
        if (c1551680qTu != null) {
            ((CopyOnWriteArrayList) c1551680qTu.LIZIZ).add(new AObjectS366S0100000_23(this, 1));
        }
        LJIIJJI.addAndGet(list2.size());
        for (final UpdatePackage updatePackage : list2) {
            String accessKey = updatePackage.getAccessKey();
            String groupName = updatePackage.getGroupName();
            String channel = updatePackage.getChannel();
            final int andIncrement = ((3 - channelUpdatePriority) * 100000) + LJIIJ.getAndIncrement();
            final C1551770qU3 c1551770qU3 = new C1551770qU3(((Integer) interfaceC1552320qUw.getPipelineData("req_type")).intValue(), accessKey, groupName, channel, updatePackage);
            this.LJI.execute(new AbstractRunnableC1551740qU0(andIncrement, c1551770qU3) { // from class: X.0qU1
                public final void LIZJ() {
                    C1552810qVj c1552810qVj = C797990VSb.LIZ.LJIIJJI;
                    if (c1552810qVj == null || !c1552810qVj.LIZ()) {
                        C1551680qTu c1551680qTu2 = this.LLILZLL.LJIIIIZZ;
                        if (c1551680qTu2 == null || !c1551680qTu2.LIZIZ()) {
                            try {
                                interfaceC1552320qUw.setPipelineData("update_priority", Integer.valueOf(channelUpdatePriority));
                                interfaceC1552320qUw.setPipelineData("download_task", this);
                                interfaceC1552320qUw.proceed(updatePackage);
                                if (C1551760qU2.LJIIJJI.decrementAndGet() == 0) {
                                    C1551760qU2.LJIIJ.set(0);
                                    return;
                                }
                                C1551680qTu c1551680qTu3 = this.LLILZLL.LJIIIIZZ;
                                if (c1551680qTu3 == null || c1551680qTu3.LIZIZ()) {
                                    return;
                                }
                                this.LLILZLL.LIZLLL();
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1551760qU2 c1551760qU2 = this.LLILZLL;
                                AbstractC1552800qVi abstractC1552800qVi = c1551760qU2.LIZLLL;
                                if (abstractC1552800qVi != null) {
                                    abstractC1552800qVi.LJFF(c1551760qU2.LJ, c1551760qU2, th);
                                    return;
                                }
                                return;
                            }
                        }
                        synchronized (this.LLILZLL.LJIIIZ) {
                            try {
                                this.LLILZLL.LJIIIZ.add(this);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                throw th2;
                            }
                        }
                        UpdatePackage updatePackage2 = this.LLILLJJLI.LJ;
                        C1551810qU7 statisticModel = updatePackage2.getStatisticModel();
                        if (statisticModel == null) {
                            updatePackage2.onPause();
                        } else {
                            statisticModel.LJJI = System.currentTimeMillis();
                        }
                        this.LLILZLL.LJII.getListener().LJIIL(updatePackage2);
                        C1551760qU2 c1551760qU22 = this.LLILZLL;
                        C1551680qTu c1551680qTu4 = c1551760qU22.LJIIIIZZ;
                        CopyOnWriteArrayList<AbstractRunnableC1551740qU0> copyOnWriteArrayList = c1551760qU22.LJIIIZ;
                        if (c1551680qTu4.LIZLLL == null) {
                            c1551680qTu4.LIZLLL = new ARunnableS92S0200000_23(copyOnWriteArrayList, c1551680qTu4, 100);
                            C786410Ut5.LJLIIL(60000L, (Handler) c1551680qTu4.LJ.getValue(), c1551680qTu4.LIZLLL);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ParallelDownloadInterceptor@8b31.insertDownloadQueue$1");
                    try {
                        LIZJ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ParallelDownloadInterceptor@8b31.insertDownloadQueue$1");
                }
            });
        }
        return null;
    }
}
