package X;

import Y.AObjectS316S0200000_22;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS106S0210000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.1232, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1232 implements InterfaceC1447180nlM {
    public AnonymousClass1231 LIZ;
    public final C1462840oAc LIZIZ = new C1462840oAc(null);

    @Override // X.InterfaceC1447180nlM
    public final void LIZIZ() {
        int iIndexOf;
        C11UQ c11uq;
        int i;
        AnonymousClass1231 anonymousClass1231 = this.LIZ;
        if (anonymousClass1231 != null) {
            C11UQ c11uq2 = anonymousClass1231.LJIILIIL.LLJIJIL;
            c11uq2.LLILZIL = 0;
            c11uq2.notifyDataSetChanged();
        }
        AnonymousClass1231 anonymousClass12312 = this.LIZ;
        if (anonymousClass12312 != null) {
            int i2 = C992370bvn.LIZ[EnumC992360bvm.STANDARD.ordinal()];
            if (i2 == 1) {
                anonymousClass12312.LJIILIIL.LJ(null, true);
                return;
            }
            if (i2 != 2) {
                throw new C1954807lC();
            }
            C194455115x c194455115x = anonymousClass12312.LJIILIIL;
            Iterator it2 = ((ArrayList) c194455115x.LLJI).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((C11UK) next).LLILLL.ifStandard) {
                    if (next != null && (iIndexOf = ((ArrayList) c194455115x.LLJI).indexOf(next)) != 0 && (i = (c11uq = c194455115x.LLJIJIL).LLILZIL) != iIndexOf) {
                        c11uq.LLILZIL = iIndexOf;
                        if (i != 0) {
                            c11uq.notifyItemChanged(i);
                        }
                        int i3 = c11uq.LLILZIL;
                        if (i3 != 0) {
                            c11uq.notifyItemChanged(i3);
                        }
                    }
                }
            }
            for (Object obj : (ArrayList) anonymousClass12312.LJI) {
                if (((C11UK) obj).LLILLL.ifStandard) {
                    if (obj != null) {
                        anonymousClass12312.LJIIL.invoke(obj);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC1447180nlM
    public final void LIZ() {
        C0FI2.LJIJJ().LJJIZ(C0CHQ.LIZ);
    }

    @Override // X.InterfaceC1447180nlM
    public final void init() {
        C19565911gn.LIZ();
        C122T.LIZ();
        C122T.LIZIZ();
    }

    @Override // X.InterfaceC1447180nlM
    public final AnonymousClass1231 LJII() {
        return this.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.LJFF(r0.LLLLJI, new X.AnonymousClass1248(r0.LJIILIIL()))) != false) goto L9;
     */
    @Override // X.InterfaceC1447180nlM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(kotlin.jvm.functions.Function1 r6, boolean r7) {
        /*
            r5 = this;
            kotlin.jvm.internal.AwS395S0200000_29 r3 = new kotlin.jvm.internal.AwS395S0200000_29
            r0 = 118(0x76, float:1.65E-43)
            r3.<init>(r5, r6, r0)
            X.1231 r4 = r5.LIZ
            if (r4 == 0) goto L4d
            if (r7 != 0) goto L2e
            X.1230 r0 = r4.LJI()
            boolean r0 = r0.LJJJ()
            if (r0 == 0) goto L3d
            X.1230 r0 = r4.LJI()
            X.1248 r2 = r0.LLLLJI
            X.1248 r1 = new X.1248
            java.util.List r0 = r0.LJIILIIL()
            r1.<init>(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L3d
        L2e:
            kotlin.jvm.internal.AwS608S0100000_29 r2 = r4.LJIJ
            if (r2 == 0) goto L3c
            kotlin.jvm.internal.AwS395S0200000_29 r1 = new kotlin.jvm.internal.AwS395S0200000_29
            r0 = 60
            r1.<init>(r4, r3, r0)
            r2.invoke(r1)
        L3c:
            return
        L3d:
            X.1230 r2 = r4.LJI()
            r1 = 0
            com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel r0 = r4.LJFF
            r2.LJJIZ(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.invoke(r0)
            return
        L4d:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1232.LIZLLL(kotlin.jvm.functions.Function1, boolean):void");
    }

    @Override // X.InterfaceC1447180nlM
    public final void LJ(C19GS c19gs, C1447190nlN c1447190nlN) {
        AnonymousClass1249 anonymousClass1249 = new AnonymousClass1249();
        anonymousClass1249.LIZ = true;
        anonymousClass1249.LIZIZ = c1447190nlN.LJII;
        FrameLayout frameLayout = c1447190nlN.LIZ;
        AnonymousClass1231 anonymousClass1231 = new AnonymousClass1231(c19gs, frameLayout, c1447190nlN.LIZIZ, c1447190nlN.LIZJ, c1447190nlN.LIZLLL, c1447190nlN.LJ, anonymousClass1249);
        anonymousClass1231.LIZLLL("coverpic", C804420Vh2.LJI(c19gs), "covertext", new AwS573S0100000_29(c1447190nlN, anonymousClass1231, 1142));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        C194455115x c194455115x = anonymousClass1231.LJIILIIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c194455115x);
        c194455115x.setLayoutParams(layoutParams);
        ViewParent parent = anonymousClass1231.LJIILIIL.getParent();
        if (parent != null) {
            C786410Ut5.LJJJLZIJ(anonymousClass1231.LJIILIIL, (ViewGroup) parent);
        }
        frameLayout.addView(anonymousClass1231.LJIILIIL);
        anonymousClass1231.LJIIZILJ = new C1462840oAc(c1447190nlN.LJFF);
        anonymousClass1231.LJI().LLLJ = anonymousClass1231.LJIIZILJ;
        anonymousClass1231.LJIJI = c1447190nlN.LJI;
        anonymousClass1231.LJIJ = new AwS608S0100000_29(c19gs, 897);
        this.LIZ = anonymousClass1231;
    }

    @Override // X.InterfaceC1447180nlM
    public final void LJFF(AObjectS316S0200000_22 aObjectS316S0200000_22, boolean z) {
        AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(this, aObjectS316S0200000_22, 119);
        AnonymousClass1231 anonymousClass1231 = this.LIZ;
        if (anonymousClass1231 != null) {
            if (z) {
                AwS608S0100000_29 awS608S0100000_29 = anonymousClass1231.LJIJ;
                if (awS608S0100000_29 != null) {
                    awS608S0100000_29.invoke(new AwS395S0200000_29(anonymousClass1231, awS395S0200000_29, 61));
                    return;
                }
                return;
            }
            anonymousClass1231.LJI().LJJIZ(false, anonymousClass1231.LJFF);
            awS395S0200000_29.invoke(Boolean.TRUE);
            return;
        }
        awS395S0200000_29.invoke(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed A[PHI: r3
      0x00ed: PHI (r3v1 int) = (r3v0 int), (r3v7 int) binds: [B:60:0x00e9, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2 A[PHI: r2 r3
      0x00f2: PHI (r2v2 int) = (r2v1 int), (r2v6 int) binds: [B:63:0x00ee, B:14:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:63:0x00ee, B:14:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7 A[PHI: r1 r2 r3
      0x00f7: PHI (r1v2 int) = (r1v1 int), (r1v4 int) binds: [B:66:0x00f3, B:17:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:66:0x00f3, B:17:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r3v3 int) = (r3v2 int), (r3v5 int) binds: [B:66:0x00f3, B:17:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1447180nlM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r34, int r35, int r36, boolean r37, boolean r38, boolean r39, boolean r40, kotlin.jvm.functions.Function0 r41) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1232.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int, int, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // X.InterfaceC1447180nlM
    public final void LJI(BaseShortVideoContext baseShortVideoContext, EffectTextModel effectTextModel, int i, int i2, boolean z, boolean z2, boolean z3, Function0<Unit> function0) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        Integer num;
        AwS106S0210000_29 awS106S0210000_29 = new AwS106S0210000_29(z2, (boolean) this, (AnonymousClass1232) function0, (Function0<Unit>) 2);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        PublishCustomCoverModel publishCustomCoverModel = videoPublishEditModel.creativeModel.publishCustomCoverModel;
        boolean z5 = false;
        if (publishCustomCoverModel.isCoverUpload == 1) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (publishCustomCoverModel.isCoverCrop == 1) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (publishCustomCoverModel.isCoverAddText == 1) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (publishCustomCoverModel.isCoverChangeFrame == 1) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        if (i3 != 1 && i4 != 1 && i5 != 1 && i6 != 1) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        int[] iArrLJFF = C1439880nZa.LJFF(videoPublishEditModel);
        if (z3) {
            iArrLJFF = new int[]{i, i2};
        }
        AnonymousClass1231 anonymousClass1231 = this.LIZ;
        Integer num2 = null;
        boolean z6 = z;
        int i8 = z6;
        if (anonymousClass1231 != null) {
            PublishCustomCoverModel publishCustomCoverModel2 = videoPublishEditModel.creativeModel.publishCustomCoverModel;
            String strLJI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJI(videoPublishEditModel, "");
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(iArrLJFF[0]), Integer.valueOf(iArrLJFF[1]));
            if (videoPublishEditModel.creativeModel.editPostModel != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            C1440930nbH c1440930nbH = C857150Xjt.LIZIZ;
            if (c1440930nbH != null) {
                num = c1440930nbH.LIZLLL;
            } else {
                num = null;
            }
            boolean z7 = z6 ? 1 : 0;
            anonymousClass1231.LIZJ(effectTextModel, publishCustomCoverModel2, strLJI, pair, z7, z4, num, awS106S0210000_29, true);
            i8 = z7;
        }
        if (this.LIZ == null) {
            awS106S0210000_29.invoke();
            C1462840oAc c1462840oAc = this.LIZIZ;
            if (videoPublishEditModel.creativeModel.editPostModel != null) {
                z5 = true;
            }
            C1440930nbH c1440930nbH2 = C857150Xjt.LIZIZ;
            if (c1440930nbH2 != null) {
                num2 = c1440930nbH2.LIZLLL;
            }
            c1462840oAc.LIZLLL(new C1462850oAd(z5, null, null, null, null, null, 0, i8, 0, 0, null, i5, i3, i4, i6, i7, num2, 1918));
        }
    }
}
