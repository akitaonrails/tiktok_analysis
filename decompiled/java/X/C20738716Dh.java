package X;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.pictureinpicture.IEcPiPAbility;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS603S0100000_24;
import org.json.JSONException;

/* JADX INFO: renamed from: X.16Dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20738716Dh implements InterfaceC1757230vpR {
    public static WeakReference<C20738716Dh> LJIIIIZZ = new WeakReference<>(null);
    public final Fragment LIZ;
    public final FrameLayout LIZIZ;
    public final C20739116Dl LIZJ;
    public final boolean LIZLLL;
    public final C1038610d8N LJ;
    public final View LJFF;
    public C1757130vpH LJI;
    public final C01GW LJII;

    @Override // X.InterfaceC1757230vpR
    public final Size LIZ() {
        return (Size) this.LJII.getValue();
    }

    @Override // X.InterfaceC1757230vpR
    public final C1757130vpH cf() {
        if (this.LIZLLL) {
            return this.LJI;
        }
        IEcPiPAbility iEcPiPAbility = (IEcPiPAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LIZ, null), IEcPiPAbility.class, null);
        if (iEcPiPAbility != null) {
            return iEcPiPAbility.cf();
        }
        return null;
    }

    @Override // X.InterfaceC1757230vpR
    public final void pause() {
        if (this.LIZLLL) {
            InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
            if (interfaceC1508380pM4LIZ != null) {
                interfaceC1508380pM4LIZ.LIZ();
                return;
            }
            return;
        }
        IEcPiPAbility iEcPiPAbility = (IEcPiPAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LIZ, null), IEcPiPAbility.class, null);
        if (iEcPiPAbility != null) {
            iEcPiPAbility.pause();
        }
    }

    @Override // X.InterfaceC1757230vpR
    public final void play() {
        if (this.LIZLLL) {
            InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
            if (interfaceC1508380pM4LIZ != null) {
                interfaceC1508380pM4LIZ.LJIILLIIL();
                return;
            }
            return;
        }
        IEcPiPAbility iEcPiPAbility = (IEcPiPAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LIZ, null), IEcPiPAbility.class, null);
        if (iEcPiPAbility != null) {
            iEcPiPAbility.play();
        }
    }

    @Override // X.InterfaceC1757230vpR
    public final void Nj(InterfaceC20738816Di interfaceC20738816Di) {
        IEcPiPAbility iEcPiPAbility = (IEcPiPAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LIZ, null), IEcPiPAbility.class, null);
        if (iEcPiPAbility != null) {
            iEcPiPAbility.Nj(interfaceC20738816Di);
        }
    }

    @Override // X.InterfaceC1757230vpR
    public final void Sq(C2249291D1z c2249291D1z) {
        IEcPiPAbility iEcPiPAbility = (IEcPiPAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LIZ, null), IEcPiPAbility.class, null);
        if (iEcPiPAbility != null) {
            iEcPiPAbility.Sq(c2249291D1z);
        }
    }

    @Override // X.InterfaceC1757230vpR
    public final void k(EnumC1757150vpJ enumC1757150vpJ, boolean z) {
        if (this.LIZLLL) {
            if (z) {
                pause();
            }
            this.LJI = new C1757130vpH(false, enumC1757150vpJ, false, 8);
        } else {
            IEcPiPAbility iEcPiPAbility = (IEcPiPAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LIZ, null), IEcPiPAbility.class, null);
            if (iEcPiPAbility != null) {
                iEcPiPAbility.VI(enumC1757150vpJ, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // X.InterfaceC1757230vpR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.graphics.Rect r13, android.graphics.Point r14, kotlin.jvm.functions.Function0<kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20738716Dh.LIZIZ(android.graphics.Rect, android.graphics.Point, kotlin.jvm.functions.Function0):void");
    }

    public C20738716Dh(Fragment fragment, FrameLayout frameLayout, C20739116Dl c20739116Dl, boolean z, C1038610d8N c1038610d8N) throws JSONException {
        View viewSd;
        String str;
        this.LIZ = fragment;
        this.LIZIZ = frameLayout;
        this.LIZJ = c20739116Dl;
        this.LIZLLL = z;
        this.LJ = c1038610d8N;
        LJIIIIZZ = new WeakReference<>(this);
        if (s1.LIZ()) {
            viewSd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.btk, frameLayout, false);
        } else {
            viewSd = C786410Ut5.Sd(R.layout.btl, C786410Ut5.ne(frameLayout.getContext()), null);
        }
        if (viewSd instanceof ViewGroup) {
            frameLayout.addView(viewSd, 0);
            viewSd.bringToFront();
        }
        this.LJFF = viewSd;
        C723850SaN.LIZ(fragment, false, null, new AwS603S0100000_24(this, 60), 3);
        C20738916Dj c20738916Dj = new C20738916Dj(c20739116Dl);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c20738916Dj.LJ(linkedHashMap);
        if (z) {
            str = "audio_only";
        } else {
            str = "video_and_audio";
        }
        linkedHashMap.put("mode", str);
        c1507790pL7.getClass();
        C1507790pL7.LIZ("tiktokec_mini_window_mode", linkedHashMap);
        this.LJII = C452501pT.LIZIZ(new AwS567S0100000_23(this, 89));
    }
}
