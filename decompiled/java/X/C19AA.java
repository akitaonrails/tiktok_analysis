package X;

import Y.ARunnableS105S0000000_32;
import Y.ARunnableS132S0100000_32;
import com.bytedance.scene.Scene;
import com.bytedance.scene.group.GroupRecord;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19AA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19AA extends AbstractC21495219Ag {
    public final int LJI;
    public final String LJII;
    public final EnumC214943199x LJIIIIZZ;
    public final /* synthetic */ C19A4 LJIIIZ;

    public abstract void LIZIZ(boolean z);

    public void LIZJ(boolean z) {
    }

    public final void LIZ(ARunnableS105S0000000_32 aRunnableS105S0000000_32) {
        HashMap<Scene, C1447920nmY> map = C19A4.LJIIIIZZ;
        C1447920nmY c1447920nmY = map.get(this.LIZ);
        if (c1447920nmY != null) {
            c1447920nmY.LIZ();
            if (map.get(this.LIZ) != null) {
                throw new C214826195k("CancellationSignal cancel callback should remove target Scene from CancellationSignal map");
            }
        }
        if (!this.LJIIIZ.LIZJ(this.LIZ)) {
            if (this.LIZ.mState == EnumC214943199x.NONE) {
                C19BL.LJI(this.LJII, "tag can't be null");
                C19AY c19ay = this.LJIIIZ.LIZJ;
                int i = this.LJI;
                Scene scene = this.LIZ;
                String str = this.LJII;
                GroupRecord groupRecord = new GroupRecord();
                groupRecord.LL = i;
                C19BL.LJI(scene, "scene can't be null");
                groupRecord.LLILLJJLI = scene;
                C19BL.LJI(str, "tag can't be null");
                groupRecord.LLILLL = str;
                groupRecord.LLILZIL = scene.getClass().getName();
                ((ArrayList) c19ay.LIZ).add(groupRecord);
                ((HashMap) c19ay.LIZIZ).put(groupRecord.LLILLJJLI, groupRecord);
                ((HashMap) c19ay.LIZJ).put(groupRecord.LLILLL, groupRecord);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Scene state is ");
                sbLIZ.append(this.LIZ.mState.name);
                sbLIZ.append(" but it is not added to record list");
                throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        boolean z = false;
        if (this.LIZJ) {
            this.LJIIIZ.LIZJ.LIZ(this.LIZ).isHidden = false;
        }
        if (this.LIZLLL) {
            this.LJIIIZ.LIZJ.LIZ(this.LIZ).isHidden = true;
        }
        if (this.LIZ.mState != this.LJIIIIZZ) {
            z = true;
        }
        LIZJ(z);
        this.LJIIIZ.LIZ(this.LIZ);
        C19A4 c19a4 = this.LJIIIZ;
        c19a4.LJIIIIZZ(c19a4.LIZ, this.LIZ, this.LJIIIIZZ, this.LJ, new ARunnableS132S0100000_32(this, 22));
        if (this.LJ) {
            C19AY c19ay2 = this.LJIIIZ.LIZJ;
            GroupRecord groupRecordLIZ = c19ay2.LIZ(this.LIZ);
            ((ArrayList) c19ay2.LIZ).remove(groupRecordLIZ);
            ((HashMap) c19ay2.LIZIZ).remove(groupRecordLIZ.LLILLJJLI);
            ((HashMap) c19ay2.LIZJ).remove(groupRecordLIZ.LLILLL);
        }
        LIZIZ(z);
        aRunnableS105S0000000_32.run();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19AA(C19A4 c19a4, Scene scene, int i, String str, EnumC214943199x enumC214943199x, boolean z, boolean z2, boolean z3) {
        super(c19a4, scene, enumC214943199x, z, z2, z3);
        this.LJIIIZ = c19a4;
        if (z && z2) {
            throw new IllegalArgumentException("cant forceShow with forceHide");
        }
        this.LJI = i;
        this.LJII = str;
        this.LJIIIIZZ = enumC214943199x;
    }
}
