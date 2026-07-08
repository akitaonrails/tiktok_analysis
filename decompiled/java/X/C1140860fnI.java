package X;

import android.os.Message;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0fnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140860fnI implements InterfaceC1140870fnJ {
    public final String LIZ;
    public final List<InterfaceC1140870fnJ> LIZIZ;

    @Override // X.InterfaceC1140870fnJ
    public final void LIZIZ(EnumC1138990fkH enumC1138990fkH) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_ttlive_gift_render");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LifeCycle#onStop ");
        sbLIZ2.append(enumC1138990fkH);
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        List<InterfaceC1140870fnJ> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1140870fnJ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(enumC1138990fkH);
            }
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LIZJ(EnumC1138990fkH enumC1138990fkH) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_ttlive_gift_render");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LifeCycle#onPrepare ");
        sbLIZ2.append(enumC1138990fkH);
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        List<InterfaceC1140870fnJ> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1140870fnJ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(enumC1138990fkH);
            }
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LIZLLL(EnumC1138990fkH enumC1138990fkH) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_ttlive_gift_render");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LifeCycle#onFirstFrame ");
        sbLIZ2.append(enumC1138990fkH);
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        List<InterfaceC1140870fnJ> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1140870fnJ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(enumC1138990fkH);
            }
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJFF(EnumC1138990fkH enumC1138990fkH) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_ttlive_gift_render");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LifeCycle#onPrepared ");
        sbLIZ2.append(enumC1138990fkH);
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        List<InterfaceC1140870fnJ> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1140870fnJ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF(enumC1138990fkH);
            }
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJII(EnumC1138990fkH enumC1138990fkH) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_ttlive_gift_render");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LifeCycle#onLoad ");
        sbLIZ2.append(enumC1138990fkH);
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        List<InterfaceC1140870fnJ> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1140870fnJ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJII(enumC1138990fkH);
            }
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJIIIIZZ(EnumC1138990fkH enumC1138990fkH) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_ttlive_gift_render");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LifeCycle#onLoaded ");
        sbLIZ2.append(enumC1138990fkH);
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        List<InterfaceC1140870fnJ> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1140870fnJ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIIIZZ(enumC1138990fkH);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1140860fnI(String str, List<? extends InterfaceC1140870fnJ> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LIZ(EnumC1138990fkH enumC1138990fkH, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_ttlive_gift_render");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LifeCycle#onSecondFrame ");
        sbLIZ2.append(enumC1138990fkH);
        sbLIZ2.append(", isUseFirstFrameTs:");
        sbLIZ2.append(z);
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        List<InterfaceC1140870fnJ> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1140870fnJ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(enumC1138990fkH, z);
            }
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJ(EnumC1138990fkH enumC1138990fkH, Message message) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_ttlive_gift_render");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LifeCycle#onPlayInfo ");
        sbLIZ2.append(enumC1138990fkH);
        sbLIZ2.append(" ,what:");
        sbLIZ2.append(message.what);
        sbLIZ2.append(", arg1:");
        sbLIZ2.append(message.arg1);
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        List<InterfaceC1140870fnJ> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1140870fnJ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJ(enumC1138990fkH, message);
            }
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJI(EnumC1138990fkH enumC1138990fkH, C1141050fnb c1141050fnb) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_ttlive_gift_render");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LifeCycle#onError ");
        sbLIZ2.append(enumC1138990fkH);
        sbLIZ2.append(", ");
        sbLIZ2.append(c1141050fnb);
        C20441214yg.LJ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        List<InterfaceC1140870fnJ> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1140870fnJ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJI(enumC1138990fkH, c1141050fnb);
            }
        }
    }

    @Override // X.InterfaceC1140870fnJ
    public final void LJIIIZ(EnumC1138990fkH enumC1138990fkH, C1138610fjf c1138610fjf) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_ttlive_gift_render");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LifeCycle#onComplete ");
        sbLIZ2.append(enumC1138990fkH);
        C20441214yg.LJIIIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        List<InterfaceC1140870fnJ> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC1140870fnJ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIIZ(enumC1138990fkH, c1138610fjf);
            }
        }
    }
}
