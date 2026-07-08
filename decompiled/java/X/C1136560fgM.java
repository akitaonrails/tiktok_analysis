package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0fgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136560fgM extends C1135280feI {
    public long LJJ;
    public boolean LJJI;
    public InterfaceC1139780flY LJJIFFI;
    public LiveEffect.StickerSDKExtra LJJII;
    public boolean LJJIIJ;
    public long LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIJIIJIL;
    public LiveEffect LJJIJIL;
    public JSONArray LJJIZ;
    public String LJJIII = "";
    public Map<Long, Integer> LJJIIZI = new HashMap();
    public Map<Long, Integer> LJJIJ = new HashMap();
    public Map<Long, Integer> LJJIJIIJI = new HashMap();
    public boolean LJJIJL = false;
    public boolean LJJIJLIJ = false;
    public List<Long> LJJIL = new ArrayList();
    public List<Long> LJJJ = new ArrayList();
    public List<String> LJJJI = new ArrayList();
    public String LJJJIL = "";
    public long LJJJJ = 0;
    public List<String> LJJJJI = new ArrayList();

    public final InterfaceC1139780flY LIZJ() {
        InterfaceC1139780flY interfaceC1139780flY = this.LJJIFFI;
        return interfaceC1139780flY == null ? new InterfaceC1139780flY() { // from class: X.0fhz
            @Override // X.InterfaceC1139780flY
            public final void LIZ() {
            }

            @Override // X.InterfaceC1139780flY
            public final void LIZIZ(boolean z, AssetsModel assetsModel, boolean z2, boolean z3, boolean z4) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LIZJ(boolean z) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJ(boolean z, boolean z2, boolean z3) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJFF(boolean z) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJI(String str, String str2) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJII() {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIIIZ(boolean z) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIIJ(int i) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIIJJI() {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIIL() {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIILIIL(C0T6Z c0t6z) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIILJJIL() {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIILL(long j, boolean z) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIILLIIL(int i, int i2) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIJ(String str, boolean z, boolean z2, boolean z3) {
            }

            @Override // X.InterfaceC1139780flY
            public final void LJIJI() {
            }

            @Override // X.InterfaceC1139780flY
            public final void onPlayEnd() {
            }
        } : interfaceC1139780flY;
    }

    public final List<Long> LIZLLL() {
        if (this.LJJIL == null) {
            this.LJJIL = new ArrayList();
        }
        return this.LJJIL;
    }

    public final List<Long> LJ() {
        if (this.LJJJ == null) {
            this.LJJJ = new ArrayList();
        }
        return this.LJJJ;
    }

    @Override // X.C1135280feI
    public final long LIZ() {
        return this.LJJ;
    }

    public final void LJFF(boolean z) {
        this.LJJIJL = z;
        InterfaceC1139780flY interfaceC1139780flY = this.LJJIFFI;
        if (interfaceC1139780flY != null) {
            interfaceC1139780flY.LIZJ(z);
        }
        LiveEffect liveEffect = this.LJJIJIL;
        if (liveEffect != null) {
            liveEffect.LLLIIL(z);
        }
    }
}
