package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sPA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625620sPA implements InterfaceC1625190sOT {
    public final Context LIZ;
    public final LiveEvent<Boolean> LIZIZ;
    public final ShortVideoContext LIZJ;
    public final Function1<InterfaceC1625180sOS<?>, Unit> LIZLLL;
    public InterfaceC1625180sOS LJ;

    @Override // X.InterfaceC1625190sOT
    public final <T> C1625490sOx LIZ(final InterfaceC1625180sOS<T> interfaceC1625180sOS) {
        C1625440sOs c1625440sOs;
        EnumC1448980noG enumC1448980noG;
        if (!Intrinsics.LJFF(this.LJ, interfaceC1625180sOS) && (interfaceC1625180sOS instanceof C1625440sOs) && ((enumC1448980noG = (c1625440sOs = (C1625440sOs) interfaceC1625180sOS).LIZJ) == EnumC1448980noG.UI_CLICK || enumC1448980noG == EnumC1448980noG.UI_GALLERY)) {
            Effect effect = c1625440sOs.LIZ;
            if (!C1624200sMs.LJIIIIZZ(effect)) {
                return new C1625490sOx();
            }
            if (Intrinsics.LJFF(this.LIZIZ.LJI(), Boolean.TRUE)) {
                if (this.LIZJ.cameraComponentModel.mDurings.isEmpty()) {
                    return new C1625490sOx();
                }
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("prop_id", effect.getEffectId());
                pairArr[1] = new Pair("creation_id", this.LIZJ.getCreationId());
                String str = this.LIZJ.shootWay;
                if (str == null) {
                    str = "";
                }
                pairArr[2] = new Pair("shoot_way", str);
                final HashMap mapLJI = C2097608Jq.LJI(pairArr);
                Context context = this.LIZ;
                C1625650sPD c1625650sPD = new C1625650sPD(context);
                c1625650sPD.LIZ = context.getString(2131857997);
                c1625650sPD.LIZIZ = context.getString(2131857996);
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.0sPC
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        mapLJI.put("to_status", "cancel");
                        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                        C2341909Fp.LIZ("shoot_video_delete_confirm", mapLJI);
                    }
                };
                c1625650sPD.LIZLLL = context.getString(R.string.f1_);
                c1625650sPD.LJFF = onClickListener;
                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: X.0sPB
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
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        mapLJI.put("to_status", "confirm");
                        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                        C2341909Fp.LIZ("shoot_video_delete_confirm", mapLJI);
                        C1625620sPA c1625620sPA = this;
                        InterfaceC1625180sOS<T> interfaceC1625180sOS2 = interfaceC1625180sOS;
                        c1625620sPA.LJ = interfaceC1625180sOS2;
                        c1625620sPA.LIZLLL.invoke(interfaceC1625180sOS2);
                    }
                };
                c1625650sPD.LIZJ = context.getString(2131829429);
                c1625650sPD.LJ = onClickListener2;
                new C19562211gC(c1625650sPD).LIZ();
                return new C1625490sOx(true, "effect_control_sticker");
            }
        }
        return new C1625490sOx();
    }

    public C1625620sPA(C19EG c19eg, LiveEvent liveEvent, ShortVideoContext shortVideoContext, AwS604S0100000_25 awS604S0100000_25) {
        this.LIZ = c19eg;
        this.LIZIZ = liveEvent;
        this.LIZJ = shortVideoContext;
        this.LIZLLL = awS604S0100000_25;
    }
}
