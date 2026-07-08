package X;

import Y.ARunnableS125S0100000_25;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.LivePermissionApply;
import com.ss.android.ugc.aweme.LiveScenario;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import g3a.a;
import java.util.Map;
import kotlin.jvm.internal.AFwS239S0000000_8;
import lth.o;

/* JADX INFO: renamed from: X.0t86, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653480t86 extends a implements InterfaceC1408530ml1 {
    public final C1DRG LLIZLLLIL;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        String str;
        if (!o.LJIIZILJ.LIZ()) {
            o.LJIILL.getClass();
            if (AVServiceProxyImpl.needLiveInRecordInner()) {
                ShortVideoContext shortVideoContext = (ShortVideoContext) this.LLIZLLLIL.LJIIL(null, ShortVideoContext.class);
                if (shortVideoContext == null || (str = shortVideoContext.shootWay) == null) {
                    str = "";
                }
                C1653340t7s.LIZIZ = str;
                InterfaceC1655090tAh interfaceC1655090tAh = o.LJIILL;
                InterfaceC784090UpL interfaceC784090UpL = new InterfaceC784090UpL() { // from class: X.0t87
                    @Override // X.InterfaceC784090UpL
                    public final void onFailed(Throwable th) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("RequestLivePermissionTask onFailed: ");
                        sbLIZ.append(th);
                        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                        this.LIZ.LJIIJ();
                    }

                    @Override // X.InterfaceC784090UpL
                    public final void onSuccess(Boolean bool, LiveScenario liveScenario, LivePermissionApply livePermissionApply, Boolean bool2, Boolean bool3, Map map) {
                        boolean zBooleanValue = bool.booleanValue();
                        bool2.booleanValue();
                        boolean zBooleanValue2 = bool3.booleanValue();
                        C312180CLo.LIZIZ(zBooleanValue);
                        if (zBooleanValue) {
                            C1653340t7s.LIZ = zBooleanValue2 ? 1 : 0;
                            C1653340t7s.LJFF.putAll(map);
                            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS125S0100000_25(this.LIZ, 45));
                        }
                        this.LIZ.LJIIJ();
                    }
                };
                String str2 = C1653340t7s.LIZIZ;
                interfaceC1655090tAh.getClass();
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LJIILIIL(new C784080UpK(interfaceC784090UpL), "shoot", str2, null);
                return;
            }
        }
        LJIIJ();
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P0;
    }

    public C1653480t86(C1DRG c1drg) {
        this.LLIZLLLIL = c1drg;
        LJ(AFwS239S0000000_8.get$arr$(118));
    }
}
