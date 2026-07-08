package X;

import Y.ARunnableS86S0200000_17;
import android.os.Looper;
import com.bytedance.android.live.PortraitShortTouchPreviewEvent;
import com.bytedance.android.livesdk.dataChannel.ShortTouchContainerLoaded;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchAllInOneReportSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchNewFrameworkSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS666S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0elz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101610elz {
    public static final /* synthetic */ int LJIIJJI = 0;
    public boolean LIZ;
    public List<C1101640em2> LIZIZ;
    public List<C1101970emZ> LIZJ;
    public InterfaceC1101990emb LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public DataChannel LJI;
    public InterfaceC1101890emR LJIIIZ;
    public final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public boolean LJIIIIZZ = true;
    public final C1101600ely LJIIJ = new C1101600ely();

    public final void LJ() {
        this.LIZ = false;
        LIZLLL();
    }

    public final void LIZLLL() {
        List<C1101970emZ> list;
        C1101970emZ c1101970emZ;
        if (this.LIZJ == null || !(!((ArrayList) r0).isEmpty()) || this.LIZLLL == null || !this.LJ || !this.LJFF || this.LIZ || (list = this.LIZJ) == null || !(!((ArrayList) list).isEmpty())) {
            return;
        }
        this.LIZ = true;
        List<C1101970emZ> list2 = this.LIZJ;
        if (list2 == null || (c1101970emZ = (C1101970emZ) ListProtector.remove(list2, 0)) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Short touch presenter] Next, id = ");
        sbLIZ.append(c1101970emZ.LIZIZ);
        sbLIZ.append(", operation = ");
        sbLIZ.append(c1101970emZ.LIZ);
        C20441214yg.LIZIZ("TikTok Live Short Touch", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJJZZIII(this.LJII, new ARunnableS86S0200000_17(this, c1101970emZ, 27));
    }

    public final void LIZ(C1101640em2 c1101640em2) {
        int size;
        boolean zLJFF;
        boolean zLJI = MethodIDManager.LJI(71821);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Short touch presenter] Add item, id = ");
        sbLIZ.append(c1101640em2.LIZLLL);
        sbLIZ.append(", name = ");
        sbLIZ.append(c1101640em2.LJ);
        C20441214yg.LIZIZ("TikTok Live Short Touch", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            C1101600ely c1101600ely = this.LJIIJ;
            InterfaceC1085330eLj interfaceC1085330eLj = c1101640em2.LIZ;
            InterfaceC1101720emA interfaceC1101720emA = c1101640em2.LIZIZ;
            Map<String, String> map = c1101640em2.LIZJ;
            c1101600ely.getClass();
            c1101600ely.LIZ(new C1101620em0(interfaceC1101720emA, interfaceC1085330eLj, map, new AwS666S0100000_17(c1101600ely, 4)));
        } else {
            C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(c1101640em2.LIZ.Sr());
            if (c1101820emKLIZIZ != null) {
                c1101820emKLIZIZ.LIZIZ = System.currentTimeMillis();
                List<C1101970emZ> list = this.LIZJ;
                if (list != null) {
                    size = ((ArrayList) list).size();
                } else {
                    size = 0;
                }
                c1101820emKLIZIZ.LJII = size;
                DataChannel dataChannel = this.LJI;
                if (dataChannel != null) {
                    zLJFF = Intrinsics.LJFF(dataChannel.gg0(ShortTouchContainerLoaded.class), Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                c1101820emKLIZIZ.LJIJ = zLJFF;
            }
            c1101640em2.LIZ.LLLZI();
            InterfaceC1101720emA interfaceC1101720emA2 = c1101640em2.LIZIZ;
            if (interfaceC1101720emA2 != null) {
                interfaceC1101720emA2.LLLZI();
            }
            List<C1101640em2> list2 = this.LIZIZ;
            if (list2 != null) {
                ((ArrayList) list2).add(c1101640em2);
            }
            List<C1101970emZ> list3 = this.LIZJ;
            if (list3 != null) {
                ((ArrayList) list3).add(new C1101970emZ(EnumC1101700em8.Add, c1101640em2.LIZLLL));
            }
            DataChannel dataChannel2 = this.LJI;
            if (dataChannel2 != null) {
                dataChannel2.FQ2(PortraitShortTouchPreviewEvent.class);
            }
            LIZLLL();
            if (this.LJIIIIZZ) {
                this.LJIIIIZZ = false;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_shorttouch_interaction_container_load");
                c474500IjALIZ.LJIIIIZZ();
                if (C01C5.LIZ(this.LJI)) {
                    c474500IjALIZ.LJJII("moderator", "user_type");
                }
                c474500IjALIZ.LJJII(c1101640em2.LJ, "interact_type");
                c474500IjALIZ.LJJII("base_container", "container_type");
                c474500IjALIZ.LIZ();
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_shorttouch_interaction_accept");
            c474500IjALIZ2.LJIIIIZZ();
            c474500IjALIZ2.LJJII(c1101640em2.LJ, "interact_type");
            if (C01C5.LIZ(this.LJI)) {
                c474500IjALIZ2.LJJII("moderator", "user_type");
            }
            c474500IjALIZ2.LIZ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final C1101640em2 LIZJ(EnumC1101860emO enumC1101860emO, String str) {
        List<C1101640em2> list;
        int i = C1101650em3.LIZ[enumC1101860emO.ordinal()];
        C1101640em2 c1101640em2 = null;
        if (i != 1) {
            if (i != 2 || (list = this.LIZIZ) == null) {
                return null;
            }
            Iterator<C1101640em2> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1101640em2 next = it2.next();
                if (Intrinsics.LJFF(next.LJ, str)) {
                    c1101640em2 = next;
                    break;
                }
            }
            return c1101640em2;
        }
        List<C1101640em2> list2 = this.LIZIZ;
        if (list2 == null) {
            return null;
        }
        Iterator<C1101640em2> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C1101640em2 next2 = it3.next();
            if (Intrinsics.LJFF(next2.LIZLLL, str)) {
                c1101640em2 = next2;
                break;
            }
        }
        return c1101640em2;
    }

    public final void LJFF(EnumC1101860emO enumC1101860emO, String str) {
        Iterator it2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Short touch presenter] Remove item, identify = ");
        sbLIZ.append(enumC1101860emO);
        sbLIZ.append(", value = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("TikTok Live Short Touch", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            this.LJIIJ.LJI(enumC1101860emO, str, "Business");
            return;
        }
        C1101640em2 c1101640em2LIZJ = LIZJ(enumC1101860emO, str);
        if (c1101640em2LIZJ == null) {
            return;
        }
        List<C1101970emZ> list = this.LIZJ;
        if (list != null && (it2 = ((ArrayList) list).iterator()) != null) {
            while (it2.hasNext()) {
                C1101970emZ c1101970emZ = (C1101970emZ) it2.next();
                if (c1101970emZ.LIZ == EnumC1101700em8.Add && Intrinsics.LJFF(c1101970emZ.LIZIZ, c1101640em2LIZJ.LIZLLL)) {
                    it2.remove();
                    c1101640em2LIZJ.LIZ.LJLJL();
                    InterfaceC1101720emA interfaceC1101720emA = c1101640em2LIZJ.LIZIZ;
                    if (interfaceC1101720emA != null) {
                        interfaceC1101720emA.LJLJL();
                    }
                    List<C1101640em2> list2 = this.LIZIZ;
                    if (list2 != null) {
                        ((ArrayList) list2).remove(c1101640em2LIZJ);
                        return;
                    }
                    return;
                }
            }
        }
        List<C1101970emZ> list3 = this.LIZJ;
        if (list3 != null) {
            ((ArrayList) list3).add(new C1101970emZ(EnumC1101700em8.Remove, c1101640em2LIZJ.LIZLLL));
        }
        DataChannel dataChannel = this.LJI;
        if (dataChannel != null) {
            dataChannel.FQ2(PortraitShortTouchPreviewEvent.class);
        }
        LIZLLL();
    }

    public static C1101640em2 LIZIZ(InterfaceC1085330eLj interfaceC1085330eLj, InterfaceC1101720emA interfaceC1101720emA, Map map) {
        String strSr;
        C1101640em2 c1101640em2 = new C1101640em2(interfaceC1085330eLj, interfaceC1101720emA, map);
        LiveShortTouchAllInOneReportSetting liveShortTouchAllInOneReportSetting = LiveShortTouchAllInOneReportSetting.INSTANCE;
        if (liveShortTouchAllInOneReportSetting.enable()) {
            String strMP0 = interfaceC1085330eLj.mP0();
            System.currentTimeMillis();
            C1101820emK c1101820emK = new C1101820emK(strMP0);
            if (liveShortTouchAllInOneReportSetting.enable()) {
                if (interfaceC1101720emA != null && (strSr = interfaceC1101720emA.Sr()) != null) {
                    C1101900emS.LIZ.put(strSr, c1101820emK);
                }
                C1101900emS.LIZ.put(interfaceC1085330eLj.Sr(), c1101820emK);
            }
        }
        return c1101640em2;
    }
}
