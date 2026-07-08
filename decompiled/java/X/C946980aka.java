package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0aka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946980aka implements LifecycleOwner {
    public final DataChannel LL;
    public C1295960jpS LLILLL;
    public InterfaceC940910aan LLILZIL;
    public InterfaceC940910aan LLILZLL;
    public C09AY LLIZ;
    public final LifecycleRegistry LLILLJJLI = new LifecycleRegistry(this);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(338));

    public final InterfaceC946970akZ LIZIZ() {
        return (InterfaceC946970akZ) this.LLILZ.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    public C946980aka(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public static final void LIZ(final C946980aka c946980aka) {
        EnumC947440alK enumC947440alK;
        final C1295960jpS c1295960jpS;
        String strLIZJ;
        C947420alI c947420alILJII;
        InterfaceC946970akZ interfaceC946970akZLIZIZ = c946980aka.LIZIZ();
        C949180ao8 c949180ao8LIZIZ = null;
        if (interfaceC946970akZLIZIZ != null && (c947420alILJII = interfaceC946970akZLIZIZ.LJII()) != null) {
            enumC947440alK = c947420alILJII.LIZJ;
        } else {
            enumC947440alK = null;
        }
        if (enumC947440alK == EnumC947440alK.PLAYING && c946980aka.LLILLL != null && (c1295960jpS = c946980aka.LLILLL) != null) {
            final AwS381S0200000_15 awS381S0200000_15 = new AwS381S0200000_15(c946980aka, c1295960jpS, 115);
            if (MultiGuestSocialGameLetsDanceSetting.config().particleAnimationType == 2) {
                C20441214yg.LIZIZ("LetsDanceBackgroundEffectManager", "loadLetsDanceAnimationRes, load repeat lottie from default gecko path");
                c946980aka.LLIZ = new AwS381S0200000_15(c1295960jpS, c946980aka, awS381S0200000_15, 117);
                C1143680frq.LJIILIIL(c1295960jpS, "tiktok_live_interaction_normal_4", "lets_dance_bg_lottie.zip", "images", false, new C987230bnV(awS381S0200000_15, 2), Boolean.FALSE, null, new WeakReference(c946980aka.LLIZ));
                return;
            }
            C20441214yg.LIZIZ("LetsDanceBackgroundEffectManager", "loadLetsDanceAnimationRes, load target lottie from effect package");
            InterfaceC946970akZ interfaceC946970akZLIZIZ2 = c946980aka.LIZIZ();
            if (interfaceC946970akZLIZIZ2 != null && (strLIZJ = interfaceC946970akZLIZIZ2.LIZJ(EnumC947020ake.GAME_BG_LOTTIE)) != null && strLIZJ.length() != 0) {
                C20441214yg.LIZIZ("LetsDanceBackgroundEffectManager", "loadLetsDanceAnimationRes, has local cache");
                LIZJ(c946980aka, c1295960jpS, strLIZJ, awS381S0200000_15);
                return;
            }
            InterfaceC940910aan interfaceC940910aan = c946980aka.LLILZLL;
            if (interfaceC940910aan != null) {
                interfaceC940910aan.unsubscribe();
            }
            InterfaceC946970akZ interfaceC946970akZLIZIZ3 = c946980aka.LIZIZ();
            if (interfaceC946970akZLIZIZ3 != null) {
                c949180ao8LIZIZ = interfaceC946970akZLIZIZ3.LIZIZ(Collections.singletonList(EnumC947020ake.GAME_BG_LOTTIE), new InterfaceC949260aoG() { // from class: X.0akb
                    @Override // X.InterfaceC949260aoG
                    public final void LIZ(EnumC947020ake enumC947020ake) {
                        String strLIZJ2;
                        C20441214yg.LJIIIZ("LetsDanceBackgroundEffectManager", "loadLetsDanceAnimationRes, download res success");
                        InterfaceC940910aan interfaceC940910aan2 = c946980aka.LLILZLL;
                        if (interfaceC940910aan2 != null) {
                            interfaceC940910aan2.unsubscribe();
                        }
                        InterfaceC946970akZ interfaceC946970akZLIZIZ4 = c946980aka.LIZIZ();
                        if (interfaceC946970akZLIZIZ4 != null && (strLIZJ2 = interfaceC946970akZLIZIZ4.LIZJ(EnumC947020ake.GAME_BG_LOTTIE)) != null) {
                            C946980aka.LIZJ(c946980aka, c1295960jpS, strLIZJ2, awS381S0200000_15);
                        }
                    }

                    @Override // X.InterfaceC949260aoG
                    public final void LIZIZ(EnumC947020ake enumC947020ake) {
                        C20441214yg.LJIIIZ("LetsDanceBackgroundEffectManager", "loadLetsDanceAnimationRes, start download res");
                    }

                    @Override // X.InterfaceC949260aoG
                    public final void LIZJ(EnumC947020ake enumC947020ake, Long l) {
                        C20441214yg.LJIIIZ("LetsDanceBackgroundEffectManager", "loadLetsDanceAnimationRes, download res fail");
                        InterfaceC940910aan interfaceC940910aan2 = c946980aka.LLILZLL;
                        if (interfaceC940910aan2 != null) {
                            interfaceC940910aan2.unsubscribe();
                        }
                    }
                });
            }
            c946980aka.LLILZLL = c949180ao8LIZIZ;
            InterfaceC946970akZ interfaceC946970akZLIZIZ4 = c946980aka.LIZIZ();
            if (interfaceC946970akZLIZIZ4 == null) {
                return;
            }
            interfaceC946970akZLIZIZ4.LJIIJJI(Collections.singletonList(EnumC947020ake.GAME_BG_LOTTIE));
        }
    }

    public static final void LIZJ(C946980aka c946980aka, C1295960jpS c1295960jpS, String str, Function1<? super Boolean, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(File.separator);
        sbLIZ.append("lets_dance_bg_lottie.zip");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists()) {
            c946980aka.LLIZ = new AwS381S0200000_15(c1295960jpS, c946980aka, function1, 116);
            C1143680frq.LJIJI(c1295960jpS, c0vsj, true, null, new WeakReference(c946980aka.LLIZ));
            return;
        }
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("loadLetsDanceAnimationRes, file not exist, path = ");
        sbLIZ2.append(c0vsj.getPath());
        C20441214yg.LIZIZ("LetsDanceBackgroundEffectManager", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
