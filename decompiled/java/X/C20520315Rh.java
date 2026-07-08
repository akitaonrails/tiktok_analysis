package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAndroidBackgroundOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostRoomLoadingOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15Rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20520315Rh implements InterfaceC937960aW2 {
    public ViewGroup LIZ;
    public Pair<Integer, Integer> LIZIZ;
    public final C01GW LIZJ = C930540aK4.LJJIJIL(AFwS221S0000000_31.get$arr$(63));

    public final C20520415Ri LJFF() {
        return (C20520415Ri) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC937960aW2
    public final void onDetach() {
        if (MultiCohostRoomLoadingOptSetting.INSTANCE.isEnable()) {
            ViewGroup viewGroup = this.LIZ;
            if (viewGroup != null) {
                viewGroup.setBackground(null);
            }
            this.LIZ = null;
        }
        if (MultiGuestAndroidBackgroundOptSetting.INSTANCE.isOptSetBg()) {
            C20520415Ri c20520415RiLJFF = LJFF();
            c20520415RiLJFF.LJ = null;
            c20520415RiLJFF.LJFF = false;
            c20520415RiLJFF.LJI = false;
            c20520415RiLJFF.LJII = false;
            List<String> list = c20520415RiLJFF.LJIIIIZZ;
            if (list != null) {
                for (String str : list) {
                    C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                    Uri uri = UriProtector.parse(str);
                    if (c1325540kbALIZ.LJIIJJI(uri)) {
                        c1325540kbALIZ.LJ(uri);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("detach successfully: ");
                        sbLIZ.append(uri);
                        C20441214yg.LIZIZ("WindowMaskDrawable detach", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                c20520415RiLJFF.LJIIIIZZ = null;
            }
        }
    }

    @Override // X.InterfaceC937960aW2
    public final int LIZJ() {
        C20520415Ri c20520415RiLJFF = LJFF();
        ((Drawable) c20520415RiLJFF.LIZ.LIZ.getValue()).getBounds().width();
        ((Drawable) c20520415RiLJFF.LIZ.LIZJ.getValue()).getBounds().height();
        ((Drawable) c20520415RiLJFF.LIZ.LIZIZ.getValue()).getBounds().width();
        return ((Drawable) c20520415RiLJFF.LIZ.LIZLLL.getValue()).getBounds().height();
    }

    @Override // X.InterfaceC937960aW2
    public final void LJ() {
        C20520415Ri c20520415RiLJFF = LJFF();
        int i = 0;
        do {
            c20520415RiLJFF.LJIIJ[i] = false;
            i++;
        } while (i < 4);
        c20520415RiLJFF.LJIIIZ = true;
        c20520415RiLJFF.invalidateSelf();
    }

    public C20520315Rh(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    @Override // X.InterfaceC937960aW2
    public final void LIZ(Pair<Integer, Integer> pair) {
        this.LIZIZ = pair;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc A[LOOP:1: B:45:0x00ca->B:46:0x00cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e A[PHI: r1
      0x016e: PHI (r1v4 boolean) = (r1v3 boolean), (r1v6 boolean) binds: [B:56:0x0119, B:61:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC937960aW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.graphics.Rect r12) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20520315Rh.LIZIZ(android.graphics.Rect):void");
    }

    @Override // X.InterfaceC937960aW2
    public final void LIZLLL(boolean z) {
        List urls;
        List<String> list;
        ImageModel imageModel;
        if (MultiGuestAndroidBackgroundOptSetting.INSTANCE.isOptSetBg() && z) {
            final C20520415Ri c20520415RiLJFF = LJFF();
            c20520415RiLJFF.getClass();
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null && (imageModel = room.background) != null) {
                urls = imageModel.getUrls();
            } else {
                urls = null;
            }
            c20520415RiLJFF.LJIIIIZZ = urls;
            boolean z2 = false;
            if (urls != null && !urls.isEmpty()) {
                z2 = true;
            }
            c20520415RiLJFF.LJII = z2;
            if (!c20520415RiLJFF.LJFF && c20520415RiLJFF.LJIILIIL == null && c20520415RiLJFF.LIZIZ() && (list = c20520415RiLJFF.LJIIIIZZ) != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(it2.next()));
                    c1325700kbQLIZLLL.LJIIZILJ = new C1320270kSf() { // from class: X.15Rj
                        @Override // X.C1320270kSf, X.InterfaceC1325670kbN
                        public final void LJII(C1325710kbR c1325710kbR, String str, boolean z3) {
                            c20520415RiLJFF.LJFF = true;
                            C20441214yg.LJIIIZ("WindowMaskDrawable", "preload image success");
                            C20520415Ri c20520415Ri = c20520415RiLJFF;
                            if (c20520415Ri.LJI) {
                                try {
                                    c20520415Ri.LIZJ();
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C20441214yg.LJ("WindowMaskDrawable", e.getMessage());
                                }
                            }
                        }

                        @Override // X.C1320270kSf, X.InterfaceC1325670kbN
                        public final void LJ(C1325710kbR c1325710kbR, String str, Throwable th, boolean z3) {
                            C20441214yg.LJIIIZ("WindowMaskDrawable", "preload image fail");
                        }
                    };
                    C1322200kVm.LIZ().LJIIZILJ(c1325700kbQLIZLLL.LIZ(), C497740JfY.LJII());
                }
            }
        }
    }
}
