package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.util.Body;
import com.ss.android.ugc.aweme.sticker.util.EffectMsg;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ssK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643700ssK implements InterfaceC1411260mpQ {
    public final InterfaceC1650230t2r LIZ;
    public final ShortVideoContext LIZIZ;
    public final Function0<Effect> LIZJ;

    @Override // X.InterfaceC1411260mpQ
    public final String LIZIZ() {
        return "RemoveResources";
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1411260mpQ
    public final InterfaceC1650230t2r getCameraApiComponent() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1411260mpQ
    public final void LIZ(int i, String str) {
        Body body;
        List<String> list;
        if (!C21363018iy.LJI(this.LIZJ.invoke())) {
            return;
        }
        try {
            C1227904rF.LIZ.getClass();
            EffectMsg effectMsg = (EffectMsg) C1227904rF.LIZIZ(str, EffectMsg.class);
            if (effectMsg != null && (body = effectMsg.body) != null && (list = body.removeResourceList) != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    this.LIZIZ.cameraComponentModel.mWorkspace.LL.ll(it2.next());
                }
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1643700ssK(InterfaceC1650230t2r interfaceC1650230t2r, ShortVideoContext shortVideoContext, Function0<? extends Effect> function0) {
        this.LIZ = interfaceC1650230t2r;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = function0;
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZJ(int i, int i2, int i3, String str) {
        return C1411250mpP.LIZ(this, i, i2, i3, str);
    }
}
