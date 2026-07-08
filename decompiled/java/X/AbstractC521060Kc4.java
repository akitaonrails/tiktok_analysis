package X;

import X.AbstractC521080Kc6;
import Y.ARunnableS107S0100000_7;
import android.graphics.Bitmap;
import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.AwS443S0200000_7;

/* JADX INFO: renamed from: X.0Kc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC521060Kc4<T extends AbstractC521080Kc6> extends AbstractC498550Jgr<T> {
    public final ImageModel LIZLLL;
    public InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> LJ;
    public boolean LJFF;
    public Bitmap LJI;

    @Override // X.AbstractC498550Jgr
    public final void LJFF() {
        this.LJFF = false;
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = this.LJ;
        if (interfaceC1320200kSY != null) {
            interfaceC1320200kSY.close();
        }
    }

    public final void LJI() {
        if (this.LJI != null || this.LJFF) {
            return;
        }
        this.LJFF = true;
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = this.LJ;
        if (interfaceC1320200kSY != null) {
            interfaceC1320200kSY.close();
        }
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = null;
        C1325710kbR[] c1325710kbRArrLJ = C1324570kZb.LJ(this.LIZLLL, null, null, false);
        if (c1325710kbRArrLJ != null && c1325710kbRArrLJ.length != 0) {
            interfaceC1320200kSYLJI = C1328130kfL.LJIILIIL().LJIIL().LJI(c1325710kbRArrLJ[0], null);
        }
        this.LJ = interfaceC1320200kSYLJI;
        if (interfaceC1320200kSYLJI != null) {
            ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3(this) { // from class: X.0Kc3
                public final /* synthetic */ AbstractC521060Kc4<T> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY2) {
                    interfaceC1320200kSY2.close();
                    this.LIZ.LJFF = false;
                }

                @Override // X.AbstractC447090Hg3
                public final void LJI(Bitmap bitmap) {
                    InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY2 = this.LIZ.LJ;
                    if (interfaceC1320200kSY2 != null && interfaceC1320200kSY2.LIZ() && bitmap != null && !bitmap.isRecycled()) {
                        this.LIZ.LJI = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                        AbstractC498550Jgr abstractC498550Jgr = this.LIZ;
                        C786410Ut5.LJJZZIII(abstractC498550Jgr.LIZIZ, new ARunnableS107S0100000_7(abstractC498550Jgr, 258));
                        this.LIZ.LJFF = false;
                    } else {
                        this.LIZ.LJFF = false;
                    }
                    InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY3 = this.LIZ.LJ;
                    if (interfaceC1320200kSY3 != null) {
                        interfaceC1320200kSY3.close();
                    }
                }
            }, C822700WPc.LL);
        }
    }

    public AbstractC521060Kc4(Handler handler, ImageModel imageModel, AwS443S0200000_7 awS443S0200000_7) {
        super(handler, awS443S0200000_7);
        this.LIZLLL = imageModel;
    }
}
