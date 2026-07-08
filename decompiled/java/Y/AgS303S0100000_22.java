package Y;

import X.AbstractC1662050tLv;
import X.C0MJ8;
import X.C0V0H;
import X.C13DV;
import X.C1410510moD;
import X.C1412800mru;
import X.C1414040mtu;
import X.C1414130mu3;
import X.C1414450muZ;
import X.C1414740mv2;
import X.C1444550nh7;
import X.C1444560nh8;
import X.C1444570nh9;
import X.C1446840nko;
import X.C1448710nnp;
import X.C1449000noI;
import X.C1449600npG;
import X.C1457700o2K;
import X.C1460090o6B;
import X.C1464650oDX;
import X.C1464660oDY;
import X.C1464680oDa;
import X.C1464760oDi;
import X.C1464810oDn;
import X.C1624520sNO;
import X.C1662030tLt;
import X.C1697820uHc;
import X.C1954807lC;
import X.C201955140j;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C370670Eg5;
import X.C385670FAf;
import X.C545810Lat;
import X.C578320MmE;
import X.EnumC1448460nnQ;
import X.EnumC1462540oA8;
import X.EnumC1651790t5N;
import X.EnumC441770HTz;
import X.EnumC578300MmC;
import X.InterfaceC1364105Vn;
import X.InterfaceC1413730mtP;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625000sOA;
import X.InterfaceC1625470sOv;
import X.InterfaceC346701Wf;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.creative.model.record.RecordData;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class AgS303S0100000_22 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return emit$11(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return emit$12(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return emit$13(this, obj, interfaceC1364105Vn);
            case 14:
                return emit$14(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS303S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$0(AgS303S0100000_22 agS303S0100000_22, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String effectId;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        String resourceId;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJ;
        Effect effect = (Effect) obj;
        C1448710nnp c1448710nnp = ((l0) agS303S0100000_22.l0).M;
        C1449000noI c1449000noI = null;
        if (c1448710nnp != null) {
            C1449000noI c1449000noI2 = c1448710nnp.LLJ;
            Effect effect2 = c1448710nnp.LLIZLLLIL;
            if (effect2 != null) {
                C23250099c.LIZLLL(c1448710nnp.LLJIJIL, null, null, new C1410510moD(c1448710nnp, effect2, c1449000noI2, null), 3);
            }
            c1448710nnp.LLIZLLLIL = effect;
            InterfaceC1625000sOA interfaceC1625000sOA = (InterfaceC1625000sOA) c1448710nnp.LLJI.getValue(c1448710nnp, C1448710nnp.LLJILJILJ[1]);
            if (interfaceC1625000sOA != null && (interfaceC1624480sNKC0 = interfaceC1625000sOA.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (mutableLiveDataLJ = interfaceC1625470sOvLJII.LJ()) != null) {
                c1449000noI = (C1449000noI) mutableLiveDataLJ.getValue();
            }
            c1448710nnp.LLJ = c1449000noI;
        }
        l0 l0Var = (l0) agS303S0100000_22.l0;
        l0Var.da();
        Effect effect3 = (Effect) l0Var.C0().LJII().LJIJJLI().getValue();
        if (effect3 != null && C1449600npG.LJFF(effect3) && effect != null && !C1449600npG.LJFF(effect)) {
            ((l0) agS303S0100000_22.l0).V9().onEvent(new C1457700o2K(new C0V0H()));
        }
        RecordData recordData = ((l0) agS303S0100000_22.l0).getShortVideoContext().creativeModel.recordData;
        String str = "";
        if (effect == null || (effectId = effect.getEffectId()) == null) {
            effectId = "";
        }
        recordData.applyEffectId = effectId;
        RecordData recordData2 = ((l0) agS303S0100000_22.l0).getShortVideoContext().creativeModel.recordData;
        if (effect != null && (resourceId = effect.getResourceId()) != null) {
            str = resourceId;
        }
        recordData2.applyEffectResId = str;
        CreativeModel creativeModel = ((l0) agS303S0100000_22.l0).getShortVideoContext().creativeModel;
        if (creativeModel != null && (creativeInitialModel = creativeModel.initialModel) != null && (dMCameraModel = creativeInitialModel.dmCameraModel) != null && dMCameraModel.enterFromDM) {
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            if (effect != null) {
                if (DiyPropParser.LJIIJ(effect)) {
                    c13dvLIZIZ.add("effect_editor");
                }
                if (C1444560nh8.LIZ() && DiyPropParser.LJIIJJI(effect) && DiyPropParser.LJ(effect).length() != 0) {
                    c13dvLIZIZ.add("child_effect");
                }
                if (C1444550nh7.LIZ()) {
                    C1449600npG.LJ(effect);
                } else {
                    DiyPropParser.LJIIJJI(effect);
                }
                if (C1446840nko.LJ(effect) || (effect instanceof DraftEffect)) {
                    c13dvLIZIZ.add("mobile_effect_edit");
                }
            }
            C1444570nh9 c1444570nh9LIZ = C1624520sNO.LIZ(effect, EnumC1448460nnQ.IC, C1697820uHc.LIZ(c13dvLIZIZ));
            dMCameraModel.effectHandlerType = c1444570nh9LIZ.LIZ;
            dMCameraModel.effectHandlerTypeActive = c1444570nh9LIZ.LIZIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS303S0100000_22 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C1416700myC
            if (r0 == 0) goto L48
            r7 = r10
            X.0myC r7 = (X.C1416700myC) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            kotlin.Pair r9 = (kotlin.Pair) r9
            X.0HZe r3 = new X.0HZe
            java.lang.Object r2 = r9.getFirst()
            java.lang.Object r1 = r9.getSecond()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.<init>(r2, r1, r0)
            r7.LLILLJJLI = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            if (r0 != r6) goto L22
            return r6
        L48:
            X.0myC r7 = new X.0myC
            r7.<init>(r8, r10)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS303S0100000_22.emit$1(Y.AgS303S0100000_22, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$10(AgS303S0100000_22 agS303S0100000_22, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zLJFF;
        String strLIZJ;
        C385670FAf<String> c385670FAfLN0;
        C385670FAf<Boolean> hasMore;
        int i = C578320MmE.LIZ[((EnumC578300MmC) obj).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1414130mu3 c1414130mu3 = (C1414130mu3) agS303S0100000_22.l0;
                    ArrayList<C1412800mru> arrayList = c1414130mu3.LLLII;
                    InterfaceC1413730mtP interfaceC1413730mtPLLLLLZL = c1414130mu3.LLLLLZL();
                    int iXv2 = 0;
                    if (interfaceC1413730mtPLLLLLZL != null && (hasMore = interfaceC1413730mtPLLLLLZL.getHasMore()) != null) {
                        zLJFF = Intrinsics.LJFF(hasMore.LIZJ(), true);
                    } else {
                        zLJFF = false;
                    }
                    InterfaceC1413730mtP interfaceC1413730mtPLLLLLZL2 = ((C1414130mu3) agS303S0100000_22.l0).LLLLLZL();
                    if (interfaceC1413730mtPLLLLLZL2 != null) {
                        iXv2 = interfaceC1413730mtPLLLLLZL2.xv2();
                    }
                    InterfaceC1413730mtP interfaceC1413730mtPLLLLLZL3 = ((C1414130mu3) agS303S0100000_22.l0).LLLLLZL();
                    if (interfaceC1413730mtPLLLLLZL3 != null && (c385670FAfLN0 = interfaceC1413730mtPLLLLLZL3.lN0()) != null) {
                        strLIZJ = c385670FAfLN0.LIZJ();
                    } else {
                        strLIZJ = null;
                    }
                    C1414740mv2 c1414740mv2 = new C1414740mv2(arrayList, zLJFF, iXv2, strLIZJ);
                    if (!C1414450muZ.LIZLLL(arrayList)) {
                        C1414040mtu.LIZ = c1414740mv2;
                        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateLastMixEditingInfo -> hasMore = ");
                        sbLIZ.append(zLJFF);
                        sbLIZ.append(";itemList size = ");
                        sbLIZ.append(arrayList.size());
                        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C370670Eg5 c370670Eg5 = ((C1414130mu3) agS303S0100000_22.l0).LLJLLL;
                    if (c370670Eg5 != null) {
                        c370670Eg5.LIZ();
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C370670Eg5 c370670Eg52 = ((C1414130mu3) agS303S0100000_22.l0).LLJLLL;
                if (c370670Eg52 != null) {
                    c370670Eg52.LIZ();
                }
            }
        } else {
            C370670Eg5 c370670Eg53 = ((C1414130mu3) agS303S0100000_22.l0).LLJLLL;
            if (c370670Eg53 != null) {
                c370670Eg53.LIZIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$11(AgS303S0100000_22 agS303S0100000_22, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        EnumC441770HTz enumC441770HTz;
        EnumC441770HTz enumC441770HTz2;
        EnumC441770HTz enumC441770HTz3;
        EnumC441770HTz enumC441770HTz4;
        AbstractC1662050tLv second;
        C1464760oDi c1464760oDi = (C1464760oDi) obj;
        if (c1464760oDi == null) {
            return Unit.LIZ;
        }
        C2252321DDq c2252321DDq = ((C1464660oDY) agS303S0100000_22.l0).LLJ;
        c2252321DDq.setValue(C1464810oDn.LIZ((C1464810oDn) c2252321DDq.getValue(), null, c1464760oDi, null, false, false, null, false, null, 1019));
        C1464660oDY c1464660oDY = (C1464660oDY) agS303S0100000_22.l0;
        C1464810oDn c1464810oDn = (C1464810oDn) c1464660oDY.LLJI.getValue();
        if (c1464760oDi.LIZ()) {
            C1662030tLt.LJFF(c1464660oDY.LJII(), EnumC1651790t5N.TUX_TIP_AI_LIVE_FAIL_RETRY, true, 28);
            if (c1464810oDn.LIZIZ == EnumC1462540oA8.PROGRESS) {
                if (C545810Lat.LIZ() && c1464760oDi.LJ == 1) {
                    if (c1464760oDi.LIZLLL == C545810Lat.LIZIZ()) {
                        C2252321DDq c2252321DDq2 = c1464660oDY.LLJ;
                        C1464810oDn c1464810oDn2 = (C1464810oDn) c2252321DDq2.getValue();
                        boolean z = !C1460090o6B.LIZ();
                        EnumC441770HTz enumC441770HTz5 = EnumC441770HTz.TIME_OUT;
                        c2252321DDq2.setValue(C1464810oDn.LIZ(c1464810oDn2, null, null, null, false, z, null, false, enumC441770HTz5, 415));
                        c1464660oDY.LJII().LIZIZ(enumC441770HTz5);
                        if (C1460090o6B.LIZ()) {
                            c1464660oDY.LJIIIIZZ(c1464760oDi);
                        }
                    } else {
                        C2252321DDq c2252321DDq3 = c1464660oDY.LLJ;
                        C1464810oDn c1464810oDn3 = (C1464810oDn) c2252321DDq3.getValue();
                        EnumC441770HTz enumC441770HTz6 = EnumC441770HTz.UPDATE_REMAIN_TIME;
                        c2252321DDq3.setValue(C1464810oDn.LIZ(c1464810oDn3, null, null, null, false, false, null, false, enumC441770HTz6, 511));
                        c1464660oDY.LJII().LIZIZ(enumC441770HTz6);
                    }
                } else {
                    C1464660oDY.LJIIJJI(c1464660oDY, c1464760oDi, c1464810oDn);
                    if (C545810Lat.LIZ() && c1464760oDi.LJ == 2) {
                        EnumC441770HTz enumC441770HTz7 = ((C1464810oDn) c1464660oDY.LLJ.getValue()).LJIIIZ;
                        EnumC441770HTz enumC441770HTz8 = EnumC441770HTz.UPDATE_REMAIN_TIME;
                        if (enumC441770HTz7 != enumC441770HTz8) {
                            C2252321DDq c2252321DDq4 = c1464660oDY.LLJ;
                            c2252321DDq4.setValue(C1464810oDn.LIZ((C1464810oDn) c2252321DDq4.getValue(), null, null, null, false, false, null, false, enumC441770HTz8, 511));
                        }
                    }
                    if (!c1464810oDn.LJI && !c1464660oDY.LJII().LJI(EnumC1651790t5N.TUX_TIP_AI_LIVE_PROGRESS)) {
                        c1464660oDY.LJIIJ(true);
                    }
                }
            } else {
                C23250099c.LIZLLL(c1464660oDY.LLJIJIL, null, null, new C1464680oDa(c1464660oDY, c1464810oDn, c1464760oDi, null), 3);
            }
            C1662030tLt c1662030tLtLJII = c1464660oDY.LJII();
            EnumC1651790t5N enumC1651790t5N = EnumC1651790t5N.TUX_TIP_AI_LIVE_PROGRESS;
            String strLIZJ = c1464660oDY.LIZJ(c1464760oDi.LIZLLL);
            Pair<ViewGroup, AbstractC1662050tLv> pair = c1662030tLtLJII.LIZJ().get(enumC1651790t5N);
            if (pair != null && (second = pair.getSecond()) != null) {
                second.j0(strLIZJ);
            }
        } else if (c1464760oDi.LIZ == UsageStatus.SUCCESS_APPLY) {
            C1662030tLt.LJFF(c1464660oDY.LJII(), EnumC1651790t5N.TUX_TIP_AI_LIVE_PROGRESS, true, 28);
            C1662030tLt c1662030tLtLJII2 = c1464660oDY.LJII();
            if (C545810Lat.LIZ()) {
                enumC441770HTz3 = EnumC441770HTz.ESTIMATING;
            } else {
                enumC441770HTz3 = EnumC441770HTz.UPDATE_REMAIN_TIME;
            }
            c1662030tLtLJII2.LIZIZ(enumC441770HTz3);
            C2252321DDq c2252321DDq5 = c1464660oDY.LLJ;
            EnumC1462540oA8 enumC1462540oA8 = EnumC1462540oA8.APPLIED;
            if (C545810Lat.LIZ()) {
                enumC441770HTz4 = EnumC441770HTz.ESTIMATING;
            } else {
                enumC441770HTz4 = EnumC441770HTz.UPDATE_REMAIN_TIME;
            }
            c2252321DDq5.setValue(C1464810oDn.LIZ(c1464810oDn, enumC1462540oA8, null, null, false, false, null, true, enumC441770HTz4, 173));
        } else {
            C1662030tLt.LJFF(c1464660oDY.LJII(), EnumC1651790t5N.TUX_TIP_AI_LIVE_PROGRESS, true, 28);
            C1662030tLt c1662030tLtLJII3 = c1464660oDY.LJII();
            if (C545810Lat.LIZ()) {
                enumC441770HTz = EnumC441770HTz.ESTIMATING;
            } else {
                enumC441770HTz = EnumC441770HTz.UPDATE_REMAIN_TIME;
            }
            c1662030tLtLJII3.LIZIZ(enumC441770HTz);
            C1662030tLt.LJFF(c1464660oDY.LJII(), EnumC1651790t5N.TUX_TIP_AI_LIVE_FAIL_RETRY, true, 28);
            C2252321DDq c2252321DDq6 = c1464660oDY.LLJ;
            EnumC1462540oA8 enumC1462540oA82 = EnumC1462540oA8.DEFAULT;
            if (C545810Lat.LIZ() && c1464760oDi.LJ == 0) {
                enumC441770HTz2 = EnumC441770HTz.ESTIMATING;
            } else {
                enumC441770HTz2 = EnumC441770HTz.UPDATE_REMAIN_TIME;
            }
            c2252321DDq6.setValue(C1464810oDn.LIZ(c1464810oDn, enumC1462540oA82, null, null, false, false, null, false, enumC441770HTz2, 173));
        }
        return Unit.LIZ;
    }

    public static final Object emit$12(AgS303S0100000_22 agS303S0100000_22, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C1464660oDY) agS303S0100000_22.l0).LJIIJ(((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object emit$13(AgS303S0100000_22 agS303S0100000_22, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252321DDq c2252321DDq = ((C1464660oDY) agS303S0100000_22.l0).LLJ;
        c2252321DDq.setValue(C1464810oDn.LIZ((C1464810oDn) c2252321DDq.getValue(), null, null, null, false, false, (Unit) obj, false, null, 895));
        return Unit.LIZ;
    }

    public static final Object emit$14(AgS303S0100000_22 agS303S0100000_22, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (((Boolean) obj).booleanValue()) {
            C1464660oDY c1464660oDY = (C1464660oDY) agS303S0100000_22.l0;
            Pair<Boolean, Boolean> value = c1464660oDY.LJI().x8().getValue();
            if (value == null || value.getFirst().booleanValue()) {
                c1464660oDY.LJI().j5();
                C23250099c.LIZLLL(c1464660oDY.LLJIJIL, null, null, new C1464650oDX(c1464660oDY, null), 3);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS303S0100000_22 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C1416710myD
            if (r0 == 0) goto L48
            r7 = r10
            X.0myD r7 = (X.C1416710myD) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            kotlin.Pair r9 = (kotlin.Pair) r9
            X.0HZe r3 = new X.0HZe
            java.lang.Object r2 = r9.getFirst()
            java.lang.Object r1 = r9.getSecond()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.<init>(r2, r1, r0)
            r7.LLILLJJLI = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            if (r0 != r6) goto L22
            return r6
        L48:
            X.0myD r7 = new X.0myD
            r7.<init>(r8, r10)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS303S0100000_22.emit$2(Y.AgS303S0100000_22, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.AgS303S0100000_22 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1416770myJ
            if (r0 == 0) goto L44
            r6 = r9
            X.0myJ r6 = (X.C1416770myJ) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L4a
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r2 = r8.getFirst()
            java.lang.Object r1 = r8.getSecond()
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L22
            return r5
        L44:
            X.0myJ r6 = new X.0myJ
            r6.<init>(r7, r9)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS303S0100000_22.emit$3(Y.AgS303S0100000_22, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$4(Y.AgS303S0100000_22 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C1416720myE
            if (r0 == 0) goto L4a
            r7 = r10
            X.0myE r7 = (X.C1416720myE) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L50
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            kotlin.Pair r9 = (kotlin.Pair) r9
            X.0HZe r3 = new X.0HZe
            r0 = 100
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)
            java.lang.Object r1 = r9.getFirst()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.<init>(r2, r1, r0)
            r7.LLILLJJLI = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            if (r0 != r6) goto L22
            return r6
        L4a:
            X.0myE r7 = new X.0myE
            r7.<init>(r8, r10)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS303S0100000_22.emit$4(Y.AgS303S0100000_22, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(Y.AgS303S0100000_22 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C1416730myF
            if (r0 == 0) goto L48
            r7 = r10
            X.0myF r7 = (X.C1416730myF) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            kotlin.Pair r9 = (kotlin.Pair) r9
            X.0HZe r3 = new X.0HZe
            java.lang.Object r2 = r9.getFirst()
            java.lang.Object r1 = r9.getSecond()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.<init>(r2, r1, r0)
            r7.LLILLJJLI = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            if (r0 != r6) goto L22
            return r6
        L48:
            X.0myF r7 = new X.0myF
            r7.<init>(r8, r10)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS303S0100000_22.emit$5(Y.AgS303S0100000_22, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$6(Y.AgS303S0100000_22 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1416790myL
            if (r0 == 0) goto L41
            r4 = r7
            X.0myL r4 = (X.C1416790myL) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L47
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            boolean r0 = r6 instanceof X.C23149095f
            if (r0 != 0) goto L38
            boolean r0 = r6 instanceof X.C23152095i
            if (r0 != 0) goto L38
            boolean r0 = r6 instanceof X.C23145095b
            if (r0 == 0) goto L22
        L38:
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L41:
            X.0myL r4 = new X.0myL
            r4.<init>(r5, r7)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS303S0100000_22.emit$6(Y.AgS303S0100000_22, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$7(Y.AgS303S0100000_22 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C1416740myG
            if (r0 == 0) goto L48
            r7 = r10
            X.0myG r7 = (X.C1416740myG) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            kotlin.Pair r9 = (kotlin.Pair) r9
            X.0HZe r3 = new X.0HZe
            java.lang.Object r2 = r9.getFirst()
            java.lang.Object r1 = r9.getSecond()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.<init>(r2, r1, r0)
            r7.LLILLJJLI = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            if (r0 != r6) goto L22
            return r6
        L48:
            X.0myG r7 = new X.0myG
            r7.<init>(r8, r10)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS303S0100000_22.emit$7(Y.AgS303S0100000_22, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$8(Y.AgS303S0100000_22 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C1416750myH
            if (r0 == 0) goto L48
            r7 = r10
            X.0myH r7 = (X.C1416750myH) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            kotlin.Pair r9 = (kotlin.Pair) r9
            X.0HZe r3 = new X.0HZe
            java.lang.Object r2 = r9.getFirst()
            java.lang.Object r1 = r9.getSecond()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.<init>(r2, r1, r0)
            r7.LLILLJJLI = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            if (r0 != r6) goto L22
            return r6
        L48:
            X.0myH r7 = new X.0myH
            r7.<init>(r8, r10)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS303S0100000_22.emit$8(Y.AgS303S0100000_22, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$9(Y.AgS303S0100000_22 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1416760myI
            if (r0 == 0) goto L44
            r6 = r9
            X.0myI r6 = (X.C1416760myI) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L4a
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            X.0HZe r2 = new X.0HZe
            r0 = 100
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.<init>(r1, r8, r0)
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r2, r6)
            if (r0 != r5) goto L22
            return r5
        L44:
            X.0myI r6 = new X.0myI
            r6.<init>(r7, r9)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS303S0100000_22.emit$9(Y.AgS303S0100000_22, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
