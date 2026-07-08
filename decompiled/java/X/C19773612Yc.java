package X;

import Y.ARunnableS129S0100000_29;
import Y.ARunnableS98S0200000_29;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextEffectExtra;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12Yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19773612Yc implements IFetchEffectChannelListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                break;
            case 1:
                onFail$1(this, exceptionResult);
                break;
            case 2:
                onFail$2(this, exceptionResult);
                break;
            case 3:
                onFail$3(this, exceptionResult);
                break;
            case 4:
                onFail$4(this, exceptionResult);
                break;
            case 5:
                onFail$5(this, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effectChannelResponse);
                break;
            case 1:
                onSuccess$1(this, effectChannelResponse);
                break;
            case 2:
                onSuccess$2(this, effectChannelResponse);
                break;
            case 3:
                onSuccess$3(this, effectChannelResponse);
                break;
            case 4:
                onSuccess$4(this, effectChannelResponse);
                break;
            case 5:
                onSuccess$5(this, effectChannelResponse);
                break;
        }
    }

    public C19773612Yc(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$0(C19773612Yc c19773612Yc, ExceptionResult exceptionResult) {
        C19774712Yn c19774712Yn;
        ((C19557811fU) c19773612Yc.l0).LJIJI(false);
        ArrayList arrayList = new ArrayList();
        boolean zLIZLLL = ((C19557811fU) c19773612Yc.l0).LIZLLL(arrayList);
        ((C19557811fU) c19773612Yc.l0).LIZIZ(arrayList);
        ((C19557811fU) c19773612Yc.l0).LJJIJ.setData(arrayList);
        C19557811fU c19557811fU = (C19557811fU) c19773612Yc.l0;
        c19557811fU.LJIJI.setAdapter(c19557811fU.LJJIJ);
        C19557811fU c19557811fU2 = (C19557811fU) c19773612Yc.l0;
        c19557811fU2.getClass();
        if (zLIZLLL && arrayList.size() == 1 && (c19774712Yn = c19557811fU2.LJJJJJL) != null) {
            c19774712Yn.onPageSelected(0);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(((C19557811fU) c19773612Yc.l0).LJJIJIIJIL);
        c1389890mGx.LJIIIZ(2131848736);
        c1389890mGx.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uniformFetchList fail : ");
        sbLIZ.append(exceptionResult.toString());
        C201955140j.LJFF("EffectHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onFail$1(C19773612Yc c19773612Yc, ExceptionResult exceptionResult) {
        C19774712Yn c19774712Yn;
        ((C19557511fR) c19773612Yc.l0).LJIJJ(false);
        ArrayList arrayList = new ArrayList();
        ((C19557511fR) c19773612Yc.l0).LIZIZ(arrayList);
        ((C19557511fR) c19773612Yc.l0).LIZ(arrayList);
        ((C19557511fR) c19773612Yc.l0).LJJIJIL.setData(arrayList);
        C19557511fR c19557511fR = (C19557511fR) c19773612Yc.l0;
        c19557511fR.LJIL.setAdapter(c19557511fR.LJJIJIL);
        C19557511fR c19557511fR2 = (C19557511fR) c19773612Yc.l0;
        c19557511fR2.getClass();
        if (arrayList.size() > 0 && (c19774712Yn = c19557511fR2.LJJJJZI) != null) {
            c19774712Yn.onPageSelected(0);
        }
        C19EG c19eg = ((C19557511fR) c19773612Yc.l0).LJJIJLIJ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131848736);
        C1390380mHk.LIZ(c19eg, 6001, creativeToastBuilder);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uniformFetchList fail : ");
        sbLIZ.append(exceptionResult.toString());
        C201955140j.LJFF("EffectHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onFail$2(C19773612Yc c19773612Yc, ExceptionResult exceptionResult) {
        Exception exception;
        if (!((InterfaceC20236714Gf) c19773612Yc.l0).isActive()) {
            return;
        }
        if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c19773612Yc.l0;
            C098200Yq c098200Yq = new C098200Yq(exception);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf.resumeWith(c098200Yq);
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c19773612Yc.l0;
        C098200Yq c098200Yq2 = new C098200Yq(new Exception());
        C189200o6.m2constructorimpl(c098200Yq2);
        interfaceC20236714Gf2.resumeWith(c098200Yq2);
    }

    public static final void onFail$3(C19773612Yc c19773612Yc, ExceptionResult exceptionResult) {
        String logId;
        String msg;
        C12HB c12hb = (C12HB) c19773612Yc.l0;
        c12hb.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendRequest fetchEffectListFromCacheChecked onFailed. logId=");
        Exception exception = null;
        if (exceptionResult != null) {
            logId = exceptionResult.getLogId();
        } else {
            logId = null;
        }
        sbLIZ.append(logId);
        sbLIZ.append(", ");
        sbLIZ.append(exceptionResult);
        C19570511hX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        String str = c12hb.LIZIZ.LIZ;
        if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
            msg = "request fail";
        }
        C12HF.LIZIZ(1, str, msg);
        C12H8 c12h8 = c12hb.LIZJ;
        if (c12h8 != null) {
            if (exceptionResult != null) {
                exception = exceptionResult.getException();
            }
            new Exception(exception);
            c12h8.onFail();
        }
        C2281251EQx.LIZ.LJII("beautify", "", "", false);
        if (C255880A1a.LIZ()) {
            c12hb.LIZ.LJIJI(true);
        }
    }

    public static final void onFail$4(C19773612Yc c19773612Yc, ExceptionResult exceptionResult) {
        if (exceptionResult != null) {
            exceptionResult.getException();
        }
    }

    public static final void onFail$5(C19773612Yc c19773612Yc, ExceptionResult exceptionResult) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("textFontDownload err: ");
        sbLIZ.append(exceptionResult.getMsg());
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onSuccess$0(C19773612Yc c19773612Yc, Object obj) {
        C19774712Yn c19774712Yn;
        List<EffectCategoryResponse> categoryResponseList = ((EffectChannelResponse) obj).getCategoryResponseList();
        boolean zLIZLLL = ((C19557811fU) c19773612Yc.l0).LIZLLL(categoryResponseList);
        ((C19557811fU) c19773612Yc.l0).LIZIZ(categoryResponseList);
        ((C19557811fU) c19773612Yc.l0).LJJIJ.setData(categoryResponseList);
        C19557811fU c19557811fU = (C19557811fU) c19773612Yc.l0;
        c19557811fU.LJIJI.setAdapter(c19557811fU.LJJIJ);
        if (!categoryResponseList.isEmpty()) {
            ((C19557811fU) c19773612Yc.l0).LJJIZ = ((EffectCategoryResponse) ListProtector.get(categoryResponseList, 0)).getKey();
            ((C19557811fU) c19773612Yc.l0).LJIIZILJ(null, C113I.LIZJ(((EffectCategoryResponse) ListProtector.get(categoryResponseList, 0)).getKey()), false);
        }
        C19557811fU c19557811fU2 = (C19557811fU) c19773612Yc.l0;
        c19557811fU2.getClass();
        if (zLIZLLL && categoryResponseList.size() == 1 && (c19774712Yn = c19557811fU2.LJJJJJL) != null) {
            c19774712Yn.onPageSelected(0);
        }
        HandlerHook.viewPost(((C19557811fU) c19773612Yc.l0).LJIJI, new ARunnableS98S0200000_29(c19773612Yc, categoryResponseList, 6));
        ((C19557811fU) c19773612Yc.l0).LJIJI(false);
    }

    public static final void onSuccess$1(C19773612Yc c19773612Yc, Object obj) {
        C19774712Yn c19774712Yn;
        List<EffectCategoryResponse> categoryResponseList = ((EffectChannelResponse) obj).getCategoryResponseList();
        ((C19557511fR) c19773612Yc.l0).LIZIZ(categoryResponseList);
        ((C19557511fR) c19773612Yc.l0).getClass();
        C19557511fR.LJIILIIL("trick_effects", categoryResponseList);
        ((C19557511fR) c19773612Yc.l0).LIZ(categoryResponseList);
        ((C19557511fR) c19773612Yc.l0).LJJIJIL.setData(categoryResponseList);
        C19557511fR c19557511fR = (C19557511fR) c19773612Yc.l0;
        c19557511fR.LJIL.setAdapter(c19557511fR.LJJIJIL);
        if (!categoryResponseList.isEmpty()) {
            ((C19557511fR) c19773612Yc.l0).LJJJJI = ((EffectCategoryResponse) ListProtector.get(categoryResponseList, 0)).getKey();
        }
        C19557511fR c19557511fR2 = (C19557511fR) c19773612Yc.l0;
        c19557511fR2.getClass();
        if (categoryResponseList.size() > 0 && (c19774712Yn = c19557511fR2.LJJJJZI) != null) {
            c19774712Yn.onPageSelected(0);
        }
        HandlerHook.viewPost(((C19557511fR) c19773612Yc.l0).LJIL, new ARunnableS129S0100000_29(c19773612Yc, 36));
        ((C19557511fR) c19773612Yc.l0).LJIJJ(false);
    }

    public static final void onSuccess$2(C19773612Yc c19773612Yc, Object obj) {
        ArrayList arrayList;
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        if (effectChannelResponse == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                if (effect != null) {
                    try {
                        EffectTextEffectExtra effectTextEffectExtra = (EffectTextEffectExtra) C123O.LIZ().LJII(effect.getExtra(), EffectTextEffectExtra.class);
                        if (effectTextEffectExtra == null) {
                            effectTextEffectExtra = new EffectTextEffectExtra(false, false);
                        }
                        arrayList.add(new C11UK(effect, effectTextEffectExtra));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C122D c122dLIZIZ = C123O.LIZIZ();
                        if (c122dLIZIZ != null) {
                            c122dLIZIZ.LIZIZ(e);
                        }
                    }
                }
            }
        }
        if (((InterfaceC20236714Gf) c19773612Yc.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c19773612Yc.l0;
            C189200o6.m2constructorimpl(arrayList);
            interfaceC20236714Gf.resumeWith(arrayList);
        }
    }

    public static final void onSuccess$3(C19773612Yc c19773612Yc, Object obj) {
        C12HB c12hb = (C12HB) c19773612Yc.l0;
        c12hb.getClass();
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C12H4((EffectChannelResponse) obj, c12hb.LIZ, c12hb.LIZIZ, c12hb.LIZJ, null), 3);
    }

    public static final void onSuccess$4(C19773612Yc c19773612Yc, Object obj) {
        if (obj != null) {
            ((Function1) c19773612Yc.l0).invoke(obj);
        }
    }

    public static final void onSuccess$5(C19773612Yc c19773612Yc, Object obj) {
        Iterator<Effect> it2 = ((EffectChannelResponse) obj).getAllCategoryEffects().iterator();
        while (it2.hasNext()) {
            ((C196986125g) c19773612Yc.l0).LJII(it2.next());
        }
    }
}
