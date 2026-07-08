package X;

import Y.ARunnableS119S0100000_19;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0mut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414650mut {
    public final C1414640mus LIZ;

    public C1414650mut(C1414640mus c1414640mus) {
        this.LIZ = c1414640mus;
    }

    public static EnumC1413120msQ LJFF(C1412860ms0 c1412860ms0) {
        C1413040msI c1413040msI;
        EnumC1413120msQ enumC1413120msQ;
        if (C1416120mxG.LIZJ(c1412860ms0.LIZ)) {
            return EnumC1413120msQ.AI_ALIVE_TEMPLATE;
        }
        AbstractC1412880ms2 abstractC1412880ms2 = c1412860ms0.LIZIZ;
        if ((abstractC1412880ms2 instanceof C1413040msI) && (c1413040msI = (C1413040msI) abstractC1412880ms2) != null) {
            if (c1413040msI.LIZLLL == null) {
                enumC1413120msQ = EnumC1413120msQ.AI_TEMPLATE;
            } else {
                enumC1413120msQ = EnumC1413120msQ.MANUAL_SELECT;
            }
            if (enumC1413120msQ != null) {
                return enumC1413120msQ;
            }
        }
        return EnumC1413120msQ.MANUAL_SELECT;
    }

    public final void LIZ(Function0<Unit> function0) {
        InterfaceC1452170ntP value = this.LIZ.B3().g().getValue();
        if (value != null) {
            value.Ze(new ARunnableS119S0100000_19((Function0) function0, 161));
        }
    }

    public static final void LIZJ(C1412860ms0 c1412860ms0, C1414650mut c1414650mut) {
        C1414580mum c1414580mum = C1414580mum.LIZ;
        String asset_id = c1412860ms0.LIZ.getAsset_id();
        c1414580mum.getClass();
        C1414580mum.LIZIZ(asset_id);
        C1414580mum.LIZ(c1414650mut.LIZ.m3(), new AwS566S0100000_22(c1414650mut, 916), c1412860ms0.LIZ.getAsset_id(), null);
        InterfaceC1414530muh interfaceC1414530muh = c1414650mut.LIZ.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1414530muh != null) {
            interfaceC1414530muh.fS1(c1412860ms0, 2);
        }
    }

    public static final void LIZLLL(C1412860ms0 c1412860ms0, C1414650mut c1414650mut) {
        C1414580mum c1414580mum = C1414580mum.LIZ;
        String asset_id = c1412860ms0.LIZ.getAsset_id();
        c1414580mum.getClass();
        C1414580mum.LIZIZ(asset_id);
        C1414580mum.LIZ(c1414650mut.LIZ.m3(), new AwS566S0100000_22(c1414650mut, 917), c1412860ms0.LIZ.getAsset_id(), null);
        InterfaceC1414530muh interfaceC1414530muh = c1414650mut.LIZ.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1414530muh != null) {
            interfaceC1414530muh.fS1(c1412860ms0, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r24, com.ss.android.ugc.effectmanager.effect.model.Effect r25, com.ss.android.ugc.aweme.creative.model.music.AVMusic r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414650mut.LIZIZ(int, com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.creative.model.music.AVMusic, boolean):void");
    }

    public static final void LJ(boolean z, C1412860ms0 c1412860ms0, C1414650mut c1414650mut, AbstractC1412880ms2 abstractC1412880ms2, int i, int i2) {
        int iLJIIIIZZ;
        NLEModel nleModel;
        if (!z) {
            return;
        }
        C1414580mum c1414580mum = C1414580mum.LIZ;
        String asset_id = c1412860ms0.LIZ.getAsset_id();
        c1414580mum.getClass();
        C1414580mum.LIZIZ(asset_id);
        c1414650mut.LIZ.m3().setNleModel(((C1413040msI) abstractC1412880ms2).LIZIZ);
        VideoPublishEditModel videoPublishEditModelM3 = c1414650mut.LIZ.m3();
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(c1414650mut, 918);
        String asset_id2 = c1412860ms0.LIZ.getAsset_id();
        if (C1412250mr1.LIZ(c1412860ms0.LIZ) != EnumC1412640mre.ALGORITHM_TEMPLATE && (nleModel = c1414650mut.LIZ.m3().getNleModel()) != null) {
            iLJIIIIZZ = C0EYQ.LJIIIIZZ(nleModel);
        } else {
            iLJIIIIZZ = i + i2;
        }
        C1414580mum.LIZ(videoPublishEditModelM3, awS566S0100000_22, asset_id2, Integer.valueOf(iLJIIIIZZ));
    }
}
