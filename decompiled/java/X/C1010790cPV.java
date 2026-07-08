package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010790cPV implements InterfaceC1010450cOx {
    public static final /* synthetic */ int LLJILLL = 0;
    public final InterfaceC1010860cPc LL;
    public C1010640cPG LLILLJJLI;
    public final Context LLILLL;
    public LifecycleOwner LLILZ;
    public C1010780cPU LLILZIL;
    public final List<IVideoPlayTaskManager> LLILZLL;
    public final C1010800cPW LLIZ;
    public final AwS560S0100000_16 LLIZLLLIL;
    public long LLJ;
    public final C01GW LLJI;
    public int LLJIJIL;
    public final SearchAdEventLogger LLJILJIL;
    public final C1010870cPd LLJILJILJ;

    @Override // X.InterfaceC1010520cP4
    public final void bind() {
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public static InterfaceC585680My6 LIZIZ() {
        IMeasurementService iMeasurementService = (IMeasurementService) PluggableExtentionKt.pluggableSpi$default(IMeasurementService.class, false, false, false, 14, null);
        if (iMeasurementService != null) {
            return iMeasurementService.LIZLLL();
        }
        return null;
    }

    @Override // X.InterfaceC1010450cOx
    public final String E70() {
        Video video;
        VideoUrlModel playAddr;
        Aweme aweme = this.LL.getAweme();
        if (aweme == null || (video = aweme.getVideo()) == null || (playAddr = video.getPlayAddr()) == null) {
            return null;
        }
        return playAddr.getOriginUri();
    }

    @Override // X.InterfaceC1010450cOx
    public final void LJII() {
        LIZJ(C1010930cPj.LIZ);
    }

    @Override // X.InterfaceC1010450cOx
    public final void LJJLIIIJ() {
        LIZJ(C1010900cPg.LIZ);
    }

    @Override // X.InterfaceC1010450cOx
    public final void LLLLLLJ() {
        C1010630cPF c1010630cPF;
        InterfaceC1010660cPI interfaceC1010660cPI;
        LIZJ(C1010910cPh.LIZ);
        C1010640cPG c1010640cPG = this.LLILLJJLI;
        if (c1010640cPG != null && (c1010630cPF = c1010640cPG.LIZIZ) != null && (interfaceC1010660cPI = c1010630cPF.LIZJ) != null) {
            interfaceC1010660cPI.LLLLLLJ();
        }
        this.LLJ = ((Number) this.LLIZLLLIL.invoke()).longValue();
    }

    @Override // X.InterfaceC1010450cOx
    public final Set<EnumC1010840cPa> OG0() {
        C1010780cPU c1010780cPU = this.LLILZIL;
        if (c1010780cPU != null) {
            return c1010780cPU.LJ;
        }
        return null;
    }

    @Override // X.InterfaceC1010450cOx
    public final void QO2() {
        LIZJ(C1010920cPi.LIZ);
    }

    @Override // X.InterfaceC1010450cOx
    public final long getCurrentPosition() {
        Object objInvoke = this.LLIZLLLIL.invoke();
        if (((Number) objInvoke).longValue() == 0) {
            objInvoke = null;
        }
        Long l = (Long) objInvoke;
        return l != null ? l.longValue() : this.LLJ;
    }

    @Override // X.InterfaceC1010450cOx
    public final long getVideoLength() {
        Video video;
        Aweme aweme = this.LL.getAweme();
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return -1L;
        }
        return video.getVideoLength();
    }

    @Override // X.InterfaceC1010520cP4
    public final void onViewAttachedToWindow() {
        Aweme aweme;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        Long creativeId;
        String string;
        C1010960cPm c1010960cPm;
        if (!C293340Bee.LIZIZ || (aweme = this.LL.getAweme()) == null || (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) == null || (creativeId = awemeRawAdLJJIJLIJ.getCreativeId()) == null || (string = creativeId.toString()) == null) {
            return;
        }
        C1010870cPd c1010870cPd = this.LLJILJILJ;
        AbstractC1023200cjW abstractC1023200cjWLJ = C1023060cjI.LJ(C1023120cjO.LIZIZ);
        if (!(abstractC1023200cjWLJ instanceof C1010960cPm) || (c1010960cPm = (C1010960cPm) abstractC1023200cjWLJ) == null) {
            return;
        }
        c1010960cPm.LJII.put(string, new WeakReference<>(c1010870cPd));
    }

    @Override // X.InterfaceC1010520cP4
    public final void onViewDetachedFromWindow() {
        Aweme aweme;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        Long creativeId;
        String string;
        C1010960cPm c1010960cPm;
        SearchAdEventLogger searchAdEventLogger;
        AwS382S0200000_16 awS382S0200000_16;
        LifecycleCoroutineScope lifecycleScope;
        C1010940cPk c1010940cPk = C1010940cPk.LIZ;
        LifecycleOwner lifecycleOwner = this.LLILZ;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C860070Xob(this, c1010940cPk, null), 3);
        }
        Iterator it2 = ((ArrayList) this.LLILZLL).iterator();
        while (it2.hasNext()) {
            ((IVideoPlayTaskManager) it2.next()).reset();
        }
        C1010780cPU c1010780cPU = this.LLILZIL;
        if (c1010780cPU != null) {
            if (c1010780cPU.LJII) {
                C01GW c01gw = C1010760cPS.LIZ;
                Aweme aweme2 = c1010780cPU.LIZLLL;
                C1009980cOC.LIZ.getClass();
                C1023960ckk c1023960ckk = C1009980cOC.LJJLJLI;
                String second = c1023960ckk.LJI.getSecond();
                if (C2264471DkD.LJ() && C1010760cPS.LIZIZ.contains(c1023960ckk) && C1010760cPS.LIZ().LIZ(aweme2, String.valueOf(second))) {
                    MeasurementDependencyModules.LIZ.getClass();
                    C04TF.LIZ().isDebug();
                } else {
                    if ((C2264471DkD.LJFF() || C2264471DkD.LIZJ()) && C1010760cPS.LIZ().LIZ(aweme2, String.valueOf(second))) {
                        MeasurementDependencyModules.LIZ.getClass();
                        C04TF.LIZ().isDebug();
                        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(449);
                        searchAdEventLogger = this.LLJILJIL;
                        awS382S0200000_16 = new AwS382S0200000_16(this, (C1010790cPV) aFwS252S0000000_16, (Function1<? super C1023640ckE, Unit>) 54);
                    } else {
                        MeasurementDependencyModules.LIZ.getClass();
                        C04TF.LIZ().isDebug();
                        AFwS252S0000000_16 aFwS252S0000000_162 = AFwS252S0000000_16.get$arr$(450);
                        searchAdEventLogger = this.LLJILJIL;
                        awS382S0200000_16 = new AwS382S0200000_16(this, (C1010790cPV) aFwS252S0000000_162, (Function1<? super C1023640ckE, Unit>) 54);
                    }
                    searchAdEventLogger.logAd(c1023960ckk, awS382S0200000_16);
                }
            }
            c1010780cPU.LJII = false;
        }
        if (!C293340Bee.LIZIZ || (aweme = this.LL.getAweme()) == null || (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) == null || (creativeId = awemeRawAdLJJIJLIJ.getCreativeId()) == null || (string = creativeId.toString()) == null) {
            return;
        }
        AbstractC1023200cjW abstractC1023200cjWLJ = C1023060cjI.LJ(C1023120cjO.LIZIZ);
        if (!(abstractC1023200cjWLJ instanceof C1010960cPm) || (c1010960cPm = (C1010960cPm) abstractC1023200cjWLJ) == null) {
            return;
        }
        c1010960cPm.LJII.remove(string);
    }

    @Override // X.InterfaceC1010450cOx
    public final AnonymousClass0950 wJ() {
        return this.LLIZ.LIZJ;
    }

    @Override // X.InterfaceC1010450cOx
    public final IVideoPlayTaskManager g70() {
        IVideoPlayTaskManager iVideoPlayTaskManager = (IVideoPlayTaskManager) ServiceManager.get().getService(IVideoPlayTaskManager.class);
        iVideoPlayTaskManager.LLI(100L);
        iVideoPlayTaskManager.LLFII((C1010880cPe) this.LLJI.getValue());
        ((ArrayList) this.LLILZLL).add(iVideoPlayTaskManager);
        return iVideoPlayTaskManager;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1010860cPc Mh() {
        return this.LL;
    }

    @Override // X.InterfaceC1010450cOx
    public final int s2() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1010450cOx
    public final C1010640cPG ue() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0cPd] */
    public C1010790cPV(InterfaceC1010860cPc interfaceC1010860cPc) {
        C19EG c19egLIZIZ;
        this.LL = interfaceC1010860cPc;
        this.LLILLL = interfaceC1010860cPc.LIZ();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view = interfaceC1010860cPc.getView();
        Context contextLIZ = interfaceC1010860cPc.LIZ();
        if (contextLIZ != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(contextLIZ);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        this.LLILZ = SAFHelper.LJIJI(view, c19egLIZIZ);
        String.valueOf(hashCode());
        this.LLILZLL = new ArrayList();
        this.LLIZ = new C1010800cPW();
        this.LLIZLLLIL = new AwS560S0100000_16(this, 645);
        this.LLJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 646));
        this.LLJILJIL = new SearchAdEventLogger(interfaceC1010860cPc.getAweme(), this, C1010120cOQ.LJIIIIZZ(interfaceC1010860cPc.getAweme()));
        this.LLJILJILJ = new InterfaceC1023190cjV() { // from class: X.0cPd
            @Override // X.InterfaceC1023190cjV
            public final long LIZ() {
                return this.LIZ.getVideoLength();
            }

            @Override // X.InterfaceC1023190cjV
            public final int LIZIZ() {
                return this.LIZ.LLJIJIL + 1;
            }

            @Override // X.InterfaceC1023190cjV
            public final long LLLJL() {
                return this.LIZ.LL.getCurrentPosition();
            }
        };
    }

    @Override // X.InterfaceC1010450cOx
    public final void BJ1(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePlayTimes playTimes=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = C2510609se.LIZ;
        this.LLJIJIL = i;
        Iterator<IVideoPlayTaskManager> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().LLFFF(i, true);
        }
    }

    public final void LIZ(C1010640cPG c1010640cPG) {
        this.LLILLJJLI = c1010640cPG;
        C1010630cPF c1010630cPF = c1010640cPG.LIZIZ;
        if (c1010630cPF != null && c1010630cPF.LIZ) {
            View view = this.LL.getView();
            if (view != null && view.isAttachedToWindow()) {
                C1010780cPU c1010780cPU = new C1010780cPU(this, c1010630cPF);
                this.LLILZIL = c1010780cPU;
                c1010780cPU.LIZJ();
            } else {
                View view2 = this.LL.getView();
                if (view2 == null) {
                    return;
                }
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1077300e8m(this, c1010630cPF, 1));
            }
        }
    }

    public final void LIZJ(AbstractC1010890cPf abstractC1010890cPf) {
        C19EG c19egLIZIZ;
        Aweme aweme;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AwemeSearchAdModel searchAdInfo;
        Integer num;
        C1010780cPU c1010780cPU;
        LifecycleCoroutineScope lifecycleScope;
        C1010800cPW c1010800cPW = this.LLIZ;
        Context context = this.LLILLL;
        View view = this.LL.getView();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(view, c19egLIZIZ);
        if (lifecycleOwnerLJIJI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLJIJI)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C860060Xoa(c1010800cPW, abstractC1010890cPf, null), 3);
        }
        InterfaceC1010860cPc interfaceC1010860cPc = this.LL;
        if (interfaceC1010860cPc != null && (aweme = interfaceC1010860cPc.getAweme()) != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null && (searchAdInfo = awemeRawAdLJJIJLIJ.getSearchAdInfo()) != null && (num = searchAdInfo.feedType) != null && num.intValue() == 116 && Intrinsics.LJFF(abstractC1010890cPf, C1010920cPi.LIZ) && (c1010780cPU = this.LLILZIL) != null && !c1010780cPU.LJII) {
            ((HashSet) c1010780cPU.LJ).clear();
            c1010780cPU.LIZIZ();
        }
    }
}
