package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.effect.EffectCreationBanStatusViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS27S1400000_25;

/* JADX INFO: renamed from: X.0sJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622410sJz extends AbstractC1622370sJv {
    public final ShortVideoContext LL;
    public final InterfaceC1635390sev LLILLJJLI;
    public final List<InterfaceC1622380sJw> LLILLL;
    public final LifecycleOwner LLILZ;
    public final InterfaceC1648570t0B LLILZIL;
    public final LifecycleCoroutineScope LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(619));
    public final List<C09AE> LLIZLLLIL = new ArrayList();
    public final Map<String, C1622420sK0> LLJ = new LinkedHashMap();
    public String LLJI;
    public Effect LLJIJIL;
    public InterfaceC1622430sK1 LLJILJIL;
    public UploadableMobileEffect2 LLJILJILJ;
    public FaceStickerBean LLJILLL;

    public final void LIZIZ() {
        for (C09AE c09ae : (ArrayList) this.LLIZLLLIL) {
            if (c09ae.isActive()) {
                C23118094a.LIZIZ("effect unselected", null, c09ae);
            }
        }
        ((ArrayList) this.LLIZLLLIL).clear();
        this.LLJIJIL = null;
        this.LLJILJILJ = null;
        this.LLJILJIL = null;
        this.LLJILLL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0NNB
            if (r0 == 0) goto L50
            r4 = r6
            X.0NNB r4 = (X.C0NNB) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto L5b
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0vKj r3 = (X.C1738190vKj) r3
            D r0 = r3.LIZIZ
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L56
            java.lang.String r1 = "MET-JEFF"
            java.lang.String r0 = "Cannot export, failed to generate effectId"
            X.C201955140j.LIZIZ(r1, r0)
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            r0.LJIJI()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3b:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r0 = r5.LLJI
            if (r0 == 0) goto L45
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L45:
            X.0sev r0 = r5.LLILLJJLI
            r4.LLILLL = r1
            java.lang.Object r3 = X.C1638650skB.LIZ(r0, r4)
            if (r3 != r2) goto L22
            return r2
        L50:
            X.0NNB r4 = new X.0NNB
            r4.<init>(r5, r6)
            goto L12
        L56:
            r5.LLJI = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1622410sJz.LIZLLL(X.05Vn):java.lang.Object");
    }

    public final void LJ(Function0<Unit> function0) {
        FaceStickerBean faceStickerBean;
        Long lValueOf;
        Effect effect = this.LLJIJIL;
        InterfaceC1622430sK1 interfaceC1622430sK1 = this.LLJILJIL;
        String str = this.LLJI;
        if (effect != null && interfaceC1622430sK1 != null) {
            UploadableMobileEffect2 uploadableMobileEffect2LIZIZ = interfaceC1622430sK1.LIZIZ(this.LL.creativeModel.mobileEffectsModel2.exportedEffects);
            if (uploadableMobileEffect2LIZIZ != null) {
                C1622420sK0 c1622420sK0 = (C1622420sK0) ((LinkedHashMap) this.LLJ).get(uploadableMobileEffect2LIZIZ.effectId);
                String name = null;
                if (c1622420sK0 != null) {
                    faceStickerBean = c1622420sK0.LIZ;
                } else {
                    faceStickerBean = null;
                }
                this.LLJILLL = faceStickerBean;
                this.LLJILJILJ = uploadableMobileEffect2LIZIZ;
                if (function0 != null) {
                    function0.invoke();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("using previous export, stickerId=");
                FaceStickerBean faceStickerBean2 = this.LLJILLL;
                if (faceStickerBean2 != null) {
                    lValueOf = Long.valueOf(faceStickerBean2.getStickerId());
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(", effectName=");
                FaceStickerBean faceStickerBean3 = this.LLJILLL;
                if (faceStickerBean3 != null) {
                    name = faceStickerBean3.getName();
                }
                sbLIZ.append(name);
                C201955140j.LIZIZ("MET-JEFF", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (str != null) {
                ((EffectCreationBanStatusViewModel) this.LLIZ.getValue()).eP1(this.LLILZ, new AwS27S1400000_25(this, (C1622410sJz) effect, (Effect) str, (String) interfaceC1622430sK1, (InterfaceC1622430sK1) function0, (Function0<Unit>) 3));
            } else {
                C201955140j.LIZIZ("MET-JEFF", "Pre-record started before newEffectId is ready");
                C0CHQ.LIZ().LJIJI();
            }
        }
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        InterfaceC1622430sK1 interfaceC1622430sK1 = this.LLJILJIL;
        if (interfaceC1622430sK1 != null) {
            interfaceC1622430sK1.onMessageReceived(i, i2, i3, str);
        }
    }

    public C1622410sJz(C19GS c19gs, ShortVideoContext shortVideoContext, InterfaceC1635390sev interfaceC1635390sev, List list, l0 l0Var, InterfaceC1648570t0B interfaceC1648570t0B) {
        this.LL = shortVideoContext;
        this.LLILLJJLI = interfaceC1635390sev;
        this.LLILLL = list;
        this.LLILZ = l0Var;
        this.LLILZIL = interfaceC1648570t0B;
        this.LLILZLL = LifecycleOwnerKt.getLifecycleScope(l0Var);
    }

    public final void LIZJ(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC1622430sK1 interfaceC1622430sK1, boolean z, boolean z2, Bitmap bitmap) {
        String str;
        Map<String, C1622420sK0> map = this.LLJ;
        if (uploadableMobileEffect2 != null) {
            str = uploadableMobileEffect2.effectId;
        } else {
            str = null;
        }
        C1622420sK0 c1622420sK0 = (C1622420sK0) ((LinkedHashMap) map).get(str);
        if (uploadableMobileEffect2 != null && c1622420sK0 != null && c1622420sK0.LIZJ == 0 && c1622420sK0.LIZLLL.invoke().booleanValue()) {
            this.LL.creativeModel.mobileEffectsModel2.exportedEffects.add(uploadableMobileEffect2);
            if (!z2) {
                if (z) {
                    this.LLILZIL.PN1(false);
                } else {
                    this.LLILZIL.PN1(true);
                }
            }
            List<C09AE> list = this.LLIZLLLIL;
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            ((ArrayList) list).add(C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new C1626030sPp(c1622420sK0, this, uploadableMobileEffect2, z, z2, interfaceC1622430sK1, effect, bitmap, null), 2));
            return;
        }
        C201955140j.LIZIZ("MET-JEFF", "effect export skipped");
    }
}
