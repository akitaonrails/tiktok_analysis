package X;

import Y.ARunnableS58S0300000_25;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.verify.EffectsFeaturesKillSwitchConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628610sTz implements InterfaceC1622080sJS {
    public final LifecycleOwner LL;
    public final InterfaceC1624480sNK LLILLJJLI;
    public final InterfaceC1628620sU0 LLILLL;
    public final Function2<Effect, InterfaceC1623140sLA, Unit> LLILZ;
    public final SafeHandler LLILZIL;
    public Effect LLILZLL;
    public AwS426S0200000_25 LLIZ;

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return EnumC1641540soq.NOTICE_STICKER_PRIORITY.getPriority();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.0sU2] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.0sU1] */
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
    @Override // X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(final InterfaceC1622070sJR interfaceC1622070sJR, final AbstractC1627380sS0 abstractC1627380sS0) {
        Bundle bundle;
        EnumC1641530sop enumC1641530sop;
        boolean zLJI = MethodIDManager.LJI(72087);
        this.LLILLJJLI.LJIL();
        boolean z = abstractC1627380sS0 instanceof C1627370sRz;
        if (z) {
            C1627370sRz c1627370sRz = (C1627370sRz) abstractC1627380sS0;
            if (c1627370sRz.LIZJ != EnumC1448980noG.RECOVER) {
                Effect effect = c1627370sRz.LIZ;
                if (effect != null && !Intrinsics.LJFF(effect, this.LLILZLL) && !C1624570sNT.LJIL(effect)) {
                    this.LLILZLL = effect;
                    this.LLILZIL.removeCallbacksAndMessages(null);
                    this.LLILLL.hideNotice();
                    if (!C1624560sNS.LIZ(effect) || ((bundle = c1627370sRz.LJ) != null && bundle.getBoolean("ignore_notice"))) {
                        C1623370sLX c1623370sLXLIZ = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                        return c1623370sLXLIZ;
                    }
                    if (((EffectsFeaturesKillSwitchConfig.DisableConfig) EffectsFeaturesKillSwitchConfig.LIZIZ.getValue()).effectWarningFeature) {
                        this.LLILZ.invoke(effect, new InterfaceC1623140sLA() { // from class: X.0sU5
                        });
                        this.LLILLL.hide();
                        this.LLILLL.lE1(effect, new AnonymousClass1981() { // from class: X.0sU1
                            @Override // X.AnonymousClass1981
                            public final void LIZ() {
                                C1628610sTz c1628610sTz = this.LIZ;
                                c1628610sTz.LLILZIL.postDelayed(new ARunnableS58S0300000_25(c1628610sTz, interfaceC1622070sJR, abstractC1627380sS0, 2), 3000L);
                            }
                        }, new AnonymousClass1981() { // from class: X.0sU2
                            @Override // X.AnonymousClass1981
                            public final void LIZ() {
                                interfaceC1622070sJR.LIZ(abstractC1627380sS0);
                            }
                        });
                    } else {
                        this.LLIZ = new AwS426S0200000_25(interfaceC1622070sJR, abstractC1627380sS0, 79);
                        if (C1624570sNT.LJJ(effect)) {
                            enumC1641530sop = EnumC1641530sop.PHOTOSENSITIVE;
                        } else if (C1624200sMs.LJIIIIZZ(effect)) {
                            enumC1641530sop = EnumC1641530sop.GAME;
                        } else {
                            enumC1641530sop = EnumC1641530sop.DISTURBING;
                        }
                        this.LLILZ.invoke(effect, enumC1641530sop);
                    }
                    C1623370sLX c1623370sLX = new C1623370sLX();
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return c1623370sLX;
                }
                C1623370sLX c1623370sLXLIZ2 = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return c1623370sLXLIZ2;
            }
        }
        boolean z2 = abstractC1627380sS0 instanceof C1627360sRy;
        if (z2 || (z && ((C1627370sRz) abstractC1627380sS0).LIZJ == EnumC1448980noG.RECOVER)) {
            this.LLILZIL.removeCallbacksAndMessages(null);
            this.LLILLL.hideNotice();
            this.LLILLL.hide();
            if (!z2 ? !(!z || ((C1627370sRz) abstractC1627380sS0).LIZJ != EnumC1448980noG.UI_CLICK) : ((C1627360sRy) abstractC1627380sS0).LIZJ == EnumC1448980noG.UI_CLICK) {
                this.LLILLL.Sr1();
            }
            this.LLILZLL = null;
        }
        C1623370sLX c1623370sLXLIZ3 = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c1623370sLXLIZ3;
    }

    public C1628610sTz(LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1628620sU0 interfaceC1628620sU0, AwS639S0100000_25 awS639S0100000_25) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC1624480sNK;
        this.LLILLL = interfaceC1628620sU0;
        this.LLILZ = awS639S0100000_25;
        this.LLILZIL = new SafeHandler(lifecycleOwner);
    }
}
