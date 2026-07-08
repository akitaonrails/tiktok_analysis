package X;

import Y.ARunnableS107S0100000_7;
import Y.ARunnableS76S0200000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.0Kc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521110Kc9 extends AbstractC498550Jgr<C521210KcJ> implements InterfaceC1110900f0y {
    public final int LIZLLL;
    public final BadgeStruct LJ;
    public final Context LJFF;
    public final C521100Kc8 LJI;
    public final C521150KcD LJII;
    public final Runnable LJIIIIZZ;
    public Bitmap LJIIIZ;
    public Bitmap LJIIJ;
    public Bitmap LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public C11NJ LJIJ;
    public boolean LJIJI;
    public C521210KcJ LJIJJ;

    @Override // X.AbstractC498550Jgr
    public final void LJFF() {
        this.LJIIL = false;
        this.LJIILIIL = false;
        C11NJ c11nj = this.LJIJ;
        if (c11nj != null) {
            c11nj.LJ();
        }
        this.LJIJ = null;
    }

    @Override // X.AbstractC498530Jgp
    public final AbstractC521080Kc6 LJ() {
        String string;
        CharSequence charSequence = this.LJII.LIZIZ;
        if (charSequence == null || charSequence.length() == 0) {
            charSequence = this.LJII.LIZJ;
        }
        Context context = this.LJFF;
        Bitmap bitmap = this.LJIIIZ;
        Bitmap bitmap2 = this.LJIIJ;
        Bitmap bitmap3 = this.LJIIJJI;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        C521210KcJ c521210KcJ = new C521210KcJ(context, bitmap, bitmap2, bitmap3, string, this.LJI);
        this.LJIJJ = c521210KcJ;
        Runnable runnable = this.LJIIIIZZ;
        if (runnable != null) {
            c521210KcJ.LJ = runnable;
        }
        return c521210KcJ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.0Kc9 for r2v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void LJI() {
        /*
            r2 = this;
            boolean r0 = r2.LJIILL
            if (r0 == 0) goto L18
            boolean r0 = r2.LJIILLIIL
            if (r0 == 0) goto L18
            boolean r0 = r2.LJIJI
            if (r0 != 0) goto L18
            r0 = 1
            r2.LJIJI = r0
            kotlin.jvm.functions.Function2<X.0Jgr<T extends X.0Kc6>, java.lang.Boolean, kotlin.Unit> r1 = r2.LIZJ
            if (r1 == 0) goto L18
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.invoke(r2, r0)
        L18:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C521110Kc9.LJI():void");
    }

    public final void LJIIIIZZ() {
        C11NJ c11nj;
        C11NJ c11nj2;
        C11NJ c11nj3;
        if (((!this.LJIILL && !this.LJIIL) || ((!this.LJIILLIIL && !this.LJIILIIL) || (!this.LJIIZILJ && !this.LJIILJJIL))) && this.LJIJ == null) {
            this.LJIJ = new C11NJ();
        }
        if (!this.LJIILL && !this.LJIIL) {
            this.LJIIL = true;
            C11JF c11jfLIZ = C1121700fIO.LIZ(this.LJII.LIZ, new InterfaceC1121710fIP() { // from class: X.0KcA
                @Override // X.InterfaceC1121710fIP
                public final void onFail() {
                    C521110Kc9 c521110Kc9 = this.LIZ;
                    C786410Ut5.LJJZZIII(c521110Kc9.LIZIZ, new ARunnableS107S0100000_7(c521110Kc9, 255));
                    C521110Kc9 c521110Kc92 = this.LIZ;
                    BadgeStruct badgeStruct = c521110Kc92.LJ;
                    if (badgeStruct == null || badgeStruct.badgeScene != 8) {
                        return;
                    }
                    C521100Kc8 c521100Kc8 = c521110Kc92.LJI;
                    c521110Kc92.LJII(c521100Kc8 != null ? c521100Kc8.LJIILJJIL : -1, false);
                }

                @Override // X.InterfaceC1121710fIP
                public final void LIZIZ(Bitmap bitmap) {
                    int i;
                    C521110Kc9 c521110Kc9 = this.LIZ;
                    C786410Ut5.LJJZZIII(c521110Kc9.LIZIZ, new ARunnableS76S0200000_7(bitmap, c521110Kc9, 74));
                    C521110Kc9 c521110Kc92 = this.LIZ;
                    BadgeStruct badgeStruct = c521110Kc92.LJ;
                    if (badgeStruct != null && badgeStruct.badgeScene == 8) {
                        C521100Kc8 c521100Kc8 = c521110Kc92.LJI;
                        if (c521100Kc8 != null) {
                            i = c521100Kc8.LJIILJJIL;
                        } else {
                            i = -1;
                        }
                        c521110Kc92.LJII(i, true);
                    }
                }
            });
            if (c11jfLIZ != null && (c11nj3 = this.LJIJ) != null) {
                c11nj3.LIZ(c11jfLIZ);
            }
        }
        if (!this.LJIILLIIL && !this.LJIILIIL) {
            this.LJIILIIL = true;
            C11JF c11jfLIZ2 = C1121700fIO.LIZ(this.LJII.LIZLLL, new InterfaceC1121710fIP() { // from class: X.0KcB
                @Override // X.InterfaceC1121710fIP
                public final void onFail() {
                    C521110Kc9 c521110Kc9 = this.LIZ;
                    C786410Ut5.LJJZZIII(c521110Kc9.LIZIZ, new ARunnableS107S0100000_7(c521110Kc9, 256));
                    C521110Kc9 c521110Kc92 = this.LIZ;
                    BadgeStruct badgeStruct = c521110Kc92.LJ;
                    if (badgeStruct == null || badgeStruct.badgeScene != 8) {
                        return;
                    }
                    C521100Kc8 c521100Kc8 = c521110Kc92.LJI;
                    c521110Kc92.LJII(c521100Kc8 != null ? c521100Kc8.LJIILJJIL : -1, false);
                }

                @Override // X.InterfaceC1121710fIP
                public final void LIZIZ(Bitmap bitmap) {
                    int i;
                    C521110Kc9 c521110Kc9 = this.LIZ;
                    C786410Ut5.LJJZZIII(c521110Kc9.LIZIZ, new ARunnableS76S0200000_7(bitmap, c521110Kc9, 75));
                    C521110Kc9 c521110Kc92 = this.LIZ;
                    BadgeStruct badgeStruct = c521110Kc92.LJ;
                    if (badgeStruct != null && badgeStruct.badgeScene == 8) {
                        C521100Kc8 c521100Kc8 = c521110Kc92.LJI;
                        if (c521100Kc8 != null) {
                            i = c521100Kc8.LJIILJJIL;
                        } else {
                            i = -1;
                        }
                        c521110Kc92.LJII(i, true);
                    }
                }
            });
            if (c11jfLIZ2 != null && (c11nj2 = this.LJIJ) != null) {
                c11nj2.LIZ(c11jfLIZ2);
            }
        }
        if (!this.LJIIZILJ && !this.LJIILJJIL) {
            this.LJIILJJIL = true;
            C11JF c11jfLIZ3 = C1121700fIO.LIZ(this.LJII.LJ, new InterfaceC1121710fIP() { // from class: X.0KcC
                @Override // X.InterfaceC1121710fIP
                public final void onFail() {
                    C521110Kc9 c521110Kc9 = this.LIZ;
                    C786410Ut5.LJJZZIII(c521110Kc9.LIZIZ, new ARunnableS107S0100000_7(c521110Kc9, 257));
                    C521110Kc9 c521110Kc92 = this.LIZ;
                    BadgeStruct badgeStruct = c521110Kc92.LJ;
                    if (badgeStruct == null || badgeStruct.badgeScene != 8) {
                        return;
                    }
                    C521100Kc8 c521100Kc8 = c521110Kc92.LJI;
                    c521110Kc92.LJII(c521100Kc8 != null ? c521100Kc8.LJIILJJIL : -1, false);
                }

                @Override // X.InterfaceC1121710fIP
                public final void LIZIZ(Bitmap bitmap) {
                    int i;
                    C521110Kc9 c521110Kc9 = this.LIZ;
                    C786410Ut5.LJJZZIII(c521110Kc9.LIZIZ, new ARunnableS76S0200000_7(bitmap, c521110Kc9, 76));
                    C521110Kc9 c521110Kc92 = this.LIZ;
                    BadgeStruct badgeStruct = c521110Kc92.LJ;
                    if (badgeStruct != null && badgeStruct.badgeScene == 8) {
                        C521100Kc8 c521100Kc8 = c521110Kc92.LJI;
                        if (c521100Kc8 != null) {
                            i = c521100Kc8.LJIILJJIL;
                        } else {
                            i = -1;
                        }
                        c521110Kc92.LJII(i, true);
                    }
                }
            });
            if (c11jfLIZ3 != null && (c11nj = this.LJIJ) != null) {
                c11nj.LIZ(c11jfLIZ3);
            }
        }
        LJI();
    }

    @Override // X.InterfaceC1110900f0y
    public final BadgeStruct LIZIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC498530Jgp
    public final int LIZLLL() {
        return this.LIZLLL;
    }

    public final void LJII(int i, boolean z) {
        Object objLJJJLZIJ;
        List urls;
        ImageModel imageModel = this.LJII.LIZ;
        String str = "";
        if (imageModel == null || (urls = imageModel.getUrls()) == null || (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urls)) == null) {
            objLJJJLZIJ = "";
        }
        if (i != 1) {
            if (i == 6) {
                str = "user_level_avatar";
            }
        } else {
            str = "user_level_badge";
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_badge_load_result", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()));
        c474500IjALIZIZ.LJJII(Integer.valueOf(z ? 1 : 0), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZIZ.LJJII(objLJJJLZIJ, "uri");
        c474500IjALIZIZ.LJJII(str, Scene.SCENE_SERVICE);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
        } else {
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJIIIIZZ();
            c474500IjALIZIZ.LJJIJL();
        }
    }

    public C521110Kc9(int i, Handler handler, C521010Kbz c521010Kbz, BadgeStruct badgeStruct, Context context, C521100Kc8 c521100Kc8, C521150KcD c521150KcD, ARunnableS76S0200000_7 aRunnableS76S0200000_7) {
        boolean z;
        boolean z2;
        super(handler, c521010Kbz);
        this.LIZLLL = i;
        this.LJ = badgeStruct;
        this.LJFF = context;
        this.LJI = c521100Kc8;
        this.LJII = c521150KcD;
        this.LJIIIIZZ = aRunnableS76S0200000_7;
        if (!c521100Kc8.LIZ) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILL = z;
        if (!c521100Kc8.LIZLLL) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIILLIIL = z2;
        this.LJIIZILJ = c521100Kc8.LIZJ ? false : true;
    }
}
