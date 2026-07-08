package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625420sOq implements InterfaceC1625410sOp {
    public final InterfaceC1624480sNK LIZ;
    public final boolean LIZIZ;
    public final Function1<String[], Unit> LIZJ;
    public final Function1<Effect, Unit> LIZLLL;
    public final Function2<Effect, String, Unit> LJ;
    public final InterfaceC1623440sLe LJFF;
    public final List<InterfaceC1625520sP0> LJI;
    public final List<InterfaceC1625190sOT> LJII;

    public final InterfaceC1625470sOv LJI() {
        return this.LIZ.LJII();
    }

    public static boolean LJIIIIZZ(Effect effect) {
        if (effect.getEffectType() == 1 || effect.getEffectType() == 2 || effect.getEffectType() == -1 || C1624550sNR.LIZIZ(effect)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1625410sOp
    public final void LIZ(InterfaceC1625520sP0 interfaceC1625520sP0) {
        ((ArrayList) this.LJI).remove(interfaceC1625520sP0);
    }

    @Override // X.InterfaceC1625410sOp
    public final void LIZIZ(InterfaceC1625190sOT interfaceC1625190sOT) {
        if (!((ArrayList) this.LJII).contains(interfaceC1625190sOT)) {
            ((ArrayList) this.LJII).add(interfaceC1625190sOT);
        }
    }

    @Override // X.InterfaceC1625410sOp
    public final <T> void LIZJ(InterfaceC1625180sOS<T> interfaceC1625180sOS) {
        Function2<Effect, String, Unit> function2;
        C1625490sOx c1625490sOxLJII = LJII(this.LJII, interfaceC1625180sOS);
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submitRequest(");
        sbLIZ.append(interfaceC1625180sOS);
        sbLIZ.append("), ");
        sbLIZ.append(c1625490sOxLJII);
        C201955140j.LJIILL(c1632480saE, "DefaultStickerSelectedController", C2188811AlT.LIZIZ(sbLIZ));
        if (!c1625490sOxLJII.LIZ) {
            if (interfaceC1625180sOS instanceof C1625460sOu) {
                C1625460sOu c1625460sOu = (C1625460sOu) interfaceC1625180sOS;
                if (c1625460sOu.LJ) {
                    this.LIZ.LJII().LJFF(null);
                }
                Effect effect = c1625460sOu.LIZ;
                LJI().LJIJJ(null);
                if (!LJI().LJIIL(effect)) {
                    Iterator it2 = ((ArrayList) this.LJI).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1625520sP0) it2.next()).LIZ(new C1627360sRy(c1625460sOu.LIZIZ, c1625460sOu.LIZLLL, c1625460sOu.LIZJ, effect, false));
                    }
                    return;
                }
                return;
            }
            if (interfaceC1625180sOS instanceof C1625440sOs) {
                final C1625440sOs c1625440sOs = (C1625440sOs) interfaceC1625180sOS;
                this.LIZ.LJII().LJFF(c1625440sOs.LIZ);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("DefaultStickerSelectedController#downloadSticker:effectId:");
                sbLIZ2.append(c1625440sOs.LIZ.getEffectId());
                interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC1625540sP2 interfaceC1625540sP2 = new InterfaceC1625540sP2() { // from class: X.0sOt
                    @Override // X.InterfaceC1625550sP3
                    public final void LJIIIIZZ(Effect effect2) {
                        InterfaceC1625550sP3 interfaceC1625550sP3 = c1625440sOs.LJFF;
                        if (interfaceC1625550sP3 != null) {
                            interfaceC1625550sP3.LJIIIIZZ(effect2);
                        }
                        InterfaceC1625530sP1 interfaceC1625530sP1LJJIZ = this.LIZ.LJJIZ();
                        if (interfaceC1625530sP1LJJIZ != null) {
                            interfaceC1625530sP1LJJIZ.g(effect2);
                        }
                        InterfaceC1625550sP3 interfaceC1625550sP3LJJI = this.LIZ.LJJI();
                        if (interfaceC1625550sP3LJJI != null) {
                            interfaceC1625550sP3LJJI.LJIIIIZZ(effect2);
                        }
                    }

                    @Override // X.InterfaceC1625540sP2
                    public final void LJIILJJIL(Effect effect2) {
                        String effectId;
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("DefaultStickerSelectedController#downloadSticker:onHitCache:effectId:");
                        if (effect2 != null) {
                            effectId = effect2.getEffectId();
                        } else {
                            effectId = null;
                        }
                        sbLIZ3.append(effectId);
                        interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ3));
                        InterfaceC1625550sP3 interfaceC1625550sP3 = c1625440sOs.LJFF;
                        if (interfaceC1625550sP3 instanceof InterfaceC1625540sP2) {
                            ((InterfaceC1625540sP2) interfaceC1625550sP3).LJIILJJIL(effect2);
                        } else if (interfaceC1625550sP3 != null) {
                            interfaceC1625550sP3.onSuccess(effect2);
                        }
                        this.LJIIIZ(c1625440sOs, System.currentTimeMillis() - jCurrentTimeMillis);
                        InterfaceC1625530sP1 interfaceC1625530sP1LJJIZ = this.LIZ.LJJIZ();
                        if (interfaceC1625530sP1LJJIZ != null) {
                            interfaceC1625530sP1LJJIZ.i(effect2);
                        }
                    }

                    @Override // X.InterfaceC1625550sP3
                    public final void onSuccess(Effect effect2) {
                        String effectId;
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("DefaultStickerSelectedController#downloadSticker:onSuccess:effectId:");
                        if (effect2 != null) {
                            effectId = effect2.getEffectId();
                        } else {
                            effectId = null;
                        }
                        sbLIZ3.append(effectId);
                        interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ3));
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        InterfaceC1625550sP3 interfaceC1625550sP3 = c1625440sOs.LJFF;
                        if (interfaceC1625550sP3 != null) {
                            interfaceC1625550sP3.onSuccess(effect2);
                        }
                        this.LJIIIZ(c1625440sOs, jCurrentTimeMillis2);
                        InterfaceC1625530sP1 interfaceC1625530sP1LJJIZ = this.LIZ.LJJIZ();
                        if (interfaceC1625530sP1LJJIZ != null) {
                            interfaceC1625530sP1LJJIZ.i(effect2);
                        }
                        InterfaceC1625550sP3 interfaceC1625550sP3LJJI = this.LIZ.LJJI();
                        if (interfaceC1625550sP3LJJI != null) {
                            interfaceC1625550sP3LJJI.onSuccess(effect2);
                        }
                    }

                    @Override // X.InterfaceC1625550sP3
                    public final void LJII(int i, Effect effect2) {
                        InterfaceC1625550sP3 interfaceC1625550sP3 = c1625440sOs.LJFF;
                        if (interfaceC1625550sP3 != null) {
                            interfaceC1625550sP3.LJII(i, effect2);
                        }
                        InterfaceC1625530sP1 interfaceC1625530sP1LJJIZ = this.LIZ.LJJIZ();
                        if (interfaceC1625530sP1LJJIZ != null) {
                            interfaceC1625530sP1LJJIZ.h(effect2);
                        }
                        InterfaceC1625550sP3 interfaceC1625550sP3LJJI = this.LIZ.LJJI();
                        if (interfaceC1625550sP3LJJI != null) {
                            interfaceC1625550sP3LJJI.LJII(i, effect2);
                        }
                    }

                    @Override // X.InterfaceC1625550sP3
                    public final void LJIILLIIL(Effect effect2, ExceptionResult exceptionResult) {
                        String effectId;
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("DefaultStickerSelectedController#downloadSticker:onFailed:effectId:");
                        if (effect2 != null) {
                            effectId = effect2.getEffectId();
                        } else {
                            effectId = null;
                        }
                        sbLIZ3.append(effectId);
                        sbLIZ3.append(":exception:");
                        sbLIZ3.append(exceptionResult.getException());
                        interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ3));
                        InterfaceC1625550sP3 interfaceC1625550sP3 = c1625440sOs.LJFF;
                        if (interfaceC1625550sP3 != null) {
                            interfaceC1625550sP3.LJIILLIIL(effect2, exceptionResult);
                        }
                        InterfaceC1625530sP1 interfaceC1625530sP1LJJIZ = this.LIZ.LJJIZ();
                        if (interfaceC1625530sP1LJJIZ != null) {
                            interfaceC1625530sP1LJJIZ.i(effect2);
                        }
                        InterfaceC1625550sP3 interfaceC1625550sP3LJJI = this.LIZ.LJJI();
                        if (interfaceC1625550sP3LJJI != null) {
                            interfaceC1625550sP3LJJI.LJIILLIIL(effect2, exceptionResult);
                        }
                    }
                };
                if (C1624600sNW.LIZ(c1625440sOs.LIZ)) {
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("applyEffectUsingDraft, effectId:");
                    sbLIZ3.append(c1625440sOs.LIZ.getEffectId());
                    interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ3));
                    interfaceC1625540sP2.onSuccess(c1625440sOs.LIZ);
                    return;
                }
                if (LJIIIIZZ(c1625440sOs.LIZ)) {
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL3 = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("DefaultStickerSelectedController#downloadSticker:shouldNotDownloadEffect:effectId:");
                    sbLIZ4.append(c1625440sOs.LIZ.getEffectId());
                    interfaceC1463990oCTLIZLLL3.i(C2188811AlT.LIZIZ(sbLIZ4));
                    interfaceC1625540sP2.onSuccess(c1625440sOs.LIZ);
                    return;
                }
                this.LIZ.LJJLIIIIJ(new C1629340sVA(c1625440sOs.LIZ, false, c1625440sOs, 2), interfaceC1625540sP2);
                return;
            }
            return;
        }
        Effect effectLIZIZ = interfaceC1625180sOS.LIZIZ();
        if ((effectLIZIZ instanceof Effect) && effectLIZIZ != null && (function2 = this.LJ) != null) {
            function2.invoke(effectLIZIZ, c1625490sOxLJII.LIZIZ);
        }
    }

    @Override // X.InterfaceC1625410sOp
    public final void LJ(InterfaceC1625190sOT interfaceC1625190sOT) {
        ((ArrayList) this.LJII).remove(interfaceC1625190sOT);
    }

    @Override // X.InterfaceC1625410sOp
    public final void LJFF(InterfaceC1625520sP0 interfaceC1625520sP0) {
        if (!((ArrayList) this.LJI).contains(interfaceC1625520sP0)) {
            ((ArrayList) this.LJI).add(interfaceC1625520sP0);
        }
    }

    public static C1625490sOx LJII(List list, InterfaceC1625180sOS interfaceC1625180sOS) {
        Iterator it2 = ((ArrayList) list).iterator();
        String strLIZIZ = "";
        boolean z = false;
        while (it2.hasNext()) {
            C1625490sOx c1625490sOxLIZ = ((InterfaceC1625190sOT) it2.next()).LIZ(interfaceC1625180sOS);
            if (!z && !c1625490sOxLIZ.LIZ) {
                z = false;
            } else {
                z = true;
            }
            String str = c1625490sOxLIZ.LIZIZ;
            if (str != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(str);
                sbLIZ.append('|');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return new C1625490sOx(z, strLIZIZ);
    }

    @Override // X.InterfaceC1625410sOp
    public final void LIZLLL(List<? extends Effect> list, String[] strArr) {
        InterfaceC1627350sRx stickerRepository;
        InterfaceC1629300sV6 interfaceC1629300sV6LJI;
        Function1<String[], Unit> function1;
        if (this.LIZIZ) {
            if (strArr != null && (function1 = this.LIZJ) != null) {
                function1.invoke(strArr);
            }
            if (list != null) {
                for (Effect effect : list) {
                    if (effect != null) {
                        InterfaceC1624480sNK interfaceC1624480sNK = this.LIZ;
                        if (interfaceC1624480sNK != null && (stickerRepository = interfaceC1624480sNK.getStickerRepository()) != null && (interfaceC1629300sV6LJI = stickerRepository.LJI()) != null && interfaceC1629300sV6LJI.LIZ(effect)) {
                            Function1<Effect, Unit> function12 = this.LIZLLL;
                            if (function12 != null) {
                                function12.invoke(effect);
                            }
                        } else {
                            this.LIZ.LJJLIIIIJ(new C1629340sVA(effect, true, null, 4), new InterfaceC1625550sP3() { // from class: X.0sOy
                                @Override // X.InterfaceC1625550sP3
                                public final void LJII(int i, Effect effect2) {
                                }

                                @Override // X.InterfaceC1625550sP3
                                public final void LJIIIIZZ(Effect effect2) {
                                }

                                @Override // X.InterfaceC1625550sP3
                                public final void LJIILLIIL(Effect effect2, ExceptionResult exceptionResult) {
                                }

                                @Override // X.InterfaceC1625550sP3
                                public final void onSuccess(Effect effect2) {
                                    Function1<Effect, Unit> function13;
                                    if (effect2 != null && (function13 = this.LL.LIZLLL) != null) {
                                        function13.invoke(effect2);
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    public final void LJIIIZ(final C1625440sOs c1625440sOs, final long j) {
        if (!c1625440sOs.LJIIIIZZ) {
            return;
        }
        InterfaceC1625560sP4 interfaceC1625560sP4 = new InterfaceC1625560sP4() { // from class: X.0sOr
            @Override // X.InterfaceC1625560sP4
            public final void m2() {
                InterfaceC1627350sRx stickerRepository;
                InterfaceC1629300sV6 interfaceC1629300sV6LJI;
                String[] stringArray;
                Function1<String[], Unit> function1;
                Effect effectLJJL;
                InterfaceC1625560sP4 interfaceC1625560sP42 = c1625440sOs.LJI;
                if (interfaceC1625560sP42 != null) {
                    interfaceC1625560sP42.m2();
                }
                C1625420sOq c1625420sOq = this;
                C1623450sLf c1623450sLfLIZ = c1625420sOq.LJFF.LIZ(c1625420sOq.LIZ, c1625440sOs.LIZ);
                if (!c1623450sLfLIZ.LIZ) {
                    Function2<Effect, String, Unit> function2 = this.LJ;
                    if (function2 != null) {
                        function2.invoke(c1625440sOs.LIZ, c1623450sLfLIZ.LIZIZ);
                        return;
                    }
                    return;
                }
                List<InterfaceC1625190sOT> list = this.LJII;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                C1625490sOx c1625490sOxLJII = C1625420sOq.LJII(arrayList, c1625440sOs);
                if (c1625490sOxLJII.LIZ) {
                    Function2<Effect, String, Unit> function22 = this.LJ;
                    if (function22 != null) {
                        function22.invoke(c1625440sOs.LIZ, c1625490sOxLJII.LIZIZ);
                        return;
                    }
                    return;
                }
                final C1625420sOq c1625420sOq2 = this;
                C1625440sOs c1625440sOs2 = c1625440sOs;
                int i = (int) j;
                c1625420sOq2.getClass();
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DefaultStickerSelectedController#useEffect:effectId:");
                sbLIZ.append(c1625440sOs2.LIZ.getEffectId());
                interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
                Effect effect = c1625440sOs2.LIZ;
                int i2 = c1625440sOs2.LIZIZ;
                if (C1624560sNS.LIZ(effect) && (effectLJJL = c1625420sOq2.LIZ.LJJL()) != null && (!Intrinsics.LJFF(effectLJJL.getEffectId(), effect.getEffectId())) && !C1624570sNT.LJIL(effectLJJL) && (TextUtils.isEmpty(effectLJJL.getParentId()) || !Intrinsics.LJFF(effectLJJL.getParentId(), effect.getParentId()))) {
                    c1625420sOq2.LIZJ(C1622820sKe.LIZ(null, null, 3));
                    c1625420sOq2.LIZ.LJII().LJFF(effect);
                }
                if (c1625420sOq2.LIZ.LJJLIIIJJIZ().LJIILIIL) {
                    C1627370sRz c1627370sRz = new C1627370sRz(effect, i2, c1625440sOs2.LIZJ, c1625440sOs2.LJ, i, 72);
                    c1625420sOq2.LIZ.LJII().LJIIJJI(c1627370sRz);
                    for (InterfaceC1625520sP0 interfaceC1625520sP0 : (ArrayList) c1625420sOq2.LJI) {
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("DefaultStickerSelectedController#useEffect:listener:");
                        sbLIZ2.append(interfaceC1625520sP0);
                        interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
                        interfaceC1625520sP0.LIZIZ(c1627370sRz);
                    }
                    if (c1625420sOq2.LJI().LJIIL(effect)) {
                        c1625420sOq2.LJI().LJIL((c1625440sOs2.LJ != null ? r0.getInt("order", 1) : 1) - 1, effect);
                    } else {
                        c1625420sOq2.LJI().LJIJJ(effect);
                    }
                } else {
                    if (c1625420sOq2.LJI().LJIIL(effect)) {
                        c1625420sOq2.LJI().LJIL((c1625440sOs2.LJ != null ? r6.getInt("order", 1) : 1) - 1, effect);
                    } else {
                        c1625420sOq2.LJI().LJIJJ(effect);
                    }
                    C1627370sRz c1627370sRz2 = new C1627370sRz(effect, i2, c1625440sOs2.LIZJ, c1625440sOs2.LJ, i, 72);
                    c1625420sOq2.LIZ.LJII().LJIIJJI(c1627370sRz2);
                    for (InterfaceC1625520sP0 interfaceC1625520sP02 : (ArrayList) c1625420sOq2.LJI) {
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL3 = C2219091BtD.LIZLLL();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("DefaultStickerSelectedController#useEffect:listener:");
                        sbLIZ3.append(interfaceC1625520sP02);
                        interfaceC1463990oCTLIZLLL3.i(C2188811AlT.LIZIZ(sbLIZ3));
                        interfaceC1625520sP02.LIZIZ(c1627370sRz2);
                    }
                }
                if (!c1625420sOq2.LIZIZ) {
                    List<Effect> list2 = c1625440sOs2.LIZLLL;
                    if (list2 != null) {
                        for (Effect effect2 : list2) {
                            if (effect2 != null) {
                                c1625420sOq2.LIZ.LJJLIIIIJ(new C1629340sVA(effect2, true, c1625440sOs2), null);
                            }
                        }
                        return;
                    }
                    return;
                }
                Bundle bundle = c1625440sOs2.LJ;
                if (bundle != null && (stringArray = bundle.getStringArray("preload_effect_ids")) != null && c1625440sOs2.LIZJ == EnumC1448980noG.UI_CLICK && (function1 = c1625420sOq2.LIZJ) != null) {
                    function1.invoke(stringArray);
                }
                List<Effect> list3 = c1625440sOs2.LIZLLL;
                if (list3 != null) {
                    for (Effect effect3 : list3) {
                        if (effect3 != null) {
                            InterfaceC1624480sNK interfaceC1624480sNK = c1625420sOq2.LIZ;
                            if (interfaceC1624480sNK == null || (stickerRepository = interfaceC1624480sNK.getStickerRepository()) == null || (interfaceC1629300sV6LJI = stickerRepository.LJI()) == null || !interfaceC1629300sV6LJI.LIZ(effect3)) {
                                c1625420sOq2.LIZ.LJJLIIIIJ(new C1629340sVA(effect3, true, c1625440sOs2), new InterfaceC1625550sP3() { // from class: X.0sOz
                                    @Override // X.InterfaceC1625550sP3
                                    public final void LJII(int i3, Effect effect4) {
                                    }

                                    @Override // X.InterfaceC1625550sP3
                                    public final void LJIIIIZZ(Effect effect4) {
                                    }

                                    @Override // X.InterfaceC1625550sP3
                                    public final void LJIILLIIL(Effect effect4, ExceptionResult exceptionResult) {
                                    }

                                    @Override // X.InterfaceC1625550sP3
                                    public final void onSuccess(Effect effect4) {
                                        Function1<Effect, Unit> function12;
                                        if (effect4 != null && (function12 = c1625420sOq2.LIZLLL) != null) {
                                            function12.invoke(effect4);
                                        }
                                    }
                                });
                            } else {
                                Function1<Effect, Unit> function12 = c1625420sOq2.LIZLLL;
                                if (function12 != null) {
                                    function12.invoke(effect3);
                                }
                            }
                        }
                    }
                }
            }
        };
        if (!LJIIIIZZ(c1625440sOs.LIZ)) {
            this.LIZ.LJJLIIIJ();
        }
        interfaceC1625560sP4.m2();
    }

    public /* synthetic */ C1625420sOq(InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1623440sLe interfaceC1623440sLe, boolean z, int i) {
        this(interfaceC1624480sNK, (i & 2) != 0 ? null : interfaceC1623440sLe, (i & 4) != 0 ? false : z, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1625420sOq(InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1623440sLe interfaceC1623440sLe, boolean z, Function1<? super String[], Unit> function1, Function1<? super Effect, Unit> function12, Function2<? super Effect, ? super String, Unit> function2) {
        this.LIZ = interfaceC1624480sNK;
        this.LIZIZ = z;
        this.LIZJ = function1;
        this.LIZLLL = function12;
        this.LJ = function2;
        this.LJFF = interfaceC1623440sLe == null ? C1623430sLd.LIZ : interfaceC1623440sLe;
        this.LJI = new ArrayList();
        this.LJII = new ArrayList();
    }
}
