package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.starlight.nodes.StarlightNode;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14O8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14O8 {
    public final StarlightNode LIZ;
    public final List<C14O8> LIZIZ = new ArrayList();

    public final int LIZ() {
        List<StarlightNode> list = this.LIZ.LIZLLL;
        if (list == null) {
            return 0;
        }
        return ((ArrayList) list).size();
    }

    public final float LIZIZ() {
        float f;
        float f2;
        StarlightNode starlightNode = this.LIZ;
        EnumC2257641DYc enumC2257641DYcLIZ = C2257631DYb.LIZ("horizontal");
        if (starlightNode.LIZJ == null) {
            return 0.0f;
        }
        switch (C2257651DYd.LIZ[enumC2257641DYcLIZ.ordinal()]) {
            case 1:
                return starlightNode.LIZJ[8];
            case 2:
                return starlightNode.LIZJ[9];
            case 3:
                return starlightNode.LIZJ[10];
            case 4:
                return starlightNode.LIZJ[11];
            case 5:
                boolean z = starlightNode.LJFF;
                float[] fArr = starlightNode.LIZJ;
                return z ? fArr[9] : fArr[8];
            case 6:
                boolean z2 = starlightNode.LJFF;
                float[] fArr2 = starlightNode.LIZJ;
                return z2 ? fArr2[8] : fArr2[9];
            case 7:
                float[] fArr3 = starlightNode.LIZJ;
                f = fArr3[8];
                f2 = fArr3[9];
                break;
            case 8:
                float[] fArr4 = starlightNode.LIZJ;
                f = fArr4[10];
                f2 = fArr4[11];
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                float[] fArr5 = starlightNode.LIZJ;
                f = fArr5[8] + fArr5[9] + fArr5[10];
                f2 = fArr5[11];
                break;
            default:
                return 0.0f;
        }
        return f + f2;
    }

    public C14O8(StarlightNode starlightNode) {
        this.LIZ = starlightNode;
    }

    public final void LIZJ(int i) {
        StarlightNode starlightNode = this.LIZ;
        List<StarlightNode> list = starlightNode.LIZLLL;
        if (list != null) {
            if (i >= 0 && i < ((ArrayList) list).size()) {
                StarlightNode starlightNode2 = (StarlightNode) ListProtector.remove(starlightNode.LIZLLL, i);
                starlightNode2.LJ = null;
                starlightNode.nativeRemoveChild(starlightNode.LIZ, starlightNode2.LIZ);
                ListProtector.remove(this.LIZIZ, i);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid index for removing child: ");
            sbLIZ.append(i);
            throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalStateException("Trying to remove a child of a StarlightNode that does not have children");
    }

    public final void LIZLLL(String str) {
        C14OR c14or;
        boolean z;
        StarlightNode starlightNode = this.LIZ;
        if (!Intrinsics.LJFF(str, "ltr") && Intrinsics.LJFF(str, "rtl")) {
            c14or = C14OR.RTL;
        } else {
            c14or = C14OR.LTR;
        }
        starlightNode.getClass();
        if (c14or == C14OR.RTL) {
            z = true;
        } else {
            z = false;
        }
        starlightNode.LJFF = z;
        starlightNode.nativeSetDirection(starlightNode.LIZ, c14or.getValue());
    }

    public final void LJ(String str) {
        EnumC20259014Ou enumC20259014Ou;
        StarlightNode starlightNode = this.LIZ;
        if (!Intrinsics.LJFF(str, "flex") && Intrinsics.LJFF(str, "none")) {
            enumC20259014Ou = EnumC20259014Ou.NONE;
        } else {
            enumC20259014Ou = EnumC20259014Ou.FLEX;
        }
        starlightNode.nativeSetDisplay(starlightNode.LIZ, enumC20259014Ou.ordinal());
    }

    public final void LJFF(float f, String str) {
        StarlightNode starlightNode = this.LIZ;
        starlightNode.nativeSetPadding(starlightNode.LIZ, C2257631DYb.LIZ(str).ordinal(), f);
    }
}
