package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import com.ss.ugc.effectplatform.ICKResourceVEPluginStatusService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS431S0200000_30;

/* JADX INFO: renamed from: X.13PS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13PS extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final List<Effect> LIZIZ;
    public final String LIZJ;
    public final DownloadEffectExtra LIZLLL;
    public final boolean LJ;
    public final CopyOnWriteArrayList<Effect> LJFF;
    public final CopyOnWriteArrayList<Effect> LJI;
    public final CopyOnWriteArrayList<String> LJII;
    public final CopyOnWriteArrayList<Effect> LJIIIIZZ;
    public final CopyOnWriteArrayList<Pair<Effect, C1662010tLr>> LJIIIZ;

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
    }

    public final void LIZ() {
        C1662010tLr c1662010tLr;
        Pair<Effect, C1662010tLr> pair;
        Effect effectRemove;
        if (!this.LJI.isEmpty()) {
            if (this.LJII.size() < 5) {
                int size = 5 - this.LJII.size();
                int i = 0;
                while (i <= size && (!this.LJI.isEmpty())) {
                    C2278408wI c2278408wI = C13PU.LIZ;
                    c2278408wI.LIZ();
                    try {
                        CopyOnWriteArrayList<Effect> copyOnWriteArrayList = this.LJI;
                        if ((!copyOnWriteArrayList.isEmpty()) && (effectRemove = copyOnWriteArrayList.remove(0)) != null) {
                            LIZIZ(effectRemove);
                            i++;
                        }
                        c2278408wI.LIZIZ();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c2278408wI.LIZIZ();
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        if (this.LJIIIIZZ.size() + this.LJIIIZ.size() == this.LJFF.size()) {
            if (this.LJIIIIZZ.size() == this.LJFF.size()) {
                runOnMainThread(new AwS431S0200000_30(this, (C13PS) this.LIZIZ, (List<? extends Effect>) 86));
                return;
            }
            CopyOnWriteArrayList<Pair<Effect, C1662010tLr>> copyOnWriteArrayList2 = this.LJIIIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList2, 10));
            Iterator<Pair<Effect, C1662010tLr>> it2 = copyOnWriteArrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getFirst());
            }
            CopyOnWriteArrayList<Pair<Effect, C1662010tLr>> copyOnWriteArrayList3 = this.LJIIIZ;
            if (!(!copyOnWriteArrayList3.isEmpty()) || (pair = copyOnWriteArrayList3.get(0)) == null || (c1662010tLr = pair.getSecond()) == null) {
                c1662010tLr = new C1662010tLr(10002);
            }
            if (!arrayList.isEmpty()) {
                runOnMainThread(new AwS431S0200000_30(this, c1662010tLr, 82));
            }
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        if (this.LJI.isEmpty()) {
            runOnMainThread(new AwS431S0200000_30(this, (C13PS) new ArrayList(), (List<? extends Effect>) 86));
        } else {
            LIZ();
        }
    }

    public final void LIZIZ(Effect effect) {
        boolean zLJI = MethodIDManager.LJI(137967);
        this.LJII.add(effect.getId());
        String strLIZ = C1528550psb.LIZ();
        this.LIZ.LJJJIL.LIZIZ(strLIZ, new C13NY() { // from class: X.13PT
            @Override // X.C13NY
            public final void onProgress(Effect effect2, int i, long j) {
            }

            @Override // X.C13NY
            public final void onStart(Effect effect2) {
            }

            @Override // X.C13MA
            public final void onSuccess(Effect effect2) {
                Effect effect3 = effect2;
                if (effect3 != null) {
                    C13PS c13ps = this.LIZ;
                    c13ps.LJII.remove(effect3.getId());
                    c13ps.LJIIIIZZ.add(effect3);
                }
                this.LIZ.LIZ();
            }

            @Override // X.C13MA
            public final /* bridge */ /* synthetic */ void preProcess(Effect effect2) {
            }

            @Override // X.C13MA
            public final void onFail(Effect effect2, C1662010tLr c1662010tLr) {
                Effect effect3 = effect2;
                if (effect3 != null) {
                    C13PS c13ps = this.LIZ;
                    c13ps.LJII.remove(effect3.getId());
                    c13ps.LJIIIZ.add(new Pair<>(effect3, c1662010tLr));
                }
                this.LIZ.LIZ();
            }
        });
        C13NV c13nv = new C13NV(effect, this.LIZ, strLIZ, this.LIZLLL, this.LJ);
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13nv);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13PS(C13RD c13rd, List<? extends Effect> list, String str, DownloadEffectExtra downloadEffectExtra, boolean z) {
        ICKResourceVEPluginStatusService iCKResourceVEPluginStatusService;
        super(str, c13rd.LJJJIL);
        this.LIZ = c13rd;
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = downloadEffectExtra;
        this.LJ = z;
        this.LJFF = new CopyOnWriteArrayList<>();
        this.LJI = new CopyOnWriteArrayList<>();
        this.LJII = new CopyOnWriteArrayList<>();
        this.LJIIIIZZ = new CopyOnWriteArrayList<>();
        this.LJIIIZ = new CopyOnWriteArrayList<>();
        HashSet hashSet = new HashSet();
        for (Effect effect : list) {
            String strExpectedMd5 = EffectKt.expectedMd5(effect);
            if (!hashSet.contains(strExpectedMd5)) {
                this.LJFF.add(effect);
                hashSet.add(strExpectedMd5);
            }
        }
        this.LJI.addAll(this.LJFF);
        if (!this.LJ && (iCKResourceVEPluginStatusService = (ICKResourceVEPluginStatusService) PluggableExtentionKt.pluggableSpi$default(ICKResourceVEPluginStatusService.class, false, false, false, 14, null)) != null) {
            iCKResourceVEPluginStatusService.LIZ();
        }
    }
}
