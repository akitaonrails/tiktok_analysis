package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.IabSmallWindowConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS3S0001100_35;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.1D21, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D21 implements InterfaceC1036460d4u, InterfaceC1757230vpR {
    public final InterfaceC1757230vpR LIZ;
    public final FrameLayout LIZIZ;
    public final AwemeRawAd LIZJ;

    @Override // X.InterfaceC1757230vpR
    public final Size LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.InterfaceC1757230vpR
    public final void LIZIZ(Rect rect, Point point, Function0<Unit> function0) {
        this.LIZ.LIZIZ(rect, point, function0);
    }

    @Override // X.InterfaceC1757230vpR
    public final void Nj(InterfaceC20738816Di interfaceC20738816Di) {
        this.LIZ.Nj(interfaceC20738816Di);
    }

    @Override // X.InterfaceC1757230vpR
    public final void Sq(C2249291D1z c2249291D1z) {
        this.LIZ.Sq(c2249291D1z);
    }

    @Override // X.InterfaceC1757230vpR
    public final C1757130vpH cf() {
        return this.LIZ.cf();
    }

    @Override // X.InterfaceC1757230vpR
    public final void k(EnumC1757150vpJ enumC1757150vpJ, boolean z) {
        this.LIZ.k(enumC1757150vpJ, z);
    }

    @Override // X.InterfaceC1757230vpR
    public final void pause() {
        this.LIZ.pause();
    }

    @Override // X.InterfaceC1757230vpR
    public final void play() {
        this.LIZ.play();
    }

    @Override // X.InterfaceC1036460d4u
    public final void LIZJ(Rect rect, AwS560S0100000_16 awS560S0100000_16) {
        if (this.LIZIZ.getHeight() > 0 && this.LIZIZ.getWidth() > 0) {
            LIZLLL(rect, awS560S0100000_16);
        } else {
            this.LIZIZ.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2325321G0k(this, rect, awS560S0100000_16, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.1D1z] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZLLL(Rect rect, Function0<Unit> function0) {
        AdStyleActionModel adStyleActionModel;
        IabSmallWindowConfig iabSmallWindowConfig;
        Integer num;
        Point point;
        boolean z;
        int width;
        int height;
        AwemeRawAd awemeRawAd = this.LIZJ;
        if (awemeRawAd != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && (iabSmallWindowConfig = adStyleActionModel.iabSmallWindowConfig) != null && (num = iabSmallWindowConfig.smallWindowPosition) != null) {
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    point = new Point((this.LIZIZ.getWidth() - this.LIZ.LIZ().getWidth()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), (this.LIZIZ.getHeight() - this.LIZ.LIZ().getHeight()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
                } else {
                    return;
                }
            } else {
                point = new Point((this.LIZIZ.getWidth() - this.LIZ.LIZ().getWidth()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
            }
            C2249221D1s c2249221D1s = new C2249221D1s(new Object[0]);
            C1D20.LIZ.getClass();
            c2249221D1s.logAd(C1D20.LIZIZ, this.LIZJ);
            this.LIZ.Sq(new InterfaceC20738816Di() { // from class: X.1D1z
                @Override // X.InterfaceC20738816Di
                public final void LIZ(EnumC1757150vpJ enumC1757150vpJ, long j) {
                    int i = C1757160vpK.LIZ[enumC1757150vpJ.ordinal()];
                    int i2 = 1;
                    if (i != 1) {
                        i2 = 2;
                        if (i != 2) {
                            i2 = 0;
                        }
                    }
                    C2249221D1s c2249221D1s2 = new C2249221D1s(new Object[0]);
                    C1D20.LIZ.getClass();
                    c2249221D1s2.logAd(C1D20.LIZJ, this.LIZ.LIZJ, new AwS3S0001100_35(i2, j, 2));
                    this.LIZ.LIZ.Nj(this);
                }
            });
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            int width2 = this.LIZIZ.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            int height2 = this.LIZIZ.getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            InterfaceC1757230vpR interfaceC1757230vpR = this.LIZ;
            if (rect == null) {
                Integer numValueOf = Integer.valueOf(width2);
                if (numValueOf.intValue() - iLIZIZ >= this.LIZ.LIZ().getWidth()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    width = numValueOf.intValue();
                } else {
                    width = this.LIZ.LIZ().getWidth() + iLIZIZ;
                }
                Integer numValueOf2 = Integer.valueOf(height2);
                if (numValueOf2.intValue() - iLIZIZ2 >= this.LIZ.LIZ().getHeight()) {
                    height = numValueOf2.intValue();
                } else {
                    height = this.LIZ.LIZ().getHeight() + iLIZIZ2;
                }
                rect = new Rect(iLIZIZ, iLIZIZ2, width, height);
            }
            interfaceC1757230vpR.LIZIZ(rect, point, function0);
            this.LIZ.play();
        }
    }

    public C1D21(InterfaceC1757230vpR interfaceC1757230vpR, FrameLayout frameLayout, AwemeRawAd awemeRawAd) {
        this.LIZ = interfaceC1757230vpR;
        this.LIZIZ = frameLayout;
        this.LIZJ = awemeRawAd;
    }
}
