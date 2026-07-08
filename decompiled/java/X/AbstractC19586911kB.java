package X;

import Y.ARunnableS129S0100000_29;
import Y.ARunnableS6S0100002_6;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11kB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19586911kB implements InterfaceC19594611lQ {
    public final Context LIZ;
    public final View LIZIZ;
    public C705930RmZ LIZJ;
    public C435270H4z LIZLLL;
    public ARunnableS6S0100002_6 LJ;
    public C0P0T LJFF;
    public boolean LJI;
    public InteractStickerStruct LJII;
    public final List<? extends NormalTrackTimeStamp> LJIIIIZZ;

    @Override // X.InterfaceC19594611lQ
    public final void LJ() {
    }

    @Override // X.InterfaceC19594611lQ
    public final void LJFF() {
    }

    @Override // X.InterfaceC19594611lQ
    public boolean LJII() {
        return false;
    }

    @Override // X.InterfaceC19594611lQ
    public boolean LJIIL() {
        return false;
    }

    public float LJIILIIL(float f) {
        return f;
    }

    public void LJIILJJIL(C435270H4z c435270H4z) {
    }

    public abstract View LJIILL();

    public int LJIILLIIL(C451220Hmi c451220Hmi) {
        return 0;
    }

    public abstract void LJIJ();

    public abstract void LJIJI();

    public Context LJIJJLI(Context context) {
        return context;
    }

    @Override // X.InterfaceC19594811lS
    public void onPause() {
    }

    @Override // X.InterfaceC19594811lS
    public void onResume() {
    }

    @Override // X.InterfaceC19594811lS
    public final void LIZ() {
        InterfaceC19595111lV interfaceC19595111lV;
        ARunnableS6S0100002_6 aRunnableS6S0100002_6 = this.LJ;
        if (aRunnableS6S0100002_6 != null) {
            C810560Vqw.LIZ(aRunnableS6S0100002_6);
            this.LJ = null;
        }
        C435270H4z c435270H4z = this.LIZLLL;
        if (c435270H4z != null) {
            c435270H4z.dismiss();
            this.LIZLLL = null;
        }
        C705930RmZ c705930RmZ = this.LIZJ;
        if (c705930RmZ == null || (interfaceC19595111lV = c705930RmZ.LJIILIIL) == null) {
            return;
        }
        interfaceC19595111lV.LIZ(getStickerType(), false);
    }

    public final void LJIIZILJ() {
        C0P0T c0p0t;
        C0P0T c0p0t2 = this.LJFF;
        if (c0p0t2 == null || !c0p0t2.isShowing() || (c0p0t = this.LJFF) == null) {
            return;
        }
        c0p0t.dismiss();
    }

    @Override // X.InterfaceC19594611lQ
    public final int LIZJ() {
        return hashCode();
    }

    @Override // X.InterfaceC19594611lQ
    public final InteractStickerStruct LJIIJ() {
        return this.LJII;
    }

    public void LIZLLL(C705930RmZ c705930RmZ) {
        this.LIZJ = c705930RmZ;
    }

    @Override // X.InterfaceC19594611lQ
    public final void LJIIIIZZ(InteractStickerStruct interactStickerStruct) {
        this.LJII = interactStickerStruct;
    }

    @Override // X.InterfaceC19594811lS
    public void LJIIJJI(int i) {
        ARunnableS6S0100002_6 aRunnableS6S0100002_6 = this.LJ;
        if (aRunnableS6S0100002_6 != null) {
            C810560Vqw.LIZ(aRunnableS6S0100002_6);
            this.LJ = null;
        }
        C435270H4z c435270H4z = this.LIZLLL;
        if (c435270H4z != null) {
            c435270H4z.onDestroy();
        }
        this.LIZLLL = null;
    }

    public void LJIJJ(long j) {
        C786410Ut5.LJLIIL(j, new BPEAHandler(), new ARunnableS129S0100000_29(this, 225));
    }

    public final boolean LJIL(float f, float f2) {
        C1440005kM.LIZ(new C1209650haF(hashCode()));
        C435270H4z c435270H4z = this.LIZLLL;
        if (c435270H4z != null && c435270H4z.isShowing()) {
            C1440005kM.LIZ(new C1209650haF());
            return false;
        }
        LJIJ();
        this.LJ = new ARunnableS6S0100002_6(this, f, f2, 1);
        HandlerHook.viewPost(this.LIZIZ, new ARunnableS129S0100000_29(this, 226));
        return true;
    }

    public final boolean LJJ(float f, float f2) {
        C1440005kM.LIZ(new C1209650haF(hashCode()));
        C0P0T c0p0t = this.LJFF;
        if ((c0p0t != null && c0p0t.isShowing()) || this.LJI) {
            C1440005kM.LIZ(new C1209650haF());
            C0P0T c0p0t2 = this.LJFF;
            if (c0p0t2 != null) {
                c0p0t2.dismiss();
            }
            return false;
        }
        LJIJ();
        int iLIZ = C341940Daq.LIZ(58.0d);
        int iLIZ2 = C341940Daq.LIZ(16.0d);
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = C341940Daq.LIZ(10.0d);
        C118300cf c118300cf2 = new C118300cf();
        int[] iArr = new int[2];
        this.LIZIZ.getLocationOnScreen(iArr);
        C450860Hm8 c450860Hm8 = new C450860Hm8(LJIJJLI(this.LIZ));
        C1391600mJi c1391600mJi = c450860Hm8.LLILLJJLI;
        c1391600mJi.LJII = -1001L;
        c1391600mJi.LJIIJ = 300L;
        c1391600mJi.LJIIIIZZ = iLIZ2;
        c450860Hm8.LJIIJ(new AwS238S0300000_29(c118300cf2, this, c118300cf, 33));
        c450860Hm8.LIZJ(new AwS608S0100000_29(this, 864));
        if (f2 < c118300cf.element + iLIZ + iLIZ2) {
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.BOTTOM;
            C1391600mJi c1391600mJi2 = c450860Hm8.LLILLJJLI;
            c1391600mJi2.LIZLLL = enumC1235690iGF;
            if (f2 > iLIZ - iLIZ2) {
                c1391600mJi2.LJFF = iLIZ2;
            } else {
                f2 = iLIZ;
            }
        } else {
            EnumC1235690iGF enumC1235690iGF2 = EnumC1235690iGF.TOP;
            C1391600mJi c1391600mJi3 = c450860Hm8.LLILLJJLI;
            c1391600mJi3.LIZLLL = enumC1235690iGF2;
            c1391600mJi3.LJFF = -iLIZ2;
        }
        c450860Hm8.LIZ(((int) LJIILIIL(f)) + iArr[0], ((int) f2) + iArr[1]);
        if (c118300cf2.element <= 0) {
            return false;
        }
        C0P0T c0p0tLIZIZ = c450860Hm8.LIZIZ();
        this.LJFF = c0p0tLIZIZ;
        c0p0tLIZIZ.show();
        this.LJI = true;
        return true;
    }

    public AbstractC19586911kB(Context context, View view, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ) {
        String trackList;
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = c705930RmZ;
        this.LJII = interactStickerStruct;
        try {
            Gson gson = C7740030o.LIZ().getGson();
            InteractStickerStruct interactStickerStruct2 = this.LJII;
            if (interactStickerStruct2 != null) {
                trackList = interactStickerStruct2.getTrackList();
            } else {
                trackList = null;
            }
            this.LJIIIIZZ = (List) GsonProtectorUtils.fromJson(gson, trackList, new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.11kD
            }.getType());
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
