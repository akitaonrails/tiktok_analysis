package X;

import android.os.Message;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.ss.ugc.android.editor.components.base.FrameInterpolator;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;

/* JADX INFO: renamed from: X.0E5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359010E5r {
    public final C0E48 LIZ;
    public final C358490E3r LIZLLL;
    public NLENode LJIIIIZZ;
    public C359080E5y LJIIJJI;
    public final ArrayList<Pair<Long, Long>> LIZIZ = new ArrayList<>();
    public final ArrayList<C351480DqE> LIZJ = new ArrayList<>();
    public final C359040E5u LJ = new C359040E5u(this);
    public final int LJFF = C0FU0.LIZ(15.0f);
    public final FrameInterpolator LJI = new FrameInterpolator(new C0FDG() { // from class: X.0E5t
        @Override // X.C0FDG
        public final void handleMsg(Message message) {
            C359080E5y c359080E5y = this.LIZ.LJIIJJI;
            if (c359080E5y != null) {
                c359080E5y.LIZ.i3(new AwS20S0001000_5(message.arg1, 19));
            }
        }
    });
    public boolean LJII = true;
    public int LJIIIZ = -1;
    public float LJIIJ = C368130Ebz.LIZJ;
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(210));

    public final void LIZ() {
        C359040E5u c359040E5u = this.LJ;
        c359040E5u.LLILLJJLI.LJI.LIZ();
        c359040E5u.LLILLJJLI.LIZ.LLFII().LJLIL();
        c359040E5u.LLILLJJLI.LIZ.getPlayer().LJJIII(c359040E5u);
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).removeObserver(c359040E5u);
    }

    public C359010E5r(C0E48 c0e48) {
        this.LIZ = c0e48;
        this.LIZLLL = new C358490E3r(c0e48);
    }
}
