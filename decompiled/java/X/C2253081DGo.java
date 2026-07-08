package X;

import com.bytedance.bpea.basics.Cert;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253081DGo extends AbstractC2252991DGf {
    public final C2253181DGy LIZIZ;
    public final String LIZJ = "type_scene_cover";
    public final Set<String> LIZLLL = new LinkedHashSet();
    public final ReentrantLock LJ = new ReentrantLock(true);

    @Override // X.InterfaceC2190671AoT
    public final String getType() {
        return this.LIZJ;
    }

    public C2253081DGo(C2253181DGy c2253181DGy) {
        this.LIZIZ = c2253181DGy;
    }

    public final void LIZLLL(EnumC545560LaU enumC545560LaU, Cert cert) {
        String strName = enumC545560LaU.name();
        this.LJ.lock();
        String string = this.LIZLLL.toString();
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveApiManagement: onSceneCoverShow: sceneName: ");
        sbLIZ.append(strName);
        sbLIZ.append(", curSceneSet: ");
        sbLIZ.append(string);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZLLL.isEmpty()) {
            LIZ(new C2253021DGi(this.LIZJ, new C1660750tJp(2, 2), new C2253031DGj(this.LIZIZ.LIZ(new C2253101DGq(false), "action_name_stop_preview"), cert)));
        }
        this.LIZLLL.add(strName);
        this.LJ.unlock();
    }

    public final void LIZIZ(EnumC545560LaU enumC545560LaU, Cert cert, Boolean bool) {
        String strName = enumC545560LaU.name();
        this.LJ.lock();
        String string = this.LIZLLL.toString();
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveApiManagement: onSceneCoverHide: sceneName: ");
        sbLIZ.append(strName);
        sbLIZ.append(", curSceneSet: ");
        sbLIZ.append(string);
        sbLIZ.append('}');
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL.remove(strName);
        if (this.LIZLLL.isEmpty() || Intrinsics.LJFF(bool, Boolean.TRUE)) {
            LIZ(new C2253021DGi(this.LIZJ, new C1660750tJp(1, 1), new C2253031DGj(this.LIZIZ.LIZ(new C2253131DGt(false, 2), "action_name_start_preview"), cert)));
        }
        this.LJ.unlock();
    }
}
