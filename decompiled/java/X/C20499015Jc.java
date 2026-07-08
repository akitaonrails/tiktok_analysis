package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.MusicStreamConfig;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15Jc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20499015Jc implements InterfaceC1459150o4f {
    public final List<MusicModel> LIZ;
    public final int LIZIZ;
    public int LIZLLL;
    public final C01GW LJ;
    public final ExecutorService LIZJ = C786410Ut5.h4();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1304));

    public final void LIZ() {
        int size = this.LIZ.size();
        int i = this.LIZLLL;
        if (size <= i || i >= this.LIZIZ) {
            return;
        }
        List<MusicModel> list = this.LIZ;
        this.LIZLLL = i + 1;
        final MusicModel musicModel = (MusicModel) ListProtector.get(list, i);
        C01GW c01gw = C20500815Ju.LIZIZ;
        if (((MusicStreamConfig) c01gw.getValue()).isEnable) {
            C202045143v.LJ(musicModel, false, true, new AbstractC1661230tKb() { // from class: X.0tKd
            }, new InterfaceC202048143y() { // from class: X.15Jp
                @Override // X.InterfaceC202048143y
                public final void LJJJLIIL(String str) {
                }

                @Override // X.InterfaceC202048143y
                public final void LIZIZ() {
                    C20499015Jc c20499015Jc = this.LIZ;
                    C0CNO.LIZ(c20499015Jc.LIZJ, new AwS432S0200000_31(c20499015Jc, musicModel, 84));
                }

                @Override // X.InterfaceC202048143y
                public final void LIZ(int i2, String str) {
                    this.LIZ.LIZ();
                }

                @Override // X.InterfaceC202048143y
                public final void LIZJ(String str, boolean z) {
                    this.LIZ.LIZ();
                }
            }, ((MusicStreamConfig) c01gw.getValue()).startPlayProgress, ((MusicStreamConfig) c01gw.getValue()).netLevelThreshold);
        } else {
            C0CNO.LIZ(this.LIZJ, new AwS432S0200000_31(this, musicModel, 85));
        }
    }

    @Override // X.InterfaceC1459150o4f
    public final void cancel() {
        ((C202033143j) this.LJ.getValue()).release();
    }

    @Override // X.InterfaceC1459150o4f
    public final void load() {
        if (this.LIZ.isEmpty()) {
            return;
        }
        LIZ();
    }

    public C20499015Jc(int i, Context context, List list) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LJ = C452501pT.LIZIZ(new AwS567S0100000_23(context, 108));
    }
}
