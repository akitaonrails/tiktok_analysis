package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05Vd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1363105Vd extends C09AY implements Function1<C1378605aS, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLILLL;
    public final /* synthetic */ C1362605Uy LLILZ;
    public final /* synthetic */ Function1<EnumC1360305Ub, Unit> LLILZIL;
    public final /* synthetic */ SocMediaResource LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ C259800zU<C1677480tko<C1378605aS, C1677270tkT>> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363105Vd(SocMediaResource socMediaResource, C1362605Uy c1362605Uy, Function1 function1, C259800zU c259800zU, C259800zU c259800zU2, InterfaceC497601wk interfaceC497601wk, boolean z, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = c259800zU;
        this.LLILZ = c1362605Uy;
        this.LLILZIL = function1;
        this.LLILZLL = socMediaResource;
        this.LLIZ = z2;
        this.LLIZLLLIL = c259800zU2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1378605aS c1378605aS) {
        boolean z;
        EnumC1360305Ub enumC1360305Ub;
        long j = c1378605aS.LIZ;
        if (!this.LL) {
            C23118094a.LJ(this.LLILLJJLI.getCoroutineContext());
            if (this.LLILLL.element.LIZLLL().floatValue() < 3.0f) {
                C1362605Uy c1362605Uy = this.LLILZ;
                C1683130ttv c1683130ttv = c1362605Uy.LIZ;
                C1683130ttv c1683130ttv2 = c1362605Uy.LIZIZ;
                C1683130ttv c1683130ttv3 = c1362605Uy.LIZLLL;
                float fFloatValue = (3.0f / this.LLILLL.element.LIZLLL().floatValue()) - 1;
                long jFloatToRawIntBits = ((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j >> 32)) - c1683130ttv.LIZ) * fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue * (Float.intBitsToFloat((int) (j & 4294967295L)) - c1683130ttv.LIZIZ))) & 4294967295L)) ^ (-9223372034707292160L);
                long jLJ = c1683130ttv2.LJ();
                SocMediaResource socMediaResource = this.LLILZLL;
                boolean z2 = this.LLIZ;
                InterfaceC497601wk interfaceC497601wk = this.LLILLJJLI;
                C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU = this.LLILLL;
                C259800zU<C1677480tko<C1378605aS, C1677270tkT>> c259800zU2 = this.LLIZLLLIL;
                z = true;
                RectF rectF = new RectF(c1683130ttv2.LIZ, c1683130ttv2.LIZIZ, c1683130ttv2.LIZJ, c1683130ttv2.LIZLLL);
                Matrix matrix = new Matrix();
                matrix.postScale(3.0f, 3.0f, Float.intBitsToFloat((int) (jLJ >> 32)), Float.intBitsToFloat((int) (jLJ & 4294967295L)));
                matrix.postTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                matrix.mapRect(rectF);
                C1683130ttv c1683130ttv4 = new C1683130ttv(rectF.left, rectF.top, rectF.right, rectF.bottom);
                long jLIZ = C1671590tbJ.LIZ(C1671590tbJ.LIZIZ(socMediaResource.LIZIZ(), c1683130ttv4, z2), c1683130ttv3);
                C05V6 c05v6 = C1671460tb6.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("double tap translation ");
                sbLIZ.append((Object) C1378605aS.LJIIIIZZ(jFloatToRawIntBits));
                sbLIZ.append(" fix ");
                sbLIZ.append((Object) C1378605aS.LJIIIIZZ(jLIZ));
                sbLIZ.append("， , input: ");
                sbLIZ.append(C1671590tbJ.LIZIZ(socMediaResource.LIZIZ(), c1683130ttv4, z2));
                sbLIZ.append(' ');
                sbLIZ.append(c1683130ttv3);
                c05v6.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                C1671460tb6.LIZLLL(interfaceC497601wk, c259800zU, c259800zU2, 3.0f, C1378605aS.LJI(jFloatToRawIntBits, jLIZ));
            } else {
                z = false;
                C1671460tb6.LIZLLL(this.LLILLJJLI, this.LLILLL, this.LLIZLLLIL, 1.0f, 0L);
            }
            Function1<EnumC1360305Ub, Unit> function1 = this.LLILZIL;
            if (z) {
                enumC1360305Ub = EnumC1360305Ub.SCALING;
            } else {
                enumC1360305Ub = EnumC1360305Ub.IDLE;
            }
            function1.invoke(enumC1360305Ub);
        }
        return Unit.LIZ;
    }
}
