package X;

import Y.ARunnableS125S0100000_25;
import Y.ARunnableS33S0400000_25;
import Y.ARunnableS94S0200000_25;
import android.os.Bundle;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0sMZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624010sMZ {
    public static final void LIZ(InterfaceC1623390sLZ interfaceC1623390sLZ) {
        interfaceC1623390sLZ.b1().post(new ARunnableS125S0100000_25(interfaceC1623390sLZ, 75));
    }

    public static final Effect LIZIZ(InterfaceC1625000sOA interfaceC1625000sOA) {
        return interfaceC1625000sOA.C0().LLILIL();
    }

    public static final boolean LIZJ(InterfaceC1623390sLZ interfaceC1623390sLZ) {
        InterfaceC1623190sLF interfaceC1623190sLFU = interfaceC1623390sLZ.U();
        if (interfaceC1623190sLFU == null || !interfaceC1623190sLFU.isShowing()) {
            return false;
        }
        return true;
    }

    public static final void LJI(InterfaceC1623390sLZ interfaceC1623390sLZ, List<? extends Effect> list) {
        if (list != null) {
            interfaceC1623390sLZ.C0().getStickerRepository().LJFF().LJIJ(list);
        }
    }

    public static final void LJII(InterfaceC1623390sLZ interfaceC1623390sLZ, Effect effect) {
        interfaceC1623390sLZ.b1().post(new ARunnableS94S0200000_25(effect, interfaceC1623390sLZ, 21));
    }

    public static final void LJIIIZ(InterfaceC1623390sLZ interfaceC1623390sLZ, InterfaceC1625180sOS<?> interfaceC1625180sOS) {
        interfaceC1623390sLZ.w4().LIZJ(interfaceC1625180sOS);
    }

    public static final void LJIIJ(q qVar, InterfaceC1625180sOS interfaceC1625180sOS) {
        qVar.b1().post(new ARunnableS94S0200000_25(qVar, interfaceC1625180sOS, 22));
    }

    public static final void LJIIIIZZ(Bundle bundle, EnumC1448980noG enumC1448980noG, InterfaceC1623390sLZ interfaceC1623390sLZ, Effect effect) {
        interfaceC1623390sLZ.b1().post(new ARunnableS33S0400000_25(bundle, enumC1448980noG, interfaceC1623390sLZ, effect, 1));
    }

    public static final void LJFF(InterfaceC1623390sLZ interfaceC1623390sLZ, List list, boolean z, EnumC1448980noG enumC1448980noG, Bundle bundle, InterfaceC1625550sP3 interfaceC1625550sP3, EffectListResponse effectListResponse) {
        int i;
        EnumC1448980noG enumC1448980noG2 = enumC1448980noG;
        Effect effect = (Effect) C13LP.LJJJLL(effectListResponse.getData());
        if (effect == null || C2401009ay.LIZ(effect.getChildren())) {
            return;
        }
        if (!C2401009ay.LIZ(effectListResponse.getCollection())) {
            interfaceC1623390sLZ.C0().getStickerRepository().LJFF().LJIJ(effectListResponse.getCollection());
        }
        if (!C2401009ay.LIZ(effectListResponse.getBindEffects())) {
            interfaceC1623390sLZ.C0().getStickerRepository().LJFF().LJII(effectListResponse.getBindEffects());
        }
        InterfaceC1625410sOp interfaceC1625410sOpW4 = interfaceC1623390sLZ.w4();
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        if (enumC1448980noG2 == null) {
            enumC1448980noG2 = EnumC1448980noG.MANUAL_SET;
        }
        interfaceC1625410sOpW4.LIZJ(C1622820sKe.LIZIZ(effect, i, enumC1448980noG2, null, bundle, interfaceC1625550sP3, null, 0, false, null, null, 996));
    }

    public static final void LJ(List list, Effect effect, InterfaceC1623390sLZ interfaceC1623390sLZ, boolean z, EnumC1448980noG enumC1448980noG, Bundle bundle, InterfaceC1625550sP3 interfaceC1625550sP3, EffectListResponse effectListResponse) {
        EnumC1448980noG enumC1448980noG2 = enumC1448980noG;
        List<Effect> collection = effectListResponse.getCollection();
        int i = 1;
        if (collection != null && !collection.isEmpty() && collection != null) {
            LJI(interfaceC1623390sLZ, collection);
            interfaceC1623390sLZ.C0().LJIILLIIL((Effect) C13LP.LJJJJZI(collection));
        }
        InterfaceC1625410sOp interfaceC1625410sOpW4 = interfaceC1623390sLZ.w4();
        if (!z) {
            i = -1;
        }
        if (enumC1448980noG2 == null) {
            enumC1448980noG2 = EnumC1448980noG.MANUAL_SET;
        }
        interfaceC1625410sOpW4.LIZJ(C1622820sKe.LIZIZ(effect, i, enumC1448980noG2, null, bundle, interfaceC1625550sP3, null, 0, false, null, null, 996));
    }

    public static void LIZLLL(final InterfaceC1623390sLZ interfaceC1623390sLZ, final List list, final boolean z, boolean z2, InterfaceC1625550sP3 interfaceC1625550sP3, boolean z3, Bundle bundle, Bundle bundle2, EnumC1448980noG enumC1448980noG, int i) {
        final int iLIZLLL;
        final Effect effect;
        boolean z4;
        int i2;
        int i3;
        int i4;
        C1625950sPh c1625950sPhSF;
        Bundle bundle3 = bundle2;
        EnumC1448980noG enumC1448980noG2 = enumC1448980noG;
        Bundle bundle4 = bundle;
        InterfaceC1625550sP3 interfaceC1625550sP32 = interfaceC1625550sP3;
        if ((i & 16) != 0) {
            interfaceC1625550sP32 = null;
        }
        if ((i & 32) != 0) {
            iLIZLLL = C1625940sPg.LIZLLL(interfaceC1623390sLZ.C0());
        } else {
            iLIZLLL = 0;
        }
        if ((i & 128) != 0) {
            effect = (Effect) C13LP.LJJJLL(list);
        } else {
            effect = null;
        }
        if ((i & 256) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i & 512) != 0) {
            z3 = false;
        }
        if ((i & 1024) != 0) {
            bundle4 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bundle3 = null;
        }
        if ((i & 16384) != 0) {
            enumC1448980noG2 = null;
        }
        if (!list.isEmpty()) {
            if (z) {
                interfaceC1623390sLZ.C0().LJJJJI(new C1629220sUy(list, iLIZLLL, 0, 56));
            }
            if (z2 && effect != null) {
                InterfaceC1623190sLF interfaceC1623190sLFU = interfaceC1623390sLZ.U();
                if (interfaceC1623190sLFU != null && (c1625950sPhSF = interfaceC1623190sLFU.sF()) != null) {
                    c1625950sPhSF.LIZ(new InterfaceC1625960sPi(iLIZLLL, effect) { // from class: X.0sMc
                        public final int LL;
                        public final Effect LLILLJJLI;

                        {
                            this.LL = iLIZLLL;
                            this.LLILLJJLI = effect;
                        }

                        @Override // X.InterfaceC1625960sPi
                        public final boolean LLIIIL(int i5, int i6, Effect effect2) {
                            if (i5 == this.LL) {
                                if (!Intrinsics.LJFF(effect2.getEffectId(), this.LLILLJJLI.getParentId())) {
                                    if (C1624570sNT.LJIL(effect2) && Intrinsics.LJFF(effect2.getEffectId(), this.LLILLJJLI.getEffectId())) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            return false;
                        }
                    });
                }
                InterfaceC1623190sLF interfaceC1623190sLFU2 = interfaceC1623390sLZ.U();
                if (interfaceC1623190sLFU2 != null) {
                    interfaceC1623190sLFU2.prepare();
                }
                interfaceC1623390sLZ.C0().LJJJZ(iLIZLLL);
                if (C1624570sNT.LJIL(effect)) {
                    if (z3) {
                        final Effect effect2 = effect;
                        final EnumC1448980noG enumC1448980noG3 = enumC1448980noG2;
                        final Bundle bundle5 = bundle3;
                        final InterfaceC1625550sP3 interfaceC1625550sP33 = interfaceC1625550sP32;
                        interfaceC1623390sLZ.C0().LIZ(Collections.singletonList(effect.getEffectId()), null, new IFetchEffectListByIdsListener() { // from class: X.0sMa
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                            public final void onFail(ExceptionResult exceptionResult) {
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(EffectListResponse effectListResponse) {
                                EffectListResponse effectListResponse2 = effectListResponse;
                                if (effectListResponse2 != null) {
                                    C1624010sMZ.LJ(list, effect2, interfaceC1623390sLZ, z, enumC1448980noG3, bundle5, interfaceC1625550sP33, effectListResponse2);
                                }
                            }
                        });
                        return;
                    }
                    InterfaceC1625410sOp interfaceC1625410sOpW4 = interfaceC1623390sLZ.w4();
                    if (z) {
                        i4 = 1;
                    } else {
                        i4 = -1;
                    }
                    if (enumC1448980noG2 == null) {
                        enumC1448980noG2 = EnumC1448980noG.MANUAL_SET;
                    }
                    interfaceC1625410sOpW4.LIZJ(C1622820sKe.LIZIZ(effect, i4, enumC1448980noG2, null, bundle3, interfaceC1625550sP32, null, 0, false, null, null, 996));
                    return;
                }
                String parentId = effect.getParentId();
                if (parentId != null && parentId.length() != 0) {
                    InterfaceC1623190sLF interfaceC1623190sLFU3 = interfaceC1623390sLZ.U();
                    if (interfaceC1623190sLFU3 != null) {
                        interfaceC1623190sLFU3.prepare();
                    }
                    interfaceC1623390sLZ.C0().LJIILLIIL(effect);
                }
                if (!C1624200sMs.LJIIIIZZ(effect)) {
                    String parentId2 = effect.getParentId();
                    if (parentId2 != null && parentId2.length() != 0) {
                        final EnumC1448980noG enumC1448980noG4 = enumC1448980noG2;
                        final Bundle bundle6 = bundle3;
                        final InterfaceC1625550sP3 interfaceC1625550sP34 = interfaceC1625550sP32;
                        interfaceC1623390sLZ.C0().LIZ(Collections.singletonList(effect.getParentId()), null, new IFetchEffectListByIdsListener() { // from class: X.0sMb
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                            public final void onFail(ExceptionResult exceptionResult) {
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(EffectListResponse effectListResponse) {
                                EffectListResponse effectListResponse2 = effectListResponse;
                                if (effectListResponse2 != null) {
                                    C1624010sMZ.LJFF(interfaceC1623390sLZ, list, z, enumC1448980noG4, bundle6, interfaceC1625550sP34, effectListResponse2);
                                }
                            }
                        });
                        return;
                    }
                    Bundle bundle7 = new Bundle();
                    if (bundle4 != null) {
                        C786410Ut5.LJJIIJZLJL(bundle7, bundle4);
                    }
                    if (bundle3 != null) {
                        C786410Ut5.LJJIIJZLJL(bundle7, bundle3);
                    }
                    interfaceC1623390sLZ.C0().LJJIIJZLJL(true);
                    InterfaceC1625410sOp interfaceC1625410sOpW42 = interfaceC1623390sLZ.w4();
                    if (z) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                    if (enumC1448980noG2 == null) {
                        enumC1448980noG2 = EnumC1448980noG.AUTO_SELECT;
                    }
                    interfaceC1625410sOpW42.LIZJ(C1622820sKe.LIZIZ(effect, i3, enumC1448980noG2, null, bundle7, interfaceC1625550sP32, null, 0, false, null, null, 996));
                    return;
                }
                C1624200sMs.LJIIIIZZ(effect);
                Bundle bundle8 = new Bundle();
                if (bundle4 != null) {
                    C786410Ut5.LJJIIJZLJL(bundle8, bundle4);
                }
                if (bundle3 != null) {
                    C786410Ut5.LJJIIJZLJL(bundle8, bundle3);
                }
                InterfaceC1625410sOp interfaceC1625410sOpW43 = interfaceC1623390sLZ.w4();
                if (z) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (enumC1448980noG2 == null) {
                    enumC1448980noG2 = EnumC1448980noG.MANUAL_SET;
                }
                interfaceC1625410sOpW43.LIZJ(C1622820sKe.LIZIZ(effect, i2, enumC1448980noG2, null, bundle8, interfaceC1625550sP32, null, 0, z4, null, null, 868));
            }
        }
    }
}
